const NodeHashTable = require('./nodeHashTable.js');
const NetFileRequest = require('./netFileRequest.js');
const DualNodeDeque = require('./dualNodeDeque.js');
const AbstractSocket = require('./abstractSocket.js');
const Interceptor = require('./core/apicore.js');
const Archive = require('./archive.js');
const Buffer = require('./buffer.js');


class NetCache extends Interceptor {
	static obfuscatedClassName = "kl";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, NetCache.obfuscatedClassName);
	}

	static getField3714(){
		return  super.getField(NetCache.obfuscatedClassName,"aa", ['int', -1684352873]);
	}
	static getNetCache_archives(){
		return  super.getField(NetCache.obfuscatedClassName,"ac", []);
	}
	static getField3719(){
		return  super.getField(NetCache.obfuscatedClassName,"af", ['int', 1890169313]);
	}
	static getNetCache_socket(){
		return new AbstractSocket(super.getField(NetCache.obfuscatedClassName,"ah", []));
	}
	static getField3722(){
		return  super.getField(NetCache.obfuscatedClassName,"aj", ['long', -616812300205213511]);
	}
	static getNetCache_pendingPriorityWrites(){
		return new NodeHashTable(super.getField(NetCache.obfuscatedClassName,"al", []));
	}
	static getNetCache_pendingWrites(){
		return new NodeHashTable(super.getField(NetCache.obfuscatedClassName,"am", []));
	}
	static getNetCache_pendingWritesCount(){
		return  super.getField(NetCache.obfuscatedClassName,"an", ['int', -1547373955]);
	}
	static getField3727(){
		return new Buffer(super.getField(NetCache.obfuscatedClassName,"ao", []));
	}
	static getNetCache_currentResponse(){
		return new NetFileRequest(super.getField(NetCache.obfuscatedClassName,"ap", []));
	}
	static getNetCache_pendingWritesQueue(){
		return new DualNodeDeque(super.getField(NetCache.obfuscatedClassName,"aq", []));
	}
	static getField3730(){
		return  super.getField(NetCache.obfuscatedClassName,"ar", []);
	}
	static getNetCache_loadTime(){
		return  super.getField(NetCache.obfuscatedClassName,"as", ['int', -1894803983]);
	}
	static getField3733(){
		return  super.getField(NetCache.obfuscatedClassName,"au", []);
	}
	static getField3734(){
		return  super.getField(NetCache.obfuscatedClassName,"aw", ['int', 410800167]);
	}
	static getNetCache_pendingResponses(){
		return new NodeHashTable(super.getField(NetCache.obfuscatedClassName,"ay", []));
	}
	static getField3737(){
		return  super.getField(NetCache.obfuscatedClassName,"bp", ['int', 1114547437]);
	}
	static getField3717(){
		return new CRC32(super.getField(NetCache.obfuscatedClassName,"ad", []));
	}
	static getField3732(){
		return  super.getField(NetCache.obfuscatedClassName,"at", ['int', -400066263]);
	}
	static getField3736(){
		return  super.getField(NetCache.obfuscatedClassName,"bi", ['int', 1122134477]);
	}
	static getNetCache_pendingPriorityResponses(){
		return new NodeHashTable(super.getField(NetCache.obfuscatedClassName,"ab", []));
	}

}
module.exports = NetCache;
