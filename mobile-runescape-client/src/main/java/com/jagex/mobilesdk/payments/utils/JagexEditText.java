/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  androidx.appcompat.widget.AppCompatEditText
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatEditText;
import net.runelite.mapping.Implements;

@Implements(value="JagexEditText")
public class JagexEditText
extends AppCompatEditText {
    public void setTypeface(Typeface typeface) {
        super.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), (String)"fonts/bague_sans_thin.otf"));
    }

    public void setTypeface(Typeface typeface, int n) {
        super.setTypeface(Typeface.createFromAsset((AssetManager)this.getContext().getAssets(), (String)"fonts/bague_sans_thin.otf"), n);
    }
}

