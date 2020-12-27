/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.utils;

import com.android.billingclient.api.SkuDetails;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListInteractionListener")
public interface CategoryListInteractionListener {
    public void onShopLoaded(String var1, String var2);

    public void finish();

    public void onCollapsePackages();

    public void onShowHideMoreProducts(boolean var1, int var2);

    public void purchaseProduct(SkuDetails var1);

    public void setCategoryExpandCollapseDetails(boolean var1, int var2);

    public void onCategoryExpanded();
}

