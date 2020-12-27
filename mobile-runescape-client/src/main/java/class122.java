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

@ObfuscatedName(value="ig")
public class class122 {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1127879849)
    int field3398;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=678928839)
    int field3399;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2055869375)
    int field3400;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=2075456095)
    int field3402;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-865759343)
    int field3404;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=-1520323841)
    int field3405;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-593040523)
    int field3401;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1105893661)
    int field3403;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1858462951)
    int field3406;

    class122() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldv;", garbageValue="-832917082")
    @Export(value="SequenceDefinition_get")
    public static SequenceDefinition SequenceDefinition_get(int n) {
        Object object = SequenceDefinition.SequenceDefinition_cached;
        long l = n;
        if ((object = (SequenceDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = SequenceDefinition.SequenceDefinition_archive.takeFile(12, n);
        SequenceDefinition sequenceDefinition = new SequenceDefinition();
        if (object != null) {
            sequenceDefinition.decodeNext(new Buffer((byte[])object), 1012263624);
        }
        sequenceDefinition.postDecode();
        SequenceDefinition.SequenceDefinition_cached.put(sequenceDefinition, l);
        return sequenceDefinition;
    }

    @ObfuscatedName(value="cr")
    static final void method5420(String string2, boolean bl, int n) {
        if (Client.field4849) {
            Object object = Client.field4740.add((byte)-19);
            n = ((Bounds)object).method7124(1780914360) + 4;
            int n2 = ((Bounds)object).method7125(-1192715407) + 4;
            int n3 = Client.field4791.method13846(string2, 250);
            int n4 = Client.field4791.method13838(string2, 250) * 13;
            object = Client.field4740.field3567.vmethod11005();
            int n5 = n - 4;
            int n6 = n2 - 4;
            int n7 = n3 + 4 + 4;
            int n8 = n4 + 4 + 4;
            ((class72)object).vmethod10762(n5, n6, n7, n8, 0, (byte)-5);
            ((class72)object).method4255(n5, n6, n7, n8, 0xFFFFFF);
            Client.field4791.method13840(string2, n, n2, n3, n4, 0xFFFFFF, -1, 1, 1, 0, (class72)object);
            UserList.method3927(n5, n6, n7, n8, 1840086378);
            if (!bl) {
                ModeWhere.method11617(n, n2, n3, n4, 1884616040);
                return;
            }
            Client.field4740.field3567.vmethod11004(0, 0);
            return;
        }
    }

    @ObfuscatedName(value="bi")
    static void method5418(int n, int n2, int n3) {
        int[] arrn = new int[9];
        n3 = 0;
        while (true) {
            if (n3 >= arrn.length) {
                Scene.Scene_buildVisiblityMap(arrn, 500, 800, n * 334 / n2, 334);
                return;
            }
            int n4 = n3 * 32 + 15 + 128;
            int n5 = WorldMapLabelSize.method3706(n4);
            n4 = Rasterizer3D.Rasterizer3D_sine[n4];
            arrn[n3] = class37.method1077(n5, n2, (byte)83) * n4 >> 16;
            ++n3;
        }
    }
}

