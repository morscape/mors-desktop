/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="fi")
public class class71 {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2506;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2508;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2509;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2511;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2513;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2514;
    @ObfuscatedName(value="ce")
    @ObfuscatedSignature(descriptor="Lmt;")
    @Export(value="js5SocketTask")
    static Task js5SocketTask;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2510;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2512;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2515;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lfi;")
    static final class71 field2507;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=845207627)
    final int field2518;

    static {
        field2512 = new class71(0);
        field2508 = new class71(6);
        field2510 = new class71(2);
        field2515 = new class71(9);
        field2509 = new class71(7);
        field2514 = new class71(8);
        field2511 = new class71(1);
        field2513 = new class71(3);
        field2506 = new class71(5);
        field2507 = new class71(4);
    }

    class71(int n) {
        this.field2518 = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    static long method4132(int n) {
        try {
            Object object = new StringBuilder();
            ((StringBuilder)object).append(WorldMapElement.method12941("services", false));
            ((StringBuilder)object).append("m=accountappeal/login.ws");
            object = new URL(((StringBuilder)object).toString()).openConnection();
            ((URLConnection)object).setRequestProperty("connection", "close");
            ((URLConnection)object).setDoInput(true);
            ((URLConnection)object).setDoOutput(true);
            ((URLConnection)object).setConnectTimeout(5000);
            Object object2 = new OutputStreamWriter(((URLConnection)object).getOutputStream());
            ((Writer)object2).write("data1=req");
            ((OutputStreamWriter)object2).flush();
            object = ((URLConnection)object).getInputStream();
            object2 = new Buffer(new byte[1000]);
            do {
                if ((n = ((InputStream)object).read(((Buffer)object2).array, ((Buffer)object2).offset, 1000 - ((Buffer)object2).offset)) == -1) {
                    ((Buffer)object2).offset = 0;
                    return ((Buffer)object2).method11663((byte)-58);
                }
                ((Buffer)object2).offset = n + ((Buffer)object2).offset;
            } while ((n = ((Buffer)object2).offset * 1897459807) * 1792371615 < 1000);
            return 0L;
        }
        catch (Exception exception) {
            return 0L;
        }
    }

    @ObfuscatedName(value="bv")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="54")
    static void method4134() {
        class18 class182 = Client.field4740.method5708().vmethod12647();
        if (class182 != null) {
            class182.vmethod10067();
        }
    }
}

