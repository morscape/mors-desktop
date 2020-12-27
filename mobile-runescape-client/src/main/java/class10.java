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

@ObfuscatedName(value="ao")
public class class10 {
    @ObfuscatedName(value="ru")
    @ObfuscatedSignature(descriptor="Lpe;")
    static WorldMap field251;
    @ObfuscatedName(value="aa")
    static int[] field245;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1280220015)
    final int field252;
    @ObfuscatedName(value="ax")
    final boolean field253;

    public class10(boolean bl, int n) {
        this.field253 = bl;
        this.field252 = n;
    }

    @ObfuscatedName(value="ae")
    public int method276(byte by) {
        by = (byte)(this.field252 * -1025057679);
        return by * -1280220015;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(S)Z", garbageValue="-14739")
    public boolean method280() {
        boolean bl = this.field253;
        return bl;
    }

    @ObfuscatedName(value="fr")
    @ObfuscatedSignature(descriptor="([Lax;Lax;ZB)V")
    static void method275(Widget[] object, Widget widget, boolean bl, byte by) {
        by = widget.field4487 != 0 ? (byte)widget.field4487 : (byte)widget.width;
        int n = widget.field4507 != 0 ? widget.field4507 : widget.height;
        class206.method6835(object, widget.id, by, n, bl, false, (byte)-104);
        if (widget.children != null) {
            class206.method6835(widget.children, widget.id, by, n, bl, false, (byte)-26);
        }
        if ((object = (InterfaceParent)Client.interfaceParents.get(widget.id)) != null) {
            class72.method4139(object.group, by, n, bl, false);
        }
        by = (byte)(widget.type * -2048611939);
    }
}

