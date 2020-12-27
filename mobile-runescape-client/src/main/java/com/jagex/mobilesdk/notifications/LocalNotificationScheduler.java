/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  androidx.core.app.NotificationCompat$Builder
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import net.runelite.mapping.Implements;

@Implements(value="LocalNotificationScheduler")
public class LocalNotificationScheduler
extends BroadcastReceiver {
    public void onReceive(Context context, Intent object) {
        NotificationManager notificationManager = (NotificationManager)context.getSystemService("notification");
        Notification notification = (Notification)object.getParcelableExtra("Notification");
        if (notification == null) {
            return;
        }
        notificationManager.notify(object.getIntExtra("Notification ID", 0), notification);
        int n = object.getIntExtra("Group ID", -1);
        if (n > -1) {
            if ((object = object.getStringExtra("Group Name")) == null) {
                return;
            }
            notificationManager.notify(n, new NotificationCompat.Builder(context, "GameNotifications").setContentIntent(notification.contentIntent).setSmallIcon(context.getApplicationInfo().icon).setGroup((String)object).setGroupSummary(true).setAutoCancel(true).build());
        }
    }
}

