/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientMessages;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.CategoryListViewController$2$1;
import com.jagex.mobilesdk.payments.PurchaseHistory$PurchaseHistoryListener;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$2$1$1")
class CategoryListViewController$2$1$1
implements PurchaseHistory$PurchaseHistoryListener {
    final /* synthetic */ CategoryListViewController$2$1 this$2;

    CategoryListViewController$2$1$1(CategoryListViewController$2$1 var1_1) {
        this.this$2 = var1_1;
    }

    @Override
    public void onFailure(int n) {
        CategoryListViewController.access$100(this.this$2.this$1.this$0).onDisplayMessage(BillingClientMessages.getErrorMessage(n));
    }

    @Override
    public void onSuccess() {
        this.this$2.this$1.this$0.queryPendingTransactions();
    }
}

