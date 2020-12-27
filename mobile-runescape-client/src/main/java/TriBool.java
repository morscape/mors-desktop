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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="eg")
@Implements(value="TriBool")
public class TriBool {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Leg;")
    @Export(value="TriBool_true")
    public static final TriBool TriBool_true;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Leg;")
    @Export(value="TriBool_false")
    public static final TriBool TriBool_false;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Leg;")
    public static final TriBool field2427;

    static {
        field2427 = new TriBool();
        TriBool_true = new TriBool();
        TriBool_false = new TriBool();
    }

    TriBool() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="1387303739")
    public static void method3902(Collection collection) {
        collection.add(WorldMapElement.WorldMapElement_cachedSprites);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lkv;IIIBZI)V", garbageValue="-2134175786")
    @Export(value="requestNetFile")
    static void requestNetFile(Archive archive, int n, int n2, int n3, byte by, boolean bl) {
        long l = (n << 16) + n2;
        if ((NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(l) == null) {
            if ((NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(l) == null) {
                NetFileRequest netFileRequest = (NetFileRequest)NetCache.NetCache_pendingWrites.get(l);
                if (netFileRequest != null) {
                    if (!bl) {
                        return;
                    }
                } else {
                    if (bl || (NetFileRequest)NetCache.NetCache_pendingResponses.get(l) == null) {
                        netFileRequest = new NetFileRequest();
                        netFileRequest.archive = archive;
                        netFileRequest.crc = n3;
                        netFileRequest.padding = by;
                        if (!bl) {
                            NetCache.NetCache_pendingWritesQueue.addFirst(netFileRequest);
                            NetCache.NetCache_pendingWrites.put(netFileRequest, l);
                            ++NetCache.NetCache_pendingWritesCount;
                            return;
                        }
                        NetCache.NetCache_pendingPriorityWrites.put(netFileRequest, l);
                        --NetCache.field3714;
                        return;
                    }
                    return;
                }
                netFileRequest.removeDual();
                NetCache.NetCache_pendingPriorityWrites.put(netFileRequest, l);
                --NetCache.NetCache_pendingWritesCount;
                --NetCache.field3714;
                return;
            }
            return;
        }
    }
}

