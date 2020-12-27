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

@ObfuscatedName(value="fa")
public class class295
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfa;")
    static final class295 field6014;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lfa;")
    static final class295 field6015;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfa;")
    public static final class295 field6016;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfa;")
    public static final class295 field6017;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-30693721)
    final int field6019;

    static {
        field6016 = new class295(0);
        field6014 = new class295(1);
        field6015 = new class295(2);
        field6017 = new class295(3);
    }

    class295(int n) {
        this.field6019 = n;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6019 * -986472169);
        return by * -30693721;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="([BI)Lei;", garbageValue="1455049418")
    public static IndexedSprite method10878(byte[] object) {
        class45.method3636(object, 46734666);
        object = class63.method4017();
        return object;
    }
}

