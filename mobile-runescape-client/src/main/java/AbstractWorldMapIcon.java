/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cr")
@Implements(value="AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
    @ObfuscatedName(value="dv")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field2275;
    @ObfuscatedName(value="mj")
    @ObfuscatedGetter(intValue=-1615572113)
    static int field2276;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Laf;")
    @Export(value="coord1")
    public final Coord coord1;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=566854517)
    int field2278;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Laf;")
    @Export(value="coord2")
    public final Coord coord2;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1972036365)
    int field2280;

    @ObfuscatedSignature(descriptor="(Laf;Laf;)V")
    AbstractWorldMapIcon(Coord coord, Coord coord2) {
        this.coord1 = coord;
        this.coord2 = coord2;
    }

    @ObfuscatedName(value="ae")
    public abstract int vmethod10428(int var1);

    @ObfuscatedName(value="as")
    boolean method3626(int n) {
        n = this.vmethod10428(-1289638150);
        return n >= 0;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)Lcm;", garbageValue="-85")
    @Export(value="getLabel")
    abstract class42 getLabel();

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Lde;", garbageValue="348688908")
    @Export(value="getObjectDefinition")
    public static ObjectDefinition getObjectDefinition(int n) {
        Object object = ObjectDefinition.ObjectDefinition_cached;
        long l = n;
        if ((object = (ObjectDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = ObjectDefinition.ObjectDefinition_archive.takeFile(6, n);
        ObjectDefinition objectDefinition = new ObjectDefinition();
        objectDefinition.id = n;
        if (object != null) {
            objectDefinition.decodeNext(new Buffer((byte[])object), -1913456409);
        }
        objectDefinition.method12883((byte)1);
        if (objectDefinition.field6905) {
            objectDefinition.field6883 = 0;
            objectDefinition.field6892 = false;
        }
        ObjectDefinition.ObjectDefinition_cached.put(objectDefinition, l);
        return objectDefinition;
    }

    @ObfuscatedName(value="ao")
    static final int method3606(int n) {
        n = class33.field537 * 560015041;
        return n * -110073535;
    }
}

