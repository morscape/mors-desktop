/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="gj")
@Implements(value="VorbisCodebook")
public class VorbisCodebook {
    @ObfuscatedName(value="ae")
    @Export(value="entries")
    int entries;
    @ObfuscatedName(value="ah")
    float[][] field2716;
    @ObfuscatedName(value="as")
    @Export(value="keys")
    int[] keys;
    @ObfuscatedName(value="ai")
    @Export(value="lengthMap")
    int[] lengthMap;
    @ObfuscatedName(value="ak")
    @Export(value="dimensions")
    int dimensions;
    @ObfuscatedName(value="ax")
    int[] field2720;

    /*
     * Enabled aggressive block sorting
     */
    VorbisCodebook() {
        int n;
        int n2;
        int n3;
        VorbisSample.readBits(24);
        this.dimensions = VorbisSample.readBits(16);
        this.entries = VorbisSample.readBits(24);
        this.lengthMap = new int[this.entries];
        int n4 = VorbisSample.readBit() != 0 ? 1 : 0;
        if (n4 == 0) {
            n4 = VorbisSample.readBit() != 0 ? 1 : 0;
            for (n3 = 0; n3 < this.entries; ++n3) {
                this.lengthMap[n3] = n4 != 0 && VorbisSample.readBit() == 0 ? 0 : VorbisSample.readBits(5) + 1;
            }
        } else {
            n3 = VorbisSample.readBits(5) + 1;
            n4 = 0;
            while (n4 < this.entries) {
                n2 = VorbisSample.readBits(class376.method13146(this.entries - n4, 65280));
                for (n = 0; n < n2; ++n, ++n4) {
                    this.lengthMap[n4] = n3;
                }
                ++n3;
            }
        }
        this.method4836();
        n2 = VorbisSample.readBits(4);
        if (n2 <= 0) return;
        float f = VorbisSample.float32Unpack(VorbisSample.readBits(32));
        float f2 = VorbisSample.float32Unpack(VorbisSample.readBits(32));
        int n5 = VorbisSample.readBits(4);
        n4 = VorbisSample.readBit() != 0 ? 1 : 0;
        n3 = n2 == 1 ? VorbisCodebook.mapType1QuantValues(this.entries, this.dimensions) : this.entries * this.dimensions;
        this.field2720 = new int[n3];
        for (n = 0; n < n3; ++n) {
            this.field2720[n] = VorbisSample.readBits(n5 + 1);
        }
        this.field2716 = (float[][])Array.newInstance(Float.TYPE, this.entries, this.dimensions);
        if (n2 != 1) {
            block4: for (n3 = 0; n3 < this.entries; ++n3) {
                n2 = n3 * this.dimensions;
                n = 0;
                float f3 = 0.0f;
                while (true) {
                    float f4;
                    if (n >= this.dimensions) continue block4;
                    this.field2716[n3][n] = f4 = (float)this.field2720[n2] * f2 + f + f3;
                    if (n4 != 0) {
                        f3 = f4;
                    }
                    ++n2;
                    ++n;
                }
            }
            return;
        }
        block6: for (n = 0; n < this.entries; ++n) {
            n2 = 0;
            n5 = 1;
            float f5 = 0.0f;
            while (true) {
                float f6;
                if (n2 >= this.dimensions) continue block6;
                int n6 = n / n5;
                this.field2716[n][n2] = f6 = (float)this.field2720[n6 % n3] * f2 + f + f5;
                if (n4 != 0) {
                    f5 = f6;
                }
                n5 *= n3;
                ++n2;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ae")
    void method4836() {
        var8_1 = new int[this.entries];
        var9_2 = new int[33];
        var1_3 = 0;
        while (true) {
            if (var1_3 >= this.entries) break;
            var4_6 = this.lengthMap[var1_3];
            if (var4_6 != 0) {
                var2_4 = 1 << 32 - var4_6;
                var8_1[var1_3] = var6_8 = var9_2[var4_6];
                if ((var6_8 & var2_4) != 0) {
                    var2_4 = var9_2[var4_6 - 1];
                } else {
                    var5_7 = var2_4 | var6_8;
                    var3_5 = var4_6 - 1;
                    while (true) {
                        var2_4 = var5_7;
                        if (var3_5 < 1) break;
                        var7_9 = var9_2[var3_5];
                        var2_4 = var5_7;
                        if (var7_9 != var6_8) break;
                        var2_4 = 1 << 32 - var3_5;
                        if ((var7_9 & var2_4) != 0) {
                            var9_2[var3_5] = var9_2[var3_5 - 1];
                            var2_4 = var5_7;
                            break;
                        }
                        var9_2[var3_5] = var7_9 | var2_4;
                        --var3_5;
                    }
                }
                var9_2[var4_6] = var2_4;
                var3_5 = var4_6;
                while ((var4_6 = var3_5 + 1) <= 32) {
                    var3_5 = var4_6;
                    if (var6_8 != var9_2[var4_6]) continue;
                    var9_2[var4_6] = var2_4;
                    var3_5 = var4_6;
                }
            }
            ++var1_3;
        }
        this.keys = new int[8];
        var2_4 = 0;
        var3_5 = 0;
        block3: while (true) {
            block13: {
                if (var2_4 >= this.entries) return;
                var6_8 = this.lengthMap[var2_4];
                if (var6_8 != 0) break block13;
                var4_6 = var3_5;
                ** GOTO lbl66
            }
            var7_9 = var8_1[var2_4];
            var4_6 = 0;
            var1_3 = 0;
            while (true) {
                block17: {
                    block16: {
                        block14: {
                            block15: {
                                if (var4_6 >= var6_8) break block14;
                                if ((-2147483648 >>> var4_6 & var7_9) == 0) break block15;
                                if (this.keys[var1_3] == 0) {
                                    this.keys[var1_3] = var3_5;
                                }
                                break block16;
                            }
                            ++var1_3;
                            break block17;
                        }
                        this.keys[var1_3] = var2_4;
                        var4_6 = var3_5;
                        if (var1_3 >= var3_5) {
                            var4_6 = var1_3 + 1;
                        }
lbl66:
                        // 4 sources

                        ++var2_4;
                        var3_5 = var4_6;
                        continue block3;
                    }
                    var1_3 = this.keys[var1_3];
                }
                if (var1_3 >= this.keys.length) {
                    var9_2 = new int[this.keys.length * 2];
                    for (var5_7 = 0; var5_7 < this.keys.length; ++var5_7) {
                        var9_2[var5_7] = this.keys[var5_7];
                    }
                    this.keys = var9_2;
                }
                ++var4_6;
            }
            break;
        }
    }

    @ObfuscatedName(value="ai")
    int method4838() {
        int n = 0;
        while (this.keys[n] >= 0) {
            if (VorbisSample.readBit() != 0) {
                n = this.keys[n];
                continue;
            }
            ++n;
        }
        return this.keys[n];
    }

    @ObfuscatedName(value="ax")
    float[] method4843() {
        return this.field2716[this.method4838()];
    }

    @ObfuscatedName(value="ak")
    @Export(value="mapType1QuantValues")
    static int mapType1QuantValues(int n, int n2) {
        int n3 = (int)Math.pow(n, 1.0 / (double)n2) + 1;
        while (class88.hslToRgb(n3, n2, -413668202) > n) {
            --n3;
        }
        return n3;
    }
}

