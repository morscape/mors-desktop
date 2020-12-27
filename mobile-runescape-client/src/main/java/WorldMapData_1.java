/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  dq[]
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cc")
@Implements(value="WorldMapData_1")
public class WorldMapData_1
extends AbstractWorldMapData {
    @ObfuscatedName(value="oz")
    @ObfuscatedSignature(descriptor="Lez;")
    @Export(value="clanChat")
    static class294 clanChat;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=1707648561)
    int field4706;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-854232161)
    @Export(value="chunkX")
    int chunkX;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=477333327)
    int field4708;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1509262741)
    int field4709;

    WorldMapData_1() {
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    void vmethod7752(Buffer buffer, int n) {
        int n2;
        this.field2360 = Math.min(this.field2360, 4);
        this.floorUnderlayIds = (short[][][])Array.newInstance(Short.TYPE, 1, 64, 64);
        this.floorOverlayIds = (short[][][])Array.newInstance(Short.TYPE, this.field2360, 64, 64);
        this.field2351 = (byte[][][])Array.newInstance(Byte.TYPE, this.field2360, 64, 64);
        this.field2359 = (byte[][][])Array.newInstance(Byte.TYPE, this.field2360, 64, 64);
        this.decorations = (WorldMapDecoration[][][][])Array.newInstance(dq[].class, this.field2360, 64, 64);
        n = buffer.method11650(48272564);
        if (n == class52.field2381.field2386) {
            n = buffer.method11650(-331668108);
            n2 = buffer.method11650(-954356259);
            int n3 = buffer.method11650(2076391623);
            int n4 = buffer.method11650(343895321);
            if (n != this.regionX || n2 != this.regionY || n3 != this.chunkX || n4 != this.field4706) {
                throw new IllegalStateException("");
            }
        } else {
            throw new IllegalStateException("");
        }
        block0: for (n = 0; n < 8; ++n) {
            n2 = 0;
            while (true) {
                if (n2 >= 8) {
                    continue block0;
                }
                this.method3722(n + this.chunkX * 8, n2 + this.field4706 * 8, buffer, 2028924857);
                ++n2;
            }
        }
    }

    @ObfuscatedName(value="bh")
    int method7761(int n) {
        n = this.chunkX * -193009569;
        return n * -854232161;
    }

    @ObfuscatedName(value="bj")
    int method7762(int n) {
        n = this.field4708 * 975253423;
        return n * 477333327;
    }

    @ObfuscatedName(value="bq")
    int method7766(int n) {
        n = this.field4706 * 938930897;
        return n * 1707648561;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    void method7754(Buffer buffer, int n) {
        n = buffer.method11650(235962081);
        if (n != class45.field2282.field2289) {
            throw new IllegalStateException("");
        }
        this.field2352 = buffer.method11650(-364575220);
        this.field2360 = buffer.method11650(1066526048);
        this.field2355 = buffer.method11637(289900835) * 64;
        this.field2350 = buffer.method11637(-341685589) * 64;
        this.field4709 = buffer.method11650(-1237834604);
        this.field4708 = buffer.method11650(1054260900);
        this.regionX = buffer.method11637(1394903861);
        this.regionY = buffer.method11637(139900609);
        this.chunkX = buffer.method11650(418142043);
        this.field4706 = buffer.method11650(1645332184);
        this.groupId = buffer.method11680((byte)23);
        this.fileId = buffer.method11680((byte)-99);
    }

    @ObfuscatedName(value="bf")
    int method7760(byte by) {
        by = (byte)(this.field4709 * -1550803523);
        return by * 1509262741;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof WorldMapData_1;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (WorldMapData_1)object;
        if (this.regionX == ((AbstractWorldMapData)object).regionX) {
            if (this.regionY == ((AbstractWorldMapData)object).regionY) {
                bl = bl2;
                if (this.chunkX == ((WorldMapData_1)object).chunkX) {
                    int n = ((WorldMapData_1)object).field4706 * 938930897;
                    int n2 = this.field4706 * 938930897;
                    bl = bl2;
                    if (n * 1707648561 == n2 * 1707648561) {
                        bl = true;
                    }
                }
                return bl;
            }
        } else {
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n = this.regionX * 157125749;
        int n2 = this.regionY * 1307259461;
        int n3 = this.chunkX * -193009569;
        int n4 = this.field4706 * 938930897;
        return n2 * 916263053 << 8 | n * -844438563 | n3 * -854232161 << 16 | n4 * 1707648561 << 24;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;ZI)V", garbageValue="-95206365")
    public static void method7750(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, boolean bl) {
        ObjectDefinition.ObjectDefinition_archive = abstractArchive;
        ObjectDefinition.field6867 = abstractArchive2;
        ObjectDefinition.field6869 = bl;
    }
}

