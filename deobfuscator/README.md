# Deobfuscator

A standalone OSRS deobfuscator/refactoring tool

[Deobfuscator](src/main/java/net/runelite/deob/Deob.java) - Removes unnecessary code from vanilla gamepack

[UpdateMappings](src/main/java/net/runelite/deob/updater/UpdateMappings.java) - Refactors the deobfuscated gamepack using runescape-client

Usage:

deob - run with command line argument of obfuscated gamepack, then output jar. Example:

`Deob gamepack-170.jar deob-170.jar`

updatemappings - run with command line argument of current revision gamepack, current runescape-client.jar, then output jar. Example:

`UpdateMappings deob-170.jar runescape-client.jar Refactored-170.jar`

