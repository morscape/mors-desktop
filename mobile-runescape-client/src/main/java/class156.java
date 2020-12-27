/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="km")
public class class156
implements Callable {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkx;")
    final class160 field3740;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmi;")
    final Buffer field3741;

    public Object call() {
        Buffer buffer = this.field3740.vmethod11521(this.field3741);
        return buffer;
    }

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(Lfj;I)V")
    static void method6303(class72 class722, int n) {
        n = Login.field3168 - (Login.field3174.field7125 - 383);
        if (n > 0) {
            class722.vmethod10763(Login.field3174, 0, 0, Login.field3174.field7125 * 2, Login.field3174.field7127 * 2, 2139004006);
            class722.vmethod10763(Login.field3173, class722.field2525 - Login.field3173.field7125 * 2, 0, Login.field3173.field7125 * 2, Login.field3173.field7127 * 2, 485221597);
        }
        class722.vmethod10756(Login.field3174, n, 0, 2145766397);
        class722.vmethod10756(Login.field3173, Login.field3168 + 382, 0, 2142701438);
        class722.vmethod10757(class128.field3451, Login.field3168 + 382 - class128.field3451.field7119 / 2 - class128.field3451.field7118, 89 - class128.field3451.field7124 / 2, -1713248280);
    }
}

