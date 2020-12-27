/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="pt")
final class class362
implements class230 {
    class362() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Integer;Lmi;I)V", garbageValue="-1916010140")
    void method12181(Integer n, Buffer buffer) {
        buffer.method11640(n, (byte)16);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;I)Ljava/lang/Object;")
    public Object vmethod12183(Buffer buffer, int n) {
        n = buffer.method11670(1604085085);
        return n;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lmi;I)V", garbageValue="643224647")
    public void vmethod12188(Object object, Buffer buffer) {
        this.method12181((Integer)object, buffer);
    }
}

