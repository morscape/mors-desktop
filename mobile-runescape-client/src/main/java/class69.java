/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ff")
public class class69 {
    @ObfuscatedName(value="ab")
    @Export(value="ItemDefinition_inMembersWorld")
    static boolean ItemDefinition_inMembersWorld = false;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1057386689)
    final int field2499;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1267329067)
    final int field2500;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1370261537)
    final int field2501;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1231718295)
    final int field2502;

    public class69(int n, int n2, int n3, int n4) {
        this.field2501 = n;
        this.field2499 = n2;
        this.field2500 = n3;
        this.field2502 = n4;
    }

    public class69() {
        this(0, 0, 0, 0);
    }

    @ObfuscatedName(value="ae")
    public int method4111(int n) {
        n = this.field2499 * -792076097;
        return n * -1057386689;
    }

    @ObfuscatedName(value="ai")
    public int method4114(byte by) {
        by = (byte)(this.field2500 * -5269885);
        return by * 1267329067;
    }

    @ObfuscatedName(value="ak")
    public int method4116(int n) {
        n = this.field2501 * 1050346527;
        return n * -1370261537;
    }

    @ObfuscatedName(value="ax")
    public int method4122(int n) {
        n = this.field2502 * -2043701287;
        return n * -1231718295;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIB)Lek;", garbageValue="87")
    static class384 method4105(int n, int n2, int n3) {
        class384 class3842 = (class384)WorldMapRegion.WorldMapRegion_cachedSprites.get(class14.method319(n, n2, n3));
        return class3842;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-968588863")
    static void method4106() {
        if (Login.clearLoginScreen) {
            Login.titleboxSprite = null;
            class73.titlebuttonSprite = null;
            class212.field3988 = null;
            class167.field3780 = null;
            Login.field3174 = null;
            Login.field3173 = null;
            class128.field3451 = null;
            class302.field6080 = null;
            class275.field5004 = null;
            WorldMapScaleHandler.field565 = null;
            class288.field5962 = null;
            class124.field3428 = null;
            class88.field2669 = null;
            class297.field6033 = null;
            DevicePcmPlayerProvider.field6104 = null;
            class272.field4710.method5665();
            Tile.method7729(2);
            class264.method7607(true, 502692213);
            Login.field3193 = "";
            Login.field3199 = -1;
            Login.field3198 = false;
            Login.clearLoginScreen = false;
            Login.field3215.method11180();
            return;
        }
    }

    @ObfuscatedName(value="ao")
    static final int method4108(int n, int n2, int n3) {
        if (n == -1) {
            return 12345678;
        }
        n2 = (n & 0x7F) * n2 / 128;
        n3 = 126;
        if (n2 < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = n3;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;I)V", garbageValue="-1475636874")
    public static void method4107(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        class366.field6805 = abstractArchive;
        class366.field6802 = abstractArchive2;
    }
}

