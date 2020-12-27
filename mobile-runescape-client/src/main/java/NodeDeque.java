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

@ObfuscatedName(value="fe")
@Implements(value="NodeDeque")
public class NodeDeque {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="current")
    Node current;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lnr;")
    @Export(value="sentinel")
    public Node sentinel;

    public NodeDeque() {
        this.sentinel.previous = this.sentinel = new Node();
        this.sentinel.next = this.sentinel;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="previous")
    public Node previous() {
        Node node = this.current;
        if (node == this.sentinel) {
            this.current = null;
            return null;
        }
        this.current = node.previous;
        return node;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lnr;)V")
    public void method4082(Node node) {
        if (node.next != null) {
            node.remove();
        }
        node.next = this.sentinel.next;
        node.previous = this.sentinel;
        node.next.previous = node;
        node.previous.next = node;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="removeLast")
    public Node removeLast() {
        Node node = this.sentinel.previous;
        if (node == this.sentinel) {
            return null;
        }
        node.remove();
        return node;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="()Lnr;")
    @Export(value="last")
    public Node last() {
        Node node = this.sentinel.previous;
        if (node == this.sentinel) {
            this.current = null;
            return null;
        }
        this.current = node.previous;
        return node;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="()Lnr;")
    public Node method4095() {
        Node node = this.sentinel.next;
        if (node == this.sentinel) {
            return null;
        }
        node.remove();
        return node;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lnr;)V")
    @Export(value="addLast")
    public void addLast(Node node) {
        if (node.next != null) {
            node.remove();
        }
        node.next = this.sentinel;
        node.previous = this.sentinel.previous;
        node.next.previous = node;
        node.previous.next = node;
    }

    @ObfuscatedName(value="ak")
    @Export(value="clear")
    public void clear() {
        while (true) {
            Node node;
            if ((node = this.sentinel.previous) == this.sentinel) {
                this.current = null;
                return;
            }
            node.remove();
        }
    }
}

