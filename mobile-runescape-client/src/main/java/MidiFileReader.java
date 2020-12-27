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

@ObfuscatedName(value="lw")
@Implements(value="MidiFileReader")
public class MidiFileReader {
    @ObfuscatedName(value="ab")
    static final byte[] field3814 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    @ObfuscatedName(value="aa")
    long field3820;
    @ObfuscatedName(value="ae")
    int field3821;
    @ObfuscatedName(value="ah")
    @Export(value="trackLengths")
    int[] trackLengths;
    @ObfuscatedName(value="aj")
    int field3824;
    @ObfuscatedName(value="as")
    int[] field3826;
    @ObfuscatedName(value="ai")
    @Export(value="trackStarts")
    int[] trackStarts;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="buffer")
    Buffer buffer = new Buffer(null);
    @ObfuscatedName(value="ax")
    @Export(value="trackPositions")
    int[] trackPositions;

    MidiFileReader(byte[] arrby) {
        this.parse(arrby);
    }

    MidiFileReader() {
    }

    @ObfuscatedName(value="aa")
    @Export(value="readMessage")
    int readMessage(int n) {
        return this.readMessage0(n);
    }

    @ObfuscatedName(value="ae")
    @Export(value="clear")
    void clear() {
        this.buffer.array = null;
        this.trackStarts = null;
        this.trackPositions = null;
        this.trackLengths = null;
        this.field3826 = null;
    }

    @ObfuscatedName(value="af")
    int method6557(int n, int n2) {
        if (n2 == 255) {
            int n3 = this.buffer.method11650(-1915167229);
            n2 = this.buffer.method11674(701725131);
            if (n3 == 47) {
                Buffer buffer = this.buffer;
                buffer.offset = n2 + buffer.offset;
                return 1;
            }
            if (n3 == 81) {
                n3 = this.buffer.method11649(-1192691854);
                n = this.trackLengths[n];
                this.field3820 += (long)n * (long)(this.field3824 - n3);
                this.field3824 = n3;
                Buffer buffer = this.buffer;
                buffer.offset = n2 - 3 + buffer.offset;
                return 2;
            }
            Buffer buffer = this.buffer;
            buffer.offset = n2 + buffer.offset;
            return 3;
        }
        byte by = field3814[n2 - 128];
        n = n2;
        if (by >= 1) {
            n = n2 | this.buffer.method11650(-307753789) << 8;
        }
        n2 = n;
        if (by >= 2) {
            n2 = n | this.buffer.method11650(-1448408002) << 16;
        }
        return n2;
    }

    @ObfuscatedName(value="ah")
    @Export(value="gotoTrack")
    void gotoTrack(int n) {
        this.buffer.offset = this.trackPositions[n];
    }

    @ObfuscatedName(value="aj")
    @Export(value="setTrackDone")
    void setTrackDone() {
        this.buffer.offset = -1;
    }

    @ObfuscatedName(value="al")
    @Export(value="readTrackLength")
    void readTrackLength(int n) {
        int n2 = this.buffer.method11674(-1605460550);
        int[] arrn = this.trackLengths;
        arrn[n] = n2 + arrn[n];
    }

    @ObfuscatedName(value="am")
    @Export(value="getPrioritizedTrack")
    int getPrioritizedTrack() {
        int n = this.trackPositions.length;
        int n2 = -1;
        int n3 = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            int n4;
            if (this.trackPositions[i] < 0) {
                n4 = n3;
            } else {
                n4 = n3;
                if (this.trackLengths[i] < n3) {
                    n4 = this.trackLengths[i];
                    n2 = i;
                }
            }
            n3 = n4;
        }
        return n2;
    }

    @ObfuscatedName(value="an")
    @Export(value="isDone")
    boolean isDone() {
        int n = this.trackPositions.length;
        for (int i = 0; i < n; ++i) {
            if (this.trackPositions[i] < 0) continue;
            return false;
        }
        return true;
    }

    @ObfuscatedName(value="aq")
    long method6568(int n) {
        return this.field3820 + (long)n * (long)this.field3824;
    }

    @ObfuscatedName(value="as")
    @Export(value="markTrackPosition")
    void markTrackPosition(int n) {
        this.trackPositions[n] = this.buffer.offset;
    }

    @ObfuscatedName(value="ai")
    @Export(value="isReady")
    boolean isReady() {
        return this.buffer.array != null;
    }

    @ObfuscatedName(value="ak")
    @Export(value="parse")
    void parse(byte[] object) {
        this.buffer.array = object;
        this.buffer.offset = 10;
        int n = this.buffer.method11637(2146812817);
        this.field3821 = this.buffer.method11637(-697933691);
        this.field3824 = 500000;
        this.trackStarts = new int[n];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            int n5;
            if (n3 < n) {
                int n6 = this.buffer.method11670(1604085085);
                n5 = this.buffer.method11670(1604085085);
                n4 = n3;
                if (n6 == 1297379947) {
                    this.trackStarts[n3] = this.buffer.offset;
                    n4 = n3 + 1;
                }
            } else {
                this.field3820 = 0L;
                this.trackPositions = new int[n];
                for (n3 = n2; n3 < n; ++n3) {
                    this.trackPositions[n3] = this.trackStarts[n3];
                }
                this.trackLengths = new int[n];
                this.field3826 = new int[n];
                return;
            }
            object = this.buffer;
            object.offset = n5 + object.offset;
            n3 = n4;
        }
    }

    @ObfuscatedName(value="ax")
    @Export(value="trackCount")
    int trackCount() {
        return this.trackPositions.length;
    }

    @ObfuscatedName(value="ab")
    @Export(value="readMessage0")
    int readMessage0(int n) {
        Buffer buffer;
        int n2 = this.buffer.array[this.buffer.offset];
        if (n2 < 0) {
            this.field3826[n] = n2 &= 0xFF;
            buffer = this.buffer;
            ++buffer.offset;
        } else {
            n2 = this.field3826[n];
        }
        if (n2 != 240 && n2 != 247) {
            return this.method6557(n, n2);
        }
        int n3 = this.buffer.method11674(-987614070);
        if (n2 != 247 || n3 <= 0 || ((n2 = this.buffer.array[this.buffer.offset] & 0xFF) < 241 || n2 > 243) && n2 != 246 && n2 != 248 && (n2 < 250 || n2 > 252) && n2 != 254) {
            buffer = this.buffer;
            buffer.offset = n3 + buffer.offset;
            return 0;
        }
        buffer = this.buffer;
        ++buffer.offset;
        this.field3826[n] = n2;
        return this.method6557(n, n2);
    }
}

