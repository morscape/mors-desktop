/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.google.android.gms.common.GoogleApiAvailability
 *  com.google.android.gms.common.GooglePlayServicesNotAvailableException
 *  com.google.android.gms.common.GooglePlayServicesRepairableException
 *  com.google.android.gms.security.ProviderInstaller
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import net.runelite.mapping.Implements;

@Implements(value="SecurityProviderUpdate")
public class SecurityProviderUpdate {
    public static void ProviderUpdate(Activity activity) {
        try {
            ProviderInstaller.installIfNeeded((Context)activity.getApplicationContext());
            return;
        }
        catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException) {
            GoogleApiAvailability.getInstance().showErrorNotification(activity.getApplicationContext(), googlePlayServicesRepairableException.getConnectionStatusCode());
            return;
        }
        catch (GooglePlayServicesNotAvailableException | Exception throwable) {
            return;
        }
    }
}

