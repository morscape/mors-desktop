/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fo")
public class class298
implements class77 {
    @ObfuscatedName(value="ff")
    static String field6041;
    @ObfuscatedName(value="dd")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field6040;

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(FI)F", garbageValue="214080798")
    public float vmethod10991(float f) {
        double d = f + 1.0f;
        d = Math.cos(d * Math.PI);
        return (float)(d / 2.0) + 0.5f;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(III[I[IIIIIIIIII)V", garbageValue="1344597451")
    static void method10981(int n, int n2, int n3, int[] arrn, int[] arrn2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        n2 = -n9;
        while (true) {
            if (n2 < 0) {
                n3 = -n8;
                n = n6;
            } else {
                return;
            }
            while (n3 < 0) {
                n6 = arrn2[n4];
                if (n6 != 0) {
                    n7 = arrn[n];
                    n5 = n7 + n6;
                    n6 = (n6 & 0xFF00FF) + (n7 & 0xFF00FF);
                    n6 = (n5 - n6 & 0x10000) + (n6 & 0x1000100);
                    arrn[n] = n6 - (n6 >>> 8) | n5 - n6;
                    ++n;
                } else {
                    ++n;
                }
                ++n3;
                ++n4;
            }
            n6 = n10 + n;
            n4 += n11;
            ++n2;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIIIIII)I", garbageValue="1820587787")
    public static int method10980(int n, int n2, int n3, int n4, int n5, int n6) {
        if ((n6 & 1) != 1) {
            n6 = n5;
            n5 = n4;
            n4 = n6;
        }
        if ((n3 &= 3) == 0) {
            return n;
        }
        if (n3 == 1) {
            return n2;
        }
        if (n3 == 2) {
            return 7 - n - (n5 - 1);
        }
        return 7 - n2 - (n4 - 1);
    }
}

