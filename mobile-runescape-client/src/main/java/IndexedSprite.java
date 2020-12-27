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

@ObfuscatedName(value="ei")
@Implements(value="IndexedSprite")
public final class IndexedSprite
extends DualNode {
    @ObfuscatedName(value="ae")
    @Export(value="palette")
    public int[] palette;
    @ObfuscatedName(value="ah")
    public int field7118;
    @ObfuscatedName(value="aj")
    public int field7120;
    @ObfuscatedName(value="al")
    public int field7122;
    @ObfuscatedName(value="as")
    public int field7123;
    @ObfuscatedName(value="ai")
    public int field7119;
    @ObfuscatedName(value="ak")
    public byte[] field7121;
    @ObfuscatedName(value="ax")
    public int field7124;

    IndexedSprite() {
    }

    @ObfuscatedName(value="ae")
    public void method13281(int n, int n2, int n3) {
        for (int i = 0; i < this.palette.length; ++i) {
            int n4 = this.palette[i];
            int n5 = 255;
            int n6 = (n4 >> 16 & 0xFF) + n;
            if (n6 < 0) {
                n4 = 0;
            } else {
                n4 = n6;
                if (n6 > 255) {
                    n4 = 255;
                }
            }
            int n7 = n2 + (this.palette[i] >> 8 & 0xFF);
            if (n7 < 0) {
                n6 = 0;
            } else {
                n6 = n7;
                if (n7 > 255) {
                    n6 = 255;
                }
            }
            n7 = n3 + (this.palette[i] & 0xFF);
            if (n7 < 0) {
                n5 = 0;
            } else if (n7 <= 255) {
                n5 = n7;
            }
            this.palette[i] = n5 + (n6 << 8) + (n4 << 16);
        }
    }

    @ObfuscatedName(value="ak")
    @Export(value="normalize")
    public void normalize() {
        if (this.field7119 == this.field7120 && this.field7124 == this.field7122) {
            return;
        }
        byte[] arrby = new byte[this.field7120 * this.field7122];
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n < this.field7124) {
                n3 = 0;
            } else {
                this.field7121 = arrby;
                this.field7119 = this.field7120;
                this.field7124 = this.field7122;
                this.field7118 = 0;
                this.field7123 = 0;
                return;
            }
            while (n3 < this.field7119) {
                arrby[(n + this.field7123) * this.field7120 + n3 + this.field7118] = this.field7121[n2];
                ++n3;
                ++n2;
            }
            ++n;
        }
    }
}

