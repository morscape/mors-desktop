/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.config;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.jagex.mobilesdk.auth.config.JagexTokensParcel$1;
import net.runelite.mapping.Implements;

@Implements(value="JagexTokensParcel")
public class JagexTokensParcel
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new JagexTokensParcel$1();
    private final String accessToken;
    private final long expiresIn;
    private final String refreshToken;

    protected JagexTokensParcel(Parcel parcel) {
        parcel = parcel.readBundle(this.getClass().getClassLoader());
        this.accessToken = parcel.getString("accessToken");
        this.refreshToken = parcel.getString("refreshToken");
        this.expiresIn = parcel.getLong("expiresIn");
    }

    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void writeToParcel(Parcel parcel, int n) {
        Bundle bundle = new Bundle();
        bundle.putString("accessToken", this.accessToken);
        bundle.putString("refreshToken", this.refreshToken);
        bundle.putLong("expiresIn", this.expiresIn);
        parcel.writeBundle(bundle);
    }
}

