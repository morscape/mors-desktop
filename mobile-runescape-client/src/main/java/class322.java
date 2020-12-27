/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jx")
public final class class322
extends Enum
implements MouseWheel {
    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    class322() {
        void var2_-1;
        void var1_-1;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-740870395")
    @Export(value="rsOrdinal")
    public int rsOrdinal() {
        float f = ak.method3358();
        if ((f = -f) > 0.005f) {
            return 1;
        }
        if (f < -0.005f) {
            return -1;
        }
        return 0;
    }
}

