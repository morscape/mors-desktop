/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ItemAnimator
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  androidx.recyclerview.widget.SimpleItemAnimator
 *  com.android.billingclient.api.SkuDetails
 *  com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$bool;
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.R$integer;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import com.jagex.mobilesdk.payments.BillingClientMessages;
import com.jagex.mobilesdk.payments.CategoryListFragment$1;
import com.jagex.mobilesdk.payments.CategoryListFragment$2;
import com.jagex.mobilesdk.payments.CategoryListFragment$3;
import com.jagex.mobilesdk.payments.CategoryListFragment$4;
import com.jagex.mobilesdk.payments.CategoryListFragment$5;
import com.jagex.mobilesdk.payments.CategoryListFragment$6;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.CategoryListViewController$CategoryListViewListener;
import com.jagex.mobilesdk.payments.MobilePaymentService;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;
import com.jagex.mobilesdk.payments.utils.JagexSnapHelper;
import com.jagex.mobilesdk.payments.utils.RecyclerViewItemDecorator;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListFragment")
public class CategoryListFragment
extends Fragment
implements CategoryListViewController$CategoryListViewListener {
    private int categoryID;
    private int initialCategory;
    private boolean isCollapse;
    private CategoryListInteractionListener listener;
    private JagexSnapHelper snapHelper;
    private CategoryListViewController viewController;
    private CategoryListRecyclerViewAdapter adapter;
    private int expandedItemPosition;
    RecyclerView recyclerView;
    private JagexConfig configuration;
    ConstraintLayout packageLayout;

    private void loadCategoriesProducts(int n, boolean bl) {
        RecyclerView.ItemAnimator itemAnimator = this.recyclerView.getItemAnimator();
        this.recyclerView.setItemAnimator(null);
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new CategoryListFragment$6(this, bl, n, itemAnimator), (long)this.getContext().getResources().getInteger(R$integer.package_list_load_delay));
    }

    private CategoryListViewController getViewController() {
        if (this.viewController == null) {
            this.viewController = new CategoryListViewController(this, (Activity)this.getActivity(), this.configuration);
        }
        return this.viewController;
    }

    @Override
    public void billingInitialiseAttempt(int n) {
        if (n == 0) {
            this.getViewController().checkNetwork();
            return;
        }
        this.onDisplayMessage(BillingClientMessages.getErrorMessage(n));
    }

    private void runOnParentActivity(Runnable runnable) {
        FragmentActivity fragmentActivity = this.getActivity();
        if (fragmentActivity != null) {
            fragmentActivity.runOnUiThread(runnable);
        }
    }

    @Override
    public void onInternetStateChanged(boolean bl) {
    }

    @Override
    public void returnToGame() {
        if (this.listener != null) {
            this.listener.finish();
        }
    }

    public void onDetach() {
        super.onDetach();
        this.listener = null;
        if (this.viewController != null) {
            this.viewController.onDetach();
            this.viewController = null;
        }
    }

    @Override
    public void onDisplayMessage(int n) {
        this.runOnParentActivity(new CategoryListFragment$2(this, n));
    }

    @Override
    public void onSuccessfulConsumption() {
    }

    public void purchaseProduct(SkuDetails skuDetails) {
        this.getViewController().buyProduct(skuDetails);
    }

    public void showHideMoreProducts(boolean bl, int n) {
        this.adapter.showMoreProducts(bl, n);
        this.adapter.notifyItemChanged(n);
    }

    @Override
    public void onPendingPurchasesAvailable() {
        this.runOnParentActivity(new CategoryListFragment$3(this));
    }

    public void setExpandCollapseDetails(boolean bl, int n) {
        this.isCollapse = bl;
        this.expandedItemPosition = n;
        this.recyclerView.smoothScrollBy(5, 0);
        this.startExpandCollapseSelectedView();
        this.expandCollapseRemainingViews();
    }

    public void collapseExpandedCategoriesView() {
        this.adapter.setExpandedPosition(-1);
        this.adapter.setExpandCollapseMode(true);
        this.isCollapse = true;
        this.startExpandCollapseSelectedView();
        this.expandCollapseRemainingViews();
    }

    private void startExpandCollapseSelectedView() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams)this.recyclerView.getLayoutParams();
        if (!this.isCollapse) {
            layoutParams.width = -1;
            this.recyclerView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            this.snapHelper.attachToRecyclerView(this.recyclerView);
            layoutParams = (LinearLayoutManager)this.recyclerView.getLayoutManager();
            if (layoutParams.findLastCompletelyVisibleItemPosition() == this.expandedItemPosition) {
                this.adapter.setPivotX(1.0f);
                this.adapter.setPivotY(1.0f);
            } else if (layoutParams.findFirstVisibleItemPosition() == this.expandedItemPosition) {
                this.adapter.setPivotX(0.0f);
                this.adapter.setPivotY(0.0f);
            } else {
                this.adapter.setPivotX(0.5f);
                this.adapter.setPivotY(0.5f);
            }
        } else {
            if (this.listener != null) {
                this.listener.onCollapsePackages();
            }
            this.snapHelper.attachToRecyclerView(null);
            layoutParams.width = -2;
            this.recyclerView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
        this.recyclerView.invalidate();
        this.snapHelper.setSnapPosition(this.expandedItemPosition);
        this.recyclerView.getAdapter().notifyItemChanged(this.expandedItemPosition);
        if (this.recyclerView.getAdapter().getItemCount() < 3) {
            if (this.getResources().getBoolean(R$bool.isTablet)) {
                new Handler(Looper.getMainLooper()).postDelayed((Runnable)new CategoryListFragment$4(this), 5L);
                return;
            }
            this.recyclerView.scrollToPosition(this.expandedItemPosition);
        }
    }

    public void expandCollapseRemainingViews() {
        new Handler(Looper.getMainLooper()).post((Runnable)new CategoryListFragment$5(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(R$layout.fragment_package_list, viewGroup, false);
        this.recyclerView = (RecyclerView)layoutInflater.findViewById(R$id.categoryList);
        this.packageLayout = (ConstraintLayout)layoutInflater.findViewById(R$id.package_layout);
        this.adapter = new CategoryListRecyclerViewAdapter(this.getContext(), this.listener, this.viewController);
        this.adapter.setHasStableIds(true);
        viewGroup = new LinearLayoutManager(this.getContext(), 0, false);
        this.recyclerView.setLayoutManager((RecyclerView.LayoutManager)viewGroup);
        this.recyclerView.addItemDecoration((RecyclerView.ItemDecoration)new RecyclerViewItemDecorator(this.getContext()));
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setDrawingCacheEnabled(true);
        this.recyclerView.getLayoutManager().setItemPrefetchEnabled(true);
        this.recyclerView.setDrawingCacheQuality(0x100000);
        this.snapHelper = new JagexSnapHelper();
        ((SimpleItemAnimator)this.recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        this.recyclerView.setAdapter((RecyclerView.Adapter)this.adapter);
        this.recyclerView.setOverScrollMode(2);
        return layoutInflater;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getActivity().getIntent().getExtras();
        JagexConfigParcel jagexConfigParcel = (JagexConfigParcel)bundle.getParcelable(MobilePaymentService.EXTRA_CONFIG);
        this.categoryID = bundle.getInt(MobilePaymentService.PACKAGE_CONFIG);
        this.initialCategory = bundle.getInt(MobilePaymentService.SELECTED_CONFIG);
        this.configuration = jagexConfigParcel.getConfig();
        this.getViewController();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof CategoryListInteractionListener) {
            this.listener = (CategoryListInteractionListener)context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnListFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onStart() {
        super.onStart();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onShopLoaded(String string2, String string3) {
        if (this.listener != null) {
            this.listener.onShopLoaded(string2, string3);
        }
    }

    @Override
    public void onCategoriesLoaded(List list) {
        this.runOnParentActivity(new CategoryListFragment$1(this, list));
    }

    static /* synthetic */ CategoryListRecyclerViewAdapter access$000(CategoryListFragment categoryListFragment) {
        return categoryListFragment.adapter;
    }

    static /* synthetic */ JagexSnapHelper access$800(CategoryListFragment categoryListFragment) {
        return categoryListFragment.snapHelper;
    }

    static /* synthetic */ CategoryListViewController access$400(CategoryListFragment categoryListFragment) {
        return categoryListFragment.getViewController();
    }

    static /* synthetic */ int access$500(CategoryListFragment categoryListFragment) {
        return categoryListFragment.expandedItemPosition;
    }

    static /* synthetic */ int access$100(CategoryListFragment categoryListFragment) {
        return categoryListFragment.categoryID;
    }

    static /* synthetic */ int access$200(CategoryListFragment categoryListFragment) {
        return categoryListFragment.initialCategory;
    }

    static /* synthetic */ boolean access$600(CategoryListFragment categoryListFragment) {
        return categoryListFragment.isCollapse;
    }

    static /* synthetic */ void access$700(CategoryListFragment categoryListFragment, int n, boolean bl) {
        categoryListFragment.loadCategoriesProducts(n, bl);
    }

    static /* synthetic */ CategoryListViewController access$300(CategoryListFragment categoryListFragment) {
        return categoryListFragment.viewController;
    }
}

