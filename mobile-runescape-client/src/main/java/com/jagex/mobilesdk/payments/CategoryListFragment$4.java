/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.CategoryListFragment;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$4")
class CategoryListFragment$4
implements Runnable {
    final /* synthetic */ CategoryListFragment this$0;

    CategoryListFragment$4(CategoryListFragment categoryListFragment) {
        this.this$0 = categoryListFragment;
    }

    @Override
    public void run() {
        this.this$0.recyclerView.scrollToPosition(CategoryListFragment.access$500(this.this$0));
    }
}

