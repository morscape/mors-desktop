/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dy")
public class class379
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-488196317)
    public static int field7072 = 0;
    @ObfuscatedName(value="ce")
    @ObfuscatedSignature(descriptor="Lpc;")
    static Bounds field7075;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field7073;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field7074;

    static {
        field7073 = new EvictingDualNodeHashTable(64, null);
    }
}

