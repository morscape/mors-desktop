/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.jagex3.client.input.softkeyboard.ax;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="eo")
public abstract class class288
extends class58 {
    @ObfuscatedName(value="fy")
    static String field5963;
    @ObfuscatedName(value="ez")
    @ObfuscatedSignature(descriptor="[Lek;")
    static class384[] field5962;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lej;")
    protected class286 field5965;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbc;")
    protected DevicePcmPlayer field5966;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lbi;")
    protected class264 field5967;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lby;")
    protected class34 field5968;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lel;")
    protected class287 field5969;

    protected class288() {
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lbd;", garbageValue="-858686460")
    public Rasterizer3D vmethod11000() {
        class264 class2642 = this.field5967;
        return class2642;
    }

    @Override
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="2132699450")
    public void vmethod11004(int n, int n2) {
        this.field5969.method10639(n, n2);
        this.field5965.method4243(this.field5969.field2457, this.field5969.vmethod10628(-2085080578), this.field5969.vmethod10632(543420569));
    }

    @Override
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="29")
    public void vmethod11006() {
        this.field5969.vmethod10634().method18();
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1717355824")
    public void vmethod11013(int n, int n2, int n3, int n4) {
        this.field5969.method10638(n, n2, n3, n4);
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)Lba;", garbageValue="-71587171")
    public class19 vmethod11003() {
        DevicePcmPlayer devicePcmPlayer = this.field5966;
        return devicePcmPlayer;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lfj;", garbageValue="1091171168")
    public class72 vmethod11005() {
        class286 class2862 = this.field5965;
        return class2862;
    }

    @Override
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="62")
    public void vmethod11016(int n, int n2) {
        this.field5969.method10646(n, n2);
        this.field5965.method4243(this.field5969.field2457, n, n2);
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)Lcom/jagex/jagex3/client/input/softkeyboard/ax;", garbageValue="-1231737696")
    static ax method10653() {
        ax ax2 = Client.field4740.method5708().vmethod12639(3);
        ax2.method3237(Login.Login_username);
        return ax2;
    }
}

