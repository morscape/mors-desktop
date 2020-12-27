/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ip")
public class class126 {
    @ObfuscatedName(value="db")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field3437;

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="dc")
    static final void method5528(int var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        var15_5 = Client.field4740.field3567.vmethod11005();
        Client.field4838 = 0;
        var8_6 = Players.Players_count * 527068741;
        var16_7 = Players.Players_indices;
        var4_4 = 0;
        var6_8 = -1;
        var7_9 = 0;
        var5_10 = -1;
        while (true) {
            block46: {
                block45: {
                    block44: {
                        block40: {
                            if (var4_4 < var8_6 + Client.field4779) break block40;
                            if (Client.renderSelf && var6_8 != -1) {
                                Projectile.method14469(WorldMapScaleHandler.localPlayer, var6_8, var0, var1_1, var2_2, var3_3, -302257825);
                            }
                            if (var7_9 != 0) {
                                Projectile.method14469(Client.field4859[Client.field4874], var5_10, var0, var1_1, var2_2, var3_3, -926645247);
                            }
                            var6_8 = 0;
                            while (true) {
                                block42: {
                                    block43: {
                                        block41: {
                                            if (var6_8 >= Client.field4838) {
                                                return;
                                            }
                                            var10_14 = Client.field4843[var6_8];
                                            var4_4 = Client.field4833[var6_8];
                                            var11_15 = Client.field4842[var6_8];
                                            var12_16 = Client.field4830[var6_8];
                                            var5_10 = 1;
                                            block2: while (var5_10 != 0) {
                                                var5_10 = var4_4;
                                                var7_9 = 0;
                                                var4_4 = 0;
                                                while (true) {
                                                    if (var7_9 >= var6_8) {
                                                        var7_9 = var5_10;
                                                        var5_10 = var4_4;
                                                        var4_4 = var7_9;
                                                        continue block2;
                                                    }
                                                    var8_6 = var4_4;
                                                    var9_13 = var5_10;
                                                    if (var5_10 + 2 > Client.field4833[var7_9] - Client.field4830[var7_9]) {
                                                        var8_6 = var4_4;
                                                        var9_13 = var5_10;
                                                        if (var5_10 - var12_16 < Client.field4833[var7_9] + 2) {
                                                            var8_6 = var4_4;
                                                            var9_13 = var5_10;
                                                            if (var10_14 - var11_15 < Client.field4842[var7_9] + Client.field4843[var7_9]) {
                                                                var8_6 = var4_4;
                                                                var9_13 = var5_10;
                                                                if (var10_14 + var11_15 > Client.field4843[var7_9] - Client.field4842[var7_9]) {
                                                                    var8_6 = var4_4;
                                                                    var9_13 = var5_10;
                                                                    if (Client.field4833[var7_9] - Client.field4830[var7_9] < var5_10) {
                                                                        var9_13 = Client.field4833[var7_9] - Client.field4830[var7_9];
                                                                        var8_6 = 1;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ++var7_9;
                                                    var4_4 = var8_6;
                                                    var5_10 = var9_13;
                                                }
                                            }
                                            Client.viewportTempX = Client.field4843[var6_8];
                                            Client.field4833[var6_8] = var4_4;
                                            Client.viewportTempY = var4_4;
                                            var13_11 = Client.field4828[var6_8];
                                            if (Client.field4901 == 0) break block41;
                                            class265.field4640.method13844((String)var13_11, var0 + Client.viewportTempX, Client.viewportTempY + var1_1, 0xFFFF00, 0, var15_5);
                                            break block42;
                                        }
                                        var4_4 = Client.field4835[var6_8] < 6 ? Client.field4946[Client.field4835[var6_8]] : 0xFFFF00;
                                        if (Client.field4835[var6_8] == 6) {
                                            var4_4 = Client.field4844 % 20 >= 10 ? 0xFFFF00 : 0xFF0000;
                                        }
                                        if (Client.field4835[var6_8] == 7) {
                                            var4_4 = Client.field4844 % 20 >= 10 ? 65535 : 255;
                                        }
                                        var5_10 = var4_4;
                                        if (Client.field4835[var6_8] == 8) {
                                            var5_10 = Client.field4844 % 20 >= 10 ? 0x80FF80 : 45056;
                                        }
                                        var4_4 = var5_10;
                                        if (Client.field4835[var6_8] == 9) {
                                            var7_9 = 150 - Client.field4832[var6_8];
                                            if (var7_9 < 50) {
                                                var4_4 = var7_9 * 1280 + 0xFF0000;
                                            } else if (var7_9 < 100) {
                                                var4_4 = 0xFFFF00 - (var7_9 - 50) * 327680;
                                            } else {
                                                var4_4 = var5_10;
                                                if (var7_9 < 150) {
                                                    var4_4 = (var7_9 - 100) * 5 + 65280;
                                                }
                                            }
                                        }
                                        var5_10 = var4_4;
                                        if (Client.field4835[var6_8] == 10) {
                                            var7_9 = 150 - Client.field4832[var6_8];
                                            if (var7_9 < 50) {
                                                var5_10 = var7_9 * 5 + 0xFF0000;
                                            } else if (var7_9 < 100) {
                                                var5_10 = 0xFF00FF - (var7_9 - 50) * 327680;
                                            } else {
                                                var5_10 = var4_4;
                                                if (var7_9 < 150) {
                                                    var4_4 = var7_9 - 100;
                                                    var5_10 = var4_4 * 327680 + 255 - var4_4 * 5;
                                                }
                                            }
                                        }
                                        var4_4 = var5_10;
                                        if (Client.field4835[var6_8] != 11) ** GOTO lbl109
                                        var7_9 = 150 - Client.field4832[var6_8];
                                        if (var7_9 >= 50) break block43;
                                        var4_4 = 0xFFFFFF - var7_9 * 327685;
                                        ** GOTO lbl109
                                    }
                                    if (var7_9 < 100) {
                                        var5_10 = (var7_9 - 50) * 327685 + 65280;
                                    } else {
                                        var4_4 = var5_10;
                                        if (var7_9 < 150) {
                                            var4_4 = 0xFFFFFF - (var7_9 - 100) * 327680;
                                        }
lbl109:
                                        // 5 sources

                                        var5_10 = var4_4;
                                    }
                                    if (Client.field4845[var6_8] == 0) {
                                        class265.field4640.method13844((String)var13_11, var0 + Client.viewportTempX, Client.viewportTempY + var1_1, var5_10, 0, var15_5);
                                    }
                                    if (Client.field4845[var6_8] == 1) {
                                        class265.field4640.method13841((String)var13_11, var0 + Client.viewportTempX, Client.viewportTempY + var1_1, var5_10, 0, Client.field4844, var15_5);
                                    }
                                    if (Client.field4845[var6_8] == 2) {
                                        class265.field4640.method13852((String)var13_11, var0 + Client.viewportTempX, Client.viewportTempY + var1_1, var5_10, 0, Client.field4844, var15_5);
                                    }
                                    if (Client.field4845[var6_8] == 3) {
                                        class265.field4640.method13850((String)var13_11, var0 + Client.viewportTempX, Client.viewportTempY + var1_1, var5_10, 0, Client.field4844, 150 - Client.field4832[var6_8], var15_5);
                                    }
                                    if (Client.field4845[var6_8] == 4) {
                                        var4_4 = (150 - Client.field4832[var6_8]) * (class265.field4640.method13851((String)var13_11) + 100) / 150;
                                        var7_9 = Client.viewportTempX * -653512391;
                                        var8_6 = Client.viewportTempX * -653512391;
                                        var9_13 = var3_3 + var1_1;
                                        var15_5.method4242(var0 + var7_9 * 1938124041 - 50, var1_1, var0 + var8_6 * 1938124041 + 50, var9_13);
                                        class265.field4640.method13830((String)var13_11, var0 + Client.viewportTempX + 50 - var4_4, Client.viewportTempY + var1_1, var5_10, 0, var15_5);
                                        var15_5.method4238(var0, var1_1, var0 + var2_2, var9_13, -448408016);
                                    }
                                    if (Client.field4845[var6_8] == 5) {
                                        var4_4 = 150 - Client.field4832[var6_8];
                                        var4_4 = var4_4 < 25 ? (var4_4 -= 25) : (var4_4 > 125 ? (var4_4 -= 125) : 0);
                                        var7_9 = Client.viewportTempY * 1235931275;
                                        var8_6 = class265.field4640.field7300;
                                        var9_13 = var0 + var2_2;
                                        var15_5.method4242(var0, var7_9 * 1255872291 + var1_1 - var8_6 - 1, var9_13, Client.viewportTempY + var1_1 + 5);
                                        class265.field4640.method13844((String)var13_11, var0 + Client.viewportTempX, var4_4 + Client.viewportTempY + var1_1, var5_10, 0, var15_5);
                                        var15_5.method4238(var0, var1_1, var9_13, var3_3 + var1_1, -448408016);
                                    }
                                }
                                ++var6_8;
                            }
                        }
                        if (var4_4 < var8_6) break block44;
                        var13_11 = Client.field4782[Client.field4783[var4_4 - var8_6]];
                        ** GOTO lbl-1000
                    }
                    var14_12 = Client.field4859[var16_7[var4_4]];
                    if (var16_7[var4_4] != Client.field4874) {
                        var13_11 = var14_12;
                        ** if (var14_12 == WorldMapScaleHandler.localPlayer) goto lbl-1000
                    }
                    break block45;
lbl-1000:
                    // 2 sources

                    {
                        Projectile.method14469((Actor)var13_11, var4_4, var0, var1_1, var2_2, var3_3, -1449343400);
                        ** GOTO lbl155
                    }
lbl-1000:
                    // 1 sources

                    {
                        var6_8 = var4_4;
                    }
                    break block46;
                }
                var5_10 = var4_4;
                var7_9 = 1;
            }
            ++var4_4;
        }
    }
}

