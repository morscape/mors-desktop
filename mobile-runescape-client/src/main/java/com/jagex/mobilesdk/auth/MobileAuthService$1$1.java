/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.MobileAuthService;
import com.jagex.mobilesdk.auth.MobileAuthService$1;
import com.jagex.mobilesdk.auth.MobileAuthService$1$1$1;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthService$1$1")
class MobileAuthService$1$1
implements MobilePaymentServiceListener {
    final /* synthetic */ MobileAuthService$1 this$1;

    MobileAuthService$1$1(MobileAuthService$1 mobileAuthService$1) {
        this.this$1 = mobileAuthService$1;
    }

    @Override
    public void onSuccess() {
        if (MobileAuthService.access$100(this.this$1.this$0).checkForPendingTransactions()) {
            if (this.this$1.val$forceGameToken) {
                MobileAuthService.access$000(this.this$1.this$0).requestGameToken(new MobileAuthService$1$1$1(this));
                return;
            }
            CommsResult commsResult = new CommsResult("", 1407);
            this.this$1.val$listener.onResult(commsResult);
            return;
        }
        MobileAuthService.access$000(this.this$1.this$0).requestGameToken(this.this$1.val$listener);
    }

    @Override
    public void onFailure(int n) {
        MobileAuthService.access$000(this.this$1.this$0).requestGameToken(this.this$1.val$listener);
    }
}

