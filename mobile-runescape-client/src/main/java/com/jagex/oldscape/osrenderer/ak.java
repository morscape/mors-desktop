/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.oldscape.osrenderer;

import com.jagex.oldscape.osrenderer.zv;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class ak {
    @ObfuscatedName(value="ak")
    static boolean field2270 = false;

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1418607040")
    public static void method3352() {
        zv.method3586();
    }

    @ObfuscatedName(value="ac")
    public static int method3354(int n) {
        n = zv.method3601();
        return n;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-12")
    public static void method3356() {
        boolean bl = field2270;
        if (bl) {
            return;
        }
        try {
            if ("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                System.loadLibrary("osrenderer");
            } else {
                System.loadLibrary("windows/x64/OSRenderer");
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            unsatisfiedLinkError.printStackTrace();
        }
        field2270 = true;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="347867764")
    public static void method3357() {
        zv.method3588();
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)F", garbageValue="1609403039")
    public static float method3358() {
        float f = zv.method3542();
        return f;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1751229069")
    public static void method3359() {
        zv.method3551();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-471128719")
    public static void method3361() {
        zv.method3554();
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1534595477")
    public static void method3363() {
        zv.method3604();
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-1066473387")
    public static void method3364(int n, int n2) {
        zv.method3538(n, n2);
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="2137262746")
    public static void method3365(int n, int n2) {
        zv.method3540(n, n2);
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="68")
    public static void method3366(boolean bl) {
        zv.method3553(bl);
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="([II)V", garbageValue="-1987076325")
    public static void method3367(int[] arrn) {
        zv.method3558(arrn);
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="2")
    public static boolean method3368() {
        boolean bl = zv.method3544();
        return bl;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I[IB)V", garbageValue="24")
    public static void method3369(int n, int[] arrn) {
        zv.method3548(n, arrn);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-583809411")
    public static void method3370(boolean bl) {
        zv.method3568(bl);
    }

    @ObfuscatedName(value="au")
    public static int method3372(int n) {
        n = zv.method3555();
        return n;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="([II)V", garbageValue="1617487695")
    public static void method3374(int[] arrn) {
        zv.method3597(arrn);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="1604757556")
    public static void method3376(int n, int n2, int n3, int n4) {
        zv.method3546(n, n2, n3, n4);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-832338112")
    public static void method3377() {
        zv.method3591();
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="([IIB)V", garbageValue="-95")
    public static void method3378(int[] arrn, int n) {
        zv.method3572(arrn, n);
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-537042177")
    public static void method3379() {
        zv.method3593();
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(IZZIII[I[I[I[I[I[I[I[I[I[I[I[I[B[S[B[B[I[II)I", garbageValue="-1756991202")
    public static int method3381(int n, boolean bl, boolean bl2, int n2, int n3, int n4, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4, int[] arrn5, int[] arrn6, int[] arrn7, int[] arrn8, int[] arrn9, int[] arrn10, int[] arrn11, int[] arrn12, byte[] arrby, short[] arrs, byte[] arrby2, byte[] arrby3, int[] arrn13, int[] arrn14) {
        n = zv.method3573(n, bl, bl2, n2, n3, n4, arrn, arrn2, arrn3, arrn4, arrn5, arrn6, arrn7, arrn8, arrn9, arrn10, arrn11, arrn12, arrby, arrs, arrby2, arrby3, arrn13, arrn14);
        return n;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(SSSSSSSSSSSSSSSSSSSSSSSSB)V", garbageValue="-8")
    public static void method3382(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8, short s9, short s10, short s11, short s12, short s13, short s14, short s15, short s16, short s17, short s18, short s19, short s20, short s21, short s22, short s23, short s24) {
        zv.method3582(s, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24);
    }

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="([III)I", garbageValue="-1650600949")
    public static int method3384(int[] arrn, int n) {
        n = zv.method3559(arrn, n);
        return n;
    }

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-5556220")
    public static void method3385(int n, int n2) {
        zv.method3557(n, n2);
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(I[I[IB)V", garbageValue="59")
    public static void method3387(int n, int[] arrn, int[] arrn2) {
        zv.method3565(n, arrn, arrn2);
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1634345017")
    public static boolean method3390() {
        boolean bl = zv.method3571();
        return bl;
    }

    @ObfuscatedName(value="bn")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="-76")
    public static String method3391() {
        String string2 = zv.method3583();
        return string2;
    }

    @ObfuscatedName(value="bo")
    public static int method3392(int n) {
        n = zv.method3569();
        return n;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="2019948195")
    public static boolean method3393() {
        boolean bl = zv.method3595();
        return bl;
    }

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-535434393")
    public static void method3394(int n) {
        zv.method3576(n);
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(IJIIIIIIIIIIIIZI)Z", garbageValue="-1038548979")
    public static boolean method3397(int n, long l, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, boolean bl) {
        bl = zv.method3581(n, l, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, bl);
        return bl;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1609225074")
    public static void method3401() {
        zv.method3556();
    }

    @ObfuscatedName(value="by")
    public static int method3402(int n) {
        n = zv.method3580();
        return n;
    }

    @ObfuscatedName(value="co")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="-181474675")
    public static long method3418() {
        long l = zv.method3599();
        return l;
    }

    @ObfuscatedName(value="cw")
    public static int method3426(int n) {
        n = zv.method3603();
        return n;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="2147257949")
    public static int[] method3355() {
        int[] arrn = zv.method3600();
        return arrn;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;I)V", garbageValue="-1792703164")
    public static void method3360(Object object) {
        zv.method3602(object);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="633401452")
    public static boolean method3362() {
        boolean bl = field2270;
        return bl;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(B)[I", garbageValue="109")
    public static int[] method3371() {
        int[] arrn = zv.method3578();
        return arrn;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(B)[I", garbageValue="-120")
    public static int[] method3373() {
        int[] arrn = zv.method3574();
        return arrn;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1772894004")
    public static void method3375() {
        zv.method3537();
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(IB)I", garbageValue="-22")
    public static int method3380(int n) {
        n = zv.method3543(n);
        return n;
    }

    @ObfuscatedName(value="bi")
    public static int method3386(int n) {
        n = zv.method3564();
        return n;
    }

    @ObfuscatedName(value="bl")
    public static int method3389(int n) {
        n = zv.method3579();
        return n;
    }

    @ObfuscatedName(value="bs")
    public static int method3396(int n) {
        n = zv.method3541();
        return n;
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="58")
    public static String method3398() {
        String string2 = zv.method3539();
        return string2;
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-33")
    public static void method3399() {
        zv.method3594();
    }

    @ObfuscatedName(value="bz")
    public static int method3403(int n) {
        n = zv.method3566();
        return n;
    }

    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1230627986")
    public static String method3407() {
        String string2 = zv.method3589();
        return string2;
    }

    @ObfuscatedName(value="cg")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="94")
    public static String method3410() {
        String string2 = zv.method3592();
        return string2;
    }

    @ObfuscatedName(value="cq")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="975714743")
    public static String method3420() {
        String string2 = zv.method3570();
        return string2;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1072016847")
    public static boolean method3353() {
        boolean bl = zv.method3587();
        return bl;
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(B)J", garbageValue="40")
    public static long method3383() {
        long l = zv.method3549();
        return l;
    }

    @ObfuscatedName(value="bw")
    public static int method3400(int n) {
        n = zv.method3545();
        return n;
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="19")
    public static void method3388() {
        zv.method3552();
    }

    @ObfuscatedName(value="cp")
    @ObfuscatedSignature(descriptor="(I)[I", garbageValue="-781837650")
    public static int[] method3419() {
        int[] arrn = zv.method3590();
        return arrn;
    }
}

