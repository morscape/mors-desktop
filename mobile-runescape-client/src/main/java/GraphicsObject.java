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

@ObfuscatedName(value="id")
@Implements(value="GraphicsObject")
public final class GraphicsObject
extends Entity {
    @ObfuscatedName(value="cs")
    static boolean field7506;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=909198041)
    @Export(value="frameCycle")
    int frameCycle;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-1050607961)
    int field7509;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-643699983)
    int field7510;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Ldv;")
    SequenceDefinition field7512;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-95037147)
    @Export(value="frame")
    int frame;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-77648591)
    int field7515;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1359558703)
    int field7511;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=2088471079)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=185432075)
    int field7516;
    @ObfuscatedName(value="ab")
    @Export(value="isFinished")
    boolean isFinished;

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        DualNode dualNode = class90.SpotAnimationDefinition_get(this.id);
        dualNode = !this.isFinished ? dualNode.method13323(this.frame, (byte)30) : dualNode.method13323(-1, (byte)57);
        if (dualNode == null) {
            return null;
        }
        return dualNode;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1965567008")
    @Export(value="advance")
    final void advance(int n) {
        if (!this.isFinished) {
            this.frameCycle += n;
            while (this.frameCycle > this.field7512.frameLengths[this.frame]) {
                this.frameCycle -= this.field7512.frameLengths[this.frame];
                ++this.frame;
                if (this.frame < this.field7512.field7058.length) continue;
                this.isFinished = true;
                break;
            }
            return;
        }
    }

    @ObfuscatedName(value="as")
    static int method14439(CharSequence charSequence, int n, boolean bl, int n2) {
        if (n < 2 || n > 36) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append(n);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
        int n3 = charSequence.length();
        int n4 = 0;
        n2 = 0;
        int n5 = 0;
        boolean bl2 = false;
        while (true) {
            block17: {
                int n6;
                block15: {
                    block16: {
                        if (n4 >= n3) {
                            if (n2 != 0) {
                                return n5;
                            }
                            throw new NumberFormatException();
                        }
                        n6 = charSequence.charAt(n4);
                        if (n4 != 0) break block15;
                        if (n6 != 45) break block16;
                        bl2 = true;
                        break block17;
                    }
                    if (n6 == 43) break block17;
                }
                if (n6 >= 48 && n6 <= 57) {
                    n2 = n6 - 48;
                } else if (n6 >= 65 && n6 <= 90) {
                    n2 = n6 - 55;
                } else if (n6 >= 97 && n6 <= 122) {
                    n2 = n6 - 87;
                } else {
                    throw new NumberFormatException();
                }
                if (n2 >= n) break;
                n6 = n2;
                if (bl2) {
                    n6 = -n2;
                }
                if (n5 != (n2 = n5 * n + n6) / n) {
                    throw new NumberFormatException();
                }
                n5 = n2;
                n2 = 1;
            }
            ++n4;
        }
        throw new NumberFormatException();
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(ILkc;Ljava/lang/String;Ljava/lang/String;IZB)V")
    public static void method14440(int n, AbstractArchive abstractArchive, String string2, String string3, int n2, boolean bl, byte by) {
        by = (byte)abstractArchive.method6153(string2, -1129771582);
        class35.method1014(n, abstractArchive, by, abstractArchive.getFileId(by, string3), n2, bl);
    }
}

