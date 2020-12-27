/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.jagex.mobilesdk.R$color;
import com.jagex.mobilesdk.R$dimen;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter$1;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter$2;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter$3;
import com.jagex.mobilesdk.payments.CategoryItemsRecyclerViewAdapter$ViewHolder;
import com.jagex.mobilesdk.payments.CategoryListViewController;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="CategoryItemsRecyclerViewAdapter")
public class CategoryItemsRecyclerViewAdapter
extends RecyclerView.Adapter {
    private final CategoryListInteractionListener listener;
    private final List products = new ArrayList();
    private final Context context;
    private final float PRICE_DIVISOR;
    private final float FONT_SCALE_THRESHOLD;
    private final int shopCategory;
    private final float CATEGORY_ITEMS_FONT_SCALE;
    private float maximumPricePerUnit;
    private final CategoryListViewController viewController;
    private final float fontScale;

    CategoryItemsRecyclerViewAdapter(JagexCategory configuration, CategoryListInteractionListener categoryListInteractionListener, CategoryListViewController categoryListViewController, Context context) {
        this.PRICE_DIVISOR = 1000000.0f;
        this.FONT_SCALE_THRESHOLD = 1.05f;
        this.CATEGORY_ITEMS_FONT_SCALE = 1.0f;
        this.shopCategory = configuration.getCategoryID();
        for (JagexProduct jagexProduct : configuration.getProducts()) {
            if (jagexProduct.getSkuItem() == null) continue;
            this.products.add(jagexProduct);
        }
        this.maximumPricePerUnit = 0.0f;
        for (JagexProduct jagexProduct : this.products) {
            float f;
            String string2 = jagexProduct.getTitle();
            if (string2 == null || string2.isEmpty() || !TextUtils.isDigitsOnly((CharSequence)string2) || 0.0f == (f = Float.parseFloat(string2)) || !((f = (float)jagexProduct.getSkuItem().getPriceAmountMicros() / 1000000.0f / f) > this.maximumPricePerUnit)) continue;
            this.maximumPricePerUnit = f;
        }
        this.listener = categoryListInteractionListener;
        this.viewController = categoryListViewController;
        this.context = context;
        configuration = this.context.getResources().getConfiguration();
        if (configuration.fontScale > 1.05f) {
            this.fontScale = 1.0f / configuration.fontScale;
            return;
        }
        this.fontScale = configuration.fontScale;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder object, int n) {
        CharSequence charSequence;
        CharSequence charSequence2;
        float f;
        CategoryItemsRecyclerViewAdapter$ViewHolder categoryItemsRecyclerViewAdapter$ViewHolder = (CategoryItemsRecyclerViewAdapter$ViewHolder)((Object)object);
        Resources resources = this.context.getResources();
        categoryItemsRecyclerViewAdapter$ViewHolder.resetHolderTextViews();
        categoryItemsRecyclerViewAdapter$ViewHolder.shopCategory = this.shopCategory;
        categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct = (JagexProduct)this.products.get(n);
        object = categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getTitle();
        if (object != null && ((String)object).length() > 4) {
            categoryItemsRecyclerViewAdapter$ViewHolder.title.setTextSize(0, (float)((int)this.context.getResources().getDimension(R$dimen.package_item_keys_title_size)));
            categoryItemsRecyclerViewAdapter$ViewHolder.subTitle.setTextSize(0, (float)((int)this.context.getResources().getDimension(R$dimen.package_item_keys_sub_title_size)));
        } else {
            categoryItemsRecyclerViewAdapter$ViewHolder.title.setTextSize(0, (float)((int)this.context.getResources().getDimension(R$dimen.package_item_title_size)));
            categoryItemsRecyclerViewAdapter$ViewHolder.subTitle.setTextSize(0, (float)((int)this.context.getResources().getDimension(R$dimen.package_item_sub_title_size)));
        }
        categoryItemsRecyclerViewAdapter$ViewHolder.title.setText((CharSequence)categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getTitle().toUpperCase());
        categoryItemsRecyclerViewAdapter$ViewHolder.subTitle.setText((CharSequence)categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSubtitle().toUpperCase());
        categoryItemsRecyclerViewAdapter$ViewHolder.itemPrice.setText((CharSequence)categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getPrice());
        categoryItemsRecyclerViewAdapter$ViewHolder.title.setTextScaleX(this.fontScale);
        categoryItemsRecyclerViewAdapter$ViewHolder.subTitle.setTextScaleX(this.fontScale);
        categoryItemsRecyclerViewAdapter$ViewHolder.itemPrice.setTextScaleX(this.fontScale);
        if (categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.isRecommended()) {
            categoryItemsRecyclerViewAdapter$ViewHolder.recommended.setVisibility(0);
        } else {
            categoryItemsRecyclerViewAdapter$ViewHolder.recommended.setVisibility(8);
        }
        categoryItemsRecyclerViewAdapter$ViewHolder.view.setOnClickListener((View.OnClickListener)new CategoryItemsRecyclerViewAdapter$1(this, categoryItemsRecyclerViewAdapter$ViewHolder));
        float f2 = (float)categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getPriceAmountMicros() / 1000000.0f;
        float f3 = f = 0.0f;
        if (!((String)object).isEmpty()) {
            f3 = f;
            if (TextUtils.isDigitsOnly((CharSequence)object)) {
                f3 = Float.parseFloat((String)object);
            }
        }
        if (categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getType().equals("subs")) {
            String string2;
            if (!categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getFreeTrialPeriod().isEmpty() && this.viewController.eligibleForTrialPurchase()) {
                categoryItemsRecyclerViewAdapter$ViewHolder.purchaseButtonText.setText(R$string.SUBS_TRIAL_BUTTON_TEXT);
                string2 = categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getFreeTrialPeriod();
                charSequence2 = "";
                object = charSequence2;
                if (string2.length() >= 3) {
                    charSequence = string2.substring(1, string2.length() - 1);
                    n = Integer.parseInt((String)charSequence);
                    object = charSequence2;
                    if (string2.startsWith("P")) {
                        if (string2.endsWith("D")) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(" + ");
                            ((StringBuilder)object).append((String)charSequence);
                            ((StringBuilder)object).append(" ");
                            n = n > 1 ? R$string.SHOP_DAYS_TRIAL : R$string.SHOP_DAY_TRIAL;
                            ((StringBuilder)object).append(resources.getString(n));
                            ((StringBuilder)object).append(" ");
                            object = ((StringBuilder)object).toString();
                        } else if (string2.endsWith("W")) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append(" + ");
                            ((StringBuilder)object).append((String)charSequence);
                            ((StringBuilder)object).append(" ");
                            n = n > 1 ? R$string.SHOP_WEEKS_TRIAL : R$string.SHOP_WEEK_TRIAL;
                            ((StringBuilder)object).append(resources.getString(n));
                            ((StringBuilder)object).append(" ");
                            object = ((StringBuilder)object).toString();
                        } else {
                            object = charSequence2;
                            if (string2.endsWith("M")) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(" + ");
                                ((StringBuilder)object).append((String)charSequence);
                                ((StringBuilder)object).append(" ");
                                n = n > 1 ? R$string.SHOP_MONTHS_TRIAL : R$string.SHOP_MONTH_TRIAL;
                                ((StringBuilder)object).append(resources.getString(n));
                                ((StringBuilder)object).append(" ");
                                object = ((StringBuilder)object).toString();
                            }
                        }
                    }
                }
                categoryItemsRecyclerViewAdapter$ViewHolder.trialOffer.setText((CharSequence)object);
                categoryItemsRecyclerViewAdapter$ViewHolder.trialOffer.setVisibility(0);
                categoryItemsRecyclerViewAdapter$ViewHolder.trialOffer.setTextScaleX(this.fontScale);
            }
            object = new DecimalFormat("0.00");
            categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setVisibility(4);
            if (f3 > 1.0f) {
                object = ((NumberFormat)object).format(f2 / f3);
                charSequence2 = this.getCurrencySymbol(categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getPriceCurrencyCode());
                charSequence = resources.getString(R$string.PER_MONTH);
                string2 = categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence2);
                stringBuilder.append((String)object);
                stringBuilder.append(" ");
                stringBuilder.append((String)charSequence);
                string2.setText((CharSequence)stringBuilder.toString());
                categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setVisibility(0);
                categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setTextScaleX(this.fontScale);
            }
        }
        categoryItemsRecyclerViewAdapter$ViewHolder.savings.setVisibility(4);
        categoryItemsRecyclerViewAdapter$ViewHolder.savings.setText((CharSequence)"");
        if (categoryItemsRecyclerViewAdapter$ViewHolder.shopCategory != 1) {
            categoryItemsRecyclerViewAdapter$ViewHolder.savings.setVisibility(0);
            f3 = this.maximumPricePerUnit * f3;
            if (f3 > f2 && (double)f3 > 0.0) {
                f3 = (f3 - f2) / f3;
                object = NumberFormat.getPercentInstance();
                ((NumberFormat)object).setMinimumFractionDigits(0);
                charSequence2 = resources.getString(R$string.SAVE);
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append(" ");
                ((StringBuilder)charSequence).append(((NumberFormat)object).format(f3));
                object = ((StringBuilder)charSequence).toString();
                categoryItemsRecyclerViewAdapter$ViewHolder.savings.setText((CharSequence)object);
                categoryItemsRecyclerViewAdapter$ViewHolder.savings.setVisibility(0);
                categoryItemsRecyclerViewAdapter$ViewHolder.savings.setTextScaleX(this.fontScale);
            }
        }
        if (!categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getIntroductoryPrice().isEmpty() && this.viewController.eligibleForIntroductoryPrice()) {
            object = resources.getString(R$string.SHOP_NORMALLY);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)object);
            ((StringBuilder)charSequence2).append(" ");
            ((StringBuilder)charSequence2).append(categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getPrice());
            object = ((StringBuilder)charSequence2).toString();
            categoryItemsRecyclerViewAdapter$ViewHolder.itemPrice.setText((CharSequence)categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getIntroductoryPrice());
            categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setText((CharSequence)object);
            categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setTextColor(resources.getColor(R$color.lemon_yellow));
            categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setVisibility(0);
            categoryItemsRecyclerViewAdapter$ViewHolder.originalPrice.setTextScaleX(this.fontScale);
        }
        if (!categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.isAvailable()) {
            categoryItemsRecyclerViewAdapter$ViewHolder.purchaseButton.setBackgroundColor(-12303292);
            object = new AlertDialog.Builder(this.context);
            object.setTitle(R$string.PRODUCT_UNAVAILABLE).setMessage(R$string.INAPP_UNAVAILABLE_MESSAGE).setPositiveButton(R$string.field2234, (DialogInterface.OnClickListener)new CategoryItemsRecyclerViewAdapter$2(this));
            if (categoryItemsRecyclerViewAdapter$ViewHolder.jagexProduct.getSkuItem().getType().equals("subs")) {
                object.setMessage(R$string.SUBS_UNAVAILABLE_MESSAGE);
            }
            object = object.create();
            categoryItemsRecyclerViewAdapter$ViewHolder.view.setOnClickListener((View.OnClickListener)new CategoryItemsRecyclerViewAdapter$3(this, (AlertDialog)object));
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return new CategoryItemsRecyclerViewAdapter$ViewHolder(this, LayoutInflater.from((Context)viewGroup.getContext()).inflate(R$layout.package_item, viewGroup, false));
    }

    public int getItemCount() {
        return this.products.size();
    }

    private String getCurrencySymbol(String string2) {
        try {
            String string3 = Currency.getInstance(string2).getSymbol();
            return string3;
        }
        catch (Exception exception) {
            return string2;
        }
    }

    static /* synthetic */ CategoryListInteractionListener access$000(CategoryItemsRecyclerViewAdapter categoryItemsRecyclerViewAdapter) {
        return categoryItemsRecyclerViewAdapter.listener;
    }
}

