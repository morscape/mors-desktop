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

@ObfuscatedName(value="fb")
public class class65 {
    @ObfuscatedName(value="cn")
    static final int[] field2481 = new int[]{16, 17, 18, 19, 20, 21, 22, 1, 2, 3, 4, 5, 6, 1001, 7, 8, 9, 10, 11, 12, 13, 14, 15, 44, 45, 46, 47, 48, 49, 50, 51, 1002, 1004, 1003};
    @ObfuscatedName(value="di")
    @ObfuscatedGetter(intValue=-1618604329)
    static int field2483;

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IZB)Ljava/lang/String;", garbageValue="107")
    @Export(value="intToString")
    public static String intToString(int n, boolean bl) {
        if (bl && n >= 0) {
            return class358.method12144(n, 10, bl, 2057340897);
        }
        String string2 = Integer.toString(n);
        return string2;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="2033511368")
    static int method4032(int n, int n2) {
        FloorOverlayDefinition floorOverlayDefinition = class319.method11372(n);
        if (floorOverlayDefinition == null) {
            return n2;
        }
        if (floorOverlayDefinition.secondaryRgb >= 0) {
            return floorOverlayDefinition.secondaryRgb | 0xFF000000;
        }
        if (floorOverlayDefinition.field7110 >= 0) {
            n = class277.method10338(Rasterizer3D.field339.getAverageTextureRGB(floorOverlayDefinition.field7110), 96, 1016689441);
            return Rasterizer3D.field334[n] | 0xFF000000;
        }
        if (floorOverlayDefinition.primaryRgb != 0xFF00FF) {
            n = class277.method10338(class277.method10340(floorOverlayDefinition.hue, floorOverlayDefinition.saturation, floorOverlayDefinition.lightness, (byte)119), 96, 1016689441);
            n = Rasterizer3D.field334[n];
            return n | 0xFF000000;
        }
        return n2;
    }
}

