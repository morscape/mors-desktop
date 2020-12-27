const Interceptor = require('./core/apicore.js');
const IndexedSprite = require('./indexedSprite.js');


class class55 extends Interceptor {
	static obfuscatedClassName = "dt";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, class55.obfuscatedClassName);
	}

	static getField2409(){
		return  super.getField(class55.obfuscatedClassName,"tl", ['int', -1824459571]);
	}
	static getField2410(){
		return new IndexedSprite(super.getField(class55.obfuscatedClassName,"ua", []));
	}

}
module.exports = class55;
