/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ConsumeResponseListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$3")
class BillingClientWrapper$3
implements ConsumeResponseListener {
    final /* synthetic */ BillingClientWrapper this$0;
    final /* synthetic */ BillingClientWrapper$BillingClientWrapperListener val$listener;

    BillingClientWrapper$3(BillingClientWrapper billingClientWrapper, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        this.this$0 = billingClientWrapper;
        this.val$listener = billingClientWrapper$BillingClientWrapperListener;
    }

    public void onConsumeResponse(BillingResult billingResult, String string2) {
        if (billingResult.getResponseCode() == 0) {
            this.val$listener.onSuccess(string2);
            return;
        }
        this.val$listener.onFailure(billingResult.getResponseCode());
    }
}

