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

@ObfuscatedName(value="kr")
@Implements(value="NetFileRequest")
public class NetFileRequest
extends DualNode {
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Llm;")
    @Export(value="musicTrack")
    static MusicTrack musicTrack;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1568566659)
    @Export(value="crc")
    int crc;
    @ObfuscatedName(value="ai")
    @Export(value="padding")
    byte padding;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkv;")
    @Export(value="archive")
    Archive archive;

    NetFileRequest() {
    }
}

