from antlr4 import *
from gen.JavaLexer import JavaLexer
from gen.JavaListener import JavaListener
from gen.JavaParser import JavaParser
from antlr4.xpath import XPath
import sys
import io
import json
from gen.JavaListener import JavaListener
from gen.JavaParser import JavaParser
from os import listdir, getcwd
from os.path import isfile, join
XPath = XPath.XPath


path_to_API = str(getcwd()).replace("\\js-injector","") + '/frida-scripts/api/'
print(path_to_API)

path_to_deobfuscated_client = str(getcwd()).replace("\\js-injector","") + '/mobile-runescape-client/src/main/java/'
print(path_to_deobfuscated_client)


class JavaClassReader(JavaListener):
    def __init__(self):
        self.class_name = ''
        self.class_fields = []
        self.class_methods = []
        self.class_extends = ''
        self.obfuscated_class_name = ''

    def __str__(self):
        result = 'class name: ' + self.class_name + "(" +  self.obfuscated_class_name + ")" + (' extends ' + self.class_extends if len(self.class_extends) else '') + '\n'
        result += 'class fields: ' + str(self.class_fields) + '\n'
        result += 'class methods: ' + str(self.class_methods) + '\n'
        return result

    def __eq__(self, other):
        return self.class_name == other.class_name

    def printAPI(self):
        if len(self.class_name) == 0:
            return
        file_name = path_to_API + self.class_name[0].lower() + (self.class_name[1:] if len(self.class_name) > 1 else '') + ".js"
        tabs = "\t"
        new_line = "\n"
        primitives = ["int", "long", "short", "float", "double", "byte", "List", "Map", "Array", "String", "boolean", "Hash", "Object", "Enum"]
        imports = []
        f = open(file_name, "w")

        if len(self.class_extends):
            is_primitive = False
            deobfuscated_type = self.class_extends
            for primitive in primitives:
                if deobfuscated_type.startswith(primitive):
                    is_primitive = True
            if not is_primitive:
                imports.append(self.class_extends)
                f.write("class " + self.class_name + ' extends ' + self.class_extends + " {" + new_line)

            else:
                imports.append('Interceptor')
                f.write("class " + self.class_name + " extends Interceptor {" + new_line)
        else:
            imports.append('Interceptor')
            f.write("class " + self.class_name + " extends Interceptor {" + new_line)
        f.write(tabs + 'static obfuscatedClassName = "' + self.obfuscated_class_name+ '";' + new_line)
        f.write(tabs + 'constructor(obfuscatedObject, superName){' + new_line)
        f.write(tabs + tabs + 'super(obfuscatedObject, ' + self.class_name +'.obfuscatedClassName);' + new_line)
        f.write(tabs + '}' + new_line)
        f.write(new_line)
        imports += self.printAPIFields(f, primitives)
        self.printAPIMethods(f)
        f.close()
        self.printAPIImports(file_name, imports)

    def printAPIImports(self, file_name, imports):
        new_line = "\n"
        f = open(file_name, "r+")
        content = f.read()
        f.seek(0, 0)
        imports = set(imports)
        if self.class_name in imports:
            imports.remove(self.class_name)
        for import_needed in imports:
            if import_needed == 'Interceptor':
                f.write("const Interceptor = require('./core/apicore.js');" + new_line)
                # f.write("require('./core/apicore.js');" + new_line)
                # f.write("const Interceptor = global.Interceptor;" + new_line)
            else:
                if isfile(path_to_API + import_needed[0].lower() + import_needed[1:] + ".js"):
                    f.write("const " + import_needed + " = require('./" + import_needed[0].lower() + import_needed[1:] + ".js');" + new_line)
        f.write(new_line + new_line)
        f.write(content)
        f.close()

    def printAPIMethods(self, f):
        tabs = "\t"
        new_line = "\n"
        for method in self.class_methods:
            f.write(tabs + "static on" + method["name"][0].upper() +method["name"][1:] + "(todo){" + new_line)
            f.write(tabs + tabs + "super.onMethodExecution(" + self.class_name + ".obfuscatedClassName,\"" + method["obfuscated_name"] + "\", todo, []);" + new_line)
            f.write(tabs + "}" + new_line)
        f.write("}" + new_line)
        f.write("module.exports = " + self.class_name +";" + new_line)

    def printAPIFields(self, f, primitives):
        tabs = "\t"
        new_line = "\n"
        imports = []
        for field in self.class_fields:
            f.write(tabs + ("static " if field["static"] else "") + "get" + field["name"][0].upper() + field["name"][1:] + "(){" + new_line)
            obfuscationArgs = ""
            obfuscated = False
            is_primitive = False
            deobfuscated_type = field["type"]
            for primitive in primitives:
                if deobfuscated_type.startswith(primitive):
                    is_primitive = True
            if deobfuscated_type == "int" and field["deobfuscation_args"]:
                deobint = int(field["deobfuscation_args"])
                # deobint = int(field["deobfuscation_args"]) if int(field["deobfuscation_args"]) > 0 else int(1 << 31) + int(field["deobfuscation_args"])
                obfuscationArgs = "'" + deobfuscated_type + "', " + str(deobint)
            elif deobfuscated_type == "long" and field["deobfuscation_args"]:
                deoblong = int(field["deobfuscation_args"].replace("L", ""))
                # deoblong = deoblong if deoblong > 0 else int(1 << 63) + deoblong
                obfuscationArgs = "'" + deobfuscated_type + "', " + str(deoblong)
            elif not is_primitive:
                imports.append(deobfuscated_type.replace("[", "").replace("]", ""))
                obfuscated = True
            f.write(tabs + tabs + "return " + ("new " + deobfuscated_type + "(" if obfuscated and "[" not in deobfuscated_type else " ") + "super.getField(" + self.class_name + ".obfuscatedClassName," + "\"" + field["obfuscated_name"] + "\", [" + obfuscationArgs + "])" + (")" if obfuscated and "[" not in deobfuscated_type else "") + ";" + new_line)
            f.write(tabs + "}" + new_line)
        f.write(new_line)
        return imports

    def enterClassOrInterfaceDeclaration(self, ctx:JavaParser.ClassOrInterfaceDeclarationContext):
        if ctx.classDeclaration():
            if ctx.classDeclaration().normalClassDeclaration():
                self.class_name = str(ctx.classDeclaration().normalClassDeclaration().Identifier())
                declaration_type = ctx.classDeclaration().normalClassDeclaration().type()
                modifiers: JavaParser.ClassOrInterfaceModifiersContext = ctx.classOrInterfaceModifiers()
                for modifier in modifiers.getChildren():
                    annotation: JavaParser.AnnotationContext = modifier.annotation()
                    if annotation:
                        if str(annotation.annotationName().getText()) == 'ObfuscatedName':
                            element_value_pairs: JavaParser.ElementValuePairsContext = annotation.elementValuePairs()
                            obfuscated_name = next(element_value_pairs.getChildren()).elementValue().getText().replace("\"","")
                            self.obfuscated_class_name = obfuscated_name
                if declaration_type:
                    self.class_extends = str(declaration_type.getText())
            else:
                self.class_name = str(ctx.classDeclaration().enumDeclaration().Identifier())
        else:
            interface_declaration: JavaParser.InterfaceDeclarationContext = ctx.interfaceDeclaration()
            if interface_declaration:
                self.class_name = str(interface_declaration.normalInterfaceDeclaration().Identifier())
        # print('classname: ' + self.class_name)

    def enterClassBodyDeclaration(self, ctx:JavaParser.ClassBodyDeclarationContext):
        member_decl: JavaParser.MemberDeclContext = ctx.memberDecl()
        modifiers: JavaParser.ClassOrInterfaceModifiersContext = ctx.modifiers()
        obfuscated_declaration_name = ''
        deobfuscation_args = ''
        static = False
        if modifiers:
            for modifier in modifiers.getChildren():
                annotation: JavaParser.AnnotationContext = modifier.annotation()
                if annotation:
                    if str(annotation.annotationName().getText()) == 'ObfuscatedName':
                        element_value_pairs: JavaParser.ElementValuePairsContext = annotation.elementValuePairs()
                        obfuscated_declaration_name = next(element_value_pairs.getChildren()).elementValue().getText().replace("\"","")
                    if str(annotation.annotationName().getText()) == 'ObfuscatedGetter':
                        element_value_pairs: JavaParser.ElementValuePairsContext = annotation.elementValuePairs()
                        deobfuscation_args = (next(element_value_pairs.getChildren()).elementValue().getText())
                elif modifier.getText() == 'static':
                    static = True
        if member_decl:
            member_declaration: JavaParser.MemberDeclarationContext = member_decl.memberDeclaration()
            void_declaration: JavaParser.VoidMethodDeclaratorRestContext = member_decl.voidMethodDeclaratorRest()
            if member_declaration or void_declaration:
                if member_declaration:
                    member_type = member_declaration.type().getText()
                    field_declaration: JavaParser.FieldDeclarationContext = member_declaration.fieldDeclaration()
                    method_declaration: JavaParser.MethodDeclarationContext = member_declaration.methodDeclaration()
                else:
                    member_type = 'void'
                    field_declaration = None
                    method_declaration = None
                if field_declaration:
                    variable_declarators: JavaParser.VariableDeclaratorsContext = field_declaration.variableDeclarators()
                    variable_declarator: JavaParser.VariableDeclaratorContext = variable_declarators.variableDeclarator()[0]
                    variable_declarator_id: JavaParser.VariableDeclaratorIdContext = variable_declarator.variableDeclaratorId()
                    variable_name = str(variable_declarator_id.Identifier())
                    field = {'name': variable_name, 'obfuscated_name': obfuscated_declaration_name, 'type': member_type, 'deobfuscation_args': deobfuscation_args, 'static': static}
                    self.class_fields.append(field)
                    # print("field: " + variable_name + " type: " + member_type)

                if method_declaration or void_declaration:
                    if method_declaration:
                        method_name = str(method_declaration.Identifier())
                        method_declaration_rest: JavaParser.MethodDeclaratorRestContext = method_declaration.methodDeclaratorRest()
                        formal_parameters: JavaParser.FormalParametersContext = method_declaration_rest.formalParameters()
                    else:
                        method_name = str(member_decl.Identifier())
                        formal_parameters: JavaParser.FormalParametersContext = void_declaration.formalParameters()
                    parameters_declarations: JavaParser.FormalParameterDeclsContext = formal_parameters.formalParameterDecls()
                    params_str = ""
                    method_parameters = []
                    while parameters_declarations:
                        parameter_type = parameters_declarations.type().getText()
                        parameter_declaration_rest: JavaParser.FormalParameterDeclsRestContext = parameters_declarations.formalParameterDeclsRest()
                        parameter_declaration_variable_id: JavaParser.VariableDeclaratorIdContext = parameter_declaration_rest.variableDeclaratorId()
                        parameter_name = str(parameter_declaration_variable_id.Identifier())
                        parameters_declarations = parameter_declaration_rest.formalParameterDecls()
                        params_str += parameter_type + ": " + parameter_name + ", "
                        parameter = {'name': parameter_name, 'type': parameter_type}
                        method_parameters.append(parameter)
                    method = {'name': method_name, 'obfuscated_name': obfuscated_declaration_name, 'type': member_type, 'parameters': method_parameters, 'deobfuscation_args': deobfuscation_args, 'static': static}
                    self.class_methods.append(method)
                    # print("method: " + method_name + ", type: " + member_type + ", params: (" + params_str + ")")



def get_input_stream(filename):
    file = io.open(filename)
    try:
        lines = file.readlines()
        return InputStream(''.join(lines))
    except Exception as e:
        print(e)
        print("on file: " + filename)
        return InputStream('')

def parse_tree(client):
    lexer = JavaLexer(client)
    stream = CommonTokenStream(lexer)
    parser = JavaParser(stream)
    tree = parser.compilationUnit()
    reader = JavaClassReader()
    walker = ParseTreeWalker()
    walker.walk(reader, tree)
    return reader

if __name__ == '__main__':
    for filename in listdir(path_to_deobfuscated_client):
        if isfile(join(path_to_deobfuscated_client, filename)) and filename.endswith(".java"):
            cb = get_input_stream(path_to_deobfuscated_client + filename)
            reader = parse_tree(cb)
            reader.printAPI()
            print(str(reader))
    # cb = get_input_stream(path_to_deobfuscated_client + "WorldMapScaleHandler.java")
    # reader = parse_tree(cb)
    # reader.printAPI()
    #
    # print(str(reader))
    # be = get_input_stream(path_to_deobfuscated_client + "Actor.java")
    # reader_be = parse_tree(be)
    # reader_be.printAPI()
    # print(str(reader_be))
