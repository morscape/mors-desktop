/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.notifications;

import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="MobileNotificationServiceListener")
public interface MobileNotificationServiceListener {
    public void onResult(CommsResult var1);
}

