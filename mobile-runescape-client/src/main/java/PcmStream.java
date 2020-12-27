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

@ObfuscatedName(value="hg")
@Implements(value="PcmStream")
public abstract class PcmStream
extends Node {
    @ObfuscatedName(value="ao")
    volatile boolean field6099 = true;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Lgz;")
    @Export(value="sound")
    AbstractSound sound;

    protected PcmStream() {
    }
}

