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

@ObfuscatedName(value="pg")
public class class360
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpg;")
    public static final class360 field6559;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lpg;")
    public static final class360 field6560;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lpg;")
    public static final class360 field6561;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpg;")
    public static final class360 field6562;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=323216443)
    public final int field6563;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1514576459)
    final int field6564;

    static {
        field6561 = new class360(2, 0);
        field6559 = new class360(0, 1);
        field6560 = new class360(3, 2);
        field6562 = new class360(1, 3);
    }

    class360(int n, int n2) {
        this.field6563 = n;
        this.field6564 = n2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6564 * 1946279779);
        return by * 1514576459;
    }
}

