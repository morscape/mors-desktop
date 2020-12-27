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

@ObfuscatedName(value="es")
public class class291
extends UserList {
    @ObfuscatedName(value="hm")
    @ObfuscatedGetter(intValue=1116427393)
    static int field5991;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lnk;")
    final LoginType field5993;

    @ObfuscatedSignature(descriptor="(Lnk;)V")
    public class291(LoginType loginType) {
        super(400);
        this.field5993 = loginType;
    }

    @Override
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)[Len;", garbageValue="-2029701546")
    @Export(value="newTypedArray")
    class61[] newTypedArray(int n) {
        class61[] arrclass61 = new Ignored[n];
        return arrclass61;
    }

    @ObfuscatedName(value="ae")
    static final void method10704(long l) {
        try {
            Thread.sleep(l);
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-2082995504")
    @Export(value="loadWorlds")
    static boolean loadWorlds() {
        if (Client.archiveLoaders != null) {
            if (Client.field4984 < Client.archiveLoaders.size()) {
                block5: {
                    while (++Client.field4984 < Client.archiveLoaders.size()) {
                        if (((ArchiveLoader)Client.archiveLoaders.get(Client.field4984)).method5527(-1384881430)) {
                            continue;
                        }
                        break block5;
                    }
                    return true;
                }
                return false;
            }
        } else {
            return true;
        }
        return true;
    }

    @ObfuscatedName(value="bh")
    static void method10707(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n8 < 255) {
            n5 = -n5;
            n = n2;
            n2 = n3;
            n3 = n5;
            while (true) {
                if (n3 < 0) {
                    n5 = -n4;
                    n9 = n2;
                    n2 = n;
                } else {
                    return;
                }
                while (n5 < 0) {
                    int n10 = arrn2[n2];
                    if (n10 != 0) {
                        int n11 = arrn[n9];
                        if (n11 == 0) {
                            n = n9 + 1;
                            arrn[n9] = n10 & 0xFFFFFF | n8 << 24;
                        } else {
                            n = n11 >>> 24;
                            int n12 = 255 - n;
                            int n13 = n12 * (255 - n8) / 255 + n8;
                            int n14 = 255 - n13;
                            arrn[n9] = ((n11 & 0xFF00FF) * n14 + (n10 & 0xFF00FF) * n13 & 0xFF00FF00) + (n13 * (n10 & 0xFF00) + n14 * (n11 & 0xFF00) & 0xFF0000) >>> 8 | n12 * n8 / 255 + n << 24;
                            n = n9 + 1;
                        }
                    } else {
                        n = n9 + 1;
                    }
                    ++n5;
                    ++n2;
                    n9 = n;
                }
                n5 = n9 + n6;
                n = n2 + n7;
                ++n3;
                n2 = n5;
            }
        }
        WorldMapScaleHandler.method1023(arrn, arrn2, 0, n2, n3, n4, n5, n6, n7, (short)850);
    }
}

