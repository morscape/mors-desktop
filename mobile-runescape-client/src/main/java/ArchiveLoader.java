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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="io")
@Implements(value="ArchiveLoader")
public class ArchiveLoader {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkv;")
    @Export(value="archive")
    final Archive archive;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1354955243)
    final int field3433;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1210357227)
    int field3434 = 0;

    @ObfuscatedSignature(descriptor="(Lkv;Ljava/lang/String;)V")
    ArchiveLoader(Archive archive, String string2) {
        this.archive = archive;
        this.field3433 = archive.method6156(-1831462396);
    }

    @ObfuscatedName(value="ak")
    boolean method5527(int n) {
        boolean bl = false;
        this.field3434 = 0;
        n = 0;
        while (true) {
            block3: {
                block4: {
                    block2: {
                        if (n >= this.field3433) break block2;
                        if (this.archive.method11560(n) && !this.archive.method11544(n)) break block3;
                        break block4;
                    }
                    n = this.field3434 * 32773437;
                    int n2 = this.field3433 * 1044879677;
                    if (n * -1210357227 >= n2 * -1354955243) {
                        bl = true;
                    }
                    return bl;
                }
                ++this.field3434;
            }
            ++n;
        }
    }
}

