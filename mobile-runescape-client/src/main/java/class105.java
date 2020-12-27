/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  he
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="he")
public class class105 {
    @ObfuscatedName(value="ae")
    Future field3221;
    @ObfuscatedName(value="ak")
    ExecutorService field3222 = Executors.newSingleThreadExecutor();

    class105() {
        this.field3221 = this.field3222.submit(new SecureRandomCallable());
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="gi")
    @ObfuscatedSignature(descriptor="([Lax;IB)V")
    static final void method5030(Widget[] arrwidget, int n, byte by) {
        by = 0;
        while (true) {
            block13: {
                Widget widget;
                block14: {
                    InterfaceParent interfaceParent;
                    if (by >= arrwidget.length) {
                        return;
                    }
                    widget = arrwidget[by];
                    if (widget == null || widget.parentId != n || widget.isIf3 && ClientPacket.isComponentHidden(widget)) break block13;
                    if (widget.type != 0) break block14;
                    if (!widget.isIf3 && ClientPacket.isComponentHidden(widget) && widget != class285.mousedOverWidgetIf1) break block13;
                    class105.method5030(arrwidget, widget.id, (byte)-7);
                    if (widget.children != null) {
                        class105.method5030(widget.children, widget.id, (byte)-22);
                    }
                    if ((interfaceParent = (InterfaceParent)Client.interfaceParents.get(widget.id)) != null) {
                        class272.method7781(interfaceParent.group);
                    }
                }
                if (widget.type == 6) {
                    int n2;
                    if ((widget.sequenceId != -1 || widget.sequenceId2 != -1) && (n2 = Widget.runCs1(widget, 1311298955) ? widget.sequenceId2 : widget.sequenceId) != -1) {
                        SequenceDefinition sequenceDefinition = class122.SequenceDefinition_get(n2);
                        widget.modelFrameCycle = Client.field4804 * 375836608 + widget.modelFrameCycle;
                        while (widget.modelFrameCycle > sequenceDefinition.frameLengths[widget.modelFrame]) {
                            widget.modelFrameCycle -= sequenceDefinition.frameLengths[widget.modelFrame];
                            ++widget.modelFrame;
                            if (widget.modelFrame >= sequenceDefinition.field7058.length) {
                                widget.modelFrame -= sequenceDefinition.frameCount;
                                if (widget.modelFrame < 0 || widget.modelFrame >= sequenceDefinition.field7058.length) {
                                    widget.modelFrame = 0;
                                }
                            }
                            class135.invalidateWidget(widget);
                        }
                    }
                    if (widget.field4532 * 1395357547 != 0 && !widget.isIf3) {
                        n2 = widget.field4532;
                        int n3 = widget.field4532;
                        int n4 = Client.field4804 * -741994944;
                        int n5 = Client.field4804 * -741994944;
                        widget.field4524 = n4 * (n2 * 1395357547 >> 16) * -1395613897 + widget.field4524 & 0x7FF;
                        widget.field4516 = widget.field4516 + n5 * (n3 * 1395357547 << 16 >> 16) * -1395613897 & 0x7FF;
                        class135.invalidateWidget(widget);
                    }
                }
            }
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)[B", garbageValue="-1364752606")
    @Export(value="ByteArrayPool_getArray")
    public static byte[] ByteArrayPool_getArray(int n) {
        synchronized (he.class) {
            byte[] arrby = ByteArrayPool.method6713(n, false, 7201308);
            return arrby;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;Lkc;Lkc;B)V", garbageValue="16")
    public static void method5028(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3, AbstractArchive abstractArchive4) {
        class50.Widget_archive = abstractArchive;
        class290.field5975 = abstractArchive2;
        class97.Widget_spritesArchive = abstractArchive3;
        ArchiveDiskAction.Widget_fontsArchive = abstractArchive4;
        class79.Widget_interfaceComponents = new Widget[class50.Widget_archive.method6156(-1753747042)][];
        class222.Widget_loadedInterfaces = new boolean[class50.Widget_archive.method6156(-1985398234)];
    }

    @ObfuscatedName(value="iv")
    @ObfuscatedSignature(descriptor="(Lmi;I)V", garbageValue="-650487306")
    static void method5031(Buffer buffer) {
        if (Client.randomDatData == null) {
            byte[] arrby = class185.method6628(711630104);
            buffer.method11653(arrby, 0, arrby.length, 1238198509);
            return;
        }
        buffer.method11653(Client.randomDatData, 0, Client.randomDatData.length, -1659727416);
    }
}

