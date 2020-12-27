/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jy")
public class class323
extends Node {
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1873418947)
    static int field6263;
    @ObfuscatedName(value="mm")
    @ObfuscatedSignature(descriptor="[Lax;")
    static Widget[] field6265;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lpk;")
    static NodeHashTable field6264;

    static {
        field6264 = new NodeHashTable(32);
    }

    @ObfuscatedName(value="aj")
    static final short method11428(int n, int n2) {
        n2 = ++n / 16;
        return (short)(n2 << 8 | n % 16);
    }

    @ObfuscatedName(value="ak")
    static int method11429(byte[] arrby, int n, int n2, int n3) {
        n3 = -1;
        while (n < n2) {
            int n4 = Buffer.crc32Table[(n3 ^ arrby[n]) & 0xFF];
            n3 = n4 ^ n3 >>> 8;
            ++n;
        }
        return n3;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="286625630")
    static void method11430() {
        Tiles.field3459 = 99;
        Tiles.field3468 = (byte[][][])Array.newInstance(Byte.TYPE, 4, 104, 104);
        Tiles.field3458 = (byte[][][])Array.newInstance(Byte.TYPE, 4, 104, 104);
        Tiles.field3464 = (byte[][][])Array.newInstance(Byte.TYPE, 4, 104, 104);
        Tiles.field3460 = (byte[][][])Array.newInstance(Byte.TYPE, 4, 104, 104);
        class251.field4323 = (int[][][])Array.newInstance(Integer.TYPE, 4, 105, 105);
        AccessFile.field4029 = (byte[][][])Array.newInstance(Byte.TYPE, 4, 105, 105);
        class256.field4353 = (int[][])Array.newInstance(Integer.TYPE, 105, 105);
        class88.field2663 = new int[104];
        Tiles.field3456 = new int[104];
        Tiles.field3463 = new int[104];
        BoundaryObject.field441 = new int[104];
        class97.field2748 = new int[104];
    }
}

