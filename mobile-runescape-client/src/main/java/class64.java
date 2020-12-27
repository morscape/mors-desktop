/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ey")
public abstract class class64
implements Comparator {
    @ObfuscatedName(value="gf")
    @ObfuscatedSignature(descriptor="Lbe;")
    static Scene field2460;
    @ObfuscatedName(value="ak")
    Comparator field2462;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Len;Len;I)I")
    protected final int method4020(class61 class612, class61 class613, int n) {
        if (this.field2462 != null) {
            n = this.field2462.compare(class612, class613);
            return n;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @ObfuscatedName(value="aw")
    static final void method4019(long l) {
        int n;
        long[] arrl = class33.field533;
        class33.field536 = n = class33.field536 - 14621087;
        arrl[n * 1504329121 - 1] = l;
    }
}

