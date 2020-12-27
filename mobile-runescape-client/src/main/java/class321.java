/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jv")
public class class321
extends class84 {
    @ObfuscatedName(value="ae")
    int field6261 = 0;

    class321() {
    }

    @ObfuscatedName(value="aa")
    void method11401(int n, int n2, int n3, long l) {
        if (this.method11409(n, -1629214577)) {
            this.field2638.vmethod11252(n, 0, n2, n3, l);
            this.field6261 = (1 << n & this.field6261 * -1006319501) * -958980933;
        }
    }

    @ObfuscatedName(value="af")
    void method11405(int n, int n2, int n3, long l) {
        if (this.method11409(n, -1971455795)) {
            this.field2638.vmethod11256(n, n2, n3, l);
        }
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lms;IIIII)V")
    void method11407(class346 object, int n, int n2, int n3, int n4, int n5) {
        object = ak.method3355();
        n5 = 0;
        while (n5 < ((Object)object).length) {
            Object object2 = object[n5];
            Object object3 = object[n5 + 1];
            if (object3 >= 0 && object3 < 5) {
                reference var10_10 = object[n5 + 2];
                Object object4 = object[n5 + 3];
                long l = class363.currentTimeMillis();
                var10_10 = var10_10 * n / n3;
                object4 = n2 * object4 / n4;
                switch (object2) {
                    default: {
                        break;
                    }
                    case 3: {
                        this.method11413((int)var10_10, (int)object4, l);
                        break;
                    }
                    case 2: {
                        this.method11405((int)object3, (int)var10_10, (int)object4, l);
                        break;
                    }
                    case 1: {
                        this.method11401((int)object3, (int)var10_10, (int)object4, l);
                        break;
                    }
                    case 0: {
                        this.method11402((int)object3, (int)var10_10, (int)object4, l);
                    }
                }
            }
            n5 += 4;
        }
        return;
    }

    @ObfuscatedName(value="al")
    void method11408(int n) {
        long l = this.method4726();
        n = 0;
        while (n < 5) {
            this.method11401(n, -1, -1, l);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="am")
    boolean method11409(int n, int n2) {
        n2 = this.field6261;
        return (1 << n & n2 * -1006319501) != 0;
    }

    @ObfuscatedName(value="aq")
    void method11413(int n, int n2, long l) {
        this.field2638.vmethod11263(n, n2, l);
    }

    @ObfuscatedName(value="ab")
    void method11402(int n, int n2, int n3, long l) {
        if (!this.method11409(n, -1450117708)) {
            this.field2638.vmethod11251(n, 0, n2, n3, l);
            this.field6261 = (1 << n | this.field6261 * -1006319501) * -958980933;
        }
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="-1041027844")
    static final int method11398(int n, int n2, int n3, int n4) {
        return n * n3 + n4 * n2 >> 16;
    }

    @ObfuscatedName(value="ea")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="65")
    static final void method11399() {
        class317 class3172 = (class317)Client.field4869.last();
        while (class3172 != null) {
            if (class3172.field6195 == -1) {
                class3172.field6189 = 0;
                Tile.method7732(class3172, 1492638103);
            } else {
                class3172.remove();
            }
            class3172 = (class317)Client.field4869.previous();
        }
        return;
    }

    @ObfuscatedName(value="il")
    @ObfuscatedSignature(descriptor="(IIIZI)V", garbageValue="190190168")
    public static void method11400(int n, int n2, int n3, boolean bl) {
        PacketBufferNode packetBufferNode = class327.newRunException(ClientPacket.field6534, Client.field4781.field3495);
        packetBufferNode.packetBuffer.method11638(n2, (byte)7);
        packetBufferNode.packetBuffer.method11675(n3, -1911404284);
        packetBufferNode.packetBuffer.method11683(n, -2114990945);
        PacketBuffer packetBuffer = packetBufferNode.packetBuffer;
        n = Client.field4829;
        packetBuffer.method11692(n, (byte)77);
        Client.field4781.setSocket(packetBufferNode);
    }
}

