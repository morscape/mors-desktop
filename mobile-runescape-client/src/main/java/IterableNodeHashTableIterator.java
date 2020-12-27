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

@ObfuscatedName(value="pa")
@Implements(value="IterableNodeHashTableIterator")
public class IterableNodeHashTableIterator
implements Iterator {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="head")
    Node head;
    @ObfuscatedName(value="ai")
    @Export(value="index")
    int index;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lpy;")
    @Export(value="hashTable")
    IterableNodeHashTable hashTable;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="last")
    Node last = null;

    @ObfuscatedSignature(descriptor="(Lpy;)V")
    IterableNodeHashTableIterator(IterableNodeHashTable iterableNodeHashTable) {
        this.hashTable = iterableNodeHashTable;
        this.start();
    }

    @ObfuscatedName(value="aa")
    @Export(value="start")
    void start() {
        this.head = this.hashTable.buckets[0].previous;
        this.index = 1;
        this.last = null;
    }

    @Override
    public boolean hasNext() {
        if (this.hashTable.buckets[this.index - 1] != this.head) {
            return true;
        }
        while (this.index < this.hashTable.size) {
            Node[] arrnode = this.hashTable.buckets;
            int n = this.index;
            this.index = n + 1;
            if (this.hashTable.buckets[this.index - 1] != arrnode[n].previous) {
                this.head = this.hashTable.buckets[this.index - 1].previous;
                return true;
            }
            this.head = this.hashTable.buckets[this.index - 1];
        }
        return false;
    }

    public Object next() {
        if (this.hashTable.buckets[this.index - 1] != this.head) {
            Node node = this.head;
            this.head = node.previous;
            this.last = node;
            return node;
        }
        while (this.index < this.hashTable.size) {
            Object object = this.hashTable.buckets;
            int n = this.index;
            this.index = n + 1;
            object = object[n].previous;
            if (object == this.hashTable.buckets[this.index - 1]) continue;
            this.head = object.previous;
            this.last = object;
            return object;
        }
        return null;
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

