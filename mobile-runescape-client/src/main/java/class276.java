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

@ObfuscatedName(value="cq")
public class class276
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lcq;")
    static final class276 field5859;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lcq;")
    static final class276 field5860;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lcq;")
    static final class276 field5861;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1884093853)
    final int field5866;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1864205387)
    public final int field5867;

    static {
        field5861 = new class276(0, -1);
        field5859 = new class276(1, 1);
        field5860 = new class276(2, 3);
    }

    class276(int n, int n2) {
        this.field5867 = n;
        this.field5866 = n2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field5866 * -541880501);
        return by * -1884093853;
    }
}

