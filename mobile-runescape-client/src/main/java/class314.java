/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ij")
public class class314
extends class97 {
    class314() {
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Z", garbageValue="-2145229154")
    static boolean method11223(String string2) {
        if (string2 == null) {
            return false;
        }
        try {
            new URL(string2);
            return true;
        }
        catch (MalformedURLException malformedURLException) {
            return false;
        }
    }
}

