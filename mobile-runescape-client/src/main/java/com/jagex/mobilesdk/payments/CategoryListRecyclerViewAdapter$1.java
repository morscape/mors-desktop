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
import net.runelite.mapping.Implements;

@Implements(value="CategoryListRecyclerViewAdapter$1")
class CategoryListRecyclerViewAdapter$1
implements View.OnClickListener {
    final /* synthetic */ CategoryListRecyclerViewAdapter this$0;
    final /* synthetic */ int val$position;

    CategoryListRecyclerViewAdapter$1(CategoryListRecyclerViewAdapter categoryListRecyclerViewAdapter, int n) {
        this.this$0 = categoryListRecyclerViewAdapter;
        this.val$position = n;
    }

    public void onClick(View view) {
        if (CategoryListRecyclerViewAdapter.access$000((CategoryListRecyclerViewAdapter)this.this$0)) {
            CategoryListRecyclerViewAdapter.access$002((CategoryListRecyclerViewAdapter)this.this$0, (boolean)(CategoryListRecyclerViewAdapter.access$000((CategoryListRecyclerViewAdapter)this.this$0) ^ true));
            CategoryListRecyclerViewAdapter.access$102((CategoryListRecyclerViewAdapter)this.this$0, (int)this.val$position);
            CategoryListRecyclerViewAdapter.access$200((CategoryListRecyclerViewAdapter)this.this$0).setCategoryExpandCollapseDetails(CategoryListRecyclerViewAdapter.access$000((CategoryListRecyclerViewAdapter)this.this$0), this.val$position);
        }
    }
}

