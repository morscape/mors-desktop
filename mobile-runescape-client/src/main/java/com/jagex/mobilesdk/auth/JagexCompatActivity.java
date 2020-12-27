/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  androidx.appcompat.app.AppCompatActivity
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import net.runelite.mapping.Implements;

@Implements(value="JagexCompatActivity")
public class JagexCompatActivity
extends AppCompatActivity {
    private static final String PACKAGE_NAME = JagexCompatActivity.class.getPackage().getName();
    public static final String EXTRA_EXCEPTION_CLASS;
    public static final String EXTRA_EXCEPTION_MESSAGE;
    public static final String EXTRA_ERROR_MESSAGE;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".ERROR_MESSAGE");
        EXTRA_ERROR_MESSAGE = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".EXCEPTION_CLASS");
        EXTRA_EXCEPTION_CLASS = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".EXCEPTION_MESSAGE");
        EXTRA_EXCEPTION_MESSAGE = stringBuilder.toString();
    }

    protected void finishWithError(int n, String string2, Exception object) {
        Intent intent = new Intent();
        String string3 = "";
        String string4 = "";
        if (object != null) {
            string3 = object.getClass().toString();
            string4 = ((Throwable)object).getMessage();
        }
        object = string4;
        if (string4 == null) {
            object = "";
        }
        string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        intent.putExtra(EXTRA_EXCEPTION_CLASS, string3).putExtra(EXTRA_EXCEPTION_MESSAGE, (String)object).putExtra(EXTRA_ERROR_MESSAGE, string4);
        this.finish(n, intent);
    }

    protected void finish(int n, Intent intent) {
        this.setResult(n, intent);
        this.finish();
    }

    protected void finish(int n) {
        this.finish(n, null);
    }
}

