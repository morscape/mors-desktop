const Interceptor = require('./core/apicore.js');
const SoundSystem = require('./soundSystem.js');
const PcmStream = require('./pcmStream.js');


class PcmPlayer extends Interceptor {
	static obfuscatedClassName = "hn";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, PcmPlayer.obfuscatedClassName);
	}

	static getPcmPlayer_stereo(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"ae", []);
	}
	static getField3248(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"ah", ['int', -1816739005]);
	}
	static getField3253(){
		return new SoundSystem(super.getField(PcmPlayer.obfuscatedClassName,"as", []));
	}
	static getField3256(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"hn", ['int', 287174095]);
	}
	static getField3250(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"ak", ['int', -348348615]);
	}
	getField3258(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"af", []);
	}
	getField3259(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"am", []);
	}
	getField3260(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"an", ['int', -1408806141]);
	}
	getStream(){
		return new PcmStream(super.getField(PcmPlayer.obfuscatedClassName,"aq", []));
	}
	getField3264(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"az", []);
	}
	getField3262(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"at", []);
	}
	getField3263(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"av", []);
	}
	getField3257(){
		return  super.getField(PcmPlayer.obfuscatedClassName,"ab", []);
	}

	static onMethod5065(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"aa", todo, []);
	}
	static onMethod5070(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"af", todo, []);
	}
	static onMethod5074(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"al", todo, []);
	}
	static onVmethod11139(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"an", todo, []);
	}
	static onVmethod11140(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"ar", todo, []);
	}
	static onSetStream(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"as", todo, []);
	}
	static onVmethod11141(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"aw", todo, []);
	}
	static onVmethod11142(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"ay", todo, []);
	}
	static onVmethod11138(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"ak", todo, []);
	}
	static onMethod5066(todo){
		super.onMethodExecution(PcmPlayer.obfuscatedClassName,"ab", todo, []);
	}
}
module.exports = PcmPlayer;
