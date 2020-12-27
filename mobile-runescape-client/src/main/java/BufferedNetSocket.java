/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nl")
@Implements(value="BufferedNetSocket")
public class BufferedNetSocket
extends AbstractSocket {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnx;")
    @Export(value="source")
    BufferedSource source;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lnc;")
    @Export(value="sink")
    BufferedSink sink;
    @ObfuscatedName(value="ak")
    @Export(value="socket")
    Socket socket;

    BufferedNetSocket(Socket socket, int n, int n2) throws IOException {
        this.socket = socket;
        this.socket.setSoTimeout(30000);
        this.socket.setTcpNoDelay(true);
        this.socket.setReceiveBufferSize(65536);
        this.socket.setSendBufferSize(65536);
        this.source = new BufferedSource(this.socket.getInputStream(), n);
        this.sink = new BufferedSink(this.socket.getOutputStream(), n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @ObfuscatedName(value="ae")
    @Export(value="close")
    public void close() {
        this.sink.close();
        try {
            this.socket.close();
        }
        catch (IOException iOException) {}
        this.source.close();
    }

    @Override
    @ObfuscatedName(value="al")
    @Export(value="write")
    public void write(byte[] arrby, int n, int n2) throws IOException {
        this.sink.write(arrby, n, n2);
    }

    @Override
    @ObfuscatedName(value="as")
    @Export(value="read")
    public int read(byte[] arrby, int n, int n2) throws IOException {
        return this.source.read(arrby, n, n2);
    }

    @Override
    @ObfuscatedName(value="ai")
    public int vmethod12077() throws IOException {
        return this.source.readUnsignedByte();
    }

    @Override
    @ObfuscatedName(value="ax")
    public int vmethod12093() throws IOException {
        return this.source.available();
    }

    protected void finalize() {
        this.close();
    }
}

