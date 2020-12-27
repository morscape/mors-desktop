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

@ObfuscatedName(value="ga")
@Implements(value="EvictingDualNodeHashTable")
public final class EvictingDualNodeHashTable {
    @ObfuscatedName(value="ae")
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfl;")
    @Export(value="deque")
    IterableDualNodeQueue deque;
    @ObfuscatedName(value="ai")
    @Export(value="remainingCapacity")
    int remainingCapacity;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmp;")
    DualNode field2642 = new DualNode();
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpy;")
    @Export(value="hashTable")
    IterableNodeHashTable hashTable;

    public EvictingDualNodeHashTable(int n, String string2) {
        int n2;
        this.deque = new IterableDualNodeQueue();
        this.capacity = n;
        this.remainingCapacity = n;
        int n3 = 1;
        while ((n2 = n3 + n3) < n) {
            n3 = n2;
        }
        this.hashTable = new IterableNodeHashTable(n3);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmp;J)V")
    @Export(value="put")
    public void put(DualNode dualNode, long l) {
        if (this.remainingCapacity == 0) {
            DualNode dualNode2 = this.deque.removeLast();
            dualNode2.remove();
            dualNode2.removeDual();
            if (dualNode2 == this.field2642) {
                dualNode2 = this.deque.removeLast();
                dualNode2.remove();
                dualNode2.removeDual();
            }
        } else {
            --this.remainingCapacity;
        }
        this.hashTable.put(dualNode, l);
        this.deque.add(dualNode);
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(J)Lmp;")
    @Export(value="get")
    public DualNode get(long l) {
        DualNode dualNode = (DualNode)this.hashTable.get(l);
        if (dualNode != null) {
            this.deque.add(dualNode);
        }
        return dualNode;
    }

    @ObfuscatedName(value="ax")
    @Export(value="clear")
    public void clear() {
        this.deque.clear();
        this.hashTable.clear();
        this.field2642 = new DualNode();
        this.remainingCapacity = this.capacity;
    }

    public String toString() {
        return "";
    }
}

