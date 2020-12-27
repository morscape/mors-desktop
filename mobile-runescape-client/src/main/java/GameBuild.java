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

@ObfuscatedName(value="fd")
@Implements(value="GameBuild")
public class GameBuild {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfd;")
    @Export(value="BUILDLIVE")
    static final GameBuild BUILDLIVE;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lfd;")
    @Export(value="RC")
    static final GameBuild RC;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfd;")
    @Export(value="LIVE")
    static final GameBuild LIVE;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lfd;")
    @Export(value="WIP")
    static final GameBuild WIP;
    @ObfuscatedName(value="ge")
    @ObfuscatedSignature(descriptor="[Lek;")
    static class384[] field2491;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=2026339885)
    static int field2490;
    @ObfuscatedName(value="ah")
    @Export(value="name")
    public final String name;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=506924087)
    @Export(value="buildId")
    final int buildId;

    static {
        LIVE = new GameBuild("LIVE", 0);
        BUILDLIVE = new GameBuild("BUILDLIVE", 3);
        RC = new GameBuild("RC", 1);
        WIP = new GameBuild("WIP", 2);
    }

    GameBuild(String string2, int n) {
        this.name = string2;
        this.buildId = n;
    }
}

