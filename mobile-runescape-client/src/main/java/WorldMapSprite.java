/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cl")
@Implements(value="WorldMapSprite")
public final class WorldMapSprite {
    @ObfuscatedName(value="ae")
    @Export(value="tileColors")
    final int[] tileColors;

    WorldMapSprite() {
        this.tileColors = new int[4096];
    }

    WorldMapSprite(int[] arrn) {
        this.tileColors = arrn;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(III)I", garbageValue="-35539337")
    @Export(value="getTileColor")
    final int getTileColor(int n, int n2) {
        n = this.tileColors[n2 * 64 + n];
        return n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="448895140")
    public static void method1215(AbstractArchive abstractArchive) {
        class376.field7036 = abstractArchive;
    }
}

