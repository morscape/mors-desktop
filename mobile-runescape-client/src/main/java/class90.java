/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gh")
public class class90 {
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1714155177)
    @Export(value="musicTrackGroupId")
    static int musicTrackGroupId = 0;
    @ObfuscatedName(value="ft")
    @ObfuscatedSignature(descriptor="Ljn;")
    static UrlRequester field2701;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Lem;", garbageValue="-1026064838")
    @Export(value="SpotAnimationDefinition_get")
    public static SpotAnimationDefinition SpotAnimationDefinition_get(int n) {
        Object object = SpotAnimationDefinition.SpotAnimationDefinition_cached;
        long l = n;
        if ((object = (SpotAnimationDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, n);
        SpotAnimationDefinition spotAnimationDefinition = new SpotAnimationDefinition();
        spotAnimationDefinition.id = n;
        if (object != null) {
            spotAnimationDefinition.decodeNext(new Buffer((byte[])object), 2146396984);
        }
        SpotAnimationDefinition.SpotAnimationDefinition_cached.put(spotAnimationDefinition, l);
        return spotAnimationDefinition;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lmi;IIIIIIB)V")
    static final void method4802(Buffer buffer, int n, int n2, int n3, int n4, int n5, int n6, byte by) {
        block10: {
            if (n2 < 0 || n2 >= 104 || n3 < 0 || n3 >= 104) {
                while (true) {
                    if ((n = buffer.method11650(-241254876)) == 0) {
                        return;
                    }
                    if (n == 1) break;
                    if (n > 49) continue;
                    buffer.method11650(237275348);
                }
                buffer.method11650(-471631717);
                return;
            }
            Tiles.field3455[n][n2][n3] = 0;
            while (true) {
                if ((by = (byte)buffer.method11650(-2145716567)) == 0) {
                    if (n != 0) {
                        Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n - 1][n2][n3] - 240;
                        return;
                    }
                    break block10;
                }
                if (by == 1) break;
                if (by > 49) {
                    if (by > 81) {
                        Tiles.field3468[n][n2][n3] = (byte)(by - 81);
                        continue;
                    }
                    Tiles.field3455[n][n2][n3] = (byte)(by - 49);
                    continue;
                }
                Tiles.field3458[n][n2][n3] = buffer.method11636(2135373065);
                byte[] arrby = Tiles.field3464[n][n2];
                by = (byte)(by - 2);
                arrby[n3] = (byte)(by / 4);
                Tiles.field3460[n][n2][n3] = (byte)(by + n6 & 3);
            }
            n4 = n5 = buffer.method11650(-716161835);
            if (n5 == 1) {
                n4 = 0;
            }
            if (n != 0) {
                Tiles.Tiles_heights[n][n2][n3] = Tiles.Tiles_heights[n - 1][n2][n3] - n4 * 8;
                return;
            }
            Tiles.Tiles_heights[0][n2][n3] = -n4 * 8;
            return;
        }
        Tiles.Tiles_heights[0][n2][n3] = -class347.method12063(n4 + (n2 + 932731), n5 + (556238 + n3), 402151132) * 8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Llp;Ljava/lang/String;Ljava/lang/String;III)V", garbageValue="-385374230")
    public static void method4804(class172 arrbufferedFile, String charSequence, String string2, int n, int n2) throws IOException {
        block4: {
            class52.field2382 = n2;
            class133.cacheGamebuild = n;
            class197.userHomeDirectory = arrbufferedFile.vmethod11991();
            class197.cacheDir = arrbufferedFile.vmethod11994((String)charSequence, string2, n);
            try {
                class197.field3918 = System.getProperty("os.name");
                break block4;
            }
            catch (Exception exception) {}
            class197.field3918 = "Unknown";
        }
        Frames.field6598 = class197.field3918.toLowerCase();
        Rasterizer2D.method13636(class197.cacheDir);
        class185.method6623(arrbufferedFile.vmethod11984(n), (byte)-64);
        class197.JagexCache_dat2File = new BufferedFile(new AccessFile(WorldMapIcon_1.method10423("main_file_cache.dat2", -1071360557), "rw", 1048576000L), 5200, 0);
        class197.field3915 = new BufferedFile(new AccessFile(WorldMapIcon_1.method10423("main_file_cache.idx255", 107656159), "rw", 0x100000L), 6000, 0);
        FontName.JagexCache_idxFiles = new BufferedFile[class52.field2382];
        n = 0;
        while (n < class52.field2382) {
            arrbufferedFile = FontName.JagexCache_idxFiles;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("main_file_cache.idx");
            ((StringBuilder)charSequence).append(n);
            arrbufferedFile[n] = new BufferedFile(new AccessFile(WorldMapIcon_1.method10423(((StringBuilder)charSequence).toString(), -902189427), "rw", 0x100000L), 6000, 0);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([Llt;II)Llt;")
    public static class176 method4803(class176[] arrclass176, int n, int n2) {
        n2 = 0;
        while (n2 < arrclass176.length) {
            class176 class1762 = arrclass176[n2];
            int n3 = class1762.vmethod12178((byte)-35);
            if (n3 == n) {
                return class1762;
            }
            ++n2;
        }
        return null;
    }

    @ObfuscatedName(value="dv")
    static boolean method4805(int n) {
        n = Client.field4868;
        return (n * 1064934413 & 1) != 0;
    }
}

