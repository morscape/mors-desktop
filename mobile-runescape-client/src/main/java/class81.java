/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fv")
public final class class81 {
    @ObfuscatedName(value="dp")
    @ObfuscatedSignature(descriptor="(Lhv;B)Z")
    static boolean method4590(Player player, byte by) {
        boolean bl;
        block7: {
            block5: {
                boolean bl2;
                block6: {
                    block4: {
                        by = (byte)Client.field4868;
                        bl2 = false;
                        if (by * 1064934413 == 0) {
                            return false;
                        }
                        if (WorldMapScaleHandler.localPlayer == player) break block4;
                        if (FloorDecoration.method853((byte)-64) || class90.method4805(1683122076) && player.method15491()) break block5;
                        break block6;
                    }
                    boolean bl3 = class274.method7828((byte)2);
                    return bl3;
                }
                bl = bl2;
                if (!class144.method5994((byte)63)) break block7;
                bl = bl2;
                if (!player.method15494()) break block7;
            }
            bl = true;
        }
        return bl;
    }
}

