/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ai")
public class class258
implements class2 {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lak;")
    public class259 vmethod12172(int var1_1) {
        block53: {
            block51: {
                block62: {
                    block61: {
                        block60: {
                            block59: {
                                block58: {
                                    block57: {
                                        block56: {
                                            block55: {
                                                block54: {
                                                    block52: {
                                                        block46: {
                                                            block45: {
                                                                block44: {
                                                                    var3_2 = Frames.field6598.startsWith("win") != false ? 1 : (Frames.field6598.startsWith("mac") != false ? 2 : ((var15_3 = Frames.field6598.startsWith("linux")) != false ? 3 : 4));
                                                                    try {
                                                                        var19_4 = System.getProperty("os.arch").toLowerCase();
                                                                        break block44;
                                                                    }
                                                                    catch (Exception var18_7) {}
                                                                    var19_4 = "";
                                                                }
                                                                try {
                                                                    var20_13 = System.getProperty("os.version").toLowerCase();
                                                                    break block45;
                                                                }
                                                                catch (Exception var18_8) {}
                                                                var20_13 = "";
                                                            }
                                                            try {
                                                                var21_14 = System.getProperty("java.vendor");
                                                            }
                                                            catch (Exception var18_10) {}
                                                            try {
                                                                var18_9 = System.getProperty("java.version");
                                                                break block46;
                                                            }
                                                            catch (Exception var18_11) {
                                                                var18_9 = var21_14;
                                                            }
                                                            var18_9 = "Unknown";
                                                            var22_15 = "1.1";
                                                            var21_14 = var18_9;
                                                            var18_9 = var22_15;
                                                        }
                                                        var15_3 = var19_4.startsWith("amd64") || var19_4.startsWith("x86_64");
                                                        if (var3_2 != 1) break block51;
                                                        if (var20_13.indexOf("4.0") == -1) break block52;
                                                        var1_1 = 1;
                                                        break block53;
                                                    }
                                                    if (var20_13.indexOf("4.1") == -1) break block54;
                                                    var1_1 = 2;
                                                    break block53;
                                                }
                                                if (var20_13.indexOf("4.9") == -1) break block55;
                                                var1_1 = 3;
                                                break block53;
                                            }
                                            if (var20_13.indexOf("5.0") == -1) break block56;
                                            var1_1 = 4;
                                            break block53;
                                        }
                                        if (var20_13.indexOf("5.1") == -1) break block57;
                                        var1_1 = 5;
                                        break block53;
                                    }
                                    if (var20_13.indexOf("5.2") == -1) break block58;
                                    var1_1 = 8;
                                    break block53;
                                }
                                if (var20_13.indexOf("6.0") == -1) break block59;
                                var1_1 = 6;
                                break block53;
                            }
                            if (var20_13.indexOf("6.1") == -1) break block60;
                            var1_1 = 7;
                            break block53;
                        }
                        if (var20_13.indexOf("6.2") == -1) break block61;
                        var1_1 = 9;
                        break block53;
                    }
                    if (var20_13.indexOf("6.3") == -1) break block62;
                    var1_1 = 10;
                    break block53;
                }
                if (var20_13.indexOf("10.0") == -1) ** GOTO lbl-1000
                var1_1 = 11;
                break block53;
            }
            if (var3_2 != 2) ** GOTO lbl-1000
            if (var20_13.indexOf("10.4") != -1) {
                var1_1 = 20;
            } else if (var20_13.indexOf("10.5") != -1) {
                var1_1 = 21;
            } else if (var20_13.indexOf("10.6") != -1) {
                var1_1 = 22;
            } else if (var20_13.indexOf("10.7") != -1) {
                var1_1 = 23;
            } else if (var20_13.indexOf("10.8") != -1) {
                var1_1 = 24;
            } else if (var20_13.indexOf("10.9") != -1) {
                var1_1 = 25;
            } else if (var20_13.indexOf("10.10") != -1) {
                var1_1 = 26;
            } else if (var20_13.indexOf("10.11") != -1) {
                var1_1 = 27;
            } else if (var20_13.indexOf("10.12") != -1) {
                var1_1 = 28;
            } else if (var20_13.indexOf("10.13") != -1) {
                var1_1 = 29;
            } else lbl-1000:
            // 3 sources

            {
                var1_1 = 0;
            }
        }
        var2_16 = var21_14.toLowerCase().indexOf("sun") != -1 ? 1 : (var21_14.toLowerCase().indexOf("microsoft") != -1 ? 2 : (var21_14.toLowerCase().indexOf("apple") != -1 ? 3 : ((var2_16 = var21_14.toLowerCase().indexOf("oracle")) != -1 ? 5 : 4)));
        var4_18 = 0;
        try {
            for (var5_17 = 2; var5_17 < var18_9.length() && (var6_19 = var18_9.charAt(var5_17)) >= 48 && var6_19 <= 57; ++var5_17) {
                var4_18 = var4_18 * 10 + (var6_19 - 48);
            }
        }
        catch (Exception var19_5) {}
        var5_17 = var18_9.indexOf(46, 2);
        var6_19 = var5_17 + 1;
        var5_17 = 0;
        try {
            while (var6_19 < var18_9.length() && (var7_20 = var18_9.charAt(var6_19)) >= 48 && var7_20 <= 57) {
                var5_17 = var5_17 * 10 + (var7_20 - 48);
                ++var6_19;
            }
        }
        catch (Exception var19_6) {}
        var6_19 = var18_9.indexOf(95, 4);
        var7_20 = var6_19 + 1;
        var6_19 = 0;
        try {
            while (var7_20 < var18_9.length() && (var8_21 = var18_9.charAt(var7_20)) >= 48 && var8_21 <= 57) {
                var6_19 = var6_19 * 10 + (var8_21 - 48);
                ++var7_20;
            }
        }
        catch (Exception var18_12) {}
        var12_22 = (int)(Runtime.getRuntime().maxMemory() / 0x100000L);
        var7_20 = var4_18 > 3 ? Runtime.getRuntime().availableProcessors() : 0;
        var19_4 = "";
        var21_14 = Calendar.getInstance();
        var21_14.setTime(new Date(-9223372036854775808L));
        if (ak.method3362()) {
            var19_4 = ak.method3398();
            var23_23 = ak.method3391();
            var10_24 = ak.method3396(864895580);
            var8_21 = ak.method3402(1928906057);
            var9_25 = ak.method3392(1109762890);
            var11_26 = ak.method3426(-787055795);
            var24_27 = ak.method3419();
            var18_9 = ak.method3410();
            var20_13 = ak.method3420();
            var22_15 = ak.method3407();
            var16_28 = ak.method3418();
            var21_14.setTimeInMillis(var16_28 * 1000L);
        } else {
            var23_23 = "";
            var20_13 = "";
            var24_27 = new int[]{};
            var22_15 = "";
            var18_9 = "";
            var8_21 = -1;
            var9_25 = -1;
            var10_24 = -1;
            var11_26 = -1;
        }
        var13_29 = var21_14.get(2);
        var14_30 = var21_14.get(1);
        var25_31 = "";
        var21_14 = var20_13;
        if (var20_13 == null) {
            var21_14 = "";
        }
        var20_13 = var22_15;
        if (var22_15 == null) {
            var20_13 = "";
        }
        var22_15 = var23_23 == null ? "" : var23_23;
        var23_23 = var19_4;
        if (var19_4 == null) {
            var23_23 = "";
        }
        var19_4 = "".length() > 40 ? "".substring(0, 40) : var25_31;
        if (var21_14.length() > 40) {
            var21_14 = var21_14.substring(0, 40);
        }
        var25_31 = "".length() > 10 ? "".substring(0, 10) : "";
        if (var20_13.length() > 10) {
            var20_13 = var20_13.substring(0, 10);
        }
        var26_32 = var18_9;
        if (var18_9.length() <= 120) return new class259(var3_2, var15_3, var1_1, var2_16, var4_18, var5_17, var6_19, false, var12_22 + 1, var7_20, var11_26, 0, var19_4, (String)var21_14, var25_31, var20_13, var14_30, var13_29 + 1, var8_21, var9_25, var22_15, var23_23, var24_27, var10_24, var26_32);
        var26_32 = var18_9.substring(0, 120);
        return new class259(var3_2, var15_3, var1_1, var2_16, var4_18, var5_17, var6_19, false, var12_22 + 1, var7_20, var11_26, 0, var19_4, (String)var21_14, var25_31, var20_13, var14_30, var13_29 + 1, var8_21, var9_25, var22_15, var23_23, var24_27, var10_24, var26_32);
    }
}

