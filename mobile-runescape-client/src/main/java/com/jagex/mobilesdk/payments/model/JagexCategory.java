/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="JagexCategory")
public class JagexCategory {
    private String imageCollapsed;
    private String imageExpanded;
    private String shortDescription;
    private String longDescription;
    private String name;
    private List products;
    private int categoryID;

    public List getProducts() {
        return this.products;
    }

    public String getLongDescription() {
        return this.longDescription;
    }

    public String getName() {
        return this.name;
    }

    public int getCategoryID() {
        return this.categoryID;
    }

    public String getImageExpanded() {
        return this.imageExpanded;
    }

    public void setCategoryID(int n) {
        this.categoryID = n;
    }

    public void setProducts(List list) {
        this.products = list;
    }

    public String getImageCollapsed() {
        return this.imageCollapsed;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

    public void setImageCollapsed(String string2) {
        this.imageCollapsed = string2;
    }

    public void setImageExpanded(String string2) {
        this.imageExpanded = string2;
    }

    public void setLongDescription(String string2) {
        this.longDescription = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setShortDescription(String string2) {
        this.shortDescription = string2;
    }
}

