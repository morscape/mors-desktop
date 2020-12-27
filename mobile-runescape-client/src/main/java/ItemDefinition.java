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

@ObfuscatedName(value="dr")
@Implements(value="ItemDefinition")
public class ItemDefinition
extends DualNode {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="ItemDefinition_modelArchive")
    static AbstractArchive ItemDefinition_modelArchive;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ItemDefinition_cachedModels")
    static EvictingDualNodeHashTable ItemDefinition_cachedModels;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ItemDefinition_cachedSprites")
    static EvictingDualNodeHashTable ItemDefinition_cachedSprites;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ItemDefinition_cached")
    static EvictingDualNodeHashTable ItemDefinition_cached;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lfz;")
    static final class300 field6986;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-1038465255)
    @Export(value="xan2d")
    public int xan2d = 0;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=1186583239)
    @Export(value="zoom2d")
    public int zoom2d = 2000;
    @ObfuscatedName(value="ao")
    @Export(value="name")
    public String name = Strings.field2765;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=-1590475853)
    @Export(value="model")
    int model;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=15246795)
    @Export(value="id")
    public int id;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1980361943)
    @Export(value="yan2d")
    public int yan2d = 0;
    @ObfuscatedName(value="az")
    @Export(value="recolorFrom")
    short[] recolorFrom;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=-644739423)
    int field6997 = -1;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=2114362069)
    int field6998 = 0;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=-2015703661)
    @Export(value="shiftClickIndex")
    int shiftClickIndex = -2;
    @ObfuscatedName(value="be")
    @ObfuscatedGetter(intValue=-1605896851)
    int field7001 = -1;
    @ObfuscatedName(value="bg")
    @ObfuscatedGetter(intValue=199457717)
    @Export(value="offsetY2d")
    public int offsetY2d = 0;
    @ObfuscatedName(value="bh")
    @Export(value="isMembersOnly")
    public boolean isMembersOnly = false;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=2139995139)
    @Export(value="price")
    public int price = 1;
    @ObfuscatedName(value="bm")
    @ObfuscatedGetter(intValue=1342305439)
    int field7008 = -1;
    @ObfuscatedName(value="bn")
    int[] field7009;
    @ObfuscatedName(value="bo")
    @ObfuscatedGetter(intValue=350688267)
    @Export(value="noteTemplate")
    public int noteTemplate = -1;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=-1283259697)
    @Export(value="zan2d")
    public int zan2d = 0;
    @ObfuscatedName(value="bq")
    @Export(value="groundActions")
    public String[] groundActions = new String[]{null, null, Strings.field2769, null, null};
    @ObfuscatedName(value="br")
    @Export(value="inventoryActions")
    public String[] inventoryActions = new String[]{null, null, null, null, Strings.field2773};
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=-1895959657)
    int field7015 = 0;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=1341503825)
    int field7019 = -1;
    @ObfuscatedName(value="by")
    @ObfuscatedGetter(intValue=1181447229)
    @Export(value="note")
    public int note = -1;
    @ObfuscatedName(value="ca")
    @ObfuscatedGetter(intValue=-310374151)
    @Export(value="placeholderTemplate")
    public int placeholderTemplate = -1;
    @ObfuscatedName(value="cf")
    @ObfuscatedGetter(intValue=-360275595)
    @Export(value="unnotedId")
    int unnotedId = -1;
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=852454777)
    @Export(value="notedId")
    int notedId = -1;
    @ObfuscatedName(value="co")
    @ObfuscatedGetter(intValue=111096359)
    public int field7029 = 0;
    @ObfuscatedName(value="cv")
    @Export(value="isTradable")
    public boolean isTradable = false;
    @ObfuscatedName(value="cw")
    @ObfuscatedGetter(intValue=1647156561)
    int field7033 = 128;
    @ObfuscatedName(value="ad")
    @Export(value="retextureTo")
    short[] retextureTo;
    @ObfuscatedName(value="at")
    @Export(value="recolorTo")
    short[] recolorTo;
    @ObfuscatedName(value="av")
    @Export(value="retextureFrom")
    short[] retextureFrom;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=424991997)
    int field6999 = -1;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=644369969)
    @Export(value="offsetX2d")
    public int offsetX2d = 0;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=1450485729)
    int field7007 = -1;
    @ObfuscatedName(value="bs")
    int[] field7014;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=214005555)
    int field7016 = -1;
    @ObfuscatedName(value="bv")
    @ObfuscatedGetter(intValue=-1243017777)
    int field7017 = -1;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=616178523)
    int field7021 = -1;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=679915061)
    @Export(value="placeholder")
    public int placeholder = -1;
    @ObfuscatedName(value="cd")
    @ObfuscatedGetter(intValue=1767803813)
    @Export(value="team")
    public int team = 0;
    @ObfuscatedName(value="cg")
    @ObfuscatedGetter(intValue=857550713)
    int field7026 = 128;
    @ObfuscatedName(value="ch")
    @ObfuscatedSignature(descriptor="Lpy;")
    @Export(value="params")
    IterableNodeHashTable params;
    @ObfuscatedName(value="cq")
    @ObfuscatedGetter(intValue=56432215)
    public int field7031 = 0;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-941752867)
    @Export(value="isStackable")
    public int isStackable = 0;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=275880715)
    int field7018 = -1;
    @ObfuscatedName(value="cp")
    @ObfuscatedGetter(intValue=880984527)
    int field7030 = 128;

    static {
        ItemDefinition_cached = new EvictingDualNodeHashTable(64, null);
        ItemDefinition_cachedModels = new EvictingDualNodeHashTable(50, null);
        ItemDefinition_cachedSprites = new EvictingDualNodeHashTable(200, null);
        field6986 = new class300();
    }

    ItemDefinition() {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(II)Lbk;")
    public final ModelData method13080(int n, int n2) {
        Object object = this.field7009;
        int n3 = 0;
        boolean bl = true;
        while (true) {
            int n4;
            int n5;
            block10: {
                block11: {
                    block8: {
                        block9: {
                            if (!bl || (bl = false)) continue;
                            if (object == null || n <= 1) break block8;
                            n2 = 0;
                            n5 = -1;
                            if (n2 >= 10) break block9;
                            n4 = n5;
                            if (n < this.field7014[n2]) break block10;
                            break block11;
                        }
                        if (n5 != -1) {
                            return class324.ItemDefinition_get(n5).method13080(1, -1983649131);
                        }
                    }
                    if ((object = (Object)ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0)) == null) {
                        return null;
                    }
                    if (this.field7033 != 128 || this.field7030 != 128 || this.field7026 != 128) {
                        ((ModelData)object).resize(this.field7033, this.field7030, this.field7026);
                    }
                    if (this.recolorFrom != null) {
                        for (n = 0; n < this.recolorFrom.length; ++n) {
                            ((ModelData)object).recolor(this.recolorFrom[n], this.recolorTo[n]);
                        }
                    }
                    if (this.retextureFrom == null) return object;
                    n = n3;
                    while (n < this.retextureFrom.length) {
                        ((ModelData)object).retexture(this.retextureFrom[n], this.retextureTo[n]);
                        ++n;
                    }
                    return object;
                }
                n4 = n5;
                if (this.field7014[n2] != 0) {
                    n4 = this.field7009[n2];
                }
            }
            ++n2;
            n5 = n4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(IB)Ldr;")
    public ItemDefinition method13082(int n, byte by) {
        if (this.field7009 == null) return this;
        if (n <= 1) return this;
        by = 0;
        int n2 = -1;
        while (true) {
            if (by >= 10) {
                if (n2 == -1) return this;
                return class324.ItemDefinition_get(n2);
            }
            int n3 = n2;
            if (n >= this.field7014[by]) {
                n3 = n2;
                if (this.field7014[by] != 0) {
                    n3 = this.field7009[by];
                }
            }
            by = (byte)(by + 1);
            n2 = n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;II)V")
    void method13083(Buffer buffer, int n, int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 4) {
                    if (n != 5) {
                        if (n != 6) {
                            if (n != 7) {
                                if (n != 8) {
                                    if (n != 11) {
                                        if (n != 12) {
                                            if (n != 16) {
                                                if (n != 23) {
                                                    if (n != 24) {
                                                        if (n != 25) {
                                                            if (n != 26) {
                                                                if (n < 30 || n >= 35) {
                                                                    if (n < 35 || n >= 40) {
                                                                        int n3 = 0;
                                                                        n2 = 0;
                                                                        if (n != 40) {
                                                                            if (n != 41) {
                                                                                if (n != 42) {
                                                                                    if (n != 65) {
                                                                                        if (n != 78) {
                                                                                            if (n != 79) {
                                                                                                if (n != 90) {
                                                                                                    if (n != 91) {
                                                                                                        if (n != 92) {
                                                                                                            if (n != 93) {
                                                                                                                if (n != 95) {
                                                                                                                    if (n != 97) {
                                                                                                                        if (n != 98) {
                                                                                                                            if (n < 100 || n >= 110) {
                                                                                                                                if (n != 110) {
                                                                                                                                    if (n != 111) {
                                                                                                                                        if (n != 112) {
                                                                                                                                            if (n != 113) {
                                                                                                                                                if (n != 114) {
                                                                                                                                                    if (n != 115) {
                                                                                                                                                        if (n != 139) {
                                                                                                                                                            if (n != 140) {
                                                                                                                                                                if (n != 148) {
                                                                                                                                                                    if (n != 149) {
                                                                                                                                                                        if (n != 249) return;
                                                                                                                                                                        this.params = FontName.method6390(buffer, this.params, 71065015);
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                    this.placeholderTemplate = buffer.method11637(615029553);
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                this.placeholder = buffer.method11637(1090890757);
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            this.notedId = buffer.method11637(504958452);
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        this.unnotedId = buffer.method11637(-824471144);
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    this.team = buffer.method11650(-713197942);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                this.field7031 = buffer.method11636(1357941626) * 5;
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            this.field7029 = buffer.method11636(1934662664);
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        this.field7026 = buffer.method11637(-231281389);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    this.field7030 = buffer.method11637(1472915855);
                                                                                                                                    return;
                                                                                                                                }
                                                                                                                                this.field7033 = buffer.method11637(1385004705);
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            if (this.field7009 == null) {
                                                                                                                                this.field7009 = new int[10];
                                                                                                                                this.field7014 = new int[10];
                                                                                                                            }
                                                                                                                            int[] arrn = this.field7009;
                                                                                                                            arrn[n -= 100] = buffer.method11637(610913707);
                                                                                                                            this.field7014[n] = buffer.method11637(-1413233916);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        this.noteTemplate = buffer.method11637(1907837849);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    this.note = buffer.method11637(1754653217);
                                                                                                                    return;
                                                                                                                }
                                                                                                                this.zan2d = buffer.method11637(1133003604);
                                                                                                                return;
                                                                                                            }
                                                                                                            this.field7016 = buffer.method11637(207646097);
                                                                                                            return;
                                                                                                        }
                                                                                                        this.field7018 = buffer.method11637(-97946116);
                                                                                                        return;
                                                                                                    }
                                                                                                    this.field7007 = buffer.method11637(-961307777);
                                                                                                    return;
                                                                                                }
                                                                                                this.field6997 = buffer.method11637(1786534148);
                                                                                                return;
                                                                                            }
                                                                                            this.field7019 = buffer.method11637(-826523773);
                                                                                            return;
                                                                                        }
                                                                                        this.field7017 = buffer.method11637(78746879);
                                                                                        return;
                                                                                    }
                                                                                    this.isTradable = true;
                                                                                    return;
                                                                                }
                                                                                this.shiftClickIndex = buffer.method11636(1620182777);
                                                                                return;
                                                                            }
                                                                            n2 = buffer.method11650(1350357532);
                                                                            this.retextureFrom = new short[n2];
                                                                            this.retextureTo = new short[n2];
                                                                            for (n = n3; n < n2; ++n) {
                                                                                this.retextureFrom[n] = (short)buffer.method11637(-1456408819);
                                                                                this.retextureTo[n] = (short)buffer.method11637(423800787);
                                                                            }
                                                                            return;
                                                                        } else {
                                                                            n3 = buffer.method11650(1936290497);
                                                                            this.recolorFrom = new short[n3];
                                                                            this.recolorTo = new short[n3];
                                                                            for (n = n2; n < n3; ++n) {
                                                                                this.recolorFrom[n] = (short)buffer.method11637(-1479887803);
                                                                                this.recolorTo[n] = (short)buffer.method11637(365887910);
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    this.inventoryActions[n - 35] = buffer.method11664(-1823288672);
                                                                    return;
                                                                }
                                                                String[] arrstring = this.groundActions;
                                                                arrstring[n -= 30] = buffer.method11664(-2064572933);
                                                                if (!this.groundActions[n].equalsIgnoreCase(Strings.field2788)) return;
                                                                this.groundActions[n] = null;
                                                                return;
                                                            }
                                                            this.field7008 = buffer.method11637(1439057328);
                                                            return;
                                                        }
                                                        this.field7001 = buffer.method11637(1974825837);
                                                        this.field6998 = buffer.method11650(1023634041);
                                                        return;
                                                    }
                                                    this.field7021 = buffer.method11637(517861619);
                                                    return;
                                                }
                                                this.field6999 = buffer.method11637(1043677380);
                                                this.field7015 = buffer.method11650(-1799419458);
                                                return;
                                            }
                                            this.isMembersOnly = true;
                                            return;
                                        }
                                        this.price = buffer.method11670(1604085085);
                                        return;
                                    }
                                    this.isStackable = 1;
                                    return;
                                }
                                this.offsetY2d = buffer.method11637(-904356301);
                                if (this.offsetY2d <= 32767) return;
                                this.offsetY2d += -65536;
                                return;
                            }
                            this.offsetX2d = buffer.method11637(1195314127);
                            if (this.offsetX2d <= 32767) return;
                            this.offsetX2d -= 65536;
                            return;
                        }
                        this.yan2d = buffer.method11637(834395477);
                        return;
                    }
                    this.xan2d = buffer.method11637(-138817210);
                    return;
                }
                this.zoom2d = buffer.method11637(120484627);
                return;
            }
            this.name = buffer.method11664(-1809054094);
            return;
        }
        this.model = buffer.method11637(1790757926);
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ldr;Ldr;I)V")
    void method13085(ItemDefinition itemDefinition, ItemDefinition itemDefinition2, int n) {
        this.model = itemDefinition.model;
        this.zoom2d = itemDefinition.zoom2d;
        this.xan2d = itemDefinition.xan2d;
        this.yan2d = itemDefinition.yan2d;
        this.zan2d = itemDefinition.zan2d;
        this.offsetX2d = itemDefinition.offsetX2d;
        this.offsetY2d = itemDefinition.offsetY2d;
        this.recolorFrom = itemDefinition2.recolorFrom;
        this.recolorTo = itemDefinition2.recolorTo;
        this.retextureFrom = itemDefinition2.retextureFrom;
        this.retextureTo = itemDefinition2.retextureTo;
        this.name = itemDefinition2.name;
        this.isMembersOnly = itemDefinition2.isMembersOnly;
        this.isStackable = itemDefinition2.isStackable;
        this.field6999 = itemDefinition2.field6999;
        this.field7021 = itemDefinition2.field7021;
        this.field7017 = itemDefinition2.field7017;
        this.field7001 = itemDefinition2.field7001;
        this.field7008 = itemDefinition2.field7008;
        this.field7019 = itemDefinition2.field7019;
        this.field6997 = itemDefinition2.field6997;
        this.field7018 = itemDefinition2.field7018;
        this.field7007 = itemDefinition2.field7007;
        this.field7016 = itemDefinition2.field7016;
        this.team = itemDefinition2.team;
        this.groundActions = itemDefinition2.groundActions;
        this.inventoryActions = new String[5];
        if (itemDefinition2.inventoryActions != null) {
            for (n = 0; n < 4; ++n) {
                this.inventoryActions[n] = itemDefinition2.inventoryActions[n];
            }
        }
        this.inventoryActions[4] = Strings.field2776;
        this.price = 0;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ldr;Ldr;I)V", garbageValue="1938498601")
    @Export(value="genPlaceholder")
    void genPlaceholder(ItemDefinition itemDefinition, ItemDefinition itemDefinition2) {
        this.model = itemDefinition.model;
        this.zoom2d = itemDefinition.zoom2d;
        this.xan2d = itemDefinition.xan2d;
        this.yan2d = itemDefinition.yan2d;
        this.zan2d = itemDefinition.zan2d;
        this.offsetX2d = itemDefinition.offsetX2d;
        this.offsetY2d = itemDefinition.offsetY2d;
        this.recolorFrom = itemDefinition.recolorFrom;
        this.recolorTo = itemDefinition.recolorTo;
        this.retextureFrom = itemDefinition.retextureFrom;
        this.retextureTo = itemDefinition.retextureTo;
        this.isStackable = itemDefinition.isStackable;
        this.name = itemDefinition2.name;
        this.price = 0;
        this.isMembersOnly = false;
        this.isTradable = false;
    }

    @ObfuscatedName(value="an")
    public final boolean method13087(boolean bl, int n) {
        int n2 = this.field6999;
        n = this.field7021;
        int n3 = this.field7017;
        if (bl) {
            n2 = this.field7001;
            n = this.field7008;
            n3 = this.field7019;
        }
        boolean bl2 = true;
        if (n2 == -1) {
            return true;
        }
        if (!ItemDefinition_modelArchive.tryLoadFile(n2, 0)) {
            bl2 = false;
        }
        bl = bl2;
        if (n != -1) {
            bl = bl2;
            if (!ItemDefinition_modelArchive.tryLoadFile(n, 0)) {
                bl = false;
            }
        }
        bl2 = bl;
        if (n3 != -1) {
            boolean bl3 = ItemDefinition_modelArchive.tryLoadFile(n3, 0);
            bl2 = bl;
            if (!bl3) {
                bl2 = false;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(ZB)Lbk;")
    public final ModelData method13090(boolean bl, byte by) {
        int n = this.field6997;
        by = (byte)this.field7018;
        if (bl) {
            n = this.field7007;
            by = (byte)this.field7016;
        }
        if (n == -1) {
            return null;
        }
        Object object = ItemDefinition_modelArchive;
        byte by2 = 0;
        ModelData modelData = ModelData.ModelData_get((AbstractArchive)object, n, 0);
        object = modelData;
        if (by != -1) {
            object = new ModelData(new ModelData[]{modelData, ModelData.ModelData_get(ItemDefinition_modelArchive, by, 0)}, 2);
        }
        if (this.recolorFrom != null) {
            for (by = 0; by < this.recolorFrom.length; by = (byte)(by + 1)) {
                ((ModelData)object).recolor(this.recolorFrom[by], this.recolorTo[by]);
            }
        }
        if (this.retextureFrom != null) {
            for (by = by2; by < this.retextureFrom.length; by = (byte)(by + 1)) {
                ((ModelData)object).retexture(this.retextureFrom[by], this.retextureTo[by]);
            }
        }
        return object;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Ldr;Ldr;I)V", garbageValue="759718675")
    @Export(value="genCert")
    void genCert(ItemDefinition itemDefinition, ItemDefinition itemDefinition2) {
        this.model = itemDefinition.model;
        this.zoom2d = itemDefinition.zoom2d;
        this.xan2d = itemDefinition.xan2d;
        this.yan2d = itemDefinition.yan2d;
        this.zan2d = itemDefinition.zan2d;
        this.offsetX2d = itemDefinition.offsetX2d;
        this.offsetY2d = itemDefinition.offsetY2d;
        this.recolorFrom = itemDefinition.recolorFrom;
        this.recolorTo = itemDefinition.recolorTo;
        this.retextureFrom = itemDefinition.retextureFrom;
        this.retextureTo = itemDefinition.retextureTo;
        this.name = itemDefinition2.name;
        this.isMembersOnly = itemDefinition2.isMembersOnly;
        this.price = itemDefinition2.price;
        this.isStackable = 1;
    }

    @ObfuscatedName(value="aw")
    public final boolean method13092(boolean bl, byte by) {
        int n = this.field6997;
        by = (byte)this.field7018;
        if (bl) {
            n = this.field7007;
            by = (byte)this.field7016;
        }
        bl = true;
        if (n == -1) {
            return true;
        }
        if (!ItemDefinition_modelArchive.tryLoadFile(n, 0)) {
            bl = false;
        }
        boolean bl2 = bl;
        if (by != -1) {
            boolean bl3 = ItemDefinition_modelArchive.tryLoadFile(by, 0);
            bl2 = bl;
            if (!bl3) {
                bl2 = false;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(ZI)Lbk;")
    public final ModelData method13094(boolean bl, int n) {
        int n2 = this.field6999;
        int n3 = this.field7021;
        n = this.field7017;
        if (bl) {
            n2 = this.field7001;
            n3 = this.field7008;
            n = this.field7019;
        }
        if (n2 == -1) {
            return null;
        }
        Object object = ItemDefinition_modelArchive;
        int n4 = 0;
        ModelData modelData = ModelData.ModelData_get((AbstractArchive)object, n2, 0);
        object = modelData;
        if (n3 != -1) {
            object = ModelData.ModelData_get(ItemDefinition_modelArchive, n3, 0);
            object = n != -1 ? new ModelData(new ModelData[]{modelData, object, ModelData.ModelData_get(ItemDefinition_modelArchive, n, 0)}, 3) : new ModelData(new ModelData[]{modelData, object}, 2);
        }
        if (!bl && this.field7015 != 0) {
            ((ModelData)object).changeOffset(0, this.field7015, 0);
        }
        if (bl && this.field6998 != 0) {
            ((ModelData)object).changeOffset(0, this.field6998, 0);
        }
        if (this.recolorFrom != null) {
            for (n = 0; n < this.recolorFrom.length; ++n) {
                ((ModelData)object).recolor(this.recolorFrom[n], this.recolorTo[n]);
            }
        }
        if (this.retextureFrom != null) {
            for (n = n4; n < this.retextureFrom.length; ++n) {
                ((ModelData)object).retexture(this.retextureFrom[n], this.retextureTo[n]);
            }
        }
        return object;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2032348020")
    @Export(value="post")
    void post() {
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        while ((n = buffer.method11650(1379334513)) != 0) {
            this.method13083(buffer, n, -736646240);
        }
        return;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II)Lcp;")
    public final Model method13081(int n, int n2) {
        Object object = this.field7009;
        int n3 = 0;
        boolean bl = true;
        while (true) {
            int n4;
            int n5;
            block12: {
                block13: {
                    block10: {
                        block11: {
                            if (!bl || (bl = false)) continue;
                            if (object == null || n <= 1) break block10;
                            n2 = 0;
                            n5 = -1;
                            if (n2 >= 10) break block11;
                            n4 = n5;
                            if (n < this.field7014[n2]) break block12;
                            break block13;
                        }
                        if (n5 != -1) {
                            return class324.ItemDefinition_get(n5).method13081(1, 2130903521);
                        }
                    }
                    if ((object = (Object)((Model)ItemDefinition_cachedModels.get(this.id))) != null) {
                        return object;
                    }
                    object = ModelData.ModelData_get(ItemDefinition_modelArchive, this.model, 0);
                    if (object == null) {
                        return null;
                    }
                    if (this.field7033 != 128 || this.field7030 != 128 || this.field7026 != 128) {
                        ((ModelData)object).resize(this.field7033, this.field7030, this.field7026);
                    }
                    if (this.recolorFrom != null) {
                        for (n = 0; n < this.recolorFrom.length; ++n) {
                            ((ModelData)object).recolor(this.recolorFrom[n], this.recolorTo[n]);
                        }
                    }
                    if (this.retextureFrom != null) {
                        for (n = n3; n < this.retextureFrom.length; ++n) {
                            ((ModelData)object).retexture(this.retextureFrom[n], this.retextureTo[n]);
                        }
                    }
                    object = ((ModelData)object).toModel(this.field7029 + 64, this.field7031 + 768, -50, -10, -50);
                    ((Model)object).isSingleTile = true;
                    ItemDefinition_cachedModels.put((DualNode)object, this.id);
                    return object;
                }
                n4 = n5;
                if (this.field7014[n2] != 0) {
                    n4 = this.field7009[n2];
                }
            }
            ++n2;
            n5 = n4;
        }
    }
}

