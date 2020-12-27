/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.auth.comms.GameTokenComms$FetchGameTokenCallback;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="GameTokenComms")
public class GameTokenComms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private final String field2236;
    private final GameTokenComms$FetchGameTokenCallback callback;
    private int responseCode;
    private Exception exception;
    private final Map headers;

    GameTokenComms(String string2, Map map, GameTokenComms$FetchGameTokenCallback gameTokenComms$FetchGameTokenCallback) {
        this.field2236 = string2;
        this.headers = map;
        this.callback = gameTokenComms$FetchGameTokenCallback;
    }

    protected String doInBackground(Void ... arrvoid) {
        return this.fetchGameTokenAction(this.field2236, this.headers);
    }

    protected void onPostExecute(String string2) {
        this.fetchGameTokenPostAction(string2, this.callback);
    }

    public void fetchGameTokenPostAction(String string2, GameTokenComms$FetchGameTokenCallback gameTokenComms$FetchGameTokenCallback) {
        gameTokenComms$FetchGameTokenCallback.onGameTokenResult(new CommsResult(string2, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String fetchGameTokenAction(String object, Map object22) {
        void var1_4;
        Object object3;
        block11: {
            String string2;
            String string3;
            block12: {
                string3 = "";
                Object var6_9 = null;
                string2 = null;
                try {
                    object3 = (HttpURLConnection)new URL((String)object).openConnection();
                }
                catch (Throwable throwable) {
                    object3 = string2;
                    break block11;
                }
                catch (Exception exception) {
                    object = var6_9;
                    break block12;
                }
                try {
                    for (Object object22 : object22.entrySet()) {
                        ((URLConnection)object3).setRequestProperty((String)object22.getKey(), (String)object22.getValue());
                    }
                    ((HttpURLConnection)object3).setInstanceFollowRedirects(false);
                    this.responseCode = ((HttpURLConnection)object3).getResponseCode();
                    if (this.responseCode == 200) {
                        object = new BufferedReader(new InputStreamReader(((URLConnection)object3).getInputStream()));
                        object22 = new StringBuilder();
                        while ((string2 = ((BufferedReader)object).readLine()) != null) {
                            ((StringBuilder)object22).append(string2);
                        }
                        object = ((StringBuilder)object22).toString();
                    } else {
                        this.exception = new Exception("Invalid HTTP Response");
                        object = string3;
                    }
                    object22 = object;
                    if (object3 == null) return object22;
                    ((HttpURLConnection)object3).disconnect();
                    return object;
                }
                catch (Throwable throwable) {
                    break block11;
                }
                catch (Exception exception) {
                    object = object3;
                }
            }
            string2 = object;
            {
                this.exception = object22;
                object22 = string3;
                if (object == null) return object22;
                ((HttpURLConnection)object).disconnect();
                return string3;
            }
        }
        if (object3 == null) throw var1_4;
        ((HttpURLConnection)object3).disconnect();
        throw var1_4;
    }
}

