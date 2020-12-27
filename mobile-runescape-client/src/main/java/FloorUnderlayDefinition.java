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

@ObfuscatedName(value="dw")
@Implements(value="FloorUnderlayDefinition")
public class FloorUnderlayDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Ldw;")
    static FloorUnderlayDefinition[] field7062;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ldw;")
    static FloorUnderlayDefinition field7063;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field7064;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1682871565)
    @Export(value="hue")
    public int hue;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=240644261)
    @Export(value="lightness")
    public int lightness;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-455998279)
    @Export(value="hueMultiplier")
    public int hueMultiplier;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1000477875)
    @Export(value="saturation")
    public int saturation;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1047177941)
    @Export(value="rgb")
    int rgb = 0;

    static {
        field7063 = new FloorUnderlayDefinition();
    }

    FloorUnderlayDefinition() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;III)V", garbageValue="1327405108")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n, int n2) {
        if (n != 1) {
            return;
        }
        this.rgb = buffer.method11649(-916669062);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1116218529")
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
            if (d2 == d7) {
                d5 = (d3 - d4) / (d7 - d6);
                d = d8;
            } else if (d3 == d7) {
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
        d5 /= 6.0;
        this.saturation = n = (int)(d * 256.0);
        this.lightness = (int)(256.0 * d9);
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }
        if (this.lightness < 0) {
            this.lightness = 0;
        } else if (this.lightness > 255) {
            this.lightness = 255;
        }
        this.hueMultiplier = !(d9 > 0.5) ? (int)(512.0 * (d9 * d)) : (int)(512.0 * (d * (1.0 - d9)));
        if (this.hueMultiplier < 1) {
            this.hueMultiplier = 1;
        }
        this.hue = (int)((double)this.hueMultiplier * d5);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-70")
    void method13195() {
        this.setHsl(this.rgb);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;IB)V")
    void method13201(Buffer buffer, int n, byte by) {
        while ((by = (byte)buffer.method11650(912117420)) != 0) {
            this.decodeNext(buffer, by, n);
        }
        return;
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Lji;Lfj;I)V")
    static void method13192(class138 class1382, class72 class722, int n) {
        block7: {
            block9: {
                block10: {
                    block11: {
                        block12: {
                            block13: {
                                block14: {
                                    block15: {
                                        block16: {
                                            block17: {
                                                block18: {
                                                    block19: {
                                                        block8: {
                                                            n = Login.field3215.field6148;
                                                            int n2 = Login.field3215.field6153;
                                                            boolean bl = Login.field3215.field6147;
                                                            boolean bl2 = Login.field3215.field6149;
                                                            boolean bl3 = Login.field3215.field6144;
                                                            boolean bl4 = Login.field3215.field6145;
                                                            Login.field3215.method11165();
                                                            if (bl2) break block7;
                                                            if (bl3 && Login.field3205 > 0 && class39.field585 != null) {
                                                                // empty if block
                                                            }
                                                            if (bl4 && --Login.field3205 < Login.field3207 && Ignored.field5943 != null) {
                                                                ++Login.field3205;
                                                            }
                                                            if (!bl) break block8;
                                                            int n3 = Login.field3168 + 280;
                                                            if (n >= n3 && n <= n3 + 14 && n2 >= 4 && n2 <= 18) break block9;
                                                            if (n >= n3 + 15 && n <= n3 + 80 && n2 >= 4 && n2 <= 18) break block10;
                                                            n3 = Login.field3168 + 390;
                                                            if (n >= n3 && n <= n3 + 14 && n2 >= 4 && n2 <= 18) break block11;
                                                            if (n >= n3 + 15 && n <= n3 + 80 && n2 >= 4 && n2 <= 18) break block12;
                                                            n3 = Login.field3168 + 500;
                                                            if (n >= n3 && n <= n3 + 14 && n2 >= 4 && n2 <= 18) break block13;
                                                            if (n >= n3 + 15 && n <= n3 + 80 && n2 >= 4 && n2 <= 18) break block14;
                                                            n3 = Login.field3168 + 610;
                                                            if (n >= n3 && n <= n3 + 14 && n2 >= 4 && n2 <= 18) break block15;
                                                            if (n >= n3 + 15 && n <= n3 + 80 && n2 >= 4 && n2 <= 18) break block16;
                                                            if (n >= Login.field3168 + 708 && n2 >= 4 && n <= Login.field3168 + 708 + 50 && n2 <= 20) break block17;
                                                            if (Login.field3200 != -1 && Login.field3200 == class45.method3637(-2102474363)) break block18;
                                                            if (class301.field6073 == null) break block19;
                                                            if (Login.field3205 > 0 && class39.field585 != null && n >= 0 && n <= Login.field3168 + class301.field6073.field3402 - class301.field6073.field3400 * 2 && n2 >= class127.field3441 / 2 - 100 && n2 <= class127.field3441 / 2 + 100) {
                                                                --Login.field3205;
                                                            }
                                                            if (Login.field3205 < Login.field3207 && Ignored.field5943 != null && n >= class301.field6073.field3400 * 2 + (class50.field2368 - Login.field3168 - class301.field6073.field3402) && n <= class50.field2368 && n2 >= class127.field3441 / 2 - 100 && n2 <= class127.field3441 / 2 + 100) {
                                                                ++Login.field3205;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                class279.method10389(class121.field3380[Login.field3200], -852437956);
                                                class376.method13148(class722);
                                                return;
                                            }
                                            class376.method13148(class722);
                                            return;
                                        }
                                        WorldMapIcon_0.method10404(3, 1, (byte)42);
                                        return;
                                    }
                                    WorldMapIcon_0.method10404(3, 0, (byte)50);
                                    return;
                                }
                                WorldMapIcon_0.method10404(2, 1, (byte)65);
                                return;
                            }
                            WorldMapIcon_0.method10404(2, 0, (byte)64);
                            return;
                        }
                        WorldMapIcon_0.method10404(1, 1, (byte)97);
                        return;
                    }
                    WorldMapIcon_0.method10404(1, 0, (byte)76);
                    return;
                }
                WorldMapIcon_0.method10404(0, 1, (byte)116);
                return;
            }
            WorldMapIcon_0.method10404(0, 0, (byte)53);
            return;
        }
        class376.method13148(class722);
    }
}

