/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iq")
public class class127
implements Comparator {
    @ObfuscatedName(value="tq")
    @ObfuscatedGetter(intValue=891168689)
    public static int field3441;
    @ObfuscatedName(value="ak")
    boolean field3442;

    class127() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lnm;Lnm;I)I")
    int method5545(class210 class2102, class210 class2103, int n) {
        block4: {
            block6: {
                block7: {
                    int n2;
                    int n3;
                    block5: {
                        if (class2103.field3980 * -770009555 == class2102.field3980 * -770009555) break block4;
                        boolean bl = this.field3442;
                        n = 1;
                        if (!bl) break block5;
                        if (class2102.field3980 * -770009555 == Client.field4741) break block6;
                        if (class2103.field3980 * -770009555 == Client.field4741) break block7;
                    }
                    if ((n3 = class2102.field3980) * -770009555 < (n2 = class2103.field3980) * -770009555) {
                        n = -1;
                    }
                    return n;
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public int compare(Object object, Object object2) {
        int n = this.method5545((class210)object, (class210)object2, -2012997342);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @ObfuscatedName(value="af")
    public static int method5538(String string2, short s) {
        s = (short)string2.length();
        return s + 1;
    }
}

