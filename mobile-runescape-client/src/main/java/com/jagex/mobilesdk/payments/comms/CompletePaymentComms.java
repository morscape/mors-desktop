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
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms$CompletePaymentCallback;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import com.jagex.mobilesdk.payments.model.PaymentCompletionResponse;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="CompletePaymentComms")
public class CompletePaymentComms
extends AsyncTask {
    @ObfuscatedName(value="url")
    private String field2241;
    private CompletePaymentComms$CompletePaymentCallback callback;
    private int responseCode = 0;
    private Exception exception;
    private Map headers;
    PaymentCompletionRequest body;

    CompletePaymentComms(String string2, Map map, PaymentCompletionRequest paymentCompletionRequest, CompletePaymentComms$CompletePaymentCallback completePaymentComms$CompletePaymentCallback) {
        this.field2241 = string2;
        this.headers = map;
        this.body = paymentCompletionRequest;
        this.callback = completePaymentComms$CompletePaymentCallback;
    }

    protected PaymentCompletionResponse doInBackground(Void ... arrvoid) {
        return this.completePaymentAction(this.field2241, this.headers, this.body);
    }

    protected void onPostExecute(PaymentCompletionResponse paymentCompletionResponse) {
        this.completePaymentPostAction(paymentCompletionResponse, this.callback);
    }

    public void completePaymentPostAction(PaymentCompletionResponse paymentCompletionResponse, CompletePaymentComms$CompletePaymentCallback completePaymentComms$CompletePaymentCallback) {
        completePaymentComms$CompletePaymentCallback.onCompletePaymentResult(new CommsResult(paymentCompletionResponse, this.responseCode), this.exception);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public PaymentCompletionResponse completePaymentAction(String object, Map object2, PaymentCompletionRequest object3) {
        void var1_4;
        Object object4;
        block14: {
            block12: {
                void var2_8;
                block13: {
                    object4 = object = (HttpURLConnection)new URL((String)object).openConnection();
                    try {
                        Object object5;
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
                        object2 = new Gson().toJson(object3);
                        object4 = object;
                        ((HttpURLConnection)object).setRequestMethod("POST");
                        object4 = object;
                        ((URLConnection)object).setDoOutput(true);
                        object4 = object;
                        ((URLConnection)object).getOutputStream().write(((String)object2).getBytes("UTF-8"));
                        object4 = object;
                        ((URLConnection)object).connect();
                        object4 = object;
                        this.responseCode = ((HttpURLConnection)object).getResponseCode();
                        object4 = object;
                        if (this.responseCode == 200) {
                            object4 = object;
                            object2 = new BufferedReader(new InputStreamReader(((URLConnection)object).getInputStream()));
                            object4 = object;
                            object3 = new StringBuilder();
                            while (true) {
                                object4 = object;
                                object5 = ((BufferedReader)object2).readLine();
                                if (object5 == null) {
                                    object4 = object;
                                    object2 = ((StringBuilder)object3).toString();
                                    object4 = object;
                                    object2 = (PaymentCompletionResponse)new Gson().fromJson((String)object2, PaymentCompletionResponse.class);
                                    if (object == null) return object2;
                                    ((HttpURLConnection)object).disconnect();
                                    return object2;
                                }
                                object4 = object;
                                StringBuilder stringBuilder = new StringBuilder();
                                object4 = object;
                                stringBuilder.append((String)object5);
                                object4 = object;
                                stringBuilder.append('\n');
                                object4 = object;
                                ((StringBuilder)object3).append(stringBuilder.toString());
                            }
                        }
                        object4 = object;
                        this.exception = new Exception("Invalid HTTP Response");
                        if (object == null) return null;
                        break block12;
                    }
                    catch (Exception exception) {
                        break block13;
                    }
                    catch (Throwable throwable) {
                        object4 = null;
                        break block14;
                    }
                    catch (Exception exception) {
                        object = null;
                    }
                }
                object4 = object;
                this.exception = var2_8;
                if (object == null) return null;
            }
            ((HttpURLConnection)object).disconnect();
            return null;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (object4 == null) throw var1_4;
        ((HttpURLConnection)object4).disconnect();
        throw var1_4;
    }
}

