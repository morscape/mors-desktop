/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fw")
public class class82 {
    @ObfuscatedName(value="aa")
    static byte[][] field2622;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-918633311)
    static int field2623 = 0;
    @ObfuscatedName(value="al")
    static int[] field2626;
    @ObfuscatedName(value="as")
    static int[] field2627;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lmi;")
    static Buffer field2629;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-958527689)
    static int field2624 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1835683965)
    static int field2625 = 0;

    @ObfuscatedName(value="be")
    static final int method4599(int n, int n2, byte by) {
        by = (byte)((n & 0x7F) * n2 >> 7);
        if (by < 2) {
            n2 = 2;
        } else {
            n2 = by;
            if (by > 126) {
                n2 = 126;
            }
        }
        return (n & 0xFF80) + n2;
    }
}

