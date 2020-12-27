/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.Context;
import android.widget.Toast;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$2")
class CategoryListFragment$2
implements Runnable {
    final /* synthetic */ CategoryListFragment this$0;
    final /* synthetic */ int val$message;

    CategoryListFragment$2(CategoryListFragment categoryListFragment, int n) {
        this.this$0 = categoryListFragment;
        this.val$message = n;
    }

    @Override
    public void run() {
        Toast.makeText((Context)this.this$0.getContext(), (int)this.val$message, (int)1).show();
    }
}

