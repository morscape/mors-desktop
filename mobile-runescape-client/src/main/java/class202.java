/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="nd")
public class class202 {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1502066527)
    int field3935 = 0;
    @ObfuscatedName(value="ak")
    String[] field3936;

    public class202(String[] arrstring) {
        this.field3936 = arrstring;
    }

    @ObfuscatedName(value="ae")
    public String[] method6794(int n) {
        while (this.field3935 * -1 < this.field3936.length) {
            Object object = this.field3936;
            n = this.field3935 * 460088479 - 460088479;
            this.field3935 = n * 1502066527;
            String string2 = object[n * -1502066527 - 1].trim();
            if (string2.startsWith("#") || string2.startsWith("//") || string2.length() == 0) continue;
            if (string2.startsWith("[") && string2.endsWith("]")) {
                ++this.field3935;
            } else {
                n = string2.indexOf(61);
                if (n == -1) continue;
                object = string2.substring(0, n).trim();
                string2 = string2.substring(n + 1).trim();
                return new String[]{object, string2};
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="ak")
    public String method6798(int n) {
        while (this.field3935 * -1 < this.field3936.length) {
            Object object = this.field3936;
            n = this.field3935 * 460088479 - 460088479;
            this.field3935 = n * 1502066527;
            if (!((String)(object = object[n * -1502066527 - 1].trim())).startsWith("[") || !((String)object).endsWith("]")) continue;
            object = ((String)object).substring(1, ((String)object).length() - 1).trim();
            return object;
        }
        return null;
    }
}

