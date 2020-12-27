/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.view.View;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter$ViewHolder;
import net.runelite.mapping.Implements;

@Implements(value="CategoryItemsRecyclerViewAdapter$1")
class CategoryItemsRecyclerViewAdapter$1
implements View.OnClickListener {
    final /* synthetic */ CategoryItemsRecyclerViewAdapter this$0;
    final /* synthetic */ CategoryItemsRecyclerViewAdapter$ViewHolder val$holder;

    CategoryItemsRecyclerViewAdapter$1(CategoryItemsRecyclerViewAdapter categoryItemsRecyclerViewAdapter, CategoryItemsRecyclerViewAdapter$ViewHolder viewHolder) {
        this.this$0 = categoryItemsRecyclerViewAdapter;
        this.val$holder = viewHolder;
    }

    public void onClick(View view) {
        if (CategoryItemsRecyclerViewAdapter.access$000(this.this$0) != null) {
            CategoryItemsRecyclerViewAdapter.access$000(this.this$0).purchaseProduct(this.val$holder.jagexProduct.getSkuItem());
        }
    }
}

