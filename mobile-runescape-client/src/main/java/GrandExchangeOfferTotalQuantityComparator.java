/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nq")
@Implements(value="GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator
implements Comparator {
    @ObfuscatedName(value="aa")
    public static short[] field3994;
    @ObfuscatedName(value="aj")
    public static short[] field3995;

    GrandExchangeOfferTotalQuantityComparator() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lnm;Lnm;I)I")
    int method6906(class210 class2102, class210 class2103, int n) {
        if (class2102.field3979.field3965 * -796520247 >= class2103.field3979.field3965 * -796520247) {
            n = class2103.field3979.field3965;
            int n2 = class2102.field3979.field3965;
            if (n * -796520247 == n2 * -796520247) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    @Export(value="compare_bridged")
    @ObfuscatedName(value="compare")
    public int compare_bridged(Object object, Object object2) {
        int n = this.method6906((class210)object, (class210)object2, -1583707061);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }
}

