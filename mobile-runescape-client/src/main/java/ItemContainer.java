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

@ObfuscatedName(value="dc")
@Implements(value="ItemContainer")
public class ItemContainer
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="itemContainers")
    static EvictingDualNodeHashTable itemContainers = new EvictingDualNodeHashTable(64, null);
    @ObfuscatedName(value="aj")
    static int[] field6849;
    @ObfuscatedName(value="gy")
    static int[][] field6853;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="FloorOverlayDefinition_archive")
    static AbstractArchive FloorOverlayDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=601881027)
    public int field6854;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=31189551)
    public int field6855;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-442566429)
    public int field6856;

    ItemContainer() {
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;B)V")
    void method12848(Buffer buffer, byte by) {
        while ((by = (byte)buffer.method11650(1826101524)) != 0) {
            this.method12853(buffer, by);
        }
        return;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;IB)V", garbageValue="-100")
    void method12853(Buffer buffer, int n) {
        if (n != 1) {
            return;
        }
        this.field6855 = buffer.method11637(-1174486251);
        this.field6856 = buffer.method11650(-2051123275);
        this.field6854 = buffer.method11650(2017337103);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Lev;", garbageValue="-1913265421")
    @Export(value="getNpcDefinition")
    public static NPCDefinition getNpcDefinition(int n) {
        Object object = NPCDefinition.NpcDefinition_cached;
        long l = n;
        if ((object = (NPCDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = NPCDefinition.NpcDefinition_archive.takeFile(9, n);
        NPCDefinition nPCDefinition = new NPCDefinition();
        nPCDefinition.id = n;
        if (object != null) {
            nPCDefinition.decodeNext(new Buffer((byte[])object), 1810818161);
        }
        nPCDefinition.postDecode();
        NPCDefinition.NpcDefinition_cached.put(nPCDefinition, l);
        return nPCDefinition;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(ZZI)V", garbageValue="274712964")
    static void method12842(boolean bl, boolean bl2) {
        ParamDefinition.method13223("", "Connecting to server...", "");
        class119.field3363.method5321(bl);
        class297.method10926(bl2);
        class180.method6606(20, (byte)25);
    }

    @ObfuscatedName(value="bg")
    static final byte[] method12844(byte[] arrby, int n) {
        Buffer buffer = new Buffer(arrby);
        n = buffer.method11650(-287117912);
        int n2 = buffer.method11670(1604085085);
        if (n2 < 0 || AbstractArchive.field3644 != 0 && n2 > AbstractArchive.field3644) {
            throw new RuntimeException();
        }
        if (n != 0) {
            int n3 = buffer.method11670(1604085085);
            if (n3 < 0 || AbstractArchive.field3644 != 0 && n3 > AbstractArchive.field3644) {
                throw new RuntimeException();
            }
            byte[] arrby2 = new byte[n3];
            if (n != 1) {
                AbstractArchive.gzipDecompressor.decompress(buffer, arrby2);
                return arrby2;
            }
            BZip2Decompressor.BZip2Decompressor_decompress(arrby2, n3, arrby, n2, 9);
            return arrby2;
        }
        arrby = new byte[n2];
        buffer.method11671(arrby, 0, n2, -602034487);
        return arrby;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lhr;B)V", garbageValue="90")
    public static final void method12839(class113 class1132) {
        class8.field68 = class1132;
    }

    @ObfuscatedName(value="cd")
    static int method12845(float f, short s) {
        float f2 = Client.field4813;
        s = (short)Client.field4808;
        return (int)(f2 + (float)(s * -1909482361) * f) & 0x7FF;
    }
}

