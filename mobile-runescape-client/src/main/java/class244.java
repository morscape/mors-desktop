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

@ObfuscatedName(value="ph")
public class class244 {
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=-54078989)
    static int field4268;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=633381375)
    public int field4269 = -1;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=-849762779)
    public int field4271 = -1;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-1479901173)
    public int field4272 = -1;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1260691303)
    public int field4273 = -1;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=1306218195)
    public int field4275 = -1;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=1629119085)
    public int field4277 = -1;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=909452289)
    public int field4278 = -1;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=-1341144785)
    public int field4274 = -1;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=2051795377)
    public int field4276 = -1;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-2125767823)
    public int field4279 = -1;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1237871439)
    public int field4270 = -1;

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V")
    public void method7357(AbstractArchive object, int n) {
        object = new Buffer(((AbstractArchive)object).takeFileFlat(class253.field4329.field4330));
        block4: while ((n = ((Buffer)object).method11650(1459882468)) != 0) {
            switch (n) {
                default: {
                    continue block4;
                }
                case 2: {
                    this.field4276 = ((Buffer)object).method11680((byte)-70);
                    this.field4271 = ((Buffer)object).method11680((byte)-10);
                    this.field4274 = ((Buffer)object).method11680((byte)32);
                    this.field4279 = ((Buffer)object).method11680((byte)21);
                    this.field4273 = ((Buffer)object).method11680((byte)91);
                    this.field4278 = ((Buffer)object).method11680((byte)61);
                    this.field4275 = ((Buffer)object).method11680((byte)-82);
                    this.field4277 = ((Buffer)object).method11680((byte)-27);
                    this.field4269 = ((Buffer)object).method11680((byte)90);
                    this.field4270 = ((Buffer)object).method11680((byte)42);
                    this.field4272 = ((Buffer)object).method11680((byte)61);
                    continue block4;
                }
                case 1: 
            }
            ((Buffer)object).method11649(996436029);
        }
        return;
    }
}

