/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  androidx.browser.customtabs.CustomTabsIntent
 *  net.openid.appauth.AuthorizationException
 *  net.openid.appauth.AuthorizationResponse
 *  net.openid.appauth.AuthorizationService
 *  net.openid.appauth.AuthorizationService$TokenResponseCallback
 *  net.openid.appauth.AuthorizationServiceConfiguration
 *  net.openid.appauth.AuthorizationServiceConfiguration$RetrieveConfigurationCallback
 *  net.openid.appauth.ClientAuthentication
 *  net.openid.appauth.ClientSecretBasic
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jagex.mobilesdk.auth.MobileAuthService$1;
import com.jagex.mobilesdk.auth.MobileAuthService$2;
import com.jagex.mobilesdk.auth.MobileAuthService$3;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;
import com.jagex.mobilesdk.auth.createaccount.CreateAccountManagementActivity;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import net.openid.appauth.AuthorizationException;
import net.openid.appauth.AuthorizationResponse;
import net.openid.appauth.AuthorizationService;
import net.openid.appauth.AuthorizationServiceConfiguration;
import net.openid.appauth.ClientAuthentication;
import net.openid.appauth.ClientSecretBasic;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthService")
public class MobileAuthService {
    private MobilePaymentService paymentService;
    private final JagexConfig jagexConfig;
    private MobileAuthStateManager authStateManager;
    private AuthorizationService authorizationService;
    private MobileAuthStateWriter authStateWriter;

    public MobileAuthService(Activity activity, JagexConfig jagexConfig) {
        this.authStateWriter = new MobileAuthStateWriter(activity.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, jagexConfig);
        this.paymentService = new MobilePaymentService(activity, jagexConfig);
        this.authorizationService = new AuthorizationService((Context)activity);
        this.jagexConfig = jagexConfig;
        SecurityProviderUpdate.ProviderUpdate(activity);
    }

    public void requestGameToken(Activity activity, boolean bl, MobileAuthServiceListener mobileAuthServiceListener) {
        this.requestGameToken(activity, bl, false, mobileAuthServiceListener);
    }

    public void handleAuthenticateWithJagexWebResponse(Activity activity, JagexConfig jagexConfig, int n, Intent intent, boolean bl, boolean bl2, MobileAuthServiceListener mobileAuthServiceListener) {
        if (n == 0) {
            mobileAuthServiceListener.onResult(new CommsResult("", 1402));
            return;
        }
        if (intent == null) {
            mobileAuthServiceListener.onResult(new CommsResult("Null intent data passed as an auth response", 1403));
            return;
        }
        if (n != -1) {
            mobileAuthServiceListener.onResult(new CommsResult(AuthorizationException.fromIntent((Intent)intent).errorDescription, 1403));
            return;
        }
        intent = AuthorizationResponse.fromIntent((Intent)intent);
        if (n == -1) {
            this.authorizationService.performTokenRequest(intent.createTokenExchangeRequest(), (ClientAuthentication)new ClientSecretBasic(jagexConfig.getClientSecret()), (AuthorizationService.TokenResponseCallback)new MobileAuthService$3(this, activity, bl, bl2, mobileAuthServiceListener));
        }
    }

    public void requestGameToken(Activity activity, boolean bl, boolean bl2, MobileAuthServiceListener mobileAuthServiceListener) {
        this.authStateManager.performActionWithFreshTokens(activity, new MobileAuthService$1(this, mobileAuthServiceListener, bl, activity, bl2));
    }

    public boolean isUserAuthenticated() {
        return this.authStateManager.isUserAuthenticated();
    }

    public void authenticateWithJagexWeb(Activity activity, MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.jagexConfig.getIssuerUri());
        stringBuilder.append("/shield");
        AuthorizationServiceConfiguration.fetchFromIssuer((Uri)Uri.parse((String)stringBuilder.toString()), (AuthorizationServiceConfiguration.RetrieveConfigurationCallback)new MobileAuthService$2(this, mobileAuthServiceListener, activity));
    }

    public void logout(MobileAuthServiceListener mobileAuthServiceListener) {
        this.authStateManager.logout(mobileAuthServiceListener);
    }

    public void createAccount(Activity activity, Uri uri) {
        CustomTabsIntent customTabsIntent = new AuthJagexCustomTabs(activity.getApplicationContext()).build();
        activity.startActivityForResult(CreateAccountManagementActivity.createStartIntent(activity.getApplicationContext(), this.createAccountCreationIntent(customTabsIntent, uri)), 2204);
    }

    private Intent createAccountCreationIntent(CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent = customTabsIntent.intent;
        customTabsIntent.setData(uri);
        return customTabsIntent;
    }

    public void storeTokens(Activity activity, String string2, String string3, long l) {
        this.authStateManager.storeTokens(new MobileAuthState(string2, string3, l));
    }

    @Deprecated
    public void handleAuthenticateWithJagexWebResponse(Activity activity, JagexConfig jagexConfig, int n, Intent intent, boolean bl, MobileAuthServiceListener mobileAuthServiceListener) {
        this.handleAuthenticateWithJagexWebResponse(activity, jagexConfig, n, intent, false, bl, mobileAuthServiceListener);
    }

    @Deprecated
    public void requestGameToken(Activity activity, MobileAuthServiceListener mobileAuthServiceListener) {
        this.requestGameToken(activity, true, mobileAuthServiceListener);
    }

    public void requestOAuth2Tokens(Activity activity, String string2, String string3, String string4, String string5, MobileAuthServiceListener mobileAuthServiceListener) {
        this.authStateManager.requestOAuth2Tokens(activity, string2, string3, string4, string5, mobileAuthServiceListener);
    }

    static /* synthetic */ JagexConfig access$200(MobileAuthService mobileAuthService) {
        return mobileAuthService.jagexConfig;
    }

    static /* synthetic */ MobilePaymentService access$100(MobileAuthService mobileAuthService) {
        return mobileAuthService.paymentService;
    }

    static /* synthetic */ MobileAuthStateManager access$000(MobileAuthService mobileAuthService) {
        return mobileAuthService.authStateManager;
    }

    static /* synthetic */ AuthorizationService access$300(MobileAuthService mobileAuthService) {
        return mobileAuthService.authorizationService;
    }
}

