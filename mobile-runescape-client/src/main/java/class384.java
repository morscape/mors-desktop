/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ek")
public final class class384
extends DualNode {
    @ObfuscatedName(value="ae")
    public int field7125;
    @ObfuscatedName(value="ah")
    int field7126;
    @ObfuscatedName(value="aj")
    public int field7128;
    @ObfuscatedName(value="as")
    public int field7130;
    @ObfuscatedName(value="ai")
    public int field7127;
    @ObfuscatedName(value="ak")
    public int[] field7129;
    @ObfuscatedName(value="ax")
    public int field7131;

    public class384(int[] arrn, int n, int n2) {
        this.field7129 = arrn;
        this.field7130 = n;
        this.field7125 = n;
        this.field7128 = n2;
        this.field7127 = n2;
        this.field7126 = 0;
        this.field7131 = 0;
    }

    public class384(int n, int n2) {
        this(new int[n2 * n], n, n2);
    }

    class384() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="()Lek;")
    public class384 method13291() {
        class384 class3842 = new class384(this.field7130, this.field7128);
        int n = 0;
        while (true) {
            if (n < this.field7127) {
            } else {
                return class3842;
            }
            for (int i = 0; i < this.field7125; ++i) {
                class3842.field7129[(n + this.field7126) * this.field7130 + i + this.field7131] = this.field7129[i + n * this.field7125];
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ah")
    public void method13294() {
        int[] arrn = new int[this.field7125 * this.field7127];
        int n = 0;
        int n2 = 0;
        while (true) {
            int n3;
            if (n < this.field7127) {
                n3 = this.field7125 - 1;
            } else {
                this.field7129 = arrn;
                this.field7131 = this.field7130 - this.field7125 - this.field7131;
                return;
            }
            while (n3 >= 0) {
                arrn[n2] = this.field7129[n3 + n * this.field7125];
                --n3;
                ++n2;
            }
            ++n;
        }
    }

    @ObfuscatedName(value="aj")
    public void method13296(int n) {
        int[] arrn = new int[this.field7125 * this.field7127];
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            if (n2 < this.field7127) {
                n4 = 0;
            } else {
                this.field7129 = arrn;
                return;
            }
            while (n4 < this.field7125) {
                int n5;
                block7: {
                    block8: {
                        int n6;
                        n5 = n6 = this.field7129[n3];
                        if (n6 != 0) break block7;
                        if (n4 > 0 && this.field7129[n3 - 1] != 0 || n2 > 0 && this.field7129[n3 - this.field7125] != 0 || n4 < this.field7125 - 1 && this.field7129[n3 + 1] != 0) break block8;
                        n5 = n6;
                        if (n2 >= this.field7127 - 1) break block7;
                        n5 = n6;
                        if (this.field7129[n3 + this.field7125] == 0) break block7;
                    }
                    n5 = n;
                }
                arrn[n3] = n5;
                ++n4;
                ++n3;
            }
            ++n2;
        }
    }

    @ObfuscatedName(value="al")
    public void method13298(int n) {
        int n2 = this.field7127 - 1;
        block0: while (n2 > 0) {
            int n3 = this.field7125;
            int n4 = this.field7125 - 1;
            while (true) {
                if (n4 > 0) {
                    int[] arrn = this.field7129;
                    int n5 = n4 + n3 * n2;
                    if (arrn[n5] == 0 && this.field7129[n5 - 1 - this.field7125] != 0) {
                        this.field7129[n5] = n;
                    }
                } else {
                    --n2;
                    continue block0;
                }
                --n4;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="as")
    public void method13305() {
        int[] arrn = new int[this.field7125 * this.field7127];
        int n = this.field7127 - 1;
        int n2 = 0;
        while (true) {
            int n3;
            if (n >= 0) {
                n3 = 0;
            } else {
                this.field7129 = arrn;
                this.field7126 = this.field7128 - this.field7127 - this.field7126;
                return;
            }
            while (n3 < this.field7125) {
                arrn[n2] = this.field7129[n3 + n * this.field7125];
                ++n3;
                ++n2;
            }
            --n;
        }
    }

    @ObfuscatedName(value="ai")
    public void method13295() {
        if (this.field7125 == this.field7130 && this.field7127 == this.field7128) {
            return;
        }
        int[] arrn = new int[this.field7130 * this.field7128];
        int n = 0;
        while (true) {
            if (n < this.field7127) {
            } else {
                this.field7129 = arrn;
                this.field7125 = this.field7130;
                this.field7127 = this.field7128;
                this.field7131 = 0;
                this.field7126 = 0;
                return;
            }
            for (int i = 0; i < this.field7125; ++i) {
                arrn[(n + this.field7126) * this.field7130 + i + this.field7131] = this.field7129[i + n * this.field7125];
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="()Lek;")
    public class384 method13297() {
        class384 class3842 = new class384(this.field7125, this.field7127);
        class3842.field7130 = this.field7130;
        class3842.field7128 = this.field7128;
        class3842.field7131 = this.field7130 - this.field7125 - this.field7131;
        class3842.field7126 = this.field7126;
        int n = 0;
        while (true) {
            if (n < this.field7127) {
            } else {
                return class3842;
            }
            for (int i = 0; i < this.field7125; ++i) {
                class3842.field7129[i + n * this.field7125] = this.field7129[n * this.field7125 + this.field7125 - 1 - i];
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ax")
    public void method13310(int n) {
        if (this.field7125 == this.field7130 && this.field7127 == this.field7128) {
            return;
        }
        int n2 = n > this.field7131 ? this.field7131 : n;
        int n3 = this.field7131 + this.field7125 + n > this.field7130 ? this.field7130 - this.field7131 - this.field7125 : n;
        int n4 = n > this.field7126 ? this.field7126 : n;
        int n5 = n;
        if (this.field7126 + this.field7127 + n > this.field7128) {
            n5 = this.field7128 - this.field7126 - this.field7127;
        }
        int n6 = n2 + n3 + this.field7125;
        n5 = n4 + n5 + this.field7127;
        int[] arrn = new int[n6 * n5];
        n = 0;
        while (true) {
            if (n < this.field7127) {
            } else {
                this.field7129 = arrn;
                this.field7125 = n6;
                this.field7127 = n5;
                this.field7131 -= n2;
                this.field7126 -= n4;
                return;
            }
            for (n3 = 0; n3 < this.field7125; ++n3) {
                arrn[n3 + n2 + n6 * (n4 + n)] = this.field7129[n3 + this.field7125 * n];
            }
            ++n;
        }
    }
}

