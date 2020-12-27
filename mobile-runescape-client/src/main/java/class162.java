/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="kz")
public final class class162 {
    @ObfuscatedName(value="ak")
    public static void method6379(int[] arrn, int[] arrn2, short s) {
        if (arrn != null && arrn2 != null) {
            HealthBar.ByteArrayPool_alternativeSizes = arrn;
            ByteArrayPool.ByteArrayPool_altSizeArrayCounts = new int[arrn.length];
            ByteArrayPool.ByteArrayPool_arrays = new byte[arrn.length][][];
            s = 0;
            while (true) {
                if (s >= HealthBar.ByteArrayPool_alternativeSizes.length) {
                    return;
                }
                ByteArrayPool.ByteArrayPool_arrays[s] = new byte[arrn2[s]][];
                s = (short)(s + 1);
            }
        }
        HealthBar.ByteArrayPool_alternativeSizes = null;
        ByteArrayPool.ByteArrayPool_altSizeArrayCounts = null;
        ByteArrayPool.ByteArrayPool_arrays = null;
    }
}

