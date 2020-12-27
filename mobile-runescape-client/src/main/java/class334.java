/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kt")
public class class334
implements class160 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;Lmi;)V")
    void method11517(Buffer object, Buffer buffer) {
        object = new class154((Buffer)object);
        class331 class3312 = new class331((class154)object);
        long l = 0L;
        while (!class3312.method11500(((class154)object).method6273(), ((class154)object).method6277(), l)) {
            ++l;
        }
        buffer.writeLong(l);
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;)Lmi;")
    public Buffer vmethod11521(Buffer buffer) {
        Buffer buffer2 = new Buffer(100);
        this.method11517(buffer, buffer2);
        return buffer2;
    }
}

