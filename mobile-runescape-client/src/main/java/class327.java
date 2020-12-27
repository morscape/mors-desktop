/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ke")
public class class327
extends class64 {
    @ObfuscatedName(value="ae")
    final boolean field6286;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lep;Lep;I)I")
    int method11468(class289 class2892, class289 class2893, int n) {
        if (Client.field4741 == class2892.field5972 && class2893.field5972 == Client.field4741) {
            if (this.field6286) {
                return class2892.method3910().method3888(class2893.method3910(), (byte)17);
            }
            return class2893.method3910().method3888(class2892.method3910(), (byte)-14);
        }
        n = this.method4020(class2892, class2893, -1473396260);
        return n;
    }

    public int compare(Object object, Object object2) {
        int n = this.method11468((class289)object, (class289)object2, 815013506);
        return n;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lou;Lmk;I)Loo;", garbageValue="2049873333")
    @Export(value="newRunException")
    public static PacketBufferNode newRunException(ClientPacket clientPacket, class189 class1892) {
        PacketBufferNode packetBufferNode = class363.method12194((byte)-98);
        packetBufferNode.field6434 = clientPacket;
        packetBufferNode.field6432 = clientPacket.length;
        packetBufferNode.packetBuffer = packetBufferNode.field6432 == -1 ? new PacketBuffer(260) : (packetBufferNode.field6432 == -2 ? new PacketBuffer(10000) : (packetBufferNode.field6432 <= 18 ? new PacketBuffer(20) : (packetBufferNode.field6432 <= 98 ? new PacketBuffer(100) : new PacketBuffer(260))));
        packetBufferNode.packetBuffer.setIsaacCipher(class1892);
        packetBufferNode.packetBuffer.method13790(packetBufferNode.field6434.id, -531860745);
        packetBufferNode.index = 0;
        return packetBufferNode;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(CI)B", garbageValue="1919054205")
    @Export(value="charToByteCp1252")
    public static byte charToByteCp1252(char c) {
        if (!(c > '\u0000' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')) {
            if (c == '\u20ac') {
                return -128;
            }
            if (c == '\u201a') {
                return -126;
            }
            if (c == '\u0192') {
                return -125;
            }
            if (c == '\u201e') {
                return -124;
            }
            if (c == '\u2026') {
                return -123;
            }
            if (c == '\u2020') {
                return -122;
            }
            if (c == '\u2021') {
                return -121;
            }
            if (c == '\u02c6') {
                return -120;
            }
            if (c == '\u2030') {
                return -119;
            }
            if (c == '\u0160') {
                return -118;
            }
            if (c == '\u2039') {
                return -117;
            }
            if (c == '\u0152') {
                return -116;
            }
            if (c == '\u017d') {
                return -114;
            }
            if (c == '\u2018') {
                return -111;
            }
            if (c == '\u2019') {
                return -110;
            }
            if (c == '\u201c') {
                return -109;
            }
            if (c == '\u201d') {
                return -108;
            }
            if (c == '\u2022') {
                return -107;
            }
            if (c == '\u2013') {
                return -106;
            }
            if (c == '\u2014') {
                return -105;
            }
            if (c == '\u02dc') {
                return -104;
            }
            if (c == '\u2122') {
                return -103;
            }
            if (c == '\u0161') {
                return -102;
            }
            if (c == '\u203a') {
                return -101;
            }
            if (c == '\u0153') {
                return -100;
            }
            if (c == '\u017e') {
                return -98;
            }
            if (c == '\u0178') {
                return -97;
            }
            return 63;
        }
        return (byte)c;
    }
}

