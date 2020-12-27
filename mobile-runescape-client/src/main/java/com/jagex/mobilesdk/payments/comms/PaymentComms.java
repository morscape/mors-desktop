/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments.comms;

import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms;
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms$CompletePaymentCallback;
import com.jagex.mobilesdk.payments.comms.FetchCategoriesComms;
import com.jagex.mobilesdk.payments.comms.FetchCategoriesComms$FetchCategoriesCallback;
import com.jagex.mobilesdk.payments.comms.FetchImageComms;
import com.jagex.mobilesdk.payments.comms.FetchImageComms$FetchImageCallback;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import java.util.HashMap;
import java.util.Locale;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="PaymentComms")
public class PaymentComms {
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/payments/comms/FetchImageComms$FetchImageCallback;Z)V", garbageValue="1")
    public static void FetchImageComms(String string2, FetchImageComms$FetchImageCallback fetchImageComms$FetchImageCallback, boolean bl) {
        FetchImageComms fetchImageComms = new FetchImageComms(string2, fetchImageComms$FetchImageCallback);
        fetchImageComms.execute(new Void[0]);
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;FLcom/jagex/mobilesdk/payments/comms/FetchCategoriesComms$FetchCategoriesCallback;Z)V", garbageValue="1")
    public static void fetchCategoriesComms(String string2, MobileAuthState object, float f, FetchCategoriesComms$FetchCategoriesCallback fetchCategoriesComms$FetchCategoriesCallback, boolean bl) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(((MobileAuthState)object).getAccessToken());
        hashMap.put("Authorization", stringBuilder.toString());
        object = new StringBuilder();
        ((StringBuilder)object).append(f);
        ((StringBuilder)object).append(",d=android");
        hashMap.put("Accept-Resolution", ((StringBuilder)object).toString());
        hashMap.put("Accept-Language", Locale.getDefault().getLanguage());
        object = new FetchCategoriesComms(string2, hashMap, fetchCategoriesComms$FetchCategoriesCallback);
        object.execute((Object[])new Void[0]);
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/payments/model/PaymentCompletionRequest;Lcom/jagex/mobilesdk/payments/comms/CompletePaymentComms$CompletePaymentCallback;Z)V", garbageValue="1")
    public static void completePaymentsComms(String string2, MobileAuthState object, PaymentCompletionRequest paymentCompletionRequest, CompletePaymentComms$CompletePaymentCallback completePaymentComms$CompletePaymentCallback, boolean bl) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(object.getAccessToken());
        hashMap.put("Authorization", stringBuilder.toString());
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept-Type", "application/json");
        object = new CompletePaymentComms(string2, hashMap, paymentCompletionRequest, completePaymentComms$CompletePaymentCallback);
        object.execute(new Void[0]);
    }
}

