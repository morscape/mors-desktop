/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="mo")
@Implements(value="ByteArrayNode")
public class ByteArrayNode
extends Node {
    @ObfuscatedName(value="ak")
    @Export(value="byteArray")
    public byte[] byteArray;

    public ByteArrayNode(byte[] arrby) {
        this.byteArray = arrby;
    }
}

