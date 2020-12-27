/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="oa")
public class class221 {
    @ObfuscatedName(value="ae")
    public static String method6978(long l) {
        if (l > 0L) {
            if (l >= 6582952005840035281L) {
                return null;
            }
            if (l % 37L == 0L) {
                return null;
            }
            int n = 0;
            long l2 = l;
            while (true) {
                if (l2 != 0L) {
                    ++n;
                } else {
                    CharSequence charSequence = new StringBuilder(n);
                    while (true) {
                        if (0L == l) {
                            charSequence = ((StringBuilder)charSequence).reverse().toString();
                            return charSequence;
                        }
                        l2 = l / 37L;
                        ((StringBuilder)charSequence).append(class178.base37Table[(int)(l - l2 * 37L)]);
                        l = l2;
                    }
                }
                l2 /= 37L;
            }
        }
        return null;
    }
}

