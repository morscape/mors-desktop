/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="gv")
@Implements(value="DirectWrapper")
public class DirectWrapper
extends Wrapper {
    @ObfuscatedName(value="ak")
    @Export(value="obj")
    Object obj;

    DirectWrapper(Object object, int n) {
        super(n);
        this.obj = object;
    }

    @Override
    @ObfuscatedName(value="ae")
    @Export(value="isSoft")
    boolean isSoft() {
        return false;
    }

    @Override
    @ObfuscatedName(value="ak")
    @Export(value="get")
    Object get() {
        return this.obj;
    }
}

