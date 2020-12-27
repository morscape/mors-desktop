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

@ObfuscatedName(value="kg")
public class class152
implements Comparator {
    @ObfuscatedName(value="ak")
    final boolean field3702;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lep;Lep;B)I")
    int method6240(class289 class2892, class289 class2893, byte by) {
        if (this.field3702) {
            return class2892.field5974 - class2893.field5974;
        }
        by = (byte)(class2893.field5974 * -1067211723);
        int n = class2892.field5974 * -1067211723;
        return by * 1933413917 - n * 1933413917;
    }

    public int compare(Object object, Object object2) {
        int n = this.method6240((class289)object, (class289)object2, (byte)-99);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)Lek;")
    static class384 method6234(int n) {
        class384 class3842 = new class384();
        class3842.field7130 = class82.field2623;
        class3842.field7128 = class82.field2624;
        class3842.field7131 = class183.field3837[0];
        class3842.field7126 = class0.field1[0];
        class3842.field7125 = class82.field2627[0];
        class3842.field7127 = ItemContainer.field6849[0];
        int n2 = class3842.field7127 * class3842.field7125;
        byte[] arrby = class82.field2622[0];
        class95.method4850(-1681572643);
        class3842.field7129 = new int[n2];
        n = 0;
        while (true) {
            if (n >= n2) {
                class146.method6035();
                return class3842;
            }
            class3842.field7129[n] = class82.field2626[arrby[n] & 0xFF];
            ++n;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="0")
    public static int method6233(int n) {
        --n;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        return (n | n >>> 16) + 1;
    }
}

