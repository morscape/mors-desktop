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

@ObfuscatedName(value="hw")
@Implements(value="SoundEffect")
public class SoundEffect {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Lhy;")
    @Export(value="instruments")
    Instrument[] instruments = new Instrument[10];
    @ObfuscatedName(value="ai")
    int field3319;
    @ObfuscatedName(value="ax")
    int field3320;

    @ObfuscatedSignature(descriptor="(Lmi;)V")
    SoundEffect(Buffer buffer) {
        for (int i = 0; i < 10; ++i) {
            if (buffer.method11650(-432012088) == 0) continue;
            --buffer.offset;
            this.instruments[i] = new Instrument();
            this.instruments[i].decode(buffer);
        }
        this.field3319 = buffer.method11637(-1583620017);
        this.field3320 = buffer.method11637(-114791641);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lhb;")
    @Export(value="toRawSound")
    public RawSound toRawSound() {
        return new RawSound(22050, this.mix(), this.field3319 * 22050 / 1000, this.field3320 * 22050 / 1000);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @Export(value="mix")
    final byte[] mix() {
        int n;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n2 >= 10) {
                if (n3 == 0) {
                    return new byte[0];
                }
                break;
            }
            n = n3;
            if (this.instruments[n2] != null) {
                n = n3;
                if (this.instruments[n2].duration + this.instruments[n2].field3343 > n3) {
                    n = this.instruments[n2].duration + this.instruments[n2].field3343;
                }
            }
            ++n2;
            n3 = n;
        }
        byte[] arrby = new byte[n3 * 22050 / 1000];
        n2 = 0;
        while (n2 < 10) {
            if (this.instruments[n2] != null) {
                int n4 = this.instruments[n2].duration * 22050 / 1000;
                int n5 = this.instruments[n2].field3343 * 22050 / 1000;
                int[] arrn = this.instruments[n2].synthesize(n4, this.instruments[n2].duration);
                for (n3 = 0; n3 < n4; ++n3) {
                    int n6;
                    int n7 = n3 + n5;
                    n = n6 = (arrn[n3] >> 8) + arrby[n7];
                    if ((n6 + 128 & 0xFFFFFF00) != 0) {
                        n = n6 >> 31 ^ 0x7F;
                    }
                    arrby[n7] = (byte)n;
                }
            }
            ++n2;
        }
        return arrby;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;II)Lhw;")
    @Export(value="readSoundEffect")
    public static SoundEffect readSoundEffect(AbstractArchive object, int n, int n2) {
        if ((object = (Object)((AbstractArchive)object).takeFile(n, n2)) == null) {
            return null;
        }
        return new SoundEffect(new Buffer((byte[])object));
    }
}

