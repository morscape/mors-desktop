/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jp")
@Implements(value="TileItem")
public final class TileItem
extends Entity {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-800565677)
    int field7614;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1433895037)
    @Export(value="id")
    public int id;

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        Model model = class324.ItemDefinition_get(this.id).method13081(this.field7614, 2130903521);
        return model;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)[Lek;")
    static class384[] method14481(int n) {
        class384[] arrclass384 = new class384[class82.field2625];
        class95.method4850(-1681572643);
        n = 0;
        block0: while (true) {
            if (n >= class82.field2625) {
                class146.method6035();
                return arrclass384;
            }
            class384 class3842 = new class384();
            arrclass384[n] = class3842;
            class3842.field7130 = class82.field2623;
            class3842.field7128 = class82.field2624;
            class3842.field7131 = class183.field3837[n];
            class3842.field7126 = class0.field1[n];
            class3842.field7125 = class82.field2627[n];
            class3842.field7127 = ItemContainer.field6849[n];
            int n2 = class3842.field7127 * class3842.field7125;
            byte[] arrby = class82.field2622[n];
            class3842.field7129 = new int[n2];
            int n3 = 0;
            while (true) {
                if (n3 >= n2) {
                    ++n;
                    continue block0;
                }
                class3842.field7129[n3] = class82.field2626[arrby[n3] & 0xFF];
                ++n3;
            }
            break;
        }
    }
}

