/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hy")
@Implements(value="Instrument")
public class Instrument {
    @ObfuscatedName(value="ac")
    @Export(value="Instrument_pitchSteps")
    static int[] Instrument_pitchSteps;
    @ObfuscatedName(value="ag")
    @Export(value="Instrument_volumeSteps")
    static int[] Instrument_volumeSteps;
    @ObfuscatedName(value="ao")
    @Export(value="Instrument_noise")
    static int[] Instrument_noise;
    @ObfuscatedName(value="ap")
    @Export(value="Instrument_samples")
    static int[] Instrument_samples;
    @ObfuscatedName(value="au")
    @Export(value="Instrument_pitchBaseSteps")
    static int[] Instrument_pitchBaseSteps;
    @ObfuscatedName(value="az")
    @Export(value="Instrument_sine")
    static int[] Instrument_sine;
    @ObfuscatedName(value="ad")
    @Export(value="Instrument_delays")
    static int[] Instrument_delays;
    @ObfuscatedName(value="av")
    @Export(value="Instrument_phases")
    static int[] Instrument_phases;
    @ObfuscatedName(value="aa")
    @Export(value="oscillatorVolume")
    int[] oscillatorVolume = new int[]{0, 0, 0, 0, 0};
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lhi;")
    @Export(value="volume")
    SoundEnvelope volume;
    @ObfuscatedName(value="af")
    @Export(value="oscillatorDelays")
    int[] oscillatorDelays;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3335;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3337;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3339;
    @ObfuscatedName(value="am")
    int field3340 = 100;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lho;")
    AudioFilter field3341;
    @ObfuscatedName(value="aq")
    int field3342 = 0;
    @ObfuscatedName(value="ar")
    int field3343 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3344;
    @ObfuscatedName(value="aw")
    @Export(value="duration")
    int duration = 500;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3347;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3336;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lhi;")
    @Export(value="pitch")
    SoundEnvelope pitch;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lhi;")
    SoundEnvelope field3346;
    @ObfuscatedName(value="ab")
    @Export(value="oscillatorPitch")
    int[] oscillatorPitch = new int[]{0, 0, 0, 0, 0};

    static {
        int n;
        Instrument_noise = new int[32768];
        Random random = new Random(0L);
        int n2 = 0;
        for (n = 0; n < 32768; ++n) {
            Instrument.Instrument_noise[n] = (random.nextInt() & 2) - 1;
        }
        Instrument_sine = new int[32768];
        for (n = n2; n < 32768; ++n) {
            Instrument.Instrument_sine[n] = (int)(Math.sin((double)n / 5215.1903) * 16384.0);
        }
        Instrument_samples = new int[220500];
        Instrument_phases = new int[5];
        Instrument_delays = new int[5];
        Instrument_volumeSteps = new int[5];
        Instrument_pitchSteps = new int[5];
        Instrument_pitchBaseSteps = new int[5];
    }

    Instrument() {
        this.oscillatorDelays = new int[]{0, 0, 0, 0, 0};
    }

    @ObfuscatedName(value="ae")
    @Export(value="evaluateWave")
    final int evaluateWave(int n, int n2, int n3) {
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        if (n3 == 2) {
            return Instrument_sine[n & 0x7FFF] * n2 >> 14;
        }
        if (n3 == 3) {
            return (n2 * (n & 0x7FFF) >> 14) - n2;
        }
        if (n3 == 4) {
            return n2 * Instrument_noise[n / 2607 & 0x7FFF];
        }
        return 0;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;)V")
    @Export(value="decode")
    final void decode(Buffer buffer) {
        int n;
        this.pitch = new SoundEnvelope();
        this.pitch.decode(buffer);
        this.volume = new SoundEnvelope();
        this.volume.decode(buffer);
        if (buffer.method11650(-2004302527) != 0) {
            --buffer.offset;
            this.field3336 = new SoundEnvelope();
            this.field3336.decode(buffer);
            this.field3346 = new SoundEnvelope();
            this.field3346.decode(buffer);
        }
        if (buffer.method11650(-1607712510) != 0) {
            --buffer.offset;
            this.field3335 = new SoundEnvelope();
            this.field3335.decode(buffer);
            this.field3344 = new SoundEnvelope();
            this.field3344.decode(buffer);
        }
        if (buffer.method11650(-219687471) != 0) {
            --buffer.offset;
            this.field3337 = new SoundEnvelope();
            this.field3337.decode(buffer);
            this.field3339 = new SoundEnvelope();
            this.field3339.decode(buffer);
        }
        for (int i = 0; i < 10 && (n = buffer.method11665(2053723363)) != 0; ++i) {
            this.oscillatorVolume[i] = n;
            this.oscillatorPitch[i] = buffer.method11672(1290114973);
            this.oscillatorDelays[i] = buffer.method11665(177445199);
        }
        this.field3342 = buffer.method11665(1096099205);
        this.field3340 = buffer.method11665(1268091486);
        this.duration = buffer.method11637(532098435);
        this.field3343 = buffer.method11637(742295251);
        this.field3341 = new AudioFilter();
        this.field3347 = new SoundEnvelope();
        this.field3341.method5113(buffer, this.field3347);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ak")
    @Export(value="synthesize")
    final int[] synthesize(int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        class192.clearIntArray(Instrument_samples, 0, n);
        if (n2 < 10) {
            return Instrument_samples;
        }
        double d = (double)n / ((double)n2 + 0.0);
        this.pitch.reset();
        this.volume.reset();
        Object object = this.field3336;
        double d2 = 32.768;
        if (object != null) {
            this.field3336.reset();
            this.field3346.reset();
            n2 = (int)((double)(this.field3336.field3234 - this.field3336.field3240) * 32.768 / d);
            n7 = (int)((double)this.field3336.field3240 * 32.768 / d);
        } else {
            n2 = 0;
            n7 = 0;
        }
        if (this.field3335 != null) {
            this.field3335.reset();
            this.field3344.reset();
            n6 = (int)((double)(this.field3335.field3234 - this.field3335.field3240) * 32.768 / d);
            n5 = (int)((double)this.field3335.field3240 * 32.768 / d);
        } else {
            n6 = 0;
            n5 = 0;
        }
        for (n4 = 0; n4 < 5; ++n4) {
            if (this.oscillatorVolume[n4] == 0) continue;
            Instrument.Instrument_phases[n4] = 0;
            Instrument.Instrument_delays[n4] = (int)((double)this.oscillatorDelays[n4] * d);
            Instrument.Instrument_volumeSteps[n4] = (this.oscillatorVolume[n4] << 14) / 100;
            object = Instrument_pitchSteps;
            double d3 = this.pitch.field3234 - this.pitch.field3240;
            n3 = this.oscillatorPitch[n4];
            double d4 = d;
            object[n4] = (int)(d3 * d2 * Math.pow(1.0057929410678534, n3) / d4);
            object = Instrument_pitchBaseSteps;
            d3 = this.pitch.field3240;
            d2 = 32.768;
            object[n4] = (int)(d3 * 32.768 / d4);
        }
        n4 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = n2;
        while (true) {
            int n11;
            int n12;
            block41: {
                block39: {
                    block40: {
                        block38: {
                            block37: {
                                if (n4 >= n) break block37;
                                n12 = this.pitch.doStep(n);
                                n11 = this.volume.doStep(n);
                                n2 = n8;
                                n3 = n12;
                                if (this.field3336 != null) {
                                    n2 = this.field3336.doStep(n);
                                    n3 = n12 + (this.evaluateWave(n8, this.field3346.doStep(n), this.field3336.field3239) >> 1);
                                    n2 = n8 + n7 + (n10 * n2 >> 16);
                                }
                                break block38;
                            }
                            if (this.field3337 == null) break block39;
                            this.field3337.reset();
                            this.field3339.reset();
                            n7 = 1;
                            n2 = 0;
                            break block40;
                        }
                        n12 = n9;
                        n8 = n11;
                        if (this.field3335 != null) {
                            n12 = this.field3335.doStep(n);
                            n8 = n11 * ((this.evaluateWave(n9, this.field3344.doStep(n), this.field3335.field3239) >> 1) + 32768) >> 15;
                            n12 = n9 + n5 + (n12 * n6 >> 16);
                        }
                        break block41;
                    }
                    for (n6 = 0; n6 < n; ++n6) {
                        n4 = this.field3337.doStep(n);
                        n5 = this.field3339.doStep(n);
                        if (n7 != 0) {
                            n5 = (n4 * (this.field3337.field3234 - this.field3337.field3240) >> 8) + this.field3337.field3240;
                        } else {
                            n4 = this.field3337.field3240;
                            n5 = (n5 * (this.field3337.field3234 - this.field3337.field3240) >> 8) + n4;
                        }
                        n3 = n2 + 256;
                        n4 = n7;
                        n2 = n3;
                        if (n3 >= n5) {
                            n7 = n7 == 0 ? 1 : 0;
                            n2 = 0;
                            n4 = n7;
                        }
                        if (n4 != 0) {
                            Instrument.Instrument_samples[n6] = 0;
                        }
                        n7 = n4;
                    }
                }
                if (this.field3342 > 0 && this.field3340 > 0) {
                    for (n2 = n7 = (int)((double)this.field3342 * d); n2 < n; ++n2) {
                        object = Instrument_samples;
                        object[n2] = Instrument_samples[n2 - n7] * this.field3340 / 100 + object[n2];
                    }
                }
                if (this.field3341.pairs[0] > 0 || this.field3341.pairs[1] > 0) {
                    this.field3347.reset();
                    object = this.field3347;
                    n8 = n + 1;
                    n7 = ((SoundEnvelope)object).doStep(n8);
                    object = this.field3341;
                    float f = (float)n7 / 65536.0f;
                    n10 = ((AudioFilter)object).compute(0, f);
                    n4 = this.field3341.compute(1, f);
                    if (n >= n10 + n4) {
                        n6 = n - n10;
                        if (n4 <= n6) {
                            n6 = n4;
                        }
                        n2 = 0;
                        while (true) {
                            if (n2 >= n6) break;
                            object = Instrument_samples;
                            n3 = n10 + n2;
                            n7 = (int)((long)object[n3] * (long)AudioFilter.forwardMultiplier >> 16);
                            for (n5 = 0; n5 < n10; n7 += (int)((long)Instrument_samples[n3 - 1 - n5] * (long)AudioFilter.field3269[0][n5] >> 16), ++n5) {
                            }
                            n3 = 0;
                            n5 = n7;
                            for (n7 = n3; n7 < n2; n5 -= (int)((long)Instrument_samples[n2 - 1 - n7] * (long)AudioFilter.field3269[1][n7] >> 16), ++n7) {
                            }
                            Instrument.Instrument_samples[n2] = n5;
                            n7 = this.field3347.doStep(n8);
                            ++n2;
                        }
                        n6 = 128;
                        n3 = n7;
                        n5 = n10;
                        n10 = n2;
                        block7: while (true) {
                            n12 = n - n5;
                            n7 = n10;
                            n2 = n6;
                            n9 = n3;
                            if (n6 > n12) {
                                n2 = n12;
                                n9 = n3;
                                n7 = n10;
                            }
                            while (true) {
                                if (n7 < n2) {
                                    object = Instrument_samples;
                                    n10 = n7 + n5;
                                    n6 = (int)((long)object[n10] * (long)AudioFilter.forwardMultiplier >> 16);
                                } else {
                                    if (n7 >= n12) break block7;
                                    object = this.field3341;
                                    f = (float)n9 / 65536.0f;
                                    n5 = ((AudioFilter)object).compute(0, f);
                                    n4 = this.field3341.compute(1, f);
                                    n6 = n2 + 128;
                                    n10 = n7;
                                    n3 = n9;
                                    continue block7;
                                }
                                for (n3 = 0; n3 < n5; n6 += (int)((long)Instrument_samples[n10 - 1 - n3] * (long)AudioFilter.field3269[0][n3] >> 16), ++n3) {
                                }
                                n10 = 0;
                                n3 = n6;
                                for (n6 = n10; n6 < n4; n3 -= (int)((long)Instrument_samples[n7 - 1 - n6] * (long)AudioFilter.field3269[1][n6] >> 16), ++n6) {
                                }
                                Instrument.Instrument_samples[n7] = n3;
                                n9 = this.field3347.doStep(n8);
                                ++n7;
                            }
                            break;
                        }
                        while (n7 < n) {
                            n3 = n7 + n5;
                            n2 = 0;
                            for (n6 = n3 - n; n6 < n5; n2 += (int)((long)Instrument_samples[n3 - 1 - n6] * (long)AudioFilter.field3269[0][n6] >> 16), ++n6) {
                            }
                            n3 = 0;
                            n6 = n2;
                            for (n2 = n3; n2 < n4; n6 -= (int)((long)Instrument_samples[n7 - 1 - n2] * (long)AudioFilter.field3269[1][n2] >> 16), ++n2) {
                            }
                            Instrument.Instrument_samples[n7] = n6;
                            this.field3347.doStep(n8);
                            ++n7;
                        }
                    }
                }
                n2 = 0;
                while (true) {
                    if (n2 >= n) {
                        return Instrument_samples;
                    }
                    if (Instrument_samples[n2] < -32768) {
                        Instrument.Instrument_samples[n2] = -32768;
                    }
                    if (Instrument_samples[n2] > 32767) {
                        Instrument.Instrument_samples[n2] = 32767;
                    }
                    ++n2;
                }
            }
            for (n9 = 0; n9 < 5; ++n9) {
                if (this.oscillatorVolume[n9] == 0 || (n11 = Instrument_delays[n9] + n4) >= n) continue;
                object = Instrument_samples;
                object[n11] = object[n11] + this.evaluateWave(Instrument_phases[n9], Instrument_volumeSteps[n9] * n8 >> 15, this.pitch.field3239);
                object = Instrument_phases;
                object[n9] = Instrument_pitchBaseSteps[n9] + (Instrument_pitchSteps[n9] * n3 >> 16) + object[n9];
            }
            ++n4;
            n8 = n2;
            n9 = n12;
        }
    }
}

