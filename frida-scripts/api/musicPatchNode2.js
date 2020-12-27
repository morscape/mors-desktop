const Interceptor = require('./core/apicore.js');


class MusicPatchNode2 extends Interceptor {
	static obfuscatedClassName = "lr";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, MusicPatchNode2.obfuscatedClassName);
	}

	getField3794(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"aa", ['int', -726236817]);
	}
	getField3795(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"ae", []);
	}
	getField3796(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"ah", ['int', -1282725725]);
	}
	getField3798(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"aj", ['int', 1371423561]);
	}
	getField3800(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"al", ['int', -873273377]);
	}
	getField3801(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"as", ['int', -680498001]);
	}
	getField3797(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"ai", ['int', 323559607]);
	}
	getField3799(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"ak", []);
	}
	getField3802(){
		return  super.getField(MusicPatchNode2.obfuscatedClassName,"ax", ['int', -1503807619]);
	}

}
module.exports = MusicPatchNode2;
