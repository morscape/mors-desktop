/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.auth.comms.RefreshComms$RefreshTokenCallback;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthStateManager$2")
class MobileAuthStateManager$2
implements RefreshComms$RefreshTokenCallback {
    final /* synthetic */ MobileAuthStateManager this$0;
    final /* synthetic */ MobileAuthStateManager$AuthManagerAction val$action;

    MobileAuthStateManager$2(MobileAuthStateManager mobileAuthStateManager, MobileAuthStateManager$AuthManagerAction mobileAuthStateManager$AuthManagerAction) {
        this.this$0 = mobileAuthStateManager;
        this.val$action = mobileAuthStateManager$AuthManagerAction;
    }

    @Override
    public void onTokenResult(String string2, Long l, String string3, Exception exception) {
        if (exception == null) {
            MobileAuthStateManager.access$000(this.this$0).setAccessToken(string2);
            MobileAuthStateManager.access$000(this.this$0).reset(l);
            MobileAuthStateManager.access$000(this.this$0).setRefreshToken(string3);
            MobileAuthStateManager.access$100(this.this$0).saveAuthState(MobileAuthStateManager.access$000(this.this$0));
            this.val$action.execute(string2, null);
            return;
        }
        this.this$0.clearAuthState();
        this.val$action.execute("", exception);
    }
}

