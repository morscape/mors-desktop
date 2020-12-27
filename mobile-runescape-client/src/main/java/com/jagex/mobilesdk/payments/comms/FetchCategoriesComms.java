/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  com.google.gson.Gson
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
package com.jagex.mobilesdk.payments.comms;

import android.os.AsyncTask;
import com.google.gson.Gson;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.FetchCategoriesComms$FetchCategoriesCallback;
import com.jagex.mobilesdk.payments.model.Shop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="FetchCategoriesComms")
public class FetchCategoriesComms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private String field2242;
    private FetchCategoriesComms$FetchCategoriesCallback callback;
    private int responseCode = 0;
    private Exception exception;
    private Map headers;

    FetchCategoriesComms(String string2, Map map, FetchCategoriesComms$FetchCategoriesCallback fetchCategoriesComms$FetchCategoriesCallback) {
        this.field2242 = string2;
        this.headers = map;
        this.callback = fetchCategoriesComms$FetchCategoriesCallback;
    }

    protected Shop doInBackground(Void ... arrvoid) {
        return this.fetchCategoriesAction(this.field2242, this.headers);
    }

    protected void onPostExecute(Shop shop) {
        this.fetchCategoriesPostAction(shop, this.callback);
    }

    public void fetchCategoriesPostAction(Shop shop, FetchCategoriesComms$FetchCategoriesCallback fetchCategoriesComms$FetchCategoriesCallback) {
        fetchCategoriesComms$FetchCategoriesCallback.onFetchPackagesResult(new CommsResult(shop, this.responseCode), this.exception);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Shop fetchCategoriesAction(String object, Map object2) {
        void var1_4;
        Object object3;
        block14: {
            block12: {
                void var2_8;
                block13: {
                    object3 = object = (HttpURLConnection)new URL((String)object).openConnection();
                    try {
                        Object object4;
                        object2 = object2.entrySet().iterator();
                        while (true) {
                            object3 = object;
                            if (!object2.hasNext()) break;
                            object3 = object;
                            object4 = object2.next();
                            object3 = object;
                            ((URLConnection)object).setRequestProperty((String)object4.getKey(), (String)object4.getValue());
                        }
                        object3 = object;
                        ((HttpURLConnection)object).setRequestMethod("GET");
                        object3 = object;
                        ((URLConnection)object).connect();
                        object3 = object;
                        this.responseCode = ((HttpURLConnection)object).getResponseCode();
                        object3 = object;
                        if (this.responseCode == 200) {
                            object3 = object;
                            object2 = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream()));
                            object3 = object;
                            object4 = new StringBuilder();
                            while (true) {
                                object3 = object;
                                String string2 = ((BufferedReader)object2).readLine();
                                if (string2 == null) {
                                    object3 = object;
                                    object2 = ((StringBuilder)object4).toString();
                                    object3 = object;
                                    object2 = (Shop)new Gson().fromJson((String)object2, Shop.class);
                                    if (object == null) return object2;
                                    ((HttpURLConnection)object).disconnect();
                                    return object2;
                                }
                                object3 = object;
                                StringBuilder stringBuilder = new StringBuilder();
                                object3 = object;
                                stringBuilder.append(string2);
                                object3 = object;
                                stringBuilder.append('\n');
                                object3 = object;
                                ((StringBuilder)object4).append(stringBuilder.toString());
                            }
                        }
                        object3 = object;
                        this.exception = new Exception("Invalid HTTP Response");
                        if (object == null) return null;
                        break block12;
                    }
                    catch (Exception exception) {
                        break block13;
                    }
                    catch (Throwable throwable) {
                        object3 = null;
                        break block14;
                    }
                    catch (Exception exception) {
                        object = null;
                    }
                }
                object3 = object;
                this.exception = var2_8;
                if (object == null) return null;
            }
            ((HttpURLConnection)object).disconnect();
            return null;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (object3 == null) throw var1_4;
        ((HttpURLConnection)object3).disconnect();
        throw var1_4;
    }
}

