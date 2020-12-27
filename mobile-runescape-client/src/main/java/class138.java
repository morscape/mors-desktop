/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ji")
public abstract class class138
implements Runnable {
    @ObfuscatedName(value="ux")
    static volatile boolean field3546;
    @ObfuscatedName(value="sl")
    @ObfuscatedSignature(descriptor="Lji;")
    static class138 field3538;
    @ObfuscatedName(value="sh")
    @ObfuscatedSignature(descriptor="Lmx;")
    static class196 field3536;
    @ObfuscatedName(value="sc")
    static boolean field3535 = false;
    @ObfuscatedName(value="sj")
    @ObfuscatedGetter(intValue=1386476587)
    static int field3537;
    @ObfuscatedName(value="tk")
    @ObfuscatedGetter(longValue=1643219587710594665L)
    static final long field3543;
    @ObfuscatedName(value="tc")
    static long[] field3540;
    @ObfuscatedName(value="uo")
    @ObfuscatedSignature(descriptor="Ljz;")
    static class149 field3545;
    @ObfuscatedName(value="tg")
    @ObfuscatedGetter(intValue=1406372135)
    protected static int field3541;
    @ObfuscatedName(value="th")
    static long[] field3542;
    @ObfuscatedName(value="sx")
    @ObfuscatedGetter(longValue=2310197003391972193L)
    static long field3539;
    @ObfuscatedName(value="uf")
    @ObfuscatedGetter(intValue=1900508794)
    static int field3544;
    @ObfuscatedName(value="un")
    @ObfuscatedGetter(intValue=2071725539)
    protected int field3565 = -1;
    @ObfuscatedName(value="uj")
    URL field3564;
    @ObfuscatedName(value="uy")
    HashMap field3572;
    @ObfuscatedName(value="ug")
    @ObfuscatedSignature(descriptor="Ljv;")
    final class321 field3561;
    @ObfuscatedName(value="uh")
    @ObfuscatedSignature(descriptor="Lpc;")
    Bounds field3562;
    @ObfuscatedName(value="uu")
    @ObfuscatedSignature(descriptor="Ljx;")
    class322 field3569;
    @ObfuscatedName(value="us")
    @ObfuscatedSignature(descriptor="Lby;")
    class34 field3568;
    @ObfuscatedName(value="tv")
    @ObfuscatedGetter(intValue=-1701711383)
    int field3555 = 0;
    @ObfuscatedName(value="uc")
    @ObfuscatedSignature(descriptor="Ljl;")
    class141 field3559;
    @ObfuscatedName(value="td")
    @ObfuscatedGetter(intValue=1640537049)
    int field3548;
    @ObfuscatedName(value="ui")
    @ObfuscatedGetter(intValue=212602833)
    int field3563 = -1;
    @ObfuscatedName(value="uq")
    boolean field3566 = false;
    @ObfuscatedName(value="tn")
    @ObfuscatedGetter(intValue=-1265646685)
    int field3550;
    @ObfuscatedName(value="uv")
    @ObfuscatedSignature(descriptor="Lfn;")
    protected class297 field3570 = new class297();
    @ObfuscatedName(value="ur")
    @ObfuscatedSignature(descriptor="Led;")
    protected class58 field3567;
    @ObfuscatedName(value="tw")
    @ObfuscatedGetter(intValue=751065731)
    int field3556;
    @ObfuscatedName(value="ty")
    int field3557 = 0;
    @ObfuscatedName(value="tf")
    @ObfuscatedGetter(intValue=-703298283)
    int field3549;
    @ObfuscatedName(value="ud")
    @ObfuscatedGetter(intValue=-733129995)
    int field3560;
    @ObfuscatedName(value="tt")
    @ObfuscatedGetter(intValue=-1595176635)
    protected int field3554;
    @ObfuscatedName(value="tb")
    @ObfuscatedGetter(intValue=-58269547)
    int field3547;
    @ObfuscatedName(value="tr")
    @ObfuscatedGetter(intValue=-1278251243)
    protected int field3552;
    @ObfuscatedName(value="ts")
    protected float field3553;
    @ObfuscatedName(value="uw")
    volatile boolean field3571 = true;
    @ObfuscatedName(value="tz")
    @ObfuscatedGetter(intValue=1959727461)
    int field3558;
    @ObfuscatedName(value="to")
    @ObfuscatedGetter(intValue=-270590949)
    int field3551;

    static {
        field3543 = TimeUnit.MILLISECONDS.toNanos(20L);
        field3541 = 0;
        field3542 = new long[32];
        field3540 = new long[32];
        field3545 = new class149();
        field3544 = -302163416;
        field3546 = true;
    }

    protected class138() {
        this.field3561 = new class321();
        this.field3572 = new HashMap();
        new class206(250);
        ItemContainer.method12839(new DevicePcmPlayerProvider());
        this.field3561.method4729(this.field3570);
    }

    @ObfuscatedName(value="acg")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1023514602")
    @Export(value="hasUnwrittenChanges")
    protected boolean hasUnwrittenChanges() {
        String string2 = this.field3559.method5964().getHost();
        if (!string2.equals("jagex.com")) {
            if (!string2.endsWith(".jagex.com")) {
                if (!string2.equals("runescape.com")) {
                    if (!string2.endsWith(".runescape.com")) {
                        String string3 = string2;
                        if (!string2.endsWith("127.0.0.1")) {
                            while (string3.length() > 0 && string3.charAt(string3.length() - 1) >= '0' && string3.charAt(string3.length() - 1) <= '9') {
                                string3 = string3.substring(0, string3.length() - 1);
                            }
                            if (!string3.endsWith("192.168.1.")) {
                                this.error(class196.field3903);
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
                return true;
            }
        } else {
            return true;
        }
        return true;
    }

    @ObfuscatedName(value="acq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="372452399")
    final void method5735() {
        this.field3568.method957();
        ak.method3390();
        this.method5737();
        this.method5730();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="acz")
    @ObfuscatedSignature(descriptor="(IIIIIIB)V", garbageValue="-45")
    final void method5744(int n, int n2, int n3, int n4, int n5, int n6) {
        String string2;
        block5: {
            try {
                Thread.currentThread().setName("NXT");
                field3538 = this;
                class50.field2368 = n;
                class127.field3441 = n2;
                this.field3558 = n;
                this.field3551 = n2;
                this.method5747();
                class251.field4319 = n5;
                class251.field4322 = n6;
                this.field3568 = class304.method11055();
                class248.field4306 = new TaskHandler();
                class248.field4306.method6699(this, 1);
            }
            catch (Exception exception) {
                class56.RunException_sendStackTrace(null, exception);
                return;
            }
            try {
                string2 = System.getProperty("os.name");
                break block5;
            }
            catch (Exception exception) {}
            string2 = "Unknown";
        }
        string2.toLowerCase();
    }

    @ObfuscatedName(value="acl")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1128156109")
    void method5730() {
        this.field3550 = ak.method3354(880466380);
        if (this.field3550 < 1) {
            this.field3550 = 1;
        }
        this.field3549 = ak.method3372(1943847378);
        if (this.field3549 < 1) {
            this.field3549 = 1;
        }
        this.field3553 = (float)this.field3550 / (float)this.field3549;
        this.method5747();
    }

    @ObfuscatedName(value="adi")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1353038025")
    public final void method5752() {
        if (this == field3538) {
            if (!field3535) {
                field3539 = class363.currentTimeMillis();
                class52.sleepExact(5000L);
                this.method5736();
                return;
            }
        } else {
            return;
        }
    }

    @ObfuscatedName(value="adk")
    @ObfuscatedSignature(descriptor="(I)Lpc;", garbageValue="540645831")
    Bounds method5753() {
        Bounds bounds = new Bounds(this.field3550, this.field3549);
        return bounds;
    }

    @ObfuscatedName(value="adw")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="572515916")
    boolean method5764() {
        class196 class1962 = field3536;
        return class1962 != null;
    }

    @ObfuscatedName(value="adc")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-269598454")
    boolean method5747() {
        boolean bl;
        boolean bl2 = bl = false;
        if (this.field3550 != 0) {
            bl2 = bl;
            if (this.field3549 != 0) {
                class69 class692 = BZip2State.field3660.method12011();
                bl2 = this.method5750(this.method5748(class692.method4116(1858989016)), this.method5759(class692.method4111(-590852369)), this.method5748(class692.method4114((byte)-23)), this.method5759(class692.method4122(1431937828)));
            }
        }
        return bl2;
    }

    @ObfuscatedName(value="ace")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1567683352")
    public final void method5723() {
        try {
            this.method5735();
            while (ak.method3393()) {
                this.method5732();
            }
            this.method5734();
            return;
        }
        catch (Exception exception) {
            class56.RunException_sendStackTrace(null, exception);
            throw new RuntimeException(exception);
        }
        catch (class251 class2512) {
            class56.RunException_sendStackTrace(null, class2512);
            throw new RuntimeException(class2512.method7399());
        }
    }

    @ObfuscatedName(value="abg")
    @ObfuscatedSignature(descriptor="(I)Lms;", garbageValue="-384527541")
    public final class346 method5708() {
        class346 class3462 = BZip2State.field3660;
        return class3462;
    }

    @ObfuscatedName(value="ach")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="12")
    protected String method5726(String string2) {
        string2 = (String)this.field3572.get(string2);
        return string2;
    }

    @ObfuscatedName(value="acs")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-616700898")
    final void method5737() {
        this.field3566 = true;
    }

    @ObfuscatedName(value="adh")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="65535")
    public void method5751() {
        this.field3561.method11408(-593329686);
    }

    @ObfuscatedName(value="adv")
    @ObfuscatedSignature(descriptor="(B)Llp;", garbageValue="-97")
    protected class172 method5763() {
        class346 class3462 = BZip2State.field3660;
        return class3462;
    }

    @ObfuscatedName(value="acd")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="6")
    public final void method5722(boolean bl) {
        this.field3568.method965(bl);
    }

    @ObfuscatedName(value="adl")
    @ObfuscatedSignature(descriptor="(Lmx;I)V", garbageValue="-247438032")
    @Export(value="error")
    protected void error(class196 class1962) {
        if (!this.method5764()) {
            field3536 = class1962;
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="acr")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-174309722")
    final void method5736() {
        TaskHandler taskHandler;
        block10: {
            block9: {
                // MONITORENTER : this
                boolean bl = field3535;
                if (!bl) break block9;
                return;
            }
            field3535 = true;
            this.vmethod8285();
            break block10;
            catch (Exception exception) {}
        }
        if ((taskHandler = class248.field4306) != null) {
            try {
                class248.field4306.close();
            }
            catch (Exception exception) {}
        }
        this.vmethod8281();
        // MONITOREXIT : this
    }

    @ObfuscatedName(value="abq")
    public final int method5714(int n) {
        n = this.field3563 * -90134223;
        return n * 212602833;
    }

    @ObfuscatedName(value="aco")
    void method5733(int n) {
        int[] arrn = ak.method3373();
        n = 0;
        while (n < arrn.length / 2) {
            int n2 = n * 2;
            int n3 = arrn[n2];
            n2 = arrn[n2 + 1];
            long l = class363.currentTimeMillis();
            switch (n3) {
                default: {
                    break;
                }
                case 2: {
                    if (n2 <= 0) break;
                    this.field3570.vmethod11262((char)n2, l);
                    break;
                }
                case 1: {
                    n3 = BZip2State.field3660.vmethod12630(n2);
                    if (n3 < 0) break;
                    this.field3570.vmethod11260(n3, l);
                    break;
                }
                case 0: {
                    n3 = BZip2State.field3660.vmethod12630(n2);
                    if (n3 < 0) break;
                    this.field3570.vmethod11269(n3, l);
                }
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="adz")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="110")
    boolean method5766() {
        while (!this.field3559.method5958(0)) {
            class52.sleepExact(10L);
        }
        for (Map.Entry entry : this.field3559.method5955().field3488.entrySet()) {
            this.method5719(Integer.parseInt((String)entry.getKey()), (String)entry.getValue());
        }
        String string2 = (String)this.field3559.method5955().field3490.get("codebase");
        if (string2 == null) {
            return false;
        }
        boolean bl = this.method5721(string2);
        return bl;
    }

    @ObfuscatedName(value="ads")
    @ObfuscatedSignature(descriptor="(ZB)Z", garbageValue="-85")
    protected final boolean method5760(boolean bl) {
        VarbitDefinition.field6831 = (IndexedSprite[])BZip2State.field3660.vmethod12632(class187.field3847);
        class55.field2410 = (IndexedSprite)BZip2State.field3660.vmethod12632(class187.field3849);
        TextureProvider.field4719 = (IndexedSprite)BZip2State.field3660.vmethod12632(class187.field3845);
        field3545.method6087(VarbitDefinition.field6831, class55.field2410, TextureProvider.field4719);
        return true;
    }

    @ObfuscatedName(value="abb")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="80")
    final void method5704() {
        this.field3556 = this.field3550;
        this.field3547 = this.field3549;
        Bounds bounds = this.method5753();
        this.field3554 = Math.max(bounds.highX, this.field3558);
        this.field3552 = Math.max(bounds.highY, this.field3551);
        if (this.field3554 <= 0) {
            this.field3554 = 1;
        }
        if (this.field3552 <= 0) {
            this.field3552 = 1;
        }
        class50.field2368 = Math.min(this.field3554, this.field3548);
        class127.field3441 = Math.min(this.field3552, this.field3560);
        this.field3555 = (this.field3554 - class50.field2368) / 2;
        this.field3557 = 0;
        if (this.field3567 == null) {
            this.field3567 = new Rasterizer2D(class50.field2368, class127.field3441);
        } else {
            this.field3567.vmethod11016(class50.field2368, class127.field3441);
        }
        this.field3571 = true;
        this.resizeRoot(this.method5747());
    }

    @ObfuscatedName(value="acp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="897767556")
    final void method5734() {
        this.method5752();
    }

    @ObfuscatedName(value="acn")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="610508945")
    final void method5732() {
        this.method5730();
        this.field3568.method964();
        this.method5733(337641788);
        this.method5720(1188559237);
        this.field3561.method11407(BZip2State.field3660, class50.field2368, class127.field3441, this.field3550, this.field3549, 866465921);
    }

    @ObfuscatedName(value="acx")
    @ObfuscatedSignature(descriptor="(I)Ljava/net/URL;", garbageValue="1968691579")
    protected URL method5742() {
        URL uRL = this.field3564;
        return uRL;
    }

    @ObfuscatedName(value="acb")
    void method5720(int n) {
        int[] arrn = ak.method3371();
        n = 0;
        while (n < arrn.length / 4) {
            int n2 = n * 4;
            int n3 = arrn[n2];
            int n4 = arrn[n2 + 1];
            int n5 = arrn[n2 + 2];
            n2 = arrn[n2 + 3];
            long l = class363.currentTimeMillis();
            n4 = this.method5759(n4);
            n5 = this.method5748(n5);
            switch (n3) {
                default: {
                    break;
                }
                case 3: {
                    this.field3570.vmethod11263(n4, n5, l);
                    break;
                }
                case 2: {
                    this.field3570.vmethod11252(0, n2, n4, n5, l);
                    break;
                }
                case 1: {
                    this.field3570.vmethod11251(0, n2, n4, n5, l);
                    break;
                }
                case 0: {
                    this.field3570.vmethod11267(n4, n5, l);
                }
            }
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="adb")
    final void method5746(boolean bl, int n) {
        long l = class363.currentTimeMillis();
        n = 0;
        while (true) {
            if (n >= 500) {
                this.field3559 = new class141(this.field3559.method5964());
                class248.field4306.method6699(this, 1);
                return;
            }
            this.openMenu(0, 539705626);
            long l2 = class363.currentTimeMillis();
            class52.sleepExact(10L - (l2 - l));
            this.method5724();
            if (this.field3567 != null) {
                this.method5756((500 - n - 1) * 10 / 1000 + 1, bl);
            }
            ++n;
            l = l2;
        }
    }

    @ObfuscatedName(value="abn")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1219619957")
    public final void method5711(int n) {
        this.field3563 = n;
        field3545.method6093(n);
    }

    @ObfuscatedName(value="ade")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="10")
    int method5748(int n) {
        n = class127.field3441 * n / this.field3549;
        return n;
    }

    @ObfuscatedName(value="abl")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="496400125")
    public final void method5709(int n) {
        this.field3565 = n;
    }

    @ObfuscatedName(value="acw")
    @ObfuscatedSignature(descriptor="(B)Lfn;", garbageValue="35")
    public final class297 method5741() {
        class297 class2972 = this.field3570;
        return class2972;
    }

    @ObfuscatedName(value="acy")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="562174022")
    void method5743() {
        synchronized (this) {
            class274.field4727 = field3546;
            return;
        }
    }

    @ObfuscatedName(value="abd")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="136550999")
    protected final void method5705(int n, int n2) {
        if (this.field3548 != n || n2 != this.field3560) {
            this.method5737();
        }
        this.field3548 = n;
        this.field3560 = n2;
    }

    @ObfuscatedName(value="aci")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="2085728929")
    protected final void method5727(int n, int n2, int n3, int n4) {
        this.method5744(n, n2, 0, 0, n3, n4);
    }

    @ObfuscatedName(value="adr")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="114")
    int method5759(int n) {
        n = class50.field2368 * n / this.field3550;
        return n;
    }

    @ObfuscatedName(value="aca")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;S)V", garbageValue="-4474")
    void method5719(int n, String string2) {
        this.field3572.put(Integer.toString(n), string2);
    }

    @ObfuscatedName(value="ady")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="546518111")
    public void method5765() {
        if (this.method5747()) {
            this.resizeRoot(true);
        }
    }

    @ObfuscatedName(value="acc")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Z", garbageValue="101")
    boolean method5721(String string2) {
        try {
            this.field3564 = new URL(string2);
            return true;
        }
        catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
            return false;
        }
    }

    @ObfuscatedName(value="acf")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2094902062")
    final void method5724() {
        Bounds bounds = this.method5753();
        if (bounds.highX != this.field3556 || this.field3547 != bounds.highY || this.field3566) {
            this.method5704();
            this.field3566 = false;
        }
    }

    @ObfuscatedName(value="adg")
    @ObfuscatedSignature(descriptor="(IIIII)Z", garbageValue="-2064402934")
    boolean method5750(int n, int n2, int n3, int n4) {
        Bounds bounds;
        if (n < 0 || n2 < 0 || n3 < 0 || n4 < 0 || (bounds = new Bounds(n4, n, class50.field2368 - n2 - n4, class127.field3441 - n3 - n)).equals(this.field3562)) {
            return false;
        }
        this.field3562 = bounds;
        return true;
    }

    @ObfuscatedName(value="abw")
    @ObfuscatedSignature(descriptor="(Lms;I)V", garbageValue="1717635817")
    public final void method5718(class346 class3462) {
        BZip2State.field3660 = class3462;
    }

    @ObfuscatedName(value="adn")
    @ObfuscatedSignature(descriptor="(IZB)V", garbageValue="79")
    final void method5756(int n, boolean bl) {
        block5: {
            block4: {
                if (HealthBar.field6179 == null) {
                    HealthBar.field6179 = (class399)BZip2State.field3660.vmethod12632(class187.field3844);
                }
                if (HealthBar.field6179 == null) break block4;
                if (bl) break block5;
                field3545.method6092(n, HealthBar.field6179, this.field3567, this.field3553);
            }
            return;
        }
        field3545.method6094(n, HealthBar.field6179, this.field3567, this.field3553);
    }

    @ObfuscatedName(value="abt")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1499364046")
    protected void method5715(String string2) {
    }

    @ObfuscatedName(value="ack")
    @ObfuscatedSignature(descriptor="(Ljl;I)V", garbageValue="-1215802642")
    public void method5729(class141 class1412) {
        this.field3559 = class1412;
    }

    @ObfuscatedName(value="adp")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1164691254")
    final void method5758() {
        if (HealthBar.field6179 == null) {
            HealthBar.field6179 = (class399)BZip2State.field3660.vmethod12632(class187.field3844);
        }
        if (HealthBar.field6179 != null) {
            field3545.method6084(HealthBar.field6179, this.field3567, this.field3553);
        }
    }

    @ObfuscatedName(value="abu")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1546822532")
    protected final void method5716() {
    }

    @ObfuscatedName(value="abf")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="360837871")
    protected final void method5707() {
    }

    @ObfuscatedName(value="act")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="85715532")
    void method5738() {
        long l = class363.currentTimeMillis();
        long l2 = field3540[class55.field2409];
        class138.field3540[class55.field2409] = l;
        class55.field2409 = class55.field2409 + 1 & 0x1F;
        this.method5743();
        this.vmethod8290(2143229061);
    }

    @ObfuscatedName(value="acu")
    void method5739(byte by) {
        by = (byte)(this.field3555 * -1455032743);
        by = (byte)this.field3557;
        by = (byte)(this.field3554 * 566075789);
        by = (byte)(class50.field2368 * -2044550075);
        by = (byte)(this.field3552 * 1160407101);
        by = (byte)(class127.field3441 * 2035925329);
    }

    @ObfuscatedName(value="abp")
    @ObfuscatedSignature(descriptor="(I)Lme;", garbageValue="-523414186")
    protected MouseWheel method5713() {
        if (this.field3569 == null) {
            this.field3569 = new class322();
        }
        class322 class3222 = this.field3569;
        return class3222;
    }

    @ObfuscatedName(value="adm")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;ZI)V", garbageValue="-1418933032")
    protected final void method5755(int n, String string2, boolean bl) {
        if (HealthBar.field6179 == null) {
            HealthBar.field6179 = (class399)BZip2State.field3660.vmethod12632(class187.field3844);
        }
        field3545.method6091(n, string2, HealthBar.field6179, this.field3553, this.field3567);
    }

    @ObfuscatedName(value="acm")
    void method5731(float f, int n) {
        long l = class363.currentTimeMillis();
        long l2 = field3542[class272.field4713];
        class138.field3542[class272.field4713] = l;
        class272.field4713 = class272.field4713 + 1 & 0x1F;
        if (0L != l2 && l > l2) {
            n = (int)(l - l2);
            field3541 = ((n >> 1) + 32000) / n;
        }
        n = field3544 * 577930922 + 1557746845;
        field3544 = n * 1900508794;
        if (n * -1101016651 - 1 > 50) {
            field3544 = field3544 * -1748203260 - -1748203260;
            this.field3571 = true;
        }
        this.method5724();
        this.vmethod8288(this.field3571, f, -1824424827);
        if (this.field3571) {
            this.method5739((byte)55);
        }
        this.field3571 = false;
    }

    @ObfuscatedName(value="ada")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-837545547")
    protected void method5745() {
        --field3537;
        if (HealthBar.field6179 == null) {
            HealthBar.field6179 = (class399)BZip2State.field3660.vmethod12632(class187.field3844);
        }
        if (HealthBar.field6179 != null) {
            field3545.method6101(field3536, HealthBar.field6179, this.field3567, this.field3553);
        }
        if (class196.field3906 == field3536 && field3537 * -1 == 200) {
            BZip2State.field3660.vmethod12619();
        }
    }

    @ObfuscatedName(value="abo")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-976402848")
    protected void method5712() {
    }

    @ObfuscatedName(value="adf")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="123")
    protected final void method5749() {
    }

    @ObfuscatedName(value="abv")
    public final int method5717(int n) {
        float f = BZip2State.field3660.vmethod12641(531447733);
        if (f < 0.0f) {
            return -1;
        }
        n = class127.field3441 * 2035925329;
        return (int)(f * (float)(n * 891168689));
    }

    @ObfuscatedName(value="abe")
    @ObfuscatedSignature(descriptor="(B)Lba;", garbageValue="15")
    protected class19 method5706() {
        class19 class193 = this.field3567.vmethod11003();
        return class193;
    }

    @ObfuscatedName(value="acv")
    @ObfuscatedSignature(descriptor="(Lfc;B)V", garbageValue="65")
    public final void method5740(class66 class662) {
        this.field3570.method10937(class662);
    }

    @ObfuscatedName(value="adu")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="157903515")
    protected final boolean method5762() {
        return false;
    }

    @ObfuscatedName(value="af")
    protected abstract void vmethod8278(byte var1);

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-12038")
    protected abstract void vmethod8281();

    @ObfuscatedName(value="an")
    protected abstract void vmethod8283(int var1);

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1562357955")
    protected abstract void vmethod8285();

    @ObfuscatedName(value="aw")
    protected abstract void vmethod8288(boolean var1, float var2, int var3);

    @ObfuscatedName(value="ay")
    protected abstract void vmethod8290(int var1);

    @ObfuscatedName(value="ce")
    @Export(value="openMenu")
    protected abstract void openMenu(int var1, int var2);

    @ObfuscatedName(value="cy")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="1")
    @Export(value="resizeRoot")
    protected abstract void resizeRoot(boolean var1);

    @ObfuscatedSignature(descriptor="(B)Lpc;", garbageValue="-19")
    public Bounds add(byte by) {
        Bounds bounds = this.field3562;
        return bounds;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        Throwable throwable;
        Object var9_1 = null;
        try {
            if (!BZip2State.field3660.vmethod12622()) {
                this.method5760(false);
                this.method5746(false, 1471695211);
                return;
            }
            if (!this.method5766()) {
                this.method5760(false);
                this.method5746(true, 1371319685);
                return;
            }
            class251.RunException_applet = this.method5742();
            this.vmethod8278((byte)-89);
            try {
                field3539 = 0L;
                field3535 = false;
                this.vmethod8283(1426416721);
                this.field3567 = new Rasterizer2D(class50.field2368, class127.field3441);
                class47.field2319 = class265.method7635();
                long l = 0L;
                while (true) {
                    if (0L != field3539) {
                        throwable = var9_1;
                        if (class363.currentTimeMillis() >= field3539) break;
                    }
                    long l2 = System.nanoTime();
                    long l3 = l2 / field3543;
                    class145.field3610 = Math.min((int)(l3 - l), 10);
                    for (int i = 0; i < class145.field3610; ++i) {
                        this.method5738();
                    }
                    Occluder.field27 = class363.currentTimeMillis();
                    this.method5731((float)(l2 - field3543 * l3) / (float)field3543, 910630893);
                    l = l3;
                }
            }
            catch (Exception exception) {
                class56.RunException_sendStackTrace(null, exception);
            }
        }
        catch (class251 class2512) {
            class56.RunException_sendStackTrace(null, class2512);
            throwable = class2512.method7399();
        }
        this.method5736();
        if (throwable != null) throw new RuntimeException(throwable);
        return;
        catch (Exception exception) {}
        this.method5760(false);
        long l = class363.currentTimeMillis();
        while (true) {
            --field3537;
            this.openMenu(0, -478658579);
            long l4 = class363.currentTimeMillis();
            class52.sleepExact(10L - (l4 - l));
            this.method5724();
            if (this.field3567 != null) {
                this.method5758();
            }
            if (field3537 * -1 == 200) {
                BZip2State.field3660.vmethod12619();
            }
            l = l4;
        }
    }
}

