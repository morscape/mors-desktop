/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ct")
public class class278
implements WorldMapSection {
    @ObfuscatedName(value="dz")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field5886;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=37350969)
    int field5888;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-165371773)
    int field5890;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-791272681)
    int field5891;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-895540727)
    int field5893;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-339153117)
    int field5895;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=554882109)
    int field5896;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=335966433)
    int field5892;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1274466069)
    int field5894;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-2100285093)
    int field5897;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=2118325869)
    int field5889;

    class278() {
    }

    @Override
    @ObfuscatedName(value="ae")
    public boolean vmethod10367(int n, int n2, int n3, byte by) {
        by = (byte)(this.field5894 * 517474365);
        boolean bl = false;
        if (n < by * 1274466069) {
            return false;
        }
        if (n < this.field5890 + this.field5894) {
            boolean bl2 = bl;
            if (n2 >= (this.field5892 << 6) + (this.field5893 << 3)) {
                bl2 = bl;
                if (n2 <= (this.field5892 << 6) + (this.field5893 << 3) + 7) {
                    bl2 = bl;
                    if (n3 >= (this.field5897 << 6) + (this.field5895 << 3)) {
                        n = this.field5895 * -1263028085;
                        n2 = this.field5897 * 1899271891;
                        bl2 = bl;
                        if (n3 <= (n * -339153117 << 3) + (n2 * -2100285093 << 6) + 7) {
                            bl2 = true;
                        }
                    }
                }
            }
            return bl2;
        }
        return false;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="104316513")
    void method10371() {
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;B)V", garbageValue="0")
    public void vmethod10380(Buffer buffer) {
        this.field5894 = buffer.method11650(1327432979);
        this.field5890 = buffer.method11650(-1539617123);
        this.field5892 = buffer.method11637(-611495668);
        this.field5893 = buffer.method11650(1986571387);
        this.field5897 = buffer.method11637(-1431422636);
        this.field5895 = buffer.method11650(-561724648);
        this.field5891 = buffer.method11637(-567689303);
        this.field5888 = buffer.method11650(-1297227989);
        this.field5896 = buffer.method11637(517235671);
        this.field5889 = buffer.method11650(-1299153893);
        this.method10371();
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="-76")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.field2396 > this.field5891) {
            worldMapArea.field2396 = this.field5891;
        }
        if (worldMapArea.field2397 < this.field5891) {
            worldMapArea.field2397 = this.field5891;
        }
        if (worldMapArea.field2403 > this.field5896) {
            worldMapArea.field2403 = this.field5896;
        }
        if (worldMapArea.field2401 < this.field5896) {
            worldMapArea.field2401 = this.field5896;
        }
    }

    @Override
    @ObfuscatedName(value="ax")
    public int[] vmethod10384(int n, int n2, int n3, byte by) {
        if (this.vmethod10367(n, n2, n3, (byte)-125)) {
            n = this.field5888 * 1336647689;
            by = (byte)(this.field5893 * -277803975);
            int n4 = this.field5891 * 1191920807;
            int n5 = this.field5892 * -1503472863;
            int n6 = this.field5889 * 2076992357;
            int n7 = this.field5895 * -1263028085;
            int n8 = this.field5896 * -1611308267;
            int n9 = this.field5897 * 1899271891;
            return new int[]{n * 298807752 - by * 1425608776 + (n4 * 898155968 - n5 * 27015232) + n2, n6 * -233262232 - n7 * 1581742360 + n3 + (n8 * 1152716608 - n9 * -1274259776)};
        }
        return null;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)[Lfd;", garbageValue="-58868067")
    static GameBuild[] method10364() {
        GameBuild gameBuild = GameBuild.BUILDLIVE;
        GameBuild gameBuild2 = GameBuild.WIP;
        GameBuild gameBuild3 = GameBuild.RC;
        GameBuild gameBuild4 = GameBuild.LIVE;
        return new GameBuild[]{gameBuild, gameBuild2, gameBuild3, gameBuild4};
    }
}

