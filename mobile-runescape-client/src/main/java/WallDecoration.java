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
import com.jagex.jagex3.client.input.softkeyboard.ax;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bq")
@Implements(value="WallDecoration")
public final class WallDecoration {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lbw;")
    public Entity field506;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=497359245)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-326097107)
    @Export(value="flags")
    int flags = 0;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-406575379)
    int field510;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-1957672667)
    @Export(value="yOffset")
    int yOffset;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lbw;")
    public Entity field514;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1704321235)
    @Export(value="xOffset")
    int xOffset;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-573330329)
    int field511;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1589230023)
    int field513;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1433280261)
    int field516;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(longValue=-2300556015533445203L)
    @Export(value="tag")
    public long tag = 0L;

    WallDecoration() {
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="-767160042")
    static final int method864(int n, int n2, int n3, int n4) {
        return n * n3 - n4 * n2 >> 16;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1480257470")
    static void method863(int n) {
        ax ax2;
        ax ax3 = ax2 = Client.field4740.method5708().method12023();
        if (ax2 == null) {
            ax3 = FloorDecoration.method851();
        }
        if (ax3 != null) {
            ax3.method3223(n);
        }
    }
}

