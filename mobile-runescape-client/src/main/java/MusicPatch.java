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

@ObfuscatedName(value="ll")
@Implements(value="MusicPatch")
public class MusicPatch
extends Node {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Lhb;")
    @Export(value="rawSounds")
    RawSound[] rawSounds;
    @ObfuscatedName(value="ah")
    byte[] field6349;
    @ObfuscatedName(value="aj")
    byte[] field6351;
    @ObfuscatedName(value="al")
    int[] field6353;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="[Llr;")
    MusicPatchNode2[] field6354;
    @ObfuscatedName(value="ai")
    short[] field6350;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1489684637)
    int field6352;
    @ObfuscatedName(value="ax")
    byte[] field6355;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    MusicPatch(byte[] var1_1) {
        block79: {
            super();
            this.rawSounds = new RawSound[128];
            this.field6350 = new short[128];
            this.field6355 = new byte[128];
            this.field6349 = new byte[128];
            this.field6354 = new MusicPatchNode2[128];
            this.field6351 = new byte[128];
            this.field6353 = new int[128];
            var14_18 = new Buffer(var1_1 /* !! */ );
            var2_19 /* !! */  = 0;
            while (var14_18.array[var2_19 /* !! */  + var14_18.offset] != 0) {
                ++var2_19 /* !! */ ;
            }
            var1_2 = new byte[var2_19 /* !! */ ];
            for (var3_20 = 0; var3_20 < var2_19 /* !! */ ; ++var3_20) {
                var1_2[var3_20] = var14_18.method11636(1423757757);
            }
            ++var14_18.offset;
            var6_21 = var14_18.offset;
            var14_18.offset = var2_19 /* !! */  + var14_18.offset + 1;
            var2_19 /* !! */  = 0;
            while (var14_18.array[var2_19 /* !! */  + var14_18.offset] != 0) {
                ++var2_19 /* !! */ ;
            }
            var18_34 = new byte[var2_19 /* !! */ ];
            for (var3_20 = 0; var3_20 < var2_19 /* !! */ ; ++var3_20) {
                var18_34[var3_20] = var14_18.method11636(1638987329);
            }
            ++var14_18.offset;
            var9_35 /* !! */  = var14_18.offset;
            var14_18.offset = var2_19 /* !! */  + var14_18.offset + 1;
            var2_19 /* !! */  = 0;
            while (var14_18.array[var2_19 /* !! */  + var14_18.offset] != 0) {
                ++var2_19 /* !! */ ;
            }
            var16_36 = new byte[var2_19 /* !! */ ];
            for (var3_20 = 0; var3_20 < var2_19 /* !! */ ; ++var3_20) {
                var16_36[var3_20] = var14_18.method11636(1960141574);
            }
            ++var14_18.offset;
            var7_37 = var2_19 /* !! */  + 1;
            var17_44 = new byte[var7_37];
            var8_45 = var7_37;
            if (var7_37 <= 1) break block79;
            var17_44[1] = 1;
            var5_46 = true;
            var4_62 = 2;
            var2_19 /* !! */  = 2;
            while (true) {
                block83: {
                    block81: {
                        block82: {
                            block80: {
                                if (++var4_63 >= var7_37) break block80;
                                var8_45 = var14_18.method11650(-2065873645);
                                if (var8_45 != 0) break block81;
                                break block82;
                            }
                            var8_45 = var2_19 /* !! */ ;
                            break;
                        }
                        var3_20 = var2_19 /* !! */ ;
                        var5_47 = var2_19 /* !! */  + 1;
                        var2_19 /* !! */  = var3_20;
                        var3_20 = var5_47;
                        break block83;
                    }
                    var3_20 = var8_45;
                    if (var8_45 <= var5_47) {
                        var3_20 = var8_45 - 1;
                    }
                    var5_47 = var3_20;
                    var3_20 = var2_19 /* !! */ ;
                    var2_19 /* !! */  = var5_47;
                }
                var17_44[var4_63] = (byte)var2_19 /* !! */ ;
                var5_47 = var2_19 /* !! */ ;
                var2_19 /* !! */  = var3_20;
            }
        }
        var15_83 = new MusicPatchNode2[var8_45];
        var2_19 /* !! */  = 0;
        while (true) {
            block85: {
                block86: {
                    block84: {
                        if (var2_19 /* !! */  >= var15_83.length) break block84;
                        var12_84 = new MusicPatchNode2();
                        var15_83[var2_19 /* !! */ ] = var12_84;
                        var3_20 = var14_18.method11650(80998947);
                        if (var3_20 <= 0) break block85;
                        break block86;
                    }
                    var2_19 /* !! */  = var14_18.method11650(-1785206101);
                    var12_84 = var2_19 /* !! */  > 0 ? (Object)new byte[var2_19 /* !! */  * 2] : null;
                    var2_19 /* !! */  = var14_18.method11650(278010522);
                    var13_85 = var2_19 /* !! */  > 0 ? new byte[var2_19 /* !! */  * 2] : null;
                    var2_19 /* !! */  = 0;
                    while (var14_18.array[var2_19 /* !! */  + var14_18.offset] != 0) {
                        ++var2_19 /* !! */ ;
                    }
                    var19_86 = new byte[var2_19 /* !! */ ];
                    for (var3_20 = 0; var3_20 < var2_19 /* !! */ ; ++var3_20) {
                        var19_86[var3_20] = var14_18.method11636(1622688141);
                    }
                    ++var14_18.offset;
                    var4_64 = false;
                    var2_19 /* !! */  = var6_21;
                    for (var3_20 = 0; var3_20 < 128; ++var3_20) {
                        this.field6350[var3_20] = (short)(var4_65 += var14_18.method11650(-705275523));
                    }
                    var7_38 = var2_19 /* !! */ ;
                    var3_20 = 0;
                    for (var2_19 /* !! */  = 0; var2_19 /* !! */  < 128; ++var2_19 /* !! */ ) {
                        var20_87 = this.field6350;
                        var20_87[var2_19 /* !! */ ] = (short)(((var3_20 += var14_18.method11650(-64282105)) << 8) + var20_87[var2_19 /* !! */ ]);
                    }
                    break;
                }
                var12_84.field3799 = new byte[var3_20 * 2];
            }
            if ((var3_20 = var14_18.method11650(-1256403814)) > 0) {
                var12_84.field3795 = new byte[var3_20 * 2 + 2];
                var12_84.field3795[1] = 64;
            }
            ++var2_19 /* !! */ ;
        }
        var6_22 = false;
        var4_66 = false;
        var2_19 /* !! */  = 0;
        var5_48 = 0;
        var3_20 = var9_35 /* !! */ ;
        var9_35 /* !! */  = var5_48;
        while (true) {
            if (++var6_23 >= 128) break;
            var10_92 = var4_67;
            var5_49 = var2_19 /* !! */ ;
            if (var4_67 == 0) {
                if (var2_19 /* !! */  < var19_86.length) {
                    var4_67 = var19_86[var2_19 /* !! */ ];
                    ++var2_19 /* !! */ ;
                } else {
                    var4_67 = -1;
                }
                var9_35 /* !! */  = var14_18.method11674(-993774520);
                var5_49 = var2_19 /* !! */ ;
                var10_92 = var4_67;
            }
            var20_91 = this.field6350;
            var20_91[var6_23] = (short)(((var9_35 /* !! */  - 1 & 2) << 14) + var20_91[var6_23]);
            this.field6353[var6_23] = var9_35 /* !! */ ;
            var4_67 = var10_92 - 1;
            var2_19 /* !! */  = var5_49;
        }
        var9_35 /* !! */  = 0;
        var5_50 = false;
        var2_19 /* !! */  = 0;
        var6_24 = false;
        var4_68 = var7_38;
        while (true) {
            if (var9_35 /* !! */  >= 128) break;
            if (this.field6353[var9_35 /* !! */ ] == 0) {
            } else {
                if (var5_51 == 0) {
                    if (var2_19 /* !! */  < var1_2.length) {
                        var5_51 = var1_2[var2_19 /* !! */ ];
                        ++var2_19 /* !! */ ;
                    } else {
                        var5_51 = -1;
                    }
                    var20_90 = var14_18.array;
                    var7_39 = var4_69 + true;
                    var6_25 = var20_90[var4_69] - 1;
                    var4_69 = var7_39;
                }
                this.field6351[var9_35 /* !! */ ] = (byte)var6_25;
                --var5_51;
            }
            ++var9_35 /* !! */ ;
        }
        var9_35 /* !! */  = 0;
        var4_70 = false;
        var2_19 /* !! */  = 0;
        var6_26 = false;
        while (true) {
            if (var9_35 /* !! */  >= 128) break;
            if (this.field6353[var9_35 /* !! */ ] == 0) {
            } else {
                var10_92 = var4_71;
                var7_40 = var2_19 /* !! */ ;
                var5_52 = var3_20;
                if (var4_71 == 0) {
                    if (var2_19 /* !! */  < var18_34.length) {
                        var4_71 = var18_34[var2_19 /* !! */ ];
                        ++var2_19 /* !! */ ;
                    } else {
                        var4_71 = -1;
                    }
                    var6_27 = var14_18.array[var3_20] + 16 << 2;
                    var5_52 = var3_20 + 1;
                    var7_40 = var2_19 /* !! */ ;
                    var10_92 = var4_71;
                }
                this.field6349[var9_35 /* !! */ ] = (byte)var6_27;
                var4_71 = var10_92 - 1;
                var2_19 /* !! */  = var7_40;
                var3_20 = var5_52;
            }
            ++var9_35 /* !! */ ;
        }
        var6_28 = false;
        var3_20 = 0;
        var2_19 /* !! */  = 0;
        var1_3 = null;
        while (true) {
            if (++var6_29 >= 128) break;
            if (this.field6353[var6_29] == 0) {
                continue;
            }
            var5_53 = var3_20;
            var4_72 = var2_19 /* !! */ ;
            if (var3_20 == 0) {
                var1_17 = var15_83[var17_44[var2_19 /* !! */ ]];
                if (var2_19 /* !! */  < var16_36.length) {
                    var5_53 = var16_36[var2_19 /* !! */ ];
                    var4_72 = var2_19 /* !! */  + 1;
                } else {
                    var5_53 = -1;
                    var4_72 = var2_19 /* !! */ ;
                }
            }
            this.field6354[var6_29] = var1_4;
            var3_20 = var5_53 - 1;
            var2_19 /* !! */  = var4_72;
        }
        var4_73 = false;
        var3_20 = 0;
        var2_19 /* !! */  = 0;
        var5_54 = false;
        while (true) {
            if (++var4_74 >= 128) break;
            var9_35 /* !! */  = var3_20;
            var6_30 = var2_19 /* !! */ ;
            var7_41 = var5_55;
            if (var3_20 == 0) {
                if (var2_19 /* !! */  < var19_86.length) {
                    var3_20 = var19_86[var2_19 /* !! */ ];
                    ++var2_19 /* !! */ ;
                } else {
                    var3_20 = -1;
                }
                var9_35 /* !! */  = var3_20;
                var6_30 = var2_19 /* !! */ ;
                var7_41 = var5_55;
                if (this.field6353[var4_74] > 0) {
                    var7_41 = var14_18.method11650(1012628719) + 1;
                    var6_30 = var2_19 /* !! */ ;
                    var9_35 /* !! */  = var3_20;
                }
            }
            this.field6355[var4_74] = (byte)var7_41;
            var3_20 = var9_35 /* !! */  - 1;
            var2_19 /* !! */  = var6_30;
            var5_55 = var7_41;
        }
        this.field6352 = var14_18.method11650(-1862081120) + 1;
        var2_19 /* !! */  = 0;
        while (true) {
            block88: {
                block89: {
                    block87: {
                        if (var2_19 /* !! */  >= var8_45) break block87;
                        var1_6 = var15_83[var2_19 /* !! */ ];
                        if (var1_6.field3799 == null) break block88;
                        break block89;
                    }
                    if (var12_84 != null) {
                        for (var2_19 /* !! */  = 1; var2_19 /* !! */  < ((Object)var12_84).length; var2_19 /* !! */  += 2) {
                            var12_84[var2_19 /* !! */ ] = var14_18.method11636(1957123240);
                        }
                    }
                    if (var13_85 != null) {
                        for (var2_19 /* !! */  = 1; var2_19 /* !! */  < var13_85.length; var2_19 /* !! */  += 2) {
                            var13_85[var2_19 /* !! */ ] = var14_18.method11636(1877114027);
                        }
                    }
                    break;
                }
                for (var3_20 = 1; var3_20 < var1_6.field3799.length; var3_20 += 2) {
                    var1_6.field3799[var3_20] = var14_18.method11636(2007518652);
                }
            }
            if (var1_6.field3795 != null) {
                for (var3_20 = 3; var3_20 < var1_6.field3795.length - 2; var3_20 += 2) {
                    var1_6.field3795[var3_20] = var14_18.method11636(1511996367);
                }
            }
            ++var2_19 /* !! */ ;
        }
        var2_19 /* !! */  = 0;
        while (true) {
            if (var2_19 /* !! */  >= var8_45) break;
            var1_8 = var15_83[var2_19 /* !! */ ];
            if (var1_8.field3795 != null) {
                var4_75 = 0;
                for (var3_20 = 2; var3_20 < var1_8.field3795.length; var3_20 += 2) {
                    var4_75 = var4_75 + 1 + var14_18.method11650(665642698);
                    var1_8.field3795[var3_20] = (byte)var4_75;
                }
            }
            ++var2_19 /* !! */ ;
        }
        var2_19 /* !! */  = 0;
        while (true) {
            block91: {
                block92: {
                    block90: {
                        if (var2_19 /* !! */  >= var8_45) break block90;
                        var1_10 = var15_83[var2_19 /* !! */ ];
                        if (var1_10.field3799 == null) break block91;
                        break block92;
                    }
                    if (var12_84 != null) {
                        var3_20 = var14_18.method11650(1262592602);
                        var12_84[0] = (byte)var3_20;
                        for (var2_19 /* !! */  = 2; var2_19 /* !! */  < ((Object)var12_84).length; var2_19 /* !! */  += 2) {
                            var3_20 = var3_20 + 1 + var14_18.method11650(-971302499);
                            var12_84[var2_19 /* !! */ ] = (byte)var3_20;
                        }
                        var5_56 = var12_84[0];
                        var4_77 = var12_84[1];
                        for (var2_19 /* !! */  = 0; var2_19 /* !! */  < var5_56; ++var2_19 /* !! */ ) {
                            this.field6355[var2_19 /* !! */ ] = (byte)(var4_77 * this.field6355[var2_19 /* !! */ ] + 32 >> 6);
                        }
                        break;
                    }
                    ** GOTO lbl328
                }
                var4_76 = 0;
                for (var3_20 = 2; var3_20 < var1_10.field3799.length; var3_20 += 2) {
                    var4_76 = var4_76 + 1 + var14_18.method11650(-1113977987);
                    var1_10.field3799[var3_20] = (byte)var4_76;
                }
            }
            ++var2_19 /* !! */ ;
        }
        var3_20 = 2;
        var2_19 /* !! */  = (int)var5_56;
        while (true) {
            block94: {
                block93: {
                    var5_57 /* !! */  = var2_19 /* !! */ ;
                    if (var3_20 >= ((Object)var12_84).length) break block93;
                    var7_42 = var12_84[var3_20];
                    var6_31 = var12_84[var3_20 + 1];
                    var9_35 /* !! */  = (int)(var7_42 - var2_19 /* !! */ );
                    var5_57 /* !! */  = var9_35 /* !! */  / 2 + var9_35 /* !! */  * var4_78;
                    break block94;
                }
                while (++var5_58 < 128) {
                    this.field6355[var5_58] = (byte)(var4_78 * this.field6355[var5_58] + 32 >> 6);
                }
lbl328:
                // 2 sources

                if (var13_85 != null) {
                    var3_20 = var14_18.method11650(-348345480);
                    var13_85[0] = (byte)var3_20;
                    for (var2_19 /* !! */  = 2; var2_19 /* !! */  < var13_85.length; var2_19 /* !! */  += 2) {
                        var3_20 = var3_20 + 1 + var14_18.method11650(1947986812);
                        var13_85[var2_19 /* !! */ ] = (byte)var3_20;
                    }
                    break;
                }
                ** GOTO lbl378
            }
            while (var2_19 /* !! */  < var7_42) {
                var10_92 = WorldMapManager.method3642(var5_57 /* !! */ , var9_35 /* !! */ , 1986193890);
                this.field6355[var2_19 /* !! */ ] = (byte)(var10_92 * this.field6355[var2_19 /* !! */ ] + 32 >> 6);
                var5_57 /* !! */  += var6_31 - var4_78;
                ++var2_19 /* !! */ ;
            }
            var3_20 += 2;
            var2_19 /* !! */  = (int)var7_42;
            var4_78 = var6_31;
        }
        var6_32 = var13_85[0];
        var5_59 = var13_85[1] << 1;
        var3_20 = 0;
        while (true) {
            if (var3_20 >= var6_32) break;
            var2_19 /* !! */  = var4_79 = var5_59 + (this.field6349[var3_20] & 255);
            if (var4_79 < 0) {
                var2_19 /* !! */  = 0;
            }
            var4_79 = var2_19 /* !! */ ;
            if (var2_19 /* !! */  > 128) {
                var4_79 = 128;
            }
            this.field6349[var3_20] = (byte)var4_79;
            ++var3_20;
        }
        var2_19 /* !! */  = var6_32;
        var4_80 = 2;
        var3_20 = var5_59;
        block33: while (true) {
            block95: {
                var5_60 /* !! */  = var2_19 /* !! */ ;
                if ((var4_81 += 2) >= var13_85.length) {
                    while (++var5_61 < 128) {
                        var2_19 /* !! */  = var4_82 = var3_20 + (this.field6349[var5_61] & 255);
                        if (var4_82 < 0) {
                            var2_19 /* !! */  = 0;
                        }
                        var4_82 = var2_19 /* !! */ ;
                        if (var2_19 /* !! */  > 128) {
                            var4_82 = 128;
                        }
                        this.field6349[var5_61] = (byte)var4_82;
                    }
                }
                break block95;
lbl378:
                // 3 sources

                for (var2_19 /* !! */  = 0; var2_19 /* !! */  < var8_45; ++var2_19 /* !! */ ) {
                    var15_83[var2_19 /* !! */ ].field3797 = var14_18.method11650(1467860641);
                }
                var2_19 /* !! */  = 0;
                while (true) {
                    block97: {
                        block98: {
                            block96: {
                                if (var2_19 /* !! */  >= var8_45) break block96;
                                var1_12 = var15_83[var2_19 /* !! */ ];
                                if (var1_12.field3799 == null) break block97;
                                break block98;
                            }
                            for (var2_19 /* !! */  = 0; var2_19 /* !! */  < var8_45; ++var2_19 /* !! */ ) {
                                var15_83[var2_19 /* !! */ ].field3800 = var14_18.method11650(959211402);
                            }
                            break;
                        }
                        var1_12.field3802 = var14_18.method11650(836169882);
                    }
                    if (var1_12.field3795 != null) {
                        var1_12.field3796 = var14_18.method11650(143510019);
                    }
                    if (var1_12.field3797 > 0) {
                        var1_12.field3801 = var14_18.method11650(-940588011);
                    }
                    ++var2_19 /* !! */ ;
                }
                var2_19 /* !! */  = 0;
                while (true) {
                    block100: {
                        block101: {
                            block99: {
                                if (var2_19 /* !! */  >= var8_45) break block99;
                                var1_14 = var15_83[var2_19 /* !! */ ];
                                if (var1_14.field3800 <= 0) break block100;
                                break block101;
                            }
                            var2_19 /* !! */  = 0;
                            while (var2_19 /* !! */  < var8_45) {
                                var1_16 = var15_83[var2_19 /* !! */ ];
                                if (var1_16.field3798 > 0) {
                                    var1_16.field3794 = var14_18.method11650(-512325642);
                                }
                                ++var2_19 /* !! */ ;
                            }
                            return;
                        }
                        var1_14.field3798 = var14_18.method11650(-394285776);
                    }
                    ++var2_19 /* !! */ ;
                }
            }
            var10_92 = var13_85[var4_81];
            var9_35 /* !! */  = var13_85[var4_81 + true] << 1;
            var11_93 = var10_92 - var2_19 /* !! */ ;
            var6_33 = var11_93 / 2 + var3_20 * var11_93;
            var5_60 /* !! */  = var2_19 /* !! */ ;
            while (true) {
                block103: {
                    block104: {
                        block102: {
                            if (var5_60 /* !! */  >= var10_92) break block102;
                            var2_19 /* !! */  = WorldMapManager.method3642(var6_33, var11_93, 1986193890) + (this.field6349[var5_60 /* !! */ ] & 255);
                            if (var2_19 /* !! */  >= 0) break block103;
                            break block104;
                        }
                        var2_19 /* !! */  = var10_92;
                        var3_20 = var9_35 /* !! */ ;
                        continue block33;
                    }
                    var2_19 /* !! */  = 0;
                }
                var7_43 /* !! */  = var2_19 /* !! */ ;
                if (var2_19 /* !! */  > 128) {
                    var7_43 /* !! */  = 128;
                }
                this.field6349[var5_60 /* !! */ ] = (byte)var7_43 /* !! */ ;
                var6_33 += var9_35 /* !! */  - var3_20;
                ++var5_60 /* !! */ ;
            }
            break;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lhu;[B[II)Z")
    boolean method11601(SoundCache soundCache, byte[] arrby, int[] arrn, int n) {
        boolean bl = true;
        RawSound rawSound = null;
        int n2 = 0;
        n = 0;
        while (true) {
            RawSound rawSound2;
            int n3;
            boolean bl2;
            block8: {
                block7: {
                    block6: {
                        if (n2 >= 128) break block6;
                        if (arrby == null) break block7;
                        bl2 = bl;
                        n3 = n;
                        rawSound2 = rawSound;
                        if (arrby[n2] == 0) break block8;
                        break block7;
                    }
                    return bl;
                }
                n3 = this.field6353[n2];
                if (n3 == 0) {
                    bl2 = bl;
                    n3 = n;
                    rawSound2 = rawSound;
                } else {
                    if (n3 != n) {
                        n = n3 - 1;
                        rawSound = (n & 1) != 0 ? soundCache.method5266(n >> 2, arrn) : soundCache.method5261(n >> 2, arrn);
                        rawSound = rawSound2 = rawSound;
                        n = n3;
                        if (rawSound2 == null) {
                            bl = false;
                            rawSound = rawSound2;
                            n = n3;
                        }
                    }
                    if (rawSound != null) {
                        this.rawSounds[n2] = rawSound;
                        this.field6353[n2] = 0;
                    }
                    rawSound2 = rawSound;
                    n3 = n;
                    bl2 = bl;
                }
            }
            ++n2;
            bl = bl2;
            n = n3;
            rawSound = rawSound2;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-22")
    @Export(value="clear")
    void clear() {
        this.field6353 = null;
    }
}

