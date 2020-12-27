/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dx")
public class class56 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([BIB)I", garbageValue="-9")
    public static int method3839(byte[] arrby, int n) {
        n = class323.method11429(arrby, 0, n, -2020147829);
        return n;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldh;", garbageValue="2082535876")
    public static class372 method3840(int n) {
        Object object = class372.field6948;
        long l = n;
        if ((object = (class372)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = class372.field6946.takeFile(3, n);
        class372 class3722 = new class372();
        if (object != null) {
            class3722.method12982(new Buffer((byte[])object), -1345511171);
        }
        class372.field6948.put(class3722, l);
        return class3722;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/Throwable;I)V", garbageValue="1099366735")
    @Export(value="RunException_sendStackTrace")
    public static void RunException_sendStackTrace(String var0, Throwable var1_2) {
        if (var1_2 != null) {
            var1_2.printStackTrace();
            return;
        }
        var2_3 = "";
        if (var1_2 == null) ** GOTO lbl8
        try {
            var2_3 = class376.method13140((Throwable)var1_2, -2062367845);
lbl8:
            // 2 sources

            var3_4 = var2_3;
            if (var0 != null) {
                var3_4 = var2_3;
                if (var1_2 != null) {
                    var1_2 = new StringBuilder();
                    var1_2.append((String)var2_3);
                    var1_2.append(" | ");
                    var3_4 = var1_2.toString();
                }
                var1_2 = new StringBuilder();
                var1_2.append(var3_4);
                var1_2.append((String)var0);
                var3_4 = var1_2.toString();
            }
            var0 = System.out;
            var1_2 = new StringBuilder();
            var1_2.append("Error: ");
            var1_2.append(var3_4);
            var0.println(var1_2.toString());
            var0 = var3_4.replace(':', '.').replace('@', '_').replace('&', '_').replace('#', '_');
            if (class251.RunException_applet == null) {
                return;
            }
            var1_2 = class251.RunException_applet;
            var2_3 = new StringBuilder();
            var2_3.append("clienterror.ws?cv=");
            var2_3.append(class251.field4319);
            var2_3.append("&cs=");
            var2_3.append(class251.field4322);
            var2_3.append("&u=");
            var2_3.append(class251.field4318);
            var2_3.append("&v1=");
            var2_3.append(TaskHandler.javaVendor);
            var2_3.append("&v2=");
            var2_3.append(TaskHandler.javaVersion);
            var2_3.append("&e=");
            var2_3.append((String)var0);
            var2_3.append("&ct=");
            var2_3.append(class97.field2747);
            var2_3.append("&e=");
            var2_3.append((String)var0);
            var0 = new DataInputStream(new URL((URL)var1_2, var2_3.toString()).openStream());
            var0.read();
            var0.close();
            return;
        }
        catch (Exception var0_1) {
            return;
        }
    }
}

