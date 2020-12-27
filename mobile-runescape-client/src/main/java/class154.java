/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ki")
public class class154 {
    @ObfuscatedName(value="ae")
    final int field3711;
    @ObfuscatedName(value="ai")
    final String field3712;
    @ObfuscatedName(value="ak")
    final int field3713;

    @ObfuscatedSignature(descriptor="(Lmi;)V")
    class154(Buffer buffer) {
        this(buffer.method11650(1347902065), buffer.method11650(2004510511), buffer.method11664(-2119028581));
    }

    class154(int n, int n2, String string2) {
        this.field3713 = n;
        this.field3711 = n2;
        this.field3712 = string2;
    }

    @ObfuscatedName(value="ae")
    int method6273() {
        return this.field3711;
    }

    @ObfuscatedName(value="ak")
    String method6277() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toHexString(this.field3713));
        stringBuilder.append(Integer.toHexString(this.field3711));
        stringBuilder.append(this.field3712);
        return stringBuilder.toString();
    }
}

