/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="ly")
public class class180 {
    static {
        new HashMap();
    }

    @ObfuscatedName(value="ap")
    static void method6606(int n, byte by) {
        if (n != Client.gameState) {
            if (Client.gameState == 0) {
                Client.field4740.method5749();
            }
            if (n == 20 || n == 40 || n == 45) {
                Client.field4771 = 0;
                Client.field4774 = 0;
                Client.field4775 = 0;
                Client.field4792.method7084(n);
                if (n == 45) {
                    if (class119.field3363.method5314()) {
                        class119.field3363.method5321(true);
                    } else {
                        class119.field3363.sort(Login.Login_password, true);
                    }
                    class297.method10926(false);
                }
            }
            if (n != 20 && n != 40 && class317.field6183 != null) {
                class317.field6183.close();
                class317.field6183 = null;
            }
            if (Client.gameState == 25) {
                Client.field4797 = 0;
                Client.field4789 = 0;
                Client.field4796 = 1;
                Client.field4794 = 0;
                Client.field4788 = 1;
            }
            if (n != 5 && n != 10) {
                if (n != 20) {
                    if (n != 11) {
                        class69.method4106();
                        Client.field4740.method5740(class294.field6004);
                    } else {
                        class28.method854(class61.field2439, class259.field4373, false, 4, Client.field4740.field3567.vmethod11005());
                    }
                } else {
                    by = Client.gameState != 11 ? (byte)0 : (byte)4;
                    class28.method854(class61.field2439, class259.field4373, true, by, Client.field4740.field3567.vmethod11005());
                }
            } else {
                class28.method854(class61.field2439, class259.field4373, true, 0, Client.field4740.field3567.vmethod11005());
            }
            Client.gameState = n;
            return;
        }
    }
}

