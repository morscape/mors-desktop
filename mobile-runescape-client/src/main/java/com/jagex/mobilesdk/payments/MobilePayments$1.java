/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.Purchase
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.Purchase;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="MobilePayments$1")
class MobilePayments$1
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ MobilePayments this$0;
    final /* synthetic */ MobilePayments$MobilePaymentsListener val$listener;
    @ObfuscatedSignature(descriptor="Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    final /* synthetic */ LinkDeque val$purchaseHistory;
    final /* synthetic */ MobileAuthState val$authState;
    final /* synthetic */ JagexConfig val$config;

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/MobilePayments;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    MobilePayments$1(MobilePayments mobilePayments, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        this.this$0 = mobilePayments;
        this.val$purchaseHistory = linkDeque;
        this.val$authState = mobileAuthState;
        this.val$config = jagexConfig;
        this.val$listener = mobilePayments$MobilePaymentsListener;
    }

    public void onSuccess(Purchase purchase) {
        this.this$0.sendPurchaseToBilling(purchase, this.val$purchaseHistory, this.val$authState, this.val$config, this.val$listener);
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }
}

