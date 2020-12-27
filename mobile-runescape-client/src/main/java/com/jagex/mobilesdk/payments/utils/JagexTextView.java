/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.util.AttributeSet
 *  androidx.appcompat.widget.AppCompatTextView
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.jagex.mobilesdk.payments.utils.JagexTextView$CustomFont;
import java.util.Hashtable;
import net.runelite.mapping.Implements;

@Implements(value="JagexTextView")
public class JagexTextView
extends AppCompatTextView {
    private static final Hashtable typeFaces = new Hashtable(2);

    private void applyCustomFont(Context context, AttributeSet object) {
        if (!this.isInEditMode()) {
            if ((object = object.getAttributeValue("http://schemas.android.com/apk/res-auto", "customFont")) != null) {
                Typeface typeface = (Typeface)typeFaces.get(object);
                if (typeface == null) {
                    context = JagexTextView$CustomFont.fromString((String)object).asTypeface(context);
                    typeFaces.put(object, context);
                    this.setTypeface((Typeface)context);
                    return;
                }
                this.setTypeface(typeface);
                return;
            }
            throw new IllegalArgumentException("You must provide \"customFont\" for your text view");
        }
    }
}

