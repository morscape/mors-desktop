/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hh")
@Implements(value="DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider
implements class113 {
    @ObfuscatedName(value="ef")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field6104;

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Lhn;", garbageValue="-48")
    @Export(value="player")
    public PcmPlayer player() {
        class310 class3102 = new class310();
        return class3102;
    }

    @ObfuscatedName(value="dh")
    static final int method11095(int n, int n2, int n3, int n4) {
        int n5 = n >> 7;
        Object object = n2 >> 7;
        if (n5 >= 0 && object >= 0 && n5 <= 103 && object <= 103) {
            n4 = n3;
            if (n3 < 3) {
                n4 = n3;
                if ((Tiles.field3455[1][n5][object] & 2) == 2) {
                    n4 = n3 + 1;
                }
            }
            Object object2 = Tiles.Tiles_heights[n4];
            int n6 = n5 + 1;
            n3 = object2[n6][object];
            int n7 = 128 - (n &= 0x7F);
            int n8 = Tiles.Tiles_heights[n4][n5][object];
            object2 = Tiles.Tiles_heights[n4][n6];
            n6 = object + 1;
            object = object2[n6];
            n4 = Tiles.Tiles_heights[n4][n5][n6];
            return (n * n3 + n8 * n7 >> 7) * (128 - (n2 &= 0x7F)) + (n * object + n4 * n7 >> 7) * n2 >> 7;
        }
        return 0;
    }
}

