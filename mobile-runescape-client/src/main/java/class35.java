/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ca")
public class class35 {
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(ILkc;IIIZI)V", garbageValue="1442552315")
    public static void method1014(int n, AbstractArchive abstractArchive, int n2, int n3, int n4, boolean bl) {
        class167.musicPlayerStatus = 1;
        class167.musicTrackArchive = abstractArchive;
        class90.musicTrackGroupId = n2;
        class87.musicTrackFileId = n3;
        FloorDecoration.musicTrackVolume = n4;
        class167.musicTrackBoolean = bl;
        class227.pcmSampleLength = n;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1486666578")
    static void method1015(int n, int n2) {
        long l = (n << 16) + n2;
        NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.get(l);
        if (netFileRequest == null) {
            return;
        }
        NetCache.NetCache_pendingWritesQueue.addLast(netFileRequest);
    }
}

