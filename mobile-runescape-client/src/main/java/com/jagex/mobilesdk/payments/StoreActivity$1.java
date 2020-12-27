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
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.StoreActivity;
import net.runelite.mapping.Implements;

@Implements(value="StoreActivity$1")
class StoreActivity$1
implements View.OnClickListener {
    final /* synthetic */ StoreActivity this$0;

    public void onClick(View view) {
        ((CategoryListFragment)this.this$0.getSupportFragmentManager().findFragmentById(R$id.fragment_package)).collapseExpandedCategoriesView();
    }
}

