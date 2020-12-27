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

@ObfuscatedName(value="bv")
@Implements(value="Texture")
public class Texture
extends Node {
    @ObfuscatedName(value="ar")
    static int[] field4660;
    @ObfuscatedName(value="aa")
    int[] field4662;
    @ObfuscatedName(value="af")
    int field4664;
    @ObfuscatedName(value="ah")
    @Export(value="averageRGB")
    int averageRGB;
    @ObfuscatedName(value="aj")
    @Export(value="fileIds")
    int[] fileIds;
    @ObfuscatedName(value="al")
    int[] field4667;
    @ObfuscatedName(value="am")
    int field4668;
    @ObfuscatedName(value="an")
    int field4669;
    @ObfuscatedName(value="aq")
    int field4670;
    @ObfuscatedName(value="as")
    boolean field4671;
    @ObfuscatedName(value="aw")
    @Export(value="isLoaded")
    boolean isLoaded;
    @ObfuscatedName(value="ay")
    @Export(value="pixels")
    int[] pixels;
    @ObfuscatedName(value="ab")
    int[] field4663;

    @ObfuscatedSignature(descriptor="(Lmi;)V")
    Texture(Buffer buffer) {
        int n;
        int n2;
        int n3 = 0;
        this.isLoaded = false;
        this.averageRGB = buffer.method11637(466110349);
        boolean bl = buffer.method11650(-1301615126) == 1;
        this.field4671 = bl;
        int n4 = buffer.method11650(1533443906);
        if (n4 >= 1 && n4 <= 4) {
            this.fileIds = new int[n4];
        } else {
            throw new RuntimeException();
        }
        for (n2 = 0; n2 < n4; ++n2) {
            this.fileIds[n2] = buffer.method11637(16409253);
        }
        if (n4 > 1) {
            n = n4 - 1;
            this.field4667 = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                this.field4667[n2] = buffer.method11650(-1718797519);
            }
        }
        if (n4 > 1) {
            n = n4 - 1;
            this.field4662 = new int[n];
            for (n2 = 0; n2 < n; ++n2) {
                this.field4662[n2] = buffer.method11650(1463777149);
            }
        }
        this.field4663 = new int[n4];
        for (n2 = n3; n2 < n4; ++n2) {
            this.field4663[n2] = buffer.method11670(1604085085);
        }
        this.field4664 = buffer.method11650(-1231308041);
        this.field4670 = buffer.method11650(-1729927501);
        this.pixels = null;
    }

    @ObfuscatedName(value="ae")
    @Export(value="reset")
    void reset() {
        this.pixels = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ai")
    @Export(value="animate")
    void animate(int n) {
        int[] arrn;
        int n2;
        int n3;
        if (this.field4664 == 1 || this.field4664 == 3) {
            n2 = n3 = this.field4670 * n;
            if (this.field4664 == 1) {
                n2 = -n3;
            }
            this.field4669 = n2 + this.field4669 & 0x7F;
            if (this.isLoaded && this.pixels != null) {
                if (field4660 == null || field4660.length < this.pixels.length) {
                    field4660 = new int[this.pixels.length];
                }
                for (n3 = 0; n3 < 16384; ++n3) {
                    Texture.field4660[n3] = this.pixels[n2 * 128 + n3 & 0x3FFF];
                }
                arrn = this.pixels;
                this.pixels = field4660;
                field4660 = arrn;
                this.isLoaded = false;
            }
        }
        if (this.field4664 != 2 && this.field4664 != 4) return;
        n = n2 = this.field4670 * n;
        if (this.field4664 == 2) {
            n = -n2;
        }
        this.field4668 = this.field4668 + n & 0x7F;
        if (!this.isLoaded || this.pixels == null) return;
        if (field4660 == null || field4660.length < this.pixels.length) {
            field4660 = new int[this.pixels.length];
        }
        n2 = 0;
        while (true) {
            if (n2 < 16384) {
            } else {
                arrn = this.pixels;
                this.pixels = field4660;
                field4660 = arrn;
                this.isLoaded = false;
                return;
            }
            for (n3 = 0; n3 < 128; ++n3) {
                Texture.field4660[n2 + n3] = this.pixels[(n3 + n & 0x3FFF) + n2];
            }
            n2 += 128;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(DILkc;)Z")
    @Export(value="load")
    boolean load(double d, int n, AbstractArchive abstractArchive) {
        int n2;
        for (n2 = 0; n2 < this.fileIds.length; ++n2) {
            if (abstractArchive.getFileFlat(this.fileIds[n2]) != null) continue;
            return false;
        }
        int n3 = n * n;
        this.pixels = new int[n3];
        int n4 = 0;
        while (true) {
            block11: {
                int n5;
                int n6;
                int[] arrn;
                byte[] arrby;
                block15: {
                    block17: {
                        block13: {
                            block16: {
                                IndexedSprite indexedSprite;
                                block14: {
                                    block12: {
                                        if (n4 >= this.fileIds.length) {
                                            return true;
                                        }
                                        indexedSprite = class260.method7498(abstractArchive, this.fileIds[n4]);
                                        indexedSprite.normalize();
                                        arrby = indexedSprite.field7121;
                                        arrn = indexedSprite.palette;
                                        n6 = this.field4663[n4];
                                        if ((n6 & 0xFF000000) == 0x3000000) {
                                            for (n2 = 0; n2 < arrn.length; ++n2) {
                                                n5 = arrn[n2];
                                                if (n5 == 0 || (n5 >> 8 & 0xFFFF) != (n5 & 0xFFFF)) continue;
                                                arrn[n2] = (n5 &= 0xFF) * (n6 >> 8 & 0xFF) & 0xFF00 | ((n6 & 0xFF00FF) * n5 >> 8 & 0xFF00FF | 0xFF000000);
                                            }
                                        }
                                        for (n2 = 0; n2 < arrn.length; ++n2) {
                                            arrn[n2] = class363.Rasterizer3D_brighten(arrn[n2], d);
                                        }
                                        n2 = n4 == 0 ? 0 : this.field4667[n4 - 1];
                                        if (n2 != 0) break block11;
                                        if (n != indexedSprite.field7119) break block12;
                                        break block13;
                                    }
                                    if (indexedSprite.field7119 != 64 || n != 128) break block14;
                                    n2 = 0;
                                    break block15;
                                }
                                if (indexedSprite.field7119 != 128 || n != 64) break block16;
                                n2 = 0;
                                break block17;
                            }
                            throw new RuntimeException();
                        }
                        for (n2 = 0; n2 < n3; ++n2) {
                            this.pixels[n2] = arrn[arrby[n2] & 0xFF];
                        }
                        break block11;
                    }
                    for (n6 = 0; n6 < n; ++n6) {
                        for (n5 = 0; n5 < n; ++n5, ++n2) {
                            this.pixels[n2] = arrn[arrby[(n5 << 1) + (n6 << 1 << 7)] & 0xFF];
                        }
                    }
                    break block11;
                }
                for (n6 = 0; n6 < n; ++n6) {
                    for (n5 = 0; n5 < n; ++n5, ++n2) {
                        this.pixels[n2] = arrn[arrby[(n6 >> 1 << 6) + (n5 >> 1)] & 0xFF];
                    }
                }
            }
            ++n4;
        }
    }
}

