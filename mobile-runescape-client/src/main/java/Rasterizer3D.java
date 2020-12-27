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
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bd")
@Implements(value="Rasterizer3D")
public abstract class Rasterizer3D {
    @ObfuscatedName(value="an")
    public static final int[] field334 = new int[65536];
    @ObfuscatedName(value="ao")
    @Export(value="Rasterizer3D_cosine")
    public static final int[] Rasterizer3D_cosine;
    @ObfuscatedName(value="ap")
    @Export(value="Rasterizer3D_sine")
    public static final int[] Rasterizer3D_sine;
    @ObfuscatedName(value="ar")
    static final int[] field337;
    @ObfuscatedName(value="aw")
    static final int[] field338;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lbb;")
    public static class20 field339;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=1258101857)
    int field340;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=318443651)
    int field342;
    @ObfuscatedName(value="au")
    boolean field344;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=1173526169)
    int field346;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=215347457)
    int field348;
    @ObfuscatedName(value="be")
    int[] field349;
    @ObfuscatedName(value="bg")
    boolean field351;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-22322387)
    int field352;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=772831149)
    int field354;
    @ObfuscatedName(value="bp")
    boolean field356;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=-469394347)
    int field357;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=-1949661549)
    int field358;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=2135698537)
    int field359;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=441469105)
    int field341;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-1641291647)
    int field343;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-261618547)
    int field345;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=649307517)
    int field347;
    @ObfuscatedName(value="bi")
    boolean field353;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=-1377299033)
    int field360;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=1774281923)
    int field350;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=1382410639)
    int field355;

    static {
        field338 = new int[512];
        field337 = new int[2048];
        Rasterizer3D_sine = new int[2048];
        Rasterizer3D_cosine = new int[2048];
    }

    Rasterizer3D() {
        int n = 0;
        this.field345 = 0;
        this.field341 = 0;
        this.field342 = 0;
        this.field340 = 0;
        this.field344 = false;
        this.field356 = false;
        this.field353 = false;
        int n2 = 1;
        this.field351 = true;
        this.field350 = 0;
        this.field354 = 512;
        this.field349 = new int[1024];
        int n3 = 1;
        while (true) {
            int n4 = n2;
            if (n3 >= 512) {
                while (true) {
                    n3 = n;
                    if (n4 >= 2048) {
                        while (true) {
                            if (n3 >= 2048) {
                                return;
                            }
                            int[] arrn = Rasterizer3D_sine;
                            double d = (double)n3 * 0.0030679615;
                            arrn[n3] = (int)(Math.sin(d) * 65536.0);
                            Rasterizer3D.Rasterizer3D_cosine[n3] = (int)(Math.cos(d) * 65536.0);
                            ++n3;
                        }
                    }
                    Rasterizer3D.field337[n4] = 65536 / n4;
                    ++n4;
                }
            }
            Rasterizer3D.field338[n3] = 32768 / n3;
            ++n3;
        }
    }

    @ObfuscatedName(value="ae")
    void vmethod7613(int n, int n2, int n3, int n4, byte by) {
        this.field358 = n3 - n;
        this.field355 = n4 - n2;
        this.method653();
        n4 = this.field349.length;
        by = (byte)(this.field355 * 40441199);
        n3 = 0;
        if (n4 < by * 1382410639) {
            this.field349 = new int[class152.method6233(this.field355)];
        }
        n2 = n2 * this.field346 + n;
        n = n3;
        while (n < this.field355) {
            this.field349[n] = n2;
            n3 = this.field346 * 191716777;
            n2 += n3 * 1173526169;
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-21028")
    public final void method654() {
        this.vmethod7613(this.field342, this.field345, this.field340, this.field341, (byte)0);
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1634724850")
    public final void method655(int n) {
        this.field354 = n;
    }

    @ObfuscatedName(value="bq")
    public final int method657(int n) {
        n = this.field354 * 616563749;
        return n * 772831149;
    }

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1069178865")
    public final void method658(boolean bl) {
        this.field351 = bl;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-25709151")
    public void method659(int n, int n2, int n3) {
        boolean bl = n < 0 || n > this.field358 || n2 < 0 || n2 > this.field358 || n3 < 0 || n3 > this.field358;
        this.field344 = bl;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="88")
    public void vmethod7616(int n) {
        this.method655(n);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-526308908")
    public abstract void vmethod7646();

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2135149003")
    public final void method653() {
        this.field352 = this.field358 / 2;
        this.field357 = this.field355 / 2;
        this.field348 = -(this.field352 * 252382977) * 215347457;
        this.field347 = this.field358 - this.field352;
        this.field360 = -(this.field357 * -720944617) * -1377299033;
        this.field359 = this.field355 - this.field357;
    }

    @ObfuscatedName(value="bz")
    public final void method660(int n, int n2, int n3) {
        n3 = this.field349[0];
        int n4 = n3 / this.field346;
        this.field352 = n - (n3 - n4 * this.field346);
        this.field357 = n2 - n4;
        this.field348 = -(this.field352 * 252382977) * 215347457;
        this.field347 = this.field358 - this.field352;
        this.field360 = -(this.field357 * -720944617) * -1377299033;
        this.field359 = this.field355 - this.field357;
    }

    @ObfuscatedName(value="bk")
    public final void method656(int n, int n2, int n3, int n4, int n5) {
        n5 = n;
        if (n < 0) {
            n5 = 0;
        }
        n = n2;
        if (n2 < 0) {
            n = 0;
        }
        n2 = n3;
        if (n3 > this.field346) {
            n2 = this.field346;
        }
        n3 = n4;
        if (n4 > this.field343) {
            n3 = this.field343;
        }
        this.field342 = n5;
        this.field345 = n;
        this.field340 = n2;
        this.field341 = n3;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-245967887")
    static void method610() {
        Tiles.field3468 = null;
        Tiles.field3458 = null;
        Tiles.field3464 = null;
        Tiles.field3460 = null;
        class251.field4323 = null;
        AccessFile.field4029 = null;
        class256.field4353 = null;
        class88.field2663 = null;
        Tiles.field3456 = null;
        Tiles.field3463 = null;
        BoundaryObject.field441 = null;
        class97.field2748 = null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILny;Lkv;I)V", garbageValue="1714728368")
    static void method611(int n, ArchiveDisk archiveDisk, Archive archive) {
        byte[] arrby = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method6347(n, archiveDisk);
        if (arrby == null) {
            archive.method11535(archiveDisk, n, archiveDisk.method6971(n, (byte)-37), true, (short)23008);
            return;
        }
        archive.method11535(archiveDisk, n, arrby, true, (short)7619);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="1363207668")
    public static void method612(Collection collection) {
        collection.add(class376.field7035);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1519682269")
    public static String method613() {
        String string2 = class288.field5963;
        return string2;
    }

    @ObfuscatedName(value="aw")
    static String method614(char c, int n, int n2) {
        Object object = new char[n];
        for (n2 = 0; n2 < n; ++n2) {
            object[n2] = c;
        }
        object = new String((char[])object);
        return object;
    }
}

