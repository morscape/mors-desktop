/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cu")
public class class45 {
    @ObfuscatedName(value="rz")
    @ObfuscatedSignature(descriptor="Lny;")
    @Export(value="masterDisk")
    static ArchiveDisk masterDisk;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lcu;")
    static final class45 field2282;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lcu;")
    static final class45 field2283;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=48927879)
    final int field2289;

    static {
        field2283 = new class45(0);
        field2282 = new class45(1);
    }

    class45(int n) {
        this.field2289 = n;
    }

    @ObfuscatedName(value="aj")
    public static String method3635(byte[] object, int n, int n2, int n3) {
        char[] arrc = new char[n2];
        int n4 = 0;
        for (int i = 0; i < n2; ++i) {
            int n5 = object[i + n] & 0xFF;
            if (n5 == 0) continue;
            n3 = n5;
            if (n5 >= 128) {
                n3 = n5;
                if (n5 < 160) {
                    n3 = n5 = class170.field3785[n5 - 128];
                    if (n5 == 0) {
                        n3 = 63;
                    }
                }
            }
            arrc[n4] = (char)n3;
            ++n4;
        }
        object = new String(arrc, 0, n4);
        return object;
    }

    @ObfuscatedName(value="br")
    static int method3637(int n) {
        int n2 = Login.field3215.field6148;
        int n3 = Login.field3215.field6153;
        class122 class1222 = class52.method3752((byte)89);
        int n4 = class1222.field3398 + 23;
        int n5 = class1222.field3402 + Login.field3168;
        int n6 = class1222.field3406 * Login.field3205;
        n = 0;
        while (true) {
            if (n6 >= class121.field3385) {
                return -1;
            }
            if (n2 >= n5 && n3 >= n4 && n2 < n5 + class1222.field3403 && n3 < n4 + class1222.field3399) break;
            n4 = n4 + class1222.field3399 + class1222.field3405;
            int n7 = n + 1;
            int n8 = n5;
            n = n7;
            if (n7 >= class1222.field3406) {
                n4 = class1222.field3398 + 23;
                n = class1222.field3400 * -1070343105;
                n8 = class1222.field3403 * -961737013;
                n8 = n5 + n * 2055869375 + n8 * -1105893661;
                n = 0;
            }
            ++n6;
            n5 = n8;
        }
        return n6;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="av")
    static void method3636(byte[] arrby, int n) {
        Buffer buffer = new Buffer(arrby);
        buffer.offset = arrby.length - 2;
        class82.field2625 = buffer.method11637(790988009);
        class183.field3837 = new int[class82.field2625];
        class0.field1 = new int[class82.field2625];
        class82.field2627 = new int[class82.field2625];
        ItemContainer.field6849 = new int[class82.field2625];
        class82.field2622 = new byte[class82.field2625][];
        buffer.offset = arrby.length - 7 - class82.field2625 * 8;
        class82.field2623 = buffer.method11637(579824645);
        class82.field2624 = buffer.method11637(1801702428);
        int n2 = (buffer.method11650(1080830323) & 0xFF) + 1;
        for (n = 0; n < class82.field2625; ++n) {
            class183.field3837[n] = buffer.method11637(-927434620);
        }
        for (n = 0; n < class82.field2625; ++n) {
            class0.field1[n] = buffer.method11637(860584287);
        }
        for (n = 0; n < class82.field2625; ++n) {
            class82.field2627[n] = buffer.method11637(108866206);
        }
        for (n = 0; n < class82.field2625; ++n) {
            ItemContainer.field6849[n] = buffer.method11637(104378436);
        }
        buffer.offset = arrby.length - 7 - class82.field2625 * 8 - (n2 - 1) * 3;
        class82.field2626 = new int[n2];
        n = 1;
        while (true) {
            if (n >= n2) break;
            class82.field2626[n] = buffer.method11649(933238709);
            if (class82.field2626[n] == 0) {
                class82.field2626[n] = 1;
            }
            ++n;
        }
        buffer.offset = 0;
        n = 0;
        while (true) {
            block13: {
                int n3;
                int n4;
                int n5;
                block14: {
                    block12: {
                        block11: {
                            if (n >= class82.field2625) {
                                return;
                            }
                            n5 = class82.field2627[n];
                            n4 = ItemContainer.field6849[n];
                            n3 = n5 * n4;
                            arrby = new byte[n3];
                            class82.field2622[n] = arrby;
                            n2 = buffer.method11650(269805094);
                            if (n2 != 0) break block11;
                            break block12;
                        }
                        if (n2 != 1) break block13;
                        break block14;
                    }
                    for (n2 = 0; n2 < n3; ++n2) {
                        arrby[n2] = buffer.method11636(1940633279);
                    }
                    break block13;
                }
                for (n2 = 0; n2 < n5; ++n2) {
                    for (n3 = 0; n3 < n4; ++n3) {
                        arrby[n2 + n3 * n5] = buffer.method11636(2064253144);
                    }
                }
            }
            ++n;
        }
    }

    @ObfuscatedName(value="hd")
    @ObfuscatedSignature(descriptor="(Lax;I)V")
    @Export(value="runScript")
    static final void runScript(Widget widget, int n) {
        n = widget.type;
        if (n != 324) {
            if (n != 325) {
                if (n != 327) {
                    if (n != 328) {
                        return;
                    }
                    widget.field4524 = 150;
                    widget.field4516 = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 0x7FF;
                    widget.field4522 = 5;
                    widget.field4513 = 1;
                    return;
                }
                widget.field4524 = 150;
                widget.field4516 = (int)(Math.sin((double)Client.cycle / 40.0) * 256.0) & 0x7FF;
                widget.field4522 = 5;
                widget.field4513 = 0;
                return;
            }
            if (Client.field4977 == -1) {
                Client.field4977 = widget.field4527;
                Client.field4983 = widget.field4518;
            }
            if (!Client.field4981.field59) {
                widget.field4527 = Client.field4977;
                return;
            }
            widget.field4527 = Client.field4983;
            return;
        }
        if (Client.field4977 == -1) {
            Client.field4977 = widget.field4527;
            Client.field4983 = widget.field4518;
        }
        if (!Client.field4981.field59) {
            widget.field4527 = Client.field4983;
            return;
        }
        widget.field4527 = Client.field4977;
    }
}

