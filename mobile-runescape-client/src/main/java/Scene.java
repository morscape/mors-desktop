/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  ag
 *  bz
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="be")
@Implements(value="Scene")
public class Scene {
    @ObfuscatedName(value="ac")
    static int field361 = 0;
    @ObfuscatedName(value="ag")
    static int field364 = 0;
    @ObfuscatedName(value="ao")
    static int field368 = 0;
    @ObfuscatedName(value="ap")
    static int field369 = 0;
    @ObfuscatedName(value="ar")
    @Export(value="Scene_drawnCount")
    static int Scene_drawnCount = 0;
    @ObfuscatedName(value="au")
    static int field373 = 0;
    @ObfuscatedName(value="aw")
    @Export(value="Scene_plane")
    static int Scene_plane = 0;
    @ObfuscatedName(value="ay")
    static int field376 = 0;
    @ObfuscatedName(value="az")
    static int field377 = 0;
    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="[Lag;")
    static Occluder[] field378;
    @ObfuscatedName(value="bb")
    @Export(value="Scene_planeOccluderCounts")
    static int[] Scene_planeOccluderCounts;
    @ObfuscatedName(value="bd")
    public static int field381 = 0;
    @ObfuscatedName(value="bg")
    static int field384 = 0;
    @ObfuscatedName(value="bh")
    static boolean field385 = false;
    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="[Lco;")
    @Export(value="gameObjects")
    static GameObject[] gameObjects;
    @ObfuscatedName(value="bm")
    @Export(value="Scene_planesCount")
    static int Scene_planesCount = 0;
    @ObfuscatedName(value="bn")
    static final int[] field391;
    @ObfuscatedName(value="bo")
    static final int[] field392;
    @ObfuscatedName(value="bp")
    static int field393 = 0;
    @ObfuscatedName(value="bq")
    static int field394 = 0;
    @ObfuscatedName(value="br")
    public static int field395 = 0;
    @ObfuscatedName(value="bx")
    @Export(value="Scene_currentOccludersCount")
    static int Scene_currentOccludersCount = 0;
    @ObfuscatedName(value="by")
    static final int[] field402;
    @ObfuscatedName(value="ca")
    @Export(value="Scene_viewportXCenter")
    static int Scene_viewportXCenter = 0;
    @ObfuscatedName(value="cj")
    @Export(value="Scene_viewportYMin")
    static int Scene_viewportYMin = 0;
    @ObfuscatedName(value="ck")
    static boolean[][][][] field410;
    @ObfuscatedName(value="cw")
    static final int[] field417;
    @ObfuscatedName(value="cx")
    @Export(value="Scene_viewportYMax")
    static int Scene_viewportYMax;
    @ObfuscatedName(value="ad")
    static int field362 = 0;
    @ObfuscatedName(value="ak")
    @Export(value="Scene_isLowDetail")
    public static boolean Scene_isLowDetail = true;
    @ObfuscatedName(value="at")
    static int field372 = 0;
    @ObfuscatedName(value="av")
    static int field374 = 0;
    @ObfuscatedName(value="bc")
    public static int field380 = 0;
    @ObfuscatedName(value="bi")
    static int field386 = 0;
    @ObfuscatedName(value="bl")
    static final int[] field389;
    @ObfuscatedName(value="bs")
    static final int[] field396;
    @ObfuscatedName(value="bu")
    static final int[] field398;
    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="[[Lag;")
    static Occluder[][] field399;
    @ObfuscatedName(value="bz")
    static boolean field403 = false;
    @ObfuscatedName(value="cb")
    static boolean[][] field405;
    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="Lcw;")
    static class47 field407;
    @ObfuscatedName(value="cn")
    @Export(value="Scene_viewportYCenter")
    static int Scene_viewportYCenter = 0;
    @ObfuscatedName(value="cs")
    @Export(value="Scene_viewportXMax")
    static int Scene_viewportXMax;
    @ObfuscatedName(value="ct")
    @Export(value="Scene_viewportXMin")
    static int Scene_viewportXMin;
    @ObfuscatedName(value="bf")
    static int field383 = 0;
    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="Lfe;")
    @Export(value="Scene_tilesDeque")
    static NodeDeque Scene_tilesDeque;
    @ObfuscatedName(value="bk")
    public static int field388 = 0;
    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="Lba;")
    static class19 field413;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="[Lco;")
    @Export(value="tempGameObjects")
    GameObject[] tempGameObjects = new GameObject[5000];
    @ObfuscatedName(value="ae")
    @Export(value="pixelsPerTile")
    int pixelsPerTile;
    @ObfuscatedName(value="ah")
    @Export(value="tileHeights")
    int[][][] tileHeights;
    @ObfuscatedName(value="aj")
    @Export(value="minPlane")
    int minPlane = 0;
    @ObfuscatedName(value="al")
    @Export(value="tempGameObjectsCount")
    int tempGameObjectsCount = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="[[[Lbz;")
    @Export(value="tiles")
    Tile[][][] tiles;
    @ObfuscatedName(value="cf")
    @Export(value="tileRotation2D")
    int[][] tileRotation2D;
    @ObfuscatedName(value="cv")
    @Export(value="tileShape2D")
    int[][] tileShape2D;
    @ObfuscatedName(value="ai")
    @Export(value="xSize")
    int xSize;
    @ObfuscatedName(value="ax")
    @Export(value="ySize")
    int ySize;
    @ObfuscatedName(value="ab")
    int[][][] field420;

    static {
        gameObjects = new GameObject[100];
        field385 = false;
        field394 = 0;
        field395 = 0;
        field388 = 0;
        field381 = -1;
        field380 = -1;
        field403 = false;
        Scene_planesCount = 4;
        Scene_planeOccluderCounts = new int[Scene_planesCount];
        field399 = (Occluder[][])Array.newInstance(ag.class, Scene_planesCount, 500);
        Scene_currentOccludersCount = 0;
        field378 = new Occluder[500];
        Scene_tilesDeque = new NodeDeque();
        field389 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
        field398 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
        field391 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
        field396 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
        field402 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
        field392 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
        field417 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
        field410 = (boolean[][][][])Array.newInstance(Boolean.TYPE, 8, 32, 51, 51);
    }

    public Scene(int n, int n2, int n3, int[][][] arrn) {
        int[] arrn2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arrn3 = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrn4 = new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int[] arrn5 = new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        int[] arrn6 = new int[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] arrn7 = new int[]{1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        int[] arrn8 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0};
        int[] arrn9 = new int[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0};
        int[] arrn10 = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1};
        int[] arrn11 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1};
        this.tileShape2D = new int[][]{arrn2, arrn3, arrn4, arrn5, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, arrn6, arrn7, arrn8, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, arrn9, arrn10, arrn11};
        arrn2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        arrn3 = new int[]{3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12};
        this.tileRotation2D = new int[][]{arrn2, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, arrn3};
        this.pixelsPerTile = n;
        this.xSize = n2;
        this.ySize = n3;
        this.tiles = (Tile[][][])Array.newInstance(bz.class, n, n2, n3);
        this.field420 = (int[][][])Array.newInstance(Integer.TYPE, n, n2 + 1, n3 + 1);
        this.tileHeights = arrn;
        this.init7();
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIILbw;Lbw;IIJI)V")
    @Export(value="newBoundaryObject")
    public void newBoundaryObject(int n, int n2, int n3, int n4, Entity entity, Entity entity2, int n5, int n6, long l, int n7) {
        if (entity == null && entity2 == null) {
            return;
        }
        BoundaryObject boundaryObject = new BoundaryObject();
        boundaryObject.tag = l;
        boundaryObject.flags = n7;
        boundaryObject.field445 = n2 * 128 - -64;
        boundaryObject.field447 = n3 * 128 - -64;
        boundaryObject.field449 = n4;
        boundaryObject.entity1 = entity;
        boundaryObject.entity2 = entity2;
        boundaryObject.field452 = n5;
        boundaryObject.field446 = n6;
        n4 = n;
        while (true) {
            if (n4 >= 0) {
                if (this.tiles[n4][n2][n3] == null) {
                    this.tiles[n4][n2][n3] = new Tile(n4, n2, n3);
                }
            } else {
                this.tiles[n][n2][n3].boundaryObject = boundaryObject;
                return;
            }
            --n4;
        }
    }

    @ObfuscatedName(value="ae")
    @Export(value="init")
    public void init(int n) {
        this.minPlane = n;
        int n2 = 0;
        block0: while (n2 < this.xSize) {
            int n3 = 0;
            while (true) {
                if (n3 < this.ySize) {
                    if (this.tiles[n][n2][n3] == null) {
                        this.tiles[n][n2][n3] = new Tile(n, n2, n3);
                    }
                } else {
                    ++n2;
                    continue block0;
                }
                ++n3;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IIIIIILbw;IJI)Z")
    public boolean method705(int n, int n2, int n3, int n4, int n5, int n6, Entity entity, int n7, long l, int n8) {
        if (entity == null) {
            return true;
        }
        return this.newGameObject(n, n2, n3, n5, n6, n5 * 64 + n2 * 128, n6 * 64 + n3 * 128, n4, entity, n7, false, l, n8);
    }

    @ObfuscatedName(value="ah")
    @Export(value="setTileMinPlane")
    public void setTileMinPlane(int n, int n2, int n3, int n4) {
        if (this.tiles[n][n2][n3] == null) {
            return;
        }
        this.tiles[n][n2][n3].minPlane = n4;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IIIILbw;JI)V")
    @Export(value="newFloorDecoration")
    public void newFloorDecoration(int n, int n2, int n3, int n4, Entity entity, long l, int n5) {
        if (entity == null) {
            return;
        }
        FloorDecoration floorDecoration = new FloorDecoration();
        floorDecoration.entity = entity;
        floorDecoration.x = n2 * 128 + 64;
        floorDecoration.y = n3 * -2013265920 + -1006632960;
        floorDecoration.tileHeight = n4;
        floorDecoration.tag = l;
        floorDecoration.flags = n5;
        if (this.tiles[n][n2][n3] == null) {
            this.tiles[n][n2][n3] = new Tile(n, n2, n3);
        }
        this.tiles[n][n2][n3].floorDecoration = floorDecoration;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIIILbw;JLbw;Lbw;)V")
    @Export(value="newGroundItemPile")
    public void newGroundItemPile(int n, int n2, int n3, int n4, Entity node, long l, Entity entity, Entity entity2) {
        void var9_9;
        Model model;
        void var6_7;
        TileItemPile tileItemPile = new TileItemPile();
        tileItemPile.first = node;
        tileItemPile.field296 = n2 * 128 - -64;
        tileItemPile.field298 = n3 * 128 + 64;
        tileItemPile.field300 = n4;
        tileItemPile.field299 = var6_7;
        tileItemPile.field297 = model;
        tileItemPile.field302 = var9_9;
        Tile tile = this.tiles[n][n2][n3];
        n4 = 0;
        if (tile != null) {
            n4 = 0;
            for (int i = 0; i < tile.field4682 * -1; ++i) {
                int n5 = n4;
                if ((tile.gameObjects[i].flags & 0x100) == 256) {
                    n5 = n4;
                    if (tile.gameObjects[i].entity instanceof Model) {
                        model = (Model)tile.gameObjects[i].entity;
                        model.calculateBoundsCylinder();
                        n5 = n4;
                        if (model.height > n4) {
                            n5 = model.height;
                        }
                    }
                }
                n4 = n5;
            }
        }
        tileItemPile.field301 = n4;
        if (this.tiles[n][n2][n3] == null) {
            this.tiles[n][n2][n3] = new Tile(n, n2, n3);
        }
        this.tiles[n][n2][n3].tileItemPile = tileItemPile;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IIIIILbw;IJIIII)Z")
    @Export(value="addNullableObject")
    public boolean addNullableObject(int n, int n2, int n3, int n4, int n5, Entity entity, int n6, long l, int n7, int n8, int n9, int n10) {
        if (entity == null) {
            return true;
        }
        return this.newGameObject(n, n7, n8, n9 - n7 + 1, n10 - n8 + 1, n2, n3, n4, entity, n6, true, l, 0);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIIIIIIILbw;IZJI)Z")
    @Export(value="newGameObject")
    boolean newGameObject(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, Entity object, int n9, boolean bl, long l, int n10) {
        int n11 = n2;
        while (true) {
            Object object2;
            int n12;
            if (n11 < (n12 = n2 + n4)) {
            } else {
                object2 = new GameObject();
                ((GameObject)object2).tag = l;
                ((GameObject)object2).flags = n10;
                ((GameObject)object2).plane = n;
                ((GameObject)object2).centerX = n6;
                ((GameObject)object2).centerY = n7;
                ((GameObject)object2).height = n8;
                ((GameObject)object2).entity = object;
                ((GameObject)object2).orientation = n9;
                ((GameObject)object2).startX = n2;
                ((GameObject)object2).startY = n3;
                ((GameObject)object2).endX = n8 = n12 - 1;
                n9 = n3 + n5;
                ((GameObject)object2).endY = n10 = n9 - 1;
                n6 = n2;
                while (true) {
                    if (n6 < n12) {
                    } else {
                        if (bl) {
                            object = this.tempGameObjects;
                            n = this.tempGameObjectsCount;
                            this.tempGameObjectsCount = n + 1;
                            object[n] = object2;
                        }
                        return true;
                    }
                    block2: for (n7 = n3; n7 < n9; ++n7) {
                        n5 = n6 > n2 ? 1 : 0;
                        n4 = n5;
                        if (n6 < n8) {
                            n4 = n5 + 4;
                        }
                        n5 = n4;
                        if (n7 > n3) {
                            n5 = n4 + 8;
                        }
                        n4 = n5;
                        if (n7 < n10) {
                            n4 = n5 + 2;
                        }
                        n5 = n;
                        while (true) {
                            if (n5 >= 0) {
                                if (this.tiles[n5][n6][n7] == null) {
                                    this.tiles[n5][n6][n7] = new Tile(n5, n6, n7);
                                }
                            } else {
                                object = this.tiles[n][n6][n7];
                                object.gameObjects[object.field4682 * -1] = object2;
                                object.gameObjectEdgeMasks[object.field4682 * -1] = n4;
                                object.field4689 |= n4;
                                --object.field4682;
                                continue block2;
                            }
                            --n5;
                        }
                    }
                    ++n6;
                }
            }
            for (n12 = n3; n12 < n3 + n5; ++n12) {
                if (n11 >= 0 && n12 >= 0 && n11 < this.xSize) {
                    if (n12 >= this.ySize) {
                        return false;
                    }
                    object2 = this.tiles[n][n11][n12];
                    if (object2 == null || ((Tile)object2).field4682 * -1 < 5) continue;
                    return false;
                }
                return false;
            }
            ++n11;
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(IIIIILbw;IJZ)Z")
    @Export(value="drawEntity")
    public boolean drawEntity(int n, int n2, int n3, int n4, int n5, Entity entity, int n6, long l, boolean bl) {
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        block10: {
            int n12;
            int n13;
            block12: {
                int n14;
                block11: {
                    if (entity == null) {
                        return true;
                    }
                    n13 = n2 - n5;
                    n14 = n3 - n5;
                    n12 = n5 + n2;
                    n10 = n11 = n3 + n5;
                    n9 = n13;
                    n8 = n14;
                    n7 = n12;
                    if (!bl) break block10;
                    n5 = n11;
                    if (n6 > 640) {
                        n5 = n11;
                        if (n6 < 1408) {
                            n5 = n11 + 128;
                        }
                    }
                    n11 = n12;
                    if (n6 > 1152) {
                        n11 = n12;
                        if (n6 < 1920) {
                            n11 = n12 + 128;
                        }
                    }
                    if (n6 > 1664) break block11;
                    n12 = n14;
                    if (n6 >= 384) break block12;
                }
                n12 = n14 - 128;
            }
            n10 = n5;
            n9 = n13;
            n8 = n12;
            n7 = n11;
            if (n6 > 128) {
                n10 = n5;
                n9 = n13;
                n8 = n12;
                n7 = n11;
                if (n6 < 896) {
                    n9 = n13 - 128;
                    n7 = n11;
                    n8 = n12;
                    n10 = n5;
                }
            }
        }
        n5 = n9 / 128;
        n11 = n8 / 128;
        return this.newGameObject(n, n5, n11, n7 / 128 - n5 + 1, n10 / 128 - n11 + 1, n2, n3, n4, entity, n6, true, l, 0);
    }

    @ObfuscatedName(value="ar")
    public void method717(int n, int n2, int n3, int n4) {
        Object object = this.tiles[n][n2][n3];
        if (object == null) {
            return;
        }
        object = ((Tile)object).wallDecoration;
        if (object == null) {
            return;
        }
        ((WallDecoration)object).xOffset = n4 * ((WallDecoration)object).xOffset / 16;
        ((WallDecoration)object).yOffset = n4 * ((WallDecoration)object).yOffset / 16;
    }

    @ObfuscatedName(value="as")
    @Export(value="addTile")
    public void addTile(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        if (n4 != 0) {
            boolean bl = true;
            if (n4 == 1) {
                if (n8 != n7 || n7 != n9 || n10 != n7) {
                    bl = false;
                }
                TilePaint tilePaint = new TilePaint(n15, n16, n17, n18, n6, n20, bl);
                n4 = n;
                while (true) {
                    if (n4 >= 0) {
                        if (this.tiles[n4][n2][n3] == null) {
                            this.tiles[n4][n2][n3] = new Tile(n4, n2, n3);
                        }
                    } else {
                        this.tiles[n][n2][n3].paint = tilePaint;
                        return;
                    }
                    --n4;
                }
            }
            TileModel tileModel = new TileModel(n4, n5, n6, n2, n3, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20);
            n4 = n;
            while (true) {
                if (n4 >= 0) {
                    if (this.tiles[n4][n2][n3] == null) {
                        this.tiles[n4][n2][n3] = new Tile(n4, n2, n3);
                    }
                } else {
                    this.tiles[n][n2][n3].model = tileModel;
                    return;
                }
                --n4;
            }
        }
        TilePaint tilePaint = new TilePaint(n11, n12, n13, n14, -1, n19, false);
        n4 = n;
        while (true) {
            if (n4 >= 0) {
                if (this.tiles[n4][n2][n3] == null) {
                    this.tiles[n4][n2][n3] = new Tile(n4, n2, n3);
                }
            } else {
                this.tiles[n][n2][n3].paint = tilePaint;
                return;
            }
            --n4;
        }
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lco;)V")
    @Export(value="removeGameObject")
    void removeGameObject(GameObject var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 2[FORLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @ObfuscatedName(value="ay")
    @Export(value="clearTempGameObjects")
    public void clearTempGameObjects() {
        for (int i = 0; i < this.tempGameObjectsCount; ++i) {
            this.removeGameObject(this.tempGameObjects[i]);
            this.tempGameObjects[i] = null;
        }
        this.tempGameObjectsCount = 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ba")
    @Export(value="occlude")
    void occlude() {
        var7_1 = Scene.Scene_planeOccluderCounts[Scene.Scene_plane];
        var9_2 = Scene.field399[Scene.Scene_plane];
        Scene.Scene_currentOccludersCount = 0;
        var4_3 = 0;
        while (var4_3 < var7_1) {
            block19: {
                block23: {
                    block27: {
                        block26: {
                            block17: {
                                block22: {
                                    block25: {
                                        block24: {
                                            block16: {
                                                block20: {
                                                    block21: {
                                                        block18: {
                                                            var10_10 = var9_2[var4_3];
                                                            var2_5 = var10_10.type * -693388489;
                                                            var1_4 = 50;
                                                            var3_6 = 1;
                                                            if (var2_5 * 137423495 != 1) break block18;
                                                            var6_8 = var10_10.minTileX - Scene.field374 + 25;
                                                            if (var6_8 < 0 || var6_8 > 50) break block19;
                                                            var2_5 = var5_7 = var10_10.minTileY - Scene.field362 + 25;
                                                            if (var5_7 < 0) {
                                                                var2_5 = 0;
                                                            }
                                                            if ((var5_7 = var10_10.maxTileY - Scene.field362 + 25) > 50) break block20;
                                                            var1_4 = var5_7;
                                                            break block20;
                                                        }
                                                        if (var10_10.type != 2) break block21;
                                                        var5_7 = var10_10.minTileY - Scene.field362 + 25;
                                                        if (var5_7 < 0 || var5_7 > 50) break block19;
                                                        var2_5 = var3_6 = var10_10.minTileX - Scene.field374 + 25;
                                                        if (var3_6 < 0) {
                                                            var2_5 = 0;
                                                        }
                                                        if ((var3_6 = var10_10.maxTileX - Scene.field374 + 25) > 50) break block22;
                                                        var1_4 = var3_6;
                                                        break block22;
                                                    }
                                                    if (var10_10.type != 4 || (var8_9 = var10_10.minY - Scene.field361) <= 128) break block19;
                                                    var2_5 = var3_6 = var10_10.minTileY - Scene.field362 + 25;
                                                    if (var3_6 < 0) {
                                                        var2_5 = 0;
                                                    }
                                                    var5_7 = var3_6 = var10_10.maxTileY - Scene.field362 + 25;
                                                    if (var3_6 > 50) {
                                                        var5_7 = 50;
                                                    }
                                                    if (var2_5 > var5_7) break block19;
                                                    var3_6 = var6_8 = var10_10.minTileX - Scene.field374 + 25;
                                                    if (var6_8 < 0) {
                                                        var3_6 = 0;
                                                    }
                                                    if ((var6_8 = var10_10.maxTileX - Scene.field374 + 25) > 50) break block23;
                                                    var1_4 = var6_8;
                                                    break block23;
                                                }
                                                while (var2_5 <= var1_4) {
                                                    if (Scene.field405[var6_8][var2_5]) {
                                                        var1_4 = var3_6;
                                                        break block16;
                                                    }
                                                    ++var2_5;
                                                }
                                                var1_4 = 0;
                                            }
                                            if (var1_4 == 0) break block19;
                                            var1_4 = Scene.field364 - var10_10.minX;
                                            if (var1_4 <= 32) break block24;
                                            var10_10.field40 = 1;
                                            break block25;
                                        }
                                        if (var1_4 >= -32) break block19;
                                        var10_10.field40 = 2;
                                        var1_4 = -var1_4;
                                    }
                                    var10_10.field45 = (var10_10.minZ - Scene.field373 << 8) / var1_4;
                                    var10_10.field43 = (var10_10.maxZ - Scene.field373 << 8) / var1_4;
                                    var10_10.field41 = (var10_10.minY - Scene.field361 << 8) / var1_4;
                                    var10_10.field39 = (var10_10.maxY - Scene.field361 << 8) / var1_4;
                                    var11_11 = Scene.field378;
                                    var1_4 = Scene.Scene_currentOccludersCount;
                                    Scene.Scene_currentOccludersCount = var1_4 + 1;
                                    var11_11[var1_4] = var10_10;
                                    break block19;
                                }
                                while (var2_5 <= var1_4) {
                                    if (Scene.field405[var2_5][var5_7]) {
                                        var1_4 = 1;
                                        break block17;
                                    }
                                    ++var2_5;
                                }
                                var1_4 = 0;
                            }
                            if (var1_4 == 0) break block19;
                            var1_4 = Scene.field373 - var10_10.minZ;
                            if (var1_4 <= 32) break block26;
                            var10_10.field40 = 3;
                            break block27;
                        }
                        if (var1_4 >= -32) break block19;
                        var10_10.field40 = 4;
                        var1_4 = -var1_4;
                    }
                    var10_10.field37 = (var10_10.minX - Scene.field364 << 8) / var1_4;
                    var10_10.field38 = (var10_10.maxX - Scene.field364 << 8) / var1_4;
                    var10_10.field41 = (var10_10.minY - Scene.field361 << 8) / var1_4;
                    var10_10.field39 = (var10_10.maxY - Scene.field361 << 8) / var1_4;
                    var11_11 = Scene.field378;
                    var1_4 = Scene.Scene_currentOccludersCount;
                    Scene.Scene_currentOccludersCount = var1_4 + 1;
                    var11_11[var1_4] = var10_10;
                    break block19;
                }
                block3: while (true) {
                    block28: {
                        if (var3_6 <= var1_4) break block28;
                        var1_4 = 0;
                        ** GOTO lbl111
                    }
                    for (var6_8 = var2_5; var6_8 <= var5_7; ++var6_8) {
                        if (!Scene.field405[var3_6][var6_8]) continue;
                        var1_4 = 1;
lbl111:
                        // 2 sources

                        if (var1_4 == 0) break block3;
                        var10_10.field40 = 5;
                        var10_10.field37 = (var10_10.minX - Scene.field364 << 8) / var8_9;
                        var10_10.field38 = (var10_10.maxX - Scene.field364 << 8) / var8_9;
                        var10_10.field45 = (var10_10.minZ - Scene.field373 << 8) / var8_9;
                        var10_10.field43 = (var10_10.maxZ - Scene.field373 << 8) / var8_9;
                        var11_11 = Scene.field378;
                        var1_4 = Scene.Scene_currentOccludersCount;
                        Scene.Scene_currentOccludersCount = var1_4 + 1;
                        var11_11[var1_4] = var10_10;
                        break block3;
                    }
                    ++var3_6;
                }
            }
            ++var4_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(Lba;IIIIII)V")
    @Export(value="drawTileOverlay")
    public void drawTileOverlay(class19 arrtile, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        field413 = arrtile;
        field407 = field413.vmethod7589();
        if (n < 0) {
            n7 = 0;
        } else {
            n7 = n;
            if (n >= this.xSize * 128) {
                n7 = this.xSize * 128 - 1;
            }
        }
        if (n3 < 0) {
            n = 0;
        } else {
            n = n3;
            if (n3 >= this.ySize * 128) {
                n = this.ySize * 128 - 1;
            }
        }
        if (n4 < 128) {
            n3 = 128;
        } else {
            n3 = n4;
            if (n4 > 383) {
                n3 = 383;
            }
        }
        ++Scene_drawnCount;
        field393 = Rasterizer3D.Rasterizer3D_sine[n3];
        field386 = Rasterizer3D.Rasterizer3D_cosine[n3];
        field384 = Rasterizer3D.Rasterizer3D_sine[n5];
        field383 = Rasterizer3D.Rasterizer3D_cosine[n5];
        field405 = field410[(n3 - 128) / 32][n5 / 64];
        field364 = n7;
        field361 = n2;
        field373 = n;
        field374 = n7 / 128;
        field362 = n / 128;
        Scene_plane = n6;
        field369 = field374 - 25;
        if (field369 < 0) {
            field369 = 0;
        }
        if ((field377 = field362 - 25) < 0) {
            field377 = 0;
        }
        if ((field368 = field374 + 25) > this.xSize) {
            field368 = this.xSize;
        }
        if ((field372 = field362 + 25) > this.ySize) {
            field372 = this.ySize;
        }
        this.occlude();
        field376 = 0;
        n = this.minPlane;
        block0: while (true) {
            Tile tile;
            block38: {
                if (n < this.pixelsPerTile) break block38;
                n = this.minPlane;
                block1: while (true) {
                    block39: {
                        if (n < this.pixelsPerTile) break block39;
                        n = this.minPlane;
                        block2: while (true) {
                            if (n >= this.pixelsPerTile) {
                                field385 = false;
                                return;
                            }
                            arrtile = this.tiles[n];
                            n2 = -25;
                            while (true) {
                                block41: {
                                    block42: {
                                        block40: {
                                            if (n2 > 0) break block40;
                                            n4 = n2 + field374;
                                            n5 = field374 - n2;
                                            if (n4 < field369 && n5 >= field368) break block41;
                                            break block42;
                                        }
                                        ++n;
                                        continue block2;
                                    }
                                    for (n3 = -25; n3 <= 0; ++n3) {
                                        n6 = n3 + field362;
                                        n7 = field362 - n3;
                                        if (n4 >= field369) {
                                            if (n6 >= field377 && (tile = arrtile[n4][n6]) != null && tile.field4697) {
                                                this.drawTile(tile, false);
                                            }
                                            if (n7 < field372 && (tile = arrtile[n4][n7]) != null && tile.field4697) {
                                                this.drawTile(tile, false);
                                            }
                                        }
                                        if (n5 < field368) {
                                            if (n6 >= field377 && (tile = arrtile[n5][n6]) != null && tile.field4697) {
                                                this.drawTile(tile, false);
                                            }
                                            if (n7 < field372 && (tile = arrtile[n5][n7]) != null && tile.field4697) {
                                                this.drawTile(tile, false);
                                            }
                                        }
                                        if (field376 != 0) continue;
                                        field385 = false;
                                        return;
                                    }
                                }
                                ++n2;
                            }
                            break;
                        }
                    }
                    arrtile = this.tiles[n];
                    n2 = -25;
                    while (true) {
                        block44: {
                            block45: {
                                block43: {
                                    if (n2 > 0) break block43;
                                    n4 = n2 + field374;
                                    n5 = field374 - n2;
                                    if (n4 < field369 && n5 >= field368) break block44;
                                    break block45;
                                }
                                ++n;
                                continue block1;
                            }
                            for (n3 = -25; n3 <= 0; ++n3) {
                                n6 = n3 + field362;
                                n7 = field362 - n3;
                                if (n4 >= field369) {
                                    if (n6 >= field377 && (tile = arrtile[n4][n6]) != null && tile.field4697) {
                                        this.drawTile(tile, true);
                                    }
                                    if (n7 < field372 && (tile = arrtile[n4][n7]) != null && tile.field4697) {
                                        this.drawTile(tile, true);
                                    }
                                }
                                if (n5 < field368) {
                                    if (n6 >= field377 && (tile = arrtile[n5][n6]) != null && tile.field4697) {
                                        this.drawTile(tile, true);
                                    }
                                    if (n7 < field372 && (tile = arrtile[n5][n7]) != null && tile.field4697) {
                                        this.drawTile(tile, true);
                                    }
                                }
                                if (field376 != 0) continue;
                                field385 = false;
                                return;
                            }
                        }
                        ++n2;
                    }
                    break;
                }
            }
            arrtile = this.tiles[n];
            n3 = field369;
            while (true) {
                if (n3 < field368) {
                } else {
                    ++n;
                    continue block0;
                }
                for (n4 = field377; n4 < field372; ++n4) {
                    tile = arrtile[n3][n4];
                    if (tile == null) continue;
                    if (tile.minPlane <= n6 && (field405[n3 - field374 + 25][n4 - field362 + 25] || this.tileHeights[n][n3][n4] - n2 >= 2000)) {
                        tile.field4697 = true;
                        tile.drawSecondary = true;
                        tile.field4691 = tile.field4682 * -1 > 0;
                        ++field376;
                        continue;
                    }
                    tile.field4697 = false;
                    tile.drawSecondary = false;
                    tile.field4690 = 0;
                }
                ++n3;
            }
            break;
        }
    }

    @ObfuscatedName(value="bg")
    public long method728(int n, int n2, int n3) {
        Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return 0L;
        }
        for (n = 0; n < tile.field4682 * -1; ++n) {
            GameObject gameObject = tile.gameObjects[n];
            if (!class76.method4320(gameObject.tag) || n2 != gameObject.startX || n3 != gameObject.startY) continue;
            return gameObject.tag;
        }
        return 0L;
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="bh")
    public void method729(int var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[UNCONDITIONALDOLOOP]], but top level block is 2[UNCONDITIONALDOLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @ObfuscatedName(value="bj")
    @Export(value="getObjectFlags")
    public int getObjectFlags(int n, int n2, int n3, long l) {
        Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return -1;
        }
        if (tile.boundaryObject != null && tile.boundaryObject.tag == l) {
            n = tile.boundaryObject.flags * 1274151005;
            n2 = 1240323061;
        } else if (tile.wallDecoration != null && tile.wallDecoration.tag == l) {
            n = tile.wallDecoration.flags * -508968795;
            n2 = -326097107;
        } else {
            if (tile.floorDecoration != null && tile.floorDecoration.tag == l) {
                return tile.floorDecoration.flags & 0xFF;
            }
            for (n = 0; n < tile.field4682 * -1; ++n) {
                if (tile.gameObjects[n].tag != l) continue;
                return tile.gameObjects[n].flags & 0xFF;
            }
            return -1;
        }
        return n2 * n & 0xFF;
    }

    @ObfuscatedName(value="bn")
    boolean method734(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n3 == n2 && n5 == n4) {
            Object object;
            if (!this.method743(n, n2, n4)) {
                return false;
            }
            int n7 = n2 << 7;
            n3 = n7 + 1;
            int n8 = this.tileHeights[n][n2][n4];
            n5 = n4 << 7;
            Object object2 = n5 + 1;
            return this.method739(n3, n8 - n6, (int)object2) && this.method739(n7 = n7 + 128 - 1, (object = this.tileHeights[n])[n8 = n2 + 1][n4] - n6, (int)object2) && this.method739(n7, (object2 = (Object)(object = (Object)this.tileHeights[n][n8])[++n4]) - n6, n5 = n5 + 128 - 1) && this.method739(n3, this.tileHeights[n][n2][n4] - n6, n5);
        }
        int n9 = n2;
        while (true) {
            int n10;
            if (n9 <= n3) {
            } else {
                n9 = (n2 << 7) + 1;
                n10 = (n4 << 7) + 2;
                if (!this.method739(n9, n = this.tileHeights[n][n2][n4] - n6, n10)) {
                    return false;
                }
                n2 = (n3 << 7) - 1;
                if (!this.method739(n2, n, n10)) {
                    return false;
                }
                n3 = (n5 << 7) - 1;
                if (!this.method739(n9, n, n3)) {
                    return false;
                }
                return this.method739(n2, n, n3);
            }
            for (n10 = n4; n10 <= n5; ++n10) {
                if (this.field420[n][n9][n10] != -Scene_drawnCount) continue;
                return false;
            }
            ++n9;
        }
    }

    @ObfuscatedName(value="bp")
    public long method736(int n, int n2, int n3) {
        Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.boundaryObject != null) {
            return tile.boundaryObject.tag;
        }
        return 0L;
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lbk;III)V")
    void method737(ModelData modelData, int n, int n2, int n3) {
        Tile tile;
        if (n2 < this.xSize && (tile = this.tiles[n][n2 + 1][n3]) != null && tile.floorDecoration != null && tile.floorDecoration.entity instanceof ModelData) {
            ModelData.method13916(modelData, (ModelData)tile.floorDecoration.entity, 128, 0, 0, true);
        }
        if (n3 < this.xSize && (tile = this.tiles[n][n2][n3 + 1]) != null && tile.floorDecoration != null && tile.floorDecoration.entity instanceof ModelData) {
            ModelData.method13916(modelData, (ModelData)tile.floorDecoration.entity, 0, 0, 128, true);
        }
        if (n2 < this.xSize && n3 < this.ySize && (tile = this.tiles[n][n2 + 1][n3 + 1]) != null && tile.floorDecoration != null && tile.floorDecoration.entity instanceof ModelData) {
            ModelData.method13916(modelData, (ModelData)tile.floorDecoration.entity, 128, 0, 128, true);
        }
        if (n2 < this.xSize && n3 > 0 && (tile = this.tiles[n][n2 + 1][n3 - 1]) != null && tile.floorDecoration != null && tile.floorDecoration.entity instanceof ModelData) {
            ModelData.method13916(modelData, (ModelData)tile.floorDecoration.entity, 128, 0, -128, true);
        }
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Lbk;IIIII)V")
    void method738(ModelData modelData, int n, int n2, int n3, int n4, int n5) {
        int n6 = n2 + n4;
        int n7 = n3 + n5;
        int n8 = n2;
        boolean bl = true;
        for (int i = n; i <= n + 1; ++i) {
            if (i == this.pixelsPerTile) continue;
            int n9 = n8;
            while (n9 <= n6) {
                int n10 = n6;
                int n11 = n9;
                if (n9 >= 0) {
                    if (n9 >= this.xSize) {
                        n10 = n6;
                        n11 = n9;
                    } else {
                        int n12 = n3 - 1;
                        while (true) {
                            Tile tile;
                            Object object = this;
                            n10 = n6;
                            n11 = n9;
                            if (n12 > n7) break;
                            if (n12 >= 0 && n12 < ((Scene)object).ySize && (!bl || n9 >= n6 || n12 >= n7 || n12 < n3 && n2 != n9) && (tile = ((Scene)object).tiles[i][n9][n12]) != null) {
                                n10 = ((Scene)object).tileHeights[i][n9][n12];
                                Object object2 = ((Scene)object).tileHeights[i];
                                n11 = n9 + 1;
                                int n13 = object2[n11][n12];
                                object2 = ((Scene)object).tileHeights[i][n9];
                                int n14 = n12 + 1;
                                n10 = (n10 + n13 + ((Scene)object).tileHeights[i][n11][n14] + object2[n14]) / 4;
                                n11 = ((Scene)object).tileHeights[n][n2][n3];
                                object2 = ((Scene)object).tileHeights[n];
                                n13 = n2 + 1;
                                n14 = object2[n13][n3];
                                object2 = ((Scene)object).tileHeights[n][n2];
                                int n15 = n3 + 1;
                                n11 = n10 - (n11 + n14 + ((Scene)object).tileHeights[n][n13][n15] + object2[n15]) / 4;
                                object = tile.boundaryObject;
                                if (object != null) {
                                    if (((BoundaryObject)object).entity1 instanceof ModelData) {
                                        ModelData.method13916(modelData, (ModelData)((BoundaryObject)object).entity1, (1 - n4) * 64 + (n9 - n2) * 128, n11, (n12 - n3) * 128 + (1 - n5) * 64, bl);
                                    }
                                    if (((BoundaryObject)object).entity2 instanceof ModelData) {
                                        ModelData.method13916(modelData, (ModelData)((BoundaryObject)object).entity2, (1 - n4) * 64 + (n9 - n2) * 128, n11, (n12 - n3) * 128 + (1 - n5) * 64, bl);
                                    }
                                }
                                for (n10 = 0; n10 < tile.field4682 * -1; ++n10) {
                                    object = tile.gameObjects[n10];
                                    if (object == null || !(((GameObject)object).entity instanceof ModelData)) continue;
                                    object2 = (ModelData)((GameObject)object).entity;
                                    n13 = ((GameObject)object).endX * -1674187619;
                                    n14 = ((GameObject)object).startX * -1026948801;
                                    n15 = ((GameObject)object).endY * 572583791;
                                    int n16 = ((GameObject)object).startY * -1756545293;
                                    ModelData.method13916(modelData, (ModelData)object2, (n13 * -919078475 - n14 * -1321177409 + 1 - n4) * 64 + (((GameObject)object).startX - n2) * 128, n11, (((GameObject)object).startY - n3) * 128 + (n15 * -365342833 - n16 * 26151483 + 1 - n5) * 64, bl);
                                }
                            }
                            ++n12;
                        }
                    }
                }
                n9 = n11 + 1;
                n6 = n10;
            }
            --n8;
            bl = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ai")
    @Export(value="setLinkBelow")
    public void setLinkBelow(int n, int n2) {
        Tile tile = this.tiles[0][n][n2];
        int n3 = 0;
        block0: while (n3 < 3) {
            Tile tile2;
            Tile[] arrtile = this.tiles[n3][n];
            Tile[][][] arrtile2 = this.tiles;
            int n4 = n3 + 1;
            arrtile[n2] = tile2 = arrtile2[n4][n][n2];
            n3 = n4;
            if (tile2 == null) continue;
            ++tile2.plane;
            int n5 = 0;
            while (true) {
                n3 = n4;
                if (n5 >= tile2.field4682 * -1) continue block0;
                GameObject gameObject = tile2.gameObjects[n5];
                if (class76.method4320(gameObject.tag) && gameObject.startX == n && n2 == gameObject.startY) {
                    gameObject.plane += -1;
                }
                ++n5;
            }
        }
        if (this.tiles[0][n][n2] == null) {
            this.tiles[0][n][n2] = new Tile(0, n, n2);
        }
        this.tiles[0][n][n2].linkedBelowTile = tile;
        this.tiles[3][n][n2] = null;
    }

    @ObfuscatedName(value="ak")
    @Export(value="init7")
    public void init7() {
        int n = 0;
        int n2 = 0;
        block0: while (true) {
            int n3;
            if (n2 >= this.pixelsPerTile) {
                n2 = 0;
                while (true) {
                    if (n2 < Scene_planesCount) {
                    } else {
                        for (n2 = 0; n2 < this.tempGameObjectsCount; ++n2) {
                            this.tempGameObjects[n2] = null;
                        }
                        this.tempGameObjectsCount = 0;
                        for (n2 = n; n2 < gameObjects.length; ++n2) {
                            Scene.gameObjects[n2] = null;
                        }
                        return;
                    }
                    for (n3 = 0; n3 < Scene_planeOccluderCounts[n2]; ++n3) {
                        Scene.field399[n2][n3] = null;
                    }
                    Scene.Scene_planeOccluderCounts[n2] = 0;
                    ++n2;
                }
            }
            n3 = 0;
            while (true) {
                if (n3 < this.xSize) {
                } else {
                    ++n2;
                    continue block0;
                }
                for (int i = 0; i < this.ySize; ++i) {
                    this.tiles[n2][n3][i] = null;
                }
                ++n3;
            }
            break;
        }
    }

    @ObfuscatedName(value="av")
    @Export(value="removeWallDecoration")
    public void removeWallDecoration(int n, int n2, int n3) {
        Tile tile = this.tiles[n][n2][n3];
        if (tile == null) {
            return;
        }
        tile.tileItemPile = null;
    }

    @ObfuscatedName(value="bi")
    public long method730(int n, int n2, int n3) {
        Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.wallDecoration != null) {
            return tile.wallDecoration.tag;
        }
        return 0L;
    }

    @ObfuscatedName(value="bl")
    boolean method733(int n, int n2, int n3, int n4) {
        if (!this.method743(n, n2, n3)) {
            return false;
        }
        int n5 = n2 << 7;
        int n6 = n3 << 7;
        int n7 = this.tileHeights[n][n2][n3] - 1;
        n3 = n7 - 120;
        n2 = n7 - 230;
        if (n4 < 16) {
            if (n4 == 1) {
                if (n5 > field364) {
                    if (!this.method739(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method739(n5, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method739(n5, n3, n6)) {
                        return false;
                    }
                    if (!this.method739(n5, n3, n6 + 128)) {
                        return false;
                    }
                }
                if (!this.method739(n5, n2, n6)) {
                    return false;
                }
                return this.method739(n5, n2, n6 + 128);
            }
            if (n4 == 2) {
                if (n6 < field373) {
                    n4 = n6 + 128;
                    if (!this.method739(n5, n7, n4)) {
                        return false;
                    }
                    if (!this.method739(n5 + 128, n7, n4)) {
                        return false;
                    }
                }
                if (n > 0) {
                    n = n6 + 128;
                    if (!this.method739(n5, n3, n)) {
                        return false;
                    }
                    if (!this.method739(n5 + 128, n3, n)) {
                        return false;
                    }
                }
                if (!this.method739(n5, n2, n = n6 + 128)) {
                    return false;
                }
                return this.method739(n5 + 128, n2, n);
            }
            if (n4 == 4) {
                if (n5 < field364) {
                    n4 = n5 + 128;
                    if (!this.method739(n4, n7, n6)) {
                        return false;
                    }
                    if (!this.method739(n4, n7, n6 + 128)) {
                        return false;
                    }
                }
                if (n > 0) {
                    n = n5 + 128;
                    if (!this.method739(n, n3, n6)) {
                        return false;
                    }
                    if (!this.method739(n, n3, n6 + 128)) {
                        return false;
                    }
                }
                if (!this.method739(n = n5 + 128, n2, n6)) {
                    return false;
                }
                return this.method739(n, n2, n6 + 128);
            }
            if (n4 == 8) {
                if (n6 > field373) {
                    if (!this.method739(n5, n7, n6)) {
                        return false;
                    }
                    if (!this.method739(n5 + 128, n7, n6)) {
                        return false;
                    }
                }
                if (n > 0) {
                    if (!this.method739(n5, n3, n6)) {
                        return false;
                    }
                    if (!this.method739(n5 + 128, n3, n6)) {
                        return false;
                    }
                }
                if (!this.method739(n5, n2, n6)) {
                    return false;
                }
                return this.method739(n5 + 128, n2, n6);
            }
        }
        if (!this.method739(n5 + 64, n7 - 238, n6 + 64)) {
            return false;
        }
        if (n4 == 16) {
            return this.method739(n5, n2, n6 + 128);
        }
        if (n4 == 32) {
            return this.method739(n5 + 128, n2, n6 + 128);
        }
        if (n4 == 64) {
            return this.method739(n5 + 128, n2, n6);
        }
        if (n4 == 128) {
            return this.method739(n5, n2, n6);
        }
        return true;
    }

    @ObfuscatedName(value="bs")
    boolean method739(int n, int n2, int n3) {
        for (int i = 0; i < Scene_currentOccludersCount; ++i) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            int n12;
            Occluder occluder = field378[i];
            if (occluder.field40 == 1) {
                n12 = occluder.minX - n;
                if (n12 <= 0) continue;
                n11 = occluder.minZ * 643861331;
                n10 = occluder.field45 * -1756350449;
                n9 = occluder.maxZ * 1349627955;
                n8 = occluder.field43 * 1797273939;
                n7 = occluder.minY * -802541315;
                n6 = occluder.field41 * 2121030141;
                n5 = occluder.maxY * 1375387289;
                n4 = occluder.field39 * 1132353149;
                if (n3 < n11 * -1247153957 + (n10 * n12 * 2125444847 >> 8) || n3 > n9 * 1719716603 + (n8 * n12 * -243764517 >> 8) || n2 < (n6 * n12 * 1310542677 >> 8) + n7 * 412052565 || n2 > (n4 * n12 * -1035578667 >> 8) + n5 * 2116466089) continue;
                return true;
            }
            if (occluder.field40 == 2) {
                n12 = n - occluder.minX;
                if (n12 <= 0) continue;
                n11 = occluder.minZ * 643861331;
                n10 = occluder.field45 * -1756350449;
                n9 = occluder.maxZ * 1349627955;
                n8 = occluder.field43 * 1797273939;
                n7 = occluder.minY * -802541315;
                n6 = occluder.field41 * 2121030141;
                n5 = occluder.maxY * 1375387289;
                n4 = occluder.field39 * 1132353149;
                if (n3 < n11 * -1247153957 + (n10 * n12 * 2125444847 >> 8) || n3 > n9 * 1719716603 + (n8 * n12 * -243764517 >> 8) || n2 < (n6 * n12 * 1310542677 >> 8) + n7 * 412052565 || n2 > (n4 * n12 * -1035578667 >> 8) + n5 * 2116466089) continue;
                return true;
            }
            if (occluder.field40 == 3) {
                n12 = occluder.minZ - n3;
                if (n12 <= 0) continue;
                n11 = occluder.minX * 1984394471;
                n10 = occluder.field37 * 1367820281;
                n9 = occluder.maxX * 622131295;
                n8 = occluder.field38 * 132812005;
                n7 = occluder.minY * -802541315;
                n6 = occluder.field41 * 2121030141;
                n5 = occluder.maxY * 1375387289;
                n4 = occluder.field39 * 1132353149;
                if (n < (n10 * n12 * 1261619785 >> 8) + n11 * 2020630231 || n > (n8 * n12 * -146517779 >> 8) + n9 * 1060332447 || n2 < (n6 * n12 * 1310542677 >> 8) + n7 * 412052565 || n2 > (n4 * n12 * -1035578667 >> 8) + n5 * 2116466089) continue;
                return true;
            }
            if (occluder.field40 == 4) {
                n12 = n3 - occluder.minZ;
                if (n12 <= 0) continue;
                n11 = occluder.minX * 1984394471;
                n10 = occluder.field37 * 1367820281;
                n9 = occluder.maxX * 622131295;
                n8 = occluder.field38 * 132812005;
                n7 = occluder.minY * -802541315;
                n6 = occluder.field41 * 2121030141;
                n5 = occluder.maxY * 1375387289;
                n4 = occluder.field39 * 1132353149;
                if (n < (n10 * n12 * 1261619785 >> 8) + n11 * 2020630231 || n > (n8 * n12 * -146517779 >> 8) + n9 * 1060332447 || n2 < (n6 * n12 * 1310542677 >> 8) + n7 * 412052565 || n2 > (n4 * n12 * -1035578667 >> 8) + n5 * 2116466089) continue;
                return true;
            }
            if (occluder.field40 != 5 || (n12 = n2 - occluder.minY) <= 0) continue;
            n11 = occluder.minX * 1984394471;
            n10 = occluder.field37 * 1367820281;
            n9 = occluder.maxX * 622131295;
            n8 = occluder.field38 * 132812005;
            n7 = occluder.minZ * 643861331;
            n6 = occluder.field45 * -1756350449;
            n5 = occluder.maxZ * 1349627955;
            n4 = occluder.field43 * 1797273939;
            if (n < (n10 * n12 * 1261619785 >> 8) + n11 * 2020630231 || n > (n8 * n12 * -146517779 >> 8) + n9 * 1060332447 || n3 < n7 * -1247153957 + (n6 * n12 * 2125444847 >> 8) || n3 > n5 * 1719716603 + (n4 * n12 * -243764517 >> 8)) continue;
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="bu")
    boolean method741(int n, int n2, int n3, int n4) {
        Object object;
        if (!this.method743(n, n2, n3)) {
            return false;
        }
        int n5 = n2 << 7;
        int n6 = n5 + 1;
        int n7 = this.tileHeights[n][n2][n3];
        int n8 = n3 << 7;
        Object object2 = n8 + 1;
        return this.method739(n6, n7 - n4, (int)object2) && this.method739(n5 = n5 + 128 - 1, (object = this.tileHeights[n])[n7 = n2 + 1][n3] - n4, (int)object2) && this.method739(n5, (object2 = (Object)(object = (Object)this.tileHeights[n][n7])[++n3]) - n4, n8 = n8 + 128 - 1) && this.method739(n6, this.tileHeights[n][n2][n3] - n4, n8);
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(Lbz;Z)V")
    @Export(value="drawTile")
    void drawTile(Tile var1_1, boolean var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(IIIILbw;Lbw;IIIIJI)V")
    @Export(value="newWallDecoration")
    public void newWallDecoration(int n, int n2, int n3, int n4, Entity entity, Entity entity2, int n5, int n6, int n7, int n8, long l, int n9) {
        if (entity == null) {
            return;
        }
        WallDecoration wallDecoration = new WallDecoration();
        wallDecoration.tag = l;
        wallDecoration.flags = n9;
        wallDecoration.x = n2 * 128 + 64;
        wallDecoration.field511 = n3 * 128 - -64;
        wallDecoration.field513 = n4;
        wallDecoration.field514 = entity;
        wallDecoration.field506 = entity2;
        wallDecoration.field516 = n5;
        wallDecoration.field510 = n6;
        wallDecoration.xOffset = n7;
        wallDecoration.yOffset = n8;
        n4 = n;
        while (true) {
            if (n4 >= 0) {
                if (this.tiles[n4][n2][n3] == null) {
                    this.tiles[n4][n2][n3] = new Tile(n4, n2, n3);
                }
            } else {
                this.tiles[n][n2][n3].wallDecoration = wallDecoration;
                return;
            }
            --n4;
        }
    }

    @ObfuscatedName(value="bf")
    public long method727(int n, int n2, int n3) {
        Tile tile = this.tiles[n][n2][n3];
        if (tile != null && tile.floorDecoration != null) {
            return tile.floorDecoration.tag;
        }
        return 0L;
    }

    @ObfuscatedName(value="bw")
    boolean method743(int n, int n2, int n3) {
        Object object;
        int n4 = this.field420[n][n2][n3];
        if (n4 == -Scene_drawnCount) {
            return false;
        }
        if (n4 == Scene_drawnCount) {
            return true;
        }
        int n5 = n2 << 7;
        n4 = n5 + 1;
        Object object2 = this.tileHeights[n][n2][n3];
        int n6 = n3 << 7;
        int n7 = n6 + 1;
        if (this.method739(n4, (int)object2, n7) && this.method739(n5 = n5 + 128 - 1, (object = this.tileHeights[n])[object2 = n2 + 1][n3], n7) && this.method739(n5, (int)(object2 = (Object)(object = (Object)this.tileHeights[n][object2])[n7 = n3 + 1]), n6 = n6 + 128 - 1) && this.method739(n4, this.tileHeights[n][n2][n7], n6)) {
            this.field420[n][n2][n3] = Scene_drawnCount;
            return true;
        }
        this.field420[n][n2][n3] = -Scene_drawnCount;
        return false;
    }

    /*
     * Exception decompiling
     */
    @ObfuscatedName(value="bd")
    @Export(value="Scene_buildVisiblityMap")
    public static void Scene_buildVisiblityMap(int[] var0, int var1_1, int var2_2, int var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[UNCONDITIONALDOLOOP]], but top level block is 3[UNCONDITIONALDOLOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    @ObfuscatedName(value="bx")
    @Export(value="containsBounds")
    static boolean containsBounds(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (n2 < n3 && n2 < n4 && n2 < n5) {
            return false;
        }
        if (n2 > n3 && n2 > n4 && n2 > n5) {
            return false;
        }
        if (n < n6 && n < n7 && n < n8) {
            return false;
        }
        if (n > n6 && n > n7 && n > n8) {
            return false;
        }
        int n9 = (n2 - n3) * (n7 - n6) - (n - n6) * (n4 - n3);
        n4 = (n8 - n7) * (n2 - n4) - (n - n7) * (n5 - n4);
        n = (n6 - n8) * (n2 - n5) - (n3 - n5) * (n - n8);
        if (n9 != 0) {
            return n9 < 0 ? n4 <= 0 && n <= 0 : n4 >= 0 && n >= 0;
        }
        if (n4 != 0) {
            return n4 < 0 ? n <= 0 : n >= 0;
        }
        return true;
    }

    @ObfuscatedName(value="ax")
    @Export(value="Scene_addOccluder")
    public static void Scene_addOccluder(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        Occluder occluder = new Occluder();
        occluder.minTileX = n3 / 128;
        occluder.maxTileX = n4 / 128;
        occluder.minTileY = n5 / 128;
        occluder.maxTileY = n6 / 128;
        occluder.type = n2;
        occluder.minX = n3;
        occluder.maxX = n4;
        occluder.minZ = n5;
        occluder.maxZ = n6;
        occluder.minY = n7;
        occluder.maxY = n8;
        Occluder[] arroccluder = field399[n];
        int[] arrn = Scene_planeOccluderCounts;
        n2 = arrn[n];
        arrn[n] = n2 + 1;
        arroccluder[n2] = occluder;
    }

    @ObfuscatedName(value="bc")
    static boolean method679(int n, int n2, int n3) {
        int n4 = field384;
        int n5 = field383;
        int n6 = n3 * field383 - n * field384 >> 16;
        int n7 = field393 * n2 + n6 * field386 >> 16;
        int n8 = field386;
        int n9 = field393;
        if (n7 >= 50) {
            if (n7 > 3500) {
                return false;
            }
            n = (n4 * n3 + n * n5 >> 16) * 128 / n7 + Scene_viewportXCenter;
            n2 = (n8 * n2 - n6 * n9 >> 16) * 128 / n7 + Scene_viewportYCenter;
            if (n >= Scene_viewportXMin && n <= Scene_viewportXMax && n2 >= Scene_viewportYMin) {
                return n2 <= Scene_viewportYMax;
            }
            return false;
        }
        return false;
    }
}

