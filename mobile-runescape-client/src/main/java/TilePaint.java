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
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bp")
@Implements(value="TilePaint")
public final class TilePaint {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-279493619)
    @Export(value="seColor")
    int seColor;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=418445531)
    @Export(value="texture")
    int texture;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-955256479)
    @Export(value="rgb")
    int rgb;
    @ObfuscatedName(value="as")
    @Export(value="isFlat")
    boolean isFlat = true;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=836469279)
    @Export(value="neColor")
    int neColor;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=2105427509)
    @Export(value="swColor")
    int swColor;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-562451135)
    @Export(value="nwColor")
    int nwColor;

    TilePaint(int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        this.swColor = n;
        this.seColor = n2;
        this.neColor = n3;
        this.nwColor = n4;
        this.texture = n5;
        this.rgb = n6;
        this.isFlat = bl;
    }

    @ObfuscatedName(value="ad")
    static final boolean method857(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        n8 = class33.field527 + n7;
        if (n8 < n && n8 < n2 && n8 < n3) {
            return false;
        }
        n8 = class33.field527 - n7;
        if (n8 > n && n8 > n2 && n8 > n3) {
            return false;
        }
        n = class33.field537 + n7;
        if (n < n4 && n < n5 && n < n6) {
            return false;
        }
        n = class33.field537 * 560015041;
        return (n = n * -110073535 - n7) <= n4 || n <= n5 || n <= n6;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)[Lob;", garbageValue="2019826363")
    static LoginPacket[] method860() {
        LoginPacket loginPacket = LoginPacket.field6420;
        LoginPacket loginPacket2 = LoginPacket.field6424;
        LoginPacket loginPacket3 = LoginPacket.field6425;
        LoginPacket loginPacket4 = LoginPacket.field6421;
        LoginPacket loginPacket5 = LoginPacket.field6418;
        LoginPacket loginPacket6 = LoginPacket.field6422;
        return new LoginPacket[]{loginPacket, loginPacket2, loginPacket3, loginPacket4, loginPacket5, loginPacket6};
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="443406248")
    public static void method856(Collection collection) {
        collection.add(class6.field53);
    }
}

