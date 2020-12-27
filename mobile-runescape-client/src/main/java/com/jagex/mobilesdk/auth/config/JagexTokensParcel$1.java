/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.jagex.mobilesdk.auth.config.JagexTokensParcel;
import net.runelite.mapping.Implements;

@Implements(value="JagexTokensParcel$1")
final class JagexTokensParcel$1
implements Parcelable.Creator {
    JagexTokensParcel$1() {
    }

    public JagexTokensParcel createFromParcel(Parcel parcel) {
        return new JagexTokensParcel(parcel);
    }

    public JagexTokensParcel[] newArray(int n) {
        return new JagexTokensParcel[n];
    }
}

