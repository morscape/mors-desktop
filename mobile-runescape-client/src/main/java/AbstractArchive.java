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

@ObfuscatedName(value="kc")
@Implements(value="AbstractArchive")
public abstract class AbstractArchive {
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lmm;")
    @Export(value="gzipDecompressor")
    static GZipDecompressor gzipDecompressor = new GZipDecompressor();
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-1873187557)
    static int field3644 = 0;
    @ObfuscatedName(value="aa")
    @Export(value="fileIds")
    int[][] fileIds;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2042398039)
    int field3647;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="[Lpl;")
    class247[] field3648;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lpl;")
    class247 field3649;
    @ObfuscatedName(value="aj")
    int[] field3651;
    @ObfuscatedName(value="al")
    int[] field3652;
    @ObfuscatedName(value="am")
    @Export(value="files")
    Object[][] files;
    @ObfuscatedName(value="aq")
    @Export(value="groups")
    Object[] groups;
    @ObfuscatedName(value="ar")
    @Export(value="shallowFiles")
    boolean shallowFiles;
    @ObfuscatedName(value="as")
    @Export(value="groupCrcs")
    int[] groupCrcs;
    @ObfuscatedName(value="aw")
    @Export(value="releaseGroups")
    boolean releaseGroups;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-1405360253)
    public int field3659;
    @ObfuscatedName(value="ai")
    int[] field3650;
    @ObfuscatedName(value="ax")
    int[] field3658;
    @ObfuscatedName(value="ab")
    int[][] field3646;

    AbstractArchive(boolean bl, boolean bl2) {
        this.releaseGroups = bl;
        this.shallowFiles = bl2;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="67")
    @Export(value="groupLoadPercent")
    int groupLoadPercent(int n) {
        Object object = this.groups[n];
        if (object != null) {
            return 100;
        }
        return 0;
    }

    @ObfuscatedName(value="ac")
    public boolean method6136(String string2, String string3, int n) {
        string2 = string2.toLowerCase();
        string3 = string3.toLowerCase();
        n = this.field3649.method7383(BZip2State.method6232(string2, (byte)-1), 752329690);
        boolean bl = this.tryLoadFile(n, this.field3648[n].method7383(BZip2State.method6232(string3, (byte)-1), -89285361));
        return bl;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="2")
    @Export(value="writeShortLE")
    void writeShortLE(int n) {
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(III)[B", garbageValue="-298044101")
    @Export(value="getFile")
    public byte[] getFile(int n, int n2) {
        block4: {
            block6: {
                block5: {
                    if (n < 0 || n >= this.files.length || this.files[n] == null || n2 < 0) {
                        return null;
                    }
                    if (n2 >= this.files[n].length) break block4;
                    if (this.files[n][n2] != null || this.method6159(n, null, -2066267204)) break block5;
                    this.loadGroup(n);
                    if (!this.method6159(n, null, -1878332239)) break block6;
                }
                byte[] arrby = WorldMapManager.method3643(this.files[n][n2], false);
                return arrby;
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="ag")
    public byte[] method6140(String object, String string2, byte by) {
        object = ((String)object).toLowerCase();
        string2 = string2.toLowerCase();
        by = (byte)this.field3649.method7383(BZip2State.method6232((CharSequence)object, (byte)-1), -653903342);
        object = this.takeFile(by, this.field3648[by].method7383(BZip2State.method6232(string2, (byte)-1), -1189671854));
        return object;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(III)Z", garbageValue="2145224521")
    @Export(value="tryLoadFile")
    public boolean tryLoadFile(int n, int n2) {
        if (n < 0 || n >= this.files.length || this.files[n] == null || n2 < 0) {
            return false;
        }
        if (n2 < this.files[n].length) {
            if (this.files[n][n2] == null) {
                if (this.groups[n] == null) {
                    this.loadGroup(n);
                    Object object = this.groups[n];
                    return object != null;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="529651288")
    @Export(value="tryLoadGroup")
    public boolean tryLoadGroup(int n) {
        if (this.groups[n] == null) {
            this.loadGroup(n);
            Object object = this.groups[n];
            return object != null;
        }
        return true;
    }

    @ObfuscatedName(value="al")
    public boolean method6145(byte by) {
        by = 0;
        boolean bl = true;
        while (by < this.field3650.length) {
            int n = this.field3650[by];
            boolean bl2 = bl;
            if (this.groups[n] == null) {
                this.loadGroup(n);
                Object object = this.groups[n];
                bl2 = bl;
                if (object == null) {
                    bl2 = false;
                }
            }
            by = (byte)(by + 1);
            bl = bl2;
        }
        return bl;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="0")
    @Export(value="loadGroup")
    void loadGroup(int n) {
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="1132613957")
    @Export(value="getGroupFileIds")
    public int[] getGroupFileIds(int n) {
        if (n >= 0 && n < this.fileIds.length) {
            int[] arrn = this.fileIds[n];
            return arrn;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    public void method6148(byte by) {
        by = 0;
        while (by < this.files.length) {
            if (this.files[by] != null) {
                for (int i = 0; i < this.files[by].length; ++i) {
                    this.files[by][i] = null;
                }
            }
            by = (byte)(by + 1);
        }
        return;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="1781899294")
    @Export(value="getFileFlat")
    public byte[] getFileFlat(int n) {
        if (this.files.length == 1) {
            return this.getFile(0, n);
        }
        if (this.files[n].length == 1) {
            return this.getFile(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ar")
    @Export(value="setMaxFlashCount")
    public void setMaxFlashCount(int n) {
        n = 0;
        while (n < this.groups.length) {
            this.groups[n] = null;
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="377313290")
    public boolean method6152(int n) {
        if (this.files.length == 1) {
            return this.tryLoadFile(0, n);
        }
        if (this.files[n].length == 1) {
            return this.tryLoadFile(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="-960075052")
    @Export(value="tryLoadGroupByName")
    public boolean tryLoadGroupByName(String string2) {
        string2 = string2.toLowerCase();
        boolean bl = this.tryLoadGroup(this.field3649.method7383(BZip2State.method6232(string2, (byte)-1), 365931848));
        return bl;
    }

    @ObfuscatedName(value="aw")
    public int method6156(int n) {
        n = this.files.length;
        return n;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="337076015")
    @Export(value="getGroupFileCount")
    public int getGroupFileCount(int n) {
        n = this.files[n].length;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="az")
    boolean method6159(int n, int[] object, int n2) {
        int n3;
        int n4;
        int n5;
        Object object2;
        int n6;
        Object object3;
        block16: {
            object3 = this.groups[n];
            boolean bl = false;
            if (object3 == null) {
                return false;
            }
            n6 = this.field3652[n];
            int[] arrn = this.fileIds[n];
            Object[] arrobject = this.files[n];
            n2 = 0;
            while (n2 < n6) {
                if (arrobject[arrn[n2]] != null) {
                    ++n2;
                    continue;
                }
                break block16;
            }
            return true;
        }
        n2 = 0;
        if (n2 != 0) {
            return true;
        }
        if (object != null && (object[0] != false || object[1] != false || object[2] != false || object[3] != false)) {
            object3 = WorldMapManager.method3643(this.groups[n], true);
            object2 = new Buffer((byte[])object3);
            ((Buffer)object2).method11676((int[])object, 5, ((Buffer)object2).array.length, 2024226378);
        } else {
            object3 = WorldMapManager.method3643(this.groups[n], false);
        }
        object2 = ItemContainer.method12844((byte[])object3, 668871317);
        if (this.releaseGroups) {
            this.groups[n] = null;
        }
        if (n6 > 1) {
            n = ((byte[])object2).length - 1;
            n5 = object2[n] & 0xFF;
            object = new Buffer((byte[])object2);
            object3 = new int[n6];
            n4 = (n - n5 * n6 * 4) * 1897459807;
            ((Buffer)object).offset = n4 * 1792371615;
        } else {
            if (!this.shallowFiles) {
                arrobject[arrn[0]] = Messages.method6057((byte[])object2, false);
                return true;
            }
            arrobject[arrn[0]] = object2;
            return true;
        }
        for (n = 0; n < n5; ++n) {
            n3 = 0;
            for (n2 = 0; n2 < n6; ++n2) {
                object3[n2] = (n3 += ((Buffer)object).method11670(1604085085)) + object3[n2];
            }
        }
        byte[][] arrarrby = new byte[n6][];
        for (n = 0; n < n6; ++n) {
            arrarrby[n] = new byte[object3[n]];
            object3[n] = false;
        }
        ((Buffer)object).offset = n4 * 1792371615;
        n = 0;
        for (n2 = 0; n2 < n5; ++n2) {
            n4 = 0;
            for (n3 = 0; n3 < n6; ++n3) {
                System.arraycopy(object2, n, arrarrby[n3], (int)object3[n3], n4 += ((Buffer)object).method11670(1604085085));
                object3[n3] = n4 + object3[n3];
                n = n4 + n;
            }
        }
        n = 0;
        while (n < n6) {
            arrobject[arrn[n]] = !this.shallowFiles ? Messages.method6057(arrarrby[n], false) : (Object)arrarrby[n];
            ++n;
        }
        return true;
    }

    @ObfuscatedName(value="bp")
    public void method6174(String string2, int n) {
        n = this.field3649.method7383(BZip2State.method6232(string2 = string2.toLowerCase(), (byte)-1), 1816621833);
        if (n < 0) {
            return;
        }
        this.writeShortLE(n);
    }

    @ObfuscatedName(value="ad")
    public boolean method6137(String string2, String string3, int n) {
        string2 = string2.toLowerCase();
        string3 = string3.toLowerCase();
        n = this.field3649.method7383(BZip2State.method6232(string2, (byte)-1), -416366037);
        if (n < 0) {
            return false;
        }
        return (n = this.field3648[n].method7383(BZip2State.method6232(string3, (byte)-1), -181345693)) >= 0;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIB)[B", garbageValue="16")
    @Export(value="takeFile")
    public byte[] takeFile(int n, int n2) {
        byte[] arrby = this.takeFileEncrypted(n, n2, null);
        return arrby;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    void method6144(byte[] var1_1, byte var2_2) {
        block18: {
            block26: {
                block17: {
                    block19: {
                        this.field3659 = class56.method3839((byte[])var1_1, ((Object)var1_1).length);
                        var6_3 = (var1_1 = new Buffer(ItemContainer.method12844((byte[])var1_1, -969764235))).method11650(-973424346);
                        if (var6_3 < 5) throw new RuntimeException("");
                        if (var6_3 > 7) throw new RuntimeException("");
                        if (var6_3 >= 6) {
                            var1_1.method11670(1604085085);
                        }
                        var7_4 = var1_1.method11650(-1210956489);
                        this.field3647 = var6_3 >= 7 ? var1_1.method11657(-1193127267) : var1_1.method11637(1825991511);
                        this.field3650 = new int[this.field3647];
                        if (var6_3 >= 7) break block19;
                        var3_5 = 0;
                        var2_2 = -1;
                        var5_6 = 0;
                        while (true) {
                            var4_7 = var2_2;
                            if (var3_5 < this.field3647) {
                                var11_8 = this.field3650;
                                var11_8[var3_5] = var5_6 += var1_1.method11637(1649223599);
                                var4_7 = var2_2;
                                if (this.field3650[var3_5] > var2_2) {
                                    var4_7 = this.field3650[var3_5];
                                }
                                ++var3_5;
                                var2_2 = var4_7;
                                continue;
                            }
                            ** GOTO lbl39
                            break;
                        }
                    }
                    var3_5 = 0;
                    var2_2 = -1;
                    var5_6 = 0;
                    while (true) {
                        block21: {
                            block22: {
                                block20: {
                                    var4_7 = var2_2;
                                    if (var3_5 >= this.field3647) break block20;
                                    var11_8 = this.field3650;
                                    var11_8[var3_5] = var5_6 += var1_1.method11657(-403517461);
                                    var4_7 = var2_2;
                                    if (this.field3650[var3_5] <= var2_2) break block21;
                                    break block22;
                                }
                                var8_9 = var4_7 + 1;
                                this.groupCrcs = new int[var8_9];
                                this.field3651 = new int[var8_9];
                                this.field3652 = new int[var8_9];
                                this.fileIds = new int[var8_9][];
                                this.groups = new Object[var8_9];
                                this.files = new Object[var8_9][];
                                if (var7_4 != 0) {
                                    this.field3658 = new int[var8_9];
                                    for (var2_2 = 0; var2_2 < this.field3647; ++var2_2) {
                                        this.field3658[this.field3650[var2_2]] = var1_1.method11670(1604085085);
                                    }
                                    this.field3649 = new class247(this.field3658);
                                }
                                for (var2_2 = 0; var2_2 < this.field3647; ++var2_2) {
                                    this.groupCrcs[this.field3650[var2_2]] = var1_1.method11670(1604085085);
                                }
                                for (var2_2 = 0; var2_2 < this.field3647; ++var2_2) {
                                    this.field3651[this.field3650[var2_2]] = var1_1.method11670(1604085085);
                                }
                                for (var2_2 = 0; var2_2 < this.field3647; ++var2_2) {
                                    this.field3652[this.field3650[var2_2]] = var1_1.method11637(1887405181);
                                }
                                if (var6_3 >= 7) {
                                    break;
                                }
                                var2_2 = 0;
                                break block17;
                            }
                            var4_7 = this.field3650[var3_5];
                        }
                        ++var3_5;
                        var2_2 = var4_7;
                    }
                    block6: for (var2_2 = 0; var2_2 < this.field3647; ++var2_2) {
                        var9_10 = this.field3650[var2_2];
                        var10_11 = this.field3652[var9_10];
                        this.fileIds[var9_10] = new int[var10_11];
                        var3_5 = 0;
                        var4_7 = -1;
                        var5_6 = 0;
                        while (true) {
                            block24: {
                                block25: {
                                    block23: {
                                        if (var3_5 >= var10_11) break block23;
                                        var11_8 = this.fileIds[var9_10];
                                        var11_8[var3_5] = var5_6 += var1_1.method11657(49829365);
                                        var6_3 = var4_7;
                                        if (var5_6 <= var4_7) break block24;
                                        break block25;
                                    }
                                    this.files[var9_10] = new Object[var4_7 + 1];
                                    continue block6;
                                }
                                var6_3 = var5_6;
                            }
                            ++var3_5;
                            var4_7 = var6_3;
                        }
                    }
                    break block26;
                }
lbl97:
                // 2 sources

                while (true) {
                    if (var2_2 >= this.field3647) break;
                    break block18;
                    break;
                }
            }
            if (var7_4 == 0) return;
            this.field3646 = new int[var8_9][];
            this.field3648 = new class247[var8_9];
            var2_2 = 0;
            while (var2_2 < this.field3647) {
                var4_7 = this.field3650[var2_2];
                var5_6 = this.field3652[var4_7];
                this.field3646[var4_7] = new int[this.files[var4_7].length];
                for (var3_5 = 0; var3_5 < var5_6; ++var3_5) {
                    this.field3646[var4_7][this.fileIds[var4_7][var3_5]] = var1_1.method11670(1604085085);
                }
                this.field3648[var4_7] = new class247(this.field3646[var4_7]);
                ++var2_2;
            }
            return;
        }
        var9_10 = this.field3650[var2_2];
        var10_11 = this.field3652[var9_10];
        this.fileIds[var9_10] = new int[var10_11];
        var3_5 = 0;
        var4_7 = -1;
        var5_6 = 0;
        while (true) {
            block28: {
                block29: {
                    block27: {
                        if (var3_5 >= var10_11) break block27;
                        var11_8 = this.fileIds[var9_10];
                        var11_8[var3_5] = var5_6 += var1_1.method11637(-1589979841);
                        var6_3 = var4_7;
                        if (var5_6 <= var4_7) break block28;
                        break block29;
                    }
                    this.files[var9_10] = new Object[var4_7 + 1];
                    ++var2_2;
                    ** continue;
                }
                var6_3 = var5_6;
            }
            ++var3_5;
            var4_7 = var6_3;
        }
    }

    @ObfuscatedName(value="at")
    public int method6153(String string2, int n) {
        string2 = string2.toLowerCase();
        n = this.field3649.method7383(BZip2State.method6232(string2, (byte)-1), 993298028);
        return n;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;I)I", garbageValue="887960022")
    @Export(value="getFileId")
    public int getFileId(int n, String string2) {
        string2 = string2.toLowerCase();
        n = this.field3648[n].method7383(BZip2State.method6232(string2, (byte)-1), 1766151816);
        return n;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II[IB)[B", garbageValue="53")
    @Export(value="takeFileEncrypted")
    public byte[] takeFileEncrypted(int n, int n2, int[] arrobject) {
        block5: {
            block7: {
                block6: {
                    if (n < 0 || n >= this.files.length || this.files[n] == null || n2 < 0) {
                        return null;
                    }
                    if (n2 >= this.files[n].length) break block5;
                    if (this.files[n][n2] != null || this.method6159(n, (int[])arrobject, -1414934765)) break block6;
                    this.loadGroup(n);
                    if (!this.method6159(n, (int[])arrobject, -579260642)) break block7;
                }
                arrobject = WorldMapManager.method3643(this.files[n][n2], false);
                if (this.shallowFiles) {
                    this.files[n][n2] = null;
                }
                return arrobject;
            }
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="bi")
    public int method6167(String string2, byte by) {
        string2 = string2.toLowerCase();
        by = (byte)this.groupLoadPercent(this.field3649.method7383(BZip2State.method6232(string2, (byte)-1), 214029237));
        return by;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="-8948074")
    @Export(value="takeFileFlat")
    public byte[] takeFileFlat(int n) {
        if (this.files.length == 1) {
            return this.takeFile(0, n);
        }
        if (this.files[n].length == 1) {
            return this.takeFile(n, 0);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-950470382")
    static final boolean method6133() {
        boolean bl = class33.field528;
        return bl;
    }
}

