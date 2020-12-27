/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="no")
public class class212 {
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field3988;

    @ObfuscatedName(value="ar")
    @Export(value="Sprite_drawTransparent")
    static void Sprite_drawTransparent(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        n8 = -(n4 >> 2);
        int n9 = -(n4 & 3);
        n4 = -n5;
        while (true) {
            if (n4 < 0) {
                n = n3;
            } else {
                return;
            }
            for (n3 = n8; n3 < 0; ++n3) {
                n5 = n2 + 1;
                int n10 = arrn2[n2];
                if (n10 != 0) {
                    n2 = n + 1;
                    arrn[n] = n10;
                    n = n2;
                } else {
                    ++n;
                }
                n10 = n5 + 1;
                n5 = arrn2[n5];
                if (n5 != 0) {
                    n2 = n + 1;
                    arrn[n] = n5;
                    n = n2;
                } else {
                    ++n;
                }
                n5 = n10 + 1;
                n10 = arrn2[n10];
                if (n10 != 0) {
                    n2 = n + 1;
                    arrn[n] = n10;
                    n = n2;
                } else {
                    ++n;
                }
                n2 = n5 + 1;
                n5 = arrn2[n5];
                if (n5 != 0) {
                    arrn[n] = n5;
                    ++n;
                    continue;
                }
                ++n;
            }
            n3 = n9;
            while (n3 < 0) {
                n5 = arrn2[n2];
                if (n5 != 0) {
                    arrn[n] = n5;
                    ++n;
                } else {
                    ++n;
                }
                ++n3;
                ++n2;
            }
            ++n4;
            n3 = n + n6;
            n2 += n7;
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;B)Ljava/lang/String;", garbageValue="1")
    public static String method6894(CharSequence charSequence) {
        charSequence = Rasterizer3D.method614('*', charSequence.length(), -441697438);
        return charSequence;
    }
}

