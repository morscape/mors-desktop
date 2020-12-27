/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="bc")
@Implements(value="DevicePcmPlayer")
public class DevicePcmPlayer
extends class19 {
    @ObfuscatedName(value="ph")
    @ObfuscatedSignature(descriptor="Lhn;")
    static PcmPlayer field4627;
    @ObfuscatedName(value="do")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field4626;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lbs;")
    final ScriptEvent field4628;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lbi;")
    final class264 field4629;

    @ObfuscatedSignature(descriptor="(Lbi;)V")
    public DevicePcmPlayer(class264 class2642) {
        this.field4629 = class2642;
        this.field4628 = new ScriptEvent(this.field4629);
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)Lcw;", garbageValue="53")
    public class47 vmethod7589() {
        ScriptEvent scriptEvent = this.field4628;
        return scriptEvent;
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1643854449")
    @Export(value="open")
    public void open(int n) {
        if (AbstractArchive.method6133()) {
            ak.method3385(AbstractWorldMapIcon.method3606(-508794113) - this.field4629.field352, ScriptEvent.method7675((byte)0) - this.field4629.field357);
        }
        this.field4628.setType(n);
    }

    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lbe;Lbp;IIIIIIIS)V")
    void vmethod7592(Scene object, TilePaint tilePaint, int n, int n2, int n3, int n4, int n5, int n6, int n7, short s) {
        block21: {
            int n8;
            int n9;
            Object object2;
            int n10;
            int n11;
            int n12;
            int n13;
            block26: {
                block27: {
                    block22: {
                        int n14;
                        int n15;
                        int n16;
                        int n17;
                        block25: {
                            block24: {
                                block23: {
                                    if (!class19.field329) break block21;
                                    n13 = (n6 << 7) - Scene.field364;
                                    n17 = (n7 << 7) - Scene.field373;
                                    n12 = n13 + 128;
                                    Object object3 = n17 + 128;
                                    n11 = ((Scene)object).tileHeights[n][n6][n7] - Scene.field361;
                                    Object object4 = ((Scene)object).tileHeights[n];
                                    s = (short)(n6 + 1);
                                    n10 = object4[s][n7] - Scene.field361;
                                    object4 = ((Scene)object).tileHeights[n][s];
                                    s = (short)(n7 + 1);
                                    object2 = object4[s] - Scene.field361;
                                    n = ((Scene)object).tileHeights[n][n6][s] - Scene.field361;
                                    n9 = n17 * n4;
                                    n8 = n13 * n5;
                                    s = (short)(n9 + n8 >> 16);
                                    int n18 = n17 * n5;
                                    n17 = n13 * n4;
                                    n16 = n18 - n17 >> 16;
                                    n13 = n3 * n11 - n16 * n2 >> 16;
                                    if ((n11 = n11 * n2 + n3 * n16 >> 16) < 50) {
                                        return;
                                    }
                                    n16 = n12 * n5;
                                    n9 = n9 + n16 >> 16;
                                    n15 = n12 * n4;
                                    n18 = n18 - n15 >> 16;
                                    n12 = n3 * n10 - n18 * n2 >> 16;
                                    if ((n10 = n10 * n2 + n3 * n18 >> 16) < 50) {
                                        return;
                                    }
                                    n18 = object3 * n4;
                                    n4 = n18 + n16 >> 16;
                                    n16 = object3 * n5;
                                    object3 = n16 - n15 >> 16;
                                    n5 = n3 * object2 - object3 * n2 >> 16;
                                    if ((object3 = (Object)(object2 * n2 + n3 * object3 >> 16)) < 50) {
                                        return;
                                    }
                                    object2 = n18 + n8 >> 16;
                                    n17 = n16 - n17 >> 16;
                                    n8 = n * n3 - n17 * n2 >> 16;
                                    if ((n2 = n * n2 + n3 * n17 >> 16) < 50) {
                                        return;
                                    }
                                    n = this.field4629.field352 + s * this.field4629.field354 / n11;
                                    n3 = this.field4629.field357 + this.field4629.field354 * n13 / n11;
                                    n17 = this.field4629.field352 + this.field4629.field354 * n9 / n10;
                                    n16 = this.field4629.field357 * -1054703363;
                                    n16 = this.field4629.field354 * n12 / n10 + n16 * -469394347;
                                    n15 = this.field4629.field352 * -920001371;
                                    n18 = n15 * -22322387 + this.field4629.field354 * n4 / object3;
                                    n15 = this.field4629.field354 * n5 / object3;
                                    int n19 = this.field4629.field357 + n15;
                                    n15 = this.field4629.field354 * object2 / n2;
                                    n15 = this.field4629.field352 + n15;
                                    n14 = this.field4629.field357 * -1054703363;
                                    n14 = this.field4629.field354 * n8 / n2 + n14 * -469394347;
                                    this.field4629.field350 = 0;
                                    if ((n18 - n15) * (n16 - n14) - (n17 - n15) * (n19 - n14) > 0) {
                                        this.field4629.field344 = false;
                                        if (n18 < 0 || n15 < 0 || n17 < 0 || n18 > this.field4629.field358 || n15 > this.field4629.field358 || n17 > this.field4629.field358) {
                                            this.field4629.field344 = true;
                                        }
                                        if (Scene.field385 && Scene.containsBounds(Scene.field395, Scene.field388, n19, n14, n16, n18, n15, n17)) {
                                            Scene.field381 = n6;
                                            Scene.field380 = n7;
                                        }
                                        object = tilePaint;
                                        if (((TilePaint)object).texture == -1) {
                                            if (((TilePaint)object).neColor != 12345678) {
                                                this.field4629.method7629(n5, n8, n12, n4, (int)object2, n9, (int)object3, n2, n10, ((TilePaint)object).neColor, ((TilePaint)object).nwColor, ((TilePaint)object).seColor, this.field4629.field354, 2131820544);
                                            }
                                        } else if (!Scene.Scene_isLowDetail) {
                                            this.field4629.method7610(n5, n8, n12, n4, (int)object2, n9, (int)object3, n2, n10, ((TilePaint)object).neColor, ((TilePaint)object).nwColor, ((TilePaint)object).seColor, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, ((TilePaint)object).texture, -1779777446);
                                        } else {
                                            object4 = this.field4629;
                                            n4 = Rasterizer3D.field339.getAverageTextureRGB(((TilePaint)object).texture);
                                            this.field4629.method7615(n19, n14, n16, n18, n15, n17, class82.method4599(n4, ((TilePaint)object).neColor, (byte)0), class82.method4599(n4, ((TilePaint)object).nwColor, (byte)0), class82.method4599(n4, ((TilePaint)object).seColor, (byte)0));
                                        }
                                    }
                                    if ((n - n17) * (n14 - n16) - (n15 - n17) * (n3 - n16) <= 0) break block22;
                                    this.field4629.field344 = false;
                                    if (n < 0 || n17 < 0 || n15 < 0) break block23;
                                    if (n <= this.field4629.field358 && n17 <= this.field4629.field358 && n15 <= this.field4629.field358) break block24;
                                }
                                this.field4629.field344 = true;
                            }
                            if (Scene.field385 && Scene.containsBounds(Scene.field395, Scene.field388, n3, n16, n14, n, n17, n15)) {
                                Scene.field381 = n6;
                                Scene.field380 = n7;
                            }
                            if (tilePaint.texture != -1) break block25;
                            if (tilePaint.swColor == 12345678) break block22;
                            break block26;
                        }
                        if (!Scene.Scene_isLowDetail) break block27;
                        object = this.field4629;
                        n2 = Rasterizer3D.field339.getAverageTextureRGB(tilePaint.texture);
                        this.field4629.method7615(n3, n16, n14, n, n17, n15, class82.method4599(n2, tilePaint.swColor, (byte)0), class82.method4599(n2, tilePaint.seColor, (byte)0), class82.method4599(n2, tilePaint.nwColor, (byte)0));
                    }
                    return;
                }
                this.field4629.method7610(n13, n12, n8, s, n9, (int)object2, n11, n10, n2, tilePaint.swColor, tilePaint.seColor, tilePaint.nwColor, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, tilePaint.texture, -1779777446);
                return;
            }
            this.field4629.method7629(n13, n12, n8, s, n9, (int)object2, n11, n10, n2, tilePaint.swColor, tilePaint.seColor, tilePaint.nwColor, this.field4629.field354, 2131820544);
            return;
        }
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(B)Lbd;", garbageValue="3")
    public Rasterizer3D vmethod7594() {
        class264 class2642 = this.field4629;
        return class2642;
    }

    @Override
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lbe;Lbj;IIIIIII)V")
    void vmethod7604(Scene object, TileModel tileModel, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (class19.field329) {
            int n8 = tileModel.field467.length;
            n7 = 0;
            while (true) {
                int n9;
                int n10;
                int n11;
                int n12;
                if (n7 >= n8) {
                    object = this.field4629;
                    n = 0;
                    ((Rasterizer3D)object).field350 = 0;
                    n2 = tileModel.field466.length;
                    while (true) {
                        if (n >= n2) {
                            return;
                        }
                        n7 = tileModel.field466[n];
                        n3 = tileModel.field468[n];
                        n4 = tileModel.field460[n];
                        n8 = TileModel.field458[n7];
                        n12 = TileModel.field458[n3];
                        n11 = TileModel.field458[n4];
                        n10 = TileModel.field455[n7];
                        n9 = TileModel.field455[n3];
                        int n13 = TileModel.field455[n4];
                        if (Scene.field385 && Scene.containsBounds(Scene.field395, Scene.field388, n10, n9, n13, n8, n12, n11)) {
                            Scene.field381 = n5;
                            Scene.field380 = n6;
                        }
                        n8 = TileModel.field454[n7];
                        n12 = TileModel.field454[n3];
                        n11 = TileModel.field454[n4];
                        n10 = TileModel.field453[n7];
                        n9 = TileModel.field453[n3];
                        n13 = TileModel.field453[n4];
                        int n14 = TileModel.field459[n7];
                        int n15 = TileModel.field459[n3];
                        int n16 = TileModel.field459[n4];
                        if (tileModel.field461 != null && tileModel.field461[n] != -1) {
                            int n17 = tileModel.field467[n7];
                            int n18 = n5 * 128;
                            float f = (float)(n17 - n18) / 128.0f;
                            float f2 = (float)(tileModel.field467[n3] - n18) / 128.0f;
                            float f3 = (float)(tileModel.field467[n4] - n18) / 128.0f;
                            n7 = tileModel.field465[n7];
                            n17 = n6 * 128;
                            float f4 = (float)(n7 - n17) / 128.0f;
                            float f5 = (float)(tileModel.field465[n3] - n17) / 128.0f;
                            float f6 = (float)(tileModel.field465[n4] - n17) / 128.0f;
                            this.field4629.method7610(n10, n9, n13, n8, n12, n11, n14, n15, n16, tileModel.field473[n], tileModel.field464[n], tileModel.field472[n], f, f2, f3, f4, f5, f6, tileModel.field461[n], -1779777446);
                        } else if (tileModel.field473[n] != 12345678) {
                            this.field4629.method7629(n10, n9, n13, n8, n12, n11, n14, n15, n16, tileModel.field473[n], tileModel.field464[n], tileModel.field472[n], this.field4629.field354, 2131820544);
                        }
                        ++n;
                    }
                }
                n10 = tileModel.field467[n7] - Scene.field364;
                n11 = tileModel.field462[n7] - Scene.field361;
                n9 = tileModel.field465[n7] - Scene.field373;
                n12 = n10 * n4 + n3 * n9 >> 16;
                n9 = n9 * n4 - n3 * n10 >> 16;
                n10 = n11 * n2 - n * n9 >> 16;
                n11 = n * n11 + n9 * n2 >> 16;
                if (n11 < 50) {
                    return;
                }
                TileModel.field454[n7] = n12;
                TileModel.field453[n7] = n10;
                TileModel.field459[n7] = n11;
                TileModel.field458[n7] = this.field4629.field352 + this.field4629.field354 * n12 / n11;
                TileModel.field455[n7] = this.field4629.field357 + this.field4629.field354 * n10 / n11;
                ++n7;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ah")
    static void method7586(int var0, int var1_1, int var2_2, int var3_3, short var4_4) {
        var6_5 = class319.field6240.last();
        while ((var6_5 = (class319)var6_5) != null) {
            block11: {
                block13: {
                    block18: {
                        block17: {
                            block15: {
                                block16: {
                                    block14: {
                                        block12: {
                                            if (var6_5.field6250 == -1 && var6_5.field6253 == null) break block11;
                                            if (var1_1 <= var6_5.field6247 * 16384) break block12;
                                            var4_4 = var1_1 - var6_5.field6247 * 16384;
                                            ** GOTO lbl12
                                        }
                                        if (var1_1 >= var6_5.field6248 * 16384) {
                                            var4_4 = 0;
                                        } else {
                                            var4_4 = var6_5.field6248 * 16384 - var1_1;
lbl12:
                                            // 2 sources

                                            var4_4 += 0;
                                        }
                                        if (var2_2 > var6_5.field6254 * 16384) {
                                            var5_6 = var4_4 + (var2_2 - var6_5.field6254 * 16384);
                                        } else {
                                            var5_6 = var4_4;
                                            if (var2_2 < var6_5.field6255 * 16384) {
                                                var5_6 = var4_4 + (var6_5.field6255 * 16384 - var2_2);
                                            }
                                        }
                                        if (var5_6 - 64 > var6_5.field6249 || ServerPacket.clientPreferences.field3164 == 0 || var0 != var6_5.field6245) break block13;
                                        var4_4 = var5_6 -= 64;
                                        if (var5_6 < 0) {
                                            var4_4 = 0;
                                        }
                                        var4_4 = (var6_5.field6249 - var4_4) * ServerPacket.clientPreferences.field3164 / var6_5.field6249;
                                        if (var6_5.field6243 != null) break block14;
                                        if (var6_5.field6250 < 0 || (var7_7 = SoundEffect.readSoundEffect(class100.field2763, var6_5.field6250, 0)) == null) break block15;
                                        break block16;
                                    }
                                    var6_5.field6243.method13528(var4_4);
                                    break block15;
                                }
                                var7_7 = RawPcmStream.createRawPcmStream(var7_7.toRawSound().resample(class34.field547), 100, var4_4);
                                var7_7.setNumLoops(-1);
                                WorldMapElement.field6923.addSubStream((PcmStream)var7_7);
                                var6_5.field6243 = var7_7;
                            }
                            if (var6_5.field6252 != null) break block17;
                            if (var6_5.field6253 == null) break block11;
                            var6_5.field6251 = var5_6 = var6_5.field6251 - var3_3 * 592902897;
                            if (var5_6 * 703772177 > 0) break block11;
                            break block18;
                        }
                        var6_5.field6252.method13528(var4_4);
                        if (!var6_5.field6252.hasNext()) {
                            var6_5.field6252 = null;
                        }
                        break block11;
                    }
                    var5_6 = (int)(Math.random() * (double)var6_5.field6253.length);
                    var7_7 = SoundEffect.readSoundEffect(class100.field2763, var6_5.field6253[var5_6], 0);
                    if (var7_7 != null) {
                        var7_7 = RawPcmStream.createRawPcmStream(var7_7.toRawSound().resample(class34.field547), 100, var4_4);
                        var7_7.setNumLoops(0);
                        WorldMapElement.field6923.addSubStream((PcmStream)var7_7);
                        var6_5.field6252 = var7_7;
                        var6_5.field6251 = (var6_5.field6244 + (int)(Math.random() * (double)(var6_5.field6246 - var6_5.field6244))) * 592902897;
                    }
                    break block11;
                }
                if (var6_5.field6243 != null) {
                    WorldMapElement.field6923.removeSubStream(var6_5.field6243);
                    var6_5.field6243 = null;
                }
                if (var6_5.field6252 != null) {
                    WorldMapElement.field6923.removeSubStream(var6_5.field6252);
                    var6_5.field6252 = null;
                }
            }
            var6_5 = class319.field6240.previous();
        }
    }
}

