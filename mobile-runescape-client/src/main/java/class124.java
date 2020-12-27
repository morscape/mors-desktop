/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import java.util.Calendar;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="im")
public class class124 {
    @ObfuscatedName(value="aa")
    static int[] field3411;
    @ObfuscatedName(value="af")
    static String[] field3413;
    @ObfuscatedName(value="aj")
    static int[] field3416;
    @ObfuscatedName(value="al")
    static int[][] field3418;
    @ObfuscatedName(value="am")
    static int field3419 = 0;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="[Ljf;")
    static class135[] field3420;
    @ObfuscatedName(value="ap")
    static final String[] field3421;
    @ObfuscatedName(value="ar")
    static Calendar field3422;
    @ObfuscatedName(value="au")
    static final double field3425;
    @ObfuscatedName(value="az")
    static boolean field3427 = false;
    @ObfuscatedName(value="at")
    static boolean field3424 = false;
    @ObfuscatedName(value="av")
    static int field3426 = 0;
    @ObfuscatedName(value="eh")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field3428;

    static {
        field3416 = new int[5];
        field3418 = (int[][])Array.newInstance(Integer.TYPE, 5, 5000);
        field3411 = new int[1000];
        field3413 = new String[1000];
        field3419 = 0;
        field3420 = new class135[50];
        field3422 = Calendar.getInstance();
        field3421 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field3427 = false;
        field3424 = false;
        field3426 = 0;
        field3425 = Math.log(2.0);
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([BIIII[Lgg;B)V")
    static final void method5423(byte[] var0, int var1_1, int var2_2, int var3_3, int var4_4, CollisionMap[] var5_5, byte var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 5[UNCONDITIONALDOLOOP]
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

