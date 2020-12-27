/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder;
import com.jagex.mobilesdk.payments.comms.FetchImageComms$FetchImageCallback;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListRecyclerViewAdapter$2")
class CategoryListRecyclerViewAdapter$2
implements FetchImageComms$FetchImageCallback {
    final /* synthetic */ CategoryListRecyclerViewAdapter this$0;
    final /* synthetic */ CategoryListRecyclerViewAdapter$ViewHolder val$holder;

    CategoryListRecyclerViewAdapter$2(CategoryListRecyclerViewAdapter categoryListRecyclerViewAdapter, CategoryListRecyclerViewAdapter$ViewHolder categoryListRecyclerViewAdapter$ViewHolder) {
        this.this$0 = categoryListRecyclerViewAdapter;
        this.val$holder = categoryListRecyclerViewAdapter$ViewHolder;
    }

    @Override
    public void onFetchImageResult(CommsResult commsResult, Exception exception) {
        if (commsResult.responseCode == 200 && CategoryListRecyclerViewAdapter.access$300((CategoryListRecyclerViewAdapter)this.this$0) != null && commsResult != null) {
            this.val$holder.categoryImage.setBackground((Drawable)new BitmapDrawable(CategoryListRecyclerViewAdapter.access$300((CategoryListRecyclerViewAdapter)this.this$0).getResources(), (Bitmap)commsResult.getResultValue()));
        }
    }
}

