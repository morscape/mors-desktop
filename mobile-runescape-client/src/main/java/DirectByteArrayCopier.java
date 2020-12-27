/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ns")
@Implements(value="DirectByteArrayCopier")
public class DirectByteArrayCopier
extends AbstractByteArrayCopier {
    @ObfuscatedName(value="ak")
    @Export(value="directBuffer")
    ByteBuffer directBuffer;

    DirectByteArrayCopier() {
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="402341573")
    @Export(value="set")
    void set(byte[] arrby) {
        this.directBuffer = ByteBuffer.allocateDirect(arrby.length);
        this.directBuffer.position(0);
        this.directBuffer.put(arrby);
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(S)[B", garbageValue="128")
    @Export(value="get")
    byte[] get() {
        byte[] arrby = new byte[this.directBuffer.capacity()];
        this.directBuffer.position(0);
        this.directBuffer.get(arrby);
        return arrby;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-578758869")
    static void method12097(int n) {
        if (Login.loginIndex == 2) {
            Login.currentLoginField = n;
        }
    }
}

