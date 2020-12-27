/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.app.Activity;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.MobilePaymentService$5$1;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import net.runelite.mapping.Implements;

@Implements(value="MobilePaymentService$5")
class MobilePaymentService$5
implements MobileAuthStateManager$AuthManagerAction {
    final /* synthetic */ MobilePaymentService this$0;
    final /* synthetic */ MobilePaymentServiceListener val$listener;
    final /* synthetic */ Activity val$activity;

    MobilePaymentService$5(MobilePaymentService mobilePaymentService, Activity activity, MobilePaymentServiceListener mobilePaymentServiceListener) {
        this.this$0 = mobilePaymentService;
        this.val$activity = activity;
        this.val$listener = mobilePaymentServiceListener;
    }

    @Override
    public void execute(String string2, Exception exception) {
        MobilePaymentService.access$000(this.this$0).fetchCategories(this.val$activity.getApplicationContext(), MobilePaymentService.access$200(this.this$0).getAuthState(), MobilePaymentService.access$300(this.this$0), new MobilePaymentService$5$1(this));
    }
}

