const PacketBuffer = require('./packetBuffer.js');
const Node = require('./node.js');
const ClientPacket = require('./clientPacket.js');


class PacketBufferNode extends Node {
	static obfuscatedClassName = "oo";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, PacketBufferNode.obfuscatedClassName);
	}

	static getPacketBufferNode_packetBufferNodes(){
		return  super.getField(PacketBufferNode.obfuscatedClassName,"ah", []);
	}
	static getPacketBufferNode_packetBufferNodeCount(){
		return  super.getField(PacketBufferNode.obfuscatedClassName,"as", ['int', -2078655111]);
	}
	getField6432(){
		return  super.getField(PacketBufferNode.obfuscatedClassName,"ae", ['int', -1746037827]);
	}
	getPacketBuffer(){
		return new PacketBuffer(super.getField(PacketBufferNode.obfuscatedClassName,"ai", []));
	}
	getField6434(){
		return new ClientPacket(super.getField(PacketBufferNode.obfuscatedClassName,"ak", []));
	}
	getIndex(){
		return  super.getField(PacketBufferNode.obfuscatedClassName,"ax", ['int', 551116819]);
	}

	static onMethod12125(todo){
		super.onMethodExecution(PacketBufferNode.obfuscatedClassName,"ax", todo, []);
	}
}
module.exports = PacketBufferNode;
