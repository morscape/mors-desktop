/*
 * Decompiled with CFR 0.150.
 */
package com.jagex.jagex3.client.input.softkeyboard;

import com.jagex.jagex3.client.input.softkeyboard.ae;
import com.jagex.jagex3.client.input.softkeyboard.ax;
import java.util.List;

class aj
implements Runnable {
    final /* synthetic */ ax this$0;
    final /* synthetic */ int val$limit;
    final /* synthetic */ int val$formFieldIndex;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        List list = this.this$0.field2225;
        synchronized (list) {
            if (this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < this.this$0.field2225.size()) {
                ((ae)this.this$0.field2225.get(this.val$formFieldIndex)).vmethod10290(this.val$limit);
            }
            return;
        }
    }
}

