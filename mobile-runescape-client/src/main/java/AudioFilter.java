/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ho")
@Implements(value="AudioFilter")
public class AudioFilter {
    @ObfuscatedName(value="aa")
    @Export(value="forwardMultiplier")
    static int forwardMultiplier = 0;
    @ObfuscatedName(value="aj")
    static int[][] field3269;
    @ObfuscatedName(value="al")
    static float field3270 = 0.0f;
    @ObfuscatedName(value="as")
    static float[][] field3272;
    @ObfuscatedName(value="ah")
    int[] field3273;
    @ObfuscatedName(value="ai")
    int[][][] field3274;
    @ObfuscatedName(value="ak")
    @Export(value="pairs")
    int[] pairs = new int[2];
    @ObfuscatedName(value="ax")
    int[][][] field3276;

    static {
        field3272 = (float[][])Array.newInstance(Float.TYPE, 2, 8);
        field3269 = (int[][])Array.newInstance(Integer.TYPE, 2, 8);
    }

    AudioFilter() {
        this.field3274 = (int[][][])Array.newInstance(Integer.TYPE, 2, 2, 4);
        this.field3276 = (int[][][])Array.newInstance(Integer.TYPE, 2, 2, 4);
        this.field3273 = new int[2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;Lhi;)V")
    final void method5113(Buffer object, SoundEnvelope soundEnvelope) {
        int n = ((Buffer)object).method11650(1047042252);
        this.pairs[0] = n >> 4;
        this.pairs[1] = n & 0xF;
        if (n == 0) {
            object = this.field3273;
            this.field3273[1] = 0;
            object[0] = false;
            return;
        }
        this.field3273[0] = ((Buffer)object).method11637(-1436981899);
        this.field3273[1] = ((Buffer)object).method11637(1988624255);
        int n2 = ((Buffer)object).method11650(2106647569);
        n = 0;
        while (true) {
            int n3;
            if (n < 2) {
            } else {
                n = 0;
                while (true) {
                    if (n < 2) {
                    } else {
                        if (n2 == 0 && this.field3273[1] == this.field3273[0]) {
                            return;
                        }
                        soundEnvelope.method5046((Buffer)object);
                        return;
                    }
                    for (n3 = 0; n3 < this.pairs[n]; ++n3) {
                        if ((1 << n * 4 << n3 & n2) != 0) {
                            this.field3274[n][1][n3] = ((Buffer)object).method11637(596253240);
                            this.field3276[n][1][n3] = ((Buffer)object).method11637(-1045338428);
                            continue;
                        }
                        this.field3274[n][1][n3] = this.field3274[n][0][n3];
                        this.field3276[n][1][n3] = this.field3276[n][0][n3];
                    }
                    ++n;
                }
            }
            for (n3 = 0; n3 < this.pairs[n]; ++n3) {
                this.field3274[n][0][n3] = ((Buffer)object).method11637(997006756);
                this.field3276[n][0][n3] = ((Buffer)object).method11637(-174657058);
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ai")
    float method5114(int n, int n2, float f) {
        return AudioFilter.normalize(((float)this.field3274[n][0][n2] + f * (float)(this.field3274[n][1][n2] - this.field3274[n][0][n2])) * 1.2207031E-4f);
    }

    @ObfuscatedName(value="ak")
    float method5116(int n, int n2, float f) {
        return 1.0f - (float)Math.pow(10.0, -(((float)this.field3276[n][0][n2] + f * (float)(this.field3276[n][1][n2] - this.field3276[n][0][n2])) * 0.0015258789f) / 20.0f);
    }

    @ObfuscatedName(value="ax")
    @Export(value="compute")
    int compute(int n, float f) {
        int n2 = 0;
        if (n == 0) {
            field3270 = (float)Math.pow(0.1, ((float)this.field3273[0] + (float)(this.field3273[1] - this.field3273[0]) * f) * 0.0030517578f / 20.0f);
            forwardMultiplier = (int)(field3270 * 65536.0f);
        }
        if (this.pairs[n] == 0) {
            return 0;
        }
        float f2 = this.method5116(n, 0, f);
        AudioFilter.field3272[n][0] = f2 * -2.0f * (float)Math.cos(this.method5114(n, 0, f));
        AudioFilter.field3272[n][1] = f2 * f2;
        int n3 = 1;
        while (true) {
            int n4;
            float[] arrf;
            float f3;
            if (n3 < this.pairs[n]) {
                f3 = this.method5116(n, n3, f);
                f2 = f3 * -2.0f * (float)Math.cos(this.method5114(n, n3, f));
                f3 *= f3;
                arrf = field3272[n];
                int n5 = n3 * 2;
                float[] arrf2 = field3272[n];
                arrf[n5 + 1] = arrf2[n4] * f3;
                AudioFilter.field3272[n][n5] = field3272[n][n4] * f2 + field3272[n][n5 - 2] * f3;
            } else {
                n4 = n2;
                if (n == 0) {
                    n3 = 0;
                    while (true) {
                        n4 = n2;
                        if (n3 >= this.pairs[0] * 2) break;
                        arrf = field3272[0];
                        arrf[n3] = arrf[n3] * field3270;
                        ++n3;
                    }
                }
                while (n4 < this.pairs[n] * 2) {
                    AudioFilter.field3269[n][n4] = (int)(field3272[n][n4] * 65536.0f);
                    ++n4;
                }
                return this.pairs[n] * 2;
            }
            for (n4 = n5 - 1; n4 >= 2; --n4) {
                arrf = field3272[n];
                arrf[n4] = arrf[n4] + (field3272[n][n4 - 1] * f2 + field3272[n][n4 - 2] * f3);
            }
            arrf = field3272[n];
            arrf[1] = arrf[1] + (field3272[n][0] * f2 + f3);
            arrf = field3272[n];
            arrf[0] = arrf[0] + f2;
            ++n3;
        }
    }

    @ObfuscatedName(value="ae")
    @Export(value="normalize")
    static float normalize(float f) {
        return (float)Math.pow(2.0, f) * 32.703197f * (float)Math.PI / 11025.0f;
    }
}

