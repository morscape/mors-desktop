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

@ObfuscatedName(value="ix")
public class class318
implements class66 {
    @ObfuscatedName(value="aa")
    public int[] field6200;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1225007633)
    int field6202 = -1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-868100879)
    int field6203;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=9169992611383126837L)
    long field6204;
    @ObfuscatedName(value="aj")
    public int[] field6206;
    @ObfuscatedName(value="al")
    public int[] field6208;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=504721187)
    int field6209 = -1;
    @ObfuscatedName(value="an")
    boolean field6210 = false;
    @ObfuscatedName(value="ao")
    boolean field6211 = false;
    @ObfuscatedName(value="ap")
    boolean field6212 = false;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1767615475)
    int field6213 = -1;
    @ObfuscatedName(value="ar")
    boolean field6214 = false;
    @ObfuscatedName(value="as")
    public int[] field6215;
    @ObfuscatedName(value="aw")
    boolean field6216 = true;
    @ObfuscatedName(value="ay")
    boolean field6218 = true;
    @ObfuscatedName(value="az")
    boolean field6219 = false;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=-324528413)
    int field6220 = 0;
    @ObfuscatedName(value="bb")
    long[] field6221;
    @ObfuscatedName(value="bd")
    boolean field6223;
    @ObfuscatedName(value="be")
    int[] field6224;
    @ObfuscatedName(value="bh")
    char[] field6226;
    @ObfuscatedName(value="bj")
    int[] field6228;
    @ObfuscatedName(value="bm")
    int[] field6230;
    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="Lnh;")
    class206 field6231;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=1523473873)
    int field6232;
    @ObfuscatedName(value="bq")
    boolean[] field6233;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=1909587079)
    int field6234 = -1;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-854701615)
    int field6235 = 0;
    @ObfuscatedName(value="bx")
    double field6238;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1726981741)
    int field6205 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lib;")
    public class119 field6207 = class119.field3355;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=432047221)
    int field6217 = 0;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(longValue=9116628670696456461L)
    long field6222;
    @ObfuscatedName(value="bi")
    boolean field6227 = false;
    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="Lnh;")
    class206 field6236;
    @ObfuscatedName(value="bv")
    int field6237 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=985029313)
    int field6201 = -1;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=2066588581)
    int field6225 = 0;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=-1410729261)
    int field6229 = -1;

    class318() {
        this.field6215 = new int[4];
        this.field6206 = new int[4];
        this.field6208 = new int[4];
        this.field6200 = new int[4];
        this.field6228 = new int[128];
        this.field6226 = new char[128];
        this.field6233 = new boolean[106];
        this.field6224 = new int[500];
        this.field6230 = new int[500];
        this.field6221 = new long[500];
        this.field6236 = new class206(5);
        this.field6231 = new class206(5);
        this.method11259(100);
        this.method11271();
    }

    @Override
    @ObfuscatedName(value="aa")
    public boolean vmethod11251(int n, int n2, int n3, int n4, long l) {
        block18: {
            block21: {
                block20: {
                    block19: {
                        if (n >= 4) {
                            return true;
                        }
                        if (n > this.field6205) break block18;
                        if (n == 0) {
                            this.field6204 = class363.currentTimeMillis();
                        }
                        if (this.field6205 == n) {
                            this.field6205 -= -1;
                            this.field6215[n] = n3;
                            this.field6206[n] = n4;
                        }
                        ++this.field6217;
                        this.field6208[n] = n3;
                        this.field6200[n] = n4;
                        if (n2 > 0) {
                            this.field6237 = (this.field6237 * -2009600127 | n2) * -587706239;
                        }
                        if (this.field6205 == 1) break block19;
                        if (this.field6205 == 2) {
                            n = this.field6207.field3365;
                            if (n != 0) {
                                switch (n) {
                                    default: {
                                        return true;
                                    }
                                    case 3: 
                                    case 4: 
                                }
                            }
                            this.method11257(class119.field3357, -1843253956);
                            this.field6238 = this.method11306(0, 1);
                            this.method11319(0, 1);
                            Math.log(Client.field4963);
                        }
                        break block20;
                    }
                    this.field6227 = true;
                    n = this.field6207.field3365;
                    if (n != 1) {
                        if (n != 3) {
                            return true;
                        }
                        if (n2 != 4 || !GraphicsObject.field7506) {
                            this.method11265(n3, n4);
                            if (n2 != 2) {
                                this.method11257(class119.field3350, -1892539580);
                            } else {
                                this.method11257(class119.field3361, -1849671430);
                            }
                            boolean bl = n2 == 2;
                            this.method11273(n3, n4, l, bl);
                            return true;
                        }
                        this.method11257(class119.field3359, -1807860168);
                        return true;
                    }
                    if (this.field6210) break block21;
                }
                return true;
            }
            this.method11257(class119.field3353, -1766197282);
            return true;
        }
        return true;
    }

    @Override
    @ObfuscatedName(value="af")
    public boolean vmethod11256(int n, int n2, int n3, long l) {
        if (n >= 4) {
            return true;
        }
        long l2 = class363.currentTimeMillis();
        int n4 = this.field6200[n];
        if (this.field6205 == 1) {
            this.field6231.method6843(n2 - this.field6208[0]);
            this.field6236.method6843(n3 - this.field6200[0]);
        }
        this.field6208[n] = n2;
        this.field6200[n] = n3;
        if (this.field6217 == 2 && this.field6207.field3365 == 12) {
            int n5 = (int)((this.method11306(0, 1) - this.field6238) / 5.0);
            this.field6238 += (double)(n5 * 5);
            Client.field4916 = -n5 + Client.field4916;
        }
        if (n == 0) {
            this.method11268(n2, n3, l);
            if (this.field6205 == 1 && l2 >= this.field6204 && this.containsCoord(n2, n3, 1405044445)) {
                this.field6214 = true;
                n = this.field6207.field3365;
                if (n != 4) {
                    if (n != 13) {
                        switch (n) {
                            default: {
                                return true;
                            }
                            case 7: {
                                Client.field4917 = n3 - n4;
                                return true;
                            }
                            case 6: 
                        }
                        this.method11257(class119.field3362, -1902452225);
                        return true;
                    }
                    this.method11257(class119.field3352, -1823115705);
                    return true;
                }
                if (!this.field6227) {
                    this.method11318(l2, this.field6212);
                }
            }
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Lib;I)V")
    public void method11257(class119 class1192, int n) {
        this.field6207 = class1192;
        n = this.field6207.field3365;
        if (n != 0) {
            if (n != 9) {
                if (n != 13) {
                    return;
                }
                if (this.field6217 != 0) return;
                this.field6207 = class119.field3352;
                return;
            }
            if (this.field6213 != -1) {
                this.method11265(this.field6213, this.field6209);
                this.field6208[0] = this.field6213;
                this.field6200[0] = this.field6209;
            } else {
                this.method11266();
            }
            this.method11271();
            return;
        }
        Client.field4822 = this.field6208[this.field6220];
        Client.field4818 = this.field6200[this.field6220];
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1118564868")
    void method11258() {
        this.field6229 = -1;
        this.field6234 = -1;
    }

    @Override
    @ObfuscatedName(value="aj")
    public boolean vmethod11260(int n, long l) {
        this.field6233[n] = false;
        return true;
    }

    @Override
    @ObfuscatedName(value="al")
    public boolean vmethod11262(char c, long l) {
        if (this.field6225 < this.field6228.length) {
            this.field6228[this.field6225] = -1;
            this.field6226[this.field6225] = c;
            ++this.field6225;
        }
        return true;
    }

    @Override
    @ObfuscatedName(value="am")
    public boolean vmethod11263(int n, int n2, long l) {
        this.method11317();
        return true;
    }

    @Override
    @ObfuscatedName(value="an")
    public boolean vmethod11264(int n, long l) {
        return true;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="67")
    void method11265(int n, int n2) {
        this.field6201 = n;
        this.field6202 = n2;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    void method11266() {
        this.field6202 = -1;
        this.field6201 = -1;
    }

    @Override
    @ObfuscatedName(value="aq")
    public boolean vmethod11267(int n, int n2, long l) {
        int[] arrn = this.field6208;
        int n3 = n * -1686772421;
        this.field6213 = n3 * 1767615475;
        arrn[0] = n3 * 1767615475;
        arrn = this.field6200;
        n3 = n2 * -1659946869;
        this.field6209 = n3 * 504721187;
        arrn[0] = n3 * 504721187;
        this.method11268(n, n2, l);
        switch (this.field6207.field3365) {
            default: {
                return true;
            }
            case 4: {
                if (!this.containsPosition(1, 214622018) || this.field6227 || !this.containsCoord(n, n2, -1334415551)) break;
                this.method11318(class363.currentTimeMillis(), false);
                return true;
            }
            case 3: {
                this.method11265(n, n2);
            }
        }
        return true;
    }

    @ObfuscatedName(value="ar")
    void method11268(int n, int n2, long l) {
        if (this.field6235 > 0 && l / 50L == this.field6221[this.field6235 - 1] / 50L) {
            --this.field6235;
        } else if (this.field6235 >= 500) {
            return;
        }
        this.field6224[this.field6235] = n;
        this.field6230[this.field6235] = n2;
        this.field6221[this.field6235] = l;
        ++this.field6235;
    }

    @Override
    @ObfuscatedName(value="as")
    public boolean vmethod11269(int n, long l) {
        if (this.field6225 < this.field6228.length) {
            this.field6228[this.field6225] = n;
            this.field6226[this.field6225] = '\u0000';
            ++this.field6225;
        }
        this.field6233[n] = true;
        if (Client.field4899 >= 2 && n == 66 && this.field6233[82]) {
            class318.FriendSystem_invalidateIgnoreds();
        }
        return true;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1588067037")
    void method11271() {
        if (this.field6217 == 0) {
            this.field6207 = class119.field3355;
            this.method11254();
            this.field6205 = 0;
            this.method11292(1967402903);
            if (this.field6213 != -1) {
                this.field6208[0] = this.field6213;
                this.field6200[0] = this.field6209;
            }
            this.field6220 = 0;
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIJZI)V", garbageValue="1656334293")
    void method11273(int n, int n2, long l, boolean bl) {
        this.field6234 = n;
        this.field6229 = n2;
        this.field6222 = l;
        this.field6223 = bl;
    }

    @Override
    @ObfuscatedName(value="ay")
    public boolean vmethod11275(int n, long l) {
        return true;
    }

    @ObfuscatedName(value="bp")
    void method11292(int n) {
        n = 0;
        while (n < 4) {
            int[] arrn = this.field6215;
            this.field6206[n] = -1;
            arrn[n] = -1;
            arrn = this.field6208;
            this.field6200[n] = -1;
            arrn[n] = -1;
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="626700984")
    void method11317() {
        this.field6217 = 0;
        this.field6237 = 0;
        this.method11271();
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1483511423")
    public void method11254() {
        this.field6212 = false;
        this.field6219 = false;
        this.field6211 = false;
        this.field6214 = false;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1331623220")
    void method11259(int n) {
        this.field6203 = n;
        this.method11270();
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-750599732")
    void method11270() {
        this.field6232 = this.field6203 * 25 / 200;
    }

    @ObfuscatedName(value="av")
    void method11272(byte by) {
        this.field6225 = 0;
        this.field6227 = false;
        this.method11258();
        by = (byte)this.field6207.field3365;
        if (by != 5 && by != 14) {
            return;
        }
        this.method11257(class119.field3362, -1674616597);
    }

    @ObfuscatedName(value="bi")
    @Export(value="containsCoord")
    boolean containsCoord(int n, int n2, int n3) {
        int[] arrn = this.field6215;
        boolean bl = false;
        if (n < arrn[0] - this.field6232 || n > this.field6232 + this.field6215[0] || n2 < this.field6206[0] - this.field6232 || n2 > (n3 = this.field6206[0]) + (n = this.field6232 * 816519985) * 1523473873) {
            bl = true;
        }
        return bl;
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(III)D", garbageValue="-538756251")
    double method11306(int n, int n2) {
        double d = Math.hypot(this.field6208[n] - this.field6208[n2], this.field6200[n] - this.field6200[n2]);
        return d;
    }

    @ObfuscatedName(value="ch")
    @Export(value="containsPosition")
    boolean containsPosition(int n, int n2) {
        n2 = this.field6237;
        return (n2 * -2009600127 & n) == n;
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(III)D", garbageValue="-532723038")
    double method11319(int n, int n2) {
        double d = Math.atan2(this.field6208[n] - this.field6208[n2], this.field6200[n] - this.field6200[n2]);
        return d;
    }

    @Override
    @ObfuscatedName(value="ab")
    public boolean vmethod11252(int n, int n2, int n3, int n4, long l) {
        if (n >= 4) {
            return true;
        }
        if (this.field6217 != 0) {
            --this.field6217;
            if (n2 > 0) {
                this.field6237 = (n2 & this.field6237 * -2009600127) * -587706239;
            }
            if (this.field6217 == 0) {
                switch (this.field6207.field3365) {
                    case 13: {
                        this.method11257(class119.field3352, -1958513822);
                        break;
                    }
                    case 11: {
                        this.method11257(class119.field3349, -1729132515);
                        break;
                    }
                    case 9: {
                        this.method11271();
                        break;
                    }
                    case 7: {
                        this.method11257(class119.field3362, -1777924258);
                        break;
                    }
                    case 6: {
                        this.method11257(class119.field3353, -1696270335);
                        break;
                    }
                    case 4: {
                        this.method11257(class119.field3353, -1779117054);
                        break;
                    }
                    default: {
                        break;
                    }
                    case 2: {
                        this.method11257(class119.field3356, -1697393737);
                        break;
                    }
                    case 1: {
                        this.field6208[n] = n3;
                        this.field6200[n] = n4;
                        this.method11257(class119.field3353, -2103512001);
                        break;
                    }
                    case 0: 
                    case 12: {
                        this.method11257(class119.field3362, -2025547229);
                    }
                }
            }
            if (this.field6217 == 1 && this.field6207 == class119.field3357) {
                n = n == 0 ? 1 : 0;
                this.field6220 = n;
                this.method11257(class119.field3359, -1962267332);
            }
            return true;
        }
        return true;
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(JZI)V", garbageValue="1571759265")
    void method11318(long l, boolean bl) {
        if (!this.field6219 || this.field6211 && l < this.field6204 + 150L) {
            if (!this.field6211) {
                if (!bl) {
                    this.method11257(class119.field3362, -1683132656);
                    return;
                }
                this.method11257(class119.field3359, -1825628165);
                return;
            }
            this.method11257(class119.field3348, -1787146244);
            return;
        }
        this.method11257(class119.field3354, -1999079206);
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="13")
    @Export(value="FriendSystem_invalidateIgnoreds")
    static void FriendSystem_invalidateIgnoreds() {
        String string2 = class128.method5553();
        Client.field4740.method5715(string2);
    }

    @ObfuscatedName(value="dy")
    static final void method11250(int n, int n2, int n3, int n4) {
        if (n >= 128 && n2 >= 128 && n <= 13056 && n2 <= 13056) {
            n4 = DevicePcmPlayerProvider.method11095(n, n2, WorldMapIcon_1.field5913 * 63889799, -1416385247);
            int n5 = Rasterizer3D.Rasterizer3D_cosine[PcmPlayer.field3256];
            int n6 = Rasterizer3D.Rasterizer3D_cosine[class291.field5991];
            int n7 = Rasterizer3D.Rasterizer3D_sine[class291.field5991];
            int n8 = n6 * (n2 -= class95.field2738) - (n -= class203.field3944) * n7 >> 16;
            n4 = Rasterizer3D.Rasterizer3D_sine[PcmPlayer.field3256];
            int n9 = n5 * n8 + n4 * (n3 = n4 - n3 - class260.field4459) >> 16;
            if (n9 < 50) {
                Client.viewportTempX = -1;
                Client.viewportTempY = -1;
                return;
            }
            Client.viewportTempX = Client.field4980 / 2 + (n7 * n2 + n * n6 >> 16) * Client.field4987 / n9;
            Client.viewportTempY = (n5 * n3 - n4 * n8 >> 16) * Client.field4987 / n9 + Client.field4982 / 2;
            return;
        }
        Client.viewportTempX = -1;
        Client.viewportTempY = -1;
    }
}

