/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ez")
public class class294
extends UserList {
    @ObfuscatedName(value="bs")
    @ObfuscatedSignature(descriptor="Lix;")
    public static class318 field6004;

    @Override
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)[Len;", garbageValue="-2029701546")
    @Export(value="newTypedArray")
    class61[] newTypedArray(int n) {
        class61[] arrclass61 = new class381[n];
        return arrclass61;
    }

    @ObfuscatedName(value="cm")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="1249809459")
    @Export(value="getWindowedMode")
    static int getWindowedMode() {
        boolean bl = Client.isResizable;
        if (bl) {
            return 2;
        }
        return 1;
    }
}

