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

@ObfuscatedName(value="nk")
@Implements(value="LoginType")
public class LoginType {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lnk;")
    public static final LoginType field3966;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3967;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3968;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3970;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3972;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3973;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3969;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lnk;")
    @Export(value="oldscape")
    public static final LoginType oldscape;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lnk;")
    static final LoginType field3974;
    @ObfuscatedName(value="af")
    final String field3976;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-1714510483)
    final int field3975;

    static {
        oldscape = new LoginType(2, 0, "", "");
        field3967 = new LoginType(1, 1, "", "");
        field3969 = new LoginType(8, 2, "", "");
        field3974 = new LoginType(0, 3, "", "");
        field3968 = new LoginType(6, 4, "", "");
        field3973 = new LoginType(3, 5, "", "");
        field3970 = new LoginType(7, 6, "", "");
        field3972 = new LoginType(4, 7, "", "");
        field3966 = new LoginType(5, -1, "", "", true, new LoginType[]{oldscape, field3967, field3969, field3968, field3974});
    }

    LoginType(int n, int n2, String string2, String string3) {
        this.field3975 = n;
        this.field3976 = string3;
    }

    @ObfuscatedSignature(descriptor="(IILjava/lang/String;Ljava/lang/String;Z[Lnk;)V")
    LoginType(int n, int n2, String string2, String string3, boolean bl, LoginType[] arrloginType) {
        this.field3975 = n;
        this.field3976 = string3;
    }

    public String toString() {
        String string2 = this.field3976;
        return string2;
    }
}

