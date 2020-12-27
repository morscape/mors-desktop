/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import java.lang.ref.SoftReference;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="gx")
@Implements(value="SoftWrapper")
public class SoftWrapper
extends Wrapper {
    @ObfuscatedName(value="ak")
    SoftReference field7503;

    @Override
    @ObfuscatedName(value="ae")
    @Export(value="isSoft")
    boolean isSoft() {
        return true;
    }

    @Override
    @ObfuscatedName(value="ak")
    @Export(value="get")
    Object get() {
        return this.field7503.get();
    }
}

