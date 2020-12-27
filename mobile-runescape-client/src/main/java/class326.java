/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kd")
public class class326
extends class64 {
    @ObfuscatedName(value="cr")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field6282;
    @ObfuscatedName(value="ae")
    final boolean field6284;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lep;Lep;I)I")
    int method11461(class289 class2892, class289 class2893, int n) {
        if (class2892.field5972 == 0) {
            if (class2893.field5972 == 0) return this.method4020(class2892, class2893, -1473396260);
            if (!this.field6284) return -1;
            return 1;
        }
        if (class2893.field5972 != 0) return this.method4020(class2892, class2893, -1473396260);
        if (!this.field6284) return 1;
        return -1;
    }

    public int compare(Object object, Object object2) {
        int n = this.method11461((class289)object, (class289)object2, -727305967);
        return n;
    }
}

