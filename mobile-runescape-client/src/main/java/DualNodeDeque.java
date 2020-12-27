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

@ObfuscatedName(value="fs")
@Implements(value="DualNodeDeque")
public final class DualNodeDeque {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmp;")
    @Export(value="sentinel")
    DualNode sentinel;

    public DualNodeDeque() {
        this.sentinel.previousDual = this.sentinel = new DualNode();
        this.sentinel.nextDual = this.sentinel;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmp;)V")
    @Export(value="addLast")
    public void addLast(DualNode dualNode) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = this.sentinel;
        dualNode.previousDual = this.sentinel.previousDual;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="()Lmp;")
    @Export(value="removeLast")
    public DualNode removeLast() {
        DualNode dualNode = this.sentinel.previousDual;
        if (dualNode == this.sentinel) {
            return null;
        }
        return dualNode;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmp;)V")
    @Export(value="addFirst")
    public void addFirst(DualNode dualNode) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }
}

