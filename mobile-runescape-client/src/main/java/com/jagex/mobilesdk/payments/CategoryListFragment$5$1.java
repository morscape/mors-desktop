/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.CategoryListFragment$5;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$5$1")
class CategoryListFragment$5$1
implements Runnable {
    final /* synthetic */ CategoryListFragment$5 this$1;

    CategoryListFragment$5$1(CategoryListFragment$5 var1_1) {
        this.this$1 = var1_1;
    }

    @Override
    public void run() {
        CategoryListFragment.access$800(this.this$1.this$0).setSnapPosition(-1);
    }
}

