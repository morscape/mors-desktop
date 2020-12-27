/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bk")
@Implements(value="ModelData")
public class ModelData
extends Entity {
    @ObfuscatedName(value="bd")
    static int[] field7314 = new int[10000];
    @ObfuscatedName(value="be")
    @Export(value="ModelData_cosine")
    static final int[] ModelData_cosine;
    @ObfuscatedName(value="bt")
    @Export(value="ModelData_sine")
    static final int[] ModelData_sine;
    @ObfuscatedName(value="bc")
    static int[] field7313;
    @ObfuscatedName(value="bz")
    static int field7317;
    @ObfuscatedName(value="aa")
    @Export(value="faceRenderTypes")
    byte[] faceRenderTypes;
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="[Lbm;")
    @Export(value="faceNormals")
    FaceNormal[] faceNormals;
    @ObfuscatedName(value="ae")
    @Export(value="verticesX")
    int[] verticesX;
    @ObfuscatedName(value="af")
    @Export(value="faceAlphas")
    byte[] faceAlphas;
    @ObfuscatedName(value="ag")
    @Export(value="faceLabelsAlpha")
    int[][] faceLabelsAlpha;
    @ObfuscatedName(value="ah")
    @Export(value="faceCount")
    int faceCount;
    @ObfuscatedName(value="aj")
    @Export(value="indices2")
    int[] indices2;
    @ObfuscatedName(value="al")
    @Export(value="indices3")
    int[] indices3;
    @ObfuscatedName(value="am")
    @Export(value="faceColors")
    short[] faceColors;
    @ObfuscatedName(value="an")
    @Export(value="faceTextures")
    short[] faceTextures;
    @ObfuscatedName(value="ao")
    @Export(value="texTriangleY")
    short[] texTriangleY;
    @ObfuscatedName(value="ap")
    @Export(value="texTriangleX")
    short[] texTriangleX;
    @ObfuscatedName(value="aq")
    @Export(value="textureCoords")
    byte[] textureCoords;
    @ObfuscatedName(value="ar")
    @Export(value="textureRenderTypes")
    byte[] textureRenderTypes;
    @ObfuscatedName(value="as")
    @Export(value="indices1")
    int[] indices1;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="[Lbt;")
    @Export(value="vertexNormals")
    VertexNormal[] vertexNormals;
    @ObfuscatedName(value="aw")
    @Export(value="textureTriangleCount")
    int textureTriangleCount;
    @ObfuscatedName(value="ay")
    @Export(value="priority")
    byte priority;
    @ObfuscatedName(value="az")
    @Export(value="texTriangleZ")
    short[] texTriangleZ;
    @ObfuscatedName(value="bg")
    @Export(value="contrast")
    public short contrast;
    @ObfuscatedName(value="bh")
    int field7346;
    @ObfuscatedName(value="bj")
    int field7348;
    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="[Lbt;")
    VertexNormal[] field7350;
    @ObfuscatedName(value="bq")
    int field7351;
    @ObfuscatedName(value="br")
    int field7352;
    @ObfuscatedName(value="ad")
    @Export(value="vertexLabels")
    int[][] vertexLabels;
    @ObfuscatedName(value="ai")
    @Export(value="verticesY")
    int[] verticesY;
    @ObfuscatedName(value="ak")
    @Export(value="verticesCount")
    int verticesCount;
    @ObfuscatedName(value="at")
    @Export(value="vertexSkins")
    int[] vertexSkins;
    @ObfuscatedName(value="av")
    @Export(value="faceSkins")
    int[] faceSkins;
    @ObfuscatedName(value="ax")
    @Export(value="verticesZ")
    int[] verticesZ;
    @ObfuscatedName(value="bi")
    @Export(value="ambient")
    public short ambient;
    @ObfuscatedName(value="ab")
    @Export(value="faceRenderPriorities")
    byte[] faceRenderPriorities;
    @ObfuscatedName(value="bf")
    @Export(value="isBoundsCalculated")
    boolean isBoundsCalculated;
    @ObfuscatedName(value="bk")
    int field7349;

    static {
        field7313 = new int[10000];
        field7317 = 0;
        ModelData_sine = Rasterizer3D.Rasterizer3D_sine;
        ModelData_cosine = Rasterizer3D.Rasterizer3D_cosine;
    }

    ModelData() {
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedSignature(descriptor="([Lbk;I)V")
    public ModelData(ModelData[] arrmodelData, int n) {
        int n2;
        int n3;
        ModelData modelData;
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        this.priority = (byte)-1;
        int n4 = 0;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        while (true) {
            int n8;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            block21: {
                block23: {
                    block22: {
                        block20: {
                            if (n4 >= n) break block20;
                            modelData = arrmodelData[n4];
                            bl6 = bl;
                            bl5 = bl2;
                            bl4 = bl3;
                            n8 = n5;
                            n3 = n6;
                            n2 = n7;
                            if (modelData == null) break block21;
                            this.verticesCount += modelData.verticesCount;
                            this.faceCount += modelData.faceCount;
                            this.textureTriangleCount += modelData.textureTriangleCount;
                            if (modelData.faceRenderPriorities != null) break block22;
                            if (this.priority == -1) {
                                this.priority = modelData.priority;
                            }
                            if (this.priority == modelData.priority) break block23;
                            break block22;
                        }
                        this.verticesX = new int[this.verticesCount];
                        this.verticesY = new int[this.verticesCount];
                        this.verticesZ = new int[this.verticesCount];
                        this.vertexSkins = new int[this.verticesCount];
                        this.indices1 = new int[this.faceCount];
                        this.indices2 = new int[this.faceCount];
                        this.indices3 = new int[this.faceCount];
                        if (bl) {
                            this.faceRenderTypes = new byte[this.faceCount];
                        }
                        if (bl2) {
                            this.faceRenderPriorities = new byte[this.faceCount];
                        }
                        if (bl3) {
                            this.faceAlphas = new byte[this.faceCount];
                        }
                        if (n5 != 0) {
                            this.faceSkins = new int[this.faceCount];
                        }
                        if (n6 != 0) {
                            this.faceTextures = new short[this.faceCount];
                        }
                        if (n7 != 0) {
                            this.textureCoords = new byte[this.faceCount];
                        }
                        this.faceColors = new short[this.faceCount];
                        if (this.textureTriangleCount > 0) {
                            this.textureRenderTypes = new byte[this.textureTriangleCount];
                            this.texTriangleX = new short[this.textureTriangleCount];
                            this.texTriangleY = new short[this.textureTriangleCount];
                            this.texTriangleZ = new short[this.textureTriangleCount];
                        }
                        break;
                    }
                    bl2 = true;
                }
                n2 = modelData.faceRenderTypes != null ? 1 : 0;
                bl6 = bl | n2;
                bl = modelData.faceAlphas != null;
                bl4 = bl3 | bl;
                bl3 = modelData.faceSkins != null;
                n8 = n5 | bl3;
                n5 = modelData.faceTextures != null ? 1 : 0;
                n3 = n6 | n5;
                n6 = modelData.textureCoords != null ? 1 : 0;
                n2 = n7 | n6;
                bl5 = bl2;
            }
            ++n4;
            bl = bl6;
            bl2 = bl5;
            bl3 = bl4;
            n5 = n8;
            n6 = n3;
            n7 = n2;
        }
        this.verticesCount = 0;
        this.faceCount = 0;
        this.textureTriangleCount = 0;
        n4 = 0;
        while (n4 < n) {
            modelData = arrmodelData[n4];
            if (modelData != null) {
                n2 = 0;
                while (true) {
                    if (n2 >= modelData.faceCount) break;
                    if (bl && modelData.faceRenderTypes != null) {
                        this.faceRenderTypes[this.faceCount] = modelData.faceRenderTypes[n2];
                    }
                    if (bl2) {
                        this.faceRenderPriorities[this.faceCount] = modelData.faceRenderPriorities != null ? modelData.faceRenderPriorities[n2] : modelData.priority;
                    }
                    if (bl3 && modelData.faceAlphas != null) {
                        this.faceAlphas[this.faceCount] = modelData.faceAlphas[n2];
                    }
                    if (n5 != 0 && modelData.faceSkins != null) {
                        this.faceSkins[this.faceCount] = modelData.faceSkins[n2];
                    }
                    if (n6 != 0) {
                        this.faceTextures[this.faceCount] = modelData.faceTextures != null ? modelData.faceTextures[n2] : -1;
                    }
                    if (n7 != 0) {
                        this.textureCoords[this.faceCount] = modelData.textureCoords != null && modelData.textureCoords[n2] != -1 ? (int)(this.textureTriangleCount + modelData.textureCoords[n2]) : -1;
                    }
                    this.faceColors[this.faceCount] = modelData.faceColors[n2];
                    this.indices1[this.faceCount] = this.method13940(modelData, modelData.indices1[n2]);
                    this.indices2[this.faceCount] = this.method13940(modelData, modelData.indices2[n2]);
                    this.indices3[this.faceCount] = this.method13940(modelData, modelData.indices3[n2]);
                    ++this.faceCount;
                    ++n2;
                }
                for (n2 = 0; n2 < modelData.textureTriangleCount; ++this.textureTriangleCount, ++n2) {
                    byte by;
                    byte[] arrby = this.textureRenderTypes;
                    n3 = this.textureTriangleCount;
                    arrby[n3] = by = modelData.textureRenderTypes[n2];
                    if (by != 0) continue;
                    this.texTriangleX[this.textureTriangleCount] = (short)this.method13940(modelData, modelData.texTriangleX[n2]);
                    this.texTriangleY[this.textureTriangleCount] = (short)this.method13940(modelData, modelData.texTriangleY[n2]);
                    this.texTriangleZ[this.textureTriangleCount] = (short)this.method13940(modelData, modelData.texTriangleZ[n2]);
                }
            }
            ++n4;
        }
        return;
    }

    ModelData(byte[] arrby) {
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
        if (arrby[arrby.length - 1] == -1 && arrby[arrby.length - 2] == -1) {
            this.method13924(arrby);
            return;
        }
        this.method13928(arrby);
    }

    @ObfuscatedSignature(descriptor="(Lbk;ZZZZ)V", garbageValue="1")
    public ModelData(ModelData modelData, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        int n;
        boolean bl5 = false;
        this.verticesCount = 0;
        this.faceCount = 0;
        this.priority = 0;
        this.isBoundsCalculated = false;
        this.verticesCount = modelData.verticesCount;
        this.faceCount = modelData.faceCount;
        this.textureTriangleCount = modelData.textureTriangleCount;
        if (bl) {
            this.verticesX = modelData.verticesX;
            this.verticesY = modelData.verticesY;
            this.verticesZ = modelData.verticesZ;
        } else {
            this.verticesX = new int[this.verticesCount];
            this.verticesY = new int[this.verticesCount];
            this.verticesZ = new int[this.verticesCount];
            for (n = 0; n < this.verticesCount; ++n) {
                this.verticesX[n] = modelData.verticesX[n];
                this.verticesY[n] = modelData.verticesY[n];
                this.verticesZ[n] = modelData.verticesZ[n];
            }
        }
        if (bl2) {
            this.faceColors = modelData.faceColors;
        } else {
            this.faceColors = new short[this.faceCount];
            for (n = 0; n < this.faceCount; ++n) {
                this.faceColors[n] = modelData.faceColors[n];
            }
        }
        if (!bl3 && modelData.faceTextures != null) {
            this.faceTextures = new short[this.faceCount];
            for (n = 0; n < this.faceCount; ++n) {
                this.faceTextures[n] = modelData.faceTextures[n];
            }
        } else {
            this.faceTextures = modelData.faceTextures;
        }
        this.faceAlphas = modelData.faceAlphas;
        this.indices1 = modelData.indices1;
        this.indices2 = modelData.indices2;
        this.indices3 = modelData.indices3;
        this.faceRenderTypes = modelData.faceRenderTypes;
        this.faceRenderPriorities = modelData.faceRenderPriorities;
        this.textureCoords = modelData.textureCoords;
        this.priority = modelData.priority;
        this.textureRenderTypes = modelData.textureRenderTypes;
        this.texTriangleX = modelData.texTriangleX;
        this.texTriangleY = modelData.texTriangleY;
        this.texTriangleZ = modelData.texTriangleZ;
        this.vertexSkins = modelData.vertexSkins;
        this.faceSkins = modelData.faceSkins;
        this.vertexLabels = modelData.vertexLabels;
        this.faceLabelsAlpha = modelData.faceLabelsAlpha;
        this.vertexNormals = modelData.vertexNormals;
        this.faceNormals = modelData.faceNormals;
        this.field7350 = modelData.field7350;
        this.ambient = modelData.ambient;
        this.contrast = modelData.contrast;
    }

    @ObfuscatedName(value="aa")
    public void method13922() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = -this.verticesX[i];
            this.verticesZ[i] = -this.verticesZ[i];
        }
        this.invalidate();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ae")
    void method13924(byte[] var1_1) {
        block36: {
            var36_2 = new Buffer(var1_1);
            var37_3 = new Buffer(var1_1);
            var38_4 = new Buffer(var1_1);
            var39_5 = new Buffer(var1_1);
            var40_6 = new Buffer(var1_1);
            var41_7 = new Buffer(var1_1);
            var42_8 = new Buffer(var1_1);
            var36_2.offset = var1_1.length - 23;
            var17_9 = var36_2.method11637(-1117852628);
            var24_10 = var36_2.method11637(268318320);
            var23_11 = var36_2.method11650(-301137267);
            var32_12 = var36_2.method11650(1446331531);
            var33_13 = var36_2.method11650(-1369413397);
            var13_14 = var36_2.method11650(1318806635);
            var14_15 = var36_2.method11650(-999838719);
            var15_16 = var36_2.method11650(1514640967);
            var34_17 = var36_2.method11650(-1777305300);
            var18_18 = var36_2.method11637(1338123897);
            var5_19 = var36_2.method11637(1683658731);
            var16_20 = var36_2.method11637(-437607446);
            var22_21 = var36_2.method11637(588135195);
            var19_22 = var36_2.method11637(-704288191);
            if (var23_11 > 0) break block36;
            var11_27 = 0;
            var10_28 = 0;
            var9_29 = 0;
            var12_30 = var5_19;
            ** GOTO lbl48
        }
        this.textureRenderTypes = new byte[var23_11];
        var7_23 = 0;
        var36_2.offset = 0;
        var6_24 = 0;
        var4_25 = 0;
        var3_26 = 0;
        while (true) {
            if (var7_23 < var23_11) {
                var1_1 = this.textureRenderTypes;
                var1_1[var7_23] = var2_31 = var36_2.method11636(2005628175);
                var8_32 = var6_24;
                if (var2_31 == 0) {
                    var8_32 = var6_24 + 1;
                }
            } else {
                var11_27 = var6_24;
                var10_28 = var4_25;
                var9_29 = var3_26;
                var12_30 = var5_19;
lbl48:
                // 2 sources

                var20_33 = var23_11 + var17_9;
                var6_24 = var32_12 == 1 ? var20_33 + var24_10 : var20_33;
                var21_34 = var6_24 + var24_10;
                var3_26 = var33_13 == 255 ? var21_34 + var24_10 : var21_34;
                var5_19 = var14_15 == 1 ? var3_26 + var24_10 : var3_26;
                var4_25 = var34_17 == 1 ? var5_19 + var17_9 : var5_19;
                var7_23 = var13_14 == 1 ? var4_25 + var24_10 : var4_25;
                var22_21 = var7_23 + var22_21;
                var8_32 = var15_16 == 1 ? var24_10 * 2 + var22_21 : var22_21;
                var35_35 = var19_22 + var8_32;
                var19_22 = var24_10 * 2 + var35_35;
                var18_18 = var19_22 + var18_18;
                var12_30 = var18_18 + var12_30;
                var26_36 = var12_30 + var16_20;
                var28_37 = var11_27 * 6 + var26_36;
                var11_27 = var10_28 * 6;
                var29_38 = var28_37 + var11_27;
                var30_39 = var29_38 + var11_27;
                var25_40 = var10_28 * 2;
                var31_41 = var30_39 + var25_40;
                var27_42 = var31_41 + var10_28;
                this.verticesCount = var17_9;
                this.faceCount = var24_10;
                this.textureTriangleCount = var23_11;
                this.verticesX = new int[var17_9];
                this.verticesY = new int[var17_9];
                this.verticesZ = new int[var17_9];
                this.indices1 = new int[var24_10];
                this.indices2 = new int[var24_10];
                this.indices3 = new int[var24_10];
                if (var34_17 == 1) {
                    this.vertexSkins = new int[var17_9];
                }
                if (var32_12 == 1) {
                    this.faceRenderTypes = new byte[var24_10];
                }
                if (var33_13 == 255) {
                    this.faceRenderPriorities = new byte[var24_10];
                } else {
                    this.priority = (byte)var33_13;
                }
                if (var13_14 == 1) {
                    this.faceAlphas = new byte[var24_10];
                }
                if (var14_15 == 1) {
                    this.faceSkins = new int[var24_10];
                }
                if (var15_16 == 1) {
                    this.faceTextures = new short[var24_10];
                }
                if (var15_16 == 1 && var23_11 > 0) {
                    this.textureCoords = new byte[var24_10];
                }
                this.faceColors = new short[var24_10];
                if (var23_11 > 0) {
                    this.texTriangleX = new short[var23_11];
                    this.texTriangleY = new short[var23_11];
                    this.texTriangleZ = new short[var23_11];
                }
                var10_28 = var15_16;
                var36_2.offset = var23_11;
                var37_3.offset = var19_22;
                var38_4.offset = var18_18;
                var11_27 = var14_15;
                var39_5.offset = var12_30;
                var40_6.offset = var5_19;
                var5_19 = var13_14;
                var14_15 = 0;
                var15_16 = 0;
                var16_20 = 0;
                var12_30 = var17_9;
                break;
            }
            var9_29 = var4_25;
            if (var2_31 >= 1) {
                var9_29 = var4_25;
                if (var2_31 <= 3) {
                    var9_29 = var4_25 + 1;
                }
            }
            var10_28 = var3_26;
            if (var2_31 == 2) {
                var10_28 = var3_26 + 1;
            }
            ++var7_23;
            var6_24 = var8_32;
            var4_25 = var9_29;
            var3_26 = var10_28;
        }
        for (var13_14 = 0; var13_14 < var12_30; ++var13_14) {
            var19_22 = var36_2.method11650(288466822);
            var17_9 = (var19_22 & 1) != 0 ? var37_3.method11672(1290114973) : 0;
            var18_18 = (var19_22 & 2) != 0 ? var38_4.method11672(1290114973) : 0;
            var19_22 = (var19_22 & 4) != 0 ? var39_5.method11672(1290114973) : 0;
            this.verticesX[var13_14] = var14_15 + var17_9;
            this.verticesY[var13_14] = var15_16 + var18_18;
            this.verticesZ[var13_14] = var16_20 + var19_22;
            var14_15 = this.verticesX[var13_14];
            var15_16 = this.verticesY[var13_14];
            var16_20 = this.verticesZ[var13_14];
            if (var34_17 != 1) continue;
            this.vertexSkins[var13_14] = var40_6.method11650(212478758);
        }
        var36_2.offset = var35_35;
        var37_3.offset = var20_33;
        var38_4.offset = var21_34;
        var39_5.offset = var4_25;
        var40_6.offset = var3_26;
        var41_7.offset = var22_21;
        var42_8.offset = var8_32;
        var3_26 = 0;
        while (true) {
            if (var3_26 < var24_10) {
                this.faceColors[var3_26] = (short)var36_2.method11637(1343686660);
                if (var32_12 == 1) {
                    this.faceRenderTypes[var3_26] = var37_3.method11636(1998939740);
                }
            } else {
                var36_2.offset = var7_23;
                var37_3.offset = var6_24;
                var6_24 = 0;
                var4_25 = 0;
                var5_19 = 0;
                var3_26 = 0;
                break;
            }
            if (var33_13 == 255) {
                this.faceRenderPriorities[var3_26] = var38_4.method11636(2057107401);
            }
            if (var5_19 == 1) {
                this.faceAlphas[var3_26] = var39_5.method11636(2030082324);
            }
            if (var11_27 == 1) {
                this.faceSkins[var3_26] = var40_6.method11650(1418131732);
            }
            if (var10_28 == 1) {
                this.faceTextures[var3_26] = (short)(var41_7.method11637(1565061846) - 1);
            }
            if (this.textureCoords != null && this.faceTextures[var3_26] != -1) {
                this.textureCoords[var3_26] = (byte)(var42_8.method11650(882943629) - 1);
            }
            ++var3_26;
        }
        for (var10_28 = 0; var10_28 < var24_10; ++var10_28) {
            var11_27 = var37_3.method11650(351049321);
            if (var11_27 == 1) {
                var6_24 = var36_2.method11672(1290114973) + var6_24;
                var3_26 = var36_2.method11672(1290114973) + var6_24;
                var4_25 = var36_2.method11672(1290114973) + var3_26;
                this.indices1[var10_28] = var6_24;
                this.indices2[var10_28] = var3_26;
                this.indices3[var10_28] = var4_25;
                var8_32 = var4_25;
            } else {
                var8_32 = var6_24;
                var6_24 = var4_25;
                var4_25 = var5_19;
            }
            var5_19 = var4_25;
            var7_23 = var8_32;
            if (var11_27 == 2) {
                var7_23 = var36_2.method11672(1290114973) + var8_32;
                this.indices1[var10_28] = var6_24;
                this.indices2[var10_28] = var4_25;
                this.indices3[var10_28] = var7_23;
                var3_26 = var4_25;
                var5_19 = var7_23;
            }
            if (var11_27 == 3) {
                this.indices1[var10_28] = var5_19;
                this.indices2[var10_28] = var3_26;
                this.indices3[var10_28] = var7_23 += var36_2.method11672(1290114973);
                var4_25 = var7_23;
            } else {
                var4_25 = var5_19;
                var5_19 = var6_24;
            }
            if (var11_27 == 4) {
                var7_23 = var36_2.method11672(1290114973) + var7_23;
                this.indices1[var10_28] = var3_26;
                this.indices2[var10_28] = var5_19;
                this.indices3[var10_28] = var7_23;
                var4_25 = var3_26;
                var3_26 = var5_19;
                var6_24 = var7_23;
                var5_19 = var7_23;
                continue;
            }
            var6_24 = var5_19;
            var5_19 = var4_25;
            var4_25 = var6_24;
            var6_24 = var7_23;
        }
        var36_2.offset = var26_36;
        var37_3.offset = var28_37;
        var38_4.offset = var29_38;
        var39_5.offset = var30_39;
        var40_6.offset = var31_41;
        var41_7.offset = var27_42;
        var3_26 = 0;
        while (true) {
            if (var3_26 >= var23_11) {
                var36_2.offset = var9_29 * 2 + var27_42 + var25_40;
                if (var36_2.method11650(159281020) == 0) return;
                new class28();
                var36_2.method11637(1208571620);
                var36_2.method11637(976872949);
                var36_2.method11637(845963298);
                var36_2.method11670(1604085085);
                return;
            }
            if ((this.textureRenderTypes[var3_26] & 255) == 0) {
                this.texTriangleX[var3_26] = (short)var36_2.method11637(-1441019741);
                this.texTriangleY[var3_26] = (short)var36_2.method11637(-1437411310);
                this.texTriangleZ[var3_26] = (short)var36_2.method11637(1088995444);
            }
            ++var3_26;
        }
    }

    @ObfuscatedName(value="af")
    @Export(value="rotateZ")
    public void rotateZ(int n) {
        int n2 = ModelData_sine[n];
        int n3 = ModelData_cosine[n];
        for (n = 0; n < this.verticesCount; ++n) {
            int n4 = this.verticesZ[n];
            int n5 = this.verticesX[n];
            this.verticesZ[n] = n3 * this.verticesZ[n] - n2 * this.verticesX[n] >> 16;
            this.verticesX[n] = n4 * n2 + n5 * n3 >> 16;
        }
        this.invalidate();
    }

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        return null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Lbk;")
    public ModelData method13927() {
        ModelData modelData = new ModelData();
        if (this.faceRenderTypes != null) {
            modelData.faceRenderTypes = new byte[this.faceCount];
            for (int i = 0; i < this.faceCount; ++i) {
                modelData.faceRenderTypes[i] = this.faceRenderTypes[i];
            }
        }
        modelData.verticesCount = this.verticesCount;
        modelData.faceCount = this.faceCount;
        modelData.textureTriangleCount = this.textureTriangleCount;
        modelData.verticesX = this.verticesX;
        modelData.verticesY = this.verticesY;
        modelData.verticesZ = this.verticesZ;
        modelData.indices1 = this.indices1;
        modelData.indices2 = this.indices2;
        modelData.indices3 = this.indices3;
        modelData.faceRenderPriorities = this.faceRenderPriorities;
        modelData.faceAlphas = this.faceAlphas;
        modelData.textureCoords = this.textureCoords;
        modelData.faceColors = this.faceColors;
        modelData.faceTextures = this.faceTextures;
        modelData.priority = this.priority;
        modelData.textureRenderTypes = this.textureRenderTypes;
        modelData.texTriangleX = this.texTriangleX;
        modelData.texTriangleY = this.texTriangleY;
        modelData.texTriangleZ = this.texTriangleZ;
        modelData.vertexSkins = this.vertexSkins;
        modelData.faceSkins = this.faceSkins;
        modelData.vertexLabels = this.vertexLabels;
        modelData.faceLabelsAlpha = this.faceLabelsAlpha;
        modelData.vertexNormals = this.vertexNormals;
        modelData.faceNormals = this.faceNormals;
        modelData.ambient = this.ambient;
        modelData.contrast = this.contrast;
        return modelData;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aj")
    void method13929() {
        int[] arrn;
        int n;
        int n2;
        int n3;
        int n4;
        int[] arrn2 = this.vertexSkins;
        int n5 = 0;
        if (arrn2 != null) {
            arrn2 = new int[256];
            n4 = 0;
            n3 = 0;
            while (true) {
                if (n4 < this.verticesCount) {
                    n2 = this.vertexSkins[n4];
                    arrn2[n2] = arrn2[n2] + 1;
                    n = n3;
                    if (n2 > n3) {
                        n = n2;
                    }
                } else {
                    this.vertexLabels = new int[n3 + 1][];
                    for (n4 = 0; n4 <= n3; ++n4) {
                        this.vertexLabels[n4] = new int[arrn2[n4]];
                        arrn2[n4] = 0;
                    }
                    n3 = 0;
                    while (n3 < this.verticesCount) {
                        n4 = this.vertexSkins[n3];
                        arrn = this.vertexLabels[n4];
                        n = arrn2[n4];
                        arrn2[n4] = n + 1;
                        arrn[n] = n3++;
                    }
                    break;
                }
                ++n4;
                n3 = n;
            }
        }
        if (this.faceSkins == null) return;
        arrn2 = new int[256];
        n4 = 0;
        n3 = 0;
        while (true) {
            if (n4 < this.faceCount) {
                n2 = this.faceSkins[n4];
                arrn2[n2] = arrn2[n2] + 1;
                n = n3;
                if (n2 > n3) {
                    n = n2;
                }
            } else {
                this.faceLabelsAlpha = new int[n3 + 1][];
                n = 0;
                while (true) {
                    n4 = n5;
                    if (n > n3) {
                        while (n4 < this.faceCount) {
                            n3 = this.faceSkins[n4];
                            arrn = this.faceLabelsAlpha[n3];
                            n = arrn2[n3];
                            arrn2[n3] = n + 1;
                            arrn[n] = n4++;
                        }
                        return;
                    }
                    this.faceLabelsAlpha[n] = new int[arrn2[n]];
                    arrn2[n] = 0;
                    ++n;
                }
            }
            ++n4;
            n3 = n;
        }
    }

    @ObfuscatedName(value="al")
    public void method13930() {
        for (int i = 0; i < this.verticesCount; ++i) {
            int n = this.verticesX[i];
            this.verticesX[i] = this.verticesZ[i];
            this.verticesZ[i] = -n;
        }
        this.invalidate();
    }

    @ObfuscatedName(value="am")
    @Export(value="recolor")
    public void recolor(short s, short s2) {
        int n = 0;
        while (true) {
            if (n < this.faceCount) {
                if (this.faceColors[n] == s) {
                    this.faceColors[n] = s2;
                }
            } else {
                return;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="an")
    @Export(value="retexture")
    public void retexture(short s, short s2) {
        if (this.faceTextures == null) {
            return;
        }
        int n = 0;
        while (true) {
            if (n < this.faceCount) {
                if (this.faceTextures[n] == s) {
                    this.faceTextures[n] = s2;
                }
            } else {
                return;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ao")
    @Export(value="calculateBounds")
    void calculateBounds() {
        if (this.isBoundsCalculated) {
            return;
        }
        int n = 0;
        this.height = 0;
        this.field7348 = 0;
        this.field7346 = 999999;
        this.field7351 = -999999;
        this.field7352 = -99999;
        this.field7349 = 99999;
        while (true) {
            int n2;
            int n3;
            int n4;
            if (n < this.verticesCount) {
                n4 = this.verticesX[n];
                n3 = this.verticesY[n];
                n2 = this.verticesZ[n];
                if (n4 < this.field7346) {
                    this.field7346 = n4;
                }
            } else {
                this.isBoundsCalculated = true;
                return;
            }
            if (n4 > this.field7351) {
                this.field7351 = n4;
            }
            if (n2 < this.field7349) {
                this.field7349 = n2;
            }
            if (n2 > this.field7352) {
                this.field7352 = n2;
            }
            if ((n4 = -n3) > this.height) {
                this.height = n4;
            }
            if (n3 > this.field7348) {
                this.field7348 = n3;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ap")
    @Export(value="invalidate")
    void invalidate() {
        this.vertexNormals = null;
        this.field7350 = null;
        this.faceNormals = null;
        this.isBoundsCalculated = false;
    }

    @ObfuscatedName(value="aq")
    @Export(value="changeOffset")
    public void changeOffset(int n, int n2, int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            int[] arrn = this.verticesX;
            arrn[i] = arrn[i] + n;
            arrn = this.verticesY;
            arrn[i] = n2 + arrn[i];
            arrn = this.verticesZ;
            arrn[i] = n3 + arrn[i];
        }
        this.invalidate();
    }

    @ObfuscatedName(value="ar")
    @Export(value="calculateVertexNormals")
    public void calculateVertexNormals() {
        int n;
        if (this.vertexNormals != null) {
            return;
        }
        this.vertexNormals = new VertexNormal[this.verticesCount];
        for (n = 0; n < this.verticesCount; ++n) {
            this.vertexNormals[n] = new VertexNormal();
        }
        n = 0;
        block1: while (n < this.faceCount) {
            int n2 = this.indices1[n];
            int n3 = this.indices2[n];
            int n4 = this.indices3[n];
            int n5 = this.verticesX[n3] - this.verticesX[n2];
            int n6 = this.verticesY[n3] - this.verticesY[n2];
            int n7 = this.verticesZ[n3] - this.verticesZ[n2];
            int n8 = this.verticesX[n4] - this.verticesX[n2];
            int n9 = this.verticesY[n4] - this.verticesY[n2];
            int n10 = this.verticesZ[n4] - this.verticesZ[n2];
            int n11 = n6 * n10 - n9 * n7;
            n7 = n7 * n8 - n10 * n5;
            n5 = n5 * n9 - n8 * n6;
            while (true) {
                if (n11 <= 8192 && n7 <= 8192 && n5 <= 8192 && n11 >= -8192 && n7 >= -8192 && n5 >= -8192) {
                    Object object;
                    n6 = n8 = (int)Math.sqrt(n11 * n11 + n7 * n7 + n5 * n5);
                    if (n8 <= 0) {
                        n6 = 1;
                    }
                    n8 = n11 * 256 / n6;
                    n7 = n7 * 256 / n6;
                    n11 = n5 * 256 / n6;
                    n5 = this.faceRenderTypes == null ? 0 : this.faceRenderTypes[n];
                    if (n5 == 0) {
                        object = this.vertexNormals[n2];
                        n6 = object.x;
                        n5 = n8 * -1753271175;
                        object.x = n6 + n5;
                        n6 = object.y;
                        object.y = n6 + (n7 *= 1313534945);
                        n6 = object.z;
                        object.z = n6 + (n11 *= 1577887413);
                        object.magnitude -= -1;
                        object = this.vertexNormals[n3];
                        object.x = n5 + object.x;
                        object.y = n7 + object.y;
                        object.z = n11 + object.z;
                        object.magnitude -= -1;
                        object = this.vertexNormals[n4];
                        object.x = n5 + object.x;
                        object.y = n7 + object.y;
                        object.z = n11 + object.z;
                        object.magnitude -= -1;
                    } else if (n5 == 1) {
                        FaceNormal faceNormal;
                        if (this.faceNormals == null) {
                            this.faceNormals = new FaceNormal[this.faceCount];
                        }
                        object = this.faceNormals;
                        object[n] = faceNormal = new FaceNormal();
                        faceNormal.x = n8;
                        faceNormal.y = n7;
                        faceNormal.z = n11;
                    }
                    ++n;
                    continue block1;
                }
                n11 >>= 1;
                n7 >>= 1;
                n5 >>= 1;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="([[IIIIZI)Lbk;")
    public ModelData method13937(int[][] arrn, int n, int n2, int n3, boolean bl, int n4) {
        this.calculateBounds();
        int n5 = n + this.field7346;
        int n6 = n + this.field7351;
        int n7 = n3 + this.field7349;
        int n8 = n3 + this.field7352;
        if (n5 >= 0 && n6 + 128 >> 7 < arrn.length && n7 >= 0) {
            int n9;
            int n10 = 0;
            if (n8 + 128 >> 7 >= arrn[0].length) {
                return this;
            }
            n6 = n6 + 127 >> 7;
            n8 = n8 + 127 >> 7;
            if (n2 == arrn[n5 >>= 7][n7 >>= 7] && n2 == arrn[n6][n7] && n2 == arrn[n5][n8] && n2 == arrn[n6][n8]) {
                return this;
            }
            ModelData modelData = new ModelData();
            modelData.verticesCount = this.verticesCount;
            modelData.faceCount = this.faceCount;
            modelData.textureTriangleCount = this.textureTriangleCount;
            modelData.verticesX = this.verticesX;
            modelData.verticesZ = this.verticesZ;
            modelData.indices1 = this.indices1;
            modelData.indices2 = this.indices2;
            modelData.indices3 = this.indices3;
            modelData.faceRenderTypes = this.faceRenderTypes;
            modelData.faceRenderPriorities = this.faceRenderPriorities;
            modelData.faceAlphas = this.faceAlphas;
            modelData.textureCoords = this.textureCoords;
            modelData.faceColors = this.faceColors;
            modelData.faceTextures = this.faceTextures;
            modelData.priority = this.priority;
            modelData.textureRenderTypes = this.textureRenderTypes;
            modelData.texTriangleX = this.texTriangleX;
            modelData.texTriangleY = this.texTriangleY;
            modelData.texTriangleZ = this.texTriangleZ;
            modelData.vertexSkins = this.vertexSkins;
            modelData.faceSkins = this.faceSkins;
            modelData.vertexLabels = this.vertexLabels;
            modelData.faceLabelsAlpha = this.faceLabelsAlpha;
            modelData.ambient = this.ambient;
            modelData.contrast = this.contrast;
            modelData.verticesY = new int[modelData.verticesCount];
            if (n4 != 0) {
                for (n9 = 0; n9 < modelData.verticesCount; ++n9) {
                    n10 = (-this.verticesY[n9] << 16) / this.height;
                    if (n10 >= n4) continue;
                    n6 = n + this.verticesX[n9];
                    n7 = n3 + this.verticesZ[n9];
                    n8 = n6 & 0x7F;
                    n5 = n7 & 0x7F;
                    int n11 = n6 >> 7;
                    int n12 = n7 >> 7;
                    n7 = arrn[n11][n12];
                    n6 = 128 - n8;
                    int n13 = n11 + 1;
                    int n14 = arrn[n13][n12];
                    int[] arrn2 = arrn[n11];
                    n11 = arrn2[++n12];
                    n13 = arrn[n13][n12];
                    modelData.verticesY[n9] = (n4 - n10) * ((n5 * (n11 * n6 + n13 * n8 >> 7) + (n7 * n6 + n14 * n8 >> 7) * (128 - n5) >> 7) - n2) / n4 + this.verticesY[n9];
                }
            } else {
                for (n4 = n10; n4 < modelData.verticesCount; ++n4) {
                    n5 = this.verticesX[n4] + n;
                    n8 = this.verticesZ[n4] + n3;
                    n9 = n5 & 0x7F;
                    n10 = n8 & 0x7F;
                    int n15 = n5 >> 7;
                    int n16 = n8 >> 7;
                    n8 = arrn[n15][n16];
                    n5 = 128 - n9;
                    n6 = n15 + 1;
                    n7 = arrn[n6][n16];
                    int[] arrn3 = arrn[n15];
                    n15 = arrn3[++n16];
                    n6 = arrn[n6][n16];
                    modelData.verticesY[n4] = (n10 * (n15 * n5 + n6 * n9 >> 7) + (n8 * n5 + n7 * n9 >> 7) * (128 - n10) >> 7) + this.verticesY[n4] - n2;
                }
            }
            modelData.invalidate();
            return modelData;
        }
        return this;
    }

    @ObfuscatedName(value="aw")
    @Export(value="resize")
    public void resize(int n, int n2, int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = this.verticesX[i] * n / 128;
            this.verticesY[i] = n2 * this.verticesY[i] / 128;
            this.verticesZ[i] = n3 * this.verticesZ[i] / 128;
        }
        this.invalidate();
    }

    @ObfuscatedName(value="ay")
    public void method13941() {
        int n = 0;
        int n2 = 0;
        while (true) {
            if (n2 >= this.verticesCount) break;
            this.verticesZ[n2] = -this.verticesZ[n2];
            ++n2;
        }
        for (int i = n; i < this.faceCount; ++i) {
            n2 = this.indices1[i];
            this.indices1[i] = this.indices3[i];
            this.indices3[i] = n2;
        }
        this.invalidate();
    }

    @ObfuscatedName(value="ai")
    void method13928(byte[] arrby) {
        Buffer buffer = new Buffer(arrby);
        Buffer buffer2 = new Buffer(arrby);
        Buffer buffer3 = new Buffer(arrby);
        Buffer buffer4 = new Buffer(arrby);
        Buffer buffer5 = new Buffer(arrby);
        buffer.offset = arrby.length - 18;
        int n = buffer.method11637(1081917907);
        int n2 = buffer.method11637(-338830474);
        int n3 = buffer.method11650(1781640612);
        int n4 = buffer.method11650(1825605653);
        int n5 = buffer.method11650(1937209488);
        int n6 = buffer.method11650(1268754452);
        int n7 = buffer.method11650(-2011912515);
        int n8 = buffer.method11650(-1814340257);
        int n9 = buffer.method11637(67418780);
        int n10 = buffer.method11637(2068457189);
        buffer.method11637(-945523784);
        int n11 = buffer.method11637(860412194);
        int n12 = n + 0;
        int n13 = n12 + n2;
        int n14 = n5 == 255 ? n13 + n2 : n13;
        int n15 = n7 == 1 ? n14 + n2 : n14;
        int n16 = n4 == 1 ? n15 + n2 : n15;
        int n17 = n8 == 1 ? n16 + n : n16;
        int n18 = n6 == 1 ? n17 + n2 : n17;
        int n19 = n18 + n11;
        int n20 = n2 * 2 + n19;
        n11 = n3 * 6 + n20;
        n9 = n11 + n9;
        this.verticesCount = n;
        this.faceCount = n2;
        this.textureTriangleCount = n3;
        this.verticesX = new int[n];
        this.verticesY = new int[n];
        this.verticesZ = new int[n];
        this.indices1 = new int[n2];
        this.indices2 = new int[n2];
        this.indices3 = new int[n2];
        if (n3 > 0) {
            this.textureRenderTypes = new byte[n3];
            this.texTriangleX = new short[n3];
            this.texTriangleY = new short[n3];
            this.texTriangleZ = new short[n3];
        }
        if (n8 == 1) {
            this.vertexSkins = new int[n];
        }
        if (n4 == 1) {
            this.faceRenderTypes = new byte[n2];
            this.textureCoords = new byte[n2];
            this.faceTextures = new short[n2];
        }
        if (n5 == 255) {
            this.faceRenderPriorities = new byte[n2];
        } else {
            this.priority = (byte)n5;
        }
        if (n6 == 1) {
            this.faceAlphas = new byte[n2];
        }
        if (n7 == 1) {
            this.faceSkins = new int[n2];
        }
        this.faceColors = new short[n2];
        buffer.offset = 0;
        buffer2.offset = n11;
        buffer3.offset = n9;
        buffer4.offset = n10 + n9;
        buffer5.offset = n16;
        n9 = 0;
        n11 = 0;
        int n21 = 0;
        n16 = n;
        for (n10 = 0; n10 < n16; ++n10) {
            int n22 = buffer.method11650(-2050271095);
            n = (n22 & 1) != 0 ? buffer2.method11672(1290114973) : 0;
            int n23 = (n22 & 2) != 0 ? buffer3.method11672(1290114973) : 0;
            n22 = (n22 & 4) != 0 ? buffer4.method11672(1290114973) : 0;
            this.verticesX[n10] = n9 + n;
            this.verticesY[n10] = n11 + n23;
            this.verticesZ[n10] = n21 + n22;
            n9 = this.verticesX[n10];
            n11 = this.verticesY[n10];
            n21 = this.verticesZ[n10];
            if (n8 != 1) continue;
            this.vertexSkins[n10] = buffer5.method11650(-900946544);
        }
        buffer.offset = n19;
        buffer2.offset = n15;
        buffer3.offset = n13;
        buffer4.offset = n17;
        buffer5.offset = n14;
        n10 = 0;
        n17 = 0;
        n14 = n4;
        for (n15 = 0; n15 < n2; ++n15) {
            this.faceColors[n15] = (short)buffer.method11637(1085724547);
            if (n14 == 1) {
                n16 = buffer2.method11650(-1589003468);
                if ((n16 & 1) == 1) {
                    this.faceRenderTypes[n15] = 1;
                    n17 = 1;
                } else {
                    this.faceRenderTypes[n15] = 0;
                }
                if ((n16 & 2) == 2) {
                    this.textureCoords[n15] = (byte)(n16 >> 2);
                    this.faceTextures[n15] = this.faceColors[n15];
                    this.faceColors[n15] = 127;
                    n16 = n17;
                    if (this.faceTextures[n15] != -1) {
                        n10 = 1;
                        n16 = n17;
                    }
                } else {
                    this.textureCoords[n15] = -1;
                    this.faceTextures[n15] = -1;
                    n16 = n17;
                }
            } else {
                n16 = n17;
            }
            if (n5 == 255) {
                this.faceRenderPriorities[n15] = buffer3.method11636(1950545006);
            }
            if (n6 == 1) {
                this.faceAlphas[n15] = buffer4.method11636(1315593716);
            }
            if (n7 == 1) {
                this.faceSkins[n15] = buffer5.method11650(1533972625);
            }
            n17 = n16;
        }
        buffer.offset = n18;
        buffer2.offset = n12;
        n15 = 0;
        n18 = 0;
        n16 = 0;
        n14 = 0;
        for (n9 = 0; n9 < n2; ++n9) {
            n = buffer2.method11650(996038126);
            if (n == 1) {
                n16 = n15 + buffer.method11672(1290114973);
                n18 = buffer.method11672(1290114973) + n16;
                n14 = buffer.method11672(1290114973) + n18;
                this.indices1[n9] = n16;
                this.indices2[n9] = n18;
                this.indices3[n9] = n14;
                n15 = n14;
            } else {
                n11 = n18;
                n21 = n16;
                n18 = n14;
                n16 = n11;
                n14 = n21;
            }
            if (n == 2) {
                this.indices1[n9] = n16;
                this.indices2[n9] = n14;
                this.indices3[n9] = n15 += buffer.method11672(1290114973);
                n18 = n15;
            } else {
                n11 = n14;
                n14 = n18;
                n18 = n15;
                n15 = n11;
            }
            if (n == 3) {
                this.indices1[n9] = n15;
                this.indices2[n9] = n14;
                this.indices3[n9] = n18 += buffer.method11672(1290114973);
                n16 = n18;
            } else {
                n11 = n15;
                n15 = n16;
                n16 = n11;
            }
            if (n == 4) {
                n16 = buffer.method11672(1290114973) + n18;
                this.indices1[n9] = n14;
                this.indices2[n9] = n15;
                this.indices3[n9] = n16;
                n18 = n14;
                n14 = n15;
                n15 = n16;
                continue;
            }
            n11 = n18;
            n18 = n15;
            n15 = n11;
        }
        buffer.offset = n20;
        for (n14 = 0; n14 < n3; ++n14) {
            this.textureRenderTypes[n14] = 0;
            this.texTriangleX[n14] = (short)buffer.method11637(424617797);
            this.texTriangleY[n14] = (short)buffer.method11637(354247154);
            this.texTriangleZ[n14] = (short)buffer.method11637(-992923782);
        }
        if (this.textureCoords != null) {
            n15 = 0;
            for (n14 = 0; n14 < n2; ++n14) {
                n16 = this.textureCoords[n14] & 0xFF;
                if (n16 == 255) continue;
                if (this.indices1[n14] == (this.texTriangleX[n16] & 0xFFFF) && this.indices2[n14] == (this.texTriangleY[n16] & 0xFFFF) && this.indices3[n14] == (this.texTriangleZ[n16] & 0xFFFF)) {
                    this.textureCoords[n14] = -1;
                    continue;
                }
                n15 = 1;
            }
            if (n15 == 0) {
                this.textureCoords = null;
            }
        }
        if (n10 == 0) {
            this.faceTextures = null;
        }
        if (n17 == 0) {
            this.faceRenderTypes = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IIIII)Lcp;")
    @Export(value="toModel")
    public final Model toModel(int n, int n2, int n3, int n4, int n5) {
        int n6;
        Object object;
        this.calculateVertexNormals();
        int n7 = (int)Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5) * n2 >> 8;
        Model model = new Model();
        model.faceColors1 = new int[this.faceCount];
        model.faceColors2 = new int[this.faceCount];
        model.faceColors3 = new int[this.faceCount];
        if (this.textureTriangleCount > 0 && this.textureCoords != null) {
            object = new int[this.textureTriangleCount];
            n2 = 0;
            while (true) {
                if (n2 >= this.faceCount) break;
                if (this.textureCoords[n2] != -1) {
                    n6 = this.textureCoords[n2] & 0xFF;
                    object[n6] = object[n6] + 1;
                }
                ++n2;
            }
            model.field7478 = 0;
            n2 = 0;
            while (true) {
                if (n2 < this.textureTriangleCount) {
                    if (object[n2] > 0 && this.textureRenderTypes[n2] == 0) {
                        ++model.field7478;
                    }
                } else {
                    model.field7480 = new int[model.field7478];
                    model.field7465 = new int[model.field7478];
                    model.field7467 = new int[model.field7478];
                    n6 = 0;
                    break;
                }
                ++n2;
            }
            for (n2 = 0; n2 < this.textureTriangleCount; ++n2) {
                if (object[n2] > 0 && this.textureRenderTypes[n2] == 0) {
                    model.field7480[n6] = this.texTriangleX[n2] & 0xFFFF;
                    model.field7465[n6] = this.texTriangleY[n2] & 0xFFFF;
                    model.field7467[n6] = this.texTriangleZ[n2] & 0xFFFF;
                    object[n2] = n6++;
                    continue;
                }
                object[n2] = -1;
            }
            model.field7474 = new byte[this.faceCount];
            for (n2 = 0; n2 < this.faceCount; ++n2) {
                model.field7474[n2] = this.textureCoords[n2] != -1 ? (int)object[this.textureCoords[n2] & 0xFF] : -1;
            }
        }
        n6 = 0;
        while (true) {
            if (n6 >= this.faceCount) {
                this.method13929();
                model.verticesCount = this.verticesCount;
                model.verticesX = this.verticesX;
                model.verticesY = this.verticesY;
                model.verticesZ = this.verticesZ;
                model.indicesCount = this.faceCount;
                model.indices1 = this.indices1;
                model.indices2 = this.indices2;
                model.indices3 = this.indices3;
                model.faceRenderPriorities = this.faceRenderPriorities;
                model.faceAlphas = this.faceAlphas;
                model.field7483 = this.priority;
                model.vertexLabels = this.vertexLabels;
                model.faceLabelsAlpha = this.faceLabelsAlpha;
                model.field7494 = this.vertexSkins;
                model.field7491 = this.faceSkins;
                model.faceTextures = this.faceTextures;
                return model;
            }
            n2 = this.faceRenderTypes == null ? 0 : this.faceRenderTypes[n6];
            int n8 = this.faceAlphas == null ? 0 : this.faceAlphas[n6];
            int n9 = this.faceTextures == null ? -1 : this.faceTextures[n6];
            if (n8 == -2) {
                n2 = 3;
            }
            if (n8 == -1) {
                n2 = 2;
            }
            if (n9 == -1) {
                if (n2 == 0) {
                    n2 = this.faceColors[n6] & 0xFFFF;
                    object = this.field7350 != null && this.field7350[this.indices1[n6]] != null ? (Object)this.field7350[this.indices1[n6]] : (Object)this.vertexNormals[this.indices1[n6]];
                    n8 = (n3 * ((VertexNormal)object).x * -987171383 + n5 * ((VertexNormal)object).z * 1290114973 + n4 * ((VertexNormal)object).y * 606638113) / (n7 * ((VertexNormal)object).magnitude);
                    model.faceColors1[n6] = ModelData.method13915(n2, n8 + n);
                    object = this.field7350 != null && this.field7350[this.indices2[n6]] != null ? (Object)this.field7350[this.indices2[n6]] : (Object)this.vertexNormals[this.indices2[n6]];
                    n8 = (n3 * ((VertexNormal)object).x * -987171383 + n5 * ((VertexNormal)object).z * 1290114973 + n4 * ((VertexNormal)object).y * 606638113) / (n7 * ((VertexNormal)object).magnitude);
                    model.faceColors2[n6] = ModelData.method13915(n2, n8 + n);
                    object = this.field7350 != null && this.field7350[this.indices3[n6]] != null ? (Object)this.field7350[this.indices3[n6]] : (Object)this.vertexNormals[this.indices3[n6]];
                    n8 = (n3 * ((VertexNormal)object).x * -987171383 + n5 * ((VertexNormal)object).z * 1290114973 + n4 * ((VertexNormal)object).y * 606638113) / (n7 * ((VertexNormal)object).magnitude);
                    model.faceColors3[n6] = ModelData.method13915(n2, n8 + n);
                } else if (n2 == 1) {
                    object = this.faceNormals[n6];
                    n2 = (n3 * ((FaceNormal)object).x + n5 * ((FaceNormal)object).z + n4 * ((FaceNormal)object).y) / (n7 / 2 + n7);
                    model.faceColors1[n6] = ModelData.method13915(this.faceColors[n6] & 0xFFFF, n2 + n);
                    model.faceColors3[n6] = -1;
                } else if (n2 == 3) {
                    model.faceColors1[n6] = 128;
                    model.faceColors3[n6] = -1;
                } else {
                    model.faceColors3[n6] = -2;
                }
            } else if (n2 == 0) {
                object = this.field7350 != null && this.field7350[this.indices1[n6]] != null ? (Object)this.field7350[this.indices1[n6]] : (Object)this.vertexNormals[this.indices1[n6]];
                n2 = (n3 * ((VertexNormal)object).x * -987171383 + n5 * ((VertexNormal)object).z * 1290114973 + n4 * ((VertexNormal)object).y * 606638113) / (n7 * ((VertexNormal)object).magnitude);
                model.faceColors1[n6] = ModelData.method13912(n2 + n);
                object = this.field7350 != null && this.field7350[this.indices2[n6]] != null ? (Object)this.field7350[this.indices2[n6]] : (Object)this.vertexNormals[this.indices2[n6]];
                n2 = (n3 * ((VertexNormal)object).x * -987171383 + n5 * ((VertexNormal)object).z * 1290114973 + n4 * ((VertexNormal)object).y * 606638113) / (n7 * ((VertexNormal)object).magnitude);
                model.faceColors2[n6] = ModelData.method13912(n2 + n);
                object = this.field7350 != null && this.field7350[this.indices3[n6]] != null ? (Object)this.field7350[this.indices3[n6]] : (Object)this.vertexNormals[this.indices3[n6]];
                n2 = (n3 * ((VertexNormal)object).x * -987171383 + n5 * ((VertexNormal)object).z * 1290114973 + n4 * ((VertexNormal)object).y * 606638113) / (n7 * ((VertexNormal)object).magnitude);
                model.faceColors3[n6] = ModelData.method13912(n2 + n);
            } else if (n2 == 1) {
                object = this.faceNormals[n6];
                n2 = (n3 * ((FaceNormal)object).x + n5 * ((FaceNormal)object).z + n4 * ((FaceNormal)object).y) / (n7 / 2 + n7);
                model.faceColors1[n6] = ModelData.method13912(n2 + n);
                model.faceColors3[n6] = -1;
            } else {
                model.faceColors3[n6] = -2;
            }
            ++n6;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lbk;I)I")
    final int method13940(ModelData modelData, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        block4: {
            n5 = modelData.verticesX[n];
            n4 = modelData.verticesY[n];
            n3 = modelData.verticesZ[n];
            for (n2 = 0; n2 < this.verticesCount; ++n2) {
                if (n5 != this.verticesX[n2] || n4 != this.verticesY[n2] || n3 != this.verticesZ[n2]) {
                    continue;
                }
                break block4;
            }
            n2 = -1;
        }
        int n6 = n2;
        if (n2 == -1) {
            this.verticesX[this.verticesCount] = n5;
            this.verticesY[this.verticesCount] = n4;
            this.verticesZ[this.verticesCount] = n3;
            if (modelData.vertexSkins != null) {
                this.vertexSkins[this.verticesCount] = modelData.vertexSkins[n];
            }
            n6 = this.verticesCount;
            this.verticesCount = n6 + 1;
        }
        return n6;
    }

    @ObfuscatedName(value="ab")
    public void method13923() {
        for (int i = 0; i < this.verticesCount; ++i) {
            int n = this.verticesZ[i];
            this.verticesZ[i] = this.verticesX[i];
            this.verticesX[i] = -n;
        }
        this.invalidate();
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lbk;Lbk;IIIZ)V")
    static void method13916(ModelData modelData, ModelData modelData2, int n, int n2, int n3, boolean bl) {
        modelData.calculateBounds();
        modelData.calculateVertexNormals();
        modelData2.calculateBounds();
        modelData2.calculateVertexNormals();
        ++field7317;
        int[] arrn = modelData2.verticesX;
        int n4 = modelData2.verticesCount;
        int n5 = 0;
        int n6 = 0;
        while (true) {
            block13: {
                block14: {
                    block12: {
                        int n7;
                        int n8;
                        int n9;
                        if (n5 >= modelData.verticesCount) break block12;
                        VertexNormal vertexNormal = modelData.vertexNormals[n5];
                        if (vertexNormal.magnitude != 0 && (n9 = modelData.verticesY[n5] - n2) <= modelData2.field7348 && (n8 = modelData.verticesX[n5] - n) >= modelData2.field7346 && n8 <= modelData2.field7351 && (n7 = modelData.verticesZ[n5] - n3) >= modelData2.field7349 && n7 <= modelData2.field7352) {
                            for (int i = 0; i < n4; ++i) {
                                Object object;
                                VertexNormal vertexNormal2;
                                VertexNormal vertexNormal3 = modelData2.vertexNormals[i];
                                if (n8 != arrn[i] || n7 != modelData2.verticesZ[i] || n9 != modelData2.verticesY[i] || vertexNormal3.magnitude == 0) continue;
                                if (modelData.field7350 == null) {
                                    modelData.field7350 = new VertexNormal[modelData.verticesCount];
                                }
                                if (modelData2.field7350 == null) {
                                    modelData2.field7350 = new VertexNormal[n4];
                                }
                                if ((vertexNormal2 = modelData.field7350[n5]) == null) {
                                    object = modelData.field7350;
                                    object[n5] = vertexNormal2 = new VertexNormal(vertexNormal);
                                }
                                if ((object = modelData2.field7350[i]) == null) {
                                    VertexNormal[] arrvertexNormal = modelData2.field7350;
                                    arrvertexNormal[i] = object = new VertexNormal(vertexNormal3);
                                }
                                vertexNormal2.x += vertexNormal3.x;
                                vertexNormal2.y += vertexNormal3.y;
                                vertexNormal2.z += vertexNormal3.z;
                                vertexNormal2.magnitude += vertexNormal3.magnitude;
                                object.x += vertexNormal.x;
                                object.y += vertexNormal.y;
                                object.z += vertexNormal.z;
                                object.magnitude += vertexNormal.magnitude;
                                ++n6;
                                ModelData.field7314[n5] = field7317;
                                ModelData.field7313[i] = field7317;
                            }
                        }
                        break block13;
                    }
                    if (n6 < 3) break block14;
                    if (!bl) {
                        return;
                    }
                    n = 0;
                    while (true) {
                        block16: {
                            block17: {
                                block15: {
                                    if (n >= modelData.faceCount) break block15;
                                    if (field7314[modelData.indices1[n]] != field7317 || field7314[modelData.indices2[n]] != field7317 || field7314[modelData.indices3[n]] != field7317) break block16;
                                    if (modelData.faceRenderTypes == null) {
                                        modelData.faceRenderTypes = new byte[modelData.faceCount];
                                    }
                                    break block17;
                                }
                                n = 0;
                                while (true) {
                                    block19: {
                                        block20: {
                                            block18: {
                                                if (n >= modelData2.faceCount) break block18;
                                                if (field7313[modelData2.indices1[n]] != field7317 || field7313[modelData2.indices2[n]] != field7317 || field7313[modelData2.indices3[n]] != field7317) break block19;
                                                if (modelData2.faceRenderTypes == null) {
                                                    modelData2.faceRenderTypes = new byte[modelData2.faceCount];
                                                }
                                                break block20;
                                            }
                                            return;
                                        }
                                        modelData2.faceRenderTypes[n] = 2;
                                    }
                                    ++n;
                                }
                            }
                            modelData.faceRenderTypes[n] = 2;
                        }
                        ++n;
                    }
                }
                return;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="ad")
    static final int method13912(int n) {
        if (n < 2) {
            return 2;
        }
        int n2 = n;
        if (n > 126) {
            n2 = 126;
        }
        return n2;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;II)Lbk;")
    @Export(value="ModelData_get")
    public static ModelData ModelData_get(AbstractArchive object, int n, int n2) {
        if ((object = (Object)((AbstractArchive)object).takeFile(n, n2)) == null) {
            return null;
        }
        return new ModelData((byte[])object);
    }

    @ObfuscatedName(value="av")
    static final int method13915(int n, int n2) {
        int n3 = (n & 0x7F) * n2 >> 7;
        if (n3 < 2) {
            n2 = 2;
        } else {
            n2 = n3;
            if (n3 > 126) {
                n2 = 126;
            }
        }
        return (n & 0xFF80) + n2;
    }
}

