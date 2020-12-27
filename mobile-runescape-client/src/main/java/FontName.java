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

@ObfuscatedName(value="lf")
@Implements(value="FontName")
public class FontName {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="FontName_plain12")
    public static final FontName FontName_plain12;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="FontName_verdana13")
    public static final FontName FontName_verdana13;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="[Lon;")
    @Export(value="JagexCache_idxFiles")
    public static BufferedFile[] JagexCache_idxFiles;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="FontName_verdana15")
    public static final FontName FontName_verdana15;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="FontName_bold12")
    public static final FontName FontName_bold12;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="FontName_plain11")
    public static final FontName FontName_plain11;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Llf;")
    @Export(value="FontName_verdana11")
    public static final FontName FontName_verdana11;
    @ObfuscatedName(value="aj")
    @Export(value="name")
    String name;

    static {
        FontName_plain11 = new FontName("p11_full");
        FontName_plain12 = new FontName("p12_full");
        FontName_bold12 = new FontName("b12_full");
        FontName_verdana11 = new FontName("verdana_11pt_regular");
        FontName_verdana13 = new FontName("verdana_13pt_regular");
        FontName_verdana15 = new FontName("verdana_15pt_regular");
    }

    FontName(String string2) {
        this.name = string2;
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(III[I[IIIIIIIIIB)V", garbageValue="6")
    static void method6386(int n, int n2, int n3, int[] arrn, int[] arrn2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        n2 = -n9;
        while (true) {
            if (n2 < 0) {
                n3 = -n8;
                n = n6;
            } else {
                return;
            }
            while (n3 < 0) {
                n6 = arrn2[n4];
                if (n6 != 0) {
                    n7 = arrn[n];
                    n5 = n7 + n6;
                    n6 = (n6 & 0xFF00FF) + (n7 & 0xFF00FF);
                    n6 = (n5 - n6 & 0x10000) + (0x1000100 & n6);
                    arrn[n] = n6 - (n6 >>> 8) | n5 - n6;
                    ++n;
                } else {
                    ++n;
                }
                ++n3;
                ++n4;
            }
            n6 = n10 + n;
            n4 += n11;
            ++n2;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldc;", garbageValue="-2003431695")
    public static ItemContainer method6387(int n) {
        Object object = ItemContainer.itemContainers;
        long l = n;
        if ((object = (ItemContainer)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = ItemContainer.FloorOverlayDefinition_archive.takeFile(14, n);
        ItemContainer itemContainer = new ItemContainer();
        if (object != null) {
            itemContainer.method12848(new Buffer((byte[])object), (byte)1);
        }
        ItemContainer.itemContainers.put(itemContainer, l);
        return itemContainer;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;Lpy;I)Lpy;")
    static final IterableNodeHashTable method6390(Buffer buffer, IterableNodeHashTable object, int n) {
        int n2 = buffer.method11650(296469928);
        IterableNodeHashTable iterableNodeHashTable = object;
        if (object == null) {
            iterableNodeHashTable = new IterableNodeHashTable(class152.method6233(n2));
        }
        n = 0;
        while (n < n2) {
            int n3 = buffer.method11650(-392733221);
            boolean bl = true;
            if (n3 != 1) {
                bl = false;
            }
            n3 = buffer.method11649(517325495);
            object = !bl ? new IntegerNode(buffer.method11670(1604085085)) : new ObjectNode(buffer.method11664(-2026220044));
            iterableNodeHashTable.put((Node)object, n3);
            ++n;
        }
        return iterableNodeHashTable;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)[Llf;", garbageValue="1474579567")
    public static FontName[] method6391() {
        FontName fontName = FontName_verdana11;
        FontName fontName2 = FontName_verdana15;
        FontName fontName3 = FontName_plain11;
        FontName fontName4 = FontName_bold12;
        FontName fontName5 = FontName_plain12;
        FontName fontName6 = FontName_verdana13;
        return new FontName[]{fontName, fontName2, fontName3, fontName4, fontName5, fontName6};
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lbd;I)V")
    static final void method6392(Rasterizer3D rasterizer3D, int n) {
        if (!class33.field534) {
            int n2 = Scene.field393;
            int n3 = Scene.field386;
            int n4 = Scene.field384;
            int n5 = Scene.field383;
            int n6 = (class33.field537 - rasterizer3D.field352) * 50 / rasterizer3D.field354;
            int n7 = (class33.field527 - rasterizer3D.field357) * 50 / rasterizer3D.field354;
            int n8 = (class33.field537 - rasterizer3D.field352) * 3500 / rasterizer3D.field354;
            int n9 = (class33.field527 - rasterizer3D.field357) * 3500 / rasterizer3D.field354;
            n = class79.method4566(n7, 50, n3, n2);
            int n10 = class279.method10390(n7, 50, n3, n2);
            n7 = class79.method4566(n9, 3500, n3, n2);
            n3 = class279.method10390(n9, 3500, n3, n2);
            n2 = WallDecoration.method864(n6, n10, n5, n4);
            n6 = class19.method565(n6, n10, n5, n4);
            n10 = WallDecoration.method864(n8, n3, n5, n4);
            n4 = class19.method565(n8, n3, n5, n4);
            class323.field6263 = (n2 + n10) / 2;
            class33.field531 = (n7 + n) / 2;
            Skeleton.field4648 = (n6 + n4) / 2;
            class33.field523 = (n10 - n2) / 2;
            class33.field525 = (n7 - n) / 2;
            class244.field4268 = (n4 - n6) / 2;
            class330.field6292 = Math.abs(class33.field523);
            Coord.field19 = Math.abs(class33.field525);
            class33.field538 = Math.abs(class244.field4268);
            return;
        }
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Lde;B)Z")
    static boolean method6393(ObjectDefinition object, byte by) {
        block5: {
            if (((ObjectDefinition)object).transforms == null) {
                by = (byte)(((ObjectDefinition)object).mapIconId * 37113147);
                if (by * -975764493 != -1) {
                    return true;
                }
            } else {
                object = ((ObjectDefinition)object).transforms;
                for (by = 0; by < ((Object)object).length; by = (byte)(by + 1)) {
                    if (AbstractWorldMapIcon.getObjectDefinition((int)object[by]).mapIconId == -1) {
                        continue;
                    }
                    break block5;
                }
            }
            return false;
        }
        return true;
    }
}

