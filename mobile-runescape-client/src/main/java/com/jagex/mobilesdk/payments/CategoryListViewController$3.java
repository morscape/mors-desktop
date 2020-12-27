/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.CategoryListViewController$3$1;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$3")
class CategoryListViewController$3
implements MobileAuthStateManager$AuthManagerAction {
    final /* synthetic */ CategoryListViewController this$0;
    final /* synthetic */ SkuDetails val$sku;

    CategoryListViewController$3(CategoryListViewController categoryListViewController, SkuDetails skuDetails) {
        this.this$0 = categoryListViewController;
        this.val$sku = skuDetails;
    }

    @Override
    public void execute(String string2, Exception exception) {
        CategoryListViewController.access$500(this.this$0).purchaseItem(this.val$sku, CategoryListViewController.access$600(this.this$0), CategoryListViewController.access$300(this.this$0).getAuthState(), CategoryListViewController.access$400(this.this$0), (MobilePayments$MobilePaymentsListener)new CategoryListViewController$3$1(this));
    }
}

