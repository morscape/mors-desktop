/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.iid.InstanceIdResult
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.notifications;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.notifications.MobileNotificationServiceListener;
import net.runelite.mapping.Implements;

@Implements(value="MobileNotificationService$1")
final class MobileNotificationService$1
implements OnCompleteListener {
    final /* synthetic */ MobileNotificationServiceListener val$listener;

    MobileNotificationService$1(MobileNotificationServiceListener mobileNotificationServiceListener) {
        this.val$listener = mobileNotificationServiceListener;
    }

    public void onComplete(Task task) {
        if (!task.isSuccessful()) {
            this.val$listener.onResult(new CommsResult("", -1));
            return;
        }
        this.val$listener.onResult(new CommsResult(((InstanceIdResult)task.getResult()).getToken(), 0));
    }
}

