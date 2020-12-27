/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.ViewGroup$LayoutParams
 *  androidx.recyclerview.widget.RecyclerView$LayoutParams
 *  com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListRecyclerViewAdapter$4")
class CategoryListRecyclerViewAdapter$4
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ CategoryListRecyclerViewAdapter this$0;
    final /* synthetic */ RecyclerView.LayoutParams val$params;
    final /* synthetic */ CategoryListRecyclerViewAdapter$ViewHolder val$holder;

    CategoryListRecyclerViewAdapter$4(CategoryListRecyclerViewAdapter categoryListRecyclerViewAdapter, RecyclerView.LayoutParams layoutParams, CategoryListRecyclerViewAdapter$ViewHolder viewHolder) {
        this.this$0 = categoryListRecyclerViewAdapter;
        this.val$params = layoutParams;
        this.val$holder = viewHolder;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int n = (Integer)valueAnimator.getAnimatedValue();
        this.val$params.setMarginStart(n);
        this.val$holder.view.setLayoutParams((ViewGroup.LayoutParams)this.val$params);
    }
}

