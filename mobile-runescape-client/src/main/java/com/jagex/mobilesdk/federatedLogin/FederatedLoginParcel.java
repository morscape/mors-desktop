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
package com.jagex.mobilesdk.federatedLogin;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel$1;
import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginParcel")
public class FederatedLoginParcel
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FederatedLoginParcel$1();
    private final String googleClientId;
    private final String issuerURL;
    private final String packageId;

    protected FederatedLoginParcel(Parcel parcel) {
        parcel = parcel.readBundle(this.getClass().getClassLoader());
        this.packageId = parcel.getString("packageId");
        this.googleClientId = parcel.getString("googleClientId");
        this.issuerURL = parcel.getString("issuerURL");
    }

    public FederatedLoginParcel(String string2, String string3, Uri uri) {
        this.packageId = string2;
        this.googleClientId = string3;
        this.issuerURL = uri.toString();
    }

    public String getGoogleClientId() {
        return this.googleClientId;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public String getIssuerURL() {
        return this.issuerURL;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n) {
        Bundle bundle = new Bundle();
        bundle.putString("packageId", this.packageId);
        bundle.putString("googleClientId", this.googleClientId);
        bundle.putString("issuerURL", this.issuerURL);
        parcel.writeBundle(bundle);
    }
}

