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
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kv")
@Implements(value="Archive")
public class Archive
extends AbstractArchive {
    @ObfuscatedName(value="bg")
    static CRC32 field6304 = new CRC32();
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1129259613)
    @Export(value="index")
    int index;
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="Lny;")
    @Export(value="masterDisk")
    ArchiveDisk masterDisk;
    @ObfuscatedName(value="au")
    volatile boolean field6308 = false;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-851204695)
    int field6310 = -1;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=285411775)
    @Export(value="indexVersion")
    int indexVersion;
    @ObfuscatedName(value="bp")
    boolean field6313 = false;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lny;")
    @Export(value="archiveDisk")
    ArchiveDisk archiveDisk;
    @ObfuscatedName(value="bi")
    @Export(value="validGroups")
    volatile boolean[] validGroups;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=166622549)
    @Export(value="indexCrc")
    int indexCrc;

    @ObfuscatedSignature(descriptor="(Lny;Lny;IZZZ)V")
    public Archive(ArchiveDisk archiveDisk, ArchiveDisk archiveDisk2, int n, boolean bl, boolean bl2, boolean bl3) {
        super(bl, bl2);
        this.archiveDisk = archiveDisk;
        this.masterDisk = archiveDisk2;
        this.index = n;
        this.field6313 = bl3;
        Strings.method4883(this, this.index);
    }

    @Override
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="67")
    @Export(value="groupLoadPercent")
    int groupLoadPercent(int n) {
        if (this.groups[n] == null) {
            if (!this.validGroups[n]) {
                n = NPC.method15534(this.index, n);
                return n;
            }
            return 100;
        }
        return 100;
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="2")
    @Export(value="writeShortLE")
    void writeShortLE(int n) {
        class35.method1015(this.index, n);
    }

    @Override
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="0")
    @Export(value="loadGroup")
    void loadGroup(int n) {
        if (this.archiveDisk == null || this.validGroups == null || !this.validGroups[n]) {
            TriBool.requestNetFile(this, this.index, n, this.groupCrcs[n], (byte)2, true);
            return;
        }
        Rasterizer3D.method611(n, this.archiveDisk, this);
    }

    @ObfuscatedName(value="dm")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="-401")
    public boolean method11538() {
        boolean bl = this.field6308;
        return bl;
    }

    @ObfuscatedName(value="eu")
    public int method11559(int n) {
        n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n >= this.groups.length) {
                if (n2 == 0) {
                    return 100;
                }
                n = n3 * 100 / n2;
                return n;
            }
            int n4 = n2;
            int n5 = n3;
            if (this.field3652[n] > 0) {
                n4 = n2 + 100;
                n5 = n3 + this.groupLoadPercent(n);
            }
            ++n;
            n2 = n4;
            n3 = n5;
        }
    }

    @ObfuscatedName(value="da")
    @ObfuscatedSignature(descriptor="(Lny;I[BZS)V")
    void method11535(ArchiveDisk object, int n, byte[] arrby, boolean bl, short s) {
        ArchiveDisk archiveDisk = this.masterDisk;
        s = 0;
        if (archiveDisk != object) {
            if (!bl && n == this.field6310) {
                this.field6308 = true;
            }
            if (arrby != null && arrby.length > 2) {
                field6304.reset();
                field6304.update(arrby, 0, arrby.length - 2);
                s = (short)field6304.getValue();
                byte by = arrby[arrby.length - 2];
                byte by2 = arrby[arrby.length - 1];
                if (s == this.groupCrcs[n] && (by2 & 0xFF) + ((by & 0xFF) << 8) == this.field3651[n]) {
                    this.validGroups[n] = true;
                    if (!bl) {
                        return;
                    }
                    this.groups[n] = Messages.method6057(arrby, false);
                    return;
                }
                this.validGroups[n] = false;
                if (!this.field6313 && !bl) {
                    return;
                }
                TriBool.requestNetFile(this, this.index, n, this.groupCrcs[n], (byte)2, bl);
                return;
            }
            this.validGroups[n] = false;
            if (this.field6313 || bl) {
                TriBool.requestNetFile(this, this.index, n, this.groupCrcs[n], (byte)2, bl);
            }
            return;
        }
        if (this.field6308) {
            throw new RuntimeException();
        }
        if (arrby != null) {
            field6304.reset();
            field6304.update(arrby, 0, arrby.length);
            if ((int)field6304.getValue() == this.indexCrc) {
                object = new Buffer(ItemContainer.method12844(arrby, 214030025));
                int n2 = ((Buffer)object).method11650(374796615);
                if (n2 != 5 && n2 != 6) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(n2);
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(this.index);
                    ((StringBuilder)object).append(",");
                    ((StringBuilder)object).append(n);
                    throw new RuntimeException(((StringBuilder)object).toString());
                }
                n = s;
                if (n2 >= 6) {
                    n = ((Buffer)object).method11670(1604085085);
                }
                if (n == this.indexVersion) {
                    this.method6144(arrby, (byte)8);
                    this.method11552(-1248570763);
                    return;
                }
                TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
                return;
            }
            TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
        }
        TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
    }

    @ObfuscatedName(value="de")
    public int method11536(short s) {
        if (!this.field6308) {
            if (this.groups == null) {
                int n = NPC.method15534(255, this.index);
                s = (short)n;
                if (n >= 100) {
                    s = (short)99;
                }
                return s;
            }
            return 99;
        }
        return 100;
    }

    @ObfuscatedName(value="dh")
    @ObfuscatedSignature(descriptor="(I[BZZI)V", garbageValue="-984700948")
    @Export(value="write")
    void write(int n, byte[] arrby, boolean bl, boolean bl2) {
        if (!bl) {
            arrby[arrby.length - 2] = (byte)(this.field3651[n] >> 8);
            arrby[arrby.length - 1] = (byte)this.field3651[n];
            if (this.archiveDisk != null) {
                class58.method3848(n, arrby, this.archiveDisk);
                this.validGroups[n] = true;
            }
            if (bl2) {
                this.groups[n] = Messages.method6057(arrby, false);
            }
            return;
        }
        if (!this.field6308) {
            if (this.masterDisk != null) {
                class58.method3848(this.index, arrby, this.masterDisk);
            }
        } else {
            throw new RuntimeException();
        }
        this.method6144(arrby, (byte)-68);
        this.method11552(-492392121);
    }

    @ObfuscatedName(value="dy")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="2107187960")
    @Export(value="loadIndex")
    void loadIndex(int n, int n2) {
        this.indexCrc = n;
        this.indexVersion = n2;
        if (this.masterDisk == null) {
            TriBool.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
            return;
        }
        Rasterizer3D.method611(this.index, this.masterDisk, this);
    }

    @ObfuscatedName(value="ee")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1909592653")
    public boolean method11544(int n) {
        boolean bl = this.validGroups[n];
        return bl;
    }

    @ObfuscatedName(value="em")
    void method11552(int n) {
        this.validGroups = new boolean[this.groups.length];
        int n2 = 0;
        n = 0;
        while (true) {
            if (n >= this.validGroups.length) {
                if (this.archiveDisk != null) {
                    this.field6310 = -1;
                    n = n2;
                    while (true) {
                        if (n < this.validGroups.length) {
                            if (this.field3652[n] > 0) {
                                class324.method11442(n, this.archiveDisk, this);
                                this.field6310 = n;
                            }
                        } else {
                            if (this.field6310 == -1) {
                                this.field6308 = true;
                            }
                            return;
                        }
                        ++n;
                    }
                }
                this.field6308 = true;
                return;
            }
            this.validGroups[n] = false;
            ++n;
        }
    }

    @ObfuscatedName(value="ev")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1985257766")
    public boolean method11560(int n) {
        int[] arrn = this.getGroupFileIds(n);
        return arrn != null;
    }
}

