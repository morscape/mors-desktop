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

@ObfuscatedName(value="ol")
@Implements(value="GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator
implements Comparator {
    GrandExchangeOfferUnitPriceComparator() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lnm;Lnm;B)I")
    int method7034(class210 class2102, class210 class2103, byte by) {
        if (class2102.field3979.field3962 * 179024489 >= class2103.field3979.field3962 * 179024489) {
            by = (byte)class2103.field3979.field3962;
            int n = class2102.field3979.field3962;
            if (by * 179024489 == n * 179024489) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    @Export(value="compare_bridged")
    @ObfuscatedName(value="compare")
    public int compare_bridged(Object object, Object object2) {
        int n = this.method7034((class210)object, (class210)object2, (byte)14);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }
}

