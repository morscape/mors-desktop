/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="or")
@Implements(value="Timer")
public class Timer {
    @ObfuscatedName(value="aa")
    int field4081 = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(longValue=-5531144507403873555L)
    long field4083 = -1L;
    @ObfuscatedName(value="ah")
    long field4084 = 0L;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-121477149)
    int field4086 = 0;
    @ObfuscatedName(value="al")
    int field4088 = 0;
    @ObfuscatedName(value="as")
    long field4089 = 0L;
    @ObfuscatedName(value="ai")
    public boolean field4085 = false;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(longValue=1784408969886090513L)
    long field4087 = 1L;
    @ObfuscatedName(value="ax")
    long field4090 = 0L;
    @ObfuscatedName(value="ab")
    int field4082 = 0;

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1842955023")
    public void method7084(int n) {
        this.field4083 = class363.currentTimeMillis();
        this.field4086 = n;
    }
}

