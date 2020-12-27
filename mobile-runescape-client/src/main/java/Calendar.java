/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="np")
@Implements(value="Calendar")
public class Calendar {
    @ObfuscatedName(value="ae")
    @Export(value="DAYS_OF_THE_WEEK")
    static final String[] DAYS_OF_THE_WEEK;
    @ObfuscatedName(value="ai")
    @Export(value="Calendar_calendar")
    static java.util.Calendar Calendar_calendar;
    @ObfuscatedName(value="ak")
    @Export(value="MONTH_NAMES_ENGLISH_GERMAN")
    static final String[][] MONTH_NAMES_ENGLISH_GERMAN;

    static {
        MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
        DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        java.util.Calendar.getInstance();
        Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lkc;III)[Lek;", garbageValue="1373019108")
    public static class384[] method6898(AbstractArchive arrclass384, int n, int n2) {
        if (class287.method10622((AbstractArchive)arrclass384, n, n2)) {
            arrclass384 = TileItem.method14481(-1855697713);
            return arrclass384;
        }
        return null;
    }
}

