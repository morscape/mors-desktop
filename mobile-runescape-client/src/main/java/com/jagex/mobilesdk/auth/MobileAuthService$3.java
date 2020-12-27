/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  net.openid.appauth.AuthorizationException
 *  net.openid.appauth.AuthorizationService$TokenResponseCallback
 *  net.openid.appauth.TokenResponse
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.content.Context;
import com.jagex.mobilesdk.analytics.MobileAnalyticsService;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.MobileAuthService;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.AuthorizationService;
import net.openid.appauth.TokenResponse;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthService$3")
class MobileAuthService$3
implements AuthorizationService.TokenResponseCallback {
    final /* synthetic */ MobileAuthService this$0;
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ MobileAuthServiceListener val$gameTokenRequestListener;
    final /* synthetic */ boolean val$ignorePendingTransactions;
    final /* synthetic */ boolean val$forceGameToken;

    MobileAuthService$3(MobileAuthService mobileAuthService, Activity activity, boolean bl, boolean bl2, MobileAuthServiceListener mobileAuthServiceListener) {
        this.this$0 = mobileAuthService;
        this.val$activity = activity;
        this.val$ignorePendingTransactions = bl;
        this.val$forceGameToken = bl2;
        this.val$gameTokenRequestListener = mobileAuthServiceListener;
    }

    public void onTokenRequestCompleted(TokenResponse object, AuthorizationException authorizationException) {
        if (object != null) {
            this.this$0.storeTokens(this.val$activity, object.accessToken, object.refreshToken, object.accessTokenExpirationTime);
            MobileAttributionService.sendEvent((Context)this.val$activity, "af_login", null);
            MobileAnalyticsService.sendEvent((Context)this.val$activity, "af_login", null);
            this.this$0.requestGameToken(this.val$activity, this.val$ignorePendingTransactions, this.val$forceGameToken, this.val$gameTokenRequestListener);
            return;
        }
        object = new CommsResult("No authentication response from OAuth token request", 1403);
        this.val$gameTokenRequestListener.onResult((CommsResult)object);
    }
}

