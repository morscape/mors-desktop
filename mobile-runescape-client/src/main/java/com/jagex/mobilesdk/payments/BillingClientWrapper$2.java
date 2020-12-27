/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchaseHistoryResponseListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$2")
class BillingClientWrapper$2
implements PurchaseHistoryResponseListener {
    final /* synthetic */ BillingClientWrapper this$0;
    final /* synthetic */ BillingClientWrapper$BillingClientWrapperListener val$listener;

    BillingClientWrapper$2(BillingClientWrapper billingClientWrapper, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        this.this$0 = billingClientWrapper;
        this.val$listener = billingClientWrapper$BillingClientWrapperListener;
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            this.val$listener.onSuccess(list);
            return;
        }
        this.val$listener.onFailure(billingResult.getResponseCode());
    }
}

