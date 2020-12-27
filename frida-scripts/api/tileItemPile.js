const Interceptor = require('./core/apicore.js');
const Entity = require('./entity.js');


class TileItemPile extends Interceptor {
	static obfuscatedClassName = "au";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, TileItemPile.obfuscatedClassName);
	}

	getField296(){
		return  super.getField(TileItemPile.obfuscatedClassName,"ae", ['int', 1233400475]);
	}
	getField297(){
		return new Entity(super.getField(TileItemPile.obfuscatedClassName,"ah", []));
	}
	getField299(){
		return  super.getField(TileItemPile.obfuscatedClassName,"aj", ['long', 431872177864944053]);
	}
	getField301(){
		return  super.getField(TileItemPile.obfuscatedClassName,"al", ['int', -544965541]);
	}
	getField302(){
		return new Entity(super.getField(TileItemPile.obfuscatedClassName,"as", []));
	}
	getField298(){
		return  super.getField(TileItemPile.obfuscatedClassName,"ai", ['int', -488498137]);
	}
	getField300(){
		return  super.getField(TileItemPile.obfuscatedClassName,"ak", ['int', 1969880671]);
	}
	getFirst(){
		return new Entity(super.getField(TileItemPile.obfuscatedClassName,"ax", []));
	}

	static onMethod327(todo){
		super.onMethodExecution(TileItemPile.obfuscatedClassName,"aa", todo, []);
	}
	static onMethod328(todo){
		super.onMethodExecution(TileItemPile.obfuscatedClassName,"ah", todo, []);
	}
	static onMethod329(todo){
		super.onMethodExecution(TileItemPile.obfuscatedClassName,"ak", todo, []);
	}
}
module.exports = TileItemPile;
