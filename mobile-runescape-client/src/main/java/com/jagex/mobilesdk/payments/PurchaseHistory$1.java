/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import com.jagex.mobilesdk.payments.PurchaseHistory$1$1;
import com.jagex.mobilesdk.payments.PurchaseHistory$PurchaseHistoryListener;
import java.util.List;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="PurchaseHistory$1")
class PurchaseHistory$1
implements BillingClientWrapper$BillingClientWrapperListener {
    @ObfuscatedSignature(descriptor="Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    final /* synthetic */ LinkDeque this$0;
    final /* synthetic */ PurchaseHistory$PurchaseHistoryListener val$listener;

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/payments/PurchaseHistory$PurchaseHistoryListener;)V")
    PurchaseHistory$1(LinkDeque linkDeque, PurchaseHistory$PurchaseHistoryListener purchaseHistory$PurchaseHistoryListener) {
        this.this$0 = linkDeque;
        this.val$listener = purchaseHistory$PurchaseHistoryListener;
    }

    public void onSuccess(List list) {
        LinkDeque.access$000(this.this$0).addAll(list);
        LinkDeque.access$200(this.this$0).queryPurchaseHistory("inapp", new PurchaseHistory$1$1(this));
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }
}

