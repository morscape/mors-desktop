/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
package com.jagex.mobilesdk.auth.config;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.jagex.mobilesdk.auth.config.BasicJagexConfig;
import com.jagex.mobilesdk.auth.config.InvalidConfigurationException;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="JagexConfigBuilder")
public class JagexConfigBuilder {
    private String clientId;
    private String clientSecret;
    private String issuerUri;
    private String paymentUri;
    private String redirectUri;
    private String scope;
    private String shopName;
    private final Context context;

    public JagexConfigBuilder(Context context) {
        this.context = context;
    }

    @Export(value="isIgnored")
    @ObfuscatedName(value="isEmptyString")
    private boolean isIgnored(String string2) {
        return string2 == null || string2.trim().isEmpty();
        {
        }
    }

    private void validateConfigField(StringBuilder stringBuilder, String string2, String string3) {
        if (this.isIgnored(string3)) {
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(string2);
        }
    }

    public JagexConfigBuilder setClientId(String string2) {
        this.clientId = string2;
        return this;
    }

    public JagexConfigBuilder setScope(String string2) {
        this.scope = string2;
        return this;
    }

    public JagexConfigBuilder setRedirectUri(String string2) {
        this.redirectUri = string2;
        return this;
    }

    public JagexConfigBuilder setClientSecret(String string2) {
        this.clientSecret = string2;
        return this;
    }

    public JagexConfigBuilder setIssuerUri(String string2) {
        this.issuerUri = string2;
        return this;
    }

    public JagexConfigBuilder setShopName(String string2) {
        this.shopName = string2;
        return this;
    }

    public JagexConfigBuilder setPaymentUri(String string2) {
        this.paymentUri = string2;
        return this;
    }

    public JagexConfig build() throws InvalidConfigurationException {
        Object object = new StringBuilder();
        this.validateConfigField((StringBuilder)object, "clientId", this.clientId);
        this.validateConfigField((StringBuilder)object, "clientSecret", this.clientSecret);
        this.validateConfigField((StringBuilder)object, "scope", this.scope);
        this.validateConfigField((StringBuilder)object, "redirectUri", this.redirectUri);
        this.validateConfigField((StringBuilder)object, "issuerUri", this.issuerUri);
        this.validateConfigField((StringBuilder)object, "shopName", this.shopName);
        this.validateConfigField((StringBuilder)object, "paymentUri", this.paymentUri);
        if (((StringBuilder)object).length() <= 0) {
            object = new BasicJagexConfig(this.clientId, this.clientSecret, this.scope, Uri.parse((String)this.redirectUri), Uri.parse((String)this.issuerUri), this.shopName, this.paymentUri);
            if (this.tryLoadFileByNames(this.context, object.getRedirectUri())) {
                return object;
            }
            throw new InvalidConfigurationException("com_jagex_mobilesdk_redirectUri is not handled by any activity in this app.\nEnsure that the android:scheme in your AndroidManifest.xml intent-filter is set correctly");
        }
        ((StringBuilder)object).insert(0, "The following config fields were empty:");
        throw new InvalidConfigurationException(((StringBuilder)object).toString());
    }

    @Export(value="tryLoadFileByNames")
    @ObfuscatedName(value="isRedirectUriRegistered")
    private boolean tryLoadFileByNames(Context context, Uri uri) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName()).setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(uri);
        return context.getPackageManager().queryIntentActivities(intent, 0).isEmpty() ^ true;
    }
}

