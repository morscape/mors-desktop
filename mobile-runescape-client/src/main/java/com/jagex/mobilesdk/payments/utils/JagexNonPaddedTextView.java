/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.jagex.mobilesdk.payments.utils.JagexTextView;
import net.runelite.mapping.Implements;

@Implements(value="JagexNonPaddedTextView")
public class JagexNonPaddedTextView
extends JagexTextView {
    private final Rect bounds;
    private final Paint paint;

    private String calculateTextParams() {
        String string2 = this.getText().toString();
        int n = string2.length();
        this.paint.setTextSize(this.getTextSize());
        this.paint.getTextBounds(string2, 0, n, this.bounds);
        if (n == 0) {
            this.bounds.right = this.bounds.left;
        }
        return string2;
    }

    protected void onDraw(Canvas canvas) {
        String string2 = this.calculateTextParams();
        int n = this.bounds.left;
        int n2 = this.bounds.bottom;
        this.bounds.offset(-this.bounds.left, -this.bounds.top);
        this.paint.setAntiAlias(true);
        this.paint.setColor(this.getCurrentTextColor());
        canvas.drawText(string2, (float)(-n), (float)(this.bounds.bottom - n2), this.paint);
    }

    protected void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        this.calculateTextParams();
        this.setMeasuredDimension(this.bounds.width() + 1, this.bounds.bottom + -this.bounds.top);
    }
}

