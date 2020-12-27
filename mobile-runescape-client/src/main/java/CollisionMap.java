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
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gg")
@Implements(value="CollisionMap")
public class CollisionMap {
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=135846553)
    @Export(value="xSize")
    int xSize;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=-1038055295)
    @Export(value="xInset")
    int xInset = 0;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=1581327307)
    @Export(value="ySize")
    int ySize;
    @ObfuscatedName(value="bz")
    public int[][] field2687;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=-1761687385)
    @Export(value="yInset")
    int yInset = 0;

    public CollisionMap(int n, int n2) {
        this.xSize = n;
        this.ySize = n2;
        this.field2687 = (int[][])Array.newInstance(Integer.TYPE, this.xSize, this.ySize);
        this.method4781(-358741512);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIIZI)V", garbageValue="1573895491")
    public void method4775(int n, int n2, int n3, int n4, boolean bl) {
        n -= this.xInset;
        n2 -= this.yInset;
        if (n3 == 0) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 128);
                this.setFlagOff(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 2);
                this.setFlagOff(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 8);
                this.setFlagOff(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 32);
                this.setFlagOff(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 1);
                this.setFlagOff(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 4);
                this.setFlagOff(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 16);
                this.setFlagOff(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 64);
                this.setFlagOff(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.setFlagOff(n, n2, 130);
                this.setFlagOff(n - 1, n2, 8);
                this.setFlagOff(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.setFlagOff(n, n2, 10);
                this.setFlagOff(n, n2 + 1, 32);
                this.setFlagOff(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.setFlagOff(n, n2, 40);
                this.setFlagOff(n + 1, n2, 128);
                this.setFlagOff(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.setFlagOff(n, n2, 160);
                this.setFlagOff(n, n2 - 1, 2);
                this.setFlagOff(n - 1, n2, 8);
            }
        }
        if (bl) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 65536);
                    this.setFlagOff(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 1024);
                    this.setFlagOff(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 4096);
                    this.setFlagOff(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 16384);
                    this.setFlagOff(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 512);
                    this.setFlagOff(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 2048);
                    this.setFlagOff(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 8192);
                    this.setFlagOff(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 32768);
                    this.setFlagOff(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.setFlagOff(n, n2, 66560);
                    this.setFlagOff(n - 1, n2, 4096);
                    this.setFlagOff(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.setFlagOff(n, n2, 5120);
                    this.setFlagOff(n, n2 + 1, 16384);
                    this.setFlagOff(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.setFlagOff(n, n2, 20480);
                    this.setFlagOff(n + 1, n2, 65536);
                    this.setFlagOff(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.setFlagOff(n, n2, 81920);
                    this.setFlagOff(n, n2 - 1, 1024);
                    this.setFlagOff(n - 1, n2, 4096);
                }
            }
        }
    }

    @ObfuscatedName(value="ah")
    public void method4778(int n, int n2, int n3) {
        n3 = this.xInset * -259541119;
        int[] arrn = this.field2687[n - n3 * -1038055295];
        arrn[n2 -= this.yInset] = arrn[n2] | 0x40000;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="103799503")
    @Export(value="setFlagOff")
    void setFlagOff(int n, int n2, int n3) {
        int[] arrn = this.field2687[n];
        arrn[n2] = n3 | arrn[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ai")
    public void method4779(int n, int n2, int n3, int n4, boolean bl, int n5) {
        n5 = 256;
        if (bl) {
            n5 = 131328;
        }
        int n6 = n - this.xInset;
        int n7 = n2 - this.yInset;
        n = n6;
        while (n < n3 + n6) {
            if (n >= 0 && n < this.xSize) {
                for (n2 = n7; n2 < n7 + n4; ++n2) {
                    if (n2 < 0 || n2 >= this.ySize) continue;
                    this.setFlagOff(n, n2, n5);
                }
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ak")
    public void method4781(int n) {
        n = 0;
        block0: while (n < this.xSize) {
            int n2 = 0;
            while (true) {
                if (n2 >= this.ySize) {
                    ++n;
                    continue block0;
                }
                this.field2687[n][n2] = n != 0 && n2 != 0 && n < this.xSize - 5 && n2 < this.ySize - 5 ? 0x1000000 : 0xFFFFFF;
                ++n2;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ax")
    public void method4794(int n, int n2, byte by) {
        by = (byte)(this.xInset * -259541119);
        int[] arrn = this.field2687[n - by * -1038055295];
        arrn[n2 -= this.yInset] = arrn[n2] | 0x200000;
    }
}

