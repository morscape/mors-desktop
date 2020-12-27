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

@ObfuscatedName(value="ia")
public class class311
implements class66 {
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lle;")
    static Language field6141;
    @ObfuscatedName(value="aa")
    boolean field6144 = false;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=2050336601)
    int field6146 = 0;
    @ObfuscatedName(value="ah")
    boolean field6147 = false;
    @ObfuscatedName(value="aj")
    boolean field6149 = false;
    @ObfuscatedName(value="al")
    boolean field6151 = false;
    @ObfuscatedName(value="as")
    boolean field6152 = false;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-699087759)
    int field6148;
    @ObfuscatedName(value="ak")
    boolean field6150 = true;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=227000329)
    int field6153;
    @ObfuscatedName(value="ab")
    boolean field6145 = false;

    class311() {
    }

    @Override
    @ObfuscatedName(value="aa")
    public boolean vmethod11251(int n, int n2, int n3, int n4, long l) {
        block4: {
            block3: {
                block2: {
                    if (this.field6150) break block2;
                    this.field6146 = n + 1;
                    break block3;
                }
                if (n == 0) break block4;
            }
            return true;
        }
        this.method11161(n2, n3, n4);
        return true;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IIII)V", garbageValue="-893664325")
    void method11161(int n, int n2, int n3) {
        if (!this.field6147) {
            if (n == 0 || n == 1 || !GraphicsObject.field7506 && n == 4) {
                this.method11167(n2, n3);
                this.field6147 = true;
            }
            return;
        }
    }

    @Override
    @ObfuscatedName(value="af")
    public boolean vmethod11256(int n, int n2, int n3, long l) {
        return true;
    }

    @Override
    @ObfuscatedName(value="aj")
    public boolean vmethod11260(int n, long l) {
        return true;
    }

    @Override
    @ObfuscatedName(value="al")
    public boolean vmethod11262(char c, long l) {
        class373.method13010(c, -353178805);
        return true;
    }

    @Override
    @ObfuscatedName(value="am")
    public boolean vmethod11263(int n, int n2, long l) {
        return true;
    }

    @Override
    @ObfuscatedName(value="an")
    public boolean vmethod11264(int n, long l) {
        return true;
    }

    @Override
    @ObfuscatedName(value="aq")
    public boolean vmethod11267(int n, int n2, long l) {
        if (!this.field6147) {
            this.method11167(n, n2);
            return true;
        }
        return true;
    }

    @Override
    @ObfuscatedName(value="as")
    public boolean vmethod11269(int n, long l) {
        if (n != 84) {
            if (n != 13) {
                if (n != 80) {
                    if (n != 85) {
                        if (n != 96) {
                            if (n != 97) {
                                return true;
                            }
                            this.field6145 = true;
                            return true;
                        }
                        this.field6144 = true;
                        return true;
                    }
                    class358.method12152();
                    return true;
                }
                this.field6151 = true;
                return true;
            }
            this.field6149 = true;
            return true;
        }
        this.field6152 = true;
        return true;
    }

    @Override
    @ObfuscatedName(value="ay")
    public boolean vmethod11275(int n, long l) {
        DirectByteArrayCopier.method12097(n);
        return true;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1460803551")
    void method11165() {
        this.field6147 = false;
        this.field6152 = false;
        this.field6149 = false;
        this.field6151 = false;
        this.field6144 = false;
        this.field6145 = false;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="23")
    void method11167(int n, int n2) {
        this.field6148 = n;
        this.field6153 = n2;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="1")
    void method11180() {
        this.field6150 = false;
        this.field6146 = 0;
    }

    @Override
    @ObfuscatedName(value="ab")
    public boolean vmethod11252(int n, int n2, int n3, int n4, long l) {
        if (!this.field6150 && this.field6146 == 1) {
            this.method11161(n2, n3, n4);
        }
        return true;
    }

    @ObfuscatedName(value="dx")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="812761267")
    static void method11156() {
        if (Client.field4874 >= 0 && Client.field4859[Client.field4874] != null) {
            Messages.method6082(Client.field4859[Client.field4874], false, (byte)123);
        }
    }
}

