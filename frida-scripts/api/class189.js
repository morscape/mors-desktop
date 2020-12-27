const Interceptor = require('./core/apicore.js');
const Buffer = require('./buffer.js');


class class189 extends Interceptor {
	static obfuscatedClassName = "mk";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, class189.obfuscatedClassName);
	}

	static getNetCache_reference(){
		return new Buffer(super.getField(class189.obfuscatedClassName,"ag", []));
	}
	getField3857(){
		return  super.getField(class189.obfuscatedClassName,"aa", []);
	}
	getField3858(){
		return  super.getField(class189.obfuscatedClassName,"ah", []);
	}
	getField3859(){
		return  super.getField(class189.obfuscatedClassName,"aj", ['int', -234187901]);
	}
	getField3860(){
		return  super.getField(class189.obfuscatedClassName,"al", ['int', -184309641]);
	}
	getField3861(){
		return  super.getField(class189.obfuscatedClassName,"as", []);
	}
	getField3862(){
		return  super.getField(class189.obfuscatedClassName,"ax", ['int', -1478463225]);
	}

	static onMethod6641(todo){
		super.onMethodExecution(class189.obfuscatedClassName,"ai", todo, []);
	}
	static onMethod6643(todo){
		super.onMethodExecution(class189.obfuscatedClassName,"ak", todo, []);
	}
}
module.exports = class189;
