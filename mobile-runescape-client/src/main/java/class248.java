/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pm")
public class class248 {
    @ObfuscatedName(value="sy")
    @ObfuscatedSignature(descriptor="Lmr;")
    protected static TaskHandler field4306;
    @ObfuscatedName(value="af")
    static final int[] field4299;
    @ObfuscatedName(value="ab")
    static final int[] field4297;

    static {
        field4297 = new int[2048];
        field4299 = new int[2048];
        for (int i = 0; i < 2048; ++i) {
            int[] arrn = field4297;
            double d = (double)i * 0.0030679615757712823;
            arrn[i] = (int)(Math.sin(d) * 65536.0);
            class248.field4299[i] = (int)(Math.cos(d) * 65536.0);
        }
    }
}

