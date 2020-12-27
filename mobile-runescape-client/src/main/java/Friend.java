/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="er")
@Implements(value="Friend")
public class Friend
extends class289 {
    @ObfuscatedName(value="ak")
    boolean field7155;
    @ObfuscatedName(value="ax")
    boolean field7156;

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Len;I)I")
    public int vmethod13338(class61 class612, int n) {
        n = this.method13342((Friend)class612, (byte)-128);
        return n;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ler;B)I")
    int method13342(Friend friend, byte by) {
        if (this.field5972 != Client.field4741 || Client.field4741 == friend.field5972) {
            if (Client.field4741 != friend.field5972 || this.field5972 == Client.field4741) {
                if (this.field5972 == 0 || friend.field5972 != 0) {
                    if (friend.field5972 == 0 || this.field5972 != 0) {
                        if (!this.field7155 || friend.field7155) {
                            if (this.field7155 || !friend.field7155) {
                                if (!this.field7156 || friend.field7156) {
                                    if (this.field7156 || !friend.field7156) {
                                        if (this.field5972 != 0) {
                                            return this.field5974 - friend.field5974;
                                        }
                                        by = (byte)(friend.field5974 * -1067211723);
                                        int n = this.field5974 * -1067211723;
                                        return by * 1933413917 - n * 1933413917;
                                    }
                                    return 1;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }

    @Override
    @Export(value="compareTo_user")
    @ObfuscatedName(value="compareTo")
    public int compareTo_user(Object object) {
        int n = this.method13342((Friend)object, (byte)-32);
        return n;
    }

    @ObfuscatedName(value="at")
    @Export(value="Sprite_drawTransScaled")
    static void Sprite_drawTransScaled(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        n = -n7;
        n7 = n3;
        n3 = n;
        while (true) {
            int n12;
            if (n3 < 0) {
                n12 = n2;
                n = n4;
                n4 = n12;
            } else {
                return;
            }
            for (n11 = -n6; n11 < 0; ++n11) {
                n12 = arrn2[(n4 >> 16) + n10 * (n7 >> 16)];
                if (n12 != 0) {
                    arrn[n] = n12;
                    ++n;
                } else {
                    ++n;
                }
                n4 += n8;
            }
            n7 = n9 + n7;
            n4 = n + n5;
            ++n3;
        }
    }
}

