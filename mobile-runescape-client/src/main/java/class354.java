/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oi")
final class class354
implements class230 {
    @ObfuscatedName(value="ae")
    static File field6427;

    class354() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Long;Lmi;I)V", garbageValue="-1862307957")
    void method12104(Long l, Buffer buffer) {
        buffer.writeLong(l);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;I)Ljava/lang/Object;")
    public Object vmethod12183(Buffer buffer, int n) {
        long l = buffer.method11663((byte)-105);
        return l;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lmi;I)V", garbageValue="643224647")
    public void vmethod12188(Object object, Buffer buffer) {
        this.method12104((Long)object, buffer);
    }
}

