/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.jagex.mobilesdk.analytics.MobileAnalyticsService;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.auth.JagexCompatActivity;
import net.runelite.mapping.Implements;

@Implements(value="CreateAccountManagementActivity")
public class CreateAccountManagementActivity
extends JagexCompatActivity {
    private boolean mCreateAccountStarted;
    private Intent mAccountCreationIntent;

    private void extractState(Bundle bundle) {
        if (bundle == null) {
            this.finishWithError(1406, AuthMessage.GENERIC_ACCOUNT_CREATION_ERROR.getMessage(), null);
            return;
        }
        this.mAccountCreationIntent = (Intent)bundle.getParcelable("accountCreationIntent");
        this.mCreateAccountStarted = bundle.getBoolean("accountCreationStarted", false);
    }

    private void handleAuthorizationCanceled() {
        MobileAttributionService.sendEvent((Context)this, "af_account_creation_cancelled", null);
        MobileAnalyticsService.sendEvent((Context)this, "af_account_creation_cancelled", null);
        this.finish(0);
    }

    private void handleCreateAccountComplete() {
        MobileAttributionService.setUserID(this.getIntent().getData().getQueryParameter("id"));
        MobileAttributionService.sendEvent((Context)this, "af_account_creation_completed", null);
        MobileAnalyticsService.sendEvent((Context)this, "af_account_creation_completed", null);
        this.finish(-1);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.extractState(this.getIntent().getExtras());
            return;
        }
        this.extractState(bundle);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
    }

    protected void onResume() {
        super.onResume();
        if (!this.mCreateAccountStarted) {
            this.startActivity(this.mAccountCreationIntent);
            this.mCreateAccountStarted = true;
            return;
        }
        if (this.getIntent().getData() != null) {
            this.handleCreateAccountComplete();
            return;
        }
        this.handleAuthorizationCanceled();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("accountCreationStarted", this.mCreateAccountStarted);
        bundle.putParcelable("accountCreationIntent", (Parcelable)this.mAccountCreationIntent);
    }

    private static Intent createBaseIntent(Context context) {
        return new Intent(context, CreateAccountManagementActivity.class);
    }

    public static Intent createResponseHandlingIntent(Context context, Uri uri) {
        context = CreateAccountManagementActivity.createBaseIntent(context);
        context.setData(uri);
        context.addFlags(0x24000000);
        return context;
    }

    public static Intent createStartIntent(Context context, Intent intent) {
        context = CreateAccountManagementActivity.createBaseIntent(context);
        context.putExtra("accountCreationIntent", (Parcelable)intent);
        return context;
    }
}

