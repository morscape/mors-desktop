/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ad")
public class class257
extends class47 {
    @ObfuscatedSignature(descriptor="(Lbl;)V")
    class257(class265 class2652) {
        super(class2652);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lcp;IIIIIIIII)V")
    public final void vmethod7681(Model model, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int[] arrn = this.field2321;
        int n10 = 0;
        arrn[0] = -1;
        if (model.boundsType != 2 && model.boundsType != 1) {
            model.method14361();
        }
        int n11 = this.field2338.field352;
        int n12 = this.field2338.field357 * -1054703363;
        int n13 = class47.field2313[n];
        int n14 = class47.field2314[n];
        int n15 = class47.field2313[n2];
        int n16 = class47.field2314[n2];
        int n17 = class47.field2313[n3];
        int n18 = class47.field2314[n3];
        int n19 = class47.field2313[n4];
        int n20 = class47.field2314[n4];
        while (true) {
            int n21;
            int n22;
            int n23;
            if (n10 < model.verticesCount) {
                n23 = model.verticesX[n10];
                n22 = model.verticesY[n10];
                n21 = model.verticesZ[n10];
                n9 = n22;
                n4 = n23;
                if (n3 != 0) {
                    n9 = n22 * n18 - n23 * n17 >> 16;
                    n4 = n18 * n23 + n17 * n22 >> 16;
                }
            } else {
                try {
                    this.method7469(model, false, false, 0L);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            n23 = n21;
            n22 = n9;
            if (n != 0) {
                n23 = n21 * n14 + n9 * n13 >> 16;
                n22 = n9 * n14 - n21 * n13 >> 16;
            }
            n9 = n23;
            n21 = n4;
            if (n2 != 0) {
                n9 = n23 * n16 - n4 * n15 >> 16;
                n21 = n23 * n15 + n4 * n16 >> 16;
            }
            n4 = n21 + n5;
            n23 = n22 + n6;
            n22 = n9 + n7;
            n9 = n20 * n23 - n19 * n22 >> 16;
            n23 = n22 * n20 + n23 * n19 >> 16;
            this.field2325[n10] = n23 - (n19 * n6 + n20 * n7 >> 16);
            this.field2329[n10] = n11 + n4 * this.field2338.field354 / n8;
            this.field2326[n10] = n9 * this.field2338.field354 / n8 + n12 * -469394347;
            if (model.field7478 > 0) {
                this.field2324[n10] = n4;
                this.field2331[n10] = n9;
                this.field2327[n10] = n23;
            }
            ++n10;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lcp;IB)V")
    final void method7453(Model model, int n, byte by) {
        if (!this.field2330[n]) {
            int n2 = model.indices1[n];
            int n3 = model.indices2[n];
            int n4 = model.indices3[n];
            this.field2338.field344 = this.field2323[n];
            this.field2338.field350 = model.faceAlphas == null ? 0 : model.faceAlphas[n] & 0xFF;
            if (model.faceTextures != null && model.faceTextures[n] != -1) {
                int n5;
                int n6;
                if (model.field7474 != null && model.field7474[n] != -1) {
                    by = (byte)(model.field7474[n] & 0xFF);
                    n6 = model.field7480[by];
                    n5 = model.field7465[by];
                    by = (byte)model.field7467[by];
                } else {
                    n6 = n2;
                    n5 = n3;
                    by = (byte)n4;
                }
                if (model.faceColors3[n] != -1) {
                    ((class265)this.field2338).method7638(this.field2326[n2], this.field2326[n3], this.field2326[n4], this.field2329[n2], this.field2329[n3], this.field2329[n4], model.faceColors1[n], model.faceColors2[n], model.faceColors3[n], this.field2324[n6], this.field2324[n5], this.field2324[by], this.field2331[n6], this.field2331[n5], this.field2331[by], this.field2327[n6], this.field2327[n5], this.field2327[by], model.faceTextures[n], (byte)-33);
                    return;
                }
                ((class265)this.field2338).method7638(this.field2326[n2], this.field2326[n3], this.field2326[n4], this.field2329[n2], this.field2329[n3], this.field2329[n4], model.faceColors1[n], model.faceColors1[n], model.faceColors1[n], this.field2324[n6], this.field2324[n5], this.field2324[by], this.field2331[n6], this.field2331[n5], this.field2331[by], this.field2327[n6], this.field2327[n5], this.field2327[by], model.faceTextures[n], (byte)-1);
                return;
            }
            if (model.faceColors3[n] != -1) {
                ((class265)this.field2338).method7644(this.field2326[n2], this.field2326[n3], this.field2326[n4], this.field2329[n2], this.field2329[n3], this.field2329[n4], model.faceColors1[n], model.faceColors2[n], model.faceColors3[n], 1230328399);
                return;
            }
            ((class265)this.field2338).method7645(this.field2326[n2], this.field2326[n3], this.field2326[n4], this.field2329[n2], this.field2329[n3], this.field2329[n4], class47.field2311[model.faceColors1[n]], (byte)2);
            return;
        }
        this.method7464(model, n, -1824459571);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lcp;II)V")
    final void method7464(Model model, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        block38: {
            block35: {
                int n9;
                int n10;
                int n11;
                block37: {
                    block36: {
                        int[] arrn;
                        int n12;
                        int n13 = this.field2338.field352;
                        n8 = this.field2338.field357;
                        n11 = model.indices1[n];
                        n10 = model.indices2[n];
                        n9 = model.indices3[n];
                        int n14 = this.field2327[n11];
                        n7 = this.field2327[n10];
                        n6 = this.field2327[n9];
                        this.field2338.field350 = model.faceAlphas == null ? 0 : model.faceAlphas[n] & 0xFF;
                        if (n14 < 50) {
                            n12 = this.field2324[n11];
                            n5 = this.field2331[n11];
                            n4 = model.faceColors1[n];
                            if (n6 < 50) {
                                n2 = 0;
                            } else {
                                n2 = class47.field2312[n6 - n14] * (50 - n14);
                                this.field2332[0] = (n12 + (n2 * (this.field2324[n9] - n12) >> 16)) * this.field2338.field354 / 50 + n13;
                                this.field2336[0] = (n5 + (n2 * (this.field2331[n9] - n5) >> 16)) * this.field2338.field354 / 50 + n8;
                                this.field2334[0] = n4 + (n2 * (model.faceColors3[n] - n4) >> 16);
                                n2 = 1;
                            }
                            if (n7 >= 50) {
                                n3 = class47.field2312[n7 - n14] * (50 - n14);
                                this.field2332[n2] = n13 + this.field2338.field354 * (n12 + (n3 * (this.field2324[n10] - n12) >> 16)) / 50;
                                this.field2336[n2] = n8 + (n5 + (n3 * (this.field2331[n10] - n5) >> 16)) * this.field2338.field354 / 50;
                                arrn = this.field2334;
                                n12 = n2 + 1;
                                arrn[n2] = ((model.faceColors2[n] - n4) * n3 >> 16) + n4;
                                n2 = n12;
                            }
                        } else {
                            this.field2332[0] = this.field2329[n11];
                            this.field2336[0] = this.field2326[n11];
                            this.field2334[0] = model.faceColors1[n];
                            n2 = 1;
                        }
                        if (n7 < 50) {
                            int n15;
                            n5 = this.field2324[n10];
                            n3 = this.field2331[n10];
                            n4 = model.faceColors2[n];
                            if (n14 >= 50) {
                                n15 = class47.field2312[n14 - n7] * (50 - n7);
                                this.field2332[n2] = this.field2338.field354 * (n5 + (n15 * (this.field2324[n11] - n5) >> 16)) / 50 + n13;
                                this.field2336[n2] = this.field2338.field354 * (n3 + (n15 * (this.field2331[n11] - n3) >> 16)) / 50 + n8;
                                arrn = this.field2334;
                                n12 = n2 + 1;
                                arrn[n2] = ((model.faceColors1[n] - n4) * n15 >> 16) + n4;
                                n2 = n12;
                            }
                            n12 = n6;
                            if (n12 >= 50) {
                                n15 = class47.field2312[n12 - n7] * (50 - n7);
                                this.field2332[n2] = n13 + (n5 + (n15 * (this.field2324[n9] - n5) >> 16)) * this.field2338.field354 / 50;
                                this.field2336[n2] = this.field2338.field354 * (n3 + (n15 * (this.field2331[n9] - n3) >> 16)) / 50 + n8;
                                arrn = this.field2334;
                                n12 = n2 + 1;
                                arrn[n2] = n4 + ((model.faceColors3[n] - n4) * n15 >> 16);
                                n2 = n12;
                            }
                        } else {
                            this.field2332[n2] = this.field2329[n10];
                            this.field2336[n2] = this.field2326[n10];
                            arrn = this.field2334;
                            n12 = n2 + 1;
                            arrn[n2] = model.faceColors2[n];
                            n2 = n12;
                        }
                        if (n6 < 50) {
                            n5 = this.field2324[n9];
                            n3 = this.field2331[n9];
                            n4 = model.faceColors3[n];
                            if (n7 >= 50) {
                                n7 = class47.field2312[n7 - n6] * (50 - n6);
                                this.field2332[n2] = this.field2338.field354 * (n5 + (n7 * (this.field2324[n10] - n5) >> 16)) / 50 + n13;
                                this.field2336[n2] = this.field2338.field354 * (n3 + (n7 * (this.field2331[n10] - n3) >> 16)) / 50 + n8;
                                arrn = this.field2334;
                                n12 = n2 + 1;
                                arrn[n2] = n4 + ((model.faceColors2[n] - n4) * n7 >> 16);
                                n2 = n12;
                            }
                            if (n14 >= 50) {
                                n14 = class47.field2312[n14 - n6] * (50 - n6);
                                this.field2332[n2] = n13 + (n5 + (n14 * (this.field2324[n11] - n5) >> 16)) * this.field2338.field354 / 50;
                                this.field2336[n2] = this.field2338.field354 * (n3 + (n14 * (this.field2331[n11] - n3) >> 16)) / 50 + n8;
                                arrn = this.field2334;
                                n6 = n2 + 1;
                                arrn[n2] = n4 + ((model.faceColors1[n] - n4) * n14 >> 16);
                                n2 = n6;
                            }
                        } else {
                            this.field2332[n2] = this.field2329[n9];
                            this.field2336[n2] = this.field2326[n9];
                            arrn = this.field2334;
                            n6 = n2 + 1;
                            arrn[n2] = model.faceColors3[n];
                            n2 = n6;
                        }
                        n8 = this.field2332[0];
                        n7 = this.field2332[1];
                        n13 = this.field2332[2];
                        n4 = this.field2336[0];
                        n5 = this.field2336[1];
                        n3 = this.field2336[2];
                        this.field2338.field344 = false;
                        if (n2 == 3) {
                            if (n8 < 0 || n7 < 0 || n13 < 0 || n8 > this.field2338.field358 || n7 > this.field2338.field358 || n13 > this.field2338.field358) {
                                this.field2338.field344 = true;
                            }
                            if (model.faceTextures != null && model.faceTextures[n] != -1) {
                                if (model.field7474 != null && model.field7474[n] != -1) {
                                    n6 = model.field7474[n] & 0xFF;
                                    n14 = model.field7480[n6];
                                    n12 = model.field7465[n6];
                                    n6 = model.field7467[n6];
                                } else {
                                    n12 = n10;
                                    n6 = n9;
                                    n14 = n11;
                                }
                                if (model.faceColors3[n] == -1) {
                                    ((class265)this.field2338).method7638(n4, n5, n3, n8, n7, n13, model.faceColors1[n], model.faceColors1[n], model.faceColors1[n], this.field2324[n14], this.field2324[n12], this.field2324[n6], this.field2331[n14], this.field2331[n12], this.field2331[n6], this.field2327[n14], this.field2327[n12], this.field2327[n6], model.faceTextures[n], (byte)-36);
                                } else {
                                    ((class265)this.field2338).method7638(n4, n5, n3, n8, n7, n13, this.field2334[0], this.field2334[1], this.field2334[2], this.field2324[n14], this.field2324[n12], this.field2324[n6], this.field2331[n14], this.field2331[n12], this.field2331[n6], this.field2327[n14], this.field2327[n12], this.field2327[n6], model.faceTextures[n], (byte)-121);
                                }
                            } else if (model.faceColors3[n] == -1) {
                                ((class265)this.field2338).method7645(n4, n5, n3, n8, n7, n13, class47.field2311[model.faceColors1[n]], (byte)2);
                            } else {
                                ((class265)this.field2338).method7644(n4, n5, n3, n8, n7, n13, this.field2334[0], this.field2334[1], this.field2334[2], 1458121882);
                            }
                        }
                        n6 = n13;
                        if (n2 != 4) break block35;
                        if (n8 < 0 || n7 < 0 || (n2 = n6) < 0) break block36;
                        if (n8 <= this.field2338.field358 && n7 <= this.field2338.field358 && n2 <= this.field2338.field358 && this.field2332[3] >= 0 && this.field2332[3] <= this.field2338.field358) break block37;
                    }
                    this.field2338.field344 = true;
                }
                if (model.faceTextures != null && model.faceTextures[n] != -1) {
                    if (model.field7474 != null && model.field7474[n] != -1) {
                        n9 = model.field7474[n] & 0xFF;
                        n2 = model.field7480[n9];
                        n11 = model.field7465[n9];
                        n9 = model.field7467[n9];
                    } else {
                        n2 = n11;
                        n11 = n10;
                    }
                    n10 = model.faceTextures[n];
                    if (model.faceColors3[n] != -1) {
                        ((class265)this.field2338).method7638(n4, n5, n3, n8, n7, n6, this.field2334[0], this.field2334[1], this.field2334[2], this.field2324[n2], this.field2324[n11], this.field2324[n9], this.field2331[n2], this.field2331[n11], this.field2331[n9], this.field2327[n2], this.field2327[n11], this.field2327[n9], n10, (byte)-60);
                        ((class265)this.field2338).method7638(n4, n3, this.field2336[3], n8, n6, this.field2332[3], this.field2334[0], this.field2334[2], this.field2334[3], this.field2324[n2], this.field2324[n11], this.field2324[n9], this.field2331[n2], this.field2331[n11], this.field2331[n9], this.field2327[n2], this.field2327[n11], this.field2327[n9], n10, (byte)-75);
                        return;
                    }
                    ((class265)this.field2338).method7638(n4, n5, n3, n8, n7, n6, model.faceColors1[n], model.faceColors1[n], model.faceColors1[n], this.field2324[n2], this.field2324[n11], this.field2324[n9], this.field2331[n2], this.field2331[n11], this.field2331[n9], this.field2327[n2], this.field2327[n11], this.field2327[n9], n10, (byte)-7);
                    ((class265)this.field2338).method7638(n4, n3, this.field2336[3], n8, n6, this.field2332[3], model.faceColors1[n], model.faceColors1[n], model.faceColors1[n], this.field2324[n2], this.field2324[n11], this.field2324[n9], this.field2331[n2], this.field2331[n11], this.field2331[n9], this.field2327[n2], this.field2327[n11], this.field2327[n9], n10, (byte)-84);
                    return;
                }
                if (model.faceColors3[n] == -1) break block38;
                ((class265)this.field2338).method7644(n4, n5, n3, n8, n7, n6, this.field2334[0], this.field2334[1], this.field2334[2], -457324049);
                ((class265)this.field2338).method7644(n4, n3, this.field2336[3], n8, n6, this.field2332[3], this.field2334[0], this.field2334[2], this.field2334[3], -1661034533);
            }
            return;
        }
        n = class47.field2311[model.faceColors1[n]];
        ((class265)this.field2338).method7645(n4, n5, n3, n8, n7, n6, n, (byte)2);
        ((class265)this.field2338).method7645(n4, n3, this.field2336[3], n8, n6, this.field2332[3], n, (byte)2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lbw;IIIIIIIIJ)V")
    public void vmethod7685(Entity var1_1, int var2_3, int var3_4, int var4_5, int var5_6, int var6_7, int var7_8, int var8_9, int var9_10, long var10_11) {
        if ((var1_1 = var1_1.getModel()) == null) {
            return;
        }
        var27_12 = this.field2321;
        var26_13 = false;
        var27_12[0] = -1;
        if (var1_1.boundsType != 1) {
            var1_1.calculateBoundsCylinder();
        }
        var1_1.calculateBoundingBox(var2_3);
        var12_14 = var9_10 * var6_7 - var5_6 * var7_8 >> 16;
        var19_15 = var12_14 * var4_5 + var3_4 * var8_9 >> 16;
        var13_16 = var4_5 * var1_1.xzRadius >> 16;
        var16_17 = var13_16 + var19_15;
        if (var16_17 <= 50) return;
        if (var19_15 >= 3500) {
            return;
        }
        var24_18 = var5_6 * var9_10 + var7_8 * var6_7 >> 16;
        var23_19 = this.field2338.field354 * (var24_18 - var1_1.xzRadius);
        if (var23_19 / var16_17 >= this.field2338.field347) {
            return;
        }
        var15_20 = this.field2338.field354 * (var24_18 + var1_1.xzRadius);
        if (var15_20 / var16_17 <= this.field2338.field348) {
            return;
        }
        var18_21 = var8_9 * var4_5 - var3_4 * var12_14 >> 16;
        var17_22 = this.field2338.field354 * (var18_21 + (var12_14 = var3_4 * var1_1.xzRadius >> 16));
        if (var17_22 / var16_17 <= this.field2338.field360) {
            return;
        }
        var14_23 = var1_1.height * 181688425;
        var21_24 = (var18_21 - (var12_14 + (var14_23 * var4_5 * 111065049 >> 16))) * this.field2338.field354;
        if (var21_24 / var16_17 >= this.field2338.field359) {
            return;
        }
        var12_14 = var19_15 - ((var3_4 * var1_1.height >> 16) + var13_16) <= 50 ? 1 : 0;
        var12_14 = var12_14 == 0 && var1_1.field7478 <= 0 ? 0 : 1;
        var22_25 = AbstractWorldMapIcon.method3606(980994046);
        var20_26 = ScriptEvent.method7675((byte)0);
        var25_27 = AbstractArchive.method6133();
        if (!class130.method5613(var10_11) || !var25_27) ** GOTO lbl65
        if (class33.field530) {
            var25_27 = ParamDefinition.method13222((Model)var1_1, var7_8, var8_9, var9_10, this, 1609700787);
        } else {
            var13_16 = var14_23 = var19_15 - var13_16;
            if (var14_23 <= 50) {
                var13_16 = 50;
            }
            if (var24_18 > 0) {
                var14_23 = var23_19 / var16_17;
                var15_20 /= var13_16;
            } else {
                var15_20 /= var16_17;
                var14_23 = var23_19 / var13_16;
            }
            if (var18_21 > 0) {
                var16_17 = var21_24 / var16_17;
                var17_22 /= var13_16;
                var13_16 = var16_17;
                var16_17 = var17_22;
            } else {
                var16_17 = var17_22 / var16_17;
                var13_16 = var21_24 / var13_16;
            }
            var17_22 = var22_25 - this.field2338.field352;
            var18_21 = var20_26 - this.field2338.field357;
            var25_27 = var17_22 > var14_23 && var17_22 < var15_20 && var18_21 > var13_16 && var18_21 < var16_17;
        }
        if (!var25_27) ** GOTO lbl65
        if (!var1_1.isSingleTile) {
            var25_27 = true;
        } else {
            class64.method4019(var10_11);
lbl65:
            // 3 sources

            var25_27 = false;
        }
        var20_26 = this.field2338.field352 * -920001371;
        var21_24 = this.field2338.field357 * -1054703363;
        if (var2_3 != 0) {
            var13_16 = class47.field2313[var2_3];
            var14_23 = class47.field2314[var2_3];
        } else {
            var13_16 = 0;
            var14_23 = 0;
        }
        for (var15_20 = 0; var15_20 < var1_1.verticesCount; ++var15_20) {
            var18_21 = var1_1.verticesX[var15_20];
            var22_25 = var1_1.verticesY[var15_20];
            var16_17 = var1_1.verticesZ[var15_20];
            if (var2_3 != 0) {
                var17_22 = var18_21 * var14_23 + var16_17 * var13_16 >> 16;
                var16_17 = var16_17 * var14_23 - var18_21 * var13_16 >> 16;
            } else {
                var17_22 = var18_21;
            }
            var18_21 = var17_22 + var7_8;
            var17_22 = var22_25 + var8_9;
            var22_25 = var16_17 + var9_10;
            var16_17 = var18_21 * var6_7 + var5_6 * var22_25 >> 16;
            var22_25 = var22_25 * var6_7 - var5_6 * var18_21 >> 16;
            var18_21 = var17_22 * var4_5 - var3_4 * var22_25 >> 16;
            var17_22 = var3_4 * var17_22 + var22_25 * var4_5 >> 16;
            this.field2325[var15_20] = var17_22 - var19_15;
            if (var17_22 >= 50) {
                this.field2329[var15_20] = var20_26 * -22322387 + this.field2338.field354 * var16_17 / var17_22;
                this.field2326[var15_20] = this.field2338.field354 * var18_21 / var17_22 + var21_24 * -469394347;
            } else {
                this.field2329[var15_20] = -5000;
                var26_13 = true;
            }
            if (var12_14 == 0) continue;
            this.field2324[var15_20] = var16_17;
            this.field2331[var15_20] = var18_21;
            this.field2327[var15_20] = var17_22;
        }
        try {
            this.method7469((Model)var1_1, var26_13, var25_27, var10_11);
            return;
        }
        catch (Exception var1_2) {
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lcp;IIIIIIIB)V")
    public final void vmethod7687(Model model, int n, int n2, int n3, int n4, int n5, int n6, int n7, byte by) {
        int[] arrn = this.field2321;
        int n8 = 0;
        arrn[0] = -1;
        if (model.boundsType != 2 && model.boundsType != 1) {
            model.method14361();
        }
        int n9 = this.field2338.field352;
        int n10 = this.field2338.field357 * -1054703363;
        int n11 = class47.field2313[n];
        int n12 = class47.field2314[n];
        int n13 = class47.field2313[n2];
        int n14 = class47.field2314[n2];
        int n15 = class47.field2313[n3];
        int n16 = class47.field2314[n3];
        int n17 = class47.field2313[n4];
        int n18 = class47.field2314[n4];
        while (n8 < model.verticesCount) {
            int n19 = model.verticesX[n8];
            int n20 = model.verticesY[n8];
            int n21 = model.verticesZ[n8];
            n4 = n19;
            by = (byte)n20;
            if (n3 != 0) {
                by = (byte)(n20 * n16 - n19 * n15 >> 16);
                n4 = n16 * n19 + n20 * n15 >> 16;
            }
            n19 = n21;
            n20 = by;
            if (n != 0) {
                n19 = n11 * by + n21 * n12 >> 16;
                n20 = n12 * by - n21 * n11 >> 16;
            }
            by = (byte)n19;
            n21 = n4;
            if (n2 != 0) {
                by = (byte)(n19 * n14 - n4 * n13 >> 16);
                n21 = n13 * n19 + n4 * n14 >> 16;
            }
            n4 = n21 + n5;
            n19 = n20 + n6;
            n20 = n7 + by;
            by = (byte)(n19 * n18 - n17 * n20 >> 16);
            n19 = n19 * n17 + n20 * n18 >> 16;
            this.field2325[n8] = n19 - (n18 * n7 + n17 * n6 >> 16);
            this.field2329[n8] = n4 * this.field2338.field354 / n19 + n9;
            this.field2326[n8] = this.field2338.field354 * by / n19 + n10 * -469394347;
            if (model.field7478 > 0) {
                this.field2324[n8] = n4;
                this.field2331[n8] = by;
                this.field2327[n8] = n19;
            }
            ++n8;
        }
        try {
            this.method7469(model, false, false, 0L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lcp;ZZJ)V")
    final void method7469(Model var1_1, boolean var2_2, boolean var3_3, long var4_4) {
        block32: {
            if (var1_1.diameter >= 1600) {
                return;
            }
            for (var6_5 = 0; var6_5 < var1_1.diameter; ++var6_5) {
                this.field2321[var6_5] = 0;
            }
            var6_5 = 0;
            while (true) {
                block35: {
                    block33: {
                        block36: {
                            block34: {
                                if (var6_5 >= var1_1.indicesCount) break block33;
                                if (var1_1.faceColors3[var6_5] != -2) break block34;
                                var19_18 = var3_3;
                                break block35;
                            }
                            var9_8 = var1_1.indices1[var6_5];
                            var10_9 = var1_1.indices2[var6_5];
                            var11_10 = var1_1.indices3[var6_5];
                            var12_11 = this.field2329[var9_8];
                            var8_7 = this.field2329[var10_9];
                            var7_6 = this.field2329[var11_10];
                            if (var2_2 && (var12_11 == -5000 || var8_7 == -5000 || var7_6 == -5000)) break block36;
                            if (var3_3 && TilePaint.method857(this.field2326[var9_8], this.field2326[var10_9], this.field2326[var11_10], var12_11, var8_7, var7_6, 5, 2084174304)) {
                                class64.method4019(var4_4);
                                var3_3 = false;
                            }
                            var19_18 = var3_3;
                            if ((var12_11 - var8_7) * (this.field2326[var11_10] - this.field2326[var10_9]) - (var7_6 - var8_7) * (this.field2326[var9_8] - this.field2326[var10_9]) > 0) {
                                this.field2330[var6_5] = false;
                                this.field2323[var6_5] = var12_11 < 0 || var8_7 < 0 || var7_6 < 0 || var12_11 > this.field2338.field358 || var8_7 > this.field2338.field358 || var7_6 > this.field2338.field358;
                                var7_6 = (this.field2325[var11_10] + this.field2325[var10_9] + this.field2325[var9_8]) / 3 + var1_1.radius;
                                var20_19 = this.field2322[var7_6];
                                var21_20 = this.field2321;
                                var8_7 = var21_20[var7_6];
                                var21_20[var7_6] = var8_7 + 1;
                                var20_19[var8_7] = var6_5;
                                var19_18 = var3_3;
                            }
                            break block35;
                        }
                        var14_13 = this.field2324[var9_8];
                        var7_6 = this.field2324[var10_9];
                        var16_15 = this.field2324[var11_10];
                        var18_17 = this.field2331[var9_8];
                        var8_7 = this.field2331[var10_9];
                        var17_16 = this.field2331[var11_10];
                        var15_14 = this.field2327[var9_8];
                        var12_11 = this.field2327[var10_9];
                        var13_12 = this.field2327[var11_10];
                        var19_18 = var3_3;
                        if (((var13_12 -= var12_11) * (var18_17 -= var8_7) - (var17_16 -= var8_7) * (var15_14 -= var12_11)) * var7_6 + (var15_14 * (var16_15 -= var7_6) - var13_12 * (var14_13 -= var7_6)) * var8_7 + (var14_13 * var17_16 - var18_17 * var16_15) * var12_11 <= 0) break block35;
                        this.field2330[var6_5] = true;
                        var7_6 = (this.field2325[var10_9] + this.field2325[var9_8] + this.field2325[var11_10]) / 3 + var1_1.radius;
                        var20_19 = this.field2322[var7_6];
                        var21_20 = this.field2321;
                        var8_7 = var21_20[var7_6];
                        var21_20[var7_6] = var8_7 + 1;
                        var20_19[var8_7] = var6_5;
                        var19_18 = var3_3;
                        break block35;
                    }
                    if (var1_1.faceRenderPriorities != null) {
                        for (var6_5 = 0; var6_5 < 12; ++var6_5) {
                            this.field2320[var6_5] = 0;
                            this.field2333[var6_5] = 0;
                        }
                        break;
                    }
                    break block32;
                }
                ++var6_5;
                var3_3 = var19_18;
            }
            var6_5 = var1_1.diameter - 1;
            while (true) {
                block38: {
                    block41: {
                        block40: {
                            block39: {
                                block37: {
                                    if (var6_5 < 0) break block37;
                                    var8_7 = this.field2321[var6_5];
                                    if (var8_7 <= 0) break block38;
                                    break block39;
                                }
                                var12_11 = this.field2320[1] <= 0 && this.field2320[2] <= 0 ? 0 : (this.field2333[1] + this.field2333[2]) / (this.field2320[1] + this.field2320[2]);
                                var13_12 = this.field2320[3] <= 0 && this.field2320[4] <= 0 ? 0 : (this.field2333[3] + this.field2333[4]) / (this.field2320[3] + this.field2320[4]);
                                var14_13 = this.field2320[6] <= 0 && this.field2320[8] <= 0 ? 0 : (this.field2333[8] + this.field2333[6]) / (this.field2320[8] + this.field2320[6]);
                                var7_6 = this.field2320[10];
                                var20_19 = this.field2328[10];
                                var21_20 = this.field2337;
                                var6_5 = var7_6;
                                if (var7_6 != 0) break block40;
                                var6_5 = this.field2320[11];
                                var20_19 = this.field2328[11];
                                var21_20 = this.field2335;
                                break block40;
                            }
                            var20_19 = this.field2322[var6_5];
                            break block41;
                        }
                        var7_6 = var6_5 > 0 ? var21_20[0] : -1000;
                        var22_21 = var20_19;
                        var20_19 = var21_20;
                        var9_8 = 0;
                        var8_7 = var6_5;
                        var15_14 = 0;
                        var21_20 = var22_21;
                        var6_5 = var7_6;
                        var7_6 = var8_7;
                        var8_7 = var9_8;
                        block4: while (true) {
                            var16_15 = 0;
                            if (var15_14 >= 10) break;
                            var23_22 = var20_19;
                            while (true) {
                                var9_8 = var8_7;
                                var10_9 = var7_6;
                                var11_10 = var6_5;
                                var20_19 = var21_20;
                                var22_21 = var23_22;
                                if (var15_14 != 0) break;
                                var9_8 = var8_7;
                                var10_9 = var7_6;
                                var11_10 = var6_5;
                                var20_19 = var21_20;
                                var22_21 = var23_22;
                                if (var6_5 <= var12_11) break;
                                var6_5 = var8_7 + 1;
                                this.method7453(var1_1, var21_20[var8_7], (byte)112);
                                if (var6_5 == var7_6 && var21_20 != this.field2328[11]) {
                                    var7_6 = this.field2320[11];
                                    var20_19 = this.field2328[11];
                                    var21_20 = this.field2335;
                                    var8_7 = 0;
                                    var23_22 = var21_20;
                                } else {
                                    var8_7 = var6_5;
                                    var20_19 = var21_20;
                                }
                                if (var8_7 < var7_6) {
                                    var6_5 = var23_22[var8_7];
                                    var21_20 = var20_19;
                                    continue;
                                }
                                var6_5 = -1000;
                                var21_20 = var20_19;
                            }
                            block6: while (true) {
                                var23_22 = var22_21;
                                while (true) {
                                    var8_7 = var9_8;
                                    var7_6 = var10_9;
                                    var6_5 = var11_10;
                                    var21_20 = var20_19;
                                    var22_21 = var23_22;
                                    if (var15_14 != 3) break block6;
                                    var8_7 = var9_8;
                                    var7_6 = var10_9;
                                    var6_5 = var11_10;
                                    var21_20 = var20_19;
                                    var22_21 = var23_22;
                                    if (var11_10 <= var13_12) break block6;
                                    var6_5 = var9_8 + 1;
                                    this.method7453(var1_1, var20_19[var9_8], (byte)38);
                                    if (var10_9 == var6_5 && var20_19 != this.field2328[11]) {
                                        var10_9 = this.field2320[11];
                                        var20_19 = this.field2328[11];
                                        var22_21 = this.field2335;
                                        var6_5 = 0;
                                    } else {
                                        var22_21 = var23_22;
                                    }
                                    if (var6_5 < var10_9) {
                                        var11_10 = var22_21[var6_5];
                                        var9_8 = var6_5;
                                        continue block6;
                                    }
                                    var11_10 = -1000;
                                    var9_8 = var6_5;
                                    var23_22 = var22_21;
                                }
                                break;
                            }
                            while (true) {
                                block43: {
                                    block42: {
                                        if (var15_14 != 5 || var6_5 <= var14_13) break block42;
                                        var6_5 = var8_7 + 1;
                                        this.method7453(var1_1, var21_20[var8_7], (byte)2);
                                        if (var6_5 != var7_6) ** GOTO lbl-1000
                                        break block43;
                                    }
                                    var10_9 = this.field2320[var15_14];
                                    var20_19 = this.field2328[var15_14];
                                    for (var9_8 = var16_15; var9_8 < var10_9; ++var9_8) {
                                        this.method7453(var1_1, var20_19[var9_8], (byte)23);
                                    }
                                    ++var15_14;
                                    var20_19 = var22_21;
                                    continue block4;
                                }
                                if (var21_20 != this.field2328[11]) {
                                    var7_6 = this.field2320[11];
                                    var21_20 = this.field2328[11];
                                    var22_21 = this.field2335;
                                    var8_7 = 0;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var8_7 = var6_5;
                                }
                                if (var8_7 < var7_6) {
                                    var6_5 = var22_21[var8_7];
                                    continue;
                                }
                                var6_5 = -1000;
                            }
                            break;
                        }
                        while (var6_5 != -1000) {
                            var6_5 = var8_7 + 1;
                            this.method7453(var1_1, var21_20[var8_7], (byte)57);
                            if (var7_6 == var6_5 && var21_20 != this.field2328[11]) {
                                var21_20 = this.field2328[11];
                                var7_6 = this.field2320[11];
                                var20_19 = this.field2335;
                                var6_5 = 0;
                            }
                            if (var6_5 < var7_6) {
                                var9_8 = var20_19[var6_5];
                                var8_7 = var6_5;
                                var6_5 = var9_8;
                                continue;
                            }
                            var9_8 = -1000;
                            var8_7 = var6_5;
                            var6_5 = var9_8;
                        }
                        return;
                    }
                    for (var7_6 = 0; var7_6 < var8_7; ++var7_6) {
                        var9_8 = var20_19[var7_6];
                        var10_9 = var1_1.faceRenderPriorities[var9_8];
                        var21_20 = this.field2320;
                        var11_10 = var21_20[var10_9];
                        var21_20[var10_9] = var11_10 + 1;
                        this.field2328[var10_9][var11_10] = var9_8;
                        if (var10_9 < 10) {
                            var21_20 = this.field2333;
                            var21_20[var10_9] = var6_5 + var21_20[var10_9];
                            continue;
                        }
                        if (var10_9 == 10) {
                            this.field2337[var11_10] = var6_5;
                            continue;
                        }
                        this.field2335[var11_10] = var6_5;
                    }
                }
                --var6_5;
            }
        }
        var6_5 = var1_1.diameter - 1;
        while (var6_5 >= 0) {
            var8_7 = this.field2321[var6_5];
            if (var8_7 > 0) {
                var20_19 = this.field2322[var6_5];
                for (var7_6 = 0; var7_6 < var8_7; ++var7_6) {
                    this.method7453(var1_1, var20_19[var7_6], (byte)70);
                }
            }
            --var6_5;
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;B)V", garbageValue="-27")
    public static void method7442(Collection collection) {
        collection.add(VarbitDefinition.field6828);
        collection.add(VarbitDefinition.field6824);
        collection.add(VarbitDefinition.VarbitDefinition_cached);
    }

    @ObfuscatedName(value="fb")
    @ObfuscatedSignature(descriptor="(Lax;IIZZI)V")
    static void method7444(Widget widget, int n, int n2, boolean bl, boolean bl2, int n3) {
        n3 = widget.width * 2031473261;
        int n4 = widget.height * 529619377;
        if (widget.field4483 == 0) {
            widget.width = widget.field4491;
        } else if (widget.field4483 == 1) {
            widget.width = n - widget.field4491;
        } else if (widget.field4483 == 2) {
            widget.width = widget.field4491 * n >> 14;
        }
        if (widget.field4501 == 0) {
            widget.height = widget.field4495;
        } else if (widget.field4501 == 1) {
            widget.height = n2 - widget.field4495;
        } else if (widget.field4501 == 2) {
            widget.height = n2 * widget.field4495 >> 14;
        }
        if (widget.field4483 == 4) {
            widget.width = widget.height * widget.field4489 / widget.field4488;
        }
        if (widget.field4501 == 4) {
            widget.height = widget.width * widget.field4488 / widget.field4489;
        }
        if (widget.type == 1337) {
            Client.field4887 = widget;
        }
        if (bl && widget.field4588 != null && (widget.width != n3 * 978257765 || widget.height != n4 * -35303599 || bl2)) {
            class312 class3122 = new class312();
            class3122.field6160 = widget;
            class3122.field6162 = widget.field4588;
            Client.field4935.method4082(class3122);
        }
    }
}

