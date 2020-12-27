/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ah")
@Implements(value="Varps")
public class Varps {
    @ObfuscatedName(value="ae")
    @Export(value="Varps_temp")
    public static int[] Varps_temp;
    @ObfuscatedName(value="ai")
    @Export(value="Varps_main")
    public static int[] Varps_main;
    @ObfuscatedName(value="ak")
    @Export(value="Varps_masks")
    static int[] Varps_masks;

    static {
        Varps_masks = new int[32];
        int n = 2;
        for (int i = 0; i < 32; ++i) {
            Varps.Varps_masks[i] = n - 1;
            n += n;
        }
        Varps_temp = new int[4000];
        Varps_main = new int[4000];
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="-1940809757")
    public static void method65(Collection collection) {
        collection.add(class373.field6962);
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="80")
    static boolean method68() {
        boolean bl;
        return class294.field6004.field6201 != -1 && !(bl = Skills.field3152.method4401());
    }
}

