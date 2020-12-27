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

@ObfuscatedName(value="on")
@Implements(value="BufferedFile")
public class BufferedFile {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(longValue=-4279081067371674293L)
    @Export(value="offset")
    long offset;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Loe;")
    @Export(value="accessFile")
    AccessFile accessFile;
    @ObfuscatedName(value="af")
    @Export(value="length")
    long length;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-564999371)
    int field4058;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(longValue=72232622539353471L)
    long field4060 = -1L;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1606977593)
    int field4061 = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(longValue=7540196508297526685L)
    long field4062;
    @ObfuscatedName(value="as")
    @Export(value="writeBuffer")
    byte[] writeBuffer;
    @ObfuscatedName(value="ai")
    @Export(value="readBuffer")
    byte[] readBuffer;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(longValue=1208324497238159515L)
    long field4064 = -1L;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(longValue=-5394516332998369997L)
    @Export(value="fileLength")
    long fileLength;

    @ObfuscatedSignature(descriptor="(Loe;II)V")
    public BufferedFile(AccessFile accessFile, int n, int n2) throws IOException {
        this.accessFile = accessFile;
        long l = accessFile.length() * -2033262215029561861L;
        this.fileLength = l * -5394516332998369997L;
        this.length = l * 7181775491611318487L;
        this.readBuffer = new byte[n];
        this.writeBuffer = new byte[n2];
        this.offset = 0L;
    }

    @ObfuscatedName(value="ae")
    @Export(value="seek")
    public void seek(long l) throws IOException {
        if (l < 0L) {
            throw new IOException("");
        }
        this.offset = l;
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="ah")
    public void method7053(byte[] var1_1, int var2_3, int var3_4, int var4_5) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 3[TRYBLOCK]
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="aj")
    public void method7055(byte[] arrby, int n, int n2, int n3) throws IOException {
        try {
            long l;
            long l2 = this.offset * 4705390309275409507L;
            long l3 = n2;
            if (l2 * -4279081067371674293L + l3 > this.length * 7779252913718675205L) {
                this.length = (this.offset + l3) * -91635193014194739L;
            }
            if (-1L != this.field4060 && (this.offset < this.field4060 || this.offset > this.field4060 + (long)this.field4061)) {
                this.method7057(-161868596);
            }
            n3 = n;
            int n4 = n2;
            if (-1L != this.field4060) {
                n3 = n;
                n4 = n2;
                if (l3 + this.offset > (long)this.writeBuffer.length + this.field4060) {
                    n4 = (int)((long)this.writeBuffer.length - (this.offset - this.field4060));
                    System.arraycopy(arrby, n, this.writeBuffer, (int)(this.offset - this.field4060), n4);
                    this.offset += (long)n4;
                    n3 = n4 + n;
                    n4 = n2 - n4;
                    this.field4061 = this.writeBuffer.length;
                    this.method7057(1477656677);
                }
            }
            if (n4 > this.writeBuffer.length) {
                if (this.offset != this.field4062) {
                    this.accessFile.seek(this.offset);
                    this.field4062 = this.offset;
                }
                this.accessFile.write(arrby, n3, n4);
                l2 = this.field4062;
                l = n4;
                this.field4062 = l2 + l;
                if (this.field4062 > this.fileLength) {
                    this.fileLength = this.field4062;
                }
                l2 = this.offset >= this.field4064 && this.offset < this.field4064 + (long)this.field4058 ? this.offset : (this.field4064 >= this.offset && this.field4064 < this.offset + l ? this.field4064 : -1L);
                l3 = this.offset + l > this.field4064 && this.offset + l <= this.field4064 + (long)this.field4058 ? l + this.offset : (this.field4064 + (long)this.field4058 > this.offset && (long)this.field4058 + this.field4064 <= this.offset + l ? this.field4064 + (long)this.field4058 : -1L);
            }
            if (n4 <= 0) {
                return;
            }
            if (-1L == this.field4060) {
                this.field4060 = this.offset;
            }
            System.arraycopy(arrby, n3, this.writeBuffer, (int)(this.offset - this.field4060), n4);
            this.offset += (long)n4;
            if (this.offset - this.field4060 > (long)this.field4061) {
                this.field4061 = (int)(this.offset - this.field4060);
            }
            return;
            if (l2 > -1L && l3 > l2) {
                n = (int)(l3 - l2);
                System.arraycopy(arrby, (int)((long)n3 + l2 - this.offset), this.readBuffer, (int)(l2 - this.field4064), n);
            }
            this.offset += l;
            return;
        }
        catch (IOException iOException) {
            this.field4062 = -1L;
            throw iOException;
        }
    }

    @ObfuscatedName(value="al")
    void method7057(int n) throws IOException {
        if (-1L != this.field4060) {
            if (this.field4060 != this.field4062) {
                this.accessFile.seek(this.field4060);
                this.field4062 = this.field4060;
            }
            this.accessFile.write(this.writeBuffer, 0, this.field4061);
            this.field4062 += (long)(this.field4061 * 1810831863) * -1606977593L;
            if (this.field4062 > this.fileLength) {
                this.fileLength = this.field4062;
            }
            long l = this.field4060 >= this.field4064 && this.field4060 < this.field4064 + (long)this.field4058 ? this.field4060 : (this.field4064 >= this.field4060 && this.field4064 < (long)this.field4061 + this.field4060 ? this.field4064 : -1L);
            long l2 = (long)this.field4061 + this.field4060 > this.field4064 && this.field4060 + (long)this.field4061 <= (long)this.field4058 + this.field4064 ? this.field4060 + (long)this.field4061 : (this.field4064 + (long)this.field4058 > this.field4060 && this.field4064 + (long)this.field4058 <= (long)this.field4061 + this.field4060 ? (long)this.field4058 + this.field4064 : -1L);
            if (l > -1L && l2 > l) {
                n = (int)(l2 - l);
                System.arraycopy(this.writeBuffer, (int)(l - this.field4060), this.readBuffer, (int)(l - this.field4064), n);
            }
            this.field4060 = -1L;
            this.field4061 = 0;
        }
    }

    @ObfuscatedName(value="as")
    void method7064(int n) throws IOException {
        this.field4058 = 0;
        if (this.offset != this.field4062) {
            this.accessFile.seek(this.offset);
            this.field4062 = this.offset;
        }
        this.field4064 = this.offset;
        while (this.field4058 < this.readBuffer.length) {
            int n2 = this.readBuffer.length - this.field4058;
            n = n2;
            if (n2 > 200000000) {
                n = 200000000;
            }
            if ((n = this.accessFile.read(this.readBuffer, this.field4058, n)) == -1) {
                return;
            }
            this.field4062 += (long)n;
            this.field4058 += n;
        }
        return;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="2098297482")
    @Export(value="length")
    public long length() {
        long l = this.length;
        return l * 7779252913718675205L;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-892703558")
    @Export(value="load")
    public void load() throws IOException {
        this.method7057(301453116);
        this.accessFile.close();
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="800153280")
    @Export(value="readFully")
    public void readFully(byte[] arrby) throws IOException {
        this.method7053(arrby, 0, arrby.length, -355779089);
    }
}

