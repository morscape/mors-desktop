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
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import net.runelite.mapping.Implements;

@Implements(value="JagexConfigParcel$1")
final class JagexConfigParcel$1
implements Parcelable.Creator {
    JagexConfigParcel$1() {
    }

    public JagexConfigParcel createFromParcel(Parcel parcel) {
        return new JagexConfigParcel(parcel);
    }

    public JagexConfigParcel[] newArray(int n) {
        return new JagexConfigParcel[n];
    }
}

