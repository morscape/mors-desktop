/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthStateManager$1")
class MobileAuthStateManager$1
implements Runnable {
    final /* synthetic */ MobileAuthStateManager this$0;
    final /* synthetic */ MobileAuthStateManager$AuthManagerAction val$action;

    MobileAuthStateManager$1(MobileAuthStateManager mobileAuthStateManager, MobileAuthStateManager$AuthManagerAction mobileAuthStateManager$AuthManagerAction) {
        this.this$0 = mobileAuthStateManager;
        this.val$action = mobileAuthStateManager$AuthManagerAction;
    }

    @Override
    public void run() {
        this.val$action.execute(MobileAuthStateManager.access$000(this.this$0).getAccessToken(), null);
    }
}

