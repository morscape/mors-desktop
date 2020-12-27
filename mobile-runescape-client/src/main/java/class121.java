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

@ObfuscatedName(value="if")
public class class121 {
    @ObfuscatedName(value="aa")
    static int[] field3377;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lif;")
    static class121[] field3380;
    @ObfuscatedName(value="al")
    static int[] field3384;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-482587407)
    static int field3385 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Ljk;")
    static UrlRequest field3378;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=1356240631)
    int field3388;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-896445653)
    int field3389;
    @ObfuscatedName(value="an")
    String field3390;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-2075982583)
    int field3391;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-358100559)
    int field3392;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1158419165)
    int field3393;
    @ObfuscatedName(value="ay")
    String field3394;

    static {
        field3384 = new int[]{1, 1, 1, 1};
        field3377 = new int[]{0, 1, 2, 3};
    }

    class121() {
    }

    @ObfuscatedName(value="an")
    boolean method5388(int n) {
        n = this.field3391 * 6691129;
        return (0x20000000 & n * -2075982583) != 0;
    }

    @ObfuscatedName(value="aq")
    boolean method5389(byte by) {
        by = (byte)(this.field3391 * 6691129);
        return (by * -2075982583 & 4) != 0;
    }

    @ObfuscatedName(value="aw")
    boolean method5390(int n) {
        n = this.field3391 * 6691129;
        return (0x40000000 & n * -2075982583) != 0;
    }

    @ObfuscatedName(value="ay")
    boolean method5391(int n) {
        n = this.field3391 * 6691129;
        return (0x2000000 & n * -2075982583) != 0;
    }

    @ObfuscatedName(value="ab")
    boolean method5385(int n) {
        n = this.field3391 * 6691129;
        return (n * -2075982583 & 1) != 0;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lkc;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method5364(AbstractArchive abstractArchive, String string2, String string3, int n, boolean bl, int n2) {
        n2 = abstractArchive.method6153(string2, 483307150);
        class131.method5631(abstractArchive, n2, abstractArchive.getFileId(n2, string3), n, bl);
    }
}

