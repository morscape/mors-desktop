/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="el")
public class class287
extends class63
implements class31 {
    @ObfuscatedName(value="gv")
    @ObfuscatedSignature(descriptor="[Lek;")
    static class384[] field5955;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lac;")
    Varcs field5956;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lby;")
    final class34 field5957 = class304.method11055();

    public class287(int n, int n2) {
        this.method10646(n, n2);
    }

    @Override
    @ObfuscatedName(value="ae")
    public final int vmethod10628(int n) {
        n = this.field2458 * -1425347507;
        return n * -259117947;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIIIS)V", garbageValue="12690")
    final void method10638(int n, int n2, int n3, int n4) {
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1301086741")
    final void method10639(int n, int n2) {
        this.method10641(this.field5957.method952(this.field5956));
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lac;I)V", garbageValue="-1101811888")
    final void method10641(Varcs varcs) {
        this.field5956 = varcs;
        this.field5956.setInt(this.field2458, this.field2456);
        this.field2457 = this.field5956.method17();
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIS)V", garbageValue="5862")
    final void method10646(int n, int n2) {
        this.field2458 = n;
        this.field2456 = n2;
        if (this.field5956 == null) {
            this.field5956 = this.field5957.method951();
        }
        this.method10641(this.field5956);
    }

    @Override
    @ObfuscatedName(value="ai")
    public final int vmethod10632(int n) {
        n = this.field2456 * 1377488995;
        return n * -1521077941;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lac;", garbageValue="1551719414")
    public final Varcs vmethod10634() {
        Varcs varcs = this.field5956;
        return varcs;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IIIIIILbe;Lgg;I)V")
    static final void method10621(int n, int n2, int n3, int n4, int n5, int n6, Scene object, CollisionMap object2, int n7) {
        if (!Client.isLowDetail || (Tiles.field3455[0][n2][n3] & 2) != 0 || (Tiles.field3455[n][n2][n3] & 0x10) == 0) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            if (n < Tiles.field3459) {
                Tiles.field3459 = n;
            }
            DualNode dualNode = AbstractWorldMapIcon.getObjectDefinition(n4);
            if (n5 != 1 && n5 != 3) {
                n12 = dualNode.field6886;
                n7 = dualNode.field6884;
            } else {
                n12 = dualNode.field6884;
                n7 = dualNode.field6886;
            }
            if (n12 + n2 <= 104) {
                n11 = (n12 >> 1) + n2;
                n10 = (n12 + 1 >> 1) + n2;
            } else {
                n10 = n2 + 1;
                n11 = n2;
            }
            if (n7 + n3 <= 104) {
                n9 = n3 + (n7 >> 1);
                n8 = (n7 + 1 >> 1) + n3;
            } else {
                n8 = n3 + 1;
                n9 = n3;
            }
            Object object3 = Tiles.Tiles_heights[n];
            n9 = object3[n10][n8] + object3[n10][n9] + object3[n11][n9] + object3[n11][n8] >> 2;
            n8 = (n2 << 7) + (n12 << 6);
            int n13 = (n3 << 7) + (n7 << 6);
            boolean bl = dualNode.field6887 == 0;
            long l = TextureProvider.calculateTag(n2, n3, 2, bl, n4);
            n11 = n10 = n6 + (n5 << 6);
            if (dualNode.field6894 == 1) {
                n11 = n10 + 256;
            }
            if (dualNode.method12893(1918259223)) {
                FloorOverlayDefinition.method13265(n, n2, n3, dualNode, n5, -1648268114);
            }
            if (n6 != 22) {
                if (n6 != 10 && n6 != 11) {
                    if (n6 < 12) {
                        if (n6 != 0) {
                            if (n6 != 1) {
                                Object object4;
                                if (n6 != 2) {
                                    if (n6 != 3) {
                                        if (n6 != 9) {
                                            if (n6 != 4) {
                                                if (n6 != 5) {
                                                    if (n6 != 6) {
                                                        if (n6 != 7) {
                                                            if (n6 != 8) {
                                                                return;
                                                            }
                                                            long l2 = ((Scene)object).method736(n, n2, n3);
                                                            n6 = l2 == 0L ? 8 : AbstractWorldMapIcon.getObjectDefinition((int)class290.method10698((long)l2)).field6888 / 2;
                                                            n7 = n5 + 2 & 3;
                                                            if (dualNode.field6877 == -1 && dualNode.transforms == null) {
                                                                object2 = dualNode.getModel(4, n5 + 4, (int[][])object3, n8, n9, n13);
                                                                dualNode = dualNode.getModel(4, n7 + 4, (int[][])object3, n8, n9, n13);
                                                            } else {
                                                                object2 = new DynamicObject(n4, 4, n5 + 4, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                                                dualNode = new DynamicObject(n4, 4, n7 + 4, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                                            }
                                                            ((Scene)object).newWallDecoration(n, n2, n3, n9, (Entity)object2, (Entity)dualNode, 256, n5, n6 * Tiles.field3454[n5], n6 * Tiles.field3457[n5], l, n11);
                                                            return;
                                                        }
                                                        n5 = n5 + 2 & 3;
                                                        object2 = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(4, n5 + 4, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 4, n5 + 4, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                                        ((Scene)object).newWallDecoration(n, n2, n3, n9, (Entity)object2, null, 256, n5, 0, 0, l, n11);
                                                        return;
                                                    }
                                                    long l3 = ((Scene)object).method736(n, n2, n3);
                                                    n6 = 0L == l3 ? 8 : AbstractWorldMapIcon.getObjectDefinition((int)class290.method10698((long)l3)).field6888 / 2;
                                                    object2 = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(4, n5 + 4, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 4, n5 + 4, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                                    ((Scene)object).newWallDecoration(n, n2, n3, n9, (Entity)object2, null, 256, n5, n6 * Tiles.field3454[n5], n6 * Tiles.field3457[n5], l, n11);
                                                    return;
                                                }
                                                long l4 = ((Scene)object).method736(n, n2, n3);
                                                n6 = l4 == 0L ? 16 : AbstractWorldMapIcon.getObjectDefinition((int)class290.method10698((long)l4)).field6888;
                                                object2 = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(4, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 4, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                                ((Scene)object).newWallDecoration(n, n2, n3, n9, (Entity)object2, null, Tiles.field3462[n5], 0, n6 * Tiles.field3465[n5], n6 * Tiles.field3467[n5], l, n11);
                                                return;
                                            }
                                            object2 = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(4, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 4, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                            ((Scene)object).newWallDecoration(n, n2, n3, n9, (Entity)object2, null, Tiles.field3462[n5], 0, 0, 0, l, n11);
                                            return;
                                        }
                                        Entity entity = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(n6, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, n6, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                        ((Scene)object).method705(n, n2, n3, n9, 1, 1, entity, 0, l, n11);
                                        if (dualNode.field6883 != 0 && object2 != null) {
                                            ((CollisionMap)object2).method4779(n2, n3, n12, n7, dualNode.field6892, 1788652514);
                                        }
                                        if (dualNode.field6888 == 16) {
                                            return;
                                        }
                                        ((Scene)object).method717(n, n2, n3, dualNode.field6888);
                                        return;
                                    }
                                    Entity entity = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(3, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 3, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                    ((Scene)object).newBoundaryObject(n, n2, n3, n9, entity, null, Tiles.field3469[n5], 0, l, n11);
                                    if (dualNode.field6909) {
                                        if (n5 != 0) {
                                            if (n5 != 1) {
                                                if (n5 != 2) {
                                                    if (n5 == 3) {
                                                        AccessFile.field4029[n][n2][n3] = 50;
                                                    }
                                                } else {
                                                    AccessFile.field4029[n][n2 + 1][n3] = 50;
                                                }
                                            } else {
                                                AccessFile.field4029[n][n2 + 1][n3 + 1] = 50;
                                            }
                                        } else {
                                            AccessFile.field4029[n][n2][n3 + 1] = 50;
                                        }
                                    }
                                    if (dualNode.field6883 == 0 || object2 == null) {
                                        return;
                                    }
                                    ((CollisionMap)object2).method4775(n2, n3, n6, n5, dualNode.field6892);
                                    return;
                                }
                                n7 = n5 + 1 & 3;
                                if (dualNode.field6877 == -1 && dualNode.transforms == null) {
                                    object4 = dualNode.getModel(2, n5 + 4, (int[][])object3, n8, n9, n13);
                                    object3 = dualNode.getModel(2, n7, (int[][])object3, n8, n9, n13);
                                } else {
                                    object4 = new DynamicObject(n4, 2, n5 + 4, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                    object3 = new DynamicObject(n4, 2, n7, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                                }
                                ((Scene)object).newBoundaryObject(n, n2, n3, n9, (Entity)object4, (Entity)object3, Tiles.field3462[n5], Tiles.field3462[n7], l, n11);
                                if (dualNode.field6880) {
                                    if (n5 != 0) {
                                        n4 = n3;
                                        if (n5 != 1) {
                                            if (n5 != 2) {
                                                if (n5 == 3) {
                                                    object4 = class251.field4323[n][n2];
                                                    object4[n4] = object4[n4] | 0x492;
                                                    object4 = class251.field4323[n][n2];
                                                    object4[n4] = object4[n4] | 0x249;
                                                }
                                            } else {
                                                object4 = class251.field4323[n][n2 + 1];
                                                object4[n4] = object4[n4] | 0x249;
                                                object4 = class251.field4323[n][n2];
                                                object4[n4] = object4[n4] | 0x492;
                                            }
                                        } else {
                                            object4 = class251.field4323[n][n2];
                                            n7 = n4 + 1;
                                            object4[n7] = object4[n7] | 0x492;
                                            object4 = class251.field4323[n][n2 + 1];
                                            object4[n4] = object4[n4] | 0x249;
                                        }
                                    } else {
                                        object4 = class251.field4323[n][n2];
                                        n4 = n3;
                                        object4[n4] = object4[n4] | 0x249;
                                        object4 = class251.field4323[n][n2];
                                        object4[++n4] = object4[n4] | 0x492;
                                    }
                                }
                                if (dualNode.field6883 != 0 && object2 != null) {
                                    ((CollisionMap)object2).method4775(n2, n3, n6, n5, dualNode.field6892);
                                }
                                if (dualNode.field6888 == 16) {
                                    return;
                                }
                                ((Scene)object).method717(n, n2, n3, dualNode.field6888);
                                return;
                            }
                            Entity entity = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(1, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 1, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                            ((Scene)object).newBoundaryObject(n, n2, n3, n9, entity, null, Tiles.field3469[n5], 0, l, n11);
                            if (dualNode.field6909) {
                                if (n5 != 0) {
                                    if (n5 != 1) {
                                        if (n5 != 2) {
                                            if (n5 == 3) {
                                                AccessFile.field4029[n][n2][n3] = 50;
                                            }
                                        } else {
                                            AccessFile.field4029[n][n2 + 1][n3] = 50;
                                        }
                                    } else {
                                        AccessFile.field4029[n][n2 + 1][n3 + 1] = 50;
                                    }
                                } else {
                                    AccessFile.field4029[n][n2][n3 + 1] = 50;
                                }
                            }
                            if (dualNode.field6883 == 0 || object2 == null) {
                                return;
                            }
                            ((CollisionMap)object2).method4775(n2, n3, n6, n5, dualNode.field6892);
                            return;
                        }
                        Object object5 = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(0, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 0, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                        ((Scene)object).newBoundaryObject(n, n2, n3, n9, (Entity)object5, null, Tiles.field3462[n5], 0, l, n11);
                        if (n5 != 0) {
                            n4 = n3;
                            if (n5 != 1) {
                                if (n5 != 2) {
                                    if (n5 == 3) {
                                        if (dualNode.field6909) {
                                            AccessFile.field4029[n][n2][n4] = 50;
                                            AccessFile.field4029[n][n2 + 1][n4] = 50;
                                        }
                                        if (dualNode.field6880) {
                                            object5 = class251.field4323[n][n2];
                                            object5[n4] = object5[n4] | 0x492;
                                        }
                                    }
                                } else {
                                    if (dualNode.field6909) {
                                        object5 = AccessFile.field4029[n];
                                        n7 = n2 + 1;
                                        object5[n7][n4] = 50;
                                        AccessFile.field4029[n][n7][n4 + 1] = 50;
                                    }
                                    if (dualNode.field6880) {
                                        object5 = class251.field4323[n][n2 + 1];
                                        object5[n4] = object5[n4] | 0x249;
                                    }
                                }
                            } else {
                                if (dualNode.field6909) {
                                    object5 = AccessFile.field4029[n][n2];
                                    n7 = n4 + 1;
                                    object5[n7] = 50;
                                    AccessFile.field4029[n][n2 + 1][n7] = 50;
                                }
                                if (dualNode.field6880) {
                                    object5 = class251.field4323[n][n2];
                                    object5[++n4] = object5[n4] | 0x492;
                                }
                            }
                        } else {
                            if (dualNode.field6909) {
                                object5 = AccessFile.field4029[n][n2];
                                n4 = n3;
                                object5[n4] = 50;
                                AccessFile.field4029[n][n2][n4 + 1] = 50;
                            }
                            n4 = n3;
                            if (dualNode.field6880) {
                                object5 = class251.field4323[n][n2];
                                object5[n4] = object5[n4] | 0x249;
                            }
                        }
                        if (dualNode.field6883 != 0 && object2 != null) {
                            ((CollisionMap)object2).method4775(n2, n3, n6, n5, dualNode.field6892);
                        }
                        if (dualNode.field6888 == 16) {
                            return;
                        }
                        ((Scene)object).method717(n, n2, n3, dualNode.field6888);
                        return;
                    }
                    Entity entity = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(n6, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, n6, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                    ((Scene)object).method705(n, n2, n3, n9, 1, 1, entity, 0, l, n11);
                    if (n6 >= 12 && n6 <= 17 && n6 != 13 && n > 0) {
                        object = class251.field4323[n][n2];
                        object[n3] = object[n3] | 0x924;
                    }
                    if (dualNode.field6883 == 0 || object2 == null) {
                        return;
                    }
                    ((CollisionMap)object2).method4779(n2, n3, n12, n7, dualNode.field6892, 1788652514);
                    return;
                }
                Entity entity = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(10, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 10, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                if (entity != null) {
                    n4 = n6 == 11 ? 256 : 0;
                    if (!((Scene)object).method705(n, n2, n3, n9, n12, n7, entity, n4, l, n11) || !dualNode.field6909) {
                        n = n7;
                    } else {
                        n4 = 15;
                        if (entity instanceof Model) {
                            n4 = n5 = ((Model)entity).method14363() / 4;
                            if (n5 > 30) {
                                n4 = 30;
                            }
                        }
                        block0: for (n5 = 0; n5 <= n12; ++n5) {
                            n6 = 0;
                            while (true) {
                                if (n6 > n7) {
                                    continue block0;
                                }
                                object = AccessFile.field4029[n];
                                n11 = n5 + n2;
                                object = object[n11];
                                n10 = n6 + n3;
                                if (n4 > object[n10]) {
                                    AccessFile.field4029[n][n11][n10] = (byte)n4;
                                }
                                ++n6;
                            }
                        }
                        n = n7;
                    }
                } else {
                    n = n7;
                }
                if (dualNode.field6883 != 0 && object2 != null) {
                    ((CollisionMap)object2).method4779(n2, n3, n12, n, dualNode.field6892, 1788652514);
                }
                return;
            }
            if (!Client.isLowDetail || dualNode.field6887 != 0 || dualNode.field6883 == 1 || dualNode.field6897) {
                Entity entity = dualNode.field6877 == -1 && dualNode.transforms == null ? dualNode.getModel(22, n5, (int[][])object3, n8, n9, n13) : new DynamicObject(n4, 22, n5, n, n2, n3, dualNode.field6877, dualNode.field6917, null);
                ((Scene)object).newFloorDecoration(n, n2, n3, n9, entity, l, n11);
                if (dualNode.field6883 != 1 || object2 == null) {
                    return;
                }
                ((CollisionMap)object2).method4778(n2, n3, -2087565394);
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(Lkc;IIB)Z", garbageValue="-11")
    static boolean method10622(AbstractArchive object, int n, int n2) {
        if ((object = (Object)((AbstractArchive)object).takeFile(n, n2)) == null) {
            return false;
        }
        class45.method3636((byte[])object, -605570599);
        return true;
    }

    @ObfuscatedName(value="fl")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIB)V", garbageValue="83")
    static void method10623(String string2, int n, int n2, int n3) {
        Client.field4791.method13834(string2, n, n2, 0xFFFF00, -1, Client.field4740.field3567.vmethod11005());
    }
}

