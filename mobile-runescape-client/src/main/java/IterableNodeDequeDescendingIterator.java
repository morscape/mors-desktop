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

@ObfuscatedName(value="fu")
@Implements(value="IterableNodeDequeDescendingIterator")
public class IterableNodeDequeDescendingIterator
implements Iterator {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnr;")
    Node field2608;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="last")
    Node last = null;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfx;")
    @Export(value="deque")
    IterableNodeDeque deque;

    @ObfuscatedSignature(descriptor="(Lfx;)V")
    IterableNodeDequeDescendingIterator(IterableNodeDeque iterableNodeDeque) {
        this.setDeque(iterableNodeDeque);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lfx;)V")
    @Export(value="setDeque")
    void setDeque(IterableNodeDeque iterableNodeDeque) {
        this.deque = iterableNodeDeque;
        this.start();
    }

    @ObfuscatedName(value="ab")
    @Export(value="start")
    void start() {
        Node node = this.deque != null ? this.deque.sentinel.previous : null;
        this.field2608 = node;
        this.last = null;
    }

    @Override
    public boolean hasNext() {
        return this.deque.sentinel != this.field2608;
    }

    public Object next() {
        Node node = this.field2608;
        if (node == this.deque.sentinel) {
            this.field2608 = null;
            node = null;
        } else {
            this.field2608 = node.previous;
        }
        this.last = node;
        return node;
    }

    @Override
    public void remove() {
        if (this.last != null) {
            this.last.remove();
            this.last = null;
            return;
        }
        throw new IllegalStateException();
    }
}

