/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.view.View
 *  android.view.View$OnClickListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.app.AlertDialog;
import android.view.View;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter;
import net.runelite.mapping.Implements;

@Implements(value="CategoryItemsRecyclerViewAdapter$3")
class CategoryItemsRecyclerViewAdapter$3
implements View.OnClickListener {
    final /* synthetic */ CategoryItemsRecyclerViewAdapter this$0;
    final /* synthetic */ AlertDialog val$alertDialog;

    CategoryItemsRecyclerViewAdapter$3(CategoryItemsRecyclerViewAdapter categoryItemsRecyclerViewAdapter, AlertDialog alertDialog) {
        this.this$0 = categoryItemsRecyclerViewAdapter;
        this.val$alertDialog = alertDialog;
    }

    public void onClick(View view) {
        this.val$alertDialog.show();
    }
}

