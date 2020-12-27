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
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms$ShieldOAuth2Callback;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
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
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import org.json.JSONException;
import org.json.JSONObject;

@Implements(value="ShieldOAuth2Comms")
public class ShieldOAuth2Comms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private final String field2239;
    private final ShieldOAuth2Comms$ShieldOAuth2Callback callback;
    private Exception exception;
    private final Map headers;
    private final Map params;
    private int responseCode;

    ShieldOAuth2Comms(String string2, Map map, Map map2, ShieldOAuth2Comms$ShieldOAuth2Callback shieldOAuth2Comms$ShieldOAuth2Callback) {
        this.field2239 = string2;
        this.headers = map;
        this.callback = shieldOAuth2Comms$ShieldOAuth2Callback;
        this.params = map2;
    }

    protected JSONObject doInBackground(Void ... arrvoid) {
        return this.shieldOAuth2Action(this.field2239, this.headers, this.params);
    }

    protected void onPostExecute(JSONObject jSONObject) {
        this.shieldOAuth2PostAction(jSONObject, this.callback);
    }

    public void shieldOAuth2PostAction(JSONObject jSONObject, ShieldOAuth2Comms$ShieldOAuth2Callback shieldOAuth2Comms$ShieldOAuth2Callback) {
        MobileAuthState mobileAuthState = new MobileAuthState();
        if (jSONObject != null) {
            try {
                mobileAuthState.setAccessToken(jSONObject.getString("access_token"));
                mobileAuthState.setRefreshToken(jSONObject.getString("refresh_token"));
                mobileAuthState.reset(System.currentTimeMillis() + jSONObject.getLong("expires_in") * 1000L);
            }
            catch (JSONException jSONException) {
                this.exception = jSONException;
            }
        }
        shieldOAuth2Comms$ShieldOAuth2Callback.onShieldOAuth2Result(new CommsResult(mobileAuthState, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public JSONObject shieldOAuth2Action(String object, Map object2, Map object3) {
        void var1_4;
        Object object4;
        block13: {
            block11: {
                block10: {
                    Object object5;
                    object4 = object = (HttpsURLConnection)new URL((String)object).openConnection();
                    ((HttpURLConnection)object).setRequestMethod("POST");
                    object4 = object;
                    ((URLConnection)object).setDoOutput(true);
                    object4 = object;
                    object2 = object2.entrySet().iterator();
                    while (true) {
                        object4 = object;
                        if (!object2.hasNext()) break;
                        object4 = object;
                        object5 = object2.next();
                        object4 = object;
                        ((URLConnection)object).setRequestProperty((String)object5.getKey(), (String)object5.getValue());
                    }
                    object4 = object;
                    object2 = CommsUtils.formUrlEncode((Map)object3);
                    object4 = object;
                    ((URLConnection)object).setRequestProperty("Content-Length", String.valueOf(((String)object2).length()));
                    object4 = object;
                    object3 = new OutputStreamWriter(((URLConnection)object).getOutputStream());
                    object4 = object;
                    ((Writer)object3).write((String)object2);
                    object4 = object;
                    ((OutputStreamWriter)object3).flush();
                    object4 = object;
                    ((URLConnection)object).connect();
                    object4 = object;
                    this.responseCode = ((HttpURLConnection)object).getResponseCode();
                    object4 = object;
                    if (this.responseCode != 200) break block10;
                    object4 = object;
                    object2 = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream()));
                    object4 = object;
                    object3 = new StringBuilder();
                    while (true) {
                        object4 = object;
                        object5 = ((BufferedReader)object2).readLine();
                        if (object5 == null) break;
                        object4 = object;
                        StringBuilder stringBuilder = new StringBuilder();
                        object4 = object;
                        stringBuilder.append((String)object5);
                        object4 = object;
                        stringBuilder.append('\n');
                        object4 = object;
                        ((StringBuilder)object3).append(stringBuilder.toString());
                    }
                    object4 = object;
                    object2 = new JSONObject(((StringBuilder)object3).toString());
                    if (object == null) return object2;
                    ((HttpURLConnection)object).disconnect();
                    return object2;
                }
                object4 = object;
                try {
                    void var2_8;
                    block12: {
                        try {
                            this.exception = new Exception("Invalid HTTP Response");
                            if (object == null) return null;
                            break block11;
                        }
                        catch (Exception exception) {
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
                    this.exception = var2_8;
                    if (object == null) return null;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            ((HttpURLConnection)object).disconnect();
            return null;
        }
        if (object4 == null) throw var1_4;
        ((HttpURLConnection)object4).disconnect();
        throw var1_4;
    }
}

