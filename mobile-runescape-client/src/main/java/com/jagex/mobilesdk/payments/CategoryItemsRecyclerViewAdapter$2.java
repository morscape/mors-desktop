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
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter;
import net.runelite.mapping.Implements;

@Implements(value="CategoryItemsRecyclerViewAdapter$2")
class CategoryItemsRecyclerViewAdapter$2
implements DialogInterface.OnClickListener {
    final /* synthetic */ CategoryItemsRecyclerViewAdapter this$0;

    CategoryItemsRecyclerViewAdapter$2(CategoryItemsRecyclerViewAdapter categoryItemsRecyclerViewAdapter) {
        this.this$0 = categoryItemsRecyclerViewAdapter;
    }

    public void onClick(DialogInterface dialogInterface, int n) {
        dialogInterface.cancel();
    }
}

