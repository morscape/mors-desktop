/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.payments.model.CompletionStatus;
import net.runelite.mapping.Implements;

@Implements(value="MobilePayments$7")
class MobilePayments$7 {
    static final /* synthetic */ int[] $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        $SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus = new int[CompletionStatus.values().length];
        try {
            MobilePayments$7.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.SUCCESS_CUSTOMER_MISMATCH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            MobilePayments$7.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.SUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            MobilePayments$7.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.FAILED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            MobilePayments$7.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.NETWORK_ERROR.ordinal()] = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

