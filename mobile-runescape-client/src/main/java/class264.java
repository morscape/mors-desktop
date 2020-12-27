/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bi")
public class class264
extends Rasterizer3D {
    @ObfuscatedName(value="aj")
    static boolean field4632 = false;
    @ObfuscatedName(value="du")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field4634;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lac;")
    Varcs field4635;
    @ObfuscatedName(value="as")
    boolean field4636 = true;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lbr;")
    final class31 field4637;

    @ObfuscatedSignature(descriptor="(Lbr;)V")
    public class264(class31 class313) {
        this.field4637 = class313;
        this.field346 = class313.vmethod10628(-520864119);
        this.field343 = class313.vmethod10632(871127585);
    }

    @ObfuscatedName(value="aa")
    final void method7610(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, float f, float f2, float f3, float f4, float f5, float f6, int n13, int n14) {
        if (Rasterizer3D.field339.getTexturePixels(n13) != null) {
            n14 = this.field350 != 0 ? this.field350 : 255;
            short s = (short)(n14 << 8 | 0xFF);
            n14 = Math.min(Math.max(n10, 2), 126);
            n11 = Math.min(Math.max(n11, 2), 126);
            n12 = Math.min(Math.max(n12, 2), 126);
            n10 = 1;
            if (n7 != 1) {
                n10 = this.field354;
            }
            short s2 = class323.method11428(n13, -1612500502);
            int n15 = ((TextureProvider)Rasterizer3D.field339).vmethod7798((int)n13).field4668 / 2;
            n13 = ((TextureProvider)Rasterizer3D.field339).vmethod7798((int)n13).field4669 / 2;
            short s3 = (short)n4;
            short s4 = (short)n;
            short s5 = (short)n7;
            short s6 = (short)n10;
            ak.method3382(s3, s4, s5, s6, (short)(n14 + 1024), s, s2, class363.method12195(f, f4, n15, n13), (short)n5, (short)n2, (short)n8, s6, (short)(n11 + 1024), s, s2, class363.method12195(f2, f5, n15, n13), (short)n6, (short)n3, (short)n9, s6, (short)(n12 + 1024), s, s2, class363.method12195(f3, f6, n15, n13));
            return;
        }
        n7 = Rasterizer3D.field339.getAverageTextureRGB(n13);
        this.method7615(n, n2, n3, n4, n5, n6, class82.method4599(n7, n10, (byte)0), class82.method4599(n7, n11, (byte)0), class82.method4599(n7, n12, (byte)0));
    }

    @Override
    @ObfuscatedName(value="ae")
    void vmethod7613(int n, int n2, int n3, int n4, byte by) {
        super.vmethod7613(n, n2, n3, n4, (byte)0);
        this.field4635.method14(n, n2, n3 - n, n4 - n2);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(IIIIIIIIII)V", garbageValue="2141563914")
    final void method7615(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.method7629(n, n2, n3, n4, n5, n6, 1, 1, 1, n7, n8, n9, 1, 2131820544);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIIIIIII)V", garbageValue="183305682")
    final void method7624(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.method7629(n, n2, n3, n4, n5, n6, 1, 1, 1, n7, n7, n7, 1, 2131820544);
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="88")
    public void vmethod7616(int n) {
        super.vmethod7616(n);
        ak.method3394(n);
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-526308908")
    public void vmethod7646() {
        if (!ak.method3368()) {
            this.field4636 = true;
        }
        if ((this.field4636 || field4632) && ak.method3353()) {
            if (this.field4636 && class304.method11055().method959(Rasterizer3D.field339)) {
                this.field4636 = false;
            }
            if (field4632) {
                class304.method11055().method971();
                field4632 = false;
            }
        }
        class304.method11055().method961(Rasterizer3D.field339, (byte)77);
        this.field4635 = this.field4637.vmethod10634();
        this.field346 = this.field4637.vmethod10628(-1718845213);
        this.field343 = this.field4637.vmethod10632(894907465);
        ak.method3403(-25079296);
        class304.method11055().field552 = ak.method3383();
    }

    @ObfuscatedName(value="ax")
    final void method7629(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        n14 = this.field350 != 0 ? this.field350 : 255;
        short s = (short)(n14 << 8 | 0xFF);
        short s2 = (short)n4;
        short s3 = (short)n;
        short s4 = (short)n7;
        short s5 = (short)n13;
        ak.method3382(s2, s3, s4, s5, (short)n10, s, (short)0, (short)0, (short)n5, (short)n2, (short)n8, s5, (short)n11, s, (short)0, (short)0, (short)n6, (short)n3, (short)n9, s5, (short)n12, s, (short)0, (short)0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ae")
    public static void method7607(boolean bl, int n) {
        Object object = NetCache.NetCache_socket;
        if (object == null) {
            return;
        }
        try {
            object = new Buffer(4);
            n = bl ? 2 : 3;
        }
        catch (IOException iOException) {}
        try {
            NetCache.NetCache_socket.close();
        }
        catch (Exception exception) {}
        --NetCache.field3736;
        NetCache.NetCache_socket = null;
        return;
        ((Buffer)object).method11652(n, 422009005);
        ((Buffer)object).method11647(0, -1680944396);
        NetCache.NetCache_socket.write(((Buffer)object).array, 0, 4);
    }

    @ObfuscatedName(value="fp")
    @ObfuscatedSignature(descriptor="(Lax;III)V", garbageValue="223644257")
    @Export(value="alignWidgetPosition")
    static void alignWidgetPosition(Widget widget, int n, int n2) {
        widget.x = widget.xAlignment == 0 ? widget.rawX : (widget.xAlignment == 1 ? widget.rawX + (n - widget.width) / 2 : (widget.xAlignment == 2 ? n - widget.width - widget.rawX : (widget.xAlignment == 3 ? widget.rawX * n >> 14 : (widget.xAlignment == 4 ? (widget.rawX * n >> 14) + (n - widget.width) / 2 : n - widget.width - (widget.rawX * n >> 14)))));
        if (widget.yAlignment != 0) {
            if (widget.yAlignment != 1) {
                if (widget.yAlignment != 2) {
                    if (widget.yAlignment != 3) {
                        if (widget.yAlignment != 4) {
                            widget.y = n2 - widget.height - (n2 * widget.rawY >> 14);
                            return;
                        }
                        widget.y = (n2 * widget.rawY >> 14) + (n2 - widget.height) / 2;
                        return;
                    }
                    widget.y = n2 * widget.rawY >> 14;
                    return;
                }
                widget.y = n2 - widget.height - widget.rawY;
                return;
            }
            widget.y = (n2 - widget.height) / 2 + widget.rawY;
            return;
        }
        widget.y = widget.rawY;
    }
}

