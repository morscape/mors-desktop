const Interceptor = require('./core/apicore.js');
const Entity = require('./entity.js');


class FloorDecoration extends Interceptor {
	static obfuscatedClassName = "bn";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, FloorDecoration.obfuscatedClassName);
	}

	static getMusicTrackVolume(){
		return  super.getField(FloorDecoration.obfuscatedClassName,"aa", ['int', 862873995]);
	}
	getX(){
		return  super.getField(FloorDecoration.obfuscatedClassName,"ae", ['int', -66493803]);
	}
	getTag(){
		return  super.getField(FloorDecoration.obfuscatedClassName,"ah", ['long', 6697630951541377709]);
	}
	getFlags(){
		return  super.getField(FloorDecoration.obfuscatedClassName,"as", ['int', -1618059749]);
	}
	getY(){
		return  super.getField(FloorDecoration.obfuscatedClassName,"ai", ['int', 936378368]);
	}
	getTileHeight(){
		return  super.getField(FloorDecoration.obfuscatedClassName,"ak", ['int', 2012773385]);
	}
	getEntity(){
		return new Entity(super.getField(FloorDecoration.obfuscatedClassName,"ax", []));
	}

	static onMethod851(todo){
		super.onMethodExecution(FloorDecoration.obfuscatedClassName,"ad", todo, []);
	}
	static onMethod852(todo){
		super.onMethodExecution(FloorDecoration.obfuscatedClassName,"ak", todo, []);
	}
	static onMethod853(todo){
		super.onMethodExecution(FloorDecoration.obfuscatedClassName,"do", todo, []);
	}
}
module.exports = FloorDecoration;
