/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.Purchase
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.Purchase;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePayments$5")
class MobilePayments$5
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ MobilePayments this$0;
    final /* synthetic */ MobilePayments$MobilePaymentsListener val$listener;

    MobilePayments$5(MobilePayments mobilePayments, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        this.this$0 = mobilePayments;
        this.val$listener = mobilePayments$MobilePaymentsListener;
    }

    public void onSuccess(Purchase purchase) {
        this.val$listener.onSuccess();
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }
}

