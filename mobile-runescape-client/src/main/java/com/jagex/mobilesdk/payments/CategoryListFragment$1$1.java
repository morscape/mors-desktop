/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.CategoryListFragment$1;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$1$1")
class CategoryListFragment$1$1
implements Runnable {
    final /* synthetic */ CategoryListFragment$1 this$1;

    CategoryListFragment$1$1(CategoryListFragment$1 var1_1) {
        this.this$1 = var1_1;
    }

    @Override
    public void run() {
        this.this$1.this$0.recyclerView.scrollToPosition(0);
    }
}

