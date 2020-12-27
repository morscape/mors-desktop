# MORS
Android Open Source Old School RuneScape Helper

This is not a client, it draws on top of the original OSRS client.

Only works for Android

Your device needs to be rooted to use this application.

The reason it must be rooted is because we are using Frida.js to instrument the client. Therefore you will need to download the [frida-inject 14.0.8](https://github.com/frida/frida/releases/tag/14.0.8) application's and put it under /data/local/tmp/ on your phone filesystem

## Whats working?
* At the moment only idle notifier: Shows a draggable colored circle overlay on top of the game. Green when performing an animation, red when idle

![alt text](images/idlenotifier.jpg)

## Whats new?
* The Client has been de-obfuscated and mapped to an API in the JavaScript language recognized by Frida.js. These APIs can be used to develop new plugins and simplify communication with the Client. For de-obfuscation, the desktop client code was mapped to the mobile client code and this raised some problems:
  * Not all classes and methods have been mapped.
  * The identifiers for the animations (and possibly others as well) are different than in the desktop version and must be remapped.
  * If you want to use the API you need to compile the scripts with [frida-compile](https://github.com/frida/frida/releases/tag/14.0.8)


## Project Layout  

- #### [mors-client](mors-client/) - Android application. Draws on top of OSRS client
- [deobfuscator](deobfuscator/) - Can decompile and cleanup gamepacks as well as map updates to newer revs
- [js-injector](injector-plugin/) - Tool for implementing our API by reading the cleaned gamepack
- [frida-scripts](frida-scripts/api) - MORS API, interfaces for accessing the client. Framework to prototype plugins
- [runescape-api](runescape-api/) - Mappings correspond to these interfaces, runelite-api is a subset of this
- [runscape-client](runscape-client/) - Desktop game client de-obfuscated, mapped, cleaned and annotated
- [mobile-runescape-client](mobile-runescape-client/) - Mobile game client de-obfuscated, mapped, cleaned and annotated


## Contributing
* You can contribute in different ways:
    * in the development of plugins: by using the [frida-scripts](frida-scripts/) framework to prototype and test and [mobile-runescape-client](mobile-runescape-client/) to deploy.
    * in the development of the client mappings and deobfuscation: Using deobfuscator to deobfuscate and map the client, [js-injector](injector-plugin/) to create the API
    * development of APIs: adding some utility to [APIs](frida-scripts/api) then implementing the corresponding writer in [js-injector](injector-plugin/)
* Make a fork
* Test all changes before submitting
* Submit a pull request with details on the changes and why it should be submitted.
* By submitting you are agreeing that you are legally allowed to contribute the code provided and are not under any arbitration agreements.


All images used are copyright of their respective owners.
Runescape related images are copyright of Jagex Ltd.
