/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ln")
public class class171 {
    @ObfuscatedName(value="ak")
    static int[] field3787;

    static {
        new Object();
        field3787 = new int[33];
        class171.field3787[0] = 0;
        int n = 2;
        for (int i = 1; i < 33; ++i) {
            class171.field3787[i] = n - 1;
            n += n;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lkc;IIB)Lek;", garbageValue="37")
    public static class384 method6496(AbstractArchive object, int n, int n2) {
        if (class287.method10622((AbstractArchive)object, n, n2)) {
            object = class152.method6234(1492008291);
            return object;
        }
        return null;
    }
}

