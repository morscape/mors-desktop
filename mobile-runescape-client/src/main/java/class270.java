/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  dq[]
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.lang.reflect.Array;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cb")
public class class270
extends AbstractWorldMapData {
    class270() {
    }

    @Override
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;I)V")
    void vmethod7752(Buffer buffer, int n) {
        int n2;
        this.field2360 = Math.min(this.field2360, 4);
        this.floorUnderlayIds = (short[][][])Array.newInstance(Short.TYPE, 1, 64, 64);
        this.floorOverlayIds = (short[][][])Array.newInstance(Short.TYPE, this.field2360, 64, 64);
        this.field2351 = (byte[][][])Array.newInstance(Byte.TYPE, this.field2360, 64, 64);
        this.field2359 = (byte[][][])Array.newInstance(Byte.TYPE, this.field2360, 64, 64);
        this.decorations = (WorldMapDecoration[][][][])Array.newInstance(dq[].class, this.field2360, 64, 64);
        n = buffer.method11650(-1394510682);
        if (n == class52.field2383.field2386) {
            n = buffer.method11650(-740393564);
            n2 = buffer.method11650(1457392514);
            if (n != this.regionX || n2 != this.regionY) {
                throw new IllegalStateException("");
            }
        } else {
            throw new IllegalStateException("");
        }
        block0: for (n = 0; n < 64; ++n) {
            n2 = 0;
            while (true) {
                if (n2 >= 64) {
                    continue block0;
                }
                this.method3722(n, n2, buffer, -1092406445);
                ++n2;
            }
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;I)V", garbageValue="1854231680")
    void method7743(Buffer buffer) {
        if (buffer.method11650(1205785658) != class45.field2283.field2289) {
            throw new IllegalStateException("");
        }
        this.field2352 = buffer.method11650(2017641583);
        this.field2360 = buffer.method11650(-2103933025);
        this.field2355 = buffer.method11637(-853267039) * 64;
        this.field2350 = buffer.method11637(1342934612) * 64;
        this.regionX = buffer.method11637(-1535257844);
        this.regionY = buffer.method11637(1050918380);
        this.groupId = buffer.method11680((byte)69);
        this.fileId = buffer.method11680((byte)-34);
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof class270;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (class270)object;
        bl = bl2;
        if (this.regionX == ((AbstractWorldMapData)object).regionX) {
            int n = ((AbstractWorldMapData)object).regionY * 1307259461;
            int n2 = this.regionY * 1307259461;
            bl = bl2;
            if (n * 916263053 == n2 * 916263053) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        int n = this.regionX * 157125749;
        int n2 = this.regionY * 1307259461;
        return n2 * 916263053 << 8 | n * -844438563;
    }

    @ObfuscatedName(value="adj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="417931432")
    protected static final void method7736() {
        VarbitDefinition.field6831 = null;
        class55.field2410 = null;
        TextureProvider.field4719 = null;
        class138.field3545.method6095();
    }

    @ObfuscatedName(value="bm")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1042596009")
    static boolean method7740(int n) {
        if (Client.field4740.method5708().method12010()) {
            return false;
        }
        Login.loginIndex = 21;
        Login.field3199 = n;
        return true;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="114")
    static void method7738() {
        if (class33.method886(-2080968788)) {
            Login.field3202 = true;
            Login.field3205 = 0;
            Login.field3207 = 0;
            class301.field6073 = null;
        }
    }
}

