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

@ObfuscatedName(value="hk")
@Implements(value="VorbisSample")
public class VorbisSample
extends Node {
    @ObfuscatedName(value="aa")
    @Export(value="VorbisSample_bitOffset")
    static int VorbisSample_bitOffset = 0;
    @ObfuscatedName(value="ac")
    static float[] field6108;
    @ObfuscatedName(value="af")
    @Export(value="VorbisSample_blockSize1")
    static int VorbisSample_blockSize1 = 0;
    @ObfuscatedName(value="ag")
    static float[] field6111;
    @ObfuscatedName(value="aj")
    @Export(value="VorbisSample_bytes")
    static byte[] VorbisSample_bytes;
    @ObfuscatedName(value="al")
    @Export(value="VorbisSample_byteOffset")
    static int VorbisSample_byteOffset = 0;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="[Lgi;")
    @Export(value="VorbisSample_floors")
    static VorbisFloor[] VorbisSample_floors;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[Lhf;")
    @Export(value="VorbisSample_residues")
    static VorbisResidue[] VorbisSample_residues;
    @ObfuscatedName(value="ap")
    static boolean field6116 = false;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="[Lgj;")
    @Export(value="VorbisSample_codebooks")
    static VorbisCodebook[] VorbisSample_codebooks;
    @ObfuscatedName(value="ar")
    @Export(value="VorbisSample_mapping")
    static int[] VorbisSample_mapping;
    @ObfuscatedName(value="au")
    static float[] field6119;
    @ObfuscatedName(value="aw")
    @Export(value="VorbisSample_blockFlags")
    static boolean[] VorbisSample_blockFlags;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lgn;")
    @Export(value="VorbisSample_mappings")
    static VorbisMapping[] VorbisSample_mappings;
    @ObfuscatedName(value="bg")
    static float[] field6123;
    @ObfuscatedName(value="bj")
    static int[] field6125;
    @ObfuscatedName(value="bp")
    static float[] field6126;
    @ObfuscatedName(value="ad")
    static float[] field6109;
    @ObfuscatedName(value="bi")
    static float[] field6124;
    @ObfuscatedName(value="ab")
    @Export(value="VorbisSample_blockSize0")
    static int VorbisSample_blockSize0 = 0;
    @ObfuscatedName(value="bf")
    static int[] field6122;
    @ObfuscatedName(value="ae")
    @Export(value="sampleRate")
    int sampleRate;
    @ObfuscatedName(value="ah")
    @Export(value="end")
    int end;
    @ObfuscatedName(value="ao")
    float[] field6131;
    @ObfuscatedName(value="as")
    boolean field6132;
    @ObfuscatedName(value="az")
    int field6136;
    @ObfuscatedName(value="bh")
    @Export(value="samples")
    byte[] samples;
    @ObfuscatedName(value="bq")
    int field6138;
    @ObfuscatedName(value="br")
    int field6139;
    @ObfuscatedName(value="ai")
    @Export(value="sampleCount")
    int sampleCount;
    @ObfuscatedName(value="ak")
    byte[][] field6130;
    @ObfuscatedName(value="at")
    int field6133;
    @ObfuscatedName(value="av")
    boolean field6134;
    @ObfuscatedName(value="ax")
    @Export(value="start")
    int start;

    VorbisSample(byte[] arrby) {
        this.read(arrby);
    }

    @ObfuscatedName(value="ah")
    @Export(value="read")
    void read(byte[] object) {
        object = new Buffer((byte[])object);
        this.sampleRate = ((Buffer)object).method11670(1604085085);
        this.sampleCount = ((Buffer)object).method11670(1604085085);
        this.start = ((Buffer)object).method11670(1604085085);
        this.end = ((Buffer)object).method11670(1604085085);
        if (this.end < 0) {
            this.end = this.end;
            this.field6132 = true;
        }
        int n = ((Buffer)object).method11670(1604085085);
        this.field6130 = new byte[n][];
        int n2 = 0;
        while (n2 < n) {
            int n3;
            int n4;
            int n5 = 0;
            do {
                n4 = ((Buffer)object).method11650(1422636579);
                n5 = n3 = n5 + n4;
            } while (n4 >= 255);
            byte[] arrby = new byte[n3];
            ((Buffer)object).method11671(arrby, 0, n3, -1943214043);
            this.field6130[n2] = arrby;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="aj")
    float[] method11125(int n) {
        float[] arrf;
        boolean bl;
        Object object;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        block38: {
            int n7;
            int n8;
            boolean bl2;
            int n9;
            block41: {
                block40: {
                    block39: {
                        VorbisSample.VorbisSample_setData(this.field6130[n], 0);
                        VorbisSample.readBit();
                        n9 = VorbisSample.readBits(class376.method13146(VorbisSample_mapping.length - 1, 65280));
                        bl2 = VorbisSample_blockFlags[n9];
                        n6 = bl2 ? VorbisSample_blockSize1 : VorbisSample_blockSize0;
                        if (!bl2) break block39;
                        n = VorbisSample.readBit() != 0 ? 1 : 0;
                        n5 = n;
                        if (VorbisSample.readBit() == 0) break block40;
                        n4 = 1;
                        n5 = n;
                        break block41;
                    }
                    n5 = 0;
                }
                n4 = 0;
            }
            n = n6 >> 1;
            if (bl2 && n5 == 0) {
                n3 = n6 >> 2;
                n5 = n3 - (VorbisSample_blockSize0 >> 2);
                n8 = n3 + (VorbisSample_blockSize0 >> 2);
                n2 = VorbisSample_blockSize0 >> 1;
            } else {
                n2 = n3 = n;
                n5 = 0;
                n8 = n3;
            }
            if (bl2 && n4 == 0) {
                n3 = n6 - (n6 >> 2);
                n4 = n3 - (VorbisSample_blockSize0 >> 2);
                n3 += VorbisSample_blockSize0 >> 2;
                n7 = VorbisSample_blockSize0 >> 1;
            } else {
                n3 = n6;
                n7 = n4 = n;
            }
            object = VorbisSample_mappings[VorbisSample_mapping[n9]];
            n9 = ((VorbisMapping)object).mappingMux;
            n9 = ((VorbisMapping)object).submapFloor[n9];
            bl = VorbisSample_floors[n9].readSubmapFloor() ^ true;
            for (n9 = 0; n9 < ((VorbisMapping)object).submaps; ++n9) {
                VorbisSample_residues[((VorbisMapping)object).submapResidue[n9]].method5042(field6109, n, bl);
            }
            if (!bl) {
                n9 = ((VorbisMapping)object).mappingMux;
                n9 = ((VorbisMapping)object).submapFloor[n9];
                VorbisSample_floors[n9].method4818(field6109, n);
            }
            if (bl) {
            } else {
                int n10;
                float f;
                int n11;
                float f2;
                float f3;
                float f4;
                Object object2;
                int n12;
                int n13;
                Object object3;
                int n14;
                int n15 = n6 >> 2;
                int n16 = n6 >> 3;
                float[] arrf2 = field6109;
                for (n9 = 0; n9 < n; ++n9) {
                    arrf2[n9] = arrf2[n9] * 0.5f;
                }
                for (n9 = n; n9 < n6; ++n9) {
                    arrf2[n9] = -arrf2[n6 - n9 - 1];
                }
                object = bl2 ? (Object)field6126 : (Object)field6111;
                arrf = bl2 ? field6124 : field6108;
                float[] arrf3 = bl2 ? field6123 : field6119;
                int[] arrn = bl2 ? field6125 : field6122;
                for (n9 = 0; n9 < n15; ++n9) {
                    n14 = n9 * 4;
                    object3 = arrf2[n14];
                    n13 = n6 - n14;
                    n12 = n13 - 1;
                    object2 = arrf2[n14 + 2];
                    n14 = n13 - 3;
                    n13 = n9 * 2;
                    f4 = (float)object[n13];
                    f3 = (float)object[n13 + 1];
                    arrf2[n12] = (object3 -= arrf2[n12]) * f4 - (object2 -= arrf2[n14]) * f3;
                    arrf2[n14] = object3 * f3 + object2 * f4;
                }
                for (n9 = 0; n9 < n16; ++n9) {
                    n12 = n9 * 4;
                    n14 = n12 + n + 3;
                    f2 = arrf2[n14];
                    n13 = n12 + n + 1;
                    f4 = arrf2[n13];
                    n11 = n12 + 3;
                    f = arrf2[n11];
                    n10 = n12 + 1;
                    f3 = arrf2[n10];
                    arrf2[n14] = f2 + f;
                    arrf2[n13] = f4 + f3;
                    object3 = object[n - 4 - n12];
                    object2 = object[n - 3 - n12];
                    arrf2[n11] = (f2 -= f) * object3 - (f4 -= f3) * object2;
                    arrf2[n10] = f4 * object3 + f2 * object2;
                }
                n10 = n6 - 1;
                n12 = class376.method13146(n10, 65280);
                n9 = 0;
                block5: while (true) {
                    if (n9 >= n12 - 3) {
                        n9 = 1;
                        while (true) {
                            if (n9 >= n16 - 1) {
                                double d;
                                for (n9 = 0; n9 < n; ++n9) {
                                    arrf2[n9] = arrf2[n9 * 2 + 1];
                                }
                                for (n9 = 0; n9 < n16; ++n9) {
                                    n12 = n9 * 2;
                                    n14 = n9 * 4;
                                    arrf2[n10 - n12] = arrf2[n14];
                                    arrf2[n6 - 2 - n12] = arrf2[n14 + 1];
                                    n13 = n6 - n15;
                                    arrf2[n13 - 1 - n12] = arrf2[n14 + 2];
                                    arrf2[n13 - 2 - n12] = arrf2[n14 + 3];
                                }
                                n9 = n16;
                                for (n12 = 0; n12 < n9; ++n12) {
                                    n16 = n12 * 2;
                                    f4 = arrf3[n16];
                                    f3 = arrf3[n16 + 1];
                                    n14 = n16 + n;
                                    float f5 = arrf2[n14];
                                    n13 = n14 + 1;
                                    object3 = arrf2[n13];
                                    n11 = n6 - 2 - n16;
                                    float f6 = arrf2[n11];
                                    n16 = n10 - n16;
                                    object2 = arrf2[n16];
                                    f2 = f5 - f6;
                                    f = object3 + object2;
                                    float f7 = f3 * f2 + f4 * f;
                                    arrf2[n14] = ((f5 += f6) + f7) * 0.5f;
                                    arrf2[n11] = (f5 - f7) * 0.5f;
                                    f4 = f3 * f - f4 * f2;
                                    arrf2[n13] = (object3 - object2 + f4) * 0.5f;
                                    arrf2[n16] = (-object3 + object2 + f4) * 0.5f;
                                }
                                for (n9 = 0; n9 < n15; ++n9) {
                                    n12 = n9 * 2;
                                    n14 = n12 + n;
                                    object3 = arrf2[n14];
                                    object2 = arrf[n12];
                                    n13 = n12 + 1;
                                    n11 = n13 + n;
                                    arrf2[n9] = object3 * object2 + arrf2[n11] * arrf[n13];
                                    arrf2[n - 1 - n9] = arrf2[n14] * arrf[n13] - arrf2[n11] * arrf[n12];
                                }
                                for (n9 = 0; n9 < n15; ++n9) {
                                    arrf2[n9 + (n6 - n15)] = -arrf2[n9];
                                }
                                for (n9 = 0; n9 < n15; ++n9) {
                                    arrf2[n9] = arrf2[n15 + n9];
                                }
                                for (n9 = 0; n9 < n15; ++n9) {
                                    arrf2[n15 + n9] = -arrf2[n15 - n9 - 1];
                                }
                                for (n9 = 0; n9 < n15; ++n9) {
                                    arrf2[n9 + n] = arrf2[n6 - n9 - 1];
                                }
                                for (n9 = n5; n9 < n8; ++n9) {
                                    object3 = (float)Math.sin(((double)(n9 - n5) + 0.5) / (double)n2 * 0.5 * Math.PI);
                                    object = field6109;
                                    object2 = object[n9];
                                    d = object3;
                                    object[n9] = object2 * (float)Math.sin(1.5707963267948966 * d * d);
                                }
                                n8 = n4;
                                n2 = n3;
                                while (true) {
                                    n3 = n2;
                                    if (n8 < n2) {
                                        object3 = (float)Math.sin(((double)(n8 - n4) + 0.5) / (double)n7 * 0.5 * Math.PI + 1.5707963267948966);
                                        object = field6109;
                                        object2 = object[n8];
                                        d = object3;
                                        object[n8] = object2 * (float)Math.sin(d * 1.5707963267948966 * d);
                                        ++n8;
                                        continue;
                                    }
                                    break block38;
                                    break;
                                }
                            }
                            n14 = arrn[n9];
                            if (n9 < n14) {
                                n12 = n9 * 8;
                                n13 = n12 + 1;
                                object3 = arrf2[n13];
                                n11 = (n14 *= 8) + 1;
                                arrf2[n13] = arrf2[n11];
                                arrf2[n11] = object3;
                                n13 = n12 + 3;
                                object3 = arrf2[n13];
                                n11 = n14 + 3;
                                arrf2[n13] = arrf2[n11];
                                arrf2[n11] = object3;
                                n13 = n12 + 5;
                                object3 = arrf2[n13];
                                n11 = n14 + 5;
                                arrf2[n13] = arrf2[n11];
                                arrf2[n11] = object3;
                                object3 = arrf2[n12 += 7];
                                arrf2[n12] = arrf2[n14 += 7];
                                arrf2[n14] = object3;
                            }
                            ++n9;
                        }
                    }
                    n14 = n6 >> n9 + 2;
                    n13 = 0;
                    while (true) {
                        int n17;
                        int n18;
                        if (n13 < 2 << n9) {
                            n18 = n6 - n14 * n13 * 2;
                            n17 = n6 - n14 * (n13 * 2 + 1);
                        } else {
                            ++n9;
                            continue block5;
                        }
                        for (n11 = 0; n11 < n6 >> n9 + 4; ++n11) {
                            int n19 = n11 * 4;
                            int n20 = n18 - 1 - n19;
                            f2 = arrf2[n20];
                            int n21 = n18 - 3 - n19;
                            f4 = arrf2[n21];
                            int n22 = n17 - 1 - n19;
                            f = arrf2[n22];
                            n19 = n17 - 3 - n19;
                            f3 = arrf2[n19];
                            arrf2[n20] = f2 + f;
                            arrf2[n21] = f4 + f3;
                            n20 = n11 * (8 << n9);
                            object3 = object[n20];
                            object2 = object[n20 + 1];
                            arrf2[n22] = (f2 -= f) * object3 - (f4 -= f3) * object2;
                            arrf2[n19] = f4 * object3 + f2 * object2;
                        }
                        ++n13;
                    }
                    break;
                }
            }
            for (n4 = n; n4 < n6; ++n4) {
                VorbisSample.field6109[n4] = 0.0f;
            }
        }
        object = null;
        if (this.field6136 > 0) {
            arrf = new float[n6 + this.field6136 >> 2];
            if (!this.field6134) {
                for (n4 = 0; n4 < this.field6133; ++n4) {
                    n2 = this.field6136;
                    arrf[n4] = arrf[n4] + this.field6131[n4 + (n2 >> 1)];
                }
            }
            object = arrf;
            if (!bl) {
                while (true) {
                    object = arrf;
                    if (n5 >= n) break;
                    n4 = n5 + (arrf.length - n);
                    arrf[n4] = arrf[n4] + field6109[n5];
                    ++n5;
                }
            }
        }
        arrf = this.field6131;
        this.field6131 = field6109;
        field6109 = arrf;
        this.field6136 = n6;
        this.field6133 = n3 - n;
        this.field6134 = bl;
        return object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="([I)Lhb;")
    @Export(value="toRawSound")
    RawSound toRawSound(int[] var1_1) {
        if (var1_1 /* !! */  != null && var1_1 /* !! */ [0] <= 0) {
            return null;
        }
        if (this.samples == null) {
            this.field6136 = 0;
            this.field6131 = new float[VorbisSample.VorbisSample_blockSize1];
            this.samples = new byte[this.sampleCount];
            this.field6138 = 0;
            this.field6139 = 0;
        }
        block0: while (true) {
            if (this.field6139 >= this.field6130.length) {
                this.field6131 = null;
                var1_2 = this.samples;
                this.samples = null;
                return new RawSound(this.sampleRate, var1_2, this.start, this.end, this.field6132);
            }
            if (var1_1 /* !! */  != null && var1_1 /* !! */ [0] <= 0) {
                return null;
            }
            var7_8 = this.method11125(this.field6139);
            if (var7_8 == null) ** GOTO lbl33
            var3_4 = this.field6138;
            var2_3 = var4_5 = var7_8.length;
            if (var4_5 > this.sampleCount - var3_4) {
                var2_3 = this.sampleCount - var3_4;
            }
            var4_5 = 0;
            while (true) {
                if (var4_5 < var2_3) {
                    var5_6 = var6_7 = (int)(var7_8[var4_5] * 128.0f + 128.0f);
                    if ((var6_7 & -256) != 0) {
                        var5_6 = var6_7 >> 31;
                    }
                } else {
                    if (var1_1 /* !! */  != null) {
                        var1_1 /* !! */ [0] = var1_1 /* !! */ [0] - (var3_4 - this.field6138);
                    }
                    this.field6138 = var3_4;
lbl33:
                    // 2 sources

                    ++this.field6139;
                    continue block0;
                }
                this.samples[var3_4] = (byte)(var5_6 - 128);
                ++var4_5;
                ++var3_4;
            }
            break;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lkc;II)Lhk;")
    @Export(value="readMusicSample")
    static VorbisSample readMusicSample(AbstractArchive object, int n, int n2) {
        if (!VorbisSample.method11105((AbstractArchive)object)) {
            ((AbstractArchive)object).tryLoadFile(n, n2);
            return null;
        }
        if ((object = (Object)((AbstractArchive)object).takeFile(n, n2)) == null) {
            return null;
        }
        return new VorbisSample((byte[])object);
    }

    @ObfuscatedName(value="ae")
    @Export(value="VorbisSample_setData")
    static void VorbisSample_setData(byte[] arrby, int n) {
        VorbisSample_bytes = arrby;
        VorbisSample_byteOffset = n;
        VorbisSample_bitOffset = 0;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lkc;)Z")
    static boolean method11105(AbstractArchive object) {
        if (!field6116) {
            if ((object = (Object)((AbstractArchive)object).takeFile(0, 0)) == null) {
                return false;
            }
            VorbisSample.method11112((byte[])object);
            field6116 = true;
        }
        return true;
    }

    @ObfuscatedName(value="as")
    static void method11112(byte[] arrobject) {
        int n;
        int n2;
        VorbisSample.VorbisSample_setData(arrobject, 0);
        VorbisSample_blockSize0 = 1 << VorbisSample.readBits(4);
        VorbisSample_blockSize1 = 1 << VorbisSample.readBits(4);
        field6109 = new float[VorbisSample_blockSize1];
        for (n2 = 0; n2 < 2; ++n2) {
            double d;
            int n3;
            int n4;
            n = n2 != 0 ? VorbisSample_blockSize1 : VorbisSample_blockSize0;
            int n5 = n >> 1;
            int n6 = n >> 2;
            int n7 = n >> 3;
            arrobject = new float[n5];
            for (n4 = 0; n4 < n6; ++n4) {
                n3 = n4 * 2;
                d = (double)(n4 * 4) * Math.PI / (double)n;
                arrobject[n3] = (byte)Math.cos(d);
                arrobject[n3 + 1] = (byte)(-((float)Math.sin(d)));
            }
            float[] arrf = new float[n5];
            for (n4 = 0; n4 < n6; ++n4) {
                n5 = n4 * 2;
                n3 = n5 + 1;
                d = (double)n3 * Math.PI / (double)(n * 2);
                arrf[n5] = (float)Math.cos(d);
                arrf[n3] = (float)Math.sin(d);
            }
            float[] arrf2 = new float[n6];
            for (n4 = 0; n4 < n7; ++n4) {
                n6 = n4 * 2;
                d = (double)(n4 * 4 + 2) * Math.PI / (double)n;
                arrf2[n6] = (float)Math.cos(d);
                arrf2[n6 + 1] = -((float)Math.sin(d));
            }
            int[] arrn = new int[n7];
            n4 = class376.method13146(n7 - 1, 65280);
            for (n = 0; n < n7; ++n) {
                arrn[n] = class95.method4851(n, n4, -1791515248);
            }
            if (n2 != 0) {
                field6126 = arrobject;
                field6124 = arrf;
                field6123 = arrf2;
                field6125 = arrn;
                continue;
            }
            field6111 = arrobject;
            field6108 = arrf;
            field6119 = arrf2;
            field6122 = arrn;
        }
        n2 = VorbisSample.readBits(8) + 1;
        VorbisSample_codebooks = new VorbisCodebook[n2];
        for (n = 0; n < n2; ++n) {
            VorbisSample.VorbisSample_codebooks[n] = new VorbisCodebook();
        }
        n2 = VorbisSample.readBits(6);
        for (n = 0; n < n2 + 1; ++n) {
            VorbisSample.readBits(16);
        }
        n2 = VorbisSample.readBits(6) + 1;
        VorbisSample_floors = new VorbisFloor[n2];
        for (n = 0; n < n2; ++n) {
            VorbisSample.VorbisSample_floors[n] = new VorbisFloor();
        }
        n2 = VorbisSample.readBits(6) + 1;
        VorbisSample_residues = new VorbisResidue[n2];
        for (n = 0; n < n2; ++n) {
            VorbisSample.VorbisSample_residues[n] = new VorbisResidue();
        }
        n2 = VorbisSample.readBits(6) + 1;
        VorbisSample_mappings = new VorbisMapping[n2];
        for (n = 0; n < n2; ++n) {
            VorbisSample.VorbisSample_mappings[n] = new VorbisMapping();
        }
        n2 = VorbisSample.readBits(6) + 1;
        VorbisSample_blockFlags = new boolean[n2];
        VorbisSample_mapping = new int[n2];
        for (n = 0; n < n2; ++n) {
            arrobject = VorbisSample_blockFlags;
            byte by = VorbisSample.readBit() != 0 ? (byte)1 : 0;
            arrobject[n] = by;
            VorbisSample.readBits(16);
            VorbisSample.readBits(16);
            VorbisSample.VorbisSample_mapping[n] = VorbisSample.readBits(8);
        }
    }

    @ObfuscatedName(value="ai")
    @Export(value="readBit")
    static int readBit() {
        byte by = VorbisSample_bytes[VorbisSample_byteOffset];
        int n = VorbisSample_bitOffset++;
        VorbisSample_byteOffset = (VorbisSample_bitOffset >> 3) + VorbisSample_byteOffset;
        VorbisSample_bitOffset &= 7;
        return by >> n & 1;
    }

    @ObfuscatedName(value="ak")
    @Export(value="float32Unpack")
    static float float32Unpack(int n) {
        int n2;
        int n3 = n2 = 0x1FFFFF & n;
        if ((Integer.MIN_VALUE & n) != 0) {
            n3 = -n2;
        }
        return (float)((double)n3 * Math.pow(2.0, ((n & 0x7FE00000) >> 21) - 788));
    }

    @ObfuscatedName(value="ax")
    @Export(value="readBits")
    static int readBits(int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = n;
        n = n2;
        while (n4 >= 8 - VorbisSample_bitOffset) {
            n2 = 8 - VorbisSample_bitOffset;
            n = (((1 << n2) - 1 & VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset) << n3) + n;
            VorbisSample_bitOffset = 0;
            ++VorbisSample_byteOffset;
            n3 += n2;
            n4 -= n2;
        }
        n2 = n;
        if (n4 > 0) {
            n2 = (((1 << n4) - 1 & VorbisSample_bytes[VorbisSample_byteOffset] >> VorbisSample_bitOffset) << n3) + n;
            VorbisSample_bitOffset = n4 + VorbisSample_bitOffset;
        }
        return n2;
    }
}

