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

@ObfuscatedName(value="aq")
public class class12 {
    @ObfuscatedName(value="cg")
    @ObfuscatedGetter(longValue=5442729073549109637L)
    static long field273;
    @ObfuscatedName(value="oi")
    @ObfuscatedSignature(descriptor="Lek;")
    static class384 field274;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=480455015)
    final int field275;
    @ObfuscatedName(value="al")
    final String field276;

    public class12(String string2, int n) {
        this.field276 = string2;
        this.field275 = n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;II)Lll;", garbageValue="399626016")
    static MusicPatch method289(AbstractArchive object, int n) {
        if ((object = (Object)((AbstractArchive)object).takeFileFlat(n)) == null) {
            return null;
        }
        object = new MusicPatch((byte[])object);
        return object;
    }
}

