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

@ObfuscatedName(value="bt")
@Implements(value="VertexNormal")
public class VertexNormal {
    @ObfuscatedName(value="dx")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field517;
    @ObfuscatedName(value="fn")
    static String field518;
    @ObfuscatedName(value="ae")
    @Export(value="y")
    int y;
    @ObfuscatedName(value="ai")
    @Export(value="z")
    int z;
    @ObfuscatedName(value="ak")
    @Export(value="x")
    int x;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1753142549)
    @Export(value="magnitude")
    int magnitude;

    VertexNormal() {
    }

    @ObfuscatedSignature(descriptor="(Lbt;)V")
    VertexNormal(VertexNormal vertexNormal) {
        this.x = vertexNormal.x;
        this.y = vertexNormal.y;
        this.z = vertexNormal.z;
        this.magnitude = vertexNormal.magnitude;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([BB)[Lei;", garbageValue="-28")
    public static IndexedSprite[] method881(byte[] arrobject) {
        class45.method3636(arrobject, -1448582382);
        arrobject = class88.method4767(208121488);
        return arrobject;
    }
}

