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

@ObfuscatedName(value="bl")
public class class265
extends Rasterizer3D {
    @ObfuscatedName(value="fg")
    @ObfuscatedSignature(descriptor="Loc;")
    static class399 field4640;
    @ObfuscatedName(value="ak")
    int[] field4641;

    public class265(int[] arrn, int n, int n2) {
        this.method7656(arrn, n, n2);
    }

    @ObfuscatedName(value="aa")
    final void method7638(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, byte by) {
        block91: {
            block92: {
                int n20;
                int n21;
                int n22;
                int n23;
                int n24;
                int n25;
                int n26;
                int n27;
                int n28;
                int[] arrn;
                int n29;
                block93: {
                    block95: {
                        block94: {
                            n29 = n;
                            int n30 = n2;
                            by = (byte)n3;
                            arrn = Rasterizer3D.field339.getTexturePixels(n19);
                            if (arrn == null) break block91;
                            this.field353 = Rasterizer3D.field339.vmethod7806(n19);
                            this.field356 = Rasterizer3D.field339.vmethod7795(n19);
                            n2 = n5 - n4;
                            n28 = n30 - n29;
                            n3 = n6 - n4;
                            n27 = by - n29;
                            n26 = n8 - n7;
                            n25 = n9 - n7;
                            n19 = n29 == n30 ? 0 : (n2 << 14) / n28;
                            n24 = n30 == by ? 0 : (n6 - n5 << 14) / (by - n30);
                            n = n29 == by ? 0 : (n4 - n6 << 14) / (n29 - by);
                            n23 = n27 * n2 - n3 * n28;
                            if (n23 == 0) {
                                return;
                            }
                            n28 = (n27 * n26 - n28 * n25 << 9) / n23;
                            n26 = (n25 * n2 - n3 * n26 << 9) / n23;
                            n2 = n10 - n11;
                            n3 = n13 - n14;
                            n17 = n16 - n17;
                            n22 = n12 - n10;
                            n14 = n13 * n22 - n10 * (n15 -= n13) << 14;
                            n25 = (int)(((long)(n15 * n16 - (n18 -= n16) * n13) << 3 << 14) / (long)this.field354);
                            n27 = (int)(((long)(n18 * n10 - n22 * n16) << 14) / (long)this.field354);
                            n12 = n13 * n2 - n3 * n10 << 14;
                            n23 = (int)(((long)(n3 * n16 - n13 * n17) << 3 << 14) / (long)this.field354);
                            n21 = (int)(((long)(n17 * n10 - n16 * n2) << 14) / (long)this.field354);
                            n11 = n3 * n22 - n15 * n2 << 14;
                            n20 = (int)(((long)(n17 * n15 - n18 * n3) << 3 << 14) / (long)this.field354);
                            n22 = (int)(((long)(n18 * n2 - n17 * n22) << 14) / (long)this.field354);
                            if (n29 > n30 || n29 > by) {
                                if (n30 > by) {
                                    if (by < this.field355) {
                                        n7 = n29;
                                        if (n29 > this.field355) {
                                            n7 = this.field355;
                                        }
                                        n8 = n30;
                                        if (n30 > this.field355) {
                                            n8 = this.field355;
                                        }
                                        n2 = n28 + ((n9 << 9) - n28 * n6);
                                        if (n7 < n8) {
                                            n3 = n6 << 14;
                                            if (by < 0) {
                                                n9 = 0;
                                                n5 = n2 - n26 * by;
                                                n6 = n3 - by * n;
                                                n3 -= n24 * by;
                                                by = (byte)n9;
                                            } else {
                                                n6 = n3;
                                                n5 = n2;
                                            }
                                            n2 = n4 << 14;
                                            if (n7 < 0) {
                                                n2 -= n19 * n7;
                                                n9 = 0;
                                            } else {
                                                n9 = n7;
                                            }
                                            n4 = n6;
                                            n7 = by - this.field357;
                                            n6 = n27 * n7 + n14;
                                            n10 = n21 * n7 + n12;
                                            n7 = n11 + n22 * n7;
                                            if (n24 >= n) {
                                                n18 = n8 - n9;
                                                n11 = n9 - by;
                                                n12 = this.field349[by];
                                                n9 = n4;
                                                n4 = n10;
                                                n8 = n3;
                                                n3 = n7;
                                                n7 = n12;
                                                while (true) {
                                                    by = (byte)(n11 - 1);
                                                    n10 = n7;
                                                    n11 = n3;
                                                    n13 = n2;
                                                    n16 = n8;
                                                    n14 = n5;
                                                    n17 = n18;
                                                    n12 = n4;
                                                    n15 = n6;
                                                    if (by < 0) {
                                                        while (true) {
                                                            if (--n17 < 0) {
                                                                return;
                                                            }
                                                            this.method7655(this.field4641, arrn, 0, 0, n10, n13 >> 14, n16 >> 14, n14, n28, n15, n12, n11, n25, n23, n20, -1384995377);
                                                            n16 = n24 + n16;
                                                            n13 += n19;
                                                            n14 = n26 + n14;
                                                            n10 += this.field346;
                                                            n15 = n27 + n15;
                                                            n12 = n21 + n12;
                                                            n11 += n22;
                                                        }
                                                    }
                                                    this.method7655(this.field4641, arrn, 0, 0, n7, n9 >> 14, n8 >> 14, n5, n28, n6, n4, n3, n25, n23, n20, -1233520184);
                                                    n8 = n24 + n8;
                                                    n9 += n;
                                                    n5 += n26;
                                                    n7 += this.field346;
                                                    n6 = n27 + n6;
                                                    n4 = n21 + n4;
                                                    n3 += n22;
                                                    n11 = by;
                                                }
                                            }
                                            n18 = n8 - n9;
                                            n11 = n9 - by;
                                            n12 = this.field349[by];
                                            n9 = n4;
                                            n4 = n10;
                                            n8 = n3;
                                            n3 = n7;
                                            n7 = n12;
                                            while (true) {
                                                by = (byte)(n11 - 1);
                                                n10 = n7;
                                                n11 = n3;
                                                n13 = n2;
                                                n16 = n8;
                                                n14 = n5;
                                                n17 = n18;
                                                n12 = n4;
                                                n15 = n6;
                                                if (by < 0) {
                                                    while (true) {
                                                        if (--n17 < 0) {
                                                            return;
                                                        }
                                                        this.method7655(this.field4641, arrn, 0, 0, n10, n16 >> 14, n13 >> 14, n14, n28, n15, n12, n11, n25, n23, n20, -1713485804);
                                                        n16 = n24 + n16;
                                                        n13 += n19;
                                                        n14 = n26 + n14;
                                                        n10 += this.field346;
                                                        n15 = n27 + n15;
                                                        n12 = n21 + n12;
                                                        n11 += n22;
                                                    }
                                                }
                                                this.method7655(this.field4641, arrn, 0, 0, n7, n8 >> 14, n9 >> 14, n5, n28, n6, n4, n3, n25, n23, n20, -1243055984);
                                                n8 = n24 + n8;
                                                n9 += n;
                                                n5 += n26;
                                                n7 += this.field346;
                                                n6 = n27 + n6;
                                                n4 = n21 + n4;
                                                n3 += n22;
                                                n11 = by;
                                            }
                                        }
                                        n4 = n6 << 14;
                                        if (by < 0) {
                                            n9 = 0;
                                            n6 = n2 - n26 * by;
                                            n3 = n4 - by * n;
                                            n4 -= n24 * by;
                                            by = (byte)n9;
                                        } else {
                                            n3 = n4;
                                            n6 = n2;
                                        }
                                        n2 = n5 << 14;
                                        if (n8 < 0) {
                                            n2 -= n19 * n8;
                                            n10 = 0;
                                        } else {
                                            n10 = n8;
                                        }
                                        n8 = by - this.field357;
                                        n9 = n14 + n27 * n8;
                                        n5 = n12 + n21 * n8;
                                        n8 = n11 + n22 * n8;
                                        if (n24 >= n) {
                                            n11 = n10 - by;
                                            n18 = n7 - n10;
                                            n10 = this.field349[by];
                                            n7 = n9;
                                            n9 = n11;
                                            n11 = n4;
                                            n4 = n3;
                                            n3 = n10;
                                            while (true) {
                                                by = (byte)(n9 - 1);
                                                n9 = n3;
                                                n13 = n4;
                                                n16 = n2;
                                                n14 = n6;
                                                n10 = n8;
                                                n12 = n5;
                                                n15 = n7;
                                                n17 = n18;
                                                if (by < 0) {
                                                    while (true) {
                                                        if (--n17 < 0) {
                                                            return;
                                                        }
                                                        this.method7655(this.field4641, arrn, 0, 0, n9, n13 >> 14, n16 >> 14, n14, n28, n15, n12, n10, n25, n23, n20, -1581440184);
                                                        n16 = n19 + n16;
                                                        n13 += n;
                                                        n14 = n26 + n14;
                                                        n2 = this.field346 * 191716777;
                                                        n9 = n2 * 1173526169 + n9;
                                                        n15 = n27 + n15;
                                                        n12 = n21 + n12;
                                                        n10 += n22;
                                                    }
                                                }
                                                this.method7655(this.field4641, arrn, 0, 0, n3, n4 >> 14, n11 >> 14, n6, n28, n7, n5, n8, n25, n23, n20, -538807501);
                                                n11 += n24;
                                                n4 += n;
                                                n6 = n26 + n6;
                                                n3 += this.field346;
                                                n7 = n27 + n7;
                                                n5 += n21;
                                                n8 = n22 + n8;
                                                n9 = by;
                                            }
                                        }
                                        n12 = n10 - by;
                                        n18 = n7 - n10;
                                        n11 = this.field349[by];
                                        n7 = n9;
                                        n10 = n12;
                                        n9 = n4;
                                        n4 = n3;
                                        n3 = n11;
                                        while (true) {
                                            by = (byte)(n10 - 1);
                                            n10 = n3;
                                            n12 = n4;
                                            n15 = n2;
                                            n13 = n6;
                                            n11 = n8;
                                            n14 = n5;
                                            n16 = n7;
                                            n17 = n18;
                                            if (by < 0) {
                                                while (true) {
                                                    if (--n17 < 0) {
                                                        return;
                                                    }
                                                    this.method7655(this.field4641, arrn, 0, 0, n10, n15 >> 14, n12 >> 14, n13, n28, n16, n14, n11, n25, n23, n20, -1855482165);
                                                    n15 = n19 + n15;
                                                    n12 += n;
                                                    n13 += n26;
                                                    n10 += this.field346;
                                                    n16 = n27 + n16;
                                                    n14 = n21 + n14;
                                                    n11 += n22;
                                                }
                                            }
                                            this.method7655(this.field4641, arrn, 0, 0, n3, n9 >> 14, n4 >> 14, n6, n28, n7, n5, n8, n25, n23, n20, -2132933415);
                                            n9 = n24 + n9;
                                            n4 += n;
                                            n6 = n26 + n6;
                                            n3 += this.field346;
                                            n7 = n27 + n7;
                                            n5 += n21;
                                            n8 = n22 + n8;
                                            n10 = by;
                                        }
                                    }
                                    return;
                                }
                                if (n30 < this.field355) {
                                    n7 = by;
                                    if (by > this.field355) {
                                        n7 = this.field355;
                                    }
                                    n2 = n29;
                                    if (n29 > this.field355) {
                                        n2 = this.field355;
                                    }
                                    n9 = n2;
                                    n8 = (n8 << 9) - n5 * n28 + n28;
                                    if (n7 < n9) {
                                        n3 = n5 << 14;
                                        if (n30 < 0) {
                                            n2 = 0;
                                            n4 = n8 - n30 * n26;
                                            n5 = n3 - n24 * n30;
                                            n3 -= n19 * n30;
                                            n30 = n2;
                                        } else {
                                            n4 = n8;
                                            n5 = n3;
                                        }
                                        n2 = n6 << 14;
                                        if (n7 < 0) {
                                            n2 -= n7 * n;
                                            n10 = 0;
                                        } else {
                                            n10 = n7;
                                        }
                                        n6 = n5;
                                        n5 = n30 - this.field357;
                                        n7 = n5 * n27 + n14;
                                        n8 = n5 * n21 + n12;
                                        n5 = n11 + n5 * n22;
                                        if (n10 != n30 && n19 < n24 || n10 == n30 && n19 > n) {
                                            n18 = n9 - n10;
                                            n10 -= n30;
                                            n11 = this.field349[n30];
                                            n9 = n6;
                                            n6 = n8;
                                            n8 = n11;
                                            while (true) {
                                                by = (byte)(n10 - 1);
                                                n10 = n8;
                                                n13 = n3;
                                                n14 = n4;
                                                n16 = n2;
                                                n17 = n18;
                                                n11 = n6;
                                                n15 = n7;
                                                n12 = n5;
                                                if (by < 0) {
                                                    while (true) {
                                                        if (--n17 < 0) {
                                                            return;
                                                        }
                                                        this.method7655(this.field4641, arrn, 0, 0, n10, n13 >> 14, n16 >> 14, n14, n28, n15, n11, n12, n25, n23, n20, -551387254);
                                                        n13 += n19;
                                                        n16 += n;
                                                        n14 = n26 + n14;
                                                        n10 += this.field346;
                                                        n15 = n27 + n15;
                                                        n11 += n21;
                                                        n12 = n22 + n12;
                                                    }
                                                }
                                                this.method7655(this.field4641, arrn, 0, 0, n8, n3 >> 14, n9 >> 14, n4, n28, n7, n6, n5, n25, n23, n20, -723899498);
                                                n3 += n19;
                                                n9 = n24 + n9;
                                                n4 = n26 + n4;
                                                n8 += this.field346;
                                                n7 = n27 + n7;
                                                n6 = n21 + n6;
                                                n5 += n22;
                                                n10 = by;
                                            }
                                        }
                                        n18 = n9 - n10;
                                        n10 -= n30;
                                        n11 = this.field349[n30];
                                        n9 = n6;
                                        n6 = n8;
                                        n8 = n11;
                                        while (true) {
                                            by = (byte)(n10 - 1);
                                            n10 = n8;
                                            n13 = n3;
                                            n14 = n4;
                                            n16 = n2;
                                            n17 = n18;
                                            n11 = n6;
                                            n15 = n7;
                                            n12 = n5;
                                            if (by < 0) {
                                                while (true) {
                                                    if (--n17 < 0) {
                                                        return;
                                                    }
                                                    this.method7655(this.field4641, arrn, 0, 0, n10, n16 >> 14, n13 >> 14, n14, n28, n15, n11, n12, n25, n23, n20, -1874455612);
                                                    n13 += n19;
                                                    n16 += n;
                                                    n14 = n26 + n14;
                                                    n10 += this.field346;
                                                    n15 = n27 + n15;
                                                    n11 += n21;
                                                    n12 = n22 + n12;
                                                }
                                            }
                                            this.method7655(this.field4641, arrn, 0, 0, n8, n9 >> 14, n3 >> 14, n4, n28, n7, n6, n5, n25, n23, n20, -841300171);
                                            n3 += n19;
                                            n9 = n24 + n9;
                                            n4 = n26 + n4;
                                            n8 += this.field346;
                                            n7 = n27 + n7;
                                            n6 = n21 + n6;
                                            n5 += n22;
                                            n10 = by;
                                        }
                                    }
                                    n3 = n5 << 14;
                                    if (n30 < 0) {
                                        n5 = n3 - n19 * n30;
                                        n3 -= n30 * n24;
                                        n8 -= n30 * n26;
                                        n30 = 0;
                                    } else {
                                        n5 = n3;
                                    }
                                    n2 = n4 << 14;
                                    if (n9 < 0) {
                                        n2 -= n9 * n;
                                        n4 = 0;
                                    } else {
                                        n4 = n9;
                                    }
                                    n10 = n30 - this.field357;
                                    n9 = n10 * n27 + n14;
                                    n6 = n10 * n21 + n12;
                                    n10 = n11 + n10 * n22;
                                    if (n19 >= n24) {
                                        n18 = n7 - n4;
                                        n12 = n4 - n30;
                                        n11 = this.field349[n30];
                                        n4 = n10;
                                        n7 = n9;
                                        n10 = n12;
                                        n9 = n5;
                                        n5 = n3;
                                        n3 = n11;
                                        while (true) {
                                            by = (byte)(n10 - 1);
                                            n10 = n3;
                                            n13 = n18;
                                            n14 = n2;
                                            n15 = n5;
                                            n11 = n6;
                                            n16 = n7;
                                            n17 = n8;
                                            n12 = n4;
                                            if (by < 0) {
                                                while (true) {
                                                    if (--n13 < 0) {
                                                        return;
                                                    }
                                                    this.method7655(this.field4641, arrn, 0, 0, n10, n15 >> 14, n14 >> 14, n17, n28, n16, n11, n12, n25, n23, n20, -1670671214);
                                                    n14 += n;
                                                    n15 = n24 + n15;
                                                    n17 += n26;
                                                    n10 += this.field346;
                                                    n16 = n27 + n16;
                                                    n11 += n21;
                                                    n12 = n22 + n12;
                                                }
                                            }
                                            this.method7655(this.field4641, arrn, 0, 0, n3, n5 >> 14, n9 >> 14, n8, n28, n7, n6, n4, n25, n23, n20, -1665404341);
                                            n9 = n19 + n9;
                                            n5 += n24;
                                            n8 = n26 + n8;
                                            n3 += this.field346;
                                            n7 = n27 + n7;
                                            n6 = n21 + n6;
                                            n4 = n22 + n4;
                                            n10 = by;
                                        }
                                    }
                                    n18 = n7 - n4;
                                    n12 = n4 - n30;
                                    n4 = n10;
                                    n11 = this.field349[n30];
                                    n7 = n9;
                                    n10 = n12;
                                    n9 = n5;
                                    n5 = n3;
                                    n3 = n11;
                                    while (true) {
                                        by = (byte)(n10 - 1);
                                        n10 = n3;
                                        n13 = n18;
                                        n14 = n2;
                                        n15 = n5;
                                        n11 = n6;
                                        n16 = n7;
                                        n17 = n8;
                                        n12 = n4;
                                        if (by < 0) {
                                            while (true) {
                                                if (--n13 < 0) {
                                                    return;
                                                }
                                                this.method7655(this.field4641, arrn, 0, 0, n10, n14 >> 14, n15 >> 14, n17, n28, n16, n11, n12, n25, n23, n20, -725483752);
                                                n14 += n;
                                                n15 = n24 + n15;
                                                n17 += n26;
                                                n10 += this.field346;
                                                n16 = n27 + n16;
                                                n11 += n21;
                                                n12 = n22 + n12;
                                            }
                                        }
                                        this.method7655(this.field4641, arrn, 0, 0, n3, n9 >> 14, n5 >> 14, n8, n28, n7, n6, n4, n25, n23, n20, -1230974638);
                                        n9 = n19 + n9;
                                        n5 += n24;
                                        n8 = n26 + n8;
                                        n3 += this.field346;
                                        n7 = n27 + n7;
                                        n6 = n21 + n6;
                                        n4 = n22 + n4;
                                        n10 = by;
                                    }
                                }
                                return;
                            }
                            if (n29 >= this.field355) break block92;
                            n2 = n30;
                            if (n30 > this.field355) {
                                n2 = this.field355;
                            }
                            n9 = n2;
                            n8 = by > this.field355 ? this.field355 : (int)by;
                            n2 = n28 + ((n7 << 9) - n28 * n4);
                            if (n9 >= n8) break block93;
                            n4 <<= 14;
                            if (n29 < 0) {
                                n6 = n4 - n19 * n29;
                                n2 -= n29 * n26;
                                n3 = n4 - n29 * n;
                                n29 = 0;
                                n4 = n6;
                                n6 = n2;
                            } else {
                                n3 = n4;
                                n6 = n2;
                            }
                            n2 = n5 <<= 14;
                            n7 = n9;
                            if (n9 < 0) {
                                n2 = n5 - n24 * n9;
                                n7 = 0;
                            }
                            n10 = n29 - this.field357;
                            n5 = n14 + n10 * n27;
                            n9 = n12 + n10 * n21;
                            n12 = n11 + n10 * n22;
                            if (n29 != n7 && n < n19) break block94;
                            n11 = n6;
                            n10 = n12;
                            n17 = n;
                            if (n29 != n7 || n17 <= n24) break block95;
                        }
                        n10 = n6;
                        n6 = n12;
                        n17 = n;
                        n12 = n7 - n29;
                        n18 = n8 - n7;
                        n11 = this.field349[n29];
                        n7 = n10;
                        n = n6;
                        n10 = n12;
                        n6 = n9;
                        n8 = n4;
                        n4 = n3;
                        n3 = n11;
                        while (true) {
                            by = (byte)(n10 - 1);
                            n9 = n3;
                            n12 = n4;
                            n13 = n2;
                            n10 = n6;
                            n14 = n5;
                            n11 = n;
                            n15 = n7;
                            n16 = n18;
                            if (by < 0) {
                                while (true) {
                                    if (--n16 < 0) {
                                        return;
                                    }
                                    this.method7655(this.field4641, arrn, 0, 0, n9, n12 >> 14, n13 >> 14, n15, n28, n14, n10, n11, n25, n23, n20, -1621204266);
                                    n12 = n17 + n12;
                                    n13 += n24;
                                    n15 = n26 + n15;
                                    n9 += this.field346;
                                    n14 = n27 + n14;
                                    n10 += n21;
                                    n11 += n22;
                                }
                            }
                            this.method7655(this.field4641, arrn, 0, 0, n3, n4 >> 14, n8 >> 14, n7, n28, n5, n6, n, n25, n23, n20, -787693242);
                            n4 = n17 + n4;
                            n8 = n19 + n8;
                            n7 = n26 + n7;
                            n3 += this.field346;
                            n5 += n27;
                            n6 = n21 + n6;
                            n = n22 + n;
                            n10 = by;
                        }
                    }
                    n6 = n7 - n29;
                    n18 = n8 - n7;
                    n12 = this.field349[n29];
                    n7 = n11;
                    n = n10;
                    n10 = n6;
                    n6 = n9;
                    n8 = n4;
                    n4 = n3;
                    n3 = n12;
                    while (true) {
                        by = (byte)(n10 - 1);
                        n9 = n3;
                        n12 = n4;
                        n13 = n2;
                        n10 = n6;
                        n14 = n5;
                        n11 = n;
                        n15 = n7;
                        n16 = n18;
                        if (by < 0) {
                            while (true) {
                                if (--n16 < 0) {
                                    return;
                                }
                                this.method7655(this.field4641, arrn, 0, 0, n9, n13 >> 14, n12 >> 14, n15, n28, n14, n10, n11, n25, n23, n20, -807908191);
                                n12 = n17 + n12;
                                n13 += n24;
                                n15 = n26 + n15;
                                n9 += this.field346;
                                n14 = n27 + n14;
                                n10 += n21;
                                n11 += n22;
                            }
                        }
                        this.method7655(this.field4641, arrn, 0, 0, n3, n8 >> 14, n4 >> 14, n7, n28, n5, n6, n, n25, n23, n20, -331586157);
                        n4 = n17 + n4;
                        n8 = n19 + n8;
                        n7 = n26 + n7;
                        n3 += this.field346;
                        n5 += n27;
                        n6 = n21 + n6;
                        n = n22 + n;
                        n10 = by;
                    }
                }
                n4 <<= 14;
                if (n29 < 0) {
                    n3 = n4 - n29 * n;
                    n4 -= n19 * n29;
                    n7 = n2 - n29 * n26;
                    n5 = 0;
                    n2 = n3;
                    n3 = n7;
                } else {
                    n3 = n2;
                    n2 = n4;
                    n5 = n29;
                }
                n17 = n;
                n = n6 << 14;
                if (n8 < 0) {
                    n -= n24 * n8;
                    n10 = 0;
                } else {
                    n10 = n8;
                }
                n6 = n4;
                n7 = n5 - this.field357;
                n4 = n27 * n7 + n14;
                n8 = n21 * n7 + n12;
                n7 = n11 + n22 * n7;
                if (n5 != n10 && n17 < n19 || n5 == n10 && n24 > n19) {
                    n18 = n9 - n10;
                    n9 = n10 - n5;
                    n10 = this.field349[n5];
                    n5 = n3;
                    n3 = n8;
                    n8 = n2;
                    n2 = n7;
                    n7 = n10;
                    while (true) {
                        by = (byte)(n9 - 1);
                        n9 = n7;
                        n10 = n2;
                        n12 = n;
                        n11 = n3;
                        n15 = n18;
                        n14 = n5;
                        n13 = n4;
                        n16 = n6;
                        if (by < 0) {
                            while (true) {
                                if (--n15 < 0) {
                                    return;
                                }
                                this.method7655(this.field4641, arrn, 0, 0, n9, n12 >> 14, n16 >> 14, n14, n28, n13, n11, n10, n25, n23, n20, -608560990);
                                n12 = n24 + n12;
                                n16 = n19 + n16;
                                n14 = n26 + n14;
                                n9 += this.field346;
                                n13 += n27;
                                n11 += n21;
                                n10 += n22;
                            }
                        }
                        this.method7655(this.field4641, arrn, 0, 0, n7, n8 >> 14, n6 >> 14, n5, n28, n4, n3, n2, n25, n23, n20, -946793946);
                        n8 = n17 + n8;
                        n6 = n19 + n6;
                        n5 += n26;
                        n7 += this.field346;
                        n4 = n27 + n4;
                        n3 += n21;
                        n2 = n22 + n2;
                        n9 = by;
                    }
                }
                n18 = n9 - n10;
                n9 = n10 - n5;
                n10 = this.field349[n5];
                n5 = n3;
                n3 = n8;
                n8 = n2;
                n2 = n7;
                n7 = n10;
                while (true) {
                    by = (byte)(n9 - 1);
                    n9 = n7;
                    n10 = n2;
                    n12 = n;
                    n11 = n3;
                    n15 = n18;
                    n14 = n5;
                    n13 = n4;
                    n16 = n6;
                    if (by < 0) {
                        while (true) {
                            if (--n15 < 0) {
                                return;
                            }
                            this.method7655(this.field4641, arrn, 0, 0, n9, n16 >> 14, n12 >> 14, n14, n28, n13, n11, n10, n25, n23, n20, -800953334);
                            n12 = n24 + n12;
                            n16 = n19 + n16;
                            n14 = n26 + n14;
                            n9 += this.field346;
                            n13 += n27;
                            n11 += n21;
                            n10 += n22;
                        }
                    }
                    this.method7655(this.field4641, arrn, 0, 0, n7, n6 >> 14, n8 >> 14, n5, n28, n4, n3, n2, n25, n23, n20, -716615361);
                    n8 = n17 + n8;
                    n6 = n19 + n6;
                    n5 += n26;
                    n7 += this.field346;
                    n4 = n27 + n4;
                    n3 += n21;
                    n2 = n22 + n2;
                    n9 = by;
                }
            }
            return;
        }
        n10 = Rasterizer3D.field339.getAverageTextureRGB(n19);
        this.method7644(n, n2, n3, n4, n5, n6, class82.method4599(n10, n7, (byte)0), class82.method4599(n10, n8, (byte)0), class82.method4599(n10, n9, (byte)0), -1376205304);
    }

    @ObfuscatedName(value="ah")
    final void method7644(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = n5 - n4;
        int n12 = n2 - n;
        int n13 = n6 - n4;
        int n14 = n3 - n;
        int n15 = n8 - n7;
        int n16 = n9 - n7;
        n10 = n3 == n2 ? 0 : (n6 - n5 << 14) / (n3 - n2);
        int n17 = n2 == n ? 0 : (n11 << 14) / n12;
        int n18 = n3 == n ? 0 : (n13 << 14) / n14;
        int n19 = n14 * n11 - n12 * n13;
        if (n19 == 0) {
            return;
        }
        n12 = (n14 * n15 - n12 * n16 << 8) / n19;
        n16 = (n16 * n11 - n13 * n15 << 8) / n19;
        if (n > n2 || n > n3) {
            if (n2 > n3) {
                if (n3 < this.field355) {
                    n7 = n;
                    if (n > this.field355) {
                        n7 = this.field355;
                    }
                    n = n2;
                    if (n2 > this.field355) {
                        n = this.field355;
                    }
                    n8 = n;
                    n2 = n12 + ((n9 << 8) - n12 * n6);
                    if (n7 < n8) {
                        n5 = n6 << 14;
                        if (n3 < 0) {
                            n2 -= n3 * n16;
                            n = 0;
                            n6 = n5 - n3 * n18;
                            n5 -= n3 * n10;
                            n3 = n;
                        } else {
                            n6 = n5;
                        }
                        n9 = n4 << 14;
                        n4 = n7;
                        n = n9;
                        if (n7 < 0) {
                            n = n9 - n17 * n7;
                            n4 = 0;
                        }
                        if (n10 < n18) {
                            n13 = n8 - n4;
                            n4 -= n3;
                        } else {
                            n13 = n8 - n4;
                            n4 -= n3;
                            n3 = this.field349[n3];
                            while (true) {
                                n15 = n4 - 1;
                                n4 = n2;
                                n7 = n3;
                                n8 = n;
                                n9 = n5;
                                n11 = n13;
                                if (n15 < 0) {
                                    while (true) {
                                        if (--n11 < 0) {
                                            return;
                                        }
                                        this.method7651(this.field4641, n7, 0, 0, n8 >> 14, n9 >> 14, n4, n12, (byte)-23);
                                        n9 = n10 + n9;
                                        n8 = n17 + n8;
                                        n4 = n16 + n4;
                                        n7 += this.field346;
                                    }
                                }
                                this.method7651(this.field4641, n3, 0, 0, n6 >> 14, n5 >> 14, n2, n12, (byte)-34);
                                n5 += n10;
                                n6 = n18 + n6;
                                n2 = n16 + n2;
                                n3 += this.field346;
                                n4 = n15;
                            }
                        }
                        n3 = this.field349[n3];
                        while (true) {
                            n15 = n4 - 1;
                            n4 = n2;
                            n7 = n3;
                            n8 = n;
                            n9 = n5;
                            n11 = n13;
                            if (n15 < 0) {
                                while (true) {
                                    if (--n11 < 0) {
                                        return;
                                    }
                                    this.method7651(this.field4641, n7, 0, 0, n9 >> 14, n8 >> 14, n4, n12, (byte)13);
                                    n9 = n10 + n9;
                                    n8 = n17 + n8;
                                    n4 = n16 + n4;
                                    n7 += this.field346;
                                }
                            }
                            this.method7651(this.field4641, n3, 0, 0, n5 >> 14, n6 >> 14, n2, n12, (byte)-35);
                            n5 += n10;
                            n6 = n18 + n6;
                            n2 = n16 + n2;
                            n3 += this.field346;
                            n4 = n15;
                        }
                    }
                    n4 = n6 << 14;
                    if (n3 < 0) {
                        n6 = n4 - n3 * n10;
                        n4 -= n3 * n18;
                        n2 -= n3 * n16;
                        n3 = 0;
                    } else {
                        n6 = n4;
                    }
                    n = n9 = n5 << 14;
                    n5 = n8;
                    if (n8 < 0) {
                        n = n9 - n17 * n8;
                        n5 = 0;
                    }
                    if (n10 < n18) {
                        n13 = n7 - n5;
                        n5 -= n3;
                    } else {
                        n13 = n7 - n5;
                        n5 -= n3;
                        n3 = this.field349[n3];
                        while (true) {
                            n15 = n5 - 1;
                            n7 = n13;
                            n8 = n2;
                            n5 = n3;
                            n9 = n4;
                            n11 = n;
                            if (n15 < 0) {
                                while (true) {
                                    if (--n7 < 0) {
                                        return;
                                    }
                                    this.method7651(this.field4641, n5, 0, 0, n9 >> 14, n11 >> 14, n8, n12, (byte)-65);
                                    n11 += n17;
                                    n9 = n18 + n9;
                                    n8 = n16 + n8;
                                    n = this.field346 * 191716777;
                                    n5 += n * 1173526169;
                                }
                            }
                            this.method7651(this.field4641, n3, 0, 0, n4 >> 14, n6 >> 14, n2, n12, (byte)31);
                            n6 = n10 + n6;
                            n4 = n18 + n4;
                            n2 = n16 + n2;
                            n3 += this.field346;
                            n5 = n15;
                        }
                    }
                    n3 = this.field349[n3];
                    while (true) {
                        n15 = n5 - 1;
                        n5 = n13;
                        n7 = n2;
                        n8 = n3;
                        n9 = n4;
                        n11 = n;
                        if (n15 < 0) {
                            while (true) {
                                if (--n5 < 0) {
                                    return;
                                }
                                this.method7651(this.field4641, n8, 0, 0, n11 >> 14, n9 >> 14, n7, n12, (byte)-9);
                                n11 += n17;
                                n9 = n18 + n9;
                                n7 = n16 + n7;
                                n8 += this.field346;
                            }
                        }
                        this.method7651(this.field4641, n3, 0, 0, n6 >> 14, n4 >> 14, n2, n12, (byte)35);
                        n6 = n10 + n6;
                        n4 = n18 + n4;
                        n2 = n16 + n2;
                        n3 += this.field346;
                        n5 = n15;
                    }
                }
                return;
            }
            if (n2 < this.field355) {
                n7 = n3;
                if (n3 > this.field355) {
                    n7 = this.field355;
                }
                n3 = n;
                if (n > this.field355) {
                    n3 = this.field355;
                }
                n9 = n3;
                n = n12 + ((n8 << 8) - n5 * n12);
                if (n7 < n9) {
                    n3 = n5 << 14;
                    if (n2 < 0) {
                        n4 = n3 - n17 * n2;
                        n3 -= n10 * n2;
                        n2 = n - n16 * n2;
                        n5 = 0;
                    } else {
                        n4 = n3;
                        n5 = n2;
                        n2 = n;
                    }
                    n8 = n6 << 14;
                    n6 = n7;
                    n = n8;
                    if (n7 < 0) {
                        n = n8 - n18 * n7;
                        n6 = 0;
                    }
                    if (n5 != n6 && n17 < n10 || n5 == n6 && n17 > n18) {
                        n13 = n9 - n6;
                        n6 -= n5;
                        n7 = this.field349[n5];
                        n5 = n3;
                        n3 = n7;
                        while (true) {
                            n15 = n6 - 1;
                            n6 = n2;
                            n7 = n3;
                            n8 = n4;
                            n9 = n;
                            n11 = n13;
                            if (n15 < 0) {
                                while (true) {
                                    if (--n11 < 0) {
                                        return;
                                    }
                                    this.method7651(this.field4641, n7, 0, 0, n8 >> 14, n9 >> 14, n6, n12, (byte)70);
                                    n8 = n17 + n8;
                                    n9 = n18 + n9;
                                    n6 = n16 + n6;
                                    n7 += this.field346;
                                }
                            }
                            this.method7651(this.field4641, n3, 0, 0, n4 >> 14, n5 >> 14, n2, n12, (byte)55);
                            n4 = n17 + n4;
                            n5 += n10;
                            n2 = n16 + n2;
                            n3 += this.field346;
                            n6 = n15;
                        }
                    }
                    n13 = n9 - n6;
                    n6 -= n5;
                    n7 = this.field349[n5];
                    n5 = n3;
                    n3 = n7;
                    while (true) {
                        n15 = n6 - 1;
                        n6 = n2;
                        n7 = n3;
                        n8 = n4;
                        n9 = n;
                        n11 = n13;
                        if (n15 < 0) {
                            while (true) {
                                if (--n11 < 0) {
                                    return;
                                }
                                this.method7651(this.field4641, n7, 0, 0, n9 >> 14, n8 >> 14, n6, n12, (byte)-30);
                                n8 = n17 + n8;
                                n9 = n18 + n9;
                                n6 = n16 + n6;
                                n7 += this.field346;
                            }
                        }
                        this.method7651(this.field4641, n3, 0, 0, n5 >> 14, n4 >> 14, n2, n12, (byte)11);
                        n4 = n17 + n4;
                        n5 += n10;
                        n2 = n16 + n2;
                        n3 += this.field346;
                        n6 = n15;
                    }
                }
                n3 = n5 << 14;
                if (n2 < 0) {
                    n5 = n3 - n17 * n2;
                    n3 -= n10 * n2;
                    n2 = n - n16 * n2;
                    n6 = 0;
                } else {
                    n5 = n3;
                    n6 = n2;
                    n2 = n;
                }
                n = n8 = n4 << 14;
                n4 = n9;
                if (n9 < 0) {
                    n = n8 - n18 * n9;
                    n4 = 0;
                }
                if (n17 < n10) {
                    n13 = n7 - n4;
                    n4 -= n6;
                } else {
                    n13 = n7 - n4;
                    n4 -= n6;
                    n7 = this.field349[n6];
                    n6 = n4;
                    n4 = n3;
                    n3 = n7;
                    while (true) {
                        n15 = n6 - 1;
                        n6 = n2;
                        n7 = n3;
                        n8 = n13;
                        n9 = n;
                        n11 = n4;
                        if (n15 < 0) {
                            while (true) {
                                if (--n8 < 0) {
                                    return;
                                }
                                this.method7651(this.field4641, n7, 0, 0, n11 >> 14, n9 >> 14, n6, n12, (byte)91);
                                n9 = n18 + n9;
                                n11 = n10 + n11;
                                n6 = n16 + n6;
                                n7 += this.field346;
                            }
                        }
                        this.method7651(this.field4641, n3, 0, 0, n4 >> 14, n5 >> 14, n2, n12, (byte)-17);
                        n5 += n17;
                        n4 = n10 + n4;
                        n2 = n16 + n2;
                        n3 += this.field346;
                        n6 = n15;
                    }
                }
                n7 = this.field349[n6];
                n6 = n4;
                n4 = n3;
                n3 = n7;
                while (true) {
                    n15 = n6 - 1;
                    n6 = n2;
                    n7 = n3;
                    n8 = n13;
                    n9 = n;
                    n11 = n4;
                    if (n15 < 0) {
                        while (true) {
                            if (--n8 < 0) {
                                return;
                            }
                            this.method7651(this.field4641, n7, 0, 0, n9 >> 14, n11 >> 14, n6, n12, (byte)43);
                            n9 = n18 + n9;
                            n11 = n10 + n11;
                            n6 = n16 + n6;
                            n7 += this.field346;
                        }
                    }
                    this.method7651(this.field4641, n3, 0, 0, n5 >> 14, n4 >> 14, n2, n12, (byte)70);
                    n5 += n17;
                    n4 = n10 + n4;
                    n2 = n16 + n2;
                    n3 += this.field346;
                    n6 = n15;
                }
            }
            return;
        }
        if (n < this.field355) {
            n8 = n2;
            if (n2 > this.field355) {
                n8 = this.field355;
            }
            n9 = n3;
            if (n3 > this.field355) {
                n9 = this.field355;
            }
            n3 = n12 + ((n7 << 8) - n12 * n4);
            if (n8 < n9) {
                n2 = n4 << 14;
                if (n < 0) {
                    n4 = n2 - n18 * n;
                    n2 -= n17 * n;
                    n3 -= n16 * n;
                    n6 = 0;
                } else {
                    n4 = n2;
                    n6 = n;
                }
                n7 = n5 << 14;
                n5 = n8;
                n = n7;
                if (n8 < 0) {
                    n = n7 - n10 * n8;
                    n5 = 0;
                }
                if (n5 != n6 && n18 < n17 || n5 == n6 && n18 > n10) {
                    n13 = n9 - n5;
                    n7 = n5 - n6;
                    n8 = this.field349[n6];
                    n5 = n2;
                    n6 = n7;
                    n2 = n8;
                    while (true) {
                        n15 = n6 - 1;
                        n6 = n2;
                        n7 = n13;
                        n8 = n;
                        n9 = n3;
                        n11 = n4;
                        if (n15 < 0) {
                            while (true) {
                                if (--n7 < 0) {
                                    return;
                                }
                                this.method7651(this.field4641, n6, 0, 0, n11 >> 14, n8 >> 14, n9, n12, (byte)90);
                                n11 += n18;
                                n8 = n10 + n8;
                                n9 = n16 + n9;
                                n6 = this.field346 + n6;
                            }
                        }
                        this.method7651(this.field4641, n2, 0, 0, n4 >> 14, n5 >> 14, n3, n12, (byte)20);
                        n4 = n18 + n4;
                        n5 += n17;
                        n3 += n16;
                        n2 += this.field346;
                        n6 = n15;
                    }
                }
                n13 = n9 - n5;
                n7 = n5 - n6;
                n8 = this.field349[n6];
                n5 = n2;
                n6 = n7;
                n2 = n8;
                while (true) {
                    n15 = n6 - 1;
                    n6 = n2;
                    n7 = n13;
                    n8 = n;
                    n9 = n3;
                    n11 = n4;
                    if (n15 < 0) {
                        while (true) {
                            if (--n7 < 0) {
                                return;
                            }
                            this.method7651(this.field4641, n6, 0, 0, n8 >> 14, n11 >> 14, n9, n12, (byte)-14);
                            n11 += n18;
                            n8 = n10 + n8;
                            n9 = n16 + n9;
                            n6 = this.field346 + n6;
                        }
                    }
                    this.method7651(this.field4641, n2, 0, 0, n5 >> 14, n4 >> 14, n3, n12, (byte)105);
                    n4 = n18 + n4;
                    n5 += n17;
                    n3 += n16;
                    n2 += this.field346;
                    n6 = n15;
                }
            }
            n2 = n4 << 14;
            if (n < 0) {
                n4 = n2 - n18 * n;
                n2 -= n17 * n;
                n = n3 - n16 * n;
                n5 = 0;
                n3 = n4;
                n4 = n;
            } else {
                n5 = n2;
                n4 = n3;
                n3 = n5;
                n5 = n;
            }
            n7 = n6 << 14;
            n6 = n9;
            n = n7;
            if (n9 < 0) {
                n = n7 - n10 * n9;
                n6 = 0;
            }
            if (n5 != n6 && n18 < n17 || n5 == n6 && n10 > n17) {
                n13 = n8 - n6;
                n6 -= n5;
                n7 = this.field349[n5];
                n5 = n3;
                n3 = n7;
                while (true) {
                    n15 = n6 - 1;
                    n6 = n3;
                    n7 = n13;
                    n8 = n2;
                    n11 = n;
                    n9 = n4;
                    if (n15 < 0) {
                        while (true) {
                            if (--n7 < 0) {
                                return;
                            }
                            this.method7651(this.field4641, n6, 0, 0, n11 >> 14, n8 >> 14, n9, n12, (byte)50);
                            n11 = n10 + n11;
                            n8 = n17 + n8;
                            n9 = n16 + n9;
                            n6 = this.field346 + n6;
                        }
                    }
                    this.method7651(this.field4641, n3, 0, 0, n5 >> 14, n2 >> 14, n4, n12, (byte)-60);
                    n5 += n18;
                    n2 = n17 + n2;
                    n4 = n16 + n4;
                    n3 += this.field346;
                    n6 = n15;
                }
            }
            n13 = n8 - n6;
            n6 -= n5;
            n7 = this.field349[n5];
            n5 = n3;
            n3 = n7;
            while (true) {
                n15 = n6 - 1;
                n6 = n3;
                n7 = n13;
                n8 = n2;
                n11 = n;
                n9 = n4;
                if (n15 < 0) {
                    while (true) {
                        if (--n7 < 0) {
                            return;
                        }
                        this.method7651(this.field4641, n6, 0, 0, n8 >> 14, n11 >> 14, n9, n12, (byte)2);
                        n11 = n10 + n11;
                        n8 = n17 + n8;
                        n9 = n16 + n9;
                        n6 = this.field346 + n6;
                    }
                }
                this.method7651(this.field4641, n3, 0, 0, n2 >> 14, n5 >> 14, n4, n12, (byte)-17);
                n5 += n18;
                n2 = n17 + n2;
                n4 = n16 + n4;
                n3 += this.field346;
                n6 = n15;
            }
        }
    }

    @ObfuscatedName(value="aj")
    public final void method7645(int n, int n2, int n3, int n4, int n5, int n6, int n7, byte by) {
        int n8 = n2 == n ? 0 : (n5 - n4 << 14) / (n2 - n);
        int n9 = n3 == n2 ? 0 : (n6 - n5 << 14) / (n3 - n2);
        int n10 = n3 == n ? 0 : (n4 - n6 << 14) / (n - n3);
        if (n > n2 || n > n3) {
            if (n2 > n3) {
                if (n3 < this.field355) {
                    by = (byte)n;
                    if (n > this.field355) {
                        by = (byte)this.field355;
                    }
                    int n11 = n2;
                    if (n2 > this.field355) {
                        n11 = this.field355;
                    }
                    if (by < n11) {
                        n5 = n6 << 14;
                        if (n3 < 0) {
                            n = 0;
                            n2 = n5 - n3 * n10;
                            n5 -= n3 * n9;
                            n3 = n;
                        } else {
                            n2 = n5;
                        }
                        n = n4 << 14;
                        if (by < 0) {
                            n -= n8 * by;
                            by = 0;
                        }
                        if (n9 >= n10) {
                            int n12 = n11 - by;
                            n6 = by - n3;
                            by = (byte)this.field349[n3];
                            n3 = n5;
                            n4 = n2;
                            n2 = by;
                            n5 = n6;
                            while (true) {
                                int n13 = n5 - 1;
                                n5 = n;
                                by = (byte)n12;
                                n6 = n2;
                                n11 = n3;
                                if (n13 < 0) {
                                    while (true) {
                                        if ((by = (byte)(by - 1)) < 0) {
                                            return;
                                        }
                                        this.method7647(this.field4641, n6, n7, 0, n5 >> 14, n11 >> 14, 676616392);
                                        n11 += n9;
                                        n5 += n8;
                                        n6 = this.field346 + n6;
                                    }
                                }
                                this.method7647(this.field4641, n2, n7, 0, n4 >> 14, n3 >> 14, 676616392);
                                n3 += n9;
                                n4 = n10 + n4;
                                n2 += this.field346;
                                n5 = n13;
                            }
                        }
                        int n14 = n11 - by;
                        n6 = by - n3;
                        by = (byte)this.field349[n3];
                        n3 = n5;
                        n4 = n2;
                        n2 = by;
                        n5 = n6;
                        while (true) {
                            int n15 = n5 - 1;
                            n5 = n;
                            by = (byte)n14;
                            n6 = n2;
                            n11 = n3;
                            if (n15 < 0) {
                                while (true) {
                                    if ((by = (byte)(by - 1)) < 0) {
                                        return;
                                    }
                                    this.method7647(this.field4641, n6, n7, 0, n11 >> 14, n5 >> 14, 676616392);
                                    n11 += n9;
                                    n5 += n8;
                                    n6 = this.field346 + n6;
                                }
                            }
                            this.method7647(this.field4641, n2, n7, 0, n3 >> 14, n4 >> 14, 676616392);
                            n3 += n9;
                            n4 = n10 + n4;
                            n2 += this.field346;
                            n5 = n15;
                        }
                    }
                    n4 = n6 << 14;
                    if (n3 < 0) {
                        n = 0;
                        n2 = n4 - n3 * n10;
                        n4 -= n3 * n9;
                        n3 = n;
                    } else {
                        n2 = n4;
                    }
                    n = n5 << 14;
                    if (n11 < 0) {
                        n -= n11 * n8;
                        n11 = 0;
                    }
                    if (n9 >= n10) {
                        int n16 = by - n11;
                        n5 = n11 - n3;
                        n6 = this.field349[n3];
                        n3 = n2;
                        n2 = n6;
                        while (true) {
                            int n17 = n5 - 1;
                            n6 = n16;
                            by = (byte)n;
                            n5 = n2;
                            n11 = n3;
                            if (n17 < 0) {
                                while (true) {
                                    if (--n6 < 0) {
                                        return;
                                    }
                                    this.method7647(this.field4641, n5, n7, 0, n11 >> 14, by >> 14, 676616392);
                                    by = (byte)(n8 + by);
                                    n11 += n10;
                                    n = this.field346 * 191716777;
                                    n5 += n * 1173526169;
                                }
                            }
                            this.method7647(this.field4641, n2, n7, 0, n3 >> 14, n4 >> 14, 676616392);
                            n4 = n9 + n4;
                            n3 += n10;
                            n2 += this.field346;
                            n5 = n17;
                        }
                    }
                    int n18 = by - n11;
                    n5 = n11 - n3;
                    n3 = this.field349[n3];
                    while (true) {
                        int n19 = n5 - 1;
                        n5 = n18;
                        n6 = n;
                        by = (byte)n3;
                        n11 = n2;
                        if (n19 < 0) {
                            while (true) {
                                if (--n5 < 0) {
                                    return;
                                }
                                this.method7647(this.field4641, by, n7, 0, n6 >> 14, n11 >> 14, 676616392);
                                n6 = n8 + n6;
                                n11 += n10;
                                by = (byte)(by + this.field346);
                            }
                        }
                        this.method7647(this.field4641, n3, n7, 0, n4 >> 14, n2 >> 14, 676616392);
                        n4 = n9 + n4;
                        n2 = n10 + n2;
                        n3 += this.field346;
                        n5 = n19;
                    }
                }
                return;
            }
            if (n2 < this.field355) {
                by = (byte)n3;
                if (n3 > this.field355) {
                    by = (byte)this.field355;
                }
                int n20 = n;
                if (n > this.field355) {
                    n20 = this.field355;
                }
                if (by < n20) {
                    n4 = n5 << 14;
                    if (n2 < 0) {
                        n = 0;
                        n3 = n4 - n9 * n2;
                        n4 -= n8 * n2;
                        n2 = n;
                    } else {
                        n3 = n4;
                    }
                    n = n6 << 14;
                    if (by < 0) {
                        n -= n10 * by;
                        by = 0;
                    }
                    if (by != n2 && n8 < n9 || by == n2 && n8 > n10) {
                        int n21 = n20 - by;
                        n5 = by - n2;
                        n6 = this.field349[n2];
                        n2 = n4;
                        n4 = n3;
                        n3 = n2;
                        n2 = n6;
                        while (true) {
                            int n22 = n5 - 1;
                            n5 = n21;
                            n6 = n;
                            by = (byte)n2;
                            n20 = n3;
                            if (n22 < 0) {
                                while (true) {
                                    if (--n5 < 0) {
                                        return;
                                    }
                                    this.method7647(this.field4641, by, n7, 0, n20 >> 14, n6 >> 14, 676616392);
                                    n20 += n8;
                                    n6 = n10 + n6;
                                    by = (byte)(by + this.field346);
                                }
                            }
                            this.method7647(this.field4641, n2, n7, 0, n3 >> 14, n4 >> 14, 676616392);
                            n3 += n8;
                            n4 = n9 + n4;
                            n2 += this.field346;
                            n5 = n22;
                        }
                    }
                    int n23 = n20 - by;
                    n5 = by - n2;
                    n6 = this.field349[n2];
                    n2 = n3;
                    n3 = n4;
                    n4 = n2;
                    n2 = n6;
                    while (true) {
                        int n24 = n5 - 1;
                        n5 = n23;
                        n6 = n;
                        by = (byte)n2;
                        n20 = n3;
                        if (n24 < 0) {
                            while (true) {
                                if (--n5 < 0) {
                                    return;
                                }
                                this.method7647(this.field4641, by, n7, 0, n6 >> 14, n20 >> 14, 676616392);
                                n20 += n8;
                                n6 = n10 + n6;
                                by = (byte)(by + this.field346);
                            }
                        }
                        this.method7647(this.field4641, n2, n7, 0, n4 >> 14, n3 >> 14, 676616392);
                        n3 += n8;
                        n4 = n9 + n4;
                        n2 += this.field346;
                        n5 = n24;
                    }
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n3 = n5 - n8 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                } else {
                    n3 = n5;
                }
                n = n4 << 14;
                if (n20 < 0) {
                    n -= n20 * n10;
                    n20 = 0;
                }
                if (n8 >= n9) {
                    int n25 = by - n20;
                    n6 = n20 - n2;
                    n2 = this.field349[n2];
                    n4 = n3;
                    n3 = n5;
                    n5 = n6;
                    while (true) {
                        int n26 = n5 - 1;
                        n5 = n;
                        by = (byte)n25;
                        n6 = n2;
                        n20 = n3;
                        if (n26 < 0) {
                            while (true) {
                                if ((by = (byte)(by - 1)) < 0) {
                                    return;
                                }
                                this.method7647(this.field4641, n6, n7, 0, n20 >> 14, n5 >> 14, 676616392);
                                n5 += n10;
                                n20 += n9;
                                n6 = this.field346 + n6;
                            }
                        }
                        this.method7647(this.field4641, n2, n7, 0, n3 >> 14, n4 >> 14, 676616392);
                        n4 = n8 + n4;
                        n3 += n9;
                        n2 += this.field346;
                        n5 = n26;
                    }
                }
                int n27 = by - n20;
                n6 = n20 - n2;
                by = (byte)this.field349[n2];
                n2 = n5;
                n4 = n3;
                n3 = by;
                n5 = n6;
                while (true) {
                    int n28 = n5 - 1;
                    n5 = n;
                    by = (byte)n27;
                    n6 = n3;
                    n20 = n2;
                    if (n28 < 0) {
                        while (true) {
                            if ((by = (byte)(by - 1)) < 0) {
                                return;
                            }
                            this.method7647(this.field4641, n6, n7, 0, n5 >> 14, n20 >> 14, 676616392);
                            n5 += n10;
                            n20 += n9;
                            n6 = this.field346 + n6;
                        }
                    }
                    this.method7647(this.field4641, n3, n7, 0, n4 >> 14, n2 >> 14, 676616392);
                    n4 = n8 + n4;
                    n2 = n9 + n2;
                    n3 += this.field346;
                    n5 = n28;
                }
            }
            return;
        }
        if (n < this.field355) {
            by = (byte)n2;
            if (n2 > this.field355) {
                by = (byte)this.field355;
            }
            int n29 = n3;
            if (n3 > this.field355) {
                n29 = this.field355;
            }
            if (by < n29) {
                n3 = n4 << 14;
                if (n < 0) {
                    n2 = n3 - n10 * n;
                    n3 -= n8 * n;
                    n4 = 0;
                } else {
                    n2 = n3;
                    n4 = n;
                }
                n = n5 << 14;
                if (by < 0) {
                    n -= n9 * by;
                    by = 0;
                }
                if (by != n4 && n10 < n8 || by == n4 && n10 > n9) {
                    int n30 = n29 - by;
                    n5 = by - n4;
                    n6 = this.field349[n4];
                    n4 = n3;
                    n3 = n2;
                    n2 = n6;
                    while (true) {
                        int n31 = n5 - 1;
                        n5 = n2;
                        n6 = n;
                        by = (byte)n30;
                        n29 = n3;
                        if (n31 < 0) {
                            while (true) {
                                if ((by = (byte)(by - 1)) < 0) {
                                    return;
                                }
                                this.method7647(this.field4641, n5, n7, 0, n29 >> 14, n6 >> 14, 676616392);
                                n29 += n10;
                                n6 = n9 + n6;
                                n5 += this.field346;
                            }
                        }
                        this.method7647(this.field4641, n2, n7, 0, n3 >> 14, n4 >> 14, 676616392);
                        n3 += n10;
                        n4 = n8 + n4;
                        n2 += this.field346;
                        n5 = n31;
                    }
                }
                int n32 = n29 - by;
                n5 = by - n4;
                n6 = this.field349[n4];
                n4 = n3;
                n3 = n2;
                n2 = n6;
                while (true) {
                    int n33 = n5 - 1;
                    n5 = n2;
                    n6 = n;
                    by = (byte)n32;
                    n29 = n3;
                    if (n33 < 0) {
                        while (true) {
                            if ((by = (byte)(by - 1)) < 0) {
                                return;
                            }
                            this.method7647(this.field4641, n5, n7, 0, n6 >> 14, n29 >> 14, 676616392);
                            n29 += n10;
                            n6 = n9 + n6;
                            n5 += this.field346;
                        }
                    }
                    this.method7647(this.field4641, n2, n7, 0, n4 >> 14, n3 >> 14, 676616392);
                    n3 += n10;
                    n4 = n8 + n4;
                    n2 += this.field346;
                    n5 = n33;
                }
            }
            n3 = n4 << 14;
            if (n < 0) {
                n2 = n3 - n10 * n;
                n3 -= n8 * n;
                n4 = 0;
            } else {
                n2 = n3;
                n4 = n;
            }
            n = n6 << 14;
            if (n29 < 0) {
                n -= n29 * n9;
                n29 = 0;
            }
            if (n29 != n4 && n10 < n8 || n29 == n4 && n9 > n8) {
                int n34 = by - n29;
                n5 = n29 - n4;
                n6 = this.field349[n4];
                n4 = n2;
                n2 = n3;
                n3 = n6;
                while (true) {
                    int n35 = n5 - 1;
                    n5 = n3;
                    n6 = n;
                    n29 = n34;
                    by = (byte)n2;
                    if (n35 < 0) {
                        while (true) {
                            if (--n29 < 0) {
                                return;
                            }
                            this.method7647(this.field4641, n5, n7, 0, n6 >> 14, by >> 14, 676616392);
                            n6 = n9 + n6;
                            by = (byte)(n8 + by);
                            n5 += this.field346;
                        }
                    }
                    this.method7647(this.field4641, n3, n7, 0, n4 >> 14, n2 >> 14, 676616392);
                    n4 = n10 + n4;
                    n2 = n8 + n2;
                    n3 += this.field346;
                    n5 = n35;
                }
            }
            int n36 = by - n29;
            n5 = n29 - n4;
            n6 = this.field349[n4];
            n4 = n2;
            n2 = n6;
            while (true) {
                int n37 = n5 - 1;
                n5 = n2;
                n6 = n;
                n29 = n36;
                by = (byte)n3;
                if (n37 < 0) {
                    while (true) {
                        if (--n29 < 0) {
                            return;
                        }
                        this.method7647(this.field4641, n5, n7, 0, by >> 14, n6 >> 14, 676616392);
                        n6 = n9 + n6;
                        by = (byte)(n8 + by);
                        n5 += this.field346;
                    }
                }
                this.method7647(this.field4641, n2, n7, 0, n3 >> 14, n4 >> 14, 676616392);
                n4 = n10 + n4;
                n3 += n8;
                n2 += this.field346;
                n5 = n37;
            }
        }
    }

    @ObfuscatedName(value="al")
    final void method7647(int[] arrn, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n4;
        n6 = n5;
        if (this.field344) {
            n3 = n5;
            if (n5 > this.field358) {
                n3 = this.field358;
            }
            n7 = n4;
            n6 = n3;
            if (n4 < 0) {
                n7 = 0;
                n6 = n3;
            }
        }
        if (n7 >= n6) {
            return;
        }
        n3 = n7 + n;
        n4 = n6 - n7;
        n = n4 >> 2;
        if (this.field350 != 0) {
            if (this.field350 != 254) {
                n5 = this.field350;
                n6 = 256 - this.field350;
                n6 = ((n2 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n6 * (n2 & 0xFF00) >> 8 & 0xFF00);
                n2 = n3;
                while (--n >= 0) {
                    n7 = arrn[n2];
                    n3 = n2 + 1;
                    arrn[n2] = ((n7 & 0xFF00) * n5 >> 8 & 0xFF00) + n6 + ((n7 & 0xFF00FF) * n5 >> 8 & 0xFF00FF);
                    n7 = arrn[n3];
                    n2 = n3 + 1;
                    arrn[n3] = ((n7 & 0xFF00) * n5 >> 8 & 0xFF00) + n6 + ((n7 & 0xFF00FF) * n5 >> 8 & 0xFF00FF);
                    n7 = arrn[n2];
                    n3 = n2 + 1;
                    arrn[n2] = ((n7 & 0xFF00) * n5 >> 8 & 0xFF00) + n6 + ((n7 & 0xFF00FF) * n5 >> 8 & 0xFF00FF);
                    n2 = arrn[n3];
                    arrn[n3] = n6 + ((n2 & 0xFF00) * n5 >> 8 & 0xFF00) + ((n2 & 0xFF00FF) * n5 >> 8 & 0xFF00FF);
                    n2 = n3 + 1;
                }
                n = n4 & 3;
                while (--n >= 0) {
                    n3 = arrn[n2];
                    arrn[n2] = ((n3 & 0xFF00) * n5 >> 8 & 0xFF00) + ((n3 & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + n6;
                    ++n2;
                }
            } else {
                while (--n >= 0) {
                    n2 = n3 + 1;
                    arrn[n3] = arrn[n2];
                    n3 = n2 + 1;
                    arrn[n2] = arrn[n3];
                    n2 = n3 + 1;
                    arrn[n3] = arrn[n2];
                    n3 = n2 + 1;
                    arrn[n2] = arrn[n3];
                }
                n = n4 & 3;
                while (--n >= 0) {
                    n2 = n3 + 1;
                    arrn[n3] = arrn[n2];
                    n3 = n2;
                }
            }
        } else {
            while (--n >= 0) {
                n5 = n3 + 1;
                arrn[n3] = n2;
                n3 = n5 + 1;
                arrn[n5] = n2;
                n5 = n3 + 1;
                arrn[n3] = n2;
                n3 = n5 + 1;
                arrn[n5] = n2;
            }
            n = n4 & 3;
            while (--n >= 0) {
                arrn[n3] = n2;
                ++n3;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ap")
    final void method7649(int[] var1_1, int[] var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12, int var13_13, int var14_14, int var15_15, byte var16_16) {
        block50: {
            block46: {
                block51: {
                    block49: {
                        block48: {
                            block43: {
                                block44: {
                                    block47: {
                                        block45: {
                                            block42: {
                                                block40: {
                                                    block41: {
                                                        block39: {
                                                            if (!this.field344) break block39;
                                                            var4_4 = this.field358 * 865306523;
                                                            var3_3 = var7_7;
                                                            if (var7_7 <= var4_4 * -1949661549) break block40;
                                                            break block41;
                                                        }
                                                        var4_4 = var7_7;
                                                        ** GOTO lbl-1000
                                                    }
                                                    var3_3 = this.field358;
                                                }
                                                var4_4 = var3_3;
                                                if (var6_6 < 0) {
                                                    var6_6 = 0;
                                                    var7_7 = var3_3;
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    var7_7 = var4_4;
                                                }
                                                if (var6_6 >= var7_7) {
                                                    return;
                                                }
                                                var3_3 = var5_5 + var6_6;
                                                var4_4 = var9_9 * var6_6 + var8_8;
                                                var16_16 = (byte)(var7_7 - var6_6);
                                                if (!this.field353) break block42;
                                                var5_5 = var10_10 + var13_13 * (var6_6 -= this.field352);
                                                var8_8 = var11_11 + var14_14 * var6_6;
                                                var10_10 = var15_15 * var6_6 + var12_12;
                                                if ((var6_6 = var10_10 >> 12) == 0) break block43;
                                                break block44;
                                            }
                                            var5_5 = var10_10 + var13_13 * (var6_6 -= this.field352);
                                            var10_10 = var11_11 + var14_14 * var6_6;
                                            var8_8 = var15_15 * var6_6 + var12_12;
                                            if ((var6_6 = var8_8 >> 14) != 0) {
                                                var7_7 = var5_5 / var6_6;
                                                var6_6 = var10_10 / var6_6;
                                            } else {
                                                var6_6 = 0;
                                                var7_7 = 0;
                                            }
                                            var11_11 = var15_15 * var16_16 + var8_8 >> 14;
                                            if (var11_11 != 0) {
                                                var8_8 = (var5_5 + var13_13 * var16_16) / var11_11;
                                                var10_10 = (var16_16 * var14_14 + var10_10) / var11_11;
                                            } else {
                                                var8_8 = 0;
                                                var10_10 = 0;
                                            }
                                            var5_5 = (var7_7 << 18) + var6_6;
                                            var12_12 = ((var8_8 - var7_7) / var16_16 << 18) + (var10_10 - var6_6) / var16_16;
                                            var10_10 = var16_16 >> 3;
                                            var13_13 = var9_9 << 3;
                                            var6_6 = var4_4 >> 8;
                                            if (!this.field356) break block45;
                                            var8_8 = var5_5;
                                            var9_9 = var6_6;
                                            var7_7 = var3_3;
                                            if (var10_10 <= 0) break block46;
                                            break block47;
                                        }
                                        var8_8 = var5_5;
                                        var9_9 = var6_6;
                                        var7_7 = var3_3;
                                        if (var10_10 > 0) {
                                            var7_7 = var3_3;
                                            var3_3 = var10_10;
                                            do {
                                                if ((var8_8 = var2_2[(var5_5 >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                ++var7_7;
                                                if ((var8_8 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)]) != 0) {
                                                    var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                                                }
                                                var9_9 = var7_7 + 1;
                                                var8_8 = var5_5 + var12_12;
                                                var4_4 = var13_13 + var4_4;
                                                var10_10 = var4_4 >> 8;
                                                var3_3 = var11_11 = var3_3 - 1;
                                                var5_5 = var8_8;
                                                var6_6 = var10_10;
                                                var7_7 = var9_9;
                                            } while (var11_11 > 0);
                                            var7_7 = var9_9;
                                            var9_9 = var10_10;
                                        }
                                        if ((var3_3 = var16_16 & 7) <= 0) return;
                                        do {
                                            if ((var4_4 = var2_2[(var8_8 >>> 25) + (var8_8 & 16256)]) != 0) {
                                                var1_1[var7_7] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
                                            }
                                            ++var7_7;
                                            var8_8 += var12_12;
                                            var3_3 = var4_4 = var3_3 - 1;
                                        } while (var4_4 > 0);
                                        return;
                                    }
                                    var7_7 = var10_10;
                                    do {
                                        var9_9 = var2_2[(var5_5 >>> 25) + (var5_5 & 16256)];
                                        var8_8 = var3_3 + 1;
                                        var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var9_9 = var2_2[((var5_5 += var12_12) >>> 25) + (var5_5 & 16256)];
                                        var3_3 = var8_8 + 1;
                                        var1_1[var8_8] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var8_8 = var5_5 + var12_12;
                                        var9_9 = var2_2[(var8_8 >>> 25) + (var8_8 & 16256)];
                                        var5_5 = var3_3 + 1;
                                        var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var9_9 = var2_2[((var8_8 += var12_12) >>> 25) + (var8_8 & 16256)];
                                        var3_3 = var5_5 + 1;
                                        var1_1[var5_5] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var9_9 = var2_2[((var8_8 += var12_12) >>> 25) + (var8_8 & 16256)];
                                        var5_5 = var3_3 + 1;
                                        var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var9_9 = var2_2[((var8_8 += var12_12) >>> 25) + (var8_8 & 16256)];
                                        var3_3 = var5_5 + 1;
                                        var1_1[var5_5] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var9_9 = var2_2[((var8_8 += var12_12) >>> 25) + (var8_8 & 16256)];
                                        var5_5 = var3_3 + 1;
                                        var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                                        var3_3 = var8_8 + var12_12;
                                        var9_9 = var2_2[(var3_3 & 16256) + (var3_3 >>> 25)];
                                        var8_8 = var5_5 + 1;
                                        var1_1[var5_5] = ((var9_9 & 0xFF00FF) * var6_6 & -16711936) + ((var9_9 & 65280) * var6_6 & 0xFF0000) >> 8;
                                        var10_10 = var3_3 + var12_12;
                                        var4_4 = var13_13 + var4_4;
                                        var9_9 = var4_4 >> 8;
                                        var7_7 = var11_11 = var7_7 - 1;
                                        var5_5 = var10_10;
                                        var6_6 = var9_9;
                                        var3_3 = var8_8;
                                    } while (var11_11 > 0);
                                    var7_7 = var8_8;
                                    var8_8 = var10_10;
                                    break block46;
                                }
                                var7_7 = var5_5 / var6_6;
                                var6_6 = var8_8 / var6_6;
                                break block48;
                            }
                            var6_6 = 0;
                            var7_7 = 0;
                        }
                        var11_11 = var10_10 + var15_15 * var16_16 >> 12;
                        if (var11_11 != 0) {
                            var10_10 = (var5_5 + var13_13 * var16_16) / var11_11;
                            var8_8 = (var8_8 + var16_16 * var14_14) / var11_11;
                        } else {
                            var8_8 = 0;
                            var10_10 = 0;
                        }
                        var5_5 = (var7_7 << 20) + var6_6;
                        var12_12 = (var8_8 - var6_6) / var16_16 + ((var10_10 - var7_7) / var16_16 << 20);
                        var10_10 = var16_16 >> 3;
                        var13_13 = var9_9 << 3;
                        var6_6 = var4_4 >> 8;
                        if (!this.field356) break block49;
                        var8_8 = var5_5;
                        var9_9 = var6_6;
                        var7_7 = var3_3;
                        if (var10_10 <= 0) break block50;
                        break block51;
                    }
                    var8_8 = var5_5;
                    var9_9 = var6_6;
                    var7_7 = var3_3;
                    if (var10_10 > 0) {
                        var7_7 = var3_3;
                        var3_3 = var10_10;
                        do {
                            if ((var8_8 = var2_2[(var5_5 & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            ++var7_7;
                            if ((var8_8 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)]) != 0) {
                                var1_1[var7_7] = ((var8_8 & 0xFF00FF) * var6_6 & -16711936) + ((var8_8 & 65280) * var6_6 & 0xFF0000) >> 8;
                            }
                            var9_9 = var7_7 + 1;
                            var8_8 = var5_5 + var12_12;
                            var4_4 = var13_13 + var4_4;
                            var10_10 = var4_4 >> 8;
                            var3_3 = var11_11 = var3_3 - 1;
                            var5_5 = var8_8;
                            var6_6 = var10_10;
                            var7_7 = var9_9;
                        } while (var11_11 > 0);
                        var7_7 = var9_9;
                        var9_9 = var10_10;
                    }
                    if ((var3_3 = var16_16 & 7) <= 0) return;
                    do {
                        if ((var4_4 = var2_2[(var8_8 >>> 26) + (var8_8 & 4032)]) != 0) {
                            var1_1[var7_7] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
                        }
                        ++var7_7;
                        var8_8 += var12_12;
                        var3_3 = var4_4 = var3_3 - 1;
                    } while (var4_4 > 0);
                    return;
                }
                var7_7 = var10_10;
                do {
                    var9_9 = var2_2[(var5_5 & 4032) + (var5_5 >>> 26)];
                    var8_8 = var3_3 + 1;
                    var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var9_9 = var2_2[((var5_5 += var12_12) & 4032) + (var5_5 >>> 26)];
                    var3_3 = var8_8 + 1;
                    var1_1[var8_8] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var8_8 = var5_5 + var12_12;
                    var9_9 = var2_2[(var8_8 >>> 26) + (var8_8 & 4032)];
                    var5_5 = var3_3 + 1;
                    var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var9_9 = var2_2[((var8_8 += var12_12) >>> 26) + (var8_8 & 4032)];
                    var3_3 = var5_5 + 1;
                    var1_1[var5_5] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var9_9 = var2_2[((var8_8 += var12_12) >>> 26) + (var8_8 & 4032)];
                    var5_5 = var3_3 + 1;
                    var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var9_9 = var2_2[((var8_8 += var12_12) >>> 26) + (var8_8 & 4032)];
                    var3_3 = var5_5 + 1;
                    var1_1[var5_5] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var9_9 = var2_2[((var8_8 += var12_12) >>> 26) + (var8_8 & 4032)];
                    var5_5 = var3_3 + 1;
                    var1_1[var3_3] = ((var9_9 & 65280) * var6_6 & 0xFF0000) + ((var9_9 & 0xFF00FF) * var6_6 & -16711936) >> 8;
                    var3_3 = var8_8 + var12_12;
                    var9_9 = var2_2[(var3_3 & 4032) + (var3_3 >>> 26)];
                    var8_8 = var5_5 + 1;
                    var1_1[var5_5] = ((var9_9 & 0xFF00FF) * var6_6 & -16711936) + ((var9_9 & 65280) * var6_6 & 0xFF0000) >> 8;
                    var10_10 = var3_3 + var12_12;
                    var4_4 = var13_13 + var4_4;
                    var9_9 = var4_4 >> 8;
                    var7_7 = var11_11 = var7_7 - 1;
                    var5_5 = var10_10;
                    var6_6 = var9_9;
                    var3_3 = var8_8;
                } while (var11_11 > 0);
                var7_7 = var8_8;
                var8_8 = var10_10;
                break block50;
            }
            if ((var3_3 = var16_16 & 7) <= 0) return;
            while (true) {
                var4_4 = var2_2[(var8_8 >>> 25) + (var8_8 & 16256)];
                var1_1[var7_7] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
                var8_8 += var12_12;
                if (--var3_3 <= 0) {
                    return;
                }
                ++var7_7;
            }
        }
        if ((var3_3 = var16_16 & 7) <= 0) return;
        while (true) {
            var4_4 = var2_2[(var8_8 >>> 26) + (var8_8 & 4032)];
            var1_1[var7_7] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
            var8_8 += var12_12;
            if (--var3_3 <= 0) {
                return;
            }
            ++var7_7;
        }
    }

    @ObfuscatedName(value="ar")
    final void method7650(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, byte by) {
        block91: {
            block92: {
                int n20;
                int n21;
                int n22;
                int n23;
                int n24;
                int n25;
                int n26;
                int n27;
                int n28;
                int[] arrn;
                int n29;
                block93: {
                    block95: {
                        block94: {
                            n29 = n;
                            int n30 = n2;
                            by = (byte)n3;
                            arrn = Rasterizer3D.field339.getTexturePixels(n19);
                            if (arrn == null) break block91;
                            this.field353 = Rasterizer3D.field339.vmethod7806(n19);
                            this.field356 = Rasterizer3D.field339.vmethod7795(n19);
                            n2 = n5 - n4;
                            n28 = n30 - n29;
                            n3 = n6 - n4;
                            n27 = by - n29;
                            n26 = n8 - n7;
                            n25 = n9 - n7;
                            n19 = n30 == n29 ? 0 : (n2 << 14) / n28;
                            n24 = n30 == by ? 0 : (n6 - n5 << 14) / (by - n30);
                            n = n29 == by ? 0 : (n4 - n6 << 14) / (n29 - by);
                            n23 = n27 * n2 - n3 * n28;
                            if (n23 == 0) {
                                return;
                            }
                            n28 = (n27 * n26 - n28 * n25 << 9) / n23;
                            n26 = (n25 * n2 - n3 * n26 << 9) / n23;
                            n2 = n10 - n11;
                            n3 = n13 - n14;
                            n17 = n16 - n17;
                            n22 = n12 - n10;
                            n14 = n13 * n22 - n10 * (n15 -= n13) << 14;
                            n25 = (int)(((long)(n15 * n16 - (n18 -= n16) * n13) << 14) / (long)this.field354);
                            n27 = (int)(((long)(n18 * n10 - n22 * n16) << 14) / (long)this.field354);
                            n12 = n13 * n2 - n3 * n10 << 14;
                            n23 = (int)(((long)(n3 * n16 - n13 * n17) << 14) / (long)this.field354);
                            n21 = (int)(((long)(n17 * n10 - n16 * n2) << 14) / (long)this.field354);
                            n11 = n3 * n22 - n15 * n2 << 14;
                            n20 = (int)(((long)(n17 * n15 - n18 * n3) << 14) / (long)this.field354);
                            n22 = (int)(((long)(n18 * n2 - n17 * n22) << 14) / (long)this.field354);
                            if (n29 > n30 || n29 > by) {
                                if (n30 > by) {
                                    if (by < this.field355) {
                                        n7 = n29;
                                        if (n29 > this.field355) {
                                            n7 = this.field355;
                                        }
                                        n8 = n30;
                                        if (n30 > this.field355) {
                                            n8 = this.field355;
                                        }
                                        n2 = n28 + ((n9 << 9) - n28 * n6);
                                        if (n7 < n8) {
                                            n3 = n6 << 14;
                                            if (by < 0) {
                                                n9 = 0;
                                                n5 = n2 - n26 * by;
                                                n6 = n3 - by * n;
                                                n3 -= n24 * by;
                                                by = (byte)n9;
                                            } else {
                                                n6 = n3;
                                                n5 = n2;
                                            }
                                            n2 = n4 << 14;
                                            if (n7 < 0) {
                                                n2 -= n19 * n7;
                                                n9 = 0;
                                            } else {
                                                n9 = n7;
                                            }
                                            n4 = n6;
                                            n7 = by - this.field357;
                                            n6 = n27 * n7 + n14;
                                            n10 = n21 * n7 + n12;
                                            n7 = n11 + n22 * n7;
                                            if (n24 >= n) {
                                                n18 = n8 - n9;
                                                n11 = n9 - by;
                                                n12 = this.field349[by];
                                                n9 = n4;
                                                n4 = n10;
                                                n8 = n3;
                                                n3 = n7;
                                                n7 = n12;
                                                while (true) {
                                                    by = (byte)(n11 - 1);
                                                    n10 = n7;
                                                    n11 = n3;
                                                    n13 = n2;
                                                    n16 = n8;
                                                    n14 = n5;
                                                    n17 = n18;
                                                    n12 = n4;
                                                    n15 = n6;
                                                    if (by < 0) {
                                                        while (true) {
                                                            if (--n17 < 0) {
                                                                return;
                                                            }
                                                            this.method7649(this.field4641, arrn, 0, 0, n10, n13 >> 14, n16 >> 14, n14, n28, n15, n12, n11, n25, n23, n20, (byte)-84);
                                                            n16 = n24 + n16;
                                                            n13 += n19;
                                                            n14 = n26 + n14;
                                                            n10 += this.field346;
                                                            n15 = n27 + n15;
                                                            n12 = n21 + n12;
                                                            n11 += n22;
                                                        }
                                                    }
                                                    this.method7649(this.field4641, arrn, 0, 0, n7, n9 >> 14, n8 >> 14, n5, n28, n6, n4, n3, n25, n23, n20, (byte)-34);
                                                    n8 = n24 + n8;
                                                    n9 += n;
                                                    n5 += n26;
                                                    n7 += this.field346;
                                                    n6 = n27 + n6;
                                                    n4 = n21 + n4;
                                                    n3 += n22;
                                                    n11 = by;
                                                }
                                            }
                                            n18 = n8 - n9;
                                            n11 = n9 - by;
                                            n12 = this.field349[by];
                                            n9 = n4;
                                            n4 = n10;
                                            n8 = n3;
                                            n3 = n7;
                                            n7 = n12;
                                            while (true) {
                                                by = (byte)(n11 - 1);
                                                n10 = n7;
                                                n11 = n3;
                                                n13 = n2;
                                                n16 = n8;
                                                n14 = n5;
                                                n17 = n18;
                                                n12 = n4;
                                                n15 = n6;
                                                if (by < 0) {
                                                    while (true) {
                                                        if (--n17 < 0) {
                                                            return;
                                                        }
                                                        this.method7649(this.field4641, arrn, 0, 0, n10, n16 >> 14, n13 >> 14, n14, n28, n15, n12, n11, n25, n23, n20, (byte)-46);
                                                        n16 = n24 + n16;
                                                        n13 += n19;
                                                        n14 = n26 + n14;
                                                        n10 += this.field346;
                                                        n15 = n27 + n15;
                                                        n12 = n21 + n12;
                                                        n11 += n22;
                                                    }
                                                }
                                                this.method7649(this.field4641, arrn, 0, 0, n7, n8 >> 14, n9 >> 14, n5, n28, n6, n4, n3, n25, n23, n20, (byte)-48);
                                                n8 = n24 + n8;
                                                n9 += n;
                                                n5 += n26;
                                                n7 += this.field346;
                                                n6 = n27 + n6;
                                                n4 = n21 + n4;
                                                n3 += n22;
                                                n11 = by;
                                            }
                                        }
                                        n4 = n6 << 14;
                                        if (by < 0) {
                                            n9 = 0;
                                            n6 = n2 - n26 * by;
                                            n3 = n4 - by * n;
                                            n4 -= n24 * by;
                                            by = (byte)n9;
                                        } else {
                                            n3 = n4;
                                            n6 = n2;
                                        }
                                        n2 = n5 << 14;
                                        if (n8 < 0) {
                                            n2 -= n19 * n8;
                                            n10 = 0;
                                        } else {
                                            n10 = n8;
                                        }
                                        n8 = by - this.field357;
                                        n9 = n14 + n27 * n8;
                                        n5 = n12 + n21 * n8;
                                        n8 = n11 + n22 * n8;
                                        if (n24 >= n) {
                                            n11 = n10 - by;
                                            n18 = n7 - n10;
                                            n10 = this.field349[by];
                                            n7 = n9;
                                            n9 = n11;
                                            n11 = n4;
                                            n4 = n3;
                                            n3 = n10;
                                            while (true) {
                                                by = (byte)(n9 - 1);
                                                n9 = n3;
                                                n13 = n4;
                                                n16 = n2;
                                                n14 = n6;
                                                n10 = n8;
                                                n12 = n5;
                                                n15 = n7;
                                                n17 = n18;
                                                if (by < 0) {
                                                    while (true) {
                                                        if (--n17 < 0) {
                                                            return;
                                                        }
                                                        this.method7649(this.field4641, arrn, 0, 0, n9, n13 >> 14, n16 >> 14, n14, n28, n15, n12, n10, n25, n23, n20, (byte)-33);
                                                        n16 = n19 + n16;
                                                        n13 += n;
                                                        n14 = n26 + n14;
                                                        n2 = this.field346 * 191716777;
                                                        n9 = n2 * 1173526169 + n9;
                                                        n15 = n27 + n15;
                                                        n12 = n21 + n12;
                                                        n10 += n22;
                                                    }
                                                }
                                                this.method7649(this.field4641, arrn, 0, 0, n3, n4 >> 14, n11 >> 14, n6, n28, n7, n5, n8, n25, n23, n20, (byte)-75);
                                                n11 += n24;
                                                n4 += n;
                                                n6 = n26 + n6;
                                                n3 += this.field346;
                                                n7 = n27 + n7;
                                                n5 += n21;
                                                n8 = n22 + n8;
                                                n9 = by;
                                            }
                                        }
                                        n12 = n10 - by;
                                        n18 = n7 - n10;
                                        n11 = this.field349[by];
                                        n7 = n9;
                                        n10 = n12;
                                        n9 = n4;
                                        n4 = n3;
                                        n3 = n11;
                                        while (true) {
                                            by = (byte)(n10 - 1);
                                            n10 = n3;
                                            n12 = n4;
                                            n15 = n2;
                                            n13 = n6;
                                            n11 = n8;
                                            n14 = n5;
                                            n16 = n7;
                                            n17 = n18;
                                            if (by < 0) {
                                                while (true) {
                                                    if (--n17 < 0) {
                                                        return;
                                                    }
                                                    this.method7649(this.field4641, arrn, 0, 0, n10, n15 >> 14, n12 >> 14, n13, n28, n16, n14, n11, n25, n23, n20, (byte)-36);
                                                    n15 = n19 + n15;
                                                    n12 += n;
                                                    n13 += n26;
                                                    n10 += this.field346;
                                                    n16 = n27 + n16;
                                                    n14 = n21 + n14;
                                                    n11 += n22;
                                                }
                                            }
                                            this.method7649(this.field4641, arrn, 0, 0, n3, n9 >> 14, n4 >> 14, n6, n28, n7, n5, n8, n25, n23, n20, (byte)-88);
                                            n9 = n24 + n9;
                                            n4 += n;
                                            n6 = n26 + n6;
                                            n3 += this.field346;
                                            n7 = n27 + n7;
                                            n5 += n21;
                                            n8 = n22 + n8;
                                            n10 = by;
                                        }
                                    }
                                    return;
                                }
                                if (n30 < this.field355) {
                                    n7 = by;
                                    if (by > this.field355) {
                                        n7 = this.field355;
                                    }
                                    n2 = n29;
                                    if (n29 > this.field355) {
                                        n2 = this.field355;
                                    }
                                    n9 = n2;
                                    n8 = n28 + ((n8 << 9) - n5 * n28);
                                    if (n7 < n9) {
                                        n3 = n5 << 14;
                                        if (n30 < 0) {
                                            n2 = 0;
                                            n4 = n8 - n30 * n26;
                                            n5 = n3 - n30 * n24;
                                            n3 -= n19 * n30;
                                            n30 = n2;
                                        } else {
                                            n4 = n8;
                                            n5 = n3;
                                        }
                                        n2 = n6 << 14;
                                        if (n7 < 0) {
                                            n2 -= n7 * n;
                                            n10 = 0;
                                        } else {
                                            n10 = n7;
                                        }
                                        n6 = n5;
                                        n5 = n30 - this.field357;
                                        n7 = n5 * n27 + n14;
                                        n8 = n5 * n21 + n12;
                                        n5 = n11 + n5 * n22;
                                        if (n10 != n30 && n19 < n24 || n10 == n30 && n19 > n) {
                                            n18 = n9 - n10;
                                            n10 -= n30;
                                            n11 = this.field349[n30];
                                            n9 = n6;
                                            n6 = n8;
                                            n8 = n11;
                                            while (true) {
                                                by = (byte)(n10 - 1);
                                                n10 = n8;
                                                n13 = n3;
                                                n14 = n4;
                                                n16 = n2;
                                                n17 = n18;
                                                n11 = n6;
                                                n15 = n7;
                                                n12 = n5;
                                                if (by < 0) {
                                                    while (true) {
                                                        if (--n17 < 0) {
                                                            return;
                                                        }
                                                        this.method7649(this.field4641, arrn, 0, 0, n10, n13 >> 14, n16 >> 14, n14, n28, n15, n11, n12, n25, n23, n20, (byte)7);
                                                        n13 += n19;
                                                        n16 += n;
                                                        n14 = n26 + n14;
                                                        n10 += this.field346;
                                                        n15 = n27 + n15;
                                                        n11 += n21;
                                                        n12 = n22 + n12;
                                                    }
                                                }
                                                this.method7649(this.field4641, arrn, 0, 0, n8, n3 >> 14, n9 >> 14, n4, n28, n7, n6, n5, n25, n23, n20, (byte)-116);
                                                n3 += n19;
                                                n9 = n24 + n9;
                                                n4 = n26 + n4;
                                                n8 += this.field346;
                                                n7 = n27 + n7;
                                                n6 = n21 + n6;
                                                n5 += n22;
                                                n10 = by;
                                            }
                                        }
                                        n18 = n9 - n10;
                                        n10 -= n30;
                                        n11 = this.field349[n30];
                                        n9 = n6;
                                        n6 = n8;
                                        n8 = n11;
                                        while (true) {
                                            by = (byte)(n10 - 1);
                                            n10 = n8;
                                            n13 = n3;
                                            n14 = n4;
                                            n16 = n2;
                                            n17 = n18;
                                            n11 = n6;
                                            n15 = n7;
                                            n12 = n5;
                                            if (by < 0) {
                                                while (true) {
                                                    if (--n17 < 0) {
                                                        return;
                                                    }
                                                    this.method7649(this.field4641, arrn, 0, 0, n10, n16 >> 14, n13 >> 14, n14, n28, n15, n11, n12, n25, n23, n20, (byte)-75);
                                                    n13 += n19;
                                                    n16 += n;
                                                    n14 = n26 + n14;
                                                    n10 += this.field346;
                                                    n15 = n27 + n15;
                                                    n11 += n21;
                                                    n12 = n22 + n12;
                                                }
                                            }
                                            this.method7649(this.field4641, arrn, 0, 0, n8, n9 >> 14, n3 >> 14, n4, n28, n7, n6, n5, n25, n23, n20, (byte)-37);
                                            n3 += n19;
                                            n9 = n24 + n9;
                                            n4 = n26 + n4;
                                            n8 += this.field346;
                                            n7 = n27 + n7;
                                            n6 = n21 + n6;
                                            n5 += n22;
                                            n10 = by;
                                        }
                                    }
                                    n3 = n5 << 14;
                                    if (n30 < 0) {
                                        n5 = n3 - n19 * n30;
                                        n3 -= n24 * n30;
                                        n8 -= n30 * n26;
                                        n30 = 0;
                                    } else {
                                        n5 = n3;
                                    }
                                    n2 = n4 << 14;
                                    if (n9 < 0) {
                                        n2 -= n9 * n;
                                        n4 = 0;
                                    } else {
                                        n4 = n9;
                                    }
                                    n10 = n30 - this.field357;
                                    n9 = n14 + n10 * n27;
                                    n6 = n12 + n10 * n21;
                                    n10 = n11 + n10 * n22;
                                    if (n19 >= n24) {
                                        n18 = n7 - n4;
                                        n12 = n4 - n30;
                                        n11 = this.field349[n30];
                                        n4 = n10;
                                        n7 = n9;
                                        n10 = n12;
                                        n9 = n5;
                                        n5 = n3;
                                        n3 = n11;
                                        while (true) {
                                            by = (byte)(n10 - 1);
                                            n10 = n3;
                                            n13 = n18;
                                            n14 = n2;
                                            n15 = n5;
                                            n11 = n6;
                                            n16 = n7;
                                            n17 = n8;
                                            n12 = n4;
                                            if (by < 0) {
                                                while (true) {
                                                    if (--n13 < 0) {
                                                        return;
                                                    }
                                                    this.method7649(this.field4641, arrn, 0, 0, n10, n15 >> 14, n14 >> 14, n17, n28, n16, n11, n12, n25, n23, n20, (byte)-12);
                                                    n14 += n;
                                                    n15 = n24 + n15;
                                                    n17 += n26;
                                                    n10 += this.field346;
                                                    n16 = n27 + n16;
                                                    n11 += n21;
                                                    n12 = n22 + n12;
                                                }
                                            }
                                            this.method7649(this.field4641, arrn, 0, 0, n3, n5 >> 14, n9 >> 14, n8, n28, n7, n6, n4, n25, n23, n20, (byte)9);
                                            n9 = n19 + n9;
                                            n5 += n24;
                                            n8 = n26 + n8;
                                            n3 += this.field346;
                                            n7 = n27 + n7;
                                            n6 = n21 + n6;
                                            n4 = n22 + n4;
                                            n10 = by;
                                        }
                                    }
                                    n18 = n7 - n4;
                                    n12 = n4 - n30;
                                    n4 = n10;
                                    n11 = this.field349[n30];
                                    n7 = n9;
                                    n10 = n12;
                                    n9 = n5;
                                    n5 = n3;
                                    n3 = n11;
                                    while (true) {
                                        by = (byte)(n10 - 1);
                                        n10 = n3;
                                        n13 = n18;
                                        n14 = n2;
                                        n15 = n5;
                                        n11 = n6;
                                        n16 = n7;
                                        n17 = n8;
                                        n12 = n4;
                                        if (by < 0) {
                                            while (true) {
                                                if (--n13 < 0) {
                                                    return;
                                                }
                                                this.method7649(this.field4641, arrn, 0, 0, n10, n14 >> 14, n15 >> 14, n17, n28, n16, n11, n12, n25, n23, n20, (byte)-29);
                                                n14 += n;
                                                n15 = n24 + n15;
                                                n17 += n26;
                                                n10 += this.field346;
                                                n16 = n27 + n16;
                                                n11 += n21;
                                                n12 = n22 + n12;
                                            }
                                        }
                                        this.method7649(this.field4641, arrn, 0, 0, n3, n9 >> 14, n5 >> 14, n8, n28, n7, n6, n4, n25, n23, n20, (byte)-98);
                                        n9 = n19 + n9;
                                        n5 += n24;
                                        n8 = n26 + n8;
                                        n3 += this.field346;
                                        n7 = n27 + n7;
                                        n6 = n21 + n6;
                                        n4 = n22 + n4;
                                        n10 = by;
                                    }
                                }
                                return;
                            }
                            if (n29 >= this.field355) break block92;
                            n2 = n30;
                            if (n30 > this.field355) {
                                n2 = this.field355;
                            }
                            n9 = n2;
                            n8 = by > this.field355 ? this.field355 : (int)by;
                            n2 = (n7 << 9) - n28 * n4 + n28;
                            if (n9 >= n8) break block93;
                            n4 <<= 14;
                            if (n29 < 0) {
                                n6 = n4 - n19 * n29;
                                n2 -= n29 * n26;
                                n3 = n4 - n29 * n;
                                n29 = 0;
                                n4 = n6;
                                n6 = n2;
                            } else {
                                n3 = n4;
                                n6 = n2;
                            }
                            n2 = n5 <<= 14;
                            n7 = n9;
                            if (n9 < 0) {
                                n2 = n5 - n24 * n9;
                                n7 = 0;
                            }
                            n10 = n29 - this.field357;
                            n5 = n14 + n10 * n27;
                            n9 = n10 * n21 + n12;
                            n12 = n11 + n10 * n22;
                            if (n29 != n7 && n < n19) break block94;
                            n11 = n6;
                            n10 = n12;
                            n17 = n;
                            if (n29 != n7 || n17 <= n24) break block95;
                        }
                        n10 = n6;
                        n6 = n12;
                        n17 = n;
                        n12 = n7 - n29;
                        n18 = n8 - n7;
                        n11 = this.field349[n29];
                        n7 = n10;
                        n = n6;
                        n10 = n12;
                        n6 = n9;
                        n8 = n4;
                        n4 = n3;
                        n3 = n11;
                        while (true) {
                            by = (byte)(n10 - 1);
                            n9 = n3;
                            n12 = n4;
                            n13 = n2;
                            n10 = n6;
                            n14 = n5;
                            n11 = n;
                            n15 = n7;
                            n16 = n18;
                            if (by < 0) {
                                while (true) {
                                    if (--n16 < 0) {
                                        return;
                                    }
                                    this.method7649(this.field4641, arrn, 0, 0, n9, n12 >> 14, n13 >> 14, n15, n28, n14, n10, n11, n25, n23, n20, (byte)-102);
                                    n12 = n17 + n12;
                                    n13 += n24;
                                    n15 = n26 + n15;
                                    n9 += this.field346;
                                    n14 = n27 + n14;
                                    n10 += n21;
                                    n11 += n22;
                                }
                            }
                            this.method7649(this.field4641, arrn, 0, 0, n3, n4 >> 14, n8 >> 14, n7, n28, n5, n6, n, n25, n23, n20, (byte)-4);
                            n4 = n17 + n4;
                            n8 = n19 + n8;
                            n7 = n26 + n7;
                            n3 += this.field346;
                            n5 += n27;
                            n6 = n21 + n6;
                            n = n22 + n;
                            n10 = by;
                        }
                    }
                    n6 = n7 - n29;
                    n18 = n8 - n7;
                    n12 = this.field349[n29];
                    n7 = n11;
                    n = n10;
                    n10 = n6;
                    n6 = n9;
                    n8 = n4;
                    n4 = n3;
                    n3 = n12;
                    while (true) {
                        by = (byte)(n10 - 1);
                        n9 = n3;
                        n12 = n4;
                        n13 = n2;
                        n10 = n6;
                        n14 = n5;
                        n11 = n;
                        n15 = n7;
                        n16 = n18;
                        if (by < 0) {
                            while (true) {
                                if (--n16 < 0) {
                                    return;
                                }
                                this.method7649(this.field4641, arrn, 0, 0, n9, n13 >> 14, n12 >> 14, n15, n28, n14, n10, n11, n25, n23, n20, (byte)-53);
                                n12 = n17 + n12;
                                n13 += n24;
                                n15 = n26 + n15;
                                n9 += this.field346;
                                n14 = n27 + n14;
                                n10 += n21;
                                n11 += n22;
                            }
                        }
                        this.method7649(this.field4641, arrn, 0, 0, n3, n8 >> 14, n4 >> 14, n7, n28, n5, n6, n, n25, n23, n20, (byte)9);
                        n4 = n17 + n4;
                        n8 = n19 + n8;
                        n7 = n26 + n7;
                        n3 += this.field346;
                        n5 += n27;
                        n6 = n21 + n6;
                        n = n22 + n;
                        n10 = by;
                    }
                }
                n4 <<= 14;
                if (n29 < 0) {
                    n3 = n4 - n29 * n;
                    n4 -= n19 * n29;
                    n7 = n2 - n29 * n26;
                    n5 = 0;
                    n2 = n3;
                    n3 = n7;
                } else {
                    n3 = n2;
                    n2 = n4;
                    n5 = n29;
                }
                n17 = n;
                n = n6 << 14;
                if (n8 < 0) {
                    n -= n24 * n8;
                    n10 = 0;
                } else {
                    n10 = n8;
                }
                n6 = n4;
                n7 = n5 - this.field357;
                n4 = n27 * n7 + n14;
                n8 = n21 * n7 + n12;
                n7 = n11 + n22 * n7;
                if (n5 != n10 && n17 < n19 || n5 == n10 && n24 > n19) {
                    n18 = n9 - n10;
                    n9 = n10 - n5;
                    n10 = this.field349[n5];
                    n5 = n3;
                    n3 = n8;
                    n8 = n2;
                    n2 = n7;
                    n7 = n10;
                    while (true) {
                        by = (byte)(n9 - 1);
                        n9 = n7;
                        n10 = n2;
                        n12 = n;
                        n11 = n3;
                        n15 = n18;
                        n14 = n5;
                        n13 = n4;
                        n16 = n6;
                        if (by < 0) {
                            while (true) {
                                if (--n15 < 0) {
                                    return;
                                }
                                this.method7649(this.field4641, arrn, 0, 0, n9, n12 >> 14, n16 >> 14, n14, n28, n13, n11, n10, n25, n23, n20, (byte)-68);
                                n12 = n24 + n12;
                                n16 = n19 + n16;
                                n14 = n26 + n14;
                                n9 += this.field346;
                                n13 += n27;
                                n11 += n21;
                                n10 += n22;
                            }
                        }
                        this.method7649(this.field4641, arrn, 0, 0, n7, n8 >> 14, n6 >> 14, n5, n28, n4, n3, n2, n25, n23, n20, (byte)-30);
                        n8 = n17 + n8;
                        n6 = n19 + n6;
                        n5 += n26;
                        n7 += this.field346;
                        n4 = n27 + n4;
                        n3 += n21;
                        n2 = n22 + n2;
                        n9 = by;
                    }
                }
                n18 = n9 - n10;
                n9 = n10 - n5;
                n10 = this.field349[n5];
                n5 = n3;
                n3 = n8;
                n8 = n2;
                n2 = n7;
                n7 = n10;
                while (true) {
                    by = (byte)(n9 - 1);
                    n9 = n7;
                    n10 = n2;
                    n12 = n;
                    n11 = n3;
                    n15 = n18;
                    n14 = n5;
                    n13 = n4;
                    n16 = n6;
                    if (by < 0) {
                        while (true) {
                            if (--n15 < 0) {
                                return;
                            }
                            this.method7649(this.field4641, arrn, 0, 0, n9, n16 >> 14, n12 >> 14, n14, n28, n13, n11, n10, n25, n23, n20, (byte)-31);
                            n12 = n24 + n12;
                            n16 = n19 + n16;
                            n14 = n26 + n14;
                            n9 += this.field346;
                            n13 += n27;
                            n11 += n21;
                            n10 += n22;
                        }
                    }
                    this.method7649(this.field4641, arrn, 0, 0, n7, n6 >> 14, n8 >> 14, n5, n28, n4, n3, n2, n25, n23, n20, (byte)-107);
                    n8 = n17 + n8;
                    n6 = n19 + n6;
                    n5 += n26;
                    n7 += this.field346;
                    n4 = n27 + n4;
                    n3 += n21;
                    n2 = n22 + n2;
                    n9 = by;
                }
            }
            return;
        }
        n10 = Rasterizer3D.field339.getAverageTextureRGB(n19);
        this.method7644(n, n2, n3, n4, n5, n6, class82.method4599(n10, n7, (byte)0), class82.method4599(n10, n8, (byte)0), class82.method4599(n10, n9, (byte)0), -1931238990);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="as")
    final void method7651(int[] arrn, int n, int n2, int n3, int n4, int n5, int n6, int n7, byte by) {
        block20: {
            int n8;
            block22: {
                block23: {
                    block18: {
                        block19: {
                            block21: {
                                block16: {
                                    block17: {
                                        block15: {
                                            by = (byte)n4;
                                            n3 = n5;
                                            if (this.field344) {
                                                n2 = n5;
                                                if (n5 > this.field358) {
                                                    n2 = this.field358;
                                                }
                                                by = (byte)n4;
                                                n3 = n2;
                                                if (n4 < 0) {
                                                    by = 0;
                                                    n3 = n2;
                                                }
                                            }
                                            if (by >= n3) {
                                                return;
                                            }
                                            n += by;
                                            n2 = n7 * by + n6;
                                            if (!this.field351) break block15;
                                            by = (byte)(n3 - by);
                                            n4 = by >> 2;
                                            n7 <<= 2;
                                            if (this.field350 != 0) break block16;
                                            break block17;
                                        }
                                        n4 = n3 - by;
                                        if (this.field350 == 0) break block18;
                                        break block19;
                                    }
                                    n3 = n;
                                    n5 = n2;
                                    if (n4 <= 0) break block20;
                                    break block21;
                                }
                                n6 = this.field350;
                                n8 = 256 - this.field350;
                                n3 = n;
                                n5 = n2;
                                if (n4 <= 0) break block22;
                                break block23;
                            }
                            n5 = n;
                            do {
                                n6 = Rasterizer3D.field334[n2 >> 8];
                                n = n2 + n7;
                                n2 = n5 + 1;
                                arrn[n5] = n6;
                                n3 = n2 + 1;
                                arrn[n2] = n6;
                                n2 = n3 + 1;
                                arrn[n3] = n6;
                                n3 = n2 + 1;
                                arrn[n2] = n6;
                                n6 = n4 - 1;
                                n5 = n3;
                                n4 = n6;
                                n2 = n;
                            } while (n6 > 0);
                            n5 = n;
                            break block20;
                        }
                        n5 = this.field350;
                        n6 = 256 - this.field350;
                        n3 = n2;
                        n2 = n4;
                        while (true) {
                            n4 = Rasterizer3D.field334[n3 >> 8];
                            n3 = n7 + n3;
                            by = (byte)arrn[n];
                            arrn[n] = ((n4 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + ((by & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + ((by & 0xFF00) * n5 >> 8 & 0xFF00) + (n6 * (n4 & 0xFF00) >> 8 & 0xFF00);
                            if (--n2 <= 0) {
                                return;
                            }
                            ++n;
                        }
                    }
                    while (true) {
                        arrn[n] = Rasterizer3D.field334[n2 >> 8];
                        n2 += n7;
                        if (--n4 <= 0) {
                            return;
                        }
                        ++n;
                    }
                }
                n5 = n2;
                n2 = n4;
                n3 = n;
                while (true) {
                    n4 = Rasterizer3D.field334[n5 >> 8];
                    n = n7 + n5;
                    n4 = (n8 * (n4 & 0xFF00FF) >> 8 & 0xFF00FF) + (n8 * (n4 & 0xFF00) >> 8 & 0xFF00);
                    int n9 = arrn[n3];
                    n5 = n3 + 1;
                    arrn[n3] = ((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + n4 + (n6 * (n9 & 0xFF00) >> 8 & 0xFF00);
                    n9 = arrn[n5];
                    n3 = n5 + 1;
                    arrn[n5] = ((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + n4 + (n6 * (n9 & 0xFF00) >> 8 & 0xFF00);
                    n9 = arrn[n3];
                    n5 = n3 + 1;
                    arrn[n3] = ((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + n4 + (n6 * (n9 & 0xFF00) >> 8 & 0xFF00);
                    n9 = arrn[n5];
                    n3 = n5 + 1;
                    arrn[n5] = ((n9 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + n4 + (n6 * (n9 & 0xFF00) >> 8 & 0xFF00);
                    if (--n2 <= 0) {
                        n5 = n;
                        break;
                    }
                    n5 = n;
                }
            }
            if ((n = by & 3) <= 0) return;
            n2 = Rasterizer3D.field334[n5 >> 8];
            while (true) {
                n4 = arrn[n3];
                arrn[n3] = ((n2 & 0xFF00FF) * n8 >> 8 & 0xFF00FF) + ((n4 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n8 * (n2 & 0xFF00) >> 8 & 0xFF00) + (n6 * (n4 & 0xFF00) >> 8 & 0xFF00);
                if (--n <= 0) {
                    return;
                }
                ++n3;
            }
        }
        if ((n = by & 3) <= 0) return;
        n2 = Rasterizer3D.field334[n5 >> 8];
        while (true) {
            arrn[n3] = n2;
            if (--n <= 0) {
                return;
            }
            ++n3;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aw")
    final void method7655(int[] var1_1, int[] var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12, int var13_13, int var14_14, int var15_15, int var16_16) {
        block77: {
            block75: {
                block76: {
                    block65: {
                        block63: {
                            block64: {
                                block74: {
                                    block73: {
                                        block72: {
                                            block70: {
                                                block71: {
                                                    block69: {
                                                        block68: {
                                                            block66: {
                                                                block67: {
                                                                    block51: {
                                                                        block52: {
                                                                            block62: {
                                                                                block61: {
                                                                                    block60: {
                                                                                        block58: {
                                                                                            block59: {
                                                                                                block57: {
                                                                                                    block56: {
                                                                                                        block54: {
                                                                                                            block55: {
                                                                                                                block53: {
                                                                                                                    block50: {
                                                                                                                        block48: {
                                                                                                                            block49: {
                                                                                                                                block47: {
                                                                                                                                    if (!this.field344) break block47;
                                                                                                                                    var4_4 = this.field358 * 865306523;
                                                                                                                                    var3_3 = var7_7;
                                                                                                                                    if (var7_7 <= var4_4 * -1949661549) break block48;
                                                                                                                                    break block49;
                                                                                                                                }
                                                                                                                                var4_4 = var7_7;
                                                                                                                                ** GOTO lbl-1000
                                                                                                                            }
                                                                                                                            var3_3 = this.field358;
                                                                                                                        }
                                                                                                                        var4_4 = var3_3;
                                                                                                                        if (var6_6 < 0) {
                                                                                                                            var4_4 = 0;
                                                                                                                            var6_6 = var3_3;
                                                                                                                        } else lbl-1000:
                                                                                                                        // 2 sources

                                                                                                                        {
                                                                                                                            var3_3 = var6_6;
                                                                                                                            var6_6 = var4_4;
                                                                                                                            var4_4 = var3_3;
                                                                                                                        }
                                                                                                                        if (var4_4 >= var6_6) {
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        var3_3 = var5_5 + var4_4;
                                                                                                                        var5_5 = var8_8 + var4_4 * var9_9;
                                                                                                                        var16_16 = var6_6 - var4_4;
                                                                                                                        if (!this.field353) break block50;
                                                                                                                        var7_7 = var10_10 + (var13_13 >> 3) * (var4_4 -= this.field352);
                                                                                                                        var8_8 = var11_11 + var4_4 * (var14_14 >> 3);
                                                                                                                        var18_20 = (var15_15 >> 3) * var4_4 + var12_12;
                                                                                                                        if ((var4_4 = var18_20 >> 12) == 0) break block51;
                                                                                                                        break block52;
                                                                                                                    }
                                                                                                                    var10_10 += (var13_13 >> 3) * (var4_4 -= this.field352);
                                                                                                                    var17_17 = var11_11 + var4_4 * (var14_14 >> 3);
                                                                                                                    var18_19 = var12_12 + (var15_15 >> 3) * var4_4;
                                                                                                                    if ((var4_4 = var18_19 >> 14) == 0) break block53;
                                                                                                                    var7_7 = var10_10 / var4_4;
                                                                                                                    var4_4 = var17_17 / var4_4;
                                                                                                                    if (var7_7 >= 0) break block54;
                                                                                                                    break block55;
                                                                                                                }
                                                                                                                var4_4 = 0;
                                                                                                            }
                                                                                                            var6_6 = 0;
                                                                                                            var8_8 = var4_4;
                                                                                                            break block56;
                                                                                                        }
                                                                                                        var8_8 = var4_4;
                                                                                                        var6_6 = var7_7;
                                                                                                        if (var7_7 > 16256) {
                                                                                                            var6_6 = 16256;
                                                                                                            var8_8 = var4_4;
                                                                                                        }
                                                                                                    }
                                                                                                    var11_11 = var13_13 + var10_10;
                                                                                                    var12_12 = var17_17 + var14_14;
                                                                                                    var17_17 = var18_19 + var15_15;
                                                                                                    var4_4 = var17_17 >> 14;
                                                                                                    if (var4_4 == 0) break block57;
                                                                                                    var18_19 = var11_11 / var4_4;
                                                                                                    var10_10 = var12_12 / var4_4;
                                                                                                    if (var18_19 >= 0) break block58;
                                                                                                    break block59;
                                                                                                }
                                                                                                var4_4 = 0;
                                                                                                var7_7 = 0;
                                                                                                break block60;
                                                                                            }
                                                                                            var4_4 = 0;
                                                                                            var7_7 = var10_10;
                                                                                            break block60;
                                                                                        }
                                                                                        var4_4 = var18_19;
                                                                                        var7_7 = var10_10;
                                                                                        if (var18_19 > 16256) {
                                                                                            var4_4 = 16256;
                                                                                            var7_7 = var10_10;
                                                                                        }
                                                                                    }
                                                                                    var10_10 = var8_8 + (var6_6 << 18);
                                                                                    var6_6 = (var7_7 - var8_8 >> 3) + (var4_4 - var6_6 >> 3 << 18);
                                                                                    var18_19 = var16_16 >> 3;
                                                                                    var21_21 = var9_9 << 3;
                                                                                    var8_8 = var5_5 >> 8;
                                                                                    if (!this.field356) break block61;
                                                                                    if (var18_19 <= 0) break block62;
                                                                                    break block63;
                                                                                }
                                                                                if (var18_19 > 0) break block64;
                                                                                var4_4 = var10_10;
                                                                                var11_11 = var8_8;
                                                                                var8_8 = var6_6;
                                                                                ** GOTO lbl223
                                                                            }
                                                                            var4_4 = var3_3;
                                                                            var3_3 = var10_10;
                                                                            break block65;
                                                                        }
                                                                        var6_6 = var7_7 / var4_4;
                                                                        var4_4 = var8_8 / var4_4;
                                                                        if (var6_6 >= 0) break block66;
                                                                        break block67;
                                                                    }
                                                                    var4_4 = 0;
                                                                }
                                                                var10_10 = 0;
                                                                var17_18 = var4_4;
                                                                break block68;
                                                            }
                                                            var17_18 = var4_4;
                                                            var10_10 = var6_6;
                                                            if (var6_6 > 4032) {
                                                                var10_10 = 4032;
                                                                var17_18 = var4_4;
                                                            }
                                                        }
                                                        var11_11 = var13_13 + var7_7;
                                                        var12_12 = var8_8 + var14_14;
                                                        var4_4 = (var18_20 += var15_15) >> 12;
                                                        if (var4_4 == 0) break block69;
                                                        var8_8 = var11_11 / var4_4;
                                                        var6_6 = var12_12 / var4_4;
                                                        if (var8_8 >= 0) break block70;
                                                        break block71;
                                                    }
                                                    var4_4 = 0;
                                                    var7_7 = 0;
                                                    break block72;
                                                }
                                                var4_4 = 0;
                                                var7_7 = var6_6;
                                                break block72;
                                            }
                                            var4_4 = var8_8;
                                            var7_7 = var6_6;
                                            if (var8_8 > 4032) {
                                                var4_4 = 4032;
                                                var7_7 = var6_6;
                                            }
                                        }
                                        var6_6 = (var4_4 - var10_10 >> 3 << 20) + (var7_7 - var17_18 >> 3);
                                        var19_29 = var16_16 >> 3;
                                        var22_30 = var9_9 << 3;
                                        var8_8 = var5_5 >> 8;
                                        var9_9 = var17_18 + (var10_10 << 20);
                                        if (!this.field356) break block73;
                                        if (var19_29 <= 0) break block74;
                                        break block75;
                                    }
                                    if (var19_29 > 0) break block76;
                                    var4_4 = var9_9;
                                    var17_18 = var8_8;
                                    var8_8 = var6_6;
                                    ** GOTO lbl406
                                }
                                var4_4 = var16_16;
                                break block77;
                            }
                            var20_23 = var10_10;
                            var9_9 = var8_8;
                            var19_27 = var3_3;
                            var10_10 = var6_6;
                            var8_8 = var4_4;
                            var6_6 = var18_19;
                            var3_3 = var17_17;
                            var4_4 = var20_23;
                            while (true) {
                                block82: {
                                    block81: {
                                        block79: {
                                            block80: {
                                                block78: {
                                                    if ((var17_17 = var2_2[(var4_4 & 16256) + (var4_4 >>> 25)]) != 0) {
                                                        var1_1[var19_27] = ((var17_17 & 65280) * var9_9 & 0xFF0000) + ((var17_17 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    var17_17 = var19_27 + 1;
                                                    var18_19 = var2_2[((var4_4 = var10_10 + var4_4) & 16256) + (var4_4 >>> 25)];
                                                    if (var18_19 != 0) {
                                                        var1_1[var17_17] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    ++var17_17;
                                                    var18_19 = var2_2[((var4_4 = var10_10 + var4_4) & 16256) + (var4_4 >>> 25)];
                                                    if (var18_19 != 0) {
                                                        var1_1[var17_17] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    ++var17_17;
                                                    var18_19 = var2_2[((var4_4 = var10_10 + var4_4) & 16256) + (var4_4 >>> 25)];
                                                    if (var18_19 != 0) {
                                                        var1_1[var17_17] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    ++var17_17;
                                                    var18_19 = var2_2[((var4_4 = var10_10 + var4_4) & 16256) + (var4_4 >>> 25)];
                                                    if (var18_19 != 0) {
                                                        var1_1[var17_17] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    ++var17_17;
                                                    var18_19 = var2_2[((var4_4 = var10_10 + var4_4) & 16256) + (var4_4 >>> 25)];
                                                    if (var18_19 != 0) {
                                                        var1_1[var17_17] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    ++var17_17;
                                                    var18_19 = var2_2[((var4_4 = var10_10 + var4_4) & 16256) + (var4_4 >>> 25)];
                                                    if (var18_19 != 0) {
                                                        var1_1[var17_17] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                    }
                                                    ++var17_17;
                                                    var4_4 = var10_10 + var4_4;
                                                    if ((var4_4 = var2_2[(var4_4 & 16256) + (var4_4 >>> 25)]) != 0) {
                                                        var1_1[var17_17] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
                                                    }
                                                    var9_9 = var17_17 + 1;
                                                    var17_17 = var13_13 + var11_11;
                                                    var12_12 += var14_14;
                                                    var18_19 = var3_3 + var15_15;
                                                    if ((var3_3 = var18_19 >> 14) == 0) break block78;
                                                    var11_11 = var17_17 / var3_3;
                                                    var10_10 = var12_12 / var3_3;
                                                    if (var11_11 >= 0) break block79;
                                                    break block80;
                                                }
                                                var4_4 = 0;
                                                var3_3 = 0;
                                                break block81;
                                            }
                                            var3_3 = 0;
                                            var4_4 = var10_10;
                                            break block81;
                                        }
                                        var4_4 = var10_10;
                                        var3_3 = var11_11;
                                        if (var11_11 > 16256) {
                                            var3_3 = 16256;
                                            var4_4 = var10_10;
                                        }
                                    }
                                    var10_10 = (var8_8 << 18) + var7_7;
                                    var8_8 = (var4_4 - var7_7 >> 3) + (var3_3 - var8_8 >> 3 << 18);
                                    var11_11 = (var5_5 += var21_21) >> 8;
                                    if (--var6_6 > 0) break block82;
                                    var4_4 = var10_10;
                                    var3_3 = var9_9;
lbl223:
                                    // 2 sources

                                    var5_5 = var16_16 & 7;
                                    if (var5_5 <= 0) return;
                                    do {
                                        if ((var6_6 = var2_2[(var4_4 & 16256) + (var4_4 >>> 25)]) != 0) {
                                            var1_1[var3_3] = (var11_11 * (var6_6 & 65280) & 0xFF0000) + (var11_11 * (var6_6 & 0xFF00FF) & -16711936) >> 8;
                                        }
                                        ++var3_3;
                                        var4_4 = var8_8 + var4_4;
                                        var5_5 = var6_6 = var5_5 - 1;
                                    } while (var6_6 > 0);
                                    return;
                                }
                                var7_7 = var4_4;
                                var4_4 = var10_10;
                                var10_10 = var8_8;
                                var8_8 = var3_3;
                                var3_3 = var18_19;
                                var19_27 = var9_9;
                                var9_9 = var11_11;
                                var11_11 = var17_17;
                            }
                        }
                        var20_24 = var10_10;
                        var9_9 = var8_8;
                        var19_28 = var3_3;
                        var10_10 = var6_6;
                        var8_8 = var4_4;
                        var6_6 = var18_19;
                        var3_3 = var17_17;
                        var4_4 = var20_24;
                        while (true) {
                            block87: {
                                block84: {
                                    block86: {
                                        block85: {
                                            block83: {
                                                var18_19 = var2_2[(var4_4 & 16256) + (var4_4 >>> 25)];
                                                var17_17 = var19_28 + 1;
                                                var1_1[var19_28] = ((var18_19 & 65280) * var9_9 & 0xFF0000) + ((var18_19 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var18_19 = var10_10 + var4_4;
                                                var19_28 = var2_2[(var18_19 >>> 25) + (var18_19 & 16256)];
                                                var4_4 = var17_17 + 1;
                                                var1_1[var17_17] = ((var19_28 & 65280) * var9_9 & 0xFF0000) + ((var19_28 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var18_19 = var10_10 + var18_19;
                                                var19_28 = var2_2[(var18_19 >>> 25) + (var18_19 & 16256)];
                                                var17_17 = var4_4 + 1;
                                                var1_1[var4_4] = ((var19_28 & 65280) * var9_9 & 0xFF0000) + ((var19_28 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var18_19 = var10_10 + var18_19;
                                                var19_28 = var2_2[(var18_19 >>> 25) + (var18_19 & 16256)];
                                                var4_4 = var17_17 + 1;
                                                var1_1[var17_17] = ((var19_28 & 65280) * var9_9 & 0xFF0000) + ((var19_28 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var18_19 = var10_10 + var18_19;
                                                var19_28 = var2_2[(var18_19 >>> 25) + (var18_19 & 16256)];
                                                var17_17 = var4_4 + 1;
                                                var1_1[var4_4] = ((var19_28 & 65280) * var9_9 & 0xFF0000) + ((var19_28 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var18_19 = var10_10 + var18_19;
                                                var19_28 = var2_2[(var18_19 >>> 25) + (var18_19 & 16256)];
                                                var4_4 = var17_17 + 1;
                                                var1_1[var17_17] = ((var19_28 & 65280) * var9_9 & 0xFF0000) + ((var19_28 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var17_17 = var10_10 + var18_19;
                                                var19_28 = var2_2[(var17_17 >>> 25) + (var17_17 & 16256)];
                                                var18_19 = var4_4 + 1;
                                                var1_1[var4_4] = ((var19_28 & 65280) * var9_9 & 0xFF0000) + ((var19_28 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                                var4_4 = var10_10 + var17_17;
                                                var4_4 = var2_2[(var4_4 & 16256) + (var4_4 >>> 25)];
                                                var17_17 = var18_19 + 1;
                                                var1_1[var18_19] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
                                                var18_19 = var13_13 + var11_11;
                                                var12_12 += var14_14;
                                                var19_28 = var3_3 + var15_15;
                                                if ((var3_3 = var19_28 >> 14) == 0) break block83;
                                                var10_10 = var18_19 / var3_3;
                                                var9_9 = var12_12 / var3_3;
                                                if (var10_10 >= 0) break block84;
                                                break block85;
                                            }
                                            var4_4 = 0;
                                            break block86;
                                        }
                                        var4_4 = var9_9;
                                    }
                                    var3_3 = 0;
                                    break block87;
                                }
                                var4_4 = var9_9;
                                var3_3 = var10_10;
                                if (var10_10 > 16256) {
                                    var3_3 = 16256;
                                    var4_4 = var9_9;
                                }
                            }
                            var11_11 = (var8_8 << 18) + var7_7;
                            var10_10 = (var4_4 - var7_7 >> 3) + (var3_3 - var8_8 >> 3 << 18);
                            var9_9 = (var5_5 += var21_21) >> 8;
                            if (--var6_6 <= 0) {
                                var3_3 = var11_11;
                                var6_6 = var10_10;
                                var4_4 = var17_17;
                                var8_8 = var9_9;
                                break;
                            }
                            var7_7 = var4_4;
                            var8_8 = var3_3;
                            var4_4 = var11_11;
                            var3_3 = var19_28;
                            var19_28 = var17_17;
                            var11_11 = var18_19;
                        }
                    }
                    var7_7 = var16_16 & 7;
                    if (var7_7 <= 0) return;
                    var5_5 = var3_3;
                    var3_3 = var7_7;
                    while (true) {
                        var7_7 = var2_2[(var5_5 >>> 25) + (var5_5 & 16256)];
                        var1_1[var4_4] = ((var7_7 & 0xFF00FF) * var8_8 & -16711936) + (var8_8 * (var7_7 & 65280) & 0xFF0000) >> 8;
                        var5_5 += var6_6;
                        if (--var3_3 <= 0) {
                            return;
                        }
                        ++var4_4;
                    }
                }
                var17_18 = var9_9;
                var9_9 = var8_8;
                var10_10 = var6_6;
                var20_25 = var3_3;
                var8_8 = var4_4;
                var6_6 = var19_29;
                var3_3 = var18_20;
                var4_4 = var17_18;
                while (true) {
                    block92: {
                        block91: {
                            block89: {
                                block90: {
                                    block88: {
                                        if ((var17_18 = var2_2[(var4_4 & 4032) + (var4_4 >>> 26)]) != 0) {
                                            var1_1[var20_25] = ((var17_18 & 65280) * var9_9 & 0xFF0000) + ((var17_18 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        var17_18 = var20_25 + 1;
                                        var18_20 = var2_2[((var4_4 = var10_10 + var4_4) & 4032) + (var4_4 >>> 26)];
                                        if (var18_20 != 0) {
                                            var1_1[var17_18] = ((var18_20 & 65280) * var9_9 & 0xFF0000) + ((var18_20 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        ++var17_18;
                                        var18_20 = var2_2[((var4_4 = var10_10 + var4_4) & 4032) + (var4_4 >>> 26)];
                                        if (var18_20 != 0) {
                                            var1_1[var17_18] = ((var18_20 & 65280) * var9_9 & 0xFF0000) + ((var18_20 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        ++var17_18;
                                        var18_20 = var2_2[((var4_4 = var10_10 + var4_4) & 4032) + (var4_4 >>> 26)];
                                        if (var18_20 != 0) {
                                            var1_1[var17_18] = ((var18_20 & 65280) * var9_9 & 0xFF0000) + ((var18_20 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        ++var17_18;
                                        var18_20 = var2_2[((var4_4 = var10_10 + var4_4) & 4032) + (var4_4 >>> 26)];
                                        if (var18_20 != 0) {
                                            var1_1[var17_18] = ((var18_20 & 65280) * var9_9 & 0xFF0000) + ((var18_20 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        ++var17_18;
                                        var18_20 = var2_2[((var4_4 = var10_10 + var4_4) & 4032) + (var4_4 >>> 26)];
                                        if (var18_20 != 0) {
                                            var1_1[var17_18] = ((var18_20 & 65280) * var9_9 & 0xFF0000) + ((var18_20 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        ++var17_18;
                                        var18_20 = var2_2[((var4_4 = var10_10 + var4_4) & 4032) + (var4_4 >>> 26)];
                                        if (var18_20 != 0) {
                                            var1_1[var17_18] = ((var18_20 & 65280) * var9_9 & 0xFF0000) + ((var18_20 & 0xFF00FF) * var9_9 & -16711936) >> 8;
                                        }
                                        ++var17_18;
                                        var4_4 = var10_10 + var4_4;
                                        if ((var4_4 = var2_2[(var4_4 & 4032) + (var4_4 >>> 26)]) != 0) {
                                            var1_1[var17_18] = ((var4_4 & 0xFF00FF) * var9_9 & -16711936) + ((var4_4 & 65280) * var9_9 & 0xFF0000) >> 8;
                                        }
                                        var9_9 = var17_18 + 1;
                                        var11_11 = var13_13 + var11_11;
                                        var12_12 += var14_14;
                                        var18_20 = var3_3 + var15_15;
                                        if ((var3_3 = var18_20 >> 12) == 0) break block88;
                                        var17_18 = var11_11 / var3_3;
                                        var10_10 = var12_12 / var3_3;
                                        if (var17_18 >= 0) break block89;
                                        break block90;
                                    }
                                    var4_4 = 0;
                                    var3_3 = 0;
                                    break block91;
                                }
                                var3_3 = 0;
                                var4_4 = var10_10;
                                break block91;
                            }
                            var4_4 = var10_10;
                            var3_3 = var17_18;
                            if (var17_18 > 4032) {
                                var3_3 = 4032;
                                var4_4 = var10_10;
                            }
                        }
                        var10_10 = var7_7 + (var8_8 << 20);
                        var8_8 = (var4_4 - var7_7 >> 3) + (var3_3 - var8_8 >> 3 << 20);
                        var17_18 = (var5_5 += var22_30) >> 8;
                        if (--var6_6 > 0) break block92;
                        var3_3 = var9_9;
                        var4_4 = var10_10;
lbl406:
                        // 2 sources

                        var6_6 = var16_16 & 7;
                        if (var6_6 <= 0) return;
                        var5_5 = var3_3;
                        var3_3 = var6_6;
                        do {
                            if ((var6_6 = var2_2[(var4_4 & 4032) + (var4_4 >>> 26)]) != 0) {
                                var1_1[var5_5] = (var17_18 * (var6_6 & 65280) & 0xFF0000) + ((var6_6 & 0xFF00FF) * var17_18 & -16711936) >> 8;
                            }
                            ++var5_5;
                            var4_4 = var8_8 + var4_4;
                            var3_3 = var6_6 = var3_3 - 1;
                        } while (var6_6 > 0);
                        return;
                    }
                    var7_7 = var4_4;
                    var4_4 = var10_10;
                    var10_10 = var8_8;
                    var8_8 = var3_3;
                    var3_3 = var18_20;
                    var20_25 = var9_9;
                    var9_9 = var17_18;
                }
            }
            var21_22 = var9_9;
            var10_10 = var8_8;
            var17_18 = var6_6;
            var6_6 = var5_5;
            var20_26 = var3_3;
            var3_3 = var16_16;
            var9_9 = var4_4;
            var8_8 = var19_29;
            var5_5 = var18_20;
            var4_4 = var21_22;
            while (true) {
                block97: {
                    block94: {
                        block96: {
                            block95: {
                                block93: {
                                    var18_20 = var2_2[(var4_4 & 4032) + (var4_4 >>> 26)];
                                    var16_16 = var20_26 + 1;
                                    var1_1[var20_26] = ((var18_20 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var18_20 & 65280) & 0xFF0000) >> 8;
                                    var18_20 = var17_18 + var4_4;
                                    var19_29 = var2_2[(var18_20 & 4032) + (var18_20 >>> 26)];
                                    var4_4 = var16_16 + 1;
                                    var1_1[var16_16] = ((var19_29 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var19_29 & 65280) & 0xFF0000) >> 8;
                                    var16_16 = var18_20 + var17_18;
                                    var19_29 = var2_2[(var16_16 & 4032) + (var16_16 >>> 26)];
                                    var18_20 = var4_4 + 1;
                                    var1_1[var4_4] = ((var19_29 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var19_29 & 65280) & 0xFF0000) >> 8;
                                    var4_4 = var17_18 + var16_16;
                                    var19_29 = var2_2[(var4_4 & 4032) + (var4_4 >>> 26)];
                                    var16_16 = var18_20 + 1;
                                    var1_1[var18_20] = ((var19_29 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var19_29 & 65280) & 0xFF0000) >> 8;
                                    var18_20 = var17_18 + var4_4;
                                    var4_4 = var3_3;
                                    var19_29 = var2_2[(var18_20 & 4032) + (var18_20 >>> 26)];
                                    var3_3 = var16_16 + 1;
                                    var1_1[var16_16] = ((var19_29 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var19_29 & 65280) & 0xFF0000) >> 8;
                                    var19_29 = var2_2[((var18_20 += var17_18) & 4032) + (var18_20 >>> 26)];
                                    var16_16 = var3_3 + 1;
                                    var1_1[var3_3] = ((var19_29 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var19_29 & 65280) & 0xFF0000) >> 8;
                                    var19_29 = var2_2[((var18_20 += var17_18) & 4032) + (var18_20 >>> 26)];
                                    var3_3 = var16_16 + 1;
                                    var1_1[var16_16] = ((var19_29 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var19_29 & 65280) & 0xFF0000) >> 8;
                                    var16_16 = var18_20 + var17_18;
                                    var17_18 = var2_2[(var16_16 & 4032) + (var16_16 >>> 26)];
                                    var16_16 = var3_3 + 1;
                                    var1_1[var3_3] = ((var17_18 & 0xFF00FF) * var10_10 & -16711936) + (var10_10 * (var17_18 & 65280) & 0xFF0000) >> 8;
                                    var18_20 = var13_13 + var11_11;
                                    var12_12 += var14_14;
                                    var19_29 = var5_5 + var15_15;
                                    var3_3 = var19_29 >> 12;
                                    if (var3_3 == 0) break block93;
                                    var11_11 = var18_20 / var3_3;
                                    var10_10 = var12_12 / var3_3;
                                    if (var11_11 >= 0) break block94;
                                    break block95;
                                }
                                var5_5 = 0;
                                break block96;
                            }
                            var5_5 = var10_10;
                        }
                        var3_3 = 0;
                        break block97;
                    }
                    var5_5 = var10_10;
                    var3_3 = var11_11;
                    if (var11_11 > 4032) {
                        var3_3 = 4032;
                        var5_5 = var10_10;
                    }
                }
                var11_11 = (var9_9 << 20) + var7_7;
                var17_18 = (var3_3 - var9_9 >> 3 << 20) + (var5_5 - var7_7 >> 3);
                var21_22 = var22_30 + var6_6;
                var10_10 = var21_22 >> 8;
                if (--var8_8 <= 0) {
                    var9_9 = var11_11;
                    var3_3 = var16_16;
                    var6_6 = var17_18;
                    var8_8 = var10_10;
                    break;
                }
                var7_7 = var5_5;
                var6_6 = var4_4;
                var4_4 = var11_11;
                var5_5 = var19_29;
                var9_9 = var3_3;
                var3_3 = var6_6;
                var20_26 = var16_16;
                var6_6 = var21_22;
                var11_11 = var18_20;
            }
        }
        if ((var4_4 &= 7) <= 0) return;
        var5_5 = var9_9;
        while (true) {
            var7_7 = var2_2[(var5_5 & 4032) + (var5_5 >>> 26)];
            var1_1[var3_3] = ((var7_7 & 0xFF00FF) * var8_8 & -16711936) + (var8_8 * (var7_7 & 65280) & 0xFF0000) >> 8;
            var5_5 += var6_6;
            if (--var4_4 <= 0) {
                return;
            }
            ++var3_3;
        }
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-526308908")
    public void vmethod7646() {
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([IIII)V", garbageValue="-615136225")
    public final void method7656(int[] arrn, int n, int n2) {
        this.field4641 = arrn;
        this.field346 = n;
        this.field343 = n2;
        this.method656(0, 0, n, n2, 65280);
        this.method654();
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;B)V", garbageValue="43")
    public static void method7636(Collection collection) {
        collection.add(SequenceDefinition.SequenceDefinition_cached);
        collection.add(SequenceDefinition.SequenceDefinition_cachedFrames);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lml;", garbageValue="-107414640")
    public static class190 method7635() {
        class341 class3412 = new class341();
        return class3412;
    }

    @ObfuscatedName(value="cy")
    static void method7637(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        if (n11 < 255) {
            int n13 = 255 - n11;
            int n14 = n11 << 24;
            n7 = -n7;
            n = n4;
            n4 = n3;
            n3 = n7;
            while (true) {
                if (n3 < 0) {
                    n12 = n2;
                } else {
                    return;
                }
                for (n7 = -n6; n7 < 0; ++n7) {
                    int n15 = arrn2[n10 * (n4 >> 16) + (n12 >> 16)];
                    if (n15 != 0) {
                        int n16 = arrn[n];
                        if (n16 == 0) {
                            n16 = n + 1;
                            arrn[n] = n15 & 0xFFFFFF | n14;
                            n = n16;
                        } else {
                            arrn[n] = (0xFF0000 & (n15 & 0xFF00) * n11 + n13 * (n16 & 0xFF00)) + ((n16 & 0xFF00FF) * n13 + (n15 & 0xFF00FF) * n11 & 0xFF00FF00) >>> 8 | (n16 | n14) & 0xFF000000;
                            ++n;
                        }
                    } else {
                        ++n;
                    }
                    n12 += n8;
                }
                n4 += n9;
                ++n3;
                n += n5;
            }
        }
        class372.method12966(arrn, arrn2, 0, n2, n3, n4, n5, n6, n7, n8, n9, n10, (short)-2137);
    }
}

