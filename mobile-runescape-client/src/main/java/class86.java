/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gc")
public class class86 {
    @ObfuscatedName(value="aa")
    static int[] field2644;
    @ObfuscatedName(value="al")
    static int[] field2649;
    @ObfuscatedName(value="ai")
    static int[][] field2646;
    @ObfuscatedName(value="ax")
    static int[][] field2651;

    static {
        field2646 = (int[][])Array.newInstance(Integer.TYPE, 128, 128);
        field2651 = (int[][])Array.newInstance(Integer.TYPE, 128, 128);
        field2649 = new int[4096];
        field2644 = new int[4096];
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)[Lgm;", garbageValue="-2029720576")
    static class95[] method4752() {
        class95 class952 = class95.field2735;
        class95 class953 = class95.field2734;
        return new class95[]{class952, class953};
    }
}

