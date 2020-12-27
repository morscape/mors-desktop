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

@ObfuscatedName(value="jf")
public class class135 {
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=1737438527)
    static int field3505 = 0;

    @ObfuscatedName(value="dj")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-124")
    static void method5657() {
        if (Client.field4945 * -519909523 == WorldMapScaleHandler.localPlayer.x >> 7 && WorldMapScaleHandler.localPlayer.field7523 * -144332757 >> 7 == Client.field4949 * 1704895805) {
            Client.field4945 = 0;
        }
    }

    @ObfuscatedName(value="gc")
    @ObfuscatedSignature(descriptor="(Lax;I)V", garbageValue="1839757401")
    @Export(value="invalidateWidget")
    public static void invalidateWidget(Widget widget) {
        if (widget.cycle == Client.field4930) {
            Client.field4920[widget.field4619] = true;
        }
    }
}

