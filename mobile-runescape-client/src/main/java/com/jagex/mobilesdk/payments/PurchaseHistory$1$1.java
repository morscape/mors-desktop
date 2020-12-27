/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import com.jagex.mobilesdk.payments.PurchaseHistory$1;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="PurchaseHistory$1$1")
class PurchaseHistory$1$1
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ PurchaseHistory$1 this$1;

    PurchaseHistory$1$1(PurchaseHistory$1 purchaseHistory$1) {
        this.this$1 = purchaseHistory$1;
    }

    public void onSuccess(List list) {
        LinkDeque.access$000(this.this$1.this$0).addAll(list);
        LinkDeque.access$100(this.this$1.this$0, this.this$1.val$listener);
    }

    @Override
    public void onFailure(int n) {
        this.this$1.val$listener.onFailure(n);
    }
}

