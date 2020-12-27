/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.Context;
import com.jagex.mobilesdk.payments.StoreActivity;
import com.jagex.mobilesdk.payments.StoreActivity$5$1;
import com.jagex.mobilesdk.payments.StoreActivity$5$2;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import net.runelite.mapping.Implements;

@Implements(value="StoreActivity$5")
class StoreActivity$5
implements Runnable {
    final /* synthetic */ StoreActivity this$0;
    final /* synthetic */ String val$logoURL;
    final /* synthetic */ String val$backgroundURL;

    StoreActivity$5(StoreActivity storeActivity, String string2, String string3) {
        this.this$0 = storeActivity;
        this.val$logoURL = string2;
        this.val$backgroundURL = string3;
    }

    @Override
    public void run() {
        Context context = this.this$0.getApplicationContext();
        PaymentComms.FetchImageComms(this.val$logoURL, new StoreActivity$5$1(this, context), true);
        PaymentComms.FetchImageComms(this.val$backgroundURL, new StoreActivity$5$2(this, context), true);
    }
}

