/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.android.billingclient.api.AcknowledgePurchaseParams
 *  com.android.billingclient.api.AcknowledgePurchaseResponseListener
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingClientStateListener
 *  com.android.billingclient.api.BillingFlowParams
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ConsumeParams
 *  com.android.billingclient.api.ConsumeResponseListener
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.Purchase$PurchasesResult
 *  com.android.billingclient.api.PurchaseHistoryResponseListener
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.android.billingclient.api.SkuDetails
 *  com.android.billingclient.api.SkuDetailsParams
 *  com.android.billingclient.api.SkuDetailsParams$Builder
 *  com.android.billingclient.api.SkuDetailsResponseListener
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.jagex.mobilesdk.analytics.MobileAnalyticsService;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.payments.BillingClientWrapper$1;
import com.jagex.mobilesdk.payments.BillingClientWrapper$2;
import com.jagex.mobilesdk.payments.BillingClientWrapper$3;
import com.jagex.mobilesdk.payments.BillingClientWrapper$4;
import com.jagex.mobilesdk.payments.BillingClientWrapper$5;
import com.jagex.mobilesdk.payments.BillingClientWrapper$6;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperInitListener;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="BillingClientWrapper")
public class BillingClientWrapper
implements PurchasesUpdatedListener {
    private BillingClientWrapper$BillingClientWrapperListener purchaseListener;
    private BillingClient billingClient;
    private final float priceDivisor;
    private Activity activity;
    private SkuDetails purchasedSKU;

    public BillingClientWrapper(Activity activity) {
        this.priceDivisor = 1000000.0f;
        this.activity = activity;
    }

    private void fetchProductsType(String string2, List list, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        if (this.billingClient == null) {
            billingClientWrapper$BillingClientWrapperListener.onFailure(5);
            return;
        }
        SkuDetailsParams.Builder builder = SkuDetailsParams.newBuilder();
        builder.setSkusList(list).setType(string2);
        this.billingClient.querySkuDetailsAsync(builder.build(), (SkuDetailsResponseListener)new BillingClientWrapper$5(this, billingClientWrapper$BillingClientWrapperListener));
    }

    public void close() {
        this.purchaseListener = null;
        if (this.billingClient != null) {
            this.billingClient.endConnection();
        }
    }

    public void acknowledge(Purchase purchase, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        if (this.billingClient == null) {
            billingClientWrapper$BillingClientWrapperListener.onFailure(5);
            return;
        }
        if (purchase.isAcknowledged()) {
            billingClientWrapper$BillingClientWrapperListener.onSuccess((Object)purchase);
            return;
        }
        AcknowledgePurchaseParams acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        this.billingClient.acknowledgePurchase(acknowledgePurchaseParams, (AcknowledgePurchaseResponseListener)new BillingClientWrapper$4(this, billingClientWrapper$BillingClientWrapperListener, purchase));
    }

    public void consume(Purchase purchase, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        if (this.billingClient == null) {
            billingClientWrapper$BillingClientWrapperListener.onFailure(5);
            return;
        }
        purchase = ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build();
        this.billingClient.consumeAsync((ConsumeParams)purchase, (ConsumeResponseListener)new BillingClientWrapper$3(this, billingClientWrapper$BillingClientWrapperListener));
    }

    public void initiatePurchaseFlow(SkuDetails skuDetails, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        if (this.billingClient == null) {
            billingClientWrapper$BillingClientWrapperListener.onFailure(5);
            return;
        }
        this.purchaseListener = billingClientWrapper$BillingClientWrapperListener;
        this.purchasedSKU = skuDetails;
        skuDetails = BillingFlowParams.newBuilder().setSkuDetails(skuDetails).build();
        this.billingClient.launchBillingFlow(this.activity, (BillingFlowParams)skuDetails);
    }

    public boolean isBillingClientReady() {
        if (this.billingClient == null) {
            return false;
        }
        return this.billingClient.isReady();
    }

    public List queryPendingTransactions() {
        if (this.billingClient == null) {
            return null;
        }
        Purchase.PurchasesResult purchasesResult = this.billingClient.queryPurchases("inapp");
        if (purchasesResult.getResponseCode() != 0) {
            return null;
        }
        Purchase.PurchasesResult purchasesResult2 = this.billingClient.queryPurchases("subs");
        if (purchasesResult2.getResponseCode() != 0) {
            return null;
        }
        purchasesResult.getPurchasesList().addAll(purchasesResult2.getPurchasesList());
        return purchasesResult.getPurchasesList();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onPurchasesUpdated(BillingResult object, List list2) {
        if (object.getResponseCode() != 0) {
            if (this.purchaseListener == null) return;
            this.purchaseListener.onFailure(object.getResponseCode());
            return;
        }
        for (List list2 : list2) {
            if (this.purchasedSKU != null) {
                HashMap<String, Object> hashMap = new HashMap<String, Object>();
                hashMap.put("af_revenue", Float.valueOf((float)this.purchasedSKU.getPriceAmountMicros() / 1000000.0f));
                hashMap.put("af_currency", this.purchasedSKU.getPriceCurrencyCode());
                hashMap.put("af_content_type", this.purchasedSKU.getTitle());
                hashMap.put("af_content_id", this.purchasedSKU.getSku());
                MobileAttributionService.sendEvent((Context)this.activity, "af_purchase", hashMap);
                MobileAnalyticsService.sendEvent((Context)this.activity, "af_purchase", hashMap);
            }
            if (this.purchaseListener == null) continue;
            this.purchaseListener.onSuccess(list2);
        }
    }

    public void queryPurchaseHistory(String string2, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        if (this.billingClient == null) {
            billingClientWrapper$BillingClientWrapperListener.onFailure(5);
            return;
        }
        this.billingClient.queryPurchaseHistoryAsync(string2, (PurchaseHistoryResponseListener)new BillingClientWrapper$2(this, billingClientWrapper$BillingClientWrapperListener));
    }

    public void fetchAllProducts(List list, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        this.fetchProductsType("subs", list, new BillingClientWrapper$6(this, new ArrayList(), list, billingClientWrapper$BillingClientWrapperListener));
    }

    public void initBillingClient(BillingClient billingClient, BillingClientWrapper$BillingClientWrapperInitListener billingClientWrapper$BillingClientWrapperInitListener) {
        if (billingClient != null && billingClient.isReady()) {
            billingClientWrapper$BillingClientWrapperInitListener.billingClientInitResponse(0);
            return;
        }
        this.billingClient = billingClient;
        this.billingClient.startConnection((BillingClientStateListener)new BillingClientWrapper$1(this, billingClientWrapper$BillingClientWrapperInitListener));
    }

    static /* synthetic */ void access$000(BillingClientWrapper billingClientWrapper, String string2, List list, BillingClientWrapper$BillingClientWrapperListener billingClientWrapper$BillingClientWrapperListener) {
        billingClientWrapper.fetchProductsType(string2, list, billingClientWrapper$BillingClientWrapperListener);
    }
}

