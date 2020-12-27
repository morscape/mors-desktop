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

@ObfuscatedName(value="hb")
@Implements(value="RawSound")
public class RawSound
extends AbstractSound {
    @ObfuscatedName(value="ae")
    @Export(value="sampleRate")
    public int sampleRate;
    @ObfuscatedName(value="ah")
    @Export(value="end")
    int end;
    @ObfuscatedName(value="as")
    public boolean field7198;
    @ObfuscatedName(value="ai")
    @Export(value="samples")
    public byte[] samples;
    @ObfuscatedName(value="ax")
    @Export(value="start")
    public int start;

    RawSound(int n, byte[] arrby, int n2, int n3) {
        this.sampleRate = n;
        this.samples = arrby;
        this.start = n2;
        this.end = n3;
    }

    RawSound(int n, byte[] arrby, int n2, int n3, boolean bl) {
        this.sampleRate = n;
        this.samples = arrby;
        this.start = n2;
        this.end = n3;
        this.field7198 = bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lhp;)Lhb;")
    @Export(value="resample")
    public RawSound resample(class111 class1112) {
        this.samples = class1112.method5137(this.samples, (short)16256);
        this.sampleRate = class1112.method5133(this.sampleRate, 2026339885);
        if (this.start == this.end) {
            int n;
            this.end = n = class1112.method5135(this.start, (byte)-60);
            this.start = n;
            return this;
        }
        this.start = class1112.method5135(this.start, (byte)-108);
        this.end = class1112.method5135(this.end, (byte)-59);
        if (this.start == this.end) {
            --this.start;
        }
        return this;
    }
}

