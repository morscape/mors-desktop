/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fy")
public abstract class class84 {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfc;")
    protected class66 field2638 = new class296();

    protected class84() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)J", garbageValue="380238298")
    protected final long method4726() {
        long l = class363.currentTimeMillis();
        return l;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lfc;I)V", garbageValue="1347513543")
    public void method4729(class66 class662) {
        if (class662 == null) {
            throw new NullPointerException();
        }
        this.field2638 = class662;
    }

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-1")
    static void method4724() {
        Object object = Client.field4740.method5708();
        ((class346)object).method12022("cgcPRM");
        ((class346)object).method12026("cgcPRM");
        Login.loginIndex = 15;
        ParamDefinition.method13223("Accessing Game Center...", "", "");
        object = Client.field4740.method5708().vmethod12647();
        if (object == null || !((class18)object).method548()) {
            class119.field3363.method5315(new class10(false, 3));
            return;
        }
        class119.field3363.method5315(null);
        ((class18)object).vmethod10053();
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="12")
    static void method4723() {
        class346 class3462 = Client.field4740.method5708();
        class3462.method12022("fpVPSZ");
        class3462.method12026("fpVPSZ");
        ParamDefinition.method13223("Please enter your Old School RuneScape username", "or email address. Please note your RuneScape", "progress is not transferred to Old School RuneScape.");
        Login.loginIndex = 5;
        class288.method10653().method3220();
    }
}

