/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="am")
public class class8 {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lhr;")
    static class113 field68;
    @ObfuscatedName(value="ai")
    final boolean field75;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1008732215)
    final int field76;

    public class8(boolean bl, int n) {
        this.field75 = bl;
        this.field76 = n;
    }

    @ObfuscatedName(value="ae")
    public int method147(int n) {
        n = this.field76 * 1520840071;
        return n * 1008732215;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="65280")
    public boolean method152() {
        boolean bl = this.field75;
        return bl;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="-2028709572")
    public static void method143(Collection collection) {
        collection.add(SpotAnimationDefinition.SpotAnimationDefinition_cached);
        collection.add(SpotAnimationDefinition.field7135);
    }

    @ObfuscatedName(value="ai")
    static int method141(int n) {
        if (!Login.Login_username.isEmpty()) {
            n = VarbitDefinition.method12797(class47.method3680(Login.Login_username), 134740142);
            return n;
        }
        return 0;
    }
}

