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

@ObfuscatedName(value="pc")
@Implements(value="Bounds")
public class Bounds {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=81513391)
    @Export(value="lowY")
    public int lowY;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=350573253)
    @Export(value="highX")
    public int highX;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=557035921)
    @Export(value="lowX")
    public int lowX;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1950450395)
    @Export(value="highY")
    public int highY;

    public Bounds(int n, int n2, int n3, int n4) {
        this.setLow(n, n2);
        this.setHigh(n3, n4);
    }

    public Bounds(int n, int n2) {
        this(0, 0, n, n2);
    }

    @ObfuscatedName(value="aa")
    public int method7124(int n) {
        n = this.lowX * -691720335;
        return n * 557035921;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-642707306")
    @Export(value="setHigh")
    public void setHigh(int n, int n2) {
        this.highX = n;
        this.highY = n2;
    }

    @ObfuscatedName(value="af")
    public int method7129(int n) {
        n = this.highX * -437494771;
        int n2 = this.lowX * -691720335;
        return n2 * 557035921 + n * 350573253;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lpc;Lpc;I)V", garbageValue="1920936598")
    void method7133(Bounds bounds, Bounds bounds2) {
        bounds2.lowX = this.lowX;
        bounds2.highX = this.highX;
        if (this.lowX < bounds.lowX) {
            bounds2.highX -= bounds.lowX - this.lowX;
            bounds2.lowX = bounds.lowX;
        }
        if (bounds2.method7129(1698076763) > bounds.method7129(1308749524)) {
            bounds2.highX -= bounds2.method7129(374105439) - bounds.method7129(-286463681);
        }
        if (bounds2.highX < 0) {
            bounds2.highX = 0;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lpc;Lpc;I)V", garbageValue="1517247054")
    void method7135(Bounds bounds, Bounds bounds2) {
        bounds2.lowY = this.lowY;
        bounds2.highY = this.highY;
        if (this.lowY < bounds.lowY) {
            bounds2.highY -= bounds.lowY - this.lowY;
            bounds2.lowY = bounds.lowY;
        }
        if (bounds2.method7140(-1233891579) > bounds.method7140(-1510447877)) {
            bounds2.highY -= bounds2.method7140(-1278291770) - bounds.method7140(-1411820714);
        }
        if (bounds2.highY < 0) {
            bounds2.highY = 0;
        }
    }

    @ObfuscatedName(value="aq")
    public int method7140(int n) {
        n = this.highY * 1545644371;
        int n2 = this.lowY * 789998415;
        return n2 * 81513391 + n * 1950450395;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lpc;Lpc;I)V", garbageValue="-157292357")
    public void method7142(Bounds bounds, Bounds bounds2) {
        this.method7133(bounds, bounds2);
        this.method7135(bounds, bounds2);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="-405701215")
    @Export(value="setLow")
    public void setLow(int n, int n2) {
        this.lowX = n;
        this.lowY = n2;
    }

    @ObfuscatedName(value="ab")
    public int method7125(int n) {
        n = this.lowY * 789998415;
        return n * 81513391;
    }

    public final boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof Bounds;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (Bounds)object;
            bl3 = bl;
            if (this.lowX == ((Bounds)object).lowX) {
                bl3 = bl;
                if (this.lowY == ((Bounds)object).lowY) {
                    bl3 = bl;
                    if (this.highX == ((Bounds)object).highX) {
                        int n = this.highY * 1545644371;
                        int n2 = ((Bounds)object).highY * 1545644371;
                        bl3 = bl;
                        if (n * 1950450395 == n2 * 1950450395) {
                            bl3 = true;
                        }
                    }
                }
            }
        }
        return bl3;
    }

    public String toString() {
        return null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lkc;IB)Z", garbageValue="36")
    static boolean method7123(AbstractArchive object, int n) {
        if ((object = (Object)((AbstractArchive)object).takeFileFlat(n)) == null) {
            return false;
        }
        class45.method3636((byte[])object, -1109640898);
        return true;
    }
}

