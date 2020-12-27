/*
 * Decompiled with CFR 0.150.
 */
package com.jagex.jagex3.client.input.softkeyboard;

import com.jagex.jagex3.client.input.softkeyboard.ae;
import com.jagex.jagex3.client.input.softkeyboard.ax;
import java.util.Iterator;
import java.util.List;

class al
implements Runnable {
    final /* synthetic */ ax this$0;

    al(ax ax2) {
        this.this$0 = ax2;
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
            Iterator iterator = this.this$0.field2225.iterator();
            while (iterator.hasNext()) {
                ((ae)iterator.next()).vmethod10275();
            }
            return;
        }
    }
}

