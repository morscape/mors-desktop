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

@ObfuscatedName(value="ft")
public class class79 {
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="[[Lax;")
    @Export(value="Widget_interfaceComponents")
    public static Widget[][] Widget_interfaceComponents;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-952413477)
    int field2602;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=734771277)
    int field2603;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(longValue=-706584200211290845L)
    long field2606;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=549736697)
    int field2604;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfi;")
    class71 field2605;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=527303683)
    int field2607;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lfc;B)V", garbageValue="82")
    final void method4572(class66 class662) {
        switch (this.field2605.field2518) {
            default: {
                throw new IllegalStateException();
            }
            case 9: {
                class662.vmethod11251(this.field2602, this.field2604, this.field2607, this.field2603, this.field2606);
                return;
            }
            case 8: {
                class662.vmethod11256(this.field2602, this.field2607, this.field2603, this.field2606);
                return;
            }
            case 7: {
                class662.vmethod11252(this.field2602, this.field2604, this.field2607, this.field2603, this.field2606);
                return;
            }
            case 6: {
                class662.vmethod11263(this.field2607, this.field2603, this.field2606);
                return;
            }
            case 5: {
                class662.vmethod11262((char)this.field2602, this.field2606);
                return;
            }
            case 4: {
                class662.vmethod11275(this.field2602, this.field2606);
                return;
            }
            case 3: {
                class662.vmethod11260(this.field2602, this.field2606);
                return;
            }
            case 2: {
                class662.vmethod11264(this.field2602, this.field2606);
                return;
            }
            case 1: {
                class662.vmethod11269(this.field2602, this.field2606);
                return;
            }
            case 0: 
        }
        class662.vmethod11267(this.field2607, this.field2603, this.field2606);
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="-909947791")
    static final int method4566(int n, int n2, int n3, int n4) {
        return n * n3 + n4 * n2 >> 16;
    }

    @ObfuscatedName(value="dk")
    static final void method4567(int n, int n2, int n3, int n4, boolean bl, byte by) {
        int n5;
        byte by2;
        int n6;
        int n7;
        block12: {
            block13: {
                class72 class722;
                block10: {
                    block11: {
                        class722 = Client.field4740.field3567.vmethod11005();
                        by = (byte)n3;
                        if (n3 < 1) {
                            by = 1;
                        }
                        n3 = n4;
                        if (n4 < 1) {
                            n3 = 1;
                        }
                        if ((n4 = n3 - 334) >= 0) {
                            if (n4 < 100) {
                                n4 = n4 * (Client.field4974 - Client.field4963) / 100;
                                n4 += Client.field4963;
                            } else {
                                n4 = Client.field4974;
                            }
                        } else {
                            n4 = Client.field4963;
                        }
                        n7 = n4 * n3 * 512 / (by * 334);
                        if (n7 < Client.field4967) break block10;
                        if (n7 > Client.field4968) break block11;
                        n7 = n;
                        n6 = n2;
                        by2 = by;
                        n5 = n3;
                        break block12;
                    }
                    int n8 = by * Client.field4968 * 334;
                    int n9 = n8 / (n3 * 512);
                    n4 = n9;
                    n7 = n;
                    n6 = n2;
                    by2 = by;
                    n5 = n3;
                    if (n9 >= Client.field4970) break block12;
                    n4 = Client.field4970;
                    n7 = (n3 - n8 / (n4 * 512)) / 2;
                    class722.method4252();
                    class722.vmethod10762(n, n2, by, n7, 0, (byte)38);
                    class722.vmethod10762(n, n3 + n2 - n7, by, n7, 0, (byte)29);
                    n2 = n7 + n2;
                    n3 -= n7 * 2;
                    break block13;
                }
                short s = Client.field4967;
                int n10 = by * s * 334 / (n3 * 512);
                n4 = n10;
                n7 = n;
                n6 = n2;
                by2 = by;
                n5 = n3;
                if (n10 <= Client.field4969) break block12;
                n4 = Client.field4969;
                n7 = (by - n4 * n3 * 512 / (s * 334)) / 2;
                class722.method4252();
                class722.vmethod10762(n, n2, n7, n3, 0, (byte)-48);
                class722.vmethod10762(by + n - n7, n2, n7, n3, 0, (byte)11);
                n += n7;
                by = (byte)(by - n7 * 2);
            }
            n7 = n;
            n6 = n2;
            by2 = by;
            n5 = n3;
        }
        Client.field4987 = n4 * n5 / 334;
        if (by2 != Client.field4980 || n5 != Client.field4982) {
            class122.method5418(by2, n5, -314607988);
        }
        Client.field4966 = n7;
        Client.field4971 = n6;
        Client.field4980 = by2;
        Client.field4982 = n5;
    }
}

