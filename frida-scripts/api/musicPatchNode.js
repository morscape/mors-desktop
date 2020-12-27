const RawSound = require('./rawSound.js');
const RawPcmStream = require('./rawPcmStream.js');
const MusicPatch = require('./musicPatch.js');
const MusicPatchNode2 = require('./musicPatchNode2.js');
const Node = require('./node.js');


class MusicPatchNode extends Node {
	static obfuscatedClassName = "li";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, MusicPatchNode.obfuscatedClassName);
	}

	getPatch(){
		return new MusicPatch(super.getField(MusicPatchNode.obfuscatedClassName,"ae", []));
	}
	getStream(){
		return new RawPcmStream(super.getField(MusicPatchNode.obfuscatedClassName,"ao", []));
	}
	getField6341(){
		return  super.getField(MusicPatchNode.obfuscatedClassName,"as", ['int', 1965553835]);
	}
	getField6345(){
		return  super.getField(MusicPatchNode.obfuscatedClassName,"ay", ['int', -78466697]);
	}
	getRawSound(){
		return new RawSound(super.getField(MusicPatchNode.obfuscatedClassName,"ai", []));
	}
	getField6333(){
		return  super.getField(MusicPatchNode.obfuscatedClassName,"ak", ['int', -1976563219]);
	}
	getField6342(){
		return  super.getField(MusicPatchNode.obfuscatedClassName,"av", []);
	}
	getField6344(){
		return new MusicPatchNode2(super.getField(MusicPatchNode.obfuscatedClassName,"ax", []));
	}

	static onMethod11594(todo){
		super.onMethodExecution(MusicPatchNode.obfuscatedClassName,"ak", todo, []);
	}
	static onMethod11589(todo){
		super.onMethodExecution(MusicPatchNode.obfuscatedClassName,"aj", todo, []);
	}
	static onMethod11590(todo){
		super.onMethodExecution(MusicPatchNode.obfuscatedClassName,"bi", todo, []);
	}
}
module.exports = MusicPatchNode;
