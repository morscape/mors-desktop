/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kq")
public class class332
extends class64 {
    @ObfuscatedName(value="ae")
    final boolean field6300;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lep;Lep;B)I")
    int method11509(class289 class2892, class289 class2893, byte by) {
        if (Client.field4741 != class2892.field5972) {
            if (class2893.field5972 != Client.field4741) return (byte)this.method4020(class2892, class2893, -1473396260);
            if (!this.field6300) return -1;
            return 1;
        }
        if (class2893.field5972 == Client.field4741) return (byte)this.method4020(class2892, class2893, -1473396260);
        if (!this.field6300) return 1;
        return -1;
    }

    public int compare(Object object, Object object2) {
        int n = this.method11509((class289)object, (class289)object2, (byte)122);
        return n;
    }
}

