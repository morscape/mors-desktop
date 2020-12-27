/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ak")
public class class259
extends Node {
    @ObfuscatedName(value="dn")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field4373;
    @ObfuscatedName(value="gn")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field4374;
    @ObfuscatedName(value="ba")
    boolean field4375;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=1510003923)
    int field4376;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(intValue=271184077)
    int field4377;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=1537015495)
    int field4379;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=1952352881)
    int field4380;
    @ObfuscatedName(value="bo")
    String field4381;
    @ObfuscatedName(value="bt")
    boolean field4383;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=-2012812317)
    int field4386;
    @ObfuscatedName(value="by")
    String field4387;
    @ObfuscatedName(value="cf")
    int[] field4391 = new int[3];
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=108105747)
    int field4394;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=54570907)
    int field4395;
    @ObfuscatedName(value="cv")
    String field4398;
    @ObfuscatedName(value="cw")
    String field4399;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=1159671307)
    int field4378;
    @ObfuscatedName(value="bs")
    @ObfuscatedGetter(intValue=1020142599)
    int field4382;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=-1587487379)
    int field4384;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=-1658945217)
    int field4388;
    @ObfuscatedName(value="cb")
    String field4389;
    @ObfuscatedName(value="cd")
    @ObfuscatedGetter(intValue=-1653219641)
    int field4390;
    @ObfuscatedName(value="cg")
    @ObfuscatedGetter(intValue=-212207729)
    int field4392;
    @ObfuscatedName(value="ch")
    String field4393;
    @ObfuscatedName(value="cq")
    @ObfuscatedGetter(intValue=949472763)
    int field4397;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=23299349)
    int field4385;
    @ObfuscatedName(value="cp")
    String field4396;

    public class259(int n, boolean bl, int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7, int n8, int n9, int n10, String string2, String string3, String string4, String string5, int n11, int n12, int n13, int n14, String string6, String string7, int[] arrn, int n15, String string8) {
        this.field4388 = n;
        this.field4383 = bl;
        this.field4377 = n2;
        this.field4379 = n3;
        this.field4376 = n4;
        this.field4384 = n5;
        this.field4386 = n6;
        this.field4375 = bl2;
        this.field4385 = n7;
        this.field4378 = n8;
        this.field4380 = n9;
        this.field4382 = n10;
        this.field4387 = string2;
        this.field4381 = string3;
        this.field4399 = string4;
        this.field4396 = string5;
        this.field4392 = n11;
        this.field4395 = n12;
        this.field4397 = n13;
        this.field4390 = n14;
        this.field4393 = string6;
        this.field4398 = string7;
        this.field4391 = arrn;
        this.field4394 = n15;
        this.field4389 = string8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1582695408")
    @Export(value="savePreferences")
    static void savePreferences() {
        AccessFile accessFile;
        try {
            accessFile = class297.getPreferencesFile("", class170.field3784.field6083, true);
        }
        catch (Exception exception) {}
        try {
            Buffer buffer = ServerPacket.clientPreferences.toBuffer();
            accessFile.write(buffer.array, 0, buffer.offset);
        }
        catch (Exception exception) {}
        return;
        if (accessFile == null) return;
        try {
            accessFile.closeSync(true);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="2143470678")
    public static void method7479(Collection collection) {
        collection.add(ObjectDefinition.ObjectDefinition_cached);
        collection.add(ObjectDefinition.field6866);
        collection.add(ObjectDefinition.ObjectDefinition_cachedEntities);
        collection.add(ObjectDefinition.ObjectDefinition_cachedModels);
    }
}

