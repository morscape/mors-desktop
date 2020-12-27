/*
 * Decompiled with CFR 0.150.
 */
package com.jagex.jagex3.client.input.softkeyboard;

import com.jagex.jagex3.client.input.softkeyboard.ax;

class as
implements Runnable {
    final /* synthetic */ int val$type;
    final /* synthetic */ ax this$0;

    as(ax ax2, int n) {
        this.this$0 = ax2;
        this.val$type = n;
    }

    @Override
    public void run() {
        switch (this.val$type) {
            default: {
                return;
            }
            case 3: {
                this.this$0.vmethod10015();
                return;
            }
            case 2: {
                this.this$0.vmethod10004();
                return;
            }
            case 1: {
                this.this$0.vmethod10001();
                return;
            }
            case 0: 
        }
        this.this$0.vmethod10006();
    }
}

