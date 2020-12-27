const Node = require('./node.js');


class Skeleton extends Node {
	static obfuscatedClassName = "bu";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, Skeleton.obfuscatedClassName);
	}

	static getField4648(){
		return  super.getField(Skeleton.obfuscatedClassName,"aa", ['int', -623221721]);
	}
	getField4651(){
		return  super.getField(Skeleton.obfuscatedClassName,"ae", ['int', -694079555]);
	}
	getField4652(){
		return  super.getField(Skeleton.obfuscatedClassName,"ah", []);
	}
	getField4655(){
		return  super.getField(Skeleton.obfuscatedClassName,"as", []);
	}
	getField4653(){
		return  super.getField(Skeleton.obfuscatedClassName,"ai", []);
	}
	getId(){
		return  super.getField(Skeleton.obfuscatedClassName,"ak", ['int', 2116074375]);
	}
	getField4656(){
		return  super.getField(Skeleton.obfuscatedClassName,"ax", []);
	}

	static onMethod7716(todo){
		super.onMethodExecution(Skeleton.obfuscatedClassName,"ad", todo, []);
	}
}
module.exports = Skeleton;
