/*
 * Decompiled with CFR 0.150.
 */
package com.jagex.jagex3.client.input.softkeyboard;

import com.jagex.jagex3.client.input.softkeyboard.ae;
import com.jagex.jagex3.client.input.softkeyboard.ax;
import java.util.List;

class ai
implements Runnable {
    final /* synthetic */ ax this$0;
    final /* synthetic */ int val$formFieldIndex;

    ai(ax ax2, int n) {
        this.this$0 = ax2;
        this.val$formFieldIndex = n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        List list = this.this$0.field2225;
        synchronized (list) {
            if (this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.field2225.size()) {
                ((ae)this.this$0.field2225.get(this.val$formFieldIndex)).vmethod10274();
            }
            return;
        }
    }
}

