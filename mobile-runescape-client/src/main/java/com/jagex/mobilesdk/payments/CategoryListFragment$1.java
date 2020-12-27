/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.CategoryListFragment$1$1;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$1")
class CategoryListFragment$1
implements Runnable {
    final /* synthetic */ CategoryListFragment this$0;
    final /* synthetic */ List val$categories;

    CategoryListFragment$1(CategoryListFragment categoryListFragment, List list) {
        this.this$0 = categoryListFragment;
        this.val$categories = list;
    }

    @Override
    public void run() {
        CategoryListFragment.access$000(this.this$0).setCategories(this.val$categories);
        CategoryListFragment.access$000(this.this$0).filterCategory(CategoryListFragment.access$100(this.this$0));
        if (CategoryListFragment.access$200(this.this$0) != 15) {
            int n = this.val$categories != null && this.val$categories.size() > 1 ? CategoryListFragment.access$000(this.this$0).getPositionForCategoryID(CategoryListFragment.access$200(this.this$0)) : 0;
            CategoryListFragment.access$000(this.this$0).setExpandCollapseMode(false);
            CategoryListFragment.access$000(this.this$0).setExpandedPosition(n);
            this.this$0.setExpandCollapseDetails(false, n);
            this.this$0.recyclerView.scrollToPosition(n);
            return;
        }
        CategoryListFragment.access$000(this.this$0).setExpandCollapseMode(true);
        CategoryListFragment.access$000(this.this$0).setExpandedPosition(0);
        this.this$0.setExpandCollapseDetails(true, 0);
        this.this$0.recyclerView.setItemViewCacheSize(this.val$categories.size() - 1);
        ((LinearLayoutManager)this.this$0.recyclerView.getLayoutManager()).setInitialPrefetchItemCount(this.val$categories.size() - 1);
        this.this$0.recyclerView.setDrawingCacheQuality(524288);
        CategoryListFragment.access$000(this.this$0).notifyDataSetChanged();
        this.this$0.recyclerView.scrollToPosition(this.val$categories.size() - 1);
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new CategoryListFragment$1$1(this), 50L);
        CategoryListFragment.access$300(this.this$0).queryPendingTransactions();
    }
}

