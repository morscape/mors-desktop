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

@ObfuscatedName(value="cy")
public class class279
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lcy;")
    static final class279 field5898;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lcy;")
    static final class279 field5899;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lcy;")
    static final class279 field5900;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lcy;")
    static final class279 field5901;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2009538783)
    final int field5903;
    @ObfuscatedName(value="as")
    final byte field5904;

    static {
        field5900 = new class279(3, 0);
        field5898 = new class279(0, 1);
        field5899 = new class279(2, 2);
        field5901 = new class279(1, 3);
    }

    class279(int n, byte by) {
        this.field5903 = n;
        this.field5904 = by;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = this.field5904;
        return by;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[Lcy;", garbageValue="21859905")
    static class279[] method10387() {
        class279 class2792 = field5901;
        class279 class2793 = field5899;
        class279 class2794 = field5900;
        class279 class2795 = field5898;
        return new class279[]{class2792, class2793, class2794, class2795};
    }

    @ObfuscatedName(value="bd")
    @ObfuscatedSignature(descriptor="(Lif;I)V")
    static void method10389(class121 class1212, int n) {
        if (class1212.method5385(1267138182) != Client.field4738) {
            Client.field4738 = class1212.method5385(1893544411);
            class185.method6620(class1212.method5385(933310720));
            Client.field4740.method5708().vmethod12648("fhtagn", class1212.method5385(1490916239));
        }
        if (class1212.field3391 != Client.field4748) {
            ScriptEvent.method7673(class259.field4373, class1212.field3391);
        }
        Skills.field3151 = class1212.field3390;
        Client.field4741 = class1212.field3388;
        Client.field4748 = class1212.field3391;
        n = Client.gameBuild != 0 ? class1212.field3388 + 40000 : 43594;
        VarbitDefinition.port1 = n;
        n = Client.gameBuild != 0 ? class1212.field3388 + 50000 : 443;
        class292.port2 = n;
        ScriptEvent.port3 = VarbitDefinition.port1;
        Login.field3198 = false;
    }

    @ObfuscatedName(value="bw")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="1874327476")
    static final int method10390(int n, int n2, int n3, int n4) {
        return n3 * n2 - n4 * n >> 16;
    }
}

