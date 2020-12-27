/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="hf")
@Implements(value="VorbisResidue")
public class VorbisResidue {
    @ObfuscatedName(value="ae")
    @Export(value="begin")
    int begin;
    @ObfuscatedName(value="ah")
    @Export(value="classifications")
    int classifications;
    @ObfuscatedName(value="aj")
    @Export(value="cascade")
    int[] cascade;
    @ObfuscatedName(value="as")
    @Export(value="classbook")
    int classbook;
    @ObfuscatedName(value="ai")
    @Export(value="end")
    int end;
    @ObfuscatedName(value="ak")
    @Export(value="residueType")
    int residueType = VorbisSample.readBits(16);
    @ObfuscatedName(value="ax")
    @Export(value="partitionSize")
    int partitionSize;

    VorbisResidue() {
        int n;
        int n2;
        this.begin = VorbisSample.readBits(24);
        this.end = VorbisSample.readBits(24);
        this.partitionSize = VorbisSample.readBits(24) + 1;
        this.classifications = VorbisSample.readBits(6) + 1;
        this.classbook = VorbisSample.readBits(8);
        int[] arrn = new int[this.classifications];
        int n3 = 0;
        for (n2 = 0; n2 < this.classifications; ++n2) {
            int n4 = VorbisSample.readBits(3);
            n = VorbisSample.readBit() != 0 ? 1 : 0;
            n = n != 0 ? VorbisSample.readBits(5) : 0;
            arrn[n2] = n << 3 | n4;
        }
        this.cascade = new int[this.classifications * 8];
        for (n2 = n3; n2 < this.classifications * 8; ++n2) {
            int[] arrn2 = this.cascade;
            n = (arrn[n2 >> 3] & 1 << (n2 & 7)) != 0 ? VorbisSample.readBits(8) : -1;
            arrn2[n2] = n;
        }
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="ak")
    void method5042(float[] var1_1, int var2_2, boolean var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[UNCONDITIONALDOLOOP]], but top level block is 4[UNCONDITIONALDOLOOP]
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
}

