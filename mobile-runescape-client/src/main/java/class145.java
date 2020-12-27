/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="jq")
public class class145 {
    @ObfuscatedName(value="tm")
    @ObfuscatedGetter(intValue=150938451)
    static int field3610;
    @ObfuscatedName(value="ae")
    static String field3601 = ",";
    @ObfuscatedName(value="ah")
    public static String field3602 = ")";
    @ObfuscatedName(value="aj")
    static String field3604 = "<br>";
    @ObfuscatedName(value="al")
    public static String field3606 = "</col>";
    @ObfuscatedName(value="as")
    public static String field3607 = "->";
    @ObfuscatedName(value="ai")
    static String field3603 = "|";
    @ObfuscatedName(value="ak")
    static String field3605 = "true";
    @ObfuscatedName(value="ax")
    public static String field3608 = " (";

    @ObfuscatedName(value="bg")
    static void method6034(byte by) {
        boolean bl;
        block50: {
            block51: {
                block52: {
                    block64: {
                        block65: {
                            block63: {
                                int n;
                                int n2;
                                block53: {
                                    block54: {
                                        block56: {
                                            block57: {
                                                block59: {
                                                    block62: {
                                                        block61: {
                                                            block60: {
                                                                block58: {
                                                                    block55: {
                                                                        n2 = Client.field4763 * -716661975;
                                                                        n = 0;
                                                                        by = 0;
                                                                        bl = true;
                                                                        if (n2 * 826683673 == 0) break block50;
                                                                        if (Client.field4763 == 20) break block51;
                                                                        if (Client.field4763 == 30) break block52;
                                                                        if (Client.field4763 == 40) break block53;
                                                                        if (Client.field4763 == 45) break block54;
                                                                        if (Client.field4763 != 50) break block55;
                                                                        by = (byte)FontName.method6391().length;
                                                                        Client.field4795 = class0.field5.method6384(FontName.method6391(), -33910728);
                                                                        if (Client.field4795.size() >= by) {
                                                                            class58.field2421 = (class399)Client.field4795.get(FontName.FontName_plain11);
                                                                            Client.field4791 = (class399)Client.field4795.get(FontName.FontName_plain12);
                                                                            class265.field4640 = (class399)Client.field4795.get(FontName.FontName_bold12);
                                                                            Client.field4979 = new DesktopPlatformInfoProvider(Client.field4740);
                                                                            class317.field6185 = Client.field4979.vmethod12172(-1354779503);
                                                                            Login.field3176 = Strings.field2786;
                                                                            Login.field3177 = 8;
                                                                            Client.field4763 = 60;
                                                                            return;
                                                                        }
                                                                        break block56;
                                                                    }
                                                                    if (Client.field4763 == 60) break block57;
                                                                    if (Client.field4763 != 70) break block58;
                                                                    if (class326.field6282.method6145((byte)66)) {
                                                                        class289.method10686(class326.field6282, -481846889);
                                                                        class177.method6542(class326.field6282, (byte)-40);
                                                                        HealthBar.method11232(class326.field6282, VertexNormal.field517);
                                                                        WorldMapData_1.method7750(class326.field6282, VertexNormal.field517, Client.isLowDetail);
                                                                        class286.method10490(class326.field6282, VertexNormal.field517);
                                                                        class6.method75(class326.field6282);
                                                                        UserComparator4.method6825(class326.field6282, VertexNormal.field517, Client.field4738, class58.field2421);
                                                                        class7.method121(class326.field6282, Tile.field4675, class285.field5948);
                                                                        TileItemPile.method329(class326.field6282, VertexNormal.field517);
                                                                        class19.method564(class326.field6282);
                                                                        ClientPreferences.method4889(class326.field6282);
                                                                        class105.method5028(Skills.field3150, VertexNormal.field517, class259.field4373, class278.field5886);
                                                                        WorldMapSprite.method1215(class326.field6282);
                                                                        Entity.method12209(class326.field6282);
                                                                        WorldMapElement.method12931(class326.field6282);
                                                                        class302.method11046(class326.field6282);
                                                                        ParamDefinition.field7083 = new class144();
                                                                        Frames.method12203(class326.field6282, class259.field4373, class278.field5886);
                                                                        class69.method4107(class326.field6282, class259.field4373);
                                                                        class300.method10994(class326.field6282, class259.field4373, (byte)0);
                                                                        Login.field3176 = Strings.field2785;
                                                                        Login.field3177 = 12;
                                                                        Client.field4763 = 80;
                                                                        return;
                                                                    }
                                                                    break block59;
                                                                }
                                                                if (Client.field4763 != 80) break block60;
                                                                if (class72.field2524 == null) break block61;
                                                                by = 1;
                                                                break block62;
                                                            }
                                                            if (Client.field4763 == 90) {
                                                                if (class250.field4317.method6145((byte)39)) {
                                                                    Archive archive = class250.field4317;
                                                                    Archive archive2 = class259.field4373;
                                                                    double d = ServerPacket.clientPreferences.field3157;
                                                                    by = !Client.isLowDetail ? (byte)128 : (byte)64;
                                                                    class366.field6810 = new TextureProvider(archive, archive2, 20, d, by);
                                                                    Widget.method7539(class366.field6810);
                                                                    WorldMapDecoration.method3756(ServerPacket.clientPreferences.field3157);
                                                                    Client.field4763 = 100;
                                                                    return;
                                                                }
                                                            } else {
                                                                if (Client.field4763 != 100) {
                                                                    if (Client.field4763 == 120) {
                                                                        if (class61.field2439.method6136("huffman", "", -4683537)) {
                                                                            Entity.method12210(new class173(class61.field2439.method6140("huffman", "", (byte)78)));
                                                                            Login.field3176 = Strings.field2798;
                                                                            Login.field3177 = 0x33333346;
                                                                            Client.field4763 = 130;
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        if (Client.field4763 == 130) {
                                                                            if (Skills.field3150.method6145((byte)60)) {
                                                                                if (class264.field4634.method6145((byte)24)) {
                                                                                    if (class278.field5886.method6145((byte)22)) {
                                                                                        Login.field3176 = Strings.field2808;
                                                                                        Login.field3177 = 0x6666667A;
                                                                                        Client.field4763 = 140;
                                                                                        return;
                                                                                    }
                                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                                    stringBuilder.append(Strings.field2807);
                                                                                    stringBuilder.append(class278.field5886.method11559(-127709427) / 50 + 96);
                                                                                    stringBuilder.append("%");
                                                                                    Login.field3176 = stringBuilder.toString();
                                                                                    Login.field3177 = -858993440;
                                                                                    return;
                                                                                }
                                                                                StringBuilder stringBuilder = new StringBuilder();
                                                                                stringBuilder.append(Strings.field2807);
                                                                                stringBuilder.append(class264.field4634.method11559(-410424706) / 6 + 80);
                                                                                stringBuilder.append("%");
                                                                                Login.field3176 = stringBuilder.toString();
                                                                                Login.field3177 = -858993440;
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            if (Client.field4763 == 140) {
                                                                                Login.field3177 = 20;
                                                                                if (DevicePcmPlayer.field4626.tryLoadGroupByName(class51.field2376.field2380)) {
                                                                                    if (class10.field251 == null) {
                                                                                        class10.field251 = new WorldMap();
                                                                                        class10.field251.method7175(DevicePcmPlayer.field4626, AbstractWorldMapIcon.field2275, SoundSystem.field3244, class265.field4640, Client.field4795, DynamicObject.field7578, 1361934378);
                                                                                    }
                                                                                    Login.field3176 = Strings.field2794;
                                                                                    Client.field4763 = 150;
                                                                                    return;
                                                                                }
                                                                            } else {
                                                                                if (Client.field4763 == 150) {
                                                                                    FloorOverlayDefinition.method13266();
                                                                                    class180.method6606(10, (byte)25);
                                                                                    if (class141.field3579 != null) {
                                                                                        class141.field3579.vmethod12071();
                                                                                        class141.field3579 = null;
                                                                                    }
                                                                                } else {
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            StringBuilder stringBuilder = new StringBuilder();
                                                                            stringBuilder.append(Strings.field2801);
                                                                            stringBuilder.append(DevicePcmPlayer.field4626.method6167(class51.field2376.field2380, (byte)28) / 10);
                                                                            stringBuilder.append("%");
                                                                            Login.field3176 = stringBuilder.toString();
                                                                            return;
                                                                        }
                                                                        StringBuilder stringBuilder = new StringBuilder();
                                                                        stringBuilder.append(Strings.field2807);
                                                                        stringBuilder.append(Skills.field3150.method11559(-2056196718) * 4 / 5);
                                                                        stringBuilder.append("%");
                                                                        Login.field3176 = stringBuilder.toString();
                                                                        Login.field3177 = -858993440;
                                                                        return;
                                                                    }
                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                    stringBuilder.append(Strings.field2800);
                                                                    stringBuilder.append(0);
                                                                    stringBuilder.append("%");
                                                                    Login.field3176 = stringBuilder.toString();
                                                                    Login.field3177 = 0x33333346;
                                                                    return;
                                                                }
                                                                by = (byte)class366.field6810.method7790(2037506846);
                                                                if (by >= 100) {
                                                                    Login.field3176 = Strings.field2796;
                                                                    Login.field3177 = 18;
                                                                    Client.field4763 = 120;
                                                                    return;
                                                                }
                                                                StringBuilder stringBuilder = new StringBuilder();
                                                                stringBuilder.append(Strings.field2797);
                                                                stringBuilder.append(by);
                                                                stringBuilder.append("%");
                                                                Login.field3176 = stringBuilder.toString();
                                                                Login.field3177 = 18;
                                                                return;
                                                            }
                                                            StringBuilder stringBuilder = new StringBuilder();
                                                            stringBuilder.append(Strings.field2797);
                                                            stringBuilder.append("0%");
                                                            Login.field3176 = stringBuilder.toString();
                                                            Login.field3177 = 18;
                                                            return;
                                                        }
                                                        class72.field2524 = class171.method6496(class259.field4373, class275.field5005.field4276, 0);
                                                        by = 0;
                                                    }
                                                    if (WorldMapRegion.field594 == null) {
                                                        WorldMapRegion.field594 = class171.method6496(class259.field4373, class275.field5005.field4271, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (DynamicObject.field7578 == null) {
                                                        DynamicObject.field7578 = Players.method5238(class259.field4373, class275.field5005.field4274, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (class330.field6293 == null) {
                                                        class330.field6293 = Calendar.method6898(class259.field4373, class275.field5005.field4279, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (class16.field306 == null) {
                                                        class16.field306 = Calendar.method6898(class259.field4373, class275.field5005.field4273, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (WorldMapDecoration.field2388 == null) {
                                                        WorldMapDecoration.field2388 = Calendar.method6898(class259.field4373, class275.field5005.field4278, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (GameBuild.field2491 == null) {
                                                        GameBuild.field2491 = Calendar.method6898(class259.field4373, class275.field5005.field4275, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (class287.field5955 == null) {
                                                        class287.field5955 = Calendar.method6898(class259.field4373, class275.field5005.field4277, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (class317.field6184 == null) {
                                                        class317.field6184 = Calendar.method6898(class259.field4373, class275.field5005.field4269, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (class88.field2670 == null) {
                                                        class88.field2670 = Players.method5238(class259.field4373, class275.field5005.field4270, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (class259.field4374 == null) {
                                                        class259.field4374 = Players.method5238(class259.field4373, class275.field5005.field4272, 0);
                                                    } else {
                                                        by = (byte)(by + 1);
                                                    }
                                                    if (by >= 11) {
                                                        class399.field7284 = class259.field4374;
                                                        WorldMapRegion.field594.method13295();
                                                        by = (byte)(Math.random() * 21.0);
                                                        n = (int)(Math.random() * 21.0);
                                                        n2 = (int)(Math.random() * 21.0);
                                                        int n3 = (int)(Math.random() * 41.0) - 20;
                                                        DynamicObject.field7578[0].method13281(n3 + (by - 10), n3 + (n - 10), n3 + (n2 - 10));
                                                        Skills.field3152 = new class76(class265.field4640, class287.field5955, true, class259.field4373);
                                                        Login.field3176 = Strings.field2799;
                                                        Login.field3177 = 14;
                                                        Client.field4763 = 90;
                                                        return;
                                                    }
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append(Strings.field2806);
                                                    stringBuilder.append(by * 100 / 12);
                                                    stringBuilder.append("%");
                                                    Login.field3176 = stringBuilder.toString();
                                                    Login.field3177 = 14;
                                                    return;
                                                }
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append(Strings.field2767);
                                                stringBuilder.append(class326.field6282.method11559(-1709000949));
                                                stringBuilder.append("%");
                                                Login.field3176 = stringBuilder.toString();
                                                Login.field3177 = 12;
                                                return;
                                            }
                                            by = (byte)class130.method5614(class61.field2439, class259.field4373, 176239761);
                                            n = Varcs.method5();
                                            if (by >= n) {
                                                Login.field3176 = Strings.field2771;
                                                Login.field3177 = 10;
                                                if (!WorldMapElement.method12929()) {
                                                    return;
                                                }
                                                class180.method6606(5, (byte)25);
                                                Client.field4763 = 70;
                                                class270.method7736();
                                                return;
                                            }
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append(Strings.field2768);
                                            stringBuilder.append(by * 100 / n);
                                            stringBuilder.append("%");
                                            Login.field3176 = stringBuilder.toString();
                                            Login.field3177 = 10;
                                            return;
                                        }
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(Strings.field2784);
                                        stringBuilder.append(Client.field4795.size() * 100 / by);
                                        stringBuilder.append("%");
                                        Login.field3176 = stringBuilder.toString();
                                        Login.field3177 = 8;
                                        return;
                                    }
                                    class173.method6514(22050, Client.isLowDetail ^ true, 2);
                                    AbstractWorldMapData.field2346 = new MidiPcmStream();
                                    AbstractWorldMapData.field2346.method13678(9, 128);
                                    Language.method11568(class293.field5999, class298.field6040, class100.field2763, AbstractWorldMapData.field2346);
                                    class28.field494 = SequenceDefinition.method13156(class248.field4306, 0, 2048, (byte)27);
                                    WorldMapElement.field6923 = new PcmStreamMixer();
                                    PcmStreamMixer pcmStreamMixer = new PcmStreamMixer();
                                    pcmStreamMixer.addSubStream(AbstractWorldMapData.field2346);
                                    pcmStreamMixer.addSubStream(WorldMapElement.field6923);
                                    class28.field494.setStream(pcmStreamMixer);
                                    class34.field547 = new class111(22050, PcmPlayer.field3250);
                                    Login.field3176 = Strings.field2790;
                                    Login.field3177 = 7;
                                    Client.field4763 = 50;
                                    class0.field5 = new class165(class259.field4373, class278.field5886);
                                    return;
                                }
                                n2 = Tile.field4675.method11536((short)11545) * 4 / 100;
                                int n4 = class285.field5948.method11536((short)28361) * 4 / 100;
                                int n5 = class326.field6282.method11536((short)22602) * 2 / 100;
                                int n6 = Skills.field3150.method11536((short)3954) * 2 / 100;
                                int n7 = class100.field2763.method11536((short)21578) * 6 / 100;
                                int n8 = Tiles.field3472.method11536((short)14668) * 4 / 100;
                                int n9 = SoundCache.field3312.method11536((short)21130) * 2 / 100;
                                int n10 = VertexNormal.field517.method11536((short)24613) * 56 / 100;
                                int n11 = class259.field4373.method11536((short)28925) * 2 / 100;
                                int n12 = class250.field4317.method11536((short)5914) * 2 / 100;
                                int n13 = class61.field2439.method11536((short)26692) * 2 / 100;
                                int n14 = class126.field3437.method11536((short)29511) * 2 / 100;
                                int n15 = class264.field4634.method11536((short)19265) * 2 / 100;
                                int n16 = class278.field5886.method11536((short)10477) * 2 / 100;
                                int n17 = class298.field6040.method11536((short)24120) * 2 / 100;
                                int n18 = class293.field5999.method11536((short)4490) * 2 / 100;
                                int n19 = DevicePcmPlayer.field4626.method11536((short)17790) / 100;
                                int n20 = AbstractWorldMapIcon.field2275.method11536((short)6708) / 100;
                                int n21 = SoundSystem.field3244.method11536((short)17444) / 100;
                                by = (byte)n;
                                if (Client.field4777.method11538()) {
                                    by = (byte)n;
                                    if (Client.field4777.method6145((byte)19)) {
                                        by = 1;
                                    }
                                }
                                if ((by = (byte)(by + n2 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20 + n21 + 0)) == 100) break block63;
                                if (by == 0) break block64;
                                break block65;
                            }
                            Projectile.method14467(Tile.field4675, "Animations");
                            Projectile.method14467(class285.field5948, "Skeletons");
                            Projectile.method14467(class100.field2763, "Sound FX");
                            Projectile.method14467(Tiles.field3472, "Maps");
                            Projectile.method14467(SoundCache.field3312, "Music Tracks");
                            Projectile.method14467(VertexNormal.field517, "Models");
                            Projectile.method14467(class259.field4373, "Sprites");
                            Projectile.method14467(class126.field3437, "Music Jingles");
                            Projectile.method14467(class298.field6040, "Music Samples");
                            Projectile.method14467(class293.field5999, "Music Patches");
                            Projectile.method14467(DevicePcmPlayer.field4626, "World Map");
                            Projectile.method14467(AbstractWorldMapIcon.field2275, "World Map Geography");
                            Projectile.method14467(SoundSystem.field3244, "World Map Ground");
                            class275.field5005 = new class244();
                            class275.field5005.method7357(Client.field4777, -38056955);
                            Login.field3176 = Strings.field2779;
                            Login.field3177 = 6;
                            Client.field4763 = 45;
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(Strings.field2780);
                        stringBuilder.append(by);
                        stringBuilder.append("%");
                        Login.field3176 = stringBuilder.toString();
                    }
                    Login.field3177 = 6;
                    return;
                }
                bl = BZip2State.field3660.method12010();
                Tile.field4675 = class233.newArchive(0, false, true, bl);
                class285.field5948 = class233.newArchive(1, false, true, bl);
                class326.field6282 = class233.newArchive(2, true, false, bl);
                Skills.field3150 = class233.newArchive(3, false, true, bl);
                class100.field2763 = class233.newArchive(4, false, true, bl);
                Tiles.field3472 = class233.newArchive(5, true, true, bl);
                SoundCache.field3312 = class233.newArchive(6, true, true, bl);
                VertexNormal.field517 = class233.newArchive(7, false, true, bl);
                class259.field4373 = class233.newArchive(8, false, true, bl);
                class250.field4317 = class233.newArchive(9, false, true, bl);
                class61.field2439 = class233.newArchive(10, false, true, bl);
                class126.field3437 = class233.newArchive(11, false, true, bl);
                class264.field4634 = class233.newArchive(12, false, true, bl);
                class278.field5886 = class233.newArchive(13, true, false, bl);
                class298.field6040 = class233.newArchive(14, false, true, bl);
                class293.field5999 = class233.newArchive(15, false, true, bl);
                Client.field4777 = class233.newArchive(17, true, true, bl);
                AbstractWorldMapIcon.field2275 = class233.newArchive(18, false, true, bl);
                DevicePcmPlayer.field4626 = class233.newArchive(19, false, true, bl);
                SoundSystem.field3244 = class233.newArchive(20, false, true, bl);
                Login.field3176 = Strings.field2782;
                Login.field3177 = 4;
                Client.field4763 = 40;
                return;
            }
            Login.field3176 = Strings.field2787;
            Login.field3177 = 2;
            Client.field4763 = 30;
            return;
        }
        Client client = Client.field4740;
        if (Client.gameBuild != 2) {
            bl = false;
        }
        client.method5760(bl);
        class64.field2460 = new Scene(4, 104, 104, Tiles.Tiles_heights);
        while (true) {
            if (by >= 4) {
                class12.field274 = new class384(512, 512);
                AbstractWorldMapData.field2347 = new class292(class12.field274.field7129, 512, 512);
                Login.field3176 = Strings.field2789;
                Login.field3177 = 1;
                Client.field4763 = 20;
                return;
            }
            Client.field4802[by] = new CollisionMap(104, 104);
            by = (byte)(by + 1);
        }
    }
}

