/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ld")
public class class165 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    AbstractArchive field3761;
    @ObfuscatedName(value="ai")
    HashMap field3762;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    AbstractArchive field3763;

    @ObfuscatedSignature(descriptor="(Lkc;Lkc;)V")
    public class165(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        this.field3763 = abstractArchive;
        this.field3761 = abstractArchive2;
        this.field3762 = new HashMap();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([Llf;I)Ljava/util/HashMap;")
    public HashMap method6384(FontName[] arrfontName, int n) {
        HashMap hashMap = new HashMap();
        n = 0;
        while (n < arrfontName.length) {
            FontName fontName = arrfontName[n];
            if (this.field3762.containsKey(fontName)) {
                hashMap.put(fontName, this.field3762.get(fontName));
            } else {
                class399 class3992 = Rasterizer2D.method13635(this.field3763, this.field3761, fontName.name, "", (byte)-24);
                if (class3992 != null) {
                    this.field3762.put(fontName, class3992);
                    hashMap.put(fontName, class3992);
                }
            }
            ++n;
        }
        return hashMap;
    }

    @ObfuscatedName(value="au")
    static boolean method6382(char c, byte by) {
        by = 0;
        while (by < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length()) {
            char c2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(by);
            if (c == c2) {
                return true;
            }
            by = (byte)(by + 1);
        }
        return false;
    }
}

