/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aj")
public class class6 {
    @ObfuscatedName(value="af")
    static final int[] field51 = new int[]{8, 11, 4, 6, 9, 7, 10};
    @ObfuscatedName(value="al")
    public static short[][] field52;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field53;
    @ObfuscatedName(value="ae")
    int[] field57;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=-3490863466993583597L)
    long field58;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(longValue=-3552680165664910009L)
    long field61;
    @ObfuscatedName(value="ai")
    public boolean field59;
    @ObfuscatedName(value="ak")
    int[] field60;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1795679129)
    public int field62;

    static {
        field53 = new EvictingDualNodeHashTable(260, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ldv;ILdv;II)Lcp;")
    public Model method90(SequenceDefinition var1_1, int var2_2, SequenceDefinition var3_3, int var4_4, int var5_5) {
        block24: {
            block25: {
                if (this.field62 != -1) {
                    return ItemContainer.getNpcDefinition(this.field62).method13365((SequenceDefinition)var1_1, (int)var2_3, (SequenceDefinition)var3_4, (int)var4_5, (byte)1);
                }
                var13_7 = this.field58;
                var15_8 = this.field60;
                var18_9 = var15_8;
                var11_10 = var13_7;
                if (var1_1 == null) break block24;
                if (var1_1.field7053 >= 0) break block25;
                var18_9 = var15_8;
                var11_10 = var13_7;
                if (var1_1.field7060 < 0) break block24;
            }
            var15_8 = new int[12];
            for (var5_6 = 0; var5_6 < 12; ++var5_6) {
                var15_8[var5_6] = this.field60[var5_6];
            }
            var9_11 = var13_7;
            if (var1_1.field7053 >= 0) {
                var9_11 = var13_7 + (long)(var1_1.field7053 - this.field60[5] << 40);
                var15_8[5] = var1_1.field7053;
            }
            var18_9 = var15_8;
            var11_10 = var9_11;
            if (var1_1.field7060 >= 0) {
                var11_10 = var9_11 + (long)(var1_1.field7060 - this.field60[3] << 48);
                var15_8[3] = var1_1.field7060;
                var18_9 = var15_8;
            }
        }
        var16_12 = (Model)class6.field53.get(var11_10);
        var17_18 = var16_12;
        if (var16_12 != null) ** GOTO lbl53
        var7_19 = 0;
        var5_6 = 0;
        while (true) {
            block27: {
                block28: {
                    block26: {
                        if (var7_19 >= 12) break block26;
                        var8_21 = var18_9[var7_19];
                        var6_20 = var5_6;
                        if (var8_21 < 256) break block27;
                        var6_20 = var5_6;
                        if (var8_21 >= 512) break block27;
                        var6_20 = var5_6;
                        if (class56.method3840(var8_21 - 256).method12981(68414194)) break block27;
                        break block28;
                    }
                    var15_8 = var16_12;
                    if (var5_6 != 0) {
                        if (this.field61 != -1L) {
                            var16_13 = (Model)class6.field53.get(this.field61);
                        }
                        var15_8 = var16_14;
                        if (var16_14 == null) {
                            return null;
                        }
                    }
                    var17_18 = var15_8;
                    if (var15_8 == null) break;
lbl53:
                    // 2 sources

                    var15_8 = var17_18;
                    ** GOTO lbl99
                }
                var6_20 = 1;
            }
            var5_6 = var6_20;
            if (var8_21 >= 512) {
                var5_6 = var6_20;
                if (!class324.ItemDefinition_get(var8_21 - 512).method13087(this.field59, -1211836692)) {
                    var5_6 = 1;
                }
            }
            ++var7_19;
        }
        var15_8 = new ModelData[12];
        var7_19 = 0;
        var5_6 = 0;
        while (true) {
            if (var7_19 >= 12) break;
            var8_21 = var18_9[var7_19];
            var6_20 = var5_6;
            if (var8_21 >= 256) {
                var6_20 = var5_6;
                if (var8_21 < 512) {
                    var16_16 = class56.method3840(var8_21 - 256).getCountObj(2010077308);
                    var6_20 = var5_6;
                    if (var16_16 != null) {
                        var15_8[var5_6] = var16_16;
                        var6_20 = var5_6 + 1;
                    }
                }
            }
            var5_6 = var6_20;
            if (var8_21 >= 512) {
                var16_17 = class324.ItemDefinition_get(var8_21 - 512).method13094(this.field59, -2113896076);
                var5_6 = var6_20;
                if (var16_17 != null) {
                    var15_8[var6_20] = var16_17;
                    var5_6 = var6_20 + 1;
                }
            }
            ++var7_19;
        }
        var15_8 = new ModelData((ModelData[])var15_8, var5_6);
        var5_6 = 0;
        while (true) {
            block30: {
                block31: {
                    block29: {
                        if (var5_6 >= 5) break block29;
                        if (this.field57[var5_6] >= class6.field52[var5_6].length) break block30;
                        break block31;
                    }
                    var15_8 = var15_8.toModel(64, 850, -30, -50, -30);
                    class6.field53.put((DualNode)var15_8, var11_10);
                    this.field61 = var11_10;
lbl99:
                    // 2 sources

                    if (var1_1 == null && var3_4 == null) {
                        return var15_8;
                    }
                    if (var1_1 != null && var3_4 != null) {
                        return var1_1.method13167((Model)var15_8, (int)var2_3, (SequenceDefinition)var3_4, (int)var4_5, -1878590982);
                    }
                    if (var1_1 == null) return var3_4.method13178((Model)var15_8, (int)var4_5);
                    return var1_1.method13178((Model)var15_8, (int)var2_3);
                }
                var15_8.recolor(GrandExchangeOfferTotalQuantityComparator.field3995[var5_6], class6.field52[var5_6][this.field57[var5_6]]);
            }
            if (this.field57[var5_6] < ByteArrayPool.field3891[var5_6].length) {
                var15_8.recolor(GrandExchangeOfferTotalQuantityComparator.field3994[var5_6], ByteArrayPool.field3891[var5_6][this.field57[var5_6]]);
            }
            ++var5_6;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Lbk;")
    ModelData method92(int n) {
        if (this.field62 != -1) {
            return ItemContainer.getNpcDefinition(this.field62).method13363(2097411);
        }
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            if (n3 >= 12) {
                if (n4 != 0) {
                    return null;
                }
                Object object = new ModelData[12];
                n3 = 0;
                n = 0;
                while (true) {
                    ModelData modelData;
                    if (n3 >= 12) {
                        object = new ModelData((ModelData[])object, n);
                        n = n2;
                        while (true) {
                            if (n >= 5) {
                                return object;
                            }
                            if (this.field57[n] < field52[n].length) {
                                ((ModelData)object).recolor(GrandExchangeOfferTotalQuantityComparator.field3995[n], field52[n][this.field57[n]]);
                            }
                            if (this.field57[n] < ByteArrayPool.field3891[n].length) {
                                ((ModelData)object).recolor(GrandExchangeOfferTotalQuantityComparator.field3994[n], ByteArrayPool.field3891[n][this.field57[n]]);
                            }
                            ++n;
                        }
                    }
                    n5 = this.field60[n3];
                    n4 = n;
                    if (n5 >= 256) {
                        n4 = n;
                        if (n5 < 512) {
                            modelData = class56.method3840(n5 - 256).method12984(1265195152);
                            n4 = n;
                            if (modelData != null) {
                                object[n] = modelData;
                                n4 = n + 1;
                            }
                        }
                    }
                    n = n4;
                    if (n5 >= 512) {
                        modelData = class324.ItemDefinition_get(n5 - 512).method13090(this.field59, (byte)-13);
                        n = n4;
                        if (modelData != null) {
                            object[n4] = modelData;
                            n = n4 + 1;
                        }
                    }
                    ++n3;
                }
            }
            n5 = this.field60[n3];
            n = n4;
            if (n5 >= 256) {
                n = n4;
                if (n5 < 512) {
                    n = n4;
                    if (!class56.method3840(n5 - 256).method12983(849022878)) {
                        n = 1;
                    }
                }
            }
            n4 = n;
            if (n5 >= 512) {
                n4 = n;
                if (!class324.ItemDefinition_get(n5 - 512).method13092(this.field59, (byte)108)) {
                    n4 = 1;
                }
            }
            ++n3;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)Ldb;", garbageValue="13")
    public static VarbitDefinition method74(int n) {
        Object object = VarbitDefinition.field6828;
        long l = n;
        if ((object = (VarbitDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = VarbitDefinition.field6826.takeFile(32, n);
        VarbitDefinition varbitDefinition = new VarbitDefinition();
        if (object != null) {
            varbitDefinition.decodeNext(new Buffer((byte[])object), -743974440);
        }
        VarbitDefinition.field6828.put(varbitDefinition, l);
        return varbitDefinition;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="-35")
    public static int method72(int n, int n2, int n3) {
        if ((n3 &= 3) == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n;
        }
        if (n3 == 2) {
            return 7 - n2;
        }
        return n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="-900473863")
    public static void method75(AbstractArchive abstractArchive) {
        class374.field6974 = abstractArchive;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(Loc;Loc;Loc;ZLfj;I)V")
    static void method79(class399 object, class399 class3992, class399 object2, boolean bl, class72 class722, int n) {
        class722.vmethod10747(278379824);
        Login.field3168 = (class50.field2368 - 765) / 2;
        Login.field3182 = Login.field3168 + 202;
        GameBuild.field2490 = Login.field3182 + 180;
        if (!Login.field3202) {
            long l = class363.currentTimeMillis();
            if (Login.field3214 == -1L) {
                Login.field3212 = l + 300L;
                Login.field3214 = Login.field3212 - -600L;
            }
            if (l >= Login.field3212) {
                int n2;
                int n3;
                Object object3;
                int n4;
                float f;
                if (l < Login.field3214) {
                    f = (float)(Login.field3214 - l) / 600.0f;
                    n = (int)((float)(class722.field2525 / 2) * Login.field3211.vmethod10991(1.0f - f));
                    class722.method4238(GameBuild.field2490 - n, 0, n + GameBuild.field2490, 503, -448408016);
                }
                class156.method6303(class722, 1511352543);
                if (Client.gameState == 0 || Client.gameState == 5) {
                    ((class399)object).method13844("Old School RuneScape is loading - please wait...", Login.field3182 + 180, Login.field3179 + 100 - 26 - 20, 0xFFFFFF, -1, class722);
                    n4 = Login.field3179 + 100 - 18 - 20;
                    class722.method4255(Login.field3182 + 180 - 152, n4, 304, 34, 0x8C1111);
                    class722.method4255(Login.field3182 + 180 - 151, n4 + 1, 302, 32, 0);
                    n = Login.field3182 * 286397143;
                    class722.vmethod10762(n * -944307993 + 180 - 150, n4 += 2, Login.field3177 * 15, 30, 0x8C1111, (byte)-10);
                    n = Login.field3182 * 286397143;
                    class722.vmethod10762(n * -944307993 + 180 - 150 + Login.field3177 * 15, n4, 300 - Login.field3177 * 15, 30, 0, (byte)-36);
                    if (Client.field4740.method5714(526409609) == 3) {
                        Login.field3176 = "Initialising game";
                    }
                    ((class399)object).method13844(Login.field3176, Login.field3182 + 180, Login.field3179 + 100 + 5 - 20, 0xFFFFFF, -1, class722);
                }
                if (Client.gameState == 20 || Login.loginIndex == 20) {
                    class722.vmethod10757(Login.titleboxSprite, Login.field3182 + 180 - Login.titleboxSprite.field7119 / 2, Login.field3179 + 100 - Login.titleboxSprite.field7124 / 2, -1713248280);
                    n = Login.field3179 + 100 - 70;
                    ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                    ((class399)object).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                    ((class399)object).method13844(Login.Login_response3, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                    n = n + 15 + 7;
                    if (Login.loginIndex != 4 && Login.loginIndex != 0 && Login.loginIndex != 10 && Login.loginIndex != 20 && Login.loginIndex != 18 && Login.loginIndex != 16 && Login.loginIndex != 1) {
                        ((class399)object).method13830("Login: ", Login.field3182 + 180 - 110, n, 0xFFFFFF, 0, class722);
                        object3 = class299.method10986();
                        while (((class399)object).method13851((String)object3) > 200) {
                            object3 = ((String)object3).substring(0, ((String)object3).length() - 1);
                        }
                        ((class399)object).method13830(class399.escapeBrackets((String)object3), Login.field3182 + 180 - 70, n, 0xFFFFFF, 0, class722);
                        object3 = class212.method6894(Login.Login_password);
                        while (((class399)object).method13851((String)object3) > 200) {
                            object3 = ((String)object3).substring(1);
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Password: ");
                        stringBuilder.append((String)object3);
                        ((class399)object).method13830(stringBuilder.toString(), Login.field3182 + 180 - 108, n + 15, 0xFFFFFF, 0, class722);
                    }
                    if (Login.loginIndex == 20) {
                        ModeWhere.findItemDefinitions(Login.Login_password, Client.field4740.field4997);
                    }
                }
                if (Client.gameState == 10 || Client.gameState == 11) {
                    class722.vmethod10757(Login.titleboxSprite, Login.field3182, Login.field3179, -1713248280);
                    if (Login.loginIndex != 0) {
                        if (Login.loginIndex != 1) {
                            if (Login.loginIndex != 2) {
                                if (Login.loginIndex != 3) {
                                    if (Login.loginIndex != 4) {
                                        if (Login.loginIndex != 5) {
                                            if (Login.loginIndex != 6) {
                                                if (Login.loginIndex != 7) {
                                                    if (Login.loginIndex != 8) {
                                                        if (Login.loginIndex != 9) {
                                                            if (Login.loginIndex != 10) {
                                                                if (Login.loginIndex != 11) {
                                                                    if (Login.loginIndex != 12) {
                                                                        if (Login.loginIndex == 13) {
                                                                            n = Login.field3179 + 100 - 40;
                                                                            ((class399)object2).method13844("You must accept our Terms & Conditions", Login.field3182 + 180, n, 0xFFFFFF, 0, class722);
                                                                            ((class399)object2).method13844("and Privacy Policy before using the app.", Login.field3182 + 180, n + 20, 0xFFFFFF, 0, class722);
                                                                            n = Login.field3182 + 180;
                                                                            n4 = Login.field3179 + 40 + 100;
                                                                            class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                                            ((class399)object).method13844("Back", n, n4 + 5, 0xFFFFFF, 0, class722);
                                                                        } else if (Login.loginIndex == 14) {
                                                                            n = Login.field3179 + 100 - 70;
                                                                            switch (Login.field3187) {
                                                                                default: {
                                                                                    class0.method4(false);
                                                                                    break;
                                                                                }
                                                                                case 1: {
                                                                                    ParamDefinition.method13223("Account locked as we suspect it has been stolen.", Strings.field2854, "");
                                                                                    break;
                                                                                }
                                                                                case 0: {
                                                                                    ParamDefinition.method13223(Strings.field2832, Strings.field2823, "");
                                                                                }
                                                                            }
                                                                            ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                                            ((class399)object2).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                                                                            ((class399)object2).method13844(Login.Login_response3, Login.field3182 + 180, n + 15, 0xFFFF00, 0, class722);
                                                                            n = Login.field3182 + 180;
                                                                            n4 = Login.field3179 + 100 + 5;
                                                                            class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                                            ((class399)object).method13844(Strings.field2816, n, n4 + 5, 0xFFFFFF, 0, class722);
                                                                            n = Login.field3182 + 180;
                                                                            n4 = Login.field3179 + 100 + 55;
                                                                            class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                                            ((class399)object).method13844("Back", n, n4 + 5, 0xFFFFFF, 0, class722);
                                                                        } else if (Login.loginIndex != 16 && Login.loginIndex != 19) {
                                                                            if (Login.loginIndex != 17 && Login.loginIndex != 18) {
                                                                                if (Login.loginIndex != 15 && Login.loginIndex != 23 && Login.loginIndex != 25) {
                                                                                    if (Login.loginIndex != 21) {
                                                                                        if (Login.loginIndex != 22) {
                                                                                            if (Login.loginIndex == 24) {
                                                                                                n = Login.field3179 + 100 - 50;
                                                                                                ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                                                                ((class399)object2).method13844(Login.Login_response2, Login.field3182 + 180, n += 25, 0xFFFF00, 0, class722);
                                                                                                ((class399)object2).method13844(Login.Login_response3, Login.field3182 + 180, n + 25, 0xFFFF00, 0, class722);
                                                                                                n = Login.field3182 + 180;
                                                                                                n4 = Login.field3179 + 40 + 100;
                                                                                                class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                                                                ((class399)object).method13844(Strings.field2772, n, n4 + 5, 0xFFFFFF, 0, class722);
                                                                                            }
                                                                                        } else {
                                                                                            n = Login.field3179 + 100 - 50;
                                                                                            ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                                                            ((class399)object2).method13844(Login.Login_response2, Login.field3182 + 180, n += 25, 0xFFFF00, 0, class722);
                                                                                            ((class399)object2).method13844(Login.Login_response3, Login.field3182 + 180, n + 25, 0xFFFF00, 0, class722);
                                                                                            n = Login.field3182 + 180;
                                                                                            n4 = Login.field3179 + 30 + 100;
                                                                                            class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                                                            ((class399)object).method13844("Update App", n, n4 + 5, 0xFFFFFF, 0, class722);
                                                                                        }
                                                                                    } else {
                                                                                        n = GameBuild.field2490;
                                                                                        n4 = Login.field3179 + 100 - 55;
                                                                                        ((class399)object2).method13844("Additional data (less than 100MB) will be", n, n4, 0xFFFFFF, 0, class722);
                                                                                        ((class399)object2).method13844("downloaded while you play. We recommend", n, n4 += 17, 0xFFFFFF, 0, class722);
                                                                                        ((class399)object2).method13844("playing over Wi-Fi during your first adventure", n, n4 += 17, 0xFFFFFF, 0, class722);
                                                                                        ((class399)object2).method13844("to avoid additional data charges.", n, n4 + 17, 0xFFFFFF, 0, class722);
                                                                                        n4 = GameBuild.field2490 - 80;
                                                                                        n3 = Login.field3179 + 40 + 100;
                                                                                        object2 = class73.titlebuttonSprite;
                                                                                        n = n3 - 20;
                                                                                        class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                                                                        object2 = "Accept";
                                                                                        ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                                                                                        n4 = GameBuild.field2490 + 80;
                                                                                        class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                                                                        ((class399)object).method13844("Cancel", n4, n3, 0xFFFFFF, 0, class722);
                                                                                    }
                                                                                } else {
                                                                                    n = Login.field3179 + 100 - 50;
                                                                                    ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                                                    ((class399)object).method13844(Login.Login_response2, Login.field3182 + 180, n += 25, 0xFFFF00, 0, class722);
                                                                                    ((class399)object).method13844(Login.Login_response3, Login.field3182 + 180, n + 25, 0xFFFF00, 0, class722);
                                                                                }
                                                                            } else {
                                                                                n = Login.field3179 + 100 - 70;
                                                                                ((class399)object).method13844(Login.Login_response1, GameBuild.field2490, n, 0xFFFF00, 0, class722);
                                                                                ((class399)object).method13844(Login.Login_response2, GameBuild.field2490, n += 15, 0xFFFF00, 0, class722);
                                                                                ((class399)object).method13844(Login.Login_response3, GameBuild.field2490, n + 15, 0xFFFF00, 0, class722);
                                                                            }
                                                                        } else {
                                                                            n = Login.field3179 + 100 - 70;
                                                                            ((class399)object).method13844(Login.Login_response1, GameBuild.field2490, n, 0xFFFF00, 0, class722);
                                                                            ((class399)object).method13844(Login.Login_response2, GameBuild.field2490, n += 15, 0xFFFF00, 0, class722);
                                                                            ((class399)object).method13844(Login.Login_response3, GameBuild.field2490, n + 15, 0xFFFF00, 0, class722);
                                                                            object2 = Login.loginIndex == 16 ? "Apply" : "Retry";
                                                                            n4 = Login.field3182 * 286397143;
                                                                            n = Login.field3179 * 1027759025;
                                                                            object3 = class73.titlebuttonSprite;
                                                                            n4 = n4 * -944307993 + 180 - 80 - 73;
                                                                            n = n * -1876357807 + 100 + 20 - 20;
                                                                            class722.vmethod10757((IndexedSprite)object3, n4, n, -1713248280);
                                                                            ((class399)object).method13840((String)object2, n4, n, 144, 40, 0xFFFFFF, 0, 1, 1, 0, class722);
                                                                            n4 = Login.field3182 * 286397143;
                                                                            object2 = class73.titlebuttonSprite;
                                                                            n4 = n4 * -944307993 + 180 + 80 - 73;
                                                                            class722.vmethod10757((IndexedSprite)object2, n4, n, -1713248280);
                                                                            ((class399)object).method13840("Skip", n4, n, 144, 40, 0xFFFFFF, 0, 1, 1, 0, class722);
                                                                        }
                                                                    } else {
                                                                        n = GameBuild.field2490;
                                                                        n4 = Login.field3179 + 100 - 55;
                                                                        ((class399)object2).method13844("Before using the app, please read and accept our", n, n4, 0xFFFFFF, 0, class722);
                                                                        ((class399)object2).method13844(Strings.field3137, n, n4 += 17, 0xFFFFFF, 0, class722);
                                                                        ((class399)object2).method13844("\"Accept\", you agree to the terms laid out in those", n, n4 += 17, 0xFFFFFF, 0, class722);
                                                                        ((class399)object2).method13844("documents and that you are at least 13 years of age.", n, n4 + 17, 0xFFFFFF, 0, class722);
                                                                        n4 = GameBuild.field2490 - 80;
                                                                        n3 = Login.field3179 + 40 + 100;
                                                                        object2 = class73.titlebuttonSprite;
                                                                        n = n3 - 20;
                                                                        class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                                                        object2 = "Accept";
                                                                        ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                                                                        n4 = GameBuild.field2490 + 80;
                                                                        class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                                                        ((class399)object).method13844("Decline", n4, n3, 0xFFFFFF, 0, class722);
                                                                    }
                                                                } else {
                                                                    n = Login.field3179 * 1027759025;
                                                                    ((class399)object).method13844("Are you sure you want to sign out?", Login.field3182 + 180, n * -1876357807 + 100 - 20, 0xFFFF00, 0, class722);
                                                                    n4 = Login.field3182 + 180 - 80;
                                                                    n3 = Login.field3179 + 100 + 20;
                                                                    object2 = class73.titlebuttonSprite;
                                                                    n = n3 - 20;
                                                                    class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                                                    ((class399)object).method13844("Yes", n4, n3 += 5, 0xFFFFFF, 0, class722);
                                                                    n4 = Login.field3182 + 180 + 80;
                                                                    class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                                                    ((class399)object).method13844("No", n4, n3, 0xFFFFFF, 0, class722);
                                                                }
                                                            } else {
                                                                n = Login.field3182 + 180;
                                                                n4 = Login.field3179 + 38;
                                                                ((class399)object).method13844("Welcome to Old School RuneScape", Login.field3182 + 180, n4, 0xFFFF00, 0, class722);
                                                                class722.vmethod10757(class212.field3988, n - 109, n4 += 20, -1713248280);
                                                                if (Varcs.method9(Login.field3193).isEmpty()) {
                                                                    class722.vmethod10757(class167.field3780, n - 48, n4 + 18, -1713248280);
                                                                } else {
                                                                    class722.vmethod10757(class167.field3780, n - 48, n4 + 5, -1713248280);
                                                                    ((class399)object).method13844(Login.field3193, n, n4 + 68 - 15, 0xFFFF00, 0, class722);
                                                                }
                                                                n4 = Login.field3179 + 40 + 100;
                                                                class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4, -1713248280);
                                                                ((class399)object).method13844("Sign out", n, n4 + 25, 0xFFFFFF, 0, class722);
                                                            }
                                                        } else {
                                                            n = Login.field3179 + 100 - 50;
                                                            ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                            ((class399)object).method13844(Login.Login_response2, Login.field3182 + 180, n += 25, 0xFFFF00, 0, class722);
                                                            ((class399)object).method13844(Login.Login_response3, Login.field3182 + 180, n + 25, 0xFFFF00, 0, class722);
                                                            n = Login.field3182 + 180;
                                                            n4 = Login.field3179 + 40 + 100;
                                                            class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                            ((class399)object).method13844("Try again", n, n4 + 5, 0xFFFFFF, 0, class722);
                                                        }
                                                    } else {
                                                        n = Login.field3179 + 100 - 55;
                                                        ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                        ((class399)object2).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                                                        ((class399)object2).method13844(Login.Login_response3, Login.field3182 + 180, n + 15, 0xFFFF00, 0, class722);
                                                        n4 = Login.field3182 + 180 - 80;
                                                        n3 = Login.field3179 + 100 + 50;
                                                        object2 = class73.titlebuttonSprite;
                                                        n = n3 - 20;
                                                        class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                                        object2 = "Terms & Conditions";
                                                        ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                                                        n4 = Login.field3182 + 180 + 80;
                                                        class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                                        ((class399)object).method13844("Back", n4, n3, 0xFFFFFF, 0, class722);
                                                    }
                                                } else {
                                                    n = Login.field3179 + 100 - 55;
                                                    ((class399)object).method13844("Your date of birth isn't set.", Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                    ((class399)object2).method13844("Please verify your account status by", Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                                                    ((class399)object2).method13844("setting your date of birth.", Login.field3182 + 180, n + 15, 0xFFFF00, 0, class722);
                                                    n4 = Login.field3182 + 180 - 80;
                                                    n3 = Login.field3179 + 100 + 50;
                                                    object2 = class73.titlebuttonSprite;
                                                    n = n3 - 20;
                                                    class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                                    object2 = "Set Date of Birth";
                                                    ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                                                    n4 = Login.field3182 + 180 + 80;
                                                    class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                                    ((class399)object).method13844("Back", n4, n3, 0xFFFFFF, 0, class722);
                                                }
                                            } else {
                                                n = Login.field3179 + 100 - 70;
                                                ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                                ((class399)object).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                                                ((class399)object).method13844(Login.Login_response3, Login.field3182 + 180, n + 15, 0xFFFF00, 0, class722);
                                                n = Login.field3182 + 180;
                                                n4 = Login.field3179 + 100 + 50;
                                                class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                                ((class399)object).method13844("Back", n, n4 + 5, 0xFFFFFF, 0, class722);
                                            }
                                        } else {
                                            ((class399)object).method13844("Forgotten your Old School password?", Login.field3182 + 180, Login.field3179 + 100 - 70, 0xFFFF00, 0, class722);
                                            n = Login.field3179 + 100 - 50;
                                            ((class399)object2).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                            ((class399)object2).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                                            ((class399)object2).method13844(Login.Login_response3, Login.field3182 + 180, n += 15, 0xFFFF00, 0, class722);
                                            n = n + 15 + 14;
                                            ((class399)object).method13830("Username/email: ", Login.field3182 + 180 - 145, n, 0xFFFFFF, 0, class722);
                                            object2 = class299.method10986();
                                            while (((class399)object).method13851((String)object2) > 174) {
                                                object2 = ((String)object2).substring(1);
                                            }
                                            object3 = new StringBuilder();
                                            ((StringBuilder)object3).append(class399.escapeBrackets((String)object2));
                                            if (Client.cycle % 40 < 20) {
                                                object2 = new StringBuilder();
                                                ((StringBuilder)object2).append(class63.colorStartTag(0xFFFF00));
                                                ((StringBuilder)object2).append(class145.field3603);
                                                object2 = ((StringBuilder)object2).toString();
                                            } else {
                                                object2 = "";
                                            }
                                            ((StringBuilder)object3).append((String)object2);
                                            ((class399)object).method13830(((StringBuilder)object3).toString(), Login.field3182 + 180 - 34, n, 0xFFFFFF, 0, class722);
                                            n4 = Login.field3182 + 180 - 80;
                                            n3 = Login.field3179 + 100 + 50;
                                            object2 = class73.titlebuttonSprite;
                                            n = n3 - 20;
                                            class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                            object2 = "Recover";
                                            ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                                            n4 = Login.field3182 + 180 + 80;
                                            class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                            ((class399)object).method13844("Back", n4, n3, 0xFFFFFF, 0, class722);
                                            n = Login.field3179 * 1027759025;
                                            class3992.method13844("Still having trouble logging in?", GameBuild.field2490, n * -1876357807 + 100 + 85, 0xFFFFFF, 0, class722);
                                        }
                                    } else {
                                        ((class399)object).method13844("Authenticator", Login.field3182 + 180, Login.field3179 + 100 - 70, 0xFFFF00, 0, class722);
                                        n = Login.field3179 + 100 - 35;
                                        ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFFFF, 0, class722);
                                        ((class399)object).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFFFF, 0, class722);
                                        ((class399)object).method13844(Login.Login_response3, Login.field3182 + 180, n += 15, 0xFFFFFF, 0, class722);
                                        n += 15;
                                        object3 = new StringBuilder();
                                        ((StringBuilder)object3).append("PIN: ");
                                        ((StringBuilder)object3).append(class212.method6894(class97.field2749));
                                        if (Client.cycle % 40 < 20) {
                                            object2 = new StringBuilder();
                                            ((StringBuilder)object2).append(class63.colorStartTag(0xFFFF00));
                                            ((StringBuilder)object2).append(class145.field3603);
                                            object2 = ((StringBuilder)object2).toString();
                                        } else {
                                            object2 = "";
                                        }
                                        ((StringBuilder)object3).append((String)object2);
                                        ((class399)object).method13830(((StringBuilder)object3).toString(), Login.field3182 + 180 - 108, n, 0xFFFFFF, 0, class722);
                                        ((class399)object).method13830(Strings.field2766, Login.field3182 + 180 - 9, n -= 8, 0xFFFF00, 0, class722);
                                        ((class399)object).method13830(Strings.field2770, Login.field3182 + 180 - 9, n += 15, 0xFFFF00, 0, class722);
                                        n4 = Login.field3182 * 286397143;
                                        n3 = ((class399)object).method13851(Strings.field2770);
                                        n2 = ((class399)object).field7300;
                                        object2 = Login.field3195 ? WorldMapScaleHandler.field565 : class275.field5004;
                                        class722.vmethod10757((IndexedSprite)object2, n4 * -944307993 + 180 - 9 + n3 + 15, n - n2, -1713248280);
                                        n2 = Login.field3182 + 180 - 80;
                                        n = Login.field3179 + 100 + 50;
                                        object2 = class73.titlebuttonSprite;
                                        n4 = n - 20;
                                        class722.vmethod10757((IndexedSprite)object2, n2 - 73, n4, -1713248280);
                                        object2 = Strings.field2774;
                                        n3 = n + 5;
                                        ((class399)object).method13844((String)object2, n2, n3, 0xFFFFFF, 0, class722);
                                        n2 = Login.field3182 + 180 + 80;
                                        class722.vmethod10757(class73.titlebuttonSprite, n2 - 73, n4, -1713248280);
                                        ((class399)object).method13844("Cancel", n2, n3, 0xFFFFFF, 0, class722);
                                        class3992.method13844("<u=ff>Can't Log In?</u>", Login.field3182 + 180, n + 36, 255, 0, class722);
                                    }
                                } else {
                                    n = Login.field3179 + 100 - 70;
                                    ((class399)object).method13844("Invalid credentials.", Login.field3182 + 180, n, 0xFFFF00, 0, class722);
                                    class3992.method13844("For accounts created after 24th November 2010, please use your", Login.field3182 + 180, n += 20, 0xFFFF00, 0, class722);
                                    class3992.method13844("email address to login. Otherwise please login with your username.", Login.field3182 + 180, n + 15, 0xFFFF00, 0, class722);
                                    n = Login.field3182 + 180;
                                    n4 = Login.field3179 + 100 + 5;
                                    class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                    ((class399)object2).method13844("Try again", n, n4 + 5, 0xFFFFFF, 0, class722);
                                    n = Login.field3182 + 180;
                                    n4 = Login.field3179 + 100 + 55;
                                    class722.vmethod10757(class73.titlebuttonSprite, n - 73, n4 - 20, -1713248280);
                                    ((class399)object2).method13844("Forgotten password?", n, n4 + 5, 0xFFFFFF, 0, class722);
                                }
                            } else {
                                n = Login.field3179 + 100 - 70;
                                ((class399)object).method13844(Login.Login_response1, GameBuild.field2490, n, 0xFFFF00, 0, class722);
                                ((class399)object).method13844(Login.Login_response2, GameBuild.field2490, n += 15, 0xFFFF00, 0, class722);
                                ((class399)object).method13844(Login.Login_response3, GameBuild.field2490, n += 15, 0xFFFF00, 0, class722);
                                n3 = n + 15 + 7;
                                ((class399)object).method13830("Login: ", GameBuild.field2490 - 110, n3, 0xFFFFFF, 0, class722);
                                object2 = class299.method10986();
                                while (((class399)object).method13851((String)object2) > 200) {
                                    object2 = ((String)object2).substring(1);
                                }
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append(class399.escapeBrackets((String)object2));
                                n = Login.currentLoginField != 0 ? 0 : 1;
                                n4 = Client.cycle % 40 >= 20 ? 0 : 1;
                                if ((n & n4) == 0) {
                                    object2 = "";
                                } else {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append(class63.colorStartTag(0xFFFF00));
                                    ((StringBuilder)object2).append(class145.field3603);
                                    object2 = ((StringBuilder)object2).toString();
                                }
                                ((StringBuilder)object3).append((String)object2);
                                ((class399)object).method13830(((StringBuilder)object3).toString(), GameBuild.field2490 - 70, n3, 0xFFFFFF, 0, class722);
                                object2 = class212.method6894(Login.Login_password);
                                while (((class399)object).method13851((String)object2) > 200) {
                                    object2 = ((String)object2).substring(1);
                                }
                                object3 = new StringBuilder();
                                ((StringBuilder)object3).append("Password: ");
                                ((StringBuilder)object3).append((String)object2);
                                n = Login.currentLoginField != 1 ? 0 : 1;
                                n4 = Client.cycle % 40 >= 20 ? 0 : 1;
                                if ((n4 & n) == 0) {
                                    object2 = "";
                                } else {
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append(class63.colorStartTag(0xFFFF00));
                                    ((StringBuilder)object2).append(class145.field3603);
                                    object2 = ((StringBuilder)object2).toString();
                                }
                                ((StringBuilder)object3).append((String)object2);
                                ((class399)object).method13830(((StringBuilder)object3).toString(), GameBuild.field2490 - 108, n3 + 15, 0xFFFFFF, 0, class722);
                                n4 = Login.field3179 + 106;
                                n3 = GameBuild.field2490 - 117;
                                object2 = class94.method4846(Client.Login_isUsernameRemembered, Login.field3191);
                                class722.vmethod10757((IndexedSprite)object2, n3, n4, -1713248280);
                                n2 = ((IndexedSprite)object2).field7119;
                                object2 = "Remember username";
                                n = n4 + 13;
                                class3992.method13830((String)object2, n3 + n2 + 5, n, 0xFFFF00, 0, class722);
                                n3 = GameBuild.field2490 + 24;
                                object2 = class94.method4846(ServerPacket.clientPreferences.hideUsername, Login.field3197);
                                class722.vmethod10757((IndexedSprite)object2, n3, n4, -1713248280);
                                n4 = ((IndexedSprite)object2).field7119;
                                class3992.method13830("Hide username", n3 + n4 + 5, n, 0xFFFF00, 0, class722);
                                n4 = GameBuild.field2490 - 80;
                                n3 = Login.field3179 + 100 + 50;
                                object2 = class73.titlebuttonSprite;
                                n = n3 - 20;
                                class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                                object2 = "Login";
                                ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                                n4 = GameBuild.field2490 + 80;
                                class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                                ((class399)object).method13844("Cancel", n4, n3, 0xFFFFFF, 0, class722);
                                n = Login.field3179 + 100 + 86;
                                class372.field6951 = Login.field3189 != 2 ? "<col=ffffff>Can't login?" : "Having trouble logging in?";
                                class379.field7075 = new Bounds(GameBuild.field2490, n, class3992.method13851(class372.field6951), 11);
                                class290.field5983 = new Bounds(GameBuild.field2490, n, class3992.method13851("Still having trouble logging in?"), 11);
                                class3992.method13844(class372.field6951, GameBuild.field2490, n, 0xFFFFFF, 0, class722);
                                if (Client.field4740.method5714(526409609) == 3 || Client.field4740.method5714(526409609) == 2) {
                                    n = Login.field3179 + 210;
                                    n4 = GameBuild.field2490 - VerticalAlignment.field5936.field7119 / 2;
                                    class722.vmethod10757(VerticalAlignment.field5936, n4, n, -1713248280);
                                    class722.vmethod10757(WorldMapScaleHandler.field567[0], n4 + 5, n + 4, -1713248280);
                                    n4 = WorldMapScaleHandler.field567[1].field7119 / 2;
                                    n3 = GameBuild.field2490 * 26444197;
                                    ((class399)object).method13844("Create RuneScape account", n4 + n3 * 2026339885 + 3, n + 26, 0xFFFFFF, 0, class722);
                                }
                            }
                        } else {
                            ((class399)object).method13844(Login.field3190, Login.field3182 + 180, Login.field3179 + 100 - 70, 0xFFFF00, 0, class722);
                            n = Login.field3179 + 100 - 35;
                            ((class399)object).method13844(Login.Login_response1, Login.field3182 + 180, n, 0xFFFFFF, 0, class722);
                            ((class399)object).method13844(Login.Login_response2, Login.field3182 + 180, n += 15, 0xFFFFFF, 0, class722);
                            ((class399)object).method13844(Login.Login_response3, Login.field3182 + 180, n + 15, 0xFFFFFF, 0, class722);
                            n4 = Login.field3182 + 180 - 80;
                            n3 = Login.field3179 + 100 + 50;
                            object2 = class73.titlebuttonSprite;
                            n = n3 - 20;
                            class722.vmethod10757((IndexedSprite)object2, n4 - 73, n, -1713248280);
                            object2 = Strings.field2774;
                            ((class399)object).method13844((String)object2, n4, n3 += 5, 0xFFFFFF, 0, class722);
                            n4 = Login.field3182 + 180 + 80;
                            class722.vmethod10757(class73.titlebuttonSprite, n4 - 73, n, -1713248280);
                            ((class399)object).method13844("Cancel", n4, n3, 0xFFFFFF, 0, class722);
                        }
                    } else {
                        n = Login.field3179 * 1027759025;
                        n4 = Login.field3182 + 180;
                        object2 = Client.field4740.method5708().vmethod12647();
                        if (object2 == null || !((class18)object2).method548() && !((class18)object2).vmethod10046()) {
                            ((class399)object).method13844("Welcome to Old School RuneScape", Login.field3182 + 180, n * -1876357807 + 100 - 20, 0xFFFF00, 0, class722);
                            n = Login.field3179 * 1027759025;
                            object2 = class73.titlebuttonSprite;
                            n4 = n4 - 80 - 73;
                            n = n * -1876357807 + 100 + 20 - 20;
                            class722.vmethod10757((IndexedSprite)object2, n4, n, -1713248280);
                            ((class399)object).method13840("New User", n4, n, 144, 40, 0xFFFFFF, 0, 1, 1, 0, class722);
                            n4 = Login.field3182 * 286397143;
                            object2 = class73.titlebuttonSprite;
                            n4 = n4 * -944307993 + 180 + 80 - 73;
                            class722.vmethod10757((IndexedSprite)object2, n4, n, -1713248280);
                            ((class399)object).method13840("Existing User", n4, n, 144, 40, 0xFFFFFF, 0, 1, 1, 0, class722);
                        } else {
                            n = 0;
                            if (!((class18)object2).method548()) {
                                if (!((class18)object2).vmethod10046()) {
                                    object2 = "";
                                } else {
                                    object2 = "Continue with Google";
                                    n = 2;
                                }
                            } else {
                                object2 = "Continue with Game Center";
                                n = 1;
                            }
                            n3 = Login.field3179 * 1027759025;
                            ((class399)object).method13844("Welcome to Old School RuneScape", Login.field3182 + 180, n3 * -1876357807 + 100 - 56, 0xFFFF00, 0, class722);
                            n2 = Login.field3179 + 100 - 42;
                            n3 = n4 - VerticalAlignment.field5936.field7119 / 2;
                            class722.vmethod10757(VerticalAlignment.field5936, n3, n2, -1713248280);
                            class722.vmethod10757(WorldMapScaleHandler.field567[n], n3 + 4, n2 + 4, -1713248280);
                            n = WorldMapScaleHandler.field567[n].field7119 / 2 + GameBuild.field2490 + 3;
                            ((class399)object).method13844((String)object2, n, n2 + 26, 0xFFFFFF, 0, class722);
                            n2 = n2 + VerticalAlignment.field5936.field7124 + 6;
                            class722.vmethod10757(VerticalAlignment.field5936, n4 - VerticalAlignment.field5936.field7119 / 2, n2, -1713248280);
                            class722.vmethod10757(WorldMapScaleHandler.field567[0], n3 + 5, n2 + 4, -1713248280);
                            ((class399)object).method13844("Continue with RuneScape account", n, n2 + 26, 0xFFFFFF, 0, class722);
                        }
                        if (Client.field4740.method5714(526409609) != 3) {
                            n2 = Login.field3179 + 100 + 74;
                            if (Login.field3217 != -1L && l >= Login.field3217 && (-1L == Login.field3213 || l < Login.field3213 + 5000L)) {
                                int n5;
                                int n6;
                                object2 = ParamDefinition.method13221();
                                n = class3992.method13851("All game data synchronised");
                                int n7 = Login.field3182 + 180 - 150;
                                if (object2 == null) {
                                    object2 = "All game data synchronised";
                                    n4 = 300;
                                    n3 = 9226041;
                                } else {
                                    n3 = HealthBarUpdate.method11219(251262781);
                                    n4 = n3 * 300 / 10000;
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("Synchronising game data - ");
                                    ((StringBuilder)object2).append("99.11%");
                                    n = class3992.method13851(((StringBuilder)object2).toString());
                                    object2 = new StringBuilder();
                                    ((StringBuilder)object2).append("Synchronising game data - ");
                                    ((StringBuilder)object2).append(Login.field3210.format((float)n3 / 100.0f));
                                    ((StringBuilder)object2).append("%");
                                    object2 = ((StringBuilder)object2).toString();
                                    n3 = 3261415;
                                }
                                f = -1L != Login.field3213 && l > Login.field3213 + 4700L ? 1.0f - (float)(l - Login.field3213 - 4700L) / 300.0f : (l < Login.field3217 + 300L ? (float)(l - Login.field3217) / 300.0f : 1.0f);
                                class722.method4245(Login.field3216);
                                if (f != 1.0f) {
                                    n6 = (int)(Login.field3206.vmethod10991(f) * 304.0f);
                                    n5 = Login.field3182 + 180 - n6 / 2;
                                    int n8 = n2 - 14;
                                    class722.method4238(n5, n8, n6 + n5, n8 + 20, -448408016);
                                }
                                n6 = (int)(128.0f * f);
                                n5 = (int)(f * 255.0f);
                                class722.method4253(n7 - 2, n2 - 14, 304, 20, n3, n6);
                                class722.vmethod10751(n7, n2 - 12, n4, 16, n3, n6, -1623024466);
                                class3992.method13831((String)object2, Login.field3182 + 180 - n / 2, n2, 0xFFFFFF, 0, n5, class722);
                                class722.method4240(Login.field3216);
                            }
                        }
                    }
                }
                if (l >= Login.field3214) {
                    class272.field4710.method5669(Login.field3168 - 22, Client.cycle, class722, -2039405333);
                    class272.field4710.method5669(Login.field3168 + 22 + 765 - 128, Client.cycle, class722, -1918997465);
                }
                object2 = class302.field6080;
                n = !ServerPacket.clientPreferences.field3166 ? 0 : 1;
                class722.vmethod10757(object2[n], Login.field3168 + 765 - 55, 448, -1713248280);
                if (Client.gameState > 5 && Language.Language_EN == class311.field6141) {
                    if (DevicePcmPlayerProvider.field6104 != null) {
                        n = Login.field3168 + 20;
                        class722.vmethod10757(DevicePcmPlayerProvider.field6104, n, 448, -1713248280);
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("World");
                        ((StringBuilder)object2).append(" ");
                        ((StringBuilder)object2).append(Client.field4741);
                        ((class399)object).method13844(((StringBuilder)object2).toString(), n + 50, 463, 0xFFFFFF, 0, class722);
                        if (class121.field3378 != null) {
                            class3992.method13844("Loading...", n + 50, 477, 0xFFFFFF, 0, class722);
                        } else {
                            object = Client.field4740.field4997 ? "Tap to switch" : "Click to switch";
                            class3992.method13844((String)object, n + 50, 477, 0xFFFFFF, 0, class722);
                        }
                    } else {
                        DevicePcmPlayerProvider.field6104 = TileItemPile.method327(class259.field4373, "sl_button", "", -600736422);
                    }
                    n = GameBuild.field2490;
                    n4 = Calendar.getInstance().get(1);
                    class3992.method13844(String.format("This game is copyright @ 1999 - %d Jagex Ltd.", n4), n, 465, 0xFFFFFF, 0, class722);
                    class3992.method13844(Strings.field3136, n, 477, 0xFFFFFF, 0, class722);
                    if (class289.field5970 == null || class177.field3809 == null || class297.field6034 == null) {
                        n4 = class3992.method13851(Strings.field3136.substring(0, Strings.field3136.indexOf("Terms and Conditions")));
                        n3 = class3992.method13851(Strings.field3136.substring(0, Strings.field3136.indexOf("Privacy Policy")));
                        n2 = class3992.method13851(Strings.field3136.substring(0, Strings.field3136.indexOf("Software Licence")));
                        class289.field5970 = new Bounds((n -= class3992.method13851(Strings.field3136) / 2) + n4, 477, class3992.method13851("Terms and Conditions"), 11);
                        class177.field3809 = new Bounds(n + n3, 477, class3992.method13851("Privacy Policy"), 11);
                        class297.field6034 = new Bounds(n + n2, 477, class3992.method13851("Software Licence"), 11);
                    }
                }
                return;
            }
            return;
        }
        class381.method13236((class399)object, class3992, class722, 557797361);
    }
}

