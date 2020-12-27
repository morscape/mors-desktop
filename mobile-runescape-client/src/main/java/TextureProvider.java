/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cg")
@Implements(value="TextureProvider")
public class TextureProvider
implements class20 {
    @ObfuscatedName(value="uk")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field4719;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfe;")
    @Export(value="deque")
    NodeDeque deque = new NodeDeque();
    @ObfuscatedName(value="ah")
    @Export(value="brightness")
    double brightness = 1.0;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="archive")
    AbstractArchive archive;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=2144624039)
    @Export(value="textureSize")
    int textureSize = 128;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1344360215)
    @Export(value="capacity")
    int capacity;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="[Lbv;")
    @Export(value="textures")
    Texture[] textures;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1132635223)
    @Export(value="remaining")
    int remaining = 0;

    @ObfuscatedSignature(descriptor="(Lkc;Lkc;IDI)V")
    public TextureProvider(AbstractArchive abstractArchive, AbstractArchive object, int n, double d, int n2) {
        this.archive = object;
        this.capacity = n;
        this.remaining = this.capacity * -1;
        this.brightness = d;
        this.textureSize = n2;
        object = abstractArchive.getGroupFileIds(0);
        n2 = ((Object)object).length;
        this.textures = new Texture[abstractArchive.getGroupFileCount(0)];
        n = 0;
        while (n < n2) {
            Buffer buffer = new Buffer(abstractArchive.takeFile(0, (int)object[n]));
            this.textures[object[n]] = new Texture(buffer);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="ac")
    public int method7790(int n) {
        Texture[] arrtexture = this.textures;
        int n2 = 0;
        int n3 = 0;
        n = 0;
        while (true) {
            int n4;
            int n5;
            block8: {
                if (n2 >= arrtexture.length) {
                    if (n3 == 0) {
                        return 0;
                    }
                    n = n * 100 / n3;
                    return n;
                }
                Object object = arrtexture[n2];
                n5 = n3;
                n4 = n;
                if (object != null) {
                    if (((Texture)object).fileIds != null) {
                        n5 = ((Texture)object).fileIds.length + n3;
                        object = ((Texture)object).fileIds;
                        n4 = 0;
                        while (true) {
                            if (n4 >= ((Object)object).length) {
                                n4 = n;
                                break block8;
                            }
                            Object object2 = object[n4];
                            n3 = n;
                            if (this.archive.method6152((int)object2)) {
                                n3 = n + 1;
                            }
                            ++n4;
                            n = n3;
                        }
                    }
                    n5 = n3;
                    n4 = n;
                }
            }
            ++n2;
            n3 = n5;
            n = n4;
        }
    }

    @Override
    @ObfuscatedName(value="ae")
    public int[][] vmethod7792(int n) {
        int[][] arrarrn = new int[this.textures.length][];
        n = 0;
        while (n < this.textures.length) {
            Texture texture = this.textures[n];
            if (texture != null) {
                if (!texture.load(this.brightness, this.textureSize, this.archive)) {
                    return null;
                }
                arrarrn[n] = Arrays.copyOf(texture.pixels, texture.pixels.length);
            }
            ++n;
        }
        return arrarrn;
    }

    @Override
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1233740405")
    public boolean vmethod7795(int n) {
        boolean bl = this.textures[n].field4671;
        return bl;
    }

    @Override
    @ObfuscatedName(value="aj")
    public int vmethod7797(int n) {
        n = this.textures.length;
        return n;
    }

    @Override
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="-1621376207")
    public boolean vmethod7806(int n) {
        n = this.textureSize * 1671854615;
        return n * 2144624039 == 64;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(II)[I", garbageValue="-1677775504")
    @Export(value="getTexturePixels")
    public int[] getTexturePixels(int n) {
        Texture texture = this.textures[n];
        if (texture == null) return null;
        if (texture.pixels != null) {
            this.deque.addLast(texture);
            texture.isLoaded = true;
            return texture.pixels;
        }
        if (!texture.load(this.brightness, this.textureSize, this.archive)) return null;
        if (this.remaining * -1 == 0) {
            ((Texture)this.deque.method4095()).reset();
        } else {
            ++this.remaining;
        }
        this.deque.addLast(texture);
        texture.isLoaded = true;
        return (Texture)texture.pixels;
    }

    @Override
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II)Lbv;", garbageValue="333981641")
    public Texture vmethod7798(int n) {
        Texture texture = this.textures[n];
        return texture;
    }

    @Override
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="2008772377")
    @Export(value="getAverageTextureRGB")
    public int getAverageTextureRGB(int n) {
        if (this.textures[n] == null) {
            return 0;
        }
        n = this.textures[n].averageRGB;
        return n;
    }

    @ObfuscatedName(value="bi")
    public void method7818(int n, int n2) {
        n2 = 0;
        while (n2 < this.textures.length) {
            Texture texture = this.textures[n2];
            if (texture != null && texture.field4664 != 0) {
                texture.animate(n);
            }
            ++n2;
        }
        return;
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(IIIZII)J", garbageValue="48699086")
    @Export(value="calculateTag")
    public static long calculateTag(int n, int n2, int n3, boolean bl, int n4) {
        long l;
        long l2 = l = (long)((n & 0x7F) << 0 | (n2 & 0x7F) << 7 | (n3 & 3) << 14) | ((long)n4 & 0xFFFFFFFFL) << 17;
        if (bl) {
            l2 = l | 0x10000L;
        }
        return l2;
    }
}

