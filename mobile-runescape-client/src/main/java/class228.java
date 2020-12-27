/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ok")
public class class228 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpc;")
    Bounds field4046;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-826311531)
    int field4047;
    @ObfuscatedName(value="ai")
    int[] field4048;
    @ObfuscatedName(value="ak")
    @Export(value="spriteMap")
    final HashMap spriteMap;
    @ObfuscatedName(value="ax")
    int[] field4050;

    @ObfuscatedName(value="ae")
    void method7009(int n, int n2) {
        int n3 = n * 2 + 1;
        double d = (float)n / 3.0f;
        Object object = class51.method3747(0.0, d, n, 604159894);
        d = object[n];
        double d2 = object[n];
        int[] arrn = new int[n3 * n3];
        n2 = 0;
        block0: for (int i = 0; i < n3; ++i) {
            int n4 = 0;
            while (true) {
                int n5;
                if (n4 >= n3) {
                    continue block0;
                }
                arrn[n4 + i * n3] = n5 = (int)(object[n4] * object[i] / (d * d2) * 256.0);
                int n6 = n2;
                if (n2 == 0) {
                    n6 = n2;
                    if (n5 > 0) {
                        n6 = 1;
                    }
                }
                ++n4;
                n2 = n6;
            }
        }
        object = new class384(arrn, n3, n3);
        this.spriteMap.put(n, object);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lek;Lek;Lpc;B)V")
    void method7014(class384 class3842, class384 class3843, Bounds bounds, byte by) {
        if (bounds.highX != 0) {
            if (bounds.highY != 0) {
                by = bounds.lowX == 0 ? (byte)(class3842.field7125 - bounds.highX) : (byte)0;
                int n = bounds.lowY == 0 ? class3842.field7127 - bounds.highY : 0;
                int n2 = class3842.field7125;
                int n3 = bounds.lowX + class3843.field7125 * bounds.lowY;
                by = (byte)(n * n2 + by);
                n2 = 0;
                n = n3;
                block0: while (true) {
                    if (n2 >= bounds.highY) {
                        return;
                    }
                    n3 = by;
                    int n4 = 0;
                    by = (byte)n;
                    n = n3;
                    n3 = n4;
                    while (true) {
                        if (n3 >= bounds.highX) {
                            n3 = class3843.field7125;
                            n4 = bounds.highX * -437494771;
                            n3 = by + (n3 - n4 * 350573253);
                            ++n2;
                            by = (byte)(n += class3842.field7125 - bounds.highX);
                            n = n3;
                            continue block0;
                        }
                        int[] arrn = class3843.field7129;
                        arrn[by] = arrn[by] + class3842.field7129[n];
                        ++n3;
                        by = (byte)(by + 1);
                        ++n;
                    }
                    break;
                }
            }
        } else {
            return;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IILek;FB)V")
    public final void method7021(int n, int n2, class384 class3842, float f, byte by) {
        int n3 = (int)(18.0f * f);
        class384 class3843 = this.method7013(n3);
        by = (byte)(n3 * 2 + 1);
        int n4 = class3842.field7125;
        int n5 = class3842.field7127;
        int n6 = 0;
        Bounds bounds = new Bounds(0, 0, n4, n5);
        Bounds bounds2 = new Bounds(0, 0);
        this.field4046.setHigh(by, by);
        System.nanoTime();
        by = 0;
        while (true) {
            if (by >= this.field4047) {
                System.nanoTime();
                System.nanoTime();
                n = n6;
                while (true) {
                    if (n < class3842.field7129.length) {
                        if (class3842.field7129[n] == 0) {
                            class3842.field7129[n] = -16777216;
                        } else {
                            by = (byte)((class3842.field7129[n] + 64 - 1) / 256);
                            if (by > 0) {
                                n2 = by;
                                if (by > class10.field245.length) {
                                    n2 = class10.field245.length;
                                }
                                n2 = class10.field245[n2 - 1];
                                class3842.field7129[n] = n2 | 0xFF000000;
                            } else {
                                class3842.field7129[n] = -16777216;
                            }
                        }
                    } else {
                        System.nanoTime();
                        return;
                    }
                    ++n;
                }
            }
            n5 = this.field4048[by];
            n4 = this.field4050[by];
            n5 = (int)((float)(n5 - n) * f);
            n4 = (int)((float)class3842.field7127 - (float)(n4 - n2) * f);
            this.field4046.setLow(n5 - n3, n4 - n3);
            this.field4046.method7142(bounds, bounds2);
            this.method7014(class3843, class3842, bounds2, (byte)-39);
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IB)Lek;", garbageValue="-105")
    class384 method7013(int n) {
        if (!this.spriteMap.containsKey(n)) {
            this.method7009(n, 888474569);
        }
        class384 class3842 = (class384)this.spriteMap.get(n);
        return class3842;
    }
}

