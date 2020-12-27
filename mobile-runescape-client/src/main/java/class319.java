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

@ObfuscatedName(value="iy")
public final class class319
extends Node {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfe;")
    static NodeDeque field6240 = new NodeDeque();
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lhm;")
    RawPcmStream field6243;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1378836745)
    int field6245;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1387573827)
    int field6246;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-319368215)
    int field6247;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1875853709)
    int field6249;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-692965449)
    int field6250;
    @ObfuscatedName(value="am")
    int field6251;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lhm;")
    RawPcmStream field6252;
    @ObfuscatedName(value="aq")
    int[] field6253;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1885803461)
    int field6254;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lde;")
    ObjectDefinition field6256;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1128455835)
    int field6248;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1648512673)
    int field6255;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-446488699)
    int field6244;

    class319() {
    }

    @ObfuscatedName(value="ai")
    void method11386(int n) {
        n = this.field6250 * -1035936249;
        ObjectDefinition objectDefinition = this.field6256.method12888(1935393768);
        if (objectDefinition == null) {
            this.field6250 = -1;
            this.field6249 = 0;
            this.field6244 = 0;
            this.field6246 = 0;
            this.field6253 = null;
        } else {
            this.field6250 = objectDefinition.field6915;
            this.field6249 = objectDefinition.field6904 * 128;
            this.field6244 = objectDefinition.field6913;
            this.field6246 = objectDefinition.field6906;
            this.field6253 = objectDefinition.field6911;
        }
        if (n * -692965449 != this.field6250 && this.field6243 != null) {
            WorldMapElement.field6923.removeSubStream(this.field6243);
            this.field6243 = null;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Lee;", garbageValue="1773493939")
    public static FloorOverlayDefinition method11372(int n) {
        if (n >= 0 && n < FloorOverlayDefinition.field7099.length) {
            return FloorOverlayDefinition.field7099[n];
        }
        FloorOverlayDefinition floorOverlayDefinition = FloorOverlayDefinition.field7100;
        return floorOverlayDefinition;
    }

    @ObfuscatedName(value="ar")
    static final int method11377(int n, int n2, byte by) {
        int n3 = n - 1;
        int n4 = n2 - 1;
        by = (byte)class286.method10491(n3, n4);
        int n5 = n + 1;
        int n6 = class286.method10491(n5, n4);
        int n7 = n2 + 1;
        int n8 = class286.method10491(n3, n7);
        int n9 = class286.method10491(n5, n7);
        n3 = class286.method10491(n3, n2);
        n5 = class286.method10491(n5, n2);
        n4 = class286.method10491(n, n4);
        n7 = class286.method10491(n, n7);
        n = class286.method10491(n, n2) / 4;
        n2 = (n3 + n5 + n4 + n7) / 8;
        by = (byte)((n6 + n8 + n9 + by) / 16);
        return n + by + n2;
    }

    @ObfuscatedName(value="ec")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-1")
    static final void method11383(int n, int n2) {
        NodeDeque nodeDeque = Client.field4864[WorldMapIcon_1.field5913 * 63889799][n][n2];
        if (nodeDeque != null) {
            long l = -99999999L;
            TileItem tileItem = (TileItem)nodeDeque.last();
            TileItem tileItem2 = null;
            while (true) {
                long l2;
                long l3;
                ItemDefinition itemDefinition;
                if (tileItem == null) {
                    if (tileItem2 != null) {
                        nodeDeque.addLast(tileItem2);
                        tileItem = (TileItem)nodeDeque.last();
                        ItemDefinition itemDefinition2 = itemDefinition = null;
                        while (true) {
                            if (tileItem == null) {
                                l3 = TextureProvider.calculateTag(n, n2, 3, false, 0);
                                class64.field2460.newGroundItemPile(WorldMapIcon_1.field5913 * 63889799, n, n2, DevicePcmPlayerProvider.method11095(n * 128 + 64, n2 * 128 + 64, WorldMapIcon_1.field5913 * 63889799, -1416385247), tileItem2, l3, (Entity)((Object)itemDefinition), (Entity)((Object)itemDefinition2));
                                return;
                            }
                            ItemDefinition itemDefinition3 = itemDefinition;
                            DualNode dualNode = itemDefinition2;
                            if (tileItem2.id != tileItem.id) {
                                DualNode dualNode2 = itemDefinition;
                                if (itemDefinition == null) {
                                    dualNode2 = tileItem;
                                }
                                itemDefinition3 = dualNode2;
                                dualNode = itemDefinition2;
                                if (tileItem.id != ((TileItem)dualNode2).id) {
                                    itemDefinition3 = dualNode2;
                                    dualNode = itemDefinition2;
                                    if (itemDefinition2 == null) {
                                        dualNode = tileItem;
                                        itemDefinition3 = dualNode2;
                                    }
                                }
                            }
                            tileItem = (TileItem)nodeDeque.previous();
                            itemDefinition = itemDefinition3;
                            itemDefinition2 = dualNode;
                        }
                    }
                    class64.field2460.removeWallDecoration(WorldMapIcon_1.field5913 * 63889799, n, n2);
                    return;
                }
                itemDefinition = class324.ItemDefinition_get(tileItem.id);
                l3 = l2 = (long)itemDefinition.price;
                if (itemDefinition.isStackable == 1) {
                    l3 = l2 * (long)(tileItem.field7614 + 1);
                }
                l2 = l;
                if (l3 > l) {
                    l2 = l3;
                    tileItem2 = tileItem;
                }
                tileItem = (TileItem)nodeDeque.previous();
                l = l2;
            }
        }
        class64.field2460.removeWallDecoration(WorldMapIcon_1.field5913 * 63889799, n, n2);
    }
}

