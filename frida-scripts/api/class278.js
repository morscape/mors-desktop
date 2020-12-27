const Interceptor = require('./core/apicore.js');
const Archive = require('./archive.js');


class class278 extends Interceptor {
	static obfuscatedClassName = "ct";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, class278.obfuscatedClassName);
	}

	static getField5886(){
		return new Archive(super.getField(class278.obfuscatedClassName,"dz", []));
	}
	getField5888(){
		return  super.getField(class278.obfuscatedClassName,"aa", ['int', 37350969]);
	}
	getField5890(){
		return  super.getField(class278.obfuscatedClassName,"ae", ['int', -165371773]);
	}
	getField5891(){
		return  super.getField(class278.obfuscatedClassName,"ah", ['int', -791272681]);
	}
	getField5893(){
		return  super.getField(class278.obfuscatedClassName,"aj", ['int', -895540727]);
	}
	getField5895(){
		return  super.getField(class278.obfuscatedClassName,"al", ['int', -339153117]);
	}
	getField5896(){
		return  super.getField(class278.obfuscatedClassName,"as", ['int', 554882109]);
	}
	getField5892(){
		return  super.getField(class278.obfuscatedClassName,"ai", ['int', 335966433]);
	}
	getField5894(){
		return  super.getField(class278.obfuscatedClassName,"ak", ['int', 1274466069]);
	}
	getField5897(){
		return  super.getField(class278.obfuscatedClassName,"ax", ['int', -2100285093]);
	}
	getField5889(){
		return  super.getField(class278.obfuscatedClassName,"ab", ['int', 2118325869]);
	}

	static onVmethod10367(todo){
		super.onMethodExecution(class278.obfuscatedClassName,"ae", todo, []);
	}
	static onMethod10371(todo){
		super.onMethodExecution(class278.obfuscatedClassName,"aj", todo, []);
	}
	static onVmethod10380(todo){
		super.onMethodExecution(class278.obfuscatedClassName,"as", todo, []);
	}
	static onExpandBounds(todo){
		super.onMethodExecution(class278.obfuscatedClassName,"ak", todo, []);
	}
	static onVmethod10384(todo){
		super.onMethodExecution(class278.obfuscatedClassName,"ax", todo, []);
	}
	static onMethod10364(todo){
		super.onMethodExecution(class278.obfuscatedClassName,"ak", todo, []);
	}
}
module.exports = class278;
