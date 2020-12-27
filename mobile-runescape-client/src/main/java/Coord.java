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

@ObfuscatedName(value="af")
@Implements(value="Coord")
public class Coord {
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=1834907755)
    static int field19 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1172670281)
    @Export(value="x")
    public int x;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1438658525)
    @Export(value="y")
    public int y;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1624535951)
    @Export(value="plane")
    public int plane;

    public Coord(int n, int n2, int n3) {
        this.plane = n;
        this.x = n2;
        this.y = n3;
    }

    public Coord(int n) {
        if (n != -1) {
            this.plane = n >> 28 & 3;
            this.x = n >> 14 & 0x3FFF;
            this.y = n & 0x3FFF;
            return;
        }
        this.plane = -1;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Laf;B)Z")
    boolean method42(Coord coord, byte by) {
        if (this.plane == coord.plane) {
            if (this.x == coord.x) {
                by = (byte)(this.y * -37789813);
                int n = coord.y * -37789813;
                return by * -1438658525 == n * -1438658525;
            }
            return false;
        }
        return false;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)Ljava/lang/String;", garbageValue="-94")
    @Export(value="toString")
    String toString(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.plane);
        stringBuilder.append(string2);
        stringBuilder.append(this.x >> 6);
        stringBuilder.append(string2);
        stringBuilder.append(this.y >> 6);
        stringBuilder.append(string2);
        stringBuilder.append(this.x & 0x3F);
        stringBuilder.append(string2);
        stringBuilder.append(this.y & 0x3F);
        string2 = stringBuilder.toString();
        return string2;
    }

    @ObfuscatedName(value="ak")
    public int method47(int n) {
        n = this.plane * -368489617;
        int n2 = this.x * -1240603385;
        int n3 = this.y * -37789813;
        return n * 1624535951 << 28 | n2 * -1172670281 << 14 | n3 * -1438658525;
    }

    @Export(value="equalsCoord")
    @ObfuscatedName(value="equals")
    public boolean equalsCoord(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Coord) {
            boolean bl = this.method42((Coord)object, (byte)102);
            return bl;
        }
        return false;
    }

    @Export(value="packed")
    @ObfuscatedName(value="hashCode")
    public int packed() {
        int n = this.method47(-955845041);
        return n;
    }

    public String toString() {
        String string2 = this.toString(",");
        return string2;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1899281220")
    static void method38(int n) {
        if (Client.field4740.method5708().method12017()) {
            Client.field4740.method5708().method12023().method3223(n);
        }
    }

    @ObfuscatedName(value="ax")
    public static int method39(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n4;
        n7 = n5;
        if ((n6 & 1) == 1) {
            n7 = n4;
            n8 = n5;
        }
        if ((n3 &= 3) == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n - (n8 - 1);
        }
        if (n3 == 2) {
            return 7 - n2 - (n7 - 1);
        }
        return n;
    }
}

