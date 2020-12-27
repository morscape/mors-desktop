const Interceptor = require('./core/apicore.js');
const Entity = require('./entity.js');


class WallDecoration extends Interceptor {
	static obfuscatedClassName = "bq";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, WallDecoration.obfuscatedClassName);
	}

	getField506(){
		return new Entity(super.getField(WallDecoration.obfuscatedClassName,"aa", []));
	}
	getX(){
		return  super.getField(WallDecoration.obfuscatedClassName,"ae", ['int', 497359245]);
	}
	getFlags(){
		return  super.getField(WallDecoration.obfuscatedClassName,"af", ['int', -326097107]);
	}
	getField510(){
		return  super.getField(WallDecoration.obfuscatedClassName,"ah", ['int', -406575379]);
	}
	getYOffset(){
		return  super.getField(WallDecoration.obfuscatedClassName,"aj", ['int', -1957672667]);
	}
	getField514(){
		return new Entity(super.getField(WallDecoration.obfuscatedClassName,"al", []));
	}
	getXOffset(){
		return  super.getField(WallDecoration.obfuscatedClassName,"as", ['int', 1704321235]);
	}
	getField511(){
		return  super.getField(WallDecoration.obfuscatedClassName,"ai", ['int', -573330329]);
	}
	getField513(){
		return  super.getField(WallDecoration.obfuscatedClassName,"ak", ['int', 1589230023]);
	}
	getField516(){
		return  super.getField(WallDecoration.obfuscatedClassName,"ax", ['int', 1433280261]);
	}
	getTag(){
		return  super.getField(WallDecoration.obfuscatedClassName,"ab", ['long', -2300556015533445203]);
	}

	static onMethod864(todo){
		super.onMethodExecution(WallDecoration.obfuscatedClassName,"bv", todo, []);
	}
	static onMethod863(todo){
		super.onMethodExecution(WallDecoration.obfuscatedClassName,"ab", todo, []);
	}
}
module.exports = WallDecoration;
