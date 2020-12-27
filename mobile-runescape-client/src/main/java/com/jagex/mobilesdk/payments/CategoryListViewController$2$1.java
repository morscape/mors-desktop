/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientMessages;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.CategoryListViewController$2;
import com.jagex.mobilesdk.payments.CategoryListViewController$2$1$1;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$2$1")
class CategoryListViewController$2$1
implements MobilePayments$MobilePaymentsListener {
    final /* synthetic */ CategoryListViewController$2 this$1;

    CategoryListViewController$2$1(CategoryListViewController$2 categoryListViewController$2) {
        this.this$1 = categoryListViewController$2;
    }

    @Override
    public void onSuccess() {
        CategoryListViewController.access$100(this.this$1.this$0).onShopLoaded(CategoryListViewController.access$500(this.this$1.this$0).getShopImageLogo(), CategoryListViewController.access$500(this.this$1.this$0).getShopBackgroundImage());
        CategoryListViewController.access$100(this.this$1.this$0).onCategoriesLoaded(CategoryListViewController.access$500(this.this$1.this$0).getCategories());
        CategoryListViewController.access$600(this.this$1.this$0).fetchPurchaseHistory(new CategoryListViewController$2$1$1(this));
    }

    @Override
    public void onFailure(int n) {
        if (n == 401) {
            CategoryListViewController.access$300(this.this$1.this$0).clearAuthState();
        }
        CategoryListViewController.access$100(this.this$1.this$0).onDisplayMessage(BillingClientMessages.getErrorMessage(n));
        CategoryListViewController.access$100(this.this$1.this$0).returnToGame();
    }
}

