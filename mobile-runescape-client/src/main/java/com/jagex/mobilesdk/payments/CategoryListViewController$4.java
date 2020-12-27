/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$4")
class CategoryListViewController$4
implements MobilePayments$MobilePaymentsListener {
    final /* synthetic */ CategoryListViewController this$0;
    int pendingTransactionsApplied = 0;
    final /* synthetic */ int val$unconsumedSize;

    CategoryListViewController$4(CategoryListViewController categoryListViewController, int n) {
        this.this$0 = categoryListViewController;
        this.val$unconsumedSize = n;
    }

    @Override
    public void onSuccess() {
        ++this.pendingTransactionsApplied;
        int n = this.pendingTransactionsApplied;
        n = this.val$unconsumedSize;
    }

    @Override
    public void onFailure(int n) {
    }
}

