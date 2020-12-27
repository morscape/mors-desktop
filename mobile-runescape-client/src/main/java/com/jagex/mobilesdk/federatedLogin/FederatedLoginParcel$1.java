/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin;

import android.os.Parcel;
import android.os.Parcelable;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel;
import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginParcel$1")
final class FederatedLoginParcel$1
implements Parcelable.Creator {
    FederatedLoginParcel$1() {
    }

    public FederatedLoginParcel createFromParcel(Parcel parcel) {
        return new FederatedLoginParcel(parcel);
    }

    public FederatedLoginParcel[] newArray(int n) {
        return new FederatedLoginParcel[n];
    }
}

