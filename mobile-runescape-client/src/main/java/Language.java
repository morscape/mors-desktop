/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  la
 *  lj
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@la
@lj
@ObfuscatedName(value="le")
@Implements(value="Language")
public class Language
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_DE")
    static final Language Language_DE;
    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="[Lle;")
    @Export(value="Language_valuesOrdered")
    static final Language[] Language_valuesOrdered;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_NL")
    static final Language Language_NL;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_ES_MX")
    static final Language Language_ES_MX;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_ES")
    public static final Language Language_ES;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_FR")
    public static final Language Language_FR;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_EN")
    public static final Language Language_EN;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lle;")
    @Export(value="Language_PT")
    static final Language Language_PT;
    @ObfuscatedName(value="aa")
    @Export(value="language")
    final String language;
    @ObfuscatedName(value="al")
    final String field6324;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=-442508333)
    @Export(value="id")
    final int id;

    static {
        Language_EN = new Language("EN", "en", "English", ModeWhere.field6365, 0, "GB");
        Language_DE = new Language("DE", "de", "German", ModeWhere.field6365, 1, "DE");
        Language_FR = new Language("FR", "fr", "French", ModeWhere.field6365, 2, "FR");
        Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field6365, 3, "BR");
        Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field6371, 4, "NL");
        Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field6371, 5, "ES");
        Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field6365, 6, "MX");
        Language[] arrlanguage = Language.method11566();
        Language_valuesOrdered = new Language[arrlanguage.length];
        for (int i = 0; i < arrlanguage.length; ++i) {
            Language language = arrlanguage[i];
            if (Language_valuesOrdered[language.id] == null) {
                Language.Language_valuesOrdered[language.id] = language;
                continue;
            }
            throw new IllegalStateException();
        }
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llo;ILjava/lang/String;)V")
    Language(String string2, String string3, String string4, ModeWhere modeWhere, int n, String string5) {
        this.field6324 = string2;
        this.language = string3;
        this.id = n;
        if (string5 == null) {
            new Locale(string3.substring(0, 2));
            return;
        }
        new Locale(string3.substring(0, 2), string5);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(B)Ljava/lang/String;", garbageValue="49")
    @Export(value="getLanguage")
    String getLanguage() {
        String string2 = this.language;
        return string2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.id * -2069744549);
        return by * -442508333;
    }

    public String toString() {
        String string2 = this.getLanguage().toLowerCase(Locale.ENGLISH);
        return string2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)[Lle;", garbageValue="-1455874343")
    static Language[] method11566() {
        Language language = Language_NL;
        Language language2 = Language_FR;
        Language language3 = Language_ES;
        Language language4 = Language_PT;
        Language language5 = Language_ES_MX;
        Language language6 = Language_DE;
        Language language7 = Language_EN;
        return new Language[]{language, language2, language3, language4, language5, language6, language7};
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IS)Lle;", garbageValue="30446")
    public static Language method11567(int n) {
        if (n >= 0 && n < Language_valuesOrdered.length) {
            Language language = Language_valuesOrdered[n];
            return language;
        }
        return null;
    }

    @ObfuscatedName(value="ao")
    static void method11572(int[] arrn, byte[] arrby, int[] arrn2, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = -(n3 >> 2);
        int n9 = -(n3 & 3);
        n3 = -n4;
        while (true) {
            if (n3 < 0) {
                n7 = n2;
                n2 = n;
                n = n7;
            } else {
                return;
            }
            for (n4 = n8; n4 < 0; ++n4) {
                n7 = n2 + 1;
                int n10 = arrby[n2];
                if (n10 != 0) {
                    n2 = n + 1;
                    arrn[n] = arrn2[n10 & 0xFF];
                    n = n2;
                } else {
                    ++n;
                }
                n10 = n7 + 1;
                n7 = arrby[n7];
                if (n7 != 0) {
                    n2 = n + 1;
                    arrn[n] = arrn2[n7 & 0xFF];
                    n = n2;
                } else {
                    ++n;
                }
                n7 = n10 + 1;
                n10 = arrby[n10];
                if (n10 != 0) {
                    n2 = n + 1;
                    arrn[n] = arrn2[n10 & 0xFF];
                    n = n2;
                } else {
                    ++n;
                }
                n2 = n7 + 1;
                n7 = arrby[n7];
                if (n7 != 0) {
                    arrn[n] = arrn2[n7 & 0xFF];
                    ++n;
                    continue;
                }
                ++n;
            }
            n4 = n9;
            while (n4 < 0) {
                n7 = arrby[n2];
                if (n7 != 0) {
                    arrn[n] = arrn2[n7 & 0xFF];
                    ++n;
                } else {
                    ++n;
                }
                ++n4;
                ++n2;
            }
            ++n3;
            n4 = n + n5;
            n = n6 + n2;
            n2 = n4;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;Lkc;Llx;I)Z", garbageValue="2147263226")
    public static boolean method11568(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, AbstractArchive abstractArchive3, MidiPcmStream midiPcmStream) {
        class167.musicPatchesArchive = abstractArchive;
        class167.musicSamplesArchive = abstractArchive2;
        class167.soundEffectsArchive = abstractArchive3;
        class347.midiPcmStream = midiPcmStream;
        class167.musicPlayerStatus = 0;
        return true;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(I)I", garbageValue="-1821596540")
    static int method11574() {
        class346 class3462;
        if (class119.field3363.method5314()) {
            class3462 = Client.field4740.method5708();
            class119.field3363.field3369 = class3462.vmethod12653("wgahnagl", 0);
            Login.field3193 = class3462.vmethod12660("name", "");
            if (class119.field3363.field3369 != 0 || class119.field3363.field3369 == -1000) {
                if (!Login.field3193.isEmpty()) {
                    return 10;
                }
                class119.field3363.field3369 = 0;
                class3462.vmethod12646(new String[]{"wgahnagl"}, (byte)-60);
                return 0;
            }
        } else {
            class119.field3363.field3369 = 0;
            Login.field3193 = "";
            return 0;
        }
        Login.field3193 = "";
        class3462.vmethod12646(new String[]{"name"}, (byte)15);
        return 0;
    }

    @ObfuscatedName(value="ax")
    public static char method11575(byte by, byte by2) {
        block2: {
            block3: {
                block1: {
                    by2 = (byte)(by & 0xFF);
                    if (by2 == 0) break block1;
                    by = by2;
                    if (by2 < 128) break block2;
                    by = by2;
                    if (by2 >= 160) break block2;
                    break block3;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(Integer.toString(by2, 16));
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            by = by2 = (byte)class170.field3785[by2 - 128];
            if (by2 == 0) {
                by = (byte)63;
            }
        }
        return (char)by;
    }
}

