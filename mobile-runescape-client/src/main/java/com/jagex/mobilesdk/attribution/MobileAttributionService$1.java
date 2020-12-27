/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.appsflyer.AppsFlyerConversionListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.attribution;

import android.app.Activity;
import com.appsflyer.AppsFlyerConversionListener;
import com.jagex.mobilesdk.analytics.MobileAnalyticsService;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import java.util.Map;
import net.runelite.mapping.Implements;

@Implements(value="MobileAttributionService$1")
final class MobileAttributionService$1
implements AppsFlyerConversionListener {
    final /* synthetic */ Activity val$activity;

    MobileAttributionService$1(Activity activity) {
        this.val$activity = activity;
    }

    public void onConversionDataFail(String string2) {
    }

    public void onAttributionFailure(String string2) {
    }

    public void onAppOpenAttribution(Map map) {
    }

    public void onConversionDataSuccess(Map map) {
        if (((Boolean)map.get("is_first_launch")).booleanValue()) {
            MobileAttributionService.sendEvent(this.val$activity.getApplicationContext(), "af_started_first_time", map);
            MobileAnalyticsService.sendEvent(this.val$activity.getApplicationContext(), "af_started_first_time", null);
        }
    }
}

