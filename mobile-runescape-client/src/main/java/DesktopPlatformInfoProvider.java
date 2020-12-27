/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pd")
@Implements(value="DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider
implements class2 {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-895456121)
    int field6555;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-524284361)
    int field6556;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1125020771)
    int field6557;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lclient;")
    Client field6558;

    @ObfuscatedSignature(descriptor="(Lclient;)V")
    public DesktopPlatformInfoProvider(Client client) {
        this.field6558 = client;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="115")
    void method12169(String string2) {
        if (!string2.startsWith("1.")) {
            this.method12171(string2);
            return;
        }
        this.method12175(string2);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-21")
    void method12171(String arrstring) {
        arrstring = arrstring.split("\\.");
        try {
            this.field6555 = Integer.parseInt(arrstring[0]);
            this.field6557 = Integer.parseInt(arrstring[1]);
            this.field6556 = Integer.parseInt(arrstring[2]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1596180007")
    void method12175(String arrstring) {
        arrstring = arrstring.split("\\.");
        try {
            this.field6555 = Integer.parseInt(arrstring[1]);
            arrstring = arrstring[2].split("_");
            this.field6557 = Integer.parseInt(arrstring[0]);
            this.field6556 = Integer.parseInt(arrstring[1]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

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
        block18: {
            block28: {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block33: {
                                    block32: {
                                        block31: {
                                            block30: {
                                                block29: {
                                                    block16: {
                                                        block27: {
                                                            block26: {
                                                                block25: {
                                                                    block24: {
                                                                        block23: {
                                                                            block22: {
                                                                                block21: {
                                                                                    block20: {
                                                                                        block19: {
                                                                                            block17: {
                                                                                                block15: {
                                                                                                    block14: {
                                                                                                        block13: {
                                                                                                            if (this.field6558.field4997) {
                                                                                                                var2_2 = this.field6558.method5714(526409609) == 2 ? 5 : 6;
                                                                                                            }
                                                                                                            var2_2 = Frames.field6598.startsWith("win") ? 1 : (Frames.field6598.startsWith("mac") ? 2 : ((var6_3 = Frames.field6598.startsWith("linux")) ? 3 : 4));
                                                                                                            try {
                                                                                                                var8_4 = System.getProperty("os.arch").toLowerCase();
                                                                                                                break block13;
                                                                                                            }
                                                                                                            catch (Exception var7_5) {}
                                                                                                            var8_4 = "";
                                                                                                        }
                                                                                                        try {
                                                                                                            var9_9 = System.getProperty("os.version").toLowerCase();
                                                                                                            break block14;
                                                                                                        }
                                                                                                        catch (Exception var7_6) {}
                                                                                                        var9_9 = "";
                                                                                                    }
                                                                                                    try {
                                                                                                        var7_7 = System.getProperty("java.vendor");
                                                                                                    }
                                                                                                    catch (Exception var7_8) {}
                                                                                                    try {
                                                                                                        var10_10 = System.getProperty("java.version");
                                                                                                        break block15;
                                                                                                    }
                                                                                                    catch (Exception var10_11) {}
                                                                                                    var7_7 = "Unknown";
                                                                                                    var10_10 = "1.1";
                                                                                                }
                                                                                                var6_3 = var8_4.startsWith("amd64") || var8_4.startsWith("x86_64");
                                                                                                if (var2_2 != 1) break block16;
                                                                                                if (var9_9.indexOf("4.0") == -1) break block17;
                                                                                                var1_1 = 1;
                                                                                                break block18;
                                                                                            }
                                                                                            if (var9_9.indexOf("4.1") == -1) break block19;
                                                                                            var1_1 = 2;
                                                                                            break block18;
                                                                                        }
                                                                                        if (var9_9.indexOf("4.9") == -1) break block20;
                                                                                        var1_1 = 3;
                                                                                        break block18;
                                                                                    }
                                                                                    if (var9_9.indexOf("5.0") == -1) break block21;
                                                                                    var1_1 = 4;
                                                                                    break block18;
                                                                                }
                                                                                if (var9_9.indexOf("5.1") == -1) break block22;
                                                                                var1_1 = 5;
                                                                                break block18;
                                                                            }
                                                                            if (var9_9.indexOf("5.2") == -1) break block23;
                                                                            var1_1 = 8;
                                                                            break block18;
                                                                        }
                                                                        if (var9_9.indexOf("6.0") == -1) break block24;
                                                                        var1_1 = 6;
                                                                        break block18;
                                                                    }
                                                                    if (var9_9.indexOf("6.1") == -1) break block25;
                                                                    var1_1 = 7;
                                                                    break block18;
                                                                }
                                                                if (var9_9.indexOf("6.2") == -1) break block26;
                                                                var1_1 = 9;
                                                                break block18;
                                                            }
                                                            if (var9_9.indexOf("6.3") == -1) break block27;
                                                            var1_1 = 10;
                                                            break block18;
                                                        }
                                                        if (var9_9.indexOf("10.0") == -1) ** GOTO lbl-1000
                                                        var1_1 = 11;
                                                        break block18;
                                                    }
                                                    if (var2_2 != 2) break block28;
                                                    if (var9_9.indexOf("10.4") == -1) break block29;
                                                    var1_1 = 20;
                                                    break block18;
                                                }
                                                if (var9_9.indexOf("10.5") == -1) break block30;
                                                var1_1 = 21;
                                                break block18;
                                            }
                                            if (var9_9.indexOf("10.6") == -1) break block31;
                                            var1_1 = 22;
                                            break block18;
                                        }
                                        if (var9_9.indexOf("10.7") == -1) break block32;
                                        var1_1 = 23;
                                        break block18;
                                    }
                                    if (var9_9.indexOf("10.8") == -1) break block33;
                                    var1_1 = 24;
                                    break block18;
                                }
                                if (var9_9.indexOf("10.9") == -1) break block34;
                                var1_1 = 25;
                                break block18;
                            }
                            if (var9_9.indexOf("10.10") == -1) break block35;
                            var1_1 = 26;
                            break block18;
                        }
                        if (var9_9.indexOf("10.11") == -1) break block36;
                        var1_1 = 27;
                        break block18;
                    }
                    if (var9_9.indexOf("10.12") == -1) break block37;
                    var1_1 = 28;
                    break block18;
                }
                if (var9_9.indexOf("10.13") == -1) ** GOTO lbl-1000
                var1_1 = 29;
                break block18;
            }
            if (var2_2 == 5) {
                var1_1 = this.field6558.method5708().vmethod12626(-1055348762) + 10000;
            } else if (var2_2 == 6) {
                var1_1 = this.field6558.method5708().vmethod12626(1572744413) + 20000;
            } else lbl-1000:
            // 3 sources

            {
                var1_1 = 0;
            }
        }
        var3_12 = var7_7.toLowerCase().indexOf("sun") != -1 ? 1 : (var7_7.toLowerCase().indexOf("microsoft") != -1 ? 2 : (var7_7.toLowerCase().indexOf("apple") != -1 ? 3 : (var7_7.toLowerCase().indexOf("oracle") != -1 ? 5 : (var7_7.toLowerCase().indexOf("android") != -1 ? 6 : 4))));
        this.method12169(var10_10);
        var5_13 = (int)(Runtime.getRuntime().maxMemory() / 0x100000L);
        var4_14 = this.field6555 > 3 ? Runtime.getRuntime().availableProcessors() : 0;
        var7_7 = new int[3];
        return new class259(var2_2, var6_3, var1_1, var3_12, this.field6555, this.field6557, this.field6556, false, var5_13 + 1, var4_14, 0, 0, "", "", "", "", 0, 0, 0, 0, "", "", (int[])var7_7, 0, "");
    }
}

