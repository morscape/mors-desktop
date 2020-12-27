/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gl")
public class class94 {
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(ZZI)Lei;", garbageValue="-1355276480")
    static IndexedSprite method4846(boolean bl, boolean bl2) {
        if (bl) {
            if (!bl2) {
                return WorldMapScaleHandler.field565;
            }
        } else {
            if (!bl2) {
                IndexedSprite indexedSprite = class275.field5004;
                return indexedSprite;
            }
            return class330.field6290;
        }
        return VerticalAlignment.field5931;
    }
}

