/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jn")
@Implements(value="UrlRequester")
public class UrlRequester
implements Runnable {
    @ObfuscatedName(value="ae")
    @Export(value="isClosed")
    volatile boolean isClosed;
    @ObfuscatedName(value="ai")
    @Export(value="requests")
    Queue requests = new LinkedList();
    @ObfuscatedName(value="ak")
    @Export(value="thread")
    final Thread thread = new Thread(this);

    public UrlRequester() {
        this.thread.setPriority(1);
        this.thread.start();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Ljava/net/URL;I)Ljk;", garbageValue="-319161049")
    @Export(value="request")
    public UrlRequest request(URL object) {
        object = this.method5983((URL)object, null);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Ljava/net/URL;Ljj;I)Ljk;", garbageValue="826548247")
    UrlRequest method5983(URL object, class139 class1392) {
        object = new UrlRequest((URL)object, class1392);
        synchronized (this) {
            this.requests.add(object);
            this.notify();
            return object;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="7390")
    @Export(value="close")
    public void close() {
        this.isClosed = true;
        try {
            synchronized (this) {
                this.notify();
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        {
            this.thread.join();
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        block26: {
            while ((var2_2 = this.isClosed) == false) {
                block25: {
                    block24: {
                        block27: {
                            block23: {
                                var8_17 = (UrlRequest)this.requests.poll();
                                if (var8_17 == null) {
                                    this.wait();
                                    break block23;
                                }
                                var5_14 = var8_17.field3577.openConnection();
                                var5_14.setConnectTimeout(5000);
                                var5_14.setReadTimeout(5000);
                                var5_14.setUseCaches(false);
                                var5_14.setRequestProperty("Connection", "close");
                                var5_14.setRequestProperty("Accept-Encoding", "identity");
                                var1_1 = var5_14.getContentLength();
                                if (var1_1 < 0) break block24;
                                var9_18 = new byte[var1_1];
                                var7_16 = var4_9 = new DataInputStream(var5_14.getInputStream());
                                var6_15 = var5_14;
                                var3_3 = var4_9;
                                var4_9.readFully(var9_18);
                                var7_16 = var4_9;
                                var6_15 = var5_14;
                                var3_3 = var4_9;
                                var8_17.response0 = var9_18;
                                break block25;
                                catch (Throwable var4_10) {
                                    var3_3 = null;
                                    break block26;
                                }
                                catch (Throwable var4_11) {
                                    var5_14 = null;
                                    var3_3 = var5_14;
                                    break block26;
                                }
                                catch (InterruptedException var3_7) {}
                            }
                            // MONITOREXIT : this
                            continue;
                            catch (IOException var3_5) {}
                            var5_14 = null;
                            var4_9 = var5_14;
                            break block27;
                            catch (IOException var3_4) {}
                            var4_9 = null;
                            break block27;
                            catch (IOException var3_8) {
                                var4_9 = var7_16;
                            }
                        }
                        var6_15 = var5_14;
                        var3_3 = var4_9;
                        var8_17.method5946();
                        if (var4_9 == null) ** GOTO lbl56
                        var4_9.close();
lbl56:
                        // 2 sources

                        if (var5_14 == null || !(var5_14 instanceof HttpURLConnection)) continue;
                        var3_3 = (HttpURLConnection)var5_14;
                        ** GOTO lbl71
                    }
                    var4_9 = null;
                }
                var7_16 = var4_9;
                var6_15 = var5_14;
                var3_3 = var4_9;
                var8_17.method5946();
                if (var4_9 == null) ** GOTO lbl69
                try {
                    var4_9.close();
lbl69:
                    // 2 sources

                    if (var5_14 == null || !(var5_14 instanceof HttpURLConnection)) continue;
                    var3_3 = (HttpURLConnection)var5_14;
lbl71:
                    // 2 sources

                    var3_3.disconnect();
                }
                catch (Exception var3_6) {
                    class56.RunException_sendStackTrace(null, var3_6);
                }
            }
            return;
            catch (Throwable var4_13) {
                var5_14 = var6_15;
            }
        }
        if (var3_3 != null) {
            var3_3.close();
        }
        if (var5_14 == null) throw var4_12;
        if (var5_14 instanceof HttpURLConnection == false) throw var4_12;
        ((HttpURLConnection)var5_14).disconnect();
        throw var4_12;
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="-1749488936")
    @Export(value="inventoryQuantityFormat")
    static final String inventoryQuantityFormat(int n) {
        if (n >= 100000) {
            if (n >= 10000000) {
                CharSequence charSequence = new StringBuilder();
                charSequence.append("<col=00ff80>");
                charSequence.append(n / 1000000);
                charSequence.append("M");
                charSequence.append("</col>");
                charSequence = charSequence.toString();
                return charSequence;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<col=ffffff>");
            stringBuilder.append(n / 1000);
            stringBuilder.append("K");
            stringBuilder.append("</col>");
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<col=ffff00>");
        stringBuilder.append(n);
        stringBuilder.append("</col>");
        return stringBuilder.toString();
    }
}

