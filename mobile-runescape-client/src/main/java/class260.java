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

@ObfuscatedName(value="at")
public class class260
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lat;")
    public static final class260 field4452;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lat;")
    public static final class260 field4453;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lat;")
    static final class260 field4456;
    @ObfuscatedName(value="hx")
    @ObfuscatedGetter(intValue=1368503281)
    static int field4459;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lat;")
    public static final class260 field4454;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lat;")
    public static final class260 field4455;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lat;")
    public static final class260 field4457;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=192583007)
    public final int field4460;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-978015065)
    final int field4461;

    static {
        field4455 = new class260(4, 0);
        field4452 = new class260(0, 2);
        field4454 = new class260(3, 5);
        field4457 = new class260(5, 6);
        field4453 = new class260(1, 7);
        field4456 = new class260(2, 8);
    }

    class260(int n, int n2) {
        this.field4460 = n;
        this.field4461 = n2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field4461 * 1551252247);
        return by * -978015065;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lkc;IB)Lei;", garbageValue="67")
    public static IndexedSprite method7498(AbstractArchive object, int n) {
        if (Bounds.method7123((AbstractArchive)object, n)) {
            object = class63.method4017();
            return object;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;IZI)Lbf;")
    public static Frames method7497(AbstractArchive object, AbstractArchive abstractArchive, int n, boolean bl, int n2) {
        int[] arrn = ((AbstractArchive)object).getGroupFileIds(n);
        n2 = 0;
        boolean bl2 = true;
        while (true) {
            block6: {
                block5: {
                    block4: {
                        if (n2 >= arrn.length) break block4;
                        byte[] arrby = ((AbstractArchive)object).getFile(n, arrn[n2]);
                        if (arrby == null) break block5;
                        int n3 = arrby[0];
                        n3 = arrby[1] & 0xFF | (n3 & 0xFF) << 8;
                        arrby = bl ? abstractArchive.getFile(0, n3) : abstractArchive.getFile(n3, 0);
                        if (arrby != null) break block6;
                        break block5;
                    }
                    if (!bl2) {
                        return null;
                    }
                    try {
                        return new Frames((AbstractArchive)object, abstractArchive, n, bl);
                    }
                    catch (Exception exception) {
                        return null;
                    }
                }
                bl2 = false;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="di")
    static final void method7500(boolean bl, int n) {
        n = 0;
        while (true) {
            block5: {
                NPC nPC;
                block6: {
                    if (n >= Client.field4779) {
                        return;
                    }
                    nPC = Client.field4782[Client.field4783[n]];
                    if (nPC == null || !nPC.isVisible() || nPC.definition.field7178 != bl || !nPC.definition.method13355((byte)-5)) break block5;
                    int n2 = nPC.x >> 7;
                    int n3 = nPC.field7523 * -144332757 >> 7;
                    if (n2 < 0 || n2 >= 104 || n3 < 0 || n3 >= 104) break block5;
                    if (nPC.field7530 * 948551744 != 1 || (nPC.x & 0x7F) != 64 || (nPC.field7523 * -144332757 & 0x7F) != 64) break block6;
                    if (Client.field4840[n2][n3] == Client.field4844) break block5;
                    Client.field4840[n2][n3] = Client.field4844;
                }
                boolean bl2 = !nPC.definition.field7193;
                long l = TextureProvider.calculateTag(0, 0, 1, bl2, Client.field4783[n]);
                nPC.field7525 = Client.cycle;
                class64.field2460.drawEntity(WorldMapIcon_1.field5913 * 63889799, nPC.x, nPC.field7523 * -144332757, DevicePcmPlayerProvider.method11095(nPC.field7530 * 577769472 - 64 + nPC.x, nPC.field7523 * -144332757 + (nPC.field7530 * 577769472 - 64), WorldMapIcon_1.field5913 * 63889799, -1416385247), nPC.field7530 * 577769472 - 64 + 60, nPC, nPC.field7529, l, nPC.field7517);
            }
            ++n;
        }
    }
}

