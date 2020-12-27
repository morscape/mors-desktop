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

@ObfuscatedName(value="bg")
@Implements(value="Animation")
public class Animation {
    @ObfuscatedName(value="ae")
    static int[] field430;
    @ObfuscatedName(value="ai")
    static int[] field431;
    @ObfuscatedName(value="ak")
    static int[] field432;
    @ObfuscatedName(value="ax")
    static int[] field433;
    @ObfuscatedName(value="aa")
    int[] field434;
    @ObfuscatedName(value="af")
    @Export(value="hasAlphaTransform")
    boolean hasAlphaTransform;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lbu;")
    @Export(value="skeleton")
    Skeleton skeleton = null;
    @ObfuscatedName(value="aj")
    @Export(value="transformSkeletonLabels")
    int[] transformSkeletonLabels;
    @ObfuscatedName(value="al")
    int[] field439;
    @ObfuscatedName(value="as")
    @Export(value="transformCount")
    int transformCount = -1;
    @ObfuscatedName(value="ab")
    int[] field435;

    static {
        field432 = new int[500];
        field430 = new int[500];
        field431 = new int[500];
        field433 = new int[500];
    }

    @ObfuscatedSignature(descriptor="([BLbu;)V")
    Animation(byte[] arrby, Skeleton node) {
        int n = 0;
        this.hasAlphaTransform = false;
        this.skeleton = node;
        node = new Buffer(arrby);
        Buffer buffer = new Buffer(arrby);
        ((Buffer)node).offset = 2;
        int n2 = ((Buffer)node).method11650(309053595);
        buffer.offset = ((Buffer)node).offset + n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = -1;
        while (true) {
            int n6;
            int n7;
            block8: {
                int n8;
                block9: {
                    block10: {
                        block7: {
                            if (n3 >= n2) break block7;
                            n8 = ((Buffer)node).method11650(-1699393662);
                            n7 = n4;
                            n6 = n5;
                            if (n8 <= 0) break block8;
                            n6 = n4;
                            if (this.skeleton.field4653[n3] == 0) break block9;
                            break block10;
                        }
                        if (arrby.length == buffer.offset) {
                            this.transformCount = n4;
                            this.transformSkeletonLabels = new int[n4];
                            this.field439 = new int[n4];
                            this.field434 = new int[n4];
                            this.field435 = new int[n4];
                        } else {
                            throw new RuntimeException();
                        }
                        for (n3 = n; n3 < n4; ++n3) {
                            this.transformSkeletonLabels[n3] = field432[n3];
                            this.field439[n3] = field430[n3];
                            this.field434[n3] = field431[n3];
                            this.field435[n3] = field433[n3];
                        }
                        return;
                    }
                    n7 = n3 - 1;
                    while (true) {
                        n6 = n4;
                        if (n7 <= n5) break;
                        if (this.skeleton.field4653[n7] == 0) {
                            Animation.field432[n4] = n7;
                            Animation.field430[n4] = 0;
                            Animation.field431[n4] = 0;
                            Animation.field433[n4] = 0;
                            n6 = n4 + 1;
                            break;
                        }
                        --n7;
                    }
                }
                Animation.field432[n6] = n3;
                n4 = this.skeleton.field4653[n3] == 3 ? 128 : 0;
                Animation.field430[n6] = (n8 & 1) != 0 ? buffer.method11672(1290114973) : n4;
                Animation.field431[n6] = (n8 & 2) != 0 ? buffer.method11672(1290114973) : n4;
                Animation.field433[n6] = (n8 & 4) != 0 ? buffer.method11672(1290114973) : n4;
                n7 = n6 + 1;
                if (this.skeleton.field4653[n3] == 5) {
                    this.hasAlphaTransform = true;
                }
                n6 = n3;
            }
            ++n3;
            n4 = n7;
            n5 = n6;
        }
    }
}

