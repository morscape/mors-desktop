/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.config;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.jagex.mobilesdk.auth.config.BasicJagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel$1;
import java.util.Objects;
import net.runelite.mapping.Implements;

@Implements(value="JagexConfigParcel")
public class JagexConfigParcel
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new JagexConfigParcel$1();
    private final JagexConfig config;

    protected JagexConfigParcel(Parcel parcel) {
        parcel = parcel.readBundle(this.getClass().getClassLoader());
        this.config = new BasicJagexConfig(parcel.getString("clientId"), parcel.getString("clientSecret"), parcel.getString("scope"), Uri.parse((String)parcel.getString("redirectUri")), Uri.parse((String)parcel.getString("issuerUri")), parcel.getString("shopName"), parcel.getString("paymentUri"));
    }

    public JagexConfigParcel(JagexConfig jagexConfig) {
        this.config = Objects.requireNonNull(jagexConfig);
    }

    public JagexConfig getConfig() {
        return this.config;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n) {
        Bundle bundle = new Bundle();
        bundle.putString("clientId", this.config.getClientId());
        bundle.putString("clientSecret", this.config.getClientSecret());
        bundle.putString("scope", this.config.getScope());
        bundle.putString("issuerUri", this.config.getIssuerUri().toString());
        bundle.putString("redirectUri", this.config.getRedirectUri().toString());
        bundle.putString("shopName", this.config.getShopName());
        bundle.putString("paymentUri", this.config.getPaymentUri());
        parcel.writeBundle(bundle);
    }
}

