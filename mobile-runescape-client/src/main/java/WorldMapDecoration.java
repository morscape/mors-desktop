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

@ObfuscatedName(value="dq")
@Implements(value="WorldMapDecoration")
public class WorldMapDecoration {
    @ObfuscatedName(value="gt")
    @ObfuscatedSignature(descriptor="[Lek;")
    static class384[] field2388;
    @ObfuscatedName(value="gq")
    static int[] field2387;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1260316165)
    @Export(value="decoration")
    final int decoration;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=510364417)
    @Export(value="rotation")
    final int rotation;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1845723937)
    @Export(value="objectDefinitionId")
    final int objectDefinitionId;

    WorldMapDecoration(int n, int n2, int n3) {
        this.objectDefinitionId = n;
        this.decoration = n2;
        this.rotation = n3;
    }

    @ObfuscatedName(value="bi")
    public static final void method3756(double d) {
        class381.method13235(d, 0, 512, -1190003263);
    }
}

