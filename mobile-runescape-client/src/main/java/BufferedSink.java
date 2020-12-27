/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="nc")
@Implements(value="BufferedSink")
public class BufferedSink
implements Runnable {
    @ObfuscatedName(value="ae")
    @Export(value="outputStream")
    OutputStream outputStream;
    @ObfuscatedName(value="ah")
    @Export(value="position")
    int position = 0;
    @ObfuscatedName(value="aj")
    @Export(value="exception")
    IOException exception;
    @ObfuscatedName(value="al")
    @Export(value="closed")
    boolean closed;
    @ObfuscatedName(value="as")
    @Export(value="limit")
    int limit = 0;
    @ObfuscatedName(value="ai")
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ak")
    @Export(value="thread")
    Thread thread;
    @ObfuscatedName(value="ax")
    @Export(value="buffer")
    byte[] buffer;

    BufferedSink(OutputStream outputStream, int n) {
        this.outputStream = outputStream;
        this.capacity = n + 1;
        this.buffer = new byte[this.capacity];
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    @ObfuscatedName(value="ae")
    @Export(value="isClosed")
    boolean isClosed() {
        if (this.closed) {
            block4: {
                try {
                    this.outputStream.close();
                    if (this.exception == null) {
                        this.exception = new IOException("");
                    }
                }
                catch (IOException iOException) {
                    if (this.exception != null) break block4;
                    this.exception = new IOException(iOException);
                }
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ah")
    @Export(value="close")
    void close() {
        synchronized (this) {
            this.closed = true;
            this.notifyAll();
        }
        try {
            this.thread.join();
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ai")
    int method6782() {
        synchronized (this) {
            while (true) {
                block14: {
                    int n;
                    IOException iOException;
                    if ((iOException = this.exception) != null) {
                        return -1;
                    }
                    if (this.position <= this.limit) {
                        n = this.limit - this.position;
                    } else {
                        n = this.capacity;
                        int n2 = this.position;
                        int n3 = this.limit;
                        n = n3 + (n - n2);
                    }
                    if (n > 0) {
                        return n;
                    }
                    try {
                        this.outputStream.flush();
                        boolean bl = this.isClosed();
                        if (!bl) break block14;
                    }
                    catch (IOException iOException2) {
                        this.exception = iOException2;
                        return -1;
                    }
                    return -1;
                }
                try {}
                catch (InterruptedException interruptedException) {
                }
                this.wait();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    @Export(value="write")
    void write(byte[] arrby, int n, int n2) throws IOException {
        if (n2 >= 0 && n >= 0 && n2 + n <= arrby.length) {
            synchronized (this) {
                if (this.exception != null) {
                    throw new IOException(this.exception.toString());
                }
                int n3 = this.position <= this.limit ? this.capacity - this.limit + this.position - 1 : this.position - this.limit - 1;
                if (n3 < n2) {
                    throw new IOException("");
                }
                if (n2 + this.limit <= this.capacity) {
                    System.arraycopy(arrby, n, this.buffer, this.limit, n2);
                } else {
                    n3 = this.capacity - this.limit;
                    System.arraycopy(arrby, n, this.buffer, this.limit, n3);
                    System.arraycopy(arrby, n3 + n, this.buffer, 0, n2 - n3);
                }
                this.limit = (n2 + this.limit) % this.capacity;
                this.notifyAll();
                return;
            }
        }
        throw new IOException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        do {
            int n;
            if ((n = this.method6782()) == -1) {
                return;
            }
            try {
                if (n + this.position <= this.capacity) {
                    this.outputStream.write(this.buffer, this.position, n);
                } else {
                    int n2 = this.capacity - this.position;
                    this.outputStream.write(this.buffer, this.position, n2);
                    this.outputStream.write(this.buffer, 0, n - n2);
                }
            }
            catch (IOException iOException) {
                synchronized (this) {
                    this.exception = iOException;
                    return;
                }
            }
            synchronized (this) {
                this.position = (n + this.position) % this.capacity;
            }
        } while (!this.isClosed());
    }
}

