/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dk")
public class class51 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ldk;")
    public static final class51 field2373;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Ldk;")
    public static final class51 field2374;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ldk;")
    public static final class51 field2375;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Ldk;")
    public static final class51 field2376;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Ldk;")
    static final class51 field2377;
    @ObfuscatedName(value="as")
    public final String field2380;

    static {
        field2376 = new class51("details");
        field2373 = new class51("compositemap");
        field2375 = new class51("compositetexture");
        field2377 = new class51("area");
        field2374 = new class51("labels");
    }

    class51(String string2) {
        this.field2380 = string2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldw;", garbageValue="-1577360152")
    public static FloorUnderlayDefinition method3746(int n) {
        if (n >= 0 && n < FloorUnderlayDefinition.field7062.length) {
            return FloorUnderlayDefinition.field7062[n];
        }
        FloorUnderlayDefinition floorUnderlayDefinition = FloorUnderlayDefinition.field7063;
        return floorUnderlayDefinition;
    }

    @ObfuscatedName(value="ai")
    public static double[] method3747(double d, double d2, int n, int n2) {
        double[] arrd = new double[n * 2 + 1];
        int n3 = -n;
        n2 = 0;
        while (n3 <= n) {
            arrd[n2] = class312.method11213(n3, d, d2);
            ++n3;
            ++n2;
        }
        return arrd;
    }
}

