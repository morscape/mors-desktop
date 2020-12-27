/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.StoreActivity$5;
import com.jagex.mobilesdk.payments.comms.FetchImageComms$FetchImageCallback;
import net.runelite.mapping.Implements;

@Implements(value="StoreActivity$5$2")
class StoreActivity$5$2
implements FetchImageComms$FetchImageCallback {
    final /* synthetic */ StoreActivity$5 this$1;
    final /* synthetic */ Context val$storeActivityContext;

    StoreActivity$5$2(StoreActivity$5 storeActivity$5, Context context) {
        this.this$1 = storeActivity$5;
        this.val$storeActivityContext = context;
    }

    @Override
    public void onFetchImageResult(CommsResult commsResult, Exception exception) {
        if (commsResult.responseCode == 200 && this.val$storeActivityContext != null && commsResult != null) {
            this.this$1.this$0.shopParentLayout.setBackground((Drawable)new BitmapDrawable(this.val$storeActivityContext.getResources(), (Bitmap)commsResult.getResultValue()));
        }
    }
}

