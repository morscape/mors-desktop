# Frida scripts

OSRS mobile Frida js instrumentation APIs. 

[api](api/) - MORS APIs

[Framework](/) - Framework for testing and prototyping API methods and plugins. Using frida-server on your device and python frida from your desktop

Usage: 

To develop a plugin:
* Create a copy of idlenotifier.js and idlenotifier.py with the desired name (ex: yourplugin).
* Edit yourplugin.py and replace `idlenotifier.compiled.js` (line 10) with  `yourplugin.compiled.js`
* Edit yourplugin.js
* Compile using `npx frida-compile fridas-scripts/yourplugin.js -o frida-scripts/yourplugin.compiled.js`
* Run yourplugin.py

To develop an API feature:
* Edit the class you need under api/ or api/core
* Compile using `npx frida-compile fridas-scripts/yourplugin.js -o frida-scripts/yourplugin.compiled.js`
* Run yourplugin.py
* Once the modification is tested you can proceed to add a writer to js-injector/injector.py to automatically implement the given method.
 