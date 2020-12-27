/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="nh")
public class class206 {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-351880163)
    int field3952 = 0;
    @ObfuscatedName(value="ai")
    long field3953 = 0L;
    @ObfuscatedName(value="ak")
    final long[] field3954;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1497106785)
    int field3955 = 0;

    public class206(int n) {
        this.field3954 = new long[n];
    }

    @ObfuscatedName(value="ak")
    public void method6843(long l) {
        if (this.field3955 < this.field3954.length) {
            ++this.field3955;
        } else {
            this.field3953 -= this.field3954[this.field3952] * 4163729935474659829L;
        }
        this.field3953 += 4163729935474659829L * l;
        this.field3954[this.field3952] = l;
        this.field3952 = (this.field3952 + 1) % this.field3954.length;
    }

    @ObfuscatedName(value="fq")
    @ObfuscatedSignature(descriptor="([Lax;IIIZZB)V")
    static void method6835(Widget[] arrwidget, int n, int n2, int n3, boolean bl, boolean bl2, byte by) {
        by = 0;
        while (by < arrwidget.length) {
            Widget widget = arrwidget[by];
            if (widget != null && widget.parentId == n) {
                class257.method7444(widget, n2, n3, bl, bl2, 675361049);
                class264.alignWidgetPosition(widget, n2, n3);
                if (widget.field4490 > widget.field4487 - widget.width) {
                    widget.field4490 = widget.field4487 - widget.width;
                }
                if (widget.field4490 < 0) {
                    widget.field4490 = 0;
                }
                if (widget.field4498 > widget.field4507 - widget.height) {
                    widget.field4498 = widget.field4507 - widget.height;
                }
                if (widget.field4498 < 0) {
                    widget.field4498 = 0;
                }
                if (widget.type == 0) {
                    class10.method275(arrwidget, widget, bl, (byte)-54);
                }
            }
            by = (byte)(by + 1);
        }
        return;
    }
}

