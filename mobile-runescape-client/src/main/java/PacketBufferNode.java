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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oo")
@Implements(value="PacketBufferNode")
public class PacketBufferNode
extends Node {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Loo;")
    @Export(value="PacketBufferNode_packetBufferNodes")
    static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-2078655111)
    @Export(value="PacketBufferNode_packetBufferNodeCount")
    static int PacketBufferNode_packetBufferNodeCount = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1746037827)
    int field6432;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lmj;")
    @Export(value="packetBuffer")
    public PacketBuffer packetBuffer;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lou;")
    ClientPacket field6434;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=551116819)
    @Export(value="index")
    public int index;

    static {
        PacketBufferNode_packetBufferNodeCount = 0;
    }

    PacketBufferNode() {
    }

    @ObfuscatedName(value="ax")
    public void method12125(int n) {
        if (PacketBufferNode_packetBufferNodeCount * -1 < PacketBufferNode_packetBufferNodes.length) {
            PacketBufferNode[] arrpacketBufferNode = PacketBufferNode_packetBufferNodes;
            n = PacketBufferNode_packetBufferNodeCount * 1299225801 - 1299225801;
            PacketBufferNode_packetBufferNodeCount = n * -2078655111;
            arrpacketBufferNode[n * 2078655111 - 1] = this;
            return;
        }
    }
}

