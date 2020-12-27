/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.app.Activity;
import com.jagex.mobilesdk.auth.MobileAuthService;
import com.jagex.mobilesdk.auth.MobileAuthService$1$1;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthService$1")
class MobileAuthService$1
implements MobileAuthStateManager$AuthManagerAction {
    final /* synthetic */ MobileAuthService this$0;
    final /* synthetic */ boolean val$ignorePendingTransactions;
    final /* synthetic */ MobileAuthServiceListener val$listener;
    final /* synthetic */ Activity val$activity;
    final /* synthetic */ boolean val$forceGameToken;

    MobileAuthService$1(MobileAuthService mobileAuthService, MobileAuthServiceListener mobileAuthServiceListener, boolean bl, Activity activity, boolean bl2) {
        this.this$0 = mobileAuthService;
        this.val$listener = mobileAuthServiceListener;
        this.val$ignorePendingTransactions = bl;
        this.val$activity = activity;
        this.val$forceGameToken = bl2;
    }

    @Override
    public void execute(String object, Exception exception) {
        if (exception != null) {
            object = new CommsResult("", 1401);
            this.val$listener.onResult((CommsResult)object);
            return;
        }
        if (this.val$ignorePendingTransactions) {
            MobileAuthService.access$000(this.this$0).requestGameToken(this.val$listener);
            return;
        }
        MobileAuthService.access$100(this.this$0).performBillingAction(this.val$activity, new MobileAuthService$1$1(this));
    }
}

