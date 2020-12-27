/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="cf")
public class class37 {
    @ObfuscatedName(value="fd")
    static int[] field577;
    @ObfuscatedName(value="ix")
    @ObfuscatedGetter(intValue=1707322923)
    public static int field578;
    @ObfuscatedName(value="mi")
    @ObfuscatedGetter(intValue=1424655353)
    static int field579;

    @ObfuscatedName(value="bh")
    static void method1076(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13 = 256 - n11;
        n7 = -n7;
        n = n4;
        n4 = n3;
        n3 = n7;
        while (true) {
            if (n3 < 0) {
                n12 = n2;
            } else {
                return;
            }
            for (n7 = -n6; n7 < 0; ++n7) {
                int n14 = arrn2[n10 * (n4 >> 16) + (n12 >> 16)];
                if (n14 != 0) {
                    int n15 = arrn[n];
                    arrn[n] = (0xFF0000 & n11 * (0xFF00 & n14) + n13 * (n15 & 0xFF00)) + ((n15 & 0xFF00FF) * n13 + (n14 & 0xFF00FF) * n11 & 0xFF00FF00) >> 8;
                    ++n;
                } else {
                    ++n;
                }
                n12 += n8;
            }
            n4 += n9;
            ++n3;
            n += n5;
        }
    }

    @ObfuscatedName(value="bf")
    static void method1075(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, byte by) {
        int n10 = 255 - n8;
        n5 = -n5;
        n = n2;
        n2 = n3;
        n3 = n5;
        while (true) {
            if (n3 < 0) {
                n5 = -n4;
                by = (byte)n2;
                n2 = n;
            } else {
                return;
            }
            while (n5 < 0) {
                n = arrn2[n2];
                if (n != 0) {
                    arrn[by] = (((n9 & 0xFF00) * n10 & 0xFF0000 | (n9 & 0xFF00FF) * n10 & 0xFF00FF00) >>> 8) + (((n & 0xFF00) * n8 & 0xFF0000 | n8 * (n & 0xFF00FF) & 0xFF00FF00) >>> 8) | 0xFF000000;
                    n = by + 1;
                } else {
                    n = by + 1;
                }
                ++n5;
                ++n2;
                by = (byte)n;
            }
            n5 = by + n6;
            n = n2 + n7;
            ++n3;
            n2 = n5;
        }
    }

    @ObfuscatedName(value="da")
    static int method1077(int n, int n2, byte by) {
        by = (byte)(n2 - 334);
        if (by < 0) {
            n2 = 0;
        } else {
            n2 = by;
            if (by > 100) {
                n2 = 100;
            }
        }
        n = n * ((Client.field4964 - Client.field4975) * n2 / 100 + Client.field4975) / 256;
        return n;
    }
}

