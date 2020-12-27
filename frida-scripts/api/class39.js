const Interceptor = require('./core/apicore.js');
const IndexedSprite = require('./indexedSprite.js');


class class39 extends Interceptor {
	static obfuscatedClassName = "cj";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, class39.obfuscatedClassName);
	}

	static getField585(){
		return new IndexedSprite(super.getField(class39.obfuscatedClassName,"eb", []));
	}

}
module.exports = class39;
