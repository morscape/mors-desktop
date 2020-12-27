/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ay")
public class class17 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lay;")
    public static final class17 field310;
    @ObfuscatedName(value="aq")
    static String field314;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lay;")
    public static final class17 field312;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lay;")
    static final class17 field313;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lay;")
    public static final class17 field315;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-457123201)
    int field317 = -1;

    static {
        field313 = new class17(-1);
        field310 = new class17(0);
        field312 = new class17(1);
        field315 = new class17(2);
    }

    class17(int n) {
        this.field317 = n;
    }

    @ObfuscatedName(value="at")
    static final int method341(int n, int n2, int n3, byte by) {
        by = (byte)n2;
        if (n3 > 179) {
            by = (byte)(n2 / 2);
        }
        n2 = by;
        if (n3 > 192) {
            n2 = by / 2;
        }
        by = (byte)n2;
        if (n3 > 217) {
            by = (byte)(n2 / 2);
        }
        n2 = by;
        if (n3 > 243) {
            n2 = by / 2;
        }
        return (n3 /= 2) + ((n /= 4) << 10) + ((n2 /= 32) << 7);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1482652055")
    static void method342() {
        WorldMapRegion.WorldMapRegion_cachedSprites.clear();
    }

    @ObfuscatedName(value="de")
    @ObfuscatedSignature(descriptor="(Lin;IS)V", garbageValue="390")
    static final void method344(Actor actor, int n) {
        class318.method11250(actor.x, actor.field7523 * -144332757, n, 1026934167);
    }
}

