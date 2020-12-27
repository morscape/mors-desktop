const ModelData = require('./modelData.js');
const IterableNodeHashTable = require('./iterableNodeHashTable.js');
const DualNode = require('./dualNode.js');
const EvictingDualNodeHashTable = require('./evictingDualNodeHashTable.js');
const AbstractArchive = require('./abstractArchive.js');


class ObjectDefinition extends DualNode {
	static obfuscatedClassName = "de";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, ObjectDefinition.obfuscatedClassName);
	}

	static getObjectDefinition_archive(){
		return new AbstractArchive(super.getField(ObjectDefinition.obfuscatedClassName,"ae", []));
	}
	static getField6866(){
		return new EvictingDualNodeHashTable(super.getField(ObjectDefinition.obfuscatedClassName,"ah", []));
	}
	static getObjectDefinition_cachedModels(){
		return new EvictingDualNodeHashTable(super.getField(ObjectDefinition.obfuscatedClassName,"aj", []));
	}
	static getField6870(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"al", []);
	}
	static getObjectDefinition_cachedEntities(){
		return new EvictingDualNodeHashTable(super.getField(ObjectDefinition.obfuscatedClassName,"as", []));
	}
	static getField6873(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"hq", ['int', 961174599]);
	}
	static getField6874(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"hs", ['int', -1584939077]);
	}
	static getField6867(){
		return new AbstractArchive(super.getField(ObjectDefinition.obfuscatedClassName,"ai", []));
	}
	static getField6869(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ak", []);
	}
	static getObjectDefinition_cached(){
		return new EvictingDualNodeHashTable(super.getField(ObjectDefinition.obfuscatedClassName,"ax", []));
	}
	getId(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"aa", ['int', -1785732891]);
	}
	getField6877(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ac", ['int', -98915501]);
	}
	getModels(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"af", []);
	}
	getField6880(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ag", []);
	}
	getField6881(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"am", []);
	}
	getField6882(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"an", []);
	}
	getField6883(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ao", ['int', -933076799]);
	}
	getField6884(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ap", ['int', 733133117]);
	}
	getField6885(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"aq", []);
	}
	getField6886(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ar", ['int', -254110353]);
	}
	getField6888(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"au", ['int', 1904196879]);
	}
	getField6890(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"aw", []);
	}
	getField6891(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ay", []);
	}
	getField6892(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"az", []);
	}
	getField6893(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ba", ['int', 909637585]);
	}
	getField6894(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bb", ['int', 1076189071]);
	}
	getField6896(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bd", ['int', -1616813911]);
	}
	getField6897(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"be", []);
	}
	getField6899(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bg", []);
	}
	getField6900(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bh", []);
	}
	getField6902(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bj", ['int', -1209493665]);
	}
	getField6905(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bm", []);
	}
	getField6906(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bn", ['int', -1731427863]);
	}
	getField6907(){
		return new IterableNodeHashTable(super.getField(ObjectDefinition.obfuscatedClassName,"bo", []));
	}
	getField6908(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bp", ['int', -621455203]);
	}
	getField6909(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bq", []);
	}
	getField6910(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"br", ['int', 202334613]);
	}
	getField6912(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bt", ['int', 944130853]);
	}
	getField6916(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bx", ['int', -2131764721]);
	}
	getField6917(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"by", []);
	}
	getNonFlatShading(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ad", []);
	}
	getField6887(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"at", ['int', -426998753]);
	}
	getField6889(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"av", ['int', 1483725117]);
	}
	getField6895(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bc", ['int', -477491691]);
	}
	getField6901(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bi", ['int', -2046443189]);
	}
	getField6904(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bl", ['int', -445799303]);
	}
	getField6911(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bs", []);
	}
	getField6913(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bu", ['int', -561240797]);
	}
	getTransforms(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bv", []);
	}
	getField6918(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bz", ['int', -1520497091]);
	}
	getField6876(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"ab", []);
	}
	getMapIconId(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bf", ['int', -975764493]);
	}
	getField6915(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bw", ['int', -347288099]);
	}
	getField6903(){
		return  super.getField(ObjectDefinition.obfuscatedClassName,"bk", ['int', -376344979]);
	}

	static onMethod12880(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"af", todo, []);
	}
	static onMethod12882(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"ah", todo, []);
	}
	static onMethod12884(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"aj", todo, []);
	}
	static onGetModel(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"al", todo, []);
	}
	static onMethod12888(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"aq", todo, []);
	}
	static onMethod12893(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"aw", todo, []);
	}
	static onMethod12883(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"ai", todo, []);
	}
	static onDecodeNext(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"ax", todo, []);
	}
	static onGetModelDynamic(todo){
		super.onMethodExecution(ObjectDefinition.obfuscatedClassName,"ab", todo, []);
	}
}
module.exports = ObjectDefinition;
