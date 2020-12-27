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

@ObfuscatedName(value="bh")
@Implements(value="BoundaryObject")
public final class BoundaryObject {
    @ObfuscatedName(value="am")
    static int[] field441;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=1240323061)
    @Export(value="flags")
    int flags = 0;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-203326423)
    int field445;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=2100634499)
    int field446;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lbw;")
    @Export(value="entity2")
    public Entity entity2;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(longValue=7449342511925629921L)
    @Export(value="tag")
    public long tag = 0L;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lbw;")
    @Export(value="entity1")
    public Entity entity1;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-2038334917)
    int field447;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=-1936789295)
    int field449;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1778939813)
    int field452;

    BoundaryObject() {
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(III[I[IIIIIIIIIII)V", garbageValue="-248560966")
    static void method842(int n, int n2, int n3, int[] arrn, int[] arrn2, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        n2 = -n9;
        while (true) {
            if (n2 < 0) {
                n3 = -n8;
                n = n6;
            } else {
                return;
            }
            while (n3 < 0) {
                n5 = arrn2[n4];
                if (n5 != 0) {
                    n6 = n12 * (n5 & 0xFF00FF);
                    n6 = (n12 * n5 - n6 & 0xFF0000) + (0xFF00FF00 & n6) >>> 8;
                    n7 = arrn[n];
                    n5 = n7 + n6;
                    n6 = (n6 & 0xFF00FF) + (0xFF00FF & n7);
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

    @ObfuscatedName(value="bg")
    static void method844(int n) {
        if ((Login.Login_username = Login.Login_username.trim()).length() != 0) {
            long l = class71.method4132(1316590928);
            n = l == 0L ? 5 : class207.method6850(l, Login.Login_username, (byte)-55);
            switch (n) {
                default: {
                    return;
                }
                case 7: {
                    ParamDefinition.method13223("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
                    return;
                }
                case 6: {
                    ParamDefinition.method13223("", "Error connecting to server.", "");
                    return;
                }
                case 5: {
                    ParamDefinition.method13223("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
                    return;
                }
                case 4: {
                    ParamDefinition.method13223("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
                    return;
                }
                case 3: {
                    ParamDefinition.method13223("", "Error connecting to server.", "");
                    return;
                }
                case 2: 
            }
            Client.field4740.method5708().method12022("ariMOV");
            Client.field4740.method5708().method12026("ariMOV");
            ParamDefinition.method13223(Strings.field3082, Strings.field3100, Strings.field3083);
            Login.loginIndex = 6;
            return;
        }
        ParamDefinition.method13223("Please enter your Old School RuneScape username", "or email address. Please note your RuneScape", "progress is not transferred to Old School RuneScape.");
    }
}

