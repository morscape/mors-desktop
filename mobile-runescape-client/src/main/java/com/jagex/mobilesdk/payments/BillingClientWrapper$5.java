/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.SkuDetailsResponseListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$5")
class BillingClientWrapper$5
implements SkuDetailsResponseListener {
    final /* synthetic */ BillingClientWrapper this$0;
    final /* synthetic */ BillingClientWrapper$BillingClientWrapperListener val$listener;

    BillingClientWrapper$5(BillingClientWrapper billingClientWrapper, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        this.this$0 = billingClientWrapper;
        this.val$listener = billingClientWrapper$BillingClientWrapperListener;
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            this.val$listener.onSuccess(list);
            return;
        }
        this.val$listener.onFailure(billingResult.getResponseCode());
    }
}

