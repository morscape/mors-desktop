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

@ObfuscatedName(value="kh")
@Implements(value="BZip2Decompressor")
public final class BZip2Decompressor {
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lkf;")
    @Export(value="BZip2Decompressor_state")
    static BZip2State BZip2Decompressor_state = new BZip2State();

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lkf;)V")
    static void method6253() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    @Export(value="BZip2Decompressor_decompress")
    public static int BZip2Decompressor_decompress(byte[] arrby, int n, byte[] arrby2, int n2, int n3) {
        BZip2State bZip2State = BZip2Decompressor_state;
        synchronized (bZip2State) {
            BZip2Decompressor.BZip2Decompressor_state.inputArray = arrby2;
            BZip2Decompressor.BZip2Decompressor_state.nextByte = n3;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = arrby;
            BZip2Decompressor.BZip2Decompressor_state.next_out = 0;
            BZip2Decompressor.BZip2Decompressor_state.outputLength = n;
            BZip2Decompressor.BZip2Decompressor_state.bsLive = 0;
            BZip2Decompressor.BZip2Decompressor_state.bsBuff = 0;
            BZip2Decompressor.BZip2Decompressor_state.nextBit_unused = 0;
            BZip2Decompressor.BZip2Decompressor_state.field3672 = 0;
            BZip2Decompressor.method6253();
            n2 = BZip2Decompressor.BZip2Decompressor_state.outputLength * 1847473275;
            BZip2Decompressor.BZip2Decompressor_state.inputArray = null;
            BZip2Decompressor.BZip2Decompressor_state.outputArray = null;
            return n - n2 * 2006289075;
        }
    }
}

