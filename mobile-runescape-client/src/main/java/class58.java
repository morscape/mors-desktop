/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ed")
public abstract class class58 {
    @ObfuscatedName(value="fl")
    @ObfuscatedSignature(descriptor="Loc;")
    static class399 field2421;

    class58() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Lbd;", garbageValue="-858686460")
    public abstract Rasterizer3D vmethod11000();

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-956180844")
    public void method3857() {
        this.vmethod11000().vmethod7646();
        this.vmethod11005().vmethod10753();
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(III)V", garbageValue="2132699450")
    public abstract void vmethod11004(int var1, int var2);

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="29")
    public abstract void vmethod11006();

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(IIIII)V", garbageValue="-1717355824")
    public abstract void vmethod11013(int var1, int var2, int var3, int var4);

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)Lba;", garbageValue="-71587171")
    public abstract class19 vmethod11003();

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Lfj;", garbageValue="1091171168")
    public abstract class72 vmethod11005();

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(IIB)V", garbageValue="62")
    public abstract void vmethod11016(int var1, int var2);

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I[BLny;I)V", garbageValue="-157454744")
    static void method3848(int n, byte[] arrby, ArchiveDisk archiveDisk) {
        ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 0;
        archiveDiskAction.key = n;
        archiveDiskAction.data = arrby;
        archiveDiskAction.archiveDisk = archiveDisk;
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method6351();
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1361602434")
    static void method3849() {
        if (Login.Login_username == null || Login.Login_username.length() <= 0) {
            if (ServerPacket.clientPreferences.rememberedUsername == null) {
                Client.Login_isUsernameRemembered = false;
                return;
            }
            Login.Login_username = ServerPacket.clientPreferences.rememberedUsername;
            Client.Login_isUsernameRemembered = true;
            return;
        }
    }
}

