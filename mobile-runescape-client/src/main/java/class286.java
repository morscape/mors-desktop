/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ej")
public class class286
extends class72 {
    public class286(int[] arrn, int n, int n2) {
        super(arrn, n, n2);
    }

    @Override
    @ObfuscatedName(value="aa")
    public final void vmethod10745(int n, int n2, int n3, int n4, byte by) {
        if (n >= this.field2530) {
            if (n < this.field2528) {
                int n5 = n2;
                by = (byte)n3;
                if (n2 < this.field2531) {
                    by = (byte)(n3 - (this.field2531 - n2));
                    n5 = this.field2531;
                }
                n2 = by;
                if (by + n5 > this.field2526) {
                    n2 = this.field2526 - n5;
                }
                by = (byte)(this.field2525 * 1493422429);
                n3 = 0;
                while (true) {
                    if (n3 >= n2) {
                        return;
                    }
                    this.field2529[n3 * this.field2525 + by * n5 * -1809380619 + n] = n4 | 0xFF000000;
                    ++n3;
                }
            }
        } else {
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ae")
    public void vmethod10747(int n) {
        if (this.field2529 != null) {
            ak.method3384(this.field2529, this.field2529.length);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @ObfuscatedName(value="af")
    public final void vmethod10748(int n, int n2, int n3, int n4, int n5, byte by) {
        int n6;
        int n7;
        block14: {
            block15: {
                block13: {
                    n7 = n5 - 0x1000000 & 0xFFFFFF;
                    n5 = n3 - n;
                    if ((n4 -= n2) == 0) {
                        if (n5 >= 0) {
                            this.vmethod10752(n, n2, n5 + 1, n7, -1817384380);
                            return;
                        }
                        this.vmethod10752(n5 + n, n2, -n5 + 1, n7, 252053151);
                        return;
                    }
                    if (n5 == 0) {
                        if (n4 >= 0) {
                            this.vmethod10745(n, n2, n4 + 1, n7, (byte)104);
                            return;
                        }
                        this.vmethod10745(n, n2 + n4, -n4 + 1, n7, (byte)66);
                        return;
                    }
                    if (n5 + n4 < 0) {
                        n = n5 + n;
                        n5 = -n5;
                        n3 = n2 + n4;
                        n4 = -n4;
                        n2 = n5;
                    } else {
                        n3 = n2;
                        n2 = n5;
                    }
                    if (n2 <= n4) break block13;
                    n5 = (n3 << 16) + 32768;
                    n6 = (int)Math.floor((double)(n4 << 16) / (double)n2 + 0.5);
                    by = (byte)(n2 + n);
                    n3 = n;
                    n2 = n5;
                    if (n >= this.field2530) break block14;
                    break block15;
                }
                n5 = (n << 16) + 32768;
                int n8 = (int)Math.floor((double)(n2 << 16) / (double)n4 + 0.5);
                by = (byte)(n3 + n4);
                n2 = n5;
                n = n3;
                if (n3 < this.field2531) {
                    n2 = n5 + n8 * (this.field2531 - n3);
                    n = this.field2531;
                }
                n5 = n2;
                n3 = by;
                n4 = n;
                if (by >= this.field2526) {
                    n3 = this.field2526 - 1;
                    n4 = n;
                    n5 = n2;
                }
                while (n4 <= n3) {
                    n = n5 >> 16;
                    if (n >= this.field2530 && n < this.field2528) {
                        this.field2529[n4 * this.field2525 + n] = n7;
                    }
                    n5 += n8;
                    ++n4;
                }
                return;
            }
            n2 = n5 + n6 * (this.field2530 - n);
            n3 = this.field2530;
        }
        n4 = n3;
        n = by;
        n5 = n2;
        if (by >= this.field2528) {
            n = this.field2528 - 1;
            n5 = n2;
            n4 = n3;
        }
        while (n4 <= n) {
            n2 = n5 >> 16;
            if (n2 >= this.field2531 && n2 < this.field2526) {
                this.field2529[n2 * this.field2525 + n4] = n7;
            }
            n5 += n6;
            ++n4;
        }
    }

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Lek;IIII)V")
    public void vmethod10749(class384 class3842, int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n + class3842.field7131;
        n4 = n2 + class3842.field7126;
        n = n4 * this.field2525 + n6;
        n2 = class3842.field7127;
        int n7 = class3842.field7125;
        int n8 = this.field2525 - n7;
        int n9 = this.field2531 * 221165805;
        int n10 = 0;
        if (n4 >= n9 * 30958821) {
            n9 = 0;
        } else {
            n5 = this.field2531 - n4;
            n2 -= n5;
            n4 = this.field2531;
            n9 = n5 * n7 + 0;
            n = n5 * this.field2525 + n;
        }
        n4 = n2 + n4;
        int n11 = n2;
        if (n4 > this.field2526) {
            n11 = n2 - (n4 - this.field2526);
        }
        int n12 = n6;
        int n13 = n;
        n5 = n7;
        n2 = n8;
        int n14 = n9;
        n4 = n10;
        if (n6 < this.field2530) {
            n2 = this.field2530 - n6;
            n5 = n7 - n2;
            n12 = this.field2530;
            n14 = n2 + n9;
            n13 = n2 + n;
            n4 = n2 + 0;
            n2 += n8;
        }
        n8 = n12 + n5;
        n = n5;
        n9 = n2;
        n12 = n4;
        if (n8 > this.field2528) {
            n9 = n8 - this.field2528;
            n = n5 - n9;
            n12 = n4 + n9;
            n9 = n2 + n9;
        }
        if (n > 0) {
            if (n11 <= 0) {
                return;
            }
            if (n3 != 256) {
                Client.method7891(0, 0, 0, this.field2529, class3842.field7129, n14, 0, n13, 0, n, n11, n9, n12, n3);
                return;
            }
            class298.method10981(0, 0, 0, this.field2529, class3842.field7129, n14, 0, n13, 0, n, n11, n9, n12);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ah")
    public final void vmethod10750(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n3 > 0) {
            int n10;
            if (n4 <= 0) {
                return;
            }
            int n11 = 0;
            int n12 = 65536 / n4;
            if (n >= this.field2530) {
                n9 = n;
                n = n3;
            } else {
                n10 = this.field2530 * -1938025425;
                n9 = this.field2530 * -1938025425;
                n = n3 - (n10 * -1999785265 - n);
                n9 *= -1999785265;
            }
            if (n2 >= this.field2531) {
                n3 = n4;
                n10 = n2;
                n2 = n11;
            } else {
                n11 = n12 * (this.field2531 - n2) + 0;
                n3 = this.field2531 * 221165805;
                n10 = this.field2531 * 221165805;
                n3 = n4 - (n3 * 30958821 - n2);
                n10 *= 30958821;
                n2 = n11;
            }
            n4 = n;
            if (n9 + n > this.field2528) {
                n4 = this.field2528 - n9;
            }
            n = n3;
            if (n3 + n10 > this.field2526) {
                n = this.field2526 - n10;
            }
            n11 = this.field2525 * 1493422429;
            n9 = n10 * this.field2525 + n9;
            n3 = -n;
            n = n9;
            while (true) {
                block16: {
                    if (n3 < 0) {
                        n9 = 65536 - n2 >> 8;
                        int n13 = n2 >> 8;
                        n10 = (n7 * n9 + n13 * n8 & 0xFF00) >>> 8;
                        if (n10 != 0) {
                            n13 = (0xFF0000 & n9 * (n5 & 0xFF00) + n13 * (n6 & 0xFF00)) + ((n6 & 0xFF00FF) * n13 + (n5 & 0xFF00FF) * n9 & 0xFF00FF00) >>> 8;
                            int n14 = n10 << 24;
                            int n15 = 255 - n10;
                            n9 = -n4;
                            while (true) {
                                if (n9 >= 0) {
                                    n = n11 * -1809380619 - n4 + n;
                                    n2 = n12 + n2;
                                    break block16;
                                }
                                int n16 = this.field2529[n];
                                if (n16 != 0) {
                                    this.field2529[n] = (n16 | n14) & 0xFF000000 | ((n16 & 0xFF00FF) * n15 >> 8 & 0xFF00FF) + (n10 * (n13 & 0xFF00) >> 8 & 0xFF00) + (n15 * (n16 & 0xFF00) >> 8 & 0xFF00) + ((n13 & 0xFF00FF) * n10 >> 8 & 0xFF00FF);
                                    ++n;
                                } else {
                                    this.field2529[n] = n14 | n13;
                                    ++n;
                                }
                                ++n9;
                            }
                        }
                    } else {
                        return;
                    }
                    n = this.field2525 + n;
                    n2 = n12 + n2;
                }
                ++n3;
            }
        }
    }

    @Override
    @ObfuscatedName(value="aj")
    public final void vmethod10752(int n, int n2, int n3, int n4, int n5) {
        if (n2 >= this.field2531) {
            if (n2 < this.field2526) {
                int n6 = n;
                n5 = n3;
                if (n < this.field2530) {
                    n5 = n3 - (this.field2530 - n);
                    n6 = this.field2530;
                }
                n = n5;
                if (n5 + n6 > this.field2528) {
                    n = this.field2528 - n6;
                }
                n5 = this.field2525 * 1493422429;
                n3 = 0;
                while (true) {
                    if (n3 >= n) {
                        return;
                    }
                    this.field2529[n3 + n6 + n5 * n2 * -1809380619] = n4 | 0xFF000000;
                    ++n3;
                }
            }
        } else {
            return;
        }
    }

    @Override
    @ObfuscatedName(value="al")
    final void vmethod10754(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 <= 0) {
            return;
        }
        if (n5 < 255) {
            if (n2 >= this.field2531) {
                if (n2 < this.field2526) {
                    int n7 = n;
                    n6 = n3;
                    if (n < this.field2530) {
                        n6 = n3 - (this.field2530 - n);
                        n7 = this.field2530;
                    }
                    n3 = n6;
                    if (n7 + n6 > this.field2528) {
                        n3 = this.field2528 - n7;
                    }
                    n6 = 255 - n5;
                    int n8 = n5 << 24;
                    n = n2 * this.field2525 + n7;
                    n2 = 0;
                    while (true) {
                        if (n2 >= n3) {
                            return;
                        }
                        if (this.field2529[n] != 0) {
                            n7 = this.field2529[n];
                            int n9 = this.field2529[n];
                            int n10 = this.field2529[n];
                            int n11 = this.field2529[n];
                            this.field2529[n] = (n11 | n8) & 0xFF000000 | ((n9 >> 8 & 0xFF) * n6 + n5 * (n4 >> 8 & 0xFF) >> 8 << 8) + ((n7 >> 16 & 0xFF) * n6 + (n4 >> 16 & 0xFF) * n5 >> 8 << 16) + (n5 * (n4 & 0xFF) + (n10 & 0xFF) * n6 >> 8);
                            ++n;
                        } else {
                            this.field2529[n] = n4 | n8;
                            ++n;
                        }
                        ++n2;
                    }
                }
            } else {
                return;
            }
            return;
        }
        this.vmethod10752(n, n2, n3, n4, -365014896);
    }

    @Override
    @ObfuscatedName(value="am")
    public final void vmethod10755(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n2;
        int n8 = n3;
        if (n5 == 0) {
            return;
        }
        if (n5 < 255) {
            n6 = n8;
            if (n8 < 0) {
                n6 = -n8;
            }
            n2 = n4 & 0xFFFFFF;
            int n9 = n2 + (n5 << 24);
            int n10 = (n5 * (n2 & 0xFF00FF) >> 8 & 0xFF00FF) + (n5 * (n2 & 0xFF00) >> 8 & 0xFF00);
            int n11 = 255 - n5;
            n8 = n2 = n7 - n6;
            if (n2 < this.field2531) {
                n8 = this.field2531;
            }
            n3 = n2 = n7 + n6 + 1;
            if (n2 > this.field2526) {
                n3 = this.field2526;
            }
            int n12 = n6 * n6;
            int n13 = 0;
            int n14 = n7 - n8;
            int n15 = n14 * n14;
            int n16 = n15 - n14;
            n2 = n7;
            n4 = n8;
            int n17 = n13;
            int n18 = n14;
            int n19 = n15;
            int n20 = n16;
            if (n7 > n3) {
                n2 = n3;
                n20 = n16;
                n19 = n15;
                n18 = n14;
                n17 = n13;
                n4 = n8;
            }
            block0: while (true) {
                if (n4 >= n2) {
                    n17 = -n18;
                    n2 = n12 + n17 * n17;
                    n8 = n2 - n6;
                    n2 -= n17;
                    n19 = n4;
                    n4 = n17;
                    block1: while (true) {
                        if (n19 < n3) {
                        } else {
                            return;
                        }
                        for (n17 = n2; n17 > n12 && n8 > n12; n17 -= n2 + n6, n8 -= n2 + n2) {
                            n2 = n6 - 1;
                            n6 = n2;
                        }
                        n2 = n20 = n - n6;
                        if (n20 < this.field2530) {
                            n2 = this.field2530;
                        }
                        n20 = n18 = n6 + n;
                        if (n18 > this.field2528 - 1) {
                            n20 = this.field2528 - 1;
                        }
                        n7 = n19 * this.field2525 + n2;
                        n18 = n2;
                        while (true) {
                            if (n18 > n20) {
                                ++n19;
                                n2 = n17 + n4 + n4;
                                n17 = n4 + 1;
                                n8 = n8 + n17 + n4;
                                n4 = n17;
                                continue block1;
                            }
                            n13 = this.field2529[n7];
                            if (n13 != 0) {
                                n2 = (n13 & 0xFF000000) == 0 ? -16777216 : (n13 | n5) & 0xFF000000;
                                this.field2529[n7] = n2 | ((n13 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + n10 + (n11 * (n13 & 0xFF00) >> 8 & 0xFF00);
                                n2 = n7 + 1;
                            } else {
                                this.field2529[n7] = n9;
                                n2 = n7 + 1;
                            }
                            ++n18;
                            n7 = n2;
                        }
                        break;
                    }
                }
                n8 = n17;
                n7 = n19;
                while (true) {
                    if (n20 > n12 && n7 > n12) {
                        n19 = n17 = n - n8 + 1;
                        if (n17 < this.field2530) {
                            n19 = this.field2530;
                        }
                        n17 = n13 = n8 + n;
                        if (n13 > this.field2528) {
                            n17 = this.field2528;
                        }
                        n14 = n19 + n4 * this.field2525;
                        n13 = n19;
                        n19 = n14;
                        while (true) {
                            if (n13 >= n17) {
                                ++n4;
                                n17 = n18 - 1;
                                n19 = n7 - (n18 + n17);
                                n18 = n17;
                                n20 -= n17 + n17;
                                n17 = n8;
                                continue block0;
                            }
                            n15 = this.field2529[n19];
                            if (n15 != 0) {
                                n14 = (n15 & 0xFF000000) == 0 ? -16777216 : (n15 | n5) & 0xFF000000;
                                this.field2529[n19] = n14 | ((n15 & 0xFF00FF) * n11 >> 8 & 0xFF00FF) + n10 + (n11 * (n15 & 0xFF00) >> 8 & 0xFF00);
                                ++n19;
                            } else {
                                this.field2529[n19] = n9;
                                ++n19;
                            }
                            ++n13;
                        }
                    }
                    n7 = n7 + n8 + n8;
                    n19 = n8 + 1;
                    n20 = n20 + n8 + n19;
                    n8 = n19;
                }
                break;
            }
        }
        this.vmethod10758(n, n2, n3, n4, -605594679);
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lek;III)V")
    public final void vmethod10756(class384 class3842, int n, int n2, int n3) {
        int n4;
        int n5 = n + class3842.field7131;
        int n6 = n2 + class3842.field7126;
        n2 = n5 + n6 * this.field2525;
        n3 = class3842.field7127;
        int n7 = class3842.field7125;
        int n8 = this.field2525 - n7;
        n = this.field2531 * 221165805;
        int n9 = 0;
        if (n6 >= n * 30958821) {
            n = 0;
        } else {
            n4 = this.field2531 - n6;
            n3 -= n4;
            n6 = this.field2531;
            n = n7 * n4 + 0;
            n2 += n4 * this.field2525;
        }
        int n10 = n3;
        if ((n6 += n3) > this.field2526) {
            n10 = n3 - (n6 - this.field2526);
        }
        n4 = n7;
        n3 = n8;
        int n11 = n;
        n6 = n9;
        int n12 = n5;
        n9 = n2;
        if (n5 < this.field2530) {
            n3 = this.field2530 - n5;
            n4 = n7 - n3;
            n12 = this.field2530;
            n11 = n + n3;
            n9 = n2 + n3;
            n6 = n3 + 0;
            n3 = n8 + n3;
        }
        n8 = n12 + n4;
        n = n4;
        n2 = n3;
        n12 = n6;
        if (n8 > this.field2528) {
            n2 = n8 - this.field2528;
            n = n4 - n2;
            n12 = n2 + n6;
            n2 += n3;
        }
        if (n > 0) {
            if (n10 <= 0) {
                return;
            }
            class261.method7513(this.field2529, class3842.field7129, n11, n9, n, n10, n2, n12, (byte)24);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(Lei;III)V")
    public void vmethod10757(IndexedSprite indexedSprite, int n, int n2, int n3) {
        int n4;
        int n5 = n + indexedSprite.field7118;
        int n6 = n2 + indexedSprite.field7123;
        n2 = n5 + n6 * this.field2525;
        n3 = indexedSprite.field7124;
        int n7 = indexedSprite.field7119;
        int n8 = this.field2525 - n7;
        n = this.field2531 * 221165805;
        int n9 = 0;
        if (n6 >= n * 30958821) {
            n = 0;
        } else {
            n4 = this.field2531 - n6;
            n3 -= n4;
            n6 = this.field2531;
            n = n4 * n7 + 0;
            n2 += n4 * this.field2525;
        }
        int n10 = n3;
        if ((n6 += n3) > this.field2526) {
            n10 = n3 - (n6 - this.field2526);
        }
        n4 = n7;
        n3 = n8;
        int n11 = n;
        n6 = n9;
        int n12 = n5;
        n9 = n2;
        if (n5 < this.field2530) {
            n3 = this.field2530 - n5;
            n4 = n7 - n3;
            n12 = this.field2530;
            n11 = n + n3;
            n9 = n2 + n3;
            n6 = n3 + 0;
            n3 = n8 + n3;
        }
        n8 = n12 + n4;
        n = n4;
        n2 = n3;
        n12 = n6;
        if (n8 > this.field2528) {
            n2 = n8 - this.field2528;
            n = n4 - n2;
            n12 = n2 + n6;
            n2 += n3;
        }
        if (n > 0) {
            if (n10 <= 0) {
                return;
            }
            class274.method7827(this.field2529, indexedSprite.field7121, indexedSprite.palette, n11, n9, n, n10, n2, n12, (byte)-116);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="aq")
    public final void vmethod10758(int n, int n2, int n3, int n4, int n5) {
        int n6 = n2;
        n2 = n3;
        int n7 = n4 | 0xFF000000;
        if (n2 != 0) {
            n3 = n2;
            if (n2 < 0) {
                n3 = -n2;
            }
            n5 = n2 = n6 - n3;
            if (n2 < this.field2531) {
                n5 = this.field2531;
            }
            n2 = n4 = n3 + n6 + 1;
            if (n4 > this.field2526) {
                n2 = this.field2526;
            }
            int n8 = n3 * n3;
            int n9 = 0;
            int n10 = n6 - n5;
            int n11 = n10 * n10;
            int n12 = n11 - n10;
            int n13 = n6;
            n4 = n5;
            int n14 = n9;
            int n15 = n10;
            int n16 = n11;
            int n17 = n12;
            if (n6 > n2) {
                n13 = n2;
                n17 = n12;
                n16 = n11;
                n15 = n10;
                n14 = n9;
                n4 = n5;
            }
            block0: while (true) {
                if (n4 >= n13) {
                    n13 = n4 - n13;
                    n5 = n8 + n13 * n13;
                    n16 = n5 - n3;
                    n5 -= n13;
                    n17 = n4;
                    n4 = n13;
                    block1: while (true) {
                        if (n17 < n2) {
                            n13 = n5;
                            n5 = n3;
                        } else {
                            return;
                        }
                        while (n13 > n8 && n16 > n8) {
                            n3 = n5 - 1;
                            n13 -= n3 + n5;
                            n16 -= n3 + n3;
                            n5 = n3;
                        }
                        n3 = n15 = n - n5;
                        if (n15 < this.field2530) {
                            n3 = this.field2530;
                        }
                        n15 = n6 = n5 + n;
                        if (n6 > this.field2528 - 1) {
                            n15 = this.field2528 - 1;
                        }
                        n6 = n3 + n17 * this.field2525;
                        while (true) {
                            if (n3 > n15) {
                                ++n17;
                                n13 = n13 + n4 + n4;
                                n3 = n4 + 1;
                                n16 = n3 + n16 + n4;
                                n4 = n3;
                                n3 = n5;
                                n5 = n13;
                                continue block1;
                            }
                            this.field2529[n6] = n7;
                            ++n3;
                            ++n6;
                        }
                        break;
                    }
                }
                n6 = n16;
                n16 = n14;
                while (true) {
                    if (n17 > n8 && n6 > n8) {
                        n5 = n14 = n - n16 + 1;
                        if (n14 < this.field2530) {
                            n5 = this.field2530;
                        }
                        n14 = n9 = n16 + n;
                        if (n9 > this.field2528) {
                            n14 = this.field2528;
                        }
                        n10 = n5 + n4 * this.field2525;
                        n9 = n5;
                        n5 = n10;
                        while (true) {
                            if (n9 >= n14) {
                                ++n4;
                                n14 = n15 - 1;
                                n5 = n6 - (n15 + n14);
                                n17 -= n14 + n14;
                                n15 = n14;
                                n14 = n16;
                                n16 = n5;
                                continue block0;
                            }
                            this.field2529[n5] = n7;
                            ++n9;
                            ++n5;
                        }
                    }
                    n6 = n6 + n16 + n16;
                    n5 = n16 + 1;
                    n17 = n5 + n17 + n16;
                    n16 = n5;
                }
                break;
            }
        }
        this.method4241(n, n6, n7);
    }

    @Override
    @ObfuscatedName(value="as")
    public final void vmethod10759(int n, int n2, int n3, int n4, int n5, int n6, byte[] arrby, int n7, boolean bl, int n8) {
        block11: {
            block13: {
                block12: {
                    block15: {
                        int n9;
                        int n10;
                        int n11;
                        int n12;
                        int n13;
                        block14: {
                            n13 = n3 + n;
                            if (n13 < 0) break block11;
                            n12 = n2 + n4;
                            if (n12 < 0) {
                                return;
                            }
                            if (n >= this.field2525) break block12;
                            if (n2 >= this.field2527) break block13;
                            n11 = 0;
                            if (n < 0) {
                                n8 = 0 - n;
                                n3 = n13;
                            } else {
                                n8 = 0;
                            }
                            if (n2 < 0) {
                                n11 = 0 - n2;
                                n4 = n12;
                            }
                            n12 = n3;
                            if (n3 + n > this.field2525) {
                                n12 = this.field2525 - n;
                            }
                            n13 = n4;
                            if (n2 + n4 > this.field2527) {
                                n13 = this.field2527 - n2;
                            }
                            n10 = arrby.length / n7;
                            n9 = this.field2525 - n12;
                            if (n5 >>> 24 == 255 && n6 >>> 24 == 255) break block14;
                            n4 = n11 + n2;
                            n3 = n8 + n4 * this.field2525 + n;
                            for (n11 = n4; n11 < n13 + n4; ++n11) {
                                int n14;
                                for (int i = n14 = n8 + n; i < n12 + n14; ++i) {
                                    int n15 = arrby[n7 * ((n11 - n2) % n10) + (i - n) % n7] != 0 ? n6 : n5;
                                    int n16 = this.field2529[n3];
                                    if (n16 != 0) {
                                        int n17 = n15 >>> 24;
                                        int n18 = 255 - n17;
                                        this.field2529[n3] = (n15 | n16) & 0xFF000000 | ((n15 & 0xFF00FF) * n17 + (n16 & 0xFF00FF) * n18 & 0xFF00FF00) + (0xFF0000 & n18 * (n16 & 0xFF00) + n17 * (n15 & 0xFF00)) >>> 8;
                                        ++n3;
                                        continue;
                                    }
                                    this.field2529[n3] = n15;
                                    ++n3;
                                }
                                n3 += n9;
                            }
                            break block15;
                        }
                        n3 = this.field2525 * 1493422429;
                        int n19 = n11 + n2;
                        n3 = n8 + n3 * n19 * -1809380619 + n;
                        block2: for (n4 = n19; n4 < n13 + n19; ++n4) {
                            int n20;
                            n11 = n20 = n8 + n;
                            while (true) {
                                block18: {
                                    int n21;
                                    int[] arrn;
                                    block17: {
                                        block16: {
                                            if (n11 >= n20 + n12) break block16;
                                            if (arrby[n7 * ((n4 - n2) % n10) + (n11 - n) % n7] != 0) break block17;
                                            arrn = this.field2529;
                                            n21 = n3 + 1;
                                            arrn[n3] = n5;
                                            n3 = n21;
                                            break block18;
                                        }
                                        n3 += n9;
                                        continue block2;
                                    }
                                    arrn = this.field2529;
                                    n21 = n3 + 1;
                                    arrn[n3] = n6;
                                    n3 = n21;
                                }
                                ++n11;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lek;III)V")
    public final void vmethod10761(class384 class3842, int n, int n2, int n3) {
        int n4;
        int n5 = n + class3842.field7131;
        int n6 = n2 + class3842.field7126;
        n2 = n5 + n6 * this.field2525;
        n3 = class3842.field7127;
        int n7 = class3842.field7125;
        int n8 = this.field2525 - n7;
        n = this.field2531 * 221165805;
        int n9 = 0;
        if (n6 >= n * 30958821) {
            n = 0;
        } else {
            n4 = this.field2531 - n6;
            n3 -= n4;
            n6 = this.field2531;
            n = n7 * n4 + 0;
            n2 += n4 * this.field2525;
        }
        int n10 = n3;
        if ((n6 += n3) > this.field2526) {
            n10 = n3 - (n6 - this.field2526);
        }
        n4 = n7;
        n3 = n8;
        int n11 = n;
        n6 = n9;
        int n12 = n5;
        n9 = n2;
        if (n5 < this.field2530) {
            n3 = this.field2530 - n5;
            n4 = n7 - n3;
            n12 = this.field2530;
            n11 = n + n3;
            n9 = n2 + n3;
            n6 = n3 + 0;
            n3 = n8 + n3;
        }
        n8 = n12 + n4;
        n = n4;
        n2 = n3;
        n12 = n6;
        if (n8 > this.field2528) {
            n2 = n8 - this.field2528;
            n = n4 - n2;
            n12 = n2 + n6;
            n2 += n3;
        }
        if (n > 0) {
            if (n10 <= 0) {
                return;
            }
            WorldMapScaleHandler.method1023(this.field2529, class3842.field7129, 0, n11, n9, n, n10, n2, n12, (short)-13081);
            return;
        }
    }

    @ObfuscatedName(value="ay")
    void method10537(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n;
        n6 = n3;
        if (n < this.field2530) {
            n6 = n3 - (this.field2530 - n);
            n7 = this.field2530;
        }
        n3 = n2;
        n = n4;
        if (n2 < this.field2531) {
            n = n4 - (this.field2531 - n2);
            n3 = this.field2531;
        }
        n2 = n6;
        if (n7 + n6 > this.field2528) {
            n2 = this.field2528 - n7;
        }
        n4 = n;
        if (n3 + n > this.field2526) {
            n4 = this.field2526 - n3;
        }
        n6 = this.field2525 * 1493422429;
        n = n3 * this.field2525 + n7;
        block0: for (n3 = -n4; n3 < 0; ++n3) {
            n4 = -n2;
            while (true) {
                if (n4 >= 0) {
                    n = n6 * -1809380619 - n2 + n;
                    continue block0;
                }
                this.field2529[n] = n5;
                ++n4;
                ++n;
            }
        }
    }

    @Override
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lek;IIIII)V")
    public void vmethod10763(class384 class3842, int n, int n2, int n3, int n4, int n5) {
        if (n3 > 0) {
            int n6;
            if (n4 <= 0) {
                return;
            }
            int n7 = class3842.field7125;
            int n8 = class3842.field7127;
            int n9 = class3842.field7130;
            int n10 = class3842.field7128;
            int n11 = (n9 << 16) / n3;
            int n12 = (n10 << 16) / n4;
            int n13 = class3842.field7131;
            n5 = 0;
            if (n13 <= 0) {
                n13 = n;
                n = 0;
            } else {
                n6 = (n11 + (class3842.field7131 << 16) - 1) / n11;
                n13 = n6 + n;
                n = n6 * n11 - (class3842.field7131 << 16) + 0;
            }
            if (class3842.field7126 <= 0) {
                n6 = n2;
                n2 = n5;
            } else {
                n5 = (n12 + (class3842.field7126 << 16) - 1) / n12;
                n6 = n2 + n5;
                n2 = n12 * n5 - (class3842.field7126 << 16) + 0;
            }
            if (n7 < n9) {
                n3 = ((n7 << 16) - n + n11 - 1) / n11;
            }
            if (n8 < n10) {
                n4 = (n12 + ((n8 << 16) - n2) - 1) / n12;
            }
            int n14 = n13 + n6 * this.field2525;
            n9 = this.field2525 - n3;
            n8 = n4 + n6;
            n5 = n4;
            if (n8 > this.field2526) {
                n5 = n4 - (n8 - this.field2526);
            }
            n10 = n5;
            n4 = n14;
            n8 = n2;
            if (n6 < this.field2531) {
                n8 = this.field2531 - n6;
                n10 = n5 - n8;
                n4 = n14 + n8 * this.field2525;
                n8 = n2 + n8 * n12;
            }
            n6 = n13 + n3;
            n5 = n3;
            n2 = n9;
            if (n6 > this.field2528) {
                n2 = n6 - this.field2528;
                n5 = n3 - n2;
                n2 += n9;
            }
            n14 = n5;
            n9 = n4;
            n6 = n2;
            n3 = n;
            if (n13 < this.field2530) {
                n13 = this.field2530 - n13;
                n14 = n5 - n13;
                n9 = n4 + n13;
                n3 = n13 * n11 + n;
                n6 = n2 + n13;
            }
            class372.method12966(this.field2529, class3842.field7129, 0, n3, n8, n9, n6, n14, n10, n11, n12, n7, (short)-23016);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(Lek;IIIIIIB)V")
    void vmethod10767(class384 class3842, int n, int n2, int n3, int n4, int n5, int n6, byte by) {
        block104: {
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            block107: {
                int n14;
                int n15;
                int n16;
                block105: {
                    block106: {
                        block103: {
                            if (n6 == 0) {
                                return;
                            }
                            n16 = n - (class3842.field7131 << 4);
                            n15 = n2 - (class3842.field7126 << 4);
                            double d = (double)(n5 & 0xFFFF) * 9.587379924285257E-5;
                            double d2 = Math.sin(d);
                            double d3 = n6;
                            n5 = (int)Math.floor(d2 * d3 + 0.5);
                            by = (byte)Math.floor(Math.cos(d) * d3 + 0.5);
                            n13 = -n15;
                            n = n13 * n5;
                            n12 = -n16;
                            n6 = n12 * by;
                            n2 = n + n6;
                            n11 = -n12 * n5;
                            n12 = (n13 *= by) + n11;
                            n += by * ((class3842.field7125 << 4) - n16);
                            n13 += -((class3842.field7125 << 4) - n16) * n5;
                            n10 = n5 * ((class3842.field7127 << 4) - n15) + n6;
                            n6 = n11 + by * ((class3842.field7127 << 4) - n15);
                            n9 = n5 * ((class3842.field7127 << 4) - n15) + by * ((class3842.field7125 << 4) - n16);
                            by = (byte)(by * ((class3842.field7127 << 4) - n15) + -((class3842.field7125 << 4) - n16) * n5);
                            if (n2 >= n) {
                                n5 = n;
                                n = n2;
                                n2 = n5;
                            }
                            n5 = n2;
                            if (n10 < n2) {
                                n5 = n10;
                            }
                            n11 = n5;
                            if (n9 < n5) {
                                n11 = n9;
                            }
                            n2 = n;
                            if (n10 > n) {
                                n2 = n10;
                            }
                            if (n9 <= n2) {
                                n9 = n2;
                            }
                            n2 = n13;
                            n = n12;
                            if (n12 < n13) {
                                n = n13;
                                n2 = n12;
                            }
                            n5 = n2;
                            if (n6 < n2) {
                                n5 = n6;
                            }
                            n12 = n5;
                            if (by < n5) {
                                n12 = by;
                            }
                            n2 = n;
                            if (n6 > n) {
                                n2 = n6;
                            }
                            if (by <= n2) {
                                by = (byte)n2;
                            }
                            n = (n11 >> 12) + n3 >> 4;
                            n13 = (n9 + 4095 >> 12) + n3 + 15 >> 4;
                            n2 = n4 + (n12 >> 12) >> 4;
                            n5 = n4 + (by + 4095 >> 12) + 15 >> 4;
                            n6 = n;
                            if (n < this.field2530) {
                                n6 = this.field2530;
                            }
                            n = n13;
                            if (n13 > this.field2528) {
                                n = this.field2528;
                            }
                            by = (byte)n2;
                            if (n2 < this.field2531) {
                                by = (byte)this.field2531;
                            }
                            n2 = n5;
                            if (n5 > this.field2526) {
                                n2 = this.field2526;
                            }
                            if ((n = n6 - n) >= 0) {
                                return;
                            }
                            n5 = by - n2;
                            if (n5 >= 0) {
                                return;
                            }
                            n2 = by * this.field2525 + n6;
                            d2 = 1.6777216E7 / d3;
                            n14 = (int)Math.floor(Math.sin(d) * d2 + 0.5);
                            n8 = (int)Math.floor(Math.cos(d) * d2 + 0.5);
                            n7 = (n6 << 4) + 8 - n3;
                            n4 = (by << 4) + 8 - n4;
                            n3 = (n16 << 8) - (n4 * n14 >> 4);
                            n4 = (n15 << 8) + (n4 * n8 >> 4);
                            if (n8 != 0) break block103;
                            if (n14 == 0) {
                                n6 = n5;
                                while (n6 < 0) {
                                    if (n3 >= 0 && n4 >= 0 && n3 - (class3842.field7125 << 12) < 0 && n4 - (class3842.field7127 << 12) < 0) {
                                        n5 = n2;
                                        for (by = (byte)n; by < 0; by = (byte)(by + 1)) {
                                            n12 = class3842.field7129[(n3 >> 12) + (n4 >> 12) * class3842.field7125];
                                            if (n12 == 0) {
                                                ++n5;
                                                continue;
                                            }
                                            this.field2529[n5] = n12;
                                            ++n5;
                                        }
                                    }
                                    ++n6;
                                    n2 += this.field2525;
                                }
                            } else {
                                n12 = n3;
                                n13 = n5;
                                n6 = n2;
                                if (n14 >= 0) {
                                    while (n13 < 0) {
                                        n2 = n4 + (n7 * n14 >> 4);
                                        if (n12 >= 0 && n12 - (class3842.field7125 << 12) < 0) {
                                            if (n2 >= 0) {
                                                by = (byte)n;
                                                n5 = n6;
                                            } else {
                                                n3 = (n14 - 1 - n2) / n14;
                                                by = (byte)(n + n3);
                                                n2 += n14 * n3;
                                                n5 = n3 + n6;
                                            }
                                            n9 = (n2 + 1 - (class3842.field7127 << 12) - n14) / n14;
                                            n11 = n2;
                                            n10 = n5;
                                            n3 = by;
                                            if (n9 > by) {
                                                n3 = n9;
                                                n10 = n5;
                                                n11 = n2;
                                            }
                                            while (n3 < 0) {
                                                n2 = class3842.field7129[(n11 >> 12) * class3842.field7125 + (n12 >> 12)];
                                                if (n2 == 0) {
                                                    n2 = n10 + 1;
                                                } else {
                                                    this.field2529[n10] = n2;
                                                    n2 = n10 + 1;
                                                }
                                                n11 += n14;
                                                ++n3;
                                                n10 = n2;
                                            }
                                        }
                                        ++n13;
                                        n12 -= n14;
                                        n6 += this.field2525;
                                    }
                                } else {
                                    n13 = n5;
                                    n12 = n3;
                                    while (n13 < 0) {
                                        n3 = n4 + (n14 * n7 >> 4);
                                        if (n12 >= 0 && n12 - (class3842.field7125 << 12) < 0) {
                                            n5 = n3 - (class3842.field7127 << 12);
                                            if (n5 < 0) {
                                                by = (byte)n;
                                                n6 = n2;
                                            } else {
                                                n5 = (n14 - n5) / n14;
                                                by = (byte)(n + n5);
                                                n3 = n14 * n5 + n3;
                                                n6 = n2 + n5;
                                            }
                                            n9 = (n3 - n14) / n14;
                                            n11 = n3;
                                            n10 = n6;
                                            n5 = by;
                                            if (n9 > by) {
                                                n5 = n9;
                                                n10 = n6;
                                                n11 = n3;
                                            }
                                            while (n5 < 0) {
                                                n3 = class3842.field7129[(n11 >> 12) * class3842.field7125 + (n12 >> 12)];
                                                if (n3 == 0) {
                                                    n3 = n10 + 1;
                                                } else {
                                                    this.field2529[n10] = n3;
                                                    n3 = n10 + 1;
                                                }
                                                n11 += n14;
                                                ++n5;
                                                n10 = n3;
                                            }
                                        }
                                        ++n13;
                                        n12 -= n14;
                                        n2 += this.field2525;
                                    }
                                }
                            }
                            break block104;
                        }
                        if (n8 >= 0) break block105;
                        if (n14 != 0) break block106;
                        n13 = n5;
                        n12 = n4;
                        break block107;
                    }
                    n10 = n4;
                    n9 = n3;
                    n16 = n5;
                    n6 = n2;
                    if (n14 < 0) {
                        n10 = n4;
                        n9 = n3;
                        n16 = n5;
                        block6: while (n16 < 0) {
                            n3 = (n8 * n7 >> 4) + n9;
                            n4 = (n14 * n7 >> 4) + n10;
                            n5 = n3 - (class3842.field7125 << 12);
                            if (n5 < 0) {
                                n6 = n;
                                n5 = n2;
                            } else {
                                n5 = (n8 - n5) / n8;
                                n6 = n + n5;
                                n3 = n8 * n5 + n3;
                                n4 = n14 * n5 + n4;
                                n5 = n2 + n5;
                            }
                            by = (byte)((n3 - n8) / n8);
                            n11 = n6;
                            if (by > n6) {
                                n11 = by;
                            }
                            n15 = n4 - (class3842.field7127 << 12);
                            n13 = n3;
                            n12 = n4;
                            n6 = n5;
                            by = (byte)n11;
                            if (n15 >= 0) {
                                n6 = (n14 - n15) / n14;
                                by = (byte)(n11 + n6);
                                n13 = n3 + n8 * n6;
                                n12 = n4 + n14 * n6;
                                n6 += n5;
                            }
                            n15 = (n12 - n14) / n14;
                            n5 = n13;
                            n11 = n12;
                            n4 = n6;
                            n3 = by;
                            if (n15 > by) {
                                n3 = n15;
                                n4 = n6;
                                n11 = n12;
                                n5 = n13;
                            }
                            while (true) {
                                if (n3 >= 0) {
                                    ++n16;
                                    n9 -= n14;
                                    n10 += n8;
                                    n2 += this.field2525;
                                    continue block6;
                                }
                                n6 = class3842.field7129[(n11 >> 12) * class3842.field7125 + (n5 >> 12)];
                                if (n6 == 0) {
                                    ++n4;
                                } else {
                                    this.field2529[n4] = n6;
                                    ++n4;
                                }
                                n5 = n8 + n5;
                                n11 += n14;
                                ++n3;
                            }
                        }
                    } else {
                        block8: while (n16 < 0) {
                            n2 = (n7 * n8 >> 4) + n9;
                            n3 = (n14 * n7 >> 4) + n10;
                            n4 = n2 - (class3842.field7125 << 12);
                            if (n4 < 0) {
                                n5 = n;
                                n4 = n6;
                            } else {
                                n4 = (n8 - n4) / n8;
                                n5 = n4 + n;
                                n2 += n4 * n8;
                                n3 = n4 * n14 + n3;
                                n4 += n6;
                            }
                            by = (byte)((n2 - n8) / n8);
                            n11 = n5;
                            if (by > n5) {
                                n11 = by;
                            }
                            n13 = n2;
                            n12 = n3;
                            n5 = n4;
                            by = (byte)n11;
                            if (n3 < 0) {
                                n5 = (n14 - 1 - n3) / n14;
                                by = (byte)(n11 + n5);
                                n13 = n2 + n8 * n5;
                                n12 = n14 * n5 + n3;
                                n5 = n4 + n5;
                            }
                            n15 = (n12 + 1 - (class3842.field7127 << 12) - n14) / n14;
                            n4 = n13;
                            n11 = n12;
                            n3 = n5;
                            n2 = by;
                            if (n15 > by) {
                                n2 = n15;
                                n3 = n5;
                                n11 = n12;
                                n4 = n13;
                            }
                            while (true) {
                                if (n2 >= 0) {
                                    ++n16;
                                    n9 -= n14;
                                    n10 += n8;
                                    n6 += this.field2525;
                                    continue block8;
                                }
                                n5 = class3842.field7129[(n11 >> 12) * class3842.field7125 + (n4 >> 12)];
                                if (n5 == 0) {
                                    ++n3;
                                } else {
                                    this.field2529[n3] = n5;
                                    ++n3;
                                }
                                n4 += n8;
                                n11 += n14;
                                ++n2;
                            }
                        }
                    }
                    break block104;
                }
                if (n14 != 0) {
                    if (n14 < 0) {
                        n10 = n4;
                        n9 = n3;
                        n16 = n5;
                        block10: while (n16 < 0) {
                            n3 = (n7 * n8 >> 4) + n9;
                            n4 = (n7 * n14 >> 4) + n10;
                            if (n3 >= 0) {
                                n6 = n;
                                n5 = n2;
                            } else {
                                n5 = (n8 - 1 - n3) / n8;
                                n6 = n + n5;
                                n3 = n8 * n5 + n3;
                                n4 += n14 * n5;
                                n5 = n2 + n5;
                            }
                            by = (byte)((n3 + 1 - (class3842.field7125 << 12) - n8) / n8);
                            n11 = n6;
                            if (by > n6) {
                                n11 = by;
                            }
                            n15 = n4 - (class3842.field7127 << 12);
                            n13 = n3;
                            n12 = n4;
                            n6 = n5;
                            by = (byte)n11;
                            if (n15 >= 0) {
                                n6 = (n14 - n15) / n14;
                                by = (byte)(n11 + n6);
                                n13 = n3 + n8 * n6;
                                n12 = n4 + n14 * n6;
                                n6 += n5;
                            }
                            int n17 = (n12 - n14) / n14;
                            n5 = n13;
                            n11 = n12;
                            n3 = n;
                            n15 = n6;
                            n4 = by;
                            if (n17 > by) {
                                n4 = n17;
                                n15 = n6;
                                n3 = n;
                                n11 = n12;
                                n5 = n13;
                            }
                            while (true) {
                                if (n4 >= 0) {
                                    ++n16;
                                    n9 -= n14;
                                    n10 += n8;
                                    n2 += this.field2525;
                                    n = n3;
                                    continue block10;
                                }
                                n = class3842.field7129[(n5 >> 12) + (n11 >> 12) * class3842.field7125];
                                if (n == 0) {
                                    n = n15 + 1;
                                } else {
                                    this.field2529[n15] = n;
                                    n = n15 + 1;
                                }
                                n5 = n8 + n5;
                                n11 += n14;
                                ++n4;
                                n15 = n;
                            }
                        }
                    } else {
                        n10 = n4;
                        n9 = n3;
                        n16 = n5;
                        block12: while (n16 < 0) {
                            n3 = (n7 * n8 >> 4) + n9;
                            n4 = (n14 * n7 >> 4) + n10;
                            if (n3 >= 0) {
                                n5 = n2;
                                n6 = n;
                            } else {
                                n5 = (n8 - 1 - n3) / n8;
                                n6 = n + n5;
                                n3 = n8 * n5 + n3;
                                n4 += n14 * n5;
                                n5 = n2 + n5;
                            }
                            by = (byte)((n3 + 1 - (class3842.field7125 << 12) - n8) / n8);
                            n11 = n6;
                            if (by > n6) {
                                n11 = by;
                            }
                            n13 = n3;
                            n12 = n4;
                            n6 = n5;
                            by = (byte)n11;
                            if (n4 < 0) {
                                n6 = (n14 - 1 - n4) / n14;
                                by = (byte)(n11 + n6);
                                n13 = n3 + n8 * n6;
                                n12 = n4 + n14 * n6;
                                n6 += n5;
                            }
                            n15 = (n12 + 1 - (class3842.field7127 << 12) - n14) / n14;
                            n5 = n13;
                            n11 = n12;
                            n4 = n6;
                            n3 = by;
                            if (n15 > by) {
                                n3 = n15;
                                n4 = n6;
                                n11 = n12;
                                n5 = n13;
                            }
                            while (true) {
                                if (n3 >= 0) {
                                    ++n16;
                                    n9 -= n14;
                                    n10 += n8;
                                    n3 = this.field2525 * 1493422429;
                                    n2 += n3 * -1809380619;
                                    continue block12;
                                }
                                n6 = class3842.field7129[(n11 >> 12) * class3842.field7125 + (n5 >> 12)];
                                if (n6 == 0) {
                                    ++n4;
                                } else {
                                    this.field2529[n4] = n6;
                                    ++n4;
                                }
                                n5 = n8 + n5;
                                n11 += n14;
                                ++n3;
                            }
                        }
                    }
                } else {
                    n13 = n5;
                    n12 = n4;
                    while (n13 < 0) {
                        n4 = (n8 * n7 >> 4) + n3;
                        if (n12 >= 0 && n12 - (class3842.field7127 << 12) < 0) {
                            if (n4 >= 0) {
                                by = (byte)n;
                                n6 = n2;
                            } else {
                                n5 = (n8 - 1 - n4) / n8;
                                by = (byte)(n + n5);
                                n4 += n8 * n5;
                                n6 = n2 + n5;
                            }
                            n9 = (n4 + 1 - (class3842.field7125 << 12) - n8) / n8;
                            n11 = n4;
                            n10 = n6;
                            n5 = by;
                            if (n9 > by) {
                                n5 = n9;
                                n10 = n6;
                                n11 = n4;
                            }
                            while (n5 < 0) {
                                n4 = class3842.field7129[(n12 >> 12) * class3842.field7125 + (n11 >> 12)];
                                if (n4 == 0) {
                                    n4 = n10 + 1;
                                } else {
                                    this.field2529[n10] = n4;
                                    n4 = n10 + 1;
                                }
                                n11 += n8;
                                ++n5;
                                n10 = n4;
                            }
                        }
                        ++n13;
                        n12 += n8;
                        n2 += this.field2525;
                    }
                }
                break block104;
            }
            while (n13 < 0) {
                n4 = (n7 * n8 >> 4) + n3;
                if (n12 >= 0 && n12 - (class3842.field7127 << 12) < 0) {
                    n5 = n4 - (class3842.field7125 << 12);
                    if (n5 < 0) {
                        by = (byte)n;
                        n6 = n2;
                    } else {
                        n5 = (n8 - n5) / n8;
                        by = (byte)(n + n5);
                        n4 = n8 * n5 + n4;
                        n6 = n2 + n5;
                    }
                    n9 = (n4 - n8) / n8;
                    n11 = n4;
                    n10 = n6;
                    n5 = by;
                    if (n9 > by) {
                        n5 = n9;
                        n10 = n6;
                        n11 = n4;
                    }
                    while (n5 < 0) {
                        n4 = class3842.field7129[(n12 >> 12) * class3842.field7125 + (n11 >> 12)];
                        if (n4 == 0) {
                            n4 = n10 + 1;
                        } else {
                            this.field2529[n10] = n4;
                            n4 = n10 + 1;
                        }
                        n11 += n8;
                        ++n5;
                        n10 = n4;
                    }
                }
                ++n13;
                n12 += n8;
                n2 += this.field2525;
            }
        }
    }

    @Override
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(Lek;IIII)V")
    public void vmethod10769(class384 class3842, int n, int n2, int n3, int n4) {
        int n5;
        if (n3 == 0) {
            return;
        }
        int n6 = n + class3842.field7131;
        n4 = n2 + class3842.field7126;
        n = n4 * this.field2525 + n6;
        n2 = class3842.field7127;
        int n7 = class3842.field7125;
        int n8 = this.field2525 - n7;
        int n9 = this.field2531 * 221165805;
        int n10 = 0;
        if (n4 >= n9 * 30958821) {
            n9 = 0;
        } else {
            n5 = this.field2531 - n4;
            n2 -= n5;
            n4 = this.field2531;
            n9 = n7 * n5 + 0;
            n = n5 * this.field2525 + n;
        }
        n4 = n2 + n4;
        int n11 = n2;
        if (n4 > this.field2526) {
            n11 = n2 - (n4 - this.field2526);
        }
        int n12 = n6;
        int n13 = n;
        n5 = n7;
        n2 = n8;
        int n14 = n9;
        n4 = n10;
        if (n6 < this.field2530) {
            n2 = this.field2530 - n6;
            n5 = n7 - n2;
            n12 = this.field2530;
            n14 = n2 + n9;
            n13 = n2 + n;
            n4 = n2 + 0;
            n2 += n8;
        }
        n8 = n12 + n5;
        n = n5;
        n9 = n2;
        n12 = n4;
        if (n8 > this.field2528) {
            n9 = n8 - this.field2528;
            n = n5 - n9;
            n12 = n4 + n9;
            n9 = n2 + n9;
        }
        if (n > 0) {
            if (n11 <= 0) {
                return;
            }
            class291.method10707(this.field2529, class3842.field7129, 0, n14, n13, n, n11, n9, n12, n3, 615931238);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Lek;IIIIII)V")
    public void vmethod10770(class384 class3842, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 <= 0) {
            return;
        }
        if (n3 > 0) {
            int n7;
            if (n4 <= 0) {
                return;
            }
            int n8 = class3842.field7125;
            int n9 = class3842.field7127;
            int n10 = class3842.field7130;
            int n11 = class3842.field7128;
            int n12 = (n10 << 16) / n3;
            int n13 = (n11 << 16) / n4;
            int n14 = class3842.field7131;
            n6 = 0;
            if (n14 <= 0) {
                n14 = n;
                n = 0;
            } else {
                n7 = (n12 + (class3842.field7131 << 16) - 1) / n12;
                n14 = n7 + n;
                n = n7 * n12 - (class3842.field7131 << 16) + 0;
            }
            if (class3842.field7126 <= 0) {
                n7 = n2;
                n2 = n6;
            } else {
                n6 = (n13 + (class3842.field7126 << 16) - 1) / n13;
                n7 = n2 + n6;
                n2 = n13 * n6 - (class3842.field7126 << 16) + 0;
            }
            if (n8 < n10) {
                n3 = ((n8 << 16) - n + n12 - 1) / n12;
            }
            if (n9 < n11) {
                n4 = (n13 + ((n9 << 16) - n2) - 1) / n13;
            }
            int n15 = n14 + n7 * this.field2525;
            n10 = this.field2525 - n3;
            n9 = n4 + n7;
            n6 = n4;
            if (n9 > this.field2526) {
                n6 = n4 - (n9 - this.field2526);
            }
            n11 = n6;
            n4 = n15;
            n9 = n2;
            if (n7 < this.field2531) {
                n9 = this.field2531 - n7;
                n11 = n6 - n9;
                n4 = n15 + n9 * this.field2525;
                n9 = n2 + n9 * n13;
            }
            n7 = n14 + n3;
            n6 = n3;
            n2 = n10;
            if (n7 > this.field2528) {
                n2 = n7 - this.field2528;
                n6 = n3 - n2;
                n2 += n10;
            }
            n15 = n6;
            n10 = n4;
            n7 = n2;
            n3 = n;
            if (n14 < this.field2530) {
                n14 = this.field2530 - n14;
                n15 = n6 - n14;
                n10 = n4 + n14;
                n3 = n14 * n12 + n;
                n7 = n2 + n14;
            }
            class265.method7637(this.field2529, class3842.field7129, 0, n3, n9, n10, n7, n15, n11, n12, n13, n8, n5, 1314195612);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(Lek;IIIIB)V")
    public void vmethod10776(class384 class3842, int n, int n2, int n3, int n4, byte by) {
        if (n3 < 255) {
            int n5;
            int n6 = n + class3842.field7131;
            by = (byte)(n2 + class3842.field7126);
            n = n6 + this.field2525 * by;
            n2 = class3842.field7127;
            int n7 = class3842.field7125;
            int n8 = this.field2525 - n7;
            int n9 = this.field2531 * 221165805;
            byte by2 = 0;
            if (by >= n9 * 30958821) {
                n9 = 0;
            } else {
                n5 = this.field2531 - by;
                n2 -= n5;
                by = (byte)this.field2531;
                n9 = n7 * n5 + 0;
                n = n5 * this.field2525 + n;
            }
            by = (byte)(n2 + by);
            int n10 = n2;
            if (by > this.field2526) {
                n10 = n2 - (by - this.field2526);
            }
            int n11 = n6;
            int n12 = n;
            n5 = n7;
            n2 = n8;
            int n13 = n9;
            by = by2;
            if (n6 < this.field2530) {
                n2 = this.field2530 - n6;
                n5 = n7 - n2;
                n11 = this.field2530;
                n13 = n2 + n9;
                n12 = n2 + n;
                by = (byte)(n2 + 0);
                n2 += n8;
            }
            n8 = n11 + n5;
            n = n5;
            n9 = n2;
            n11 = by;
            if (n8 > this.field2528) {
                n9 = n8 - this.field2528;
                n = n5 - n9;
                n11 = n9 + by;
                n9 = n2 + n9;
            }
            if (n > 0) {
                if (n10 <= 0) {
                    return;
                }
                class37.method1075(this.field2529, class3842.field7129, 0, n13, n12, n, n10, n9, n11, n3, n4, (byte)-74);
                return;
            }
            return;
        }
        this.vmethod10761(class3842, n, n2, -1139147689);
    }

    @Override
    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lek;IIIIII[I[II)V")
    public void vmethod10777(class384 class3842, int n, int n2, int n3, int n4, int n5, int n6, int[] arrn, int[] arrn2, int n7) {
        n7 = n2 < 0 ? -n2 : 0;
        n6 = n2 + class3842.field7127 <= n6 ? class3842.field7127 : (n6 -= n2);
        n5 = n < 0 ? -n : 0;
        n3 = (n2 + n4 + n7) * this.field2525 + n + n3 + n5;
        int n8 = n2 + n7;
        n2 = n3;
        block0: while (n7 < n6) {
            int n9 = arrn[n8];
            int n10 = arrn2[n8];
            if (n < n9) {
                n3 = n9 - n;
                n4 = n2 + (n3 - n5);
            } else {
                n4 = n2;
                n3 = n5;
            }
            int n11 = class3842.field7125;
            n9 = n10 + n9;
            if (n11 + n > n9) {
                n9 -= n;
                n10 = n3;
                n3 = n4;
            } else {
                n9 = class3842.field7125;
                n10 = n3;
                n3 = n4;
            }
            while (true) {
                if (n10 >= n9) {
                    n3 = this.field2525 * 1493422429;
                    n2 += n3 * -1809380619;
                    ++n7;
                    ++n8;
                    continue block0;
                }
                n4 = class3842.field7129[n10 + n7 * class3842.field7125];
                if (n4 == 0) {
                    ++n3;
                } else {
                    this.field2529[n3] = n4;
                    ++n3;
                }
                ++n10;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Lek;IIIIIIII[I[II)V")
    public void vmethod10778(class384 var1_1, int var2_3, int var3_4, int var4_5, int var5_6, int var6_7, int var7_8, int var8_9, int var9_10, int[] var10_11, int[] var11_12, int var12_13) {
        block6: {
            var4_5 = -var4_5;
            try {
                var12_13 = var4_5 / 2;
                var17_14 = -var5_6 / 2;
                var13_15 = (double)var8_9 / 326.11;
                var8_9 = (int)(Math.sin(var13_15) * 65536.0);
                var4_5 = (int)(Math.cos(var13_15) * 65536.0);
                var15_16 = var8_9 * var9_10 >> 8;
                var16_17 = var4_5 * var9_10 >> 8;
                var4_5 = var16_17 * var12_13 + var17_14 * var15_16 + (var6_7 << 16);
                var6_7 = var17_14 * var16_17 - var15_16 * var12_13 + (var7_8 << 16);
                var2_3 = var3_4 * this.field2525 + var2_3;
                var7_8 = 0;
                var3_4 = var4_5;
                var4_5 = var7_8;
                break block6;
lbl17:
                // 1 sources

                while (true) {
                    if (var12_13 < 0) {
                        this.field2529[var8_9] = var1_1.field7129[(var7_8 >> 16) * var1_1.field7125 + (var9_10 >> 16)];
                        var9_10 = var16_17 + var9_10;
                        var7_8 -= var15_16;
                        ++var12_13;
                        ++var8_9;
                        continue;
                    }
                    var3_4 += var15_16;
                    var6_7 = var16_17 + var6_7;
                    var7_8 = this.field2525 * 1493422429;
                    var2_3 += var7_8 * -1809380619;
                    ++var4_5;
                    break;
                }
            }
            catch (Exception var1_2) {
                return;
            }
        }
        if (var4_5 >= var5_6) return;
        var7_8 = var10_11[var4_5];
        var8_9 = var2_3 + var7_8;
        var9_10 = var3_4 + var16_17 * var7_8;
        var7_8 = var6_7 - var15_16 * var7_8;
        var12_13 = -var11_12[var4_5];
        ** while (true)
    }

    @Override
    @ObfuscatedName(value="ai")
    public final void vmethod10751(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        n7 = n;
        int n8 = n2;
        if (n6 == 0) {
            return;
        }
        if (n6 < 255) {
            int n9 = n6 << 24;
            if (n7 >= this.field2530) {
                n = n3;
            } else {
                n = this.field2530 * -1938025425;
                n2 = this.field2530 * -1938025425;
                n = n3 - (n * -1999785265 - n7);
                n7 = n2 * -1999785265;
            }
            if (n8 >= this.field2531) {
                n2 = n4;
            } else {
                n2 = this.field2531 * 221165805;
                n3 = this.field2531 * 221165805;
                n2 = n4 - (n2 * 30958821 - n8);
                n8 = n3 * 30958821;
            }
            n3 = n;
            if (n7 + n > this.field2528) {
                n3 = this.field2528 - n7;
            }
            n4 = n2;
            if (n8 + n2 > this.field2526) {
                n4 = this.field2526 - n8;
            }
            int n10 = 255 - n6;
            int n11 = this.field2525 * 1493422429;
            n = n8 * this.field2525 + n7;
            block0: for (n2 = 0; n2 < n4; ++n2) {
                n7 = -n3;
                while (true) {
                    if (n7 >= 0) {
                        n += n11 * -1809380619 - n3;
                        continue block0;
                    }
                    int n12 = this.field2529[n];
                    if (n12 != 0) {
                        n8 = -16777216;
                        if ((n12 & 0xFF000000) != 0) {
                            n8 = 0xFF000000 & (n12 | n9);
                        }
                        this.field2529[n] = n8 | ((n5 & 0xFF00) * n6 >> 8 & 0xFF00) + ((n12 & 0xFF00FF) * n10 >> 8 & 0xFF00FF) + ((n5 & 0xFF00FF) * n6 >> 8 & 0xFF00FF) + (n10 * (n12 & 0xFF00) >> 8 & 0xFF00);
                        ++n;
                    } else {
                        this.field2529[n] = n9 | n5;
                        ++n;
                    }
                    ++n7;
                }
            }
            return;
        }
        this.vmethod10762(n, n2, n3, n4, n5, (byte)4);
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2041539895")
    void vmethod10753() {
    }

    @Override
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lei;IIIII)V")
    public void vmethod10760(IndexedSprite indexedSprite, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = indexedSprite.field7119;
        int n8 = indexedSprite.field7124;
        int n9 = indexedSprite.field7120;
        int n10 = indexedSprite.field7122;
        int n11 = (n9 << 16) / n3;
        int n12 = (n10 << 16) / n4;
        int n13 = indexedSprite.field7118;
        n5 = 0;
        if (n13 <= 0) {
            n13 = n;
            n = 0;
        } else {
            n6 = (n11 + (indexedSprite.field7118 << 16) - 1) / n11;
            n13 = n6 + n;
            n = n6 * n11 - (indexedSprite.field7118 << 16) + 0;
        }
        if (indexedSprite.field7123 <= 0) {
            n6 = n2;
            n2 = n5;
        } else {
            n5 = (n12 + (indexedSprite.field7123 << 16) - 1) / n12;
            n6 = n2 + n5;
            n2 = n12 * n5 - (indexedSprite.field7123 << 16) + 0;
        }
        if (n7 < n9) {
            n3 = ((n7 << 16) - n + n11 - 1) / n11;
        }
        if (n8 < n10) {
            n4 = (n12 + ((n8 << 16) - n2) - 1) / n12;
        }
        int n14 = n13 + n6 * this.field2525;
        n9 = this.field2525 - n3;
        n8 = n4 + n6;
        n5 = n4;
        if (n8 > this.field2526) {
            n5 = n4 - (n8 - this.field2526);
        }
        n10 = n5;
        n4 = n14;
        n8 = n2;
        if (n6 < this.field2531) {
            n8 = this.field2531 - n6;
            n10 = n5 - n8;
            n4 = n14 + n8 * this.field2525;
            n8 = n2 + n8 * n12;
        }
        n6 = n13 + n3;
        n5 = n3;
        n2 = n9;
        if (n6 > this.field2528) {
            n2 = n6 - this.field2528;
            n5 = n3 - n2;
            n2 += n9;
        }
        n14 = n5;
        n9 = n4;
        n6 = n;
        n3 = n2;
        if (n13 < this.field2530) {
            n3 = this.field2530 - n13;
            n14 = n5 - n3;
            n9 = n4 + n3;
            n6 = n11 * n3 + n;
            n3 = n2 + n3;
        }
        WorldMapLabelSize.method3698(this.field2529, indexedSprite.field7121, indexedSprite.palette, n6, n8, n9, n3, n14, n10, n11, n12, n7, (byte)6);
    }

    @Override
    @ObfuscatedName(value="ax")
    public final void vmethod10762(int n, int n2, int n3, int n4, int n5, byte by) {
        this.method10537(n, n2, n3, n4, n5 | 0xFF000000, -1132458045);
    }

    @Override
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Lek;IIIIB)V")
    public void vmethod10766(class384 class3842, int n, int n2, int n3, int n4, byte by) {
        class384 class3843 = class3842;
        int n5 = n3;
        by = (byte)n4;
        if (n5 > class3843.field7130 || by > class3843.field7128) {
            throw new IllegalArgumentException();
        }
        int n6 = n5 * class3843.field7131 / class3843.field7130 + n;
        int n7 = n + ((class3843.field7125 + class3843.field7131) * n5 + class3843.field7130 - 1) / class3843.field7130;
        int n8 = n2 + class3843.field7126 * by / class3843.field7128;
        n5 = n2 + ((class3843.field7127 + class3843.field7126) * by + class3843.field7128 - 1) / class3843.field7128;
        by = (byte)n6;
        if (n6 < this.field2530) {
            by = (byte)this.field2530;
        }
        int n9 = n7;
        if (n7 > this.field2528) {
            n9 = this.field2528;
        }
        n7 = n8;
        if (n8 < this.field2531) {
            n7 = this.field2531;
        }
        int n10 = n5;
        if (n5 > this.field2526) {
            n10 = this.field2526;
        }
        if (by < n9) {
            if (n7 >= n10) {
                return;
            }
            n8 = n7 * this.field2525 + by;
            int n11 = this.field2525 * 1493422429;
            n5 = by;
            int n12 = n7;
            n7 = n8;
            if (n8 < this.field2529.length) {
                block0: while (n12 < n10) {
                    int n13 = n5;
                    int n14 = n7;
                    while (true) {
                        n6 = n4;
                        n8 = n3;
                        class3843 = class3842;
                        if (n13 >= n9) {
                            n7 = n14 + (n11 * -1809380619 - (n9 - by));
                            ++n12;
                            continue block0;
                        }
                        int n15 = n13 - n << 4;
                        int n16 = n12 - n2 << 4;
                        n7 = n15 * class3843.field7130 / n8 - (class3843.field7131 << 4);
                        n15 = (n15 + 16) * class3843.field7130 / n8 - (class3843.field7131 << 4);
                        n8 = n16 * class3843.field7128 / n6 - (class3843.field7126 << 4);
                        n6 = (n16 + 16) * class3843.field7128 / n6 - (class3843.field7126 << 4);
                        int n17 = (n15 - n7) * (n6 - n8) >> 1;
                        if (n17 != 0) {
                            n16 = 0;
                            int n18 = n7;
                            if (n7 < 0) {
                                n18 = 0;
                            }
                            n7 = n15;
                            if (n15 >= class3843.field7125 << 4) {
                                n7 = class3843.field7125 << 4;
                            }
                            int n19 = n8;
                            if (n8 < 0) {
                                n19 = 0;
                            }
                            n8 = n6;
                            if (n6 >= class3843.field7127 << 4) {
                                n8 = class3843.field7127 << 4;
                            }
                            int n20 = n7 - 1;
                            int n21 = n8 - 1;
                            int n22 = n18 >> 4;
                            int n23 = n20 >> 4;
                            int n24 = n19 >> 4;
                            int n25 = n21 >> 4;
                            n7 = 0;
                            n6 = 0;
                            n15 = 0;
                            n8 = n16;
                            block2: for (int i = n24; i <= n25; ++i) {
                                n16 = i == n24 ? 16 - (n19 & 0xF) : 16;
                                int n26 = n16;
                                if (i == n25) {
                                    n26 = (n21 & 0xF) + 1;
                                }
                                n16 = n15;
                                int n27 = n6;
                                int n28 = n22;
                                n15 = n7;
                                n6 = n8;
                                n8 = n27;
                                n7 = n16;
                                while (true) {
                                    class3843 = class3842;
                                    if (n28 > n23) {
                                        n16 = n8;
                                        n26 = n7;
                                        n7 = n15;
                                        n8 = n6;
                                        n6 = n16;
                                        n15 = n26;
                                        continue block2;
                                    }
                                    int n29 = class3843.field7129[n28 + i * class3843.field7125];
                                    int n30 = n15;
                                    int n31 = n6;
                                    n27 = n8;
                                    n16 = n7;
                                    if (n29 != 0) {
                                        n16 = n28 == n22 ? (16 - (n18 & 0xF)) * n26 : (n28 == n23 ? n26 * ((n20 & 0xF) + 1) : n26 << 4);
                                        n30 = n15 + n16;
                                        n31 = n16 * (n29 >> 16 & 0xFF) + n6;
                                        n27 = n8 + n16 * (n29 >> 8 & 0xFF);
                                        n16 = n7 + (n29 & 0xFF) * n16;
                                    }
                                    ++n28;
                                    n15 = n30;
                                    n6 = n31;
                                    n8 = n27;
                                    n7 = n16;
                                }
                            }
                            if (n7 >= n17) {
                                n8 /= n7;
                                n6 /= n7;
                                n7 = n15 / n7;
                                this.field2529[n14] = 0xFF000000 | n7 + (n6 << 8) + (n8 << 16);
                            }
                            ++n14;
                        }
                        ++n13;
                    }
                }
                return;
            }
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ab")
    final void vmethod10746(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 <= 0) {
            return;
        }
        if (n5 < 255) {
            if (n >= this.field2530) {
                if (n < this.field2528) {
                    int n7 = n2;
                    n6 = n3;
                    if (n2 < this.field2531) {
                        n6 = n3 - (this.field2531 - n2);
                        n7 = this.field2531;
                    }
                    n2 = n6;
                    if (n7 + n6 > this.field2526) {
                        n2 = this.field2526 - n7;
                    }
                    n6 = 255 - n5;
                    int n8 = n5 << 24;
                    n3 = n7 * this.field2525 + n;
                    n = 0;
                    while (true) {
                        if (n >= n2) {
                            return;
                        }
                        if (this.field2529[n3] == 0) {
                            this.field2529[n3] = n4 | n8;
                        } else {
                            n7 = this.field2529[n3];
                            int n9 = this.field2529[n3];
                            int n10 = this.field2529[n3];
                            int n11 = this.field2529[n3];
                            this.field2529[n3] = (n11 | n8) & 0xFF000000 | ((n9 >> 8 & 0xFF) * n6 + n5 * (n4 >> 8 & 0xFF) >> 8 << 8) + (n5 * (n4 & 0xFF) + (n10 & 0xFF) * n6 >> 8) + ((n7 >> 16 & 0xFF) * n6 + (n4 >> 16 & 0xFF) * n5 >> 8 << 16);
                        }
                        n7 = this.field2525 * 1493422429;
                        n3 += n7 * -1809380619;
                        ++n;
                    }
                }
            } else {
                return;
            }
            return;
        }
        this.vmethod10745(n, n2, n3, n4, (byte)28);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Lek;IIIIIIDIB)V")
    public void vmethod10771(class384 var1_1, int var2_3, int var3_4, int var4_5, int var5_6, int var6_7, int var7_8, double var8_9, int var10_10, byte var11_11) {
        var13_12 = -var4_5;
        try {
            var11_11 = (byte)(var13_12 / 2);
            var12_13 = -var5_6 / 2;
            var14_14 = (int)(Math.sin(var8_9) * 65536.0);
            var4_5 = (int)(Math.cos(var8_9) * 65536.0);
            var14_14 = var10_10 * var14_14 >> 8;
            var15_15 = var10_10 * var4_5 >> 8;
            var4_5 = var12_13 * var14_14 + var11_11 * var15_15 + (var6_7 << 16);
            var6_7 = var12_13 * var15_15 - var11_11 * var14_14 + (var7_8 << 16);
            var2_3 = var3_4 * this.field2525 + var2_3;
            var7_8 = 0;
            var3_4 = var4_5;
            var4_5 = var6_7;
            ** GOTO lbl30
        }
        catch (Exception var1_2) {
            return;
        }
lbl-1000:
        // 2 sources

        {
            block6: {
                block5: {
                    block4: {
                        if (var10_10 >= 0) break block4;
                        var16_16 = var1_1.field7129[(var11_11 >> 16) + var1_1.field7125 * (var12_13 >> 16)];
                        if (var16_16 == 0) break block5;
                        this.field2529[var6_7] = var16_16;
                        ++var6_7;
                        break block6;
                    }
                    var3_4 += var14_14;
                    var4_5 = var15_15 + var4_5;
                    var6_7 = this.field2525 * 1493422429;
                    var2_3 = var6_7 * -1809380619 + var2_3;
                    ++var7_8;
lbl30:
                    // 2 sources

                    if (var7_8 >= var5_6) return;
                    var10_10 = var13_12;
                    var6_7 = var2_3;
                    var11_11 = (byte)var3_4;
                    var12_13 = var4_5;
                    continue;
                }
                ++var6_7;
            }
            var11_11 = (byte)(var11_11 + var15_15);
            var12_13 -= var14_14;
            ++var10_10;
            ** while (true)
        }
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="2133318269")
    static final int method10491(int n, int n2) {
        n = n2 * 57 + n;
        n ^= n << 13;
        return (n * (n * n * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) >> 19 & 0xFF;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;I)V", garbageValue="-1442675409")
    public static void method10490(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        NPCDefinition.NpcDefinition_archive = abstractArchive;
        NPCDefinition.field7157 = abstractArchive2;
    }

    @ObfuscatedName(value="ix")
    public static boolean method10518(int n) {
        n = Client.field4899 * 436595157;
        return n * 2128086909 >= 2;
    }
}

