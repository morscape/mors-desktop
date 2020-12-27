/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lq")
public class class173 {
    @ObfuscatedName(value="ae")
    byte[] field3791;
    @ObfuscatedName(value="ai")
    int[] field3792;
    @ObfuscatedName(value="ak")
    int[] field3793;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public class173(byte[] var1_1) {
        super();
        var7_2 = var1_1.length;
        this.field3793 = new int[var7_2];
        this.field3791 = var1_1;
        var11_3 = new int[33];
        this.field3792 = new int[8];
        var3_4 = 0;
        var4_5 = 0;
        block0: while (true) {
            block11: {
                if (var3_4 >= var7_2) return;
                var9_10 = var1_1[var3_4];
                if (var9_10 != 0) break block11;
                var5_7 = var4_5;
                ** GOTO lbl60
            }
            var2_6 = 1 << 32 - var9_10;
            this.field3793[var3_4] = var8_9 = var11_3[var9_10];
            if ((var8_9 & var2_6) != 0) {
                var2_6 = var11_3[var9_10 - 1];
            } else {
                var6_8 = var2_6 | var8_9;
                var5_7 = var9_10 - 1;
                while (true) {
                    var2_6 = var6_8;
                    if (var5_7 < 1) break;
                    var10_11 = var11_3[var5_7];
                    var2_6 = var6_8;
                    if (var10_11 != var8_9) break;
                    var2_6 = 1 << 32 - var5_7;
                    if ((var10_11 & var2_6) != 0) {
                        var11_3[var5_7] = var11_3[var5_7 - 1];
                        var2_6 = var6_8;
                        break;
                    }
                    var11_3[var5_7] = var10_11 | var2_6;
                    --var5_7;
                }
            }
            var11_3[var9_10] = var2_6;
            var5_7 = var9_10 + 1;
            while (true) {
                if (var5_7 > 32) break;
                if (var8_9 == var11_3[var5_7]) {
                    var11_3[var5_7] = var2_6;
                }
                ++var5_7;
            }
            var5_7 = 0;
            var2_6 = 0;
            while (true) {
                block16: {
                    block14: {
                        block15: {
                            block12: {
                                block13: {
                                    if (var5_7 >= var9_10) break block12;
                                    if ((-2147483648 >>> var5_7 & var8_9) == 0) break block13;
                                    if (this.field3792[var2_6] != 0) break block14;
                                    break block15;
                                }
                                ++var2_6;
                                break block16;
                            }
                            this.field3792[var2_6] = var3_4;
                            var5_7 = var4_5;
                            if (var2_6 >= var4_5) {
                                var5_7 = var2_6 + 1;
                            }
lbl60:
                            // 4 sources

                            ++var3_4;
                            var4_5 = var5_7;
                            continue block0;
                        }
                        this.field3792[var2_6] = var4_5;
                    }
                    var2_6 = this.field3792[var2_6];
                }
                if (var2_6 >= this.field3792.length) {
                    var12_12 = new int[this.field3792.length * 2];
                    for (var6_8 = 0; var6_8 < this.field3792.length; ++var6_8) {
                        var12_12[var6_8] = this.field3792[var6_8];
                    }
                    this.field3792 = var12_12;
                }
                ++var5_7;
            }
            break;
        }
    }

    @ObfuscatedName(value="fm")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lax;I)Ljava/lang/String;")
    static String method6515(String string2, Widget widget, int n) {
        CharSequence charSequence = string2;
        if (string2.indexOf("%") != -1) {
            n = 1;
            block0: while (true) {
                charSequence = string2;
                if (n > 5) break;
                while (true) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("%");
                    ((StringBuilder)charSequence).append(n);
                    int n2 = string2.indexOf(((StringBuilder)charSequence).toString());
                    if (n2 == -1) {
                        ++n;
                        continue block0;
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(string2.substring(0, n2));
                    ((StringBuilder)charSequence).append(Tiles.method5611(class28.method855(widget, n - 1, -1044969453)));
                    ((StringBuilder)charSequence).append(string2.substring(n2 + 2));
                    string2 = ((StringBuilder)charSequence).toString();
                }
                break;
            }
        }
        return charSequence;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IZIB)V", garbageValue="0")
    public static final void method6514(int n, boolean bl, int n2) {
        if (n < 8000 || n > 48000) {
            throw new IllegalArgumentException();
        }
        PcmPlayer.field3250 = n;
        PcmPlayer.PcmPlayer_stereo = bl;
        PcmPlayer.field3248 = n2;
    }
}

