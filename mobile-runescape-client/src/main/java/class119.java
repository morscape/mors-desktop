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

@ObfuscatedName(value="ib")
public class class119 {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3348;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3350;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3351;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lib;")
    public static final class119 field3352;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lib;")
    public static final class119 field3354;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3356;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3357;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3358;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3359;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3360;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lib;")
    public static final class119 field3362;
    @ObfuscatedName(value="eg")
    @ObfuscatedSignature(descriptor="Lic;")
    public static class120 field3363;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lib;")
    public static final class119 field3353;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lib;")
    public static final class119 field3355;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lib;")
    public static final class119 field3361;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lib;")
    static final class119 field3349;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1162726765)
    final int field3365;

    static {
        field3355 = new class119(3);
        field3350 = new class119(4);
        field3353 = new class119(10);
        field3361 = new class119(13);
        field3352 = new class119(1);
        field3360 = new class119(6);
        field3354 = new class119(2);
        field3356 = new class119(14);
        field3348 = new class119(11);
        field3349 = new class119(5);
        field3351 = new class119(7);
        field3359 = new class119(0);
        field3357 = new class119(12);
        field3358 = new class119(8);
        field3362 = new class119(9);
    }

    class119(int n) {
        this.field3365 = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="dz")
    static final int method5295(int n) {
        if (ServerPacket.clientPreferences.field3161) {
            return WorldMapIcon_1.field5913 * 63889799;
        }
        int n2 = n = 3;
        if (PcmPlayer.field3256 < 310) {
            int n3;
            int n4;
            if (Client.field4807 == 1) {
                n4 = ObjectDefinition.field6874 >> 7;
                n3 = ParamDefinition.field7082 >> 7;
            } else {
                n4 = WorldMapScaleHandler.localPlayer.x >> 7;
                n3 = WorldMapScaleHandler.localPlayer.field7523 * -144332757 >> 7;
            }
            int n5 = class203.field3944 >> 7;
            int n6 = class95.field2738 >> 7;
            if (n5 < 0 || n6 < 0 || n5 >= 104 || n6 >= 104) return WorldMapIcon_1.field5913 * 63889799;
            if (n4 < 0 || n3 < 0 || n4 >= 104 || n3 >= 104) return WorldMapIcon_1.field5913 * 63889799;
            if ((Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][n5][n6] & 4) != 0) {
                n = WorldMapIcon_1.field5913 * 63889799;
            }
            int n7 = n4 > n5 ? n4 - n5 : n5 - n4;
            int n8 = n3 > n6 ? n3 - n6 : n6 - n3;
            int n9 = 32768;
            if (n7 <= n8) {
                n2 = n;
                if (n8 > 0) {
                    int n10 = n7 * 65536 / n8;
                    n7 = n6;
                    n6 = n9;
                    while (true) {
                        n2 = n;
                        if (n7 != n3) {
                            if (n7 < n3) {
                                n2 = n7 + 1;
                            } else {
                                n2 = n7;
                                if (n7 > n3) {
                                    n2 = n7 - 1;
                                }
                            }
                            n8 = n;
                            if ((Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][n5][n2] & 4) != 0) {
                                n8 = WorldMapIcon_1.field5913 * 63889799;
                            }
                            n9 = n6 + n10;
                            n7 = n2;
                            n6 = n9;
                            n = n8;
                            if (n9 < 65536) continue;
                            int n11 = n9 - 65536;
                            if (n5 < n4) {
                                n9 = n5 + 1;
                            } else {
                                n9 = n5;
                                if (n5 > n4) {
                                    n9 = n5 - 1;
                                }
                            }
                            n5 = n9;
                            n7 = n2;
                            n6 = n11;
                            n = n8;
                            if ((Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][n9][n2] & 4) == 0) continue;
                            n = WorldMapIcon_1.field5913 * 63889799;
                            n5 = n9;
                            n7 = n2;
                            n6 = n11;
                            continue;
                        }
                        break;
                    }
                }
            } else {
                int n12 = n8 * 65536 / n7;
                n7 = n5;
                n5 = n6;
                n6 = n9;
                while (true) {
                    n2 = n;
                    if (n4 == n7) break;
                    if (n7 < n4) {
                        n2 = n7 + 1;
                    } else {
                        n2 = n7;
                        if (n7 > n4) {
                            n2 = n7 - 1;
                        }
                    }
                    n8 = n;
                    if ((Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][n2][n5] & 4) != 0) {
                        n8 = WorldMapIcon_1.field5913 * 63889799;
                    }
                    n9 = n6 + n12;
                    n7 = n2;
                    n6 = n9;
                    n = n8;
                    if (n9 < 65536) continue;
                    int n13 = n9 - 65536;
                    if (n5 < n3) {
                        n9 = n5 + 1;
                    } else {
                        n9 = n5;
                        if (n5 > n3) {
                            n9 = n5 - 1;
                        }
                    }
                    n7 = n2;
                    n5 = n9;
                    n6 = n13;
                    n = n8;
                    if ((Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][n2][n9] & 4) == 0) continue;
                    n = WorldMapIcon_1.field5913 * 63889799;
                    n7 = n2;
                    n5 = n9;
                    n6 = n13;
                }
            }
        }
        if (WorldMapScaleHandler.localPlayer.x >= 0 && WorldMapScaleHandler.localPlayer.field7523 * -144332757 >= 0 && WorldMapScaleHandler.localPlayer.x < 13312 && WorldMapScaleHandler.localPlayer.field7523 * -144332757 < 13312) {
            if ((Tiles.field3455[WorldMapIcon_1.field5913 * 63889799][WorldMapScaleHandler.localPlayer.x >> 7][WorldMapScaleHandler.localPlayer.field7523 * -144332757 >> 7] & 4) == 0) return n2;
            return WorldMapIcon_1.field5913 * 63889799;
        }
        n = WorldMapIcon_1.field5913;
        return n * 63889799;
    }
}

