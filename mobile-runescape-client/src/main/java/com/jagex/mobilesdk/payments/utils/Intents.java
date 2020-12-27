/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.IntentFilter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.content.IntentFilter;
import net.runelite.mapping.Implements;

@Implements(value="Intents")
public class Intents {
    public static IntentFilter getConnectivityIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }
}

