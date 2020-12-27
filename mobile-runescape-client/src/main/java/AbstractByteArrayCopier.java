/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nf")
@Implements(value="AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
    AbstractByteArrayCopier() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BI)V", garbageValue="402341573")
    @Export(value="set")
    abstract void set(byte[] var1);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(S)[B", garbageValue="128")
    @Export(value="get")
    abstract byte[] get();
}

