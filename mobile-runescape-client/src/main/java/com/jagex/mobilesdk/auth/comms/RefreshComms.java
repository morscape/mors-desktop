/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.auth.comms.RefreshComms$RefreshTokenCallback;
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
import org.json.JSONException;
import org.json.JSONObject;

@Implements(value="RefreshComms")
public class RefreshComms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private String field2238;
    private RefreshComms$RefreshTokenCallback callback;
    private Exception exception;
    private Map headers;
    private Map params;
    private int responseCode;

    RefreshComms(String string2, Map map, Map map2, RefreshComms$RefreshTokenCallback refreshComms$RefreshTokenCallback) {
        this.field2238 = string2;
        this.headers = map;
        this.callback = refreshComms$RefreshTokenCallback;
        this.params = map2;
    }

    protected JSONObject doInBackground(Void ... arrvoid) {
        return this.refreshTokenAction(this.field2238, this.headers, this.params);
    }

    protected void onPostExecute(JSONObject jSONObject) {
        this.refreshTokenPostAction(jSONObject, this.callback);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void refreshTokenPostAction(JSONObject jSONObject, RefreshComms$RefreshTokenCallback refreshComms$RefreshTokenCallback) {
        String string2 = "";
        try {
            Long l = 0L;
            String string3 = "";
            if (jSONObject != null) {
                string2 = jSONObject.getString("access_token");
                l = System.currentTimeMillis() + jSONObject.getLong("expires_in") * 1000L;
                string3 = jSONObject.getString("refresh_token");
            }
            refreshComms$RefreshTokenCallback.onTokenResult(string2, l, string3, this.exception);
            return;
        }
        catch (JSONException jSONException) {}
        refreshComms$RefreshTokenCallback.onTokenResult("", 0L, "", this.exception);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public JSONObject refreshTokenAction(String object, Map object2, Map object3) {
        void var1_4;
        Object object4;
        block13: {
            Object object5;
            block11: {
                Object var7_10;
                Object var6_9;
                block12: {
                    var6_9 = null;
                    var7_10 = null;
                    StringBuilder stringBuilder = null;
                    object4 = object5 = (HttpURLConnection)new URL((String)object).openConnection();
                    try {
                        ((HttpURLConnection)object5).setRequestMethod("POST");
                        object4 = object5;
                        ((URLConnection)object5).setDoOutput(true);
                        object4 = object5;
                        object = object2.entrySet().iterator();
                        while (true) {
                            object4 = object5;
                            if (!object.hasNext()) break;
                            object4 = object5;
                            object2 = object.next();
                            object4 = object5;
                            ((URLConnection)object5).setRequestProperty((String)object2.getKey(), (String)object2.getValue());
                        }
                        object4 = object5;
                        object = CommsUtils.formUrlEncode((Map)object3);
                        object4 = object5;
                        ((URLConnection)object5).setRequestProperty("Content-Length", String.valueOf(((String)object).length()));
                        object4 = object5;
                        object2 = new OutputStreamWriter(((URLConnection)object5).getOutputStream());
                        object4 = object5;
                        ((Writer)object2).write((String)object);
                        object4 = object5;
                        ((OutputStreamWriter)object2).flush();
                        object4 = object5;
                        ((URLConnection)object5).connect();
                        object4 = object5;
                        this.responseCode = ((HttpURLConnection)object5).getResponseCode();
                        object4 = object5;
                        if (this.responseCode == 200) {
                            object4 = object5;
                            object = new BufferedReader(new InputStreamReader(((URLConnection)object5).getInputStream()));
                            object4 = object5;
                            object2 = new StringBuilder();
                            while (true) {
                                object4 = object5;
                                object3 = ((BufferedReader)object).readLine();
                                if (object3 == null) break;
                                object4 = object5;
                                stringBuilder = new StringBuilder();
                                object4 = object5;
                                stringBuilder.append((String)object3);
                                object4 = object5;
                                stringBuilder.append('\n');
                                object4 = object5;
                                ((StringBuilder)object2).append(stringBuilder.toString());
                            }
                            object4 = object5;
                            object = new JSONObject(((StringBuilder)object2).toString());
                        } else {
                            object4 = object5;
                            this.exception = new Exception("Invalid HTTP Response");
                            object = stringBuilder;
                        }
                        object2 = object;
                        if (object5 == null) return object2;
                        object2 = object;
                        break block11;
                    }
                    catch (Exception exception) {
                        object = object5;
                        break block12;
                    }
                    catch (Throwable throwable) {
                        object4 = null;
                        break block13;
                    }
                    catch (Exception exception) {
                        object = null;
                    }
                }
                object4 = object;
                try {
                    this.exception = object2;
                    object2 = var7_10;
                    if (object == null) return object2;
                    object2 = var6_9;
                    object5 = object;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            ((HttpURLConnection)object5).disconnect();
            return object2;
        }
        if (object4 == null) throw var1_4;
        ((HttpURLConnection)object4).disconnect();
        throw var1_4;
    }
}

