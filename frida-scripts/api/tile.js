const GameObject = require('./gameObject.js');
const FloorDecoration = require('./floorDecoration.js');
const WallDecoration = require('./wallDecoration.js');
const TileModel = require('./tileModel.js');
const Archive = require('./archive.js');
const TileItemPile = require('./tileItemPile.js');
const Node = require('./node.js');
const TilePaint = require('./tilePaint.js');
const BoundaryObject = require('./boundaryObject.js');


class Tile extends Node {
	static obfuscatedClassName = "bz";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, Tile.obfuscatedClassName);
	}

	static getField4675(){
		return new Archive(super.getField(Tile.obfuscatedClassName,"cc", []));
	}
	getFloorDecoration(){
		return new FloorDecoration(super.getField(Tile.obfuscatedClassName,"aa", []));
	}
	getX(){
		return  super.getField(Tile.obfuscatedClassName,"ae", ['int', 244243639]);
	}
	getField4682(){
		return  super.getField(Tile.obfuscatedClassName,"af", ['int', -273266859]);
	}
	getPaint(){
		return new TilePaint(super.getField(Tile.obfuscatedClassName,"ah", []));
	}
	getBoundaryObject(){
		return new BoundaryObject(super.getField(Tile.obfuscatedClassName,"aj", []));
	}
	getWallDecoration(){
		return new WallDecoration(super.getField(Tile.obfuscatedClassName,"al", []));
	}
	getGameObjectEdgeMasks(){
		return  super.getField(Tile.obfuscatedClassName,"am", []);
	}
	getField4689(){
		return  super.getField(Tile.obfuscatedClassName,"an", ['int', -1567844107]);
	}
	getField4690(){
		return  super.getField(Tile.obfuscatedClassName,"ao", ['int', -904913727]);
	}
	getField4691(){
		return  super.getField(Tile.obfuscatedClassName,"ap", []);
	}
	getGameObjects(){
		return  super.getField(Tile.obfuscatedClassName,"aq", []);
	}
	getDrawSecondary(){
		return  super.getField(Tile.obfuscatedClassName,"ar", []);
	}
	getModel(){
		return new TileModel(super.getField(Tile.obfuscatedClassName,"as", []));
	}
	getField4697(){
		return  super.getField(Tile.obfuscatedClassName,"aw", []);
	}
	getMinPlane(){
		return  super.getField(Tile.obfuscatedClassName,"ay", ['int', 1180444621]);
	}
	getField4700(){
		return  super.getField(Tile.obfuscatedClassName,"az", ['int', -2089686693]);
	}
	getLinkedBelowTile(){
		return new Tile(super.getField(Tile.obfuscatedClassName,"ad", []));
	}
	getY(){
		return  super.getField(Tile.obfuscatedClassName,"ai", ['int', 1056367365]);
	}
	getPlane(){
		return  super.getField(Tile.obfuscatedClassName,"ak", ['int', 788971833]);
	}
	getField4695(){
		return  super.getField(Tile.obfuscatedClassName,"at", ['int', -1229073707]);
	}
	getField4696(){
		return  super.getField(Tile.obfuscatedClassName,"av", ['int', 689606219]);
	}
	getOriginalPlane(){
		return  super.getField(Tile.obfuscatedClassName,"ax", ['int', -1463479049]);
	}
	getTileItemPile(){
		return new TileItemPile(super.getField(Tile.obfuscatedClassName,"ab", []));
	}

	static onMethod7729(todo){
		super.onMethodExecution(Tile.obfuscatedClassName,"al", todo, []);
	}
	static onMethod7730(todo){
		super.onMethodExecution(Tile.obfuscatedClassName,"an", todo, []);
	}
	static onMethod7732(todo){
		super.onMethodExecution(Tile.obfuscatedClassName,"ef", todo, []);
	}
	static onMethod7733(todo){
		super.onMethodExecution(Tile.obfuscatedClassName,"ew", todo, []);
	}
	static onFormatItemStacks(todo){
		super.onMethodExecution(Tile.obfuscatedClassName,"fx", todo, []);
	}
	static onSortWorlds(todo){
		super.onMethodExecution(Tile.obfuscatedClassName,"ai", todo, []);
	}
}
module.exports = Tile;
