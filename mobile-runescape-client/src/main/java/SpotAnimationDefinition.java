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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="em")
@Implements(value="SpotAnimationDefinition")
public class SpotAnimationDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field7132;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="SpotAnimationDefinition_cached")
    static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="SpotAnimationDefinition_archive")
    static AbstractArchive SpotAnimationDefinition_archive;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field7135;
    @ObfuscatedName(value="aa")
    short[] field7138;
    @ObfuscatedName(value="af")
    short[] field7140;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=390054393)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1160141327)
    public int field7142 = -1;
    @ObfuscatedName(value="al")
    short[] field7143;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1747678949)
    int field7144 = 128;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1485451345)
    int field7145 = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=2087536339)
    int field7146 = 128;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1381504081)
    int field7147;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-1297326877)
    int field7148 = 0;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1202081645)
    int field7149 = 0;
    @ObfuscatedName(value="ab")
    short[] field7139;

    static {
        SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64, null);
        field7135 = new EvictingDualNodeHashTable(30, null);
    }

    SpotAnimationDefinition() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IB)Lcp;")
    public final Model method13323(int n, byte by) {
        Model model = (Model)field7135.get(this.id);
        Object object = model;
        if (model == null) {
            object = field7132;
            by = (byte)(this.field7147 * -109163697);
            byte by2 = 0;
            if ((object = ModelData.ModelData_get((AbstractArchive)object, by * -1381504081, 0)) == null) {
                return null;
            }
            if (this.field7143 != null) {
                for (by = 0; by < this.field7143.length; by = (byte)(by + 1)) {
                    ((ModelData)object).recolor(this.field7143[by], this.field7138[by]);
                }
            }
            if (this.field7139 != null) {
                for (by = by2; by < this.field7139.length; by = (byte)(by + 1)) {
                    ((ModelData)object).retexture(this.field7139[by], this.field7140[by]);
                }
            }
            object = ((ModelData)object).toModel(this.field7149 + 64, this.field7148 + 850, -30, -50, -30);
            field7135.put((DualNode)object, this.id);
        }
        object = this.field7142 != -1 && n != -1 ? class122.SequenceDefinition_get(this.field7142).method13175((Model)object, n) : ((Model)object).method14360(true);
        if (this.field7146 != 128 || this.field7144 != 128) {
            ((Model)object).scale(this.field7146, this.field7144, this.field7146);
        }
        if (this.field7145 != 0) {
            if (this.field7145 == 90) {
                ((Model)object).method14364();
            }
            if (this.field7145 == 180) {
                ((Model)object).method14364();
                ((Model)object).method14364();
            }
            if (this.field7145 == 270) {
                ((Model)object).method14364();
                ((Model)object).method14364();
                ((Model)object).method14364();
            }
        }
        return object;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        while ((n = buffer.method11650(-1390056141)) != 0) {
            this.method13332(buffer, n, 286877299);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;II)V")
    void method13332(Buffer buffer, int n, int n2) {
        if (n == 1) {
            this.field7147 = buffer.method11637(-748680749);
            return;
        }
        if (n == 2) {
            this.field7142 = buffer.method11637(-193005290);
            return;
        }
        if (n == 4) {
            this.field7146 = buffer.method11637(868606409);
            return;
        }
        if (n == 5) {
            this.field7144 = buffer.method11637(793861683);
            return;
        }
        if (n == 6) {
            this.field7145 = buffer.method11637(-182947210);
            return;
        }
        if (n == 7) {
            this.field7149 = buffer.method11650(-575868629);
            return;
        }
        if (n == 8) {
            this.field7148 = buffer.method11650(1773366566);
            return;
        }
        int n3 = 0;
        n2 = 0;
        if (n == 40) {
            n3 = buffer.method11650(960685411);
            this.field7143 = new short[n3];
            this.field7138 = new short[n3];
        } else {
            if (n != 41) return;
            n2 = buffer.method11650(1336095936);
            this.field7139 = new short[n2];
            this.field7140 = new short[n2];
            for (n = n3; n < n2; ++n) {
                this.field7139[n] = (short)buffer.method11637(1035503483);
                this.field7140[n] = (short)buffer.method11637(1215512697);
            }
            return;
        }
        for (n = n2; n < n3; ++n) {
            this.field7143[n] = (short)buffer.method11637(-1137156617);
            this.field7138[n] = (short)buffer.method11637(1969595345);
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(II)Lbf;", garbageValue="-433955450")
    @Export(value="getFrames")
    static Frames getFrames(int n) {
        Object object = SequenceDefinition.SequenceDefinition_cachedFrames;
        long l = n;
        if ((object = (Frames)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = class260.method7497(SequenceDefinition.SequenceDefinition_animationsArchive, UserComparator4.SequenceDefinition_skeletonsArchive, n, false, 2139294179);
        if (object != null) {
            SequenceDefinition.SequenceDefinition_cachedFrames.put((DualNode)object, l);
        }
        return object;
    }
}

