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

@ObfuscatedName(value="jg")
@Implements(value="LoginScreenAnimation")
public class LoginScreenAnimation {
    @ObfuscatedName(value="aa")
    int[] field3518;
    @ObfuscatedName(value="af")
    int[] field3520;
    @ObfuscatedName(value="aj")
    int[] field3521 = new int[256];
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-716843525)
    int field3523 = 0;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1769308835)
    int field3524 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1859053777)
    int field3525 = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-1215455509)
    int field3526 = 0;
    @ObfuscatedName(value="ap")
    int[] field3527;
    @ObfuscatedName(value="aq")
    int[] field3528;
    @ObfuscatedName(value="ar")
    int[] field3529;
    @ObfuscatedName(value="aw")
    int[] field3531;
    @ObfuscatedName(value="ay")
    int[] field3532;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2069624624)
    int field3533 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="[Lei;")
    IndexedSprite[] field3522;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=55589917)
    int field3530 = 0;
    @ObfuscatedName(value="ab")
    int[] field3519;

    @ObfuscatedSignature(descriptor="([Lei;)V")
    LoginScreenAnimation(IndexedSprite[] arrindexedSprite) {
        this.field3522 = arrindexedSprite;
        this.method5671(438738811);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lei;B)V")
    final void method5661(IndexedSprite indexedSprite, byte by) {
        by = 0;
        while (true) {
            if (by >= this.field3529.length) {
                by = 0;
                while (true) {
                    int n;
                    if (by >= 5000) {
                        by = 0;
                        while (true) {
                            int n2;
                            int n3;
                            if (by < 20) {
                            } else {
                                if (indexedSprite != null) {
                                    by = 0;
                                    block3: for (n = 0; n < indexedSprite.field7124; ++n) {
                                        n3 = 0;
                                        while (true) {
                                            if (n3 >= indexedSprite.field7119) continue block3;
                                            if (indexedSprite.field7121[by] != 0) {
                                                n2 = indexedSprite.field7118;
                                                int n4 = indexedSprite.field7123;
                                                this.field3529[n3 + n2 + (n4 + n + 16 << 7) + 16] = 0;
                                            }
                                            ++n3;
                                            by = (byte)(by + 1);
                                        }
                                    }
                                }
                                return;
                            }
                            block5: for (n = 1; n < 255; ++n) {
                                n3 = 1;
                                while (true) {
                                    if (n3 >= 127) {
                                        continue block5;
                                    }
                                    n2 = n3 + (n << 7);
                                    this.field3527[n2] = (this.field3529[n2 - 128] + this.field3529[n2 + 1] + this.field3529[n2 + 128] + this.field3529[n2 - 1]) / 4;
                                    ++n3;
                                }
                            }
                            int[] arrn = this.field3529;
                            this.field3529 = this.field3527;
                            this.field3527 = arrn;
                            by = (byte)(by + 1);
                        }
                    }
                    n = (int)(Math.random() * 128.0 * 256.0);
                    this.field3529[n] = (int)(Math.random() * 256.0);
                    by = (byte)(by + 1);
                }
            }
            this.field3529[by] = 0;
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-594268859")
    void method5665() {
        this.field3519 = null;
        this.field3520 = null;
        this.field3528 = null;
        this.field3518 = null;
        this.field3529 = null;
        this.field3527 = null;
        this.field3532 = null;
        this.field3531 = null;
        this.field3526 = 0;
        this.field3533 = 0;
    }

    @ObfuscatedName(value="ah")
    final int method5668(int n, int n2, int n3, int n4) {
        n4 = 256 - n3;
        return (0xFF0000 & n3 * (0xFF00 & n2) + (n & 0xFF00) * n4) + (0xFF00FF00 & (n & 0xFF00FF) * n4 + n3 * (n2 & 0xFF00FF)) >> 8;
    }

    @ObfuscatedName(value="aj")
    final void method5670(int n, int[] arrn, int n2) {
        int n3 = this.field3518.length;
        n2 = 0;
        while (true) {
            block3: {
                block2: {
                    block1: {
                        if (n2 >= n3) break block1;
                        if (n > 768) break block2;
                        this.field3518[n2] = n <= 256 ? this.method5668(arrn[n2], this.field3519[n2], 256 - n, -1749051968) : arrn[n2];
                        break block3;
                    }
                    return;
                }
                this.field3518[n2] = this.method5668(this.field3519[n2], arrn[n2], 1024 - n, -1686389752);
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lfj;II)V")
    final void method5672(class72 class722, int n, int n2) {
        int n3 = 1;
        int n4 = 0;
        block0: while (n3 < 255) {
            int n5 = (256 - n3) * this.field3521[n3] / 256 + n;
            if (n5 < 0) {
                n2 = -n5;
                n5 = 0;
            } else {
                n2 = 0;
            }
            int n6 = n5 + 128 >= class722.field2525 ? class722.field2525 - n5 : 128;
            n5 = (n3 + 8) * class722.field2525 + n5;
            int n7 = n2 + n4;
            n4 = n2;
            n2 = n5;
            n5 = n7;
            while (true) {
                if (n4 >= n6) {
                    n4 = n5 + (128 - n6);
                    ++n3;
                    continue block0;
                }
                n7 = this.field3532[n5];
                if (n7 == 0) {
                    ++n2;
                } else {
                    int n8 = 256 - n7;
                    int n9 = this.field3518[n7];
                    int n10 = class722.field2529[n2];
                    class722.field2529[n2] = (0xFF00FF00 & (n9 & 0xFF00FF) * n7 + (n10 & 0xFF00FF) * n8) + (n7 * (n9 & 0xFF00) + n8 * (n10 & 0xFF00) & 0xFF0000) >> 8 | 0xFF000000;
                    ++n2;
                }
                ++n4;
                ++n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(ILfj;I)V")
    final void method5679(int n, class72 class722, int n2) {
        int n3 = this.field3518.length;
        if (this.field3524 * 16 > 0) {
            this.method5670(this.field3524 * 16, this.field3520, -383515082);
        } else if (this.field3525 * 16 > 0) {
            this.method5670(this.field3525 * 16, this.field3528, 200233863);
        } else {
            for (n2 = 0; n2 < n3; ++n2) {
                this.field3518[n2] = this.field3519[n2];
            }
        }
        this.method5672(class722, n, 915957499);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IILfj;I)V")
    void method5669(int n, int n2, class72 class722, int n3) {
        int n4;
        if (this.field3532 == null) {
            this.method5671(-283049025);
        }
        if (this.field3530 == 0) {
            this.field3530 = n2;
        }
        n3 = n4 = n2 - this.field3530;
        if (n4 >= 256) {
            n3 = 0;
        }
        this.field3530 = n2;
        if (n3 > 0) {
            this.draw(n3, 2130903133);
        }
        this.method5679(n, class722, 1912122553);
    }

    @ObfuscatedName(value="ak")
    void method5671(int n) {
        this.field3519 = new int[256];
        int n2 = 0;
        n = 0;
        while (true) {
            if (n >= 64) {
                n = 0;
                while (true) {
                    if (n >= 64) {
                        n = 0;
                        while (true) {
                            if (n >= 64) {
                                n = 0;
                                while (true) {
                                    if (n >= 64) {
                                        this.field3520 = new int[256];
                                        n = 0;
                                        while (true) {
                                            if (n >= 64) {
                                                n = 0;
                                                while (true) {
                                                    if (n >= 64) {
                                                        n = 0;
                                                        while (true) {
                                                            if (n >= 64) {
                                                                n = 0;
                                                                while (true) {
                                                                    if (n >= 64) {
                                                                        this.field3528 = new int[256];
                                                                        n = 0;
                                                                        while (true) {
                                                                            if (n >= 64) {
                                                                                n = 0;
                                                                                while (true) {
                                                                                    if (n >= 64) {
                                                                                        n = 0;
                                                                                        while (true) {
                                                                                            int n3 = n2;
                                                                                            if (n >= 64) {
                                                                                                while (true) {
                                                                                                    if (n3 >= 64) {
                                                                                                        this.field3518 = new int[256];
                                                                                                        this.field3529 = new int[32768];
                                                                                                        this.field3527 = new int[32768];
                                                                                                        this.method5661(null, (byte)118);
                                                                                                        this.field3532 = new int[32768];
                                                                                                        this.field3531 = new int[32768];
                                                                                                        return;
                                                                                                    }
                                                                                                    this.field3528[n3 + 192] = 0xFFFFFF;
                                                                                                    ++n3;
                                                                                                }
                                                                                            }
                                                                                            this.field3528[n + 128] = n * 1024 + 0xFF00FF;
                                                                                            ++n;
                                                                                        }
                                                                                    }
                                                                                    this.field3528[n + 64] = n * 262144 + 255;
                                                                                    ++n;
                                                                                }
                                                                            }
                                                                            this.field3528[n] = n * 4;
                                                                            ++n;
                                                                        }
                                                                    }
                                                                    this.field3520[n + 192] = 0xFFFFFF;
                                                                    ++n;
                                                                }
                                                            }
                                                            this.field3520[n + 128] = n * 262144 + 65535;
                                                            ++n;
                                                        }
                                                    }
                                                    this.field3520[n + 64] = n * 4 + 65280;
                                                    ++n;
                                                }
                                            }
                                            this.field3520[n] = n * 1024;
                                            ++n;
                                        }
                                    }
                                    this.field3519[n + 192] = 0xFFFFFF;
                                    ++n;
                                }
                            }
                            this.field3519[n + 128] = n * 4 + 0xFFFF00;
                            ++n;
                        }
                    }
                    this.field3519[n + 64] = n * 1024 + 0xFF0000;
                    ++n;
                }
            }
            this.field3519[n] = n * 262144;
            ++n;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ax")
    @Export(value="draw")
    final void draw(int n, int n2) {
        this.field3526 += n * 128;
        if (this.field3526 > this.field3529.length) {
            this.field3526 -= this.field3529.length;
            n2 = (int)(Math.random() * 12.0);
            this.method5661(this.field3522[n2], (byte)9);
        }
        n2 = 256 - n;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            int n6;
            if (n3 >= n2 * 128) {
                block1: for (n3 = n2; n3 < 256; ++n3) {
                    n6 = n3 * 128;
                    n4 = 0;
                    while (true) {
                        if (n4 >= 128) {
                            continue block1;
                        }
                        if ((int)(Math.random() * 100.0) >= 50 || n4 <= 10 || n4 >= 118) {
                            this.field3532[n6 + n4] = 0;
                        } else {
                            this.field3532[n4 + n6] = 255;
                        }
                        ++n4;
                    }
                }
                if (this.field3524 * 16 > 0) {
                    this.field3524 = this.field3524 * 16 - n * 4;
                }
                if (this.field3525 * 16 > 0) {
                    this.field3525 = this.field3525 * 16 - n * 4;
                }
                if (this.field3524 * 16 == 0 && this.field3525 * 16 == 0) {
                    n3 = (int)(Math.random() * (double)(2000 / n));
                    if (n3 == 0) {
                        this.field3524 = 1024;
                    }
                    if (n3 == 1) {
                        this.field3525 = 1024;
                    }
                }
                n3 = 0;
                while (true) {
                    n4 = n2;
                    if (n3 >= n2) {
                        while (true) {
                            if (n4 >= 256) {
                                this.field3533 = n * 10000 + this.field3533 * 10000;
                                n6 = ((Client.cycle & 1) + n) / 2;
                                if (n6 <= 0) return;
                                n = 0;
                                while (true) {
                                    if (n >= this.field3533 * 100) {
                                        int n7;
                                        this.field3533 = 0;
                                        block6: for (n3 = 0; n3 < 256; ++n3) {
                                            n5 = n3 * 128;
                                            n4 = -n6;
                                            n2 = 0;
                                            while (true) {
                                                if (n4 >= 128) continue block6;
                                                n = n2;
                                                if (n4 + n6 < 128) {
                                                    n = n2 + this.field3532[n5 + n4 + n6];
                                                }
                                                n7 = n6 + 1;
                                                n2 = n;
                                                if (n4 - n7 >= 0) {
                                                    n2 = n - this.field3532[n4 + n5 - n7];
                                                }
                                                if (n4 >= 0) {
                                                    this.field3531[n4 + n5] = n2 / (n6 * 2 + 1);
                                                }
                                                ++n4;
                                            }
                                        }
                                        block8: for (n3 = 0; n3 < 128; ++n3) {
                                            n4 = -n6;
                                            n2 = 0;
                                            while (true) {
                                                if (n4 >= 256) continue block8;
                                                n5 = n4 * 128;
                                                n = n2;
                                                if (n4 + n6 < 256) {
                                                    n = n2 + this.field3531[n5 + n3 + n6 * 128];
                                                }
                                                n7 = n6 + 1;
                                                n2 = n;
                                                if (n4 - n7 >= 0) {
                                                    n2 = n - this.field3531[n3 + n5 - n7 * 128];
                                                }
                                                if (n4 >= 0) {
                                                    this.field3532[n5 + n3] = n2 / (n6 * 2 + 1);
                                                }
                                                ++n4;
                                            }
                                        }
                                        return;
                                    }
                                    n2 = (int)(Math.random() * (double)124);
                                    n3 = (int)(Math.random() * (double)128);
                                    this.field3532[(n3 + 128 << 7) + n2 + 2] = 192;
                                    ++n;
                                }
                            }
                            this.field3521[n4] = (int)(Math.sin((double)(this.field3523 * -1) / 14.0) * 16.0 + Math.sin((double)(this.field3523 * -1) / 15.0) * 14.0 + Math.sin((double)(this.field3523 * -1) / 16.0) * 12.0);
                            --this.field3523;
                            ++n4;
                        }
                    }
                    this.field3521[n3] = this.field3521[n3 + n];
                    ++n3;
                }
            }
            n6 = this.field3532[n4 + n * 128];
            int[] arrn = this.field3529;
            n5 = this.field3526 * 655432131;
            n6 = n5 = n6 - arrn[this.field3529.length - 1 & n4 + n5 * -1215455509] * n / 6;
            if (n5 < 0) {
                n6 = 0;
            }
            this.field3532[n4] = n6;
            ++n3;
            ++n4;
        }
    }
}

