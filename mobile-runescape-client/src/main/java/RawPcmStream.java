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

@ObfuscatedName(value="hm")
@Implements(value="RawPcmStream")
public class RawPcmStream
extends PcmStream {
    @ObfuscatedName(value="aa")
    @Export(value="start")
    int start;
    @ObfuscatedName(value="ae")
    int field7217;
    @ObfuscatedName(value="af")
    boolean field7218;
    @ObfuscatedName(value="ah")
    int field7219;
    @ObfuscatedName(value="aj")
    int field7221;
    @ObfuscatedName(value="al")
    @Export(value="numLoops")
    int numLoops;
    @ObfuscatedName(value="am")
    int field7224;
    @ObfuscatedName(value="an")
    int field7225;
    @ObfuscatedName(value="aq")
    int field7226;
    @ObfuscatedName(value="as")
    int field7227;
    @ObfuscatedName(value="ay")
    int field7229;
    @ObfuscatedName(value="ai")
    int field7220;
    @ObfuscatedName(value="ak")
    int field7222;
    @ObfuscatedName(value="ax")
    int field7228;
    @ObfuscatedName(value="ab")
    @Export(value="end")
    int end;

    @ObfuscatedSignature(descriptor="(Lhb;II)V")
    RawPcmStream(RawSound rawSound, int n, int n2) {
        this.sound = rawSound;
        this.start = rawSound.start;
        this.end = rawSound.end;
        this.field7218 = rawSound.field7198;
        this.field7217 = n;
        this.field7220 = n2;
        this.field7228 = 8192;
        this.field7222 = 0;
        this.method13521();
    }

    @ObfuscatedName(value="ah")
    void method13521() {
        this.field7219 = this.field7220;
        this.field7227 = RawPcmStream.method13455(this.field7220, this.field7228);
        this.field7221 = RawPcmStream.method13453(this.field7220, this.field7228);
    }

    @ObfuscatedName(value="am")
    void method13524(int n) {
        synchronized (this) {
            this.method13525(n, this.getObjectId());
            return;
        }
    }

    @ObfuscatedName(value="an")
    void method13525(int n, int n2) {
        synchronized (this) {
            this.field7220 = n;
            this.field7228 = n2;
            this.field7226 = 0;
            this.method13521();
            return;
        }
    }

    @ObfuscatedName(value="aq")
    public void method13528(int n) {
        synchronized (this) {
            this.method13525(n << 6, this.getObjectId());
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aw")
    @Export(value="getObjectId")
    public int getObjectId() {
        synchronized (this) {
            block4: {
                if (this.field7228 >= 0) break block4;
                return -1;
            }
            return this.field7228;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="av")
    public void method13533(int n) {
        synchronized (this) {
            int n2;
            if (n == 0) {
                this.method13524(0);
                this.remove();
                return;
            }
            if (this.field7227 == 0 && this.field7221 == 0) {
                this.field7226 = 0;
                this.field7220 = 0;
                this.field7219 = 0;
                this.remove();
                return;
            }
            int n3 = n2 = -this.field7219;
            if (this.field7219 > n2) {
                n3 = this.field7219;
            }
            n2 = n3;
            if (-this.field7227 > n3) {
                n2 = -this.field7227;
            }
            n3 = n2;
            if (this.field7227 > n2) {
                n3 = this.field7227;
            }
            n2 = n3;
            if (-this.field7221 > n3) {
                n2 = -this.field7221;
            }
            n3 = n2;
            if (this.field7221 > n2) {
                n3 = this.field7221;
            }
            n2 = n;
            if (n > n3) {
                n2 = n3;
            }
            this.field7226 = n2;
            this.field7220 = Integer.MIN_VALUE;
            this.field7224 = -this.field7219 / n2;
            this.field7225 = -this.field7227 / n2;
            this.field7229 = -this.field7221 / n2;
            return;
        }
    }

    @ObfuscatedName(value="ab")
    @Export(value="setNumLoops")
    public void setNumLoops(int n) {
        synchronized (this) {
            this.numLoops = n;
            return;
        }
    }

    @ObfuscatedName(value="bk")
    public boolean method13547() {
        return this.field7226 != 0;
    }

    @ObfuscatedName(value="ae")
    static int method13453(int n, int n2) {
        if (n2 < 0) {
            return -n;
        }
        return (int)((double)n * Math.sqrt((double)n2 * 1.220703125E-4) + 0.5);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lhb;II)Lhm;")
    @Export(value="createRawPcmStream")
    public static RawPcmStream createRawPcmStream(RawSound rawSound, int n, int n2) {
        if (rawSound.samples != null && rawSound.samples.length != 0) {
            return new RawPcmStream(rawSound, (int)((long)rawSound.sampleRate * 256L * (long)n / (long)(PcmPlayer.field3250 * 100)), n2 << 6);
        }
        return null;
    }

    @ObfuscatedName(value="ak")
    static int method13455(int n, int n2) {
        if (n2 < 0) {
            return n;
        }
        return (int)((double)n * Math.sqrt((double)(16384 - n2) * 1.220703125E-4) + 0.5);
    }
}

