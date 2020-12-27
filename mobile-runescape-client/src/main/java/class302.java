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

@ObfuscatedName(value="gq")
public class class302
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lgq;")
    static final class302 field6075;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lgq;")
    static final class302 field6076;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lgq;")
    public static final class302 field6079;
    @ObfuscatedName(value="fs")
    @ObfuscatedGetter(intValue=-1895129459)
    static int field6082;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lgq;")
    static final class302 field6077;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lgq;")
    static final class302 field6078;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field6080;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lgq;")
    static final class302 field6081;
    @ObfuscatedName(value="aj")
    public final String field6083;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1680730303)
    final int field6084;

    static {
        field6078 = new class302("runescape", "RuneScape", 0);
        field6075 = new class302("stellardawn", "Stellar Dawn", 1);
        field6077 = new class302("game3", "Game 3", 2);
        field6081 = new class302("game4", "Game 4", 3);
        field6076 = new class302("game5", "Game 5", 4);
        field6079 = new class302("oldscape", "RuneScape 2007", 5);
    }

    class302(String string2, String string3, int n) {
        this.field6083 = string2;
        this.field6084 = n;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6084 * 607549633);
        return by * -1680730303;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="1220558144")
    public static void method11046(AbstractArchive abstractArchive) {
        ParamDefinition.ParamDefinition_archive = abstractArchive;
    }
}

