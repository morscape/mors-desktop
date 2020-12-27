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

@ObfuscatedName(value="fg")
@Implements(value="IterableDualNodeQueueIterator")
public class IterableDualNodeQueueIterator
implements Iterator {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lmp;")
    @Export(value="head")
    DualNode head;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lmp;")
    @Export(value="last")
    DualNode last = null;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfl;")
    @Export(value="queue")
    IterableDualNodeQueue queue;

    @ObfuscatedSignature(descriptor="(Lfl;)V")
    IterableDualNodeQueueIterator(IterableDualNodeQueue iterableDualNodeQueue) {
        this.queue = iterableDualNodeQueue;
        this.head = this.queue.sentinel.previousDual;
        this.last = null;
    }

    @Override
    public boolean hasNext() {
        return this.queue.sentinel != this.head;
    }

    public Object next() {
        DualNode dualNode = this.head;
        if (dualNode == this.queue.sentinel) {
            this.head = null;
            dualNode = null;
        } else {
            this.head = dualNode.previousDual;
        }
        this.last = dualNode;
        return dualNode;
    }

    @Override
    public void remove() {
        if (this.last != null) {
            this.last.removeDual();
            this.last = null;
            return;
        }
        throw new IllegalStateException();
    }
}

