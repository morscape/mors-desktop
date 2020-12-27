/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$2;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="MobilePayments$2$1")
class MobilePayments$2$1
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ MobilePayments$2 this$1;

    MobilePayments$2$1(MobilePayments$2 mobilePayments$2) {
        this.this$1 = mobilePayments$2;
    }

    public void onSuccess(List list) {
        MobilePayments.access$100(this.this$1.this$0).clear();
        MobilePayments.access$100(this.this$1.this$0).addAll(MobilePayments.SpriteBuffer_getIndexedSpriteByName(this.this$1.this$0, MobilePayments.access$000(this.this$1.this$0).getCategories(), list));
        this.this$1.val$listener.onSuccess();
    }

    @Override
    public void onFailure(int n) {
        this.this$1.val$listener.onFailure(n);
    }
}

