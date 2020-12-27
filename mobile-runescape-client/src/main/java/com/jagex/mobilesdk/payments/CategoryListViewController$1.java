/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$1")
class CategoryListViewController$1
extends BroadcastReceiver {
    final /* synthetic */ CategoryListViewController this$0;

    CategoryListViewController$1(CategoryListViewController categoryListViewController) {
        this.this$0 = categoryListViewController;
    }

    public void onReceive(Context context, Intent object) {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        object = this.this$0;
        boolean bl = context != null && context.isConnected();
        CategoryListViewController.access$000((CategoryListViewController)object, bl);
    }
}

