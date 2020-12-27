/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.MobilePaymentService$4;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$4$1")
class MobilePaymentService$4$1
implements MobilePayments$MobilePaymentsListener {
    final /* synthetic */ MobilePaymentService$4 this$1;

    MobilePaymentService$4$1(MobilePaymentService$4 mobilePaymentService$4) {
        this.this$1 = mobilePaymentService$4;
    }

    @Override
    public void onSuccess() {
        this.this$1.val$listener.onSuccess();
    }

    @Override
    public void onFailure(int n) {
        this.this$1.val$listener.onFailure(n);
    }
}

