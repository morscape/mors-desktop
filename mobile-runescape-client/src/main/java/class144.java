/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.jagex3.client.input.softkeyboard.ax;
import java.io.EOFException;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jo")
public class class144 {
    @Deprecated
    @ObfuscatedName(value="ah")
    String[] field3596;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(longValue=-5870036351335226661L)
    long field3598;
    @ObfuscatedName(value="as")
    boolean field3599;
    @ObfuscatedName(value="ai")
    boolean[] field3597;
    @ObfuscatedName(value="ax")
    Map field3600;

    class144() {
        int n = 0;
        this.field3599 = false;
        int n2 = class326.field6282.getGroupFileCount(19);
        this.field3600 = new HashMap();
        this.field3597 = new boolean[n2];
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                n3 = n;
                if (class326.field6282.method11560(15)) {
                    n3 = class326.field6282.getGroupFileCount(15);
                }
                this.field3596 = new String[n3];
                this.method5997(1177767593);
                return;
            }
            VarcInt varcInt = FaceNormal.method845(n3);
            this.field3597[n3] = varcInt.persist;
            ++n3;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aa")
    void method5996(int var1_1) {
        var4_2 = this.getPreferencesFile(true);
        try {
            var5_5 = this.field3600.entrySet().iterator();
            var1_1 = 3;
            var2_8 = 0;
        }
        catch (Throwable var5_6) {
            try {
                var4_2.close();
            }
            catch (Exception var4_4) {
                throw var5_6;
            }
            throw var5_6;
            catch (Exception var5_7) {}
            var4_2.close();
            ** GOTO lbl47
        }
        while (true) {
            if (var5_5.hasNext()) {
                var6_10 = var5_5.next();
                var3_9 = (Integer)var6_10.getKey();
                if (!this.field3597[var3_9]) continue;
                var6_10 = var6_10.getValue();
                var3_9 = var1_1 + 3;
                if (var6_10 instanceof Integer) {
                    var1_1 = var3_9 + 4;
                } else {
                    var1_1 = var3_9;
                    if (var6_10 instanceof String) {
                        var1_1 = var3_9 + class127.method5538((String)var6_10, (short)-3996);
                    }
                }
            } else {
                var5_5 = new Buffer(var1_1);
                var5_5.method11652(2, 422009005);
                var5_5.method11638(var2_8, (byte)-96);
                for (Map.Entry<K, V> var7_11 : this.field3600.entrySet()) {
                    var1_1 = (Integer)var7_11.getKey();
                    if (!this.field3597[var1_1]) continue;
                    var5_5.method11638(var1_1, (byte)-11);
                    var7_11 = var7_11.getValue();
                    var5_5.method11652(class358.method12142(var7_11.getClass(), (int)32519698).field6549, 422009005);
                    class358.method12143(var7_11, (Buffer)var5_5);
                }
                var4_2.write(var5_5.array, 0, var5_5.offset);
                try {
                    var4_2.close();
                }
                catch (Exception var4_3) {}
lbl47:
                // 3 sources

                this.field3599 = false;
                this.field3598 = class363.currentTimeMillis();
                return;
            }
            ++var2_8;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(ZI)Loe;", garbageValue="2131099836")
    @Export(value="getPreferencesFile")
    AccessFile getPreferencesFile(boolean bl) {
        AccessFile accessFile = class297.getPreferencesFile("2", class170.field3784.field6083, bl);
        return accessFile;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1790536623")
    boolean method6012() {
        boolean bl = this.field3599;
        return bl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ab")
    void method5997(int var1_1) {
        block25: {
            block24: {
                block26: {
                    block23: {
                        block22: {
                            block21: {
                                block20: {
                                    var5_2 = this.getPreferencesFile(false);
                                    var6_7 = new byte[(int)var5_2.length()];
                                    var1_1 = 0;
                                    while (var1_1 < ((byte[])var6_7).length) {
                                        var2_10 = var5_2.read((byte[])var6_7, var1_1, ((byte[])var6_7).length - var1_1);
                                        if (var2_10 == -1) throw new EOFException();
                                        var1_1 = var2_10 + var1_1;
                                    }
                                    var6_7 = new Buffer((byte[])var6_7);
                                    var1_1 = var6_7.array.length;
                                    var2_10 = var6_7.offset * 1897459807;
                                    if (var1_1 - var2_10 * 1792371615 >= 1) break block20;
                                    var5_2.close();
                                    return;
                                    {
                                        catch (Exception var5_3) {
                                            return;
                                        }
                                    }
                                }
                                var1_1 = var6_7.method11650(-1196603883);
                                if (var1_1 < 0 || var1_1 > 2) break block21;
                                if (var1_1 >= 2) {
                                    var2_10 = var6_7.method11637(-617917237);
                                    break block22;
                                }
                                var2_10 = var6_7.method11637(746942967);
                                var1_1 = 0;
                                break block23;
                            }
                            var5_2.close();
                            return;
                            {
                                catch (Exception var5_5) {
                                    return;
                                }
                            }
                            catch (Throwable var6_8) {
                                try {
                                    var5_2.close();
                                }
                                catch (Exception var5_6) {
                                    throw var6_8;
                                }
                                throw var6_8;
                                catch (Exception var6_9) {}
                                var5_2.close();
                                break block24;
                            }
                        }
                        for (var1_1 = 0; var1_1 < var2_10; ++var1_1) {
                            var3_11 = var6_7.method11637(929904564);
                            var4_13 = var6_7.method11650(1285683387);
                            var7_15 = ((class358)class90.method4803(class358.method12140(), var4_13, 2146246966)).method12157((Buffer)var6_7);
                            if (!this.field3597[var3_11]) continue;
                            this.field3600.put(var3_11, var7_15);
                        }
                        break block26;
                    }
lbl56:
                    // 2 sources

                    while (true) {
                        if (var1_1 < var2_10) {
                            var3_12 = var6_7.method11637(-1483472773);
                            var4_14 = var6_7.method11670(1604085085);
                            if (this.field3597[var3_12]) {
                                this.field3600.put(var3_12, var4_14);
                            }
                            break block25;
                        }
                        var2_10 = var6_7.method11637(-255910682);
                        for (var1_1 = 0; var1_1 < var2_10; ++var1_1) {
                            var6_7.method11637(-1423329228);
                            var6_7.method11664(-2140046701);
                        }
                        break;
                    }
                }
                try {
                    var5_2.close();
                }
                catch (Exception var5_4) {}
            }
            this.field3599 = false;
            return;
        }
        ++var1_1;
        ** while (true)
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(I)Lcom/jagex/jagex3/client/input/softkeyboard/ax;", garbageValue="156746158")
    static ax method5992() {
        ax ax2 = Client.field4740.method5708().vmethod12639(1);
        ax2.method3237(class97.field2749);
        return ax2;
    }

    @ObfuscatedName(value="dl")
    static boolean method5994(byte by) {
        by = (byte)Client.field4868;
        return (by * 1064934413 & 2) != 0;
    }
}

