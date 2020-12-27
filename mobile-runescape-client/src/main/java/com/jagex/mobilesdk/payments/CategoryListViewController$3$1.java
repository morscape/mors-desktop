/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientMessages;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.CategoryListViewController$3;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$3$1")
class CategoryListViewController$3$1
implements MobilePayments$MobilePaymentsListener {
    final /* synthetic */ CategoryListViewController$3 this$1;

    CategoryListViewController$3$1(CategoryListViewController$3 var1_1) {
        this.this$1 = var1_1;
    }

    @Override
    public void onSuccess() {
        CategoryListViewController.access$100(this.this$1.this$0).onSuccessfulConsumption();
    }

    @Override
    public void onFailure(int n) {
        CategoryListViewController.access$100(this.this$1.this$0).onDisplayMessage(BillingClientMessages.getErrorMessage(n));
    }
}

