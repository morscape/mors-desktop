/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  ck
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
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

@ObfuscatedName(value="cv")
@Implements(value="WorldMapManager")
public final class WorldMapManager {
    @ObfuscatedName(value="fq")
    static int field2293;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="geographyArchive")
    final AbstractArchive geographyArchive;
    @ObfuscatedName(value="ae")
    boolean field2297 = false;
    @ObfuscatedName(value="af")
    @Export(value="fonts")
    final HashMap fonts;
    @ObfuscatedName(value="ah")
    @Export(value="icons")
    HashMap icons;
    @ObfuscatedName(value="aj")
    @Export(value="scaleHandlers")
    HashMap scaleHandlers = new HashMap();
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="[Lei;")
    @Export(value="mapSceneSprites")
    IndexedSprite[] mapSceneSprites;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1883703569)
    int field2304;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1180595371)
    int field2305;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-822197255)
    int field2306;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="[[Lck;")
    WorldMapRegion[][] field2307;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=-239663557)
    public int field2308 = 0;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1440113311)
    int field2310;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lcd;")
    class272 field2300;
    @ObfuscatedName(value="ak")
    @Export(value="loaded")
    boolean loaded = false;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lek;")
    class384 field2309;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="groundArchive")
    final AbstractArchive groundArchive;

    @ObfuscatedSignature(descriptor="([Lei;Ljava/util/HashMap;Lkc;Lkc;)V")
    public WorldMapManager(IndexedSprite[] arrindexedSprite, HashMap hashMap, AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        this.mapSceneSprites = arrindexedSprite;
        this.fonts = hashMap;
        this.geographyArchive = abstractArchive;
        this.groundArchive = abstractArchive2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1052286124")
    @Export(value="clearIcons")
    public final void clearIcons() {
        this.icons = null;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(III)F", garbageValue="892377931")
    @Export(value="getPixelsPerTile")
    float getPixelsPerTile(int n, int n2) {
        float f = (float)n / (float)n2;
        if (f > 8.0f) {
            return 8.0f;
        }
        if (f < 1.0f) {
            return 1.0f;
        }
        float f2 = Math.round(f);
        float f3 = Math.abs(f2 - f);
        if (f3 < 0.05f) {
            return f2;
        }
        return f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIILjava/util/HashSet;IILfj;B)V", garbageValue="72")
    public void method3652(int var1_1, int var2_2, int var3_3, int var4_4, HashSet var5_5, int var6_6, int var7_7, class72 var8_8) {
        if (this.field2309 == null) {
            return;
        }
        var8_8.vmethod10763(this.field2309, var1_1, var2_2, var3_3, var4_4, 363474425);
        if (var6_6 <= 0) return;
        if (var6_6 % var7_7 >= var7_7 / 2) {
            return;
        }
        if (this.icons == null) {
            this.method3646((byte)119);
        }
        var5_5 = var5_5.iterator();
        block0: while (true) lbl-1000:
        // 3 sources

        {
            if (var5_5.hasNext() == false) return;
            var6_6 = (Integer)var5_5.next();
            var9_9 = (List)this.icons.get(var6_6);
            if (var9_9 == null) ** GOTO lbl-1000
            var9_9 = var9_9.iterator();
            while (true) {
                if (!var9_9.hasNext()) continue block0;
                var10_10 = (AbstractWorldMapIcon)var9_9.next();
                var8_8.vmethod10758(var3_3 * (var10_10.coord2.x - this.field2306 * 4096) / (this.field2305 * 4096) + var1_1, var4_4 - (var10_10.coord2.y - this.field2304 * 4096) * var4_4 / (this.field2310 * 4096) + var2_2, 2, 0xFFFF00, -206820887);
            }
            break;
        }
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IIIII)Ldj;")
    class50 method3654(int n, int n2, int n3, int n4, int n5) {
        class50 class502 = new class50(this);
        int n6 = this.field2306 * -253456384;
        int n7 = this.field2304 * 276762624;
        int n8 = this.field2306 * -253456384;
        n5 = this.field2304 * 276762624;
        n = (n6 * -822197255 + n) / 64;
        n2 = (n2 + n7 * 1883703569) / 64;
        n3 = (n3 + n8 * -822197255) / 64;
        n4 = (n5 * 1883703569 + n4) / 64;
        class502.field2371 = n3 - n + 1;
        class502.field2369 = n4 - n2 + 1;
        class502.field2370 = n - this.field2300.method3773(1060297327);
        class502.field2372 = n2 - this.field2300.method3782(1665772763);
        if (class502.field2370 < 0) {
            class502.field2371 += class502.field2370;
            class502.field2370 = 0;
        }
        if (class502.field2370 > this.field2307.length - class502.field2371) {
            class502.field2371 = this.field2307.length - class502.field2370;
        }
        if (class502.field2372 < 0) {
            class502.field2369 += class502.field2372;
            class502.field2372 = 0;
        }
        if (class502.field2372 > this.field2307[0].length - class502.field2369) {
            class502.field2369 = this.field2307[0].length - class502.field2372;
        }
        class502.field2371 = Math.min(class502.field2371, this.field2307.length);
        class502.field2369 = Math.min(class502.field2369, this.field2307[0].length);
        return class502;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-972100598")
    @Export(value="isLoaded")
    public boolean isLoaded() {
        boolean bl = this.loaded;
        return bl;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIIIIIIILfj;I)V")
    public final void method3653(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, class72 class722, int n9) {
        class50 class502 = this.method3654(n, n2, n3, n4, -640724947);
        float f = this.getPixelsPerTile(n7 - n5, n3 - n);
        this.field2308 = n6 = (int)Math.ceil(f);
        if (!this.scaleHandlers.containsKey(n6)) {
            WorldMapScaleHandler worldMapScaleHandler = new WorldMapScaleHandler(n6);
            worldMapScaleHandler.init6();
            this.scaleHandlers.put(n6, worldMapScaleHandler);
        }
        n7 = class502.field2371 * 1803688245;
        n9 = class502.field2370 * -708881141;
        int n10 = class502.field2369 * -1047369843;
        int n11 = class502.field2372 * -1688438399;
        n3 = class502.field2370;
        block0: while (true) {
            if (n3 > n9 * 754634403 + n7 * 464531741 - 1) {
                n6 = (int)(f * 64.0f);
                n7 = this.field2306 * -253456384;
                n9 = this.field2304 * 276762624;
                n3 = class502.field2370;
                block1: while (true) {
                    if (n3 >= class502.field2370 + class502.field2371) {
                        return;
                    }
                    n4 = class502.field2372;
                    while (true) {
                        if (n4 >= class502.field2369 + class502.field2372) {
                            ++n3;
                            continue block1;
                        }
                        this.field2307[n3][n4].method1123(n5 + (this.field2307[n3][n4].regionX * 64 - (n7 * -822197255 + n)) * n6 / 64, n8 - (this.field2307[n3][n4].regionY * 64 - (n2 + n9 * 1883703569) + 64) * n6 / 64, n6, class722);
                        ++n4;
                    }
                    break;
                }
            }
            n4 = class502.field2372;
            while (true) {
                if (n4 > n10 * -238210235 + n11 * -1259485567 - 1) {
                    ++n3;
                    continue block0;
                }
                this.field2307[n3][n4].drawTile(n6, (WorldMapScaleHandler)this.scaleHandlers.get(n6), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
                ++n4;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Ljava/lang/String;ZI)V")
    public void method3655(AbstractArchive var1_1, String var2_3, boolean var3_4, int var4_5) {
        if (this.field2297) {
            return;
        }
        this.loaded = false;
        this.field2297 = true;
        System.nanoTime();
        var4_5 = var1_1.getFileId(var1_1.method6153(class51.field2376.field2380, -1598724668), var2_3);
        var10_6 = new Buffer(var1_1.method6140(class51.field2376.field2380, var2_3, (byte)35));
        var11_7 = new Buffer(var1_1.method6140(class51.field2373.field2380, var2_3, (byte)48));
        System.nanoTime();
        System.nanoTime();
        this.field2300 = new class272();
        try {
            this.field2300.method7784(var10_6, (Buffer)var11_7, var4_5, var3_4, -151505119);
        }
        catch (IllegalStateException var1_2) {
            return;
        }
        this.field2300.method3779(1394394472);
        this.field2300.method3764((byte)61);
        this.field2300.method3766(-1038868275);
        this.field2306 = this.field2300.method3773(-1020528892) * 64;
        this.field2304 = this.field2300.method3782(-107728487) * 64;
        this.field2305 = (this.field2300.method3772(-2060447762) - this.field2300.method3773(200854594) + 1) * 64;
        this.field2310 = (this.field2300.method3777(443007231) - this.field2300.method3782(1387842647) + 1) * 64;
        var6_8 = this.field2300.method3772(-2060447762) - this.field2300.method3773(2033700006) + 1;
        var7_9 = this.field2300.method3777(-1030937879) - this.field2300.method3782(-515277534) + 1;
        System.nanoTime();
        System.nanoTime();
        class17.method342();
        this.field2307 = (WorldMapRegion[][])Array.newInstance(ck.class, new int[]{var6_8, var7_9});
        for (Object var11_7 : this.field2300.field4716) {
            var4_5 = var11_7.regionX;
            var5_10 = var11_7.regionY;
            var8_11 = var4_5 - this.field2300.method3773(1413362458);
            var9_12 = var5_10 - this.field2300.method3782(2025073952);
            this.field2307[var8_11][var9_12] = new WorldMapRegion(var4_5, var5_10, this.field2300.method3780((byte)99), this.fonts);
            this.field2307[var8_11][var9_12].initWorldMapData0((class270)var11_7, this.field2300.field4715);
        }
        var4_5 = 0;
        ** GOTO lbl56
lbl-1000:
        // 2 sources

        {
            if (var5_10 < var7_9) {
                if (this.field2307[var4_5][var5_10] == null) {
                    this.field2307[var4_5][var5_10] = new WorldMapRegion(this.field2300.method3773(-751494311) + var4_5, this.field2300.method3782(1699333632) + var5_10, this.field2300.method3780((byte)63), this.fonts);
                    this.field2307[var4_5][var5_10].initWorldMapData1(this.field2300.field4714, this.field2300.field4715);
                }
                ++var5_10;
                continue;
            }
            ++var4_5;
lbl56:
            // 2 sources

            if (var4_5 >= var6_8) break;
            var5_10 = 0;
            ** while (true)
        }
        System.nanoTime();
        System.nanoTime();
        if (var1_1.method6137(class51.field2375.field2380, var2_3, -1882456912)) {
            this.field2309 = HorizontalAlignment.method10448(var1_1.method6140(class51.field2375.field2380, var2_3, (byte)99));
        }
        System.nanoTime();
        var1_1.setMaxFlashCount(583811186);
        var1_1.method6148((byte)-101);
        this.loaded = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZLfj;I)V")
    public final void method3668(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, HashSet hashSet, HashSet hashSet2, int n9, int n10, boolean bl, class72 class722, int n11) {
        class50 class502 = this.method3654(n, n2, n3, n4, 1321292298);
        n6 = (int)(this.getPixelsPerTile(n7 - n5, n3 - n) * 64.0f);
        n7 = this.field2306 * -253456384;
        n11 = this.field2304 * 276762624;
        n3 = class502.field2370;
        block0: while (true) {
            if (n3 >= class502.field2371 + class502.field2370) {
                if (hashSet2 == null || n9 <= 0) return;
                n = class502.field2370;
                block1: while (true) {
                    if (n >= class502.field2371 + class502.field2370) {
                        return;
                    }
                    n2 = class502.field2372;
                    while (true) {
                        if (n2 >= class502.field2372 + class502.field2369) {
                            ++n;
                            continue block1;
                        }
                        this.field2307[n][n2].method1122(hashSet2, n9, n10, class722, -1106730820);
                        ++n2;
                    }
                    break;
                }
            }
            n4 = class502.field2372;
            while (true) {
                if (n4 >= class502.field2372 + class502.field2369) {
                    ++n3;
                    continue block0;
                }
                if (bl) {
                    this.field2307[n3][n4].initWorldMapIcon1s();
                }
                this.field2307[n3][n4].method1127(n5 + (this.field2307[n3][n4].regionX * 64 - (n7 * -822197255 + n)) * n6 / 64, n8 - (this.field2307[n3][n4].regionY * 64 - (n2 + n11 * 1883703569) + 64) * n6 / 64, n6, hashSet, class722);
                ++n4;
            }
            break;
        }
    }

    @ObfuscatedName(value="ab")
    void method3646(byte by) {
        if (this.icons == null) {
            this.icons = new HashMap();
        }
        this.icons.clear();
        by = 0;
        block0: while (by < this.field2307.length) {
            int n = 0;
            while (true) {
                Iterator iterator;
                if (n < this.field2307[by].length) {
                    iterator = this.field2307[by][n].icons().iterator();
                } else {
                    by = (byte)(by + 1);
                    continue block0;
                }
                while (iterator.hasNext()) {
                    AbstractWorldMapIcon abstractWorldMapIcon = (AbstractWorldMapIcon)iterator.next();
                    if (!abstractWorldMapIcon.method3626(623253066)) continue;
                    int n2 = abstractWorldMapIcon.vmethod10428(-1835403808);
                    if (!this.icons.containsKey(n2)) {
                        LinkedList<AbstractWorldMapIcon> linkedList = new LinkedList<AbstractWorldMapIcon>();
                        linkedList.add(abstractWorldMapIcon);
                        this.icons.put(n2, linkedList);
                        continue;
                    }
                    ((List)this.icons.get(n2)).add(abstractWorldMapIcon);
                }
                ++n;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;ZB)[B", garbageValue="85")
    public static byte[] method3643(Object object, boolean bl) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof byte[])) {
            if (object instanceof AbstractByteArrayCopier) {
                return ((AbstractByteArrayCopier)object).get();
            }
            throw new IllegalArgumentException();
        }
        object = (byte[])object;
        if (!bl) {
            return object;
        }
        return class52.method3749((byte[])object, -931245351);
    }

    @ObfuscatedName(value="as")
    public static int method3642(int n, int n2, int n3) {
        n3 = n >>> 31;
        n = (n + n3) / n2;
        return n - n3;
    }
}

