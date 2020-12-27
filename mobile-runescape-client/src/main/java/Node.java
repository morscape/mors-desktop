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

@ObfuscatedName(value="nr")
@Implements(value="Node")
public class Node {
    @ObfuscatedName(value="go")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="next")
    public Node next;
    @ObfuscatedName(value="gu")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="previous")
    public Node previous;
    @ObfuscatedName(value="gb")
    @Export(value="key")
    public long key;

    @ObfuscatedName(value="lw")
    @Export(value="hasNext")
    public boolean hasNext() {
        return this.next != null;
    }

    @ObfuscatedName(value="lc")
    @Export(value="remove")
    public void remove() {
        if (this.next == null) {
            return;
        }
        this.next.previous = this.previous;
        this.previous.next = this.next;
        this.previous = null;
        this.next = null;
    }
}

