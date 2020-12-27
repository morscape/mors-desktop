/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="lu")
public class class177 {
    @ObfuscatedName(value="ae")
    static char[] field3803;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lfd;")
    static GameBuild field3804;
    @ObfuscatedName(value="fg")
    @ObfuscatedSignature(descriptor="Lpc;")
    static Bounds field3809;
    @ObfuscatedName(value="ai")
    static char[] field3805;
    @ObfuscatedName(value="ak")
    static char[] field3806;
    @ObfuscatedName(value="ax")
    static int[] field3807;

    static {
        int n;
        field3806 = new char[64];
        int n2 = 0;
        for (n = 0; n < 26; ++n) {
            class177.field3806[n] = (char)(n + 65);
        }
        for (n = 26; n < 52; ++n) {
            class177.field3806[n] = (char)(n + 97 - 26);
        }
        for (n = 52; n < 62; ++n) {
            class177.field3806[n] = (char)(n + 48 - 52);
        }
        class177.field3806[62] = 43;
        class177.field3806[63] = 47;
        field3803 = new char[64];
        for (n = 0; n < 26; ++n) {
            class177.field3803[n] = (char)(n + 65);
        }
        for (n = 26; n < 52; ++n) {
            class177.field3803[n] = (char)(n + 97 - 26);
        }
        for (n = 52; n < 62; ++n) {
            class177.field3803[n] = (char)(n + 48 - 52);
        }
        class177.field3803[62] = 42;
        class177.field3803[63] = 45;
        field3805 = new char[64];
        for (n = 0; n < 26; ++n) {
            class177.field3805[n] = (char)(n + 65);
        }
        for (n = 26; n < 52; ++n) {
            class177.field3805[n] = (char)(n + 97 - 26);
        }
        for (n = 52; n < 62; ++n) {
            class177.field3805[n] = (char)(n + 48 - 52);
        }
        class177.field3805[62] = 45;
        class177.field3805[63] = 95;
        field3807 = new int[128];
        for (n = n2; n < field3807.length; ++n) {
            class177.field3807[n] = -1;
        }
        for (n = 65; n <= 90; ++n) {
            class177.field3807[n] = n - 65;
        }
        for (n = 97; n <= 122; ++n) {
            class177.field3807[n] = n - 97 + 26;
        }
        for (n = 48; n <= 57; ++n) {
            class177.field3807[n] = n - 48 + 52;
        }
        int[] arrn = field3807;
        class177.field3807[43] = 62;
        arrn[42] = 62;
        arrn = field3807;
        class177.field3807[47] = 63;
        arrn[45] = 63;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;B)V")
    public static void method6542(AbstractArchive object, byte by) {
        FloorUnderlayDefinition.field7064 = object;
        FloorUnderlayDefinition.field7062 = new FloorUnderlayDefinition[((AbstractArchive)object).getGroupFileCount(1)];
        by = 0;
        while (by < FloorUnderlayDefinition.field7062.length) {
            object = FloorUnderlayDefinition.field7064.takeFile(1, by);
            FloorUnderlayDefinition.field7062[by] = new FloorUnderlayDefinition();
            if (object != null) {
                FloorUnderlayDefinition.field7062[by].method13201(new Buffer((byte[])object), by, (byte)105);
            }
            FloorUnderlayDefinition.field7062[by].method13195();
            by = (byte)(by + 1);
        }
        return;
    }
}

