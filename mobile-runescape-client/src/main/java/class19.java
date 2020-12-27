/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ba")
public abstract class class19 {
    @ObfuscatedName(value="ai")
    static boolean field329 = true;

    class19() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)Lcw;", garbageValue="53")
    public abstract class47 vmethod7589();

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1643854449")
    @Export(value="open")
    public void open(int n) {
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lbe;Lbp;IIIIIIIS)V")
    abstract void vmethod7592(Scene var1, TilePaint var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, short var10);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Lbd;", garbageValue="3")
    public abstract Rasterizer3D vmethod7594();

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lbe;Lbj;IIIIIII)V")
    abstract void vmethod7604(Scene var1, TileModel var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    @ObfuscatedName(value="bx")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="1486167186")
    static final int method565(int n, int n2, int n3, int n4) {
        return n4 * n + n3 * n2 >> 16;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="2071524417")
    public static void method564(AbstractArchive abstractArchive) {
        ItemContainer.FloorOverlayDefinition_archive = abstractArchive;
    }
}

