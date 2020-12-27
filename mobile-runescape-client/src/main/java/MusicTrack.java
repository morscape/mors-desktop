/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lm")
@Implements(value="MusicTrack")
public class MusicTrack
extends Node {
    @ObfuscatedName(value="ae")
    @Export(value="midi")
    byte[] midi;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="table")
    NodeHashTable table;

    @ObfuscatedSignature(descriptor="(Lmi;)V")
    MusicTrack(Buffer buffer) {
        buffer.offset = buffer.array.length - 3;
        int n = buffer.method11650(392141033);
        int n2 = buffer.method11637(838081984);
        buffer.offset = 0;
        int n3 = n * 10 + 14;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        block0: while (true) {
            int n13;
            int n14;
            int n15;
            block77: {
                int n16;
                if (n4 < n) break block77;
                int n17 = n6 + n7;
                int n18 = buffer.offset;
                n4 = n + n5 + n8 + n6 + n7 + n9 + n11 + n10 + n12;
                for (n15 = 0; n15 < n4; ++n15) {
                    buffer.method11674(-1802465640);
                }
                int n19 = buffer.offset * 1897459807;
                int n20 = buffer.offset;
                int n21 = n12;
                int n22 = 0;
                int n23 = 0;
                int n24 = 0;
                int n25 = 0;
                int n26 = 0;
                int n27 = 0;
                int n28 = 0;
                int n29 = 0;
                int n30 = 0;
                int n31 = 0;
                n14 = 0;
                n13 = 0;
                n15 = 0;
                n4 = n8;
                for (n16 = 0; n16 < n4; ++n16) {
                    if ((n22 = n22 + buffer.method11650(1601051783) & 0x7F) != 0 && n22 != 32) {
                        if (n22 == 1) {
                            ++n24;
                            continue;
                        }
                        if (n22 == 33) {
                            ++n25;
                            continue;
                        }
                        if (n22 == 7) {
                            ++n26;
                            continue;
                        }
                        if (n22 == 39) {
                            ++n28;
                            continue;
                        }
                        if (n22 == 10) {
                            ++n27;
                            continue;
                        }
                        if (n22 == 42) {
                            ++n30;
                            continue;
                        }
                        if (n22 == 99) {
                            ++n31;
                            continue;
                        }
                        if (n22 == 98) {
                            ++n14;
                            continue;
                        }
                        if (n22 == 101) {
                            ++n13;
                            continue;
                        }
                        if (n22 == 100) {
                            ++n15;
                            continue;
                        }
                        if (n22 != 64 && n22 != 65 && n22 != 120 && n22 != 121 && n22 != 123) {
                            ++n29;
                            continue;
                        }
                        ++n23;
                        continue;
                    }
                    ++n21;
                }
                n4 = buffer.offset * 1897459807;
                n16 = buffer.offset = n23 + buffer.offset;
                buffer.offset = n10 + buffer.offset;
                int n32 = buffer.offset * 1897459807;
                n22 = n4 * 1792371615;
                buffer.offset = n11 + buffer.offset;
                int n33 = buffer.offset * 1897459807;
                n23 = buffer.offset * 1897459807;
                n4 = n9 * 1897459807;
                n23 = buffer.offset = (n23 + n4) * 1792371615;
                int n34 = n33 * 1792371615;
                n24 = buffer.offset = n24 + buffer.offset;
                n26 = buffer.offset = n26 + buffer.offset;
                int n35 = buffer.offset = n27 + buffer.offset;
                buffer.offset = n17 + n10 + buffer.offset;
                n33 = buffer.offset * 1897459807;
                buffer.offset = n6 + buffer.offset;
                int n36 = buffer.offset * 1897459807;
                n27 = buffer.offset = n29 + buffer.offset;
                buffer.offset = n7 + buffer.offset;
                int n37 = buffer.offset * 1897459807;
                buffer.offset = n25 + buffer.offset;
                n29 = buffer.offset * 1897459807;
                int n38 = n33 * 1792371615;
                n7 = buffer.offset = n28 + buffer.offset;
                n30 = buffer.offset = n30 + buffer.offset;
                int n39 = buffer.offset = n21 + buffer.offset;
                buffer.offset = (n4 + buffer.offset * 1897459807) * 1792371615;
                n6 = buffer.offset * 1897459807;
                buffer.offset = n31 + buffer.offset;
                n31 = buffer.offset * 1897459807;
                n6 *= 1792371615;
                n4 = buffer.offset = n14 + buffer.offset;
                n13 = buffer.offset = n13 + buffer.offset;
                n33 = buffer.offset = n15 + buffer.offset;
                buffer.offset = n5 * 3 + buffer.offset;
                this.midi = new byte[n5 * 5 + n3 + n11 + n12 + (n19 * 1792371615 - n18) + (n17 + n8 + n9 + n10) * 2];
                Buffer buffer2 = new Buffer(this.midi);
                buffer2.method11640(1297377380, (byte)16);
                buffer2.method11640(6, (byte)16);
                n12 = n > 1 ? 1 : 0;
                buffer2.method11638(n12, (byte)16);
                buffer2.method11638(n, (byte)-36);
                buffer2.method11638(n2, (byte)-48);
                buffer.offset = n18;
                int[] arrn = new int[128];
                n25 = n36 * 1792371615;
                n8 = n32 * 1792371615;
                n10 = n37 * 1792371615;
                n28 = n31 * 1792371615;
                int n40 = n29 * 1792371615;
                n32 = 0;
                n12 = 0;
                n36 = 0;
                n19 = 0;
                n3 = 0;
                n17 = 0;
                n5 = 0;
                n18 = 0;
                n37 = 0;
                n2 = 0;
                n11 = n13;
                n31 = n30;
                n15 = n7;
                n21 = n35;
                n13 = n26;
                n9 = n24;
                n14 = n22;
                n29 = n20;
                n7 = n40;
                n35 = n37;
                n24 = n5;
                n5 = n23;
                n26 = n3;
                n3 = n16;
                n16 = n27;
                n27 = n36;
                n20 = n32;
                n30 = n;
                block3: while (true) {
                    if (n20 < n30) {
                        buffer2.method11640(1297379947, (byte)16);
                        buffer2.offset -= -4;
                    } else {
                        return;
                    }
                    n36 = buffer2.offset;
                    n22 = n25;
                    n = n7;
                    n32 = n10;
                    n25 = n3;
                    n23 = n8;
                    n37 = -1;
                    n10 = n22;
                    n7 = n28;
                    n8 = n;
                    n3 = n32;
                    n28 = n26;
                    n26 = n23;
                    n22 = n27;
                    n23 = n37;
                    n = n36;
                    while (true) {
                        block88: {
                            block79: {
                                block81: {
                                    block83: {
                                        block85: {
                                            block87: {
                                                block86: {
                                                    block84: {
                                                        block82: {
                                                            block80: {
                                                                block78: {
                                                                    buffer2.writeVarInt(buffer.method11674(-563699364));
                                                                    byte[] arrby = buffer.array;
                                                                    n27 = n22 + 1;
                                                                    n32 = arrby[n22] & 0xFF;
                                                                    n22 = n32 != n23 ? 1 : 0;
                                                                    n23 = n32 & 0xF;
                                                                    if (n32 == 7) {
                                                                        if (n22 != 0) {
                                                                            buffer2.method11652(255, 422009005);
                                                                        }
                                                                        buffer2.method11652(47, 422009005);
                                                                        buffer2.method11652(0, 422009005);
                                                                        buffer2.writeSmartByteShort(buffer2.offset - n);
                                                                        ++n20;
                                                                        n32 = n26;
                                                                        n26 = n25;
                                                                        n25 = n3;
                                                                        n23 = n8;
                                                                        n22 = n7;
                                                                        n = n10;
                                                                        n8 = n32;
                                                                        n3 = n26;
                                                                        n26 = n28;
                                                                        n10 = n25;
                                                                        n7 = n23;
                                                                        n28 = n22;
                                                                        n25 = n;
                                                                        continue block3;
                                                                    }
                                                                    if (n32 == 23) {
                                                                        if (n22 != 0) {
                                                                            buffer2.method11652(255, 422009005);
                                                                        }
                                                                        buffer2.method11652(81, 422009005);
                                                                        buffer2.method11652(3, 422009005);
                                                                        arrby = buffer.array;
                                                                        n22 = n33 + 1;
                                                                        buffer2.method11652(arrby[n33], 422009005);
                                                                        arrby = buffer.array;
                                                                        n32 = n22 + 1;
                                                                        buffer2.method11652(arrby[n22], 422009005);
                                                                        arrby = buffer.array;
                                                                        n33 = n32 + 1;
                                                                        buffer2.method11652(arrby[n32], 422009005);
                                                                        n22 = n27;
                                                                        continue;
                                                                    }
                                                                    n19 ^= n32 >> 4;
                                                                    if (n23 != 0) break block78;
                                                                    if (n22 != 0) {
                                                                        buffer2.method11652(n19 + 144, 422009005);
                                                                    }
                                                                    break block79;
                                                                }
                                                                if (n23 != 1) break block80;
                                                                if (n22 != 0) {
                                                                    buffer2.method11652(n19 + 128, 422009005);
                                                                }
                                                                break block81;
                                                            }
                                                            if (n23 != 2) break block82;
                                                            if (n22 != 0) {
                                                                buffer2.method11652(n19 + 176, 422009005);
                                                            }
                                                            break block83;
                                                        }
                                                        if (n23 != 3) break block84;
                                                        if (n22 != 0) {
                                                            buffer2.method11652(n19 + 224, 422009005);
                                                        }
                                                        break block85;
                                                    }
                                                    if (n23 != 4) break block86;
                                                    if (n22 != 0) {
                                                        buffer2.method11652(n19 + 208, 422009005);
                                                    }
                                                    break block87;
                                                }
                                                if (n23 != 5) {
                                                    if (n23 == 6) {
                                                        if (n22 != 0) {
                                                            buffer2.method11652(n19 + 192, 422009005);
                                                        }
                                                    } else {
                                                        throw new RuntimeException();
                                                    }
                                                    buffer2.method11652(buffer.array[n31], 422009005);
                                                    ++n31;
                                                } else {
                                                    if (n22 != 0) {
                                                        buffer2.method11652(n19 + 160, 422009005);
                                                    }
                                                    buffer2.method11652((n28 += buffer.array[n21]) & 0x7F, 422009005);
                                                    buffer2.method11652((n2 += buffer.array[n25]) & 0x7F, 422009005);
                                                    ++n21;
                                                    ++n25;
                                                }
                                                break block88;
                                            }
                                            buffer2.method11652((n35 += buffer.array[n26]) & 0x7F, 422009005);
                                            ++n26;
                                            break block88;
                                        }
                                        n18 = (buffer.array[n34] << 7) + n18 + buffer.array[n39];
                                        buffer2.method11652(n18 & 0x7F, 422009005);
                                        buffer2.method11652(n18 >> 7 & 0x7F, 422009005);
                                        ++n39;
                                        ++n34;
                                        break block88;
                                    }
                                    n22 = n12 + buffer.array[n29] & 0x7F;
                                    buffer2.method11652(n22, 422009005);
                                    if (n22 != 0 && n22 != 32) {
                                        if (n22 == 1) {
                                            n12 = buffer.array[n5];
                                            ++n5;
                                        } else if (n22 == 33) {
                                            n12 = buffer.array[n3];
                                            ++n3;
                                        } else if (n22 == 7) {
                                            n12 = buffer.array[n9];
                                            ++n9;
                                        } else if (n22 == 39) {
                                            n12 = buffer.array[n8];
                                            ++n8;
                                        } else if (n22 == 10) {
                                            n12 = buffer.array[n13];
                                            ++n13;
                                        } else if (n22 == 42) {
                                            n12 = buffer.array[n15];
                                            ++n15;
                                        } else if (n22 == 99) {
                                            n12 = buffer.array[n6];
                                            ++n6;
                                        } else if (n22 == 98) {
                                            n12 = buffer.array[n7];
                                            ++n7;
                                        } else if (n22 == 101) {
                                            n12 = buffer.array[n4];
                                            ++n4;
                                        } else if (n22 == 100) {
                                            n12 = buffer.array[n11];
                                            ++n11;
                                        } else if (n22 != 64 && n22 != 65 && n22 != 120 && n22 != 121 && n22 != 123) {
                                            n12 = buffer.array[n10];
                                            ++n10;
                                        } else {
                                            n12 = buffer.array[n14];
                                            ++n14;
                                        }
                                    } else {
                                        n12 = buffer.array[n31];
                                        ++n31;
                                    }
                                    arrn[n22] = n12 += arrn[n22];
                                    buffer2.method11652(n12 & 0x7F, 422009005);
                                    ++n29;
                                    n12 = n22;
                                    break block88;
                                }
                                buffer2.method11652((n28 += buffer.array[n21]) & 0x7F, 422009005);
                                buffer2.method11652((n24 += buffer.array[n16]) & 0x7F, 422009005);
                                ++n21;
                                ++n16;
                                break block88;
                            }
                            buffer2.method11652((n28 += buffer.array[n21]) & 0x7F, 422009005);
                            buffer2.method11652((n17 += buffer.array[n38]) & 0x7F, 422009005);
                            ++n21;
                            ++n38;
                        }
                        n22 = n27;
                    }
                    break;
                }
            }
            n13 = n10;
            n15 = n7;
            n10 = n5;
            n7 = n3;
            n14 = -1;
            n3 = n13;
            n5 = n9;
            n9 = n15;
            n15 = n8;
            n8 = n6;
            n6 = n7;
            n13 = n14;
            while (true) {
                n14 = buffer.method11650(-1224915225);
                n7 = n6;
                if (n14 != n13) {
                    n7 = n6 + 1;
                }
                n13 = n14 & 0xF;
                if (n14 == 7) {
                    ++n4;
                    n6 = n10;
                    n13 = n9;
                    n9 = n5;
                    n10 = n3;
                    n3 = n7;
                    n5 = n6;
                    n6 = n8;
                    n7 = n13;
                    n8 = n15;
                    continue block0;
                }
                if (n14 == 23) {
                    ++n10;
                } else if (n13 == 0) {
                    ++n8;
                } else if (n13 == 1) {
                    ++n9;
                } else if (n13 == 2) {
                    ++n15;
                } else if (n13 == 3) {
                    ++n5;
                } else if (n13 == 4) {
                    ++n11;
                } else if (n13 == 5) {
                    ++n3;
                } else if (n13 == 6) {
                    ++n12;
                } else {
                    throw new RuntimeException();
                }
                n6 = n7;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ae")
    void method11605() {
        int n;
        if (this.table != null) {
            return;
        }
        this.table = new NodeHashTable(16);
        int[] arrn = new int[16];
        int[] arrn2 = new int[16];
        arrn2[9] = 128;
        arrn[9] = 128;
        MidiFileReader midiFileReader = new MidiFileReader(this.midi);
        int n2 = midiFileReader.trackCount();
        for (n = 0; n < n2; ++n) {
            midiFileReader.gotoTrack(n);
            midiFileReader.readTrackLength(n);
            midiFileReader.markTrackPosition(n);
        }
        block1: while (true) {
            n = midiFileReader.getPrioritizedTrack();
            n2 = midiFileReader.trackLengths[n];
            while (true) {
                int n3;
                if (n2 != midiFileReader.trackLengths[n]) continue block1;
                midiFileReader.gotoTrack(n);
                int n4 = midiFileReader.readMessage(n);
                if (n4 == 1) {
                    midiFileReader.setTrackDone();
                    midiFileReader.markTrackPosition(n);
                    if (midiFileReader.isDone()) return;
                    continue block1;
                }
                int n5 = n4 & 0xF0;
                if (n5 == 176) {
                    n3 = n4 & 0xF;
                    int n6 = n4 >> 8 & 0x7F;
                    int n7 = n4 >> 16 & 0x7F;
                    if (n6 == 0) {
                        arrn[n3] = (n7 << 14) + (arrn[n3] & 0xFFE03FFF);
                    }
                    if (n6 == 32) {
                        arrn[n3] = (arrn[n3] & 0xFFFFC07F) + (n7 << 7);
                    }
                }
                if (n5 == 192) {
                    n3 = n4 & 0xF;
                    arrn2[n3] = (n4 >> 8 & 0x7F) + arrn[n3];
                }
                if (n5 == 144 && (n4 >> 16 & 0x7F) > 0) {
                    n5 = arrn2[n4 & 0xF];
                    Object object = this.table;
                    long l = n5;
                    ByteArrayNode byteArrayNode = (ByteArrayNode)((NodeHashTable)object).get(l);
                    object = byteArrayNode;
                    if (byteArrayNode == null) {
                        object = new ByteArrayNode(new byte[128]);
                        this.table.put((Node)object, l);
                    }
                    object.byteArray[n4 >> 8 & 127] = 1;
                }
                midiFileReader.readTrackLength(n);
                midiFileReader.markTrackPosition(n);
            }
            break;
        }
    }

    @ObfuscatedName(value="ai")
    @Export(value="clear")
    void clear() {
        this.table = null;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;II)Llm;")
    @Export(value="readTrack")
    static MusicTrack readTrack(AbstractArchive object, int n, int n2) {
        if ((object = (Object)((AbstractArchive)object).takeFile(n, n2)) == null) {
            return null;
        }
        return new MusicTrack(new Buffer((byte[])object));
    }
}

