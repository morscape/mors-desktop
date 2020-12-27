/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jc")
@Implements(value="SecureRandomCallable")
public class SecureRandomCallable
implements Callable {
    @ObfuscatedName(value="cz")
    @ObfuscatedSignature(descriptor="Lnb;")
    @Export(value="js5Socket")
    static AbstractSocket js5Socket;

    SecureRandomCallable() {
    }

    public Object call() {
        SecureRandom secureRandom = class33.method885();
        return secureRandom;
    }
}

