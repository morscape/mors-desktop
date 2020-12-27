/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.app.Activity;
import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$1;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$2;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$3;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$4;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$5;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.comms.MobileAuthComms;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import net.runelite.mapping.Implements;

@Implements(value="MobileAuthStateManager")
public class MobileAuthStateManager {
    private static volatile MobileAuthStateManager singleInstance;
    private final MobileAuthStateWriter mobileAuthStateWriter;
    private MobileAuthState mobileAuthState;
    private final JagexConfig jagexConfig;

    private MobileAuthStateManager(MobileAuthStateWriter mobileAuthStateWriter, JagexConfig jagexConfig) {
        this.mobileAuthStateWriter = mobileAuthStateWriter;
        this.jagexConfig = jagexConfig;
        this.mobileAuthState = this.mobileAuthStateWriter.loadAuthState();
    }

    public boolean isUserAuthenticated() {
        return this.mobileAuthState.getAccessToken() != null && !this.mobileAuthState.getAccessToken().equals("");
    }

    private boolean isAuthStateFresh() {
        boolean bl = this.isUserAuthenticated();
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (this.mobileAuthState.getAccessTokenExpiration() == 0L) {
            return false;
        }
        long l = System.currentTimeMillis();
        if (this.mobileAuthState.getAccessTokenExpiration() > l + 60000L) {
            bl2 = true;
        }
        return bl2;
    }

    public void requestOAuth2Tokens(Activity activity, String string2, String string3, String string4, String string5, MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.jagexConfig.getIssuerUri());
        stringBuilder.append("/shield/oauth/token");
        MobileAuthComms.shieldOAuth2Comms(stringBuilder.toString(), string2, string3, string4, string5, this.jagexConfig, new MobileAuthStateManager$5(this, activity, mobileAuthServiceListener), true);
    }

    public void logout(MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.jagexConfig.getIssuerUri());
        stringBuilder.append("/shield/oauth/revoke");
        MobileAuthComms.logoutComms(stringBuilder.toString(), this.mobileAuthState, this.jagexConfig, new MobileAuthStateManager$3(this, mobileAuthServiceListener), true);
    }

    public void clearAuthState() {
        this.mobileAuthState = new MobileAuthState();
        this.mobileAuthStateWriter.saveAuthState(this.mobileAuthState);
    }

    public void storeTokens(MobileAuthState mobileAuthState) {
        this.mobileAuthState = mobileAuthState;
        this.mobileAuthStateWriter.saveAuthState(this.mobileAuthState);
    }

    public void performActionWithFreshTokens(Activity object, MobileAuthStateManager$AuthManagerAction mobileAuthStateManager$AuthManagerAction) {
        if (this.isAuthStateFresh()) {
            object.runOnUiThread((Runnable)new MobileAuthStateManager$1(this, mobileAuthStateManager$AuthManagerAction));
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((Object)this.jagexConfig.getIssuerUri());
        ((StringBuilder)object).append("/shield/oauth/token");
        MobileAuthComms.refreshTokenComms(((StringBuilder)object).toString(), this.mobileAuthState, this.jagexConfig, new MobileAuthStateManager$2(this, mobileAuthStateManager$AuthManagerAction), true);
    }

    public void requestGameToken(MobileAuthServiceListener mobileAuthServiceListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.jagexConfig.getIssuerUri());
        stringBuilder.append("/public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        MobileAuthComms.gameTokenComms(stringBuilder.toString(), this.mobileAuthState, new MobileAuthStateManager$4(this, mobileAuthServiceListener), true);
    }

    public MobileAuthState getAuthState() {
        return this.mobileAuthState;
    }

    static /* synthetic */ MobileAuthState access$000(MobileAuthStateManager mobileAuthStateManager) {
        return mobileAuthStateManager.mobileAuthState;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MobileAuthStateManager getInstance(MobileAuthStateWriter mobileAuthStateWriter, JagexConfig jagexConfig) {
        if (singleInstance != null) return singleInstance;
        synchronized (MobileAuthStateManager.class) {
            if (singleInstance != null) return singleInstance;
            singleInstance = new MobileAuthStateManager(mobileAuthStateWriter, jagexConfig);
            return singleInstance;
        }
    }

    static /* synthetic */ MobileAuthStateWriter access$100(MobileAuthStateManager mobileAuthStateManager) {
        return mobileAuthStateManager.mobileAuthStateWriter;
    }
}

