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

@ObfuscatedName(value="hq")
@Implements(value="FriendSystem")
public class FriendSystem {
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Leh;")
    @Export(value="friendsList")
    public final class285 friendsList;
    @ObfuscatedName(value="aj")
    int field3294 = 0;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Les;")
    @Export(value="ignoreList")
    public final class291 ignoreList;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lnk;")
    @Export(value="loginType")
    final LoginType loginType;

    @ObfuscatedSignature(descriptor="(Lnk;)V")
    FriendSystem(LoginType loginType) {
        this.loginType = loginType;
        this.friendsList = new class285(loginType);
        this.ignoreList = new class291(loginType);
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Lef;I)Z", garbageValue="-1796834991")
    @Export(value="isFriendAndHasWorld")
    final boolean isFriendAndHasWorld(Username comparable) {
        boolean bl;
        return (comparable = (Friend)this.friendsList.getByUsername((Username)comparable)) != null && (bl = ((class289)comparable).method10693(-1888727144));
    }

    @ObfuscatedName(value="ak")
    static double method5141(double d) {
        d = d * -d / 2.0;
        d = Math.exp(d);
        double d2 = Math.sqrt(Math.PI * 2);
        return d / d2;
    }
}

