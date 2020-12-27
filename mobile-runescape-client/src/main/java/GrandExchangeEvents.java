/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="nw")
@Implements(value="GrandExchangeEvents")
public class GrandExchangeEvents {
    @ObfuscatedName(value="ae")
    @Export(value="GrandExchangeEvents_ageComparator")
    public static Comparator GrandExchangeEvents_ageComparator = new UserComparator4();
    @ObfuscatedName(value="ah")
    @Export(value="GrandExchangeEvents_quantityComparator")
    public static Comparator GrandExchangeEvents_quantityComparator;
    @ObfuscatedName(value="ai")
    @Export(value="GrandExchangeEvents_priceComparator")
    public static Comparator GrandExchangeEvents_priceComparator;
    @ObfuscatedName(value="ax")
    @Export(value="GrandExchangeEvents_nameComparator")
    public static Comparator GrandExchangeEvents_nameComparator;

    static {
        new GrandExchangeOfferWorldComparator();
        GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
        GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
        GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
    }
}

