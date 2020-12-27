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

@ObfuscatedName(value="bf")
@Implements(value="Frames")
public class Frames
extends DualNode {
    @ObfuscatedName(value="ay")
    public static String field6598;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="[Lbg;")
    @Export(value="frames")
    Animation[] frames;

    @ObfuscatedSignature(descriptor="(Lkc;Lkc;IZ)V")
    Frames(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, int n, boolean bl) {
        NodeDeque nodeDeque = new NodeDeque();
        this.frames = new Animation[abstractArchive.getGroupFileCount(n)];
        int[] arrn = abstractArchive.getGroupFileIds(n);
        int n2 = 0;
        while (true) {
            Object object;
            Skeleton skeleton;
            int n3;
            byte[] arrby;
            block4: {
                if (n2 >= arrn.length) {
                    return;
                }
                arrby = abstractArchive.takeFile(n, arrn[n2]);
                Skeleton skeleton2 = null;
                n3 = (arrby[0] & 0xFF) << 8 | arrby[1] & 0xFF;
                skeleton = (Skeleton)nodeDeque.last();
                while (true) {
                    object = skeleton2;
                    if (skeleton == null) break block4;
                    if (n3 == skeleton.id) break;
                    skeleton = (Skeleton)nodeDeque.previous();
                }
                object = skeleton;
            }
            skeleton = object;
            if (object == null) {
                object = !bl ? (Object)abstractArchive2.getFile(n3, 0) : (Object)abstractArchive2.getFile(0, n3);
                skeleton = new Skeleton(n3, (byte[])object);
                nodeDeque.method4082(skeleton);
            }
            this.frames[arrn[n2]] = new Animation(arrby, skeleton);
            ++n2;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-908474583")
    @Export(value="hasAlphaTransform")
    public boolean hasAlphaTransform(int n) {
        boolean bl = this.frames[n].hasAlphaTransform;
        return bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;Lkc;B)V", garbageValue="-60")
    public static void method12203(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3) {
        VarbitDefinition.field6826 = abstractArchive;
        VarbitDefinition.VarbitDefinition_archive = abstractArchive2;
        VarbitDefinition.HitSplatDefinition_fontsArchive = abstractArchive3;
    }

    @ObfuscatedName(value="cq")
    static int method12205(float f, int n) {
        float f2 = Client.field4817;
        n = Client.field4812;
        if ((n = (int)(f2 * f + (float)(n * 1331539209))) < 128) {
            return 128;
        }
        if (n > 383) {
            return 383;
        }
        return n;
    }
}

