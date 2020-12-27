/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 *  com.google.firebase.analytics.FirebaseAnalytics
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.analytics;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import net.runelite.mapping.Implements;

@Implements(value="MobileAnalyticsService")
public class MobileAnalyticsService {
    public static void init(Context context) {
        FirebaseAnalytics.getInstance((Context)context.getApplicationContext()).setAnalyticsCollectionEnabled(true);
    }

    public static void sendEvent(Context context, String string2, Map map) {
        FirebaseAnalytics.getInstance((Context)context.getApplicationContext()).logEvent(string2, MobileAnalyticsService.convertToBundle(map));
    }

    private static Bundle convertToBundle(Map object) {
        Bundle bundle = new Bundle();
        if (object == null) {
            return bundle;
        }
        for (Map.Entry entry : object.entrySet()) {
            Object v = entry.getValue();
            if (v instanceof String) {
                bundle.putString((String)entry.getKey(), (String)entry.getValue());
                continue;
            }
            if (v instanceof Float) {
                bundle.putFloat((String)entry.getKey(), ((Float)entry.getValue()).floatValue());
                continue;
            }
            if (v instanceof Double) {
                bundle.putDouble((String)entry.getKey(), ((Double)entry.getValue()).doubleValue());
                continue;
            }
            if (v instanceof Integer) {
                bundle.putInt((String)entry.getKey(), ((Integer)entry.getValue()).intValue());
                continue;
            }
            if (v instanceof Long) {
                bundle.putLong((String)entry.getKey(), ((Long)entry.getValue()).longValue());
                continue;
            }
            if (v instanceof Boolean) {
                bundle.putBoolean((String)entry.getKey(), ((Boolean)entry.getValue()).booleanValue());
                continue;
            }
            if (v instanceof Character) {
                bundle.putChar((String)entry.getKey(), ((Character)entry.getValue()).charValue());
                continue;
            }
            Log.e((String)"MobileAnalyticsService", (String)"Unsupported type given to convertToBundle");
        }
        return bundle;
    }
}

