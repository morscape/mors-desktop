/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.SharedPreferences$Editor
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import android.app.Activity;
import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.payments.BillingClientWrapper;
import com.jagex.mobilesdk.payments.PurchaseHistory$1;
import com.jagex.mobilesdk.payments.PurchaseHistory$2;
import com.jagex.mobilesdk.payments.PurchaseHistory$PurchaseHistoryListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="LinkDeque")
@ObfuscatedName(value="com/jagex/mobilesdk/payments/PurchaseHistory")
public class LinkDeque {
    private final Activity activity;
    private final ArrayList purchaseHistory = new ArrayList();
    private BillingClientWrapper billingClientWrapper;
    private final List unconsumedPurchases;
    private final ArrayList skuDetails = new ArrayList();
    private List currentStoreSubscriptions = new ArrayList();

    public LinkDeque(Activity activity) {
        this.activity = activity;
        this.unconsumedPurchases = new ArrayList();
    }

    private void fetchSkuDetails(PurchaseHistory$PurchaseHistoryListener purchaseHistory$PurchaseHistoryListener) {
        if (this.purchaseHistory.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>(this.purchaseHistory.size());
        Iterator iterator = this.purchaseHistory.iterator();
        while (iterator.hasNext()) {
            arrayList.add(((PurchaseHistoryRecord)iterator.next()).getSku());
        }
        this.billingClientWrapper.fetchAllProducts(arrayList, new PurchaseHistory$2(this, purchaseHistory$PurchaseHistoryListener));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private List fetchPendingTransactions() {
        this.unconsumedPurchases.clear();
        this.currentStoreSubscriptions.clear();
        Object object = this.billingClientWrapper.queryPendingTransactions();
        if (object == null) return this.unconsumedPurchases;
        object = object.iterator();
        while (object.hasNext()) {
            Purchase purchase = (Purchase)object.next();
            if (!this.last().contains(purchase.getPurchaseToken())) {
                this.unconsumedPurchases.add(purchase);
            }
            if (!purchase.isAutoRenewing()) continue;
            this.currentStoreSubscriptions.add(purchase.getPurchaseToken());
        }
        return this.unconsumedPurchases;
    }

    @Export(value="last")
    @ObfuscatedName(value="getKnownSubscriptionList")
    public List last() {
        Object object = this.activity.getApplicationContext().getSharedPreferences("KNOWN_NAME", 0);
        ArrayList arrayList = new ArrayList();
        if ((object = object.getStringSet("KNOWN_LIST", null)) != null) {
            arrayList.addAll(object);
        }
        return arrayList;
    }

    public boolean eligibleForTrialPurchase() {
        if (this.skuDetails.isEmpty()) {
            return false;
        }
        Iterator iterator = this.skuDetails.iterator();
        while (iterator.hasNext()) {
            if (((SkuDetails)iterator.next()).getFreeTrialPeriod().isEmpty()) continue;
            return false;
        }
        return true;
    }

    public boolean eligibleForIntroductoryPrice() {
        if (this.skuDetails.isEmpty()) {
            return false;
        }
        Iterator iterator = this.skuDetails.iterator();
        while (iterator.hasNext()) {
            if (((SkuDetails)iterator.next()).getIntroductoryPrice().isEmpty()) continue;
            return false;
        }
        return true;
    }

    public boolean ready() {
        if (this.billingClientWrapper == null) {
            return false;
        }
        return this.billingClientWrapper.isBillingClientReady();
    }

    public boolean isPendingTransactionsAvailable() {
        return this.fetchPendingTransactions().size() != 0;
    }

    private void saveKnownSubscriptionList(List list) {
        SharedPreferences.Editor editor = this.activity.getApplicationContext().getSharedPreferences("KNOWN_NAME", 0).edit();
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        editor.putStringSet("KNOWN_LIST", hashSet);
        editor.apply();
        editor.commit();
    }

    public void fetchPurchaseHistory(PurchaseHistory$PurchaseHistoryListener purchaseHistory$PurchaseHistoryListener) {
        this.purchaseHistory.clear();
        this.skuDetails.clear();
        this.billingClientWrapper.queryPurchaseHistory("subs", new PurchaseHistory$1(this, purchaseHistory$PurchaseHistoryListener));
    }

    @Export(value="processFriendUpdates")
    @ObfuscatedName(value="tidyKnownSubscriptionList")
    public void processFriendUpdates() {
        List list = this.last();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : this.currentStoreSubscriptions) {
            if (!list.contains(string2)) continue;
            arrayList.add(string2);
        }
        this.saveKnownSubscriptionList(arrayList);
    }

    public List getUnconsumedPurchases() {
        return this.unconsumedPurchases;
    }

    public void init(BillingClientWrapper billingClientWrapper) {
        this.billingClientWrapper = billingClientWrapper;
    }

    public void addToKnownSubscriptions(String string2) {
        List list = this.last();
        if (!list.contains(string2)) {
            list.add(string2);
            this.saveKnownSubscriptionList(list);
        }
    }

    public List getSkuDetails() {
        return this.skuDetails;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/PurchaseHistory;)Ljava/util/ArrayList;")
    static /* synthetic */ ArrayList access$300(LinkDeque linkDeque) {
        return linkDeque.skuDetails;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/PurchaseHistory;)Ljava/util/ArrayList;")
    static /* synthetic */ ArrayList access$000(LinkDeque linkDeque) {
        return linkDeque.purchaseHistory;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/PurchaseHistory;)Lcom/jagex/mobilesdk/payments/BillingClientWrapper;")
    static /* synthetic */ BillingClientWrapper access$200(LinkDeque linkDeque) {
        return linkDeque.billingClientWrapper;
    }

    @ObfuscatedSignature(descriptor="(Lcom/jagex/mobilesdk/payments/PurchaseHistory;Lcom/jagex/mobilesdk/payments/PurchaseHistory$PurchaseHistoryListener;)V")
    static /* synthetic */ void access$100(LinkDeque linkDeque, PurchaseHistory$PurchaseHistoryListener purchaseHistory$PurchaseHistoryListener) {
        linkDeque.fetchSkuDetails(purchaseHistory$PurchaseHistoryListener);
    }
}

