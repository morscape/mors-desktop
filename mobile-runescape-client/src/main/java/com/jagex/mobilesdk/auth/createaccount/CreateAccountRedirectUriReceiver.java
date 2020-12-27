/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.appcompat.app.AppCompatActivity
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.jagex.mobilesdk.auth.createaccount.CreateAccountManagementActivity;
import net.runelite.mapping.Implements;

@Implements(value="CreateAccountRedirectUriReceiver")
public class CreateAccountRedirectUriReceiver
extends AppCompatActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.startActivity(CreateAccountManagementActivity.createResponseHandlingIntent((Context)this, this.getIntent().getData()));
        this.finish();
    }
}

