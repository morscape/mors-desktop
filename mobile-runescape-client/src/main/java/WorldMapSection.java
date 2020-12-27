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

@ObfuscatedName(value="ci")
@Implements(value="WorldMapSection")
public interface WorldMapSection {
    @ObfuscatedName(value="ae")
    public boolean vmethod10367(int var1, int var2, int var3, byte var4);

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;B)V", garbageValue="0")
    public void vmethod10380(Buffer var1);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="-76")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea var1);

    @ObfuscatedName(value="ax")
    public int[] vmethod10384(int var1, int var2, int var3, byte var4);
}

