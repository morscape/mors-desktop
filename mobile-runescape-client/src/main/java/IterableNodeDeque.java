/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fx")
@Implements(value="IterableNodeDeque")
public class IterableNodeDeque
implements Iterable,
Collection {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnr;")
    Node field2634;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="sentinel")
    Node sentinel;

    public IterableNodeDeque() {
        this.sentinel.previous = this.sentinel = new Node();
        this.sentinel.next = this.sentinel;
    }

    @ObfuscatedName(value="aa")
    public boolean method4656() {
        return this.sentinel.previous == this.sentinel;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lnr;)V")
    @Export(value="addFirst")
    public void addFirst(Node node) {
        if (node.next != null) {
            node.remove();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lnr;)Z")
    boolean method4661(Node node) {
        this.addFirst(node);
        return true;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="last")
    public Node last() {
        return this.method4674(null);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="previous")
    public Node previous() {
        Node node = this.field2634;
        if (node == this.sentinel) {
            this.field2634 = null;
            return null;
        }
        this.field2634 = node.previous;
        return node;
    }

    @ObfuscatedName(value="al")
    int method4667() {
        Node node = this.sentinel.previous;
        int n = 0;
        while (node != this.sentinel) {
            ++n;
            node = node.previous;
        }
        return n;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lnr;)Lnr;")
    Node method4674(Node node) {
        Node node2 = node;
        if (node == null) {
            node2 = this.sentinel.previous;
        }
        if (node2 == this.sentinel) {
            this.field2634 = null;
            return null;
        }
        this.field2634 = node2.previous;
        return node2;
    }

    @ObfuscatedName(value="ak")
    @Export(value="rsClear")
    public void rsClear() {
        while (this.sentinel.previous != this.sentinel) {
            this.sentinel.previous.remove();
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="()[Lnr;")
    Node[] method4657() {
        Node[] arrnode = new Node[this.method4667()];
        Node node = this.sentinel.previous;
        int n = 0;
        while (node != this.sentinel) {
            arrnode[n] = node;
            node = node.previous;
            ++n;
        }
        return arrnode;
    }

    public boolean add(Object object) {
        return this.method4661((Node)object);
    }

    public boolean addAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public void clear() {
        this.rsClear();
    }

    @Override
    public boolean contains(Object object) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        return n;
    }

    @Override
    public boolean isEmpty() {
        return this.method4656();
    }

    @Override
    public Iterator iterator() {
        return new IterableNodeDequeDescendingIterator(this);
    }

    @Override
    public boolean remove(Object object) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection collection) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection collection) {
        throw new RuntimeException();
    }

    @Override
    public int size() {
        return this.method4667();
    }

    @Override
    public Object[] toArray() {
        return this.method4657();
    }

    public Object[] toArray(Object[] arrobject) {
        Node node = this.sentinel.previous;
        int n = 0;
        while (node != this.sentinel) {
            arrobject[n] = node;
            node = node.previous;
            ++n;
        }
        return arrobject;
    }
}

