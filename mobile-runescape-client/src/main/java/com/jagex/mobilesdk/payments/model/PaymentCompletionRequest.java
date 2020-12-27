/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest$PaymentPayload;
import net.runelite.mapping.Implements;

@Implements(value="PaymentCompletionRequest")
public class PaymentCompletionRequest {
    private final PaymentCompletionRequest$PaymentPayload payload;

    public PaymentCompletionRequest(PaymentCompletionRequest$PaymentPayload paymentCompletionRequest$PaymentPayload) {
        this.payload = paymentCompletionRequest$PaymentPayload;
    }

    public PaymentCompletionRequest$PaymentPayload getPayload() {
        return this.payload;
    }
}

