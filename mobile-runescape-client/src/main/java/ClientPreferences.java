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
import java.util.LinkedHashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ha")
@Implements(value="ClientPreferences")
public class ClientPreferences {
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=2062630101)
    static int field3154 = -463812757;
    @ObfuscatedName(value="aa")
    double field3157;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=8715397)
    int field3159;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1118978805)
    int field3160 = 1;
    @ObfuscatedName(value="aj")
    @Export(value="hideUsername")
    boolean hideUsername;
    @ObfuscatedName(value="al")
    @Export(value="parameters")
    LinkedHashMap parameters;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=1742476911)
    int field3164;
    @ObfuscatedName(value="as")
    @Export(value="rememberedUsername")
    String rememberedUsername = null;
    @ObfuscatedName(value="ai")
    boolean field3161;
    @ObfuscatedName(value="ax")
    boolean field3166;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-605030033)
    int field3158;

    ClientPreferences() {
        this.hideUsername = false;
        this.parameters = new LinkedHashMap();
        this.field3157 = 0.8;
        this.field3158 = 127;
        this.field3159 = 127;
        this.field3164 = 127;
        new LinkedHashMap();
        this.method4902(true);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @ObfuscatedSignature(descriptor="(Lmi;)V")
    ClientPreferences(Buffer buffer) {
        int n = 0;
        this.hideUsername = false;
        this.parameters = new LinkedHashMap();
        this.field3157 = 0.8;
        this.field3158 = 127;
        this.field3159 = 127;
        this.field3164 = 127;
        new LinkedHashMap();
        boolean bl = true;
        if (buffer != null && buffer.array != null) {
            int n2 = buffer.method11650(113451889);
            if (n2 >= 0 && n2 <= field3154) {
                if (buffer.method11650(851365529) == 1) {
                    this.field3161 = true;
                }
                if (n2 > 1) {
                    if (buffer.method11650(461686655) != 1) {
                        bl = false;
                    }
                    this.field3166 = bl;
                }
                if (n2 > 3) {
                    this.field3160 = buffer.method11650(-1605212351);
                }
                if (n2 > 2) {
                    int n3 = buffer.method11650(1409295609);
                    while (n < n3) {
                        int n4 = buffer.method11670(1604085085);
                        int n5 = buffer.method11670(1604085085);
                        this.parameters.put(n4, n5);
                        ++n;
                    }
                }
                if (n2 > 4) {
                    this.rememberedUsername = buffer.readStringCp1252NullTerminatedOrNull();
                }
                if (n2 > 5) {
                    this.hideUsername = buffer.method11661(1031046829);
                }
                if (n2 <= 6) return;
                this.field3157 = (double)buffer.method11650(1706537370) / 100.0;
                this.field3158 = buffer.method11650(1932248035);
                this.field3159 = buffer.method11650(-1889367263);
                this.field3164 = buffer.method11650(-307613616);
                return;
            }
            this.method4902(true);
            return;
        }
        this.method4902(true);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)Lmi;", garbageValue="-760637742")
    @Export(value="toBuffer")
    Buffer toBuffer() {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\r\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\r\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\r\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\r\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\r\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\r\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\r\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\r\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\r\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\r\n");
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1195282938")
    void method4902(boolean bl) {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;I)V", garbageValue="-1378159647")
    public static void method4889(AbstractArchive abstractArchive) {
        class379.field7074 = abstractArchive;
        class379.field7072 = class379.field7074.getGroupFileCount(16);
    }
}

