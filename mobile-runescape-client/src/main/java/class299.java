/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fq")
public class class299
implements class77 {
    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(FI)F", garbageValue="214080798")
    public float vmethod10991(float f) {
        return f * f * f;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="2131230854")
    static String method10986() {
        if (ServerPacket.clientPreferences.hideUsername) {
            return class212.method6894(Login.Login_username);
        }
        String string2 = Login.Login_username;
        return string2;
    }
}

