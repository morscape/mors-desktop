/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.Locale;
import net.runelite.mapping.Implements;

@Implements(value="JagexTextView$CustomFont")
public enum JagexTextView$CustomFont {
    BAGUE_SANS_BLACK("fonts/bague_sans_black.otf"),
    BAGUE_SANS_THIN("fonts/bague_sans_thin.otf");

    private final String fileName;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private JagexTextView$CustomFont() {
        void var3_1;
        this.fileName = var3_1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Typeface asTypeface(Context context) {
        try {
            return Typeface.createFromAsset((AssetManager)context.getAssets(), (String)this.fileName);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static JagexTextView$CustomFont fromString(String string2) {
        return JagexTextView$CustomFont.valueOf(string2.toUpperCase(Locale.US));
    }
}

