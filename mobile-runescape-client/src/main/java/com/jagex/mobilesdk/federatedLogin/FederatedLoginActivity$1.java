/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin;

import android.content.Intent;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginActivity;
import com.jagex.mobilesdk.federatedLogin.FederatedLoginService;
import com.jagex.mobilesdk.federatedLogin.comms.FederatedComms$PerformFederatedCallback;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginResponse;
import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginActivity$1")
class FederatedLoginActivity$1
implements FederatedComms$PerformFederatedCallback {
    final /* synthetic */ FederatedLoginActivity this$0;

    FederatedLoginActivity$1(FederatedLoginActivity federatedLoginActivity) {
        this.this$0 = federatedLoginActivity;
    }

    @Override
    public void onFederatedLoginResult(CommsResult object, Exception exception) {
        if (object != null && ((CommsResult)object).responseCode == 200) {
            try {
                object = (FederatedLoginResponse)((CommsResult)object).getResultValue();
                MobileAttributionService.setUserID(((FederatedLoginResponse)object).getRunescapeAccountId());
                exception = new Intent();
                exception.putExtra(FederatedLoginService.EXTRA_ONE_TIME_LOGIN_TOKEN, ((FederatedLoginResponse)object).getOneTimeLoginToken());
                FederatedLoginActivity.access$000(this.this$0, 0, (Intent)exception);
                return;
            }
            catch (Exception exception2) {
                FederatedLoginActivity.access$100(this.this$0, 1401, AuthMessage.ACTION_AUTH_ERROR.getMessage(), exception2);
                return;
            }
        }
        FederatedLoginActivity.access$200(this.this$0, 1403, AuthMessage.JAGEX_ACCESS_ERROR.getMessage(), exception);
    }
}

