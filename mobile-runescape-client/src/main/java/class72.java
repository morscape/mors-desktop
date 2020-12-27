/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  fj
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fj")
public abstract class class72 {
    @ObfuscatedName(value="gc")
    @ObfuscatedSignature(descriptor="Lek;")
    static class384 field2524;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1809380619)
    public int field2525;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1940809757)
    public int field2526 = 0;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1051510957)
    public int field2528 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1999785265)
    public int field2530 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1502346793)
    public int field2527;
    @ObfuscatedName(value="ak")
    public int[] field2529;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=30958821)
    public int field2531 = 0;

    class72(int n, int n2) {
        this(new int[n2 * n], n, n2);
    }

    class72(int[] arrn, int n, int n2) {
        this.method4243(arrn, n, n2);
    }

    @ObfuscatedName(value="aa")
    public abstract void vmethod10745(int var1, int var2, int var3, int var4, byte var5);

    @ObfuscatedName(value="ae")
    public abstract void vmethod10747(int var1);

    @ObfuscatedName(value="af")
    public abstract void vmethod10748(int var1, int var2, int var3, int var4, int var5, byte var6);

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Lek;IIII)V")
    public abstract void vmethod10749(class384 var1, int var2, int var3, int var4, int var5);

    @ObfuscatedName(value="ah")
    public abstract void vmethod10750(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    @ObfuscatedName(value="aj")
    public abstract void vmethod10752(int var1, int var2, int var3, int var4, int var5);

    @ObfuscatedName(value="al")
    abstract void vmethod10754(int var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="am")
    public abstract void vmethod10755(int var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lek;III)V")
    public abstract void vmethod10756(class384 var1, int var2, int var3, int var4);

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(Lei;III)V")
    public abstract void vmethod10757(IndexedSprite var1, int var2, int var3, int var4);

    @ObfuscatedName(value="aq")
    public abstract void vmethod10758(int var1, int var2, int var3, int var4, int var5);

    @ObfuscatedName(value="as")
    public abstract void vmethod10759(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, boolean var9, int var10);

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lek;III)V")
    public abstract void vmethod10761(class384 var1, int var2, int var3, int var4);

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lek;IIIII)V")
    public abstract void vmethod10763(class384 var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(Lek;IIIIIIB)V")
    abstract void vmethod10767(class384 var1, int var2, int var3, int var4, int var5, int var6, int var7, byte var8);

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(Lek;IIII)V")
    public abstract void vmethod10769(class384 var1, int var2, int var3, int var4, int var5);

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Lek;IIIIII)V")
    public abstract void vmethod10770(class384 var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(Lek;IIIIB)V")
    public abstract void vmethod10776(class384 var1, int var2, int var3, int var4, int var5, byte var6);

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lek;IIIIII[I[II)V")
    public abstract void vmethod10777(class384 var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8, int[] var9, int var10);

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Lek;IIIIIIII[I[II)V")
    public abstract void vmethod10778(class384 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int[] var10, int[] var11, int var12);

    @ObfuscatedName(value="fc")
    public final void method4238(int n, int n2, int n3, int n4, int n5) {
        n5 = n;
        if (n < 0) {
            n5 = 0;
        }
        n = n2;
        if (n2 < 0) {
            n = 0;
        }
        n2 = n3;
        if (n3 > this.field2525) {
            n2 = this.field2525;
        }
        n3 = n4;
        if (n4 > this.field2527) {
            n3 = this.field2527;
        }
        this.field2530 = n5;
        this.field2531 = n;
        this.field2528 = n2;
        this.field2526 = n3;
    }

    @ObfuscatedName(value="fe")
    @ObfuscatedSignature(descriptor="([IB)V", garbageValue="83")
    public final void method4240(int[] arrn) {
        this.field2530 = arrn[0];
        this.field2531 = arrn[1];
        this.field2528 = arrn[2];
        this.field2526 = arrn[3];
    }

    @ObfuscatedName(value="fg")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-1746615342")
    void method4241(int n, int n2, int n3) {
        if (n >= this.field2530 && n2 >= this.field2531 && n < this.field2528) {
            if (n2 < this.field2526) {
                this.field2529[n2 * this.field2525 + n] = n3;
                return;
            }
        } else {
            return;
        }
    }

    @ObfuscatedName(value="fi")
    @ObfuscatedSignature(descriptor="([IIII)V", garbageValue="-941880906")
    void method4243(int[] arrn, int n, int n2) {
        this.field2529 = arrn;
        this.field2525 = n;
        this.field2527 = n2;
        this.method4252();
    }

    @ObfuscatedName(value="fl")
    @ObfuscatedSignature(descriptor="([II)V", garbageValue="-2070192688")
    public final void method4245(int[] arrn) {
        arrn[0] = this.field2530;
        arrn[1] = this.field2531;
        arrn[2] = this.field2528;
        arrn[3] = this.field2526;
    }

    @ObfuscatedName(value="fm")
    public void method4246(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n3 > 0) {
            if (n4 <= 0) {
                return;
            }
            int n8 = 0;
            int n9 = 65536 / n4;
            int n10 = n;
            n7 = n3;
            if (n < this.field2530) {
                n7 = n3 - (this.field2530 - n);
                n10 = this.field2530;
            }
            int n11 = n2;
            n3 = n4;
            n = n8;
            if (n2 < this.field2531) {
                n = n9 * (this.field2531 - n2) + 0;
                n3 = n4 - (this.field2531 - n2);
                n11 = this.field2531;
            }
            n4 = n7;
            if (n10 + n7 > this.field2528) {
                n4 = this.field2528 - n10;
            }
            n2 = n3;
            if (n3 + n11 > this.field2526) {
                n2 = this.field2526 - n11;
            }
            n8 = this.field2525 * 1493422429;
            n3 = n10 + n11 * this.field2525;
            n7 = -n2;
            n2 = n3;
            block0: for (n3 = n7; n3 < 0; ++n3) {
                n10 = 65536 - n >> 8;
                n11 = n >> 8;
                n7 = -n4;
                while (true) {
                    if (n7 >= 0) {
                        n2 = n8 * -1809380619 - n4 + n2;
                        n = n9 + n;
                        continue block0;
                    }
                    this.field2529[n2] = (0xFF00FF00 & (0xFF00FF & n5) * n10 + (n6 & 0xFF00FF) * n11) + (0xFF0000 & n10 * (n5 & 0xFF00) + n11 * (n6 & 0xFF00)) >>> 8;
                    ++n7;
                    ++n2;
                }
            }
            return;
        }
    }

    @ObfuscatedName(value="fr")
    @ObfuscatedSignature(descriptor="(Lek;IIIII)V", garbageValue="-673189977")
    @Export(value="drawBackgroundCircle")
    public void drawBackgroundCircle(class384 class3842, int n, int n2, int n3, int n4) {
        this.vmethod10767(class3842, class3842.field7130 << 3, class3842.field7128 << 3, n << 4, n2 << 4, n3, n4, (byte)0);
    }

    @ObfuscatedName(value="fs")
    public final void method4251(int n, int n2, int n3, int[] arrn, int[] arrn2, int n4) {
        n2 = n2 * this.field2525 + n;
        n = 0;
        block0: while (n < arrn.length) {
            n4 = arrn[n] + n2;
            int n5 = -arrn2[n];
            while (true) {
                if (n5 >= 0) {
                    n4 = this.field2525 * 1493422429;
                    n2 = n4 * -1809380619 + n2;
                    ++n;
                    continue block0;
                }
                this.field2529[n4] = n3;
                ++n5;
                ++n4;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ft")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1299460002")
    public final void method4252() {
        this.field2530 = 0;
        this.field2531 = 0;
        this.field2528 = this.field2525;
        this.field2526 = this.field2527;
    }

    @ObfuscatedName(value="fu")
    @ObfuscatedSignature(descriptor="(IIIIIII)V", garbageValue="1245476095")
    public final void method4253(int n, int n2, int n3, int n4, int n5, int n6) {
        this.vmethod10754(n, n2, n3, n5, n6, -549687305);
        this.vmethod10754(n, n2 + n4 - 1, n3, n5, n6, 1567974748);
        if (n4 >= 3) {
            this.vmethod10746(n, ++n2, n4 -= 2, n5, n6, -876655305);
            this.vmethod10746(n3 + n - 1, n2, n4, n5, n6, -1272285183);
        }
    }

    @ObfuscatedName(value="fx")
    @ObfuscatedSignature(descriptor="(IIIIII)V", garbageValue="-529755467")
    public final void method4255(int n, int n2, int n3, int n4, int n5) {
        this.vmethod10752(n, n2, n3, n5, -2016519378);
        this.vmethod10752(n, n2 + n4 - 1, n3, n5, 940378513);
        this.vmethod10745(n, n2, n4, n5, (byte)34);
        this.vmethod10745(n3 + n - 1, n2, n4, n5, (byte)67);
    }

    @ObfuscatedName(value="ai")
    public abstract void vmethod10751(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2041539895")
    abstract void vmethod10753();

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lei;IIIII)V")
    public abstract void vmethod10760(IndexedSprite var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="ax")
    public abstract void vmethod10762(int var1, int var2, int var3, int var4, int var5, byte var6);

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Lek;IIIIB)V")
    public abstract void vmethod10766(class384 var1, int var2, int var3, int var4, int var5, byte var6);

    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="-50")
    public final void method4242(int n, int n2, int n3, int n4) {
        if (this.field2530 < n) {
            this.field2530 = n;
        }
        if (this.field2531 < n2) {
            this.field2531 = n2;
        }
        if (this.field2528 > n3) {
            this.field2528 = n3;
        }
        if (this.field2526 > n4) {
            this.field2526 = n4;
        }
    }

    @ObfuscatedName(value="ab")
    abstract void vmethod10746(int var1, int var2, int var3, int var4, int var5, int var6);

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Lek;IIIIIIDIB)V")
    public abstract void vmethod10771(class384 var1, int var2, int var3, int var4, int var5, int var6, int var7, double var8, int var10, byte var11);

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-57")
    static void method4136() {
        Login.currentLoginField = 1;
        WallDecoration.method863(Login.currentLoginField);
        Coord.method38(Login.currentLoginField);
    }

    @ObfuscatedName(value="ax")
    public static void method4137(byte[] arrby, byte by) {
        synchronized (fj.class) {
            block11: {
                block10: {
                    block9: {
                        block8: {
                            if (arrby.length != 100 || ByteArrayPool.field3895 * 996124317 >= 1000) break block8;
                            byte[][] arrby2 = ByteArrayPool.field3898;
                            by = (byte)(ByteArrayPool.field3895 - 2075390027);
                            ByteArrayPool.field3895 = by;
                            arrby2[by * 996124317 - 1] = arrby;
                            return;
                        }
                        if (arrby.length != 5000 || ByteArrayPool.ByteArrayPool_mediumCount >= 250) break block9;
                        byte[][] arrby3 = ByteArrayPool.ByteArrayPool_medium;
                        by = (byte)(ByteArrayPool.ByteArrayPool_mediumCount * 119939135 + 119939135);
                        ByteArrayPool.ByteArrayPool_mediumCount = by * 2059784127;
                        arrby3[by * 2059784127 - 1] = arrby;
                        return;
                    }
                    if (arrby.length != 30000 || ByteArrayPool.field3894 * -1102223469 >= 50) break block10;
                    byte[][] arrby4 = ByteArrayPool.field3897;
                    by = (byte)(ByteArrayPool.field3894 - 1253126501);
                    ByteArrayPool.field3894 = by;
                    arrby4[by * -1102223469 - 1] = arrby;
                    return;
                }
                if (ByteArrayPool.ByteArrayPool_arrays == null) break block11;
                by = 0;
                while (true) {
                    block12: {
                        if (by >= HealthBar.ByteArrayPool_alternativeSizes.length) break;
                        if (arrby.length != HealthBar.ByteArrayPool_alternativeSizes[by] || ByteArrayPool.ByteArrayPool_altSizeArrayCounts[by] >= ByteArrayPool.ByteArrayPool_arrays[by].length) break block12;
                        byte[][] arrby5 = ByteArrayPool.ByteArrayPool_arrays[by];
                        int[] arrn = ByteArrayPool.ByteArrayPool_altSizeArrayCounts;
                        int n = arrn[by];
                        arrn[by] = n + 1;
                        arrby5[n] = arrby;
                        return;
                    }
                    by = (byte)(by + 1);
                }
            }
            return;
        }
    }

    @ObfuscatedName(value="fo")
    @ObfuscatedSignature(descriptor="(IIIZZI)V", garbageValue="696161914")
    static final void method4139(int n, int n2, int n3, boolean bl, boolean bl2) {
        if (WorldMapIcon_1.loadInterface(n, -1452038673)) {
            class206.method6835(class79.Widget_interfaceComponents[n], -1, n2, n3, bl, bl2, (byte)39);
            return;
        }
    }
}

