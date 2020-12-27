/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ox")
public class class358
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lox;")
    static final class358 field6542;
    @ObfuscatedName(value="je")
    @ObfuscatedSignature(descriptor="Lax;")
    static Widget field6546;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lox;")
    static final class358 field6543;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lox;")
    static final class358 field6544;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1575340111)
    public final int field6549;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lom;")
    final class230 field6550;
    @ObfuscatedName(value="as")
    final Class field6551;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-612452485)
    final int field6552;

    static {
        field6544 = new class358(2, 0, Integer.class, new class362());
        field6542 = new class358(1, 1, Long.class, new class354());
        field6543 = new class358(0, 2, String.class, new class356());
    }

    @ObfuscatedSignature(descriptor="(IILjava/lang/Class;Lom;)V")
    class358(int n, int n2, Class class_, class230 class2302) {
        this.field6552 = n;
        this.field6549 = n2;
        this.field6551 = class_;
        this.field6550 = class2302;
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Lmi;I)Ljava/lang/Object;", garbageValue="1223550899")
    public Object method12157(Buffer object) {
        object = this.field6550.vmethod12183((Buffer)object, 57161255);
        return object;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6549 * -2015605073);
        return by * 1575340111;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[Lox;", garbageValue="2131689870")
    public static class358[] method12140() {
        class358 class3582 = field6543;
        class358 class3583 = field6544;
        class358 class3584 = field6542;
        return new class358[]{class3582, class3583, class3584};
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Object;Lmi;B)V", garbageValue="89")
    public static void method12143(Object object, Buffer buffer) {
        class358.method12145(object.getClass()).vmethod12188(object, buffer);
    }

    @ObfuscatedName(value="al")
    static String method12144(int n, int n2, boolean bl, int n3) {
        n3 = 2;
        if (n2 >= 2 && n2 <= 36) {
            if (bl && n >= 0) {
                int n4 = n / n2;
                while (true) {
                    if (n4 == 0) {
                        char[] arrc = new char[n3];
                        arrc[0] = 43;
                        --n3;
                        while (true) {
                            if (n3 <= 0) {
                                return new String(arrc);
                            }
                            n4 = n / n2;
                            arrc[n3] = (n -= n4 * n2) >= 10 ? (char)(n + 87) : (char)(n + 48);
                            --n3;
                            n = n4;
                        }
                    }
                    n4 /= n2;
                    ++n3;
                }
            }
            return Integer.toString(n, n2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Class;I)Lom;", garbageValue="2132965578")
    static class230 method12145(Class object) {
        if ((object = class358.method12142((Class)object, 579771661)) == null) {
            throw new IllegalArgumentException();
        }
        return ((class358)object).field6550;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-879116319")
    static void method12152() {
        block5: {
            block7: {
                block4: {
                    block6: {
                        block2: {
                            block3: {
                                if (Login.loginIndex != 2) break block2;
                                if (Login.currentLoginField != 0) break block3;
                                if (Login.Login_username.length() <= 0) break block4;
                                break block5;
                            }
                            if (Login.currentLoginField == 1 && Login.Login_password.length() > 0) {
                                Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                return;
                            }
                            break block4;
                        }
                        if (Login.loginIndex != 4) break block6;
                        if (class97.field2749.length() <= 0) break block4;
                        break block7;
                    }
                    if (Login.loginIndex == 5 && Login.Login_username.length() > 0) {
                        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                    }
                }
                return;
            }
            class97.field2749 = class97.field2749.substring(0, class97.field2749.length() - 1);
            return;
        }
        Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="803007043")
    @Export(value="Login_promptCredentials")
    static void Login_promptCredentials(boolean bl) {
        Login.Login_response1 = "";
        Login.Login_response2 = "Enter your Old School RuneScape login details.";
        Login.Login_response3 = "";
        Login.loginIndex = 2;
        if (bl) {
            Login.Login_password = "";
        }
        class58.method3849();
        FloorDecoration.method851();
        class261.method7512();
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Class;I)Lox;")
    public static class358 method12142(Class class_, int n) {
        class358[] arrclass358 = class358.method12140();
        n = 0;
        while (n < arrclass358.length) {
            class358 class3582 = arrclass358[n];
            Class class_2 = class3582.field6551;
            if (class_2 == class_) {
                return class3582;
            }
            ++n;
        }
        return null;
    }
}

