/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.comms.GameTokenComms$FetchGameTokenCallback;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthStateManager$4")
class MobileAuthStateManager$4
implements GameTokenComms$FetchGameTokenCallback {
    final /* synthetic */ MobileAuthStateManager this$0;
    final /* synthetic */ MobileAuthServiceListener val$listener;

    MobileAuthStateManager$4(MobileAuthStateManager mobileAuthStateManager, MobileAuthServiceListener mobileAuthServiceListener) {
        this.this$0 = mobileAuthStateManager;
        this.val$listener = mobileAuthServiceListener;
    }

    @Override
    public void onGameTokenResult(CommsResult commsResult, Exception exception) {
        this.val$listener.onResult(commsResult);
    }
}

