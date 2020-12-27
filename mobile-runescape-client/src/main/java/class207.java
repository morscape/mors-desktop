/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ni")
public class class207 {
    @ObfuscatedName(value="ae")
    final Object[] field3957;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-720397751)
    int field3958;
    @ObfuscatedName(value="ak")
    final Class field3959;

    public class207(Class class_, int n) {
        this.field3959 = class_;
        this.field3957 = new Object[n];
        this.field3958 = 0;
    }

    @ObfuscatedName(value="ae")
    Object method6853(int n) {
        Object object = this.field3957;
        n = this.field3958 * 306411513 + 306411513;
        this.field3958 = n * -720397751;
        object = object[n * 720397751];
        return object;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/Object;", garbageValue="-2025041795")
    public Object method6856() {
        synchronized (this) {
            block4: {
                if (this.field3958 * -1 != 0) break block4;
                Object object = this.method6858();
                return object;
            }
            Object object = this.method6853(-150411702);
            return object;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/Object;", garbageValue="-1036683433")
    Object method6858() {
        try {
            return this.field3959.newInstance();
        }
        catch (IllegalAccessException | InstantiationException reflectiveOperationException) {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName(value="ax")
    public void method6862(Object object, byte by) {
        synchronized (this) {
            block3: {
                if (this.field3958 * -1 >= this.field3957.length) break block3;
                Object[] arrobject = this.field3957;
                by = (byte)(this.field3958 * 306411513 - 306411513);
                this.field3958 = by * -720397751;
                arrobject[by * 720397751 - 1] = object;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ae")
    static final int method6850(long l, String object, byte by) {
        Object object2 = new Random();
        Object object3 = new Buffer(128);
        Object object4 = new Buffer(128);
        int[] arrn = new int[]{((Random)object2).nextInt(), ((Random)object2).nextInt(), (int)(l >> 32), (int)l};
        ((Buffer)object3).method11652(10, 422009005);
        for (by = 0; by < 4; by = (byte)(by + 1)) {
            ((Buffer)object3).method11640(((Random)object2).nextInt(), (byte)16);
        }
        ((Buffer)object3).method11640(arrn[0], (byte)16);
        ((Buffer)object3).method11640(arrn[1], (byte)16);
        ((Buffer)object3).writeLong(l);
        ((Buffer)object3).writeLong(0L);
        for (by = 0; by < 4; by = (byte)(by + 1)) {
            ((Buffer)object3).method11640(((Random)object2).nextInt(), (byte)16);
        }
        ((Buffer)object3).method11678(class128.field3445, class128.field3449, (byte)64);
        ((Buffer)object4).method11652(10, 422009005);
        for (by = 0; by < 3; by = (byte)(by + 1)) {
            ((Buffer)object4).method11640(((Random)object2).nextInt(), (byte)16);
        }
        ((Buffer)object4).writeLong(((Random)object2).nextLong());
        ((Buffer)object4).method11641(((Random)object2).nextLong());
        class105.method5031((Buffer)object4);
        ((Buffer)object4).writeLong(((Random)object2).nextLong());
        ((Buffer)object4).method11678(class128.field3445, class128.field3449, (byte)53);
        int n = class127.method5538((String)object, (short)-25864);
        by = (byte)n;
        if (n % 8 != 0) {
            by = (byte)(n + (8 - n % 8));
        }
        object2 = new Buffer(by);
        ((Buffer)object2).method11645((String)object, (byte)76);
        ((Buffer)object2).offset = by;
        ((Buffer)object2).method11659(arrn, -2104268111);
        object = new Buffer(((Buffer)object2).offset + ((Buffer)object4).offset + ((Buffer)object3).offset + 5);
        ((Buffer)object).method11652(2, 422009005);
        ((Buffer)object).method11652(((Buffer)object3).offset, 422009005);
        ((Buffer)object).method11653(((Buffer)object3).array, 0, ((Buffer)object3).offset, 1513430833);
        ((Buffer)object).method11652(((Buffer)object4).offset, 422009005);
        ((Buffer)object).method11653(((Buffer)object4).array, 0, ((Buffer)object4).offset, 960761672);
        ((Buffer)object).method11638(((Buffer)object2).offset, (byte)-28);
        ((Buffer)object).method11653(((Buffer)object2).array, 0, ((Buffer)object2).offset, -1845263993);
        object3 = class324.method11443(((Buffer)object).array);
        try {
            object = new StringBuilder();
            ((StringBuilder)object).append(WorldMapElement.method12941("services", false));
            ((StringBuilder)object).append("m=accountappeal/login.ws");
            object4 = new URL(((StringBuilder)object).toString()).openConnection();
            ((URLConnection)object4).setDoInput(true);
            ((URLConnection)object4).setDoOutput(true);
            ((URLConnection)object4).setConnectTimeout(5000);
            object = new OutputStreamWriter(((URLConnection)object4).getOutputStream());
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("data2=");
            ((StringBuilder)object2).append(class373.method13003((CharSequence)object3, 2143078198));
            ((StringBuilder)object2).append("&dest=");
            ((StringBuilder)object2).append(class373.method13003("passwordchoice.ws", 2147252655));
            ((Writer)object).write(((StringBuilder)object2).toString());
            ((OutputStreamWriter)object).flush();
            object4 = ((URLConnection)object4).getInputStream();
            object3 = new Buffer(new byte[1000]);
            do {
                if ((by = (byte)((InputStream)object4).read(((Buffer)object3).array, ((Buffer)object3).offset, 1000 - ((Buffer)object3).offset)) == -1) {
                    ((OutputStreamWriter)object).close();
                    ((InputStream)object4).close();
                    object = new String(((Buffer)object3).array);
                    if (((String)object).startsWith("OFFLINE")) {
                        return 4;
                    }
                    if (((String)object).startsWith("WRONG")) {
                        return 7;
                    }
                    if (((String)object).startsWith("RELOAD")) {
                        return 3;
                    }
                    if (((String)object).startsWith("Not permitted for social network accounts.")) {
                        return 6;
                    }
                    ((Buffer)object3).method11667(arrn, 466996389);
                    while (((Buffer)object3).offset > 0 && ((Buffer)object3).array[((Buffer)object3).offset - 1] == 0) {
                        --((Buffer)object3).offset;
                    }
                    object = new String(((Buffer)object3).array, 0, ((Buffer)object3).offset);
                    if (!class314.method11223((String)object)) return 5;
                    Client.field4740.method5708().method12018().vmethod10019((String)object, true);
                    return 2;
                }
                ((Buffer)object3).offset = by + ((Buffer)object3).offset;
            } while ((by = (byte)(((Buffer)object3).offset * 1897459807)) * 1792371615 < 1000);
            return 5;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return 5;
        }
    }
}

