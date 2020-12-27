/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kp")
public class class331
implements class161 {
    @ObfuscatedName(value="ak")
    final MessageDigest field6297 = this.method11499();

    @ObfuscatedSignature(descriptor="(Lki;)V")
    class331(class154 class1542) {
    }

    @ObfuscatedName(value="ah")
    MessageDigest method11499() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            return messageDigest;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    @ObfuscatedName(value="ak")
    boolean method11500(int n, String string2, long l) {
        return class331.method11493(this.method11503(string2, l)) >= n;
    }

    @ObfuscatedName(value="ax")
    byte[] method11503(String string2, long l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(Long.toHexString(l));
        this.field6297.reset();
        try {
            this.field6297.update(stringBuilder.toString().getBytes("UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        return this.field6297.digest();
    }

    @ObfuscatedName(value="ae")
    static int method11493(byte[] arrby) {
        int n = 0;
        for (int i = 0; i < arrby.length; ++i) {
            int n2 = class331.method11494(arrby[i]);
            n += n2;
            if (n2 == 8) continue;
            return n;
        }
        return n;
    }

    @ObfuscatedName(value="ai")
    static int method11494(byte by) {
        if (by == 0) {
            return 8;
        }
        by = (byte)(by & 0xFF);
        int n = 0;
        while ((by & 0x80) == 0) {
            ++n;
            by = (byte)(by << 1);
        }
        return n;
    }
}

