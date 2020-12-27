/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jb")
public class class131 {
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lkc;IIIZB)V", garbageValue="2")
    public static void method5631(AbstractArchive abstractArchive, int n, int n2, int n3, boolean bl) {
        class167.musicPlayerStatus = 1;
        class167.musicTrackArchive = abstractArchive;
        class90.musicTrackGroupId = n;
        class87.musicTrackFileId = n2;
        FloorDecoration.musicTrackVolume = n3;
        class167.musicTrackBoolean = bl;
        class227.pcmSampleLength = 10000;
    }
}

