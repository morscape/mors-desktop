/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="is")
public class class128 {
    @ObfuscatedName(value="ah")
    static final BigInteger field3445 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
    @ObfuscatedName(value="as")
    static final BigInteger field3449 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field3451;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="2042737345")
    static String method5553() {
        String string2 = "";
        for (class393 class3932 : Messages.Messages_hashTable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(class3932.field7240);
            stringBuilder.append(':');
            stringBuilder.append(class3932.field7232);
            stringBuilder.append('\n');
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-829990251")
    static boolean method5555(int n) {
        if (!Login.field3198) {
            if ((Client.field4748 & 0x2000000) == 0) {
                if ((Client.field4748 & 4) != 0) {
                    if ((Client.field4748 & 0x400) != 0) {
                        Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                        Login.Login_response2 = "Players can attack each other almost everywhere";
                        Login.Login_response3 = "and the Protect Item prayer won't work.";
                    } else {
                        Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                        Login.Login_response2 = "Players can attack each other";
                        Login.Login_response3 = "almost everywhere.";
                    }
                } else {
                    if ((Client.field4748 & 0x400) == 0) {
                        return false;
                    }
                    Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                    Login.Login_response2 = "The Protect Item prayer will";
                    Login.Login_response3 = "not work on this world.";
                    Login.field3190 = "Warning!";
                    Login.loginIndex = 1;
                    Login.field3199 = n;
                    return true;
                }
                Login.field3190 = "Warning!";
                Login.loginIndex = 1;
                Login.field3199 = n;
                return true;
            }
            Login.field3190 = "";
            Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
            Login.Login_response2 = "Your normal account will not be affected.";
            Login.Login_response3 = "";
            Login.loginIndex = 1;
            Login.field3199 = n;
            return true;
        }
        return false;
    }
}

