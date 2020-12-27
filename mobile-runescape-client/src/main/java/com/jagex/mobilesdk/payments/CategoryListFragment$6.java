/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$6")
class CategoryListFragment$6
implements Runnable {
    final /* synthetic */ boolean val$collapse;
    final /* synthetic */ CategoryListFragment this$0;
    final /* synthetic */ RecyclerView.ItemAnimator val$currentAnimator;
    final /* synthetic */ int val$position;

    CategoryListFragment$6(CategoryListFragment categoryListFragment, boolean bl, int n, RecyclerView.ItemAnimator itemAnimator) {
        this.this$0 = categoryListFragment;
        this.val$collapse = bl;
        this.val$position = n;
        this.val$currentAnimator = itemAnimator;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void run() {
        if (!this.val$collapse) {
            for (int i = 0; i < this.this$0.recyclerView.getAdapter().getItemCount(); ++i) {
                if (i == this.val$position) continue;
                CategoryListFragment.access$000(this.this$0).notifyItemChanged(i);
            }
        }
        this.this$0.recyclerView.setItemAnimator(this.val$currentAnimator);
    }
}

