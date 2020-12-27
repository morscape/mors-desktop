/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="nb")
@Implements(value="AbstractSocket")
public abstract class AbstractSocket {
    protected AbstractSocket() {
    }

    @ObfuscatedName(value="ae")
    @Export(value="close")
    public abstract void close();

    @ObfuscatedName(value="al")
    @Export(value="write")
    public abstract void write(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName(value="as")
    @Export(value="read")
    public abstract int read(byte[] var1, int var2, int var3) throws IOException;

    @ObfuscatedName(value="ai")
    public abstract int vmethod12077() throws IOException;

    @ObfuscatedName(value="ax")
    public abstract int vmethod12093() throws IOException;
}

