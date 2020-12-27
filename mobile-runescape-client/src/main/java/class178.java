/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="lv")
public final class class178 {
    @ObfuscatedName(value="ae")
    static long[] field3810;
    @ObfuscatedName(value="ak")
    @Export(value="base37Table")
    static final char[] base37Table;

    static {
        base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field3810 = new long[12];
        for (int i = 0; i < field3810.length; ++i) {
            class178.field3810[i] = (long)Math.pow(37.0, i);
        }
    }

    @ObfuscatedName(value="ae")
    public static boolean method6546(int n, int n2) {
        return n >= class301.field6058.field6074 && n <= class301.field6070.field6074 || n == (n2 = class301.field6055.field6074 * -1239373807) * -1053996815;
        {
        }
    }
}

