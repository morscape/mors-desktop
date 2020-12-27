/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="it")
@Implements(value="HealthBar")
public class HealthBar
extends Node {
    @ObfuscatedName(value="ut")
    @ObfuscatedSignature(descriptor="Loc;")
    static class399 field6179;
    @ObfuscatedName(value="aj")
    @Export(value="ByteArrayPool_alternativeSizes")
    static int[] ByteArrayPool_alternativeSizes;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lda;")
    class366 field6180;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfx;")
    @Export(value="updates")
    IterableNodeDeque updates;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Lii;", garbageValue="-717182890")
    @Export(value="get")
    HealthBarUpdate get(int n) {
        HealthBarUpdate healthBarUpdate = (HealthBarUpdate)this.updates.last();
        if (healthBarUpdate == null) {
            return null;
        }
        if (healthBarUpdate.cycle <= n) {
            HealthBarUpdate healthBarUpdate2;
            Node node = this.updates.previous();
            while (true) {
                healthBarUpdate2 = healthBarUpdate;
                healthBarUpdate = (HealthBarUpdate)node;
                if (healthBarUpdate == null || healthBarUpdate.cycle > n) break;
                healthBarUpdate2.remove();
                node = this.updates.previous();
            }
            if (healthBarUpdate2.field6170 * 200906251 + this.field6180.field6819 * -699806531 + healthBarUpdate2.cycle <= n) {
                healthBarUpdate2.remove();
                return null;
            }
            return healthBarUpdate2;
        }
        return null;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="116")
    @Export(value="isEmpty")
    boolean isEmpty() {
        boolean bl = this.updates.method4656();
        return bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;I)V", garbageValue="-2005604842")
    public static void method11232(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        class372.field6946 = abstractArchive;
        class372.field6944 = abstractArchive2;
        class372.field6945 = class372.field6946.getGroupFileCount(3);
    }
}

