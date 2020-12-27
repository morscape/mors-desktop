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

@ObfuscatedName(value="pk")
@Implements(value="NodeHashTable")
public final class NodeHashTable {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Lnr;")
    @Export(value="buckets")
    Node[] buckets;
    @ObfuscatedName(value="ah")
    @Export(value="index")
    int index = 0;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="currentGet")
    Node currentGet;
    @ObfuscatedName(value="ak")
    @Export(value="size")
    int size;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="current")
    Node current;

    public NodeHashTable(int n) {
        this.size = n;
        this.buckets = new Node[n];
        for (int i = 0; i < n; ++i) {
            Node node;
            Node[] arrnode = this.buckets;
            arrnode[i] = node = new Node();
            node.previous = node;
            node.next = node;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lnr;J)V")
    @Export(value="put")
    public void put(Node node, long l) {
        if (node.next != null) {
            node.remove();
        }
        Node node2 = this.buckets[(int)((long)(this.size - 1) & l)];
        node.next = node2.next;
        node.previous = node2;
        node.next.previous = node;
        node.previous.next = node;
        node.key = l;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="first")
    public Node first() {
        this.index = 0;
        return this.next();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(J)Lnr;")
    @Export(value="get")
    public Node get(long l) {
        Node node = this.buckets[(int)((long)(this.size - 1) & l)];
        this.currentGet = node.previous;
        while (node != this.currentGet && this.currentGet != null) {
            if (this.currentGet.key == l) {
                node = this.currentGet;
                this.currentGet = this.currentGet.previous;
                return node;
            }
            this.currentGet = this.currentGet.previous;
        }
        this.currentGet = null;
        return null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="next")
    public Node next() {
        if (this.index > 0 && this.buckets[this.index - 1] != this.current) {
            Node node = this.current;
            this.current = node.previous;
            return node;
        }
        while (this.index < this.size) {
            Object object = this.buckets;
            int n = this.index;
            this.index = n + 1;
            object = object[n].previous;
            if (object == this.buckets[this.index - 1]) continue;
            this.current = object.previous;
            return object;
        }
        return null;
    }
}

