/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListRecyclerViewAdapter$ViewHolder$2")
class CategoryListRecyclerViewAdapter$ViewHolder$2
implements View.OnClickListener {
    final /* synthetic */ CategoryListRecyclerViewAdapter$ViewHolder this$1;

    CategoryListRecyclerViewAdapter$ViewHolder$2(CategoryListRecyclerViewAdapter$ViewHolder categoryListRecyclerViewAdapter$ViewHolder) {
        this.this$1 = categoryListRecyclerViewAdapter$ViewHolder;
    }

    public void onClick(View view) {
        view = new Intent("android.intent.action.VIEW", Uri.parse((String)"https://www.jagex.com/terms/privacy"));
        CategoryListRecyclerViewAdapter.access$300((CategoryListRecyclerViewAdapter)this.this$1.this$0).startActivity((Intent)view);
    }
}

