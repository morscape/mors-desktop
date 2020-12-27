/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListViewController$CategoryListViewListener")
public interface CategoryListViewController$CategoryListViewListener {
    public void billingInitialiseAttempt(int var1);

    public void onInternetStateChanged(boolean var1);

    public void returnToGame();

    public void onDisplayMessage(int var1);

    public void onSuccessfulConsumption();

    public void onPendingPurchasesAvailable();

    public void onShopLoaded(String var1, String var2);

    public void onCategoriesLoaded(List var1);
}

