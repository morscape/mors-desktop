/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="av")
public class class261
extends class19 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lad;")
    final class257 field4464;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lbl;")
    final class265 field4465;

    @ObfuscatedSignature(descriptor="(Lbl;)V")
    public class261(class265 class2652) {
        this.field4465 = class2652;
        this.field4464 = new class257(this.field4465);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)Lcw;", garbageValue="53")
    public class47 vmethod7589() {
        class257 class2572 = this.field4464;
        return class2572;
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lbe;Lbp;IIIIIIIS)V")
    void vmethod7592(Scene object, TilePaint tilePaint, int n, int n2, int n3, int n4, int n5, int n6, int n7, short s) {
        int n8;
        int n9;
        int n10;
        block27: {
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            block28: {
                block23: {
                    block26: {
                        block25: {
                            block24: {
                                n18 = (n6 << 7) - Scene.field364;
                                n10 = (n7 << 7) - Scene.field373;
                                n17 = n18 + 128;
                                n16 = n10 + 128;
                                n15 = ((Scene)object).tileHeights[n][n6][n7] - Scene.field361;
                                Object object2 = ((Scene)object).tileHeights[n];
                                s = (short)(n6 + 1);
                                n14 = object2[s][n7] - Scene.field361;
                                object2 = ((Scene)object).tileHeights[n][s];
                                s = (short)(n7 + 1);
                                reference var16_18 = object2[s] - Scene.field361;
                                n = ((Scene)object).tileHeights[n][n6][s] - Scene.field361;
                                n13 = n18 * n5;
                                n12 = n10 * n4;
                                s = (short)(n13 + n12 >> 16);
                                n9 = n10 * n5;
                                n10 = n18 * n4;
                                n11 = n9 - n10 >> 16;
                                n18 = n3 * n15 - n11 * n2 >> 16;
                                if ((n15 = n15 * n2 + n3 * n11 >> 16) < 50) {
                                    return;
                                }
                                n11 = n17 * n5;
                                n12 = n12 + n11 >> 16;
                                int n19 = n17 * n4;
                                n9 = n9 - n19 >> 16;
                                n17 = n3 * n14 - n9 * n2 >> 16;
                                if ((n14 = n14 * n2 + n3 * n9 >> 16) < 50) {
                                    return;
                                }
                                n9 = n16 * n4;
                                n4 = n9 + n11 >> 16;
                                n11 = (n16 *= n5) - n19 >> 16;
                                n5 = n3 * var16_18 - n11 * n2 >> 16;
                                reference var16_19 = var16_18 * n2 + n3 * n11 >> 16;
                                if (var16_19 < 50) {
                                    return;
                                }
                                n13 = n9 + n13 >> 16;
                                n10 = n16 - n10 >> 16;
                                n16 = n * n3 - n10 * n2 >> 16;
                                n11 = n * n2 + n3 * n10 >> 16;
                                if (n11 < 50) {
                                    return;
                                }
                                n = this.field4465.field352 + s * this.field4465.field354 / n15;
                                n2 = this.field4465.field357 + this.field4465.field354 * n18 / n15;
                                n3 = this.field4465.field352 + this.field4465.field354 * n12 / n14;
                                n10 = this.field4465.field357 + this.field4465.field354 * n17 / n14;
                                n19 = this.field4465.field352 * -920001371;
                                n19 = n19 * -22322387 + this.field4465.field354 * n4 / var16_19;
                                n9 = this.field4465.field357 * -1054703363;
                                int n20 = this.field4465.field354 * n5 / var16_19 + n9 * -469394347;
                                n9 = this.field4465.field352 * -920001371;
                                n9 = n9 * -22322387 + this.field4465.field354 * n13 / n11;
                                n8 = this.field4465.field354 * n16 / n11;
                                n8 = this.field4465.field357 + n8;
                                this.field4465.field350 = 0;
                                if ((n10 - n8) * (n19 - n9) - (n20 - n8) * (n3 - n9) > 0) {
                                    this.field4465.field344 = false;
                                    if (n19 < 0 || n9 < 0 || n3 < 0 || n19 > this.field4465.field358 || n9 > this.field4465.field358 || n3 > this.field4465.field358) {
                                        this.field4465.field344 = true;
                                    }
                                    if (Scene.field385 && Scene.containsBounds(Scene.field395, Scene.field388, n20, n8, n10, n19, n9, n3)) {
                                        Scene.field381 = n6;
                                        Scene.field380 = n7;
                                    }
                                    object = tilePaint;
                                    if (((TilePaint)object).texture == -1) {
                                        if (((TilePaint)object).neColor != 12345678) {
                                            this.field4465.method7644(n20, n8, n10, n19, n9, n3, ((TilePaint)object).neColor, ((TilePaint)object).nwColor, ((TilePaint)object).seColor, -1185157870);
                                        }
                                    } else if (!Scene.Scene_isLowDetail) {
                                        if (((TilePaint)object).isFlat) {
                                            this.field4465.method7650(n20, n8, n10, n19, n9, n3, ((TilePaint)object).neColor, ((TilePaint)object).nwColor, ((TilePaint)object).seColor, s, n12, n13, n18, n17, n16, n15, n14, n11, ((TilePaint)object).texture, (byte)43);
                                        } else {
                                            this.field4465.method7650(n20, n8, n10, n19, n9, n3, ((TilePaint)object).neColor, ((TilePaint)object).nwColor, ((TilePaint)object).seColor, n4, n13, n12, n5, n16, n17, (int)var16_19, n11, n14, ((TilePaint)object).texture, (byte)32);
                                        }
                                    } else {
                                        object2 = this.field4465;
                                        n4 = Rasterizer3D.field339.getAverageTextureRGB(((TilePaint)object).texture);
                                        this.field4465.method7644(n20, n8, n10, n19, n9, n3, class82.method4599(n4, ((TilePaint)object).neColor, (byte)0), class82.method4599(n4, ((TilePaint)object).nwColor, (byte)0), class82.method4599(n4, ((TilePaint)object).seColor, (byte)0), -1905935365);
                                    }
                                }
                                if ((n8 - n10) * (n - n3) - (n2 - n10) * (n9 - n3) <= 0) break block23;
                                this.field4465.field344 = false;
                                if (n < 0 || n3 < 0 || n9 < 0) break block24;
                                if (n <= this.field4465.field358 && n3 <= this.field4465.field358 && n9 <= this.field4465.field358) break block25;
                            }
                            this.field4465.field344 = true;
                        }
                        if (Scene.field385 && Scene.containsBounds(Scene.field395, Scene.field388, n2, n10, n8, n, n3, n9)) {
                            Scene.field381 = n6;
                            Scene.field380 = n7;
                        }
                        if (tilePaint.texture != -1) break block26;
                        if (tilePaint.swColor == 12345678) break block23;
                        break block27;
                    }
                    if (!Scene.Scene_isLowDetail) break block28;
                    object = this.field4465;
                    n4 = Rasterizer3D.field339.getAverageTextureRGB(tilePaint.texture);
                    this.field4465.method7644(n2, n10, n8, n, n3, n9, class82.method4599(n4, tilePaint.swColor, (byte)0), class82.method4599(n4, tilePaint.seColor, (byte)0), class82.method4599(n4, tilePaint.nwColor, (byte)0), -1031021032);
                }
                return;
            }
            this.field4465.method7650(n2, n10, n8, n, n3, n9, tilePaint.swColor, tilePaint.seColor, tilePaint.nwColor, s, n12, n13, n18, n17, n16, n15, n14, n11, tilePaint.texture, (byte)-6);
            return;
        }
        this.field4465.method7644(n2, n10, n8, n, n3, n9, tilePaint.swColor, tilePaint.seColor, tilePaint.nwColor, -167600281);
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Lbd;", garbageValue="3")
    public Rasterizer3D vmethod7594() {
        class265 class2652 = this.field4465;
        return class2652;
    }

    @Override
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lbe;Lbj;IIIIIII)V")
    void vmethod7604(Scene object, TileModel tileModel, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = tileModel.field467.length;
        n7 = 0;
        while (true) {
            int n9;
            int n10;
            int n11;
            int n12;
            if (n7 >= n8) {
                this.field4465.field350 = 0;
                n4 = tileModel.field466.length;
                n = 0;
                while (true) {
                    if (n >= n4) {
                        return;
                    }
                    n12 = tileModel.field466[n];
                    n11 = tileModel.field468[n];
                    int n13 = tileModel.field460[n];
                    n7 = TileModel.field458[n12];
                    n2 = TileModel.field458[n11];
                    n3 = TileModel.field458[n13];
                    n8 = TileModel.field455[n12];
                    n10 = TileModel.field455[n11];
                    n9 = TileModel.field455[n13];
                    if ((n9 - n10) * (n7 - n2) - (n8 - n10) * (n3 - n2) > 0) {
                        this.field4465.field344 = false;
                        if (n7 < 0 || n2 < 0 || n3 < 0 || n7 > this.field4465.field358 || n2 > this.field4465.field358 || n3 > this.field4465.field358) {
                            this.field4465.field344 = true;
                        }
                        if (Scene.field385 && Scene.containsBounds(Scene.field395, Scene.field388, n8, n10, n9, n7, n2, n3)) {
                            Scene.field381 = n5;
                            Scene.field380 = n6;
                        }
                        if (tileModel.field461 != null && tileModel.field461[n] != -1) {
                            if (!Scene.Scene_isLowDetail) {
                                if (tileModel.field463) {
                                    this.field4465.method7650(n8, n10, n9, n7, n2, n3, tileModel.field473[n], tileModel.field464[n], tileModel.field472[n], TileModel.field454[0], TileModel.field454[1], TileModel.field454[3], TileModel.field453[0], TileModel.field453[1], TileModel.field453[3], TileModel.field459[0], TileModel.field459[1], TileModel.field459[3], tileModel.field461[n], (byte)-119);
                                } else {
                                    this.field4465.method7650(n8, n10, n9, n7, n2, n3, tileModel.field473[n], tileModel.field464[n], tileModel.field472[n], TileModel.field454[n12], TileModel.field454[n11], TileModel.field454[n13], TileModel.field453[n12], TileModel.field453[n11], TileModel.field453[n13], TileModel.field459[n12], TileModel.field459[n11], TileModel.field459[n13], tileModel.field461[n], (byte)9);
                                }
                            } else {
                                object = this.field4465;
                                n12 = Rasterizer3D.field339.getAverageTextureRGB(tileModel.field461[n]);
                                this.field4465.method7644(n8, n10, n9, n7, n2, n3, class82.method4599(n12, tileModel.field473[n], (byte)0), class82.method4599(n12, tileModel.field464[n], (byte)0), class82.method4599(n12, tileModel.field472[n], (byte)0), 1821464580);
                            }
                        } else if (tileModel.field473[n] != 12345678) {
                            this.field4465.method7644(n8, n10, n9, n7, n2, n3, tileModel.field473[n], tileModel.field464[n], tileModel.field472[n], -660418374);
                        }
                    }
                    ++n;
                }
            }
            n12 = tileModel.field467[n7] - Scene.field364;
            n9 = tileModel.field462[n7] - Scene.field361;
            n11 = tileModel.field465[n7] - Scene.field373;
            n10 = n12 * n4 + n3 * n11 >> 16;
            n11 = n11 * n4 - n3 * n12 >> 16;
            n12 = n9 * n2 - n * n11 >> 16;
            n9 = n * n9 + n11 * n2 >> 16;
            if (n9 < 50) {
                return;
            }
            if (tileModel.field461 != null) {
                TileModel.field454[n7] = n10;
                TileModel.field453[n7] = n12;
                TileModel.field459[n7] = n9;
            }
            TileModel.field458[n7] = this.field4465.field352 + this.field4465.field354 * n10 / n9;
            TileModel.field455[n7] = this.field4465.field357 + this.field4465.field354 * n12 / n9;
            ++n7;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1645942593")
    static void method7512() {
        if (!Client.Login_isUsernameRemembered || Login.Login_username == null || Login.Login_username.length() <= 0) {
            WorldMapIcon_0.method10405();
            return;
        }
        class72.method4136();
    }

    @ObfuscatedName(value="ar")
    static void method7513(int[] arrn, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, byte by) {
        by = (byte)(-n4);
        n4 = n2;
        n2 = n;
        while (true) {
            int n7;
            if (by < 0) {
                n7 = n4 + n3 - 3;
                n = n4;
            } else {
                return;
            }
            while (n < n7) {
                n4 = n + 1;
                int n8 = n2 + 1;
                arrn[n] = arrn2[n2];
                n = n4 + 1;
                n2 = n8 + 1;
                arrn[n4] = arrn2[n8];
                n4 = n + 1;
                n8 = n2 + 1;
                arrn[n] = arrn2[n2];
                n = n4 + 1;
                n2 = n8 + 1;
                arrn[n4] = arrn2[n8];
            }
            while (n < n7 + 3) {
                arrn[n] = arrn2[n2];
                ++n;
                ++n2;
            }
            n4 = n + n5;
            n2 += n6;
            by = (byte)(by + 1);
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lkc;IIS)Lei;", garbageValue="32766")
    static IndexedSprite method7514(AbstractArchive object, int n, int n2) {
        if (class287.method10622((AbstractArchive)object, n, n2)) {
            object = class63.method4017();
            return object;
        }
        return null;
    }
}

