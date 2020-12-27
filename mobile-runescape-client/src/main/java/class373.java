/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="do")
public class class373
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field6962 = new EvictingDualNodeHashTable(64, null);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field6963;

    @ObfuscatedName(value="ay")
    static void method13010(char c, int n) {
        block11: {
            block13: {
                block10: {
                    boolean bl;
                    block7: {
                        block12: {
                            block8: {
                                block9: {
                                    if (Login.loginIndex != 2) break block8;
                                    if (Login.currentLoginField != 0) break block9;
                                    if (!class165.method6382(c, (byte)-30) || Login.Login_username.length() >= 320) break block10;
                                    break block11;
                                }
                                if (Login.currentLoginField == 1 && MidiPcmStream.method13663(c, -1240054830) && Login.Login_password.length() < 20) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(Login.Login_password);
                                    stringBuilder.append(c);
                                    Login.Login_password = stringBuilder.toString();
                                    return;
                                }
                                break block10;
                            }
                            if (Login.loginIndex == 4) break block12;
                            if (Login.loginIndex == 5 && class165.method6382(c, (byte)43) && Login.Login_username.length() < 320) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(Login.Login_username);
                                stringBuilder.append(c);
                                Login.Login_username = stringBuilder.toString();
                            }
                            break block10;
                        }
                        boolean bl2 = false;
                        n = 0;
                        while (true) {
                            bl = bl2;
                            if (n >= "1234567890".length()) break block7;
                            if (c == "1234567890".charAt(n)) break;
                            ++n;
                        }
                        bl = true;
                    }
                    if (bl && class97.field2749.length() < 6) break block13;
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(class97.field2749);
            stringBuilder.append(c);
            class97.field2749 = stringBuilder.toString();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Login.Login_username);
        stringBuilder.append(c);
        Login.Login_username = stringBuilder.toString();
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(IIIII)I", garbageValue="-1357936562")
    static final int method13012(int n, int n2, int n3, int n4) {
        return n3 * n2 - n4 * n >> 16;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-32920685")
    static void method13004() {
        Node node = class319.field6240.last();
        while (true) {
            if ((node = (class319)node) == null) {
                class319.field6240.clear();
                return;
            }
            if (((class319)node).field6243 != null) {
                WorldMapElement.field6923.removeSubStream(((class319)node).field6243);
                ((class319)node).field6243 = null;
            }
            if (((class319)node).field6252 != null) {
                WorldMapElement.field6923.removeSubStream(((class319)node).field6252);
                ((class319)node).field6252 = null;
            }
            node = class319.field6240.previous();
        }
    }

    @ObfuscatedName(value="ak")
    public static String method13003(CharSequence charSequence, int n) {
        int n2 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        n = 0;
        while (true) {
            if (n >= n2) {
                charSequence = stringBuilder.toString();
                return charSequence;
            }
            char c = charSequence.charAt(n);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '.' || c == '-' || c == '*' || c == '_')) {
                if (c != ' ') {
                    int n3 = class327.charToByteCp1252(c);
                    stringBuilder.append('%');
                    int n4 = n3 >> 4 & 0xF;
                    if (n4 < 10) {
                        stringBuilder.append((char)(n4 + 48));
                    } else {
                        stringBuilder.append((char)(n4 + 55));
                    }
                    if ((n3 &= 0xF) < 10) {
                        stringBuilder.append((char)(n3 + 48));
                    } else {
                        stringBuilder.append((char)(n3 + 55));
                    }
                } else {
                    stringBuilder.append('+');
                }
            } else {
                stringBuilder.append(c);
            }
            ++n;
        }
    }
}

