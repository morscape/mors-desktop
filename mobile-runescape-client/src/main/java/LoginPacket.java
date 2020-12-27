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

@ObfuscatedName(value="ob")
@Implements(value="LoginPacket")
public class LoginPacket
implements class236 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lob;")
    static final LoginPacket field6418;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lob;")
    public static final LoginPacket field6420;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="[Lob;")
    @Export(value="LoginPacket_indexedValues")
    static final LoginPacket[] LoginPacket_indexedValues;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lob;")
    static final LoginPacket field6424;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lob;")
    public static final LoginPacket field6421;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lob;")
    public static final LoginPacket field6422;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lob;")
    public static final LoginPacket field6425;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=-341785321)
    @Export(value="id")
    public final int id;

    static {
        field6422 = new LoginPacket(14, 0);
        field6418 = new LoginPacket(15, 4);
        field6421 = new LoginPacket(16, -2);
        field6425 = new LoginPacket(18, -2);
        field6420 = new LoginPacket(19, -2);
        field6424 = new LoginPacket(27, 0);
        LoginPacket_indexedValues = new LoginPacket[32];
        LoginPacket[] arrloginPacket = TilePaint.method860();
        for (int i = 0; i < arrloginPacket.length; ++i) {
            LoginPacket.LoginPacket_indexedValues[arrloginPacket[i].id] = arrloginPacket[i];
        }
    }

    @ObfuscatedSignature(descriptor="(II)V", garbageValue="0")
    LoginPacket(int n, int n2) {
        this.id = n;
    }
}

