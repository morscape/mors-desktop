/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.URL;
import java.security.SecureRandom;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bx")
public class class33 {
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-547712759)
    static int field525 = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2007565213)
    static int field527 = 0;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1433591995)
    static int field531 = 0;
    @ObfuscatedName(value="ar")
    static long[] field533 = new long[1000];
    @ObfuscatedName(value="as")
    static boolean field534 = false;
    @ObfuscatedName(value="aw")
    static int field536 = 0;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1367698699)
    static int field538 = 0;
    @ObfuscatedName(value="ai")
    static boolean field528 = false;
    @ObfuscatedName(value="ak")
    static boolean field530 = true;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-110073535)
    static int field537 = 0;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=478895747)
    static int field523 = 0;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Ljava/security/SecureRandom;", garbageValue="0")
    static SecureRandom method885() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextInt();
        return secureRandom;
    }

    @ObfuscatedName(value="ak")
    static boolean method886(int n) {
        block8: {
            block7: {
                if (class121.field3378 != null) break block7;
                class121.field3378 = class90.field2701.request(new URL(class17.field314));
                return false;
            }
            if (!class121.field3378.isDone()) break block8;
            Buffer buffer = new Buffer(class121.field3378.getResponse());
            buffer.method11670(1604085085);
            class121.field3385 = buffer.method11637(472438693);
            class121.field3380 = new class121[class121.field3385];
            n = 0;
            while (true) {
                class121 class1212;
                if (n >= class121.field3385) break;
                class121[] arrclass121 = class121.field3380;
                arrclass121[n] = class1212 = new class121();
                class1212.field3388 = buffer.method11637(-1132704624);
                class1212.field3391 = buffer.method11670(1604085085);
                class1212.field3390 = buffer.method11664(-2064726157);
                class1212.field3394 = buffer.method11664(-1925925186);
                class1212.field3393 = buffer.method11650(-1415198867);
                class1212.field3389 = buffer.method11635(1277637855);
                class1212.field3392 = n++;
                continue;
                break;
            }
            try {
                Tile.sortWorlds(class121.field3380, 0, class121.field3380.length - 1, class121.field3377, class121.field3384);
                class121.field3378 = null;
                return true;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                class121.field3378 = null;
            }
        }
        return false;
    }

    @ObfuscatedName(value="em")
    static final void method943(int n, int n2, int n3, int n4, int n5, int n6, int n7, byte by) {
        n6 = class37.method1077(n6, n7, (byte)127);
        n7 = 2048 - n4 & 0x7FF;
        int n8 = 2048 - n5 & 0x7FF;
        int n9 = 0;
        if (n7 == 0) {
            n7 = 0;
        } else {
            by = (byte)Rasterizer3D.Rasterizer3D_sine[n7];
            int n10 = Rasterizer3D.Rasterizer3D_cosine[n7];
            n7 = 0 - n6 * by >> 16;
            n6 = n6 * n10 + 0 >> 16;
        }
        by = (byte)n6;
        if (n8 != 0) {
            n9 = Rasterizer3D.Rasterizer3D_sine[n8];
            n8 = Rasterizer3D.Rasterizer3D_cosine[n8];
            by = (byte)(n6 * n8 - 0 >> 16);
            n9 = n6 * n9 + 0 >> 16;
        }
        class203.field3944 = n - n9;
        class260.field4459 = n2 - n7;
        class95.field2738 = n3 - by;
        PcmPlayer.field3256 = n4;
        class291.field5991 = n5;
        if (Client.field4807 == 1 && Client.field4899 >= 2 && Client.cycle % 50 == 0 && (ObjectDefinition.field6874 >> 7 != WorldMapScaleHandler.localPlayer.x >> 7 || ParamDefinition.field7082 >> 7 != WorldMapScaleHandler.localPlayer.field7523 * -144332757 >> 7)) {
            n = WorldMapScaleHandler.localPlayer.field7848;
            class321.method11400((ObjectDefinition.field6874 >> 7) + class302.field6082, (ParamDefinition.field7082 >> 7) + class237.field4107, n * 116092815, true);
        }
    }
}

