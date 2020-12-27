/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oc")
public class class399
extends DualNode {
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="[Lei;")
    public static IndexedSprite[] field7284;
    @ObfuscatedName(value="am")
    static int field7285 = -1;
    @ObfuscatedName(value="an")
    static int field7286 = -1;
    @ObfuscatedName(value="ao")
    static int field7287 = 255;
    @ObfuscatedName(value="ap")
    static int field7288 = 0;
    @ObfuscatedName(value="ar")
    static int field7289 = 0;
    @ObfuscatedName(value="aw")
    static int field7292 = -1;
    @ObfuscatedName(value="ay")
    static int field7293 = -1;
    @ObfuscatedName(value="az")
    static int field7294;
    @ObfuscatedName(value="ad")
    static String[] field7283;
    @ObfuscatedName(value="at")
    static int field7290 = 0;
    @ObfuscatedName(value="av")
    static Random field7291;
    @ObfuscatedName(value="aa")
    public int field7295;
    @ObfuscatedName(value="ae")
    int[] field7297;
    @ObfuscatedName(value="ah")
    int[] field7298;
    @ObfuscatedName(value="aj")
    public int field7300;
    @ObfuscatedName(value="al")
    public int field7302;
    @ObfuscatedName(value="aq")
    byte[] field7303;
    @ObfuscatedName(value="as")
    int[] field7304;
    @ObfuscatedName(value="ai")
    int[] field7299;
    @ObfuscatedName(value="ak")
    byte[][] field7301 = new byte[256][];
    @ObfuscatedName(value="ax")
    int[] field7305;
    @ObfuscatedName(value="ab")
    public int field7296;

    static {
        field7291 = new Random();
        field7283 = new String[100];
    }

    public class399(byte[] arrby, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4, int[] arrn5, byte[][] arrby2) {
        int n = 0;
        this.field7300 = 0;
        this.field7298 = arrn;
        this.field7304 = arrn2;
        this.field7299 = arrn3;
        this.field7305 = arrn4;
        this.method13839(arrby);
        this.field7301 = arrby2;
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MIN_VALUE;
        while (true) {
            int n4;
            if (n < 256) {
                n4 = n2;
                if (this.field7304[n] < n2) {
                    n4 = n2;
                    if (this.field7305[n] != 0) {
                        n4 = this.field7304[n];
                    }
                }
            } else {
                this.field7302 = this.field7300 - n2;
                this.field7295 = n3 - this.field7300;
                this.field7296 = this.field7300 - this.field7304[120];
                return;
            }
            int n5 = n3;
            if (this.field7304[n] + this.field7305[n] > n3) {
                n5 = this.field7304[n] + this.field7305[n];
            }
            ++n;
            n2 = n4;
            n3 = n5;
        }
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIILfj;)V")
    public void method13830(String string2, int n, int n2, int n3, int n4, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        this.method13847(string2, n, n2, class722);
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="([BIIIIIILfj;)V")
    void method13832(byte[] arrby, int n, int n2, int n3, int n4, int n5, int n6, class72 class722) {
        int n7;
        int n8 = n;
        if (n6 >= 255) {
            this.method13833(arrby, n, n2, n3, n4, n5, class722);
            return;
        }
        n = n2 * class722.field2525 + n8;
        int n9 = class722.field2525 - n3;
        int n10 = class722.field2531 * 221165805;
        int n11 = 0;
        if (n2 < n10 * 30958821) {
            n7 = class722.field2531 - n2;
            n10 = class722.field2531;
            n2 = n7 * class722.field2525 + n;
            n = n7 * n3 + 0;
            n4 -= n7;
        } else {
            n7 = 0;
            n10 = n2;
            n2 = n;
            n = n7;
        }
        n7 = n4 + n10;
        n10 = n4;
        if (n7 > class722.field2526) {
            n10 = n4 - (n7 - class722.field2526);
        }
        if (n8 < class722.field2530) {
            n4 = class722.field2530 - n8;
            n8 = class722.field2530 * -1938025425;
            n = n4 + n;
            n7 = n4 + 0;
            n11 = n4 + n9;
            n9 = n2 + n4;
            n4 = n3 - n4;
            n8 *= -1999785265;
            n2 = n11;
            n11 = n9;
            n3 = n7;
        } else {
            n4 = n3;
            n3 = n11;
            n11 = n2;
            n2 = n9;
        }
        int n12 = n4 + n8;
        n7 = n4;
        n9 = n2;
        n8 = n3;
        if (n12 > class722.field2528) {
            n9 = n12 - class722.field2528;
            n7 = n4 - n9;
            n8 = n9 + n3;
            n9 = n2 + n9;
        }
        if (n7 > 0) {
            if (n10 <= 0) {
                return;
            }
            this.method13848(class722.field2529, arrby, n5, n, n11, n7, n10, n9, n8, n6);
            return;
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIILfj;)V")
    public void method13834(String string2, int n, int n2, int n3, int n4, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        this.method13847(string2, n - this.method13851(string2), n2, class722);
    }

    @ObfuscatedName(value="ag")
    void method13835(int[] arrn, byte[] arrby, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = -(n4 >> 2);
        int n9 = -(n4 & 3);
        int n10 = n | 0xFF000000;
        n4 = -n5;
        while (true) {
            if (n4 < 0) {
                n = n3;
            } else {
                return;
            }
            for (n3 = n8; n3 < 0; ++n3) {
                n5 = n2 + 1;
                if (arrby[n2] != 0) {
                    n2 = n + 1;
                    arrn[n] = n10;
                    n = n2;
                } else {
                    ++n;
                }
                int n11 = n5 + 1;
                if (arrby[n5] != 0) {
                    n2 = n + 1;
                    arrn[n] = n10;
                    n = n2;
                } else {
                    ++n;
                }
                n5 = n11 + 1;
                if (arrby[n11] != 0) {
                    n2 = n + 1;
                    arrn[n] = n10;
                    n = n2;
                } else {
                    ++n;
                }
                if (arrby[n5] != 0) {
                    arrn[n] = n10;
                    ++n;
                } else {
                    ++n;
                }
                n2 = n5 + 1;
            }
            n3 = n9;
            while (n3 < 0) {
                if (arrby[n2] != 0) {
                    arrn[n] = n10;
                    ++n;
                } else {
                    ++n;
                }
                ++n3;
                ++n2;
            }
            ++n4;
            n3 = n + n6;
            n2 += n7;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ah")
    public int method13836(String string2, int[] arrn, String[] arrstring) {
        if (string2 == null) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(100);
        int n = string2.length();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = -1;
        int n6 = 0;
        int n7 = 0;
        int n8 = -1;
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            block19: {
                int n18;
                char c;
                block25: {
                    block22: {
                        block17: {
                            block20: {
                                String string3;
                                block24: {
                                    block23: {
                                        block21: {
                                            block18: {
                                                string3 = string2;
                                                if (n2 >= n) break block17;
                                                c = string3.charAt(n2);
                                                if (c != '<') break block18;
                                                n5 = n2;
                                                n17 = n3;
                                                n16 = n4;
                                                n15 = n6;
                                                n14 = n7;
                                                n13 = n8;
                                                n12 = n9;
                                                n11 = n10;
                                                break block19;
                                            }
                                            if (c != '>' || n5 == -1) break block20;
                                            string3 = string3.substring(n5 + 1, n2);
                                            stringBuilder.append('<');
                                            stringBuilder.append(string3);
                                            stringBuilder.append('>');
                                            if (!string3.equals("br")) break block21;
                                            arrstring[n4] = stringBuilder.toString().substring(n3, stringBuilder.length());
                                            n14 = n4 + 1;
                                            n13 = stringBuilder.length();
                                            n5 = 0;
                                            n18 = 0;
                                            n15 = -1;
                                            break block22;
                                        }
                                        if (!string3.equals("lt")) break block23;
                                        n5 = n18 = n6 + this.method13837('<');
                                        if (this.field7303 != null) {
                                            n5 = n18;
                                            if (n7 != -1) {
                                                n5 = n18 + this.field7303[(n7 << 8) + 60];
                                            }
                                        }
                                        n18 = 60;
                                        n13 = n3;
                                        n14 = n4;
                                        n15 = n8;
                                        break block22;
                                    }
                                    if (!string3.equals("gt")) break block24;
                                    n5 = n18 = n6 + this.method13837('>');
                                    if (this.field7303 != null) {
                                        n5 = n18;
                                        if (n7 != -1) {
                                            n5 = n18 + this.field7303[(n7 << 8) + 62];
                                        }
                                    }
                                    n18 = 62;
                                    n13 = n3;
                                    n14 = n4;
                                    n15 = n8;
                                    break block22;
                                }
                                n13 = n3;
                                n14 = n4;
                                n5 = n6;
                                n18 = n7;
                                n15 = n8;
                                if (!string3.startsWith("img=")) break block22;
                                try {
                                    n5 = class88.method4766(string3.substring(4), -716813035);
                                    n5 = class399.field7284[n5].field7120;
                                    n5 += n6;
                                    n18 = 0;
                                    n15 = n8;
                                    n14 = n4;
                                    n13 = n3;
                                }
                                catch (Exception exception) {
                                    n13 = n3;
                                    n14 = n4;
                                    n5 = n6;
                                    n18 = n7;
                                    n15 = n8;
                                }
                            }
                            n18 = n7;
                            n7 = n5;
                            break block25;
                        }
                        string2 = stringBuilder.toString();
                        if (string2.length() > n3) {
                            arrstring[n4] = string2.substring(n3, string2.length());
                            return n4 + 1;
                        }
                        return n4;
                    }
                    c = '\u0000';
                    n7 = -1;
                    n3 = n13;
                    n4 = n14;
                    n6 = n5;
                    n8 = n15;
                }
                n17 = n3;
                n16 = n4;
                n5 = n7;
                n15 = n6;
                n14 = n18;
                n13 = n8;
                n12 = n9;
                n11 = n10;
                if (n7 == -1) {
                    n5 = n6;
                    n13 = n18;
                    if (c != '\u0000') {
                        stringBuilder.append(c);
                        n5 = n6 += this.method13837(c);
                        if (this.field7303 != null) {
                            n5 = n6;
                            if (n18 != -1) {
                                n5 = n6 + this.field7303[c + (n18 << 8)];
                            }
                        }
                        n13 = c;
                    }
                    if (c == ' ') {
                        n8 = stringBuilder.length();
                        n10 = n5;
                        n9 = 1;
                    }
                    if (arrn != null && n5 > arrn[n18 = n4 < arrn.length ? n4 : arrn.length - 1] && n8 >= 0) {
                        arrstring[n4] = stringBuilder.toString().substring(n3, n8 - n9);
                        ++n4;
                        n5 -= n10;
                        n18 = -1;
                        n14 = 0;
                    } else {
                        n18 = n8;
                        n8 = n3;
                        n14 = n13;
                    }
                    if (c == '-') {
                        n18 = stringBuilder.length();
                        n10 = n5;
                        n9 = 0;
                    }
                    n11 = n10;
                    n12 = n9;
                    n13 = n18;
                    n15 = n5;
                    n5 = n7;
                    n16 = n4;
                    n17 = n8;
                }
            }
            ++n2;
            n3 = n17;
            n4 = n16;
            n6 = n15;
            n7 = n14;
            n8 = n13;
            n9 = n12;
            n10 = n11;
        }
    }

    @ObfuscatedName(value="aj")
    public int method13838(String string2, int n) {
        String[] arrstring = field7283;
        return this.method13836(string2, new int[]{n}, arrstring);
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIIIIIIILfj;)I")
    public int method13840(String string2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, class72 class722) {
        if (string2 == null) {
            return 0;
        }
        this.method13843(n5, n6);
        n5 = n9;
        if (n9 == 0) {
            n5 = this.field7300;
        }
        int[] arrn = new int[]{n3};
        int[] arrn2 = arrn;
        if (n4 < this.field7302 + this.field7295 + n5) {
            arrn2 = arrn;
            if (n4 < n5 + n5) {
                arrn2 = null;
            }
        }
        n9 = this.method13836(string2, arrn2, field7283);
        n6 = n8;
        if (n8 == 3) {
            n6 = n8;
            if (n9 == 1) {
                n6 = 1;
            }
        }
        if (n6 == 0) {
            n2 += this.field7302;
        } else if (n6 == 1) {
            n2 = n2 + (n4 - this.field7302 - this.field7295 - (n9 - 1) * n5) / 2 + this.field7302;
        } else if (n6 == 2) {
            n2 = n2 + n4 - this.field7295 - (n9 - 1) * n5;
        } else {
            n4 = n6 = (n4 - this.field7302 - this.field7295 - (n9 - 1) * n5) / (n9 + 1);
            if (n6 < 0) {
                n4 = 0;
            }
            n2 = n2 + n4 + this.field7302;
            n5 = n4 + n5;
        }
        n6 = 0;
        n4 = n2;
        for (n2 = n6; n2 < n9; ++n2) {
            if (n7 == 0) {
                this.method13847(field7283[n2], n, n4, class722);
            } else if (n7 == 1) {
                this.method13847(field7283[n2], (n3 - this.method13851(field7283[n2])) / 2 + n, n4, class722);
            } else if (n7 == 2) {
                this.method13847(field7283[n2], n + n3 - this.method13851(field7283[n2]), n4, class722);
            } else if (n2 == n9 - 1) {
                this.method13847(field7283[n2], n, n4, class722);
            } else {
                this.method13853(field7283[n2], n3);
                this.method13847(field7283[n2], n, n4, class722);
                field7294 = 0;
            }
            n4 += n5;
        }
        return n9;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIIILfj;)V")
    public void method13841(String string2, int n, int n2, int n3, int n4, int n5, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        int[] arrn = new int[string2.length()];
        for (n3 = 0; n3 < string2.length(); ++n3) {
            arrn[n3] = (int)(Math.sin((double)n3 / 2.0 + (double)n5 / 5.0) * 5.0);
        }
        this.method13849(string2, n - this.method13851(string2) / 2, n2, null, arrn, class722);
    }

    @ObfuscatedName(value="ao")
    void method13842(String string2) {
        try {
            if (string2.startsWith("col=")) {
                field7288 = class170.method6468(string2.substring(4), 16);
                return;
            }
            if (string2.equals("/col")) {
                field7288 = field7289;
                return;
            }
            if (string2.startsWith("str=")) {
                field7285 = class170.method6468(string2.substring(4), 16);
                return;
            }
            if (string2.equals("str")) {
                field7285 = 0x800000;
                return;
            }
            if (string2.equals("/str")) {
                field7285 = -1;
                return;
            }
            if (string2.startsWith("u=")) {
                field7286 = class170.method6468(string2.substring(2), 16);
                return;
            }
            if (string2.equals("u")) {
                field7286 = 0;
                return;
            }
            if (string2.equals("/u")) {
                field7286 = -1;
                return;
            }
            if (string2.startsWith("shad=")) {
                field7292 = class170.method6468(string2.substring(5), 16);
                return;
            }
            if (string2.equals("shad")) {
                field7292 = 0;
                return;
            }
            if (string2.equals("/shad")) {
                field7292 = field7293;
                return;
            }
            if (string2.equals("br")) {
                this.method13843(field7289, field7293);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    @ObfuscatedName(value="ap")
    void method13843(int n, int n2) {
        field7285 = -1;
        field7286 = -1;
        field7293 = n2;
        field7292 = n2;
        field7289 = n;
        field7288 = n;
        field7287 = 255;
        field7294 = 0;
        field7290 = 0;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIILfj;)V")
    public void method13844(String string2, int n, int n2, int n3, int n4, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        this.method13847(string2, n - this.method13851(string2) / 2, n2, class722);
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIIILfj;)V")
    public void method13845(String string2, int n, int n2, int n3, int n4, int n5, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        field7291.setSeed(n5);
        field7287 = (field7291.nextInt() & 0x1F) + 192;
        int[] arrn = new int[string2.length()];
        n3 = 0;
        n4 = 0;
        while (true) {
            if (n3 < string2.length()) {
                arrn[n3] = n4;
                n5 = n4;
                if ((field7291.nextInt() & 3) == 0) {
                    n5 = n4 + 1;
                }
            } else {
                this.method13849(string2, n, n2, arrn, null, class722);
                return;
            }
            ++n3;
            n4 = n5;
        }
    }

    @ObfuscatedName(value="as")
    public int method13846(String string2, int n) {
        int n2 = 0;
        String[] arrstring = field7283;
        int n3 = this.method13836(string2, new int[]{n}, arrstring);
        int n4 = 0;
        n = n2;
        while (true) {
            if (n < n3) {
                int n5 = this.method13851(field7283[n]);
                n2 = n4;
                if (n5 > n4) {
                    n2 = n5;
                }
            } else {
                return n4;
            }
            ++n;
            n4 = n2;
        }
    }

    @ObfuscatedName(value="au")
    void method13848(int[] arrn, byte[] arrby, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = 255 - n8;
        n5 = -n5;
        while (true) {
            int n10;
            int n11;
            if (n5 < 0) {
                n11 = -n4;
                n10 = n3;
                n3 = n2;
            } else {
                return;
            }
            while (n11 < 0) {
                if (arrby[n3] != 0) {
                    n2 = arrn[n10];
                    if (n2 == 0) {
                        n2 = n10 + 1;
                        arrn[n10] = n8 << 24 | n;
                    } else {
                        arrn[n10] = Math.max(n2 >>> 24, n8) << 24 | ((n9 * (n2 & 0xFF00FF) & 0xFF00FF00) + (n9 * (n2 & 0xFF00) & 0xFF0000) >> 8) + (((n & 0xFF00FF) * n8 & 0xFF00FF00) + (n8 * (n & 0xFF00) & 0xFF0000) >> 8);
                        n2 = n10 + 1;
                    }
                } else {
                    n2 = n10 + 1;
                }
                ++n11;
                ++n3;
                n10 = n2;
            }
            n11 = n10 + n6;
            n2 = n3 + n7;
            ++n5;
            n3 = n11;
        }
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIIIILfj;)V")
    public void method13850(String string2, int n, int n2, int n3, int n4, int n5, int n6, class72 class722) {
        double d;
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        double d2 = d = 7.0 - (double)n6 / 8.0;
        if (d < 0.0) {
            d2 = 0.0;
        }
        int[] arrn = new int[string2.length()];
        for (n3 = 0; n3 < string2.length(); ++n3) {
            arrn[n3] = (int)(Math.sin((double)n3 / 1.5 + (double)n5 / 1.0) * d2);
        }
        this.method13849(string2, n - this.method13851(string2) / 2, n2, null, arrn, class722);
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIIILfj;)V")
    public void method13852(String string2, int n, int n2, int n3, int n4, int n5, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        int[] arrn = new int[string2.length()];
        int[] arrn2 = new int[string2.length()];
        for (n3 = 0; n3 < string2.length(); ++n3) {
            double d = n3;
            double d2 = d / 5.0;
            double d3 = (double)n5 / 5.0;
            arrn[n3] = (int)(Math.sin(d2 + d3) * 5.0);
            arrn2[n3] = (int)(Math.sin(d / 3.0 + d3) * 5.0);
        }
        this.method13849(string2, n - this.method13851(string2) / 2, n2, arrn, arrn2, class722);
    }

    @ObfuscatedName(value="az")
    void method13853(String string2, int n) {
        int n2 = 0;
        boolean bl = false;
        for (int i = 0; i < string2.length(); ++i) {
            int n3;
            boolean bl2;
            char c = string2.charAt(i);
            if (c == '<') {
                bl2 = true;
                n3 = n2;
            } else if (c == '>') {
                bl2 = false;
                n3 = n2;
            } else {
                n3 = n2;
                bl2 = bl;
                if (!bl) {
                    n3 = n2;
                    bl2 = bl;
                    if (c == ' ') {
                        n3 = n2 + 1;
                        bl2 = bl;
                    }
                }
            }
            n2 = n3;
            bl = bl2;
        }
        if (n2 > 0) {
            field7294 = (n - this.method13851(string2) << 8) / n2;
        }
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="([BIIIIILfj;)V")
    void method13833(byte[] arrby, int n, int n2, int n3, int n4, int n5, class72 class722) {
        int n6;
        int n7;
        int n8 = n;
        n = n8 + n2 * class722.field2525;
        int n9 = class722.field2525 - n3;
        int n10 = class722.field2531 * 221165805;
        int n11 = 0;
        if (n2 < n10 * 30958821) {
            n2 = class722.field2531 - n2;
            n10 = class722.field2531;
            n = n2 * class722.field2525 + n;
            n4 -= n2;
            n2 = n2 * n3 + 0;
        } else {
            n7 = 0;
            n10 = n2;
            n2 = n7;
        }
        n7 = n4 + n10;
        n10 = n4;
        if (n7 > class722.field2526) {
            n10 = n4 - (n7 - class722.field2526);
        }
        if (n8 < class722.field2530) {
            n6 = class722.field2530 - n8;
            n8 = class722.field2530 * -1938025425;
            n4 = n6 + 0;
            n11 = n9 + n6;
            n7 = n2 + n6;
            n9 = n6 + n;
            n3 -= n6;
            n8 *= -1999785265;
            n = n11;
            n2 = n4;
            n4 = n7;
            n7 = n9;
        } else {
            n7 = n;
            n4 = n2;
            n2 = n11;
            n = n9;
        }
        n6 = n8 + n3;
        n11 = n3;
        n9 = n;
        n8 = n2;
        if (n6 > class722.field2528) {
            n9 = n6 - class722.field2528;
            n11 = n3 - n9;
            n8 = n2 + n9;
            n9 += n;
        }
        if (n11 > 0) {
            if (n10 <= 0) {
                return;
            }
            this.method13835(class722.field2529, arrby, n5, n4, n7, n11, n10, n9, n8);
            return;
        }
    }

    @ObfuscatedName(value="ai")
    int method13837(char c) {
        char c2 = c;
        if (c == '\u00a0') {
            c2 = ' ';
        }
        return this.field7297[class327.charToByteCp1252(c2) & 0xFF];
    }

    @ObfuscatedName(value="ak")
    void method13839(byte[] arrby) {
        int n;
        this.field7297 = new int[256];
        int n2 = arrby.length;
        if (n2 != 257) {
            n2 = 0;
            n = 0;
            while (n2 < 256) {
                this.field7297[n2] = arrby[n] & 0xFF;
                ++n2;
                ++n;
            }
            int[] arrn = new int[256];
            int[] arrn2 = new int[256];
            n2 = 0;
            while (n2 < 256) {
                arrn[n2] = arrby[n] & 0xFF;
                ++n2;
                ++n;
            }
            n2 = 0;
            while (n2 < 256) {
                arrn2[n2] = arrby[n] & 0xFF;
                ++n2;
                ++n;
            }
            byte[][] arrarrby = new byte[256][];
            n2 = 0;
            while (true) {
                byte by;
                byte by2;
                int n3;
                if (n2 < 256) {
                    arrarrby[n2] = new byte[arrn[n2]];
                    n3 = 0;
                    by2 = 0;
                } else {
                    byte[][] arrarrby2 = new byte[256][];
                    n2 = 0;
                    while (true) {
                        if (n2 < 256) {
                            arrarrby2[n2] = new byte[arrn[n2]];
                            n3 = 0;
                            by2 = 0;
                        } else {
                            this.field7303 = new byte[65536];
                            for (n = 0; n < 256; ++n) {
                                if (n == 32 || n == 160) continue;
                                for (n2 = 0; n2 < 256; ++n2) {
                                    if (n2 == 32 || n2 == 160) continue;
                                    this.field7303[n2 + (n << 8)] = (byte)class399.method13825(arrarrby, arrarrby2, arrn2, this.field7297, arrn, n, n2);
                                }
                            }
                            this.field7300 = arrn2[32] + arrn[32];
                            return;
                        }
                        while (n3 < arrarrby2[n2].length) {
                            arrarrby2[n2][n3] = by = (byte)(by2 + arrby[n]);
                            ++n3;
                            ++n;
                            by2 = by;
                        }
                        ++n2;
                    }
                }
                while (n3 < arrarrby[n2].length) {
                    arrarrby[n2][n3] = by = (byte)(by2 + arrby[n]);
                    ++n3;
                    ++n;
                    by2 = by;
                }
                ++n2;
            }
        }
        for (n = 0; n < this.field7297.length; ++n) {
            this.field7297[n] = arrby[n] & 0xFF;
        }
        this.field7300 = arrby[256] & 0xFF;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IILfj;)V")
    void method13847(String string2, int n, int n2, class72 class722) {
        int n3 = n2 - this.field7300;
        n2 = -1;
        int n4 = -1;
        int n5 = 0;
        int n6 = n;
        n = n2;
        while (n5 < string2.length()) {
            block20: {
                block27: {
                    block23: {
                        Object object;
                        block26: {
                            block25: {
                                block24: {
                                    block22: {
                                        block21: {
                                            if (string2.charAt(n5) != '\u0000') break block21;
                                            n2 = n4;
                                            break block20;
                                        }
                                        n2 = (char)(class327.charToByteCp1252(string2.charAt(n5)) & 0xFF);
                                        if (n2 != 60) break block22;
                                        n = n5;
                                        n2 = n4;
                                        break block20;
                                    }
                                    if (n2 != 62 || n == -1) break block23;
                                    object = string2.substring(n + 1, n5);
                                    if (!((String)object).equals("lt")) break block24;
                                    n2 = 60;
                                    break block25;
                                }
                                if (!((String)object).equals("gt")) break block26;
                                n2 = 62;
                            }
                            n = -1;
                            break block23;
                        }
                        if (((String)object).startsWith("img=")) {
                            n = class88.method4766(((String)object).substring(4), -2098628560);
                            object = field7284[n];
                            n = this.field7300;
                            n2 = ((IndexedSprite)object).field7122;
                            class722.vmethod10757((IndexedSprite)object, n6, n3 + n - n2, -1713248280);
                            n = ((IndexedSprite)object).field7120;
                            n6 += n;
                            n = -1;
                            n2 = -1;
                            break block20;
                        }
                        this.method13842((String)object);
                        break block27;
                    }
                    if (n2 == 160) {
                        n2 = 32;
                    }
                    if (n == -1) {
                        int n7 = n6;
                        if (this.field7303 != null) {
                            n7 = n6;
                            if (n4 != -1) {
                                n7 = this.field7303[n2 + (n4 << 8)] + n6;
                            }
                        }
                        n4 = this.field7299[n2];
                        int n8 = this.field7305[n2];
                        if (n2 != 32) {
                            if (field7287 >= 255) {
                                if (field7292 != -1) {
                                    this.method13833(this.field7301[n2], this.field7298[n2] + n7 + 1, this.field7304[n2] + n3 + 1, n4, n8, field7292, class722);
                                }
                                this.method13833(this.field7301[n2], this.field7298[n2] + n7, this.field7304[n2] + n3, n4, n8, field7288, class722);
                                n6 = n7;
                            } else {
                                if (field7292 != -1) {
                                    this.method13832(this.field7301[n2], this.field7298[n2] + n7 + 1, this.field7304[n2] + n3 + 1, n4, n8, field7292, field7287, class722);
                                }
                                n6 = n2;
                                this.method13832(this.field7301[n6], n7 + this.field7298[n6], n3 + this.field7304[n6], n4, n8, field7288, field7287, class722);
                                n6 = n7;
                            }
                        } else {
                            n6 = n7;
                            if (field7294 > 0) {
                                n6 = n7 + ((field7290 += field7294) >> 8);
                                field7290 &= 0xFF;
                            }
                        }
                        n7 = this.field7297[n2];
                        if (field7285 != -1) {
                            class722.vmethod10752(n6, n3 + (int)((double)this.field7300 * 0.7), n7, field7285, -1889496973);
                        }
                        if (field7286 != -1) {
                            class722.vmethod10752(n6, n3 + this.field7300 + 1, n7, field7286, -938959964);
                        }
                        n6 += n7;
                    } else {
                        n2 = n4;
                    }
                    break block20;
                    catch (Exception exception) {}
                    break block27;
                    catch (Exception exception) {}
                }
                n = -1;
                n2 = n4;
            }
            ++n5;
            n4 = n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II[I[ILfj;)V")
    void method13849(String string2, int n, int n2, int[] arrn, int[] arrn2, class72 class722) {
        int n3 = n2 - this.field7300;
        int n4 = -1;
        int n5 = -1;
        n2 = 0;
        int n6 = 0;
        int n7 = n;
        n = n4;
        while (true) {
            block20: {
                block27: {
                    int n8;
                    Object object;
                    int n9;
                    block26: {
                        block22: {
                            block25: {
                                block24: {
                                    block23: {
                                        block21: {
                                            if (n6 >= string2.length()) {
                                                return;
                                            }
                                            if (string2.charAt(n6) == '\u0000') break block20;
                                            n9 = class327.charToByteCp1252(string2.charAt(n6)) & 0xFF;
                                            if (n9 != 60) break block21;
                                            n = n6;
                                            break block20;
                                        }
                                        if (n9 != 62 || n == -1) break block22;
                                        object = string2.substring(n + 1, n6);
                                        if (!((String)object).equals("lt")) break block23;
                                        n9 = 60;
                                        break block24;
                                    }
                                    if (!((String)object).equals("gt")) break block25;
                                    n9 = 62;
                                }
                                n4 = -1;
                                break block26;
                            }
                            if (((String)object).startsWith("img=")) {
                                n = arrn != null ? arrn[n2] : 0;
                            }
                            this.method13842((String)object);
                            break block27;
                        }
                        n4 = n;
                    }
                    n = n9;
                    if (n9 == 160) {
                        n = 32;
                    }
                    if (n4 == -1) {
                        n9 = n7;
                        if (this.field7303 != null) {
                            n9 = n7;
                            if (n5 != -1) {
                                n9 = this.field7303[(n5 << 8) + n] + n7;
                            }
                        }
                        int n10 = this.field7299[n];
                        int n11 = this.field7305[n];
                        n7 = arrn != null ? arrn[n2] : 0;
                        n5 = arrn2 != null ? arrn2[n2] : 0;
                        if (n != 32) {
                            if (field7287 >= 255) {
                                if (field7292 != -1) {
                                    this.method13833(this.field7301[n], n9 + n7 + this.field7298[n] + 1, n3 + n5 + this.field7304[n] + 1, n10, n11, field7292, class722);
                                }
                                n8 = n;
                                this.method13833(this.field7301[n8], n9 + n7 + this.field7298[n8], n3 + n5 + this.field7304[n8], n10, n11, field7288, class722);
                                n7 = n9;
                            } else {
                                n8 = n;
                                if (field7292 != -1) {
                                    this.method13832(this.field7301[n8], n9 + n7 + this.field7298[n8] + 1, n3 + n5 + this.field7304[n8] + 1, n10, n11, field7292, field7287, class722);
                                }
                                this.method13832(this.field7301[n8], n9 + n7 + this.field7298[n8], n3 + n5 + this.field7304[n8], n10, n11, field7288, field7287, class722);
                                n7 = n9;
                            }
                        } else {
                            n7 = n9;
                            if (field7294 > 0) {
                                n7 = n9 + ((field7290 += field7294) >> 8);
                                field7290 &= 0xFF;
                            }
                        }
                        n5 = this.field7297[n];
                        if (field7285 != -1) {
                            class722.vmethod10752(n7, n3 + (int)((double)this.field7300 * 0.7), n5, field7285, 727105803);
                        }
                        if (field7286 != -1) {
                            class722.vmethod10752(n7, n3 + this.field7300, n5, field7286, 72610704);
                        }
                        n7 += n5;
                        ++n2;
                        n5 = n;
                    }
                    n = n4;
                    break block20;
                    n4 = arrn2 != null ? arrn2[n2] : 0;
                    ++n2;
                    try {
                        n9 = class88.method4766(((String)object).substring(4), 521366281);
                        object = field7284[n9];
                        n9 = this.field7300;
                        n8 = ((IndexedSprite)object).field7122;
                    }
                    catch (Exception exception) {}
                    try {
                        class722.vmethod10757((IndexedSprite)object, n7 + n, n4 + (n9 + n3 - n8), -1713248280);
                        n = ((IndexedSprite)object).field7120;
                        n7 += n;
                        n = -1;
                        n5 = -1;
                        break block20;
                    }
                    catch (Exception exception) {}
                }
                n = -1;
            }
            ++n6;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    public int method13851(String string2) {
        int n = 0;
        if (string2 == null) {
            return 0;
        }
        int n2 = 0;
        int n3 = -1;
        int n4 = -1;
        while (true) {
            int n5;
            int n6;
            block9: {
                block14: {
                    int n7;
                    int n8;
                    int n9;
                    block11: {
                        String string3;
                        block13: {
                            block12: {
                                block10: {
                                    if (n >= string2.length()) {
                                        return n2;
                                    }
                                    n9 = string2.charAt(n);
                                    if (n9 != 60) break block10;
                                    n3 = n;
                                    n6 = n2;
                                    n5 = n4;
                                    break block9;
                                }
                                n8 = n3;
                                n7 = n9;
                                if (n9 != 62) break block11;
                                n8 = n3;
                                n7 = n9;
                                if (n3 == -1) break block11;
                                string3 = string2.substring(n3 + 1, n);
                                if (!string3.equals("lt")) break block12;
                                n8 = -1;
                                n7 = 60;
                                break block11;
                            }
                            if (!string3.equals("gt")) break block13;
                            n8 = -1;
                            n7 = 62;
                            break block11;
                        }
                        if (!string3.startsWith("img=")) break block14;
                        try {
                            n3 = class88.method4766(string3.substring(4), -290388179);
                            n3 = class399.field7284[n3].field7120;
                            n6 = n2 + n3;
                            n3 = -1;
                            n5 = -1;
                            break block9;
                        }
                        catch (Exception exception) {}
                    }
                    n9 = n7;
                    if (n7 == 160) {
                        n9 = 32;
                    }
                    n6 = n2;
                    n3 = n8;
                    n5 = n4;
                    if (n8 == -1) {
                        n6 = n3 = n2 + this.field7297[(char)(class327.charToByteCp1252((char)n9) & 0xFF)];
                        if (this.field7303 != null) {
                            n6 = n3;
                            if (n4 != -1) {
                                n6 = n3 + this.field7303[n9 + (n4 << 8)];
                            }
                        }
                        n5 = n9;
                        n3 = n8;
                    }
                    break block9;
                }
                n3 = -1;
                n6 = n2;
                n5 = n4;
            }
            ++n;
            n2 = n6;
            n4 = n5;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIIIILfj;)V")
    public void method13831(String string2, int n, int n2, int n3, int n4, int n5, class72 class722) {
        if (string2 == null) {
            return;
        }
        this.method13843(n3, n4);
        field7287 = n5;
        this.method13847(string2, n, n2, class722);
    }

    @ObfuscatedName(value="ae")
    static int method13825(byte[][] object, byte[][] object2, int[] arrn, int[] arrn2, int[] arrn3, int n, int n2) {
        int n3;
        Object object3 = arrn[n];
        int n4 = object3 + arrn3[n];
        int n5 = arrn[n2];
        int n6 = n5 + arrn3[n2];
        int n7 = n5 > object3 ? n5 : object3;
        if (n6 < n4) {
            n4 = n6;
        }
        n6 = n3 = arrn2[n];
        if (arrn2[n2] < n3) {
            n6 = arrn2[n2];
        }
        object2 = object2[n];
        object = object[n2];
        n2 = n7 - object3;
        n = n7 - n5;
        while (true) {
            if (n7 < n4) {
                object3 = object[n] + object2[n2];
                n5 = n6;
                if (object3 < n6) {
                    n5 = object3;
                }
            } else {
                return -n6;
            }
            ++n7;
            ++n2;
            ++n;
            n6 = n5;
        }
    }

    @ObfuscatedName(value="al")
    @Export(value="escapeBrackets")
    public static String escapeBrackets(String string2) {
        int n = string2.length();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            block4: {
                block3: {
                    block2: {
                        if (n3 >= n) break block2;
                        char c = string2.charAt(n3);
                        if (c == '<') break block3;
                        n5 = n4;
                        if (c != '>') break block4;
                        break block3;
                    }
                    StringBuilder stringBuilder = new StringBuilder(n4 + n);
                    n3 = n2;
                    while (true) {
                        block9: {
                            String string3;
                            block7: {
                                block5: {
                                    char c;
                                    block8: {
                                        block6: {
                                            if (n3 >= n) break block5;
                                            c = string2.charAt(n3);
                                            if (c != '<') break block6;
                                            string3 = "<lt>";
                                            break block7;
                                        }
                                        if (c != '>') break block8;
                                        string3 = "<gt>";
                                        break block7;
                                    }
                                    stringBuilder.append(c);
                                    break block9;
                                }
                                return stringBuilder.toString();
                            }
                            stringBuilder.append(string3);
                        }
                        ++n3;
                    }
                }
                n5 = n4 + 3;
            }
            ++n3;
            n4 = n5;
        }
    }
}

