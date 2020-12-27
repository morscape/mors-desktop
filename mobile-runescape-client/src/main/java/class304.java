/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  gs
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gs")
public class class304
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6087;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6088;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6090;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6092;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6089;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6091;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lgs;")
    static final class304 field6093;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-169245455)
    public final int field6094;
    @ObfuscatedName(value="af")
    public final boolean field6096;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=214767121)
    final int field6097;
    @ObfuscatedName(value="ab")
    public final boolean field6095;

    static {
        field6091 = new class304(0, -1, true, false, true);
        field6087 = new class304(1, 0, true, true, true);
        field6089 = new class304(2, 1, true, true, false);
        field6093 = new class304(3, 2, false, false, true);
        field6088 = new class304(4, 3, false, false, true);
        field6092 = new class304(5, 10, false, false, true);
        field6090 = new class304(6, 22, false, false, true);
    }

    class304(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        this.field6097 = n;
        this.field6094 = n2;
        this.field6095 = bl2;
        this.field6096 = bl3;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6097 * 287873777);
        return by * 214767121;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lby;", garbageValue="795735312")
    public static class34 method11055() {
        synchronized (gs.class) {
            if (class34.field541 == null) {
                class34.field541 = new class34();
            }
            class34 class342 = class34.field541;
            return class342;
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="-398619403")
    public static void method11060(Collection collection) {
        collection.add(NPCDefinition.NpcDefinition_cached);
        collection.add(NPCDefinition.field7160);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lji;Lfj;I)V")
    static void method11061(class138 var0, class72 var1_1, int var2_2) {
        block111: {
            block114: {
                block115: {
                    block116: {
                        block117: {
                            block118: {
                                block119: {
                                    block120: {
                                        block121: {
                                            block122: {
                                                block123: {
                                                    block124: {
                                                        block125: {
                                                            block126: {
                                                                block127: {
                                                                    block128: {
                                                                        block129: {
                                                                            block130: {
                                                                                block132: {
                                                                                    block133: {
                                                                                        block134: {
                                                                                            block135: {
                                                                                                block140: {
                                                                                                    block136: {
                                                                                                        block139: {
                                                                                                            block138: {
                                                                                                                block137: {
                                                                                                                    block131: {
                                                                                                                        block112: {
                                                                                                                            block113: {
                                                                                                                                if (Login.field3202) break block111;
                                                                                                                                var5_3 = Login.field3215.field6148;
                                                                                                                                var2_2 = Login.field3215.field6153;
                                                                                                                                var11_4 = Login.field3215.field6147;
                                                                                                                                var12_5 = Login.field3215.field6152;
                                                                                                                                var13_6 = Login.field3215.field6149;
                                                                                                                                var14_7 = Login.field3215.field6151;
                                                                                                                                Login.field3215.method11165();
                                                                                                                                if (var11_4 && var5_3 >= Login.field3168 + 765 - 65 && var5_3 < Login.field3168 + 765 && var2_2 >= 438 && var2_2 < 503) {
                                                                                                                                    ServerPacket.clientPreferences.field3166 ^= true;
                                                                                                                                    class259.savePreferences();
                                                                                                                                    if (!ServerPacket.clientPreferences.field3166) {
                                                                                                                                        class121.method5364(SoundCache.field3312, "scape main", "", 255, false, -1912008191);
                                                                                                                                    } else {
                                                                                                                                        class293.method10842();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (Client.gameState == 5) return;
                                                                                                                                if (Login.field3217 == -1L) {
                                                                                                                                    Login.field3217 = class363.currentTimeMillis() + 1000L;
                                                                                                                                }
                                                                                                                                var15_8 = class363.currentTimeMillis();
                                                                                                                                if (class291.loadWorlds() && Login.field3213 == -1L && (Login.field3213 = var15_8) > Login.field3217) {
                                                                                                                                    Login.field3217 = Login.field3213;
                                                                                                                                }
                                                                                                                                if (Client.gameState != 10 && Client.gameState != 11) return;
                                                                                                                                if (class311.field6141 != Language.Language_EN) break block112;
                                                                                                                                if (!var11_4) break block113;
                                                                                                                                var6_9 = Login.field3168 + 20;
                                                                                                                                if (var5_3 >= var6_9 && var5_3 <= var6_9 + 100 && var2_2 >= 448 && var2_2 <= 483) break block114;
                                                                                                                                if (class289.field5970 != null && var2_2 >= class289.field5970.lowY - 30 && var2_2 <= class289.field5970.lowY + class289.field5970.highY + 30) {
                                                                                                                                    if (var5_3 >= class289.field5970.lowX && var5_3 <= class289.field5970.lowX + class289.field5970.highX) {
                                                                                                                                        Client.field4740.method5708().method12018().vmethod10019("https://www.jagex.com/terms", true);
                                                                                                                                    } else if (var5_3 >= class177.field3809.lowX && var5_3 <= class177.field3809.lowX + class177.field3809.highX) {
                                                                                                                                        Client.field4740.method5708().method12018().vmethod10019("https://www.jagex.com/terms/privacy", true);
                                                                                                                                    } else if (var5_3 >= class297.field6034.lowX && var5_3 <= class297.field6034.lowX + class297.field6034.highX) {
                                                                                                                                        Client.field4740.method5708().method12005();
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (class121.field3378 != null) {
                                                                                                                                class270.method7738();
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if ((var6_9 = Client.field4740.method5717(841511934)) != Login.field3203) {
                                                                                                                            Login.field3203 = var6_9;
                                                                                                                            FloorOverlayDefinition.field7104 = Client.cycle;
                                                                                                                        }
                                                                                                                        if (Client.cycle >= FloorOverlayDefinition.field7104 + 8) {
                                                                                                                            if (Login.field3203 != -1 && var6_9 < class135.field3505 + 171) {
                                                                                                                                Login.field3181 = (var6_9 - class135.field3505) / 2;
                                                                                                                                if (Login.field3181 < 0) {
                                                                                                                                    Login.field3181 = 0;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                Login.field3181 = 171;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (Login.field3179 != Login.field3181) {
                                                                                                                            var3_11 = var4_10 = ((float)Login.field3181 - Login.field3178) * 0.25f;
                                                                                                                            if (var4_10 > -0.5f) {
                                                                                                                                var3_11 = var4_10;
                                                                                                                                if (var4_10 < 0.5f) {
                                                                                                                                    var3_11 = Login.field3181 - Login.field3179;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            Login.field3179 = (int)(Login.field3178 += var3_11);
                                                                                                                        }
                                                                                                                        if (var11_4 && (var5_3 < GameBuild.field2490 - Login.titleboxSprite.field7119 / 2 || var5_3 > Login.titleboxSprite.field7119 / 2 + GameBuild.field2490 || var2_2 < Login.field3179 || var2_2 > Login.field3179 + Login.titleboxSprite.field7124)) {
                                                                                                                            Client.field4740.method5708().method12004();
                                                                                                                        }
                                                                                                                        if (Login.loginIndex == 0) break block115;
                                                                                                                        if (Login.loginIndex == 1) break block116;
                                                                                                                        if (Login.loginIndex == 2) break block117;
                                                                                                                        if (Login.loginIndex == 3) break block118;
                                                                                                                        if (Login.loginIndex == 4) break block119;
                                                                                                                        if (Login.loginIndex == 5) break block120;
                                                                                                                        if (Login.loginIndex == 6) break block121;
                                                                                                                        if (Login.loginIndex == 7) break block122;
                                                                                                                        if (Login.loginIndex == 8) break block123;
                                                                                                                        if (Login.loginIndex == 9) break block124;
                                                                                                                        if (Login.loginIndex == 10) break block125;
                                                                                                                        if (Login.loginIndex == 11) break block126;
                                                                                                                        if (Login.loginIndex == 12) break block127;
                                                                                                                        if (Login.loginIndex == 13) break block128;
                                                                                                                        if (Login.loginIndex == 14) break block129;
                                                                                                                        if (Login.loginIndex == 16 || Login.loginIndex == 19) break block130;
                                                                                                                        if (Login.loginIndex != 18) break block131;
                                                                                                                        var15_8 = class363.currentTimeMillis();
                                                                                                                        if (-1L == Login.field3201) {
                                                                                                                            Login.field3201 = var15_8;
                                                                                                                        }
                                                                                                                        break block132;
                                                                                                                    }
                                                                                                                    if (Login.loginIndex == 17) break block133;
                                                                                                                    if (Login.loginIndex == 15) break block134;
                                                                                                                    if (Login.loginIndex == 23) break block135;
                                                                                                                    if (Login.loginIndex != 25) {
                                                                                                                        if (Login.loginIndex != 21) {
                                                                                                                            if (Login.loginIndex != 22) {
                                                                                                                                if (Login.loginIndex != 24) return;
                                                                                                                                var6_9 = Login.field3182 + 180;
                                                                                                                                var7_25 = Login.field3179 + 40 + 100;
                                                                                                                                if (!var12_5 && (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_25 - 20 || var2_2 > var7_25 + 20)) return;
                                                                                                                                class0.method4(false);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            var6_9 = Login.field3182 + 180;
                                                                                                                            var7_24 = Login.field3179 + 30 + 100;
                                                                                                                            if (!var12_5 && (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_24 - 20 || var2_2 > var7_24 + 20)) return;
                                                                                                                            ParamDefinition.method13223("", "Opening store...", "");
                                                                                                                            Client.field4740.method5708().vmethod12619();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        var7_23 = GameBuild.field2490 - 80;
                                                                                                                        var6_9 = Login.field3179 + 40 + 100;
                                                                                                                        if (var11_4 && var5_3 >= var7_23 - 75 && var5_3 <= var7_23 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                                                                                                                            Client.field4740.method5708().method12025();
                                                                                                                            FaceNormal.method847(972738187);
                                                                                                                        }
                                                                                                                        var7_23 = GameBuild.field2490 + 80;
                                                                                                                        if ((!var11_4 || var5_3 < var7_23 - 75 || var5_3 > var7_23 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) && !var12_5) return;
                                                                                                                        Login.field3199 = -1;
                                                                                                                        class0.method4(false);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    var0 = class119.field3363.method5323();
                                                                                                                    var1_1 = Client.field4740.method5708();
                                                                                                                    if (var0 == null) {
                                                                                                                        if (class363.currentTimeMillis() - Login.field3196 <= 300000L) return;
                                                                                                                        var1_1.method12022("jwa2GG");
                                                                                                                        var1_1.method12026("jwa2GG");
                                                                                                                        Login.field3194 = true;
                                                                                                                        class0.method4(true);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    if (var0.method311() || var0.method309(-869240351) == 1407) break block136;
                                                                                                                    var2_2 = var0.method309(1253131193);
                                                                                                                    if (var2_2 == 1402) break block137;
                                                                                                                    if (var2_2 != 1404) break block138;
                                                                                                                    var1_1.method12022("jwaFA4");
                                                                                                                    var1_1.method12026("jwaFA4");
                                                                                                                    break block139;
                                                                                                                }
                                                                                                                var1_1.method12022("jwaTV9");
                                                                                                                var1_1.method12026("jwaTV9");
                                                                                                                break block139;
                                                                                                            }
                                                                                                            var1_1.method12022("jwa2GG");
                                                                                                            var1_1.method12026("jwa2GG");
                                                                                                            Login.field3194 = true;
                                                                                                        }
                                                                                                        class0.method4(true);
                                                                                                        break block140;
                                                                                                    }
                                                                                                    class119.field3363.field3369 = -1000;
                                                                                                    Client.field4740.method5708().vmethod12650("wgahnagl", class119.field3363.field3369);
                                                                                                    Login.loginIndex = 10;
                                                                                                    ItemContainer.method12842(false, false);
                                                                                                }
                                                                                                class119.field3363.method5317(null);
                                                                                                return;
                                                                                            }
                                                                                            var0 = class119.field3363.method5313();
                                                                                            if (var0 == null) return;
                                                                                            if (var0.method152()) {
                                                                                                Login.loginIndex = 10;
                                                                                                ParamDefinition.method13223("", "Connecting to server...", "");
                                                                                                class119.field3363.field3369 = -1000;
                                                                                                Client.field4740.method5708().vmethod12650("wgahnagl", class119.field3363.field3369);
                                                                                                class119.field3363.method5306();
                                                                                                class297.method10926(false);
                                                                                                class180.method6606(20, (byte)25);
                                                                                            } else {
                                                                                                var1_1 = Client.field4740.method5708();
                                                                                                if (var0.method147(731765063) != 1) {
                                                                                                    var1_1.method12022("gsu6PD");
                                                                                                    var1_1.method12026("gsu6PD");
                                                                                                    ParamDefinition.method13223("Unable to connect to Google.", "Please wait and try again.", "");
                                                                                                    Login.loginIndex = 9;
                                                                                                } else {
                                                                                                    var1_1.method12022("gscD0G");
                                                                                                    var1_1.method12026("gscD0G");
                                                                                                    Login.loginIndex = 0;
                                                                                                }
                                                                                            }
                                                                                            class119.field3363.method5312(null);
                                                                                            return;
                                                                                        }
                                                                                        var0 = class119.field3363.method5320();
                                                                                        if (var0 == null) return;
                                                                                        if (var0.method280()) {
                                                                                            Login.loginIndex = 10;
                                                                                            ParamDefinition.method13223("", "Connecting to server...", "");
                                                                                            class119.field3363.field3369 = -1000;
                                                                                            Client.field4740.method5708().vmethod12650("wgahnagl", class119.field3363.field3369);
                                                                                            class119.field3363.method5306();
                                                                                            class297.method10926(false);
                                                                                            class180.method6606(20, (byte)25);
                                                                                        } else {
                                                                                            var1_1 = Client.field4740.method5708();
                                                                                            switch (var0.method276((byte)47)) {
                                                                                                default: {
                                                                                                    var1_1.method12022("gcu2QC");
                                                                                                    var1_1.method12026("gcu2QC");
                                                                                                    ParamDefinition.method13223("Unable to connect to Game Center.", "Please wait and try again.", "");
                                                                                                    Login.loginIndex = 9;
                                                                                                    break;
                                                                                                }
                                                                                                case 2: {
                                                                                                    var1_1.method12022("gcu2QC");
                                                                                                    var1_1.method12026("gcu2QC");
                                                                                                    ParamDefinition.method13223("Game Center is disabled.", "Please go to your settings and enable", "Game Center if you wish to use this.");
                                                                                                    Login.loginIndex = 9;
                                                                                                    break;
                                                                                                }
                                                                                                case 1: {
                                                                                                    var1_1.method12022("gcu1M3");
                                                                                                    var1_1.method12026("gcu1M3");
                                                                                                    ParamDefinition.method13223("Sorry, you are not eligible to play.", Strings.field3038, Strings.field3033);
                                                                                                    Login.loginIndex = 8;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        class119.field3363.method5315(null);
                                                                                        return;
                                                                                    }
                                                                                    var0 = Client.field4740.method5708().vmethod12647();
                                                                                    if (var0 == null) {
                                                                                        ParamDefinition.method13223("Failed to apply transactions", "", "Retry?");
                                                                                        Login.loginIndex = 19;
                                                                                        return;
                                                                                    }
                                                                                    var0 = var0.method556();
                                                                                    if (var0 == null) return;
                                                                                    if (!var0.method339()) {
                                                                                        ParamDefinition.method13223("Failed to apply transactions", "", "Retry?");
                                                                                        Login.loginIndex = 19;
                                                                                        return;
                                                                                    }
                                                                                    ParamDefinition.method13223("Transactions applied successfully", "", "Continuing with login...");
                                                                                    Login.loginIndex = 18;
                                                                                    return;
                                                                                }
                                                                                if (var15_8 - Login.field3201 <= 2000L) return;
                                                                                Login.field3201 = -1L;
                                                                                ItemContainer.method12842(true, false);
                                                                                return;
                                                                            }
                                                                            var7_26 = GameBuild.field2490 - 80;
                                                                            var6_9 = Login.field3179 + 100 + 20;
                                                                            if (!var11_4 || var5_3 < var7_26 - 75 || var5_3 > var7_26 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) {
                                                                                var7_26 = GameBuild.field2490 + 80;
                                                                                if (!var11_4 || var5_3 < var7_26 - 75 || var5_3 > var7_26 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) {
                                                                                    if (!var13_6) return;
                                                                                    Login.loginIndex = Language.method11574();
                                                                                    return;
                                                                                }
                                                                                ItemContainer.method12842(true, false);
                                                                                return;
                                                                            }
                                                                            class71.method4134();
                                                                            ParamDefinition.method13223("", "Applying pending transactions...", "");
                                                                            Login.loginIndex = 17;
                                                                            return;
                                                                        }
                                                                        var0 = "";
                                                                        switch (Login.field3187) {
                                                                            default: {
                                                                                class0.method4(false);
                                                                                break;
                                                                            }
                                                                            case 1: {
                                                                                var0 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                                                                break;
                                                                            }
                                                                            case 0: {
                                                                                var0 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                                                            }
                                                                        }
                                                                        var6_9 = Login.field3182 + 180;
                                                                        var7_27 = Login.field3179 + 100 + 5;
                                                                        if (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_27 - 20 || var2_2 > var7_27 + 20) {
                                                                            var6_9 = Login.field3182 + 180;
                                                                            var7_27 = Login.field3179 + 100 + 55;
                                                                            if (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_27 - 20 || var2_2 > var7_27 + 20) return;
                                                                            if (!class119.field3363.method5314()) {
                                                                                class358.Login_promptCredentials(false);
                                                                                return;
                                                                            }
                                                                            class0.method4(false);
                                                                            return;
                                                                        }
                                                                        Client.field4740.method5708().method12018().vmethod10019((String)var0, true);
                                                                        ParamDefinition.method13223("", "Page has opened in the browser.", "");
                                                                        Login.loginIndex = 6;
                                                                        return;
                                                                    }
                                                                    var6_9 = GameBuild.field2490;
                                                                    var7_22 = Login.field3179 + 100 + 50;
                                                                    if (!var13_6 && (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_22 - 20 || var2_2 > var7_22 + 20)) return;
                                                                    class0.method4(false);
                                                                    return;
                                                                }
                                                                var6_9 = GameBuild.field2490;
                                                                var7_21 = Login.field3179 + 100 - 45;
                                                                if (var11_4 && var2_2 >= var7_21 - 20 && var2_2 <= var7_21 + 20) {
                                                                    if (var5_3 < var6_9 - 150 || var5_3 > var6_9 - 20) {
                                                                        if (var5_3 >= var6_9 && var5_3 <= var6_9 + 90) {
                                                                            Client.field4740.method5708().method12018().vmethod10019("https://www.jagex.com/terms/privacy", true);
                                                                        }
                                                                    } else {
                                                                        Client.field4740.method5708().method12018().vmethod10019("https://www.jagex.com/terms", true);
                                                                    }
                                                                }
                                                                var7_21 = GameBuild.field2490 - 80;
                                                                var6_9 = Login.field3179 + 40 + 100;
                                                                if (var11_4 && var5_3 >= var7_21 - 75 && var5_3 <= var7_21 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                                                                    Client.field4740.method5708().method12014();
                                                                    FaceNormal.method847(106968003);
                                                                }
                                                                var7_21 = GameBuild.field2490 + 80;
                                                                if (var11_4 && var5_3 >= var7_21 - 75 && var5_3 <= var7_21 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20 || var12_5) {
                                                                    Login.field3199 = -1;
                                                                    Login.loginIndex = 13;
                                                                }
                                                                if (!var13_6) return;
                                                                Login.field3199 = -1;
                                                                class0.method4(false);
                                                                return;
                                                            }
                                                            var7_20 = GameBuild.field2490 - 80;
                                                            var6_9 = Login.field3179 + 100 + 20;
                                                            if (var11_4 && var5_3 >= var7_20 - 75 && var5_3 <= var7_20 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                                                                class119.field3363.method5304();
                                                                Client.field4740.method5708().vmethod12646(new String[]{"wgahnagl", "name"}, (byte)-29);
                                                                class0.method4(true);
                                                            }
                                                            var7_20 = GameBuild.field2490 + 80;
                                                            if ((!var11_4 || var5_3 < var7_20 - 75 || var5_3 > var7_20 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) && !var12_5) return;
                                                            Login.loginIndex = 10;
                                                            return;
                                                        }
                                                        var6_9 = Login.field3182 + 180;
                                                        var7_19 = Login.field3179 + 38;
                                                        if ((var12_5 || var11_4 && var5_3 >= var6_9 - 109 && var5_3 <= var6_9 + 109 && var2_2 >= var7_19 && var2_2 <= var7_19 + 68) && !class128.method5555(4)) {
                                                            ItemContainer.method12842(false, false);
                                                        }
                                                        var7_19 = Login.field3179 + 40 + 100;
                                                        if (!var13_6 && (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_19 || var2_2 > var7_19 + 40)) return;
                                                        Login.loginIndex = 11;
                                                        return;
                                                    }
                                                    var6_9 = Login.field3182 + 180;
                                                    var7_18 = Login.field3179 + 40 + 100;
                                                    if (!var12_5 && !var13_6 && (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_18 - 20 || var2_2 > var7_18 + 20)) return;
                                                    class0.method4(false);
                                                    return;
                                                }
                                                var7_17 = Login.field3182 + 180 - 80;
                                                var6_9 = Login.field3179 + 100 + 50;
                                                if (!var11_4 || var5_3 < var7_17 - 75 || var5_3 > var7_17 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) {
                                                    var7_17 = Login.field3182 + 180 + 80;
                                                    if (!var11_4 || var5_3 < var7_17 - 75 || var5_3 > var7_17 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) return;
                                                    class0.method4(true);
                                                    return;
                                                }
                                                Client.field4740.method5708().method12018().vmethod10019("https://www.jagex.com/terms", true);
                                                ParamDefinition.method13223("", "Page has opened in the browser.", "");
                                                Login.loginIndex = 6;
                                                return;
                                            }
                                            var7_16 = Login.field3182 + 180 - 80;
                                            var6_9 = Login.field3179 + 100 + 50;
                                            if (!var11_4 || var5_3 < var7_16 - 75 || var5_3 > var7_16 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) {
                                                var7_16 = Login.field3182 + 180 + 80;
                                                if (!var11_4 || var5_3 < var7_16 - 75 || var5_3 > var7_16 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) return;
                                                class358.Login_promptCredentials(true);
                                                return;
                                            }
                                            var0 = Client.field4740.method5708().method12018();
                                            var1_1 = new StringBuilder();
                                            var1_1.append(WorldMapElement.method12941("secure", true));
                                            var1_1.append("m=dob/set_dob.ws");
                                            var0.vmethod10019(var1_1.toString(), true);
                                            ParamDefinition.method13223("", "Page has opened in the browser.", "");
                                            Login.loginIndex = 6;
                                            return;
                                        }
                                        if (var12_5 || var13_6) {
                                            class0.method4(false);
                                        }
                                        var5_3 = Login.field3179 + 100 + 50;
                                        if (!var11_4 || var2_2 < var5_3 - 20 || var2_2 > var5_3 + 20) return;
                                        class0.method4(false);
                                        return;
                                    }
                                    var6_9 = Login.field3182 + 180;
                                    var7_15 = Login.field3179 + 100 + 9;
                                    if (!var11_4 || var5_3 < var6_9 - 140 || var5_3 > var6_9 + 140 || var2_2 < var7_15 - 20 || var2_2 > var7_15 + 20) {
                                        var7_15 = Login.field3182 + 180 - 80;
                                        var6_9 = Login.field3179 + 100 + 50;
                                        if (!var11_4 || var5_3 < var7_15 - 75 || var5_3 > var7_15 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) {
                                            var7_15 = Login.field3182 + 180 + 80;
                                            if (var11_4 && var5_3 >= var7_15 - 75 && var5_3 <= var7_15 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                                                class358.Login_promptCredentials(true);
                                            }
                                            var6_9 = Login.field3179 + 90 + 100;
                                            if (class290.field5983 != null) {
                                                var7_15 = class290.field5983.highX / 2;
                                                if (var11_4 && var5_3 >= class290.field5983.lowX - var7_15 && var5_3 <= var7_15 + class290.field5983.lowX && var2_2 >= var6_9 - 15 && var2_2 < var6_9) {
                                                    var0 = Client.field4740.method5708().method12018();
                                                    var1_1 = new StringBuilder();
                                                    var1_1.append(WorldMapElement.method12941("secure", true));
                                                    var1_1.append("m=weblogin/g=oldscape/cant_log_in");
                                                    var0.vmethod10019(var1_1.toString(), true);
                                                }
                                            }
                                            if (!var13_6) {
                                                if (var12_5) {
                                                    BoundaryObject.method844(1249648134);
                                                    return;
                                                }
                                            } else {
                                                class358.Login_promptCredentials(true);
                                            }
                                            var6_9 = Login.field3182 + 180;
                                            var7_15 = Login.field3179 + 100 + 85;
                                            if (!var11_4 || var5_3 < var6_9 - 100 || var5_3 > var6_9 + 100 || var2_2 < var7_15 - 15 || var2_2 > var7_15 + 15) return;
                                            var0 = Client.field4740.method5708();
                                            var0.method12022("flSB8L");
                                            var0.method12026("flSB8L");
                                            var0 = var0.method12018();
                                            var1_1 = new StringBuilder();
                                            var1_1.append(WorldMapElement.method12941("secure", true));
                                            var1_1.append("m=weblogin/g=oldscape/cant_log_in");
                                            var0.vmethod10019(var1_1.toString(), true);
                                            return;
                                        }
                                        BoundaryObject.method844(-2046568093);
                                        return;
                                    }
                                    var0 = var1_1 = Client.field4740.method5708().method12023();
                                    if (var1_1 == null) {
                                        var0 = class288.method10653();
                                    }
                                    if (var0 == null) {
                                        return;
                                    }
                                    var0.method3220();
                                    return;
                                }
                                var7_14 = Login.field3182 + 180 - 80;
                                var6_9 = Login.field3179 + 100 + 50;
                                if (!(var12_5 || var11_4 && var5_3 >= var7_14 - 75 && var5_3 <= var7_14 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20)) {
                                    if (var11_4 && var5_3 >= Login.field3182 + 180 - 130 && var5_3 <= Login.field3182 + 180 - 10 && var2_2 >= Login.field3179 + 100 - 8 && var2_2 <= Login.field3179 + 100 + 25) {
                                        var0 = var1_1 = Client.field4740.method5708().method12023();
                                        if (var1_1 == null) {
                                            var0 = class144.method5992();
                                        }
                                        if (var0 != null) {
                                            var0.method3220();
                                        }
                                    }
                                    if (var11_4 && var5_3 >= Login.field3182 + 180 - 9 && var5_3 <= Login.field3182 + 180 + 130 && var2_2 >= Login.field3179 + 100 - 8 && var2_2 <= Login.field3179 + 100 + 25) {
                                        Login.field3195 ^= true;
                                    }
                                    if (var11_4 && var5_3 >= Login.field3182 + 180 - 34 && var5_3 <= Login.field3182 + 34 + 180 && var2_2 >= Login.field3179 + 80 + 100 && var2_2 <= Login.field3179 + 100 + 92) {
                                        var0 = Client.field4740.method5708().method12018();
                                        var1_1 = new StringBuilder();
                                        var1_1.append(WorldMapElement.method12941("secure", true));
                                        var1_1.append("m=totp-authenticator/disableTOTPRequest");
                                        var0.vmethod10019(var1_1.toString(), true);
                                    }
                                    var7_14 = Login.field3182 + 180 + 80;
                                    if (!var13_6 && (!var11_4 || var5_3 < var7_14 - 75 || var5_3 > var7_14 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20)) return;
                                    class297.method10926(false);
                                    class0.method4(true);
                                    return;
                                }
                                class97.field2749.trim();
                                if (class97.field2749.length() == 6) {
                                    Client.field4772 = Integer.parseInt(class97.field2749);
                                    class97.field2749 = "";
                                    ParamDefinition.method13223("", "Connecting to server...", "");
                                    if (class119.field3363.method5314()) {
                                        class119.field3363.method5321(true);
                                    }
                                    class297.method10926(true);
                                    class180.method6606(20, (byte)25);
                                    return;
                                }
                                ParamDefinition.method13223(Strings.field2810, Strings.field2795, Strings.field2803);
                                return;
                            }
                            var6_9 = Login.field3182 + 180;
                            var7_13 = Login.field3179 + 100 + 5;
                            if (var12_5 || var13_6 || var11_4 && var5_3 >= var6_9 - 75 && var5_3 <= var6_9 + 75 && var2_2 >= var7_13 - 20 && var2_2 <= var7_13 + 20) {
                                class0.method4(false);
                            }
                            var6_9 = Login.field3182 + 180;
                            var7_13 = Login.field3179 + 100 + 55;
                            if (!var11_4 || var5_3 < var6_9 - 75 || var5_3 > var6_9 + 75 || var2_2 < var7_13 - 20 || var2_2 > var7_13 + 20) return;
                            class84.method4723();
                            return;
                        }
                        var0 = Client.field4740.method5708().method12023();
                        if (var0 != null && (var6_9 = var0.method3219(-1877069100)) >= 0) {
                            Login.currentLoginField = var6_9;
                        }
                        var6_9 = Login.field3179 + 100 - 70 + 52;
                        if (var11_4 && var5_3 >= GameBuild.field2490 - Login.titleboxSprite.field7119 / 2 && var5_3 <= Login.titleboxSprite.field7119 / 2 + GameBuild.field2490 && var2_2 >= var6_9 - 12 && var2_2 < var6_9 + 2) {
                            WorldMapIcon_0.method10405();
                        }
                        if (var11_4 && var5_3 >= GameBuild.field2490 - Login.titleboxSprite.field7119 / 2 && var5_3 <= Login.titleboxSprite.field7119 / 2 + GameBuild.field2490 && var2_2 >= (var6_9 += 15) - 12 && var2_2 < var6_9 + 2) {
                            class72.method4136();
                        }
                        var6_9 = Login.field3179 + 90 + 100;
                        if (class379.field7075 == null) ** GOTO lbl470
                        var7_28 = class379.field7075.highX / 2;
                        if (!var11_4 || var5_3 < class379.field7075.lowX - var7_28 || var5_3 > var7_28 + class379.field7075.lowX || var2_2 < var6_9 - 15 || var2_2 >= var6_9) ** GOTO lbl470
                        switch (Login.field3189) {
                            default: {
                                ** GOTO lbl470
                            }
                            case 2: {
                                Client.field4740.method5708().method12018().vmethod10019("https://support.runescape.com/hc/en-gb", true);
lbl470:
                                // 4 sources

                                var7_28 = GameBuild.field2490 - 80;
                                var6_9 = Login.field3179 + 100 + 50;
                                if (!var11_4 || var5_3 < var7_28 - 75 || var5_3 > var7_28 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) {
                                    var7_28 = Login.field3182 + 180 + 80;
                                    if (var11_4 && var5_3 >= var7_28 - 75 && var5_3 <= var7_28 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                                        class0.method4(true);
                                        Login.field3195 = true;
                                    }
                                    var6_9 = GameBuild.field2490 - 117;
                                    var7_28 = Login.field3179 + 106;
                                    var10_31 = var5_3 >= var6_9 && var5_3 < var6_9 + class300.field6046 && var2_2 >= var7_28 && var2_2 < var7_28 + class65.field2483;
                                    Login.field3191 = var10_31;
                                    if (var11_4 && Login.field3191) {
                                        var10_31 = !Client.Login_isUsernameRemembered;
                                        Client.Login_isUsernameRemembered = var10_31;
                                        if (!Client.Login_isUsernameRemembered && ServerPacket.clientPreferences.rememberedUsername != null) {
                                            ServerPacket.clientPreferences.rememberedUsername = null;
                                            class259.savePreferences();
                                        }
                                    }
                                    if (Client.field4740.method5714(526409609) == 3 || Client.field4740.method5714(526409609) == 2) {
                                        var6_9 = GameBuild.field2490 * 26444197;
                                        var6_9 = VerticalAlignment.field5936.field7119 / 2;
                                        var6_9 = Login.field3179 + 210;
                                        if (var11_4 && var5_3 >= GameBuild.field2490 - VerticalAlignment.field5936.field7119 / 2 && var5_3 <= VerticalAlignment.field5936.field7119 / 2 + GameBuild.field2490 && var2_2 >= var6_9 && var2_2 <= var6_9 + VerticalAlignment.field5936.field7124) {
                                            VerticalAlignment.method10455();
                                        }
                                    }
                                    var6_9 = GameBuild.field2490 + 24;
                                    var7_28 = Login.field3179 + 106;
                                    var10_31 = var5_3 >= var6_9 && var5_3 < var6_9 + class300.field6046 && var2_2 >= var7_28 && var2_2 < var7_28 + class65.field2483;
                                    Login.field3197 = var10_31;
                                    if (var11_4 && Login.field3197) {
                                        ServerPacket.clientPreferences.hideUsername ^= true;
                                        if (!ServerPacket.clientPreferences.hideUsername) {
                                            Login.Login_username = "";
                                            ServerPacket.clientPreferences.rememberedUsername = null;
                                            var0 = Client.field4740.method5708().method12023();
                                            if (var0 != null) {
                                                var0.method3258("", 0);
                                            }
                                            class261.method7512();
                                        }
                                        class259.savePreferences();
                                    }
                                    if (!var13_6) {
                                        if (!var12_5) {
                                            if (!var14_7) return;
                                            if (Login.currentLoginField != 0) {
                                                WorldMapIcon_0.method10405();
                                                return;
                                            }
                                            class72.method4136();
                                            return;
                                        }
                                        if (Login.currentLoginField != 0) {
                                            if ((Login.Login_username = Login.Login_username.trim()).length() != 0) {
                                                if (Login.Login_password.length() != 0) {
                                                    Client.field4740.method5708().method12004();
                                                    ParamDefinition.method13223("", "Connecting to server...", "");
                                                    ModeWhere.findItemDefinitions(Login.Login_password, Client.field4740.field4997);
                                                    return;
                                                }
                                                ParamDefinition.method13223("", "Please enter your password.", "");
                                                class72.method4136();
                                                return;
                                            }
                                            ParamDefinition.method13223("", "Please enter your username/email address.", "");
                                            WorldMapIcon_0.method10405();
                                            return;
                                        }
                                        class72.method4136();
                                        return;
                                    }
                                    class0.method4(true);
                                    Login.field3195 = true;
                                    return;
                                }
                                Login.Login_username = Login.Login_username.trim();
                                if (Login.Login_username.length() != 0) {
                                    if (Login.Login_password.length() != 0) {
                                        Client.field4740.method5708().method12004();
                                        ParamDefinition.method13223("", "Connecting to server...", "");
                                        ModeWhere.findItemDefinitions(Login.Login_password, Client.field4740.field4997);
                                        return;
                                    }
                                    class72.method4136();
                                    ParamDefinition.method13223("", "Please enter your password.", "");
                                    return;
                                }
                                WorldMapIcon_0.method10405();
                                ParamDefinition.method13223("", "Please enter your username/email address.", "");
                                return;
                            }
                            case 1: 
                        }
                        class84.method4723();
                        return;
                    }
                    var7_12 = GameBuild.field2490 - 80;
                    var6_9 = Login.field3179 + 100 + 50;
                    if (var12_5 || var11_4 && var5_3 >= var7_12 - 75 && var5_3 <= var7_12 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                        Login.field3198 = true;
                        FaceNormal.method847(1832120812);
                    }
                    var7_12 = GameBuild.field2490 + 80;
                    if (!var13_6 && (!var11_4 || var5_3 < var7_12 - 75 || var5_3 > var7_12 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20)) return;
                    class0.method4(false);
                    return;
                }
                if (!var13_6) {
                    var0 = Client.field4740.method5708().vmethod12647();
                    if (var0 == null || !var0.method548() && !var0.vmethod10046()) {
                        var7_29 = GameBuild.field2490 - 80;
                        var6_9 = Login.field3179 + 100 + 20;
                        if (var11_4 && var5_3 >= var7_29 - 75 && var5_3 <= var7_29 + 75 && var2_2 >= var6_9 - 20 && var2_2 <= var6_9 + 20) {
                            if (class63.method4018(0)) return;
                            if (class270.method7740(0)) return;
                            VerticalAlignment.method10455();
                        }
                        var7_29 = GameBuild.field2490 + 80;
                        if ((!var11_4 || var5_3 < var7_29 - 75 || var5_3 > var7_29 + 75 || var2_2 < var6_9 - 20 || var2_2 > var6_9 + 20) && !var12_5) return;
                        if (class63.method4018(1) || class270.method7740(1)) return;
                        if (class128.method5555(1)) return;
                        Client.field4740.method5708().method12022("crsG39");
                        Client.field4740.method5708().method12026("crsG39");
                        if (var0 == null || !var0.vmethod10040()) {
                            class358.Login_promptCredentials(false);
                            return;
                        }
                        Ignored.method10462();
                        return;
                    }
                    var6_9 = Login.field3182 + 180;
                    var9_32 = Login.field3179 + 100 - 42;
                    var7_30 = VerticalAlignment.field5936.field7119 / 2;
                    var8_33 = VerticalAlignment.field5936.field7124;
                    if (var11_4 && var5_3 >= var6_9 - var7_30 && var5_3 <= var6_9 + var7_30 && var2_2 >= var9_32 && var2_2 <= var9_32 + var8_33) {
                        if (var0.method548()) {
                            if (class63.method4018(2) || class270.method7740(2)) return;
                            if (class128.method5555(2)) return;
                            class84.method4724();
                        } else if (var0.vmethod10046()) {
                            if (class63.method4018(3) || class270.method7740(3)) return;
                            if (class128.method5555(3)) return;
                            FaceNormal.method848();
                        }
                    }
                    var9_32 = var9_32 + var8_33 + 6;
                    if ((!var11_4 || var5_3 < var6_9 - var7_30 || var5_3 > var6_9 + var7_30 || var2_2 < var9_32 || var2_2 > var9_32 + var8_33) && !var12_5) return;
                    if (class63.method4018(1) || class270.method7740(1)) return;
                    if (class128.method5555(1)) return;
                    Client.field4740.method5708().method12022("crsG39");
                    Client.field4740.method5708().method12026("crsG39");
                    if (!var0.vmethod10040() || Login.field3194) {
                        class358.Login_promptCredentials(false);
                        return;
                    }
                    Ignored.method10462();
                    return;
                }
                Client.field4740.method5708().vmethod12637();
                return;
            }
            class270.method7738();
            return;
        }
        FloorUnderlayDefinition.method13192((class138)var0, (class72)var1_1, -1789088987);
    }
}

