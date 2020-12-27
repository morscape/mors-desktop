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

@ObfuscatedName(value="mk")
public final class class189 {
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="NetCache_reference")
    static Buffer NetCache_reference;
    @ObfuscatedName(value="aa")
    int field3857;
    @ObfuscatedName(value="ah")
    int[] field3858;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-234187901)
    int field3859;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-184309641)
    int field3860;
    @ObfuscatedName(value="as")
    int[] field3861;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1478463225)
    int field3862;

    @ObfuscatedName(value="ai")
    final void method6641(byte by) {
        int n;
        by = (byte)this.field3860;
        this.field3857 = n = this.field3857 - 1089175463;
        this.field3860 = n * -1729968151 + by;
        by = 0;
        while (true) {
            int n2;
            block4: {
                block3: {
                    block2: {
                        if (by >= 256) {
                            return;
                        }
                        n = this.field3861[by];
                        if ((by & 2) != 0) break block2;
                        if ((by & 1) == 0) break block3;
                        this.field3859 ^= this.field3859 >>> 6;
                        break block4;
                    }
                    this.field3859 = (by & 1) != 0 ? (this.field3859 ^= this.field3859 >>> 16) : (this.field3859 ^= this.field3859 << 2);
                    break block4;
                }
                this.field3859 ^= this.field3859 << 13;
            }
            this.field3859 = this.field3861[by + 128 & 0xFF] + this.field3859;
            int[] arrn = this.field3861;
            arrn[by] = n2 = this.field3861[(n & 0x3FC) >> 2] + this.field3860 + this.field3859;
            arrn = this.field3858;
            n = (this.field3861[(n2 >> 8 & 0x3FC) >> 2] + n) * -1576095417;
            this.field3860 = n * -184309641;
            arrn[by] = n * -184309641;
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ak")
    public final int method6643(byte by) {
        if (this.field3862 * -1 == 0) {
            this.method6641((byte)-25);
            this.field3862 = -256;
        }
        int[] arrn = this.field3858;
        by = (byte)(this.field3862 * 1833839799 + 1833839799);
        this.field3862 = by * -1478463225;
        by = (byte)arrn[by * 1478463225];
        return by;
    }
}

