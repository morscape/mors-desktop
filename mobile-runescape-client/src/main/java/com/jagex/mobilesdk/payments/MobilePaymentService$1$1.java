/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperInitListener;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentService$1;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$1$1")
class MobilePaymentService$1$1
implements BillingClientWrapper$BillingClientWrapperInitListener {
    final /* synthetic */ MobilePaymentService$1 this$1;
    final /* synthetic */ BillingClientWrapper val$billingClientWrapper;

    MobilePaymentService$1$1(MobilePaymentService$1 mobilePaymentService$1, BillingClientWrapper billingClientWrapper) {
        this.this$1 = mobilePaymentService$1;
        this.val$billingClientWrapper = billingClientWrapper;
    }

    @Override
    public void billingClientInitResponse(int n) {
        if (n == 0) {
            MobilePaymentService.access$000(this.this$1.this$0).init(this.val$billingClientWrapper);
            MobilePaymentService.access$100(this.this$1.this$0).init(this.val$billingClientWrapper);
            this.this$1.val$listener.onSuccess();
            return;
        }
        this.this$1.val$listener.onFailure(n);
    }
}

