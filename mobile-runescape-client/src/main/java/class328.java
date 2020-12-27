/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kj")
public class class328
extends class64 {
    @ObfuscatedName(value="ae")
    final boolean field6287;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lep;Lep;I)I")
    int method11475(class289 class2892, class289 class2893, int n) {
        if (class2893.field5972 != class2892.field5972) {
            if (this.field6287) {
                return class2892.field5972 - class2893.field5972;
            }
            return class2893.field5972 - class2892.field5972;
        }
        n = this.method4020(class2892, class2893, -1473396260);
        return n;
    }

    public int compare(Object object, Object object2) {
        int n = this.method11475((class289)object, (class289)object2, -2131422441);
        return n;
    }
}

