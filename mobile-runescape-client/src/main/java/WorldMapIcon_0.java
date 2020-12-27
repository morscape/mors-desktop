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
import java.util.Collection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="df")
@Implements(value="WorldMapIcon_0")
public class WorldMapIcon_0
extends AbstractWorldMapIcon {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=476799979)
    @Export(value="element")
    final int element;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1020553255)
    final int field5907;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-1733774537)
    final int field5908;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lcm;")
    @Export(value="label")
    final class42 label;

    @ObfuscatedSignature(descriptor="(Laf;Laf;ILcm;)V")
    WorldMapIcon_0(Coord object, Coord coord, int n, class42 class422) {
        super((Coord)object, coord);
        this.element = n;
        this.label = class422;
        object = class297.WorldMapElement_get(this.vmethod10428(-1726710390)).method12952(false, (byte)-73);
        if (object == null) {
            this.field5907 = 0;
            this.field5908 = 0;
            return;
        }
        this.field5907 = ((class384)object).field7125;
        this.field5908 = ((class384)object).field7127;
    }

    @Override
    @ObfuscatedName(value="ae")
    public int vmethod10428(int n) {
        n = this.element * 1374923971;
        return n * 476799979;
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)Lcm;", garbageValue="-85")
    @Export(value="getLabel")
    class42 getLabel() {
        class42 class422 = this.label;
        return class422;
    }

    @ObfuscatedName(value="ae")
    static void method10404(int n, int n2, byte by) {
        int[] arrn = new int[4];
        int[] arrn2 = new int[4];
        int n3 = 0;
        arrn[0] = n;
        arrn2[0] = n2;
        by = 1;
        n2 = n3;
        while (true) {
            if (n2 >= 4) {
                class121.field3377 = arrn;
                class121.field3384 = arrn2;
                Tile.sortWorlds(class121.field3380, 0, class121.field3380.length - 1, class121.field3377, class121.field3384);
                return;
            }
            n3 = by;
            if (n != class121.field3377[n2]) {
                arrn[by] = class121.field3377[n2];
                arrn2[by] = class121.field3384[n2];
                n3 = by + 1;
            }
            ++n2;
            by = (byte)n3;
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="69")
    static void method10405() {
        Login.currentLoginField = 0;
        WallDecoration.method863(Login.currentLoginField);
        Coord.method38(Login.currentLoginField);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="2120583563")
    public static void method10406(Collection collection) {
        collection.add(class379.field7073);
    }
}

