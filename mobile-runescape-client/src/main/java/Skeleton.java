/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="bu")
@Implements(value="Skeleton")
public class Skeleton
extends Node {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-623221721)
    static int field4648 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-694079555)
    int field4651;
    @ObfuscatedName(value="ah")
    int[] field4652;
    @ObfuscatedName(value="as")
    int[] field4655;
    @ObfuscatedName(value="ai")
    int[] field4653;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=2116074375)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ax")
    int[][] field4656;

    Skeleton(int n, byte[] object) {
        this.id = n;
        object = new Buffer((byte[])object);
        this.field4651 = ((Buffer)object).method11650(1733280111);
        this.field4653 = new int[this.field4651];
        this.field4656 = new int[this.field4651][];
        this.field4652 = new int[this.field4651 * 256];
        this.field4655 = new int[this.field4651];
        int n2 = 0;
        n = 0;
        while (true) {
            if (n >= this.field4651) {
                n = 0;
                while (true) {
                    if (n >= this.field4651) {
                        n = 0;
                        block2: while (true) {
                            int n3 = n2;
                            if (n >= this.field4651) {
                                while (true) {
                                    if (n3 >= this.field4651) {
                                        return;
                                    }
                                    this.field4655[n3] = this.field4656[n3].length;
                                    ++n3;
                                }
                            }
                            n3 = 0;
                            while (true) {
                                if (n3 >= this.field4656[n].length) {
                                    ++n;
                                    continue block2;
                                }
                                int[] arrn = this.field4652;
                                int[] arrn2 = this.field4656[n];
                                int n4 = ((Buffer)object).method11650(-1991721190);
                                arrn2[n3] = n4;
                                arrn[n3 + n * 256] = n4;
                                ++n3;
                            }
                            break;
                        }
                    }
                    this.field4656[n] = new int[((Buffer)object).method11650(-1316428373)];
                    ++n;
                }
            }
            this.field4653[n] = ((Buffer)object).method11650(-1068107545);
            ++n;
        }
    }

    @ObfuscatedName(value="ad")
    static void method7716(int[] arrn, byte[] arrby, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        n10 = -n6;
        n6 = n2;
        n2 = n3;
        n3 = n10;
        while (true) {
            int n11;
            if (n3 < 0) {
                n11 = n;
            } else {
                return;
            }
            for (n10 = -n5; n10 < 0; ++n10) {
                byte by = arrby[n9 * (n6 >> 16) + (n11 >> 16)];
                if (by != 0) {
                    arrn[n2] = arrn2[by & 0xFF];
                    ++n2;
                } else {
                    ++n2;
                }
                n11 += n7;
            }
            n6 = n8 + n6;
            ++n3;
            n2 += n4;
        }
    }
}

