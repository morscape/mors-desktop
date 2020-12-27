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
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="db")
@Implements(value="VarbitDefinition")
public class VarbitDefinition
extends DualNode {
    @ObfuscatedName(value="um")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field6831;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="VarbitDefinition_archive")
    static AbstractArchive VarbitDefinition_archive;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6824;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lga;")
    @Export(value="VarbitDefinition_cached")
    static EvictingDualNodeHashTable VarbitDefinition_cached;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="HitSplatDefinition_fontsArchive")
    static AbstractArchive HitSplatDefinition_fontsArchive;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6826;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6828;
    @ObfuscatedName(value="da")
    @ObfuscatedGetter(intValue=-1785535847)
    @Export(value="port1")
    static int port1 = 0;
    @ObfuscatedName(value="ac")
    public int[] field6832;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-168128543)
    public int field6834 = 0;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=-1883831779)
    public int field6835 = 0xFFFFFF;
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=963496239)
    public int field6836 = 70;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-372731229)
    public int field6837 = 0;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=1009354293)
    int field6838 = -1;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=489568823)
    @Export(value="fontId")
    int fontId = -1;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=-1179157061)
    int field6840 = -1;
    @ObfuscatedName(value="au")
    @ObfuscatedGetter(intValue=932306939)
    int field6842 = -1;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=2111622341)
    int field6844 = -1;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=950555967)
    int field6845 = -1;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-1592788279)
    public int field6846 = 0;
    @ObfuscatedName(value="bp")
    @ObfuscatedGetter(intValue=261104579)
    int field6847 = -1;
    @ObfuscatedName(value="ad")
    @ObfuscatedGetter(intValue=1386509341)
    public int field6833 = -1;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(intValue=172805201)
    public int field6841 = -1;
    @ObfuscatedName(value="av")
    String field6843 = "";

    static {
        field6828 = new EvictingDualNodeHashTable(64, null);
        field6824 = new EvictingDualNodeHashTable(64, null);
        VarbitDefinition_cached = new EvictingDualNodeHashTable(20, null);
    }

    VarbitDefinition() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)Lek;", garbageValue="-1087390145")
    public class384 method12806() {
        if (this.field6840 >= 0) {
            class384 class3842 = (class384)field6824.get(this.field6840);
            if (class3842 != null) {
                return class3842;
            }
            class3842 = class171.method6496(VarbitDefinition_archive, this.field6840, 0);
            if (class3842 != null) {
                field6824.put(class3842, this.field6840);
            }
            return class3842;
        }
        return null;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(B)Loc;", garbageValue="-68")
    @Export(value="transform")
    public class399 transform() {
        if (this.fontId != -1) {
            class399 class3992 = (class399)VarbitDefinition_cached.get(this.fontId);
            if (class3992 != null) {
                return class3992;
            }
            class3992 = class274.method7826(VarbitDefinition_archive, HitSplatDefinition_fontsArchive, this.fontId, 0);
            if (class3992 != null) {
                VarbitDefinition_cached.put(class3992, this.fontId);
            }
            return class3992;
        }
        return null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Ldb;")
    public final VarbitDefinition method12812(int n) {
        n = this.field6842 != -1 ? class285.method10473(this.field6842, -286764342) : (this.field6847 != -1 ? Varps.Varps_main[this.field6847] : -1);
        n = n >= 0 && n < this.field6832.length - 1 ? this.field6832[n] : this.field6832[this.field6832.length - 1];
        if (n == -1) {
            return null;
        }
        VarbitDefinition varbitDefinition = class6.method74(n);
        return varbitDefinition;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)Lek;", garbageValue="-1222692094")
    public class384 method12814() {
        if (this.field6845 >= 0) {
            class384 class3842 = (class384)field6824.get(this.field6845);
            if (class3842 != null) {
                return class3842;
            }
            class3842 = class171.method6496(VarbitDefinition_archive, this.field6845, 0);
            if (class3842 != null) {
                field6824.put(class3842, this.field6845);
            }
            return class3842;
        }
        return null;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Lek;", garbageValue="-631034457")
    public class384 method12815() {
        if (this.field6844 >= 0) {
            class384 class3842 = (class384)field6824.get(this.field6844);
            if (class3842 != null) {
                return class3842;
            }
            class3842 = class171.method6496(VarbitDefinition_archive, this.field6844, 0);
            if (class3842 != null) {
                field6824.put(class3842, this.field6844);
            }
            return class3842;
        }
        return null;
    }

    @ObfuscatedName(value="as")
    public String method12819(int n, int n2) {
        String string2 = this.field6843;
        while ((n2 = string2.indexOf("%1")) >= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, n2));
            stringBuilder.append(class65.intToString(n, false));
            stringBuilder.append(string2.substring(n2 + 2));
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    @Export(value="decodeNext")
    void decodeNext(Buffer buffer, int n) {
        while ((n = buffer.method11650(51927443)) != 0) {
            this.method12823(buffer, n, (byte)-37);
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lmi;IB)V")
    void method12823(Buffer buffer, int n, byte by) {
        block8: {
            block9: {
                block10: {
                    block11: {
                        block12: {
                            block13: {
                                block14: {
                                    block15: {
                                        block16: {
                                            block17: {
                                                block18: {
                                                    block19: {
                                                        block20: {
                                                            block21: {
                                                                int n2;
                                                                block23: {
                                                                    block22: {
                                                                        if (n == 1) break block8;
                                                                        if (n == 2) break block9;
                                                                        if (n == 3) break block10;
                                                                        if (n == 4) break block11;
                                                                        if (n == 5) break block12;
                                                                        if (n == 6) break block13;
                                                                        if (n == 7) break block14;
                                                                        if (n == 8) break block15;
                                                                        if (n == 9) break block16;
                                                                        if (n == 10) break block17;
                                                                        by = 0;
                                                                        if (n == 11) break block18;
                                                                        if (n == 12) break block19;
                                                                        if (n == 13) break block20;
                                                                        if (n == 14) break block21;
                                                                        if (n != 17 && n != 18) return;
                                                                        this.field6842 = buffer.method11637(-459947333);
                                                                        if (this.field6842 == 65535) {
                                                                            this.field6842 = -1;
                                                                        }
                                                                        this.field6847 = buffer.method11637(1996571944);
                                                                        if (this.field6847 == 65535) {
                                                                            this.field6847 = -1;
                                                                        }
                                                                        if (n != 18) break block22;
                                                                        n = n2 = buffer.method11637(-860335542);
                                                                        if (n2 != 65535) break block23;
                                                                    }
                                                                    n = -1;
                                                                }
                                                                n2 = buffer.method11650(1950861544);
                                                                this.field6832 = new int[n2 + 2];
                                                                while (true) {
                                                                    if (by > n2) {
                                                                        this.field6832[n2 + 1] = n;
                                                                        return;
                                                                    }
                                                                    this.field6832[by] = buffer.method11637(902689788);
                                                                    if (this.field6832[by] == 65535) {
                                                                        this.field6832[by] = -1;
                                                                    }
                                                                    by = (byte)(by + 1);
                                                                }
                                                            }
                                                            this.field6841 = buffer.method11637(-1358239392);
                                                            return;
                                                        }
                                                        this.field6834 = buffer.method11635(1277637855);
                                                        return;
                                                    }
                                                    this.field6833 = buffer.method11650(758646948);
                                                    return;
                                                }
                                                this.field6841 = 0;
                                                return;
                                            }
                                            this.field6846 = buffer.method11635(1277637855);
                                            return;
                                        }
                                        this.field6836 = buffer.method11637(-873131003);
                                        return;
                                    }
                                    this.field6843 = buffer.method11662(166551522);
                                    return;
                                }
                                this.field6837 = buffer.method11635(1277637855);
                                return;
                            }
                            this.field6838 = buffer.method11680((byte)-59);
                            return;
                        }
                        this.field6844 = buffer.method11680((byte)18);
                        return;
                    }
                    this.field6840 = buffer.method11680((byte)29);
                    return;
                }
                this.field6845 = buffer.method11680((byte)24);
                return;
            }
            this.field6835 = buffer.method11649(1700235910);
            return;
        }
        this.fontId = buffer.method11680((byte)-67);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(B)Lek;", garbageValue="81")
    public class384 method12807() {
        if (this.field6838 >= 0) {
            class384 class3842 = (class384)field6824.get(this.field6838);
            if (class3842 != null) {
                return class3842;
            }
            class3842 = class171.method6496(VarbitDefinition_archive, this.field6838, 0);
            if (class3842 != null) {
                field6824.put(class3842, this.field6838);
            }
            return class3842;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="eu")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="409786742")
    static final void method12804(boolean bl) {
        Projectile.method14468();
        Object object = Client.field4781;
        ((PacketWriter)object).pendingWrites -= -1;
        if (Client.field4781.pendingWrites < 50 && !bl) {
            return;
        }
        Client.field4781.pendingWrites = 0;
        if (!Client.field4793 && Client.field4781.getSocket() != null) {
            object = class327.newRunException(ClientPacket.field6446, Client.field4781.field3495);
            Client.field4781.setSocket((PacketBufferNode)object);
            try {
                Client.field4781.flush();
                return;
            }
            catch (IOException iOException) {}
            Client.field4793 = true;
        }
    }

    @ObfuscatedName(value="ab")
    public static int method12797(CharSequence charSequence, int n) {
        int n2 = charSequence.length();
        n = 0;
        int n3 = 0;
        while (n < n2) {
            char c = charSequence.charAt(n);
            n3 = c + ((n3 << 5) - n3);
            ++n;
        }
        return n3;
    }
}

