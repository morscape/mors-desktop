/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mt")
@Implements(value="Task")
public class Task {
    @ObfuscatedName(value="aa")
    @Export(value="result")
    public volatile Object result;
    @ObfuscatedName(value="ah")
    @Export(value="status")
    public volatile int status = 0;
    @ObfuscatedName(value="aj")
    @Export(value="intArgument")
    public int intArgument;
    @ObfuscatedName(value="al")
    @Export(value="objectArgument")
    Object objectArgument;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-598341841)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lmt;")
    @Export(value="next")
    Task next;

    Task() {
    }
}

