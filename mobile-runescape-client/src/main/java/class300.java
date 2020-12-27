/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fz")
public class class300
extends class58 {
    @ObfuscatedName(value="dq")
    @ObfuscatedGetter(intValue=2133937501)
    static int field6046;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lbl;")
    class265 field6047;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lav;")
    class261 field6048;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Let;")
    class292 field6049 = new class292(0, 0);

    public class300() {
        this.field6047 = new class265(this.field6049.field2529, 0, 0);
        this.field6048 = new class261(this.field6047);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lbd;", garbageValue="-858686460")
    public Rasterizer3D vmethod11000() {
        class265 class2652 = this.field6047;
        return class2652;
    }

    @Override
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="2132699450")
    public void vmethod11004(int n, int n2) {
        throw new Error("");
    }

    @Override
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="29")
    public void vmethod11006() {
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1717355824")
    public void vmethod11013(int n, int n2, int n3, int n4) {
        throw new Error("");
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="([IIII)V", garbageValue="-1836474399")
    public void method11028(int[] arrn, int n, int n2) {
        this.field6049.method4243(arrn, n, n2);
        this.field6047.method7656(arrn, n, n2);
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)Lba;", garbageValue="-71587171")
    public class19 vmethod11003() {
        class261 class2612 = this.field6048;
        return class2612;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lfj;", garbageValue="1091171168")
    public class72 vmethod11005() {
        class292 class2922 = this.field6049;
        return class2922;
    }

    @Override
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="62")
    public void vmethod11016(int n, int n2) {
        this.method11028(new int[n2 * n], n, n2);
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Lek;I)V", garbageValue="-1857440645")
    public void method11026(class384 class3842) {
        this.method11028(class3842.field7129, class3842.field7125, class3842.field7127);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;B)V", garbageValue="9")
    public static void method10993(Collection collection) {
        collection.add(ParamDefinition.ParamDefinition_cached);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;B)Z")
    public static boolean method10994(AbstractArchive abstractArchive, AbstractArchive object, byte by) {
        WorldMapElement.WorldMapElement_archive = object;
        boolean bl = abstractArchive.method6145((byte)36);
        by = 0;
        if (!bl) {
            return false;
        }
        WorldMapElement.field6920 = abstractArchive.getGroupFileCount(35);
        WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.field6920];
        while (by < WorldMapElement.field6920) {
            object = abstractArchive.takeFile(35, by);
            WorldMapElement.WorldMapElement_cached[by] = new WorldMapElement(by);
            if (object != null) {
                WorldMapElement.WorldMapElement_cached[by].method12946(new Buffer((byte[])object), 1556380765);
                WorldMapElement.WorldMapElement_cached[by].method12945(-761241167);
            }
            by = (byte)(by + 1);
        }
        return true;
    }

    @ObfuscatedName(value="dd")
    static final int method10995(int n) {
        if (ServerPacket.clientPreferences.field3161) {
            return WorldMapIcon_1.field5913 * 63889799;
        }
        if (DevicePcmPlayerProvider.method11095(class203.field3944, class95.field2738, WorldMapIcon_1.field5913 * 63889799, -1416385247) - class260.field4459 >= 800 || (Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][class203.field3944 >> 7][class95.field2738 >> 7] & 4) == 0) {
            return 3;
        }
        n = WorldMapIcon_1.field5913;
        return n * 63889799;
    }
}

