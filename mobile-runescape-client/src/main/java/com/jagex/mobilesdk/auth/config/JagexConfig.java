/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.NonNull
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.config;

import android.net.Uri;
import androidx.annotation.NonNull;
import net.runelite.mapping.Implements;

@Implements(value="JagexConfig")
public interface JagexConfig {
    @NonNull
    public String getPaymentUri();

    @NonNull
    public String getClientId();

    @NonNull
    public Uri getIssuerUri();

    @NonNull
    public String getShopName();

    @NonNull
    public String getClientSecret();

    @NonNull
    public String getScope();

    @NonNull
    public Uri getRedirectUri();
}

