/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="an")
public class class9 {
    @ObfuscatedName(value="ak")
    final boolean field79;

    public class9(boolean bl) {
        this.field79 = bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="479309649")
    public boolean method161() {
        boolean bl = this.field79;
        return bl;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-75")
    public static void method156() {
        if (NetCache.NetCache_socket != null) {
            NetCache.NetCache_socket.close();
        }
        NetCache.field3722 = 0L;
        NetCache.NetCache_loadTime = 0;
        NetCache.NetCache_pendingPriorityWrites = new NodeHashTable(4096);
        NetCache.field3714 = 0;
        NetCache.NetCache_pendingPriorityResponses = new NodeHashTable(32);
        NetCache.field3719 = 0;
        NetCache.NetCache_pendingWritesQueue = new DualNodeDeque();
        NetCache.NetCache_pendingWrites = new NodeHashTable(4096);
        NetCache.NetCache_pendingWritesCount = 0;
        NetCache.NetCache_pendingResponses = new NodeHashTable(4096);
        NetCache.field3734 = 0;
        NetCache.field3730 = false;
        NetCache.NetCache_currentResponse = null;
        NetCache.field3727 = new Buffer(8);
        class82.field2629 = null;
        NetCache.field3732 = 0;
        class189.NetCache_reference = null;
        NetCache.NetCache_archives = new Archive[256];
        NetCache.field3733 = 0;
        NetCache.field3737 = 0;
        NetCache.field3736 = 0;
    }
}

