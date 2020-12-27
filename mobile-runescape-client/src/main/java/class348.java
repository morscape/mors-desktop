/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mw")
public class class348
implements class198 {
    @ObfuscatedName(value="ai")
    String[] field6410;

    public class348(String[] arrstring) {
        this.field6410 = arrstring;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1720878827")
    public void vmethod12071() {
        class18 class182 = Client.field4740.method5708().vmethod12647();
        if (class182 != null) {
            class182.vmethod10037("npR101");
            class182.vmethod10038("npR101");
            if (this.field6410.length != 0 && this.field6410[0] != null) {
                class182.vmethod10054(this.field6410[0]);
            }
        }
    }
}

