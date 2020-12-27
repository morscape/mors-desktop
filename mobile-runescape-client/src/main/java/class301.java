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

@ObfuscatedName(value="gb")
public class class301
implements class176 {
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6050;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6053;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6054;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lgb;")
    public static final class301 field6055;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6057;
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6059;
    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6060;
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6061;
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6062;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6063;
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6064;
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6065;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6066;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6069;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6071;
    @ObfuscatedName(value="az")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6072;
    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6052;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lgb;")
    public static final class301 field6056;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lgb;")
    public static final class301 field6058;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6067;
    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6068;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lgb;")
    public static final class301 field6070;
    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="Lgb;")
    static final class301 field6051;
    @ObfuscatedName(value="ek")
    @ObfuscatedSignature(descriptor="Lig;")
    static class122 field6073;
    @ObfuscatedName(value="ag")
    @ObfuscatedGetter(intValue=-1053996815)
    public final int field6074;

    static {
        field6058 = new class301(0, 0);
        field6053 = new class301(1, 0);
        field6056 = new class301(2, 0);
        field6070 = new class301(3, 0);
        field6055 = new class301(9, 2);
        field6066 = new class301(4, 1);
        field6057 = new class301(5, 1);
        field6059 = new class301(6, 1);
        field6050 = new class301(7, 1);
        field6051 = new class301(8, 1);
        field6054 = new class301(12, 2);
        field6064 = new class301(13, 2);
        field6060 = new class301(14, 2);
        field6061 = new class301(15, 2);
        field6071 = new class301(16, 2);
        field6069 = new class301(17, 2);
        field6065 = new class301(18, 2);
        field6063 = new class301(19, 2);
        field6062 = new class301(20, 2);
        field6072 = new class301(21, 2);
        field6067 = new class301(10, 2);
        field6068 = new class301(11, 2);
        field6052 = new class301(22, 3);
    }

    @ObfuscatedSignature(descriptor="(II)V", garbageValue="0")
    class301(int n, int n2) {
        this.field6074 = n;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field6074 * -1239373807);
        return by * -1053996815;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-995902028")
    public static void method11034() {
        ArchiveDiskAction archiveDiskAction;
        while ((archiveDiskAction = ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method6343()) != null) {
            archiveDiskAction.archive.method11535(archiveDiskAction.archiveDisk, (int)archiveDiskAction.key, archiveDiskAction.data, false, (short)-3183);
        }
        return;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1954627197")
    static void method11038() {
        ItemDefinition.ItemDefinition_cached.clear();
        ItemDefinition.ItemDefinition_cachedModels.clear();
        ItemDefinition.ItemDefinition_cachedSprites.clear();
    }
}

