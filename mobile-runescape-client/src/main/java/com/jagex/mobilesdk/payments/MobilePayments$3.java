/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import java.util.List;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="MobilePayments$3")
class MobilePayments$3
implements BillingClientWrapper$BillingClientWrapperListener {
    final /* synthetic */ MobilePayments this$0;
    final /* synthetic */ MobilePayments$MobilePaymentsListener val$listener;
    final /* synthetic */ Purchase val$purchase;
    @ObfuscatedSignature(descriptor="Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    final /* synthetic */ LinkDeque val$purchaseHistory;
    final /* synthetic */ MobileAuthState val$authState;
    final /* synthetic */ JagexConfig val$config;

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/MobilePayments;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;Lcom/android/billingclient/api/Purchase;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;)V")
    MobilePayments$3(MobilePayments mobilePayments, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener, Purchase purchase, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig) {
        this.this$0 = mobilePayments;
        this.val$listener = mobilePayments$MobilePaymentsListener;
        this.val$purchase = purchase;
        this.val$purchaseHistory = linkDeque;
        this.val$authState = mobileAuthState;
        this.val$config = jagexConfig;
    }

    public void onSuccess(List object) {
        if (object.isEmpty()) {
            this.val$listener.onFailure(R$string.ITEM_UNAVAILABLE);
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            SkuDetails skuDetails = (SkuDetails)object.next();
            MobilePayments.access$400(this.this$0, this.val$purchase, skuDetails.getType(), this.val$purchaseHistory, this.val$authState, this.val$config, this.val$listener);
        }
    }

    @Override
    public void onFailure(int n) {
        this.val$listener.onFailure(n);
    }
}

