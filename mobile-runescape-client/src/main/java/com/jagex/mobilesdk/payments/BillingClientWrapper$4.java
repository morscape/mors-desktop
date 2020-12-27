/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.AcknowledgePurchaseResponseListener
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.Purchase
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$4")
class BillingClientWrapper$4
implements AcknowledgePurchaseResponseListener {
    final /* synthetic */ BillingClientWrapper this$0;
    final /* synthetic */ BillingClientWrapper$BillingClientWrapperListener val$listener;
    final /* synthetic */ Purchase val$purchase;

    BillingClientWrapper$4(BillingClientWrapper billingClientWrapper, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener, Purchase purchase) {
        this.this$0 = billingClientWrapper;
        this.val$listener = billingClientWrapper$BillingClientWrapperListener;
        this.val$purchase = purchase;
    }

    public void onAcknowledgePurchaseResponse(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            this.val$listener.onSuccess((Object)this.val$purchase);
            return;
        }
        this.val$listener.onFailure(billingResult.getResponseCode());
    }
}

