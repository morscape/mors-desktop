/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="oq")
public class class233 {
    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(IZZZI)Lkv;", garbageValue="-144332757")
    @Export(value="newArchive")
    static Archive newArchive(int n, boolean bl, boolean bl2, boolean bl3) {
        Object object = null;
        if (class197.JagexCache_dat2File != null) {
            object = new ArchiveDisk(n, class197.JagexCache_dat2File, FontName.JagexCache_idxFiles[n], 1000000);
        }
        object = new Archive((ArchiveDisk)object, class45.masterDisk, n, bl, bl2, bl3);
        return object;
    }
}

