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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dg")
@Implements(value="WorldMapElement")
public class WorldMapElement
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="[Ldg;")
    @Export(value="WorldMapElement_cached")
    static WorldMapElement[] WorldMapElement_cached;
    @ObfuscatedName(value="pu")
    @ObfuscatedSignature(descriptor="Lhd;")
    static PcmStreamMixer field6923;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=2110717203)
    public static int field6920;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="WorldMapElement_archive")
    static AbstractArchive WorldMapElement_archive;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="WorldMapElement_cachedSprites")
    static EvictingDualNodeHashTable WorldMapElement_cachedSprites;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1744854539)
    public int field6924;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=458334189)
    public int field6926 = -1;
    @ObfuscatedName(value="ag")
    byte[] field6928;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=42316931)
    @Export(value="objectId")
    public final int objectId;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-65443163)
    int field6930 = -1;
    @ObfuscatedName(value="al")
    public String field6931;
    @ObfuscatedName(value="am")
    public boolean field6932 = false;
    @ObfuscatedName(value="an")
    @Export(value="menuActions")
    public String[] menuActions = new String[5];
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-132499605)
    int field6934;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-13202309)
    int field6935;
    @ObfuscatedName(value="aq")
    public boolean field6936 = true;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1384573605)
    int field6937 = Integer.MAX_VALUE;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1851744457)
    public int field6938 = -1;
    @ObfuscatedName(value="aw")
    int[] field6941;
    @ObfuscatedName(value="ay")
    public String field6942;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1025619075)
    int field6943;
    @ObfuscatedName(value="ad")
    int[] field6927;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Ldl;")
    @Export(value="horizontalAlignment")
    public HorizontalAlignment horizontalAlignment;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Ldm;")
    @Export(value="verticalAlignment")
    public VerticalAlignment verticalAlignment;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=54798065)
    public int field6925 = 0;

    static {
        WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256, null);
    }

    WorldMapElement(int n) {
        this.field6935 = Integer.MAX_VALUE;
        this.field6934 = Integer.MIN_VALUE;
        this.field6943 = Integer.MIN_VALUE;
        this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
        this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
        this.objectId = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    void method12945(int n) {
        if (this.field6941 == null) return;
        n = 0;
        while (n < this.field6941.length) {
            if (this.field6941[n] < this.field6937) {
                this.field6937 = this.field6941[n];
            } else if (this.field6941[n] > this.field6934) {
                this.field6934 = this.field6941[n];
            }
            int[] arrn = this.field6941;
            int n2 = n + 1;
            if (arrn[n2] < this.field6935) {
                this.field6935 = this.field6941[n2];
            } else if (this.field6941[n2] > this.field6943) {
                this.field6943 = this.field6941[n2];
            }
            n += 2;
        }
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(II)Lek;", garbageValue="-657909717")
    @Export(value="getSprite")
    class384 getSprite(int n) {
        if (n < 0) {
            return null;
        }
        Object object = WorldMapElement_cachedSprites;
        long l = n;
        if ((object = (class384)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = class171.method6496(WorldMapElement_archive, n, 0);
        if (object != null) {
            WorldMapElement_cachedSprites.put((DualNode)object, l);
        }
        return object;
    }

    @ObfuscatedName(value="al")
    @Export(value="readBits")
    public int readBits(int n) {
        n = this.objectId * -1783154133;
        return n * 42316931;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(ZB)Lek;")
    public class384 method12952(boolean bl, byte by) {
        by = (byte)1851744457;
        int n = this.field6938 * 1328200057;
        class384 class3842 = this.getSprite(n * by);
        return class3842;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    void method12946(Buffer buffer, int n) {
        while ((n = buffer.method11650(-697990886)) != 0) {
            this.method12957(buffer, n, -1640565383);
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;II)V")
    void method12957(Buffer buffer, int n, int n2) {
        block14: {
            block15: {
                block16: {
                    block17: {
                        block18: {
                            block19: {
                                block34: {
                                    block13: {
                                        block20: {
                                            block21: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            block25: {
                                                                block26: {
                                                                    block27: {
                                                                        block28: {
                                                                            block29: {
                                                                                block30: {
                                                                                    block31: {
                                                                                        block32: {
                                                                                            block33: {
                                                                                                if (n == 1) break block14;
                                                                                                if (n == 2) break block15;
                                                                                                if (n == 3) break block16;
                                                                                                if (n == 4) break block17;
                                                                                                if (n == 5) break block18;
                                                                                                if (n == 6) break block19;
                                                                                                n2 = 0;
                                                                                                if (n == 7) break block20;
                                                                                                if (n == 8) break block21;
                                                                                                if (n >= 10 && n <= 14) break block22;
                                                                                                if (n == 15) break block23;
                                                                                                if (n == 16) {
                                                                                                    return;
                                                                                                }
                                                                                                if (n == 17) break block24;
                                                                                                if (n == 18) break block25;
                                                                                                if (n == 19) break block26;
                                                                                                if (n == 21) break block27;
                                                                                                if (n == 22) break block28;
                                                                                                if (n == 23) break block29;
                                                                                                if (n == 24) break block30;
                                                                                                if (n == 25) break block31;
                                                                                                if (n == 28) break block32;
                                                                                                if (n == 29) break block33;
                                                                                                if (n == 30) {
                                                                                                    this.verticalAlignment = (VerticalAlignment)class90.method4803(Client.method7890(), buffer.method11650(1014339043), 2137123521);
                                                                                                    return;
                                                                                                }
                                                                                                break block13;
                                                                                            }
                                                                                            this.horizontalAlignment = (HorizontalAlignment)class90.method4803(class95.method4848(), buffer.method11650(1455312936), 2142306214);
                                                                                            return;
                                                                                        }
                                                                                        buffer.method11650(-1472010890);
                                                                                        return;
                                                                                    }
                                                                                    buffer.method11680((byte)36);
                                                                                    return;
                                                                                }
                                                                                buffer.method11635(1277637855);
                                                                                buffer.method11635(1277637855);
                                                                                return;
                                                                            }
                                                                            buffer.method11650(-1943309753);
                                                                            buffer.method11650(820024961);
                                                                            buffer.method11650(596280231);
                                                                            return;
                                                                        }
                                                                        buffer.method11670(1604085085);
                                                                        return;
                                                                    }
                                                                    buffer.method11670(1604085085);
                                                                    return;
                                                                }
                                                                this.field6926 = buffer.method11637(-1341512476);
                                                                return;
                                                            }
                                                            buffer.method11680((byte)-27);
                                                            return;
                                                        }
                                                        this.field6942 = buffer.method11664(-2123052005);
                                                        return;
                                                    }
                                                    int n3 = buffer.method11650(-1615381322);
                                                    int n4 = n3 * 2;
                                                    this.field6941 = new int[n4];
                                                    n = 0;
                                                    while (true) {
                                                        if (n >= n4) {
                                                            buffer.method11670(1604085085);
                                                            this.field6927 = new int[buffer.method11650(-631050099)];
                                                            n = 0;
                                                            while (true) {
                                                                if (n >= this.field6927.length) {
                                                                    this.field6928 = new byte[n3];
                                                                    for (n = n2; n < n3; ++n) {
                                                                        this.field6928[n] = buffer.method11636(1341622423);
                                                                    }
                                                                    break block13;
                                                                }
                                                                this.field6927[n] = buffer.method11670(1604085085);
                                                                ++n;
                                                            }
                                                        }
                                                        this.field6941[n] = buffer.method11635(1277637855);
                                                        ++n;
                                                    }
                                                }
                                                this.menuActions[n - 10] = buffer.method11664(-1975810480);
                                                return;
                                            }
                                            buffer.method11650(1783281260);
                                            return;
                                        }
                                        n = buffer.method11650(1516245382);
                                        if ((n & 1) == 0) {
                                            this.field6936 = false;
                                        }
                                        if ((n & 2) == 2) break block34;
                                    }
                                    return;
                                }
                                this.field6932 = true;
                                return;
                            }
                            this.field6925 = buffer.method11650(566752170);
                            return;
                        }
                        buffer.method11649(625426782);
                        return;
                    }
                    this.field6924 = buffer.method11649(-150970557);
                    return;
                }
                this.field6931 = buffer.method11664(-1968267752);
                return;
            }
            this.field6930 = buffer.method11680((byte)-99);
            return;
        }
        this.field6938 = buffer.method11680((byte)-80);
    }

    @ObfuscatedName(value="adq")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-19")
    protected static final boolean method12929() {
        boolean bl = class138.field3545.method6099(348129920);
        return bl;
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="([BI)Loc;", garbageValue="987534658")
    static class399 method12934(byte[] object) {
        if (object == null) {
            return null;
        }
        object = new class399((byte[])object, class183.field3837, class0.field1, class82.field2627, ItemContainer.field6849, class82.field2626, class82.field2622);
        class146.method6035();
        return object;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="877164128")
    public static void method12931(AbstractArchive abstractArchive) {
        VarcInt.field6858 = abstractArchive;
    }

    @ObfuscatedName(value="ij")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)Ljava/lang/String;", garbageValue="-1558150487")
    static String method12941(String charSequence, boolean bl) {
        CharSequence charSequence2;
        String string2;
        block6: {
            block8: {
                block2: {
                    block3: {
                        block7: {
                            block4: {
                                block5: {
                                    string2 = bl ? "https://" : "http://";
                                    if (Client.gameBuild == 1) break block2;
                                    if (Client.gameBuild == 2) break block3;
                                    if (Client.gameBuild == 3) break block4;
                                    if (Client.gameBuild == 5) break block5;
                                    if (Client.gameBuild == 4) {
                                        charSequence = "local";
                                    }
                                    break block6;
                                }
                                charSequence2 = new StringBuilder();
                                ((StringBuilder)charSequence2).append((String)charSequence);
                                ((StringBuilder)charSequence2).append("-wti");
                                charSequence = charSequence2;
                                break block7;
                            }
                            charSequence2 = new StringBuilder();
                            ((StringBuilder)charSequence2).append((String)charSequence);
                            ((StringBuilder)charSequence2).append("-wtwip");
                            charSequence = charSequence2;
                        }
                        charSequence = ((StringBuilder)charSequence).toString();
                        break block6;
                    }
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    ((StringBuilder)charSequence2).append("-wtqa");
                    charSequence = charSequence2;
                    break block8;
                }
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append("-wtrc");
                charSequence = charSequence2;
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        charSequence2 = "";
        if (Client.field4744 != null) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("/p=");
            ((StringBuilder)charSequence2).append(Client.field4744);
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append((String)charSequence);
        stringBuilder.append(".");
        stringBuilder.append("runescape.com");
        stringBuilder.append("/l=");
        stringBuilder.append(class311.field6141);
        stringBuilder.append("/a=");
        stringBuilder.append(Client.field4745);
        stringBuilder.append((String)charSequence2);
        stringBuilder.append("/");
        charSequence = stringBuilder.toString();
        return charSequence;
    }
}

