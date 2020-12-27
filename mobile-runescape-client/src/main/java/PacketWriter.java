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

@ObfuscatedName(value="je")
@Implements(value="PacketWriter")
public class PacketWriter {
    @ObfuscatedName(value="aa")
    boolean field3491 = true;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfx;")
    @Export(value="packetBufferNodes")
    IterableNodeDeque packetBufferNodes = new IterableNodeDeque();
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=737319873)
    @Export(value="pendingWrites")
    int pendingWrites = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lmk;")
    public class189 field3495;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Loy;")
    ServerPacket field3497 = null;
    @ObfuscatedName(value="al")
    int field3499 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lmj;")
    @Export(value="packetBuffer")
    PacketBuffer packetBuffer;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=510527141)
    @Export(value="bufferSize")
    int bufferSize = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lnb;")
    @Export(value="socket")
    AbstractSocket socket;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lmi;")
    @Export(value="buffer")
    Buffer buffer = new Buffer(5000);
    @ObfuscatedName(value="ab")
    int field3492 = 0;

    PacketWriter() {
        this.packetBuffer = new PacketBuffer(40000);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1857781555")
    @Export(value="flush")
    final void flush() throws IOException {
        PacketBufferNode packetBufferNode;
        if (this.socket != null && this.bufferSize > 0) {
            this.buffer.offset = 0;
        } else {
            return;
        }
        while ((packetBufferNode = (PacketBufferNode)this.packetBufferNodes.last()) != null && packetBufferNode.index <= this.buffer.array.length - this.buffer.offset) {
            this.buffer.method11653(packetBufferNode.packetBuffer.array, 0, packetBufferNode.index, 1430174948);
            this.bufferSize -= packetBufferNode.index;
            packetBufferNode.remove();
            packetBufferNode.packetBuffer.releaseArray();
            packetBufferNode.method12125(1100434989);
        }
        this.socket.write(this.buffer.array, 0, this.buffer.offset);
        this.pendingWrites = 0;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="9")
    @Export(value="close")
    void close() {
        if (this.socket != null) {
            this.socket.close();
            this.socket = null;
        }
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)Lnb;", garbageValue="-1121665234")
    @Export(value="getSocket")
    AbstractSocket getSocket() {
        AbstractSocket abstractSocket = this.socket;
        return abstractSocket;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Loo;I)V", garbageValue="1849975044")
    @Export(value="setSocket")
    public final void setSocket(PacketBufferNode packetBufferNode) {
        this.packetBufferNodes.addFirst(packetBufferNode);
        packetBufferNode.index = packetBufferNode.packetBuffer.offset;
        packetBufferNode.packetBuffer.offset = 0;
        this.bufferSize += packetBufferNode.index;
    }
}

