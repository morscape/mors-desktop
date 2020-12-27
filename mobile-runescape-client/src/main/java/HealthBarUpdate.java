/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="ii")
@Implements(value="HealthBarUpdate")
public class HealthBarUpdate
extends Node {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=1211494055)
    int field6167;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=166824497)
    int field6168;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=496001411)
    @Export(value="cycle")
    int cycle;
    @ObfuscatedName(value="ax")
    int field6170;

    @ObfuscatedName(value="ac")
    static int method11219(int n) {
        if (Client.archiveLoaders != null) {
            if (Client.field4984 < Client.archiveLoaders.size()) {
                int n2 = 0;
                n = 0;
                while (true) {
                    if (n2 <= Client.field4984) {
                        n += ((ArchiveLoader)Client.archiveLoaders.get((int)n2)).field3434;
                    } else {
                        n = n * 10000 / Client.field4993;
                        return n;
                    }
                    ++n2;
                }
            }
        } else {
            return 10000;
        }
        return 10000;
    }
}

