/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iu")
@Implements(value="Tiles")
public final class Tiles {
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=251187833)
    static int field3453 = 0;
    @ObfuscatedName(value="ae")
    static byte[][][] field3455;
    @ObfuscatedName(value="af")
    static int[] field3456;
    @ObfuscatedName(value="ag")
    static final int[] field3457;
    @ObfuscatedName(value="ah")
    static byte[][][] field3458;
    @ObfuscatedName(value="aj")
    static byte[][][] field3460;
    @ObfuscatedName(value="ao")
    static final int[] field3462;
    @ObfuscatedName(value="aq")
    static int[] field3463;
    @ObfuscatedName(value="as")
    static byte[][][] field3464;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-2140790423)
    static int field3466 = 0;
    @ObfuscatedName(value="az")
    static final int[] field3469;
    @ObfuscatedName(value="dj")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field3472;
    @ObfuscatedName(value="ad")
    static final int[] field3454;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=524657975)
    static int field3459 = 0;
    @ObfuscatedName(value="ak")
    @Export(value="Tiles_heights")
    static int[][][] Tiles_heights;
    @ObfuscatedName(value="at")
    static final int[] field3465;
    @ObfuscatedName(value="av")
    static final int[] field3467;
    @ObfuscatedName(value="ax")
    static byte[][][] field3468;

    static {
        Tiles_heights = (int[][][])Array.newInstance(Integer.TYPE, 4, 105, 105);
        field3455 = (byte[][][])Array.newInstance(Byte.TYPE, 4, 104, 104);
        field3459 = 99;
        field3462 = new int[]{1, 2, 4, 8};
        field3469 = new int[]{16, 32, 64, 128};
        field3465 = new int[]{1, 0, -1, 0};
        field3467 = new int[]{0, -1, 0, 1};
        field3454 = new int[]{1, -1, -1, 1};
        field3457 = new int[]{-1, -1, 1, 1};
        field3453 = (int)(Math.random() * 17.0) - 8;
        field3466 = (int)(Math.random() * 33.0) - 16;
    }

    @ObfuscatedName(value="fv")
    @ObfuscatedSignature(descriptor="(IB)Ljava/lang/String;", garbageValue="16")
    static final String method5611(int n) {
        if (n >= 999999999) {
            return "*";
        }
        return Integer.toString(n);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lek;IIII)V", garbageValue="-1229173113")
    static void method5561(class384 class3842, int n, int n2, int n3) {
        WorldMapRegion.WorldMapRegion_cachedSprites.put(class3842, class14.method319(n, n2, n3), class3842.field7129.length * 4);
    }
}

