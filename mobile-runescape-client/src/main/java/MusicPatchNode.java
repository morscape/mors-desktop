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
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="li")
@Implements(value="MusicPatchNode")
public class MusicPatchNode
extends Node {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lll;")
    @Export(value="patch")
    MusicPatch patch;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lhm;")
    @Export(value="stream")
    RawPcmStream stream;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1965553835)
    int field6341;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=-78466697)
    int field6345;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lhb;")
    @Export(value="rawSound")
    RawSound rawSound;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1976563219)
    int field6333;
    @ObfuscatedName(value="av")
    int field6342;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Llr;")
    MusicPatchNode2 field6344;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="895829820")
    void method11594() {
        this.patch = null;
        this.rawSound = null;
        this.field6344 = null;
        this.stream = null;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="-1663976265")
    public static void method11589(Collection collection) {
        collection.add(class366.field6804);
        collection.add(class366.field6807);
    }

    @ObfuscatedName(value="bi")
    static void method11590(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, byte by) {
        int n10 = 256 - n8;
        n5 = -n5;
        n = n2;
        n2 = n3;
        n3 = n5;
        while (true) {
            if (n3 < 0) {
                n5 = -n4;
                by = (byte)n2;
                n2 = n;
            } else {
                return;
            }
            while (n5 < 0) {
                n = arrn2[n2];
                if (n != 0) {
                    arrn[by] = (((n9 & 0xFF00) * n10 & 0xFF0000 | (n9 & 0xFF00FF) * n10 & 0xFF00FF00) >>> 8) + (((n & 0xFF00) * n8 & 0xFF0000 | n8 * (n & 0xFF00FF) & 0xFF00FF00) >>> 8);
                    n = by + 1;
                } else {
                    n = by + 1;
                }
                ++n5;
                ++n2;
                by = (byte)n;
            }
            n5 = by + n6;
            n = n2 + n7;
            ++n3;
            n2 = n5;
        }
    }
}

