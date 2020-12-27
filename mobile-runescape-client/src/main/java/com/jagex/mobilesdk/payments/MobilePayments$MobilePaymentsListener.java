/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import net.runelite.mapping.Implements;

@Implements(value="MobilePayments$MobilePaymentsListener")
public interface MobilePayments$MobilePaymentsListener {
    public void onSuccess();

    public void onFailure(int var1);
}

