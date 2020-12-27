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

@ObfuscatedName(value="dz")
@Implements(value="ParamDefinition")
public class ParamDefinition
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="ParamDefinition_cached")
    static EvictingDualNodeHashTable ParamDefinition_cached = new EvictingDualNodeHashTable(64, null);
    @ObfuscatedName(value="ni")
    @ObfuscatedSignature(descriptor="Ljo;")
    static class144 field7083;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="ParamDefinition_archive")
    static AbstractArchive ParamDefinition_archive;
    @ObfuscatedName(value="hl")
    @ObfuscatedGetter(intValue=-2018442427)
    static int field7082;
    @ObfuscatedName(value="ah")
    public String field7084;
    @ObfuscatedName(value="as")
    @Export(value="autoDisable")
    boolean autoDisable = true;
    @ObfuscatedName(value="ai")
    char field7085;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1175006727)
    public int field7087;

    ParamDefinition() {
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lmi;II)V", garbageValue="1927158090")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        if (n != 1) {
            if (n != 2) {
                if (n != 4) {
                    if (n != 5) {
                        return;
                    }
                    this.field7084 = buffer.method11664(-1958391743);
                    return;
                }
                this.autoDisable = false;
                return;
            }
            this.field7087 = buffer.method11670(1604085085);
            return;
        }
        this.field7085 = Language.method11575(buffer.method11636(1913931020), (byte)-89);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1455359389")
    @Export(value="postDecode")
    void postDecode() {
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    void method13233(Buffer buffer, int n) {
        while ((n = buffer.method11650(826949188)) != 0) {
            this.decodeNext(buffer, n);
        }
        return;
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)Lio;", garbageValue="1826846699")
    static ArchiveLoader method13221() {
        if (Client.archiveLoaders != null && Client.field4984 < Client.archiveLoaders.size()) {
            ArchiveLoader archiveLoader = (ArchiveLoader)Client.archiveLoaders.get(Client.field4984);
            return archiveLoader;
        }
        return null;
    }

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="903100959")
    static void method13223(String string2, String string3, String string4) {
        Login.Login_response1 = string2;
        Login.Login_response2 = string3;
        Login.Login_response3 = string4;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lcp;IIILcw;I)Z")
    static final boolean method13222(Model model, int n, int n2, int n3, class47 class472, int n4) {
        if (AbstractArchive.method6133()) {
            FontName.method6392(class472.field2338, -1285291864);
            int n5 = model.xMid;
            int n6 = model.yMid;
            int n7 = model.zMid;
            n4 = model.xMidOffset;
            int n8 = model.yMidOffset;
            int n9 = model.zMidOffset;
            n = class323.field6263 - (n5 + n);
            n2 = class33.field531 - (n6 + n2);
            n3 = Skeleton.field4648 - (n3 + n7);
            if (Math.abs(n) <= n4 + class330.field6292) {
                if (Math.abs(n2) <= n8 + Coord.field19) {
                    if (Math.abs(n3) <= n9 + class33.field538) {
                        if (Math.abs(n3 * class33.field525 - n2 * class244.field4268) <= n8 * class33.field538 + n9 * Coord.field19) {
                            if (Math.abs(class244.field4268 * n - n3 * class33.field523) <= n4 * class33.field538 + n9 * class330.field6292) {
                                return (n = Math.abs(n2 * class33.field523 - class33.field525 * n)) <= (n3 = class330.field6292 * -1827621273) * n8 * 854459735 + n4 * (n2 = Coord.field19 * -1700629437) * 1834907755;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}

