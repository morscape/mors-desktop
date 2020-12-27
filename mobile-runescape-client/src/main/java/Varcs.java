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
import com.jagex.oldscape.osrenderer.ak;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ac")
@Implements(value="Varcs")
public class Varcs {
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lhu;")
    @Export(value="soundCache")
    static SoundCache soundCache;
    @ObfuscatedName(value="aa")
    @Export(value="unwrittenChanges")
    boolean unwrittenChanges = false;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1055486469)
    int field11;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1612943373)
    int field12;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1408061683)
    int field14;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-2146890021)
    int field16;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-371540145)
    int field17;
    @ObfuscatedName(value="ai")
    int[] field13;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1334592483)
    int field15;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1446249247)
    int field18;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(longValue=-3337753474154252603L)
    long field10;

    Varcs() {
        this.setInt(1, 1);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-312731569")
    void method14(int n, int n2, int n3, int n4) {
        this.field18 = n;
        this.field12 = n2;
        this.field17 = n3;
        this.field14 = n4;
    }

    @ObfuscatedName(value="ah")
    final void method16(boolean bl, int n) {
        long l = System.nanoTime();
        if (bl &= ak.method3353()) {
            ak.method3365(this.field15, this.field11);
            ak.method3364(this.field15, this.field11);
            ak.method3376(this.field18, this.field12, this.field17, this.field14);
            if (this.unwrittenChanges) {
                ak.method3359();
            } else {
                ak.method3375();
            }
            ak.method3374(this.field13);
            ak.method3377();
        }
        if (!this.unwrittenChanges) {
            ak.method3366(bl);
        }
        n = !bl ? 0 : ak.method3386(-750545892);
        this.field16 = n;
        this.unwrittenChanges = false;
        ak.method3370(bl);
        this.field10 = System.nanoTime() - l;
        ak.method3361();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-776787551")
    public void method18() {
        this.unwrittenChanges = true;
    }

    @ObfuscatedName(value="as")
    @Export(value="getInt")
    int getInt(int n) {
        n = this.field16 * 1433550163;
        return n * -2146890021;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)[I", garbageValue="-11")
    public int[] method17() {
        int[] arrn = this.field13;
        return arrn;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="-80")
    @Export(value="setInt")
    public final void setInt(int n, int n2) {
        this.field15 = n;
        this.field11 = n2;
        n = n2 * n;
        if (this.field13 == null || this.field13.length != n) {
            this.field13 = new int[n];
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="167393666")
    @Export(value="tryWrite")
    final void tryWrite() {
        if (!this.unwrittenChanges) {
            ak.method3388();
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-366333629")
    static int method5() {
        return 16;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="-397193836")
    public static String method9(String string2) {
        if (string2 != null && !string2.isEmpty() && string2.charAt(0) != '#') {
            return string2;
        }
        return "";
    }
}

