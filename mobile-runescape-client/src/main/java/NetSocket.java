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
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mn")
@Implements(value="NetSocket")
public final class NetSocket
extends AbstractSocket
implements Runnable {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=226500025)
    @Export(value="outOffset")
    int outOffset = 0;
    @ObfuscatedName(value="ae")
    @Export(value="outputStream")
    OutputStream outputStream;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-970436483)
    @Export(value="bufferLength")
    final int bufferLength;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmr;")
    @Export(value="taskHandler")
    TaskHandler taskHandler;
    @ObfuscatedName(value="aj")
    @Export(value="outBuffer")
    byte[] outBuffer;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=82931947)
    @Export(value="outLength")
    int outLength = 0;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-1853185769)
    @Export(value="maxPacketLength")
    final int maxPacketLength;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lmt;")
    @Export(value="task")
    Task task;
    @ObfuscatedName(value="ai")
    @Export(value="socket")
    Socket socket;
    @ObfuscatedName(value="ak")
    @Export(value="inputStream")
    InputStream inputStream;
    @ObfuscatedName(value="ax")
    @Export(value="isClosed")
    boolean isClosed = false;
    @ObfuscatedName(value="ab")
    boolean field6386 = false;

    @ObfuscatedSignature(descriptor="(Ljava/net/Socket;Lmr;I)V")
    public NetSocket(Socket socket, TaskHandler taskHandler, int n) throws IOException {
        this.taskHandler = taskHandler;
        this.socket = socket;
        this.bufferLength = n;
        this.maxPacketLength = n - 100;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.socket.setReceiveBufferSize(65536);
        this.socket.setSendBufferSize(65536);
        this.inputStream = this.socket.getInputStream();
        this.outputStream = this.socket.getOutputStream();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="ae")
    @Export(value="close")
    public void close() {
        if (this.isClosed) {
            return;
        }
        // MONITORENTER : this
        this.isClosed = true;
        this.notifyAll();
        // MONITOREXIT : this
        if (this.task != null) {
            while (this.task.status == 0) {
                class52.sleepExact(1L);
            }
            int n = this.task.status;
            if (n == 1) {
                try {
                    ((Thread)this.task.result).join();
                }
                catch (InterruptedException interruptedException) {}
            }
        }
        this.task = null;
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="aj")
    void method11873(byte[] var1_1, int var2_3, int var3_4, byte var4_5) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[WHILELOOP]], but top level block is 0[TRYBLOCK]
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

    @Override
    @ObfuscatedName(value="al")
    @Export(value="write")
    public void write(byte[] arrby, int n, int n2) throws IOException {
        this.method11873(arrby, n, n2, (byte)1);
    }

    @Override
    @ObfuscatedName(value="as")
    @Export(value="read")
    public int read(byte[] arrby, int n, int n2) throws IOException {
        if (!this.isClosed) {
            int n3 = n2;
            while (true) {
                if (n3 <= 0) {
                    return n2;
                }
                int n4 = this.inputStream.read(arrby, n, n3);
                if (n4 <= 0) break;
                n = n4 + n;
                n3 -= n4;
            }
            throw new EOFException();
        }
        return 0;
    }

    @Override
    @ObfuscatedName(value="ai")
    public int vmethod12077() throws IOException {
        if (!this.isClosed) {
            int n = this.inputStream.read();
            return n;
        }
        return 0;
    }

    @Override
    @ObfuscatedName(value="ax")
    public int vmethod12093() throws IOException {
        if (!this.isClosed) {
            int n = this.inputStream.available();
            return n;
        }
        return 0;
    }

    protected void finalize() {
        this.close();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        while (true) {
            block23: {
                block22: {
                    if (this.outLength != this.outOffset) break block22;
                    if (!this.isClosed) ** GOTO lbl15
                    // MONITOREXIT : this
                    if (this.inputStream != null) {
                        this.inputStream.close();
                    }
                    if (this.outputStream != null) {
                        this.outputStream.close();
                    }
                    if (this.socket != null) {
                        this.socket.close();
                    }
                    break block21;
lbl15:
                    // 2 sources

                    this.wait();
                    break block22;
                    catch (InterruptedException var3_8) {}
                    {
                        block21: {
                            catch (IOException var3_7) {}
                        }
                        this.outBuffer = null;
                        return;
                    }
                }
                var2_2 = this.outLength * 492681155;
                var1_1 = this.outOffset >= this.outLength ? this.outOffset - this.outLength : this.bufferLength - this.outLength;
                // MONITOREXIT : this
                if (var1_1 <= 0) continue;
                try {
                    this.outputStream.write(this.outBuffer, var2_2 * 82931947, var1_1);
                    break block23;
                }
                catch (Exception var3_6) {
                    class56.RunException_sendStackTrace(null, var3_6);
                    return;
                }
                catch (IOException var3_4) {}
                this.field6386 = true;
            }
            this.outLength = (var1_1 + this.outLength) % this.bufferLength;
            try {
                if (this.outOffset != this.outLength) continue;
                this.outputStream.flush();
                continue;
            }
            catch (IOException var3_5) {}
            this.field6386 = true;
        }
    }
}

