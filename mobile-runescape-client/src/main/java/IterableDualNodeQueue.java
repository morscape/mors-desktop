/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fl")
@Implements(value="IterableDualNodeQueue")
public class IterableDualNodeQueue
implements Iterable {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmp;")
    @Export(value="sentinel")
    public DualNode sentinel;

    public IterableDualNodeQueue() {
        this.sentinel.previousDual = this.sentinel = new DualNode();
        this.sentinel.nextDual = this.sentinel;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmp;)V")
    @Export(value="add")
    public void add(DualNode dualNode) {
        if (dualNode.nextDual != null) {
            dualNode.removeDual();
        }
        dualNode.nextDual = this.sentinel.nextDual;
        dualNode.previousDual = this.sentinel;
        dualNode.nextDual.previousDual = dualNode;
        dualNode.previousDual.nextDual = dualNode;
    }

    @ObfuscatedName(value="ak")
    @Export(value="clear")
    public void clear() {
        while (this.sentinel.previousDual != this.sentinel) {
            this.sentinel.previousDual.removeDual();
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="()Lmp;")
    @Export(value="removeLast")
    public DualNode removeLast() {
        DualNode dualNode = this.sentinel.previousDual;
        if (dualNode == this.sentinel) {
            return null;
        }
        dualNode.removeDual();
        return dualNode;
    }

    public Iterator iterator() {
        return new IterableDualNodeQueueIterator(this);
    }
}

