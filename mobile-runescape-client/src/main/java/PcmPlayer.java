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

@ObfuscatedName(value="hn")
@Implements(value="PcmPlayer")
public abstract class PcmPlayer {
    @ObfuscatedName(value="ae")
    @Export(value="PcmPlayer_stereo")
    static boolean PcmPlayer_stereo = false;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1816739005)
    static int field3248 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lhj;")
    static SoundSystem field3253;
    @ObfuscatedName(value="hn")
    @ObfuscatedGetter(intValue=287174095)
    static int field3256;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-348348615)
    public static int field3250 = 0;
    @ObfuscatedName(value="af")
    int[] field3258;
    @ObfuscatedName(value="am")
    int field3259 = 686957280;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-1408806141)
    int field3260;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lhg;")
    @Export(value="stream")
    PcmStream stream;
    @ObfuscatedName(value="az")
    int field3264;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="[Lhg;")
    PcmStream[] field3262;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="[Lhg;")
    PcmStream[] field3263;
    @ObfuscatedName(value="ab")
    boolean field3257 = false;

    PcmPlayer() {
        class363.currentTimeMillis();
        this.field3264 = 0;
        this.field3262 = new PcmStream[8];
        this.field3263 = new PcmStream[8];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aa")
    public final void method5065(int var1_1) {
        // MONITORENTER : this
        if (PcmPlayer.field3253 != null) {
            var1_1 = 0;
            var2_2 = true;
        }
        ** GOTO lbl23
        while (true) {
            if (var1_1 < 2) {
                if (this == PcmPlayer.field3253.players[var1_1]) {
                    PcmPlayer.field3253.players[var1_1] = null;
                }
                if (PcmPlayer.field3253.players[var1_1] != null) {
                    var2_2 = false;
                }
            } else {
                if (var2_2) {
                    SoundSystem.field3242.shutdownNow();
                    SoundSystem.field3242 = null;
                    PcmPlayer.field3253 = null;
                }
lbl23:
                // 4 sources

                this.vmethod11141();
                this.field3258 = null;
                // MONITOREXIT : this
                return;
            }
            ++var1_1;
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="([II)V", garbageValue="256")
    final void method5070(int[] arrn) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-522924565")
    public final void method5074() {
        synchronized (this) {
            try {
                block5: {
                    try {
                        this.vmethod11140();
                        break block5;
                    }
                    catch (Exception exception) {}
                    this.vmethod11141();
                    class363.currentTimeMillis();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-80712262")
    void vmethod11139() throws Exception {
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1243596947")
    void vmethod11140() throws Exception {
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lhg;I)V", garbageValue="658059506")
    @Export(value="setStream")
    public final void setStream(PcmStream pcmStream) {
        synchronized (this) {
            this.stream = pcmStream;
            return;
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-832929818")
    void vmethod11141() {
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1012574534")
    void vmethod11142(int n) throws Exception {
    }

    @ObfuscatedName(value="ak")
    abstract void vmethod11138(int var1);

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1681601448")
    public void method5066(boolean bl) {
        this.field3257 = bl;
    }
}

