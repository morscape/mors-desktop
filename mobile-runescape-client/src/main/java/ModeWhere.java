/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lo")
@Implements(value="ModeWhere")
public class ModeWhere
implements class176 {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6358;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6360;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6361;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6362;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6364;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6366;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6367;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6369;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6370;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6363;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6365;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6371;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Llo;")
    static final ModeWhere field6359;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=-845926335)
    final int field6373;
    @ObfuscatedName(value="ay")
    final Set field6374 = new HashSet();

    static {
        field6365 = new ModeWhere("", 0, new class164[]{class164.field3755});
        field6360 = new ModeWhere("", 1, new class164[]{class164.field3754, class164.field3755});
        field6363 = new ModeWhere("", 2, new class164[]{class164.field3754, class164.field3756, class164.field3755});
        field6371 = new ModeWhere("", 3, new class164[]{class164.field3754});
        field6362 = new ModeWhere("", 4);
        field6370 = new ModeWhere("", 5, new class164[]{class164.field3754, class164.field3755});
        field6364 = new ModeWhere("", 6, new class164[]{class164.field3755});
        field6366 = new ModeWhere("", 8, new class164[]{class164.field3754, class164.field3755});
        field6358 = new ModeWhere("", 9, new class164[]{class164.field3754, class164.field3756});
        field6359 = new ModeWhere("", 10, new class164[]{class164.field3754});
        field6361 = new ModeWhere("", 11, new class164[]{class164.field3754});
        field6369 = new ModeWhere("", 12, new class164[]{class164.field3754, class164.field3755});
        field6367 = new ModeWhere("", 13, new class164[]{class164.field3754});
        ModeWhere.method11610();
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I[Llb;)V")
    ModeWhere(String object, int n, class164[] arrclass164) {
        this.field6373 = n;
        n = 0;
        while (n < arrclass164.length) {
            object = arrclass164[n];
            this.field6374.add(object);
            ++n;
        }
        return;
    }

    ModeWhere(String string2, int n) {
        this.field6373 = n;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6373 * -1115693119);
        return by * -845926335;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[Llo;", garbageValue="1889839304")
    static ModeWhere[] method11610() {
        ModeWhere modeWhere = field6362;
        ModeWhere modeWhere2 = field6361;
        ModeWhere modeWhere3 = field6359;
        ModeWhere modeWhere4 = field6364;
        ModeWhere modeWhere5 = field6366;
        ModeWhere modeWhere6 = field6365;
        ModeWhere modeWhere7 = field6363;
        ModeWhere modeWhere8 = field6369;
        ModeWhere modeWhere9 = field6370;
        ModeWhere modeWhere10 = field6358;
        ModeWhere modeWhere11 = field6371;
        ModeWhere modeWhere12 = field6367;
        ModeWhere modeWhere13 = field6360;
        return new ModeWhere[]{modeWhere, modeWhere2, modeWhere3, modeWhere4, modeWhere5, modeWhere6, modeWhere7, modeWhere8, modeWhere9, modeWhere10, modeWhere11, modeWhere12, modeWhere13};
    }

    @ObfuscatedName(value="ff")
    public static final void method11617(int n, int n2, int n3, int n4, int n5) {
        n5 = 0;
        while (true) {
            if (n5 < Client.field4918 * -763111739) {
                if (Client.field4925[n5] + Client.field4915[n5] > n && Client.field4925[n5] < n + n3 && Client.field4934[n5] + Client.field4928[n5] > n2 && Client.field4934[n5] < n4 + n2) {
                    Client.field4927[n5] = true;
                }
            } else {
                return;
            }
            ++n5;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ILjava/util/Hashtable;I)V", garbageValue="384162303")
    static void method11613(int n, Hashtable hashtable) {
        if (n != 0) {
            return;
        }
        hashtable.put("err_missing_config", "Missing com.jagex.config setting");
        hashtable.put("err_invalid_config", "Invalid com.jagex.config setting");
        hashtable.put("loading_config", "Loading configuration");
        hashtable.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
        hashtable.put("err_decode_config", "Error decoding configuration");
        hashtable.put("loaderbox_initial", "Loading...");
        hashtable.put("error", "Error");
        hashtable.put("quit", "Quit");
        hashtable.put("alreadyopen", "Please close your existing game before loading another one");
    }

    @ObfuscatedName(value="bu")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)V", garbageValue="-1836738559")
    @Export(value="findItemDefinitions")
    static void findItemDefinitions(String string2, boolean bl) {
        Object object = Client.field4740.method5708().vmethod12647();
        if (object == null) {
            class119.field3363.sort(string2, bl);
        } else {
            if (Login.loginIndex != 20) {
                Login.loginIndex = 20;
                ((class18)object).vmethod10076();
            }
            if ((object = ((class18)object).vmethod10069()) == null) {
                return;
            }
            if (((class9)object).method161()) {
                class119.field3363.method5308(string2);
            } else {
                class119.field3363.sort(string2, bl);
            }
        }
        Login.loginIndex = 2;
        class297.method10926(false);
        class180.method6606(20, (byte)25);
    }

    @ObfuscatedName(value="df")
    static final void method11616(int n, int n2, int n3, int n4, int n5) {
        long l = System.nanoTime();
        ++Client.field4844;
        class135.method5657();
        Skills.method4887();
        class311.method11156();
        class260.method7500(true, 2131165226);
        class366.method12780((short)-9319);
        class260.method7500(false, 2131165226);
        HorizontalAlignment.method10449(450625232);
        class95.method4852();
        class79.method4567(n, n2, n3, n4, true, (byte)0);
        n5 = Client.field4966;
        int n6 = Client.field4971;
        int n7 = Client.field4980;
        n4 = Client.field4982;
        Object object = Client.field4740.field3567.vmethod11005();
        int n8 = n7 + n5;
        int n9 = n4 + n6;
        ((class72)object).method4238(n5, n6, n8, n9, -448408016);
        object = Client.field4740.method5706();
        Rasterizer3D rasterizer3D = ((class19)object).vmethod7594();
        rasterizer3D.vmethod7646();
        rasterizer3D.method656(n5, n6, n8, n9, 65280);
        rasterizer3D.method654();
        if (!Client.field4958) {
            n2 = Frames.method12205(class123.field3410, 114322510);
            n = n2;
            if (Client.field4837 / 256 > n2) {
                n = Client.field4837 / 256;
            }
            n2 = n;
            if (Client.field4972[4]) {
                n2 = n;
                if (Client.field4976[4] + 128 > n) {
                    n2 = Client.field4976[4] + 128;
                }
            }
            n = ItemContainer.method12845(class123.field3410, (short)202);
            class33.method943(ObjectDefinition.field6874, ObjectDefinition.field6873, ParamDefinition.field7082, n2, n & 0x7FF, WorldMapLabelSize.method3706(n2), n4, (byte)-38);
        }
        n = !Client.field4958 ? class119.method5295(-1809185612) : class300.method10995(-1904380318);
        int n10 = class203.field3944 * -1001428365;
        int n11 = class260.field4459 * 683466001;
        int n12 = class95.field2738 * 2054016987;
        int n13 = PcmPlayer.field3256 * -1252132561;
        int n14 = class291.field5991 * -1791431807;
        n2 = 0;
        while (true) {
            if (n2 >= 5) {
                boolean bl = Varps.method68();
                n3 = -1;
                if (!bl) {
                    n2 = -1;
                } else {
                    n3 = class294.field6004.field6201;
                    n2 = class294.field6004.field6202;
                }
                bl = n3 >= n5 && n3 < n8 && n2 >= n6 && n2 < n9;
                class317.method11247(n3 - n5, n2 - n6, bl);
                ((class19)object).open(Client.cycle);
                Projectile.method14468();
                Projectile.method14468();
                n2 = rasterizer3D.method657(-978944002);
                rasterizer3D.vmethod7616(Client.field4987);
                if (Client.field4989) {
                    class64.field2460.drawTileOverlay((class19)object, class203.field3944, class260.field4459, class95.field2738, PcmPlayer.field3256, class291.field5991, n);
                }
                rasterizer3D.method655(n2);
                Projectile.method14468();
                class64.field2460.clearTempGameObjects();
                class126.method5528(n5, n6, n7, n4, 2049496270);
                Skills.method4888(n5, n6);
                ((TextureProvider)Rasterizer3D.field339).method7818(Client.field4804 * 375836608, -1664180338);
                class292.method10730();
                class203.field3944 = n10 * -538424645;
                class260.field4459 = n11 * 1368503281;
                class95.field2738 = n12 * 1159828563;
                PcmPlayer.field3256 = n13 * 287174095;
                class291.field5991 = n14 * 1116427393;
                if (Client.field4753 && class18.method347(true, false, -1395613897) == 0) {
                    Client.field4753 = false;
                }
                if (Client.field4753) {
                    Client.field4740.field3567.vmethod11005().vmethod10762(n5, n6, n7, n4, 0, (byte)-19);
                    class122.method5420(Strings.field2781, false, -653756560);
                }
                Client.field4994.method6843(System.nanoTime() - l);
                return;
            }
            if (Client.field4972[n2]) {
                n3 = (int)(Math.random() * (double)(Client.field4962[n2] * 2 + 1) - (double)Client.field4962[n2] + Math.sin((double)Client.field4973[n2] / 100.0 * (double)Client.field4965[n2]) * (double)Client.field4976[n2]);
                if (n2 == 0) {
                    class203.field3944 = n3 + class203.field3944;
                }
                if (n2 == 1) {
                    class260.field4459 = n3 + class260.field4459;
                }
                if (n2 == 2) {
                    class95.field2738 = n3 + class95.field2738;
                }
                if (n2 == 3) {
                    class291.field5991 = n3 + class291.field5991 & 0x7FF;
                }
                if (n2 == 4) {
                    if ((PcmPlayer.field3256 = n3 + PcmPlayer.field3256) < 128) {
                        PcmPlayer.field3256 = 128;
                    }
                    if (PcmPlayer.field3256 > 383) {
                        PcmPlayer.field3256 = 383;
                    }
                }
            }
            ++n2;
        }
    }
}

