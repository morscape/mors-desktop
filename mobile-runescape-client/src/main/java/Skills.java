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

@ObfuscatedName(value="gy")
@Implements(value="Skills")
public class Skills {
    @ObfuscatedName(value="ae")
    @Export(value="Skills_enabled")
    public static final boolean[] Skills_enabled = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    @ObfuscatedName(value="ku")
    @ObfuscatedSignature(descriptor="Lfp;")
    public static class76 field3152;
    @ObfuscatedName(value="ai")
    @Export(value="Skills_experienceTable")
    public static int[] Skills_experienceTable;
    @ObfuscatedName(value="df")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field3150;
    @ObfuscatedName(value="dh")
    static String field3151;

    static {
        Skills_experienceTable = new int[99];
        int n = 0;
        int n2 = 0;
        while (n < 99) {
            int n3 = n + 1;
            double d = n3;
            Skills.Skills_experienceTable[n] = (n2 += (int)(d + Math.pow(2.0, d / 7.0) * 300.0)) / 4;
            n = n3;
        }
    }

    @ObfuscatedName(value="ay")
    static void method4886(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, byte by) {
        by = (byte)(-n4);
        n4 = n2;
        n2 = n;
        while (true) {
            int n7;
            if (by < 0) {
                n7 = n4 + n3 - 3;
                n = n4;
            } else {
                return;
            }
            while (n < n7) {
                n4 = n + 1;
                int n8 = n2 + 1;
                arrn[n] = arrn2[n2];
                n = n4 + 1;
                n2 = n8 + 1;
                arrn[n4] = arrn2[n8];
                n4 = n + 1;
                n8 = n2 + 1;
                arrn[n] = arrn2[n2];
                n = n4 + 1;
                n2 = n8 + 1;
                arrn[n4] = arrn2[n8];
            }
            while (n < n7 + 3) {
                arrn[n] = arrn2[n2];
                ++n;
                ++n2;
            }
            n4 = n + n5;
            n2 += n6;
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ds")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1069226062")
    static void method4887() {
        if (Client.renderSelf) {
            Messages.method6082(WorldMapScaleHandler.localPlayer, false, (byte)100);
        }
    }

    @ObfuscatedName(value="dw")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1657273075")
    static final void method4888(int n, int n2) {
        if (Client.field4768 == 2) {
            class318.method11250((Client.field4756 * -937216315 - class302.field6082 << 7) + Client.field4767, Client.field4761 * 1299208451 + (Client.field4755 * -1110776449 - class237.field4107 << 7), Client.field4764 * 1577803598, 1026934167);
            if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
                Client.field4740.field3567.vmethod11005().vmethod10761(WorldMapDecoration.field2388[0], n + Client.viewportTempX - 12, Client.viewportTempY + n2 - 28, -1934096222);
            }
            return;
        }
    }
}

