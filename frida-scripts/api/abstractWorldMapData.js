const Interceptor = require('./core/apicore.js');
const class292 = require('./class292.js');
const MidiPcmStream = require('./midiPcmStream.js');
const WorldMapDecoration = require('./worldMapDecoration.js');


class AbstractWorldMapData extends Interceptor {
	static obfuscatedClassName = "cz";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, AbstractWorldMapData.obfuscatedClassName);
	}

	static getField2346(){
		return new MidiPcmStream(super.getField(AbstractWorldMapData.obfuscatedClassName,"po", []));
	}
	static getField2347(){
		return new class292(super.getField(AbstractWorldMapData.obfuscatedClassName,"pt", []));
	}
	getFloorUnderlayIds(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"aa", []);
	}
	getField2350(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ae", ['int', -1336240064]);
	}
	getField2351(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"af", []);
	}
	getField2352(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ah", ['int', 1245844867]);
	}
	getGroupId(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"aj", ['int', -295871741]);
	}
	getFileId(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"al", ['int', 991596609]);
	}
	getDecorations(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"am", []);
	}
	getField2358(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"an", []);
	}
	getField2359(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"aq", []);
	}
	getField2360(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"as", ['int', -220162973]);
	}
	getField2362(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ay", []);
	}
	getRegionX(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ai", ['int', -844438563]);
	}
	getField2355(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ak", ['int', -1682688704]);
	}
	getRegionY(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ax", ['int', 916263053]);
	}
	getFloorOverlayIds(){
		return  super.getField(AbstractWorldMapData.obfuscatedClassName,"ab", []);
	}

	static onMethod3713(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"aa", todo, []);
	}
	static onVmethod7752(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"ae", todo, []);
	}
	static onMethod3718(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"af", todo, []);
	}
	static onReset(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"ah", todo, []);
	}
	static onMethod3722(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"aj", todo, []);
	}
	static onMethod3723(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"al", todo, []);
	}
	static onLoadGeography(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"as", todo, []);
	}
	static onIsFullyLoaded(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"ax", todo, []);
	}
	static onMethod3714(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"ab", todo, []);
	}
	static onMethod3709(todo){
		super.onMethodExecution(AbstractWorldMapData.obfuscatedClassName,"ab", todo, []);
	}
}
module.exports = AbstractWorldMapData;
