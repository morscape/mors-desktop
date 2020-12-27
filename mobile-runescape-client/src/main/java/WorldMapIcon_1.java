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
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="di")
@Implements(value="WorldMapIcon_1")
public class WorldMapIcon_1
extends AbstractWorldMapIcon {
    @ObfuscatedName(value="jw")
    public static int field5913;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=833495435)
    int field5915;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1678508233)
    @Export(value="objectDefId")
    final int objectDefId;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=582567331)
    int field5918;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lcm;")
    @Export(value="label")
    class42 label;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lck;")
    @Export(value="region")
    final WorldMapRegion region;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1474256275)
    int field5916;

    @ObfuscatedSignature(descriptor="(Laf;Laf;ILck;)V")
    WorldMapIcon_1(Coord coord, Coord coord2, int n, WorldMapRegion worldMapRegion) {
        super(coord, coord2);
        this.objectDefId = n;
        this.region = worldMapRegion;
        this.init();
    }

    @Override
    @ObfuscatedName(value="ae")
    public int vmethod10428(int n) {
        n = this.field5918 * -1499851253;
        return n * 582567331;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2140665270")
    @Export(value="init")
    void init() {
        this.field5918 = AbstractWorldMapIcon.getObjectDefinition((int)this.objectDefId).method12888((int)-560245098).mapIconId;
        this.label = this.region.method1130(class297.WorldMapElement_get(this.field5918), 768860755);
        class384 class3842 = class297.WorldMapElement_get(this.vmethod10428(-103613953)).method12952(false, (byte)-62);
        if (class3842 == null) {
            this.field5915 = 0;
            this.field5916 = 0;
            return;
        }
        this.field5915 = class3842.field7125;
        this.field5916 = class3842.field7127;
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)Lcm;", garbageValue="-85")
    @Export(value="getLabel")
    class42 getLabel() {
        class42 class422 = this.label;
        return class422;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ae")
    static File method10423(String string2, int n) {
        Object object;
        block9: {
            RandomAccessFile randomAccessFile;
            File file;
            block8: {
                if (!class185.field3842) throw new RuntimeException("");
                file = (File)class185.field3841.get(string2);
                if (file != null) {
                    return file;
                }
                File file2 = new File(class354.field6427, string2);
                file = null;
                if (!new File(file2.getParent()).exists()) break block8;
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    n = randomAccessFile.read();
                    randomAccessFile.seek(0L);
                    randomAccessFile.write(n);
                    randomAccessFile.seek(0L);
                    randomAccessFile.close();
                    class185.field3841.put(string2, file2);
                    return file2;
                }
                catch (Exception exception) {}
            }
            try {
                throw new RuntimeException("");
            }
            catch (Exception exception) {
                object = file;
            }
            break block9;
            object = randomAccessFile;
        }
        if (object == null) throw new RuntimeException();
        try {
            ((RandomAccessFile)object).close();
        }
        catch (Exception exception) {
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;B)V", garbageValue="-106")
    public static void method10425(Collection collection) {
        collection.add(ItemDefinition.ItemDefinition_cached);
        collection.add(ItemDefinition.ItemDefinition_cachedModels);
        collection.add(ItemDefinition.ItemDefinition_cachedSprites);
    }

    @ObfuscatedName(value="ax")
    @Export(value="loadInterface")
    public static boolean loadInterface(int n, int n2) {
        if (!class222.Widget_loadedInterfaces[n]) {
            if (class50.Widget_archive.tryLoadGroup(n)) {
                int n3 = class50.Widget_archive.getGroupFileCount(n);
                if (n3 != 0) {
                    if (class79.Widget_interfaceComponents[n] == null) {
                        class79.Widget_interfaceComponents[n] = new Widget[n3];
                    }
                    n2 = 0;
                    while (true) {
                        byte[] arrby;
                        if (n2 >= n3) {
                            class222.Widget_loadedInterfaces[n] = true;
                            return true;
                        }
                        if (class79.Widget_interfaceComponents[n][n2] == null && (arrby = class50.Widget_archive.takeFile(n, n2)) != null) {
                            class79.Widget_interfaceComponents[n][n2] = new Widget();
                            class79.Widget_interfaceComponents[n][n2].id = (n << 16) + n2;
                            if (arrby[0] != -1) {
                                class79.Widget_interfaceComponents[n][n2].method7553(new Buffer(arrby), (byte)-9);
                            } else {
                                class79.Widget_interfaceComponents[n][n2].method7547(new Buffer(arrby), (byte)27);
                            }
                        }
                        ++n2;
                    }
                }
                class222.Widget_loadedInterfaces[n] = true;
                return true;
            }
            return false;
        }
        return true;
    }
}

