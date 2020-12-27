/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mj")
@Implements(value="PacketBuffer")
public class PacketBuffer
extends Buffer {
    @ObfuscatedName(value="ab")
    static final int[] field7279 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, Integer.MAX_VALUE, -1};
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lmk;")
    @Export(value="isaacCipher")
    class189 isaacCipher;

    public PacketBuffer(int n) {
        super(n);
    }

    @ObfuscatedName(value="jv")
    public void method13790(int n, int n2) {
        byte[] arrby = this.array;
        n2 = this.offset * 1897459807 + 1897459807;
        this.offset = n2 * 1792371615;
        arrby[n2 * 1792371615 - 1] = (byte)(n + this.isaacCipher.method6643((byte)64));
    }

    @ObfuscatedName(value="jw")
    @ObfuscatedSignature(descriptor="(Lmk;I)V", garbageValue="-494129389")
    @Export(value="setIsaacCipher")
    public void setIsaacCipher(class189 class1892) {
        this.isaacCipher = class1892;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ak")
    public static boolean method13784(byte var0) {
        block34: {
            block35: {
                block37: {
                    block36: {
                        var5_1 = class363.currentTimeMillis();
                        var1_2 = (int)(var5_1 - NetCache.field3722);
                        NetCache.field3722 = var5_1;
                        var0 = (byte)var1_2;
                        if (var1_2 > 200) {
                            var0 = (byte)200;
                        }
                        NetCache.NetCache_loadTime = var0 + NetCache.NetCache_loadTime;
                        if (NetCache.field3734 * -1 == 0 && NetCache.field3719 == 0 && NetCache.NetCache_pendingWritesCount == 0 && NetCache.field3714 * -1 == 0) {
                            return true;
                        }
                        var8_3 = NetCache.NetCache_socket;
                        if (var8_3 == null) {
                            return false;
                        }
                        try {
                            if (NetCache.NetCache_loadTime > 30000) throw new IOException();
                            while (++NetCache.field3719 < 200 && ++NetCache.field3714 * -1 > 0) {
                                var8_3 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.first();
                                var9_7 = new Buffer(4);
                                var9_7.method11652(1, 422009005);
                                var9_7.method11647((int)var8_3.key, -741897054);
                                NetCache.NetCache_socket.write(var9_7.array, 0, 4);
                                NetCache.NetCache_pendingPriorityResponses.put((Node)var8_3, var8_3.key);
                            }
                            while (--NetCache.field3734 * -1 < 200 && --NetCache.NetCache_pendingWritesCount > 0) {
                                var8_3 = (NetFileRequest)NetCache.NetCache_pendingWritesQueue.removeLast();
                                var9_7 = new Buffer(4);
                                var9_7.method11652(0, 422009005);
                                var9_7.method11647((int)var8_3.key, -138718218);
                                NetCache.NetCache_socket.write(var9_7.array, 0, 4);
                                var8_3.removeDual();
                                NetCache.NetCache_pendingResponses.put((Node)var8_3, var8_3.key);
                            }
                            var1_2 = 0;
lbl33:
                            // 2 sources

                            while (true) {
                                block42: {
                                    block41: {
                                        block40: {
                                            block39: {
                                                block38: {
                                                    if (var1_2 >= 100) return true;
                                                    var2_8 = NetCache.NetCache_socket.vmethod12093();
                                                    if (var2_8 < 0) throw new IOException();
                                                    if (var2_8 == 0) {
                                                        return true;
                                                    }
                                                    NetCache.NetCache_loadTime = 0;
                                                    var0 = NetCache.NetCache_currentResponse == null ? (byte)8 : (NetCache.field3732 == 0 ? 1 : 0);
                                                    if (var0 <= 0) break block38;
                                                    var3_9 = var0 - NetCache.field3727.offset;
                                                    if (var3_9 <= var2_8) break block39;
                                                    break block40;
                                                }
                                                var4_10 = class82.field2629.array.length - NetCache.NetCache_currentResponse.padding;
                                                var3_9 = 512 - NetCache.field3732;
                                                var0 = (byte)var3_9;
                                                if (var3_9 <= var4_10 - class82.field2629.offset) break block41;
                                                var0 = (byte)(var4_10 - class82.field2629.offset);
                                                break block41;
                                            }
                                            var2_8 = var3_9;
                                        }
                                        NetCache.NetCache_socket.read(NetCache.field3727.array, NetCache.field3727.offset, var2_8);
                                        if (NetCache.field3733 != 0) {
                                            for (var3_9 = 0; var3_9 < var2_8; ++var3_9) {
                                                var8_3 = NetCache.field3727.array;
                                                var4_10 = var3_9 + NetCache.field3727.offset;
                                                var8_3[var4_10] = (byte)(var8_3[var4_10] ^ NetCache.field3733);
                                            }
                                        }
                                        var8_3 = NetCache.field3727;
                                        var8_3.offset = var2_8 + var8_3.offset;
                                        if (NetCache.field3727.offset < var0) {
                                            return true;
                                        }
                                        if (NetCache.NetCache_currentResponse != null) {
                                            if (NetCache.field3732 == 0) {
                                                if (NetCache.field3727.array[0] == -1) {
                                                    NetCache.field3732 = 1;
                                                    NetCache.field3727.offset = 0;
                                                } else {
                                                    NetCache.NetCache_currentResponse = null;
                                                }
                                            }
                                        } else {
                                            NetCache.field3727.offset = 0;
                                            var0 = (byte)NetCache.field3727.method11650(-1870397475);
                                            var4_10 = NetCache.field3727.method11637(1237373365);
                                            var2_8 = NetCache.field3727.method11650(-1781195120);
                                            var3_9 = NetCache.field3727.method11670(1604085085);
                                            var5_1 = var4_10 + (var0 << 16);
                                            var9_7 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var5_1);
                                            NetCache.field3730 = true;
                                            var8_3 = var9_7;
                                            if (var9_7 == null) {
                                                var8_3 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var5_1);
                                                NetCache.field3730 = false;
                                            }
                                            if (var8_3 == null) throw new IOException();
                                            var0 = var2_8 == 0 ? (byte)5 : (byte)9;
                                            NetCache.NetCache_currentResponse = var8_3;
                                            class82.field2629 = new Buffer(var0 + var3_9 + NetCache.NetCache_currentResponse.padding);
                                            class82.field2629.method11652(var2_8, 422009005);
                                            class82.field2629.method11640(var3_9, (byte)16);
                                            NetCache.field3732 = 8;
                                            NetCache.field3727.offset = 0;
                                        }
                                        break block34;
                                    }
                                    if (var0 <= var2_8) {
                                        var2_8 = var0;
                                    }
                                    NetCache.NetCache_socket.read(class82.field2629.array, class82.field2629.offset, var2_8);
                                    if (NetCache.field3733 != 0) {
                                        for (var0 = 0; var0 < var2_8; var0 = (byte)(var0 + 1)) {
                                            var8_3 = class82.field2629.array;
                                            var3_9 = var0 + class82.field2629.offset;
                                            var8_3[var3_9] = (byte)(var8_3[var3_9] ^ NetCache.field3733);
                                        }
                                    }
                                    var8_3 = class82.field2629;
                                    var8_3.offset = var2_8 + var8_3.offset;
                                    NetCache.field3732 = var2_8 + NetCache.field3732;
                                    if (var4_10 != class82.field2629.offset) break block42;
                                    if (0xFF00FFL == NetCache.NetCache_currentResponse.key) {
                                        class189.NetCache_reference = class82.field2629;
                                        var0 = 0;
                                        break block35;
                                    }
                                    NetCache.field3717.reset();
                                    NetCache.field3717.update(class82.field2629.array, 0, var4_10);
                                    var0 = (byte)NetCache.field3717.getValue();
                                    var2_8 = NetCache.NetCache_currentResponse.crc * -733083349;
                                    if (var0 != var2_8 * 1568566659) {
                                        NetCache.NetCache_socket.close();
                                        break block36;
                                    }
                                    NetCache.field3737 = 0;
                                    NetCache.field3736 = 0;
                                    var8_3 = NetCache.NetCache_currentResponse.archive;
                                    var0 = (byte)(NetCache.NetCache_currentResponse.key & 65535L);
                                    var9_7 = class82.field2629.array;
                                    var7_11 = (NetCache.NetCache_currentResponse.key & 0xFF0000L) == 0xFF0000L;
                                    var8_3.write(var0, (byte[])var9_7, var7_11, NetCache.field3730);
                                    ** GOTO lbl-1000
                                }
                                if (NetCache.field3732 != 512) return true;
                                NetCache.field3732 = 0;
                                break block34;
                                break;
                            }
                        }
                        catch (IOException var8_4) {}
                        try {
                            NetCache.NetCache_socket.close();
                            break block37;
                        }
                        catch (Exception var8_6) {}
                        catch (Exception var8_5) {}
                    }
                    NetCache.field3737 -= -1;
                    NetCache.NetCache_socket = null;
                    NetCache.field3733 = (byte)(Math.random() * 255.0 + 1.0);
                    return false;
                }
                --NetCache.field3736;
                NetCache.NetCache_socket = null;
                return false;
            }
            while (true) {
                if (var0 < 256) {
                    var8_3 = NetCache.NetCache_archives[var0];
                    if (var8_3 != null) {
                        class189.NetCache_reference.offset = var0 * 8 + 5;
                        var8_3.loadIndex(class189.NetCache_reference.method11670(1604085085), class189.NetCache_reference.method11670(1604085085));
                    }
                } else lbl-1000:
                // 2 sources

                {
                    NetCache.NetCache_currentResponse.remove();
                    if (NetCache.field3730) {
                        --NetCache.field3719;
                    } else {
                        ++NetCache.field3734;
                    }
                    NetCache.field3732 = 0;
                    NetCache.NetCache_currentResponse = null;
                    class82.field2629 = null;
                    break;
                }
                var0 = (byte)(var0 + 1);
            }
        }
        ++var1_2;
        ** while (true)
    }
}

