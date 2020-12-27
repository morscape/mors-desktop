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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cx")
@Implements(value="WorldMapLabelSize")
public class WorldMapLabelSize {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lcx;")
    @Export(value="WorldMapLabelSize_medium")
    public static final WorldMapLabelSize WorldMapLabelSize_medium;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lcx;")
    @Export(value="WorldMapLabelSize_large")
    public static final WorldMapLabelSize WorldMapLabelSize_large;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lcx;")
    @Export(value="WorldMapLabelSize_small")
    public static final WorldMapLabelSize WorldMapLabelSize_small;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-671413539)
    final int field2343;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=941052287)
    final int field2344;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-35502567)
    final int field2345;

    static {
        WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4);
        WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
        WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0);
    }

    WorldMapLabelSize(int n, int n2, int n3) {
        this.field2345 = n;
        this.field2343 = n2;
        this.field2344 = n3;
    }

    @ObfuscatedName(value="ae")
    boolean method3707(float f, int n) {
        n = this.field2344 * 429289087;
        return f >= (float)(n * 941052287);
    }

    @ObfuscatedName(value="ac")
    static void method3698(int[] arrn, byte[] arrby, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, byte by) {
        by = (byte)(-n6);
        n6 = n2;
        n2 = n3;
        n3 = by;
        while (true) {
            int n10;
            if (n3 < 0) {
                n10 = n;
            } else {
                return;
            }
            for (by = (byte)(-n5); by < 0; by = (byte)(by + 1)) {
                byte by2 = arrby[n9 * (n6 >> 16) + (n10 >> 16)];
                if (by2 != 0) {
                    arrn[n2] = arrn2[by2 & 0xFF];
                    ++n2;
                } else {
                    ++n2;
                }
                n10 += n7;
            }
            n6 = n8 + n6;
            ++n3;
            n2 += n4;
        }
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="570123959")
    static int method3706(int n) {
        return n * 3 + 600;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)Lcx;")
    static WorldMapLabelSize method3699(int n, int n2) {
        WorldMapLabelSize[] arrworldMapLabelSize = WorldMapLabelSize.method3702();
        n2 = 0;
        while (n2 < arrworldMapLabelSize.length) {
            WorldMapLabelSize worldMapLabelSize = arrworldMapLabelSize[n2];
            int n3 = worldMapLabelSize.field2343 * -1424155275;
            if (n3 * -671413539 == n) {
                return worldMapLabelSize;
            }
            ++n2;
        }
        return null;
    }

    @ObfuscatedName(value="ai")
    public static boolean method3700(int n, byte by) {
        return n >= class301.field6067.field6074 && n <= (by = (byte)(class301.field6068.field6074 * -1239373807)) * -1053996815;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)[Lcx;", garbageValue="-1597449351")
    static WorldMapLabelSize[] method3702() {
        WorldMapLabelSize worldMapLabelSize = WorldMapLabelSize_large;
        WorldMapLabelSize worldMapLabelSize2 = WorldMapLabelSize_medium;
        WorldMapLabelSize worldMapLabelSize3 = WorldMapLabelSize_small;
        return new WorldMapLabelSize[]{worldMapLabelSize, worldMapLabelSize2, worldMapLabelSize3};
    }
}

