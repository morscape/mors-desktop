/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper$BillingClientWrapperListener")
public interface BillingClientWrapper$BillingClientWrapperListener {
    public void onFailure(int var1);

    public void onSuccess(Object var1);
}

