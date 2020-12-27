/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  ft
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fn")
public class class297
implements class66 {
    @ObfuscatedName(value="ea")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field6033;
    @ObfuscatedName(value="fm")
    @ObfuscatedSignature(descriptor="Lpc;")
    static Bounds field6034;
    @ObfuscatedName(value="ah")
    Collection field6035;
    @ObfuscatedName(value="as")
    Collection field6038;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lni;")
    final class207 field6036 = new class207(ft.class, 1000);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfc;")
    class66 field6037;

    public class297() {
        this.field6035 = new ArrayList(100);
        this.field6038 = new ArrayList(100);
    }

    @Override
    @ObfuscatedName(value="aa")
    public boolean vmethod11251(int n, int n2, int n3, int n4, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2515;
        class792.field2602 = n;
        class792.field2604 = n2;
        class792.field2607 = n3;
        class792.field2603 = n4;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1410964016")
    void method10931() {
        synchronized (this) {
            Collection collection = this.field6038;
            this.field6038 = this.field6035;
            this.field6035 = collection;
            return;
        }
    }

    @Override
    @ObfuscatedName(value="af")
    public boolean vmethod11256(int n, int n2, int n3, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2514;
        class792.field2602 = n;
        class792.field2607 = n2;
        class792.field2603 = n3;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)Lft;", garbageValue="-6")
    class79 method10934() {
        class79 class792 = (class79)this.field6036.method6856();
        return class792;
    }

    @Override
    @ObfuscatedName(value="aj")
    public boolean vmethod11260(int n, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2513;
        class792.field2602 = n;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @Override
    @ObfuscatedName(value="al")
    public boolean vmethod11262(char c, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2506;
        class792.field2602 = c;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @Override
    @ObfuscatedName(value="am")
    public boolean vmethod11263(int n, int n2, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2508;
        class792.field2607 = n;
        class792.field2603 = n2;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @Override
    @ObfuscatedName(value="an")
    public boolean vmethod11264(int n, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2510;
        class792.field2602 = n;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @Override
    @ObfuscatedName(value="aq")
    public boolean vmethod11267(int n, int n2, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2512;
        class792.field2607 = n;
        class792.field2603 = n2;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @Override
    @ObfuscatedName(value="as")
    public boolean vmethod11269(int n, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2511;
        class792.field2602 = n;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @Override
    @ObfuscatedName(value="ay")
    public boolean vmethod11275(int n, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2507;
        class792.field2602 = n;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lft;I)V", garbageValue="-503974281")
    void method10935(class79 class792) {
        synchronized (this) {
            this.field6035.add(class792);
            return;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lfc;I)V", garbageValue="-10983066")
    public final void method10937(class66 class662) {
        this.field6037 = class662;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="82")
    public final boolean method10950() {
        this.method10931();
        boolean bl = this.field6038.isEmpty();
        Iterator iterator = this.field6038.iterator();
        while (true) {
            class79 class792;
            if (iterator.hasNext()) {
                class792 = (class79)iterator.next();
                if (this.field6037 != null) {
                    class792.method4572(this.field6037);
                }
            } else {
                this.field6038.clear();
                return bl ^ true;
            }
            this.field6036.method6862(class792, (byte)-122);
        }
    }

    @Override
    @ObfuscatedName(value="ab")
    public boolean vmethod11252(int n, int n2, int n3, int n4, long l) {
        class79 class792 = this.method10934();
        class792.field2605 = class71.field2509;
        class792.field2602 = n;
        class792.field2604 = n2;
        class792.field2607 = n3;
        class792.field2603 = n4;
        class792.field2606 = l;
        this.method10935(class792);
        return true;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldg;", garbageValue="1578172724")
    @Export(value="WorldMapElement_get")
    public static WorldMapElement WorldMapElement_get(int n) {
        if (n >= 0 && n < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[n] != null) {
            return WorldMapElement.WorldMapElement_cached[n];
        }
        WorldMapElement worldMapElement = new WorldMapElement(n);
        return worldMapElement;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;ZB)Loe;", garbageValue="23")
    @Export(value="getPreferencesFile")
    public static AccessFile getPreferencesFile(String object, String string2, boolean bl) {
        Object object2 = class197.cacheDir;
        Serializable serializable = new StringBuilder();
        ((StringBuilder)serializable).append("preferences");
        ((StringBuilder)serializable).append((String)object);
        ((StringBuilder)serializable).append(".dat");
        serializable = new File((File)object2, ((StringBuilder)serializable).toString());
        boolean bl2 = ((File)serializable).exists();
        if (bl2) {
            try {
                return new AccessFile((File)serializable, "rw", 10000L);
            }
            catch (IOException iOException) {}
        }
        object2 = "";
        if (class133.cacheGamebuild == 33) {
            object2 = "_rc";
        } else if (class133.cacheGamebuild == 34) {
            object2 = "_wip";
        }
        File file = class197.userHomeDirectory;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jagex_");
        stringBuilder.append(string2);
        stringBuilder.append("_preferences");
        stringBuilder.append((String)object);
        stringBuilder.append((String)object2);
        stringBuilder.append(".dat");
        object = new File(file, stringBuilder.toString());
        if (!bl && (bl = ((File)object).exists())) {
            try {
                return new AccessFile((File)object, "rw", 10000L);
            }
            catch (IOException iOException) {}
        }
        try {
            return new AccessFile((File)serializable, "rw", 10000L);
        }
        catch (IOException iOException) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-30")
    static final void method10926(boolean bl) {
        if (!bl) {
            class360 class3602 = class119.field3363.field3369 != 0 && ServerPacket.clientPreferences.parameters.containsKey(class119.field3363.field3369) ? class360.field6561 : class360.field6560;
            Client.field4778 = class3602;
            return;
        }
        class360 class3603 = Login.field3195 ? class360.field6559 : class360.field6562;
        Client.field4778 = class3603;
    }
}

