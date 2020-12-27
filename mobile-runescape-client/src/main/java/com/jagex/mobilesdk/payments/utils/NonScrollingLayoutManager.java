/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.recyclerview.widget.GridLayoutManager
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import net.runelite.mapping.Implements;

@Implements(value="NonScrollingLayoutManager")
public class NonScrollingLayoutManager
extends GridLayoutManager {
    public NonScrollingLayoutManager(Context context, int n) {
        super(context, n);
    }

    public boolean canScrollVertically() {
        return false;
    }
}

