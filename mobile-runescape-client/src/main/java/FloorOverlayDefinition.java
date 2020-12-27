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
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ee")
@Implements(value="FloorOverlayDefinition")
public class FloorOverlayDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Lee;")
    static FloorOverlayDefinition[] field7099;
    @ObfuscatedName(value="ed")
    @ObfuscatedGetter(intValue=-599000959)
    static int field7104 = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lee;")
    static FloorOverlayDefinition field7100;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field7101;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-974563495)
    @Export(value="saturation")
    public int saturation;
    @ObfuscatedName(value="af")
    @Export(value="secondaryHue")
    public int secondaryHue;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1850661179)
    public int field7110 = -1;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1711480841)
    @Export(value="secondaryRgb")
    public int secondaryRgb = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=630350417)
    @Export(value="hue")
    public int hue;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1522628021)
    @Export(value="secondaryLightness")
    public int secondaryLightness;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=271504941)
    @Export(value="secondarySaturation")
    public int secondarySaturation;
    @ObfuscatedName(value="as")
    public boolean field7115 = true;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1932888053)
    @Export(value="primaryRgb")
    public int primaryRgb = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1292562765)
    @Export(value="lightness")
    public int lightness;

    static {
        field7100 = new FloorOverlayDefinition();
    }

    FloorOverlayDefinition() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;III)V", garbageValue="1926579424")
    void method13270(Buffer buffer, int n, int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 5) {
                    if (n != 7) {
                        return;
                    }
                    this.secondaryRgb = buffer.method11649(1853626597);
                    return;
                }
                this.field7115 = false;
                return;
            }
            this.field7110 = buffer.method11650(602552636);
            return;
        }
        this.primaryRgb = buffer.method11649(1832460425);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="14")
    @Export(value="setHsl")
    void setHsl(int n) {
        double d;
        double d2 = (double)(n >> 16 & 0xFF) / 256.0;
        double d3 = (double)(n >> 8 & 0xFF) / 256.0;
        double d4 = (double)(n & 0xFF) / 256.0;
        double d5 = d3 < d2 ? d3 : d2;
        double d6 = d5;
        if (d4 < d5) {
            d6 = d4;
        }
        d5 = d3 > d2 ? d3 : d2;
        double d7 = d5;
        if (d4 > d5) {
            d7 = d4;
        }
        double d8 = d7 + d6;
        double d9 = d8 / 2.0;
        d5 = 0.0;
        if (d6 != d7) {
            d8 = d9 < 0.5 ? (d7 - d6) / d8 : 0.0;
            if (d9 >= 0.5) {
                d8 = (d7 - d6) / (2.0 - d7 - d6);
            }
            if (d7 == d2) {
                d5 = (d3 - d4) / (d7 - d6);
                d = d8;
            } else if (d7 == d3) {
                d5 = (d4 - d2) / (d7 - d6) + 2.0;
                d = d8;
            } else {
                d = d8;
                if (d4 == d7) {
                    d5 = (d2 - d3) / (d7 - d6) + 4.0;
                    d = d8;
                }
            }
        } else {
            d = 0.0;
        }
        this.hue = n = (int)(d5 / 6.0 * 256.0);
        this.saturation = (int)(d * 256.0);
        this.lightness = (int)(d9 * 256.0);
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }
        if (this.lightness >= 0) {
            if (this.lightness > 255) {
                this.lightness = 255;
            }
            return;
        }
        this.lightness = 0;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1763393085")
    @Export(value="postDecode")
    void postDecode() {
        if (this.secondaryRgb != -1) {
            this.setHsl(this.secondaryRgb);
            this.secondaryHue = this.hue * 1761648629;
            this.secondarySaturation = this.saturation;
            this.secondaryLightness = this.lightness;
        }
        this.setHsl(this.primaryRgb);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;IB)V")
    void method13279(Buffer buffer, int n, byte by) {
        while ((by = (byte)buffer.method11650(2045249545)) != 0) {
            this.method13270(buffer, by, n);
        }
        return;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-21")
    static void method13266() {
        if (class87.field2660 == null) {
            class87.field2660 = new ArrayList(100);
        }
        class87.field2660.clear();
        Varps.method65(class87.field2660);
        GZipDecompressor.method6655(class87.field2660);
        Rasterizer3D.method612(class87.field2660);
        class259.method7479(class87.field2660);
        class304.method11060(class87.field2660);
        WorldMapIcon_1.method10425(class87.field2660);
        class265.method7636(class87.field2660);
        class8.method143(class87.field2660);
        class0.method2(class87.field2660);
        WorldMapIcon_0.method10406(class87.field2660);
        class257.method7442(class87.field2660);
        MusicPatchNode.method11589(class87.field2660);
        MidiPcmStream.method13664(class87.field2660);
        class300.method10993(class87.field2660);
        TriBool.method3902(class87.field2660);
        TilePaint.method856(class87.field2660);
        Messages.method6067(class87.field2660);
        class87.field2660.add(class391.field7204);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIILde;II)V")
    static void method13265(int n, int n2, int n3, ObjectDefinition objectDefinition, int n4, int n5) {
        class319 class3192 = new class319();
        class3192.field6245 = n;
        class3192.field6248 = n2 * 128;
        class3192.field6255 = n3 * 128;
        n5 = objectDefinition.field6886;
        n = objectDefinition.field6884;
        if (n4 == 1 || n4 == 3) {
            n5 = objectDefinition.field6884;
            n = objectDefinition.field6886;
        }
        class3192.field6247 = (n5 + n2) * 128;
        class3192.field6254 = (n + n3) * 128;
        class3192.field6250 = objectDefinition.field6915;
        class3192.field6249 = objectDefinition.field6904 * 128;
        class3192.field6244 = objectDefinition.field6913;
        class3192.field6246 = objectDefinition.field6906;
        class3192.field6253 = objectDefinition.field6911;
        if (objectDefinition.transforms != null) {
            class3192.field6256 = objectDefinition;
            class3192.method11386(884024605);
        }
        class319.field6240.method4082(class3192);
        if (class3192.field6253 != null) {
            class3192.field6251 = (class3192.field6244 + (int)(Math.random() * (double)(class3192.field6246 - class3192.field6244))) * 592902897;
        }
    }
}

