/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bo")
public class class28 {
    @ObfuscatedName(value="pd")
    @ObfuscatedSignature(descriptor="Lhn;")
    static PcmPlayer field494;

    class28() {
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;ZILfj;B)V", garbageValue="39")
    static void method854(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, boolean bl, int n, class72 class722) {
        if (n == 4) {
            class144.method5992().method3220();
            Login.loginIndex = n;
        }
        if (!Login.clearLoginScreen) {
            Object object = Client.field4740;
            class294.field6004.method11317();
            Client.field4740.method5740(Login.field3215);
            Client.field4740.method5708().vmethod12658(false);
            object = Login.field3215;
            boolean bl2 = !Client.field4740.field4997;
            ((class311)object).field6150 = bl2;
            if (n != 0) {
                Login.loginIndex = n;
            } else {
                class0.method4(bl);
            }
            class722.vmethod10747(-137853416);
            Login.field3174 = HorizontalAlignment.method10448(abstractArchive.method6140("titlewide.jpg", "", (byte)52));
            Login.field3173 = Login.field3174.method13297();
            ScriptEvent.method7673(abstractArchive2, Client.field4748);
            Login.titleboxSprite = TileItemPile.method327(abstractArchive2, "titlebox", "", 1945845894);
            class135.field3505 = Login.titleboxSprite.field7124;
            class73.titlebuttonSprite = TileItemPile.method327(abstractArchive2, "titlebutton", "", -320381817);
            class212.field3988 = TileItemPile.method327(abstractArchive2, "titlebutton_large", "", 1132866946);
            class167.field3780 = TileItemPile.method327(abstractArchive2, "play_now_text", "", -472833272);
            VerticalAlignment.field5936 = TileItemPile.method327(abstractArchive2, "titlebutton_wide42,1", "", 35409407);
            WorldMapScaleHandler.field567 = class18.method348(abstractArchive2, "login_icons", "", 281470117);
            class302.field6080 = class18.method348(abstractArchive2, "title_mute", "", -1328653385);
            class275.field5004 = TileItemPile.method327(abstractArchive2, "options_radio_buttons,0", "", 1353409087);
            class330.field6290 = TileItemPile.method327(abstractArchive2, "options_radio_buttons,4", "", -2016450570);
            WorldMapScaleHandler.field565 = TileItemPile.method327(abstractArchive2, "options_radio_buttons,2", "", 1483877475);
            VerticalAlignment.field5931 = TileItemPile.method327(abstractArchive2, "options_radio_buttons,6", "", 1688148640);
            class300.field6046 = class275.field5004.field7119;
            class65.field2483 = class275.field5004.field7124;
            class272.field4710 = new LoginScreenAnimation(class18.method348(abstractArchive2, "runes", "", 276590059));
            if (bl) {
                Login.Login_username = "";
                Login.Login_password = "";
            }
            Client.field4772 = 0;
            class97.field2749 = "";
            Login.field3195 = true;
            Login.field3202 = false;
            Login.field3181 = 171;
            Login.field3179 = 171;
            Login.field3178 = Login.field3179;
            if (!ServerPacket.clientPreferences.field3166) {
                GraphicsObject.method14440(2, SoundCache.field3312, "scape main", "", 255, false, (byte)-104);
            } else {
                Tile.method7729(2);
            }
            class264.method7607(false, 502692213);
            Login.clearLoginScreen = true;
            Login.field3168 = (class50.field2368 - 765) / 2;
            Login.field3182 = Login.field3168 + 202;
            GameBuild.field2490 = Login.field3182 + 180;
            return;
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Handled impossible loop by adding 'first' condition
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="gq")
    @ObfuscatedSignature(descriptor="(Lax;II)I")
    static final int method855(Widget var0, int var1_2, int var2_3) {
        block35: {
            if (var0.cs1Instructions == null) return -2;
            var2_3 = var0.cs1Instructions.length;
            if (var1_2 >= var2_3) {
                return -2;
            }
            try {
                var0 = var0.cs1Instructions[var1_2];
                var1_2 = 0;
                var2_3 = 0;
                var6_4 /* !! */  = 0;
                break block35;
lbl11:
                // 1 sources

                while (true) {
                    block36: {
                        block38: {
                            block39: {
                                block37: {
                                    if (var8_9 == true) {
                                        var4_6 /* !! */  = Client.field4878[var0[var3_5 /* !! */ ]];
                                        var1_2 = var3_5 /* !! */  + 1;
                                    } else {
                                        var4_6 /* !! */  = 0;
                                        var1_2 = var3_5 /* !! */ ;
                                    }
                                    var3_5 /* !! */  = var1_2;
                                    if (var8_9 == 2) {
                                        var4_6 /* !! */  = Client.field4875[var0[var1_2]];
                                        var3_5 /* !! */  = var1_2 + 1;
                                    }
                                    var5_7 /* !! */  = var3_5 /* !! */ ;
                                    var1_2 = var4_6 /* !! */ ;
                                    if (var8_9 == 3) {
                                        var1_2 = Client.field4862[var0[var3_5 /* !! */ ]];
                                        var5_7 /* !! */  = var3_5 /* !! */  + 1;
                                    }
                                    if (var8_9 != 4) break block37;
                                    var3_5 /* !! */  = var5_7 /* !! */  + 1;
                                    var5_7 /* !! */  = (int)var0[var5_7 /* !! */ ];
                                    var4_6 /* !! */  = var3_5 /* !! */  + 1;
                                    var10_11 /* !! */  = (int[])Client.getWidgetChild((int)(var0[var3_5 /* !! */ ] + (var5_7 /* !! */  << 16)), 1695700067);
                                    var5_7 /* !! */  = var4_6 /* !! */  + 1;
                                    var7_8 /* !! */  = var0[var4_6 /* !! */ ];
                                    var3_5 /* !! */  = var1_2;
                                    var4_6 /* !! */  = var5_7 /* !! */ ;
                                    if (var7_8 /* !! */  == -1) break block38;
                                    if (!class324.ItemDefinition_get((int)var7_8 /* !! */ ).isMembersOnly) break block39;
                                    var3_5 /* !! */  = var1_2;
                                    var4_6 /* !! */  = var5_7 /* !! */ ;
                                    if (!Client.field4738) break block38;
                                    break block39;
                                }
                                var4_6 /* !! */  = var5_7 /* !! */ ;
                                var3_5 /* !! */  = var1_2;
                                break block38;
                            }
                            for (var3_5 /* !! */  = 0; var3_5 /* !! */  < var10_11 /* !! */ .field4603.length; ++var3_5 /* !! */ ) {
                                var4_6 /* !! */  = var1_2;
                                if (var7_8 /* !! */  + true == var10_11 /* !! */ .field4603[var3_5 /* !! */ ]) {
                                    var4_6 /* !! */  = var10_11 /* !! */ .field4600[var3_5 /* !! */ ] + var1_2;
                                }
                                var1_2 = var4_6 /* !! */ ;
                            }
                            var3_5 /* !! */  = var1_2;
                            var4_6 /* !! */  = var5_7 /* !! */ ;
                        }
                        if (var8_9 == 5) {
                            var10_11 /* !! */  = Varps.Varps_main;
                            var1_2 = var4_6 /* !! */  + 1;
                            var3_5 /* !! */  = var10_11 /* !! */ [var0[var4_6 /* !! */ ]];
                        } else {
                            var1_2 = var4_6 /* !! */ ;
                        }
                        var4_6 /* !! */  = var1_2;
                        var5_7 /* !! */  = var3_5 /* !! */ ;
                        if (var8_9 == 6) {
                            var5_7 /* !! */  = Skills.Skills_experienceTable[Client.field4875[var0[var1_2]] - 1];
                            var4_6 /* !! */  = var1_2 + 1;
                        }
                        var3_5 /* !! */  = var4_6 /* !! */ ;
                        var1_2 = var5_7 /* !! */ ;
                        if (var8_9 == 7) {
                            var1_2 = Varps.Varps_main[var0[var4_6 /* !! */ ]] * 100 / 46875;
                            var3_5 /* !! */  = var4_6 /* !! */  + 1;
                        }
                        if (var8_9 == 8) {
                            var1_2 = WorldMapScaleHandler.localPlayer.field7850;
                        }
                        var4_6 /* !! */  = var1_2;
                        if (var8_9 == 9) {
                            for (var4_6 /* !! */  = 0; var4_6 /* !! */  < 25; ++var4_6 /* !! */ ) {
                                var5_7 /* !! */  = var1_2;
                                if (Skills.Skills_enabled[var4_6 /* !! */ ]) {
                                    var5_7 /* !! */  = Client.field4875[var4_6 /* !! */ ] + var1_2;
                                }
                                var1_2 = var5_7 /* !! */ ;
                            }
                            var4_6 /* !! */  = var1_2;
                        }
                        if (var8_9 != 10) ** GOTO lbl101
                        var1_2 = var3_5 /* !! */  + 1;
                        var5_7 /* !! */  = (int)var0[var3_5 /* !! */ ];
                        var3_5 /* !! */  = var1_2 + 1;
                        var10_11 /* !! */  = (int[])Client.getWidgetChild((int)(var0[var1_2] + (var5_7 /* !! */  << 16)), -1835553149);
                        var7_8 /* !! */  = var3_5 /* !! */  + 1;
                        var9_10 = var0[var3_5 /* !! */ ];
                        var1_2 = var4_6 /* !! */ ;
                        var3_5 /* !! */  = (int)var7_8 /* !! */ ;
                        cfr_temp_0 = true;
                        while (true) {
                            block42: {
                                block40: {
                                    block41: {
                                        if (cfr_temp_0 != true || (cfr_temp_0 = false)) continue;
                                        if (var9_10 == -1) break block40;
                                        if (!class324.ItemDefinition_get((int)var9_10).isMembersOnly) break block41;
                                        var1_2 = var4_6 /* !! */ ;
                                        var3_5 /* !! */  = (int)var7_8 /* !! */ ;
                                        if (!Client.field4738) break block40;
                                        break block41;
lbl101:
                                        // 1 sources

                                        var1_2 = var4_6 /* !! */ ;
                                        break block40;
                                    }
                                    var5_7 /* !! */  = 0;
                                    var1_2 = var4_6 /* !! */ ;
                                    var3_5 /* !! */  = (int)var7_8 /* !! */ ;
                                    if (var5_7 /* !! */  >= var10_11 /* !! */ .field4603.length) break block40;
                                    if (var9_10 + true != var10_11 /* !! */ .field4603[var5_7 /* !! */ ]) break block42;
                                    var1_2 = 999999999;
                                    var3_5 /* !! */  = (int)var7_8 /* !! */ ;
                                }
                                if (var8_9 == 11) {
                                    var1_2 = Client.field4892;
                                }
                                if (var8_9 == 12) {
                                    var1_2 = Client.field4897;
                                }
                                var4_6 /* !! */  = var3_5 /* !! */ ;
                                if (var8_9 == 13) {
                                    var10_11 /* !! */  = Varps.Varps_main;
                                    var1_2 = var3_5 /* !! */  + 1;
                                    var3_5 /* !! */  = var10_11 /* !! */ [var0[var3_5 /* !! */ ]];
                                    var4_6 /* !! */  = var1_2 + 1;
                                    var1_2 = (var3_5 /* !! */  & 1 << var0[var1_2]) != 0 ? 1 : 0;
                                }
                                if (var8_9 != 14) break;
                                var1_2 = var4_6 /* !! */  + 1;
                                var4_6 /* !! */  = class285.method10473((int)var0[var4_6 /* !! */ ], -1842570597);
                                break block36;
                            }
                            ++var5_7 /* !! */ ;
                        }
                        var3_5 /* !! */  = var4_6 /* !! */ ;
                        var4_6 /* !! */  = var1_2;
                        var1_2 = var3_5 /* !! */ ;
                    }
                    var3_5 /* !! */  = var8_9 == 15 ? 1 : 0;
                    if (var8_9 == 16) {
                        var3_5 /* !! */  = 2;
                    }
                    if (var8_9 == 17) {
                        var3_5 /* !! */  = 3;
                    }
                    if (var8_9 == 18) {
                        var4_6 /* !! */  = class302.field6082 * -640592827;
                        var4_6 /* !! */  = var4_6 /* !! */  * -1895129459 + (WorldMapScaleHandler.localPlayer.x >> 7);
                    }
                    if (var8_9 == 19) {
                        var4_6 /* !! */  = WorldMapScaleHandler.localPlayer.field7523;
                        var4_6 /* !! */  = (var4_6 /* !! */  * -144332757 >> 7) + class237.field4107;
                    }
                    if (var8_9 == 20) {
                        var4_6 /* !! */  = (int)var0[var1_2];
                        ++var1_2;
                    }
                    if (var3_5 /* !! */  == 0) {
                        var3_5 /* !! */  = var2_3;
                        if (var6_4 /* !! */  == 0) {
                            var3_5 /* !! */  = var4_6 /* !! */  + var2_3;
                        }
                        var2_3 = var3_5 /* !! */ ;
                        if (var6_4 /* !! */  == 1) {
                            var2_3 = var3_5 /* !! */  - var4_6 /* !! */ ;
                        }
                        var3_5 /* !! */  = var2_3;
                        if (var6_4 /* !! */  == 2) {
                            var3_5 /* !! */  = var2_3;
                            if (var4_6 /* !! */  != 0) {
                                var3_5 /* !! */  = var2_3 / var4_6 /* !! */ ;
                            }
                        }
                        var2_3 = var3_5 /* !! */ ;
                        if (var6_4 /* !! */  == 3) {
                            var2_3 = var3_5 /* !! */  * var4_6 /* !! */ ;
                        }
                        var3_5 /* !! */  = 0;
                    }
                    var6_4 /* !! */  = var3_5 /* !! */ ;
                    break;
                }
            }
            catch (Exception var0_1) {
                return -1;
            }
        }
        var3_5 /* !! */  = var1_2 + 1;
        ** while ((var8_9 = var0[var1_2]) != false)
lbl172:
        // 1 sources

        return var2_3;
    }
}

