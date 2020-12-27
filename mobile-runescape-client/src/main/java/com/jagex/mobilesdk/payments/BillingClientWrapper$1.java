/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingResult
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperInitListener;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$1")
class BillingClientWrapper$1
implements BillingClientStateListener {
    final /* synthetic */ BillingClientWrapper this$0;
    final /* synthetic */ BillingClientWrapper$BillingClientWrapperInitListener val$listener;

    BillingClientWrapper$1(BillingClientWrapper billingClientWrapper, BillingClientWrapper$BillingClientWrapperInitListener billingClientWrapper$BillingClientWrapperInitListener) {
        this.this$0 = billingClientWrapper;
        this.val$listener = billingClientWrapper$BillingClientWrapperInitListener;
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        this.val$listener.billingClientInitResponse(billingResult.getResponseCode());
    }

    public void onBillingServiceDisconnected() {
    }
}

