/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  androidx.browser.customtabs.CustomTabsIntent
 *  net.openid.appauth.AuthorizationException
 *  net.openid.appauth.AuthorizationRequest$Builder
 *  net.openid.appauth.AuthorizationServiceConfiguration
 *  net.openid.appauth.AuthorizationServiceConfiguration$RetrieveConfigurationCallback
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.content.Intent;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jagex.mobilesdk.auth.MobileAuthService;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.AuthorizationRequest;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthService$2")
class MobileAuthService$2
implements AuthorizationServiceConfiguration.RetrieveConfigurationCallback {
    final /* synthetic */ MobileAuthService this$0;
    final /* synthetic */ MobileAuthServiceListener val$authRequestListener;
    final /* synthetic */ Activity val$activity;

    MobileAuthService$2(MobileAuthService mobileAuthService, MobileAuthServiceListener mobileAuthServiceListener, Activity activity) {
        this.this$0 = mobileAuthService;
        this.val$authRequestListener = mobileAuthServiceListener;
        this.val$activity = activity;
    }

    public void onFetchConfigurationCompleted(AuthorizationServiceConfiguration object, AuthorizationException authorizationException) {
        if (authorizationException != null) {
            object = new CommsResult(authorizationException.errorDescription, 1403);
            this.val$authRequestListener.onResult((CommsResult)object);
            return;
        }
        object = new AuthorizationRequest.Builder(object, MobileAuthService.access$200(this.this$0).getClientId(), "code", MobileAuthService.access$200(this.this$0).getRedirectUri());
        authorizationException = new AuthJagexCustomTabs(this.val$activity.getApplicationContext()).build();
        object = MobileAuthService.access$300(this.this$0).getAuthorizationRequestIntent(object.build(), (CustomTabsIntent)authorizationException);
        this.val$activity.startActivityForResult((Intent)object, 3001);
    }
}

