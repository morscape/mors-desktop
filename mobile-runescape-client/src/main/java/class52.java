/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dn")
public class class52 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ldn;")
    static final class52 field2381;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1426058467)
    static int field2382 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Ldn;")
    static final class52 field2383;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1703354599)
    final int field2386;

    static {
        field2383 = new class52(0);
        field2381 = new class52(1);
    }

    class52(int n) {
        this.field2386 = n;
    }

    @ObfuscatedName(value="aj")
    static byte[] method3749(byte[] arrby, int n) {
        n = arrby.length;
        byte[] arrby2 = new byte[n];
        System.arraycopy(arrby, 0, arrby2, 0, n);
        return arrby2;
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(B)Lig;")
    static class122 method3752(byte by) {
        int n;
        class122 class1222 = new class122();
        class1222.field3403 = 88;
        class1222.field3399 = 19;
        class1222.field3401 = 7;
        class1222.field3406 = 24;
        do {
            by = (byte)(class1222.field3406 * 1655509289);
            n = class1222.field3401 * 1577077981;
            if ((class1222.field3401 - 1) * class1222.field3406 >= class121.field3385) {
                --class1222.field3401;
            }
            if ((class1222.field3406 - 1) * class1222.field3401 >= class121.field3385) {
                --class1222.field3406;
            }
            if ((class1222.field3406 - 1) * class1222.field3401 < class121.field3385) continue;
            --class1222.field3406;
        } while (class1222.field3406 != by * -1858462951 || n * -593040523 != class1222.field3401);
        class1222.field3400 = (765 - class1222.field3401 * class1222.field3403) / (class1222.field3401 + 1);
        if (class1222.field3400 > 5) {
            class1222.field3400 = 5;
        }
        class1222.field3405 = (480 - class1222.field3406 * class1222.field3399) / (class1222.field3406 + 1);
        if (class1222.field3405 > 5) {
            class1222.field3405 = 5;
        }
        class1222.field3402 = (765 - class1222.field3403 * class1222.field3401 - (class1222.field3401 - 1) * class1222.field3400) / 2;
        class1222.field3404 = (class1222.field3400 + class1222.field3403) * class1222.field3401 + class1222.field3402 - class1222.field3400;
        class1222.field3398 = (480 - class1222.field3399 * class1222.field3406 - (class1222.field3406 - 1) * class1222.field3405) / 2;
        return class1222;
    }

    @ObfuscatedName(value="ak")
    @Export(value="sleepExact")
    public static final void sleepExact(long l) {
        if (l <= 0L) {
            return;
        }
        if (l % 10L != 0L) {
            class291.method10704(l);
            return;
        }
        class291.method10704(l - 1L);
        class291.method10704(1L);
    }
}

