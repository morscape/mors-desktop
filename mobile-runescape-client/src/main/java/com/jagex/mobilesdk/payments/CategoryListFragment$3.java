/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnClickListener
 *  androidx.appcompat.app.AlertDialog$Builder
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.CategoryListFragment$3$1;
import com.jagex.mobilesdk.payments.CategoryListFragment$3$2;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment$3")
class CategoryListFragment$3
implements Runnable {
    final /* synthetic */ CategoryListFragment this$0;

    CategoryListFragment$3(CategoryListFragment categoryListFragment) {
        this.this$0 = categoryListFragment;
    }

    @Override
    public void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.this$0.getContext());
        builder.setTitle(R$string.PENDING_TRANSACTIONS);
        builder.setMessage(R$string.PENDING_TRANSACTION_MESSAGE).setCancelable(false).setPositiveButton(R$string.field2235, (DialogInterface.OnClickListener)new CategoryListFragment$3$2(this)).setNegativeButton(R$string.field2233, (DialogInterface.OnClickListener)new CategoryListFragment$3$1(this));
        builder.create().show();
    }
}

