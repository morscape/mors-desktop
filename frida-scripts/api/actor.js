const Entity = require('./entity.js');
const IterableNodeDeque = require('./iterableNodeDeque.js');


class Actor extends Entity {
	static obfuscatedClassName = "in";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, Actor.obfuscatedClassName);
	}

	getField7517(){
		return  super.getField(Actor.obfuscatedClassName,"an", []);
	}
	getField7518(){
		return  super.getField(Actor.obfuscatedClassName,"ba", []);
	}
	getIdleSequence(){
		return  super.getField(Actor.obfuscatedClassName,"bd", ['int', 1355976873]);
	}
	getField7523(){
		return  super.getField(Actor.obfuscatedClassName,"bh", []);
	}
	getX(){
		return  super.getField(Actor.obfuscatedClassName,"bj", ['int', 513787439]);
	}
	getField7527(){
		return  super.getField(Actor.obfuscatedClassName,"bn", ['int', 775383853]);
	}
	getField7529(){
		return  super.getField(Actor.obfuscatedClassName,"bq", ['int', -1861404765]);
	}
	getField7530(){
		return  super.getField(Actor.obfuscatedClassName,"br", ['int', -452751424]);
	}
	getField7542(){
		return  super.getField(Actor.obfuscatedClassName,"ce", ['int', -460708247]);
	}
	getMovementSequence(){
		return  super.getField(Actor.obfuscatedClassName,"ck", ['int', 1649344219]);
	}
	getField7550(){
		return  super.getField(Actor.obfuscatedClassName,"cm", ['int', -132045733]);
	}
	getField7552(){
		return  super.getField(Actor.obfuscatedClassName,"co", []);
	}
	getField7560(){
		return  super.getField(Actor.obfuscatedClassName,"cw", []);
	}
	getField7570(){
		return  super.getField(Actor.obfuscatedClassName,"dn", ['int', -308041059]);
	}
	getField7576(){
		return  super.getField(Actor.obfuscatedClassName,"dx", ['int', -36859543]);
	}
	getField7526(){
		return  super.getField(Actor.obfuscatedClassName,"bl", []);
	}
	getField7531(){
		return  super.getField(Actor.obfuscatedClassName,"bs", ['int', 204283925]);
	}
	getField7533(){
		return  super.getField(Actor.obfuscatedClassName,"bu", ['int', -2090158395]);
	}
	getField7539(){
		return  super.getField(Actor.obfuscatedClassName,"cb", ['int', -546254615]);
	}
	getField7541(){
		return new IterableNodeDeque(super.getField(Actor.obfuscatedClassName,"cd", []));
	}
	getField7544(){
		return  super.getField(Actor.obfuscatedClassName,"cg", []);
	}
	getSequence(){
		return  super.getField(Actor.obfuscatedClassName,"cn", ['int', 1793361247]);
	}
	getField7554(){
		return  super.getField(Actor.obfuscatedClassName,"cq", []);
	}
	getSequenceDelay(){
		return  super.getField(Actor.obfuscatedClassName,"cs", ['int', -1146696469]);
	}
	getField7557(){
		return  super.getField(Actor.obfuscatedClassName,"ct", ['int', 1785048439]);
	}
	getField7562(){
		return  super.getField(Actor.obfuscatedClassName,"cy", ['int', -2052135425]);
	}
	getField7535(){
		return  super.getField(Actor.obfuscatedClassName,"bw", []);
	}
	getField7525(){
		return  super.getField(Actor.obfuscatedClassName,"bk", ['int', -1844829283]);
	}
	getField7553(){
		return  super.getField(Actor.obfuscatedClassName,"cp", []);
	}

	static onIsVisible(todo){
		super.onMethodExecution(Actor.obfuscatedClassName,"aq", todo, []);
	}
}
module.exports = Actor;
