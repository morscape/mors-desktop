/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentService$1$1;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$1")
class MobilePaymentService$1
implements Runnable {
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ MobilePaymentService this$0;
    final /* synthetic */ MobilePaymentServiceListener val$listener;

    MobilePaymentService$1(MobilePaymentService mobilePaymentService, Activity activity, MobilePaymentServiceListener mobilePaymentServiceListener) {
        this.this$0 = mobilePaymentService;
        this.val$activity = activity;
        this.val$listener = mobilePaymentServiceListener;
    }

    @Override
    public void run() {
        BillingClientWrapper billingClientWrapper = new BillingClientWrapper(this.val$activity);
        billingClientWrapper.initBillingClient(BillingClient.newBuilder((Context)this.val$activity).setListener((PurchasesUpdatedListener)billingClientWrapper).enablePendingPurchases().build(), new MobilePaymentService$1$1(this, billingClientWrapper));
    }
}

