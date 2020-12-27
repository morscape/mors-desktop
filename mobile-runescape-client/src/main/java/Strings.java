/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="gw")
@Implements(value="Strings")
public class Strings {
    @ObfuscatedName(value="aa")
    public static String field2765 = "null";
    @ObfuscatedName(value="ac")
    public static String field2767 = "Loading config - ";
    @ObfuscatedName(value="ae")
    public static String field2769 = "Take";
    @ObfuscatedName(value="af")
    public static String field2770 = "for 30 days: ";
    @ObfuscatedName(value="ag")
    public static String field2771 = "Loaded title screen";
    @ObfuscatedName(value="ah")
    public static String field2772 = "Ok";
    @ObfuscatedName(value="aj")
    public static String field2774 = "Continue";
    @ObfuscatedName(value="al")
    public static String field2776 = "Discard";
    @ObfuscatedName(value="am")
    public static String field2777 = "Connection lost";
    @ObfuscatedName(value="an")
    public static String field2778 = "Please wait - attempting to reestablish";
    @ObfuscatedName(value="ao")
    public static String field2779 = "Loaded update list";
    @ObfuscatedName(value="ap")
    public static String field2780 = "Checking for updates - ";
    @ObfuscatedName(value="aq")
    public static String field2781 = "Loading - please wait.";
    @ObfuscatedName(value="ar")
    public static String field2782 = "Connecting to update server";
    @ObfuscatedName(value="as")
    public static String field2783 = "Select";
    @ObfuscatedName(value="au")
    public static String field2785 = "Loaded config";
    @ObfuscatedName(value="aw")
    public static String field2787 = "Prepared visibility map";
    @ObfuscatedName(value="ay")
    public static String field2789 = "Starting game engine...";
    @ObfuscatedName(value="az")
    public static String field2790 = "Prepared sound engine";
    @ObfuscatedName(value="bd")
    public static String field2794 = "Loaded world map";
    @ObfuscatedName(value="be")
    public static String field2795 = "Please enter a 6-digit PIN.";
    @ObfuscatedName(value="bg")
    public static String field2797 = "Loading textures - ";
    @ObfuscatedName(value="bh")
    public static String field2798 = "Loaded wordpack";
    @ObfuscatedName(value="bj")
    public static String field2800 = "Loading wordpack - ";
    @ObfuscatedName(value="bm")
    public static String field2803 = "";
    @ObfuscatedName(value="bp")
    public static String field2806 = "Loading sprites - ";
    @ObfuscatedName(value="bq")
    public static String field2807 = "Loading interfaces - ";
    @ObfuscatedName(value="br")
    public static String field2808 = "Loaded interfaces";
    @ObfuscatedName(value="bt")
    public static String field2810 = "";
    @ObfuscatedName(value="ki")
    public static String field3033;
    @ObfuscatedName(value="kn")
    public static String field3038;
    @ObfuscatedName(value="mf")
    public static String field3082;
    @ObfuscatedName(value="mx")
    public static String field3100;
    @ObfuscatedName(value="ol")
    public static String field3136;
    @ObfuscatedName(value="ad")
    public static String field2768 = "Loading title screen - ";
    @ObfuscatedName(value="ai")
    public static String field2773 = "Drop";
    @ObfuscatedName(value="ak")
    public static String field2775 = "Members object";
    @ObfuscatedName(value="at")
    public static String field2784 = "Loading fonts - ";
    @ObfuscatedName(value="av")
    public static String field2786 = "Loaded fonts";
    @ObfuscatedName(value="ax")
    public static String field2788 = "Hidden";
    @ObfuscatedName(value="bc")
    static String field2793 = "Please visit the support page for assistance.";
    @ObfuscatedName(value="bi")
    public static String field2799 = "Loaded sprites";
    @ObfuscatedName(value="bz")
    public static String field2816 = "Support Page";
    @ObfuscatedName(value="cg")
    public static String field2823;
    @ObfuscatedName(value="dl")
    public static String field2854;
    @ObfuscatedName(value="mg")
    public static String field3083;
    @ObfuscatedName(value="oo")
    public static String field3137;
    @ObfuscatedName(value="ab")
    public static String field2766 = "Trust this device";
    @ObfuscatedName(value="bf")
    public static String field2796 = "Loaded textures";
    @ObfuscatedName(value="bk")
    public static String field2801 = "Loading world map - ";
    @ObfuscatedName(value="cp")
    public static String field2832 = "Your account has been disabled.";

    static {
        field2823 = field2793;
        field2854 = field2793;
        field3038 = "For more information, please take a look at";
        field3033 = "our terms and conditions.";
        field3082 = "";
        field3100 = "Page has opened in the browser.";
        field3083 = "";
        field3136 = String.format("Use of this game is subject to our <col=ffd200>%s</col>, <col=ffd200>%s</col> and <col=ffd200>%s</col>.", "Terms and Conditions", "Privacy Policy", "Software Licence");
        field3137 = String.format("<col=ffd200>%s</col> and <col=ffd200>%s</col>. By tapping", "Terms and Conditions", "Privacy Policy");
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lkv;II)V", garbageValue="281999803")
    static void method4883(Archive archive, int n) {
        if (class189.NetCache_reference == null) {
            TriBool.requestNetFile(null, 255, 255, 0, (byte)0, true);
            NetCache.NetCache_archives[n] = archive;
            return;
        }
        class189.NetCache_reference.offset = n * 8 + 5;
        archive.loadIndex(class189.NetCache_reference.method11670(1604085085), class189.NetCache_reference.method11670(1604085085));
    }
}

