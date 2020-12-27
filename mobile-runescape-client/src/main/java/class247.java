/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="pl")
public class class247 {
    @ObfuscatedName(value="ak")
    int[] field4296;

    public class247(int[] arrn) {
        int n = 1;
        while (true) {
            if (n > (arrn.length >> 1) + arrn.length) {
                int n2 = n + n;
                this.field4296 = new int[n2];
                int n3 = 0;
                int n4 = 0;
                while (true) {
                    int n5 = n3;
                    if (n4 >= n2) {
                        while (true) {
                            int[] arrn2;
                            if (n5 >= arrn.length) {
                                return;
                            }
                            n4 = arrn[n5];
                            while ((arrn2 = this.field4296)[n2 = (n3 = (n4 &= n - 1) + n4) + 1] != -1) {
                                ++n4;
                            }
                            this.field4296[n3] = arrn[n5];
                            this.field4296[n2] = n5++;
                        }
                    }
                    this.field4296[n4] = -1;
                    ++n4;
                }
            }
            n <<= 1;
        }
    }

    @ObfuscatedName(value="ak")
    public int method7383(int n, int n2) {
        int n3 = (this.field4296.length >> 1) - 1;
        n2 = n & n3;
        int n4;
        int[] arrn;
        int n5;
        while ((n5 = (arrn = this.field4296)[(n4 = n2 + n2) + 1]) != -1) {
            if ((n4 = this.field4296[n4]) == n) {
                return n5;
            }
            n2 = n2 + 1 & n3;
        }
        return -1;
    }
}

