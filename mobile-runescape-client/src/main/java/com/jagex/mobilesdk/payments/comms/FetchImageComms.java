/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.os.AsyncTask
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
package com.jagex.mobilesdk.payments.comms;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.FetchImageComms$FetchImageCallback;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="FetchImageComms")
public class FetchImageComms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private String field2243;
    private FetchImageComms$FetchImageCallback callback;
    private Exception exception;
    private int responseCode = 0;

    FetchImageComms(String string2, FetchImageComms$FetchImageCallback fetchImageComms$FetchImageCallback) {
        this.field2243 = string2;
        this.callback = fetchImageComms$FetchImageCallback;
    }

    protected Bitmap doInBackground(Void ... arrvoid) {
        return this.fetchImageAction(this.field2243);
    }

    protected void onPostExecute(Bitmap bitmap) {
        this.fetchImagePostAction(bitmap, this.callback);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Bitmap fetchImageAction(String object) {
        void var1_4;
        Object object2;
        block11: {
            block9: {
                block10: {
                    object2 = object = (HttpURLConnection)new URL((String)object).openConnection();
                    try {
                        ((HttpURLConnection)object).setRequestMethod("GET");
                        object2 = object;
                        ((URLConnection)object).connect();
                        object2 = object;
                        this.responseCode = ((HttpURLConnection)object).getResponseCode();
                        object2 = object;
                        if (this.responseCode == 200) {
                            object2 = object;
                            InputStream inputStream = ((URLConnection)object).getInputStream();
                            if (inputStream != null) {
                                object2 = object;
                                inputStream = BitmapFactory.decodeStream((InputStream)inputStream);
                                if (object == null) return inputStream;
                                ((HttpURLConnection)object).disconnect();
                                return inputStream;
                            }
                        }
                        if (object == null) return null;
                        break block9;
                    }
                    catch (Exception exception) {
                        break block10;
                    }
                    catch (Throwable throwable) {
                        object2 = null;
                        break block11;
                    }
                    catch (Exception exception) {
                        object = null;
                    }
                }
                object2 = object;
                try {
                    void var3_9;
                    this.exception = var3_9;
                    if (object == null) return null;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            ((HttpURLConnection)object).disconnect();
            return null;
        }
        if (object2 == null) throw var1_4;
        ((HttpURLConnection)object2).disconnect();
        throw var1_4;
    }

    public void fetchImagePostAction(Bitmap bitmap, FetchImageComms$FetchImageCallback fetchImageComms$FetchImageCallback) {
        fetchImageComms$FetchImageCallback.onFetchImageResult(new CommsResult((Object)bitmap, this.responseCode), this.exception);
    }
}

