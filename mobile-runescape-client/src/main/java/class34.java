/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="by")
public class class34
implements Runnable {
    @ObfuscatedName(value="pw")
    @ObfuscatedSignature(descriptor="Lhp;")
    static class111 field547;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lby;")
    static class34 field541;
    @ObfuscatedName(value="aa")
    boolean field548 = false;
    @ObfuscatedName(value="af")
    LinkedList field549;
    @ObfuscatedName(value="ah")
    volatile float field550 = 0.8f;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(longValue=3852439714058744241L)
    public long field552;
    @ObfuscatedName(value="al")
    Object field553;
    @ObfuscatedName(value="am")
    int[] field554;
    @ObfuscatedName(value="an")
    int[][] field555;
    @ObfuscatedName(value="aq")
    SynchronousQueue field556;
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Lnh;")
    class206 field557;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lnh;")
    class206 field558 = new class206(250);
    @ObfuscatedName(value="aw")
    int[] field559;
    @ObfuscatedName(value="ay")
    int[] field561;
    @ObfuscatedName(value="ai")
    volatile boolean field551 = true;
    @ObfuscatedName(value="ax")
    volatile boolean field560 = true;

    class34() {
        this.field549 = new LinkedList();
        this.field556 = new SynchronousQueue();
        this.field557 = new class206(250);
        ak.method3356();
        class264.field4632 = true;
        this.method968(-443797324);
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)Lac;", garbageValue="-1696350727")
    public Varcs method951() {
        Varcs varcs = (Varcs)this.field549.removeFirst();
        return varcs;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lac;I)V", garbageValue="-1308320124")
    final void method955(Varcs varcs) {
        if (this.field549.size() < 3) {
            this.field549.add(varcs);
            return;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="2")
    public final void method957() {
        ak.method3360(null);
        this.field548 = true;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lbb;I)Z", garbageValue="2089050631")
    boolean method959(class20 object) {
        synchronized (this) {
            block4: {
                this.field555 = object.vmethod7792(915957499);
                object = this.field555;
                if (object != null) break block4;
                return false;
            }
            this.field561 = new int[this.field555.length];
            this.field559 = new int[this.field555.length];
            return true;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lbb;B)V")
    void method961(class20 class204, byte by) {
        if (this.field561 != null) {
            int n = class204.vmethod7797(193809256);
            by = 0;
            while (true) {
                if (by >= n) {
                    ak.method3387(n, this.field561, this.field559);
                    return;
                }
                Texture texture = class204.vmethod7798(by);
                if (texture != null) {
                    this.field561[by] = texture.field4668 / 2;
                    this.field559[by] = texture.field4669 / 2;
                }
                by = (byte)(by + 1);
            }
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)Lac;", garbageValue="57161255")
    final Varcs method962() {
        while (true) {
            try {
                Varcs varcs = (Varcs)this.field556.take();
                return varcs;
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-51")
    final void method963() {
        while (true) {
            try {
                this.field556.put(this.field549.removeFirst());
                return;
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="6")
    public final void method964() {
        ak.method3352();
        this.method967();
        if (this.field548) {
            this.method972();
        }
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(ZB)V", garbageValue="-96")
    public void method965(boolean bl) {
        this.field560 = bl;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/Object;", garbageValue="2144604864")
    final Object method966() {
        synchronized (this) {
            Object object;
            block4: {
                if (this.field553 != null) {
                    object = this.field553;
                    this.field553 = null;
                    break block4;
                }
                object = null;
            }
            return object;
        }
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1088268659")
    final void method967() {
        Object object = this.method966();
        if (object != null) {
            if (this.field548) {
                ak.method3363();
                this.field548 = false;
            } else {
                ak.method3360(object);
                this.field548 = true;
            }
        }
        if (this.field548) {
            this.method970(-1455667710);
        }
    }

    @ObfuscatedName(value="as")
    final void method968(int n) {
        n = 0;
        while (n < 3) {
            this.field549.add(new Varcs());
            ++n;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aw")
    final void method970(int n) {
        int[] arrn;
        int[][] arrn2 = null;
        // MONITORENTER : this
        if (this.field554 != null) {
            arrn = this.field554;
            this.field554 = null;
        } else {
            arrn = null;
        }
        if (this.field555 != null) {
            arrn2 = this.field555;
            this.field555 = null;
        }
        // MONITOREXIT : this
        if (arrn != null) {
            ak.method3367(arrn);
        }
        if (arrn2 == null) return;
        n = 0;
        while (n < arrn2.length) {
            if (arrn2[n] != null) {
                ak.method3369(n, arrn2[n]);
            }
            ++n;
        }
    }

    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="77")
    final void method972() {
        Varcs varcs = this.method962();
        if (varcs != null) {
            System.nanoTime();
            varcs.tryWrite();
            this.method963();
            varcs.method16(this.field560, -929548405);
            this.method955(varcs);
            this.field558.method6843(varcs.field10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="483692241")
    final void method971() {
        WorldMapDecoration.method3756(this.field550);
        synchronized (this) {
            this.field554 = Arrays.copyOf(Rasterizer3D.field334, Rasterizer3D.field334.length);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(Lac;B)Lac;", garbageValue="-109")
    public final Varcs method952(Varcs varcs) {
        while (true) {
            try {
                this.field557.method6843(varcs.getInt(1289646677));
                this.field556.put(varcs);
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
        while (true) {
            try {
                return (Varcs)this.field556.take();
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    @Override
    public void run() {
        while (this.field551) {
            this.method964();
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ldz;", garbageValue="1429301951")
    @Export(value="getParamDefinition")
    public static ParamDefinition getParamDefinition(int n) {
        Object object = ParamDefinition.ParamDefinition_cached;
        long l = n;
        if ((object = (ParamDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
            return object;
        }
        object = ParamDefinition.ParamDefinition_archive.takeFile(11, n);
        ParamDefinition paramDefinition = new ParamDefinition();
        if (object != null) {
            paramDefinition.method13233(new Buffer((byte[])object), -105482847);
        }
        paramDefinition.postDecode();
        ParamDefinition.ParamDefinition_cached.put(paramDefinition, l);
        return paramDefinition;
    }

    @ObfuscatedName(value="ak")
    static long method947(CharSequence charSequence, int n) {
        int n2 = charSequence.length();
        n = 0;
        long l = 0L;
        while (true) {
            block13: {
                long l2;
                block12: {
                    l2 = l;
                    if (n >= n2) break block12;
                    l2 = l * 37L;
                    char c = charSequence.charAt(n);
                    if (c >= 'A' && c <= 'Z') {
                        l = l2 + (long)(c + '\u0001' - 65);
                    } else if (c >= 'a' && c <= 'z') {
                        l = l2 + (long)(c + '\u0001' - 97);
                    } else {
                        l = l2;
                        if (c >= '0') {
                            l = l2;
                            if (c <= '9') {
                                l = l2 + (long)(c + 27 - 48);
                            }
                        }
                    }
                    if (l < 177917621779460413L) break block13;
                    l2 = l;
                }
                while (true) {
                    if (l2 % 37L != 0L || 0L == l2) {
                        return l2;
                    }
                    l2 /= 37L;
                }
            }
            ++n;
        }
    }
}

