/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ap")
public final class class11 {
    @ObfuscatedName(value="rc")
    @ObfuscatedSignature(descriptor="Lok;")
    public static class228 field264;
    @ObfuscatedName(value="jg")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field262;

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1087561432")
    public static void method286() {
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method6350();
    }

    @ObfuscatedName(value="ay")
    static final int method285(int n, int n2, int n3, int n4) {
        int n5 = n / n3;
        n4 = n3 - 1;
        n &= n4;
        int n6 = n2 / n3;
        int n7 = class319.method11377(n5, n6, (byte)-85);
        int n8 = n5 + 1;
        int n9 = class319.method11377(n8, n6, (byte)-21);
        n5 = class319.method11377(n5, ++n6, (byte)-40);
        n8 = class319.method11377(n8, n6, (byte)-113);
        n = SequenceDefinition.method13160(SequenceDefinition.method13160(n7, n9, n, n3), SequenceDefinition.method13160(n5, n8, n, n3), n2 & n4, n3);
        return n;
    }
}

