/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import net.runelite.mapping.Implements;

@Implements(value="CompletionStatus")
public enum CompletionStatus {
    SUCCESS,
    SUCCESS_CUSTOMER_MISMATCH,
    FAILED,
    NETWORK_ERROR,
    ERROR;

}

