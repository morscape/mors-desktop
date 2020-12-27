/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.config;

import android.net.Uri;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import net.runelite.mapping.Implements;

@Implements(value="BasicJagexConfig")
public class BasicJagexConfig
implements JagexConfig {
    private final String scope;
    private final String clientId;
    private final String clientSecret;
    private final String paymentUri;
    private final String shopName;
    private final Uri redirectUri;
    private final Uri issuerUri;

    BasicJagexConfig(String string2, String string3, String string4, Uri uri, Uri uri2, String string5, String string6) {
        this.clientId = string2;
        this.clientSecret = string3;
        this.scope = string4;
        this.redirectUri = uri;
        this.issuerUri = uri2;
        this.shopName = string5;
        this.paymentUri = string6;
    }

    @Override
    public String getPaymentUri() {
        return this.paymentUri;
    }

    @Override
    public String getClientId() {
        return this.clientId;
    }

    @Override
    public Uri getIssuerUri() {
        return this.issuerUri;
    }

    @Override
    public String getShopName() {
        return this.shopName;
    }

    @Override
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override
    public String getScope() {
        return this.scope;
    }

    @Override
    public Uri getRedirectUri() {
        return this.redirectUri;
    }
}

