/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.DialogInterface;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.CategoryListFragment$3;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$3$2")
class CategoryListFragment$3$2
implements DialogInterface.OnClickListener {
    final /* synthetic */ CategoryListFragment$3 this$1;

    CategoryListFragment$3$2(CategoryListFragment$3 categoryListFragment$3) {
        this.this$1 = categoryListFragment$3;
    }

    public void onClick(DialogInterface dialogInterface, int n) {
        CategoryListFragment.access$400(this.this$1.this$0).applyUnconsumedPurchases(true);
        dialogInterface.cancel();
    }
}

