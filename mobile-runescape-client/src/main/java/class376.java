/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="du")
public class class376
extends DualNode {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lga;")
    static EvictingDualNodeHashTable field7035 = new EvictingDualNodeHashTable(64, null);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    static AbstractArchive field7036;

    @ObfuscatedName(value="ai")
    static String method13140(Throwable object, int n) throws IOException {
        Object object2;
        if (object instanceof class251) {
            object = (class251)object;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((class251)object).field4325);
            ((StringBuilder)object2).append(" | ");
            object2 = ((StringBuilder)object2).toString();
            object = ((class251)object).field4324;
        } else {
            object2 = "";
        }
        Object object3 = new StringWriter();
        Object object4 = new PrintWriter((Writer)object3);
        ((Throwable)object).printStackTrace((PrintWriter)object4);
        ((PrintWriter)object4).close();
        BufferedReader bufferedReader = new BufferedReader(new StringReader(((StringWriter)object3).toString()));
        object4 = bufferedReader.readLine();
        object = object2;
        while ((object3 = bufferedReader.readLine()) != null) {
            int n2;
            block7: {
                block6: {
                    n = ((String)object3).indexOf(40);
                    n2 = n + 1;
                    int n3 = ((String)object3).indexOf(41, n2);
                    object2 = object3;
                    if (n < 0) break block6;
                    object2 = object3;
                    if (n3 < 0) break block6;
                    object2 = ((String)object3).substring(n2, n3);
                    if ((n2 = ((String)object2).indexOf(".java:")) >= 0) break block7;
                    object2 = ((String)object3).substring(0, n);
                }
                object2 = ((String)object2).trim();
                object2 = ((String)object2).substring(((String)object2).lastIndexOf(32) + 1);
                object2 = ((String)object2).substring(((String)object2).lastIndexOf(9) + 1);
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append(' ');
                object = ((StringBuilder)object3).toString();
                continue;
            }
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(((String)object2).substring(0, n2));
            ((StringBuilder)object3).append(((String)object2).substring(n2 + 5));
            object2 = ((StringBuilder)object3).toString();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append((String)object);
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(' ');
            object = ((StringBuilder)object3).toString();
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("| ");
        ((StringBuilder)object2).append((String)object4);
        return ((StringBuilder)object2).toString();
    }

    @ObfuscatedName(value="ax")
    public static int method13146(int n, int n2) {
        int n3;
        int n4;
        if (n >= 0 && n < 65536) {
            n4 = 0;
            n3 = n;
        } else {
            n3 = n >>> 16;
            n4 = 16;
        }
        n = n4;
        n2 = n3;
        if (n3 >= 256) {
            n2 = n3 >>> 8;
            n = n4 + 8;
        }
        n4 = n;
        n3 = n2;
        if (n2 >= 16) {
            n3 = n2 >>> 4;
            n4 = n + 4;
        }
        n = n4;
        n2 = n3;
        if (n3 >= 4) {
            n2 = n3 >>> 2;
            n = n4 + 2;
        }
        n3 = n;
        n4 = n2;
        if (n2 >= 1) {
            n4 = n2 >>> 1;
            n3 = n + 1;
        }
        return n4 + n3;
    }

    @ObfuscatedName(value="bz")
    @ObfuscatedSignature(descriptor="(Lfj;B)V", garbageValue="-95")
    static void method13148(class72 class722) {
        Login.field3202 = false;
        class156.method6303(class722, 1511352543);
    }
}

