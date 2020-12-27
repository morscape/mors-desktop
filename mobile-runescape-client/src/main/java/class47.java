/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cw")
public abstract class class47 {
    @ObfuscatedName(value="tu")
    @ObfuscatedSignature(descriptor="Lml;")
    static class190 field2319;
    @ObfuscatedName(value="aa")
    static final int[] field2311;
    @ObfuscatedName(value="aj")
    static final int[] field2313;
    @ObfuscatedName(value="al")
    static final int[] field2314;
    @ObfuscatedName(value="br")
    static boolean field2317 = false;
    @ObfuscatedName(value="ab")
    static final int[] field2312;
    @ObfuscatedName(value="ac")
    final int[] field2320;
    @ObfuscatedName(value="ag")
    final int[][] field2322;
    @ObfuscatedName(value="an")
    final boolean[] field2323 = new boolean[4700];
    @ObfuscatedName(value="ao")
    final int[] field2324;
    @ObfuscatedName(value="ap")
    final int[] field2325;
    @ObfuscatedName(value="ar")
    final int[] field2326;
    @ObfuscatedName(value="au")
    final int[][] field2328;
    @ObfuscatedName(value="aw")
    final int[] field2329;
    @ObfuscatedName(value="ay")
    final boolean[] field2330 = new boolean[4700];
    @ObfuscatedName(value="az")
    final int[] field2331;
    @ObfuscatedName(value="bg")
    final int[] field2333;
    @ObfuscatedName(value="bh")
    final int[] field2334;
    @ObfuscatedName(value="bj")
    final int[] field2336;
    @ObfuscatedName(value="bp")
    final int[] field2337;
    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="Lbd;")
    final Rasterizer3D field2338;
    @ObfuscatedName(value="ad")
    final int[] field2321;
    @ObfuscatedName(value="at")
    final int[] field2327;
    @ObfuscatedName(value="bi")
    final int[] field2335;
    @ObfuscatedName(value="bf")
    final int[] field2332;

    static {
        field2313 = Rasterizer3D.Rasterizer3D_sine;
        field2314 = Rasterizer3D.Rasterizer3D_cosine;
        field2311 = Rasterizer3D.field334;
        field2312 = Rasterizer3D.field337;
        field2317 = true;
    }

    @ObfuscatedSignature(descriptor="(Lbd;)V")
    class47(Rasterizer3D rasterizer3D) {
        this.field2329 = new int[4700];
        this.field2326 = new int[4700];
        this.field2325 = new int[4700];
        this.field2324 = new int[4700];
        this.field2331 = new int[4700];
        this.field2327 = new int[4700];
        this.field2321 = new int[1600];
        this.field2322 = (int[][])Array.newInstance(Integer.TYPE, 1600, 512);
        this.field2320 = new int[12];
        this.field2328 = (int[][])Array.newInstance(Integer.TYPE, 12, 2000);
        this.field2337 = new int[2000];
        this.field2335 = new int[2000];
        this.field2333 = new int[12];
        this.field2332 = new int[10];
        this.field2336 = new int[10];
        this.field2334 = new int[10];
        this.field2338 = rasterizer3D;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lcp;IIIIIIIII)V")
    public abstract void vmethod7681(Model var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10);

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(Lbw;IIIIIIIIJ)V")
    public abstract void vmethod7685(Entity var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lcp;IIIIIIIB)V")
    public abstract void vmethod7687(Model var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9);

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/CharSequence;B)Ljava/lang/String;", garbageValue="1")
    public static String method3680(CharSequence charSequence) {
        String string2 = class221.method6978(class34.method947(charSequence, -356513594));
        charSequence = string2;
        if (string2 == null) {
            charSequence = "";
        }
        return charSequence;
    }
}

