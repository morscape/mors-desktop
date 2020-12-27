/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.constraintlayout.widget.ConstraintSet
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder$1;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder$2;
import com.jagex.mobilesdk.payments.CategoryListRecyclerViewAdapter$ViewHolder$3;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import net.runelite.mapping.Implements;

@Implements(value="CategoryListRecyclerViewAdapter$ViewHolder")
public class CategoryListRecyclerViewAdapter$ViewHolder
extends RecyclerView.ViewHolder {
    final /* synthetic */ CategoryListRecyclerViewAdapter this$0;
    JagexCategory jagexCategory;
    Boolean isExpanded;
    LinearLayout collapsedContainer;
    Boolean hasShownFirstFiveProducts;
    RelativeLayout includeMoreItems;
    TextView categoryDescription;
    public final View view;
    TextView categoryTitle;
    Boolean hasShownMoreProducts;
    ImageView categoryImage;
    TextView txt_legal;
    TextView txt_privacyPolicy;
    RecyclerView categoryItemsRecycler;
    private View.OnClickListener includeMoreItemsListener;
    TextView txt_termsConditions;
    private View.OnClickListener privacyPolicyListener;
    ConstraintSet existingConstraints;
    TextView moreItems;
    private View.OnClickListener termsAndConditionsListener;
    CategoryItemsRecyclerViewAdapter itemsAdapter;
    TextView plusMark;
    TextView categoryTitleCollapse;
    EditText categoryDescriptionCollapse;
    RelativeLayout categoryProductsContainer;

    CategoryListRecyclerViewAdapter$ViewHolder(CategoryListRecyclerViewAdapter categoryListRecyclerViewAdapter, View view) {
        this.this$0 = categoryListRecyclerViewAdapter;
        super(view);
        this.isExpanded = false;
        this.hasShownMoreProducts = false;
        this.hasShownFirstFiveProducts = false;
        this.includeMoreItemsListener = new CategoryListRecyclerViewAdapter$ViewHolder$1(this);
        this.privacyPolicyListener = new CategoryListRecyclerViewAdapter$ViewHolder$2(this);
        this.termsAndConditionsListener = new CategoryListRecyclerViewAdapter$ViewHolder$3(this);
        this.view = view;
        this.categoryImage = (ImageView)view.findViewById(R$id.img_PackageImage);
        this.categoryDescription = (TextView)view.findViewById(R$id.txt_PackageDescription);
        this.categoryTitle = (TextView)view.findViewById(R$id.txt_PackageTitle);
        this.collapsedContainer = (LinearLayout)view.findViewById(R$id.collapsed_detail_container);
        this.categoryTitleCollapse = (TextView)view.findViewById(R$id.txt_PackageTitleCollapse);
        this.categoryDescriptionCollapse = (EditText)view.findViewById(R$id.txt_PackageDescriptionCollapse);
        this.categoryItemsRecycler = (RecyclerView)view.findViewById(R$id.categoryItemsList);
        this.categoryProductsContainer = (RelativeLayout)view.findViewById(R$id.productsPackageContainer);
        this.moreItems = (TextView)view.findViewById(R$id.txt_MoreItems);
        this.plusMark = (TextView)view.findViewById(R$id.txt_PlusMark);
        this.includeMoreItems = (RelativeLayout)view.findViewById(R$id.includeMoreItems);
        this.includeMoreItems.setOnClickListener(this.includeMoreItemsListener);
        this.txt_legal = (TextView)view.findViewById(R$id.txt_legal);
        this.txt_privacyPolicy = (TextView)view.findViewById(R$id.txt_privacyPolicy);
        this.txt_privacyPolicy.setOnClickListener(this.privacyPolicyListener);
        this.txt_termsConditions = (TextView)view.findViewById(R$id.txt_termsConditions);
        this.txt_termsConditions.setOnClickListener(this.termsAndConditionsListener);
        this.existingConstraints = new ConstraintSet();
    }
}

