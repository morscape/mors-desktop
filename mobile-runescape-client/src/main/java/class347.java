/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mv")
public class class347
implements class198 {
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Llx;")
    @Export(value="midiPcmStream")
    static MidiPcmStream midiPcmStream;

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1720878827")
    public void vmethod12071() {
        class18 class182 = Client.field4740.method5708().vmethod12647();
        if (class182 != null) {
            class182.vmethod10037("npR101");
            class182.vmethod10038("npR101");
        }
    }

    @ObfuscatedName(value="al")
    static final boolean method12062(byte[] object, int n, int n2, int n3) {
        object = new Buffer((byte[])object);
        n3 = -1;
        boolean bl = true;
        int n4;
        while ((n4 = ((Buffer)object).method11658(1742749481)) != 0) {
            int n5 = n3 + n4;
            n3 = 0;
            n4 = 0;
            while (true) {
                if (n3 == 0) {
                    int n6 = ((Buffer)object).method11665(197085345);
                    if (n6 == 0) break;
                    n6 = n4 + (n6 - 1);
                    int n7 = ((Buffer)object).method11650(-1274875598);
                    int n8 = (n6 >> 6 & 0x3F) + n;
                    int n9 = (n6 & 0x3F) + n2;
                    n4 = n6;
                    if (n8 <= 0) continue;
                    n4 = n6;
                    if (n9 <= 0) continue;
                    n4 = n6;
                    if (n8 >= 103) continue;
                    n4 = n6;
                    if (n9 >= 103) continue;
                    ObjectDefinition objectDefinition = AbstractWorldMapIcon.getObjectDefinition(n5);
                    if (n7 >> 2 != 22 || !Client.isLowDetail || objectDefinition.field6887 != 0 || objectDefinition.field6883 == 1 || objectDefinition.field6897) {
                        if (!objectDefinition.method12884(-221514355)) {
                            ++Client.field4794;
                            bl = false;
                        }
                        n3 = 1;
                        n4 = n6;
                        continue;
                    }
                    n4 = n6;
                    continue;
                }
                if (((Buffer)object).method11665(670456667) == 0) break;
                ((Buffer)object).method11650(718106208);
            }
            n3 = n5;
        }
        return bl;
    }

    @ObfuscatedName(value="an")
    static final int method12063(int n, int n2, int n3) {
        n3 = class11.method285(n + 45365, n2 + 91923, 4, 2082424041);
        int n4 = class11.method285(n + 10294, n2 + 37821, 2, 730127759);
        if ((n2 = (int)((double)((n4 - 128 >> 1) + (n3 - 128) + ((n = class11.method285(n, n2, 1, 960826780)) - 128 >> 2)) * 0.3) + 35) < 10) {
            return 10;
        }
        n = n2;
        if (n2 > 60) {
            n = 60;
        }
        return n;
    }
}

