/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.MobilePayments;
import com.jagex.mobilesdk.payments.MobilePayments$2$1;
import com.jagex.mobilesdk.payments.MobilePayments$MobilePaymentsListener;
import com.jagex.mobilesdk.payments.comms.FetchCategoriesComms$FetchCategoriesCallback;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import com.jagex.mobilesdk.payments.model.Shop;
import java.util.ArrayList;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="MobilePayments$2")
class MobilePayments$2
implements FetchCategoriesComms$FetchCategoriesCallback {
    final /* synthetic */ MobilePayments this$0;
    final /* synthetic */ MobilePayments$MobilePaymentsListener val$listener;

    MobilePayments$2(MobilePayments mobilePayments, MobilePayments$MobilePaymentsListener mobilePayments$MobilePaymentsListener) {
        this.this$0 = mobilePayments;
        this.val$listener = mobilePayments$MobilePaymentsListener;
    }

    @Override
    public void onFetchPackagesResult(CommsResult object, Exception object2) {
        if (object == null || object2 != null) {
            this.val$listener.onFailure(((CommsResult)object).responseCode);
            return;
        }
        MobilePayments.access$002(this.this$0, (Shop)((CommsResult)object).getResultValue());
        object = new ArrayList();
        object2 = MobilePayments.access$000(this.this$0).getCategories().iterator();
        block0: while (true) {
            if (!object2.hasNext()) {
                MobilePayments.access$300(this.this$0).fetchAllProducts((List)object, new MobilePayments$2$1(this));
                return;
            }
            Object object3 = (JagexCategory)object2.next();
            ((JagexCategory)object3).setCategoryID((int)Math.pow(2.0, ((JagexCategory)object3).getCategoryID() - 1));
            object3 = ((JagexCategory)object3).getProducts().iterator();
            while (true) {
                if (!object3.hasNext()) continue block0;
                object.add(((JagexProduct)object3.next()).getProductId());
            }
            break;
        }
    }
}

