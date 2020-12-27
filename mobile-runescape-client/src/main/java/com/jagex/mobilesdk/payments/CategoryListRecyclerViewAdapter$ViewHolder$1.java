/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.view.View;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListRecyclerViewAdapter$ViewHolder$1")
class CategoryListRecyclerViewAdapter$ViewHolder$1
implements View.OnClickListener {
    final /* synthetic */ CategoryListRecyclerViewAdapter$ViewHolder this$1;

    CategoryListRecyclerViewAdapter$ViewHolder$1(CategoryListRecyclerViewAdapter$ViewHolder categoryListRecyclerViewAdapter$ViewHolder) {
        this.this$1 = categoryListRecyclerViewAdapter$ViewHolder;
    }

    public void onClick(View view) {
        int n = (Integer)view.getTag();
        CategoryListRecyclerViewAdapter.access$200((CategoryListRecyclerViewAdapter)this.this$1.this$0).onShowHideMoreProducts(CategoryListRecyclerViewAdapter.access$400((CategoryListRecyclerViewAdapter)this.this$1.this$0) ^ true, n);
    }
}

