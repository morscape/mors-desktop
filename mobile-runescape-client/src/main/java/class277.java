/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cs")
public class class277
implements WorldMapSection {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1664365639)
    int field5871;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1020205355)
    int field5873;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=2068801585)
    int field5874;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1623621357)
    int field5875;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1316123907)
    int field5877;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-166200895)
    int field5879;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-905875031)
    int field5880;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1525501979)
    int field5881;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1546395765)
    int field5882;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=701659569)
    int field5883;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=176801909)
    int field5876;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1128797257)
    int field5878;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-739703911)
    int field5884;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1176444097)
    int field5872;

    class277() {
    }

    @Override
    @ObfuscatedName(value="ae")
    public boolean vmethod10367(int n, int n2, int n3, byte by) {
        block8: {
            boolean bl;
            block7: {
                boolean bl2;
                by = (byte)(this.field5878 * 265821689);
                bl = bl2 = false;
                if (n < by * 1128797257) break block7;
                if (n >= this.field5873 + this.field5878) break block8;
                bl = bl2;
                if (n2 >= (this.field5876 << 6) + (this.field5877 << 3)) {
                    bl = bl2;
                    if (n2 <= (this.field5876 << 6) + (this.field5871 << 3) + 7) {
                        bl = bl2;
                        if (n3 >= (this.field5884 << 6) + (this.field5879 << 3)) {
                            n = this.field5872 * -1626305345;
                            n2 = this.field5884 * -193617751;
                            bl = bl2;
                            if (n3 <= (n * -1176444097 << 3) + (n2 * -739703911 << 6) + 7) {
                                bl = true;
                            }
                        }
                    }
                }
            }
            return bl;
        }
        return false;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1901817910")
    void method10347() {
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;B)V", garbageValue="0")
    public void vmethod10380(Buffer buffer) {
        this.field5878 = buffer.method11650(-71604253);
        this.field5873 = buffer.method11650(1615649597);
        this.field5876 = buffer.method11637(819937431);
        this.field5877 = buffer.method11650(755231938);
        this.field5871 = buffer.method11650(-1221713958);
        this.field5884 = buffer.method11637(763574522);
        this.field5879 = buffer.method11650(0xE3E3EC3);
        this.field5872 = buffer.method11650(-141865139);
        this.field5875 = buffer.method11637(909573432);
        this.field5874 = buffer.method11650(807571359);
        this.field5880 = buffer.method11650(-63445845);
        this.field5883 = buffer.method11637(545172133);
        this.field5882 = buffer.method11650(-1434235693);
        this.field5881 = buffer.method11650(-813712768);
        this.method10347();
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="-76")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.field2396 > this.field5875) {
            worldMapArea.field2396 = this.field5875;
        }
        if (worldMapArea.field2397 < this.field5875) {
            worldMapArea.field2397 = this.field5875;
        }
        if (worldMapArea.field2403 > this.field5883) {
            worldMapArea.field2403 = this.field5883;
        }
        if (worldMapArea.field2401 < this.field5883) {
            worldMapArea.field2401 = this.field5883;
        }
    }

    @Override
    @ObfuscatedName(value="ax")
    public int[] vmethod10384(int n, int n2, int n3, byte by) {
        if (this.vmethod10367(n, n2, n3, (byte)-60)) {
            n = this.field5874 * 148828369;
            by = (byte)(this.field5877 * 1740399189);
            int n4 = this.field5875 * 705531621;
            int n5 = this.field5876 * 737134557;
            int n6 = this.field5882 * 1037610973;
            int n7 = this.field5879 * 1932727873;
            int n8 = this.field5883 * 353382225;
            int n9 = this.field5884 * -193617751;
            return new int[]{n * -629456504 - by * -1939056664 + n2 + (n4 * 832551744 - n5 * -1569579712), n3 + (n6 * -513735768 - n7 * -1329607160) + (n8 * 1956539456 - n9 * -96410048)};
        }
        return null;
    }

    @ObfuscatedName(value="adx")
    protected static final void method10337(int n) {
        class47.field2319.vmethod11622();
        n = 0;
        while (true) {
            if (n >= 32) {
                n = 0;
                while (true) {
                    if (n >= 32) {
                        class145.field3610 = 0;
                        return;
                    }
                    class138.field3540[n] = 0L;
                    ++n;
                }
            }
            class138.field3542[n] = 0L;
            ++n;
        }
    }

    @ObfuscatedName(value="ae")
    static int method10338(int n, int n2, int n3) {
        if (n == -2) {
            return 12345678;
        }
        if (n == -1) {
            if (n2 < 0) {
                n = 0;
            } else {
                n = n2;
                if (n2 > 127) {
                    n = 127;
                }
            }
            return 127 - n;
        }
        n2 = (n & 0x7F) * n2 / 128;
        n3 = 126;
        if (n2 < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = n3;
        }
        return (n & 0xFF80) + n2;
    }

    @ObfuscatedName(value="ai")
    static int method10340(int n, int n2, int n3, byte by) {
        by = (byte)n2;
        if (n3 > 179) {
            by = (byte)(n2 / 2);
        }
        n2 = by;
        if (n3 > 192) {
            n2 = by / 2;
        }
        by = (byte)n2;
        if (n3 > 217) {
            by = (byte)(n2 / 2);
        }
        n2 = by;
        if (n3 > 243) {
            n2 = by / 2;
        }
        return (n3 /= 2) + ((n /= 4) << 10) + ((n2 /= 32) << 7);
    }
}

