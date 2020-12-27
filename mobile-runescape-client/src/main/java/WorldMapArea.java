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
import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ds")
@Implements(value="WorldMapArea")
public class WorldMapArea {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Laf;")
    Coord field2395 = null;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=982807091)
    int field2397 = 0;
    @ObfuscatedName(value="ah")
    @Export(value="internalName")
    String internalName;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=19893611)
    int field2399 = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1150557833)
    int field2400 = -1;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=1327147737)
    int field2401 = 0;
    @ObfuscatedName(value="an")
    @Export(value="isMain")
    boolean isMain = false;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-880403205)
    int field2403;
    @ObfuscatedName(value="as")
    String field2404;
    @ObfuscatedName(value="ay")
    @Export(value="sections")
    LinkedList sections;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-79757367)
    int field2405 = -1;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-2118286891)
    int field2396 = Integer.MAX_VALUE;

    public WorldMapArea() {
        this.field2403 = Integer.MAX_VALUE;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IIIB)[I", garbageValue="120")
    @Export(value="position")
    public int[] position(int n, int n2, int n3) {
        WorldMapSection worldMapSection2;
        block1: {
            for (WorldMapSection worldMapSection2 : this.sections) {
                if (!worldMapSection2.vmethod10367(n, n2, n3, (byte)-29)) continue;
                break block1;
            }
            return null;
        }
        Object object = worldMapSection2.vmethod10384(n, n2, n3, (byte)23);
        return object;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-847827760")
    @Export(value="setBounds")
    void setBounds() {
        Iterator iterator = this.sections.iterator();
        while (iterator.hasNext()) {
            ((WorldMapSection)iterator.next()).expandBounds(this);
        }
    }

    @ObfuscatedName(value="ag")
    public int method3766(int n) {
        n = this.field2395.y * -37789813;
        return n * -1438658525;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;II)V")
    public void method3767(Buffer buffer, int n, int n2) {
        this.field2405 = n;
        this.internalName = buffer.method11664(-2108883075);
        this.field2404 = buffer.method11664(-1995856229);
        this.field2395 = new Coord(buffer.method11670(1604085085));
        this.field2399 = buffer.method11670(1604085085);
        buffer.method11650(-767131857);
        n2 = buffer.method11650(1929466762);
        n = 0;
        boolean bl = true;
        if (n2 != 1) {
            bl = false;
        }
        this.isMain = bl;
        this.field2400 = buffer.method11650(-1384019396);
        n2 = buffer.method11650(-1219061874);
        this.sections = new LinkedList();
        while (true) {
            if (n >= n2) {
                this.setBounds();
                return;
            }
            this.sections.add(this.method3776(buffer, -2140807479));
            ++n;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="237388979")
    @Export(value="getIsMain")
    public boolean getIsMain() {
        boolean bl = this.isMain;
        return bl;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1317405673")
    @Export(value="getOrigin")
    public String getOrigin() {
        String string2 = this.internalName;
        return string2;
    }

    @ObfuscatedName(value="ao")
    public int method3772(int n) {
        n = this.field2397 * -1601971973;
        return n * 982807091;
    }

    @ObfuscatedName(value="ap")
    public int method3773(int n) {
        n = this.field2396 * 609988477;
        return n * -2118286891;
    }

    @ObfuscatedName(value="ar")
    public int method3775(int n) {
        n = this.field2400 * 1114458183;
        return n * -1150557833;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;I)Lci;")
    WorldMapSection method3776(Buffer buffer, int n) {
        WorldMapSection worldMapSection;
        n = buffer.method11650(-2095334533);
        switch (((class279)class90.method4803((class176[])class279.method10387(), (int)n, (int)2132514284)).field5903) {
            default: {
                throw new IllegalStateException("");
            }
            case 3: {
                worldMapSection = new class274();
                break;
            }
            case 2: {
                worldMapSection = new class277();
                break;
            }
            case 1: {
                worldMapSection = new class278();
                break;
            }
            case 0: {
                worldMapSection = new class275();
            }
        }
        worldMapSection.vmethod10380(buffer);
        return worldMapSection;
    }

    @ObfuscatedName(value="aw")
    int method3780(byte by) {
        by = (byte)(this.field2399 * 713307971);
        return by * 19893611;
    }

    @ObfuscatedName(value="az")
    public int method3782(int n) {
        n = this.field2403 * -1601204685;
        return n * -880403205;
    }

    @ObfuscatedName(value="ad")
    public int method3764(byte by) {
        by = (byte)(this.field2395.plane * -368489617);
        return by * 1624535951;
    }

    @ObfuscatedName(value="at")
    public int method3777(int n) {
        n = this.field2401 * 899233129;
        return n * 1327147737;
    }

    @ObfuscatedName(value="av")
    public int method3779(int n) {
        n = this.field2395.x * -1240603385;
        return n * -1172670281;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IIII)I", garbageValue="1525791328")
    static int method3760(int n, int n2, int n3) {
        if ((Tiles.field3455[n][n2][n3] & 8) == 0) {
            if (n > 0 && ((n2 = Tiles.field3455[1][n2][n3]) & 2) != 0) {
                return n - 1;
            }
            return n;
        }
        return 0;
    }
}

