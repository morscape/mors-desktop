/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.model;

import java.util.List;
import net.runelite.mapping.Implements;

@Implements(value="Shop")
public class Shop {
    private String imageBackground;
    private String imageLogo;
    private List categories;

    public String getImageBackground() {
        return this.imageBackground;
    }

    public String getImageLogo() {
        return this.imageLogo;
    }

    public List getCategories() {
        return this.categories;
    }

    public void setCategories(List list) {
        this.categories = list;
    }

    public void setImageBackground(String string2) {
        this.imageBackground = string2;
    }

    public void setImageLogo(String string2) {
        this.imageLogo = string2;
    }
}

