/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import com.jagex.mobilesdk.payments.PurchaseHistory$PurchaseHistoryListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$3")
class MobilePaymentService$3
implements PurchaseHistory$PurchaseHistoryListener {
    final /* synthetic */ MobilePaymentService this$0;
    final /* synthetic */ MobilePaymentServiceListener val$listener;

    MobilePaymentService$3(MobilePaymentService mobilePaymentService, MobilePaymentServiceListener mobilePaymentServiceListener) {
        this.this$0 = mobilePaymentService;
        this.val$listener = mobilePaymentServiceListener;
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }

    @Override
    public void onSuccess() {
        this.val$listener.onSuccess();
    }
}

