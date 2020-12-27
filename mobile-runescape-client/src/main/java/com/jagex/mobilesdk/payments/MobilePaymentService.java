/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  androidx.annotation.NonNull
 *  com.android.billingclient.api.Purchase
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.android.billingclient.api.Purchase;
import com.jagex.mobilesdk.analytics.MobileAnalyticsService;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import com.jagex.mobilesdk.payments.MobilePaymentService$1;
import com.jagex.mobilesdk.payments.MobilePaymentService$2;
import com.jagex.mobilesdk.payments.MobilePaymentService$3;
import com.jagex.mobilesdk.payments.MobilePaymentService$4;
import com.jagex.mobilesdk.payments.MobilePaymentService$5;
import com.jagex.mobilesdk.payments.MobilePaymentServiceListener;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import com.jagex.mobilesdk.payments.StoreActivity;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="MobilePaymentService")
public class MobilePaymentService {
    private static final String PACKAGE_NAME = MobilePaymentService.class.getPackage().getName();
    static final String EXTRA_CONFIG;
    static final String PACKAGE_CONFIG;
    static final String SELECTED_CONFIG;
    @NonNull
    private final JagexConfig config;
    private MobileAuthStateManager authStateManager;
    @ObfuscatedSignature(descriptor="Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    private LinkDeque purchaseHistory;
    private MobilePayments mobilePayments;
    private MobileAuthStateWriter authStateWriter;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".CONFIG");
        EXTRA_CONFIG = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".PACKAGEID.CONFIG");
        PACKAGE_CONFIG = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(PACKAGE_NAME);
        stringBuilder.append(".SELECTED.CONFIG");
        SELECTED_CONFIG = stringBuilder.toString();
    }

    public MobilePaymentService(Activity activity, JagexConfig jagexConfig) {
        this.config = jagexConfig;
        this.authStateWriter = new MobileAuthStateWriter(activity.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, jagexConfig);
        this.mobilePayments = new MobilePayments();
        this.purchaseHistory = new LinkDeque(activity);
        SecurityProviderUpdate.ProviderUpdate(activity);
    }

    private Intent createIntent(Activity activity, int n, int n2) {
        Bundle bundle = new Bundle();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("shop_page", n);
        MobileAttributionService.sendEvent((Context)activity, "soR6cK", hashMap);
        MobileAnalyticsService.sendEvent((Context)activity, "soR6cK", hashMap);
        bundle.putParcelable(EXTRA_CONFIG, (Parcelable)new JagexConfigParcel(this.config));
        bundle.putInt(PACKAGE_CONFIG, n);
        bundle.putInt(SELECTED_CONFIG, n2);
        return new Intent((Context)activity, StoreActivity.class).addFlags(65536).putExtras(bundle);
    }

    private boolean ready() {
        return this.purchaseHistory.ready() && this.mobilePayments.ready();
    }

    public boolean checkForPendingTransactions() {
        if (!this.ready()) {
            return false;
        }
        return this.purchaseHistory.isPendingTransactionsAvailable();
    }

    public void applyPendingTransactions(MobilePaymentServiceListener object) {
        if (!this.ready()) {
            object.onFailure(5);
            return;
        }
        if (!this.purchaseHistory.isPendingTransactionsAvailable()) {
            object.onSuccess();
            return;
        }
        object = new MobilePaymentService$2(this, this.purchaseHistory.getUnconsumedPurchases().size(), (MobilePaymentServiceListener)object);
        for (Purchase purchase : this.purchaseHistory.getUnconsumedPurchases()) {
            this.mobilePayments.sendPurchaseToBilling(purchase, this.purchaseHistory, this.authStateManager.getAuthState(), this.config, (MobilePayments$MobilePaymentsListener)object);
        }
        this.purchaseHistory.processFriendUpdates();
    }

    public void requestPurchaseHistory(MobilePaymentServiceListener mobilePaymentServiceListener) {
        if (!this.ready()) {
            mobilePaymentServiceListener.onFailure(5);
            return;
        }
        this.purchaseHistory.fetchPurchaseHistory(new MobilePaymentService$3(this, mobilePaymentServiceListener));
    }

    public void requestShopData(Activity activity, MobilePaymentServiceListener mobilePaymentServiceListener) {
        if (!this.ready()) {
            mobilePaymentServiceListener.onFailure(5);
            return;
        }
        this.authStateManager.performActionWithFreshTokens(activity, new MobilePaymentService$5(this, activity, mobilePaymentServiceListener));
    }

    public void performBillingAction(Activity activity, MobilePaymentServiceListener mobilePaymentServiceListener) {
        if (this.ready()) {
            mobilePaymentServiceListener.onSuccess();
            return;
        }
        activity.runOnUiThread((Runnable)new MobilePaymentService$1(this, activity, mobilePaymentServiceListener));
    }

    public void purchaseShopItem(Activity activity, String string2, MobilePaymentServiceListener mobilePaymentServiceListener) {
        if (!this.ready()) {
            mobilePaymentServiceListener.onFailure(5);
            return;
        }
        this.authStateManager.performActionWithFreshTokens(activity, new MobilePaymentService$4(this, string2, mobilePaymentServiceListener));
    }

    public boolean eligibleForIntroductoryPrice() {
        return this.purchaseHistory.eligibleForIntroductoryPrice();
    }

    public boolean eligibleForTrialPurchase() {
        return this.purchaseHistory.eligibleForTrialPurchase();
    }

    @Export(value="getDisplayY")
    @ObfuscatedName(value="getCategoryCount")
    public int getDisplayY() {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getRegionLowY();
        }
        return 0;
    }

    public String getCategoryDescription(int n) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getCategoryDescription(n);
        }
        return "";
    }

    public int getCategoryID(int n) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getCategoryID(n);
        }
        return -1;
    }

    public String getCategoryNameForCategoryID(int n) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getCategoryNameForCategoryID(n);
        }
        return "";
    }

    public String getCategoryNameForCategoryIndex(int n) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getCategoryNameForCategoryIndex(n);
        }
        return "";
    }

    public int getIndexForCategoryID(int n) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getIndexForCategoryID(n);
        }
        return -1;
    }

    public int getIndexForCategoryName(String string2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getIndexForCategoryName(string2);
        }
        return -1;
    }

    public int getProductCount(int n) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductCount(n);
        }
        return 0;
    }

    public String getProductCurrencyCode(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductCurrencyCode(n, n2);
        }
        return "";
    }

    public String getProductFreeTrialPeriod(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductFreeTrialPeriod(n, n2);
        }
        return "";
    }

    public String getProductID(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductID(n, n2);
        }
        return "";
    }

    public String getProductIntroductoryPrice(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductIntroductoryPrice(n, n2);
        }
        return "";
    }

    public long getProductIntroductoryPriceAsMicroUnits(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductIntroductoryPriceAsMicroUnits(n, n2);
        }
        return 0L;
    }

    public int getProductIntroductoryPriceDiscount(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductIntroductoryPriceDiscount(n, n2);
        }
        return 0;
    }

    public String getProductName(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductName(n, n2);
        }
        return "";
    }

    public String getProductPrice(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductPrice(n, n2);
        }
        return "";
    }

    public long getProductPriceAsMicroUnits(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductPriceAsMicroUnits(n, n2);
        }
        return 0L;
    }

    public String getProductType(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.getProductType(n, n2);
        }
        return "";
    }

    public boolean isProductAvailable(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.isProductAvailable(n, n2);
        }
        return false;
    }

    public boolean isProductRecommended(int n, int n2) {
        if (this.mobilePayments != null) {
            return this.mobilePayments.isProductRecommended(n, n2);
        }
        return false;
    }

    public void openStore(Activity activity) {
        activity.startActivity(this.createIntent(activity, 15, 1));
    }

    public void openStore(Activity activity, int n, int n2) {
        activity.startActivity(this.createIntent(activity, n, n2));
    }

    static /* synthetic */ MobilePayments access$000(MobilePaymentService mobilePaymentService) {
        return mobilePaymentService.mobilePayments;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/MobilePaymentService;)Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    static /* synthetic */ LinkDeque access$100(MobilePaymentService mobilePaymentService) {
        return mobilePaymentService.purchaseHistory;
    }

    static /* synthetic */ MobileAuthStateManager access$200(MobilePaymentService mobilePaymentService) {
        return mobilePaymentService.authStateManager;
    }

    static /* synthetic */ JagexConfig access$300(MobilePaymentService mobilePaymentService) {
        return mobilePaymentService.config;
    }
}

