/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jz")
public class class149 {
    @ObfuscatedName(value="an")
    @ObfuscatedGetter(intValue=659847241)
    int field3632;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lei;")
    IndexedSprite field3633;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="[Lei;")
    IndexedSprite[] field3634;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1912110813)
    int field3635;
    @ObfuscatedName(value="aw")
    @ObfuscatedGetter(intValue=1053297125)
    int field3638;
    @ObfuscatedName(value="ay")
    String field3639;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lei;")
    IndexedSprite field3640;
    @ObfuscatedName(value="at")
    @ObfuscatedGetter(longValue=-3129132551632171527L)
    long field3636 = -1L;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-173342193)
    int field3637 = 0;

    class149() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ILoc;Led;FI)V", garbageValue="-1593341749")
    void method6083(String string2, int n, class399 class3992, class58 class582, float f) {
        class72 class722 = class582.vmethod11005();
        class722.vmethod10747(85333759);
        this.method6088(f, -1137436563);
        this.method6106(class722, (byte)30);
        class3992.method13844(string2, this.field3638 / 2, this.field3635 * 7 / 8 - 20, -1, 0, class722);
        class3992.method13844(String.format("Automatically retrying in %s...", n), this.field3638 / 2, this.field3635 * 7 / 8 + 20, -1, 0, class722);
        class582.vmethod11004(0, 0);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="([Lei;Lei;Lei;B)V", garbageValue="89")
    void method6087(IndexedSprite[] arrindexedSprite, IndexedSprite indexedSprite, IndexedSprite indexedSprite2) {
        this.field3634 = arrindexedSprite;
        this.field3633 = indexedSprite;
        this.field3640 = indexedSprite2;
    }

    @ObfuscatedName(value="af")
    void method6088(float f, int n) {
        int n2;
        int n3 = 765;
        n = 503;
        if (f > 1.5208747f) {
            n2 = (int)(f * 503.0f);
        } else {
            n2 = n3;
            if (f > 0.0f) {
                n = (int)(765.0f / f);
                n2 = n3;
            }
        }
        this.field3638 = n2;
        this.field3635 = n;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Loc;Lfj;B)V")
    void method6090(int n, String string2, class399 class3992, class72 class722, byte by) {
        by = (byte)(this.field3635 / 16);
        int n2 = by * this.field3633.field7119 / this.field3633.field7124;
        int n3 = this.field3635 * 13 / 16;
        int n4 = by / 2;
        int n5 = (this.field3638 - n2) / 2;
        n = n5 + (n * 90 / 100 + 5) * n2 / 100;
        class722.method4238(0, 0, n, this.field3635, -448408016);
        class722.vmethod10760(this.field3640, n5, n3, n2, by, -1680418726);
        class722.method4238(n, 0, this.field3638, this.field3635, -448408016);
        class722.vmethod10760(this.field3640, n - n2 * 95 / 100, n3, n2, by, -1680418726);
        class722.method4252();
        class722.vmethod10760(this.field3633, n5, n3, n2, by, -1680418726);
        if (class3992 != null) {
            class3992.method13844(string2, this.field3638 / 2, n4 + n3 + 5, -8355712, 0, class722);
        }
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(ILoc;Led;FI)V", garbageValue="-193345071")
    void method6092(int n, class399 class3992, class58 class582, float f) {
        this.method6083("No Internet connection available. Please check your settings.", n, class3992, class582, f);
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(ILoc;Led;FI)V", garbageValue="1231180605")
    void method6094(int n, class399 class3992, class58 class582, float f) {
        this.method6083("Failed to contact server. Please check your Internet connection.", n, class3992, class582, f);
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-20657")
    void method6095() {
        this.field3634 = null;
        this.field3633 = null;
        this.field3640 = null;
    }

    @ObfuscatedName(value="aq")
    boolean method6099(int n) {
        int n2;
        return this.field3634 != null && (n = this.field3637 * 731491567) * -173342193 >= (n2 = this.field3634.length);
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lmx;Loc;Led;FB)V", garbageValue="-87")
    void method6101(class196 object, class399 class3992, class58 class582, float f) {
        if (object == null) {
            return;
        }
        if (this.field3639 == null) {
            switch (((class196)object).field3908) {
                default: {
                    this.field3639 = "Error loading application";
                    break;
                }
                case 3: 
                case 4: 
                case 6: 
                case 7: {
                    object = this.field3632 != 3 ? "Unable to download content" : "Unable to connect to server";
                    this.field3639 = object;
                    break;
                }
                case 2: {
                    this.field3639 = "Application crashed";
                    break;
                }
                case 1: {
                    this.field3639 = "Your client needs updating. Opening store page...";
                }
            }
        }
        object = class582.vmethod11005();
        ((class72)object).vmethod10747(2113183410);
        this.method6088(f, -1534361297);
        this.method6106((class72)object, (byte)46);
        class3992.method13844("Old School RuneScape has encountered a problem", this.field3638 / 2, this.field3635 * 7 / 8 - 20, -1, 0, (class72)object);
        class3992.method13844(this.field3639, this.field3638 / 2, this.field3635 * 7 / 8 + 20, -1, 0, (class72)object);
        class582.vmethod11004(0, 0);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(ILjava/lang/String;Loc;FLed;I)V", garbageValue="-904602157")
    void method6091(int n, String string2, class399 class3992, float f, class58 class582) {
        class72 class722 = class582.vmethod11005();
        class722.vmethod10747(-56634797);
        if (this.field3634 != null && this.field3633 != null) {
            if (this.field3640 != null) {
                this.method6088(f, -1710489324);
                this.method6106(class722, (byte)77);
                this.method6090(n, string2, class3992, class722, (byte)16);
                class582.vmethod11004(0, 0);
                return;
            }
        } else {
            return;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1003329439")
    void method6093(int n) {
        this.field3632 = n;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lfj;B)V")
    void method6106(class72 class722, byte by) {
        if (this.field3634 != null) {
            long l = class363.currentTimeMillis();
            if (-1L == this.field3636) {
                this.field3636 = l;
            }
            if (l - this.field3636 >= 33L) {
                this.field3636 = l;
                ++this.field3637;
            }
            int n = this.field3634.length - 11;
            int n2 = this.field3637;
            by = (byte)n2;
            if (n2 >= n) {
                n2 = n + (n2 - n) % 86;
                by = (byte)n2;
                if (n2 >= this.field3634.length) {
                    by = (byte)(this.field3634.length - 1);
                }
            }
            IndexedSprite indexedSprite = this.field3634[by];
            n2 = this.field3635 * 3 / 4;
            by = (byte)(n2 * indexedSprite.field7119 / indexedSprite.field7124);
            if (n2 > indexedSprite.field7124) {
                by = (byte)(n2 / indexedSprite.field7124);
                n2 = indexedSprite.field7124;
                n = indexedSprite.field7119;
                n2 *= by;
                by = (byte)(n * by);
            }
            n = (this.field3638 - by) / 2;
            int n3 = (this.field3635 * 3 / 4 - n2) / 2 + 10;
            if (n2 != indexedSprite.field7124) {
                class722.vmethod10760(indexedSprite, n, n3, by, n2, -1680418726);
                return;
            }
            class722.vmethod10757(indexedSprite, n, n3, -1713248280);
            return;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Loc;Led;FI)V", garbageValue="1239166905")
    void method6084(class399 class3992, class58 class582, float f) {
        class72 class722 = class582.vmethod11005();
        class722.vmethod10747(1822869483);
        this.method6088(f, -1628898458);
        this.method6106(class722, (byte)74);
        class3992.method13844("Your client needs updating. Opening store page...", this.field3638 / 2, this.field3635 * 7 / 8, -1, 0, class582.vmethod11005());
        class582.vmethod11004(0, 0);
    }
}

