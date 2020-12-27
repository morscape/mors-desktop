/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.File;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="jw")
@Implements(value="Rasterizer2D")
public class Rasterizer2D
extends class288 {
    Rasterizer2D(int n, int n2) {
        this.field5968 = class304.method11055();
        this.field5969 = new class287(n, n2);
        this.field5965 = new class286(this.field5969.field2457, n, n2);
        this.field5967 = new class264(this.field5969);
        this.field5966 = new DevicePcmPlayer(this.field5967);
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;Ljava/lang/String;Ljava/lang/String;B)Loc;")
    public static class399 method13635(AbstractArchive object, AbstractArchive abstractArchive, String string2, String string3, byte by) {
        by = (byte)((AbstractArchive)object).method6153(string2, -470449810);
        object = class274.method7826((AbstractArchive)object, abstractArchive, by, ((AbstractArchive)object).getFileId(by, string3));
        return object;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/io/File;I)V", garbageValue="566761547")
    static void method13636(File file) {
        class354.field6427 = file;
        if (!class354.field6427.exists()) {
            throw new RuntimeException("");
        }
        class185.field3842 = true;
    }
}

