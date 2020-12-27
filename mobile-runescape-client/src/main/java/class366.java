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

@ObfuscatedName(value="da")
public class class366
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6802;
    @ObfuscatedName(value="jm")
    @ObfuscatedSignature(descriptor="Lcg;")
    static TextureProvider field6810;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6804;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6805;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6807;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=730401613)
    public int field6814;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=2140324645)
    int field6817;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=472313221)
    int field6818;
    @ObfuscatedName(value="aq")
    public int field6819;
    @ObfuscatedName(value="aw")
    public int field6820;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-204565917)
    public int field6821;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1996066727)
    public int field6813;

    static {
        field6804 = new EvictingDualNodeHashTable(64, null);
        field6807 = new EvictingDualNodeHashTable(64, null);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Lek;", garbageValue="-1322856588")
    public class384 method12782() {
        if (this.field6817 >= 0) {
            class384 class3842 = (class384)field6807.get(this.field6817);
            if (class3842 != null) {
                return class3842;
            }
            class3842 = class171.method6496(field6802, this.field6817, 0);
            if (class3842 != null) {
                field6807.put(class3842, this.field6817);
            }
            return class3842;
        }
        return null;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Lek;", garbageValue="-1155132956")
    public class384 method12787() {
        if (this.field6818 >= 0) {
            class384 class3842 = (class384)field6807.get(this.field6818);
            if (class3842 != null) {
                return class3842;
            }
            class3842 = class171.method6496(field6802, this.field6818, 0);
            if (class3842 != null) {
                field6807.put(class3842, this.field6818);
            }
            return class3842;
        }
        return null;
    }

    @ObfuscatedName(value="dn")
    static void method12780(short s) {
        int n = Players.Players_count;
        int[] arrn = Players.Players_indices;
        s = 0;
        while (s < n * 527068741) {
            if (arrn[s] != Client.field4874 && arrn[s] != Client.field4858) {
                Messages.method6082(Client.field4859[arrn[s]], true, (byte)86);
            }
            s = (short)(s + 1);
        }
        return;
    }
}

