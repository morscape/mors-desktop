/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ex")
public abstract class class63 {
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1521077941)
    int field2456;
    @ObfuscatedName(value="ai")
    public int[] field2457;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-259117947)
    int field2458;

    class63() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)Lfd;")
    public static GameBuild method4013(int n, byte by) {
        GameBuild[] arrgameBuild = class278.method10364();
        by = 0;
        while (by < arrgameBuild.length) {
            GameBuild gameBuild = arrgameBuild[by];
            int n2 = gameBuild.buildId * -876975737;
            if (n2 * 506924087 == n) {
                return gameBuild;
            }
            by = (byte)(by + 1);
        }
        return null;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II)Ljava/lang/String;", garbageValue="1793361247")
    @Export(value="colorStartTag")
    public static String colorStartTag(int n) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append("<col=");
        charSequence.append(Integer.toHexString(n));
        charSequence.append(">");
        charSequence = charSequence.toString();
        return charSequence;
    }

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)Lei;", garbageValue="-1075245129")
    static IndexedSprite method4017() {
        IndexedSprite indexedSprite = new IndexedSprite();
        class95.method4850(-1681572643);
        indexedSprite.field7120 = class82.field2623;
        indexedSprite.field7122 = class82.field2624;
        indexedSprite.field7118 = class183.field3837[0];
        indexedSprite.field7123 = class0.field1[0];
        indexedSprite.field7119 = class82.field2627[0];
        indexedSprite.field7124 = ItemContainer.field6849[0];
        indexedSprite.palette = class82.field2626;
        indexedSprite.field7121 = class82.field2622[0];
        class146.method6035();
        return indexedSprite;
    }

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(II)Z", garbageValue="1358831480")
    static boolean method4018(int n) {
        if (Client.field4740.method5708().method12013()) {
            return false;
        }
        Login.loginIndex = 12;
        Login.field3199 = n;
        return true;
    }
}

