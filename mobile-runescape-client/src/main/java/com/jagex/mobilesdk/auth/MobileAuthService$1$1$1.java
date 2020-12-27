/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.MobileAuthService$1$1;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthService$1$1$1")
class MobileAuthService$1$1$1
implements MobileAuthServiceListener {
    final /* synthetic */ MobileAuthService$1$1 this$2;

    MobileAuthService$1$1$1(MobileAuthService$1$1 var1_1) {
        this.this$2 = var1_1;
    }

    @Override
    public void onResult(CommsResult commsResult) {
        if (commsResult.responseCode == 0) {
            commsResult.responseCode = 1407;
        }
        this.this$2.this$1.val$listener.onResult(commsResult);
    }
}

