/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="bj")
@Implements(value="TileModel")
public final class TileModel {
    @ObfuscatedName(value="ao")
    static int[] field453;
    @ObfuscatedName(value="ap")
    static int[] field454;
    @ObfuscatedName(value="ar")
    static int[] field455;
    @ObfuscatedName(value="aw")
    static int[] field458;
    @ObfuscatedName(value="az")
    static int[] field459;
    @ObfuscatedName(value="at")
    static final int[][] field456;
    @ObfuscatedName(value="av")
    static final int[][] field457;
    @ObfuscatedName(value="aa")
    int[] field460;
    @ObfuscatedName(value="ae")
    int[] field462;
    @ObfuscatedName(value="af")
    boolean field463;
    @ObfuscatedName(value="ah")
    int[] field464;
    @ObfuscatedName(value="aj")
    int[] field466;
    @ObfuscatedName(value="al")
    int[] field468;
    @ObfuscatedName(value="am")
    @Export(value="rotation")
    int rotation;
    @ObfuscatedName(value="an")
    @Export(value="underlayRgb")
    int underlayRgb;
    @ObfuscatedName(value="aq")
    @Export(value="shape")
    int shape;
    @ObfuscatedName(value="as")
    int[] field472;
    @ObfuscatedName(value="ay")
    @Export(value="overlayRgb")
    int overlayRgb;
    @ObfuscatedName(value="ai")
    int[] field465;
    @ObfuscatedName(value="ak")
    int[] field467;
    @ObfuscatedName(value="ax")
    int[] field473;
    @ObfuscatedName(value="ab")
    int[] field461;

    static {
        field458 = new int[6];
        field455 = new int[6];
        field454 = new int[6];
        field453 = new int[6];
        field459 = new int[6];
        field456 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
        int[] arrn = new int[]{1, 1, 2, 3, 1, 0, 1, 3};
        int[] arrn2 = new int[]{0, 1, 2, 3, 1, 0, 1, 3};
        int[] arrn3 = new int[]{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3};
        int[] arrn4 = new int[]{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4};
        int[] arrn5 = new int[]{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3};
        int[] arrn6 = new int[]{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5};
        int[] arrn7 = new int[]{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3};
        field457 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, arrn, arrn2, arrn3, arrn4, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, arrn5, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, arrn6, arrn7, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    TileModel(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12, int var13_13, int var14_14, int var15_15, int var16_16, int var17_17, int var18_18, int var19_19) {
        var21_20 = var6_6;
        var20_21 = var7_7;
        super();
        this.field463 = true;
        if (var21_20 != var20_21 || var21_20 != var8_8 || var21_20 != var9_9) {
            this.field463 = false;
        }
        this.shape = var1_1;
        this.rotation = var2_2;
        this.underlayRgb = var18_18;
        this.overlayRgb = var19_19;
        var26_22 = TileModel.field456[var1_1];
        var25_23 = var26_22.length;
        this.field467 = new int[var25_23];
        this.field462 = new int[var25_23];
        this.field465 = new int[var25_23];
        var28_24 = new int[var25_23];
        var29_25 = new int[var25_23];
        var24_26 = var4_4 * 128;
        var19_19 = var5_5 * 128;
        var22_27 = 0;
        while (true) {
            block41: {
                block39: {
                    block44: {
                        block47: {
                            block46: {
                                block45: {
                                    block43: {
                                        block42: {
                                            block40: {
                                                block38: {
                                                    if (var22_27 >= var25_23) {
                                                        var26_22 = TileModel.field457[var1_1];
                                                        var11_11 = var26_22.length / 4;
                                                        this.field466 = new int[var11_11];
                                                        this.field468 = new int[var11_11];
                                                        this.field460 = new int[var11_11];
                                                        this.field473 = new int[var11_11];
                                                        this.field464 = new int[var11_11];
                                                        this.field472 = new int[var11_11];
                                                        if (var3_3 != -1) {
                                                            this.field461 = new int[var11_11];
                                                        }
                                                        var4_4 = 0;
                                                        break;
                                                    }
                                                    var4_4 = var5_5 = var26_22[var22_27];
                                                    if ((var5_5 & 1) == 0) {
                                                        var4_4 = var5_5;
                                                        if (var5_5 <= 8) {
                                                            var4_4 = (var5_5 - var2_2 - var2_2 - 1 & 7) + 1;
                                                        }
                                                    }
                                                    var5_5 = var4_4;
                                                    if (var4_4 > 8) {
                                                        var5_5 = var4_4;
                                                        if (var4_4 <= 12) {
                                                            var5_5 = (var4_4 - 9 - var2_2 & 3) + 9;
                                                        }
                                                    }
                                                    var4_4 = var5_5;
                                                    if (var5_5 > 12) {
                                                        var4_4 = var5_5;
                                                        if (var5_5 <= 16) {
                                                            var4_4 = (var5_5 - 13 - var2_2 & 3) + 13;
                                                        }
                                                    }
                                                    if (var4_4 != 1) break block38;
                                                    var7_7 = var10_10;
                                                    var5_5 = var14_14;
                                                    var18_18 = var19_19;
                                                    var6_6 = var21_20;
                                                    var4_4 = var24_26;
                                                    break block39;
                                                }
                                                if (var4_4 != 2) break block40;
                                                var4_4 = var24_26 + 64;
                                                var23_28 = var19_19;
                                                var7_7 = var11_11 + var10_10 >> 1;
                                                var5_5 = var15_15 + var14_14 >> 1;
                                                var6_6 = var21_20 + var20_21 >> 1;
                                                break block41;
                                            }
                                            if (var4_4 != 3) break block42;
                                            var4_4 = var24_26 + 128;
                                            var7_7 = var11_11;
                                            var5_5 = var15_15;
                                            var18_18 = var19_19;
                                            var6_6 = var20_21;
                                            break block39;
                                        }
                                        if (var4_4 != 4) break block43;
                                        var4_4 = var24_26 + 128;
                                        var5_5 = var19_19 + 64;
                                        var7_7 = var11_11 + var12_12 >> 1;
                                        var18_18 = var15_15 + var16_16 >> 1;
                                        var6_6 = var20_21 + var8_8 >> 1;
                                        break block44;
                                    }
                                    if (var4_4 != 5) break block45;
                                    var4_4 = var24_26 + 128;
                                    var7_7 = var12_12;
                                    var5_5 = var16_16;
                                    var18_18 = var19_19 + 128;
                                    var6_6 = var8_8;
                                    break block39;
                                }
                                if (var4_4 != 6) break block46;
                                var4_4 = var24_26 + 64;
                                var6_6 = var8_8 + var9_9 >> 1;
                                var18_18 = var17_17 + var16_16 >> 1;
                                var7_7 = var13_13 + var12_12 >> 1;
                                var5_5 = var19_19 + 128;
                                break block44;
                            }
                            if (var4_4 != 7) break block47;
                            var7_7 = var13_13;
                            var18_18 = var17_17;
                            var5_5 = var19_19 + 128;
                            var6_6 = var9_9;
                            ** GOTO lbl165
                        }
                        if (var4_4 != 8) {
                            if (var4_4 == 9) {
                                var4_4 = var24_26 + 64;
                                var5_5 = var19_19 + 32;
                                var6_6 = var21_20 + var20_21 >> 1;
                                var7_7 = var11_11 + var10_10 >> 1;
                                var18_18 = var15_15 + var14_14 >> 1;
                            } else if (var4_4 == 10) {
                                var4_4 = var24_26 + 96;
                                var5_5 = var19_19 + 64;
                                var6_6 = var20_21 + var8_8 >> 1;
                                var7_7 = var11_11 + var12_12 >> 1;
                                var18_18 = var15_15 + var16_16 >> 1;
                            } else if (var4_4 == 11) {
                                var4_4 = var24_26 + 64;
                                var5_5 = var19_19 + 96;
                                var6_6 = var8_8 + var9_9 >> 1;
                                var7_7 = var13_13 + var12_12 >> 1;
                                var18_18 = var17_17 + var16_16 >> 1;
                            } else if (var4_4 == 12) {
                                var4_4 = var24_26 + 32;
                                var5_5 = var19_19 + 64;
                                var6_6 = var21_20 + var9_9 >> 1;
                                var7_7 = var13_13 + var10_10 >> 1;
                                var18_18 = var17_17 + var14_14 >> 1;
                            } else if (var4_4 == 13) {
                                var4_4 = var24_26 + 32;
                                var5_5 = var19_19 + 32;
                                var7_7 = var10_10;
                                var18_18 = var14_14;
                                var6_6 = var21_20;
                            } else if (var4_4 == 14) {
                                var4_4 = var24_26 + 96;
                                var5_5 = var19_19 + 32;
                                var7_7 = var11_11;
                                var18_18 = var15_15;
                                var6_6 = var20_21;
                            } else if (var4_4 == 15) {
                                var4_4 = var24_26 + 96;
                                var5_5 = var19_19 + 96;
                                var7_7 = var12_12;
                                var18_18 = var16_16;
                                var6_6 = var8_8;
                            } else {
                                var4_4 = var24_26 + 32;
                                var5_5 = var19_19 + 96;
                                var7_7 = var13_13;
                                var18_18 = var17_17;
                                var6_6 = var9_9;
                            }
                        } else {
                            var7_7 = var13_13 + var10_10 >> 1;
                            var18_18 = var17_17 + var14_14 >> 1;
                            var5_5 = var19_19 + 64;
                            var6_6 = var21_20 + var9_9 >> 1;
lbl165:
                            // 2 sources

                            var4_4 = var24_26;
                        }
                    }
                    var23_28 = var5_5;
                    var5_5 = var18_18;
                    break block41;
                }
                var23_28 = var18_18;
            }
            var27_29 = this;
            var27_29.field467[var22_27] = var4_4;
            var27_29.field462[var22_27] = var6_6;
            var27_29.field465[var22_27] = var23_28;
            var28_24[var22_27] = var7_7;
            var29_25[var22_27] = var5_5;
            ++var22_27;
        }
        for (var1_1 = 0; var1_1 < var11_11; ++var1_1) {
            var12_12 = var26_22[var4_4];
            var5_5 = var26_22[var4_4 + 1];
            var6_6 = var26_22[var4_4 + 2];
            var10_10 = var26_22[var4_4 + 3];
            var7_7 = var4_4 + 4;
            var4_4 = var5_5 < 4 ? var5_5 - var2_2 & 3 : var5_5;
            var5_5 = var6_6;
            if (var6_6 < 4) {
                var5_5 = var6_6 - var2_2 & 3;
            }
            var6_6 = var10_10;
            if (var10_10 < 4) {
                var6_6 = var10_10 - var2_2 & 3;
            }
            this.field466[var1_1] = var4_4;
            this.field468[var1_1] = var5_5;
            this.field460[var1_1] = var6_6;
            if (var12_12 == 0) {
                this.field473[var1_1] = var28_24[var4_4];
                this.field464[var1_1] = var28_24[var5_5];
                this.field472[var1_1] = var28_24[var6_6];
                if (this.field461 != null) {
                    this.field461[var1_1] = -1;
                }
            } else {
                this.field473[var1_1] = var29_25[var4_4];
                this.field464[var1_1] = var29_25[var5_5];
                this.field472[var1_1] = var29_25[var6_6];
                if (this.field461 != null) {
                    this.field461[var1_1] = var3_3;
                }
            }
            var4_4 = var7_7;
        }
        var2_2 = var21_20;
        if (var20_21 < var21_20) {
            var2_2 = var20_21;
        }
        var1_1 = var2_2;
        if (var8_8 < var2_2) {
            var1_1 = var8_8;
        }
        var2_2 = var20_21;
        if (var8_8 > var20_21) {
            var2_2 = var8_8;
        }
        var3_3 = var1_1;
        if (var9_9 < var1_1) {
            var3_3 = var9_9;
        }
        if (var9_9 <= var2_2) {
            var9_9 = var2_2;
        }
        var1_1 = var3_3 / 14;
        var1_1 = var9_9 / 14;
    }
}

