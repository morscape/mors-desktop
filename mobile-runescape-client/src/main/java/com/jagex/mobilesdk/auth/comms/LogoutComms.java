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
import com.jagex.mobilesdk.auth.comms.LogoutComms$PerformLogoutCallback;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="LogoutComms")
public class LogoutComms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private String field2237;
    private LogoutComms$PerformLogoutCallback callback;
    private int responseCode;
    private Exception exception;
    private Map headers;
    private Map params;

    LogoutComms(String string2, Map map, Map map2, LogoutComms$PerformLogoutCallback logoutComms$PerformLogoutCallback) {
        this.field2237 = string2;
        this.headers = map;
        this.callback = logoutComms$PerformLogoutCallback;
        this.params = map2;
    }

    protected String doInBackground(Void ... arrvoid) {
        return this.logoutAction(this.field2237, this.headers, this.params);
    }

    protected void onPostExecute(String string2) {
        this.logoutPostAction(string2, this.callback);
    }

    public void logoutPostAction(String string2, LogoutComms$PerformLogoutCallback logoutComms$PerformLogoutCallback) {
        logoutComms$PerformLogoutCallback.onLogoutResult(new CommsResult(string2, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String logoutAction(String object, Map object22, Map object3) {
        void var1_4;
        Object object4;
        block11: {
            CharSequence charSequence;
            String string2;
            block12: {
                string2 = "";
                Object var7_10 = null;
                charSequence = null;
                try {
                    object4 = (HttpURLConnection)new URL((String)object).openConnection();
                }
                catch (Throwable throwable) {
                    object4 = charSequence;
                    break block11;
                }
                catch (Exception exception) {
                    object = var7_10;
                    break block12;
                }
                try {
                    ((HttpURLConnection)object4).setRequestMethod("POST");
                    ((URLConnection)object4).setDoOutput(true);
                    ((HttpURLConnection)object4).setInstanceFollowRedirects(false);
                    for (Object object22 : object22.entrySet()) {
                        ((URLConnection)object4).setRequestProperty((String)object22.getKey(), (String)object22.getValue());
                    }
                    object = CommsUtils.formUrlEncode((Map)object3);
                    ((URLConnection)object4).setRequestProperty("Content-Length", String.valueOf(((String)object).length()));
                    object22 = new OutputStreamWriter(((URLConnection)object4).getOutputStream());
                    ((Writer)object22).write((String)object);
                    ((OutputStreamWriter)object22).flush();
                    ((URLConnection)object4).connect();
                    this.responseCode = ((HttpURLConnection)object4).getResponseCode();
                    if (this.responseCode == 200) {
                        object = new BufferedReader(new InputStreamReader(((URLConnection)object4).getInputStream()));
                        object22 = new StringBuilder();
                        while ((object3 = ((BufferedReader)object).readLine()) != null) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append((String)object3);
                            ((StringBuilder)charSequence).append('\n');
                            ((StringBuilder)object22).append(((StringBuilder)charSequence).toString());
                        }
                        object = ((StringBuilder)object22).toString();
                    } else {
                        this.exception = new Exception("Invalid HTTP Response");
                        object = string2;
                    }
                    object22 = object;
                    if (object4 == null) return object22;
                    ((HttpURLConnection)object4).disconnect();
                    return object;
                }
                catch (Throwable throwable) {
                    break block11;
                }
                catch (Exception exception) {
                    object = object4;
                }
            }
            charSequence = object;
            {
                this.exception = object22;
                object22 = string2;
                if (object == null) return object22;
                ((HttpURLConnection)object).disconnect();
                return string2;
            }
        }
        if (object4 == null) throw var1_4;
        ((HttpURLConnection)object4).disconnect();
        throw var1_4;
    }
}

