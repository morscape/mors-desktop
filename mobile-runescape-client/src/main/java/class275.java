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

@ObfuscatedName(value="cn")
public class class275
implements WorldMapSection {
    @ObfuscatedName(value="dt")
    @ObfuscatedSignature(descriptor="Lph;")
    static class244 field5005;
    @ObfuscatedName(value="ky")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field5008;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field5004;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-620568053)
    int field5009;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1977650265)
    int field5010;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-146223909)
    int field5013;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1932999929)
    int field5011;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=379056637)
    int field5012;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-2115459421)
    int field5014;

    class275() {
    }

    @Override
    @ObfuscatedName(value="ae")
    public boolean vmethod10367(int n, int n2, int n3, byte by) {
        by = (byte)(this.field5012 * -1866960043);
        boolean bl = false;
        if (n < by * 379056637) {
            return false;
        }
        if (n < this.field5009 + this.field5012) {
            boolean bl2 = bl;
            if (n2 >> 6 == this.field5011) {
                n = this.field5014 * -398181109;
                bl2 = bl;
                if (n3 >> 6 == n * -2115459421) {
                    bl2 = true;
                }
            }
            return bl2;
        }
        return false;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1541050145")
    void method8386() {
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;B)V", garbageValue="0")
    public void vmethod10380(Buffer buffer) {
        this.field5012 = buffer.method11650(1019024892);
        this.field5009 = buffer.method11650(956331756);
        this.field5011 = buffer.method11637(1977524515);
        this.field5014 = buffer.method11637(368358759);
        this.field5010 = buffer.method11637(1126340294);
        this.field5013 = buffer.method11637(1741361746);
        this.method8386();
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="-76")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.field2396 > this.field5010) {
            worldMapArea.field2396 = this.field5010;
        }
        if (worldMapArea.field2397 < this.field5010) {
            worldMapArea.field2397 = this.field5010;
        }
        if (worldMapArea.field2403 > this.field5013) {
            worldMapArea.field2403 = this.field5013;
        }
        if (worldMapArea.field2401 < this.field5013) {
            worldMapArea.field2401 = this.field5013;
        }
    }

    @Override
    @ObfuscatedName(value="ax")
    public int[] vmethod10384(int n, int n2, int n3, byte by) {
        if (this.vmethod10367(n, n2, n3, (byte)-60)) {
            n = this.field5010 * -1083046889;
            by = (byte)(this.field5011 * 922010953);
            int n4 = this.field5013 * 350900051;
            int n5 = this.field5014 * -398181109;
            return new int[]{n * -2015565376 - by * -842056128 + n2, n3 + (n4 * -768395584 - n5 * 2049550528)};
        }
        return null;
    }

    @ObfuscatedName(value="as")
    public static int method8377(CharSequence charSequence, int n, int n2, byte[] arrby, int n3, byte by) {
        by = (byte)(n2 - n);
        n2 = 0;
        while (n2 < by) {
            char c = charSequence.charAt(n2 + n);
            arrby[n2 + n3] = !(c > '\u0000' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') ? (c == '\u20ac' ? -128 : (c == '\u201a' ? -126 : (c == '\u0192' ? -125 : (c == '\u201e' ? -124 : (c == '\u2026' ? -123 : (c == '\u2020' ? -122 : (c == '\u2021' ? -121 : (c == '\u02c6' ? -120 : (c == '\u2030' ? -119 : (c == '\u0160' ? -118 : (c == '\u2039' ? -117 : (c == '\u0152' ? -116 : (c == '\u017d' ? -114 : (c == '\u2018' ? -111 : (c == '\u2019' ? -110 : (c == '\u201c' ? -109 : (c == '\u201d' ? -108 : (c == '\u2022' ? -107 : (c == '\u2013' ? -106 : (c == '\u2014' ? -105 : (c == '\u02dc' ? -104 : (c == '\u2122' ? -103 : (c == '\u0161' ? -102 : (c == '\u203a' ? -101 : (c == '\u0153' ? -100 : (c == '\u017e' ? -98 : (c == '\u0178' ? -97 : 63))))))))))))))))))))))))))) : (byte)c;
            ++n2;
        }
        return by;
    }

    @ObfuscatedName(value="bf")
    @Export(value="Sprite_drawTransOverlay")
    static void Sprite_drawTransOverlay(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 256 - n8;
        n5 = -n5;
        while (true) {
            if (n5 < 0) {
                n9 = -n4;
                n = n3;
            } else {
                return;
            }
            while (n9 < 0) {
                int n11 = arrn2[n2];
                if (n11 != 0) {
                    n3 = arrn[n];
                    if (n3 == 0) {
                        n3 = n + 1;
                        arrn[n] = n11 | n10 - 48 << 24;
                        n = n3;
                    } else {
                        arrn[n] = (0xFF00FF00 & (0xFF00FF & n3) * n10 + (n11 & 0xFF00FF) * n8) + (n10 * (n3 & 0xFF00) + (n11 & 0xFF00) * n8 & 0xFF0000) >> 8;
                        ++n;
                    }
                } else {
                    ++n;
                }
                ++n9;
                ++n2;
            }
            n3 = n + n6;
            n2 += n7;
            ++n5;
        }
    }
}

