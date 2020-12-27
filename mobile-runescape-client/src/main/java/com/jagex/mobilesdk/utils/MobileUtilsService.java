/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;
import net.runelite.mapping.Implements;

@Implements(value="MobileUtilsService")
public class MobileUtilsService {
    public void openBrowser(Activity activity, Uri uri) {
        Intent intent = new AuthJagexCustomTabs((Context)activity.getApplicationContext()).build().intent;
        intent.setData(uri);
        activity.startActivity(intent);
    }
}

