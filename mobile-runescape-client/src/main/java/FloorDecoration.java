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
import com.jagex.jagex3.client.input.softkeyboard.ax;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bn")
@Implements(value="FloorDecoration")
public final class FloorDecoration {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=862873995)
    @Export(value="musicTrackVolume")
    static int musicTrackVolume = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-66493803)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(longValue=6697630951541377709L)
    @Export(value="tag")
    public long tag;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1618059749)
    @Export(value="flags")
    int flags;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=936378368)
    @Export(value="y")
    int y;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=2012773385)
    @Export(value="tileHeight")
    int tileHeight;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lbw;")
    @Export(value="entity")
    public Entity entity;

    FloorDecoration() {
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(B)Lcom/jagex/jagex3/client/input/softkeyboard/ax;", garbageValue="0")
    static ax method851() {
        ax ax2 = Client.field4740.method5708().vmethod12639(0);
        ax2.method3258(Login.Login_username, 0);
        ax2.method3258(Login.Login_password, 1);
        return ax2;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIIB)I", garbageValue="-5")
    public static int method852(int n, int n2, int n3) {
        if ((n3 &= 3) == 0) {
            return n;
        }
        if (n3 == 1) {
            return n2;
        }
        if (n3 == 2) {
            return 7 - n;
        }
        return 7 - n2;
    }

    @ObfuscatedName(value="do")
    static boolean method853(byte by) {
        by = (byte)Client.field4868;
        return (by * 1064934413 & 4) != 0;
    }
}

