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

@ObfuscatedName(value="cm")
public class class42 {
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-2110677765)
    int field618;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=130073727)
    int field619;
    @ObfuscatedName(value="ak")
    String field620;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lcx;")
    WorldMapLabelSize field621;

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IILcx;)V")
    class42(String string2, int n, int n2, WorldMapLabelSize worldMapLabelSize) {
        this.field620 = string2;
        this.field618 = n;
        this.field619 = n2;
        this.field621 = worldMapLabelSize;
    }
}

