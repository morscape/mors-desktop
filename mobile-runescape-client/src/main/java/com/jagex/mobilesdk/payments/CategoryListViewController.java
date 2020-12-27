/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchasesUpdatedListener
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.BillingClientWrapper$BillingClientWrapperInitListener;
import com.jagex.mobilesdk.payments.CategoryListViewController$1;
import com.jagex.mobilesdk.payments.CategoryListViewController$2;
import com.jagex.mobilesdk.payments.CategoryListViewController$3;
import com.jagex.mobilesdk.payments.CategoryListViewController$4;
import com.jagex.mobilesdk.payments.CategoryListViewController$CategoryListViewListener;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.utils.Intents;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="CategoryListViewController")
public class CategoryListViewController
implements BillingClientWrapper$BillingClientWrapperInitListener {
    private final Activity activity;
    private final Context context;
    private final BillingClientWrapper billingClientWrapper;
    private final JagexConfig jagexConfig;
    private final MobileAuthStateManager authStateManager;
    private final MobilePayments mobilePayments;
    private final CategoryListViewController$CategoryListViewListener viewListener;
    @ObfuscatedSignature(descriptor="Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    private final LinkDeque purchaseHistory;
    private final BroadcastReceiver receiver;

    CategoryListViewController(CategoryListViewController$CategoryListViewListener categoryListViewController$CategoryListViewListener, Activity activity, JagexConfig jagexConfig) {
        this.viewListener = categoryListViewController$CategoryListViewListener;
        this.context = activity.getApplicationContext();
        this.activity = activity;
        this.billingClientWrapper = new BillingClientWrapper(activity);
        categoryListViewController$CategoryListViewListener = BillingClient.newBuilder((Context)activity).setListener((PurchasesUpdatedListener)this.billingClientWrapper).enablePendingPurchases().build();
        this.billingClientWrapper.initBillingClient((BillingClient)categoryListViewController$CategoryListViewListener, this);
        this.mobilePayments = new MobilePayments();
        this.authStateManager = MobileAuthStateManager.getInstance(new MobileAuthStateWriter(activity.getApplicationContext()), jagexConfig);
        this.jagexConfig = jagexConfig;
        this.purchaseHistory = new LinkDeque(activity);
        this.receiver = new CategoryListViewController$1(this);
    }

    private void networkUpdate(Boolean bl) {
        this.viewListener.onInternetStateChanged(bl);
        if (bl.booleanValue()) {
            this.authStateManager.performActionWithFreshTokens(this.activity, new CategoryListViewController$2(this));
            return;
        }
        this.viewListener.onDisplayMessage(R$string.NO_NETWORK);
    }

    void buyProduct(SkuDetails skuDetails) {
        this.authStateManager.performActionWithFreshTokens(this.activity, new CategoryListViewController$3(this, skuDetails));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void checkNetwork() {
        try {
            this.context.unregisterReceiver(this.receiver);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        this.context.registerReceiver(this.receiver, Intents.getConnectivityIntentFilter());
    }

    public void queryPendingTransactions() {
        if (this.purchaseHistory.isPendingTransactionsAvailable()) {
            this.viewListener.onPendingPurchasesAvailable();
        }
    }

    @Override
    public void billingClientInitResponse(int n) {
        this.viewListener.billingInitialiseAttempt(n);
        this.mobilePayments.init(this.billingClientWrapper);
        this.purchaseHistory.init(this.billingClientWrapper);
    }

    void applyUnconsumedPurchases(boolean bl) {
        if (bl) {
            if (!this.purchaseHistory.isPendingTransactionsAvailable()) {
                return;
            }
            CategoryListViewController$4 categoryListViewController$4 = new CategoryListViewController$4(this, this.purchaseHistory.getUnconsumedPurchases().size());
            for (Purchase purchase : this.purchaseHistory.getUnconsumedPurchases()) {
                this.mobilePayments.sendPurchaseToBilling(purchase, this.purchaseHistory, this.authStateManager.getAuthState(), this.jagexConfig, categoryListViewController$4);
            }
        } else {
            this.viewListener.returnToGame();
        }
        this.purchaseHistory.processFriendUpdates();
    }

    void onDetach() {
        this.billingClientWrapper.close();
        try {
            this.context.unregisterReceiver(this.receiver);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public boolean eligibleForTrialPurchase() {
        return this.purchaseHistory.eligibleForTrialPurchase();
    }

    public boolean eligibleForIntroductoryPrice() {
        return this.purchaseHistory.eligibleForIntroductoryPrice();
    }

    static /* synthetic */ MobilePayments access$500(CategoryListViewController categoryListViewController) {
        return categoryListViewController.mobilePayments;
    }

    static /* synthetic */ CategoryListViewController$CategoryListViewListener access$100(CategoryListViewController categoryListViewController) {
        return categoryListViewController.viewListener;
    }

    static /* synthetic */ MobileAuthStateManager access$300(CategoryListViewController categoryListViewController) {
        return categoryListViewController.authStateManager;
    }

    static /* synthetic */ void access$000(CategoryListViewController categoryListViewController, Boolean bl) {
        categoryListViewController.networkUpdate(bl);
    }

    static /* synthetic */ Activity access$200(CategoryListViewController categoryListViewController) {
        return categoryListViewController.activity;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/CategoryListViewController;)Lcom/jagex/mobilesdk/payments/PurchaseHistory;")
    static /* synthetic */ LinkDeque access$600(CategoryListViewController categoryListViewController) {
        return categoryListViewController.purchaseHistory;
    }

    static /* synthetic */ JagexConfig access$400(CategoryListViewController categoryListViewController) {
        return categoryListViewController.jagexConfig;
    }
}

