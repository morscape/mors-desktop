/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.view.View;
import com.jagex.mobilesdk.payments.StoreActivity;
import net.runelite.mapping.Implements;

@Implements(value="StoreActivity$2")
class StoreActivity$2
implements View.OnClickListener {
    final /* synthetic */ StoreActivity this$0;

    public void onClick(View view) {
        this.this$0.finish();
    }
}

