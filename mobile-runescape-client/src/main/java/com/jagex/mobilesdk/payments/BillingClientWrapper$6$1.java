/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientWrapper$6;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$6$1")
class BillingClientWrapper$6$1
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ BillingClientWrapper$6 this$1;

    BillingClientWrapper$6$1(BillingClientWrapper$6 var1_1) {
        this.this$1 = var1_1;
    }

    public void onSuccess(List list) {
        this.this$1.val$allProducts.addAll(list);
        this.this$1.val$listener.onSuccess(this.this$1.val$allProducts);
    }

    @Override
    public void onFailure(int n) {
        this.this$1.val$listener.onFailure(n);
    }
}

