/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bs")
@Implements(value="ScriptEvent")
public class ScriptEvent
extends class47 {
    @ObfuscatedName(value="ee")
    @ObfuscatedGetter(intValue=-505431089)
    @Export(value="port3")
    static int port3;
    @ObfuscatedName(value="ae")
    int[] field4643;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=32520623)
    int field4644;
    @ObfuscatedName(value="as")
    List field4647;
    @ObfuscatedName(value="ai")
    int[] field4645;
    @ObfuscatedName(value="ak")
    int[] field4646 = new int[4700];

    @ObfuscatedSignature(descriptor="(Lbi;)V")
    ScriptEvent(class264 class2642) {
        super(class2642);
        this.field4643 = new int[4700];
        this.field4645 = new int[4700];
        this.field4647 = new LinkedList();
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
                    n4 = n17 * n22 + n23 * n18 >> 16;
                }
            } else {
                try {
                    this.method7702(model, false, false, 0L);
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
            n9 = n23 * n20 - n19 * n22 >> 16;
            n23 = n23 * n19 + n22 * n20 >> 16;
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
    final void method7684(byte by) {
        by = (byte)(this.field4644 * -231162545);
        Iterator iterator = this.field4647.iterator();
        while (iterator.hasNext()) {
            Model model = (Model)iterator.next();
            if (by * 32520623 - 100 < model.field7495) continue;
            this.method7680(model);
            model.field7495 = -1;
            model.field7490 = true;
            iterator.remove();
        }
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lcp;IIIIIIIIB)Z")
    final boolean method7695(Model model, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, byte by) {
        if (model.diameter < 1600) {
            int n9 = this.field2338.field352 * -920001371;
            int n10 = this.field2338.field357 * -1054703363;
            int n11 = class47.field2313[n];
            int n12 = class47.field2314[n];
            by = 0;
            while (true) {
                if (by >= model.verticesCount) {
                    n = 0;
                    while (true) {
                        if (n < model.indicesCount) {
                            if (model.faceColors3[n] != -2) {
                                boolean bl;
                                n2 = model.indices1[n];
                                n3 = model.indices2[n];
                                n4 = model.indices3[n];
                                n5 = this.field2329[n2];
                                n6 = this.field2329[n3];
                                n7 = this.field2329[n4];
                                if (n5 != -1 && n6 != -1 && n7 != -1 && (bl = TilePaint.method857(this.field2326[n2], this.field2326[n3], this.field2326[n4], n5, n6, n7, 5, -375082257))) {
                                    return true;
                                }
                            }
                        } else {
                            return false;
                        }
                        ++n;
                    }
                }
                int n13 = model.verticesX[by];
                int n14 = model.verticesY[by];
                int n15 = model.verticesZ[by];
                int n16 = n15;
                int n17 = n13;
                if (n != 0) {
                    n16 = n15 * n12 - n13 * n11 >> 16;
                    n17 = n11 * n15 + n12 * n13 >> 16;
                }
                if ((n14 = n2 * (n13 = n14 + n7) + (n15 = (n16 += n8) * n5 - n4 * (n17 += n6) >> 16) * n3 >> 16) < 50) {
                    int[] arrn = this.field2329;
                    this.field2326[by] = -1;
                    arrn[by] = -1;
                } else {
                    this.field2329[by] = (n17 * n5 + n4 * n16 >> 16) * this.field2338.field354 / n14 + n9 * -22322387;
                    this.field2326[by] = this.field2338.field354 * (n13 * n3 - n2 * n15 >> 16) / n14 + n10 * -469394347;
                }
                by = (byte)(by + 1);
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lcp;ZZJ)V")
    final void method7702(Model var1_1, boolean var2_2, boolean var3_3, long var4_4) {
        block31: {
            if (var1_1.diameter >= 1600) {
                return;
            }
            for (var6_5 = 0; var6_5 < var1_1.diameter; ++var6_5) {
                this.field2321[var6_5] = 0;
            }
            var6_5 = 0;
            while (true) {
                block34: {
                    block32: {
                        block33: {
                            if (var6_5 >= var1_1.indicesCount) break block32;
                            if (var1_1.faceColors3[var6_5] != -2) break block33;
                            var19_12 = var3_3;
                            break block34;
                        }
                        var9_8 = var1_1.indices1[var6_5];
                        var10_9 = var1_1.indices2[var6_5];
                        var11_10 = var1_1.indices3[var6_5];
                        var12_11 = this.field2329[var9_8];
                        var8_7 = this.field2329[var10_9];
                        var7_6 = this.field2329[var11_10];
                        if (var3_3 && TilePaint.method857(this.field2326[var9_8], this.field2326[var10_9], this.field2326[var11_10], var12_11, var8_7, var7_6, 0, 1986557843)) {
                            class64.method4019(var4_4);
                            var3_3 = false;
                        }
                        var19_12 = var3_3;
                        if ((var12_11 - var8_7) * (this.field2326[var11_10] - this.field2326[var10_9]) - (var7_6 - var8_7) * (this.field2326[var9_8] - this.field2326[var10_9]) <= 0) break block34;
                        this.field2330[var6_5] = false;
                        this.field2323[var6_5] = var12_11 < 0 || var8_7 < 0 || var7_6 < 0 || var12_11 > this.field2338.field358 || var8_7 > this.field2338.field358 || var7_6 > this.field2338.field358;
                        var7_6 = (this.field2325[var11_10] + this.field2325[var10_9] + this.field2325[var9_8]) / 3 + var1_1.radius;
                        var20_13 = this.field2322[var7_6];
                        var21_14 = this.field2321;
                        var8_7 = var21_14[var7_6];
                        var21_14[var7_6] = var8_7 + 1;
                        var20_13[var8_7] = var6_5;
                        var19_12 = var3_3;
                        break block34;
                    }
                    if (var1_1.faceRenderPriorities != null) {
                        for (var6_5 = 0; var6_5 < 12; ++var6_5) {
                            this.field2320[var6_5] = 0;
                            this.field2333[var6_5] = 0;
                        }
                        break;
                    }
                    break block31;
                }
                ++var6_5;
                var3_3 = var19_12;
            }
            var6_5 = var1_1.diameter - 1;
            while (true) {
                block36: {
                    block39: {
                        block38: {
                            block37: {
                                block35: {
                                    if (var6_5 < 0) break block35;
                                    var8_7 = this.field2321[var6_5];
                                    if (var8_7 <= 0) break block36;
                                    break block37;
                                }
                                var12_11 = this.field2320[1] <= 0 && this.field2320[2] <= 0 ? 0 : (this.field2333[1] + this.field2333[2]) / (this.field2320[1] + this.field2320[2]);
                                var13_15 = this.field2320[3] <= 0 && this.field2320[4] <= 0 ? 0 : (this.field2333[3] + this.field2333[4]) / (this.field2320[3] + this.field2320[4]);
                                var14_16 = this.field2320[6] <= 0 && this.field2320[8] <= 0 ? 0 : (this.field2333[8] + this.field2333[6]) / (this.field2320[8] + this.field2320[6]);
                                var7_6 = this.field2320[10];
                                var20_13 = this.field2328[10];
                                var21_14 = this.field2337;
                                var6_5 = var7_6;
                                if (var7_6 == 0) {
                                    var6_5 = this.field2320[11];
                                    var20_13 = this.field2328[11];
                                    var21_14 = this.field2335;
                                }
                                var7_6 = var6_5 > 0 ? var21_14[0] : -1000;
                                var22_17 = var20_13;
                                var20_13 = var21_14;
                                var9_8 = 0;
                                var8_7 = var6_5;
                                var21_14 = var22_17;
                                var6_5 = var7_6;
                                var7_6 = var8_7;
                                var8_7 = var9_8;
                                break block38;
                            }
                            var20_13 = this.field2322[var6_5];
                            break block39;
                        }
                        block4: for (var15_18 = 0; var15_18 < 10; ++var15_18) {
                            var23_19 = var20_13;
                            while (true) {
                                if (var15_18 != 0 || var6_5 <= var12_11) break;
                                var6_5 = var8_7 + 1;
                                this.method7696(var1_1, var21_14[var8_7], -892105117);
                                if (var6_5 != var7_6) ** GOTO lbl-1000
                                if (var21_14 != this.field2328[11]) {
                                    var7_6 = this.field2320[11];
                                    var20_13 = this.field2328[11];
                                    var21_14 = this.field2335;
                                    var8_7 = 0;
                                    var23_19 = var21_14;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var8_7 = var6_5;
                                    var20_13 = var21_14;
                                }
                                if (var8_7 < var7_6) {
                                    var6_5 = var23_19[var8_7];
                                    var21_14 = var20_13;
                                    continue;
                                }
                                var6_5 = -1000;
                                var21_14 = var20_13;
                            }
                            var10_9 = var8_7;
                            var11_10 = var7_6;
                            var7_6 = var6_5;
                            var20_13 = var21_14;
                            while (true) {
                                var8_7 = var10_9;
                                var9_8 = var11_10;
                                var6_5 = var7_6;
                                var21_14 = var20_13;
                                var22_17 = var23_19;
                                if (var15_18 != 3) break;
                                var8_7 = var10_9;
                                var9_8 = var11_10;
                                var6_5 = var7_6;
                                var21_14 = var20_13;
                                var22_17 = var23_19;
                                if (var7_6 <= var13_15) break;
                                var6_5 = var10_9 + 1;
                                this.method7696(var1_1, var20_13[var10_9], 1498951526);
                                if (var11_10 == var6_5 && var20_13 != this.field2328[11]) {
                                    var11_10 = this.field2320[11];
                                    var20_13 = this.field2328[11];
                                    var21_14 = this.field2335;
                                    var10_9 = 0;
                                } else {
                                    var10_9 = var6_5;
                                    var21_14 = var23_19;
                                }
                                if (var10_9 < var11_10) {
                                    var7_6 = var21_14[var10_9];
                                    var23_19 = var21_14;
                                    continue;
                                }
                                var7_6 = -1000;
                                var23_19 = var21_14;
                            }
                            while (true) {
                                block41: {
                                    block40: {
                                        if (var15_18 != 5 || var6_5 <= var14_16) break block40;
                                        var6_5 = var8_7 + 1;
                                        this.method7696(var1_1, var21_14[var8_7], 435492905);
                                        if (var9_8 != var6_5) ** GOTO lbl-1000
                                        break block41;
                                    }
                                    var10_9 = this.field2320[var15_18];
                                    var20_13 = this.field2328[var15_18];
                                    for (var7_6 = 0; var7_6 < var10_9; ++var7_6) {
                                        this.method7696(var1_1, var20_13[var7_6], 1643176360);
                                    }
                                    var7_6 = var9_8;
                                    var20_13 = var22_17;
                                    continue block4;
                                }
                                if (var21_14 != this.field2328[11]) {
                                    var9_8 = this.field2320[11];
                                    var21_14 = this.field2328[11];
                                    var22_17 = this.field2335;
                                    var8_7 = 0;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var8_7 = var6_5;
                                }
                                if (var8_7 < var9_8) {
                                    var6_5 = var22_17[var8_7];
                                    continue;
                                }
                                var6_5 = -1000;
                            }
                        }
                        while (var6_5 != -1000) {
                            var6_5 = var8_7 + 1;
                            this.method7696(var1_1, var21_14[var8_7], 2087988980);
                            if (var6_5 == var7_6 && var21_14 != this.field2328[11]) {
                                var21_14 = this.field2328[11];
                                var7_6 = this.field2320[11];
                                var20_13 = this.field2335;
                                var6_5 = 0;
                            }
                            if (var6_5 < var7_6) {
                                var9_8 = var20_13[var6_5];
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
                        var9_8 = var20_13[var7_6];
                        var10_9 = var1_1.faceRenderPriorities[var9_8];
                        var21_14 = this.field2320;
                        var11_10 = var21_14[var10_9];
                        var21_14[var10_9] = var11_10 + 1;
                        this.field2328[var10_9][var11_10] = var9_8;
                        if (var10_9 < 10) {
                            var21_14 = this.field2333;
                            var21_14[var10_9] = var6_5 + var21_14[var10_9];
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
                var20_13 = this.field2322[var6_5];
                for (var7_6 = 0; var7_6 < var8_7; ++var7_6) {
                    this.method7696(var1_1, var20_13[var7_6], -941962976);
                }
            }
            --var6_5;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lcp;I)V", garbageValue="-1665916162")
    void method7680(Model model) {
        ak.method3380(model.field7492);
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lbw;IIIIIIIIJ)V")
    public void vmethod7685(Entity entity, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l) {
        if (class47.field2317) {
            System.nanoTime();
            entity = entity.getModel();
            if (entity == null) {
                return;
            }
            if (((Model)entity).boundsType != 1) {
                ((Model)entity).calculateBoundsCylinder();
            }
            ((Model)entity).calculateBoundingBox(n);
            int n9 = n3 * ((Model)entity).xzRadius >> 16;
            int n10 = n2 * ((Model)entity).xzRadius >> 16;
            int n11 = n8 * n5 - n4 * n6 >> 16;
            int n12 = n11 * n3 + n2 * n7 >> 16;
            int n13 = n12 + n9;
            int n14 = 50;
            if (n13 > 50) {
                if (n12 >= 3500) {
                    return;
                }
                int n15 = n4 * n8 + n6 * n5 >> 16;
                int n16 = this.field2338.field354 * (n15 - ((Model)entity).xzRadius);
                if (n16 / n13 < this.field2338.field347) {
                    int n17 = this.field2338.field354 * (n15 + ((Model)entity).xzRadius);
                    if (n17 / n13 > this.field2338.field348) {
                        int n18 = n7 * n3 - n2 * n11 >> 16;
                        if ((n11 = this.field2338.field354 * (n10 + n18)) / n13 > this.field2338.field360) {
                            int n19 = entity.height * 181688425;
                            int n20 = (n18 - (n10 + (n19 * n3 * 111065049 >> 16))) * this.field2338.field354;
                            if (n20 / n13 < this.field2338.field359) {
                                n19 = AbstractWorldMapIcon.method3606(-2076394613);
                                boolean bl = false;
                                n10 = ScriptEvent.method7675((byte)0);
                                boolean bl2 = AbstractArchive.method6133();
                                if (class130.method5613(l) && bl2) {
                                    if (class33.field530) {
                                        bl2 = ParamDefinition.method13222((Model)entity, n6, n7, n8, this, 1815799028);
                                    } else {
                                        if ((n9 = n12 - n9) > 50) {
                                            n14 = n9;
                                        }
                                        if (n15 <= 0) {
                                            n17 /= n13;
                                            n9 = n16 / n14;
                                        } else {
                                            n9 = n16 / n13;
                                            n17 /= n14;
                                        }
                                        if (n18 <= 0) {
                                            n13 = n11 / n13;
                                            n14 = n20 / n14;
                                        } else {
                                            n13 = n20 / n13;
                                            n11 /= n14;
                                            n14 = n13;
                                            n13 = n11;
                                        }
                                        n11 = n19 - this.field2338.field352;
                                        n10 -= this.field2338.field357;
                                        bl2 = bl;
                                        if (n11 > n9) {
                                            bl2 = bl;
                                            if (n11 < n17) {
                                                bl2 = bl;
                                                if (n10 > n14) {
                                                    bl2 = bl;
                                                    if (n10 < n13) {
                                                        bl2 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (bl2 && (((Model)entity).isSingleTile || this.method7695((Model)entity, n, n2, n3, n4, n5, n6, n7, n8, (byte)-18))) {
                                        class64.method4019(l);
                                    }
                                }
                                n14 = class47.field2313[n];
                                n = class47.field2314[n];
                                if (((Model)entity).diameter < 1600) {
                                    if (((Model)entity).field7490) {
                                        this.method7698((Model)entity);
                                    }
                                    ak.method3397(((Model)entity).field7492, l, ((Model)entity).diameter, ((Model)entity).radius, n2, n3, n4, n5, n14, n, n6, n7, n8, n12, false);
                                    if (!((Model)entity).field7496) {
                                        if (((Model)entity).field7495 == -1) {
                                            this.field4647.add(entity);
                                        }
                                        ((Model)entity).field7495 = this.field4644;
                                    }
                                    System.nanoTime();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
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
                n4 = n15 * n20 + n16 * n19 >> 16;
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
            this.field2325[n8] = n19 - (n17 * n6 + n18 * n7 >> 16);
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
            this.method7702(model, false, false, 0L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lcp;II)V")
    final void method7696(Model model, int n, int n2) {
        int n3 = model.indices1[n];
        int n4 = model.indices2[n];
        int n5 = model.indices3[n];
        this.field2338.field344 = this.field2323[n];
        this.field2338.field350 = model.faceAlphas == null ? 0 : model.faceAlphas[n] & 0xFF;
        if (model.faceTextures != null && model.faceTextures[n] != -1) {
            int n6;
            int n7;
            if (model.field7474 != null && model.field7474[n] != -1) {
                n2 = model.field7474[n] & 0xFF;
                n7 = model.field7480[n2];
                n6 = model.field7465[n2];
                n2 = model.field7467[n2];
            } else {
                n7 = n3;
                n6 = n4;
                n2 = n5;
            }
            float f = this.field4646[n7];
            float f2 = this.field4643[n7];
            float f3 = this.field4645[n7];
            float f4 = (float)this.field4646[n6] - f;
            float f5 = (float)this.field4643[n6] - f2;
            float f6 = (float)this.field4645[n6] - f3;
            float f7 = (float)this.field4646[n2] - f;
            float f8 = (float)this.field4643[n2] - f2;
            float f9 = (float)this.field4645[n2] - f3;
            float f10 = (float)this.field4646[n3] - f;
            float f11 = (float)this.field4643[n3] - f2;
            float f12 = (float)this.field4645[n3] - f3;
            float f13 = (float)this.field4646[n4] - f;
            float f14 = (float)this.field4643[n4] - f2;
            float f15 = (float)this.field4645[n4] - f3;
            float f16 = (float)this.field4646[n5] - f;
            float f17 = (float)this.field4643[n5] - f2;
            float f18 = (float)this.field4645[n5] - f3;
            float f19 = f9 * f5 - f8 * f6;
            float f20 = f7 * f6 - f9 * f4;
            float f21 = f4 * f8 - f5 * f7;
            f2 = f21 * f8 - f20 * f9;
            float f22 = f19 * f9 - f21 * f7;
            float f23 = f7 * f20 - f8 * f19;
            float f24 = 1.0f / (f6 * f23 + (f22 * f5 + f4 * f2));
            f = (f11 * f22 + f10 * f2 + f23 * f12) * f24;
            f3 = (f23 * f15 + (f13 * f2 + f14 * f22)) * f24;
            f2 = (f2 * f16 + f22 * f17 + f23 * f18) * f24;
            f22 = f5 * f21 - f6 * f20;
            f6 = f6 * f19 - f21 * f4;
            f4 = f4 * f20 - f19 * f5;
            f7 = 1.0f / (f9 * f4 + (f7 * f22 + f8 * f6));
            f10 = f7 * (f12 * f4 + (f11 * f6 + f10 * f22));
            f14 = f7 * (f15 * f4 + (f14 * f6 + f13 * f22));
            f15 = (f22 * f16 + f17 * f6 + f4 * f18) * f7;
            f16 = f3 - f;
            f13 = f3;
            if (f16 > 0.99f) {
                f13 = f3;
                if (f16 < 1.1f) {
                    f13 = 1.0f;
                }
            }
            f16 = f2 - f13;
            f3 = f2;
            if (f16 > 0.99f) {
                f3 = f2;
                if (f16 < 1.1f) {
                    f3 = 1.0f;
                }
            }
            f16 = f - f3;
            f2 = f;
            if (f16 > 0.99f) {
                f2 = f;
                if (f16 < 1.1f) {
                    f2 = 1.0f;
                }
            }
            if ((f = f2 - f13) > 0.99f && f < 1.1f) {
                f2 = 1.0f;
            }
            if ((f = f13 - f3) > 0.99f && f < 1.1f) {
                f13 = 1.0f;
            }
            if ((f = f3 - f2) > 0.99f && f < 1.1f) {
                f3 = 1.0f;
            }
            if (model.faceColors3[n] != -1) {
                ((class264)this.field2338).method7610(this.field2331[n3], this.field2331[n4], this.field2331[n5], this.field2324[n3], this.field2324[n4], this.field2324[n5], this.field2327[n3], this.field2327[n4], this.field2327[n5], model.faceColors1[n], model.faceColors2[n], model.faceColors3[n], f2, f13, f3, f10, f14, f15, model.faceTextures[n], -1779777446);
                return;
            }
            ((class264)this.field2338).method7610(this.field2331[n3], this.field2331[n4], this.field2331[n5], this.field2324[n3], this.field2324[n4], this.field2324[n5], this.field2327[n3], this.field2327[n4], this.field2327[n5], model.faceColors1[n], model.faceColors1[n], model.faceColors1[n], f2, f13, f3, f10, f14, f15, model.faceTextures[n], -1779777446);
            return;
        }
        if (model.faceColors3[n] != -1) {
            ((class264)this.field2338).method7615(this.field2326[n3], this.field2326[n4], this.field2326[n5], this.field2329[n3], this.field2329[n4], this.field2329[n5], model.faceColors1[n], model.faceColors2[n], model.faceColors3[n]);
            return;
        }
        ((class264)this.field2338).method7624(this.field2326[n3], this.field2326[n4], this.field2326[n5], this.field2329[n3], this.field2329[n4], this.field2329[n5], class47.field2311[model.faceColors1[n]]);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lcp;S)V", garbageValue="-2740")
    void method7698(Model model) {
        ak.method3381(model.field7492, model.field7490, model.field7496, model.verticesCount, model.indicesCount, model.field7478, model.verticesX, model.verticesY, model.verticesZ, model.indices1, model.indices2, model.indices3, model.faceColors1, model.faceColors2, model.faceColors3, model.field7480, model.field7465, model.field7467, model.faceAlphas, model.faceTextures, model.field7474, model.faceRenderPriorities, model.field7494, model.field7491);
        model.field7490 = false;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1381335276")
    @Export(value="setType")
    final void setType(int n) {
        this.field4644 = n;
        this.field4647.size();
        this.method7684((byte)20);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lkc;II)V", garbageValue="1306944191")
    static void method7673(AbstractArchive abstractArchive, int n) {
        if ((0x20000000 & n) == 0) {
            if ((n & 0x40000000) == 0) {
                class128.field3451 = TileItemPile.method327(abstractArchive, "logo_osrs", "", 497838912);
                return;
            }
            class128.field3451 = TileItemPile.method327(abstractArchive, "logo_seasonal_mode", "", 2008979705);
            return;
        }
        class128.field3451 = TileItemPile.method327(abstractArchive, "logo_deadman_mode", "", 1686889995);
    }

    @ObfuscatedName(value="az")
    static final int method7675(byte by) {
        by = (byte)(class33.field527 * -1872454987);
        return by * 2007565213;
    }
}

