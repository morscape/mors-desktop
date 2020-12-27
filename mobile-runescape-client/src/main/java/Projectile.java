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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="iz")
@Implements(value="Projectile")
public final class Projectile
extends Entity {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1297432435)
    int field7589;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-322341837)
    @Export(value="frameCycle")
    int frameCycle;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1523888981)
    int field7593;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=993764763)
    int field7594;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-1253081829)
    @Export(value="frame")
    int frame;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1066711233)
    @Export(value="sourceZ")
    int sourceZ;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=329207215)
    int field7598;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-614326157)
    int field7600;
    @ObfuscatedName(value="am")
    @Export(value="x")
    double x;
    @ObfuscatedName(value="an")
    @Export(value="y")
    double y;
    @ObfuscatedName(value="ao")
    @Export(value="speedZ")
    double speedZ;
    @ObfuscatedName(value="ap")
    @Export(value="speed")
    double speed;
    @ObfuscatedName(value="aq")
    @Export(value="isMoving")
    boolean isMoving;
    @ObfuscatedName(value="ar")
    @Export(value="speedY")
    double speedY;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1526988463)
    int field7607;
    @ObfuscatedName(value="aw")
    @Export(value="speedX")
    double speedX;
    @ObfuscatedName(value="ay")
    @Export(value="z")
    double z;
    @ObfuscatedName(value="az")
    @Export(value="accelerationZ")
    double accelerationZ;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Ldv;")
    @Export(value="sequenceDefinition")
    SequenceDefinition sequenceDefinition;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1421890437)
    @Export(value="sourceX")
    int sourceX;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1775077147)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-459490299)
    @Export(value="yaw")
    int yaw;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=198309053)
    @Export(value="pitch")
    int pitch;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=521356095)
    @Export(value="sourceY")
    int sourceY;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1346279515)
    int field7590;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-96")
    @Export(value="advance")
    final void advance(int n) {
        this.isMoving = true;
        double d = this.x;
        double d2 = this.speedX;
        double d3 = n;
        this.x = d + d2 * d3;
        this.y += this.speedY * d3;
        this.z += this.speedZ * d3 + this.accelerationZ * 0.5 * d3 * d3;
        this.speedZ += d3 * this.accelerationZ;
        this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 0x7FF;
        this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 0x7FF;
        if (this.sequenceDefinition == null) return;
        this.frameCycle += n;
        while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
            this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
            this.frame -= -1;
            if (this.frame < this.sequenceDefinition.field7058.length) continue;
            this.frame -= this.sequenceDefinition.frameCount;
            if (this.frame >= 0 && this.frame < this.sequenceDefinition.field7058.length) continue;
            this.frame = 0;
        }
    }

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        Model model = class90.SpotAnimationDefinition_get(this.id).method13323(this.frame, (byte)78);
        if (model == null) {
            return null;
        }
        model.method14374(this.pitch);
        return model;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="1537559041")
    final void method14474(int n, int n2, int n3, int n4) {
        double d;
        if (!this.isMoving) {
            d = n - this.sourceX;
            double d2 = n2 - this.sourceY;
            double d3 = Math.sqrt(d2 * d2 + d * d);
            this.x = (double)this.sourceX + d * (double)this.field7590 / d3;
            this.y = d2 * (double)this.field7590 / d3 + (double)this.sourceY;
            this.z = this.sourceZ;
        }
        d = this.field7600 + 1 - n4;
        this.speedX = ((double)n - this.x) / d;
        this.speedY = ((double)n2 - this.y) / d;
        this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
        if (!this.isMoving) {
            this.speedZ = -this.speed * Math.tan((double)this.field7589 * 0.02454369);
        }
        this.accelerationZ = ((double)n3 - this.z - this.speedZ * d) * 2.0 / (d * d);
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1061397678")
    static final void method14468() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="dt")
    @ObfuscatedSignature(descriptor="(Lin;IIIIII)V")
    static final void method14469(Actor var0, int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        var36_7 = var0;
        var34_8 = Client.field4740.field3567.vmethod11005();
        if (var36_7 == null) return;
        if (!var36_7.isVisible()) {
            return;
        }
        if (var36_7 instanceof NPC) {
            var33_10 = var35_9 = ((NPC)var36_7).definition;
            if (var35_9.field7189 != null) {
                var33_10 = var35_9.method13364(-944307993);
            }
            if (var33_10 == null) {
                return;
            }
        }
        var6_6 = Players.Players_count * 527068741;
        var37_11 = Players.Players_indices;
        if (var1_1 >= var6_6 || var36_7.field7525 != Client.cycle || !class81.method4590((Player)var36_7, (byte)-124)) ** GOTO lbl-1000
        var33_10 = (Player)var36_7;
        if (var1_1 < var6_6) {
            class17.method344((Actor)var36_7, var36_7.field7576 + 15);
            ((class399)Client.field4795.get(FontName.FontName_plain12)).method13844(var33_10.username.getName(), var2_2 + Client.viewportTempX, var3_3 + Client.viewportTempY - 9, 0xFFFFFF, 0, (class72)var34_8);
            var9_12 = 18;
        } else lbl-1000:
        // 2 sources

        {
            var9_12 = 0;
        }
        var8_14 = var7_13 = -2;
        var10_15 = var6_6;
        var33_10 = var34_8;
        if (var36_7.field7541.method4656()) ** GOTO lbl36
        class17.method344((Actor)var36_7, var36_7.field7576 + 15);
        var35_9 = (HealthBar)var36_7.field7541.last();
        while (true) {
            block81: {
                block91: {
                    block92: {
                        block90: {
                            block89: {
                                block88: {
                                    block87: {
                                        block86: {
                                            block84: {
                                                block85: {
                                                    block82: {
                                                        block83: {
                                                            block79: {
                                                                block80: {
                                                                    block74: {
                                                                        block75: {
                                                                            block78: {
                                                                                block77: {
                                                                                    block76: {
                                                                                        block73: {
                                                                                            var8_14 = var7_13;
                                                                                            var10_15 = var6_6;
                                                                                            var33_10 = var34_8;
                                                                                            if (var35_9 == null) break block73;
                                                                                            var33_10 = var35_9.get(Client.cycle);
                                                                                            if (var33_10 == null) break block74;
                                                                                            break block75;
                                                                                        }
                                                                                        var4_4 = var8_14;
                                                                                        if (var8_14 == -2) {
                                                                                            var4_4 = var8_14 + 7;
                                                                                        }
                                                                                        var4_4 = var9_12 + var4_4;
                                                                                        if (var1_1 >= var10_15) break block76;
                                                                                        var34_8 = (Player)var36_7;
                                                                                        if (var34_8.isHidden) {
                                                                                            return;
                                                                                        }
                                                                                        break block77;
                                                                                    }
                                                                                    var35_9 = var33_10;
                                                                                    var37_11 = ((NPC)var36_7).definition;
                                                                                    var34_8 = var37_11;
                                                                                    if (var37_11.field7189 != null) {
                                                                                        var34_8 = var37_11.method13364(-944307993);
                                                                                    }
                                                                                    if (var34_8.field7186 >= 0 && var34_8.field7186 < class16.field306.length) {
                                                                                        class17.method344((Actor)var36_7, var36_7.field7576 + 15);
                                                                                        if (Client.viewportTempX > -1) {
                                                                                            var35_9.vmethod10761(class16.field306[var34_8.field7186], var2_2 + Client.viewportTempX - 12, var3_3 + Client.viewportTempY - 30, -658935604);
                                                                                        }
                                                                                    }
                                                                                    if (Client.field4768 == 1 && Client.field4783[var1_1 - var10_15] == Client.field4758 && Client.cycle % 20 < 10) {
                                                                                        class17.method344((Actor)var36_7, var36_7.field7576 + 15);
                                                                                        if (Client.viewportTempX > -1) {
                                                                                            var35_9.vmethod10761(WorldMapDecoration.field2388[0], var2_2 + Client.viewportTempX - 12, var3_3 + Client.viewportTempY - 28, 1355316665);
                                                                                        }
                                                                                    }
                                                                                    break block78;
                                                                                }
                                                                                if (var34_8.field7849 != -1 || var34_8.field7863 != -1) {
                                                                                    class17.method344((Actor)var36_7, var36_7.field7576 + 15);
                                                                                    if (Client.viewportTempX > -1) {
                                                                                        if (var34_8.field7849 != -1) {
                                                                                            var5_5 = var4_4 + 25;
                                                                                            var33_10.vmethod10761(class330.field6293[var34_8.field7849], var2_2 + Client.viewportTempX - 12, var3_3 + Client.viewportTempY - var5_5, -1208775113);
                                                                                        } else {
                                                                                            var5_5 = var4_4;
                                                                                        }
                                                                                        var4_4 = var5_5;
                                                                                        if (var34_8.field7863 != -1) {
                                                                                            var4_4 = var5_5 + 25;
                                                                                            var33_10.vmethod10761(class16.field306[var34_8.field7863], var2_2 + Client.viewportTempX - 12, var3_3 + Client.viewportTempY - var4_4, 483753441);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (var1_1 >= 0 && Client.field4768 == 10 && var37_11[var1_1] == Client.field4762) {
                                                                                    class17.method344((Actor)var36_7, var36_7.field7576 + 15);
                                                                                    if (Client.viewportTempX > -1) {
                                                                                        var5_5 = WorldMapDecoration.field2388[1].field7127;
                                                                                        var33_10.vmethod10761(WorldMapDecoration.field2388[1], var2_2 + Client.viewportTempX - 12, var3_3 + Client.viewportTempY - (var5_5 + var4_4), -1199136492);
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (var36_7.field7518 != null && (var1_1 >= var10_15 || !var36_7.field7526 && (Client.field4944 == 4 || !var36_7.field7535 && (Client.field4944 == 0 || Client.field4944 == 3 || Client.field4944 == 1 && ((Player)var36_7).method15491())))) {
                                                                                class17.method344((Actor)var36_7, var36_7.field7576);
                                                                                if (Client.viewportTempX > -1 && Client.field4838 < Client.field4824) {
                                                                                    Client.field4842[Client.field4838] = class265.field4640.method13851(var36_7.field7518) / 2;
                                                                                    Client.field4830[Client.field4838] = class265.field4640.field7300;
                                                                                    Client.field4843[Client.field4838] = Client.viewportTempX;
                                                                                    Client.field4833[Client.field4838] = Client.viewportTempY;
                                                                                    Client.field4835[Client.field4838] = var36_7.field7527;
                                                                                    Client.field4845[Client.field4838] = var36_7.field7531;
                                                                                    Client.field4832[Client.field4838] = var36_7.field7533;
                                                                                    Client.field4828[Client.field4838] = var36_7.field7518;
                                                                                    ++Client.field4838;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        var35_9 = var35_9.field6180;
                                                                        var38_16 = var35_9.method12787();
                                                                        var39_17 = var35_9.method12782();
                                                                        if (var38_16 == null) break block79;
                                                                        break block80;
                                                                    }
                                                                    var8_14 = var7_13;
                                                                    if (var35_9.isEmpty()) {
                                                                        var35_9.remove();
                                                                        var8_14 = var7_13;
                                                                    }
                                                                    break block81;
                                                                }
                                                                if (var39_17 == null) break block79;
                                                                if (var35_9.field6820 * -1504499414 >= var39_17.field7125) break block82;
                                                                break block83;
                                                            }
                                                            var10_15 = var35_9.field6821;
                                                            var11_18 = 0;
                                                            break block84;
                                                        }
                                                        var8_14 = var35_9.field6820 * -752249707;
                                                        break block85;
                                                    }
                                                    var8_14 = 0;
                                                }
                                                var10_15 = var39_17.field7125;
                                                var11_18 = var8_14;
                                                var10_15 -= var8_14 * 2;
                                            }
                                            var12_19 = Client.cycle - var33_10.cycle;
                                            var8_14 = var10_15 * var33_10.field6168 / var35_9.field6821;
                                            if (var33_10.field6170 * 200906251 <= var12_19) break block86;
                                            var12_19 = var35_9.field6814 == 0 ? 0 : var35_9.field6814 * (var12_19 / var35_9.field6814);
                                            break block87;
                                        }
                                        var13_20 = var33_10.field6170;
                                        var14_21 = var35_9.field6819;
                                        if (var35_9.field6813 < 0) break block88;
                                        var12_19 = (var14_21 * -699806531 + var13_20 * 200906251 - var12_19 << 8) / (var35_9.field6819 * -699806531 - var35_9.field6813);
                                        break block89;
                                    }
                                    var13_20 = var10_15 * var33_10.field6167 / var35_9.field6821;
                                    var8_14 = var13_20 + var12_19 * (var8_14 - var13_20) / (var33_10.field6170 * 200906251);
                                }
                                var12_19 = 255;
                            }
                            if (var33_10.field6168 <= 0) break block90;
                            var13_20 = var8_14;
                            if (var8_14 >= 1) break block91;
                            break block92;
                        }
                        var13_20 = var8_14;
                        break block91;
                    }
                    var13_20 = 1;
                }
                if (var38_16 != null && var39_17 != null) {
                    var8_14 = var13_20 == var10_15 ? var11_18 * 2 + var13_20 : var13_20 + var11_18;
                    var13_20 = var38_16.field7127;
                    var15_22 = Client.viewportTempX * -653512391;
                    var14_21 = var3_3 + Client.viewportTempY - (var7_13 += var13_20);
                    var10_15 = var15_22 * 1938124041 + var2_2 - (var10_15 >> 1) - var11_18;
                    if (var12_19 >= 0 && var12_19 < 255) {
                        var34_8.vmethod10769((class384)var38_16, var10_15, var14_21, var12_19, -1849240983);
                        var34_8.method4242(var10_15, var14_21, var10_15 + var8_14, var13_20 + var14_21);
                        var34_8.vmethod10769((class384)var39_17, var10_15, var14_21, var12_19, -2014337305);
                    } else {
                        var34_8.vmethod10761((class384)var38_16, var10_15, var14_21, -1802738703);
                        var34_8.method4242(var10_15, var14_21, var8_14 + var10_15, var14_21 + var13_20);
                        var34_8.vmethod10761((class384)var39_17, var10_15, var14_21, -79040934);
                    }
                    var34_8.method4238(var2_2, var3_3, var2_2 + var4_4, var3_3 + var5_5, -448408016);
                    var8_14 = var7_13 + 2;
                } else {
                    var7_13 += 5;
                    if (Client.viewportTempX > -1) {
                        var8_14 = var2_2 + Client.viewportTempX - (var10_15 >> 1);
                        var11_18 = var3_3 + Client.viewportTempY - var7_13;
                        var34_8.vmethod10762(var8_14, var11_18, var13_20, 5, 65280, (byte)14);
                        var34_8.vmethod10762(var13_20 + var8_14, var11_18, var10_15 - var13_20, 5, 0xFF0000, (byte)-49);
                    }
                    var8_14 = var7_13 + 2;
                }
            }
            var35_9 = (HealthBar)var36_7.field7541.previous();
            var7_13 = var8_14;
        }
        var16_23 = 0;
        var34_8 = var33_10;
        while (true) {
            block94: {
                block136: {
                    block137: {
                        block135: {
                            block120: {
                                block133: {
                                    block134: {
                                        block132: {
                                            block131: {
                                                block129: {
                                                    block130: {
                                                        block128: {
                                                            block127: {
                                                                block125: {
                                                                    block126: {
                                                                        block124: {
                                                                            block123: {
                                                                                block121: {
                                                                                    block122: {
                                                                                        block118: {
                                                                                            block119: {
                                                                                                block117: {
                                                                                                    block116: {
                                                                                                        block114: {
                                                                                                            block115: {
                                                                                                                block113: {
                                                                                                                    block112: {
                                                                                                                        block110: {
                                                                                                                            block111: {
                                                                                                                                block109: {
                                                                                                                                    block108: {
                                                                                                                                        block106: {
                                                                                                                                            block107: {
                                                                                                                                                block105: {
                                                                                                                                                    block104: {
                                                                                                                                                        block103: {
                                                                                                                                                            block102: {
                                                                                                                                                                block101: {
                                                                                                                                                                    block100: {
                                                                                                                                                                        block99: {
                                                                                                                                                                            block97: {
                                                                                                                                                                                block98: {
                                                                                                                                                                                    block96: {
                                                                                                                                                                                        block95: {
                                                                                                                                                                                            block93: {
                                                                                                                                                                                                var44_47 = var0;
                                                                                                                                                                                                if (var16_23 >= 4) return;
                                                                                                                                                                                                var5_5 = var44_47.field7544[var16_23];
                                                                                                                                                                                                if (var44_47.field7560[var16_23] < 0) break block93;
                                                                                                                                                                                                if (var5_5 <= Client.cycle) break block94;
                                                                                                                                                                                                var33_10 = class6.method74(var44_47.field7560[var16_23]);
                                                                                                                                                                                                var4_4 = var33_10.field6836;
                                                                                                                                                                                                var36_7 = var33_10;
                                                                                                                                                                                                var1_1 = var4_4;
                                                                                                                                                                                                if (var33_10 == null) break block95;
                                                                                                                                                                                                var36_7 = var33_10;
                                                                                                                                                                                                var1_1 = var4_4;
                                                                                                                                                                                                if (var33_10.field6832 == null) break block95;
                                                                                                                                                                                                var36_7 = var33_10 = var33_10.method12812(1692526150);
                                                                                                                                                                                                var1_1 = var4_4;
                                                                                                                                                                                                if (var33_10 != null) break block95;
                                                                                                                                                                                                var44_47.field7544[var16_23] = -1;
                                                                                                                                                                                                break block94;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var5_5 < 0) break block94;
                                                                                                                                                                                            var36_7 = null;
                                                                                                                                                                                            var1_1 = 0;
                                                                                                                                                                                        }
                                                                                                                                                                                        if ((var4_4 = var44_47.field7552[var16_23]) < 0) break block96;
                                                                                                                                                                                        var33_10 = var35_9 = class6.method74(var4_4);
                                                                                                                                                                                        if (var35_9 == null) break block97;
                                                                                                                                                                                        break block98;
                                                                                                                                                                                    }
                                                                                                                                                                                    var37_11 = null;
                                                                                                                                                                                    break block99;
                                                                                                                                                                                }
                                                                                                                                                                                var33_10 = var35_9;
                                                                                                                                                                                if (var35_9.field6832 != null) {
                                                                                                                                                                                    var33_10 = var35_9.method12812(2106026630);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            var37_11 = var33_10;
                                                                                                                                                                        }
                                                                                                                                                                        if (var5_5 - var1_1 > Client.cycle) break block94;
                                                                                                                                                                        if (var36_7 != null) break block100;
                                                                                                                                                                        var44_47.field7544[var16_23] = -1;
                                                                                                                                                                        break block94;
                                                                                                                                                                    }
                                                                                                                                                                    class17.method344((Actor)var44_47, var44_47.field7576 / 2);
                                                                                                                                                                    if (Client.viewportTempX <= -1) break block94;
                                                                                                                                                                    if (var16_23 == 1) {
                                                                                                                                                                        Client.viewportTempY += -20;
                                                                                                                                                                    }
                                                                                                                                                                    if (var16_23 == 2) {
                                                                                                                                                                        Client.viewportTempX += -15;
                                                                                                                                                                        Client.viewportTempY += -10;
                                                                                                                                                                    }
                                                                                                                                                                    if (var16_23 == 3) {
                                                                                                                                                                        Client.viewportTempX -= -15;
                                                                                                                                                                        Client.viewportTempY += -10;
                                                                                                                                                                    }
                                                                                                                                                                    if ((var42_45 = var36_7.method12814()) == null) break block101;
                                                                                                                                                                    var12_19 = var42_45.field7125;
                                                                                                                                                                    var1_1 = var42_45.field7127;
                                                                                                                                                                    if (var1_1 <= 0) break block102;
                                                                                                                                                                    break block103;
                                                                                                                                                                }
                                                                                                                                                                var12_19 = 0;
                                                                                                                                                                var1_1 = 0;
                                                                                                                                                                var5_5 = 0;
                                                                                                                                                                break block104;
                                                                                                                                                            }
                                                                                                                                                            var1_1 = 0;
                                                                                                                                                        }
                                                                                                                                                        var5_5 = var42_45.field7131;
                                                                                                                                                    }
                                                                                                                                                    var43_46 = var36_7.method12815();
                                                                                                                                                    if (var43_46 == null) break block105;
                                                                                                                                                    var17_24 = var43_46.field7125;
                                                                                                                                                    var6_6 = var43_46.field7127;
                                                                                                                                                    var4_4 = var1_1;
                                                                                                                                                    if (var6_6 <= var1_1) break block106;
                                                                                                                                                    break block107;
                                                                                                                                                }
                                                                                                                                                var17_24 = 0;
                                                                                                                                                var18_25 = 0;
                                                                                                                                                break block108;
                                                                                                                                            }
                                                                                                                                            var4_4 = var6_6;
                                                                                                                                        }
                                                                                                                                        var18_25 = var43_46.field7131;
                                                                                                                                        var1_1 = var4_4;
                                                                                                                                    }
                                                                                                                                    var45_48 = var36_7.method12806();
                                                                                                                                    if (var45_48 == null) break block109;
                                                                                                                                    var14_21 = var45_48.field7125;
                                                                                                                                    var4_4 = var45_48.field7127;
                                                                                                                                    var6_6 = var1_1;
                                                                                                                                    if (var4_4 <= var1_1) break block110;
                                                                                                                                    break block111;
                                                                                                                                }
                                                                                                                                var4_4 = 0;
                                                                                                                                var14_21 = 0;
                                                                                                                                break block112;
                                                                                                                            }
                                                                                                                            var6_6 = var4_4;
                                                                                                                        }
                                                                                                                        var4_4 = var45_48.field7131;
                                                                                                                        var1_1 = var6_6;
                                                                                                                    }
                                                                                                                    var49_52 = var36_7.method12807();
                                                                                                                    if (var49_52 == null) break block113;
                                                                                                                    var15_22 = var49_52.field7125;
                                                                                                                    var7_13 = var49_52.field7127;
                                                                                                                    var6_6 = var1_1;
                                                                                                                    if (var7_13 <= var1_1) break block114;
                                                                                                                    break block115;
                                                                                                                }
                                                                                                                var9_12 = 0;
                                                                                                                var15_22 = 0;
                                                                                                                break block116;
                                                                                                            }
                                                                                                            var6_6 = var7_13;
                                                                                                        }
                                                                                                        var9_12 = var49_52.field7131;
                                                                                                        var1_1 = var6_6;
                                                                                                    }
                                                                                                    var24_31 = var4_4;
                                                                                                    if (var37_11 == null) break block117;
                                                                                                    var38_16 = var37_11.method12814();
                                                                                                    if (var38_16 == null) break block118;
                                                                                                    break block119;
                                                                                                }
                                                                                                var38_16 = null;
                                                                                                var33_10 = null;
                                                                                                var6_6 = 0;
                                                                                                var10_15 = 0;
                                                                                                var21_28 = 0;
                                                                                                var19_26 = 0;
                                                                                                var20_27 = 0;
                                                                                                var4_4 = 0;
                                                                                                var8_14 = 0;
                                                                                                var13_20 = 0;
                                                                                                var39_17 = null;
                                                                                                var35_9 = null;
                                                                                                var7_13 = var1_1;
                                                                                                var1_1 = var10_15;
                                                                                                break block120;
                                                                                            }
                                                                                            var8_14 = var38_16.field7125;
                                                                                            var6_6 = var38_16.field7127;
                                                                                            var4_4 = var1_1;
                                                                                            if (var6_6 <= var1_1) break block121;
                                                                                            break block122;
                                                                                        }
                                                                                        var4_4 = 0;
                                                                                        var8_14 = 0;
                                                                                        break block123;
                                                                                    }
                                                                                    var4_4 = var6_6;
                                                                                }
                                                                                var6_6 = var38_16.field7131;
                                                                                var1_1 = var4_4;
                                                                                var4_4 = var6_6;
                                                                            }
                                                                            var35_9 = var37_11.method12815();
                                                                            if (var35_9 == null) break block124;
                                                                            var10_15 = var35_9.field7125;
                                                                            var7_13 = var35_9.field7127;
                                                                            var6_6 = var1_1;
                                                                            if (var7_13 <= var1_1) break block125;
                                                                            break block126;
                                                                        }
                                                                        var6_6 = 0;
                                                                        var10_15 = 0;
                                                                        break block127;
                                                                    }
                                                                    var6_6 = var7_13;
                                                                }
                                                                var7_13 = var35_9.field7131;
                                                                var1_1 = var6_6;
                                                                var6_6 = var7_13;
                                                            }
                                                            var21_28 = var4_4;
                                                            var33_10 = var37_11.method12806();
                                                            if (var33_10 == null) break block128;
                                                            var11_18 = var33_10.field7125;
                                                            var7_13 = var33_10.field7127;
                                                            var4_4 = var1_1;
                                                            if (var7_13 <= var1_1) break block129;
                                                            break block130;
                                                        }
                                                        var4_4 = 0;
                                                        var11_18 = 0;
                                                        break block131;
                                                    }
                                                    var4_4 = var7_13;
                                                }
                                                var7_13 = var33_10.field7131;
                                                var1_1 = var4_4;
                                                var4_4 = var7_13;
                                            }
                                            var20_27 = var6_6;
                                            var40_40 = var37_11.method12807();
                                            if (var40_40 == null) break block132;
                                            var13_20 = var4_4;
                                            var22_29 = var40_40.field7125;
                                            var4_4 = var40_40.field7127;
                                            var7_13 = var1_1;
                                            if (var4_4 <= var1_1) break block133;
                                            break block134;
                                        }
                                        var13_20 = var4_4;
                                        var39_17 = var40_40;
                                        var40_40 = var38_16;
                                        var6_6 = 0;
                                        var22_29 = 0;
                                        var38_16 = var33_10;
                                        var7_13 = var1_1;
                                        var33_10 = var39_17;
                                        var1_1 = var8_14;
                                        var19_26 = var10_15;
                                        var4_4 = var11_18;
                                        var8_14 = var13_20;
                                        var13_20 = var22_29;
                                        var39_17 = var40_40;
                                        break block120;
                                    }
                                    var7_13 = var4_4;
                                }
                                var6_6 = var40_40.field7131;
                                var39_17 = var38_16;
                                var38_16 = var33_10;
                                var33_10 = var40_40;
                                var1_1 = var8_14;
                                var19_26 = var10_15;
                                var4_4 = var11_18;
                                var8_14 = var13_20;
                                var13_20 = var22_29;
                            }
                            var26_33 = var5_5;
                            var25_32 = var9_12;
                            var40_40 = var36_7.transform();
                            var41_42 = var40_40;
                            if (var40_40 == null) {
                                var41_43 = class58.field2421;
                            }
                            if (var37_11 == null) break block135;
                            var46_49 = var37_11.transform();
                            var40_40 = var46_49;
                            if (var46_49 != null) break block136;
                            break block137;
                        }
                        var40_40 = class58.field2421;
                        break block136;
                    }
                    var40_40 = class58.field2421;
                }
                var48_51 = var42_45;
                var47_50 = var36_7.method12819(var44_47.field7553[var16_23], -1201268708);
                var22_29 = var41_44.method13851(var47_50);
                if (var37_11 != null) {
                    var42_45 = var37_11.method12819(var44_47.field7554[var16_23], -1201268708);
                    var5_5 = var40_40.method13851((String)var42_45);
                } else {
                    var42_45 = null;
                    var5_5 = 0;
                }
                var46_49 = var41_44;
                var10_15 = var17_24 > 0 ? (var45_48 == null && var49_52 == null ? 1 : var22_29 / var17_24 + 1) : 0;
                var41_41 = var45_48;
                var9_12 = var37_11 != null && var19_26 > 0 ? (var38_16 == null && var33_10 == null ? 1 : var5_5 / var19_26 + 1) : 0;
                var11_18 = var12_19 > 0 ? var12_19 + 0 : 0;
                var27_34 = var11_18 + 2;
                var11_18 = var14_21 > 0 ? var14_21 + var27_34 : var27_34;
                if (var17_24 > 0) {
                    var14_21 = var10_15 * var17_24;
                    var12_19 = var11_18 + var14_21;
                    var22_29 = var11_18 + (var14_21 - var22_29) / 2;
                } else {
                    var12_19 = var11_18 + var22_29;
                    var22_29 = var11_18;
                }
                var14_21 = var15_22 > 0 ? var12_19 + var15_22 : var12_19;
                if (var37_11 != null) {
                    var1_1 = var1_1 > 0 ? var14_21 + var1_1 : (var14_21 += 2);
                    var15_22 = var1_1 + 2;
                    var1_1 = var4_4 > 0 ? var15_22 + var4_4 : var15_22;
                    if (var19_26 > 0) {
                        var23_30 = var9_12 * var19_26;
                        var4_4 = var23_30 + var1_1;
                        var5_5 = (var23_30 - var5_5) / 2 + var1_1;
                    } else {
                        var4_4 = var5_5 + var1_1;
                        var5_5 = var1_1;
                    }
                    if (var13_20 > 0) {
                        var23_30 = var5_5;
                        var5_5 = var14_21;
                        var14_21 = var13_20 + var4_4;
                        var13_20 = var15_22;
                        var15_22 = var4_4;
                        var4_4 = var23_30;
                    } else {
                        var23_30 = var5_5;
                        var13_20 = var15_22;
                        var5_5 = var14_21;
                        var14_21 = var4_4;
                        var15_22 = var4_4;
                        var4_4 = var23_30;
                    }
                } else {
                    var5_5 = 0;
                    var13_20 = 0;
                    var15_22 = 0;
                    var4_4 = 0;
                    var1_1 = 0;
                }
                var23_30 = var44_47.field7544[var16_23] - Client.cycle;
                var28_35 = var36_7.field6837 * 1542828299;
                var31_38 = var23_30 * var36_7.field6837 / var36_7.field6836;
                var29_36 = -var36_7.field6846;
                var30_37 = var23_30 * var36_7.field6846 / var36_7.field6836;
                var28_35 = var28_35 * -372731229 - var31_38 + (var2_2 + Client.viewportTempX - (var14_21 >> 1));
                var29_36 = var3_3 + Client.viewportTempY - 12 + var29_36 + var30_37;
                var14_21 = var29_36 + 15;
                var30_37 = var14_21 + var36_7.field6834;
                var31_38 = var46_49.field7302;
                var32_39 = var46_49.field7295;
                if (var30_37 - var31_38 < var29_36) {
                    // empty if block
                }
                if (var32_39 + var30_37 > var29_36 + var7_13) {
                    // empty if block
                }
                if (var37_11 != null) {
                    var7_13 = var14_21 + var37_11.field6834;
                    var14_21 = var40_40.field7302;
                    var14_21 = var40_40.field7295;
                } else {
                    var7_13 = 0;
                }
                var14_21 = var36_7.field6841 >= 0 ? (var23_30 << 8) / (var36_7.field6836 - var36_7.field6841) : 255;
                if (var14_21 < 0 || var14_21 >= 255) {
                    if (var48_51 != null) {
                        var34_8.vmethod10761(var48_51, var28_35 + 0 - var26_33, var29_36, 1629711989);
                    }
                    var44_47 = var35_9;
                    if (var41_41 != null) {
                        var34_8.vmethod10761(var41_41, var27_34 + var28_35 - var24_31, var29_36, 1423011598);
                    }
                    if (var43_46 != null) {
                        for (var14_21 = 0; var14_21 < var10_15; ++var14_21) {
                            var34_8.vmethod10761(var43_46, var17_24 * var14_21 + (var11_18 + var28_35 - var18_25), var29_36, -1745405689);
                        }
                    }
                    if (var49_52 != null) {
                        var34_8.vmethod10761(var49_52, var12_19 + var28_35 - var25_32, var29_36, -77698151);
                    }
                    var10_15 = var36_7.field6835 * 1441386549;
                    var35_9 = var34_8;
                    var46_49.method13830(var47_50, var22_29 + var28_35, var30_37, var10_15 * -1883831779 | -16777216, 0, (class72)var35_9);
                    var34_8 = var35_9;
                    if (var37_11 != null) {
                        if (var39_17 != null) {
                            var35_9.vmethod10761((class384)var39_17, var5_5 + var28_35 - var21_28, var29_36, 23819755);
                        }
                        if (var38_16 != null) {
                            var35_9.vmethod10761((class384)var38_16, var13_20 + var28_35 - var8_14, var29_36, -432270910);
                        }
                        if (var44_47 != null) {
                            for (var5_5 = 0; var5_5 < var9_12; ++var5_5) {
                                var35_9.vmethod10761((class384)var44_47, var28_35 + var1_1 - var20_27 + var5_5 * var19_26, var29_36, 1126742892);
                            }
                        }
                        if (var33_10 != null) {
                            var35_9.vmethod10761((class384)var33_10, var28_35 + var15_22 - var6_6, var29_36, -2082290959);
                        }
                        var40_40.method13830((String)var42_45, var28_35 + var4_4, var7_13, var37_11.field6835 | -16777216, 0, (class72)var35_9);
                        var34_8 = var35_9;
                    }
                } else {
                    if (var48_51 != null) {
                        var34_8.vmethod10769(var48_51, var28_35 + 0 - var26_33, var29_36, var14_21, -1930758438);
                    }
                    if (var41_41 != null) {
                        var34_8.vmethod10769(var41_41, var27_34 + var28_35 - var24_31, var29_36, var14_21, -1943276519);
                    }
                    if (var43_46 != null) {
                        for (var23_30 = 0; var23_30 < var10_15; ++var23_30) {
                            var34_8.vmethod10769(var43_46, var17_24 * var23_30 + (var11_18 + var28_35 - var18_25), var29_36, var14_21, -1887057578);
                        }
                    }
                    if (var49_52 != null) {
                        var34_8.vmethod10769(var49_52, var12_19 + var28_35 - var25_32, var29_36, var14_21, -1960615753);
                    }
                    var46_49.method13831(var47_50, var22_29 + var28_35, var30_37, var36_7.field6835, 0, var14_21, (class72)var34_8);
                    if (var37_11 != null) {
                        if (var39_17 != null) {
                            var34_8.vmethod10769((class384)var39_17, var5_5 + var28_35 - var21_28, var29_36, var14_21, -2085453565);
                        }
                        if (var38_16 != null) {
                            var34_8.vmethod10769((class384)var38_16, var28_35 + var13_20 - var8_14, var29_36, var14_21, -2017117482);
                        }
                        if (var35_9 != null) {
                            for (var5_5 = 0; var5_5 < var9_12; ++var5_5) {
                                var34_8.vmethod10769((class384)var35_9, var28_35 + var1_1 - var20_27 + var5_5 * var19_26, var29_36, var14_21, -2124340216);
                            }
                        }
                        if (var33_10 != null) {
                            var34_8.vmethod10769((class384)var33_10, var28_35 + var15_22 - var6_6, var29_36, var14_21, -1841750765);
                        }
                        var40_40.method13831((String)var42_45, var28_35 + var4_4, var7_13, var37_11.field6835, 0, var14_21, (class72)var34_8);
                    }
                }
            }
            ++var16_23;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Lkv;Ljava/lang/String;I)V", garbageValue="1442486123")
    static void method14467(Archive object, String string2) {
        object = new ArchiveLoader((Archive)object, string2);
        Client.archiveLoaders.add(object);
        Client.field4993 = ((ArchiveLoader)object).field3433 + Client.field4993;
    }
}

