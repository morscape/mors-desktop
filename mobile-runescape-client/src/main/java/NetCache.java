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
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kl")
@Implements(value="NetCache")
public class NetCache {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1684352873)
    static int field3714 = 0;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="[Lkv;")
    @Export(value="NetCache_archives")
    static Archive[] NetCache_archives;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1890169313)
    static int field3719 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lnb;")
    @Export(value="NetCache_socket")
    static AbstractSocket NetCache_socket;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(longValue=-616812300205213511L)
    static long field3722 = 0L;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="NetCache_pendingPriorityWrites")
    static NodeHashTable NetCache_pendingPriorityWrites;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="NetCache_pendingWrites")
    static NodeHashTable NetCache_pendingWrites;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1547373955)
    @Export(value="NetCache_pendingWritesCount")
    static int NetCache_pendingWritesCount;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmi;")
    static Buffer field3727;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Lkr;")
    @Export(value="NetCache_currentResponse")
    static NetFileRequest NetCache_currentResponse;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lfs;")
    @Export(value="NetCache_pendingWritesQueue")
    static DualNodeDeque NetCache_pendingWritesQueue;
    @ObfuscatedName(value="ar")
    static boolean field3730;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1894803983)
    @Export(value="NetCache_loadTime")
    static int NetCache_loadTime;
    @ObfuscatedName(value="au")
    static byte field3733;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=410800167)
    static int field3734;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="NetCache_pendingResponses")
    static NodeHashTable NetCache_pendingResponses;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=1114547437)
    public static int field3737;
    @ObfuscatedName(value="ad")
    static CRC32 field3717;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-400066263)
    static int field3732;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=1122134477)
    public static int field3736;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="NetCache_pendingPriorityResponses")
    static NodeHashTable NetCache_pendingPriorityResponses;

    static {
        NetCache_pendingPriorityWrites = new NodeHashTable(4096);
        field3714 = 0;
        NetCache_pendingPriorityResponses = new NodeHashTable(32);
        field3719 = 0;
        NetCache_pendingWritesQueue = new DualNodeDeque();
        NetCache_pendingWrites = new NodeHashTable(4096);
        NetCache_pendingWritesCount = 0;
        NetCache_pendingResponses = new NodeHashTable(4096);
        field3734 = 0;
        field3727 = new Buffer(8);
        field3732 = 0;
        field3717 = new CRC32();
        NetCache_archives = new Archive[256];
        field3733 = 0;
        field3737 = 0;
        field3736 = 0;
    }
}

