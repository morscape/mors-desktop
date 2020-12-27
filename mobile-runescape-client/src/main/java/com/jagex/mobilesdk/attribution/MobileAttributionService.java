/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.appsflyer.AppsFlyerConversionListener
 *  com.appsflyer.AppsFlyerLib
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.attribution;

import android.app.Activity;
import android.content.Context;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.jagex.mobilesdk.attribution.MobileAttributionService$1;
import java.util.Map;
import net.runelite.mapping.Implements;

@Implements(value="MobileAttributionService")
public final class MobileAttributionService {
    public static void sendEvent(Context context, String string2, Map map) {
        AppsFlyerLib.getInstance().trackEvent(context, string2, map);
    }

    public static void init(Activity activity, String string2) {
        MobileAttributionService$1 mobileAttributionService$1 = new MobileAttributionService$1(activity);
        AppsFlyerLib.getInstance().init(string2, (AppsFlyerConversionListener)mobileAttributionService$1, activity.getApplicationContext());
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        AppsFlyerLib.getInstance().setCollectAndroidID(false);
        AppsFlyerLib.getInstance().startTracking(activity.getApplication());
        AppsFlyerLib.getInstance().trackAppLaunch(activity.getApplicationContext(), string2);
    }

    public static void setUserID(String string2) {
        AppsFlyerLib.getInstance().setCustomerUserId(string2);
    }
}

