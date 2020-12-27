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
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oe")
@Implements(value="AccessFile")
public final class AccessFile {
    @ObfuscatedName(value="al")
    static byte[][][] field4029;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(longValue=-5861869567202919833L)
    @Export(value="maxSize")
    final long maxSize;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(longValue=1799911431146103653L)
    @Export(value="offset")
    long offset;
    @ObfuscatedName(value="ak")
    @Export(value="file")
    RandomAccessFile file;

    public AccessFile(File file, String string2, long l) throws IOException {
        long l2 = l;
        if (l == -1L) {
            l2 = Long.MAX_VALUE;
        }
        if (file.length() > l2) {
            file.delete();
        }
        this.file = new RandomAccessFile(file, string2);
        this.maxSize = l2;
        this.offset = 0L;
        int n = this.file.read();
        if (n != -1 && !string2.equals("r")) {
            this.file.seek(0L);
            this.file.write(n);
        }
        this.file.seek(0L);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BIII)V", garbageValue="1853113407")
    @Export(value="write")
    public final void write(byte[] arrby, int n, int n2) throws IOException {
        long l = this.offset * -2947623712614345107L;
        long l2 = n2;
        if (l * 1799911431146103653L + l2 <= this.maxSize) {
            this.file.write(arrby, n, n2);
            this.offset += l2;
        } else {
            this.file.seek(this.maxSize);
            this.file.write(1);
            throw new EOFException();
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="57161255")
    @Export(value="length")
    public final long length() throws IOException {
        long l = this.file.length();
        return l;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="([BIII)I", garbageValue="-1240520259")
    @Export(value="read")
    public final int read(byte[] arrby, int n, int n2) throws IOException {
        if ((n = this.file.read(arrby, n, n2)) > 0) {
            this.offset += (long)n;
        }
        return n;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="741725518")
    @Export(value="close")
    public final void close() throws IOException {
        this.closeSync(false);
    }

    @ObfuscatedName(value="ak")
    @Export(value="seek")
    final void seek(long l) throws IOException {
        this.file.seek(l);
        this.offset = l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="364765237")
    @Export(value="closeSync")
    public final void closeSync(boolean bl) throws IOException {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            if (bl) {
                try {
                    this.file.getFD().sync();
                }
                catch (SyncFailedException syncFailedException) {}
            }
            this.file.close();
            this.file = null;
        }
    }

    protected void finalize() throws Throwable {
        if (this.file != null) {
            System.out.println("");
            this.close();
        }
    }
}

