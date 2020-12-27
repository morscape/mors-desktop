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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ck")
@Implements(value="WorldMapRegion")
public class WorldMapRegion {
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lgt;")
    @Export(value="WorldMapRegion_cachedSprites")
    static DemotingHashTable WorldMapRegion_cachedSprites;
    @ObfuscatedName(value="gg")
    @ObfuscatedSignature(descriptor="Lek;")
    static class384 field594;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lfz;")
    static class300 field587;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfj;")
    static class72 field591;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-175569447)
    @Export(value="regionY")
    int regionY;
    @ObfuscatedName(value="af")
    @Export(value="worldMapData1List")
    LinkedList worldMapData1List;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-178608039)
    @Export(value="regionX")
    int regionX;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=934391045)
    @Export(value="pixelsPerTile")
    int pixelsPerTile;
    @ObfuscatedName(value="an")
    @Export(value="icon0List")
    List icon0List;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-21211389)
    @Export(value="backgroundColor")
    int backgroundColor;
    @ObfuscatedName(value="aw")
    @Export(value="fonts")
    final HashMap fonts;
    @ObfuscatedName(value="ay")
    @Export(value="iconMap")
    HashMap iconMap;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lcb;")
    @Export(value="worldMapData_0")
    class270 worldMapData_0;

    static {
        field587 = new class300();
        field591 = field587.vmethod11005();
        WorldMapRegion_cachedSprites = new DemotingHashTable(0x2400000, 256);
    }

    WorldMapRegion(int n, int n2, int n3, HashMap hashMap) {
        this.regionX = n;
        this.regionY = n2;
        this.worldMapData1List = new LinkedList();
        this.icon0List = new LinkedList();
        this.iconMap = new HashMap();
        this.backgroundColor = 0xFF000000 | n3;
        this.fonts = hashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIILcz;I)V")
    void method1109(int n, int n2, int n3, int n4, AbstractWorldMapData abstractWorldMapData, int n5) {
        n5 = n;
        block0: while (n5 < n3 + n) {
            int n6 = n2;
            while (true) {
                if (n6 < n2 + n4) {
                } else {
                    ++n5;
                    continue block0;
                }
                block2: for (int i = 0; i < abstractWorldMapData.field2360; ++i) {
                    WorldMapDecoration[] arrworldMapDecoration = abstractWorldMapData.decorations[i][n5][n6];
                    if (arrworldMapDecoration == null || arrworldMapDecoration.length == 0) continue;
                    for (int j = 0; j < arrworldMapDecoration.length; ++j) {
                        ObjectDefinition objectDefinition = AbstractWorldMapIcon.getObjectDefinition(arrworldMapDecoration[j].objectDefinitionId);
                        if (!FontName.method6393(objectDefinition, (byte)-1)) {
                            continue;
                        }
                        this.getIcon(objectDefinition, i, n5, n6, abstractWorldMapData);
                        break block2;
                    }
                }
                ++n6;
            }
            break;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(IILcz;I)V")
    @Export(value="drawNonLinkMapIcons")
    void drawNonLinkMapIcons(int n, int n2, AbstractWorldMapData abstractWorldMapData, int n3) {
        n3 = 0;
        while (n3 < abstractWorldMapData.field2360) {
            WorldMapDecoration[] arrworldMapDecoration = abstractWorldMapData.decorations[n3][n][n2];
            if (arrworldMapDecoration != null && arrworldMapDecoration.length != 0) {
                for (int i = 0; i < arrworldMapDecoration.length; ++i) {
                    int n4;
                    WorldMapDecoration worldMapDecoration = arrworldMapDecoration[i];
                    if (!class178.method6546(worldMapDecoration.decoration, 2020630231)) continue;
                    int n5 = AbstractWorldMapIcon.getObjectDefinition((int)worldMapDecoration.objectDefinitionId).field6887 != 0 ? -3407872 : -3355444;
                    if (worldMapDecoration.decoration == class301.field6058.field6074) {
                        this.method1132(n, n2, worldMapDecoration.rotation, n5);
                    }
                    if (worldMapDecoration.decoration == class301.field6056.field6074) {
                        this.method1132(n, n2, worldMapDecoration.rotation, -3355444);
                        this.method1132(n, n2, worldMapDecoration.rotation + 1, n5);
                    }
                    if (worldMapDecoration.decoration == class301.field6070.field6074) {
                        if (worldMapDecoration.rotation == 0) {
                            field591.vmethod10752(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), 1, n5, -1663598014);
                        }
                        if (worldMapDecoration.rotation == 1) {
                            field591.vmethod10752(this.pixelsPerTile + this.pixelsPerTile * n - 1, this.pixelsPerTile * (63 - n2), 1, n5, -1201735721);
                        }
                        if (worldMapDecoration.rotation == 2) {
                            field591.vmethod10752(this.pixelsPerTile + this.pixelsPerTile * n - 1, this.pixelsPerTile * (63 - n2) + this.pixelsPerTile - 1, 1, n5, -1520500606);
                        }
                        if (worldMapDecoration.rotation == 3) {
                            field591.vmethod10752(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2) + this.pixelsPerTile - 1, 1, n5, 2089170175);
                        }
                    }
                    if (worldMapDecoration.decoration != class301.field6055.field6074) continue;
                    if (worldMapDecoration.rotation % 2 == 0) {
                    } else {
                        for (n4 = 0; n4 < this.pixelsPerTile; ++n4) {
                            field591.vmethod10752(n4 + this.pixelsPerTile * n, n4 + this.pixelsPerTile * (63 - n2), 1, n5, -1102557957);
                        }
                        continue;
                    }
                    for (n4 = 0; n4 < this.pixelsPerTile; ++n4) {
                        field591.vmethod10752(n4 + this.pixelsPerTile * n, (64 - n2) * this.pixelsPerTile - 1 - n4, 1, n5, -1036697198);
                    }
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2131165331")
    @Export(value="initWorldMapIcon1s")
    void initWorldMapIcon1s() {
        for (AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (!(abstractWorldMapIcon instanceof WorldMapIcon_1)) continue;
            ((WorldMapIcon_1)abstractWorldMapIcon).init();
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IILcz;[Lei;I)V")
    void method1114(int n, int n2, AbstractWorldMapData abstractWorldMapData, IndexedSprite[] arrindexedSprite, int n3) {
        n3 = 0;
        while (n3 < abstractWorldMapData.field2360) {
            WorldMapDecoration[] arrworldMapDecoration = abstractWorldMapData.decorations[n3][n][n2];
            if (arrworldMapDecoration != null && arrworldMapDecoration.length != 0) {
                for (int i = 0; i < arrworldMapDecoration.length; ++i) {
                    Object object = arrworldMapDecoration[i];
                    if (!WorldMapLabelSize.method3700(((WorldMapDecoration)object).decoration, (byte)7) && !class93.method4844(((WorldMapDecoration)object).decoration, 230733407)) continue;
                    object = AbstractWorldMapIcon.getObjectDefinition(((WorldMapDecoration)object).objectDefinitionId);
                    if (((ObjectDefinition)object).field6902 == -1) continue;
                    if (((ObjectDefinition)object).field6902 != 46 && ((ObjectDefinition)object).field6902 != 52) {
                        field591.vmethod10760(arrindexedSprite[((ObjectDefinition)object).field6902], this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile * 2, this.pixelsPerTile * 2, -1680418726);
                        continue;
                    }
                    field591.vmethod10760(arrindexedSprite[((ObjectDefinition)object).field6902], this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1, -1680418726);
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lcb;Ljava/util/List;I)V", garbageValue="724097938")
    @Export(value="initWorldMapData0")
    void initWorldMapData0(class270 class2702, List list) {
        this.iconMap.clear();
        this.worldMapData_0 = class2702;
        this.addAllToIconList(list);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;Ljava/util/List;B)V", garbageValue="-4")
    @Export(value="initWorldMapData1")
    void initWorldMapData1(HashSet object, List list) {
        this.iconMap.clear();
        object = ((HashSet)object).iterator();
        while (object.hasNext()) {
            WorldMapData_1 worldMapData_1 = (WorldMapData_1)object.next();
            if (worldMapData_1.method3714(656342705) != this.regionX || worldMapData_1.method3718(-778411193) != this.regionY) continue;
            this.worldMapData1List.add(worldMapData_1);
        }
        this.addAllToIconList(list);
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="908990967")
    void method1117() {
        if (this.worldMapData_0 == null) {
            Iterator iterator = this.worldMapData1List.iterator();
            while (iterator.hasNext()) {
                ((WorldMapData_1)iterator.next()).reset();
            }
            return;
        }
        this.worldMapData_0.reset();
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lkc;S)Z", garbageValue="-18526")
    @Export(value="loadGeography")
    boolean loadGeography(AbstractArchive object) {
        this.iconMap.clear();
        Object object22 = this.worldMapData_0;
        boolean bl = true;
        if (object22 == null) {
            for (WorldMapData_1 worldMapData_1 : this.worldMapData1List) {
                worldMapData_1.loadGeography((AbstractArchive)object);
                bl &= worldMapData_1.isFullyLoaded();
            }
            if (bl) {
                for (Object object22 : this.worldMapData1List) {
                    this.method1109(((WorldMapData_1)object22).method7761(1880232598) * 8, ((WorldMapData_1)object22).method7766(2136624436) * 8, 8, 8, (AbstractWorldMapData)object22, -603472014);
                }
            }
            return bl;
        }
        this.worldMapData_0.loadGeography((AbstractArchive)object);
        if (!this.worldMapData_0.isFullyLoaded()) {
            return false;
        }
        this.method1109(0, 0, 64, 64, this.worldMapData_0, -1318589531);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lce;[Lei;Lcl;I)V")
    void method1119(WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] arrindexedSprite, WorldMapSprite iterator, int n) {
        Object object = this.worldMapData1List.iterator();
        block0: while (true) {
            int n2;
            WorldMapData_1 worldMapData_1;
            if (object.hasNext()) {
                worldMapData_1 = (WorldMapData_1)object.next();
                n = worldMapData_1.method7761(945773387) * 8;
            } else {
                iterator = this.worldMapData1List.iterator();
                block1: while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    object = (WorldMapData_1)iterator.next();
                    n = ((WorldMapData_1)object).method7761(1177978240) * 8;
                    while (true) {
                        if (n >= ((WorldMapData_1)object).method7761(702659667) * 8 + 8) continue block1;
                        for (n2 = ((WorldMapData_1)object).method7766(2089890154) * 8; n2 < ((WorldMapData_1)object).method7766(2011101411) * 8 + 8; ++n2) {
                            this.method1129(n, n2, (AbstractWorldMapData)object, worldMapScaleHandler, arrindexedSprite);
                        }
                        ++n;
                    }
                    break;
                }
            }
            while (true) {
                if (n >= worldMapData_1.method7761(647552974) * 8 + 8) continue block0;
                for (n2 = worldMapData_1.method7766(2034575457) * 8; n2 < worldMapData_1.method7766(2001375257) * 8 + 8; ++n2) {
                    this.method1124(n, n2, worldMapData_1, worldMapScaleHandler, (WorldMapSprite)((Object)iterator), (byte)-92);
                    this.method1126(n, n2, worldMapData_1, worldMapScaleHandler, -1813470747);
                }
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(Lce;[Lei;Lcl;I)V")
    void method1120(WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] arrindexedSprite, WorldMapSprite worldMapSprite, int n) {
        n = 0;
        block0: while (true) {
            int n2;
            if (n >= 64) {
                block1: for (n = 0; n < 64; ++n) {
                    n2 = 0;
                    while (true) {
                        if (n2 >= 64) {
                            continue block1;
                        }
                        this.method1129(n, n2, this.worldMapData_0, worldMapScaleHandler, arrindexedSprite);
                        ++n2;
                    }
                }
                return;
            }
            n2 = 0;
            while (true) {
                if (n2 >= 64) {
                    ++n;
                    continue block0;
                }
                this.method1124(n, n2, this.worldMapData_0, worldMapScaleHandler, worldMapSprite, (byte)-45);
                this.method1126(n, n2, this.worldMapData_0, worldMapScaleHandler, -1718392353);
                ++n2;
            }
            break;
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/util/List;I)V", garbageValue="-831262196")
    @Export(value="addAllToIconList")
    void addAllToIconList(List object) {
        object = object.iterator();
        while (object.hasNext()) {
            WorldMapIcon_0 worldMapIcon_0 = (WorldMapIcon_0)object.next();
            if (!class297.WorldMapElement_get((int)worldMapIcon_0.element).field6936 || worldMapIcon_0.coord2.x >> 6 != this.regionX || worldMapIcon_0.coord2.y >> 6 != this.regionY) continue;
            worldMapIcon_0 = new WorldMapIcon_0(worldMapIcon_0.coord2, worldMapIcon_0.coord2, worldMapIcon_0.element, this.method1131(worldMapIcon_0.element));
            this.icon0List.add(worldMapIcon_0);
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;IILfj;I)V")
    void method1122(HashSet hashSet, int n, int n2, class72 class722, int n3) {
        for (AbstractWorldMapIcon abstractWorldMapIcon : this.iconMap.values()) {
            if (!abstractWorldMapIcon.method3626(2132275350) || !hashSet.contains(n3 = abstractWorldMapIcon.vmethod10428(116489789))) continue;
            this.method1136(class297.WorldMapElement_get(n3), abstractWorldMapIcon.field2278, abstractWorldMapIcon.field2280, n, n2, class722);
        }
        this.method1140(hashSet, n, n2, class722);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIILfj;I)V", garbageValue="1636109996")
    void method1123(int n, int n2, int n3, class72 class722) {
        class384 class3842 = class69.method4105(this.regionX, this.regionY, this.pixelsPerTile);
        if (class3842 == null) {
            return;
        }
        if (n3 != this.pixelsPerTile * 64) {
            class722.vmethod10766(class3842, n, n2, n3, n3, (byte)126);
            return;
        }
        class722.vmethod10756(class3842, n, n2, 2136397428);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(IILjava/util/HashSet;ILfj;I)V")
    void method1125(int n, int n2, HashSet hashSet, int n3, class72 class722, int n4) {
        float f = (float)n3 / 64.0f;
        float f2 = f / 2.0f;
        Iterator iterator = this.iconMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            Coord coord = (Coord)object.getKey();
            n4 = (int)((float)n + (float)coord.x * f - f2);
            int n5 = (int)((float)(n2 + n3) - (float)coord.y * f - f2);
            object = (AbstractWorldMapIcon)object.getValue();
            if (object == null || !((AbstractWorldMapIcon)object).method3626(894772644)) continue;
            ((AbstractWorldMapIcon)object).field2278 = n4;
            ((AbstractWorldMapIcon)object).field2280 = n5;
            if (hashSet.contains(class297.WorldMapElement_get(((AbstractWorldMapIcon)object).vmethod10428(1058149355)).readBits(370392162))) continue;
            this.method1134((AbstractWorldMapIcon)object, n4, n5, f, class722);
        }
        return;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(IIILjava/util/HashSet;Lfj;I)V", garbageValue="853431415")
    void method1127(int n, int n2, int n3, HashSet hashSet, class72 class722) {
        HashSet hashSet2 = hashSet;
        if (hashSet == null) {
            hashSet2 = new HashSet();
        }
        this.method1125(n, n2, hashSet2, n3, class722, -1015015290);
        this.method1135(n, n2, hashSet2, n3, class722, -1269977163);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ILce;[Lei;Lkc;Lkc;B)V", garbageValue="100")
    @Export(value="drawTile")
    void drawTile(int n, WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] arrindexedSprite, AbstractArchive object, AbstractArchive object2) {
        this.pixelsPerTile = n;
        if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
            if (class69.method4105(this.regionX, this.regionY, n) == null) {
                boolean bl = this.loadGeography((AbstractArchive)object);
                if (bl & true & ((AbstractArchive)object2).tryLoadGroup(n = this.worldMapData_0 != null ? this.worldMapData_0.groupId : ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId)) {
                    object = WorldMapScaleHandler.method1022(((AbstractArchive)object2).takeFileFlat(n));
                    object2 = new class384(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
                    field587.method11026((class384)object2);
                    if (this.worldMapData_0 != null) {
                        this.method1120(worldMapScaleHandler, arrindexedSprite, (WorldMapSprite)object, 1471144494);
                    } else {
                        this.method1119(worldMapScaleHandler, arrindexedSprite, (WorldMapSprite)object, 35864481);
                    }
                    Tiles.method5561((class384)object2, this.regionX, this.regionY, this.pixelsPerTile);
                    this.method1117();
                    return;
                }
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(IILcz;Lce;[Lei;I)V", garbageValue="105051611")
    void method1129(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapScaleHandler worldMapScaleHandler, IndexedSprite[] arrindexedSprite) {
        this.drawNonLinkMapIcons(n, n2, abstractWorldMapData, -2076501327);
        this.method1114(n, n2, abstractWorldMapData, arrindexedSprite, -1663235115);
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(II)Lcm;", garbageValue="902797102")
    class42 method1131(int n) {
        class42 class422 = this.method1130(class297.WorldMapElement_get(n), -1763198130);
        return class422;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(IIIIB)V", garbageValue="8")
    void method1132(int n, int n2, int n3, int n4) {
        if ((n3 %= 4) == 0) {
            field591.vmethod10745(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, n4, (byte)11);
        }
        if (n3 == 1) {
            field591.vmethod10752(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, n4, 1046965360);
        }
        if (n3 == 2) {
            field591.vmethod10745(this.pixelsPerTile + this.pixelsPerTile * n - 1, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, n4, (byte)25);
        }
        if (n3 == 3) {
            field591.vmethod10752(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2) + this.pixelsPerTile - 1, this.pixelsPerTile, n4, 1203649751);
        }
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(Lcr;IIFLfj;I)V", garbageValue="2135498348")
    void method1134(AbstractWorldMapIcon abstractWorldMapIcon, int n, int n2, float f, class72 class722) {
        WorldMapElement worldMapElement = class297.WorldMapElement_get(abstractWorldMapIcon.vmethod10428(413366637));
        this.method1133(worldMapElement, n, n2, class722);
        this.method1137(abstractWorldMapIcon, worldMapElement, n, n2, f, class722);
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(IILjava/util/HashSet;ILfj;I)V")
    void method1135(int n, int n2, HashSet hashSet, int n3, class72 class722, int n4) {
        float f = (float)n3 / 64.0f;
        for (AbstractWorldMapIcon abstractWorldMapIcon : this.icon0List) {
            if (!abstractWorldMapIcon.method3626(1030603187)) continue;
            n3 = abstractWorldMapIcon.coord2.x * -1240603385;
            n4 = abstractWorldMapIcon.coord2.y * -37789813;
            abstractWorldMapIcon.field2278 = (int)((float)(n3 * -1172670281 % 64) * f + (float)n);
            abstractWorldMapIcon.field2280 = (int)((float)(63 - n4 * -1438658525 % 64) * f + (float)n2);
            if (hashSet.contains(abstractWorldMapIcon.vmethod10428(-2123768250))) continue;
            this.method1134(abstractWorldMapIcon, abstractWorldMapIcon.field2278, abstractWorldMapIcon.field2280, f, class722);
        }
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Lcr;Ldg;IIFLfj;S)V", garbageValue="128")
    void method1137(AbstractWorldMapIcon object, WorldMapElement worldMapElement, int n, int n2, float f, class72 class722) {
        if ((object = ((AbstractWorldMapIcon)object).getLabel()) == null) {
            return;
        }
        boolean bl = ((class42)object).field621.method3707(f, 1792371615);
        if (!bl) {
            return;
        }
        class399 class3992 = (class399)this.fonts.get(((class42)object).field621);
        class3992.method13840(((class42)object).field620, n - ((class42)object).field618 / 2, n2, ((class42)object).field618, ((class42)object).field619, worldMapElement.field6924 | 0xFF000000, 0, 1, 0, class3992.field7300 / 2, class722);
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(Ljava/util/HashSet;IILfj;B)V", garbageValue="-6")
    void method1140(HashSet hashSet, int n, int n2, class72 class722) {
        for (AbstractWorldMapIcon abstractWorldMapIcon : this.icon0List) {
            WorldMapElement worldMapElement;
            if (!abstractWorldMapIcon.method3626(1965772707) || (worldMapElement = class297.WorldMapElement_get(abstractWorldMapIcon.vmethod10428(-192885293))) == null) continue;
            if (!hashSet.contains(worldMapElement.readBits(370392162))) continue;
            this.method1136(worldMapElement, abstractWorldMapIcon.field2278, abstractWorldMapIcon.field2280, n, n2, class722);
        }
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Lek;Ldl;I)I")
    int method1141(class384 class3842, HorizontalAlignment horizontalAlignment, int n) {
        switch (horizontalAlignment.field5929) {
            default: {
                n = class3842.field7125;
                return -n;
            }
            case 1: {
                n = -class3842.field7125 / 2;
                return n;
            }
            case 0: 
        }
        return 0;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Lek;Ldm;I)I")
    int method1142(class384 class3842, VerticalAlignment verticalAlignment, int n) {
        switch (verticalAlignment.field5940) {
            default: {
                n = class3842.field7127;
                return -n;
            }
            case 2: {
                n = -class3842.field7127 / 2;
                return n;
            }
            case 1: 
        }
        return 0;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(I)Ljava/util/List;", garbageValue="863204228")
    @Export(value="icons")
    List icons() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.icon0List);
        linkedList.addAll(this.iconMap.values());
        return linkedList;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(IILcz;Lcl;I)I", garbageValue="-542094001")
    int method1112(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapSprite worldMapSprite) {
        if (abstractWorldMapData.floorUnderlayIds[0][n][n2] == 0) {
            return this.backgroundColor;
        }
        n = worldMapSprite.getTileColor(n, n2);
        return n;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(IILcz;Lce;Lcl;B)V")
    void method1124(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapScaleHandler worldMapScaleHandler, WorldMapSprite worldMapSprite, byte by) {
        by = (byte)abstractWorldMapData.floorUnderlayIds[0][n][n2];
        int n3 = abstractWorldMapData.floorOverlayIds[0][n][n2] - 1;
        if (by - 1 == -1 && n3 == -1) {
            field591.vmethod10762(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor, (byte)23);
        }
        by = n3 == -1 ? (byte)0xFF00FF : (byte)class65.method4032(n3, this.backgroundColor);
        if (n3 <= -1 || abstractWorldMapData.field2351[0][n][n2] != 0) {
            int n4 = this.method1112(n, n2, abstractWorldMapData, worldMapSprite);
            if (n3 != -1) {
                worldMapScaleHandler.method1034(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), n4, by, this.pixelsPerTile, this.pixelsPerTile, abstractWorldMapData.field2351[0][n][n2], abstractWorldMapData.field2359[0][n][n2], field591);
                return;
            }
            field591.vmethod10762(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, n4, (byte)54);
            return;
        }
        field591.vmethod10762(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, by, (byte)-12);
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(IILcz;Lce;I)V")
    void method1126(int n, int n2, AbstractWorldMapData abstractWorldMapData, WorldMapScaleHandler worldMapScaleHandler, int n3) {
        n3 = 1;
        while (n3 < abstractWorldMapData.field2360) {
            int n4 = abstractWorldMapData.floorOverlayIds[n3][n][n2] - 1;
            if (n4 > -1) {
                n4 = class65.method4032(n4, this.backgroundColor);
                if (abstractWorldMapData.field2351[n3][n][n2] == 0) {
                    field591.vmethod10762(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), this.pixelsPerTile, this.pixelsPerTile, n4, (byte)-67);
                } else {
                    worldMapScaleHandler.method1034(this.pixelsPerTile * n, this.pixelsPerTile * (63 - n2), 0, n4, this.pixelsPerTile, this.pixelsPerTile, abstractWorldMapData.field2351[n3][n][n2], abstractWorldMapData.field2359[n3][n][n2], field591);
                }
            }
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Ldg;I)Lcm;")
    class42 method1130(WorldMapElement object, int n) {
        if (((WorldMapElement)object).field6931 != null && this.fonts != null) {
            if (this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
                WorldMapLabelSize worldMapLabelSize = WorldMapLabelSize.method3699(((WorldMapElement)object).field6925, -727262641);
                if (worldMapLabelSize == null) {
                    return null;
                }
                class399 class3992 = (class399)this.fonts.get(worldMapLabelSize);
                if (class3992 == null) {
                    return null;
                }
                String[] arrstring = new String[class3992.method13838(((WorldMapElement)object).field6931, 1000000)];
                class3992.method13836(((WorldMapElement)object).field6931, null, arrstring);
                int n2 = arrstring.length * class3992.field7300 / 2;
                n = 0;
                int n3 = 0;
                while (true) {
                    if (n >= arrstring.length) {
                        object = new class42(((WorldMapElement)object).field6931, n3, n2, worldMapLabelSize);
                        return object;
                    }
                    int n4 = class3992.method13851(arrstring[n]);
                    int n5 = n3;
                    if (n4 > n3) {
                        n5 = n4;
                    }
                    ++n;
                    n3 = n5;
                }
            }
        } else {
            return null;
        }
        return null;
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(Ldg;IIIILfj;I)V", garbageValue="-2062473037")
    void method1136(WorldMapElement dualNode, int n, int n2, int n3, int n4, class72 class722) {
        if ((dualNode = dualNode.method12952(false, (byte)-110)) == null) {
            return;
        }
        class722.vmethod10761((class384)dualNode, n - ((class384)dualNode).field7125 / 2, n2 - ((class384)dualNode).field7127 / 2, 910520038);
        if (n3 % n4 < n4 / 2) {
            class722.vmethod10755(n, n2, 15, 0xFFFF00, 128, 287174095);
            class722.vmethod10758(n, n2, 7, 0xFFFFFF, -663526438);
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lde;IIILcz;S)V", garbageValue="2431")
    @Export(value="getIcon")
    void getIcon(ObjectDefinition object, int n, int n2, int n3, AbstractWorldMapData object2) {
        Coord coord = new Coord(n, n2 + this.regionX * 64, this.regionY * 64 + n3);
        if (this.worldMapData_0 != null) {
            object2 = new Coord(this.worldMapData_0.field2352 + n, n2 + this.worldMapData_0.field2355 * 4096, this.worldMapData_0.field2350 * 4096 + n3);
        } else {
            object2 = (WorldMapData_1)object2;
            object2 = new Coord(((AbstractWorldMapData)object2).field2352 + n, ((AbstractWorldMapData)object2).field2355 * 4096 + n2 + ((WorldMapData_1)object2).method7760((byte)0) * 8, ((AbstractWorldMapData)object2).field2350 * 4096 + n3 + ((WorldMapData_1)object2).method7762(817114161) * 8);
        }
        if (((ObjectDefinition)object).transforms != null) {
            object = new WorldMapIcon_1((Coord)object2, coord, ((ObjectDefinition)object).id, this);
        } else {
            object = class297.WorldMapElement_get(((ObjectDefinition)object).mapIconId);
            object = new WorldMapIcon_0((Coord)object2, coord, ((WorldMapElement)object).objectId, this.method1130((WorldMapElement)object, -1915265451));
        }
        if (class297.WorldMapElement_get((int)object.vmethod10428((int)-437055724)).field6936) {
            this.iconMap.put(new Coord(0, n2, n3), object);
        }
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(Ldg;IILfj;B)V", garbageValue="0")
    void method1133(WorldMapElement worldMapElement, int n, int n2, class72 class722) {
        class384 class3842 = worldMapElement.method12952(false, (byte)0);
        if (class3842 != null) {
            class722.vmethod10761(class3842, this.method1141(class3842, worldMapElement.horizontalAlignment, 766466423) + n, this.method1142(class3842, worldMapElement.verticalAlignment, 1345852093) + n2, 1412996665);
        }
    }
}

