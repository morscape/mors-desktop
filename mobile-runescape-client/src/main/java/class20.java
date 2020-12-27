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

@ObfuscatedName(value="bb")
public interface class20 {
    @ObfuscatedName(value="ae")
    public int[][] vmethod7792(int var1);

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1233740405")
    public boolean vmethod7795(int var1);

    @ObfuscatedName(value="aj")
    public int vmethod7797(int var1);

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1621376207")
    public boolean vmethod7806(int var1);

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="-1677775504")
    @Export(value="getTexturePixels")
    public int[] getTexturePixels(int var1);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)Lbv;", garbageValue="333981641")
    public Texture vmethod7798(int var1);

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="2008772377")
    @Export(value="getAverageTextureRGB")
    public int getAverageTextureRGB(int var1);
}

