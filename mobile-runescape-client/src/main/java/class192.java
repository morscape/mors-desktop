/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="mq")
public class class192 {
    @ObfuscatedName(value="ab")
    @Export(value="clearIntArray")
    public static void clearIntArray(int[] arrn, int n, int n2) {
        n2 = n2 + n - 7;
        while (n < n2) {
            int n3 = n + 1;
            arrn[n] = 0;
            n = n3 + 1;
            arrn[n3] = 0;
            n3 = n + 1;
            arrn[n] = 0;
            n = n3 + 1;
            arrn[n3] = 0;
            n3 = n + 1;
            arrn[n] = 0;
            n = n3 + 1;
            arrn[n3] = 0;
            n3 = n + 1;
            arrn[n] = 0;
            n = n3 + 1;
            arrn[n3] = 0;
        }
        while (n < n2 + 7) {
            arrn[n] = 0;
            ++n;
        }
    }
}

