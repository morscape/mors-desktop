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

@ObfuscatedName(value="gt")
@Implements(value="DemotingHashTable")
public final class DemotingHashTable {
    @ObfuscatedName(value="ae")
    @Export(value="remaining")
    int remaining;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lgp;")
    class98 field2755;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lpy;")
    @Export(value="hashTable")
    IterableNodeHashTable hashTable;
    @ObfuscatedName(value="ak")
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfl;")
    @Export(value="queue")
    IterableDualNodeQueue queue = new IterableDualNodeQueue();

    public DemotingHashTable(int n, int n2) {
        int n3;
        this.capacity = n;
        this.remaining = n;
        int n4 = 1;
        while ((n3 = n4 + n4) < n && n4 < n2) {
            n4 = n3;
        }
        this.hashTable = new IterableNodeHashTable(n4);
    }

    @ObfuscatedName(value="ae")
    @Export(value="remove")
    void remove(long l) {
        this.removeWrapper((Wrapper)this.hashTable.get(l));
    }

    @ObfuscatedName(value="as")
    @Export(value="clear")
    public void clear() {
        this.queue.clear();
        this.hashTable.clear();
        this.remaining = this.capacity;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lge;)V")
    @Export(value="removeWrapper")
    void removeWrapper(Wrapper wrapper) {
        if (wrapper != null) {
            wrapper.remove();
            wrapper.removeDual();
            this.remaining += wrapper.size;
        }
    }

    @ObfuscatedName(value="ak")
    @Export(value="get")
    public Object get(long l) {
        Wrapper wrapper = (Wrapper)this.hashTable.get(l);
        if (wrapper == null) {
            return null;
        }
        Object object = wrapper.get();
        if (object == null) {
            wrapper.remove();
            wrapper.removeDual();
            this.remaining += wrapper.size;
            return null;
        }
        if (wrapper.isSoft()) {
            DirectWrapper directWrapper = new DirectWrapper(object, wrapper.size);
            this.hashTable.put(directWrapper, wrapper.key);
            this.queue.add(directWrapper);
            directWrapper.keyDual = 0L;
            wrapper.remove();
            wrapper.removeDual();
            return object;
        }
        this.queue.add(wrapper);
        wrapper.keyDual = 0L;
        return object;
    }

    @ObfuscatedName(value="ax")
    @Export(value="put")
    public void put(Object object, long l, int n) {
        if (n <= this.capacity) {
            this.remove(l);
            this.remaining -= n;
        } else {
            throw new IllegalStateException();
        }
        while (this.remaining < 0) {
            Wrapper wrapper = (Wrapper)this.queue.removeLast();
            if (wrapper != null) {
                wrapper.isSoft();
                this.removeWrapper(wrapper);
                if (this.field2755 == null) continue;
                this.field2755.method4857(wrapper.get());
                continue;
            }
            throw new RuntimeException("");
        }
        object = new DirectWrapper(object, n);
        this.hashTable.put((Node)object, l);
        this.queue.add((DualNode)object);
        ((DualNode)object).keyDual = 0L;
    }
}

