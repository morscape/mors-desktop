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

@ObfuscatedName(value="gi")
@Implements(value="VorbisFloor")
public class VorbisFloor {
    @ObfuscatedName(value="ae")
    @Export(value="VorbisFloor_decibelStatics")
    static final float[] VorbisFloor_decibelStatics;
    @ObfuscatedName(value="af")
    static int[] field2705;
    @ObfuscatedName(value="aq")
    static boolean[] field2707;
    @ObfuscatedName(value="ak")
    static final int[] field2706;
    @ObfuscatedName(value="ab")
    static int[] field2703;
    @ObfuscatedName(value="aa")
    @Export(value="subclassBooks")
    int[][] subclassBooks;
    @ObfuscatedName(value="ah")
    @Export(value="partitionClassList")
    int[] partitionClassList;
    @ObfuscatedName(value="aj")
    @Export(value="classSubClasses")
    int[] classSubClasses;
    @ObfuscatedName(value="al")
    @Export(value="classMasterbooks")
    int[] classMasterbooks;
    @ObfuscatedName(value="as")
    @Export(value="classDimensions")
    int[] classDimensions;
    @ObfuscatedName(value="ai")
    int[] field2710;
    @ObfuscatedName(value="ax")
    @Export(value="multiplier")
    int multiplier;

    static {
        field2706 = new int[]{256, 128, 86, 64};
        VorbisFloor_decibelStatics = new float[]{1.0649863E-7f, 1.1341951E-7f, 1.2079015E-7f, 1.2863978E-7f, 1.369995E-7f, 1.459025E-7f, 1.5538409E-7f, 1.6548181E-7f, 1.7623574E-7f, 1.8768856E-7f, 1.998856E-7f, 2.128753E-7f, 2.2670913E-7f, 2.4144197E-7f, 2.5713223E-7f, 2.7384212E-7f, 2.9163792E-7f, 3.1059022E-7f, 3.307741E-7f, 3.5226967E-7f, 3.7516213E-7f, 3.995423E-7f, 4.255068E-7f, 4.5315863E-7f, 4.8260745E-7f, 5.1397E-7f, 5.4737063E-7f, 5.829419E-7f, 6.208247E-7f, 6.611694E-7f, 7.041359E-7f, 7.4989464E-7f, 7.98627E-7f, 8.505263E-7f, 9.057983E-7f, 9.646621E-7f, 1.0273513E-6f, 1.0941144E-6f, 1.1652161E-6f, 1.2409384E-6f, 1.3215816E-6f, 1.4074654E-6f, 1.4989305E-6f, 1.5963394E-6f, 1.7000785E-6f, 1.8105592E-6f, 1.9282195E-6f, 2.053526E-6f, 2.1869757E-6f, 2.3290977E-6f, 2.4804558E-6f, 2.6416496E-6f, 2.813319E-6f, 2.9961443E-6f, 3.1908505E-6f, 3.39821E-6f, 3.619045E-6f, 3.8542307E-6f, 4.1047006E-6f, 4.371447E-6f, 4.6555283E-6f, 4.958071E-6f, 5.280274E-6f, 5.623416E-6f, 5.988857E-6f, 6.3780467E-6f, 6.7925284E-6f, 7.2339453E-6f, 7.704048E-6f, 8.2047E-6f, 8.737888E-6f, 9.305725E-6f, 9.910464E-6f, 1.0554501E-5f, 1.1240392E-5f, 1.1970856E-5f, 1.2748789E-5f, 1.3577278E-5f, 1.4459606E-5f, 1.5399271E-5f, 1.6400005E-5f, 1.7465769E-5f, 1.8600793E-5f, 1.9809577E-5f, 2.1096914E-5f, 2.2467912E-5f, 2.3928002E-5f, 2.5482977E-5f, 2.7139005E-5f, 2.890265E-5f, 3.078091E-5f, 3.2781227E-5f, 3.4911533E-5f, 3.718028E-5f, 3.9596467E-5f, 4.2169668E-5f, 4.491009E-5f, 4.7828602E-5f, 5.0936775E-5f, 5.424693E-5f, 5.7772202E-5f, 6.152657E-5f, 6.552491E-5f, 6.9783084E-5f, 7.4317984E-5f, 7.914758E-5f, 8.429104E-5f, 8.976875E-5f, 9.560242E-5f, 1.0181521E-4f, 1.0843174E-4f, 1.1547824E-4f, 1.2298267E-4f, 1.3097477E-4f, 1.3948625E-4f, 1.4855085E-4f, 1.5820454E-4f, 1.6848555E-4f, 1.7943469E-4f, 1.9109536E-4f, 2.0351382E-4f, 2.167393E-4f, 2.3082423E-4f, 2.4582449E-4f, 2.6179955E-4f, 2.7881275E-4f, 2.9693157E-4f, 3.1622787E-4f, 3.3677815E-4f, 3.5866388E-4f, 3.8197188E-4f, 4.0679457E-4f, 4.3323037E-4f, 4.613841E-4f, 4.913675E-4f, 5.2329927E-4f, 5.573062E-4f, 5.935231E-4f, 6.320936E-4f, 6.731706E-4f, 7.16917E-4f, 7.635063E-4f, 8.1312325E-4f, 8.6596457E-4f, 9.2223985E-4f, 9.821722E-4f, 0.0010459992f, 0.0011139743f, 0.0011863665f, 0.0012634633f, 0.0013455702f, 0.0014330129f, 0.0015261382f, 0.0016253153f, 0.0017309374f, 0.0018434235f, 0.0019632196f, 0.0020908006f, 0.0022266726f, 0.0023713743f, 0.0025254795f, 0.0026895993f, 0.0028643848f, 0.0030505287f, 0.003248769f, 0.0034598925f, 0.0036847359f, 0.0039241905f, 0.0041792067f, 0.004450795f, 0.004740033f, 0.005048067f, 0.0053761187f, 0.005725489f, 0.0060975635f, 0.0064938175f, 0.0069158226f, 0.0073652514f, 0.007843887f, 0.008353627f, 0.008896492f, 0.009474637f, 0.010090352f, 0.01074608f, 0.011444421f, 0.012188144f, 0.012980198f, 0.013823725f, 0.014722068f, 0.015678791f, 0.016697686f, 0.017782796f, 0.018938422f, 0.020169148f, 0.021479854f, 0.022875736f, 0.02436233f, 0.025945531f, 0.027631618f, 0.029427277f, 0.031339627f, 0.03337625f, 0.035545226f, 0.037855156f, 0.0403152f, 0.042935107f, 0.045725275f, 0.048696756f, 0.05186135f, 0.05523159f, 0.05882085f, 0.062643364f, 0.06671428f, 0.07104975f, 0.075666964f, 0.08058423f, 0.08582105f, 0.09139818f, 0.097337745f, 0.1036633f, 0.11039993f, 0.11757434f, 0.12521498f, 0.13335215f, 0.14201812f, 0.15124726f, 0.16107617f, 0.1715438f, 0.18269168f, 0.19456401f, 0.20720787f, 0.22067343f, 0.23501402f, 0.25028655f, 0.26655158f, 0.28387362f, 0.3023213f, 0.32196787f, 0.34289113f, 0.36517414f, 0.3889052f, 0.41417846f, 0.44109413f, 0.4697589f, 0.50028646f, 0.53279793f, 0.5674221f, 0.6042964f, 0.64356697f, 0.6853896f, 0.72993004f, 0.777365f, 0.8278826f, 0.88168305f, 0.9389798f, 1.0f};
    }

    VorbisFloor() {
        if (VorbisSample.readBits(16) != 1) {
            throw new RuntimeException();
        }
        int n = VorbisSample.readBits(5);
        this.partitionClassList = new int[n];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            if (n2 < n) {
                this.partitionClassList[n2] = n5 = VorbisSample.readBits(4);
                n4 = n3;
                if (n5 >= n3) {
                    n4 = n5 + 1;
                }
            } else {
                this.classDimensions = new int[n3];
                this.classSubClasses = new int[n3];
                this.classMasterbooks = new int[n3];
                this.subclassBooks = new int[n3][];
                n2 = 0;
                while (true) {
                    int[] arrn;
                    n4 = 2;
                    if (n2 < n3) {
                        this.classDimensions[n2] = VorbisSample.readBits(3) + 1;
                        arrn = this.classSubClasses;
                        arrn[n2] = n4 = VorbisSample.readBits(2);
                        if (n4 != 0) {
                            this.classMasterbooks[n2] = VorbisSample.readBits(8);
                        }
                    } else {
                        this.multiplier = VorbisSample.readBits(2) + 1;
                        n5 = VorbisSample.readBits(4);
                        n2 = 2;
                        for (n3 = 0; n3 < n; ++n3) {
                            n2 = this.classDimensions[this.partitionClassList[n3]] + n2;
                        }
                        this.field2710 = new int[n2];
                        this.field2710[0] = 0;
                        this.field2710[1] = 1 << n5;
                        n3 = 0;
                        n2 = n4;
                        while (true) {
                            int n6;
                            if (n3 < n) {
                                n6 = this.partitionClassList[n3];
                                n4 = 0;
                            } else {
                                if (field2703 == null || field2703.length < n2) {
                                    field2703 = new int[n2];
                                    field2705 = new int[n2];
                                    field2707 = new boolean[n2];
                                }
                                return;
                            }
                            while (n4 < this.classDimensions[n6]) {
                                this.field2710[n2] = VorbisSample.readBits(n5);
                                ++n4;
                                ++n2;
                            }
                            ++n3;
                        }
                    }
                    n5 = 1 << n4;
                    arrn = new int[n5];
                    this.subclassBooks[n2] = arrn;
                    for (n4 = 0; n4 < n5; ++n4) {
                        arrn[n4] = VorbisSample.readBits(8) - 1;
                    }
                    ++n2;
                }
            }
            ++n2;
            n3 = n4;
        }
    }

    @ObfuscatedName(value="ah")
    @Export(value="VarbisFloor_sort")
    void VarbisFloor_sort(int n, int n2) {
        if (n >= n2) {
            return;
        }
        int n3 = field2703[n];
        int n4 = field2705[n];
        boolean bl = field2707[n];
        int n5 = n + 1;
        int n6 = n;
        while (true) {
            int n7;
            if (n5 <= n2) {
                int n8 = field2703[n5];
                n7 = n6;
                if (n8 < n3) {
                    VorbisFloor.field2703[n6] = n8;
                    VorbisFloor.field2705[n6] = field2705[n5];
                    VorbisFloor.field2707[n6] = field2707[n5];
                    n7 = n6 + 1;
                    VorbisFloor.field2703[n5] = field2703[n7];
                    VorbisFloor.field2705[n5] = field2705[n7];
                    VorbisFloor.field2707[n5] = field2707[n7];
                }
            } else {
                VorbisFloor.field2703[n6] = n3;
                VorbisFloor.field2705[n6] = n4;
                VorbisFloor.field2707[n6] = bl;
                this.VarbisFloor_sort(n, n6 - 1);
                this.VarbisFloor_sort(n6 + 1, n2);
                return;
            }
            ++n5;
            n6 = n7;
        }
    }

    @ObfuscatedName(value="aj")
    void method4818(float[] arrf, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = this.field2710.length;
        int n7 = field2706[this.multiplier - 1];
        Object[] arrobject = field2707;
        VorbisFloor.field2707[1] = true;
        arrobject[0] = true;
        for (n5 = 2; n5 < n6; ++n5) {
            int n8 = VorbisFloor.method4811(field2703, n5);
            int n9 = VorbisFloor.method4809(field2703, n5);
            n4 = this.method4817(field2703[n8], field2705[n8], field2703[n9], field2705[n9], field2703[n5]);
            int n10 = field2705[n5];
            n3 = n7 - n4;
            n2 = n3 < n4 ? n3 : n4;
            if (n10 != 0) {
                arrobject = field2707;
                VorbisFloor.field2707[n9] = true;
                arrobject[n8] = true;
                VorbisFloor.field2707[n5] = true;
                if (n10 >= n2 << 1) {
                    arrobject = field2705;
                    n2 = n3 > n4 ? n4 + (n10 - n4) : n3 + (n4 - n10) - 1;
                    arrobject[n5] = n2;
                    continue;
                }
                arrobject = field2705;
                n2 = (n10 & 1) != 0 ? n4 - (n10 + 1) / 2 : n10 / 2 + n4;
                arrobject[n5] = n2;
                continue;
            }
            VorbisFloor.field2707[n5] = false;
            VorbisFloor.field2705[n5] = n4;
        }
        this.VarbisFloor_sort(0, n6 - 1);
        n4 = field2705[0] * this.multiplier;
        n5 = 0;
        for (n2 = 1; n2 < n6; ++n2) {
            n7 = n5;
            n3 = n4;
            if (field2707[n2]) {
                n7 = field2703[n2];
                n3 = field2705[n2] * this.multiplier;
                this.method4829(n5, n4, n7, n3, arrf, n);
                if (n7 >= n) {
                    return;
                }
            }
            n5 = n7;
            n4 = n3;
        }
        float f = VorbisFloor_decibelStatics[n4];
        while (n5 < n) {
            arrf[n5] = arrf[n5] * f;
            ++n5;
        }
    }

    @ObfuscatedName(value="as")
    @Export(value="readSubmapFloor")
    boolean readSubmapFloor() {
        int n = VorbisSample.readBit() != 0 ? 1 : 0;
        if (n == 0) {
            return false;
        }
        for (int VorbisFloor.field2703[n] : this.field2710) {
        }
        n = class376.method13146(field2706[this.multiplier - 1] - 1, 65280);
        VorbisFloor.field2705[0] = VorbisSample.readBits(n);
        VorbisFloor.field2705[1] = VorbisSample.readBits(n);
        n = 2;
        for (int i = 0; i < this.partitionClassList.length; ++i) {
            int n2 = this.partitionClassList[i];
            int n3 = this.classDimensions[n2];
            int n4 = this.classSubClasses[n2];
            int n5 = n4 > 0 ? VorbisSample.VorbisSample_codebooks[this.classMasterbooks[n2]].method4838() : 0;
            int n6 = 0;
            int n7 = n5;
            n5 = n6;
            while (n5 < n3) {
                int n8 = this.subclassBooks[n2][n7 & (1 << n4) - 1];
                n6 = n7 >>> n4;
                int[] arrn = field2705;
                n7 = n8 >= 0 ? VorbisSample.VorbisSample_codebooks[n8].method4838() : 0;
                arrn[n] = n7;
                ++n5;
                ++n;
                n7 = n6;
            }
        }
        return true;
    }

    @ObfuscatedName(value="ai")
    int method4817(int n, int n2, int n3, int n4, int n5) {
        int n6 = n4 - n2;
        n4 = n6 < 0 ? -n6 : n6;
        n = (n5 - n) * n4 / (n3 - n);
        if (n6 < 0) {
            return n2 - n;
        }
        return n2 + n;
    }

    @ObfuscatedName(value="ax")
    void method4829(int n, int n2, int n3, int n4, float[] arrf, int n5) {
        int n6 = n4 - n2;
        int n7 = n3 - n;
        n4 = n6 < 0 ? -n6 : n6;
        int n8 = n6 / n7;
        int n9 = 0;
        n6 = n6 < 0 ? n8 - 1 : n8 + 1;
        int n10 = n8 < 0 ? -n8 : n8;
        arrf[n] = arrf[n] * VorbisFloor_decibelStatics[n2];
        int n11 = n9;
        int n12 = n;
        int n13 = n2;
        int n14 = n3;
        if (n3 > n5) {
            n14 = n5;
            n13 = n2;
            n12 = n;
            n11 = n9;
        }
        while (++n12 < n14) {
            n2 = n11 + (n4 - n10 * n7);
            if (n2 >= n7) {
                n2 -= n7;
                n = n13 + n6;
            } else {
                n = n13 + n8;
            }
            arrf[n12] = arrf[n12] * VorbisFloor_decibelStatics[n];
            n11 = n2;
            n13 = n;
        }
    }

    @ObfuscatedName(value="ae")
    static int method4809(int[] arrn, int n) {
        int n2 = arrn[n];
        int n3 = -1;
        int n4 = Integer.MAX_VALUE;
        int n5 = 0;
        while (true) {
            int n6;
            int n7;
            if (n5 < n) {
                int n8 = arrn[n5];
                n7 = n3;
                n6 = n4;
                if (n8 > n2) {
                    n7 = n3;
                    n6 = n4;
                    if (n8 < n4) {
                        n7 = n5;
                        n6 = n8;
                    }
                }
            } else {
                return n3;
            }
            ++n5;
            n3 = n7;
            n4 = n6;
        }
    }

    @ObfuscatedName(value="ak")
    static int method4811(int[] arrn, int n) {
        int n2 = arrn[n];
        int n3 = 0;
        int n4 = -1;
        int n5 = Integer.MIN_VALUE;
        while (true) {
            int n6;
            int n7;
            if (n3 < n) {
                int n8 = arrn[n3];
                n7 = n4;
                n6 = n5;
                if (n8 < n2) {
                    n7 = n4;
                    n6 = n5;
                    if (n8 > n5) {
                        n7 = n3;
                        n6 = n8;
                    }
                }
            } else {
                return n4;
            }
            ++n3;
            n4 = n7;
            n5 = n6;
        }
    }
}

