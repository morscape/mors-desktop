/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.content.Context;
import com.jagex.mobilesdk.analytics.MobileAnalyticsService;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms$ShieldOAuth2Callback;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthStateManager$5")
class MobileAuthStateManager$5
implements ShieldOAuth2Comms$ShieldOAuth2Callback {
    final /* synthetic */ MobileAuthStateManager this$0;
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ MobileAuthServiceListener val$listener;

    MobileAuthStateManager$5(MobileAuthStateManager mobileAuthStateManager, Activity activity, MobileAuthServiceListener mobileAuthServiceListener) {
        this.this$0 = mobileAuthStateManager;
        this.val$activity = activity;
        this.val$listener = mobileAuthServiceListener;
    }

    @Override
    public void onShieldOAuth2Result(CommsResult commsResult, Exception exception) {
        if (commsResult.responseCode == 0) {
            this.this$0.storeTokens((MobileAuthState)commsResult.getResultValue());
            MobileAttributionService.sendEvent((Context)this.val$activity, "af_login", null);
            MobileAnalyticsService.sendEvent((Context)this.val$activity, "af_login", null);
        }
        this.val$listener.onResult(commsResult);
    }
}

