/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ep")
public class class289
extends class61 {
    @ObfuscatedName(value="fe")
    @ObfuscatedSignature(descriptor="Lpc;")
    static Bounds field5970;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1670222699)
    public int field5972;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1817933741)
    public int field5973;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=1933413917)
    public int field5974;

    @ObfuscatedName(value="bw")
    public boolean method10693(int n) {
        n = this.field5972 * -1545797309;
        return n * 1670222699 > 0;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V")
    public static void method10686(AbstractArchive object, int n) {
        FloorOverlayDefinition.field7101 = object;
        FloorOverlayDefinition.field7099 = new FloorOverlayDefinition[((AbstractArchive)object).getGroupFileCount(4)];
        n = 0;
        while (n < FloorOverlayDefinition.field7099.length) {
            object = FloorOverlayDefinition.field7101.takeFile(4, n);
            FloorOverlayDefinition.field7099[n] = new FloorOverlayDefinition();
            if (object != null) {
                FloorOverlayDefinition.field7099[n].method13279(new Buffer((byte[])object), n, (byte)94);
            }
            FloorOverlayDefinition.field7099[n].postDecode();
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lkc;Ljava/lang/String;Ljava/lang/String;I)[Lek;")
    public static class384[] method10684(AbstractArchive arrclass384, String string2, String string3, int n) {
        n = arrclass384.method6153(string2, -659062673);
        arrclass384 = Calendar.method6898((AbstractArchive)arrclass384, n, arrclass384.getFileId(n, string3));
        return arrclass384;
    }
}

