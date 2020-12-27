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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pe")
@Implements(value="WorldMap")
public class WorldMap {
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Llf;")
    static final FontName field4211;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Llf;")
    static final FontName field4215;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Llf;")
    static final FontName field4209;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="WorldMap_groundArchive")
    AbstractArchive WorldMap_groundArchive;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1609905475)
    int field4218 = 1;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-1082150325)
    int field4220 = 1;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lkc;")
    AbstractArchive field4221;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="WorldMap_geographyArchive")
    AbstractArchive WorldMap_geographyArchive;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Loc;")
    class399 field4223;
    @ObfuscatedName(value="an")
    @Export(value="fonts")
    HashMap fonts;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lds;")
    WorldMapArea field4225;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Lds;")
    @Export(value="currentMapArea")
    WorldMapArea currentMapArea;
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Lds;")
    WorldMapArea field4227;
    @ObfuscatedName(value="au")
    float field4229;
    @ObfuscatedName(value="aw")
    HashMap field4231;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="[Lei;")
    @Export(value="mapSceneSprites")
    IndexedSprite[] mapSceneSprites;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lcv;")
    @Export(value="worldMapManager")
    WorldMapManager worldMapManager;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=972241595)
    int field4236 = 1;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=-810680801)
    int field4239 = -1;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-1001785649)
    int field4240 = 3;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=620020399)
    int field4242 = -1;
    @ObfuscatedName(value="bn")
    HashSet field4246;
    @ObfuscatedName(value="bp")
    float field4247;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=2144432869)
    int field4248 = 50;
    @ObfuscatedName(value="br")
    boolean field4249 = false;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=714754801)
    @Export(value="maxFlashCount")
    int maxFlashCount = 1;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-1909728603)
    int field4255 = 0;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=-939293837)
    int field4259 = -1;
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=1807814921)
    int field4262 = -1;
    @ObfuscatedName(value="co")
    HashSet field4263;
    @ObfuscatedName(value="cv")
    @ObfuscatedGetter(intValue=-588111153)
    int field4266;
    @ObfuscatedName(value="cw")
    @Export(value="menuOpcodes")
    final int[] menuOpcodes;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=-1593882191)
    @Export(value="centerTileY")
    int centerTileY;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lpj;")
    @Export(value="cacheLoader")
    WorldMapArchiveLoader cacheLoader;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-1112127371)
    @Export(value="centerTileX")
    int centerTileX;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=-1943753595)
    int field4235 = 1;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-733842297)
    int field4241 = -1;
    @ObfuscatedName(value="bl")
    @Export(value="enabledCategories")
    HashSet enabledCategories;
    @ObfuscatedName(value="bs")
    boolean field4250 = false;
    @ObfuscatedName(value="bu")
    @Export(value="enabledElementIds")
    HashSet enabledElementIds;
    @ObfuscatedName(value="bv")
    boolean field4253 = true;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=2038413117)
    int field4256 = 1;
    @ObfuscatedName(value="cb")
    int field4257 = 1272107965;
    @ObfuscatedName(value="cd")
    public boolean field4258 = false;
    @ObfuscatedName(value="cg")
    Iterator field4260;
    @ObfuscatedName(value="ch")
    @ObfuscatedSignature(descriptor="Lek;")
    class384 field4261;
    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="Laf;")
    Coord field4265 = null;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=644748891)
    int field4238 = -1;
    @ObfuscatedName(value="bw")
    @Export(value="enabledElements")
    HashSet enabledElements = new HashSet();
    @ObfuscatedName(value="bk")
    HashSet field4243 = null;
    @ObfuscatedName(value="cp")
    List field4264;

    static {
        field4209 = FontName.FontName_verdana11;
        field4211 = FontName.FontName_verdana13;
        field4215 = FontName.FontName_verdana15;
    }

    public WorldMap() {
        this.enabledCategories = new HashSet();
        this.enabledElementIds = new HashSet();
        this.field4246 = new HashSet();
        this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
        this.field4263 = new HashSet();
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="40")
    @Export(value="stopCurrentFlashes")
    final void stopCurrentFlashes() {
        this.maxFlashCount = 1;
        this.field4256 = 1;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IIIIILfj;I)V")
    void method7167(int n, int n2, int n3, int n4, int n5, class72 class722, int n6) {
        n6 = n3 / 2 + n;
        int n7 = n4 / 2 + n2 - 18 - 20;
        class722.vmethod10762(n, n2, n3, n4, 0, (byte)-23);
        class722.method4255(n6 - 152, n7, 304, 34, -65536);
        class722.vmethod10762(n6 - 150, n7 + 2, n5 * 3, 30, -65536, (byte)-2);
        this.field4223.method13844("Loading...", n6, n7 + 20, -1, -1, class722);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IIZI)V", garbageValue="-942447749")
    @Export(value="setWorldMapPosition")
    final void setWorldMapPosition(int n, int n2, boolean bl) {
        this.centerTileX = n;
        this.centerTileY = n2;
        class363.currentTimeMillis();
        this.stopCurrentFlashes();
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-1726527713")
    @Export(value="jump")
    void jump(int n, int n2, int n3) {
        if (this.currentMapArea != null) {
            int[] arrn;
            int[] arrn2 = arrn = this.currentMapArea.position(n, n2, n3);
            if (arrn == null) {
                arrn2 = this.currentMapArea.position(this.currentMapArea.method3764((byte)53), this.currentMapArea.method3779(-260207568), this.currentMapArea.method3766(-1241541169));
            }
            this.setWorldMapPosition(arrn2[0] - this.currentMapArea.method3773(-428252093) * 64, arrn2[1] - this.currentMapArea.method3782(1195810445) * 64, true);
            this.field4220 = 1;
            this.field4218 = 1;
            this.field4247 = this.field4229 = this.getZoomFromPercentage(this.currentMapArea.method3775(1793361247));
            this.field4264 = null;
            this.field4260 = null;
            this.worldMapManager.clearIcons();
            return;
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="1")
    @Export(value="initializeWorldMapManager")
    void initializeWorldMapManager(WorldMapArea worldMapArea) {
        this.currentMapArea = worldMapArea;
        this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
        this.cacheLoader.reset(this.currentMapArea.getOrigin());
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(II)F", garbageValue="-1976563219")
    @Export(value="getZoomFromPercentage")
    float getZoomFromPercentage(int n) {
        if (n == 25) {
            return 1.0f;
        }
        if (n == 37) {
            return 1.5f;
        }
        if (n == 50) {
            return 2.0f;
        }
        if (n == 75) {
            return 3.0f;
        }
        if (n == 100) {
            return 4.0f;
        }
        return 8.0f;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="-10")
    @Export(value="setCurrentMapArea")
    void setCurrentMapArea(WorldMapArea worldMapArea) {
        if (this.currentMapArea == null || worldMapArea != this.currentMapArea) {
            this.initializeWorldMapManager(worldMapArea);
            this.jump(-1, -1, -1);
            return;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IIIIILfj;B)V")
    public void method7190(int n, int n2, int n3, int n4, int n5, class72 class722, byte by) {
        int n6;
        block10: {
            block12: {
                int n7;
                int[] arrn;
                block11: {
                    arrn = new int[4];
                    class722.method4245(arrn);
                    by = (byte)(n3 + n);
                    n7 = n2 + n4;
                    class722.method4238(n, n2, by, n7, -448408016);
                    class722.vmethod10762(n, n2, n3, n4, 0, (byte)22);
                    n6 = this.cacheLoader.method7369((byte)34);
                    if (n6 < 100) break block10;
                    if (this.worldMapManager.isLoaded()) break block11;
                    this.worldMapManager.method3655(this.field4221, this.currentMapArea.getOrigin(), Client.field4738, 1528207463);
                    if (!this.worldMapManager.isLoaded()) break block12;
                }
                if (this.field4243 != null) {
                    --this.field4235;
                    if (this.field4235 * -1 % this.field4248 == 0) {
                        this.field4235 = 0;
                        --this.field4236;
                    }
                    if (this.field4236 * -1 >= this.field4240 && !this.field4249) {
                        this.field4243 = null;
                    }
                }
                n6 = (int)Math.ceil((float)n3 / this.field4229);
                int n8 = (int)Math.ceil((float)n4 / this.field4229);
                this.worldMapManager.method3653(this.centerTileX - n6 / 2, this.centerTileY - n8 / 2, n6 / 2 + this.centerTileX, n8 / 2 + this.centerTileY, n, n2, by, n7, class722, -101726586);
                if (!this.field4250) {
                    boolean bl;
                    if (n5 - this.field4255 <= 100) {
                        bl = false;
                    } else {
                        this.field4255 = n5;
                        bl = true;
                    }
                    this.worldMapManager.method3668(this.centerTileX - n6 / 2, this.centerTileY - n8 / 2, n6 / 2 + this.centerTileX, n8 / 2 + this.centerTileY, n, n2, by, n7, this.field4246, this.field4243, this.field4235 * -1, this.field4248, bl, class722, 2131689873);
                }
                this.method7186(n, n2, n3, n4, n6, n8, class722, 831486483);
                if (class286.method10518(1014450169) && this.field4258 && this.field4265 != null) {
                    class399 class3992 = this.field4223;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Coord: ");
                    stringBuilder.append(this.field4265);
                    class3992.method13830(stringBuilder.toString(), class722.field2530 + 10, class722.field2531 + 20, 0xFFFF00, -1, class722);
                }
                this.field4241 = n6;
                this.field4239 = n8;
                this.field4238 = n;
                this.field4242 = n2;
                class722.method4240(arrn);
                return;
            }
            return;
        }
        this.method7167(n, n2, n3, n4, n6, class722, 1711336008);
    }

    @ObfuscatedName(value="bd")
    public int method7194(int n) {
        if (this.currentMapArea != null) {
            n = this.centerTileY * -1204723887;
            int n2 = this.currentMapArea.method3782(1176764778);
            return n2 * 64 + n * -1593882191;
        }
        return -1;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IIIILfj;B)V", garbageValue="-85")
    @Export(value="getIconsForTiles")
    public void getIconsForTiles(int n, int n2, int n3, int n4, class72 class722) {
        block2: {
            block4: {
                block3: {
                    if (!this.cacheLoader.isLoaded()) break block2;
                    if (this.worldMapManager.isLoaded()) break block3;
                    this.worldMapManager.method3655(this.field4221, this.currentMapArea.getOrigin(), Client.field4738, 1217366668);
                    if (!this.worldMapManager.isLoaded()) break block4;
                }
                this.worldMapManager.method3652(n, n2, n3, n4, this.field4243, this.field4235 * -1, this.field4248, class722);
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;Lkc;Loc;Ljava/util/HashMap;[Lei;I)V")
    public void method7175(AbstractArchive object, AbstractArchive object2, AbstractArchive object3, class399 class3992, HashMap hashMap, IndexedSprite[] arrindexedSprite, int n) {
        this.mapSceneSprites = arrindexedSprite;
        this.field4221 = object;
        this.WorldMap_geographyArchive = object2;
        this.WorldMap_groundArchive = object3;
        this.field4223 = class3992;
        this.fonts = new HashMap();
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, hashMap.get(field4209));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, hashMap.get(field4211));
        this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, hashMap.get(field4215));
        this.cacheLoader = new WorldMapArchiveLoader((AbstractArchive)object);
        int n2 = this.field4221.method6153(class51.field2376.field2380, -431289619);
        object = this.field4221.getGroupFileIds(n2);
        this.field4231 = new HashMap(((Object)object).length);
        n = 0;
        while (true) {
            if (n < ((Object)object).length) {
                object2 = new Buffer(this.field4221.takeFile(n2, (int)object[n]));
                object3 = new WorldMapArea();
                ((WorldMapArea)object3).method3767((Buffer)object2, (int)object[n], -2091291561);
                this.field4231.put(((WorldMapArea)object3).getOrigin(), object3);
                if (((WorldMapArea)object3).getIsMain()) {
                    this.field4227 = object3;
                }
            } else {
                this.setCurrentMapArea(this.field4227);
                this.field4225 = null;
                return;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="at")
    boolean method7184(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.field4261 != null) {
            if (this.field4261.field7125 == n) {
                if (this.field4261.field7127 == n2) {
                    if (this.worldMapManager.field2308 == this.field4266) {
                        n7 = Client.field4988;
                        int n8 = this.field4257;
                        if (n7 * -1846693133 != n8 * -943751061) {
                            return true;
                        }
                        if (n3 <= 0) {
                            if (n4 > 0) {
                                return true;
                            }
                            if (n3 + n >= n5) {
                                return n2 + n4 < n6;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            } else {
                return true;
            }
            return true;
        }
        return true;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IIIIIILfj;I)V")
    void method7186(int n, int n2, int n3, int n4, int n5, int n6, class72 class722, int n7) {
        if (class11.field264 != null) {
            int n8 = 512 / (this.worldMapManager.field2308 * 2);
            int n9 = n3 + 512;
            int n10 = n4 + 512;
            int n11 = this.method7201(1644016044);
            int n12 = n5 / 2;
            int n13 = this.method7194(-2060304769) - n6 / 2 - n8;
            n7 = this.worldMapManager.field2308 * -436215053;
            int n14 = n8 + (n11 - n12 - n8);
            n12 = n - n7 * (n14 - this.field4259) * -239663557;
            int n15 = n2 - this.worldMapManager.field2308 * (n8 - (n13 - this.field4262));
            n11 = n12;
            n7 = n15;
            if (this.method7184(n9, n10, n12, n15, n3, n4, 1577543080)) {
                if (this.field4261 != null && this.field4261.field7125 == n9 && this.field4261.field7127 == n10) {
                    Arrays.fill(this.field4261.field7129, 0);
                } else {
                    this.field4261 = new class384(n9, n10);
                }
                this.field4259 = this.method7201(1219505964) - n5 / 2 - n8;
                this.field4262 = this.method7194(1435053508) - n6 / 2 - n8;
                this.field4266 = this.worldMapManager.field2308;
                class11.field264.method7021(this.field4259, this.field4262, this.field4261, this.field4266, (byte)18);
                this.field4257 = Client.field4988 * 1554946457;
                n11 = n - this.worldMapManager.field2308 * (n14 - this.field4259);
                n7 = n2 - this.worldMapManager.field2308 * (n8 - (n13 - this.field4262));
            }
            class722.vmethod10751(n, n2, n3, n4, 0, 128, -1473506354);
            class722.vmethod10749(this.field4261, n11, n7, 192, -740300520);
        }
    }

    @ObfuscatedName(value="bk")
    public int method7201(int n) {
        if (this.currentMapArea != null) {
            n = this.centerTileX * -1543551011;
            int n2 = this.currentMapArea.method3773(-1502814631);
            return n * -1112127371 + n2 * 64;
        }
        return -1;
    }
}

