/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlarmManager
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  androidx.core.app.NotificationCompat$Builder
 *  androidx.core.app.NotificationManagerCompat
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.notifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.jagex.mobilesdk.notifications.LocalNotificationScheduler;
import java.util.Random;
import net.runelite.mapping.Implements;

@Implements(value="LocalNotificationsManager")
public class LocalNotificationsManager {
    private static final Random randomNumberGenerator = new Random();
    private final Activity activity;

    public LocalNotificationsManager(Activity activity) {
        this.activity = activity;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("GameNotifications", (CharSequence)"Game Notifications", 3);
            notificationChannel.setDescription("Channel for Game notifications");
            ((NotificationManager)activity.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private PendingIntent createLaunchActivityIntent() {
        Intent intent = new Intent((Context)this.activity, this.activity.getClass());
        intent.setFlags(0x20000000);
        return PendingIntent.getActivity((Context)this.activity, (int)0, (Intent)intent, (int)0x8000000);
    }

    private Notification createNotification(String string2, String string3, int n, int n2) {
        return new NotificationCompat.Builder((Context)this.activity, "GameNotifications").setContentIntent(this.createLaunchActivityIntent()).setSmallIcon(this.activity.getApplicationInfo().icon).setContentTitle((CharSequence)string2).setContentText((CharSequence)string3).setPriority(n).setGroup(Integer.toString(n2)).setAutoCancel(true).build();
    }

    private NotificationCompat.Builder createGroupedNotificationBuilder(String string2, String string3, int n, String string4) {
        return new NotificationCompat.Builder((Context)this.activity, "GameNotifications").setContentIntent(this.createLaunchActivityIntent()).setSmallIcon(this.activity.getApplicationInfo().icon).setContentTitle((CharSequence)string2).setContentText((CharSequence)string3).setPriority(n).setGroup(string4).setAutoCancel(true);
    }

    public void cancelNotification(int n) {
        Intent intent = new Intent((Context)this.activity, LocalNotificationScheduler.class);
        if ((intent = PendingIntent.getBroadcast((Context)this.activity, (int)n, (Intent)intent, (int)0x20000000)) != null) {
            intent.cancel();
            ((AlarmManager)this.activity.getSystemService("alarm")).cancel((PendingIntent)intent);
        }
    }

    public boolean getNotificationSetting(Activity activity) {
        return NotificationManagerCompat.from((Context)activity.getApplicationContext()).areNotificationsEnabled();
    }

    public boolean isNotificationScheduled(int n) {
        Intent intent = new Intent((Context)this.activity, LocalNotificationScheduler.class);
        return PendingIntent.getBroadcast((Context)this.activity, (int)n, (Intent)intent, (int)0x20000000) != null;
    }

    public void openNotificationSettings(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        activity.startActivity(intent);
    }

    public int sendGroupedNotification(String string2, String string3, int n, int n2, String string4, int n3) {
        int n4 = randomNumberGenerator.nextInt(Integer.MAX_VALUE);
        int n5 = n;
        if (n < -2) {
            n5 = -2;
        }
        n = n5;
        if (n5 > 2) {
            n = 2;
        }
        if (n2 <= -1) {
            return -1;
        }
        if (n3 == 0) {
            NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from((Context)this.activity);
            notificationManagerCompat.notify(n4, this.createGroupedNotificationBuilder(string2, string3, n, string4).build());
            notificationManagerCompat.notify(n2, this.createGroupedNotificationBuilder(string2, string3, n, string4).setContentTitle((CharSequence)string2).setContentText((CharSequence)string3).setGroupSummary(true).build());
            return n4;
        }
        if (n3 > 0) {
            Intent intent = new Intent((Context)this.activity, LocalNotificationScheduler.class);
            intent.putExtra("Notification ID", n4);
            intent.putExtra("Notification", (Parcelable)this.createGroupedNotificationBuilder(string2, string3, n, string4).build());
            intent.putExtra("Group ID", n2);
            intent.putExtra("Group Name", string4);
            string2 = PendingIntent.getBroadcast((Context)this.activity, (int)n4, (Intent)intent, (int)0x8000000);
            if (string2 != null) {
                long l = SystemClock.elapsedRealtime();
                long l2 = n3 * 1000;
                ((AlarmManager)this.activity.getSystemService("alarm")).set(2, l + l2, (PendingIntent)string2);
            }
        } else {
            return -1;
        }
        return n4;
    }

    public int sendNotification(String string2, String string3, int n, int n2) {
        int n3 = randomNumberGenerator.nextInt(Integer.MAX_VALUE);
        int n4 = n;
        if (n < -2) {
            n4 = -2;
        }
        n = n4;
        if (n4 > 2) {
            n = 2;
        }
        if (n2 == 0) {
            NotificationManagerCompat.from((Context)this.activity).notify(n3, this.createNotification(string2, string3, n, n3));
            return n3;
        }
        if (n2 > 0) {
            Intent intent = new Intent((Context)this.activity, LocalNotificationScheduler.class);
            intent.putExtra("Notification ID", n3);
            intent.putExtra("Notification", (Parcelable)this.createNotification(string2, string3, n, n3));
            string2 = PendingIntent.getBroadcast((Context)this.activity, (int)n3, (Intent)intent, (int)0x8000000);
            if (string2 != null) {
                long l = SystemClock.elapsedRealtime();
                long l2 = n2 * 1000;
                ((AlarmManager)this.activity.getSystemService("alarm")).set(2, l + l2, (PendingIntent)string2);
            }
        } else {
            return -1;
        }
        return n3;
    }
}

