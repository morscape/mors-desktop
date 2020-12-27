/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kb")
@Implements(value="ArchiveDiskAction")
public class ArchiveDiskAction
extends Node {
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="Widget_fontsArchive")
    static AbstractArchive Widget_fontsArchive;
    @ObfuscatedName(value="ae")
    @Export(value="data")
    byte[] data;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lny;")
    @Export(value="archiveDisk")
    ArchiveDisk archiveDisk;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=116491315)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lkv;")
    @Export(value="archive")
    Archive archive;

    ArchiveDiskAction() {
    }
}

