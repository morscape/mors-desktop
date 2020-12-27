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

@ObfuscatedName(value="cp")
@Implements(value="Model")
public class Model
extends Entity {
    @ObfuscatedName(value="ae")
    @Export(value="Model_sharedSequenceModelFaceAlphas")
    static byte[] Model_sharedSequenceModelFaceAlphas;
    @ObfuscatedName(value="bn")
    @Export(value="Model_transformTempX")
    static int Model_transformTempX;
    @ObfuscatedName(value="by")
    @Export(value="Model_transformTempZ")
    static int Model_transformTempZ;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lcp;")
    @Export(value="Model_sharedSpotAnimationModel")
    static Model Model_sharedSpotAnimationModel;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lcp;")
    @Export(value="Model_sharedSequenceModel")
    static Model Model_sharedSequenceModel;
    @ObfuscatedName(value="ax")
    @Export(value="Model_sharedSpotAnimationModelFaceAlphas")
    static byte[] Model_sharedSpotAnimationModelFaceAlphas;
    @ObfuscatedName(value="bl")
    static final int[] field7457;
    @ObfuscatedName(value="bs")
    @Export(value="Model_transformTempY")
    static int Model_transformTempY;
    @ObfuscatedName(value="bu")
    static final int[] field7460;
    @ObfuscatedName(value="bf")
    static int field7456;
    @ObfuscatedName(value="aa")
    @Export(value="indicesCount")
    int indicesCount = 0;
    @ObfuscatedName(value="ac")
    @Export(value="vertexLabels")
    int[][] vertexLabels;
    @ObfuscatedName(value="af")
    @Export(value="indices2")
    int[] indices2;
    @ObfuscatedName(value="ag")
    int[] field7467;
    @ObfuscatedName(value="ah")
    @Export(value="verticesCount")
    int verticesCount = 0;
    @ObfuscatedName(value="aj")
    @Export(value="verticesY")
    int[] verticesY;
    @ObfuscatedName(value="al")
    @Export(value="verticesZ")
    int[] verticesZ;
    @ObfuscatedName(value="am")
    @Export(value="faceColors1")
    int[] faceColors1;
    @ObfuscatedName(value="an")
    @Export(value="faceColors2")
    int[] faceColors2;
    @ObfuscatedName(value="ao")
    @Export(value="faceTextures")
    short[] faceTextures;
    @ObfuscatedName(value="ap")
    byte[] field7474;
    @ObfuscatedName(value="aq")
    @Export(value="indices3")
    int[] indices3;
    @ObfuscatedName(value="ar")
    @Export(value="faceAlphas")
    byte[] faceAlphas;
    @ObfuscatedName(value="as")
    @Export(value="verticesX")
    int[] verticesX;
    @ObfuscatedName(value="au")
    @Export(value="faceLabelsAlpha")
    int[][] faceLabelsAlpha;
    @ObfuscatedName(value="aw")
    @Export(value="faceRenderPriorities")
    byte[] faceRenderPriorities;
    @ObfuscatedName(value="ay")
    @Export(value="faceColors3")
    int[] faceColors3;
    @ObfuscatedName(value="az")
    byte field7483 = 0;
    @ObfuscatedName(value="ba")
    @Export(value="yMidOffset")
    int yMidOffset;
    @ObfuscatedName(value="bb")
    @Export(value="yMid")
    int yMid;
    @ObfuscatedName(value="bd")
    @Export(value="bottomY")
    int bottomY;
    @ObfuscatedName(value="be")
    @Export(value="xMid")
    int xMid;
    @ObfuscatedName(value="bg")
    @Export(value="isSingleTile")
    public boolean isSingleTile = false;
    @ObfuscatedName(value="bh")
    boolean field7490;
    @ObfuscatedName(value="bj")
    int field7492;
    @ObfuscatedName(value="bp")
    int[] field7494;
    @ObfuscatedName(value="bq")
    int field7495;
    @ObfuscatedName(value="br")
    boolean field7496;
    @ObfuscatedName(value="bt")
    @Export(value="radius")
    int radius;
    @ObfuscatedName(value="bx")
    @Export(value="xMidOffset")
    int xMidOffset;
    @ObfuscatedName(value="ad")
    int[] field7465;
    @ObfuscatedName(value="at")
    int field7478 = 0;
    @ObfuscatedName(value="av")
    int[] field7480;
    @ObfuscatedName(value="bc")
    @Export(value="xzRadius")
    int xzRadius;
    @ObfuscatedName(value="bi")
    int[] field7491;
    @ObfuscatedName(value="bv")
    @Export(value="zMid")
    int zMid;
    @ObfuscatedName(value="bz")
    @Export(value="diameter")
    int diameter;
    @ObfuscatedName(value="ab")
    @Export(value="indices1")
    int[] indices1;
    @ObfuscatedName(value="bw")
    @Export(value="zMidOffset")
    int zMidOffset;
    @ObfuscatedName(value="bk")
    @Export(value="boundsType")
    int boundsType;

    static {
        Model_sharedSequenceModel = new Model();
        Model_sharedSequenceModelFaceAlphas = new byte[1];
        Model_sharedSpotAnimationModel = new Model();
        Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
        field7456 = 0;
        field7457 = Rasterizer3D.Rasterizer3D_sine;
        field7460 = Rasterizer3D.Rasterizer3D_cosine;
    }

    Model() {
        int n = field7456;
        field7456 = n + 1;
        this.field7492 = n;
        this.field7490 = true;
        this.field7495 = -1;
        this.field7496 = false;
        this.xMidOffset = -1;
        this.yMidOffset = -1;
        this.zMidOffset = -1;
    }

    @ObfuscatedSignature(descriptor="([Lcp;I)V")
    public Model(Model[] arrmodel, int n) {
        int n2 = field7456;
        field7456 = n2 + 1;
        this.field7492 = n2;
        this.field7490 = true;
        this.field7495 = -1;
        this.field7496 = false;
        this.xMidOffset = -1;
        this.yMidOffset = -1;
        this.zMidOffset = -1;
        this.verticesCount = 0;
        this.indicesCount = 0;
        this.field7478 = 0;
        this.field7483 = (byte)-1;
        int n3 = 0;
        n2 = 0;
        boolean bl = false;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            boolean bl2;
            int n8;
            block16: {
                Model model;
                block18: {
                    block17: {
                        block15: {
                            if (n3 >= n) break block15;
                            model = arrmodel[n3];
                            n8 = n2;
                            bl2 = bl;
                            n7 = n4;
                            n6 = n5;
                            if (model == null) break block16;
                            this.verticesCount += model.verticesCount;
                            this.indicesCount += model.indicesCount;
                            this.field7478 += model.field7478;
                            if (model.faceRenderPriorities != null) break block17;
                            if (this.field7483 == -1) {
                                this.field7483 = model.field7483;
                            }
                            if (this.field7483 == model.field7483) break block18;
                            break block17;
                        }
                        this.verticesX = new int[this.verticesCount];
                        this.verticesY = new int[this.verticesCount];
                        this.verticesZ = new int[this.verticesCount];
                        this.indices1 = new int[this.indicesCount];
                        this.indices2 = new int[this.indicesCount];
                        this.indices3 = new int[this.indicesCount];
                        this.faceColors1 = new int[this.indicesCount];
                        this.faceColors2 = new int[this.indicesCount];
                        this.faceColors3 = new int[this.indicesCount];
                        if (n2 != 0) {
                            this.faceRenderPriorities = new byte[this.indicesCount];
                        }
                        if (bl) {
                            this.faceAlphas = new byte[this.indicesCount];
                        }
                        if (n4 != 0) {
                            this.faceTextures = new short[this.indicesCount];
                        }
                        if (n5 != 0) {
                            this.field7474 = new byte[this.indicesCount];
                        }
                        if (this.field7478 > 0) {
                            this.field7480 = new int[this.field7478];
                            this.field7465 = new int[this.field7478];
                            this.field7467 = new int[this.field7478];
                        }
                        this.verticesCount = 0;
                        this.indicesCount = 0;
                        this.field7478 = 0;
                        n3 = 0;
                        while (true) {
                            block20: {
                                block21: {
                                    block19: {
                                        if (n3 >= n) break block19;
                                        model = arrmodel[n3];
                                        if (model == null) break block20;
                                        break block21;
                                    }
                                    return;
                                }
                                for (n6 = 0; n6 < model.indicesCount; ++n6) {
                                    this.indices1[this.indicesCount] = this.verticesCount + model.indices1[n6];
                                    this.indices2[this.indicesCount] = this.verticesCount + model.indices2[n6];
                                    this.indices3[this.indicesCount] = this.verticesCount + model.indices3[n6];
                                    this.faceColors1[this.indicesCount] = model.faceColors1[n6];
                                    this.faceColors2[this.indicesCount] = model.faceColors2[n6];
                                    this.faceColors3[this.indicesCount] = model.faceColors3[n6];
                                    if (n2 != 0) {
                                        this.faceRenderPriorities[this.indicesCount] = model.faceRenderPriorities != null ? model.faceRenderPriorities[n6] : model.field7483;
                                    }
                                    if (bl && model.faceAlphas != null) {
                                        this.faceAlphas[this.indicesCount] = model.faceAlphas[n6];
                                    }
                                    if (n4 != 0) {
                                        this.faceTextures[this.indicesCount] = model.faceTextures != null ? model.faceTextures[n6] : -1;
                                    }
                                    if (n5 != 0) {
                                        this.field7474[this.indicesCount] = model.field7474 != null && model.field7474[n6] != -1 ? (int)(this.field7478 + model.field7474[n6]) : -1;
                                    }
                                    ++this.indicesCount;
                                }
                                for (n6 = 0; n6 < model.field7478; ++n6) {
                                    this.field7480[this.field7478] = this.verticesCount + model.field7480[n6];
                                    this.field7465[this.field7478] = this.verticesCount + model.field7465[n6];
                                    this.field7467[this.field7478] = this.verticesCount + model.field7467[n6];
                                    ++this.field7478;
                                }
                                for (n6 = 0; n6 < model.verticesCount; ++n6) {
                                    this.verticesX[this.verticesCount] = model.verticesX[n6];
                                    this.verticesY[this.verticesCount] = model.verticesY[n6];
                                    this.verticesZ[this.verticesCount] = model.verticesZ[n6];
                                    ++this.verticesCount;
                                }
                            }
                            ++n3;
                        }
                    }
                    n2 = 1;
                }
                n6 = model.faceAlphas != null ? 1 : 0;
                bl2 = bl | n6;
                bl = model.faceTextures != null;
                n7 = n4 | bl;
                n4 = model.field7474 != null ? 1 : 0;
                n6 = n5 | n4;
                n8 = n2;
            }
            ++n3;
            n2 = n8;
            bl = bl2;
            n4 = n7;
            n5 = n6;
        }
    }

    @ObfuscatedName(value="aa")
    @Export(value="resetBounds")
    void resetBounds() {
        this.boundsType = 0;
        this.xMidOffset = -1;
        this.field7490 = true;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Z)Lcp;")
    @Export(value="toSharedSequenceModel")
    public Model toSharedSequenceModel(boolean bl) {
        if (!bl && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
            Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(bl, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lbf;ILbf;I[I)V")
    @Export(value="animate2")
    public void animate2(Frames object, int n, Frames object2, int n2, int[] arrn) {
        if (n == -1) {
            return;
        }
        if (arrn != null && n2 != -1) {
            object = ((Frames)object).frames[n];
            object2 = ((Frames)object2).frames[n2];
            Skeleton skeleton = ((Animation)object).skeleton;
            int n3 = 0;
            Model_transformTempX = 0;
            Model_transformTempY = 0;
            Model_transformTempZ = 0;
            int n4 = arrn[0];
            int n5 = 1;
            n = 0;
            n2 = 1;
            while (true) {
                int n6;
                if (n < ((Animation)object).transformCount) {
                    n6 = ((Animation)object).transformSkeletonLabels[n];
                } else {
                    Model_transformTempX = 0;
                    Model_transformTempY = 0;
                    Model_transformTempZ = 0;
                    n4 = arrn[0];
                    n2 = n5;
                    n = n3;
                    while (true) {
                        if (n < ((Animation)object2).transformCount) {
                            n3 = ((Animation)object2).transformSkeletonLabels[n];
                        } else {
                            this.resetBounds();
                            return;
                        }
                        while (n3 > n4) {
                            n4 = arrn[n2];
                            ++n2;
                        }
                        if (n3 == n4 || skeleton.field4653[n3] == 0) {
                            this.transform(skeleton.field4653[n3], skeleton.field4656[n3], ((Animation)object2).field439[n], ((Animation)object2).field434[n], ((Animation)object2).field435[n]);
                        }
                        ++n;
                    }
                }
                while (n6 > n4) {
                    n4 = arrn[n2];
                    ++n2;
                }
                if (n6 != n4 || skeleton.field4653[n6] == 0) {
                    this.transform(skeleton.field4653[n6], skeleton.field4656[n6], ((Animation)object).field439[n], ((Animation)object).field434[n], ((Animation)object).field435[n]);
                }
                ++n;
            }
        }
        this.animate((Frames)object, n);
    }

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        return this;
    }

    @ObfuscatedName(value="ah")
    @Export(value="calculateBoundingBox")
    void calculateBoundingBox(int n) {
        if (this.xMidOffset != -1) {
            return;
        }
        int n2 = field7460[n];
        int n3 = field7457[n];
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        n = 0;
        int n9 = 0;
        while (true) {
            int n10;
            int n11;
            int n12;
            int n13;
            if (n4 < this.verticesCount) {
                n13 = class321.method11398(this.verticesX[n4], this.verticesZ[n4], n2, n3);
                n12 = this.verticesY[n4];
                n11 = class373.method13012(this.verticesX[n4], this.verticesZ[n4], n2, n3);
                n10 = n6;
                if (n13 < n6) {
                    n10 = n13;
                }
            } else {
                this.xMid = (n5 + n6) / 2;
                this.yMid = (n7 + n8) / 2;
                this.zMid = (n9 + n) / 2;
                this.xMidOffset = (n5 - n6 + 1) / 2;
                this.yMidOffset = (n7 - n8 + 1) / 2;
                this.zMidOffset = (n - n9 + 1) / 2;
                if (this.xMidOffset < 32) {
                    this.xMidOffset = 32;
                }
                if (this.zMidOffset < 32) {
                    this.zMidOffset = 32;
                }
                if (this.isSingleTile) {
                    this.xMidOffset += 8;
                    this.zMidOffset += 8;
                }
                return;
            }
            n6 = n5;
            if (n13 > n5) {
                n6 = n13;
            }
            n13 = n8;
            if (n12 < n8) {
                n13 = n12;
            }
            n8 = n7;
            if (n12 > n7) {
                n8 = n12;
            }
            n12 = n9;
            if (n11 < n9) {
                n12 = n11;
            }
            n9 = n;
            if (n11 > n) {
                n9 = n11;
            }
            ++n4;
            n5 = n6;
            n6 = n10;
            n7 = n8;
            n8 = n13;
            n = n9;
            n9 = n12;
        }
    }

    @ObfuscatedName(value="aj")
    void method14361() {
        if (this.boundsType == 2) {
            return;
        }
        this.boundsType = 2;
        int n = 0;
        this.xzRadius = 0;
        while (true) {
            if (n < this.verticesCount) {
                int n2 = this.verticesX[n];
                int n3 = this.verticesZ[n];
                int n4 = this.verticesY[n];
                if ((n2 = n2 * n2 + n3 * n3 + n4 * n4) > this.xzRadius) {
                    this.xzRadius = n2;
                }
            } else {
                this.radius = this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
                this.diameter = this.xzRadius + this.xzRadius;
                return;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="al")
    public int method14363() {
        this.calculateBoundsCylinder();
        return this.xzRadius;
    }

    @ObfuscatedName(value="am")
    public void method14364() {
        for (int i = 0; i < this.verticesCount; ++i) {
            int n = this.verticesX[i];
            this.verticesX[i] = this.verticesZ[i];
            this.verticesZ[i] = -n;
        }
        this.resetBounds();
    }

    @ObfuscatedName(value="an")
    public void method14365() {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = -this.verticesX[i];
            this.verticesZ[i] = -this.verticesZ[i];
        }
        this.resetBounds();
    }

    @ObfuscatedName(value="ap")
    @Export(value="scale")
    public void scale(int n, int n2, int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            this.verticesX[i] = this.verticesX[i] * n / 128;
            this.verticesY[i] = n2 * this.verticesY[i] / 128;
            this.verticesZ[i] = n3 * this.verticesZ[i] / 128;
        }
        this.resetBounds();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aq")
    @Export(value="transform")
    void transform(int n, int[] arrn, int n2, int n3, int n4) {
        int n5 = arrn.length;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 5) return;
                        if (this.faceLabelsAlpha == null || this.faceAlphas == null) return;
                        n3 = 0;
                        while (n3 < n5) {
                            n = arrn[n3];
                            if (n < this.faceLabelsAlpha.length) {
                                int[] arrn2 = this.faceLabelsAlpha[n];
                                for (n4 = 0; n4 < arrn2.length; ++n4) {
                                    int n6 = arrn2[n4];
                                    int n7 = (this.faceAlphas[n6] & 0xFF) + n2 * 8;
                                    if (n7 < 0) {
                                        n = 0;
                                    } else {
                                        n = n7;
                                        if (n7 > 255) {
                                            n = 255;
                                        }
                                    }
                                    this.faceAlphas[n6] = (byte)n;
                                }
                            }
                            ++n3;
                        }
                        return;
                    }
                    n = 0;
                    while (n < n5) {
                        int n8 = arrn[n];
                        if (n8 < this.vertexLabels.length) {
                            int[] arrn3 = this.vertexLabels[n8];
                            for (n8 = 0; n8 < arrn3.length; ++n8) {
                                int n9 = arrn3[n8];
                                int[] arrn4 = this.verticesX;
                                arrn4[n9] = arrn4[n9] - Model_transformTempX;
                                arrn4 = this.verticesY;
                                arrn4[n9] = arrn4[n9] - Model_transformTempY;
                                arrn4 = this.verticesZ;
                                arrn4[n9] = arrn4[n9] - Model_transformTempZ;
                                this.verticesX[n9] = n2 * this.verticesX[n9] / 128;
                                this.verticesY[n9] = n3 * this.verticesY[n9] / 128;
                                this.verticesZ[n9] = n4 * this.verticesZ[n9] / 128;
                                arrn4 = this.verticesX;
                                arrn4[n9] = arrn4[n9] + Model_transformTempX;
                                arrn4 = this.verticesY;
                                arrn4[n9] = arrn4[n9] + Model_transformTempY;
                                arrn4 = this.verticesZ;
                                arrn4[n9] = arrn4[n9] + Model_transformTempZ;
                            }
                        }
                        ++n;
                    }
                    return;
                }
                n = 0;
                while (n < n5) {
                    int n10 = arrn[n];
                    if (n10 < this.vertexLabels.length) {
                        int[] arrn5 = this.vertexLabels[n10];
                        for (n10 = 0; n10 < arrn5.length; ++n10) {
                            int n11;
                            int n12;
                            int n13 = arrn5[n10];
                            int[] arrn6 = this.verticesX;
                            arrn6[n13] = arrn6[n13] - Model_transformTempX;
                            arrn6 = this.verticesY;
                            arrn6[n13] = arrn6[n13] - Model_transformTempY;
                            arrn6 = this.verticesZ;
                            arrn6[n13] = arrn6[n13] - Model_transformTempZ;
                            int n14 = (n2 & 0xFF) * 8;
                            int n15 = (n3 & 0xFF) * 8;
                            int n16 = (n4 & 0xFF) * 8;
                            if (n16 != 0) {
                                n12 = field7457[n16];
                                n16 = field7460[n16];
                                n11 = this.verticesY[n13];
                                int n17 = this.verticesX[n13];
                                this.verticesY[n13] = n16 * this.verticesY[n13] - n12 * this.verticesX[n13] >> 16;
                                this.verticesX[n13] = n11 * n12 + n17 * n16 >> 16;
                            }
                            if (n14 != 0) {
                                n12 = field7457[n14];
                                n14 = field7460[n14];
                                n16 = this.verticesY[n13];
                                n11 = this.verticesZ[n13];
                                this.verticesZ[n13] = n12 * this.verticesY[n13] + n14 * this.verticesZ[n13] >> 16;
                                this.verticesY[n13] = n16 * n14 - n11 * n12 >> 16;
                            }
                            if (n15 != 0) {
                                n14 = field7457[n15];
                                n15 = field7460[n15];
                                n12 = this.verticesZ[n13];
                                n16 = this.verticesX[n13];
                                this.verticesZ[n13] = n15 * this.verticesZ[n13] - n14 * this.verticesX[n13] >> 16;
                                this.verticesX[n13] = n12 * n14 + n16 * n15 >> 16;
                            }
                            arrn6 = this.verticesX;
                            arrn6[n13] = arrn6[n13] + Model_transformTempX;
                            arrn6 = this.verticesY;
                            arrn6[n13] = arrn6[n13] + Model_transformTempY;
                            arrn6 = this.verticesZ;
                            arrn6[n13] = arrn6[n13] + Model_transformTempZ;
                        }
                    }
                    ++n;
                }
                return;
            }
            n = 0;
            while (n < n5) {
                int n18 = arrn[n];
                if (n18 < this.vertexLabels.length) {
                    int[] arrn7 = this.vertexLabels[n18];
                    for (n18 = 0; n18 < arrn7.length; ++n18) {
                        int n19 = arrn7[n18];
                        int[] arrn8 = this.verticesX;
                        arrn8[n19] = n2 + arrn8[n19];
                        arrn8 = this.verticesY;
                        arrn8[n19] = n3 + arrn8[n19];
                        arrn8 = this.verticesZ;
                        arrn8[n19] = n4 + arrn8[n19];
                    }
                }
                ++n;
            }
            return;
        }
        Model_transformTempX = 0;
        Model_transformTempY = 0;
        Model_transformTempZ = 0;
        int n20 = 0;
        n = 0;
        while (true) {
            int n21;
            block26: {
                int[] arrn9;
                int n22;
                block27: {
                    block25: {
                        if (n20 >= n5) break block25;
                        n22 = arrn[n20];
                        n21 = n;
                        if (n22 >= this.vertexLabels.length) break block26;
                        arrn9 = this.vertexLabels[n22];
                        break block27;
                    }
                    if (n > 0) {
                        Model_transformTempX = n2 + Model_transformTempX / n;
                        Model_transformTempY = Model_transformTempY / n + n3;
                        Model_transformTempZ = n4 + Model_transformTempZ / n;
                        return;
                    }
                    Model_transformTempX = n2;
                    Model_transformTempY = n3;
                    Model_transformTempZ = n4;
                    return;
                }
                for (n21 = 0; n21 < arrn9.length; ++n21) {
                    n22 = arrn9[n21];
                    Model_transformTempX += this.verticesX[n22];
                    Model_transformTempY += this.verticesY[n22];
                    Model_transformTempZ += this.verticesZ[n22];
                    ++n;
                }
                n21 = n;
            }
            ++n20;
            n = n21;
        }
    }

    @ObfuscatedName(value="ar")
    @Export(value="offsetBy")
    public void offsetBy(int n, int n2, int n3) {
        for (int i = 0; i < this.verticesCount; ++i) {
            int[] arrn = this.verticesX;
            arrn[i] = arrn[i] + n;
            arrn = this.verticesY;
            arrn[i] = n2 + arrn[i];
            arrn = this.verticesZ;
            arrn[i] = n3 + arrn[i];
        }
        this.resetBounds();
    }

    @ObfuscatedName(value="as")
    @Export(value="calculateBoundsCylinder")
    public void calculateBoundsCylinder() {
        if (this.boundsType == 1) {
            return;
        }
        this.boundsType = 1;
        int n = 0;
        this.height = 0;
        this.bottomY = 0;
        this.xzRadius = 0;
        while (true) {
            int n2;
            int n3;
            int n4;
            if (n < this.verticesCount) {
                n4 = this.verticesX[n];
                n3 = this.verticesY[n];
                n2 = this.verticesZ[n];
                int n5 = -n3;
                if (n5 > this.height) {
                    this.height = n5;
                }
            } else {
                this.xzRadius = (int)(Math.sqrt(this.xzRadius) + 0.99);
                this.radius = (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.height * this.height) + 0.99);
                this.diameter = this.radius + (int)(Math.sqrt(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY) + 0.99);
                return;
            }
            if (n3 > this.bottomY) {
                this.bottomY = n3;
            }
            if ((n4 = n4 * n4 + n2 * n2) > this.xzRadius) {
                this.xzRadius = n4;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="aw")
    public void method14374(int n) {
        int n2 = field7457[n];
        int n3 = field7460[n];
        for (n = 0; n < this.verticesCount; ++n) {
            int n4 = this.verticesY[n];
            int n5 = this.verticesZ[n];
            this.verticesZ[n] = n2 * this.verticesY[n] + n3 * this.verticesZ[n] >> 16;
            this.verticesY[n] = n4 * n3 - n5 * n2 >> 16;
        }
        this.resetBounds();
    }

    @ObfuscatedName(value="ay")
    public void method14376() {
        for (int i = 0; i < this.verticesCount; ++i) {
            int n = this.verticesZ[i];
            this.verticesZ[i] = this.verticesX[i];
            this.verticesX[i] = -n;
        }
        this.resetBounds();
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Z)Lcp;")
    public Model method14360(boolean bl) {
        if (!bl && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
            Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
        }
        return this.buildSharedModel(bl, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([[IIIIZI)Lcp;")
    @Export(value="contourGround")
    public Model contourGround(int[][] arrn, int n, int n2, int n3, boolean bl, int n4) {
        this.calculateBoundsCylinder();
        int n5 = n - this.xzRadius;
        int n6 = n + this.xzRadius;
        int n7 = n3 - this.xzRadius;
        int n8 = n3 + this.xzRadius;
        if (n5 >= 0 && n6 + 128 >> 7 < arrn.length && n7 >= 0) {
            Model model;
            int n9 = 0;
            int n10 = 0;
            if (n8 + 128 >> 7 >= arrn[0].length) {
                return this;
            }
            n6 = n6 + 127 >> 7;
            n8 = n8 + 127 >> 7;
            if (n2 == arrn[n5 >>= 7][n7 >>= 7] && n2 == arrn[n6][n7] && n2 == arrn[n5][n8] && n2 == arrn[n6][n8]) {
                return this;
            }
            if (bl) {
                model = new Model();
                model.verticesCount = this.verticesCount;
                model.indicesCount = this.indicesCount;
                model.field7478 = this.field7478;
                model.verticesX = this.verticesX;
                model.verticesZ = this.verticesZ;
                model.indices1 = this.indices1;
                model.indices2 = this.indices2;
                model.indices3 = this.indices3;
                model.faceColors1 = this.faceColors1;
                model.faceColors2 = this.faceColors2;
                model.faceColors3 = this.faceColors3;
                model.faceRenderPriorities = this.faceRenderPriorities;
                model.faceAlphas = this.faceAlphas;
                model.field7474 = this.field7474;
                model.faceTextures = this.faceTextures;
                model.field7483 = this.field7483;
                model.field7480 = this.field7480;
                model.field7465 = this.field7465;
                model.field7467 = this.field7467;
                model.vertexLabels = this.vertexLabels;
                model.faceLabelsAlpha = this.faceLabelsAlpha;
                model.field7494 = this.field7494;
                model.field7491 = this.field7491;
                model.isSingleTile = this.isSingleTile;
                model.verticesY = new int[model.verticesCount];
            } else {
                model = this;
            }
            if (n4 != 0) {
                while (n9 < model.verticesCount) {
                    n10 = (-this.verticesY[n9] << 16) / this.height;
                    if (n10 < n4) {
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
                        model.verticesY[n9] = (n4 - n10) * ((n5 * (n11 * n6 + n13 * n8 >> 7) + (n7 * n6 + n14 * n8 >> 7) * (128 - n5) >> 7) - n2) / n4 + this.verticesY[n9];
                    }
                    ++n9;
                }
            } else {
                for (n4 = n10; n4 < model.verticesCount; ++n4) {
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
                    model.verticesY[n4] = (n10 * (n15 * n5 + n6 * n9 >> 7) + (n8 * n5 + n7 * n9 >> 7) * (128 - n10) >> 7) + this.verticesY[n4] - n2;
                }
            }
            model.resetBounds();
            return model;
        }
        return this;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ZLcp;[B)Lcp;")
    @Export(value="buildSharedModel")
    Model buildSharedModel(boolean bl, Model model, byte[] arrby) {
        int n;
        model.verticesCount = this.verticesCount;
        model.indicesCount = this.indicesCount;
        model.field7478 = this.field7478;
        if (model.verticesX == null || model.verticesX.length < this.verticesCount) {
            model.verticesX = new int[this.verticesCount + 100];
            model.verticesY = new int[this.verticesCount + 100];
            model.verticesZ = new int[this.verticesCount + 100];
        }
        int n2 = 0;
        for (n = 0; n < this.verticesCount; ++n) {
            model.verticesX[n] = this.verticesX[n];
            model.verticesY[n] = this.verticesY[n];
            model.verticesZ[n] = this.verticesZ[n];
        }
        if (bl) {
            model.faceAlphas = this.faceAlphas;
        } else {
            model.faceAlphas = arrby;
            if (this.faceAlphas != null) {
                for (n = n2; n < this.indicesCount; ++n) {
                    model.faceAlphas[n] = this.faceAlphas[n];
                }
            } else {
                for (n = 0; n < this.indicesCount; ++n) {
                    model.faceAlphas[n] = 0;
                }
            }
        }
        model.indices1 = this.indices1;
        model.indices2 = this.indices2;
        model.indices3 = this.indices3;
        model.faceColors1 = this.faceColors1;
        model.faceColors2 = this.faceColors2;
        model.faceColors3 = this.faceColors3;
        model.faceRenderPriorities = this.faceRenderPriorities;
        model.field7474 = this.field7474;
        model.faceTextures = this.faceTextures;
        model.field7483 = this.field7483;
        model.field7480 = this.field7480;
        model.field7465 = this.field7465;
        model.field7467 = this.field7467;
        model.vertexLabels = this.vertexLabels;
        model.faceLabelsAlpha = this.faceLabelsAlpha;
        model.field7494 = this.field7494;
        model.field7491 = this.field7491;
        model.isSingleTile = this.isSingleTile;
        n = field7456;
        field7456 = n + 1;
        model.field7492 = n;
        model.field7496 = true;
        model.resetBounds();
        return model;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lbf;I)V")
    @Export(value="animate")
    public void animate(Frames object, int n) {
        if (this.vertexLabels == null) {
            return;
        }
        if (n == -1) {
            return;
        }
        object = ((Frames)object).frames[n];
        Skeleton skeleton = ((Animation)object).skeleton;
        int n2 = 0;
        Model_transformTempX = 0;
        Model_transformTempY = 0;
        Model_transformTempZ = 0;
        int n3 = 0;
        while (true) {
            n = n2;
            if (n3 >= ((Animation)object).transformCount) break;
            if (skeleton.field4653[((Animation)object).transformSkeletonLabels[n3]] == 5) {
                n = n2;
                break;
            }
            ++n3;
        }
        while (n < ((Animation)object).transformCount) {
            n3 = ((Animation)object).transformSkeletonLabels[n];
            this.transform(skeleton.field4653[n3], skeleton.field4656[n3], ((Animation)object).field439[n], ((Animation)object).field434[n], ((Animation)object).field435[n]);
            ++n;
        }
        this.resetBounds();
    }
}

