/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ja")
public class class130
implements Comparator {
    @ObfuscatedName(value="ak")
    final boolean field3475;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Len;Len;I)I")
    int method5623(class61 class612, class61 class613, int n) {
        if (this.field3475) {
            return class612.vmethod13338(class613, 1584542578);
        }
        n = class613.vmethod13338(class612, -1545203820);
        return n;
    }

    public int compare(Object object, Object object2) {
        int n = this.method5623((class61)object, (class61)object2, -1801338142);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @ObfuscatedName(value="ae")
    static String method5612(byte[] object, int n, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        n3 = n;
        while (true) {
            if (n3 >= n2 + n) {
                object = stringBuilder.toString();
                return object;
            }
            int n4 = object[n3] & 0xFF;
            stringBuilder.append(class177.field3806[n4 >>> 2]);
            if (n3 >= n2 - 1) {
                stringBuilder.append(class177.field3806[(n4 & 3) << 4]);
                stringBuilder.append("==");
            } else {
                int n5 = object[n3 + 1] & 0xFF;
                stringBuilder.append(class177.field3806[(n4 & 3) << 4 | n5 >>> 4]);
                if (n3 >= n2 - 2) {
                    stringBuilder.append(class177.field3806[(n5 & 0xF) << 2]);
                    stringBuilder.append("=");
                } else {
                    n4 = object[n3 + 2] & 0xFF;
                    stringBuilder.append(class177.field3806[(n5 & 0xF) << 2 | n4 >>> 6]);
                    stringBuilder.append(class177.field3806[n4 & 0x3F]);
                }
            }
            n3 += 3;
        }
    }

    @ObfuscatedName(value="ai")
    public static boolean method5613(long l) {
        boolean bl;
        return l != 0L && !(bl = class296.method10887(l));
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;I)I")
    static int method5614(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, int n) {
        int n2 = 0;
        if (abstractArchive.method6136("titlewide.jpg", "", -4683537)) {
            n2 = 1;
        }
        n = n2;
        if (abstractArchive2.method6136("logo_osrs", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("logo_deadman_mode", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("logo_seasonal_mode", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("titlebox", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("titlebutton", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("titlebutton_large", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("play_now_text", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("titlebutton_wide42,1", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("runes", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("title_mute", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("options_radio_buttons,0", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("options_radio_buttons,2", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("options_radio_buttons,4", "", -4683537)) {
            n = n2 + 1;
        }
        n2 = n;
        if (abstractArchive2.method6136("options_radio_buttons,6", "", -4683537)) {
            n2 = n + 1;
        }
        n = n2;
        if (abstractArchive2.method6136("login_icons", "", -4683537)) {
            n = n2 + 1;
        }
        abstractArchive2.method6136("sl_back", "", -4683537);
        abstractArchive2.method6136("sl_flags", "", -4683537);
        abstractArchive2.method6136("sl_arrows", "", -4683537);
        abstractArchive2.method6136("sl_stars", "", -4683537);
        abstractArchive2.method6136("sl_button", "", -4683537);
        return n;
    }
}

