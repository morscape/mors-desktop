/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gf")
public class class88 {
    @ObfuscatedName(value="es")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field2669;
    @ObfuscatedName(value="gz")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field2670;
    @ObfuscatedName(value="ab")
    static int[] field2663;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)[Lei;")
    static IndexedSprite[] method4767(int n) {
        IndexedSprite[] arrindexedSprite = new IndexedSprite[class82.field2625];
        class95.method4850(-1681572643);
        n = 0;
        while (true) {
            if (n >= class82.field2625) {
                class146.method6035();
                return arrindexedSprite;
            }
            IndexedSprite indexedSprite = new IndexedSprite();
            arrindexedSprite[n] = indexedSprite;
            indexedSprite.field7120 = class82.field2623;
            indexedSprite.field7122 = class82.field2624;
            indexedSprite.field7118 = class183.field3837[n];
            indexedSprite.field7123 = class0.field1[n];
            indexedSprite.field7119 = class82.field2627[n];
            indexedSprite.field7124 = ItemContainer.field6849[n];
            indexedSprite.palette = class82.field2626;
            indexedSprite.field7121 = class82.field2622[n];
            ++n;
        }
    }

    @ObfuscatedName(value="ak")
    @Export(value="hslToRgb")
    public static int hslToRgb(int n, int n2, int n3) {
        n3 = n;
        n = 1;
        while (true) {
            int n4;
            if (n2 > 1) {
                n4 = n;
                if ((n2 & 1) != 0) {
                    n4 = n * n3;
                }
            } else {
                n4 = n;
                if (n2 == 1) {
                    n4 = n * n3;
                }
                return n4;
            }
            n3 *= n3;
            n2 >>= 1;
            n = n4;
        }
    }

    @ObfuscatedName(value="ax")
    public static int method4766(CharSequence charSequence, int n) {
        n = GraphicsObject.method14439(charSequence, 10, true, -410890393);
        return n;
    }
}

