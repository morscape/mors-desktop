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

@ObfuscatedName(value="na")
@Implements(value="GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator
implements Comparator {
    GrandExchangeOfferWorldComparator() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lnm;Lnm;I)I")
    int method6744(class210 class2102, class210 class2103, int n) {
        if (class2102.field3980 * -770009555 >= class2103.field3980 * -770009555) {
            n = class2102.field3980;
            int n2 = class2103.field3980;
            if (n * -770009555 == n2 * -770009555) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    @Export(value="compare_bridged")
    @ObfuscatedName(value="compare")
    public int compare_bridged(Object object, Object object2) {
        int n = this.method6744((class210)object, (class210)object2, 253278723);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }
}

