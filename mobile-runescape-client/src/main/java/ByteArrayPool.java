/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  mu
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="mu")
@Implements(value="ByteArrayPool")
public class ByteArrayPool {
    @ObfuscatedName(value="aa")
    @Export(value="ByteArrayPool_arrays")
    static byte[][][] ByteArrayPool_arrays;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2059784127)
    @Export(value="ByteArrayPool_mediumCount")
    static int ByteArrayPool_mediumCount;
    @ObfuscatedName(value="ah")
    @Export(value="ByteArrayPool_medium")
    static byte[][] ByteArrayPool_medium;
    @ObfuscatedName(value="al")
    @Export(value="ByteArrayPool_altSizeArrayCounts")
    static int[] ByteArrayPool_altSizeArrayCounts;
    @ObfuscatedName(value="as")
    static byte[][] field3897;
    @ObfuscatedName(value="ai")
    static int field3894;
    @ObfuscatedName(value="ak")
    static int field3895;
    @ObfuscatedName(value="ax")
    static byte[][] field3898;
    @ObfuscatedName(value="ab")
    public static short[][] field3891;

    static {
        field3898 = new byte[1000][];
        ByteArrayPool_medium = new byte[250][];
        field3897 = new byte[50][];
    }

    @ObfuscatedName(value="ae")
    static byte[] method6713(int n, boolean bl, int n2) {
        synchronized (mu.class) {
            Object object;
            block28: {
                block27: {
                    block26: {
                        block25: {
                            if (n != 100) {
                                if (n < 100) {
                                    // empty if block
                                }
                            } else {
                                if (field3895 * 996124317 <= 0) break block25;
                                object = field3898;
                                field3895 = n = field3895 + 2075390027;
                                object = object[n * 996124317];
                                ByteArrayPool.field3898[ByteArrayPool.field3895 * 996124317] = null;
                                return object;
                            }
                        }
                        if (n != 5000) {
                            if (n < 5000) {
                                // empty if block
                            }
                        } else {
                            if (ByteArrayPool_mediumCount <= 0) break block26;
                            object = ByteArrayPool_medium;
                            n = ByteArrayPool_mediumCount * 119939135 - 119939135;
                            ByteArrayPool_mediumCount = n * 2059784127;
                            object = object[n * 2059784127];
                            ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
                            return object;
                        }
                    }
                    if (n != 30000) {
                        if (n < 30000) {
                            // empty if block
                        }
                    } else {
                        if (field3894 * -1102223469 <= 0) break block27;
                        object = field3897;
                        field3894 = n = field3894 + 1253126501;
                        object = object[n * -1102223469];
                        ByteArrayPool.field3897[ByteArrayPool.field3894 * -1102223469] = null;
                        return object;
                    }
                }
                object = ByteArrayPool_arrays;
                boolean bl2 = false;
                if (object == null) break block28;
                n2 = 0;
                while (true) {
                    block29: {
                        if (n2 >= HealthBar.ByteArrayPool_alternativeSizes.length) break;
                        if (n != HealthBar.ByteArrayPool_alternativeSizes[n2]) {
                            if (n < HealthBar.ByteArrayPool_alternativeSizes[n2]) {
                                // empty if block
                            }
                            break block29;
                        }
                        if (ByteArrayPool_altSizeArrayCounts[n2] <= 0) break block29;
                        object = ByteArrayPool_arrays[n2];
                        int[] arrn = ByteArrayPool_altSizeArrayCounts;
                        arrn[n2] = n = arrn[n2] - 1;
                        object = object[n];
                        ByteArrayPool.ByteArrayPool_arrays[n2][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[n2]] = null;
                        return object;
                    }
                    ++n2;
                }
            }
            object = new byte[n];
            return object;
            finally {
            }
        }
    }
}

