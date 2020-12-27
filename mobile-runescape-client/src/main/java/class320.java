/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jr")
public class class320
extends class64 {
    @ObfuscatedName(value="ae")
    final boolean field6258;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lep;Lep;I)I")
    int method11395(class289 class2892, class289 class2893, int n) {
        if (class2892.field5972 != 0 && class2893.field5972 != 0) {
            if (this.field6258) {
                return class2892.method3910().method3888(class2893.method3910(), (byte)-5);
            }
            return class2893.method3910().method3888(class2892.method3910(), (byte)-38);
        }
        n = this.method4020(class2892, class2893, -1473396260);
        return n;
    }

    public int compare(Object object, Object object2) {
        int n = this.method11395((class289)object, (class289)object2, 1282396321);
        return n;
    }
}

