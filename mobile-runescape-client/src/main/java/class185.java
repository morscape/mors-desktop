/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="md")
public class class185 {
    @ObfuscatedName(value="ai")
    static Hashtable field3841 = new Hashtable(16);
    @ObfuscatedName(value="ak")
    static boolean field3842 = false;

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="1102148860")
    public static void method6620(boolean bl) {
        if (bl != class69.ItemDefinition_inMembersWorld) {
            class301.method11038();
            class69.ItemDefinition_inMembersWorld = bl;
        }
    }

    @ObfuscatedName(value="ai")
    static void method6623(File file, byte by) {
        try {
            if (file.exists()) {
                class197.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
                return;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            by = (byte)randomAccessFile.read();
            randomAccessFile.seek(0L);
            randomAccessFile.write(by);
            randomAccessFile.seek(0L);
            randomAccessFile.close();
            class197.JagexCache_randomDat = new BufferedFile(new AccessFile(file, "rw", 25L), 24, 0);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ax")
    public static byte[] method6628(int n) {
        byte[] arrby;
        block6: {
            arrby = new byte[24];
            int n2 = 0;
            try {
                class197.JagexCache_randomDat.seek(0L);
                class197.JagexCache_randomDat.readFully(arrby);
                break block6;
            }
            catch (Exception exception) {
                n = n2;
            }
            while (true) {
                if (n >= 24) {
                    return arrby;
                }
                arrby[n] = -1;
                ++n;
            }
        }
        for (n = 0; n < 24 && arrby[n] == 0; ++n) {
        }
        if (n >= 24) {
            throw new IOException();
        }
        return arrby;
    }
}

