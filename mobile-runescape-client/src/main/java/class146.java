/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="js")
public class class146
implements Comparator {
    @ObfuscatedName(value="jo")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field3612;
    @ObfuscatedName(value="ak")
    final boolean field3613;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Len;Len;I)I")
    int method6042(class61 class612, class61 class613, int n) {
        if (this.field3613) {
            return class612.method3910().method3888(class613.method3910(), (byte)-22);
        }
        n = class613.method3910().method3888(class612.method3910(), (byte)-6);
        return n;
    }

    public int compare(Object object, Object object2) {
        int n = this.method6042((class61)object, (class61)object2, 1443261924);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    static void method6035() {
        class183.field3837 = null;
        class0.field1 = null;
        class82.field2627 = null;
        ItemContainer.field6849 = null;
        class82.field2626 = null;
        class82.field2622 = null;
    }
}

