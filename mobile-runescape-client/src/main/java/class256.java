/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pz")
public class class256 {
    @ObfuscatedName(value="aa")
    static int[][] field4353;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpz;")
    public static final class256 field4354;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lpz;")
    static final class256 field4355;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lpz;")
    static final class256 field4356;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1647846595)
    @Export(value="value")
    public final int value;

    static {
        field4356 = new class256(0);
        field4354 = new class256(1);
        field4355 = new class256(2);
    }

    class256(int n) {
        this.value = n;
    }
}

