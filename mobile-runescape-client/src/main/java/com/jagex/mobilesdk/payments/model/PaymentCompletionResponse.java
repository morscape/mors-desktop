/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import com.jagex.mobilesdk.payments.model.CompletionStatus;
import net.runelite.mapping.Implements;

@Implements(value="PaymentCompletionResponse")
public class PaymentCompletionResponse {
    private String purchaseProductId;
    private CompletionStatus status;

    public CompletionStatus getStatus() {
        return this.status;
    }

    public String getPurchaseProductId() {
        return this.purchaseProductId;
    }

    public void setPurchaseProductId(String string2) {
        this.purchaseProductId = string2;
    }

    public void setStatus(CompletionStatus completionStatus) {
        this.status = completionStatus;
    }
}

