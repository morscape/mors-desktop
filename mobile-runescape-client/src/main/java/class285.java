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

@ObfuscatedName(value="eh")
public class class285
extends UserList {
    @ObfuscatedName(value="cl")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field5948;
    @ObfuscatedName(value="kt")
    @ObfuscatedSignature(descriptor="Lax;")
    @Export(value="mousedOverWidgetIf1")
    static Widget mousedOverWidgetIf1;
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lnk;")
    final LoginType field5950;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lfm;")
    public class75 field5952 = new class75();
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1925869005)
    int field5951 = 1;

    @ObfuscatedSignature(descriptor="(Lnk;)V")
    public class285(LoginType loginType) {
        super(400);
        this.field5950 = loginType;
    }

    @Override
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)[Len;", garbageValue="-2029701546")
    @Export(value="newTypedArray")
    class61[] newTypedArray(int n) {
        class61[] arrclass61 = new Friend[n];
        return arrclass61;
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="13576676")
    static final void method10474() {
        Scene.Scene_isLowDetail = false;
        Client.isLowDetail = false;
    }

    @ObfuscatedName(value="ak")
    public static int method10473(int n, int n2) {
        ItemContainer itemContainer = FontName.method6387(n);
        n2 = itemContainer.field6855 * 1641520335;
        n = itemContainer.field6856;
        int n3 = itemContainer.field6854 * -1435648277;
        n3 = Varps.Varps_masks[n3 * 601881027 - n];
        n2 = Varps.Varps_main[n2 * 31189551];
        return n3 & n2 >> n;
    }
}

