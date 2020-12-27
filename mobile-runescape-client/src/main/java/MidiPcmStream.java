/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  li
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lx")
@Implements(value="MidiPcmStream")
public class MidiPcmStream
extends PcmStream {
    @ObfuscatedName(value="aa")
    int[] field7251;
    @ObfuscatedName(value="ac")
    int[] field7253;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1564794569)
    int field7255 = 256;
    @ObfuscatedName(value="af")
    int[] field7256;
    @ObfuscatedName(value="ag")
    int[] field7257;
    @ObfuscatedName(value="ah")
    int[] field7258 = new int[16];
    @ObfuscatedName(value="aj")
    int[] field7260;
    @ObfuscatedName(value="al")
    int[] field7262;
    @ObfuscatedName(value="am")
    int[] field7263;
    @ObfuscatedName(value="aq")
    int[] field7264;
    @ObfuscatedName(value="as")
    int[] field7265 = new int[16];
    @ObfuscatedName(value="au")
    int[] field7267;
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="Llw;")
    @Export(value="midiFile")
    MidiFileReader midiFile;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-267405151)
    int field7272;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=1443704637)
    int field7274;
    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="[[Lli;")
    MusicPatchNode[][] field7276;
    @ObfuscatedName(value="bq")
    long field7277;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(longValue=9177733187008448005L)
    long field7278;
    @ObfuscatedName(value="ad")
    int[] field7254;
    @ObfuscatedName(value="ai")
    int field7259 = 68648128;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="musicPatches")
    NodeHashTable musicPatches;
    @ObfuscatedName(value="at")
    int[] field7266;
    @ObfuscatedName(value="av")
    int[] field7268;
    @ObfuscatedName(value="ax")
    boolean field7269 = false;
    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="[[Lli;")
    MusicPatchNode[][] field7273;
    @ObfuscatedName(value="ab")
    int[] field7252;
    @ObfuscatedName(value="bf")
    boolean field7270;
    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="Llc;")
    MusicPatchPcmStream field7275;

    public MidiPcmStream() {
        this.field7260 = new int[16];
        this.field7262 = new int[16];
        this.field7251 = new int[16];
        this.field7252 = new int[16];
        this.field7256 = new int[16];
        this.field7264 = new int[16];
        this.field7263 = new int[16];
        this.field7266 = new int[16];
        this.field7268 = new int[16];
        this.field7254 = new int[16];
        this.field7257 = new int[16];
        this.field7253 = new int[16];
        this.field7267 = new int[16];
        this.field7276 = (MusicPatchNode[][])Array.newInstance(li.class, 16, 128);
        this.field7273 = (MusicPatchNode[][])Array.newInstance(li.class, 16, 128);
        this.midiFile = new MidiFileReader();
        this.field7275 = new MusicPatchPcmStream(this);
        this.musicPatches = new NodeHashTable(128);
        this.method13701((byte)-6);
    }

    @ObfuscatedName(value="ae")
    int method13669(byte by) {
        by = (byte)(this.field7255 * 677930119);
        return by * -1564794569;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-8")
    void method13672() {
        synchronized (this) {
            Node node = this.musicPatches.first();
            while (true) {
                if ((node = (MusicPatch)node) == null) {
                    return;
                }
                node.remove();
                node = this.musicPatches.next();
            }
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1630504915")
    @Export(value="isReady")
    boolean isReady() {
        synchronized (this) {
            boolean bl = this.midiFile.isReady();
            return bl;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="9")
    public void method13678(int n, int n2) {
        synchronized (this) {
            this.method13689(n, n2);
            return;
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1092727224")
    @Export(value="clear")
    void clear() {
        synchronized (this) {
            this.midiFile.clear();
            this.method13701((byte)-49);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="14")
    void method13687(int n, int n2) {
        if (n2 == this.field7251[n]) return;
        this.field7251[n] = n2;
        n2 = 0;
        while (n2 < 128) {
            this.field7273[n][n2] = null;
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-659550823")
    void method13689(int n, int n2) {
        this.field7262[n] = n2;
        this.field7252[n] = n2 & 0xFFFFFF80;
        this.method13687(n, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="112757919")
    void method13694(int n) {
        if ((this.field7266[n] & 2) == 0) return;
        Node node = this.field7275.queue.last();
        while ((node = (MusicPatchNode)node) != null) {
            if (((MusicPatchNode)node).field6333 == n && this.field7276[n][((MusicPatchNode)node).field6341] == null && ((MusicPatchNode)node).field6345 < 0) {
                ((MusicPatchNode)node).field6345 = 0;
            }
            node = this.field7275.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="90")
    void method13703(int n, int n2) {
        this.field7253[n] = n2;
        this.field7267[n] = (int)(Math.pow(2.0, (double)n2 * 5.4931640625E-4) * 2097152.0 + 0.5);
    }

    @ObfuscatedName(value="bq")
    void method13707(int n, int n2) {
        n2 = 0;
        if (n >= 0) {
            this.field7258[n] = 12800;
            this.field7265[n] = 8192;
            this.field7260[n] = 16383;
            this.field7256[n] = 8192;
            this.field7264[n] = 0;
            this.field7263[n] = 8192;
            this.method13694(n);
            this.method13710(n);
            this.field7266[n] = 0;
            this.field7268[n] = 32767;
            this.field7254[n] = 256;
            this.field7257[n] = 0;
            this.method13703(n, 8192);
            return;
        }
        n = n2;
        while (n < 16) {
            this.method13707(n, -613530942);
            ++n;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1248948383")
    void method13710(int n) {
        if ((this.field7266[n] & 4) == 0) return;
        Node node = this.field7275.queue.last();
        while ((node = (MusicPatchNode)node) != null) {
            if (((MusicPatchNode)node).field6333 == n) {
                ((MusicPatchNode)node).field6342 = 0;
            }
            node = this.field7275.queue.previous();
        }
        return;
    }

    @ObfuscatedName(value="cw")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1287213226")
    public void method13735(boolean bl) {
        this.field7269 = bl;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="-76")
    @Export(value="skipSubStreams")
    void skipSubStreams(int n) {
        Node node = this.field7275.queue.last();
        while (true) {
            block10: {
                block8: {
                    block9: {
                        block7: {
                            if ((node = (MusicPatchNode)node) == null) break block7;
                            if (n < 0) break block8;
                            break block9;
                        }
                        return;
                    }
                    if (((MusicPatchNode)node).field6333 != n) break block10;
                }
                if (((MusicPatchNode)node).stream != null) {
                    ((MusicPatchNode)node).stream.method13533(PcmPlayer.field3250 / 100);
                    if (((MusicPatchNode)node).stream.method13547()) {
                        this.field7275.mixer.addSubStream(((MusicPatchNode)node).stream);
                    }
                    ((MusicPatchNode)node).method11594();
                }
                if (((MusicPatchNode)node).field6345 < 0) {
                    this.field7276[node.field6333][node.field6341] = null;
                }
                node.remove();
            }
            node = this.field7275.queue.previous();
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Llm;Lkc;Lhu;II)Z", garbageValue="-459370086")
    @Export(value="loadMusicTrack")
    boolean loadMusicTrack(MusicTrack musicTrack, AbstractArchive abstractArchive, SoundCache soundCache, int n) {
        synchronized (this) {
            musicTrack.method11605();
            int[] arrn = null;
            boolean bl = true;
            if (n > 0) {
                arrn = new int[]{n};
            }
            Object object = musicTrack.table.first();
            while (true) {
                block9: {
                    block8: {
                        block6: {
                            ByteArrayNode byteArrayNode;
                            block7: {
                                if ((byteArrayNode = (ByteArrayNode)object) == null) break block6;
                                n = (int)byteArrayNode.key;
                                object = this.musicPatches;
                                long l = n;
                                MusicPatch musicPatch = (MusicPatch)((NodeHashTable)object).get(l);
                                object = musicPatch;
                                if (musicPatch != null) break block7;
                                object = class12.method289(abstractArchive, n);
                                if (object == null) break block8;
                                this.musicPatches.put((Node)object, l);
                            }
                            if (((MusicPatch)object).method11601(soundCache, byteArrayNode.byteArray, arrn, 30958821)) break block9;
                            break block8;
                        }
                        if (bl) {
                            musicTrack.clear();
                        }
                        return bl;
                    }
                    bl = false;
                }
                object = musicTrack.table.next();
            }
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1816584145")
    @Export(value="setPcmStreamVolume")
    void setPcmStreamVolume(int n) {
        synchronized (this) {
            this.field7255 = n;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-51468691")
    @Export(value="clearAll")
    void clearAll() {
        synchronized (this) {
            Node node = this.musicPatches.first();
            while (true) {
                if ((node = (MusicPatch)node) == null) {
                    return;
                }
                ((MusicPatch)node).clear();
                node = this.musicPatches.next();
            }
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Llm;ZB)V")
    void method13666(MusicTrack musicTrack, boolean bl, byte by) {
        synchronized (this) {
            this.clear();
            this.midiFile.parse(musicTrack.midi);
            this.field7270 = bl;
            this.field7277 = 0L;
            int n = this.midiFile.trackCount();
            for (by = 0; by < n; by = (byte)(by + 1)) {
                this.midiFile.gotoTrack(by);
                this.midiFile.readTrackLength(by);
                this.midiFile.markTrackPosition(by);
            }
            this.field7274 = this.midiFile.getPrioritizedTrack();
            this.field7272 = this.midiFile.trackLengths[this.field7274];
            this.field7278 = this.midiFile.method6568(this.field7272);
            return;
        }
    }

    @ObfuscatedName(value="bk")
    void method13701(byte by) {
        this.skipSubStreams(-1);
        this.method13707(-1, -1200068694);
        int n = 0;
        by = 0;
        while (true) {
            int n2 = n;
            if (by >= 16) {
                while (true) {
                    if (n2 >= 16) {
                        return;
                    }
                    this.field7252[n2] = this.field7262[n2] & 0xFFFFFF80;
                    ++n2;
                }
            }
            this.field7251[by] = this.field7262[by];
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="1616444636")
    public static void method13664(Collection collection) {
        collection.add(class374.field6973);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ai")
    public static boolean method13663(char c, int n) {
        if (c >= ' ' && c < '\u007f' || c > '\u007f' && c < '\u00a0' || c > '\u00a0' && c <= '\u00ff') return true;
        if (c == '\u0000') return false;
        char[] arrc = class170.field3785;
        n = 0;
        while (n < arrc.length) {
            char c2 = arrc[n];
            if (c == c2) {
                return true;
            }
            ++n;
        }
        return false;
    }
}

