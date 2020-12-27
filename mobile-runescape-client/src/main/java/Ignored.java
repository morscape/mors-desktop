/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="eb")
@Implements(value="Ignored")
public class Ignored
extends class61 {
    @ObfuscatedName(value="cu")
    @ObfuscatedGetter(longValue=6443027309893267073L)
    static long field5942;
    @ObfuscatedName(value="en")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field5943;
    @ObfuscatedName(value="ak")
    int field5944;

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Len;I)I")
    public int vmethod13338(class61 class612, int n) {
        n = this.method10469((Ignored)class612, 2145635871);
        return n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Leb;I)I")
    int method10469(Ignored ignored, int n) {
        n = this.field5944;
        int n2 = ignored.field5944;
        return n * 1829727609 - n2 * 1829727609;
    }

    @Override
    @Export(value="compareTo_user")
    @ObfuscatedName(value="compareTo")
    public int compareTo_user(Object object) {
        int n = this.method10469((Ignored)object, 2145635871);
        return n;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="574601733")
    static void method10462() {
        Object object = Client.field4740.method5708();
        ((class346)object).method12022("crsG39");
        ((class346)object).method12026("crsG39");
        Login.loginIndex = 25;
        ParamDefinition.method13223("Connecting to Jagex...", "", "");
        object = Client.field4740.method5708().vmethod12647();
        if (object == null) {
            class119.field3363.method5317(new class13(false, 1403));
            Login.field3194 = true;
            class0.method4(true);
            return;
        }
        class119.field3363.method5317(null);
        Login.field3196 = class363.currentTimeMillis();
        ((class18)object).vmethod10035();
    }
}

