const class264 = require('./class264.js');
const PcmPlayer = require('./pcmPlayer.js');
const class19 = require('./class19.js');
const Archive = require('./archive.js');
const ScriptEvent = require('./scriptEvent.js');


class DevicePcmPlayer extends class19 {
	static obfuscatedClassName = "bc";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, DevicePcmPlayer.obfuscatedClassName);
	}

	static getField4627(){
		return new PcmPlayer(super.getField(DevicePcmPlayer.obfuscatedClassName,"ph", []));
	}
	static getField4626(){
		return new Archive(super.getField(DevicePcmPlayer.obfuscatedClassName,"do", []));
	}
	getField4628(){
		return new ScriptEvent(super.getField(DevicePcmPlayer.obfuscatedClassName,"ae", []));
	}
	getField4629(){
		return new class264(super.getField(DevicePcmPlayer.obfuscatedClassName,"ak", []));
	}

	static onVmethod7589(todo){
		super.onMethodExecution(DevicePcmPlayer.obfuscatedClassName,"ae", todo, []);
	}
	static onOpen(todo){
		super.onMethodExecution(DevicePcmPlayer.obfuscatedClassName,"ay", todo, []);
	}
	static onVmethod7592(todo){
		super.onMethodExecution(DevicePcmPlayer.obfuscatedClassName,"ai", todo, []);
	}
	static onVmethod7594(todo){
		super.onMethodExecution(DevicePcmPlayer.obfuscatedClassName,"ak", todo, []);
	}
	static onVmethod7604(todo){
		super.onMethodExecution(DevicePcmPlayer.obfuscatedClassName,"ax", todo, []);
	}
	static onMethod7586(todo){
		super.onMethodExecution(DevicePcmPlayer.obfuscatedClassName,"ah", todo, []);
	}
}
module.exports = DevicePcmPlayer;
