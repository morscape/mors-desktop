/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.os.Handler;
import android.os.Looper;
import com.jagex.mobilesdk.R$integer;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.CategoryListFragment$5$1;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$5")
class CategoryListFragment$5
implements Runnable {
    final /* synthetic */ CategoryListFragment this$0;

    CategoryListFragment$5(CategoryListFragment categoryListFragment) {
        this.this$0 = categoryListFragment;
    }

    @Override
    public void run() {
        int n = 0;
        while (true) {
            if (n < CategoryListFragment.access$000(this.this$0).getItemCount()) {
                if (n != CategoryListFragment.access$500(this.this$0)) {
                    this.this$0.recyclerView.getAdapter().notifyItemChanged(n);
                }
            } else {
                this.this$0.recyclerView.getLayoutManager().scrollToPosition(CategoryListFragment.access$500(this.this$0));
                if (!CategoryListFragment.access$600(this.this$0)) {
                    this.this$0.recyclerView.smoothScrollBy(1, 0);
                    CategoryListFragment.access$700(this.this$0, CategoryListFragment.access$500(this.this$0), CategoryListFragment.access$600(this.this$0));
                }
                new Handler(Looper.getMainLooper()).postDelayed((Runnable)new CategoryListFragment$5$1(this), (long)this.this$0.getContext().getResources().getInteger(R$integer.snap_reset_delay));
                return;
            }
            ++n;
        }
    }
}

