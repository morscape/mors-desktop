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

@ObfuscatedName(value="co")
@Implements(value="GameObject")
public final class GameObject {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=26151483)
    @Export(value="startY")
    int startY;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1547503933)
    @Export(value="height")
    int height;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1484940839)
    int field627;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbw;")
    @Export(value="entity")
    public Entity entity;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1321177409)
    @Export(value="startX")
    int startX;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-919078475)
    @Export(value="endX")
    int endX;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(longValue=-1804144234127468583L)
    @Export(value="tag")
    public long tag = 0L;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-2009536569)
    @Export(value="flags")
    int flags = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=920348767)
    int field635;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=861553185)
    @Export(value="orientation")
    int orientation;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-813612369)
    @Export(value="centerX")
    int centerX;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=460680859)
    @Export(value="plane")
    int plane;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=744337485)
    @Export(value="centerY")
    int centerY;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-365342833)
    @Export(value="endY")
    int endY;

    GameObject() {
    }

    @ObfuscatedName(value="as")
    public static void method1220(byte by) {
        class197.JagexCache_dat2File.load();
        by = 0;
        while (true) {
            if (by >= class52.field2382) break;
            FontName.JagexCache_idxFiles[by].load();
            by = (byte)(by + 1);
        }
        try {
            class197.field3915.load();
            class197.JagexCache_randomDat.load();
            class197.JagexCache_dat2File = null;
            FontName.JagexCache_idxFiles = null;
            class197.field3915 = null;
            class197.JagexCache_randomDat = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @ObfuscatedName(value="as")
    static final void method1221(int n, int n2, int n3, int n4) {
        n4 = 0;
        block0: while (true) {
            int n5;
            block10: {
                block11: {
                    block12: {
                        block14: {
                            block13: {
                                Object object;
                                if (n4 < 8) break block10;
                                n5 = 1;
                                if (n2 > 0) {
                                    for (n4 = 1; n4 < 8; ++n4) {
                                        object = Tiles.Tiles_heights[n][n2];
                                        int n6 = n4 + n3;
                                        object[n6] = (int[])Tiles.Tiles_heights[n][n2 - 1][n6];
                                    }
                                }
                                if (n3 > 0) {
                                    for (n4 = n5; n4 < 8; ++n4) {
                                        object = Tiles.Tiles_heights[n];
                                        n5 = n4 + n2;
                                        object[n5][n3] = Tiles.Tiles_heights[n][n5][n3 - 1];
                                    }
                                }
                                if (n2 > 0 && (object = Tiles.Tiles_heights[n])[n4 = n2 - 1][n3] != 0) break block11;
                                if (n3 > 0 && (object = (Object)Tiles.Tiles_heights[n][n2])[n4 = n3 - 1] != false) break block12;
                                if (n2 <= 0 || n3 <= 0) break block13;
                                object = Tiles.Tiles_heights[n];
                                n4 = n2 - 1;
                                n5 = n3 - 1;
                                if ((object = (Object)object[n4])[n5] != false) break block14;
                            }
                            return;
                        }
                        Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n4][n5];
                        return;
                    }
                    Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n2][n4];
                    return;
                }
                Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n][n4][n3];
                return;
            }
            n5 = 0;
            while (true) {
                if (n5 >= 8) {
                    ++n4;
                    continue block0;
                }
                Tiles.Tiles_heights[n][n4 + n2][n5 + n3] = 0;
                ++n5;
            }
            break;
        }
    }
}

