/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ec")
public class class381
extends class289 {
    @ObfuscatedName(value="re")
    @ObfuscatedSignature(descriptor="Lhq;")
    @Export(value="friendSystem")
    public static FriendSystem friendSystem;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Loc;")
    @Export(value="ItemDefinition_fontPlain11")
    static class399 ItemDefinition_fontPlain11;

    @ObfuscatedName(value="bg")
    static final void method13235(double d, int n, int n2, int n3) {
        double d2 = Math.random();
        n3 = n * 128;
        block0: while (n < n2) {
            double d3 = (double)(n >> 3) / 64.0 + 0.0078125;
            double d4 = (double)(n & 7) / 8.0 + 0.0625;
            int n4 = 0;
            while (true) {
                int n5;
                double d5;
                double d6;
                double d7;
                if (n4 >= 128) {
                    ++n;
                    continue block0;
                }
                double d8 = (double)n4 / 128.0;
                if (d4 != 0.0) {
                    double d9;
                    d7 = d8 < 0.5 ? (d4 + 1.0) * d8 : d4 + d8 - d8 * d4;
                    double d10 = d8 * 2.0 - d7;
                    double d11 = d9 = d3 + 0.3333333333333333;
                    if (d9 > 1.0) {
                        d11 = d9 - 1.0;
                    }
                    double d12 = d9 = d3 - 0.3333333333333333;
                    if (d9 < 0.0) {
                        d12 = d9 + 1.0;
                    }
                    d11 = d11 * 6.0 < 1.0 ? (d7 - d10) * 6.0 * d11 + d10 : (d11 * 2.0 < 1.0 ? d7 : (d11 * 3.0 < 2.0 ? (0.6666666666666666 - d11) * (d7 - d10) * 6.0 + d10 : d10));
                    d9 = d3 * 6.0 < 1.0 ? d10 + (d7 - d10) * 6.0 * d3 : (d3 * 2.0 < 1.0 ? d7 : (d3 * 3.0 < 2.0 ? d10 + (0.6666666666666666 - d3) * (d7 - d10) * 6.0 : d10));
                    if (d12 * 6.0 < 1.0) {
                        d8 = d12 * ((d7 - d10) * 6.0) + d10;
                        d6 = d11;
                        d5 = d9;
                    } else if (d12 * 2.0 < 1.0) {
                        d8 = d7;
                        d6 = d11;
                        d5 = d9;
                    } else {
                        d8 = d10;
                        d6 = d11;
                        d5 = d9;
                        if (3.0 * d12 < 2.0) {
                            d8 = d10 + (d7 - d10) * (0.6666666666666666 - d12) * 6.0;
                            d6 = d11;
                            d5 = d9;
                        }
                    }
                } else {
                    d5 = d7 = d8;
                    d6 = d7;
                }
                int n6 = n5 = class363.Rasterizer3D_brighten((int)(d8 * 256.0) + ((int)(d5 * 256.0) << 8) + ((int)(d6 * 256.0) << 16), d + (d2 * 0.03 - 0.015));
                if (n5 == 0) {
                    n6 = 1;
                }
                Rasterizer3D.field334[n3] = n6;
                ++n4;
                ++n3;
            }
            break;
        }
        return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(Loc;Loc;Lfj;I)V")
    static void method13236(class399 var0, class399 var1_1, class72 var2_2, int var3_3) {
        var13_4 = Login.field3215.field6148;
        var14_5 = Login.field3215.field6153;
        if (class288.field5962 == null) {
            class288.field5962 = class289.method10684(class259.field4373, "sl_back", "", -1093997559);
        }
        if (class124.field3428 == null) {
            class124.field3428 = class18.method348(class259.field4373, "sl_flags", "", -1792716957);
        }
        if (class88.field2669 == null) {
            class88.field2669 = class18.method348(class259.field4373, "sl_arrows", "", -261151349);
        }
        if (class297.field6033 == null) {
            class297.field6033 = class18.method348(class259.field4373, "sl_stars", "", -1917152271);
        }
        if (class39.field585 == null) {
            class39.field585 = TileItemPile.method327(class259.field4373, "leftarrow", "", 778794383);
        }
        if (Ignored.field5943 == null) {
            Ignored.field5943 = TileItemPile.method327(class259.field4373, "rightarrow", "", 511198723);
        }
        var2_2.vmethod10762(Login.field3168, 23, 765, 480, 0, (byte)10);
        var2_2.method4246(Login.field3168, 0, 125, 23, 12425273, 9135624, -1771570754);
        var2_2.method4246(Login.field3168 + 125, 0, 640, 23, 0x4F4F4F, 0x292929, 584126066);
        var0.method13844("Select a world", Login.field3168 + 62, 15, 0, -1, var2_2);
        if (class297.field6033 != null) {
            var2_2.vmethod10757(class297.field6033[1], Login.field3168 + 140, 1, -1713248280);
            var1_1.method13830("Members only world", Login.field3168 + 152, 10, 0xFFFFFF, -1, var2_2);
            var2_2.vmethod10757(class297.field6033[0], Login.field3168 + 140, 12, -1713248280);
            var1_1.method13830("Free world", Login.field3168 + 152, 21, 0xFFFFFF, -1, var2_2);
        }
        if (class88.field2669 != null) {
            var15_6 = class121.field3377[0] == 0 && class121.field3384[0] == 1 ? class88.field2669[2] : class88.field2669[0];
            var16_7 = class121.field3377[0] == 0 && class121.field3384[0] == 1 ? class88.field2669[3] : class88.field2669[1];
            var3_3 = Login.field3168 + 280;
            var2_2.vmethod10757((IndexedSprite)var15_6, var3_3, 4, -1713248280);
            var2_2.vmethod10757((IndexedSprite)var16_7, var3_3 + 15, 4, -1713248280);
            var0.method13830("World", var3_3 + 32, 17, 0xFFFFFF, -1, var2_2);
            var3_3 = Login.field3168 + 390;
            var2_2.vmethod10757((IndexedSprite)var15_6, var3_3, 4, -1713248280);
            var2_2.vmethod10757((IndexedSprite)var16_7, var3_3 + 15, 4, -1713248280);
            var0.method13830("Players", var3_3 + 32, 17, 0xFFFFFF, -1, var2_2);
            var3_3 = Login.field3168 + 500;
            var2_2.vmethod10757((IndexedSprite)var15_6, var3_3, 4, -1713248280);
            var2_2.vmethod10757((IndexedSprite)var16_7, var3_3 + 15, 4, -1713248280);
            var0.method13830("Location", var3_3 + 32, 17, 0xFFFFFF, -1, var2_2);
            var3_3 = Login.field3168 + 610;
            var2_2.vmethod10757((IndexedSprite)var15_6, var3_3, 4, -1713248280);
            var2_2.vmethod10757((IndexedSprite)var16_7, var3_3 + 15, 4, -1713248280);
            var0.method13830("Type", var3_3 + 32, 17, 0xFFFFFF, -1, var2_2);
        }
        var2_2.vmethod10762(Login.field3168 + 708, 4, 50, 16, 0, (byte)118);
        var1_1.method13844("Cancel", Login.field3168 + 708 + 25, 16, 0xFFFFFF, -1, var2_2);
        Login.field3200 = -1;
        if (class288.field5962 == null) return;
        class301.field6073 = class52.method3752((byte)49);
        Login.field3207 = (class121.field3385 + class301.field6073.field3406 - 1) / class301.field6073.field3406 - class301.field6073.field3401;
        if (class39.field585 != null && Login.field3205 > 0) {
            var2_2.vmethod10757(class39.field585, Login.field3168 + class301.field6073.field3402 - class39.field585.field7119 - class301.field6073.field3400 * 2, class127.field3441 / 2 - class39.field585.field7124 / 2, -1713248280);
        }
        if (Ignored.field5943 != null && Login.field3205 < Login.field3207) {
            var2_2.vmethod10757(Ignored.field5943, class301.field6073.field3400 * 2 + Login.field3168 + class301.field6073.field3404, class127.field3441 / 2 - Ignored.field5943.field7124 / 2, -1713248280);
        }
        var4_8 = class301.field6073.field3398 * -1223831655;
        var5_9 = Login.field3168 * -1564648173;
        var7_10 = class301.field6073.field3402 * 1444669855;
        var3_3 = Login.field3205;
        var6_11 = class301.field6073.field3406 * 1655509289;
        var4_8 = var4_8 * 1127879849 + 23;
        var5_9 = var7_10 * 2075456095 + var5_9 * -155388645;
        var9_12 = var3_3;
        var8_13 = var3_3 * var6_11 * -1858462951;
        var6_11 = 0;
        var7_10 = 0;
        while (true) {
            block22: {
                block20: {
                    block21: {
                        block19: {
                            block18: {
                                var3_3 = class121.field3385 * -1526914031;
                                var12_16 = 8;
                                if (var8_13 >= var3_3 * -482587407 || var9_12 - Login.field3205 >= class301.field6073.field3401) break;
                                var16_7 = class121.field3380[var8_13];
                                var15_6 = Integer.toString(var16_7.field3389);
                                if (var16_7.field3389 != -1) break block18;
                                var15_6 = "OFF";
                                ** GOTO lbl78
                            }
                            if (var16_7.field3389 <= 1980) {
                                var10_14 = true;
                            } else {
                                var15_6 = "FULL";
lbl78:
                                // 2 sources

                                var10_14 = false;
                            }
                            if (!var16_7.method5391(1622070119)) break block19;
                            var3_3 = var16_7.method5385(1260979225) ? 7 : 6;
                            break block20;
                        }
                        if (var16_7.method5388(-200972587)) break block21;
                        var3_3 = var16_7.method5390(369679999) ? (var16_7.method5385(1536695037) ? 9 : 8) : (var16_7.method5389((byte)-32) ? (var16_7.method5385(1755297985) ? 3 : 2) : (var16_7.method5385(975270550) ? 1 : 0));
                        break block20;
                    }
                    var3_3 = var16_7.method5385(1516745092) ? 5 : 4;
                    var11_15 = 0xFF0000;
                    break block22;
                }
                var11_15 = 0;
            }
            if (var13_4 >= var5_9 && var14_5 >= var4_8 && var13_4 < var5_9 + class301.field6073.field3403 && var14_5 < var4_8 + class301.field6073.field3399 && var10_14) {
                Login.field3200 = var8_13;
                var2_2.vmethod10776(class288.field5962[var3_3], var5_9, var4_8, 128, 0xFFFFFF, (byte)-89);
                var3_3 = 1;
            } else {
                var2_2.vmethod10756(class288.field5962[var3_3], var5_9, var4_8, 2136793162);
                var3_3 = var6_11;
            }
            var6_11 = var4_8;
            if (class124.field3428 != null) {
                var17_17 = class124.field3428;
                var4_8 = var16_7.method5385(1360041726) != false ? var12_16 : 0;
                var2_2.vmethod10757(var17_17[var4_8 + var16_7.field3393], var5_9 + 29, var6_11, -1713248280);
            }
            var0.method13844(Integer.toString(var16_7.field3388), var5_9 + 15, var6_11 + class301.field6073.field3399 / 2 + 5, var11_15, -1, var2_2);
            var1_1.method13844((String)var15_6, var5_9 + 60, var6_11 + class301.field6073.field3399 / 2 + 5, 0xFFFFFFF, -1, var2_2);
            var4_8 = var6_11 + class301.field6073.field3399 + class301.field6073.field3405;
            if (++var7_10 >= class301.field6073.field3406) {
                var4_8 = class301.field6073.field3398 * -1223831655;
                var5_9 = var5_9 + class301.field6073.field3400 + class301.field6073.field3403;
                ++var9_12;
                var4_8 = var4_8 * 1127879849 + 23;
                var7_10 = 0;
            }
            ++var8_13;
            var6_11 = var3_3;
        }
        if (var6_11 == 0) return;
        var4_8 = var1_1.method13851(class121.field3380[Login.field3200].field3394) + 6;
        var3_3 = var14_5 + 25;
        var5_9 = var1_1.field7300 + 8;
        if (var3_3 + var5_9 > 480) {
            var3_3 = var14_5 - 25 - var5_9;
        }
        var2_2.vmethod10762(var13_4 - var4_8 / 2, var3_3, var4_8, var5_9, 0xFFFFA0, (byte)40);
        var2_2.method4255(var13_4 - var4_8 / 2, var3_3, var4_8, var5_9, 0);
        var1_1.method13844(class121.field3380[Login.field3200].field3394, var13_4, var3_3 + var1_1.field7300 + 4, 0, -1, var2_2);
    }
}

