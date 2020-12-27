/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gu")
public class class100 {
    @ObfuscatedName(value="dk")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field2763;

    static {
        class95[] arrclass95 = class86.method4752();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            class95 class952;
            if (n < arrclass95.length) {
                class952 = arrclass95[n];
                n4 = n2;
                if (class952.field2739 > n2) {
                    n4 = class952.field2739;
                }
            } else {
                return;
            }
            int n5 = n3;
            if (class952.field2740 > n3) {
                n5 = class952.field2740;
            }
            ++n;
            n2 = n4;
            n3 = n5;
        }
    }

    @ObfuscatedName(value="ci")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1344777319")
    static void method4881() {
        PacketBufferNode packetBufferNode = class327.newRunException(ClientPacket.field6489, Client.field4781.field3495);
        packetBufferNode.packetBuffer.method11652(class294.getWindowedMode(), 422009005);
        packetBufferNode.packetBuffer.method11638(class50.field2368, (byte)-5);
        packetBufferNode.packetBuffer.method11638(class127.field3441, (byte)-112);
        Client.field4781.setSocket(packetBufferNode);
    }
}

