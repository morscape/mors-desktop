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

@ObfuscatedName(value="jt")
public class class147
implements Comparable {
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=864300001)
    int field3616;

    class147(int n, String string2) {
        this.field3616 = n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljt;B)I")
    int method6052(class147 class1472, byte by) {
        by = (byte)(this.field3616 * -520005599);
        int n = class1472.field3616 * -520005599;
        return by * 864300001 - n * 864300001;
    }

    public int compareTo(Object object) {
        int n = this.method6052((class147)object, (byte)1);
        return n;
    }
}

