/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import com.android.billingclient.api.SkuDetails;
import net.runelite.mapping.Implements;

@Implements(value="JagexProduct")
public class JagexProduct {
    private boolean available;
    private boolean recommended;
    private String subtitle;
    private String productId;
    private String title;
    private SkuDetails skuItem;

    public String getTitle() {
        return this.title;
    }

    public String getFullProductName() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getTitle());
        stringBuilder.append(" ");
        stringBuilder.append(this.getSubtitle());
        return stringBuilder.toString();
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public String getProductId() {
        return this.productId;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public SkuDetails getSkuItem() {
        return this.skuItem;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSkuItem(SkuDetails skuDetails) {
        this.skuItem = skuDetails;
    }

    public void setProductId(String string2) {
        this.productId = string2;
    }

    public void setRecommended(boolean bl) {
        this.recommended = bl;
    }

    public void setSubtitle(String string2) {
        this.subtitle = string2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }
}

