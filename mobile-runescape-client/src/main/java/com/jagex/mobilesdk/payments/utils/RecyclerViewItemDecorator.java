/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$State
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.R$dimen;
import net.runelite.mapping.Implements;

@Implements(value="RecyclerViewItemDecorator")
public class RecyclerViewItemDecorator
extends RecyclerView.ItemDecoration {
    private final int decorationHeight;

    public RecyclerViewItemDecorator(Context context) {
        this.decorationHeight = context.getResources().getDimensionPixelSize(R$dimen.decoration_space);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView != null && view != null) {
            rect.left = this.decorationHeight / 2;
            rect.right = this.decorationHeight / 2;
        }
    }
}

