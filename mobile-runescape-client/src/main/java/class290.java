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

@ObfuscatedName(value="eq")
public class class290
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Leq;")
    static final class290 field5976;
    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="Lpc;")
    static Bounds field5983;
    @ObfuscatedName(value="kf")
    @ObfuscatedGetter(intValue=-1960702171)
    public static int field5984;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Leq;")
    static final class290 field5977;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Leq;")
    @Export(value="SOLID")
    public static final class290 SOLID;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field5975;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-2004609791)
    final int field5986;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=2116682791)
    public final int field5987;

    static {
        SOLID = new class290(0, 0);
        field5976 = new class290(1, 1);
        field5977 = new class290(2, 2);
    }

    class290(int n, int n2) {
        this.field5987 = n;
        this.field5986 = n2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field5986 * -197858559);
        return by * -2004609791;
    }

    @ObfuscatedName(value="am")
    public static int method10698(long l) {
        return (int)(l >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName(value="dg")
    static final void method10699(int n) {
        Client.field4855 = 0;
        n = (WorldMapScaleHandler.localPlayer.x >> 7) + class302.field6082;
        int n2 = (WorldMapScaleHandler.localPlayer.field7523 * -144332757 >> 7) + class237.field4107;
        if (n >= 3053 && n <= 3156 && n2 >= 3056 && n2 <= 3136) {
            Client.field4855 = 1;
        }
        if (n >= 3072 && n <= 3118 && n2 >= 9492 && n2 <= 9535) {
            Client.field4855 = 1;
        }
        if (Client.field4855 == 1 && n >= 3139 && n <= 3199 && n2 >= 3008 && n2 <= 3062) {
            Client.field4855 = 0;
        }
    }
}

