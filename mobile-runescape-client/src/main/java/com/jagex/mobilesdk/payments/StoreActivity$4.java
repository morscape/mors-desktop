/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.StoreActivity;
import net.runelite.mapping.Implements;

@Implements(value="StoreActivity$4")
class StoreActivity$4
implements Runnable {
    final /* synthetic */ StoreActivity this$0;

    StoreActivity$4(StoreActivity storeActivity) {
        this.this$0 = storeActivity;
    }

    @Override
    public void run() {
        this.this$0.collapseCategory.setVisibility(8);
    }
}

