/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.CategoryListViewController$2$1;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$2")
class CategoryListViewController$2
implements MobileAuthStateManager$AuthManagerAction {
    final /* synthetic */ CategoryListViewController this$0;

    CategoryListViewController$2(CategoryListViewController categoryListViewController) {
        this.this$0 = categoryListViewController;
    }

    @Override
    public void execute(String string2, Exception exception) {
        if (exception != null) {
            CategoryListViewController.access$100(this.this$0).onDisplayMessage(R$string.SHOP_UNAVAILABLE);
            CategoryListViewController.access$100(this.this$0).returnToGame();
            return;
        }
        CategoryListViewController.access$500(this.this$0).fetchCategories(CategoryListViewController.access$200(this.this$0).getApplicationContext(), CategoryListViewController.access$300(this.this$0).getAuthState(), CategoryListViewController.access$400(this.this$0), new CategoryListViewController$2$1(this));
    }
}

