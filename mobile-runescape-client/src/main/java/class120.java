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

@ObfuscatedName(value="ic")
public class class120 {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1279884719)
    int field3369;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Laz;")
    final class18 field3370;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lat;")
    class260 field3371;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lam;")
    class8 field3373;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lar;")
    class13 field3374;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lao;")
    class10 field3375;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Laq;")
    class12 field3372;
    @ObfuscatedName(value="ax")
    String field3376;

    @ObfuscatedSignature(descriptor="(Laz;Lha;)V")
    class120(class18 class182, ClientPreferences clientPreferences) {
        this.field3370 = class182;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="8")
    void method5299() {
        this.field3371 = null;
        this.field3372 = null;
        this.field3376 = null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)V", garbageValue="-1724312447")
    @Export(value="sort")
    void sort(String string2, boolean bl) {
        class260 class2602 = !bl ? class260.field4455 : class260.field4454;
        this.method5322(string2, class2602);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1304810665")
    void method5304() {
        this.field3372 = null;
        this.field3369 = 0;
        if (this.field3370 != null) {
            this.field3370.vmethod10039();
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1891417910")
    void method5306() {
        this.field3371 = class260.field4453;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Laq;B)V", garbageValue="22")
    public void method5311(class12 class125) {
        this.field3372 = class125;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(Lam;B)V", garbageValue="-106")
    public void method5312(class8 class83) {
        this.field3373 = class83;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(B)Lam;", garbageValue="-90")
    class8 method5313() {
        class8 class83 = this.field3373;
        return class83;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="12844")
    boolean method5314() {
        boolean bl;
        return this.field3370 != null && (bl = this.field3370.vmethod10045());
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Lao;I)V", garbageValue="-1466939419")
    void method5315(class10 class102) {
        this.field3375 = class102;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)Lao;", garbageValue="-251479434")
    class10 method5320() {
        class10 class102 = this.field3375;
        return class102;
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lat;B)V", garbageValue="-47")
    void method5322(String string2, class260 class2602) {
        this.method5299();
        this.field3371 = class2602;
        this.field3376 = string2;
        this.field3369 = class8.method141(1615635489);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(B)Lar;", garbageValue="43")
    class13 method5323() {
        class13 class132 = this.field3374;
        return class132;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="-66")
    void method5308(String string2) {
        this.method5322(string2, class260.field4457);
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lar;B)V", garbageValue="69")
    public void method5317(class13 class132) {
        this.field3374 = class132;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-2059426156")
    void method5321(boolean bl) {
        this.method5299();
        this.field3371 = class260.field4452;
        this.field3372 = new class12(null, 2);
        if (this.field3370 != null) {
            this.field3370.method552(bl);
        }
    }
}

