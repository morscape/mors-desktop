/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  byte[]
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ce")
@Implements(value="WorldMapScaleHandler")
public class WorldMapScaleHandler {
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field565;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field567;
    @ObfuscatedName(value="jl")
    @ObfuscatedSignature(descriptor="Lhv;")
    @Export(value="localPlayer")
    public static Player localPlayer;
    @ObfuscatedName(value="ae")
    @Export(value="tileTemplates")
    byte[][][] tileTemplates;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1139567331)
    @Export(value="size")
    int size;

    WorldMapScaleHandler(int n) {
        this.size = n;
    }

    @ObfuscatedName(value="aa")
    @Export(value="arrayRemove")
    void arrayRemove(int n) {
        byte[] arrby = new byte[this.size * this.size];
        n = this.size - 1;
        int n2 = 0;
        int n3 = 0;
        block0: while (true) {
            int n4;
            if (n < 0) {
                this.tileTemplates[4][0] = arrby;
                arrby = new byte[this.size * this.size];
                n = 0;
                block1: for (n3 = this.size - 1; n3 >= 0; --n3) {
                    n4 = 0;
                    while (true) {
                        if (n4 >= this.size) {
                            continue block1;
                        }
                        if (n4 <= n3 << 1) {
                            arrby[n] = -1;
                        }
                        ++n;
                        ++n4;
                    }
                }
                this.tileTemplates[4][1] = arrby;
                arrby = new byte[this.size * this.size];
                n3 = 0;
                n = 0;
                block3: while (true) {
                    if (n3 >= this.size) {
                        this.tileTemplates[4][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        n3 = 0;
                        n = n2;
                        block4: while (true) {
                            if (n >= this.size) {
                                this.tileTemplates[4][3] = arrby;
                                return;
                            }
                            n4 = this.size - 1;
                            while (true) {
                                if (n4 >= 0) {
                                    if (n4 <= n << 1) {
                                        arrby[n3] = -1;
                                    }
                                } else {
                                    ++n;
                                    continue block4;
                                }
                                ++n3;
                                --n4;
                            }
                            break;
                        }
                    }
                    n4 = 0;
                    while (true) {
                        if (n4 >= this.size) {
                            ++n3;
                            continue block3;
                        }
                        if (n4 >= n3 >> 1) {
                            arrby[n] = -1;
                        }
                        ++n;
                        ++n4;
                    }
                    break;
                }
            }
            n4 = this.size - 1;
            while (true) {
                if (n4 >= 0) {
                    if (n4 >= n >> 1) {
                        arrby[n3] = -1;
                    }
                } else {
                    --n;
                    continue block0;
                }
                ++n3;
                --n4;
            }
            break;
        }
    }

    @ObfuscatedName(value="ae")
    int method1028(int n, int n2, int n3) {
        n3 = n;
        if (n2 == 9) {
            n3 = n + 1 & 3;
        }
        n = n3;
        if (n2 == 10) {
            n = n3 + 3 & 3;
        }
        n3 = n;
        if (n2 == 11) {
            n3 = n + 3 & 3;
        }
        return n3;
    }

    @ObfuscatedName(value="af")
    void method1029(int n) {
        byte[] arrby = new byte[this.size * this.size];
        arrby = new byte[this.size * this.size];
        int n2 = 0;
        int n3 = 0;
        n = 0;
        block0: while (true) {
            int n4;
            if (n3 >= this.size) {
                this.tileTemplates[6][0] = arrby;
                arrby = new byte[this.size * this.size];
                n = 0;
                block1: for (n3 = this.size - 1; n3 >= 0; --n3) {
                    n4 = 0;
                    while (true) {
                        if (n4 >= this.size) continue block1;
                        if (n4 <= n3 - this.size / 2) {
                            arrby[n] = -1;
                        }
                        ++n;
                        ++n4;
                    }
                }
                this.tileTemplates[6][1] = arrby;
                arrby = new byte[this.size * this.size];
                n = this.size - 1;
                n3 = 0;
                block3: while (true) {
                    if (n < 0) {
                        this.tileTemplates[6][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        n3 = 0;
                        n = n2;
                        block4: while (true) {
                            if (n >= this.size) {
                                this.tileTemplates[6][3] = arrby;
                                return;
                            }
                            n4 = this.size - 1;
                            while (true) {
                                if (n4 < 0) {
                                    ++n;
                                    continue block4;
                                }
                                if (n4 <= n - this.size / 2) {
                                    arrby[n3] = -1;
                                }
                                ++n3;
                                --n4;
                            }
                            break;
                        }
                    }
                    n4 = this.size - 1;
                    while (true) {
                        if (n4 < 0) {
                            --n;
                            continue block3;
                        }
                        if (n4 <= n - this.size / 2) {
                            arrby[n3] = -1;
                        }
                        ++n3;
                        --n4;
                    }
                    break;
                }
            }
            n4 = 0;
            while (true) {
                block17: {
                    block18: {
                        block16: {
                            if (n4 >= this.size) break block16;
                            if (n4 > n3 - this.size / 2) break block17;
                            break block18;
                        }
                        ++n3;
                        continue block0;
                    }
                    arrby[n] = -1;
                }
                ++n;
                ++n4;
            }
            break;
        }
    }

    @ObfuscatedName(value="ah")
    void method1031(int n) {
        byte[] arrby = new byte[this.size * this.size];
        int n2 = 0;
        n = 0;
        block0: while (true) {
            int n3;
            if (n2 >= this.size) {
                this.tileTemplates[0][0] = arrby;
                arrby = new byte[this.size * this.size];
                n = 0;
                block1: for (n2 = this.size - 1; n2 >= 0; --n2) {
                    n3 = 0;
                    while (true) {
                        if (n3 >= this.size) {
                            continue block1;
                        }
                        if (n3 <= n2) {
                            arrby[n] = -1;
                        }
                        ++n;
                        ++n3;
                    }
                }
                this.tileTemplates[0][1] = arrby;
                arrby = new byte[this.size * this.size];
                n2 = 0;
                n = 0;
                block3: while (true) {
                    if (n2 >= this.size) {
                        this.tileTemplates[0][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        n = 0;
                        block4: for (n2 = this.size - 1; n2 >= 0; --n2) {
                            n3 = 0;
                            while (true) {
                                if (n3 >= this.size) {
                                    continue block4;
                                }
                                if (n3 >= n2) {
                                    arrby[n] = -1;
                                }
                                ++n;
                                ++n3;
                            }
                        }
                        this.tileTemplates[0][3] = arrby;
                        return;
                    }
                    n3 = 0;
                    while (true) {
                        if (n3 >= this.size) {
                            ++n2;
                            continue block3;
                        }
                        if (n3 >= n2) {
                            arrby[n] = -1;
                        }
                        ++n;
                        ++n3;
                    }
                    break;
                }
            }
            n3 = 0;
            while (true) {
                if (n3 >= this.size) {
                    ++n2;
                    continue block0;
                }
                if (n3 <= n2) {
                    arrby[n] = -1;
                }
                ++n;
                ++n3;
            }
            break;
        }
    }

    @ObfuscatedName(value="aj")
    void method1033(byte by) {
        byte[] arrby = new byte[this.size * this.size];
        by = (byte)(this.size - 1);
        byte by2 = 0;
        int n = 0;
        block0: while (true) {
            int n2;
            if (by < 0) {
                this.tileTemplates[2][0] = arrby;
                arrby = new byte[this.size * this.size];
                by = 0;
                block1: for (n = this.size - 1; n >= 0; --n) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.size) {
                            continue block1;
                        }
                        if (n2 >= n << 1) {
                            arrby[by] = -1;
                        }
                        by = (byte)(by + 1);
                        ++n2;
                    }
                }
                this.tileTemplates[2][1] = arrby;
                arrby = new byte[this.size * this.size];
                n = 0;
                by = 0;
                block3: while (true) {
                    if (n >= this.size) {
                        this.tileTemplates[2][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        n = 0;
                        by = by2;
                        block4: while (true) {
                            if (by >= this.size) {
                                this.tileTemplates[2][3] = arrby;
                                return;
                            }
                            n2 = this.size - 1;
                            while (true) {
                                if (n2 >= 0) {
                                    if (n2 >= by << 1) {
                                        arrby[n] = -1;
                                    }
                                } else {
                                    by = (byte)(by + 1);
                                    continue block4;
                                }
                                ++n;
                                --n2;
                            }
                            break;
                        }
                    }
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.size) {
                            ++n;
                            continue block3;
                        }
                        if (n2 <= n >> 1) {
                            arrby[by] = -1;
                        }
                        by = (byte)(by + 1);
                        ++n2;
                    }
                    break;
                }
            }
            n2 = this.size - 1;
            while (true) {
                if (n2 >= 0) {
                    if (n2 <= by >> 1) {
                        arrby[n] = -1;
                    }
                } else {
                    by = (byte)(by - 1);
                    continue block0;
                }
                ++n;
                --n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="al")
    void method1035(byte by) {
        int n;
        int n2;
        byte[] arrby = new byte[this.size * this.size];
        int n3 = 0;
        by = 0;
        block0: for (n2 = this.size - 1; n2 >= 0; --n2) {
            n = 0;
            while (true) {
                if (n >= this.size) {
                    continue block0;
                }
                if (n >= n2 >> 1) {
                    arrby[by] = -1;
                }
                by = (byte)(by + 1);
                ++n;
            }
        }
        this.tileTemplates[3][0] = arrby;
        arrby = new byte[this.size * this.size];
        n2 = 0;
        by = 0;
        block2: while (true) {
            if (n2 >= this.size) {
                this.tileTemplates[3][1] = arrby;
                arrby = new byte[this.size * this.size];
                by = 0;
                n2 = 0;
                block3: while (true) {
                    if (by >= this.size) {
                        this.tileTemplates[3][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        by = (byte)(this.size - 1);
                        n2 = n3;
                        block4: while (true) {
                            if (by < 0) {
                                this.tileTemplates[3][3] = arrby;
                                return;
                            }
                            n = this.size - 1;
                            while (true) {
                                if (n >= 0) {
                                    if (n <= by << 1) {
                                        arrby[n2] = -1;
                                    }
                                } else {
                                    by = (byte)(by - 1);
                                    continue block4;
                                }
                                ++n2;
                                --n;
                            }
                            break;
                        }
                    }
                    n = this.size - 1;
                    while (true) {
                        if (n >= 0) {
                            if (n >= by >> 1) {
                                arrby[n2] = -1;
                            }
                        } else {
                            by = (byte)(by + 1);
                            continue block3;
                        }
                        ++n2;
                        --n;
                    }
                    break;
                }
            }
            n = 0;
            while (true) {
                if (n >= this.size) {
                    ++n2;
                    continue block2;
                }
                if (n <= n2 << 1) {
                    arrby[by] = -1;
                }
                by = (byte)(by + 1);
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="aq")
    void method1040(byte by) {
        byte[] arrby = new byte[this.size * this.size];
        arrby = new byte[this.size * this.size];
        byte by2 = 0;
        int n = 0;
        by = 0;
        block0: while (true) {
            int n2;
            if (n >= this.size) {
                this.tileTemplates[7][0] = arrby;
                arrby = new byte[this.size * this.size];
                by = 0;
                block1: for (n = this.size - 1; n >= 0; --n) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= this.size) continue block1;
                        if (n2 >= n - this.size / 2) {
                            arrby[by] = -1;
                        }
                        by = (byte)(by + 1);
                        ++n2;
                    }
                }
                this.tileTemplates[7][1] = arrby;
                arrby = new byte[this.size * this.size];
                by = (byte)(this.size - 1);
                n = 0;
                block3: while (true) {
                    if (by < 0) {
                        this.tileTemplates[7][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        n = 0;
                        by = by2;
                        block4: while (true) {
                            if (by >= this.size) {
                                this.tileTemplates[7][3] = arrby;
                                return;
                            }
                            n2 = this.size - 1;
                            while (true) {
                                if (n2 < 0) {
                                    by = (byte)(by + 1);
                                    continue block4;
                                }
                                if (n2 >= by - this.size / 2) {
                                    arrby[n] = -1;
                                }
                                ++n;
                                --n2;
                            }
                            break;
                        }
                    }
                    n2 = this.size - 1;
                    while (true) {
                        if (n2 < 0) {
                            by = (byte)(by - 1);
                            continue block3;
                        }
                        if (n2 >= by - this.size / 2) {
                            arrby[n] = -1;
                        }
                        ++n;
                        --n2;
                    }
                    break;
                }
            }
            n2 = 0;
            while (true) {
                block17: {
                    block18: {
                        block16: {
                            if (n2 >= this.size) break block16;
                            if (n2 < n - this.size / 2) break block17;
                            break block18;
                        }
                        ++n;
                        continue block0;
                    }
                    arrby[by] = -1;
                }
                by = (byte)(by + 1);
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="as")
    void method1042(byte by) {
        int n;
        int n2;
        byte[] arrby = new byte[this.size * this.size];
        int n3 = 0;
        by = 0;
        block0: for (n2 = this.size - 1; n2 >= 0; --n2) {
            n = 0;
            while (true) {
                if (n >= this.size) {
                    continue block0;
                }
                if (n <= n2 >> 1) {
                    arrby[by] = -1;
                }
                by = (byte)(by + 1);
                ++n;
            }
        }
        this.tileTemplates[1][0] = arrby;
        arrby = new byte[this.size * this.size];
        n2 = 0;
        by = 0;
        block2: while (true) {
            if (n2 >= this.size) {
                this.tileTemplates[1][1] = arrby;
                arrby = new byte[this.size * this.size];
                by = 0;
                n2 = 0;
                block3: while (true) {
                    if (by >= this.size) {
                        this.tileTemplates[1][2] = arrby;
                        arrby = new byte[this.size * this.size];
                        by = (byte)(this.size - 1);
                        n2 = n3;
                        block4: while (true) {
                            if (by < 0) {
                                this.tileTemplates[1][3] = arrby;
                                return;
                            }
                            n = this.size - 1;
                            while (true) {
                                if (n >= 0) {
                                    if (n >= by << 1) {
                                        arrby[n2] = -1;
                                    }
                                } else {
                                    by = (byte)(by - 1);
                                    continue block4;
                                }
                                ++n2;
                                --n;
                            }
                            break;
                        }
                    }
                    n = this.size - 1;
                    while (true) {
                        if (n >= 0) {
                            if (n <= by >> 1) {
                                arrby[n2] = -1;
                            }
                        } else {
                            by = (byte)(by + 1);
                            continue block3;
                        }
                        ++n2;
                        --n;
                    }
                    break;
                }
            }
            n = 0;
            while (true) {
                if (n >= this.size) {
                    ++n2;
                    continue block2;
                }
                if (by >= 0 && by < arrby.length) {
                    if (n >= n2 << 1) {
                        arrby[by] = -1;
                    }
                    by = (byte)(by + 1);
                } else {
                    by = (byte)(by + 1);
                }
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-1833935302")
    int method1032(int n) {
        if (n != 9 && n != 10) {
            if (n == 11) {
                return 8;
            }
            return n;
        }
        return 1;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIIIIIIILfj;I)V", garbageValue="1410070613")
    void method1034(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, class72 class722) {
        if (n7 != 0 && this.size != 0) {
            if (this.tileTemplates != null) {
                n8 = this.method1028(n8, n7, -323556399);
                n7 = this.method1032(n7);
                class722.vmethod10759(n, n2, n5, n6, n3, n4, this.tileTemplates[n7 - 1][n8], this.size, true, 582468828);
                return;
            }
        } else {
            return;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="984806123")
    @Export(value="init6")
    void init6() {
        if (this.tileTemplates == null) {
            this.tileTemplates = (byte[][][])Array.newInstance(byte[].class, 8, 4);
            this.method1031(2004726800);
            this.method1042((byte)7);
            this.method1033((byte)19);
            this.method1035((byte)0);
            this.arrayRemove(-1077903751);
            this.method1025((byte)7);
            this.method1029(1484452320);
            this.method1040((byte)-128);
            return;
        }
    }

    @ObfuscatedName(value="ab")
    void method1025(byte by) {
        byte[] arrby = new byte[this.size * this.size];
        arrby = new byte[this.size * this.size];
        int n = 0;
        by = 0;
        block0: while (true) {
            int n2;
            block9: {
                if (n < this.size) break block9;
                this.tileTemplates[5][0] = arrby;
                arrby = new byte[this.size * this.size];
                n = 0;
                by = 0;
                block1: while (true) {
                    block10: {
                        if (n < this.size) break block10;
                        this.tileTemplates[5][1] = arrby;
                        arrby = new byte[this.size * this.size];
                        n = 0;
                        by = 0;
                        block2: while (true) {
                            block11: {
                                if (n < this.size) break block11;
                                this.tileTemplates[5][2] = arrby;
                                arrby = new byte[this.size * this.size];
                                n = 0;
                                by = 0;
                                block3: while (true) {
                                    if (n >= this.size) {
                                        this.tileTemplates[5][3] = arrby;
                                        return;
                                    }
                                    n2 = 0;
                                    while (true) {
                                        block13: {
                                            block14: {
                                                block12: {
                                                    if (n2 >= this.size) break block12;
                                                    if (n < this.size / 2) break block13;
                                                    break block14;
                                                }
                                                ++n;
                                                continue block3;
                                            }
                                            arrby[by] = -1;
                                        }
                                        by = (byte)(by + 1);
                                        ++n2;
                                    }
                                    break;
                                }
                            }
                            n2 = 0;
                            while (true) {
                                block16: {
                                    block17: {
                                        block15: {
                                            if (n2 >= this.size) break block15;
                                            if (n2 < this.size / 2) break block16;
                                            break block17;
                                        }
                                        ++n;
                                        continue block2;
                                    }
                                    arrby[by] = -1;
                                }
                                by = (byte)(by + 1);
                                ++n2;
                            }
                            break;
                        }
                    }
                    n2 = 0;
                    while (true) {
                        block19: {
                            block20: {
                                block18: {
                                    if (n2 >= this.size) break block18;
                                    if (n > this.size / 2) break block19;
                                    break block20;
                                }
                                ++n;
                                continue block1;
                            }
                            arrby[by] = -1;
                        }
                        by = (byte)(by + 1);
                        ++n2;
                    }
                    break;
                }
            }
            n2 = 0;
            while (true) {
                block22: {
                    block23: {
                        block21: {
                            if (n2 >= this.size) break block21;
                            if (n2 > this.size / 2) break block22;
                            break block23;
                        }
                        ++n;
                        continue block0;
                    }
                    arrby[by] = -1;
                }
                by = (byte)(by + 1);
                ++n2;
            }
            break;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ae")
    public static int method1021(int n, int n2, byte by) {
        by = (byte)n;
        int n3 = n2;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || n2 <= n) {
                n = n3;
                n2 = by;
            }
            if (n == 0) {
                return n2;
            }
            n3 = n2 % n;
            by = (byte)n;
        }
    }

    @ObfuscatedName(value="ao")
    static void method1023(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, short s) {
        s = (short)(-(n4 >> 2));
        int n8 = -(n4 & 3);
        n4 = -n5;
        while (true) {
            if (n4 < 0) {
                n = n3;
            } else {
                return;
            }
            for (n3 = (int)s; n3 < 0; ++n3) {
                n5 = n2 + 1;
                int n9 = arrn2[n2];
                if (n9 != 0) {
                    n2 = n + 1;
                    arrn[n] = n9;
                    n = n2;
                } else {
                    ++n;
                }
                n9 = n5 + 1;
                n5 = arrn2[n5];
                if (n5 != 0) {
                    n2 = n + 1;
                    arrn[n] = n5;
                    n = n2;
                } else {
                    ++n;
                }
                n5 = n9 + 1;
                n9 = arrn2[n9];
                if (n9 != 0) {
                    n2 = n + 1;
                    arrn[n] = n9;
                    n = n2;
                } else {
                    ++n;
                }
                n2 = n5 + 1;
                n5 = arrn2[n5];
                if (n5 != 0) {
                    arrn[n] = n5;
                    ++n;
                    continue;
                }
                ++n;
            }
            n3 = n8;
            while (n3 < 0) {
                n5 = arrn2[n2];
                if (n5 != 0) {
                    arrn[n] = n5;
                    ++n;
                } else {
                    ++n;
                }
                ++n3;
                ++n2;
            }
            ++n4;
            n3 = n + n6;
            n2 += n7;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([BB)Lcl;", garbageValue="-83")
    static WorldMapSprite method1022(byte[] object) {
        if (object != null) {
            object = new WorldMapSprite(HorizontalAlignment.method10448((byte[])object).field7129);
            return object;
        }
        return new WorldMapSprite();
    }
}

