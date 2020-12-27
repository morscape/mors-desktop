/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.firebase.iid.FirebaseInstanceId
 *  com.google.firebase.messaging.FirebaseMessaging
 *  com.google.firebase.messaging.FirebaseMessagingService
 *  com.google.firebase.messaging.RemoteMessage
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.notifications;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.jagex.mobilesdk.notifications.MobileNotificationService$1;
import com.jagex.mobilesdk.notifications.MobileNotificationServiceListener;
import net.runelite.mapping.Implements;

@Implements(value="MobileNotificationService")
public class MobileNotificationService
extends FirebaseMessagingService {
    public void onNewToken(String string2) {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public static void init(Context context) {
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
    }

    public static void getLatestDeviceToken(MobileNotificationServiceListener mobileNotificationServiceListener) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener((OnCompleteListener)new MobileNotificationService$1(mobileNotificationServiceListener));
    }
}

