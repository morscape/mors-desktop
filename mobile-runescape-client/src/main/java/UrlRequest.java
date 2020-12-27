/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jk")
@Implements(value="UrlRequest")
public class UrlRequest {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ljj;")
    final class139 field3575;
    @ObfuscatedName(value="ai")
    @Export(value="isDone0")
    volatile boolean isDone0;
    @ObfuscatedName(value="ak")
    final URL field3577;
    @ObfuscatedName(value="ax")
    @Export(value="response0")
    volatile byte[] response0;

    @ObfuscatedSignature(descriptor="(Ljava/net/URL;Ljj;)V")
    UrlRequest(URL uRL, class139 class1392) {
        this.field3577 = uRL;
        this.field3575 = class1392;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="281412075")
    @Export(value="isDone")
    public boolean isDone() {
        boolean bl = this.isDone0;
        return bl;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)[B", garbageValue="1523629486")
    @Export(value="getResponse")
    public byte[] getResponse() {
        byte[] arrby = this.response0;
        return arrby;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1715243165")
    void method5946() {
        this.isDone0 = true;
        if (this.field3575 != null) {
            this.field3575.method5938(this);
        }
    }
}

