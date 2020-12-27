/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.payments;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.MobilePayments$1;
import com.jagex.mobilesdk.payments.MobilePayments$2;
import com.jagex.mobilesdk.payments.MobilePayments$3;
import com.jagex.mobilesdk.payments.MobilePayments$4;
import com.jagex.mobilesdk.payments.MobilePayments$5;
import com.jagex.mobilesdk.payments.MobilePayments$6;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest$PaymentPayload;
import com.jagex.mobilesdk.payments.model.Shop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="MobilePayments")
public class MobilePayments {
    private HashMap productTypeMap;
    private Shop shop = new Shop();
    private BillingClientWrapper billingClientWrapper;
    private List categories = new ArrayList();

    public MobilePayments() {
        this.productTypeMap = new HashMap();
    }

    private void acknowledgePurchase(Purchase purchase, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        this.billingClientWrapper.acknowledge(purchase, new MobilePayments$5(this, mobilePayments$MobilePaymentsListener));
    }

    private List assignSKUItemToCategory(List object, List list) {
        this.productTypeMap = new HashMap();
        for (Object object2 : list) {
            this.productTypeMap.put(object2.getSku(), object2.getType());
        }
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        block1: while (object.hasNext()) {
            Object object2;
            object2 = (JagexCategory)object.next();
            Object object3 = ((JagexCategory)object2).getProducts().iterator();
            block2: while (true) {
                SkuDetails skuDetails;
                Object object42;
                if (!object3.hasNext()) {
                    object3 = new ArrayList();
                    for (Object object42 : ((JagexCategory)object2).getProducts()) {
                        if (((JagexProduct)object42).getSkuItem() == null) continue;
                        object3.add(object42);
                    }
                    if (object3.size() <= 0) continue block1;
                    ((JagexCategory)object2).setProducts((List)object3);
                    arrayList.add(object2);
                    continue block1;
                }
                JagexProduct jagexProduct = (JagexProduct)object3.next();
                object42 = list.iterator();
                do {
                    if (!object42.hasNext()) continue block2;
                    skuDetails = (SkuDetails)object42.next();
                    if (jagexProduct.getSkuItem() != null) continue block2;
                } while (skuDetails == null || !jagexProduct.getProductId().equals(skuDetails.getSku()));
                jagexProduct.setSkuItem(skuDetails);
            }
            break;
        }
        return arrayList;
    }

    private void consumePurchase(Purchase purchase, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        this.billingClientWrapper.consume(purchase, new MobilePayments$6(this, mobilePayments$MobilePaymentsListener));
    }

    @ObfuscatedSignature(descriptor="(Lcom/android/billingclient/api/Purchase;Ljava/lang/String;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    private void completePayment(Purchase purchase, String string2, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        if (string2 == null) {
            mobilePayments$MobilePaymentsListener.onFailure(R$string.ITEM_UNAVAILABLE);
            return;
        }
        PaymentCompletionRequest paymentCompletionRequest = new PaymentCompletionRequest(new PaymentCompletionRequest$PaymentPayload(purchase.getOriginalJson(), purchase.getSignature(), string2));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(jagexConfig.getPaymentUri());
        stringBuilder.append("/completion/");
        stringBuilder.append(jagexConfig.getShopName());
        stringBuilder.append("/android");
        PaymentComms.completePaymentsComms(stringBuilder.toString(), mobileAuthState, paymentCompletionRequest, new MobilePayments$4(this, mobilePayments$MobilePaymentsListener, string2, linkDeque, purchase), true);
    }

    private JagexCategory getCategory(int n) {
        if (n >= 0 && n < this.categories.size()) {
            return (JagexCategory)this.categories.get(n);
        }
        return null;
    }

    private JagexProduct getProductforCategory(int n, int n2) {
        JagexCategory jagexCategory = this.getCategory(n);
        if (jagexCategory != null && n2 >= 0 && n2 < jagexCategory.getProducts().size()) {
            return (JagexProduct)jagexCategory.getProducts().get(n2);
        }
        return null;
    }

    @Export(value="getRegionLowY")
    @ObfuscatedName(value="getCategoryCount")
    public int getRegionLowY() {
        return this.categories.size();
    }

    public String getCategoryDescription(int n) {
        JagexCategory jagexCategory = this.getCategory(n);
        if (jagexCategory != null) {
            return jagexCategory.getLongDescription();
        }
        return "";
    }

    public int getCategoryID(int n) {
        JagexCategory jagexCategory = this.getCategory(n);
        if (jagexCategory != null) {
            return jagexCategory.getCategoryID();
        }
        return -1;
    }

    public String getCategoryNameForCategoryID(int n) {
        for (JagexCategory jagexCategory : this.categories) {
            if (jagexCategory.getCategoryID() != n) continue;
            return jagexCategory.getName();
        }
        return "";
    }

    public String getCategoryNameForCategoryIndex(int n) {
        JagexCategory jagexCategory = this.getCategory(n);
        if (jagexCategory != null) {
            return jagexCategory.getName();
        }
        return "";
    }

    public int getIndexForCategoryID(int n) {
        Iterator iterator = this.categories.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            if (((JagexCategory)iterator.next()).getCategoryID() == n) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    public int getIndexForCategoryName(String string2) {
        Iterator iterator = this.categories.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (((JagexCategory)iterator.next()).getName().equalsIgnoreCase(string2)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public int getProductCount(int n) {
        JagexCategory jagexCategory = this.getCategory(n);
        if (jagexCategory != null) {
            return jagexCategory.getProducts().size();
        }
        return 0;
    }

    public String getProductCurrencyCode(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getPriceCurrencyCode();
        }
        return "";
    }

    public String getProductFreeTrialPeriod(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getFreeTrialPeriod();
        }
        return "";
    }

    public String getProductID(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getProductId();
        }
        return "";
    }

    public String getProductIntroductoryPrice(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getIntroductoryPrice();
        }
        return "";
    }

    public long getProductIntroductoryPriceAsMicroUnits(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getIntroductoryPriceAmountMicros();
        }
        return 0L;
    }

    public int getProductIntroductoryPriceDiscount(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null && jagexProduct.getSkuItem().getIntroductoryPriceAmountMicros() > 0L) {
            return (int)Math.max(100.0 - (double)jagexProduct.getSkuItem().getIntroductoryPriceAmountMicros() * 100.0 / (double)jagexProduct.getSkuItem().getPriceAmountMicros(), 0.0);
        }
        return 0;
    }

    public String getProductName(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getFullProductName();
        }
        return "";
    }

    public String getProductPrice(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getPrice();
        }
        return "";
    }

    public long getProductPriceAsMicroUnits(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getPriceAmountMicros();
        }
        return 0L;
    }

    public String getProductType(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.getSkuItem().getType();
        }
        return "";
    }

    public boolean isProductAvailable(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.isAvailable();
        }
        return false;
    }

    public boolean isProductRecommended(int n, int n2) {
        JagexProduct jagexProduct = this.getProductforCategory(n, n2);
        if (jagexProduct != null) {
            return jagexProduct.isRecommended();
        }
        return false;
    }

    @ObfuscatedSignature(descriptor="(Lcom/android/billingclient/api/Purchase;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    private void processUnknownPurchaseType(Purchase purchase, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(purchase.getSku());
        this.billingClientWrapper.fetchAllProducts(arrayList, new MobilePayments$3(this, mobilePayments$MobilePaymentsListener, purchase, linkDeque, mobileAuthState, jagexConfig));
    }

    public boolean ready() {
        if (this.billingClientWrapper == null) {
            return false;
        }
        return this.billingClientWrapper.isBillingClientReady();
    }

    @ObfuscatedSignature(descriptor="(Lcom/android/billingclient/api/Purchase;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    public void sendPurchaseToBilling(Purchase purchase, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        String string2 = (String)this.productTypeMap.get(purchase.getSku());
        if (string2 != null) {
            this.completePayment(purchase, string2, linkDeque, mobileAuthState, jagexConfig, mobilePayments$MobilePaymentsListener);
            return;
        }
        this.processUnknownPurchaseType(purchase, linkDeque, mobileAuthState, jagexConfig, mobilePayments$MobilePaymentsListener);
    }

    public void init(BillingClientWrapper billingClientWrapper) {
        this.billingClientWrapper = billingClientWrapper;
    }

    public String getShopImageLogo() {
        if (this.shop != null) {
            return this.shop.getImageLogo();
        }
        return "";
    }

    public String getShopBackgroundImage() {
        if (this.shop != null) {
            return this.shop.getImageBackground();
        }
        return "";
    }

    public void fetchCategories(Context context, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(jagexConfig.getPaymentUri());
        stringBuilder.append("shop/");
        stringBuilder.append(jagexConfig.getShopName());
        PaymentComms.fetchCategoriesComms(stringBuilder.toString(), mobileAuthState, context.getResources().getDisplayMetrics().density, new MobilePayments$2(this, mobilePayments$MobilePaymentsListener), true);
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    public void purchaseItem(String string2, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        JagexProduct jagexProduct;
        Iterator iterator = this.categories.iterator();
        block0: while (true) {
            if (!iterator.hasNext()) {
                mobilePayments$MobilePaymentsListener.onFailure(R$string.SHOP_UNAVAILABLE);
                return;
            }
            Iterator iterator2 = ((JagexCategory)iterator.next()).getProducts().iterator();
            do {
                if (!iterator2.hasNext()) continue block0;
            } while (!string2.equals((jagexProduct = (JagexProduct)iterator2.next()).getProductId()));
            break;
        }
        string2 = jagexProduct.getSkuItem();
        if (string2 != null) {
            this.purchaseItem((SkuDetails)string2, linkDeque, mobileAuthState, jagexConfig, mobilePayments$MobilePaymentsListener);
            return;
        }
        mobilePayments$MobilePaymentsListener.onFailure(R$string.ITEM_UNAVAILABLE);
    }

    @ObfuscatedSignature(descriptor="(Lcom/android/billingclient/api/SkuDetails;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    public void purchaseItem(SkuDetails skuDetails, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        this.billingClientWrapper.initiatePurchaseFlow(skuDetails, new MobilePayments$1(this, linkDeque, mobileAuthState, jagexConfig, mobilePayments$MobilePaymentsListener));
    }

    public List getCategories() {
        return this.categories;
    }

    static /* synthetic */ List access$100(MobilePayments mobilePayments) {
        return mobilePayments.categories;
    }

    static /* synthetic */ Shop access$002(MobilePayments mobilePayments, Shop shop) {
        mobilePayments.shop = shop;
        return shop;
    }

    static /* synthetic */ Shop access$000(MobilePayments mobilePayments) {
        return mobilePayments.shop;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/MobilePayments;Lcom/android/billingclient/api/Purchase;Ljava/lang/String;Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/payments/MobilePayments$MobilePaymentsListener;)V")
    static /* synthetic */ void access$400(MobilePayments mobilePayments, Purchase purchase, String string2, LinkDeque linkDeque, MobileAuthState mobileAuthState, JagexConfig jagexConfig, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        mobilePayments.completePayment(purchase, string2, linkDeque, mobileAuthState, jagexConfig, mobilePayments$MobilePaymentsListener);
    }

    @Export(value="SpriteBuffer_getIndexedSpriteByName")
    @ObfuscatedName(value="access$200")
    static /* synthetic */ List SpriteBuffer_getIndexedSpriteByName(MobilePayments mobilePayments, List list, List list2) {
        return mobilePayments.assignSKUItemToCategory(list, list2);
    }

    static /* synthetic */ BillingClientWrapper access$300(MobilePayments mobilePayments) {
        return mobilePayments.billingClientWrapper;
    }

    static /* synthetic */ void access$500(MobilePayments mobilePayments, Purchase purchase, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        mobilePayments.acknowledgePurchase(purchase, mobilePayments$MobilePaymentsListener);
    }

    static /* synthetic */ void access$600(MobilePayments mobilePayments, Purchase purchase, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        mobilePayments.consumePurchase(purchase, mobilePayments$MobilePaymentsListener);
    }
}

