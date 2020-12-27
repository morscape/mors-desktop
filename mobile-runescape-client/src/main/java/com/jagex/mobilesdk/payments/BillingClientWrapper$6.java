/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$6$1;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$6")
class BillingClientWrapper$6
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ BillingClientWrapper this$0;
    final /* synthetic */ List val$allProducts;
    final /* synthetic */ BillingClientWrapper$BillingClientWrapperListener val$listener;
    final /* synthetic */ List val$skus;

    BillingClientWrapper$6(BillingClientWrapper billingClientWrapper, List list, List list2, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        this.this$0 = billingClientWrapper;
        this.val$allProducts = list;
        this.val$skus = list2;
        this.val$listener = billingClientWrapper$BillingClientWrapperListener;
    }

    public void onSuccess(List list) {
        this.val$allProducts.addAll(list);
        BillingClientWrapper.access$000(this.this$0, "inapp", this.val$skus, new BillingClientWrapper$6$1(this));
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }
}

