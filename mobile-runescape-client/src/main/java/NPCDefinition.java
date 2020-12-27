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

@ObfuscatedName(value="ev")
@Implements(value="NPCDefinition")
public class NPCDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field7157;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="NpcDefinition_cached")
    static EvictingDualNodeHashTable NpcDefinition_cached;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="NpcDefinition_archive")
    static AbstractArchive NpcDefinition_archive;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field7160;
    @ObfuscatedName(value="aa")
    int[] field7161;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1961030239)
    int field7163 = 128;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-726340049)
    public int field7165 = -1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=2118073827)
    int field7166 = 128;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=542931001)
    @Export(value="id")
    public int id;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-244130131)
    public int field7168 = 1;
    @ObfuscatedName(value="al")
    int[] field7169;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=13434001)
    public int field7170 = -1;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=2050696585)
    public int field7171 = -1;
    @ObfuscatedName(value="ao")
    short[] field7172;
    @ObfuscatedName(value="ap")
    short[] field7173;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1452086197)
    public int field7174 = -1;
    @ObfuscatedName(value="ar")
    short[] field7175;
    @ObfuscatedName(value="as")
    public String field7176 = Strings.field2765;
    @ObfuscatedName(value="au")
    public boolean field7178 = false;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-427780219)
    public int field7180 = -1;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-2082584459)
    public int field7181 = -1;
    @ObfuscatedName(value="az")
    short[] field7182;
    @ObfuscatedName(value="bd")
    public boolean field7184 = false;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=537900383)
    public int field7186 = -1;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-233849213)
    int field7187 = -1;
    @ObfuscatedName(value="bj")
    public int[] field7189;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=-267992369)
    int field7191 = 0;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=1030095631)
    int field7192 = -1;
    @ObfuscatedName(value="br")
    public boolean field7193 = true;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=577225751)
    public int field7164 = -1;
    @ObfuscatedName(value="at")
    public String[] field7177 = new String[5];
    @ObfuscatedName(value="av")
    public boolean field7179 = true;
    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="Lpy;")
    IterableNodeHashTable field7183;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-2042324995)
    int field7188 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1512059499)
    public int field7162 = -1;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=863132285)
    public int field7185 = 32;
    @ObfuscatedName(value="bk")
    public boolean field7190 = true;

    static {
        NpcDefinition_cached = new EvictingDualNodeHashTable(64, null);
        field7160 = new EvictingDualNodeHashTable(50, null);
    }

    NPCDefinition() {
    }

    @ObfuscatedName(value="aa")
    public boolean method13355(byte by) {
        if (this.field7189 != null) {
            by = this.field7187 != -1 ? (byte)class285.method10473(this.field7187, -181913371) : (this.field7192 != -1 ? (byte)Varps.Varps_main[this.field7192] : (byte)-1);
            if (by >= 0 && by < this.field7189.length) {
                return this.field7189[by] != -1;
                {
                }
            }
            by = (byte)this.field7189[this.field7189.length - 1];
            return by != -1;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;IB)V")
    void method13361(Buffer buffer, int n, byte by) {
        int n2;
        block33: {
            int n3;
            block34: {
                int n4;
                block35: {
                    int n5;
                    block36: {
                        block38: {
                            block37: {
                                n3 = 0;
                                n4 = 0;
                                n5 = 0;
                                by = 0;
                                n2 = 0;
                                if (n == 1) break block33;
                                if (n == 2) {
                                    this.field7176 = buffer.method11664(-2131282049);
                                    return;
                                }
                                if (n == 12) {
                                    this.field7168 = buffer.method11650(-1866239559);
                                    return;
                                }
                                if (n == 13) {
                                    this.field7162 = buffer.method11637(420803215);
                                    return;
                                }
                                if (n == 14) {
                                    this.field7170 = buffer.method11637(-1339842304);
                                    return;
                                }
                                if (n == 15) {
                                    this.field7165 = buffer.method11637(436776507);
                                    return;
                                }
                                if (n == 16) {
                                    this.field7174 = buffer.method11637(-1487769259);
                                    return;
                                }
                                if (n == 17) {
                                    this.field7170 = buffer.method11637(606938048);
                                    this.field7171 = buffer.method11637(884878015);
                                    this.field7181 = buffer.method11637(1382192670);
                                    this.field7180 = buffer.method11637(-138090276);
                                    return;
                                }
                                if (n >= 30 && n < 35) {
                                    String[] arrstring = this.field7177;
                                    arrstring[n -= 30] = buffer.method11664(-1892360931);
                                    if (!this.field7177[n].equalsIgnoreCase(Strings.field2788)) return;
                                    this.field7177[n] = null;
                                    return;
                                }
                                if (n == 40) break block34;
                                if (n == 41) break block35;
                                if (n == 60) break block36;
                                if (n == 93) {
                                    this.field7179 = false;
                                    return;
                                }
                                if (n == 95) {
                                    this.field7164 = buffer.method11637(59270871);
                                    return;
                                }
                                if (n == 97) {
                                    this.field7166 = buffer.method11637(85946715);
                                    return;
                                }
                                if (n == 98) {
                                    this.field7163 = buffer.method11637(-1565919237);
                                    return;
                                }
                                if (n == 99) {
                                    this.field7178 = true;
                                    return;
                                }
                                if (n == 100) {
                                    this.field7191 = buffer.method11636(1840504305);
                                    return;
                                }
                                if (n == 101) {
                                    this.field7188 = buffer.method11636(1609233902);
                                    return;
                                }
                                if (n == 102) {
                                    this.field7186 = buffer.method11637(152605669);
                                    return;
                                }
                                if (n == 103) {
                                    this.field7185 = buffer.method11637(1437020093);
                                    return;
                                }
                                if (n != 106 && n != 118) {
                                    if (n == 107) {
                                        this.field7193 = false;
                                        return;
                                    }
                                    if (n == 109) {
                                        this.field7190 = false;
                                        return;
                                    }
                                    if (n == 111) {
                                        this.field7184 = true;
                                        return;
                                    }
                                    if (n != 249) return;
                                    this.field7183 = FontName.method6390(buffer, this.field7183, 1408256200);
                                    return;
                                }
                                this.field7187 = buffer.method11637(1974472682);
                                if (this.field7187 == 65535) {
                                    this.field7187 = -1;
                                }
                                this.field7192 = buffer.method11637(1036460288);
                                if (this.field7192 == 65535) {
                                    this.field7192 = -1;
                                }
                                if (n != 118) break block37;
                                n = n2 = buffer.method11637(547410802);
                                if (n2 != 65535) break block38;
                            }
                            n = -1;
                        }
                        n2 = buffer.method11650(187268643);
                        this.field7189 = new int[n2 + 2];
                        while (true) {
                            if (by > n2) {
                                this.field7189[n2 + 1] = n;
                                return;
                            }
                            this.field7189[by] = buffer.method11637(43689559);
                            if (this.field7189[by] == 65535) {
                                this.field7189[by] = -1;
                            }
                            by = (byte)(by + 1);
                        }
                    }
                    by = (byte)buffer.method11650(-1382421803);
                    this.field7161 = new int[by];
                    n = n5;
                    while (n < by) {
                        this.field7161[n] = buffer.method11637(-162728084);
                        ++n;
                    }
                    return;
                }
                by = (byte)buffer.method11650(1033257447);
                this.field7172 = new short[by];
                this.field7182 = new short[by];
                n = n4;
                while (n < by) {
                    this.field7172[n] = (short)buffer.method11637(87301852);
                    this.field7182[n] = (short)buffer.method11637(266348165);
                    ++n;
                }
                return;
            }
            by = (byte)buffer.method11650(1014792194);
            this.field7175 = new short[by];
            this.field7173 = new short[by];
            n = n3;
            while (n < by) {
                this.field7175[n] = (short)buffer.method11637(-389839992);
                this.field7173[n] = (short)buffer.method11637(-7776136);
                ++n;
            }
            return;
        }
        by = (byte)buffer.method11650(-907234312);
        this.field7169 = new int[by];
        n = n2;
        while (n < by) {
            this.field7169[n] = buffer.method11637(119195297);
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)Lbk;")
    public final ModelData method13363(int n) {
        if (this.field7189 != null) {
            NPCDefinition nPCDefinition = this.method13364(-944307993);
            if (nPCDefinition != null) return nPCDefinition.method13363(2097411);
            return null;
        }
        if (this.field7161 == null) {
            return null;
        }
        int n2 = 0;
        n = 0;
        boolean bl = false;
        while (true) {
            block9: {
                block10: {
                    block8: {
                        if (n >= this.field7161.length) break block8;
                        if (field7157.tryLoadFile(this.field7161[n], 0)) break block9;
                        break block10;
                    }
                    if (bl) {
                        return null;
                    }
                    Object object = new ModelData[this.field7161.length];
                    for (n = 0; n < this.field7161.length; ++n) {
                        object[n] = ModelData.ModelData_get(field7157, this.field7161[n], 0);
                    }
                    object = ((ModelData[])object).length == 1 ? object[0] : new ModelData((ModelData[])object, ((ModelData[])object).length);
                    if (this.field7175 != null) {
                        for (n = 0; n < this.field7175.length; ++n) {
                            ((ModelData)object).recolor(this.field7175[n], this.field7173[n]);
                        }
                    }
                    if (this.field7172 == null) return object;
                    n = n2;
                    while (n < this.field7172.length) {
                        ((ModelData)object).retexture(this.field7172[n], this.field7182[n]);
                        ++n;
                    }
                    return object;
                }
                bl = true;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Lev;")
    public final NPCDefinition method13364(int n) {
        n = this.field7187 != -1 ? class285.method10473(this.field7187, 1520700128) : (this.field7192 != -1 ? Varps.Varps_main[this.field7192] : -1);
        n = n >= 0 && n < this.field7189.length - 1 ? this.field7189[n] : this.field7189[this.field7189.length - 1];
        if (n == -1) {
            return null;
        }
        NPCDefinition nPCDefinition = ItemContainer.getNpcDefinition(n);
        return nPCDefinition;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ldv;ILdv;IB)Lcp;")
    public final Model method13365(SequenceDefinition dualNode, int n, SequenceDefinition sequenceDefinition, int n2, byte by) {
        if (this.field7189 != null) {
            NPCDefinition nPCDefinition = this.method13364(-944307993);
            if (nPCDefinition == null) return null;
            return nPCDefinition.method13365((SequenceDefinition)dualNode, n, sequenceDefinition, n2, (byte)1);
        }
        ModelData[] arrmodelData = (ModelData[])field7160.get(this.id);
        Object object = arrmodelData;
        boolean bl = true;
        while (true) {
            block12: {
                boolean bl2;
                block13: {
                    block10: {
                        block11: {
                            if (!bl || (bl = false)) continue;
                            if (arrmodelData != null) break block10;
                            byte by2 = 0;
                            by = 0;
                            bl2 = false;
                            if (by >= this.field7169.length) break block11;
                            if (field7157.tryLoadFile(this.field7169[by], 0)) break block12;
                            break block13;
                        }
                        if (bl2) {
                            return null;
                        }
                        object = new ModelData[this.field7169.length];
                        for (by = 0; by < this.field7169.length; by = (byte)(by + 1)) {
                            object[by] = ModelData.ModelData_get(field7157, this.field7169[by], 0);
                        }
                        object = ((ModelData[])object).length == 1 ? object[0] : new ModelData((ModelData[])object, ((ModelData[])object).length);
                        if (this.field7175 != null) {
                            for (by = 0; by < this.field7175.length; by = (byte)(by + 1)) {
                                ((ModelData)object).recolor(this.field7175[by], this.field7173[by]);
                            }
                        }
                        if (this.field7172 != null) {
                            for (by = by2; by < this.field7172.length; by = (byte)(by + 1)) {
                                ((ModelData)object).retexture(this.field7172[by], this.field7182[by]);
                            }
                        }
                        object = ((ModelData)object).toModel(this.field7191 + 64, this.field7188 * 5 + 850, -30, -50, -30);
                        field7160.put((DualNode)object, this.id);
                    }
                    dualNode = dualNode != null && sequenceDefinition != null ? ((SequenceDefinition)dualNode).method13167((Model)object, n, sequenceDefinition, n2, -193747437) : (dualNode != null ? ((SequenceDefinition)dualNode).method13178((Model)object, n) : (sequenceDefinition != null ? sequenceDefinition.method13178((Model)object, n2) : ((Model)object).toSharedSequenceModel(true)));
                    if (this.field7166 == 128 && this.field7163 == 128) return dualNode;
                    ((Model)dualNode).scale(this.field7166, this.field7163, this.field7166);
                    return dualNode;
                }
                bl2 = true;
            }
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="479930846")
    @Export(value="postDecode")
    void postDecode() {
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        while ((n = buffer.method11650(949964015)) != 0) {
            this.method13361(buffer, n, (byte)43);
        }
        return;
    }
}

