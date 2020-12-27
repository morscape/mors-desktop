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
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$7;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms$CompletePaymentCallback;
import com.jagex.mobilesdk.payments.model.PaymentCompletionResponse;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="MobilePayments$4")
class MobilePayments$4
implements CompletePaymentComms$CompletePaymentCallback {
    final /* synthetic */ MobilePayments this$0;
    final /* synthetic */ MobilePayments$MobilePaymentsListener val$listener;
    final /* synthetic */ String val$purchaseType;
    @ObfuscatedSignature(descriptor="Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    final /* synthetic */ LinkDeque val$purchaseHistory;
    final /* synthetic */ Purchase val$purchase;

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/MobilePayments;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;Ljava/lang/String;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/android/billingclient/api/Purchase;)V")
    MobilePayments$4(MobilePayments mobilePayments, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener, String string2, LinkDeque linkDeque, Purchase purchase) {
        this.this$0 = mobilePayments;
        this.val$listener = mobilePayments$MobilePaymentsListener;
        this.val$purchaseType = string2;
        this.val$purchaseHistory = linkDeque;
        this.val$purchase = purchase;
    }

    @Override
    public void onCompletePaymentResult(CommsResult object, Exception exception) {
        if (object != null) {
            object = (PaymentCompletionResponse)((CommsResult)object).getResultValue();
            switch (MobilePayments$7.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[((PaymentCompletionResponse)object).getStatus().ordinal()]) {
                default: {
                    this.val$listener.onFailure(R$string.DEVELOPER_ERROR);
                    return;
                }
                case 4: {
                    this.val$listener.onFailure(R$string.SERVICE_UNAVAILABLE);
                    return;
                }
                case 3: {
                    this.val$listener.onFailure(R$string.ITEM_UNAVAILABLE);
                    if ("inapp".equals(this.val$purchaseType)) {
                        MobilePayments.access$600(this.this$0, this.val$purchase, this.val$listener);
                    }
                    return;
                }
                case 1: {
                    this.val$listener.onFailure(R$string.ITEM_NOT_OWNED);
                }
                case 2: 
            }
            if ("subs".equals(this.val$purchaseType)) {
                this.val$purchaseHistory.addToKnownSubscriptions(this.val$purchase.getPurchaseToken());
                MobilePayments.access$500(this.this$0, this.val$purchase, this.val$listener);
                return;
            }
            if ("inapp".equals(this.val$purchaseType)) {
                MobilePayments.access$600(this.this$0, this.val$purchase, this.val$listener);
            }
            return;
        }
        this.val$listener.onFailure(((CommsResult)object).responseCode);
    }
}

