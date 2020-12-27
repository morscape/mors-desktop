/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aa")
public class class0 {
    @ObfuscatedName(value="ae")
    public static final short[][] field0;
    @ObfuscatedName(value="ah")
    static int[] field1;
    @ObfuscatedName(value="ai")
    public static final short[] field2;
    @ObfuscatedName(value="ak")
    public static final short[] field3;
    @ObfuscatedName(value="ax")
    public static final short[][] field4;
    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="Lld;")
    static class165 field5;

    static {
        field3 = new short[]{6798, 8741, 25238, 4626, 4550};
        short[] arrs = new short[]{8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010};
        short[] arrs2 = new short[]{4626, 11146, 6439, 12, 4758, 10270};
        field0 = new short[][]{{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, arrs, {25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010}, arrs2, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821, -17991}};
        field2 = new short[]{-10304, 9104, -1, -1, -1};
        field4 = new short[][]{{6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002}, {9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019}, new short[0], new short[0], new short[0]};
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[Lgq;", garbageValue="1228261159")
    public static class302[] method1() {
        class302 class3022 = class302.field6081;
        class302 class3023 = class302.field6078;
        class302 class3024 = class302.field6079;
        class302 class3025 = class302.field6076;
        class302 class3026 = class302.field6077;
        class302 class3027 = class302.field6075;
        return new class302[]{class3022, class3023, class3024, class3025, class3026, class3027};
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="1417904598")
    public static void method2(Collection collection) {
        collection.add(ItemContainer.itemContainers);
    }

    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-495850277")
    static void method4(boolean bl) {
        Login.loginIndex = Language.method11574();
        Client.field4740.method5708().method12004();
        if (bl) {
            Login.Login_username = "";
            Login.Login_password = "";
            Client.field4772 = 0;
            class97.field2749 = "";
        }
    }
}

