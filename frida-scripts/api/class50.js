const Interceptor = require('./core/apicore.js');
const WorldMapManager = require('./worldMapManager.js');
const AbstractArchive = require('./abstractArchive.js');


class class50 extends Interceptor {
	static obfuscatedClassName = "dj";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, class50.obfuscatedClassName);
	}

	static getField2368(){
		return  super.getField(class50.obfuscatedClassName,"ta", ['int', -712192371]);
	}
	static getWidget_archive(){
		return new AbstractArchive(super.getField(class50.obfuscatedClassName,"aa", []));
	}
	static getField2367(){
		return  super.getField(class50.obfuscatedClassName,"fo", ['int', -1395128351]);
	}
	getField2369(){
		return  super.getField(class50.obfuscatedClassName,"ae", ['int', -238210235]);
	}
	getField2370(){
		return  super.getField(class50.obfuscatedClassName,"ai", ['int', 754634403]);
	}
	getField2371(){
		return  super.getField(class50.obfuscatedClassName,"ak", ['int', 464531741]);
	}
	getField2372(){
		return  super.getField(class50.obfuscatedClassName,"ax", ['int', -1259485567]);
	}
	getThis$0(){
		return new WorldMapManager(super.getField(class50.obfuscatedClassName,"", []));
	}

}
module.exports = class50;
