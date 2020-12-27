/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ju")
@Implements(value="Messages")
public class Messages {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lpy;")
    @Export(value="Messages_hashTable")
    static final IterableNodeHashTable Messages_hashTable;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lfl;")
    @Export(value="Messages_queue")
    static final IterableDualNodeQueue Messages_queue;
    @ObfuscatedName(value="ak")
    @Export(value="Messages_channels")
    static final Map Messages_channels;
    @ObfuscatedName(value="ax")
    @Export(value="Messages_count")
    static int Messages_count = 0;

    static {
        Messages_channels = new HashMap();
        Messages_hashTable = new IterableNodeHashTable(1024);
        Messages_queue = new IterableDualNodeQueue();
        Messages_count = 0;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="([BZB)Ljava/lang/Object;", garbageValue="126")
    public static Object method6057(byte[] arrby, boolean bl) {
        if (arrby == null) {
            return null;
        }
        if (arrby.length <= 136) {
            return arrby;
        }
        DirectByteArrayCopier directByteArrayCopier = new DirectByteArrayCopier();
        ((AbstractByteArrayCopier)directByteArrayCopier).set(arrby);
        return directByteArrayCopier;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="-1899305456")
    public static void method6067(Collection collection) {
        collection.add(Widget.Widget_cachedSprites);
        collection.add(Widget.field4472);
        collection.add(Widget.Widget_cachedFonts);
        collection.add(Widget.field4474);
    }

    @ObfuscatedName(value="dq")
    @ObfuscatedSignature(descriptor="(Lhv;ZB)V")
    static void method6082(Player player, boolean bl, byte by) {
        long l;
        block9: {
            block11: {
                block10: {
                    int n;
                    block8: {
                        block7: {
                            if (player == null || !player.isVisible() || player.isHidden) break block7;
                            player.isUnanimated = false;
                            if ((Client.isLowDetail && Players.Players_count * 527068741 > 50 || Players.Players_count * 527068741 > 200) && bl && player.movementSequence == player.idleSequence) {
                                player.isUnanimated = true;
                            }
                            by = (byte)(player.x >> 7);
                            n = player.field7523 * -144332757 >> 7;
                            if (by >= 0 && by < 104 && n >= 0 && n < 104) break block8;
                        }
                        return;
                    }
                    l = TextureProvider.calculateTag(0, 0, 0, false, player.field7844);
                    if (player.field7862 != null && Client.cycle >= player.field7843 && Client.cycle < player.field7847) break block9;
                    if ((player.x & 0x7F) != 64 || (player.field7523 * -144332757 & 0x7F) != 64) break block10;
                    if (Client.field4840[by][n] == Client.field4844) break block11;
                    Client.field4840[by][n] = Client.field4844;
                }
                player.field7842 = DevicePcmPlayerProvider.method11095(player.x, player.field7523 * -144332757, WorldMapIcon_1.field5913 * 63889799, -1416385247);
                player.field7525 = Client.cycle;
                class64.field2460.drawEntity(WorldMapIcon_1.field5913 * 63889799, player.x, player.field7523 * -144332757, player.field7842, 60, player, player.field7529, l, player.field7517);
                return;
            }
            return;
        }
        player.isUnanimated = false;
        player.field7842 = DevicePcmPlayerProvider.method11095(player.x, player.field7523 * -144332757, WorldMapIcon_1.field5913 * 63889799, -1416385247);
        player.field7525 = Client.cycle;
        class64.field2460.addNullableObject(WorldMapIcon_1.field5913 * 63889799, player.x, player.field7523 * -144332757, player.field7842, 60, player, player.field7529, l, player.field7857, player.field7855, player.field7854, player.field7865);
    }
}

