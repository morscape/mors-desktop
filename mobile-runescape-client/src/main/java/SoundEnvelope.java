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

@ObfuscatedName(value="hi")
@Implements(value="SoundEnvelope")
public class SoundEnvelope {
    @ObfuscatedName(value="aa")
    @Export(value="step")
    int step;
    @ObfuscatedName(value="ae")
    @Export(value="durations")
    int[] durations = new int[2];
    @ObfuscatedName(value="af")
    @Export(value="max")
    int max;
    @ObfuscatedName(value="ah")
    int field3234;
    @ObfuscatedName(value="aj")
    @Export(value="ticks")
    int ticks;
    @ObfuscatedName(value="al")
    @Export(value="phaseIndex")
    int phaseIndex;
    @ObfuscatedName(value="as")
    int field3239;
    @ObfuscatedName(value="ai")
    @Export(value="phases")
    int[] phases = new int[2];
    @ObfuscatedName(value="ak")
    @Export(value="segments")
    int segments = 2;
    @ObfuscatedName(value="ax")
    int field3240;
    @ObfuscatedName(value="ab")
    @Export(value="amplitude")
    int amplitude;

    SoundEnvelope() {
        this.durations[0] = 0;
        this.durations[1] = 65535;
        this.phases[0] = 0;
        this.phases[1] = 65535;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;)V")
    final void method5046(Buffer buffer) {
        this.segments = buffer.method11650(-1861208708);
        this.durations = new int[this.segments];
        this.phases = new int[this.segments];
        for (int i = 0; i < this.segments; ++i) {
            this.durations[i] = buffer.method11637(-310505270);
            this.phases[i] = buffer.method11637(1121456827);
        }
    }

    @ObfuscatedName(value="ai")
    @Export(value="reset")
    final void reset() {
        this.ticks = 0;
        this.phaseIndex = 0;
        this.step = 0;
        this.amplitude = 0;
        this.max = 0;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;)V")
    @Export(value="decode")
    final void decode(Buffer buffer) {
        this.field3239 = buffer.method11650(-1554213231);
        this.field3240 = buffer.method11670(1604085085);
        this.field3234 = buffer.method11670(1604085085);
        this.method5046(buffer);
    }

    @ObfuscatedName(value="ax")
    @Export(value="doStep")
    final int doStep(int n) {
        if (this.max >= this.ticks) {
            int[] arrn = this.phases;
            int n2 = this.phaseIndex;
            this.phaseIndex = n2 + 1;
            this.amplitude = arrn[n2] << 15;
            if (this.phaseIndex >= this.segments) {
                this.phaseIndex = this.segments - 1;
            }
            this.ticks = (int)((double)this.durations[this.phaseIndex] / 65536.0 * (double)n);
            if (this.ticks > this.max) {
                this.step = ((this.phases[this.phaseIndex] << 15) - this.amplitude) / (this.ticks - this.max);
            }
        }
        this.amplitude += this.step;
        ++this.max;
        return this.amplitude - this.step >> 15;
    }
}

