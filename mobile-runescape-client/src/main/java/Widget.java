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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ax")
@Implements(value="Widget")
public class Widget
extends Node {
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="Widget_cachedSprites")
    static EvictingDualNodeHashTable Widget_cachedSprites = new EvictingDualNodeHashTable(200, null);
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field4472 = new EvictingDualNodeHashTable(50, null);
    @ObfuscatedName(value="ar")
    public static boolean field4473 = false;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field4474;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="Widget_cachedFonts")
    static EvictingDualNodeHashTable Widget_cachedFonts;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-2097546773)
    @Export(value="yAlignment")
    public int yAlignment = 0;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1142335745)
    @Export(value="xAlignment")
    public int xAlignment = 0;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-226242387)
    @Export(value="id")
    public int id = -1;
    @ObfuscatedName(value="ap")
    @Export(value="isIf3")
    public boolean isIf3 = false;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=-170012665)
    public int field4483 = 0;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=2042965957)
    public int field4485 = 1;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=144462349)
    public int field4486 = 0;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=6238747)
    public int field4487 = 0;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=1704192453)
    public int field4489 = 1;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(intValue=1056257247)
    public int field4490 = 0;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=1222699671)
    @Export(value="rawY")
    public int rawY = 0;
    @ObfuscatedName(value="bh")
    @ObfuscatedGetter(intValue=-226138495)
    @Export(value="x")
    public int x = 0;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=-1728254247)
    public int field4495 = 0;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=-1397155153)
    public int field4498 = 0;
    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="Leq;")
    @Export(value="fillMode")
    public class290 fillMode = class290.SOLID;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(intValue=-827968005)
    public int field4500 = 1;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=1223392479)
    public int field4501 = 0;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=-1700052599)
    @Export(value="y")
    public int y = 0;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=978257765)
    @Export(value="width")
    public int width = 0;
    @ObfuscatedName(value="bt")
    @Export(value="isHidden")
    public boolean isHidden = false;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=-450879567)
    public int field4509 = 0;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=-809107285)
    public int field4510 = 0;
    @ObfuscatedName(value="ca")
    @ObfuscatedGetter(intValue=1488542785)
    int field4512 = 1;
    @ObfuscatedName(value="ce")
    @ObfuscatedGetter(intValue=1230463349)
    public int field4516 = 0;
    @ObfuscatedName(value="cf")
    public boolean field4517;
    @ObfuscatedName(value="ci")
    @ObfuscatedGetter(intValue=-613378213)
    public int field4520 = 100;
    @ObfuscatedName(value="cj")
    @ObfuscatedGetter(intValue=-1260254485)
    @Export(value="sequenceId2")
    public int sequenceId2 = -1;
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=-191483873)
    public int field4522 = 1;
    @ObfuscatedName(value="cl")
    public boolean field4523 = false;
    @ObfuscatedName(value="cm")
    @ObfuscatedGetter(intValue=1468743515)
    public int field4524 = 0;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=421683919)
    public int field4526 = 0;
    @ObfuscatedName(value="cr")
    @ObfuscatedGetter(intValue=1588653709)
    public int field4529 = 2;
    @ObfuscatedName(value="cu")
    public int field4532 = 0;
    @ObfuscatedName(value="cv")
    public boolean field4533;
    @ObfuscatedName(value="cw")
    public boolean field4534 = false;
    @ObfuscatedName(value="cx")
    @ObfuscatedGetter(intValue=-183151515)
    public int field4535 = 0;
    @ObfuscatedName(value="cz")
    @ObfuscatedGetter(intValue=1568565173)
    public int field4537 = 0;
    @ObfuscatedName(value="dj")
    public String field4544 = "";
    @ObfuscatedName(value="dk")
    public String field4545 = "";
    @ObfuscatedName(value="dn")
    @ObfuscatedGetter(intValue=1522543889)
    public int field4547 = 0;
    @ObfuscatedName(value="dq")
    public boolean field4550 = false;
    @ObfuscatedName(value="ds")
    @ObfuscatedGetter(intValue=-1258846665)
    public int field4552 = 0;
    @ObfuscatedName(value="dx")
    @ObfuscatedGetter(intValue=1388594611)
    public int field4557 = 0;
    @ObfuscatedName(value="ea")
    public Object[] field4560;
    @ObfuscatedName(value="ed")
    public Object[] field4563;
    @ObfuscatedName(value="ef")
    public Object[] field4565;
    @ObfuscatedName(value="eg")
    public Object[] field4566;
    @ObfuscatedName(value="en")
    public Object[] field4573;
    @ObfuscatedName(value="ew")
    public String field4582 = "";
    @ObfuscatedName(value="ex")
    public int[] field4583;
    @ObfuscatedName(value="ey")
    public boolean field4584 = false;
    @ObfuscatedName(value="fb")
    @ObfuscatedGetter(intValue=1627713247)
    public int field4587 = 0;
    @ObfuscatedName(value="fc")
    public Object[] field4588;
    @ObfuscatedName(value="fd")
    public boolean field4589 = false;
    @ObfuscatedName(value="fe")
    @Export(value="cs1Instructions")
    public int[][] cs1Instructions;
    @ObfuscatedName(value="fg")
    @Export(value="cs1Comparisons")
    public int[] cs1Comparisons;
    @ObfuscatedName(value="fk")
    @ObfuscatedGetter(intValue=781047889)
    @Export(value="modelFrameCycle")
    public int modelFrameCycle = 0;
    @ObfuscatedName(value="fm")
    @Export(value="cs1ComparisonValues")
    public int[] cs1ComparisonValues;
    @ObfuscatedName(value="fp")
    @ObfuscatedGetter(intValue=2016819993)
    @Export(value="modelFrame")
    public int modelFrame = 0;
    @ObfuscatedName(value="fr")
    public int[] field4603;
    @ObfuscatedName(value="fs")
    public String field4604 = Strings.field2772;
    @ObfuscatedName(value="fu")
    public String field4606 = "";
    @ObfuscatedName(value="fv")
    public boolean field4607 = false;
    @ObfuscatedName(value="fx")
    @ObfuscatedGetter(intValue=804137413)
    public int field4609 = -1;
    @ObfuscatedName(value="gd")
    public int field4612 = 0;
    @ObfuscatedName(value="gf")
    @ObfuscatedGetter(intValue=300537349)
    @Export(value="cycle")
    public int cycle = -1;
    @ObfuscatedName(value="gh")
    public boolean field4614 = false;
    @ObfuscatedName(value="gl")
    public boolean field4616 = false;
    @ObfuscatedName(value="gm")
    public int field4617 = 0;
    @ObfuscatedName(value="gw")
    public boolean field4620 = false;
    @ObfuscatedName(value="gy")
    public int field4621 = 0;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1329734837)
    @Export(value="type")
    public int type;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-613681249)
    @Export(value="type")
    public int type = 0;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1353146959)
    public int field4484 = 0;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=207532647)
    public int field4488 = 1;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-1844374771)
    @Export(value="rawX")
    public int rawX = 0;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=574280149)
    public int field4497 = 0;
    @ObfuscatedName(value="bs")
    @ObfuscatedGetter(intValue=-610083203)
    public int field4504 = 0;
    @ObfuscatedName(value="bu")
    public boolean field4506 = false;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=1672848359)
    public int field4507 = 0;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=340617803)
    @Export(value="parentId")
    public int parentId = -1;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=-423636609)
    public int field4513 = -1;
    @ObfuscatedName(value="cc")
    public boolean field4514 = false;
    @ObfuscatedName(value="cd")
    @ObfuscatedGetter(intValue=2004497857)
    public int field4515 = 0;
    @ObfuscatedName(value="cg")
    @ObfuscatedGetter(intValue=1643310417)
    public int field4518 = -1;
    @ObfuscatedName(value="ch")
    @ObfuscatedGetter(intValue=805853527)
    public int field4519 = 0;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=382426005)
    int field4525 = -1;
    @ObfuscatedName(value="cq")
    public boolean field4528 = false;
    @ObfuscatedName(value="cs")
    @ObfuscatedGetter(intValue=-185385097)
    public int field4530 = 0;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=-1668724765)
    @Export(value="sequenceId")
    public int sequenceId = -1;
    @ObfuscatedName(value="cy")
    @ObfuscatedGetter(intValue=1952138031)
    public int field4536 = 0;
    @ObfuscatedName(value="df")
    @ObfuscatedGetter(intValue=-545277729)
    @Export(value="fontId")
    public int fontId = -1;
    @ObfuscatedName(value="di")
    @ObfuscatedGetter(intValue=1594454107)
    public int field4543 = 0;
    @ObfuscatedName(value="eb")
    public Object[] field4561;
    @ObfuscatedName(value="eh")
    public Object[] field4567;
    @ObfuscatedName(value="ej")
    public int[] field4569;
    @ObfuscatedName(value="el")
    public int[] field4571;
    @ObfuscatedName(value="eo")
    public Object[] field4574;
    @ObfuscatedName(value="ep")
    public Object[] field4575;
    @ObfuscatedName(value="eq")
    public Object[] field4576;
    @ObfuscatedName(value="es")
    public Object[] field4578;
    @ObfuscatedName(value="et")
    public Object[] field4579;
    @ObfuscatedName(value="eu")
    public boolean field4580 = false;
    @ObfuscatedName(value="ez")
    public Object[] field4585;
    @ObfuscatedName(value="fa")
    @ObfuscatedSignature(descriptor="[Lax;")
    @Export(value="children")
    public Widget[] children;
    @ObfuscatedName(value="fo")
    public int[] field4600;
    @ObfuscatedName(value="fq")
    @ObfuscatedGetter(intValue=-2089491513)
    public int field4602 = -1;
    @ObfuscatedName(value="fz")
    public Object[] field4611;
    @ObfuscatedName(value="gq")
    @ObfuscatedGetter(intValue=1798779953)
    public int field4618 = 1;
    @ObfuscatedName(value="gs")
    @ObfuscatedGetter(intValue=37616003)
    public int field4619 = -1;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=1902048453)
    public int field4491 = 0;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-511476357)
    public int field4508 = 0;
    @ObfuscatedName(value="da")
    @ObfuscatedSignature(descriptor="Lax;")
    public Widget field4538 = null;
    @ObfuscatedName(value="db")
    @ObfuscatedGetter(intValue=-1656954595)
    public int field4539 = 0;
    @ObfuscatedName(value="dd")
    @Export(value="inventorySprites")
    public int[] inventorySprites;
    @ObfuscatedName(value="dh")
    public String[] field4542;
    @ObfuscatedName(value="do")
    @ObfuscatedGetter(intValue=100591639)
    public int field4548 = 0;
    @ObfuscatedName(value="du")
    public int[] field4554;
    @ObfuscatedName(value="dv")
    public boolean field4555 = false;
    @ObfuscatedName(value="dw")
    public String[] field4556;
    @ObfuscatedName(value="dy")
    public String field4558 = "";
    @ObfuscatedName(value="dz")
    public int[] field4559;
    @ObfuscatedName(value="ec")
    public Object[] field4562;
    @ObfuscatedName(value="ee")
    @ObfuscatedGetter(intValue=412311289)
    public int field4564 = 0;
    @ObfuscatedName(value="ei")
    public Object[] field4568;
    @ObfuscatedName(value="ek")
    public Object[] field4570;
    @ObfuscatedName(value="em")
    @ObfuscatedGetter(intValue=667778999)
    public int field4572 = 0;
    @ObfuscatedName(value="er")
    public Object[] field4577;
    @ObfuscatedName(value="ev")
    public boolean field4581 = false;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=-35303599)
    @Export(value="height")
    public int height = 0;
    @ObfuscatedName(value="cp")
    @ObfuscatedGetter(intValue=1632982689)
    public int field4527 = -1;

    static {
        Widget_cachedFonts = new EvictingDualNodeHashTable(20, null);
        field4474 = new EvictingDualNodeHashTable(8, null);
        field4473 = false;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lmi;B)[I")
    int[] method7543(Buffer buffer, byte by) {
        int n = buffer.method11650(827570935);
        if (n == 0) {
            return null;
        }
        int[] arrn = new int[n];
        by = 0;
        while (by < n) {
            arrn[by] = buffer.method11670(1604085085);
            by = (byte)(by + 1);
        }
        return arrn;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(ZI)Lek;")
    public class384 method7546(boolean bl, int n) {
        class384 class3842;
        field4473 = false;
        n = !bl ? this.field4527 : this.field4518;
        if (n == -1) {
            return null;
        }
        bl = this.field4517;
        long l = 0L;
        long l2 = bl ? 1L : 0L;
        long l3 = this.field4515;
        long l4 = n;
        if (this.field4533) {
            l = 1L;
        }
        if ((class3842 = (class384)Widget_cachedSprites.get(l2 = (l2 << 39) + ((l3 << 36) + l4 + (l << 38)) + ((long)this.field4519 << 40))) != null) {
            return class3842;
        }
        class3842 = class171.method6496(class97.Widget_spritesArchive, n, 0);
        if (class3842 != null) {
            if (this.field4533) {
                class3842.method13305();
            }
            if (this.field4517) {
                class3842.method13294();
            }
            if (this.field4515 > 0) {
                class3842.method13310(this.field4515);
            }
            if (this.field4515 >= 1) {
                class3842.method13296(1);
            }
            if (this.field4515 >= 2) {
                class3842.method13296(0xFFFFFF);
            }
            if (this.field4519 != 0) {
                class3842.method13298(this.field4519);
            }
            Widget_cachedSprites.put(class3842, l2);
            return class3842;
        }
        field4473 = true;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lmi;B)V")
    void method7547(Buffer buffer, byte by) {
        buffer.method11650(-481520892);
        this.isIf3 = true;
        this.type = buffer.method11650(1924657583);
        this.type = buffer.method11637(-731616679);
        this.rawX = buffer.method11635(1277637855);
        this.rawY = buffer.method11635(1277637855);
        this.field4491 = buffer.method11637(1404982813);
        this.field4495 = this.type == 9 ? buffer.method11635(1277637855) : buffer.method11637(-1105305508);
        this.field4483 = buffer.method11636(1557990761);
        this.field4501 = buffer.method11636(1813036920);
        this.xAlignment = buffer.method11636(1522373814);
        this.yAlignment = buffer.method11636(1812827929);
        this.parentId = buffer.method11637(1564269783);
        this.parentId = this.parentId == 65535 ? -1 : (0xFFFF0000 & this.id) + this.parentId;
        by = (byte)buffer.method11650(887322545);
        boolean bl = false;
        boolean bl2 = by == 1;
        this.isHidden = bl2;
        if (this.type == 0) {
            this.field4487 = buffer.method11637(1248799231);
            this.field4507 = buffer.method11637(-869270786);
            bl2 = buffer.method11650(880151387) == 1;
            this.field4616 = bl2;
        }
        if (this.type == 5) {
            this.field4527 = buffer.method11670(1604085085);
            this.field4526 = buffer.method11637(1356155446);
            bl2 = buffer.method11650(1515794968) == 1;
            this.field4528 = bl2;
            this.field4504 = buffer.method11650(609650892);
            this.field4515 = buffer.method11650(424803639);
            this.field4519 = buffer.method11670(1604085085);
            bl2 = buffer.method11650(1406753281) == 1;
            this.field4533 = bl2;
            bl2 = buffer.method11650(-663937011) == 1;
            this.field4517 = bl2;
        }
        if (this.type == 6) {
            this.field4522 = 1;
            this.field4513 = buffer.method11637(2041351564);
            if (this.field4513 == 65535) {
                this.field4513 = -1;
            }
            this.field4530 = buffer.method11635(1277637855);
            this.field4535 = buffer.method11635(1277637855);
            this.field4524 = buffer.method11637(1164838924);
            this.field4516 = buffer.method11637(-1240181027);
            this.field4537 = buffer.method11637(-1444124929);
            this.field4520 = buffer.method11637(-206048045);
            this.sequenceId = buffer.method11637(1503612654);
            if (this.sequenceId == 65535) {
                this.sequenceId = -1;
            }
            bl2 = buffer.method11650(-2125547355) == 1;
            this.field4514 = bl2;
            buffer.method11637(-1170966537);
            if (this.field4483 != 0) {
                this.field4536 = buffer.method11637(420325187);
            }
            if (this.field4501 != 0) {
                buffer.method11637(-1303496519);
            }
        }
        if (this.type == 4) {
            this.fontId = buffer.method11637(267576964);
            if (this.fontId == 65535) {
                this.fontId = -1;
            }
            this.field4545 = buffer.method11664(-1860128894);
            this.field4552 = buffer.method11650(418972983);
            this.field4557 = buffer.method11650(564163112);
            this.field4547 = buffer.method11650(1567046521);
            bl2 = buffer.method11650(-471088440) == 1;
            this.field4550 = bl2;
            this.field4509 = buffer.method11670(1604085085);
        }
        if (this.type == 3) {
            this.field4509 = buffer.method11670(1604085085);
            bl2 = buffer.method11650(-1946816686) == 1;
            this.field4506 = bl2;
            this.field4504 = buffer.method11650(-1648111195);
        }
        if (this.type == 9) {
            this.field4500 = buffer.method11650(885878151);
            this.field4509 = buffer.method11670(1604085085);
            bl2 = buffer.method11650(1785060815) == 1;
            this.field4534 = bl2;
        }
        this.field4548 = buffer.method11649(1383894897);
        this.field4558 = buffer.method11664(-1949331679);
        int n = buffer.method11650(-1909899592);
        if (n > 0) {
            this.field4542 = new String[n];
            for (by = 0; by < n; by = (byte)(by + 1)) {
                this.field4542[by] = buffer.method11664(-1978714764);
            }
        }
        this.field4572 = buffer.method11650(1219046491);
        this.field4564 = buffer.method11650(554527726);
        bl2 = bl;
        if (buffer.method11650(-66730135) == 1) {
            bl2 = true;
        }
        this.field4581 = bl2;
        this.field4582 = buffer.method11664(-2083909694);
        this.field4566 = this.method7548(buffer, -456462301);
        this.field4565 = this.method7548(buffer, -1304281156);
        this.field4573 = this.method7548(buffer, 1614757684);
        this.field4570 = this.method7548(buffer, -1347595458);
        this.field4577 = this.method7548(buffer, -987373797);
        this.field4563 = this.method7548(buffer, 1924654383);
        this.field4579 = this.method7548(buffer, -1566039396);
        this.field4576 = this.method7548(buffer, -1428079197);
        this.field4568 = this.method7548(buffer, 306777743);
        this.field4574 = this.method7548(buffer, -196962537);
        this.field4561 = this.method7548(buffer, 2125172257);
        this.field4585 = this.method7548(buffer, -978133936);
        this.field4567 = this.method7548(buffer, -963650957);
        this.field4578 = this.method7548(buffer, 2054373316);
        this.field4560 = this.method7548(buffer, -662988974);
        this.field4562 = this.method7548(buffer, 916596084);
        this.field4575 = this.method7548(buffer, -1536723564);
        this.field4611 = this.method7548(buffer, 1476789345);
        this.field4571 = this.method7543(buffer, (byte)1);
        this.field4583 = this.method7543(buffer, (byte)1);
        this.field4569 = this.method7543(buffer, (byte)1);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lmi;I)[Ljava/lang/Object;")
    Object[] method7548(Buffer buffer, int n) {
        int n2 = buffer.method11650(1048673322);
        if (n2 == 0) {
            return null;
        }
        Object[] arrobject = new Object[n2];
        n = 0;
        while (true) {
            if (n >= n2) {
                this.field4584 = true;
                return arrobject;
            }
            int n3 = buffer.method11650(-978444737);
            if (n3 != 0) {
                if (n3 == 1) {
                    arrobject[n] = buffer.method11664(-1930684953);
                }
            } else {
                arrobject[n] = new Integer(buffer.method11670(1604085085));
            }
            ++n;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(IB)Lek;", garbageValue="14")
    @Export(value="getInventorySprite")
    public class384 getInventorySprite(int n) {
        field4473 = false;
        if (n < 0) {
            return null;
        }
        if (n < this.inventorySprites.length) {
            if ((n = this.inventorySprites[n]) == -1) {
                return null;
            }
            Object object = Widget_cachedSprites;
            long l = n;
            if ((object = (class384)((EvictingDualNodeHashTable)object).get(l)) != null) {
                return object;
            }
            object = class171.method6496(class97.Widget_spritesArchive, n, 0);
            if (object == null) {
                field4473 = true;
                return object;
            }
            Widget_cachedSprites.put((DualNode)object, l);
            return object;
        }
        return null;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ldv;IZLaj;B)Lcp;")
    public Model method7550(SequenceDefinition sequenceDefinition, int n, boolean bl, class6 object, byte by) {
        block14: {
            block16: {
                block18: {
                    Object object2;
                    block12: {
                        long l;
                        block17: {
                            int n2;
                            block15: {
                                block13: {
                                    field4473 = false;
                                    if (!bl) {
                                        by = (byte)this.field4522;
                                        n2 = this.field4513;
                                    } else {
                                        by = (byte)this.field4512;
                                        n2 = this.field4525;
                                    }
                                    if (by == 0) {
                                        return null;
                                    }
                                    if (by == 1 && n2 == -1) {
                                        return null;
                                    }
                                    object2 = field4472;
                                    l = n2 + (by << 16);
                                    Model model = (Model)((EvictingDualNodeHashTable)object2).get(l);
                                    object2 = model;
                                    if (model != null) break block12;
                                    object2 = model;
                                    if (by != 1) break block13;
                                    object2 = ModelData.ModelData_get(class290.field5975, n2, 0);
                                    if (object2 == null) break block14;
                                    object2 = ((ModelData)object2).toModel(64, 768, -50, -10, -50);
                                }
                                if (by != 2) break block15;
                                object2 = ItemContainer.getNpcDefinition(n2).method13363(2097411);
                                if (object2 == null) break block16;
                                object2 = ((ModelData)object2).toModel(64, 768, -50, -10, -50);
                            }
                            if (by == 3) {
                                if (object == null) {
                                    return null;
                                }
                                if ((object = ((class6)object).method92(-851048073)) != null) {
                                    object2 = ((ModelData)object).toModel(64, 768, -50, -10, -50);
                                } else {
                                    field4473 = true;
                                    return null;
                                }
                            }
                            if (by != 4) break block17;
                            object = class324.ItemDefinition_get(n2);
                            object2 = ((ItemDefinition)object).method13080(10, -2143112652);
                            if (object2 == null) break block18;
                            object2 = ((ModelData)object2).toModel(((ItemDefinition)object).field7029 + 64, ((ItemDefinition)object).field7031 + 768, -50, -10, -50);
                        }
                        field4472.put((DualNode)object2, l);
                    }
                    object = object2;
                    if (sequenceDefinition != null) {
                        object = sequenceDefinition.method13168((Model)object2, n, 180178923);
                    }
                    return object;
                }
                field4473 = true;
                return null;
            }
            field4473 = true;
            return null;
        }
        field4473 = true;
        return null;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Loc;", garbageValue="-1779459292")
    @Export(value="getFont")
    public class399 getFont() {
        field4473 = false;
        if (this.fontId != -1) {
            class399 class3992 = (class399)Widget_cachedFonts.get(this.fontId);
            if (class3992 != null) {
                return class3992;
            }
            class3992 = class274.method7826(class97.Widget_spritesArchive, ArchiveDiskAction.Widget_fontsArchive, this.fontId, 0);
            if (class3992 == null) {
                field4473 = true;
                return class3992;
            }
            Widget_cachedFonts.put(class3992, this.fontId);
            return class3992;
        }
        return null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;B)V")
    void method7553(Buffer buffer, byte by) {
        int n;
        this.isIf3 = false;
        this.type = buffer.method11650(-1997275746);
        this.field4484 = buffer.method11650(1882630228);
        this.type = buffer.method11637(-1379451546);
        this.rawX = buffer.method11635(1277637855);
        this.rawY = buffer.method11635(1277637855);
        this.field4491 = buffer.method11637(-1302458744);
        this.field4495 = buffer.method11637(-1027823453);
        this.field4504 = buffer.method11650(-1822746520);
        this.parentId = buffer.method11637(1088419272);
        this.parentId = this.parentId == 65535 ? -1 : (this.id & 0xFFFF0000) + this.parentId;
        this.field4609 = buffer.method11637(87635983);
        if (this.field4609 == 65535) {
            this.field4609 = -1;
        }
        if ((n = buffer.method11650(-1027567805)) > 0) {
            this.cs1Comparisons = new int[n];
            this.cs1ComparisonValues = new int[n];
            for (by = 0; by < n; by = (byte)(by + 1)) {
                this.cs1Comparisons[by] = buffer.method11650(226664791);
                this.cs1ComparisonValues[by] = buffer.method11637(138636904);
            }
        }
        boolean bl = true;
        block1: while (true) {
            block43: {
                block41: {
                    String string2;
                    boolean bl2;
                    block42: {
                        if (!bl || (bl = false)) continue;
                        int n2 = buffer.method11650(956263336);
                        if (n2 <= 0) break block42;
                        this.cs1Instructions = new int[n2][];
                        by = 0;
                        if (by < n2) break block43;
                    }
                    if (this.type == 0) {
                        this.field4507 = buffer.method11637(200730014);
                        bl2 = buffer.method11650(-1452619527) == 1;
                        this.isHidden = bl2;
                    }
                    if (this.type == 1) {
                        buffer.method11637(373112056);
                        buffer.method11650(1479723320);
                    }
                    boolean bl3 = true;
                    while (true) {
                        block45: {
                            block46: {
                                block44: {
                                    if (!bl3 || (bl3 = false)) continue;
                                    if (this.type != 2) break block44;
                                    this.field4603 = new int[this.field4491 * this.field4495];
                                    this.field4600 = new int[this.field4495 * this.field4491];
                                    if (1 == buffer.method11650(1263468240)) {
                                        this.field4548 |= 0x10000000;
                                    }
                                    if (1 == buffer.method11650(-1631818109)) {
                                        this.field4548 |= 0x40000000;
                                    }
                                    if (1 == buffer.method11650(35737439)) {
                                        this.field4548 |= Integer.MIN_VALUE;
                                    }
                                    if (buffer.method11650(-966356606) == 1) {
                                        this.field4548 |= 0x20000000;
                                    }
                                    this.field4543 = buffer.method11650(-362573000);
                                    this.field4539 = buffer.method11650(827245862);
                                    this.field4554 = new int[20];
                                    this.field4559 = new int[20];
                                    this.inventorySprites = new int[20];
                                    by = 0;
                                    while (true) {
                                        if (by >= 20) break;
                                        if (1 == buffer.method11650(1573551887)) {
                                            this.field4554[by] = buffer.method11635(1277637855);
                                            this.field4559[by] = buffer.method11635(1277637855);
                                            this.inventorySprites[by] = buffer.method11670(1604085085);
                                        } else {
                                            this.inventorySprites[by] = -1;
                                        }
                                        by = (byte)(by + 1);
                                    }
                                    this.field4556 = new String[5];
                                    by = 0;
                                    if (by >= 5) break block44;
                                    string2 = buffer.method11664(-1798892368);
                                    if (string2.length() <= 0) break block45;
                                    break block46;
                                }
                                if (this.type == 3) {
                                    bl2 = buffer.method11650(409481193) == 1;
                                    this.field4506 = bl2;
                                }
                                if (this.type == 4 || this.type == 1) {
                                    this.field4557 = buffer.method11650(-758668086);
                                    this.field4547 = buffer.method11650(1159764833);
                                    this.field4552 = buffer.method11650(-1982302834);
                                    this.fontId = buffer.method11637(340164717);
                                    if (this.fontId == 65535) {
                                        this.fontId = -1;
                                    }
                                    bl2 = buffer.method11650(1121774792) == 1;
                                    this.field4550 = bl2;
                                }
                                if (this.type == 4) {
                                    this.field4545 = buffer.method11664(-1965522584);
                                    this.field4544 = buffer.method11664(-2143279052);
                                }
                                if (this.type == 1 || this.type == 3 || this.type == 4) {
                                    this.field4509 = buffer.method11670(1604085085);
                                }
                                if (this.type == 3 || this.type == 4) {
                                    this.field4486 = buffer.method11670(1604085085);
                                    this.field4508 = buffer.method11670(1604085085);
                                    this.field4497 = buffer.method11670(1604085085);
                                }
                                if (this.type == 5) {
                                    this.field4527 = buffer.method11670(1604085085);
                                    this.field4518 = buffer.method11670(1604085085);
                                }
                                if (this.type == 6) {
                                    this.field4522 = 1;
                                    this.field4513 = buffer.method11637(1289635904);
                                    if (this.field4513 == 65535) {
                                        this.field4513 = -1;
                                    }
                                    this.field4512 = 1;
                                    this.field4525 = buffer.method11637(1216316429);
                                    if (this.field4525 == 65535) {
                                        this.field4525 = -1;
                                    }
                                    this.sequenceId = buffer.method11637(631514613);
                                    if (this.sequenceId == 65535) {
                                        this.sequenceId = -1;
                                    }
                                    this.sequenceId2 = buffer.method11637(-1022209192);
                                    if (this.sequenceId2 == 65535) {
                                        this.sequenceId2 = -1;
                                    }
                                    this.field4520 = buffer.method11637(1709775577);
                                    this.field4524 = buffer.method11637(1310123937);
                                    this.field4516 = buffer.method11637(-162612820);
                                }
                                if (this.type == 7) {
                                    this.field4603 = new int[this.field4495 * this.field4491];
                                    this.field4600 = new int[this.field4491 * this.field4495];
                                    this.field4557 = buffer.method11650(743003347);
                                    this.fontId = buffer.method11637(202998670);
                                    if (this.fontId == 65535) {
                                        this.fontId = -1;
                                    }
                                    bl2 = buffer.method11650(-2118478188) == 1;
                                    this.field4550 = bl2;
                                    this.field4509 = buffer.method11670(1604085085);
                                    this.field4543 = buffer.method11635(1277637855);
                                    this.field4539 = buffer.method11635(1277637855);
                                    if (1 == buffer.method11650(1912392817)) {
                                        this.field4548 |= 0x40000000;
                                    }
                                    this.field4556 = new String[5];
                                    break;
                                }
                                break block41;
                            }
                            this.field4556[by] = string2;
                            this.field4548 |= 1 << by + 23;
                        }
                        by = (byte)(by + 1);
                    }
                    for (by = 0; by < 5; by = (byte)(by + 1)) {
                        string2 = buffer.method11664(-1825340143);
                        if (string2.length() <= 0) continue;
                        this.field4556[by] = string2;
                        this.field4548 |= 1 << by + 23;
                    }
                }
                if (this.type == 8) {
                    this.field4545 = buffer.method11664(-1987693886);
                }
                if (this.field4484 == 2 || this.type == 2) {
                    this.field4582 = buffer.method11664(-1937142518);
                    this.field4606 = buffer.method11664(-1828011994);
                    this.field4548 = (buffer.method11637(-418086739) & 0x3F) << 11 | this.field4548;
                }
                if (this.field4484 == 1 || this.field4484 == 4 || this.field4484 == 5 || this.field4484 == 6) {
                    this.field4604 = buffer.method11664(-1747518083);
                    if (this.field4604.length() == 0) {
                        if (this.field4484 == 1) {
                            this.field4604 = Strings.field2772;
                        }
                        if (this.field4484 == 4) {
                            this.field4604 = Strings.field2783;
                        }
                        if (this.field4484 == 5) {
                            this.field4604 = Strings.field2783;
                        }
                        if (this.field4484 == 6) {
                            this.field4604 = Strings.field2774;
                        }
                    }
                }
                if (this.field4484 == 1 || this.field4484 == 4 || this.field4484 == 5) {
                    this.field4548 |= 0x400000;
                }
                if (this.field4484 == 6) {
                    this.field4548 |= 1;
                }
                return;
            }
            int n3 = buffer.method11637(1275252023);
            this.cs1Instructions[by] = new int[n3];
            n = 0;
            while (true) {
                block48: {
                    block49: {
                        block47: {
                            if (n >= n3) break block47;
                            this.cs1Instructions[by][n] = buffer.method11637(-1444327771);
                            if (this.cs1Instructions[by][n] != 65535) break block48;
                            break block49;
                        }
                        by = (byte)(by + 1);
                        continue block1;
                    }
                    this.cs1Instructions[by][n] = -1;
                }
                ++n;
            }
            break;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ZI)Lab;")
    public class363 method7555(boolean bl, int n) {
        if (this.field4518 == -1) {
            bl = false;
        }
        int n2 = !bl ? this.field4527 : this.field4518;
        if (n2 == -1) {
            return null;
        }
        boolean bl2 = this.field4533;
        long l = 1L;
        long l2 = bl2 ? 1L : 0L;
        long l3 = this.field4515;
        long l4 = n2;
        if (!this.field4517) {
            l = 0L;
        }
        l2 = (l2 << 38) + ((l3 << 36) + l4) + (l << 39) + ((long)this.field4519 << 40);
        DualNode dualNode = (class363)field4474.get(l2);
        if (dualNode != null) {
            return dualNode;
        }
        dualNode = this.method7546(bl, -283438647);
        if (dualNode == null) {
            return null;
        }
        dualNode = ((class384)dualNode).method13291();
        int[] arrn = new int[((class384)dualNode).field7127];
        int[] arrn2 = new int[((class384)dualNode).field7127];
        int n3 = 0;
        while (true) {
            int n4;
            block11: {
                int n5;
                block10: {
                    if (n3 >= ((class384)dualNode).field7127) {
                        dualNode = new class363(((class384)dualNode).field7125, ((class384)dualNode).field7127, arrn2, arrn, n2);
                        field4474.put(dualNode, l2);
                        return dualNode;
                    }
                    n5 = ((class384)dualNode).field7125;
                    for (n = 0; n < ((class384)dualNode).field7125; ++n) {
                        if (((class384)dualNode).field7129[n3 * ((class384)dualNode).field7125 + n] != 0) {
                            continue;
                        }
                        break block10;
                    }
                    n = 0;
                }
                int n6 = ((class384)dualNode).field7125 - 1;
                while (true) {
                    n4 = n5;
                    if (n6 < n) break block11;
                    if (((class384)dualNode).field7129[n6 + n3 * ((class384)dualNode).field7125] == 0) break;
                    --n6;
                }
                n4 = n6 + 1;
            }
            arrn[n3] = n;
            arrn2[n3] = n4 - n;
            ++n3;
        }
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Lbb;B)V", garbageValue="-15")
    public static final void method7539(class20 class204) {
        Rasterizer3D.field339 = class204;
    }

    @ObfuscatedName(value="fd")
    @ObfuscatedSignature(descriptor="(Lax;I)Z")
    @Export(value="runCs1")
    static final boolean runCs1(Widget widget, int n) {
        if (widget.cs1Comparisons != null) {
            n = 0;
            while (true) {
                if (n < widget.cs1Comparisons.length) {
                    int n2;
                    int n3 = class28.method855(widget, n, 485314391);
                    int n4 = widget.cs1ComparisonValues[n];
                    if (widget.cs1Comparisons[n] != 2 ? (widget.cs1Comparisons[n] != 3 ? ((n2 = widget.cs1Comparisons[n]) == 4 ? n3 == n4 : n4 != n3) : n3 <= n4) : n3 >= n4) {
                        return false;
                    }
                } else {
                    return true;
                }
                ++n;
            }
        }
        return false;
    }
}

