const Interceptor = require('./core/apicore.js');
const Client = require('./client.js');


class DesktopPlatformInfoProvider extends Interceptor {
	static obfuscatedClassName = "pd";
	constructor(obfuscatedObject, superName){
		super(obfuscatedObject, DesktopPlatformInfoProvider.obfuscatedClassName);
	}

	getField6555(){
		return  super.getField(DesktopPlatformInfoProvider.obfuscatedClassName,"ah", ['int', -895456121]);
	}
	getField6556(){
		return  super.getField(DesktopPlatformInfoProvider.obfuscatedClassName,"aj", ['int', -524284361]);
	}
	getField6557(){
		return  super.getField(DesktopPlatformInfoProvider.obfuscatedClassName,"as", ['int', -1125020771]);
	}
	getField6558(){
		return new Client(super.getField(DesktopPlatformInfoProvider.obfuscatedClassName,"ax", []));
	}

	static onMethod12169(todo){
		super.onMethodExecution(DesktopPlatformInfoProvider.obfuscatedClassName,"ah", todo, []);
	}
	static onMethod12171(todo){
		super.onMethodExecution(DesktopPlatformInfoProvider.obfuscatedClassName,"aj", todo, []);
	}
	static onMethod12175(todo){
		super.onMethodExecution(DesktopPlatformInfoProvider.obfuscatedClassName,"as", todo, []);
	}
	static onVmethod12172(todo){
		super.onMethodExecution(DesktopPlatformInfoProvider.obfuscatedClassName,"ak", todo, []);
	}
}
module.exports = DesktopPlatformInfoProvider;
