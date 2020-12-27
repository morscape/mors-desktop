/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="nx")
@Implements(value="BufferedSource")
public class BufferedSource
implements Runnable {
    @ObfuscatedName(value="ae")
    @Export(value="inputStream")
    InputStream inputStream;
    @ObfuscatedName(value="ah")
    @Export(value="position")
    int position = 0;
    @ObfuscatedName(value="aj")
    @Export(value="exception")
    IOException exception;
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

    BufferedSource(InputStream inputStream, int n) {
        this.inputStream = inputStream;
        this.capacity = n + 1;
        this.buffer = new byte[this.capacity];
        this.thread = new Thread(this);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    @ObfuscatedName(value="ae")
    int method6946() {
        synchronized (this) {
            while (true) {
                block12: {
                    int n;
                    block11: {
                        IOException iOException = this.exception;
                        if (iOException == null) break block11;
                        return -1;
                    }
                    if (this.position == 0) {
                        n = this.capacity - this.limit - 1;
                    } else if (this.position <= this.limit) {
                        n = this.capacity - this.limit;
                    } else {
                        n = this.position;
                        int n2 = this.limit;
                        n = n - n2 - 1;
                    }
                    if (n <= 0) break block12;
                    return n;
                }
                try {
                    this.wait();
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    continue;
                }
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ah")
    @Export(value="readUnsignedByte")
    int readUnsignedByte() throws IOException {
        synchronized (this) {
            if (this.position != this.limit) {
                byte by = this.buffer[this.position];
                this.position = (this.position + 1) % this.capacity;
                this.notifyAll();
                return by & 0xFF;
            }
            if (this.exception == null) {
                return -1;
            }
            throw new IOException(this.exception.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="aj")
    @Export(value="close")
    void close() {
        synchronized (this) {
            if (this.exception == null) {
                this.exception = new IOException("");
            }
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
    @ObfuscatedName(value="as")
    @Export(value="read")
    int read(byte[] arrby, int n, int n2) throws IOException {
        int n3;
        if (n2 >= 0 && n >= 0 && n2 + n <= arrby.length) {
            synchronized (this) {
                n3 = this.position <= this.limit ? this.limit - this.position : this.capacity - this.position + this.limit;
            }
        } else {
            throw new IOException();
        }
        {
            int n4 = n2;
            if (n2 > n3) {
                n4 = n3;
            }
            if (n4 == 0 && this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            if (n4 + this.position <= this.capacity) {
                System.arraycopy(this.buffer, this.position, arrby, n, n4);
            } else {
                n2 = this.capacity - this.position;
                System.arraycopy(this.buffer, this.position, arrby, n, n2);
                System.arraycopy(this.buffer, 0, arrby, n2 + n, n4 - n2);
            }
            this.position = (n4 + this.position) % this.capacity;
            this.notifyAll();
            return n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    @Export(value="available")
    int available() throws IOException {
        synchronized (this) {
            int n = this.position <= this.limit ? this.limit - this.position : this.capacity - this.position + this.limit;
            if (n <= 0 && this.exception != null) {
                throw new IOException(this.exception.toString());
            }
            this.notifyAll();
            return n;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        while (true) {
            int n;
            if ((n = this.method6946()) == -1) {
                return;
            }
            try {
                n = this.inputStream.read(this.buffer, this.limit, n);
                if (n == -1) break;
            }
            catch (IOException iOException) {
                synchronized (this) {
                    this.exception = iOException;
                    return;
                }
            }
            synchronized (this) {
                this.limit = (n + this.limit) % this.capacity;
            }
        }
        {
            throw new EOFException();
        }
    }
}

