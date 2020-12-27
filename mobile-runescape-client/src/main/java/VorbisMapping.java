/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="gn")
@Implements(value="VorbisMapping")
public class VorbisMapping {
    @ObfuscatedName(value="ae")
    @Export(value="mappingMux")
    int mappingMux;
    @ObfuscatedName(value="ai")
    @Export(value="submapFloor")
    int[] submapFloor;
    @ObfuscatedName(value="ak")
    @Export(value="submaps")
    int submaps;
    @ObfuscatedName(value="ax")
    @Export(value="submapResidue")
    int[] submapResidue;

    VorbisMapping() {
        VorbisSample.readBits(16);
        int n = VorbisSample.readBit() != 0 ? VorbisSample.readBits(4) + 1 : 1;
        this.submaps = n;
        if (VorbisSample.readBit() != 0) {
            VorbisSample.readBits(8);
        }
        VorbisSample.readBits(2);
        if (this.submaps > 1) {
            this.mappingMux = VorbisSample.readBits(4);
        }
        this.submapFloor = new int[this.submaps];
        this.submapResidue = new int[this.submaps];
        for (n = 0; n < this.submaps; ++n) {
            VorbisSample.readBits(8);
            this.submapFloor[n] = VorbisSample.readBits(8);
            this.submapResidue[n] = VorbisSample.readBits(8);
        }
    }
}

