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

@ObfuscatedName(value="dd")
@Implements(value="VarcInt")
public class VarcInt
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6857 = new EvictingDualNodeHashTable(64, null);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6858;
    @ObfuscatedName(value="ai")
    @Export(value="persist")
    public boolean persist = false;

    VarcInt() {
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;B)V")
    void method12865(Buffer buffer, byte by) {
        while ((by = (byte)buffer.method11650(-2005913394)) != 0) {
            this.method12867(buffer, by);
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;II)V", garbageValue="-975922435")
    void method12867(Buffer buffer, int n) {
        if (n != 2) {
            return;
        }
        this.persist = true;
    }
}

