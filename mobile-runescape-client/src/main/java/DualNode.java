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

@ObfuscatedName(value="mp")
@Implements(value="DualNode")
public class DualNode
extends Node {
    @ObfuscatedName(value="dl")
    @ObfuscatedSignature(descriptor="Lmp;")
    @Export(value="previousDual")
    public DualNode previousDual;
    @ObfuscatedName(value="dr")
    @ObfuscatedSignature(descriptor="Lmp;")
    @Export(value="nextDual")
    public DualNode nextDual;
    @ObfuscatedName(value="dv")
    @Export(value="keyDual")
    public long keyDual;

    @ObfuscatedName(value="dr")
    @Export(value="removeDual")
    public void removeDual() {
        if (this.nextDual == null) {
            return;
        }
        this.nextDual.previousDual = this.previousDual;
        this.previousDual.nextDual = this.nextDual;
        this.previousDual = null;
        this.nextDual = null;
    }
}

