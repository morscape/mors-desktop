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
import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mi")
@Implements(value="Buffer")
public class Buffer
extends Node {
    @ObfuscatedName(value="ah")
    @Export(value="crc32Table")
    static int[] crc32Table = new int[256];
    @ObfuscatedName(value="aj")
    @Export(value="crc64Table")
    static long[] crc64Table;
    @ObfuscatedName(value="ai")
    @Export(value="array")
    public byte[] array;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=1792371615)
    @Export(value="offset")
    public int offset;

    static {
        int n = 0;
        while (true) {
            int n2;
            if (n < 256) {
                n2 = n;
            } else {
                crc64Table = new long[256];
                n = 0;
                while (true) {
                    long l;
                    if (n < 256) {
                        l = n;
                    } else {
                        return;
                    }
                    for (n2 = 0; n2 < 8; ++n2) {
                        if ((l & 1L) == 1L) {
                            l = l >>> 1 ^ 0xC96C5795D7870F42L;
                            continue;
                        }
                        l >>>= 1;
                    }
                    Buffer.crc64Table[n] = l;
                    ++n;
                }
            }
            for (int i = 0; i < 8; ++i) {
                if ((n2 & 1) == 1) {
                    n2 = n2 >>> 1 ^ 0xEDB88320;
                    continue;
                }
                n2 >>>= 1;
            }
            Buffer.crc32Table[n] = n2;
            ++n;
        }
    }

    public Buffer(int n) {
        this.array = class105.ByteArrayPool_getArray(n);
        this.offset = 0;
    }

    public Buffer(byte[] arrby) {
        this.array = arrby;
        this.offset = 0;
    }

    @ObfuscatedName(value="aa")
    @Export(value="writeLong")
    public void writeLong(long l) {
        byte[] arrby = this.array;
        int n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 56);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 48);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 40);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 32);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 24);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 16);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 8);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)l;
    }

    @ObfuscatedName(value="ac")
    public int method11635(int n) {
        this.offset -= -2;
        n = this.array[this.offset - 2];
        int n2 = this.array[this.offset - 1];
        n = n2 = (n2 & 0xFF) + ((n & 0xFF) << 8);
        if (n2 > 32767) {
            n = n2 - 65536;
        }
        return n;
    }

    @ObfuscatedName(value="ag")
    public int method11637(int n) {
        this.offset -= -2;
        n = this.array[this.offset - 2];
        byte by = this.array[this.offset - 1];
        return (by & 0xFF) + ((n & 0xFF) << 8);
    }

    @ObfuscatedName(value="ah")
    public void method11638(int n, byte by) {
        byte[] arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 8);
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)n;
    }

    @ObfuscatedName(value="aj")
    public void method11640(int n, byte by) {
        byte[] arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 24);
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 16);
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 8);
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)n;
    }

    @ObfuscatedName(value="al")
    public void method11641(long l) {
        byte[] arrby = this.array;
        int n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 40);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 32);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 24);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 16);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)(l >> 8);
        arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        arrby[n * 1792371615 - 1] = (byte)l;
    }

    @ObfuscatedName(value="aq")
    public void method11645(String object, byte by) {
        if (((String)object).indexOf(0) < 0) {
            this.offset += class275.method8377((CharSequence)object, 0, ((String)object).length(), this.array, this.offset, (byte)5);
        } else {
            throw new IllegalArgumentException("");
        }
        object = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        object[by * 1792371615 - 1] = false;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="360904799")
    @Export(value="writeSmartByteShort")
    public void writeSmartByteShort(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        this.array[this.offset - n - 4] = (byte)(n >> 24);
        this.array[this.offset - n - 3] = (byte)(n >> 16);
        this.array[this.offset - n - 2] = (byte)(n >> 8);
        this.array[this.offset - n - 1] = (byte)n;
    }

    @ObfuscatedName(value="as")
    public void method11647(int n, int n2) {
        byte[] arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)(n >> 16);
        arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)(n >> 8);
        arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)n;
    }

    @ObfuscatedName(value="au")
    public int method11649(int n) {
        this.offset += 3;
        n = this.array[this.offset - 1];
        byte by = this.array[this.offset - 3];
        byte by2 = this.array[this.offset - 2];
        return ((by & 0xFF) << 16) + (n & 0xFF) + ((by2 & 0xFF) << 8);
    }

    @ObfuscatedName(value="ay")
    public void method11653(byte[] arrby, int n, int n2, int n3) {
        n3 = n;
        while (n3 < n2 + n) {
            byte[] arrby2 = this.array;
            int n4 = this.offset * 1897459807 + 1897459807;
            this.offset = n4 * 1792371615;
            arrby2[n4 * 1792371615 - 1] = arrby[n3];
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="bd")
    public int method11658(int n) {
        int n2 = 0;
        n = this.method11665(-444967179);
        while (true) {
            if (n == 32767) {
                n2 += 32767;
            } else {
                return n2 + n;
            }
            n = this.method11665(1755166875);
        }
    }

    @ObfuscatedName(value="be")
    public void method11659(int[] arrn, int n) {
        int n2 = this.offset / 8;
        this.offset = 0;
        n = 0;
        while (n < n2) {
            int n3 = this.method11670(1604085085);
            int n4 = this.method11670(1604085085);
            int n5 = 0;
            for (int i = 32; i > 0; --i) {
                n3 = (n4 + (n4 << 4 ^ n4 >>> 5) ^ n5 + arrn[n5 & 3]) + n3;
                n4 += n3 + (n3 << 4 ^ n3 >>> 5) ^ arrn[(n5 -= 1640531527) >>> 11 & 3] + n5;
            }
            this.offset += -8;
            this.method11640(n3, (byte)16);
            this.method11640(n4, (byte)16);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="bg")
    public boolean method11661(int n) {
        n = this.method11650(2023137262);
        return (n & 1) == 1;
    }

    @ObfuscatedName(value="bh")
    public String method11662(int n) {
        int n2;
        byte[] arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        if (arrby[n * 1792371615 - 1] != 0) {
            throw new IllegalStateException("");
        }
        n = this.offset;
        do {
            arrby = this.array;
            n2 = this.offset * 1897459807 + 1897459807;
            this.offset = n2 * 1792371615;
        } while (arrby[n2 * 1792371615 - 1] != 0);
        n2 = this.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        return class45.method3635(this.array, n, n2, -38952898);
    }

    @ObfuscatedName(value="bj")
    public String method11664(int n) {
        int n2;
        Object object;
        n = this.offset;
        do {
            object = this.array;
            n2 = this.offset * 1897459807 + 1897459807;
            this.offset = n2 * 1792371615;
        } while (object[n2 * 1792371615 - 1] != 0);
        n2 = this.offset - n - 1;
        if (n2 == 0) {
            return "";
        }
        object = class45.method3635(this.array, n, n2, 772739920);
        return object;
    }

    @ObfuscatedName(value="bm")
    public void method11667(int[] arrn, int n) {
        int n2 = this.offset / 8;
        n = 0;
        this.offset = 0;
        while (n < n2) {
            int n3 = this.method11670(1604085085);
            int n4 = this.method11670(1604085085);
            int n5 = -957401312;
            for (int i = 32; i > 0; --i) {
                n3 -= (n4 -= n3 + (n3 << 4 ^ n3 >>> 5) ^ arrn[n5 >>> 11 & 3] + n5) + (n4 << 4 ^ n4 >>> 5) ^ (n5 += 1640531527) + arrn[n5 & 3];
            }
            this.offset += -8;
            this.method11640(n3, (byte)16);
            this.method11640(n4, (byte)16);
            ++n;
        }
        return;
    }

    @ObfuscatedName(value="bp")
    public int method11670(int n) {
        this.offset -= -4;
        n = this.array[this.offset - 3];
        byte by = this.array[this.offset - 4];
        byte by2 = this.array[this.offset - 2];
        byte by3 = this.array[this.offset - 1];
        return (by3 & 0xFF) + ((by & 0xFF) << 24) + ((by2 & 0xFF) << 8) + ((n & 0xFF) << 16);
    }

    @ObfuscatedName(value="bq")
    public void method11671(byte[] arrby, int n, int n2, int n3) {
        n3 = n;
        while (n3 < n2 + n) {
            byte[] arrby2 = this.array;
            int n4 = this.offset * 1897459807 + 1897459807;
            this.offset = n4 * 1792371615;
            arrby[n3] = arrby2[n4 * 1792371615 - 1];
            ++n3;
        }
        return;
    }

    @ObfuscatedName(value="br")
    public int method11672(int n) {
        if ((this.array[this.offset] & 0xFF) < 128) {
            return this.method11650(-1209462487) - 64;
        }
        n = this.method11637(1913969381);
        return n - 49152;
    }

    @ObfuscatedName(value="bt")
    public int method11674(int n) {
        byte[] arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        int n2 = arrby[n * 1792371615 - 1];
        n = 0;
        while (n2 < 0) {
            n = (n2 & 0x7F | n) << 7;
            arrby = this.array;
            n2 = this.offset * 1897459807 + 1897459807;
            this.offset = n2 * 1792371615;
            n2 = arrby[n2 * 1792371615 - 1];
        }
        return n2 | n;
    }

    @ObfuscatedName(value="bx")
    public void method11678(BigInteger object, BigInteger bigInteger, byte by) {
        by = (byte)this.offset;
        this.offset = 0;
        byte[] arrby = new byte[by];
        this.method11671(arrby, 0, by, 360763361);
        object = new BigInteger(arrby).modPow((BigInteger)object, bigInteger).toByteArray();
        this.offset = 0;
        this.method11638(((Object)object).length, (byte)-4);
        this.method11653((byte[])object, 0, ((Object)object).length, 1815651413);
    }

    @ObfuscatedName(value="ad")
    public byte method11636(int n) {
        byte[] arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        byte by = arrby[n * 1792371615 - 1];
        return by;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-33")
    @Export(value="releaseArray")
    public void releaseArray() {
        if (this.array != null) {
            class72.method4137(this.array, (byte)1);
        }
        this.array = null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1884809063")
    @Export(value="writeVarInt")
    public void writeVarInt(int n) {
        if ((n & 0xFFFFFF80) != 0) {
            if ((n & 0xFFFFC000) != 0) {
                if ((0xFFE00000 & n) != 0) {
                    if ((0xF0000000 & n) != 0) {
                        this.method11652(n >>> 28 | 0x80, 422009005);
                    }
                    this.method11652(n >>> 21 | 0x80, 422009005);
                }
                this.method11652(n >>> 14 | 0x80, 422009005);
            }
            this.method11652(n >>> 7 | 0x80, 422009005);
        }
        this.method11652(n & 0x7F, 422009005);
    }

    @ObfuscatedName(value="av")
    public int method11650(int n) {
        byte[] arrby = this.array;
        n = this.offset * 1897459807 + 1897459807;
        this.offset = n * 1792371615;
        n = arrby[n * 1792371615 - 1];
        return n & 0xFF;
    }

    @ObfuscatedName(value="ax")
    public void method11652(int n, int n2) {
        byte[] arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)n;
    }

    @ObfuscatedName(value="bc")
    public int method11657(int n) {
        if (this.array[this.offset] < 0) {
            return this.method11670(1604085085) & Integer.MAX_VALUE;
        }
        n = this.method11637(1464310399);
        return n;
    }

    @ObfuscatedName(value="bi")
    public long method11663(byte by) {
        long l = this.method11670(1604085085);
        by = (byte)this.method11670(1604085085);
        return (0xFFFFFFFFL & (long)by) + ((l & 0xFFFFFFFFL) << 32);
    }

    @ObfuscatedName(value="bu")
    public void method11675(int n, int n2) {
        byte[] arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)(0 - n);
    }

    @ObfuscatedName(value="bv")
    public void method11676(int[] arrn, int n, int n2, int n3) {
        int n4 = this.offset * 1897459807;
        this.offset = n;
        int n5 = (n2 - n) / 8;
        n = 0;
        while (true) {
            if (n >= n5) {
                this.offset = n4 * 1792371615;
                return;
            }
            n3 = this.method11670(1604085085);
            n2 = this.method11670(1604085085);
            int n6 = -957401312;
            for (int i = 32; i > 0; --i) {
                n3 -= (n2 -= (n3 << 4 ^ n3 >>> 5) + n3 ^ arrn[n6 >>> 11 & 3] + n6) + (n2 << 4 ^ n2 >>> 5) ^ (n6 += 1640531527) + arrn[n6 & 3];
            }
            this.offset += -8;
            this.method11640(n3, (byte)16);
            this.method11640(n2, (byte)16);
            ++n;
        }
    }

    @ObfuscatedName(value="bz")
    public int method11680(byte by) {
        if (this.array[this.offset] < 0) {
            return this.method11670(1604085085) & Integer.MAX_VALUE;
        }
        by = (byte)this.method11637(1588305768);
        if (by == 32767) {
            return -1;
        }
        return by;
    }

    @ObfuscatedName(value="cd")
    public void method11683(int n, int n2) {
        byte[] arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)(n + 128);
        arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)(n >> 8);
    }

    @ObfuscatedName(value="cn")
    public void method11692(int n, byte by) {
        byte[] arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)n;
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 8);
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 16);
        arrby = this.array;
        by = (byte)(this.offset * 1897459807 + 1897459807);
        this.offset = by * 1792371615;
        arrby[by * 1792371615 - 1] = (byte)(n >> 24);
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="1506715070")
    @Export(value="readStringCp1252NullTerminatedOrNull")
    public String readStringCp1252NullTerminatedOrNull() {
        if (this.array[this.offset] == 0) {
            ++this.offset;
        } else {
            String string2 = this.method11664(-1864380673);
            return string2;
        }
        return null;
    }

    @ObfuscatedName(value="bk")
    public int method11665(int n) {
        if ((this.array[this.offset] & 0xFF) < 128) {
            return this.method11650(-1775117153);
        }
        n = this.method11637(114250429);
        return n - 32768;
    }
}

