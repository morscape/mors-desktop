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

@ObfuscatedName(value="nu")
@Implements(value="GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator
implements Comparator {
    GrandExchangeOfferNameComparator() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lnm;Lnm;I)I")
    int method6924(class210 class2102, class210 class2103, int n) {
        n = class2102.method6889().compareTo(class2103.method6889());
        return n;
    }

    @Export(value="compare_bridged")
    @ObfuscatedName(value="compare")
    public int compare_bridged(Object object, Object object2) {
        int n = this.method6924((class210)object, (class210)object2, -1111841792);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }
}

