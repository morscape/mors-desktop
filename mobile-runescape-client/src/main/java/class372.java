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

@ObfuscatedName(value="dh")
public class class372
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6944;
    @ObfuscatedName(value="cm")
    static String field6951;
    @ObfuscatedName(value="ny")
    @ObfuscatedSignature(descriptor="Lme;")
    static MouseWheel field6952;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1223872699)
    public static int field6945 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6946;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6948;
    @ObfuscatedName(value="aa")
    short[] field6954;
    @ObfuscatedName(value="af")
    int[] field6956 = new int[]{-1, -1, -1, -1, -1};
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=251352637)
    public int field6957 = -1;
    @ObfuscatedName(value="aj")
    short[] field6958;
    @ObfuscatedName(value="al")
    short[] field6959;
    @ObfuscatedName(value="aq")
    @Export(value="hideUnderlay")
    public boolean hideUnderlay = false;
    @ObfuscatedName(value="as")
    @Export(value="countobj")
    int[] countobj;
    @ObfuscatedName(value="ab")
    short[] field6955;

    static {
        field6948 = new EvictingDualNodeHashTable(64, null);
    }

    class372() {
    }

    @ObfuscatedName(value="ah")
    public boolean method12981(int n) {
        if (this.countobj != null) {
            n = 0;
            boolean bl = true;
            while (true) {
                if (n >= this.countobj.length) {
                    return bl;
                }
                boolean bl2 = field6944.tryLoadFile(this.countobj[n], 0);
                if (!bl2) {
                    bl = false;
                }
                ++n;
            }
        }
        return true;
    }

    @ObfuscatedName(value="aj")
    public boolean method12983(int n) {
        n = 0;
        boolean bl = true;
        while (n < 5) {
            boolean bl2 = bl;
            if (this.field6956[n] != -1) {
                boolean bl3 = field6944.tryLoadFile(this.field6956[n], 0);
                bl2 = bl;
                if (!bl3) {
                    bl2 = false;
                }
            }
            ++n;
            bl = bl2;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Lbk;")
    public ModelData method12984(int n) {
        Object object = new ModelData[5];
        int n2 = 0;
        n = 0;
        int n3 = 0;
        while (true) {
            int n4;
            block6: {
                block7: {
                    block5: {
                        if (n >= 5) break block5;
                        n4 = n3;
                        if (this.field6956[n] == -1) break block6;
                        break block7;
                    }
                    object = new ModelData((ModelData[])object, n3);
                    if (this.field6958 != null) {
                        for (n = 0; n < this.field6958.length; ++n) {
                            ((ModelData)object).recolor(this.field6958[n], this.field6959[n]);
                        }
                    }
                    if (this.field6954 != null) {
                        for (n = n2; n < this.field6954.length; ++n) {
                            ((ModelData)object).retexture(this.field6954[n], this.field6955[n]);
                        }
                    }
                    return object;
                }
                object[n3] = ModelData.ModelData_get(field6944, this.field6956[n], 0);
                n4 = n3 + 1;
            }
            ++n;
            n3 = n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Lbk;")
    @Export(value="getCountObj")
    public ModelData getCountObj(int n) {
        if (this.countobj == null) {
            return null;
        }
        Object object = new ModelData[this.countobj.length];
        int n2 = 0;
        for (n = 0; n < this.countobj.length; ++n) {
            object[n] = ModelData.ModelData_get(field6944, this.countobj[n], 0);
        }
        object = ((ModelData[])object).length == 1 ? object[0] : new ModelData((ModelData[])object, ((ModelData[])object).length);
        if (this.field6958 != null) {
            for (n = 0; n < this.field6958.length; ++n) {
                ((ModelData)object).recolor(this.field6958[n], this.field6959[n]);
            }
        }
        if (this.field6954 == null) return object;
        n = n2;
        while (n < this.field6954.length) {
            ((ModelData)object).retexture(this.field6954[n], this.field6955[n]);
            ++n;
        }
        return object;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    void method12982(Buffer buffer, int n) {
        while ((n = buffer.method11650(-1064589854)) != 0) {
            this.decodeNext(buffer, n, -575452189);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;II)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n, int n2) {
        if (n == 1) {
            this.field6957 = buffer.method11650(-680149882);
            return;
        }
        int n3 = 0;
        int n4 = 0;
        n2 = 0;
        if (n == 2) {
            n3 = buffer.method11650(-1113546579);
            this.countobj = new int[n3];
        } else {
            if (n == 3) {
                this.hideUnderlay = true;
                return;
            }
            if (n == 40) {
                n2 = buffer.method11650(-1783935001);
                this.field6958 = new short[n2];
                this.field6959 = new short[n2];
            } else {
                if (n != 41) {
                    if (n < 60 || n >= 70) return;
                    this.field6956[n - 60] = buffer.method11637(-868173781);
                    return;
                } else {
                    n2 = buffer.method11650(-806939842);
                    this.field6954 = new short[n2];
                    this.field6955 = new short[n2];
                    for (n = n4; n < n2; ++n) {
                        this.field6954[n] = (short)buffer.method11637(922965259);
                        this.field6955[n] = (short)buffer.method11637(-75712784);
                    }
                }
                return;
            }
            for (n = n3; n < n2; ++n) {
                this.field6958[n] = (short)buffer.method11637(-17757897);
                this.field6959[n] = (short)buffer.method11637(-926689015);
            }
            return;
        }
        for (n = n2; n < n3; ++n) {
            this.countobj[n] = buffer.method11637(955310568);
        }
    }

    @ObfuscatedName(value="ad")
    static void method12966(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, short s) {
        n = -n7;
        n7 = n3;
        n3 = n;
        while (true) {
            int n11;
            if (n3 < 0) {
                n11 = -n6;
                n = n4;
                s = (short)n2;
            } else {
                return;
            }
            for (n4 = n11; n4 < 0; ++n4) {
                n11 = arrn2[(s >> 16) + n10 * (n7 >> 16)];
                if (n11 != 0) {
                    arrn[n] = n11;
                    ++n;
                } else {
                    ++n;
                }
                s = (short)(n8 + s);
            }
            n7 = n9 + n7;
            n4 = n + n5;
            ++n3;
        }
    }
}

