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
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cz")
@Implements(value="AbstractWorldMapData")
public abstract class AbstractWorldMapData {
    @ObfuscatedName(value="po")
    @ObfuscatedSignature(descriptor="Llx;")
    static MidiPcmStream field2346;
    @ObfuscatedName(value="pt")
    @ObfuscatedSignature(descriptor="Let;")
    static class292 field2347;
    @ObfuscatedName(value="aa")
    @Export(value="floorUnderlayIds")
    short[][][] floorUnderlayIds;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1336240064)
    int field2350;
    @ObfuscatedName(value="af")
    byte[][][] field2351;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1245844867)
    int field2352;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-295871741)
    @Export(value="groupId")
    int groupId = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=991596609)
    @Export(value="fileId")
    int fileId = -1;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="[[[[Ldq;")
    @Export(value="decorations")
    WorldMapDecoration[][][][] decorations;
    @ObfuscatedName(value="an")
    boolean field2358;
    @ObfuscatedName(value="aq")
    byte[][][] field2359;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-220162973)
    int field2360;
    @ObfuscatedName(value="ay")
    boolean field2362;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-844438563)
    @Export(value="regionX")
    int regionX;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1682688704)
    int field2355;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=916263053)
    @Export(value="regionY")
    int regionY;
    @ObfuscatedName(value="ab")
    @Export(value="floorOverlayIds")
    short[][][] floorOverlayIds;

    AbstractWorldMapData() {
        new LinkedList();
        this.field2358 = false;
        this.field2362 = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(IILmi;II)V")
    void method3713(int n, int n2, Buffer buffer, int n3, int n4) {
        int n5;
        int n6;
        n4 = 1;
        int n7 = (n3 & 2) != 0 ? 1 : 0;
        if ((n3 & 4) == 0) {
            n4 = 0;
        }
        this.floorUnderlayIds[0][n][n2] = (short)buffer.method11650(-1514717767);
        if (n7 != 0) {
            n6 = buffer.method11650(-1016298131);
            for (n7 = 0; n7 < n6; ++n7) {
                n5 = buffer.method11650(-1574448170);
                if (n5 == 0) continue;
                this.floorOverlayIds[n7][n][n2] = (short)n5;
                n5 = buffer.method11650(454314699);
                this.field2351[n7][n][n2] = (byte)(n5 >> 2);
                this.field2359[n7][n][n2] = (byte)(n5 & 3);
            }
        }
        if (n4 != 0) {
            for (n4 = 0; n4 < ((n3 & 0x18) >> 3) + 1; ++n4) {
                n6 = buffer.method11650(89186883);
                if (n6 == 0) continue;
                WorldMapDecoration[][] arrworldMapDecoration = this.decorations[n4][n];
                WorldMapDecoration[] arrworldMapDecoration2 = new WorldMapDecoration[n6];
                arrworldMapDecoration[n2] = arrworldMapDecoration2;
                for (n7 = 0; n7 < n6; ++n7) {
                    n5 = buffer.method11680((byte)8);
                    int n8 = buffer.method11650(-1876766814);
                    arrworldMapDecoration2[n7] = new WorldMapDecoration(n5, n8 >> 2, n8 & 3);
                }
            }
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    abstract void vmethod7752(Buffer var1, int var2);

    @ObfuscatedName(value="af")
    int method3718(int n) {
        n = this.regionY * 1307259461;
        return n * 916263053;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2145016218")
    @Export(value="reset")
    void reset() {
        this.floorUnderlayIds = null;
        this.floorOverlayIds = null;
        this.field2351 = null;
        this.field2359 = null;
        this.decorations = null;
        this.field2358 = false;
        this.field2362 = false;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IILmi;I)V")
    void method3722(int n, int n2, Buffer buffer, int n3) {
        n3 = buffer.method11650(-935889851);
        if (n3 == 0) {
            return;
        }
        if ((n3 & 1) == 0) {
            this.method3713(n, n2, buffer, n3, -2018673554);
            return;
        }
        this.method3723(n, n2, buffer, n3);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(IILmi;II)V", garbageValue="-1957455540")
    void method3723(int n, int n2, Buffer buffer, int n3) {
        if ((n3 = (n3 & 2) != 0 ? 1 : 0) != 0) {
            this.floorOverlayIds[0][n][n2] = (short)buffer.method11650(-2139264607);
        }
        this.floorUnderlayIds[0][n][n2] = (short)buffer.method11650(1240659397);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lkc;B)V", garbageValue="-111")
    @Export(value="loadGeography")
    void loadGeography(AbstractArchive object) {
        if (!this.isFullyLoaded()) {
            if ((object = (Object)((AbstractArchive)object).takeFile(this.groupId, this.fileId)) != null) {
                this.vmethod7752(new Buffer((byte[])object), -1571690241);
                this.field2358 = true;
                this.field2362 = true;
            }
            return;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-970808520")
    @Export(value="isFullyLoaded")
    boolean isFullyLoaded() {
        boolean bl;
        return this.field2358 && (bl = this.field2362);
    }

    @ObfuscatedName(value="ab")
    int method3714(int n) {
        n = this.regionX * 157125749;
        return n * -844438563;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="([BIIIIIIILbe;[Lgg;I)V")
    static final void method3709(byte[] object, int n, int n2, int n3, int n4, int n5, int n6, int n7, Scene scene, CollisionMap[] arrcollisionMap, int n8) {
        Buffer buffer = new Buffer((byte[])object);
        n8 = -1;
        int n9;
        block0: while ((n9 = buffer.method11658(571538530)) != 0) {
            n9 = n8 + n9;
            n8 = 0;
            while (true) {
                int n10;
                if ((n10 = buffer.method11665(-417709273)) == 0) {
                    n8 = n9;
                    continue block0;
                }
                n10 = n8 + (n10 - 1);
                int n11 = n10 & 0x3F;
                int n12 = n10 >> 6 & 0x3F;
                int n13 = buffer.method11650(153228736);
                int n14 = n13 & 3;
                n8 = n10;
                if (n10 >> 12 != n4) continue;
                n8 = n10;
                if (n12 < n5) continue;
                n8 = n10;
                if (n12 >= n5 + 8) continue;
                n8 = n10;
                if (n11 < n6) continue;
                n8 = n10;
                if (n11 >= n6 + 8) continue;
                object = AbstractWorldMapIcon.getObjectDefinition(n9);
                n8 = n12 & 7;
                n12 = n11 & 7;
                n11 = n2 + class298.method10980(n8, n12, n7, object.field6886, object.field6884, n14);
                n12 = n3 + Coord.method39(n8, n12, n7, object.field6886, object.field6884, n14, 258776793);
                n8 = n10;
                if (n11 <= 0) continue;
                n8 = n10;
                if (n12 <= 0) continue;
                n8 = n10;
                if (n11 >= 103) continue;
                n8 = n10;
                if (n12 >= 103) continue;
                n8 = (Tiles.field3455[1][n11][n12] & 2) != 2 ? n : n - 1;
                object = n8 >= 0 ? (Object)arrcollisionMap[n8] : null;
                class287.method10621(n, n11, n12, n9, n14 + n7 & 3, n13 >> 2, scene, (CollisionMap)object, -643934061);
                n8 = n10;
            }
            break;
        }
        return;
    }
}

