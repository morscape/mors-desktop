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
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ny")
@Implements(value="ArchiveDisk")
public final class ArchiveDisk {
    @ObfuscatedName(value="ak")
    static byte[] field4020 = new byte[520];
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lon;")
    @Export(value="datFile")
    BufferedFile datFile = null;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2003787325)
    @Export(value="maxEntrySize")
    int maxEntrySize = 65000;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lon;")
    @Export(value="idxFile")
    BufferedFile idxFile = null;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1252491855)
    @Export(value="archive")
    int archive;

    @ObfuscatedSignature(descriptor="(ILon;Lon;I)V")
    public ArchiveDisk(int n, BufferedFile bufferedFile, BufferedFile bufferedFile2, int n2) {
        this.archive = n;
        this.datFile = bufferedFile;
        this.idxFile = bufferedFile2;
        this.maxEntrySize = n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I[BII)Z", garbageValue="-1635397440")
    @Export(value="write")
    public boolean write(int var1_1, byte[] var2_2, int var3_4) {
        var6_5 = this.datFile;
        // MONITORENTER : var6_5
        if (var3_4 < 0) ** GOTO lbl11
        if (var3_4 <= this.maxEntrySize) {
            var4_7 = var5_6 = this.method6969(var1_1, (byte[])var2_2, var3_4, true, 773107691);
            if (!var5_6) {
                var4_7 = this.method6969(var1_1, (byte[])var2_2, var3_4, false, 1902396832);
            }
            // MONITOREXIT : var6_5
            return var4_7;
        }
lbl11:
        // 3 sources

        var2_2 = new StringBuilder();
        var2_2.append("");
        var2_2.append(this.archive);
        var2_2.append(',');
        var2_2.append(var1_1);
        var2_2.append(',');
        var2_2.append(var3_4);
        throw new IllegalArgumentException(var2_2.toString());
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="ai")
    boolean method6969(int var1_1, byte[] var2_2, int var3_6, boolean var4_7, int var5_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 11[UNCONDITIONALDOLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    public byte[] method6971(int var1_1, byte var2_2) {
        var15_3 = this.datFile;
        synchronized (var15_3) {
            block37: {
                block33: {
                    block34: {
                        block31: {
                            block32: {
                                block38: {
                                    block35: {
                                        block36: {
                                            var13_4 = this.idxFile.length();
                                            var2_2 = var1_1 * 6;
                                            if (var13_4 < (long)(var2_2 + 6)) {
                                                return null;
                                            }
                                            this.idxFile.seek(var2_2);
                                            this.idxFile.method7053(ArchiveDisk.field4020, 0, 6, 1730261905);
                                            var11_5 = ((ArchiveDisk.field4020[0] & 255) << 16) + (ArchiveDisk.field4020[2] & 255) + ((ArchiveDisk.field4020[1] & 255) << 8);
                                            var2_2 = (ArchiveDisk.field4020[5] & 255) + ((ArchiveDisk.field4020[3] & 255) << 16) + ((ArchiveDisk.field4020[4] & 255) << 8);
                                            if (var11_5 < 0) break block31;
                                            if (var11_5 > this.maxEntrySize) break block31;
                                            if (var2_2 <= 0) break block32;
                                            if ((long)var2_2 > this.datFile.length() / 520L) break block32;
                                            var16_6 = new byte[var11_5];
                                            var5_9 = 0;
                                            var4_10 = 0;
lbl23:
                                            // 2 sources

                                            while (var5_9 < var11_5) {
                                                if (var2_2 == 0) {
                                                    return null;
                                                }
                                                this.datFile.seek((long)var2_2 * 520L);
                                                var2_2 = var11_5 - var5_9;
                                                if (var1_1 <= 65535) break block33;
                                                var3_11 = 510;
                                                if (var2_2 <= 510) break block34;
lbl33:
                                                // 2 sources

                                                while (true) {
                                                    this.datFile.method7053(ArchiveDisk.field4020, 0, var3_11 + 10, 1074198328);
                                                    var7_13 = ((ArchiveDisk.field4020[1] & 255) << 16) + ((ArchiveDisk.field4020[0] & 255) << 24) + (ArchiveDisk.field4020[3] & 255) + ((ArchiveDisk.field4020[2] & 255) << 8);
                                                    var9_15 = (ArchiveDisk.field4020[5] & 255) + ((ArchiveDisk.field4020[4] & 255) << 8);
                                                    var2_2 = ArchiveDisk.field4020[8];
                                                    var6_12 = ArchiveDisk.field4020[6];
                                                    var10_16 = ArchiveDisk.field4020[7];
                                                    var8_14 = ArchiveDisk.field4020[9] & 255;
                                                    var2_2 = ((var6_12 & 255) << 16) + ((var10_16 & 255) << 8) + (var2_2 & 255);
                                                    var10_16 = 10;
                                                    var6_12 = var3_11;
                                                    var3_11 = var10_16;
                                                    ** GOTO lbl64
                                                    break;
                                                }
                                            }
                                            break block38;
lbl48:
                                            // 2 sources

                                            while (true) {
                                                this.datFile.method7053(ArchiveDisk.field4020, 0, var2_2 + 8, 1851998911);
                                                var7_13 = (ArchiveDisk.field4020[1] & 255) + ((ArchiveDisk.field4020[0] & 255) << 8);
                                                var3_11 = ArchiveDisk.field4020[3];
                                                var9_15 = (var3_11 & 255) + ((ArchiveDisk.field4020[2] & 255) << 8);
                                                var8_14 = ArchiveDisk.field4020[6];
                                                var10_16 = ArchiveDisk.field4020[4];
                                                var12_17 = ArchiveDisk.field4020[5];
                                                var6_12 = ArchiveDisk.field4020[7];
                                                var3_11 = 8;
                                                var8_14 = (var8_14 & 255) + ((var10_16 & 255) << 16) + ((var12_17 & 255) << 8);
                                                var10_16 = var6_12 & 255;
                                                var6_12 = var2_2;
                                                var2_2 = var8_14;
                                                var8_14 = var10_16;
lbl64:
                                                // 2 sources

                                                if (var7_13 != var1_1 || var4_10 != var9_15) break block35;
                                                if (var8_14 != this.archive) break block35;
                                                if (var2_2 < 0) break block36;
                                                if ((long)var2_2 <= this.datFile.length() / 520L) break block37;
                                                break block36;
                                                break;
                                            }
lbl71:
                                            // 1 sources

                                            while (true) {
                                                if (var7_13 < var3_11 + var6_12) {
                                                    var16_6[var5_9] = ArchiveDisk.field4020[var7_13];
                                                    ++var7_13;
                                                    ++var5_9;
                                                    continue;
                                                }
                                                ++var4_10;
                                                ** GOTO lbl23
                                                break;
                                            }
                                        }
                                        return null;
                                    }
                                    return null;
                                }
                                return var16_6;
                            }
                            return null;
                        }
                        try {
                            return null;
                        }
lbl113:
                        // 19 sources

                        catch (Throwable var16_7) {
                            ** continue;
                        }
lbl95:
                        // 1 sources

                        while (true) {
                            return null;
                            break;
                        }
lbl98:
                        // 1 sources

                        while (true) {
                            ** try [egrp 18[TRYBLOCK] [30 : 679->682)] { 
lbl100:
                            // 1 sources

                            throw var16_7;
                        }
                        catch (IOException var16_8) {
                            ** continue;
                        }
                    }
                    var3_11 = var2_2;
                    ** continue;
                }
                if (var2_2 <= 512) ** GOTO lbl48
                var2_2 = 512;
                ** continue;
            }
            var7_13 = var3_11;
            ** continue;
        }
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("");
        charSequence.append(this.archive);
        charSequence = charSequence.toString();
        return charSequence;
    }
}

