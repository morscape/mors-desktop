/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginActivity;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel;
import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginService")
public class FederatedLoginService {
    public static final String EXTRA_FEDERATED_LOGIN_CONFIG;
    private static final String PACKAGE_NAME;
    public static final String EXTRA_ONE_TIME_LOGIN_TOKEN;
    private final JagexConfig config;
    private final String packageId;
    private final String googleClientID;

    static {
        PACKAGE_NAME = FederatedLoginService.class.getPackage().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".ONE_TIME_LOGIN_TOKEN");
        EXTRA_ONE_TIME_LOGIN_TOKEN = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".CONFIG");
        EXTRA_FEDERATED_LOGIN_CONFIG = stringBuilder.toString();
    }

    public FederatedLoginService(JagexConfig jagexConfig, String string2, String string3) {
        this.config = jagexConfig;
        this.googleClientID = string2;
        this.packageId = string3;
    }

    public void authenticateWithGooglePlay(Activity activity) {
        activity.startActivityForResult(new Intent((Context)activity, FederatedLoginActivity.class).putExtra(EXTRA_FEDERATED_LOGIN_CONFIG, (Parcelable)new FederatedLoginParcel(this.packageId, this.googleClientID, this.config.getIssuerUri())).addFlags(65536), 2205);
    }
}

