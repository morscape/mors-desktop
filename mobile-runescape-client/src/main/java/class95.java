/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gm")
public class class95 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lgm;")
    static final class95 field2734;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lgm;")
    static final class95 field2735;
    @ObfuscatedName(value="hh")
    @ObfuscatedGetter(intValue=1159828563)
    static int field2738;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1163702173)
    final int field2739;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1669297923)
    final int field2740;

    static {
        field2735 = new class95(51, 27, 800, 0, 16, 16);
        field2734 = new class95(25, 28, 800, 656, 40, 40);
    }

    class95(int n, int n2, int n3, int n4, int n5, int n6) {
        this.field2739 = n5;
        this.field2740 = n6;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="([BIILbe;[Lgg;I)V")
    static final void method4847(byte[] object, int n, int n2, Scene scene, CollisionMap[] arrcollisionMap, int n3) {
        Buffer buffer = new Buffer((byte[])object);
        n3 = -1;
        int n4;
        block0: while ((n4 = buffer.method11658(393033450)) != 0) {
            n4 = n3 + n4;
            n3 = 0;
            while (true) {
                int n5;
                if ((n5 = buffer.method11665(-1974552718)) == 0) {
                    n3 = n4;
                    continue block0;
                }
                n5 = n3 + (n5 - 1);
                int n6 = n5 >> 12;
                int n7 = buffer.method11650(-1536018015);
                int n8 = (n5 >> 6 & 0x3F) + n;
                int n9 = (n5 & 0x3F) + n2;
                n3 = n5;
                if (n8 <= 0) continue;
                n3 = n5;
                if (n9 <= 0) continue;
                n3 = n5;
                if (n8 >= 103) continue;
                n3 = n5;
                if (n9 >= 103) continue;
                n3 = (Tiles.field3455[1][n8][n9] & 2) != 2 ? n6 : n6 - 1;
                object = n3 >= 0 ? (Object)arrcollisionMap[n3] : null;
                class287.method10621(n6, n8, n9, n4, n7 & 3, n7 >> 2, scene, (CollisionMap)object, 104668729);
                n3 = n5;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[Ldl;", garbageValue="1754333613")
    static HorizontalAlignment[] method4848() {
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.field5923;
        HorizontalAlignment horizontalAlignment2 = HorizontalAlignment.HorizontalAlignment_centered;
        HorizontalAlignment horizontalAlignment3 = HorizontalAlignment.field5922;
        return new HorizontalAlignment[]{horizontalAlignment, horizontalAlignment2, horizontalAlignment3};
    }

    @ObfuscatedName(value="ag")
    static void method4850(int n) {
        n = 0;
        while (true) {
            block2: {
                block3: {
                    block1: {
                        if (n >= class82.field2626.length) break block1;
                        if (class82.field2626[n] == 0) break block2;
                        break block3;
                    }
                    return;
                }
                int[] arrn = class82.field2626;
                arrn[n] = arrn[n] | 0xFF000000;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    public static int method4851(int n, int n2, int n3) {
        n3 = 0;
        while (n2 > 0) {
            n3 = n3 << 1 | n & 1;
            n >>>= 1;
            --n2;
        }
        return n3;
    }

    @ObfuscatedName(value="du")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1812968720")
    static final void method4852() {
        GraphicsObject graphicsObject = (GraphicsObject)Client.field4877.last();
        while (graphicsObject != null) {
            if (WorldMapIcon_1.field5913 * 63889799 == graphicsObject.field7511 && !graphicsObject.isFinished) {
                if (Client.cycle >= graphicsObject.field7509) {
                    graphicsObject.advance(Client.field4804 * 375836608);
                    if (graphicsObject.isFinished) {
                        graphicsObject.remove();
                    } else {
                        class64.field2460.drawEntity(graphicsObject.field7511, graphicsObject.field7516, graphicsObject.field7510, graphicsObject.field7515, 60, graphicsObject, 0, -1L, false);
                    }
                }
            } else {
                graphicsObject.remove();
            }
            graphicsObject = (GraphicsObject)Client.field4877.previous();
        }
        return;
    }
}

