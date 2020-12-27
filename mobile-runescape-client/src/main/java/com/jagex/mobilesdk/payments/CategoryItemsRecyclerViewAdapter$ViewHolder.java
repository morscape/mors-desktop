/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import net.runelite.mapping.Implements;

@Implements(value="CategoryItemsRecyclerViewAdapter$ViewHolder")
public class CategoryItemsRecyclerViewAdapter$ViewHolder
extends RecyclerView.ViewHolder {
    final /* synthetic */ CategoryItemsRecyclerViewAdapter this$0;
    TextView savings;
    TextView originalPrice;
    public final View view;
    TextView trialOffer;
    int shopCategory;
    TextView title;
    TextView subTitle;
    JagexProduct jagexProduct;
    TextView itemPrice;
    ImageView recommended;
    RelativeLayout purchaseButton;
    TextView purchaseButtonText;

    CategoryItemsRecyclerViewAdapter$ViewHolder(CategoryItemsRecyclerViewAdapter categoryItemsRecyclerViewAdapter, View view) {
        this.this$0 = categoryItemsRecyclerViewAdapter;
        super(view);
        this.view = view;
        this.title = (TextView)view.findViewById(R$id.txt_PackageItemTitle);
        this.subTitle = (TextView)view.findViewById(R$id.txt_PackageItemSubTitle);
        this.itemPrice = (TextView)view.findViewById(R$id.txt_ItemPrice);
        this.recommended = (ImageView)view.findViewById(R$id.img_Recommended);
        this.purchaseButton = (RelativeLayout)view.findViewById(R$id.btn_Purchase);
        this.purchaseButtonText = (TextView)view.findViewById(R$id.btn_PurchaseText);
        this.savings = (TextView)view.findViewById(R$id.txt_savings);
        this.originalPrice = (TextView)view.findViewById(R$id.txt_ItemPriceOriginal);
        this.trialOffer = (TextView)view.findViewById(R$id.txt_ItemTrial);
    }

    public void resetHolderTextViews() {
        this.savings.setText((CharSequence)"");
        this.originalPrice.setText((CharSequence)"");
        this.trialOffer.setText((CharSequence)"");
        this.title.setText((CharSequence)"");
        this.subTitle.setText((CharSequence)"");
        this.itemPrice.setText((CharSequence)"");
    }
}

