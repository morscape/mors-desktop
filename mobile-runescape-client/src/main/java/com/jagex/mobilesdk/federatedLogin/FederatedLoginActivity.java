/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  com.google.android.gms.auth.api.signin.GoogleSignIn
 *  com.google.android.gms.auth.api.signin.GoogleSignInAccount
 *  com.google.android.gms.auth.api.signin.GoogleSignInClient
 *  com.google.android.gms.auth.api.signin.GoogleSignInOptions
 *  com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
 *  com.google.android.gms.common.api.ApiException
 *  com.google.android.gms.common.api.Scope
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.auth.JagexCompatActivity;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginActivity$1;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginService;
import com.jagex.mobilesdk.federatedLogin.comms.FederatedComms;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginRequest;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import java.util.HashMap;
import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginActivity")
public class FederatedLoginActivity
extends JagexCompatActivity {
    private String issuerURL;
    private String googleClientID;
    private String packageId;
    private GoogleSignInClient googleSignInClient;

    private void performGoogleLogin() {
        this.googleSignInClient = GoogleSignIn.getClient((Activity)this, (GoogleSignInOptions)new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestScopes(new Scope("https://www.googleapis.com/auth/user.birthday.read"), new Scope[0]).requestServerAuthCode(this.googleClientID).build());
        this.startActivityForResult(this.googleSignInClient.getSignInIntent(), 2205);
    }

    private void handleGoogleLoginResult(String string2, String string3) {
        CharSequence charSequence = new StringBuilder(this.issuerURL);
        charSequence.append("/google/v1/login/silent");
        charSequence = charSequence.toString();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/hal+json");
        hashMap.put("Accept", "application/json");
        new FederatedComms((String)charSequence, hashMap, new FederatedLoginRequest(string2, string3, this.packageId), new FederatedLoginActivity$1(this)).execute(new Void[0]);
    }

    protected void onActivityResult(int n, int n2, Intent object) {
        super.onActivityResult(n, n2, object);
        object = GoogleSignIn.getSignedInAccountFromIntent((Intent)object);
        try {
            Object object2 = (GoogleSignInAccount)object.getResult(ApiException.class);
            object = object2.getServerAuthCode();
            object2 = object2.getId();
            this.googleSignInClient.signOut();
            this.handleGoogleLoginResult((String)object, (String)object2);
            return;
        }
        catch (ApiException apiException) {
            switch (apiException.getStatusCode()) {
                default: {
                    this.finishWithError(1401, AuthMessage.FEDERATED_LOGIN_ACTIVITY_ERROR.getMessage(), (Exception)((Object)apiException));
                    return;
                }
                case 12501: {
                    this.finishWithError(1402, AuthMessage.GENERIC_AUTH_ERROR.getMessage(), (Exception)((Object)apiException));
                    return;
                }
                case 12500: 
            }
            this.finishWithError(1401, AuthMessage.FEDERATED_LOGIN_AUTH_ERROR.getMessage(), (Exception)((Object)apiException));
            return;
        }
    }

    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = (FederatedLoginParcel)this.getIntent().getParcelableExtra(FederatedLoginService.EXTRA_FEDERATED_LOGIN_CONFIG);
        this.googleClientID = ((FederatedLoginParcel)object).getGoogleClientId();
        this.packageId = ((FederatedLoginParcel)object).getPackageId();
        this.issuerURL = ((FederatedLoginParcel)object).getIssuerURL();
        SecurityProviderUpdate.ProviderUpdate((Activity)this);
        this.performGoogleLogin();
    }

    static /* synthetic */ void access$200(FederatedLoginActivity federatedLoginActivity, int n, String string2, Exception exception) {
        federatedLoginActivity.finishWithError(n, string2, exception);
    }

    static /* synthetic */ void access$100(FederatedLoginActivity federatedLoginActivity, int n, String string2, Exception exception) {
        federatedLoginActivity.finishWithError(n, string2, exception);
    }

    static /* synthetic */ void access$000(FederatedLoginActivity federatedLoginActivity, int n, Intent intent) {
        federatedLoginActivity.finish(n, intent);
    }
}

