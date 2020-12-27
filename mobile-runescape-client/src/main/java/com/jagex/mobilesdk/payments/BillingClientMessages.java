/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.R$string;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientMessages")
public class BillingClientMessages {
    public static int getErrorMessage(int n) {
        switch (n) {
            case 8: {
                return R$string.ITEM_NOT_OWNED;
            }
            case 7: {
                return R$string.ITEM_ALREADY_OWNED;
            }
            case 6: {
                return R$string.ERROR;
            }
            case 5: {
                return R$string.DEVELOPER_ERROR;
            }
            case 4: {
                return R$string.ITEM_UNAVAILABLE;
            }
            case 3: {
                return R$string.BILLING_UNAVAILABLE;
            }
            case 2: {
                return R$string.SERVICE_UNAVAILABLE;
            }
            case 1: {
                return R$string.USER_CANCELED;
            }
            default: {
                return R$string.ERROR;
            }
            case -1: {
                return R$string.SERVICE_DISCONNECTED;
            }
            case -2: 
        }
        return R$string.FEATURE_NOT_SUPPORTED;
    }
}

