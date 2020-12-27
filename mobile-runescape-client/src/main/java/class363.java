/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  ab
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ab")
public class class363
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1978102281)
    public final int field6579;
    @ObfuscatedName(value="ai")
    public final int[] field6580;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=649058347)
    public final int field6581;
    @ObfuscatedName(value="ax")
    public final int[] field6582;

    class363(int n, int n2, int[] arrn, int[] arrn2, int n3) {
        this.field6581 = n;
        this.field6579 = n2;
        this.field6580 = arrn;
        this.field6582 = arrn2;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(FFIIB)S", garbageValue="106")
    static final short method12195(float f, float f2, int n, int n2) {
        return (short)((n >> 1) + (int)((f + 1.0f) * 64.0f) | (n2 >> 1) + (int)((f2 + 1.0f) * 64.0f) << 8);
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lkc;IB)[Lek;", garbageValue="4")
    public static class384[] method12196(AbstractArchive arrclass384, int n) {
        if (Bounds.method7123((AbstractArchive)arrclass384, n)) {
            arrclass384 = TileItem.method14481(-1975597637);
            return arrclass384;
        }
        return null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IIIIIZI)Lek;")
    public static final class384 method12197(int n, int n2, int n3, int n4, int n5, boolean bl, int n6) {
        class384 class3842;
        Object object;
        if (n2 == -1) {
            n5 = 0;
        } else if (n5 == 2 && n2 != 1) {
            n5 = 1;
        }
        long l = ((long)n4 << 42) + (((long)n3 << 38) + ((long)n + ((long)n2 << 16)) + ((long)n5 << 40));
        if (!bl && (object = (class384)ItemDefinition.ItemDefinition_cachedSprites.get(l)) != null) {
            return object;
        }
        Object object2 = object = class324.ItemDefinition_get(n);
        boolean bl2 = true;
        while (true) {
            int n7;
            block32: {
                block33: {
                    Model model;
                    block30: {
                        block31: {
                            if (!bl2 || (bl2 = false)) continue;
                            if (n2 <= 1) break block30;
                            object2 = object;
                            if (((ItemDefinition)object).field7009 == null) break block30;
                            n = 0;
                            n6 = -1;
                            if (n >= 10) break block31;
                            n7 = n6;
                            if (n2 < ((ItemDefinition)object).field7014[n]) break block32;
                            break block33;
                        }
                        object2 = object;
                        if (n6 != -1) {
                            object2 = class324.ItemDefinition_get(n6);
                        }
                    }
                    if ((model = ((ItemDefinition)object2).method13081(1, 2130903521)) == null) {
                        return null;
                    }
                    if (((ItemDefinition)object2).noteTemplate != -1) {
                        object = class363.method12197(((ItemDefinition)object2).note, 10, 1, 0, 0, true, 717212264);
                        if (object == null) {
                            return null;
                        }
                    } else if (((ItemDefinition)object2).notedId != -1) {
                        class384 class3843 = class363.method12197(((ItemDefinition)object2).unnotedId, n2, n3, n4, 0, false, 409044427);
                        object = class3843;
                        if (class3843 == null) {
                            return null;
                        }
                    } else {
                        object = object2;
                        if (((ItemDefinition)object).placeholderTemplate != -1) {
                            class384 class3844 = class363.method12197(((ItemDefinition)object).placeholder, n2, 0, 0, 0, false, -347775069);
                            object = class3844;
                            if (class3844 == null) {
                                return null;
                            }
                        } else {
                            object = null;
                        }
                    }
                    ItemDefinition itemDefinition = object2;
                    class3842 = new class384(36, 32);
                    ItemDefinition.field6986.method11028(class3842.field7129, 36, 32);
                    object2 = (class292)ItemDefinition.field6986.vmethod11005();
                    class265 class2652 = (class265)ItemDefinition.field6986.vmethod11000();
                    class47 class472 = ItemDefinition.field6986.vmethod11003().vmethod7589();
                    class2652.method654();
                    class2652.method660(16, 16, 233281062);
                    class2652.method658(false);
                    if (itemDefinition.placeholderTemplate != -1) {
                        ((class292)object2).vmethod10761((class384)object, 0, 0, 1593087439);
                    }
                    n6 = itemDefinition.zoom2d;
                    if (bl) {
                        n = (int)((double)n6 * 1.5);
                    } else {
                        n = n6;
                        if (n3 == 2) {
                            n = (int)((double)n6 * 1.04);
                        }
                    }
                    n6 = Rasterizer3D.Rasterizer3D_sine[itemDefinition.xan2d];
                    n7 = Rasterizer3D.Rasterizer3D_cosine[itemDefinition.xan2d];
                    model.calculateBoundsCylinder();
                    class472.vmethod7687(model, 0, itemDefinition.yan2d, itemDefinition.zan2d, itemDefinition.xan2d, itemDefinition.offsetX2d, model.height / 2 + (n * n6 >> 16) + itemDefinition.offsetY2d, (n * n7 >> 16) + itemDefinition.offsetY2d, (byte)0);
                    if (itemDefinition.notedId != -1) {
                        ((class292)object2).vmethod10761((class384)object, 0, 0, -356872767);
                    }
                    if (n3 >= 1) {
                        class3842.method13296(1);
                    }
                    if (n3 >= 2) {
                        class3842.method13296(0xFFFFFF);
                    }
                    if (n4 != 0) {
                        class3842.method13298(n4);
                    }
                    ItemDefinition.field6986.method11028(class3842.field7129, 36, 32);
                    if (itemDefinition.noteTemplate != -1) {
                        ((class292)object2).vmethod10761((class384)object, 0, 0, -1937311038);
                    }
                    n3 = 0;
                    if (n5 != 1) {
                        n = n3;
                        if (n5 != 2) break;
                        n = n3;
                        if (itemDefinition.isStackable != 1) break;
                    }
                    class381.ItemDefinition_fontPlain11.method13830(UrlRequester.inventoryQuantityFormat(n2), 0, 9, 0xFFFF00, 1, (class72)object2);
                    n = n3;
                    break;
                }
                n7 = n6;
                if (((ItemDefinition)object).field7014[n] != 0) {
                    n7 = ((ItemDefinition)object).field7009[n];
                }
            }
            ++n;
            n6 = n7;
        }
        while (n < class3842.field7129.length) {
            if (class3842.field7129[n] != 0) {
                object = class3842.field7129;
                object[n] = object[n] | 0xFF000000;
            }
            ++n;
        }
        if (bl) return class3842;
        ItemDefinition.ItemDefinition_cachedSprites.put(class3842, l);
        return class3842;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="1322484312")
    @Export(value="currentTimeMillis")
    public static final long currentTimeMillis() {
        synchronized (ab.class) {
            long l = System.currentTimeMillis();
            if (l < class239.field4198) {
                class239.field4197 += (class239.field4198 - l) * 8347363559486216959L;
            }
            class239.field4198 = l;
            long l2 = class239.field4197;
            return l2 * -5671051763253271297L + l;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Loo;")
    static PacketBufferNode method12194(byte by) {
        if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount * -1 == 0) {
            return new PacketBufferNode();
        }
        Object object = PacketBufferNode.PacketBufferNode_packetBufferNodes;
        by = (byte)(PacketBufferNode.PacketBufferNode_packetBufferNodeCount * 1299225801 + 1299225801);
        PacketBufferNode.PacketBufferNode_packetBufferNodeCount = by * -2078655111;
        object = object[by * 2078655111];
        return object;
    }

    @ObfuscatedName(value="bf")
    @Export(value="Rasterizer3D_brighten")
    static final int Rasterizer3D_brighten(int n, double d) {
        double d2 = (double)(n >> 16 & 0xFF) / 256.0;
        double d3 = (double)(n >> 8 & 0xFF) / 256.0;
        double d4 = (double)(n & 0xFF) / 256.0;
        d2 = Math.pow(d2, d);
        d3 = Math.pow(d3, d);
        d = Math.pow(d4, d);
        return n & 0xFF000000 | (int)(d * 256.0) + ((int)(d3 * 256.0) << 8) + ((int)(d2 * 256.0) << 16);
    }
}

