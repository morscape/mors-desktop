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

@ObfuscatedName(value="bm")
@Implements(value="FaceNormal")
public class FaceNormal {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1015527781)
    @Export(value="y")
    int y;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=193487211)
    @Export(value="z")
    int z;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1962601301)
    @Export(value="x")
    int x;

    FaceNormal() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldd;", garbageValue="957872285")
    public static VarcInt method845(int n) {
        Object object = VarcInt.field6857;
        long l = n;
        if ((object = (VarcInt)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = VarcInt.field6858.takeFile(19, n);
        VarcInt varcInt = new VarcInt();
        if (object != null) {
            varcInt.method12865(new Buffer((byte[])object), (byte)-114);
        }
        VarcInt.field6857.put(varcInt, l);
        return varcInt;
    }

    @ObfuscatedName(value="ao")
    static void method847(int n) {
        block11: {
            block10: {
                block13: {
                    block12: {
                        if (class63.method4018(Login.field3199)) break block10;
                        if (class270.method7740(Login.field3199)) break block11;
                        n = Login.field3199;
                        if (n == 0) break block12;
                        switch (n) {
                            default: {
                                if (!class128.method5555(Login.field3199)) {
                                    Client.field4740.method5708().method12022("crsG39");
                                    Client.field4740.method5708().method12026("crsG39");
                                    class18 class182 = Client.field4740.method5708().vmethod12647();
                                    if (class182 != null && class182.vmethod10040() && !Login.field3194) {
                                        Ignored.method10462();
                                        break;
                                    }
                                    class358.Login_promptCredentials(false);
                                    break;
                                }
                                break block13;
                            }
                            case 4: {
                                if (!class128.method5555(Login.field3199)) {
                                    ItemContainer.method12842(false, false);
                                    break;
                                }
                                break block13;
                            }
                            case 3: {
                                if (!class128.method5555(Login.field3199)) {
                                    FaceNormal.method848();
                                    break;
                                }
                                break block13;
                            }
                            case 2: {
                                if (!class128.method5555(Login.field3199)) {
                                    class84.method4724();
                                    break;
                                }
                                break block13;
                            }
                        }
                        break block13;
                    }
                    VerticalAlignment.method10455();
                    class0.method4(false);
                }
                Login.field3199 = -1;
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="ba")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="16")
    static void method848() {
        Object object = Client.field4740.method5708();
        ((class346)object).method12022("cgs2K0");
        ((class346)object).method12026("cgs2K0");
        Login.loginIndex = 23;
        ParamDefinition.method13223("Connecting to Google...", "", "");
        object = Client.field4740.method5708().vmethod12647();
        if (object == null) {
            class119.field3363.method5312(new class8(false, 2));
            return;
        }
        class119.field3363.method5312(null);
        ((class18)object).vmethod10044();
    }
}

