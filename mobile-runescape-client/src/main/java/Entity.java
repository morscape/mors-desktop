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

@ObfuscatedName(value="bw")
@Implements(value="Entity")
public abstract class Entity
extends DualNode {
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=111065049)
    @Export(value="height")
    public int height = 1000;

    protected Entity() {
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected abstract Model getModel();

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Llq;I)V", garbageValue="-1127343285")
    public static void method12210(class173 class1732) {
        class181.field3830 = class1732;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="1625466810")
    public static void method12209(AbstractArchive abstractArchive) {
        class373.field6963 = abstractArchive;
    }
}

