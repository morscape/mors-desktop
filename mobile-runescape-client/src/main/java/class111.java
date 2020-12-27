/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import java.lang.reflect.Array;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="hp")
public class class111 {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=886953337)
    int field3283;
    @ObfuscatedName(value="as")
    int[][] field3284;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1449174437)
    int field3285;

    public class111(int n, int n2) {
        if (n2 == n) {
            return;
        }
        int n3 = WorldMapScaleHandler.method1021(n, n2, (byte)120);
        int n4 = n / n3;
        int n5 = n2 / n3;
        this.field3285 = n4;
        this.field3283 = n5;
        this.field3284 = (int[][])Array.newInstance(Integer.TYPE, n4, 14);
        n2 = 0;
        while (n2 < n4) {
            int n6;
            int[] arrn = this.field3284[n2];
            double d = n2;
            double d2 = n4;
            double d3 = d / d2 + 6.0;
            n = n3 = (int)Math.floor(d3 - 7.0 + 1.0);
            if (n3 < 0) {
                n = 0;
            }
            n3 = n6 = (int)Math.ceil(7.0 + d3);
            if (n6 > 14) {
                n3 = 14;
            }
            d = (double)n5 / d2;
            while (n < n3) {
                double d4 = (double)n - d3;
                d2 = Math.PI * d4;
                d2 = !(d2 < -1.0E-4) && !(d2 > 1.0E-4) ? d : d * (Math.sin(d2) / d2);
                arrn[n] = (int)Math.floor(d2 * (Math.cos(d4 * 0.2243994752564138) * 0.46 + 0.54) * 65536.0 + 0.5);
                ++n;
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ae")
    int method5133(int n, int n2) {
        n2 = n;
        if (this.field3284 != null) {
            long l = (long)n * (long)this.field3283 / (long)this.field3285;
            n2 = (int)l;
        }
        return n2;
    }

    @ObfuscatedName(value="ai")
    int method5135(int n, byte by) {
        by = (byte)n;
        if (this.field3284 != null) {
            long l = (long)n * (long)this.field3283 / (long)this.field3285;
            by = (byte)((int)l + 6);
        }
        return by;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    byte[] method5137(byte[] arrby, short s) {
        void var10_7;
        byte[] arrby2 = arrby;
        if (this.field3284 == null) return var10_7;
        int n = (int)((long)arrby.length * (long)this.field3283 / (long)this.field3285) + 14;
        int[] arrn = new int[n];
        short s2 = 0;
        s = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            if (s >= arrby.length) {
                arrby = new byte[n];
                s = s2;
                while (true) {
                    byte[] arrby3 = arrby;
                    if (s >= n) return var10_7;
                    n3 = arrn[s] + 32768 >> 16;
                    arrby[s] = n3 < -128 ? -128 : (n3 > 127 ? 127 : (byte)n3);
                    s = (short)(s + 1);
                }
            }
            byte by = arrby[s];
            int[] arrn2 = this.field3284[n2];
            for (n4 = 0; n4 < 14; ++n4) {
                int n5 = n4 + n3;
                arrn[n5] = by * arrn2[n4] + arrn[n5];
            }
            n4 = (n2 += this.field3283) / this.field3285;
            n3 += n4;
            n2 -= n4 * this.field3285;
            s = (short)(s + 1);
        }
    }
}

