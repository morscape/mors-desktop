/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.PagerSnapHelper
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import net.runelite.mapping.Implements;

@Implements(value="JagexSnapHelper")
public class JagexSnapHelper
extends PagerSnapHelper {
    private int snapPosition = -1;

    public void setSnapPosition(int n) {
        this.snapPosition = n;
    }

    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager && this.snapPosition != -1) {
            return layoutManager.findViewByPosition(this.snapPosition);
        }
        return super.findSnapView(layoutManager);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        super.attachToRecyclerView(recyclerView);
    }
}

