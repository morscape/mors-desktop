/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jl")
public class class141 {
    @ObfuscatedName(value="rn")
    @ObfuscatedSignature(descriptor="Lmz;")
    static class198 field3579;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ljn;")
    UrlRequester field3580;
    @ObfuscatedName(value="ah")
    final List field3581;
    @ObfuscatedName(value="as")
    List field3584;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ljk;")
    UrlRequest field3582;
    @ObfuscatedName(value="ak")
    URL field3583;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Ljd;")
    final class133 field3585 = new class133("universal");

    public class141(URL uRL) {
        this.field3581 = new LinkedList();
        this.field3584 = new LinkedList();
        this.field3583 = uRL;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljd;B)V")
    void method5953(String string2, class133 class1332, byte by) {
        by = (byte)string2.indexOf(61);
        if (by != -1) {
            String string3 = string2.substring(0, by).trim();
            string2 = string2.substring(by + 1).trim();
            class1332.field3488.put(string3, string2);
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)Ljd;", garbageValue="-16")
    public class133 method5955() {
        class133 class1332 = this.field3585;
        return class1332;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)Ljava/net/URL;", garbageValue="-2092614923")
    public URL method5964() {
        URL uRL = this.field3583;
        return uRL;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljd;I)V")
    void method5956(String charSequence, class133 class1332, int n) {
        int n2 = ((String)charSequence).indexOf(61);
        if (n2 == -1) {
            return;
        }
        n = 0;
        String string2 = ((String)charSequence).substring(0, n2).trim().toLowerCase();
        charSequence = new StringBuilder(((String)charSequence).substring(n2 + 1).trim());
        while (true) {
            n2 = ((StringBuilder)charSequence).indexOf("\\\\", n);
            n = ((StringBuilder)charSequence).indexOf("\\n", n);
            if (n2 < 0 && n < 0) {
                boolean bl = string2.startsWith("lang");
                if (bl) {
                    try {
                        n = Integer.parseInt(string2.substring(4));
                        this.field3584.add(new class147(n, ((StringBuilder)charSequence).toString()));
                    }
                    catch (NumberFormatException numberFormatException) {}
                }
                class1332.field3489.put(string2, ((StringBuilder)charSequence).toString());
                return;
            }
            if (n2 >= 0 && (n < 0 || n >= n2)) {
                ((StringBuilder)charSequence).replace(n2, n2 + 2, "\\");
                n = n2 + 1;
                continue;
            }
            ((StringBuilder)charSequence).replace(n, n + 2, "\n");
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="2131230756")
    public boolean method5958(int n) {
        if (this.field3580 == null) {
            this.field3580 = new UrlRequester();
            ModeWhere.method11613(n, this.field3585.field3489);
        }
        try {
            if (this.field3583 == null) {
                throw new Exception();
            }
            if (this.field3582 == null) {
                this.field3582 = this.field3580.request(this.field3583);
                return false;
            }
            if (!this.field3582.isDone()) return false;
            class202 class2022 = new class202(new String(this.field3582.getResponse(), "CP1252").split("[\\r\\n]+"));
            Object object = this.field3585;
            while (true) {
                String[] arrstring;
                if ((arrstring = class2022.method6794(1942782625)) != null) {
                    if (arrstring[0].equals("param")) {
                        this.method5953(arrstring[1], (class133)object, (byte)-1);
                        continue;
                    }
                    if (arrstring[0].equals("msg")) {
                        this.method5956(arrstring[1], (class133)object, -313074166);
                        continue;
                    }
                    this.method5966(arrstring, (class133)object);
                    continue;
                }
                object = class2022.method6798(-1817347171);
                if (object == null) {
                    this.field3580.close();
                    this.field3580 = null;
                    return true;
                }
                object = new class133((String)object);
                this.field3581.add(object);
            }
        }
        catch (Exception exception) {}
        if (this.field3580 == null) return true;
        this.field3580.close();
        this.field3580 = null;
        return true;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="([Ljava/lang/String;Ljd;B)V", garbageValue="-48")
    void method5966(String[] arrstring, class133 class1332) {
        class1332.field3490.put(arrstring[0], arrstring[1]);
    }
}

