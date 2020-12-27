/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentService$4$1;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$4")
class MobilePaymentService$4
implements MobileAuthStateManager$AuthManagerAction {
    final /* synthetic */ MobilePaymentService this$0;
    final /* synthetic */ MobilePaymentServiceListener val$listener;
    final /* synthetic */ String val$purchaseID;

    MobilePaymentService$4(MobilePaymentService mobilePaymentService, String string2, MobilePaymentServiceListener mobilePaymentServiceListener) {
        this.this$0 = mobilePaymentService;
        this.val$purchaseID = string2;
        this.val$listener = mobilePaymentServiceListener;
    }

    @Override
    public void execute(String string2, Exception exception) {
        MobilePaymentService.access$000(this.this$0).purchaseItem(this.val$purchaseID, MobilePaymentService.access$100(this.this$0), MobilePaymentService.access$200(this.this$0).getAuthState(), MobilePaymentService.access$300(this.this$0), (MobilePayments$MobilePaymentsListener)new MobilePaymentService$4$1(this));
    }
}

