/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  androidx.browser.customtabs.CustomTabsIntent
 *  androidx.browser.customtabs.CustomTabsIntent$Builder
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jagex.mobilesdk.R$drawable;
import net.runelite.mapping.Implements;

@Implements(value="AuthJagexCustomTabs")
public class AuthJagexCustomTabs {
    private CustomTabsIntent.Builder customTab = new CustomTabsIntent.Builder();
    private int mBrowserHeaderColor = -13619152;

    public AuthJagexCustomTabs(Context context) {
        this.customTab.setToolbarColor(this.mBrowserHeaderColor);
        this.customTab.setSecondaryToolbarColor(this.mBrowserHeaderColor);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.outWidth = 24;
        options.outHeight = 24;
        options.inScaled = true;
        this.customTab.setCloseButtonIcon(BitmapFactory.decodeResource((Resources)context.getResources(), (int)R$drawable.ic_arrow_back, (BitmapFactory.Options)options));
    }

    public CustomTabsIntent build() {
        return this.customTab.build();
    }
}

