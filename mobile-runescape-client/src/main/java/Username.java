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

@ObfuscatedName(value="ef")
@Implements(value="Username")
public class Username
implements Comparable {
    @ObfuscatedName(value="ae")
    @Export(value="cleanName")
    String cleanName;
    @ObfuscatedName(value="ak")
    @Export(value="name")
    String name;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="2138588971")
    @Export(value="hasCleanName")
    public boolean hasCleanName() {
        String string2 = this.cleanName;
        return string2 != null;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lef;B)I")
    public int method3888(Username username, byte by) {
        if (this.cleanName == null) {
            if (username.cleanName != null) {
                return 1;
            }
        } else {
            if (username.cleanName != null) {
                by = (byte)this.cleanName.compareTo(username.cleanName);
                return by;
            }
            return -1;
        }
        return 0;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="46")
    @Export(value="getName")
    public String getName() {
        String string2 = this.name;
        return string2;
    }

    public int hashCode() {
        if (this.cleanName != null) {
            int n = this.cleanName.hashCode();
            return n;
        }
        return 0;
    }

    @Export(value="compareToTyped")
    @ObfuscatedName(value="compareTo")
    public int compareToTyped(Object object) {
        int n = this.method3888((Username)object, (byte)50);
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof Username)) return false;
        object = (Username)object;
        if (this.cleanName != null) {
            if (((Username)object).cleanName == null) return false;
            if (this.hashCode() == ((Username)object).hashCode()) return this.cleanName.equals(((Username)object).cleanName);
            return false;
        }
        if (((Username)object).cleanName != null) return false;
        return true;
    }

    public String toString() {
        String string2 = this.getName();
        return string2;
    }
}

