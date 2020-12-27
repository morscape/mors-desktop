/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.comms.LogoutComms$PerformLogoutCallback;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthStateManager$3")
class MobileAuthStateManager$3
implements LogoutComms$PerformLogoutCallback {
    final /* synthetic */ MobileAuthStateManager this$0;
    final /* synthetic */ MobileAuthServiceListener val$listener;

    MobileAuthStateManager$3(MobileAuthStateManager mobileAuthStateManager, MobileAuthServiceListener mobileAuthServiceListener) {
        this.this$0 = mobileAuthStateManager;
        this.val$listener = mobileAuthServiceListener;
    }

    @Override
    public void onLogoutResult(CommsResult commsResult, Exception exception) {
        this.this$0.clearAuthState();
        this.val$listener.onResult(commsResult);
    }
}

