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

@ObfuscatedName(value="de")
@Implements(value="ObjectDefinition")
public class ObjectDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="ObjectDefinition_archive")
    static AbstractArchive ObjectDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lga;")
    public static EvictingDualNodeHashTable field6866;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ObjectDefinition_cachedModels")
    static EvictingDualNodeHashTable ObjectDefinition_cachedModels;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="[Lbk;")
    static ModelData[] field6870;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ObjectDefinition_cachedEntities")
    static EvictingDualNodeHashTable ObjectDefinition_cachedEntities;
    @ObfuscatedName(value="hq")
    @ObfuscatedGetter(intValue=961174599)
    static int field6873;
    @ObfuscatedName(value="hs")
    @ObfuscatedGetter(intValue=-1584939077)
    static int field6874;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6867;
    @ObfuscatedName(value="ak")
    static boolean field6869 = false;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ObjectDefinition_cached")
    static EvictingDualNodeHashTable ObjectDefinition_cached;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1785732891)
    @Export(value="id")
    public int id;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=-98915501)
    public int field6877 = -1;
    @ObfuscatedName(value="af")
    @Export(value="models")
    int[] models;
    @ObfuscatedName(value="ag")
    public boolean field6880 = false;
    @ObfuscatedName(value="am")
    short[] field6881;
    @ObfuscatedName(value="an")
    short[] field6882;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-933076799)
    public int field6883 = 2;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=733133117)
    public int field6884 = 1;
    @ObfuscatedName(value="aq")
    public String field6885 = Strings.field2765;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-254110353)
    public int field6886 = 1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=1904196879)
    public int field6888 = 16;
    @ObfuscatedName(value="aw")
    short[] field6890;
    @ObfuscatedName(value="ay")
    short[] field6891;
    @ObfuscatedName(value="az")
    public boolean field6892 = true;
    @ObfuscatedName(value="ba")
    @ObfuscatedGetter(intValue=909637585)
    int field6893 = -1;
    @ObfuscatedName(value="bb")
    @ObfuscatedGetter(intValue=1076189071)
    public int field6894 = -1;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=-1616813911)
    int field6896 = 128;
    @ObfuscatedName(value="be")
    public boolean field6897 = false;
    @ObfuscatedName(value="bg")
    public String[] field6899 = new String[5];
    @ObfuscatedName(value="bh")
    boolean field6900 = false;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=-1209493665)
    public int field6902 = -1;
    @ObfuscatedName(value="bm")
    boolean field6905 = false;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=-1731427863)
    public int field6906 = 0;
    @ObfuscatedName(value="bo")
    @ObfuscatedSignature(descriptor="Lpy;")
    IterableNodeHashTable field6907;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=-621455203)
    int field6908 = 0;
    @ObfuscatedName(value="bq")
    public boolean field6909 = true;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=202334613)
    int field6910 = 128;
    @ObfuscatedName(value="bt")
    @ObfuscatedGetter(intValue=944130853)
    int field6912 = 0;
    @ObfuscatedName(value="bx")
    @ObfuscatedGetter(intValue=-2131764721)
    int field6916 = -1;
    @ObfuscatedName(value="by")
    public boolean field6917 = true;
    @ObfuscatedName(value="ad")
    @Export(value="nonFlatShading")
    boolean nonFlatShading = false;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=-426998753)
    public int field6887 = -1;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=1483725117)
    int field6889 = -1;
    @ObfuscatedName(value="bc")
    @ObfuscatedGetter(intValue=-477491691)
    int field6895 = 0;
    @ObfuscatedName(value="bi")
    @ObfuscatedGetter(intValue=-2046443189)
    int field6901 = 0;
    @ObfuscatedName(value="bl")
    @ObfuscatedGetter(intValue=-445799303)
    public int field6904 = 0;
    @ObfuscatedName(value="bs")
    public int[] field6911;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=-561240797)
    public int field6913 = 0;
    @ObfuscatedName(value="bv")
    @Export(value="transforms")
    public int[] transforms;
    @ObfuscatedName(value="bz")
    @ObfuscatedGetter(intValue=-1520497091)
    int field6918 = 0;
    @ObfuscatedName(value="ab")
    int[] field6876;
    @ObfuscatedName(value="bf")
    @ObfuscatedGetter(intValue=-975764493)
    @Export(value="mapIconId")
    public int mapIconId = -1;
    @ObfuscatedName(value="bw")
    @ObfuscatedGetter(intValue=-347288099)
    public int field6915 = -1;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=-376344979)
    int field6903 = 128;

    static {
        ObjectDefinition_cached = new EvictingDualNodeHashTable(4096, null);
        field6866 = new EvictingDualNodeHashTable(500, null);
        ObjectDefinition_cachedEntities = new EvictingDualNodeHashTable(128, null);
        ObjectDefinition_cachedModels = new EvictingDualNodeHashTable(128, null);
        field6870 = new ModelData[4];
    }

    ObjectDefinition() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(III)Lbk;")
    final ModelData method12880(int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        Object object;
        block28: {
            long l;
            int n7;
            block29: {
                block30: {
                    object = this.models;
                    int n8 = 0;
                    if (object != null) break block30;
                    if (n != 10) {
                        return null;
                    }
                    if (this.field6876 == null) {
                        return null;
                    }
                    n5 = n6 = this.field6900;
                    if (n == 2) {
                        n5 = n6;
                        if (n2 > 3) {
                            n5 = n6 == 0 ? 1 : 0;
                        }
                    }
                    int n9 = this.field6876.length;
                    object = null;
                    n3 = 0;
                    while (true) {
                        block32: {
                            block33: {
                                block31: {
                                    if (n3 >= n9) break block31;
                                    n4 = n7 = this.field6876[n3];
                                    if (n5 == 0) break block32;
                                    break block33;
                                }
                                if (n9 > 1) {
                                    object = new ModelData(field6870, n9);
                                }
                                break block28;
                            }
                            n4 = n7 + 65536;
                        }
                        object = field6866;
                        l = n4;
                        if ((object = (ModelData)((EvictingDualNodeHashTable)object).get(l)) == null) {
                            object = ModelData.ModelData_get(field6867, n4 & 0xFFFF, 0);
                            if (object == null) {
                                return null;
                            }
                            if (n5 != 0) {
                                ((ModelData)object).method13941();
                            }
                            field6866.put((DualNode)object, l);
                        }
                        if (n9 > 1) {
                            ObjectDefinition.field6870[n3] = object;
                        }
                        ++n3;
                    }
                }
                n3 = 0;
                while (n3 < this.models.length) {
                    if (this.models[n3] != n) {
                        ++n3;
                        continue;
                    }
                    break block29;
                }
                return null;
            }
            if (n3 == -1) {
                return null;
            }
            n4 = this.field6876[n3];
            n5 = this.field6900;
            n3 = n2 > 3 ? 1 : 0;
            n7 = n5 ^ n3;
            n3 = n4;
            if (n7 != 0) {
                n3 = n4 + 65536;
            }
            object = field6866;
            l = n3;
            ModelData modelData = (ModelData)((EvictingDualNodeHashTable)object).get(l);
            object = modelData;
            if (modelData == null) {
                object = ModelData.ModelData_get(field6867, n3 & 0xFFFF, 0);
                if (object == null) {
                    return null;
                }
                if (n7 != 0) {
                    ((ModelData)object).method13941();
                }
                field6866.put((DualNode)object, l);
            }
        }
        n3 = this.field6910 == 128 && this.field6903 == 128 && this.field6896 == 128 ? 0 : 1;
        n4 = this.field6895 == 0 && this.field6918 == 0 && this.field6912 == 0 ? 0 : 1;
        n5 = n2 == 0 && n3 == 0 && n4 == 0 ? 1 : 0;
        n6 = this.field6881 == null ? 1 : 0;
        boolean bl = this.field6891 == null;
        object = new ModelData((ModelData)object, n5 != 0, n6 != 0, bl, true);
        if (n == 4 && n2 > 3) {
            ((ModelData)object).rotateZ(256);
            ((ModelData)object).changeOffset(45, 0, -45);
        }
        if ((n = n2 & 3) == 1) {
            ((ModelData)object).method13930();
        } else if (n == 2) {
            ((ModelData)object).method13922();
        } else if (n == 3) {
            ((ModelData)object).method13923();
        }
        if (this.field6881 != null) {
            for (n = 0; n < this.field6881.length; ++n) {
                ((ModelData)object).recolor(this.field6881[n], this.field6882[n]);
            }
        }
        if (this.field6891 != null) {
            for (n = n8; n < this.field6891.length; ++n) {
                ((ModelData)object).retexture(this.field6891[n], this.field6890[n]);
            }
        }
        if (n3 != 0) {
            ((ModelData)object).resize(this.field6910, this.field6903, this.field6896);
        }
        if (n4 == 0) return object;
        ((ModelData)object).changeOffset(this.field6895, this.field6918, this.field6912);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;IB)V")
    void method12882(Buffer buffer, int n, byte by) {
        int n2;
        block50: {
            block51: {
                int n3;
                block53: {
                    block54: {
                        int n4;
                        block55: {
                            int n5;
                            block56: {
                                block58: {
                                    block57: {
                                        int n6;
                                        block52: {
                                            block49: {
                                                n3 = 0;
                                                n4 = 0;
                                                n5 = 0;
                                                n6 = 0;
                                                by = 0;
                                                n2 = 0;
                                                if (n != 1) break block49;
                                                by = (byte)buffer.method11650(1233258041);
                                                if (by <= 0) return;
                                                if (this.field6876 == null) break block50;
                                                break block51;
                                            }
                                            if (n == 2) {
                                                this.field6885 = buffer.method11664(-2040235776);
                                                return;
                                            }
                                            if (n != 5) break block52;
                                            by = (byte)buffer.method11650(1639580051);
                                            if (by <= 0) return;
                                            if (this.field6876 == null) break block53;
                                            break block54;
                                        }
                                        if (n == 14) {
                                            this.field6886 = buffer.method11650(-302891930);
                                            return;
                                        }
                                        if (n == 15) {
                                            this.field6884 = buffer.method11650(1929366586);
                                            return;
                                        }
                                        if (n == 17) {
                                            this.field6883 = 0;
                                            this.field6892 = false;
                                            return;
                                        }
                                        if (n == 18) {
                                            this.field6892 = false;
                                            return;
                                        }
                                        if (n == 19) {
                                            this.field6887 = buffer.method11650(1219515639);
                                            return;
                                        }
                                        if (n == 21) {
                                            this.field6889 = 0;
                                            return;
                                        }
                                        if (n == 22) {
                                            this.nonFlatShading = true;
                                            return;
                                        }
                                        if (n == 23) {
                                            this.field6880 = true;
                                            return;
                                        }
                                        if (n == 24) {
                                            this.field6877 = buffer.method11637(854440257);
                                            if (this.field6877 != 65535) return;
                                            this.field6877 = -1;
                                            return;
                                        }
                                        if (n == 27) {
                                            this.field6883 = 1;
                                            return;
                                        }
                                        if (n == 28) {
                                            this.field6888 = buffer.method11650(1923412339);
                                            return;
                                        }
                                        if (n == 29) {
                                            this.field6908 = buffer.method11636(1367665998);
                                            return;
                                        }
                                        if (n == 39) {
                                            this.field6901 = buffer.method11636(1884039873) * 25;
                                            return;
                                        }
                                        if (n >= 30 && n < 35) {
                                            String[] arrstring = this.field6899;
                                            arrstring[n -= 30] = buffer.method11664(-2007182955);
                                            if (!this.field6899[n].equalsIgnoreCase(Strings.field2788)) return;
                                            this.field6899[n] = null;
                                            return;
                                        }
                                        if (n == 40) break block55;
                                        if (n == 41) break block56;
                                        if (n == 62) {
                                            this.field6900 = true;
                                            return;
                                        }
                                        if (n == 64) {
                                            this.field6909 = false;
                                            return;
                                        }
                                        if (n == 65) {
                                            this.field6910 = buffer.method11637(-16388467);
                                            return;
                                        }
                                        if (n == 66) {
                                            this.field6903 = buffer.method11637(-1132895229);
                                            return;
                                        }
                                        if (n == 67) {
                                            this.field6896 = buffer.method11637(1812880346);
                                            return;
                                        }
                                        if (n == 68) {
                                            this.field6902 = buffer.method11637(-947840193);
                                            return;
                                        }
                                        if (n == 69) {
                                            buffer.method11650(487795228);
                                            return;
                                        }
                                        if (n == 70) {
                                            this.field6895 = buffer.method11635(1277637855);
                                            return;
                                        }
                                        if (n == 71) {
                                            this.field6918 = buffer.method11635(1277637855);
                                            return;
                                        }
                                        if (n == 72) {
                                            this.field6912 = buffer.method11635(1277637855);
                                            return;
                                        }
                                        if (n == 73) {
                                            this.field6897 = true;
                                            return;
                                        }
                                        if (n == 74) {
                                            this.field6905 = true;
                                            return;
                                        }
                                        if (n == 75) {
                                            this.field6894 = buffer.method11650(1619506224);
                                            return;
                                        }
                                        if (n != 77 && n != 92) {
                                            if (n == 78) {
                                                this.field6915 = buffer.method11637(-952149911);
                                                this.field6904 = buffer.method11650(230815596);
                                                return;
                                            }
                                            if (n != 79) {
                                                if (n == 81) {
                                                    this.field6889 = buffer.method11650(299893438) * 256;
                                                    return;
                                                }
                                                if (n == 82) {
                                                    this.mapIconId = buffer.method11637(-1237559299);
                                                    return;
                                                }
                                                if (n == 89) {
                                                    this.field6917 = false;
                                                    return;
                                                }
                                                if (n != 249) return;
                                                this.field6907 = FontName.method6390(buffer, this.field6907, -1614386571);
                                                return;
                                            }
                                            this.field6913 = buffer.method11637(1407279405);
                                            this.field6906 = buffer.method11637(-1158275361);
                                            this.field6904 = buffer.method11650(1759223508);
                                            by = (byte)buffer.method11650(-1448725813);
                                            this.field6911 = new int[by];
                                            n = n6;
                                            while (n < by) {
                                                this.field6911[n] = buffer.method11637(-898398792);
                                                ++n;
                                            }
                                            return;
                                        }
                                        this.field6916 = buffer.method11637(-1144691829);
                                        if (this.field6916 == 65535) {
                                            this.field6916 = -1;
                                        }
                                        this.field6893 = buffer.method11637(108303086);
                                        if (this.field6893 == 65535) {
                                            this.field6893 = -1;
                                        }
                                        if (n != 92) break block57;
                                        n = n2 = buffer.method11637(731387177);
                                        if (n2 != 65535) break block58;
                                    }
                                    n = -1;
                                }
                                n2 = buffer.method11650(-564609950);
                                this.transforms = new int[n2 + 2];
                                while (true) {
                                    if (by > n2) {
                                        this.transforms[n2 + 1] = n;
                                        return;
                                    }
                                    this.transforms[by] = buffer.method11637(1918010031);
                                    if (this.transforms[by] == 65535) {
                                        this.transforms[by] = -1;
                                    }
                                    by = (byte)(by + 1);
                                }
                            }
                            by = (byte)buffer.method11650(1671905614);
                            this.field6891 = new short[by];
                            this.field6890 = new short[by];
                            n = n5;
                            while (n < by) {
                                this.field6891[n] = (short)buffer.method11637(-431421321);
                                this.field6890[n] = (short)buffer.method11637(1381058133);
                                ++n;
                            }
                            return;
                        }
                        by = (byte)buffer.method11650(907390038);
                        this.field6881 = new short[by];
                        this.field6882 = new short[by];
                        n = n4;
                        while (n < by) {
                            this.field6881[n] = (short)buffer.method11637(439582964);
                            this.field6882[n] = (short)buffer.method11637(-559287056);
                            ++n;
                        }
                        return;
                    }
                    if (!field6869) {
                        buffer.offset = by * 2 + buffer.offset;
                        return;
                    }
                }
                this.models = null;
                this.field6876 = new int[by];
                n = n3;
                while (n < by) {
                    this.field6876[n] = buffer.method11637(-1170987876);
                    ++n;
                }
                return;
            }
            if (!field6869) {
                buffer.offset = by * 3 + buffer.offset;
                return;
            }
        }
        this.models = new int[by];
        this.field6876 = new int[by];
        n = n2;
        while (n < by) {
            this.field6876[n] = buffer.method11637(-1343454253);
            this.models[n] = buffer.method11650(883067771);
            ++n;
        }
    }

    @ObfuscatedName(value="aj")
    public final boolean method12884(int n) {
        if (this.field6876 != null) {
            n = 0;
            boolean bl = true;
            while (true) {
                if (n >= this.field6876.length) {
                    return bl;
                }
                boolean bl2 = field6867.tryLoadFile(this.field6876[n] & 0xFFFF, 0);
                bl &= bl2;
                ++n;
            }
        }
        return true;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(II[[IIIII)Lbw;", garbageValue="-205493130")
    @Export(value="getModel")
    public final Entity getModel(int n, int n2, int[][] arrn, int n3, int n4, int n5) {
        Entity entity;
        long l = this.models == null ? (long)(n2 + (this.id << 10)) : (long)(n2 + (n << 3) + (this.id << 10));
        Entity entity2 = entity = (Entity)ObjectDefinition_cachedEntities.get(l);
        if (entity == null) {
            entity2 = this.method12880(n, n2, -1539642183);
            if (entity2 == null) {
                return null;
            }
            if (!this.nonFlatShading) {
                entity2 = ((ModelData)entity2).toModel(this.field6908 + 64, this.field6901 + 768, -50, -10, -50);
            } else {
                ((ModelData)entity2).ambient = (short)(this.field6908 + 64);
                ((ModelData)entity2).contrast = (short)(this.field6901 + 768);
                ((ModelData)entity2).calculateVertexNormals();
            }
            ObjectDefinition_cachedEntities.put(entity2, l);
        }
        entity = entity2;
        if (this.nonFlatShading) {
            entity = ((ModelData)entity2).method13927();
        }
        entity2 = entity;
        if (this.field6889 * 65536 >= 0) {
            if (entity instanceof Model) {
                return ((Model)entity).contourGround(arrn, n3, n4, n5, true, this.field6889 * 65536);
            }
            entity2 = entity;
            if (entity instanceof ModelData) {
                entity2 = ((ModelData)entity).method13937(arrn, n3, n4, n5, true, this.field6889 * 65536);
            }
        }
        return entity2;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Lde;")
    public final ObjectDefinition method12888(int n) {
        n = this.field6916 != -1 ? class285.method10473(this.field6916, 790692179) : (this.field6893 != -1 ? Varps.Varps_main[this.field6893] : -1);
        n = n >= 0 && n < this.transforms.length - 1 ? this.transforms[n] : this.transforms[this.transforms.length - 1];
        if (n == -1) {
            return null;
        }
        ObjectDefinition objectDefinition = AbstractWorldMapIcon.getObjectDefinition(n);
        return objectDefinition;
    }

    @ObfuscatedName(value="aw")
    public boolean method12893(int n) {
        block8: {
            boolean bl;
            block7: {
                block3: {
                    Object object = this.transforms;
                    bl = true;
                    if (object == null) break block3;
                    n = 0;
                    while (true) {
                        block5: {
                            block6: {
                                block4: {
                                    if (n >= this.transforms.length) break block4;
                                    if (this.transforms[n] == -1) break block5;
                                    object = AbstractWorldMapIcon.getObjectDefinition(this.transforms[n]);
                                    if (object.field6915 != -1) break;
                                    break block6;
                                }
                                return false;
                            }
                            object = object.field6911;
                            if (object != null) break;
                        }
                        ++n;
                    }
                    return true;
                }
                if (this.field6915 != -1) break block7;
                if (this.field6911 != null) break block8;
                bl = false;
            }
            return bl;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ai")
    void method12883(byte by) {
        by = (byte)(this.field6887 * 1812068319);
        byte by2 = 0;
        if (by * -426998753 == -1) {
            this.field6887 = 0;
            if (this.field6876 != null && (this.models == null || this.models[0] == 10)) {
                this.field6887 = 1;
            }
            for (by = 0; by < 5; by = (byte)(by + 1)) {
                if (this.field6899[by] == null) continue;
                this.field6887 = 1;
            }
        }
        if (this.field6894 == -1) {
            by = by2;
            if (this.field6883 != 0) {
                by = 1;
            }
            this.field6894 = by;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        while ((n = buffer.method11650(466994798)) != 0) {
            this.method12882(buffer, n, (byte)-67);
        }
        return;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II[[IIIILdv;II)Lcp;", garbageValue="2024793719")
    @Export(value="getModelDynamic")
    public final Model getModelDynamic(int n, int n2, int[][] arrn, int n3, int n4, int n5, SequenceDefinition dualNode, int n6) {
        Model model;
        long l = this.models == null ? (long)(n2 + (this.id << 10)) : (long)(n2 + (n << 3) + (this.id << 10));
        DualNode dualNode2 = model = (Model)ObjectDefinition_cachedModels.get(l);
        if (model == null) {
            dualNode2 = this.method12880(n, n2, -2074649503);
            if (dualNode2 == null) {
                return null;
            }
            dualNode2 = ((ModelData)dualNode2).toModel(this.field6908 + 64, this.field6901 + 768, -50, -10, -50);
            ObjectDefinition_cachedModels.put(dualNode2, l);
        }
        if (dualNode != null || this.field6889 * 65536 != -1) {
            dualNode = dualNode == null ? dualNode2.toSharedSequenceModel(true) : ((SequenceDefinition)dualNode).transformObjectModel((Model)dualNode2, n6, n2);
            dualNode2 = dualNode;
            if (this.field6889 * 65536 >= 0) {
                dualNode2 = ((Model)dualNode).contourGround(arrn, n3, n4, n5, false, this.field6889 * 65536);
            }
            return dualNode2;
        }
        return dualNode2;
    }
}

