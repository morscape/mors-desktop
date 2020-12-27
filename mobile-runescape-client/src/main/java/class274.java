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

@ObfuscatedName(value="ch")
public class class274
implements WorldMapSection {
    @ObfuscatedName(value="ue")
    protected static boolean field4727;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1041474977)
    int field4728;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1064834625)
    int field4730;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1800584743)
    int field4731;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=207117645)
    int field4733;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=1404975761)
    int field4735;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-927315423)
    int field4736;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1180613349)
    int field4732;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1182181727)
    int field4734;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-402223539)
    int field4737;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=807505259)
    int field4729;

    class274() {
    }

    @Override
    @ObfuscatedName(value="ae")
    public boolean vmethod10367(int n, int n2, int n3, byte by) {
        by = (byte)(this.field4734 * -1617949343);
        boolean bl = false;
        if (n < by * -1182181727) {
            return false;
        }
        if (n < this.field4734 + this.field4730) {
            n = n2 >> 6;
            boolean bl2 = bl;
            if (n >= this.field4732) {
                bl2 = bl;
                if (n <= this.field4731) {
                    n = n3 >> 6;
                    bl2 = bl;
                    if (n >= this.field4737) {
                        n2 = this.field4736 * 1817426401;
                        bl2 = bl;
                        if (n <= n2 * -927315423) {
                            bl2 = true;
                        }
                    }
                }
            }
            return bl2;
        }
        return false;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1958550415")
    void method7836() {
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmi;B)V", garbageValue="0")
    public void vmethod10380(Buffer buffer) {
        this.field4734 = buffer.method11650(2094592831);
        this.field4730 = buffer.method11650(655510959);
        this.field4732 = buffer.method11637(1445450614);
        this.field4737 = buffer.method11637(271295046);
        this.field4731 = buffer.method11637(-579495738);
        this.field4736 = buffer.method11637(-416334598);
        this.field4733 = buffer.method11637(854463924);
        this.field4735 = buffer.method11637(1064521512);
        this.field4728 = buffer.method11637(1309315498);
        this.field4729 = buffer.method11637(2005530682);
        this.method7836();
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lds;B)V", garbageValue="-76")
    @Export(value="expandBounds")
    public void expandBounds(WorldMapArea worldMapArea) {
        if (worldMapArea.field2396 > this.field4733) {
            worldMapArea.field2396 = this.field4733;
        }
        if (worldMapArea.field2397 < this.field4728) {
            worldMapArea.field2397 = this.field4728;
        }
        if (worldMapArea.field2403 > this.field4735) {
            worldMapArea.field2403 = this.field4735;
        }
        if (worldMapArea.field2401 < this.field4729) {
            worldMapArea.field2401 = this.field4729;
        }
    }

    @Override
    @ObfuscatedName(value="ax")
    public int[] vmethod10384(int n, int n2, int n3, byte by) {
        if (this.vmethod10367(n, n2, n3, (byte)-52)) {
            n = this.field4733 * -206691451;
            by = (byte)(this.field4732 * -694717715);
            int n4 = this.field4735 * -1308834191;
            int n5 = this.field4737 * 55925381;
            return new int[]{n * 370627392 - by * -1750156992 + n2, n3 + (n4 * -275864512 - n5 * 27497280)};
        }
        return null;
    }

    @ObfuscatedName(value="abi")
    @ObfuscatedSignature(descriptor="([BB)Lek;", garbageValue="103")
    static class384 method7824(byte[] object) {
        object = BZip2State.field3660.vmethod12634((byte[])object);
        return object;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;IIB)Loc;", garbageValue="-1")
    public static class399 method7826(AbstractArchive object, AbstractArchive abstractArchive, int n, int n2) {
        if (class287.method10622((AbstractArchive)object, n, n2)) {
            object = WorldMapElement.method12934(abstractArchive.takeFile(n, n2));
            return object;
        }
        return null;
    }

    @ObfuscatedName(value="at")
    static void method7827(int[] arrn, byte[] arrby, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, byte by) {
        int n7 = -(n3 >> 2);
        int n8 = -(n3 & 3);
        n3 = -n4;
        while (true) {
            if (n3 < 0) {
                by = (byte)n2;
                n2 = n;
                n = by;
            } else {
                return;
            }
            for (n4 = n7; n4 < 0; ++n4) {
                by = (byte)(n2 + 1);
                int n9 = arrby[n2];
                if (n9 != 0) {
                    n2 = n + 1;
                    arrn[n] = arrn2[n9 & 0xFF];
                    n = n2;
                } else {
                    ++n;
                }
                n9 = by + 1;
                by = arrby[by];
                if (by != 0) {
                    n2 = n + 1;
                    arrn[n] = arrn2[by & 0xFF];
                    n = n2;
                } else {
                    ++n;
                }
                by = (byte)(n9 + 1);
                n9 = arrby[n9];
                if (n9 != 0) {
                    n2 = n + 1;
                    arrn[n] = arrn2[n9 & 0xFF];
                    n = n2;
                } else {
                    ++n;
                }
                n2 = by + 1;
                by = arrby[by];
                if (by != 0) {
                    arrn[n] = arrn2[by & 0xFF];
                    ++n;
                    continue;
                }
                ++n;
            }
            n4 = n8;
            while (n4 < 0) {
                by = arrby[n2];
                if (by != 0) {
                    arrn[n] = arrn2[by & 0xFF];
                    ++n;
                } else {
                    ++n;
                }
                ++n4;
                ++n2;
            }
            ++n3;
            n4 = n + n5;
            n = n6 + n2;
            n2 = n4;
        }
    }

    @ObfuscatedName(value="dr")
    static boolean method7828(byte by) {
        by = (byte)Client.field4868;
        return (by * 1064934413 & 8) != 0;
    }
}

