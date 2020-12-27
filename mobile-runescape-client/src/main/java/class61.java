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

@ObfuscatedName(value="en")
public class class61
implements Comparable {
    @ObfuscatedName(value="di")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field2439;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lef;")
    Username field2442;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Len;I)I")
    public int vmethod13338(class61 class612, int n) {
        n = this.field2442.method3888(class612.field2442, (byte)-27);
        return n;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Lef;", garbageValue="1832740397")
    public Username method3910() {
        Username username = this.field2442;
        return username;
    }

    @ObfuscatedName(value="compareTo")
    @Export(value="compareTo_user")
    public int compareTo_user(Object object) {
        int n = this.vmethod13338((class61)object, -152935257);
        return n;
    }
}

