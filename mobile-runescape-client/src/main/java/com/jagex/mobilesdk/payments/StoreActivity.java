/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  com.android.billingclient.api.SkuDetails
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.payments.CategoryListFragment;
import com.jagex.mobilesdk.payments.StoreActivity$3;
import com.jagex.mobilesdk.payments.StoreActivity$4;
import com.jagex.mobilesdk.payments.StoreActivity$5;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;
import net.runelite.mapping.Implements;

@Implements(value="StoreActivity")
public class StoreActivity
extends AppCompatActivity
implements CategoryListInteractionListener {
    RelativeLayout collapseCategory;
    private View decorView;
    ImageView shopLogo;
    ConstraintLayout shopParentLayout;
    private View.OnClickListener collapseCategoryListener;
    RelativeLayout backButton;
    private View.OnClickListener backToGameListener;

    @Override
    public void onShopLoaded(String string2, String string3) {
        this.runOnUiThread(new StoreActivity$5(this, string2, string3));
    }

    @Override
    public void onCollapsePackages() {
        this.runOnUiThread(new StoreActivity$4(this));
    }

    @Override
    public void onShowHideMoreProducts(boolean bl, int n) {
        ((CategoryListFragment)this.getSupportFragmentManager().findFragmentById(R$id.fragment_package)).showHideMoreProducts(bl, n);
    }

    @Override
    public void purchaseProduct(SkuDetails skuDetails) {
        ((CategoryListFragment)this.getSupportFragmentManager().findFragmentById(R$id.fragment_package)).purchaseProduct(skuDetails);
    }

    @Override
    public void setCategoryExpandCollapseDetails(boolean bl, int n) {
        ((CategoryListFragment)this.getSupportFragmentManager().findFragmentById(R$id.fragment_package)).setExpandCollapseDetails(bl, n);
    }

    @Override
    public void onCategoryExpanded() {
        this.runOnUiThread(new StoreActivity$3(this));
        ((CategoryListFragment)this.getSupportFragmentManager().findFragmentById(R$id.fragment_package)).expandCollapseRemainingViews();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R$layout.activity_store);
        this.collapseCategory = (RelativeLayout)this.findViewById(R$id.btn_CollapseCategory);
        this.collapseCategory.setOnClickListener(this.collapseCategoryListener);
        this.backButton = (RelativeLayout)this.findViewById(R$id.btn_BackToGame);
        this.backButton.setOnClickListener(this.backToGameListener);
        this.shopLogo = (ImageView)this.findViewById(R$id.shopLogo);
        this.shopParentLayout = (ConstraintLayout)this.findViewById(R$id.coordinatorLayout);
        this.decorView = this.getWindow().getDecorView();
        this.collapseCategory.setVisibility(4);
    }

    public void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        if (bl) {
            this.decorView.setSystemUiVisibility(5894);
        }
    }
}

