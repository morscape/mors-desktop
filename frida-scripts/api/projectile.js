const Entity = require('./entity.js');
const SequenceDefinition = require('./sequenceDefinition.js');


class Projectile extends Entity {
	static obfuscatedClassName = "iz";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, Projectile.obfuscatedClassName);
	}

	getField7589(){
		return  super.getField(Projectile.obfuscatedClassName,"aa", ['int', -1297432435]);
	}
	getFrameCycle(){
		return  super.getField(Projectile.obfuscatedClassName,"ac", ['int', -322341837]);
	}
	getField7593(){
		return  super.getField(Projectile.obfuscatedClassName,"ae", ['int', -1523888981]);
	}
	getField7594(){
		return  super.getField(Projectile.obfuscatedClassName,"af", ['int', 993764763]);
	}
	getFrame(){
		return  super.getField(Projectile.obfuscatedClassName,"ag", ['int', -1253081829]);
	}
	getSourceZ(){
		return  super.getField(Projectile.obfuscatedClassName,"ah", ['int', -1066711233]);
	}
	getField7598(){
		return  super.getField(Projectile.obfuscatedClassName,"aj", ['int', 329207215]);
	}
	getField7600(){
		return  super.getField(Projectile.obfuscatedClassName,"al", ['int', -614326157]);
	}
	getX(){
		return  super.getField(Projectile.obfuscatedClassName,"am", []);
	}
	getY(){
		return  super.getField(Projectile.obfuscatedClassName,"an", []);
	}
	getSpeedZ(){
		return  super.getField(Projectile.obfuscatedClassName,"ao", []);
	}
	getSpeed(){
		return  super.getField(Projectile.obfuscatedClassName,"ap", []);
	}
	getIsMoving(){
		return  super.getField(Projectile.obfuscatedClassName,"aq", []);
	}
	getSpeedY(){
		return  super.getField(Projectile.obfuscatedClassName,"ar", []);
	}
	getField7607(){
		return  super.getField(Projectile.obfuscatedClassName,"as", ['int', 1526988463]);
	}
	getSpeedX(){
		return  super.getField(Projectile.obfuscatedClassName,"aw", []);
	}
	getZ(){
		return  super.getField(Projectile.obfuscatedClassName,"ay", []);
	}
	getAccelerationZ(){
		return  super.getField(Projectile.obfuscatedClassName,"az", []);
	}
	getSequenceDefinition(){
		return new SequenceDefinition(super.getField(Projectile.obfuscatedClassName,"ad", []));
	}
	getSourceX(){
		return  super.getField(Projectile.obfuscatedClassName,"ai", ['int', 1421890437]);
	}
	getId(){
		return  super.getField(Projectile.obfuscatedClassName,"ak", ['int', -1775077147]);
	}
	getYaw(){
		return  super.getField(Projectile.obfuscatedClassName,"at", ['int', -459490299]);
	}
	getPitch(){
		return  super.getField(Projectile.obfuscatedClassName,"av", ['int', 198309053]);
	}
	getSourceY(){
		return  super.getField(Projectile.obfuscatedClassName,"ax", ['int', 521356095]);
	}
	getField7590(){
		return  super.getField(Projectile.obfuscatedClassName,"ab", ['int', 1346279515]);
	}

	static onAdvance(todo){
		super.onMethodExecution(Projectile.obfuscatedClassName,"ae", todo, []);
	}
	static onGetModel(todo){
		super.onMethodExecution(Projectile.obfuscatedClassName,"ag", todo, []);
	}
	static onMethod14474(todo){
		super.onMethodExecution(Projectile.obfuscatedClassName,"ak", todo, []);
	}
	static onMethod14468(todo){
		super.onMethodExecution(Projectile.obfuscatedClassName,"bx", todo, []);
	}
	static onMethod14469(todo){
		super.onMethodExecution(Projectile.obfuscatedClassName,"dt", todo, []);
	}
	static onMethod14467(todo){
		super.onMethodExecution(Projectile.obfuscatedClassName,"ad", todo, []);
	}
}
module.exports = Projectile;
