/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import net.runelite.mapping.Implements;

@Implements(value="PaymentCompletionRequest$PaymentPayload")
public class PaymentCompletionRequest$PaymentPayload {
    private final String purchaseData;
    private final String signature;
    private final String skuType;

    public PaymentCompletionRequest$PaymentPayload(String string2, String string3, String string4) {
        this.purchaseData = string2;
        this.signature = string3;
        this.skuType = string4;
    }

    public String getPurchaseData() {
        return this.purchaseData;
    }

    public String getSignature() {
        return this.signature;
    }

    public String getSkuType() {
        return this.skuType;
    }
}

