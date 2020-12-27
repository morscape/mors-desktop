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

@ObfuscatedName(value="au")
@Implements(value="TileItemPile")
public final class TileItemPile {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1233400475)
    int field296;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbw;")
    Entity field297;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(longValue=431872177864944053L)
    long field299;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-544965541)
    int field301;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lbw;")
    Entity field302;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-488498137)
    int field298;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1969880671)
    int field300;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lbw;")
    @Export(value="first")
    Entity first;

    TileItemPile() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lkc;Ljava/lang/String;Ljava/lang/String;I)Lei;")
    public static IndexedSprite method327(AbstractArchive object, String string2, String string3, int n) {
        n = ((AbstractArchive)object).method6153(string2, -2049523271);
        object = class261.method7514((AbstractArchive)object, n, ((AbstractArchive)object).getFileId(n, string3));
        return object;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BIIIIIII[Lgg;I)V")
    static final void method328(byte[] object, int n, int n2, int n3, int n4, int n5, int n6, int n7, CollisionMap[] arrcollisionMap, int n8) {
        n8 = 0;
        block0: while (true) {
            int n9;
            int n10;
            int n11;
            if (n8 >= 8) {
                object = new Buffer((byte[])object);
                n8 = 0;
                while (true) {
                    if (n8 < 4) {
                        n11 = 0;
                        n10 = n8;
                    } else {
                        return;
                    }
                    block2: for (n8 = n11; n8 < 64; ++n8) {
                        n11 = 0;
                        while (true) {
                            if (n11 >= 64) continue block2;
                            if (n10 != n4 || n8 < n5 || n8 >= n5 + 8 || n11 < n6 || n11 >= n6 + 8) {
                                class90.method4802((Buffer)object, 0, -1, -1, 0, 0, 0, (byte)-58);
                            } else {
                                n9 = n8 & 7;
                                int n12 = n11 & 7;
                                class90.method4802((Buffer)object, n, n2 + FloorDecoration.method852(n9, n12, n7), n3 + class6.method72(n9, n12, n7), 0, 0, n7, (byte)-4);
                            }
                            ++n11;
                        }
                    }
                    n8 = n10 + 1;
                }
            }
            n11 = 0;
            while (true) {
                block11: {
                    block12: {
                        block10: {
                            if (n11 >= 8) break block10;
                            n10 = n2 + n8;
                            if (n10 <= 0 || n10 >= 103 || (n9 = n3 + n11) <= 0 || n9 >= 103) break block11;
                            break block12;
                        }
                        ++n8;
                        continue block0;
                    }
                    int[] arrn = arrcollisionMap[n].field2687[n10];
                    arrn[n9] = arrn[n9] & 0xFEFFFFFF;
                }
                ++n11;
            }
            break;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;I)V", garbageValue="-1866213534")
    public static void method329(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        SpotAnimationDefinition.SpotAnimationDefinition_archive = abstractArchive;
        SpotAnimationDefinition.field7132 = abstractArchive2;
    }
}

