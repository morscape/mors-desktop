/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dv")
@Implements(value="SequenceDefinition")
public class SequenceDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="SequenceDefinition_animationsArchive")
    static AbstractArchive SequenceDefinition_animationsArchive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="SequenceDefinition_cachedFrames")
    static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="SequenceDefinition_archive")
    static AbstractArchive SequenceDefinition_archive;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="SequenceDefinition_cached")
    static EvictingDualNodeHashTable SequenceDefinition_cached;
    @ObfuscatedName(value="aa")
    public int[] field7047;
    @ObfuscatedName(value="af")
    int[] field7049;
    @ObfuscatedName(value="aj")
    int[] field7050;
    @ObfuscatedName(value="al")
    @Export(value="frameLengths")
    public int[] frameLengths;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-1722605769)
    public int field7052 = 5;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=450018821)
    public int field7053 = -1;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-2114329311)
    public int field7054 = 2;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=255400379)
    public int field7055 = -1;
    @ObfuscatedName(value="aq")
    public boolean field7056 = false;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=210430509)
    public int field7057 = -1;
    @ObfuscatedName(value="as")
    public int[] field7058;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-603738307)
    public int field7059 = 99;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-229393753)
    public int field7060 = -1;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1362654329)
    @Export(value="frameCount")
    public int frameCount = -1;

    static {
        SequenceDefinition_cached = new EvictingDualNodeHashTable(64, null);
        SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100, null);
    }

    SequenceDefinition() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lcp;ILdv;II)Lcp;")
    public Model method13167(Model model, int n, SequenceDefinition dualNode, int n2, int n3) {
        n = this.field7058[n];
        Frames frames = SpotAnimationDefinition.getFrames(n >> 16);
        n3 = n & 0xFFFF;
        if (frames != null) {
            n = ((SequenceDefinition)dualNode).field7058[n2];
            dualNode = SpotAnimationDefinition.getFrames(n >> 16);
            n2 = n & 0xFFFF;
            if (dualNode != null) {
                n = frames.hasAlphaTransform(n3) ? 0 : 1;
                model = model.toSharedSequenceModel(((1 ^ ((Frames)dualNode).hasAlphaTransform(n2)) & n) != 0);
                model.animate2(frames, n3, (Frames)dualNode, n2, this.field7049);
                return model;
            }
            model = model.toSharedSequenceModel(true ^ frames.hasAlphaTransform(n3));
            model.animate(frames, n3);
            return model;
        }
        return ((SequenceDefinition)dualNode).method13178(model, n2);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="61")
    @Export(value="postDecode")
    void postDecode() {
        block5: {
            block4: {
                if (this.field7057 == -1) {
                    this.field7057 = this.field7049 != null ? 2 : 0;
                }
                if (this.field7055 != -1) break block4;
                if (this.field7049 != null) break block5;
                this.field7055 = 0;
            }
            return;
        }
        this.field7055 = 2;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lcp;III)Lcp;", garbageValue="154963264")
    @Export(value="transformObjectModel")
    Model transformObjectModel(Model model, int n, int n2) {
        n = this.field7058[n];
        Frames frames = SpotAnimationDefinition.getFrames(n >> 16);
        n &= 0xFFFF;
        if (frames != null) {
            model = model.toSharedSequenceModel(frames.hasAlphaTransform(n) ^ true);
            if ((n2 &= 3) != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        model.method14364();
                    }
                } else {
                    model.method14365();
                }
            } else {
                model.method14376();
            }
            model.animate(frames, n);
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        model.method14376();
                    }
                    return model;
                }
                model.method14365();
                return model;
            }
            model.method14364();
            return model;
        }
        return model.toSharedSequenceModel(true);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lcp;II)Lcp;", garbageValue="-961654661")
    Model method13175(Model model, int n) {
        n = this.field7058[n];
        Frames frames = SpotAnimationDefinition.getFrames(n >> 16);
        n &= 0xFFFF;
        boolean bl = true;
        if (frames != null) {
            if (frames.hasAlphaTransform(n)) {
                bl = false;
            }
            model = model.method14360(bl);
            model.animate(frames, n);
            return model;
        }
        return model.method14360(true);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lcp;II)Lcp;", garbageValue="2131230967")
    public Model method13178(Model model, int n) {
        n = this.field7058[n];
        Frames frames = SpotAnimationDefinition.getFrames(n >> 16);
        n &= 0xFFFF;
        boolean bl = true;
        if (frames != null) {
            if (frames.hasAlphaTransform(n)) {
                bl = false;
            }
            model = model.toSharedSequenceModel(bl);
            model.animate(frames, n);
            return model;
        }
        return model.toSharedSequenceModel(true);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        while ((n = buffer.method11650(-1334758257)) != 0) {
            this.method13182(buffer, n, 1719195644);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;II)V")
    void method13182(Buffer buffer, int n, int n2) {
        n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (n == 1) {
            n3 = buffer.method11637(788643065);
            this.frameLengths = new int[n3];
        } else {
            if (n == 2) {
                this.frameCount = buffer.method11637(962079026);
                return;
            }
            if (n == 3) {
                n5 = buffer.method11650(1351533235);
                this.field7049 = new int[n5 + 1];
                n = n2;
            } else {
                if (n == 4) {
                    this.field7056 = true;
                    return;
                }
                if (n == 5) {
                    this.field7052 = buffer.method11650(-2046891661);
                    return;
                }
                if (n == 6) {
                    this.field7053 = buffer.method11637(831939554);
                    return;
                }
                if (n == 7) {
                    this.field7060 = buffer.method11637(1028323568);
                    return;
                }
                if (n == 8) {
                    this.field7059 = buffer.method11650(-1433323287);
                    return;
                }
                if (n == 9) {
                    this.field7057 = buffer.method11650(-1412080883);
                    return;
                }
                if (n == 10) {
                    this.field7055 = buffer.method11650(1774063703);
                    return;
                }
                if (n == 11) {
                    this.field7054 = buffer.method11650(998554883);
                    return;
                }
                if (n == 12) {
                    n5 = buffer.method11650(46630019);
                    this.field7050 = new int[n5];
                    n = 0;
                } else {
                    if (n != 13) return;
                    n2 = buffer.method11650(-832229859);
                    this.field7047 = new int[n2];
                    for (n = n4; n < n2; ++n) {
                        this.field7047[n] = buffer.method11649(1046000955);
                    }
                    return;
                }
                while (true) {
                    if (n >= n5) break;
                    this.field7050[n] = buffer.method11637(-1414182710);
                    ++n;
                }
                for (n2 = n3; n2 < n5; ++n2) {
                    this.field7050[n2] = (buffer.method11637(-1316287383) << 16) + this.field7050[n2];
                }
                return;
            }
            while (true) {
                if (n >= n5) {
                    this.field7049[n5] = 9999999;
                    return;
                }
                this.field7049[n] = buffer.method11650(-643962876);
                ++n;
            }
        }
        for (n = 0; n < n3; ++n) {
            this.frameLengths[n] = buffer.method11637(1151050673);
        }
        this.field7058 = new int[n3];
        n = 0;
        while (true) {
            if (n >= n3) break;
            this.field7058[n] = buffer.method11637(1983576999);
            ++n;
        }
        for (n2 = n5; n2 < n3; ++n2) {
            this.field7058[n2] = (buffer.method11637(-858387809) << 16) + this.field7058[n2];
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lcp;II)Lcp;")
    public Model method13168(Model model, int n, int n2) {
        n2 = this.field7058[n];
        Frames frames = SpotAnimationDefinition.getFrames(n2 >> 16);
        int n3 = n2 & 0xFFFF;
        if (frames != null) {
            Frames frames2 = null;
            int n4 = 0;
            Frames frames3 = frames2;
            n2 = n4;
            if (this.field7050 != null) {
                frames3 = frames2;
                n2 = n4;
                if (n < this.field7050.length) {
                    n = this.field7050[n];
                    frames3 = SpotAnimationDefinition.getFrames(n >> 16);
                    n2 = n & 0xFFFF;
                }
            }
            if (frames3 != null && n2 != 65535) {
                model = model.toSharedSequenceModel((frames.hasAlphaTransform(n3) ^ true) & (frames3.hasAlphaTransform(n2) ^ true));
                model.animate(frames, n3);
                model.animate(frames3, n2);
                return model;
            }
            model = model.toSharedSequenceModel(frames.hasAlphaTransform(n3) ^ true);
            model.animate(frames, n3);
            return model;
        }
        return model.toSharedSequenceModel(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmr;IIB)Lhn;")
    public static final PcmPlayer method13156(TaskHandler object, int n, int n2, byte by) {
        by = (byte)(PcmPlayer.field3250 * -104161527);
        if (by * -348348615 == 0) throw new IllegalStateException();
        if (n < 0) throw new IllegalArgumentException();
        int n3 = 2;
        if (n >= 2) throw new IllegalArgumentException();
        by = (byte)n2;
        if (n2 < 256) {
            by = (byte)256;
        }
        try {
            object = class8.field68.player();
            n2 = PcmPlayer.PcmPlayer_stereo ? n3 : 1;
        }
        catch (Throwable throwable) {
            return new class303();
        }
        ((PcmPlayer)object).field3258 = new int[n2 * 256];
        ((PcmPlayer)object).vmethod11139();
        ((PcmPlayer)object).field3260 = (by & 0xFFFFFC00) + 1024;
        if (((PcmPlayer)object).field3260 > 16384) {
            ((PcmPlayer)object).field3260 = 16384;
        }
        ((PcmPlayer)object).vmethod11142(((PcmPlayer)object).field3260);
        if (PcmPlayer.field3248 > 0 && PcmPlayer.field3253 == null) {
            PcmPlayer.field3253 = new SoundSystem();
            SoundSystem.field3242 = Executors.newScheduledThreadPool(1);
            SoundSystem.field3242.scheduleAtFixedRate(PcmPlayer.field3253, 0L, 1L, TimeUnit.MILLISECONDS);
        }
        if (PcmPlayer.field3253 == null) return object;
        if (PcmPlayer.field3253.players[n] != null) throw new IllegalArgumentException();
        PcmPlayer.field3253.players[n] = object;
        return object;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIIIB)I", garbageValue="-81")
    static final int method13160(int n, int n2, int n3, int n4) {
        n3 = Rasterizer3D.Rasterizer3D_cosine[n3 * 1024 / n4];
        n3 = 65536 - n3 >> 1;
        return (n3 * n2 >> 16) + ((65536 - n3) * n >> 16);
    }
}

