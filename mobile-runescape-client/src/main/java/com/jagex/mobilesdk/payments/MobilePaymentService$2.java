/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$2")
class MobilePaymentService$2
implements MobilePayments$MobilePaymentsListener {
    final /* synthetic */ MobilePaymentService this$0;
    int pendingTransactionsApplied = 0;
    final /* synthetic */ MobilePaymentServiceListener val$listener;
    final /* synthetic */ int val$unconsumedSize;

    MobilePaymentService$2(MobilePaymentService mobilePaymentService, int n, MobilePaymentServiceListener mobilePaymentServiceListener) {
        this.this$0 = mobilePaymentService;
        this.val$unconsumedSize = n;
        this.val$listener = mobilePaymentServiceListener;
    }

    @Override
    public void onSuccess() {
        ++this.pendingTransactionsApplied;
        if (this.pendingTransactionsApplied == this.val$unconsumedSize) {
            this.val$listener.onSuccess();
        }
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }
}

