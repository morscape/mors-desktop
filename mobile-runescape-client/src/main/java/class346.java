/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.jagex3.client.input.softkeyboard.ax;
import java.io.File;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ms")
public abstract class class346
implements class172 {
    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="Lmh;")
    protected class188 field6402;
    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="Laz;")
    protected class18 field6403;
    @ObfuscatedName(value="ar")
    protected ax field6404;
    @ObfuscatedName(value="az")
    protected boolean field6407;
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="Lff;")
    public class69 field6405 = new class69();
    @ObfuscatedName(value="av")
    boolean field6406 = false;

    protected class346() {
    }

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="287174095")
    public abstract void vmethod12619();

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1176184485")
    public boolean vmethod12622() {
        return true;
    }

    @ObfuscatedName(value="aj")
    public abstract int vmethod12626(int var1);

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(I)Ljava/lang/String;", garbageValue="-1159134221")
    protected abstract String vmethod12629();

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(II)I", garbageValue="-892531391")
    public int vmethod12630(int n) {
        return n;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(Lmf;B)Ljava/lang/Object;", garbageValue="127")
    public abstract Object vmethod12632(class187 var1);

    @ObfuscatedName(value="aq")
    public boolean vmethod12633(int n) {
        return true;
    }

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="([BI)Lek;", garbageValue="1975174564")
    public abstract class384 vmethod12634(byte[] var1);

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1777072784")
    public abstract void vmethod12637();

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(II)Lcom/jagex/jagex3/client/input/softkeyboard/ax;", garbageValue="1247947871")
    public abstract ax vmethod12639(int var1);

    @ObfuscatedName(value="ay")
    public float vmethod12641(int n) {
        return -1.0f;
    }

    @ObfuscatedName(value="bd")
    public abstract void vmethod12646(String[] var1, byte var2);

    @ObfuscatedName(value="be")
    @ObfuscatedSignature(descriptor="(B)Laz;", garbageValue="102")
    public abstract class18 vmethod12647();

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Runnable;I)V", garbageValue="-1016725307")
    public abstract void vmethod12649(Runnable var1);

    @ObfuscatedName(value="bh")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IB)V", garbageValue="-67")
    public abstract void vmethod12650(String var1, int var2);

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-2109551604")
    public abstract void vmethod12658(boolean var1);

    @ObfuscatedName(value="bq")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)Z", garbageValue="1272608338")
    protected abstract boolean vmethod12659(String var1, boolean var2);

    @ObfuscatedName(value="br")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", garbageValue="1162578076")
    public abstract String vmethod12660(String var1, String var2);

    @ObfuscatedName(value="bt")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="1620248469")
    public abstract void vmethod12662(String var1, String var2, String var3);

    @Override
    @ObfuscatedName(value="fk")
    @ObfuscatedSignature(descriptor="(I)Ljava/io/File;", garbageValue="-177732611")
    public File vmethod11991() {
        File file = new File(this.vmethod12629());
        return file;
    }

    @Override
    @ObfuscatedName(value="fp")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", garbageValue="-1738991112")
    public File vmethod11994(String object, String string2, int n) {
        object = new File(this.vmethod12629());
        return object;
    }

    @ObfuscatedName(value="ga")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/util/Map;I)V", garbageValue="895243315")
    void method12003(String string2, Map map) {
        if (this.field6403 != null) {
            this.field6403.vmethod10041(string2, map);
        }
    }

    @ObfuscatedName(value="gc")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-88")
    public void method12005() {
        String string2 = (String)this.vmethod12632(class187.field3846);
        if (string2 != null) {
            this.vmethod12645("Software Licence", string2);
        }
    }

    @ObfuscatedName(value="gf")
    @ObfuscatedSignature(descriptor="(B)Z", garbageValue="-3")
    public boolean method12008() {
        boolean bl = this.field6406;
        return bl;
    }

    @ObfuscatedName(value="gg")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)Ljava/lang/String;", garbageValue="-1992618264")
    public String method12009(String string2) {
        if (!string2.contains("?m=")) {
            if (!string2.contains("&m=")) {
                boolean bl = string2.contains("?");
                boolean bl2 = this.vmethod12659("fhtagn", false);
                if (!bl) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    string2 = bl2 ? "?m=1" : "?m=0";
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    return string2;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                string2 = bl2 ? "&m=1" : "&m=0";
                stringBuilder.append(string2);
                return stringBuilder.toString();
            }
        } else {
            return string2;
        }
        return string2;
    }

    @ObfuscatedName(value="gh")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1547436014")
    public boolean method12010() {
        return true;
    }

    @ObfuscatedName(value="gi")
    @ObfuscatedSignature(descriptor="(I)Lff;", garbageValue="-1138541329")
    public class69 method12011() {
        class69 class692 = this.field6405;
        return class692;
    }

    @ObfuscatedName(value="gk")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1591697472")
    public boolean method12013() {
        boolean bl = this.field6407;
        return bl;
    }

    @ObfuscatedName(value="gl")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="-27756")
    public void method12014() {
        this.vmethod12648("mglwnafh", true);
        this.field6407 = true;
        if (this.field6403 != null) {
            this.field6403.vmethod10057();
            this.field6403.vmethod10052();
            this.field6403.vmethod10050();
        }
    }

    @ObfuscatedName(value="go")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1992686340")
    public boolean method12017() {
        ax ax2 = this.field6404;
        return ax2 != null;
    }

    @ObfuscatedName(value="gp")
    @ObfuscatedSignature(descriptor="(I)Lmh;", garbageValue="-30787666")
    public class188 method12018() {
        class188 class1882 = this.field6402;
        return class1882;
    }

    @ObfuscatedName(value="gt")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-294264192")
    public void method12022(String string2) {
        this.method12007(string2, null);
    }

    @ObfuscatedName(value="gu")
    @ObfuscatedSignature(descriptor="(I)Lcom/jagex/jagex3/client/input/softkeyboard/ax;", garbageValue="522073711")
    public ax method12023() {
        ax ax2 = this.field6404;
        return ax2;
    }

    @ObfuscatedName(value="gw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-221027583")
    public void method12025() {
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1980295029")
    protected void vmethod12625() {
        this.field6406 = true;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-47439312")
    protected void vmethod12640() {
        this.field6406 = false;
    }

    @ObfuscatedName(value="bc")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;I)V", garbageValue="-1077279907")
    protected abstract void vmethod12645(String var1, String var2);

    @Override
    @ObfuscatedName(value="fa")
    @ObfuscatedSignature(descriptor="(IB)Ljava/io/File;", garbageValue="40")
    public File vmethod11984(int n) {
        File file = new File(this.vmethod12629(), "random.dat");
        return file;
    }

    @ObfuscatedName(value="gb")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1978974038")
    public void method12004() {
        if (this.field6404 != null) {
            this.field6404.vmethod10003();
            this.field6404 = null;
        }
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;ZI)V", garbageValue="954145871")
    public abstract void vmethod12648(String var1, boolean var2);

    @ObfuscatedName(value="ge")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/util/Map;S)V", garbageValue="24624")
    void method12007(String string2, Map map) {
        if (this.field6403 != null) {
            this.field6403.vmethod10055(string2, map);
        }
    }

    @ObfuscatedName(value="bk")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)I", garbageValue="-175743920")
    public abstract int vmethod12653(String var1, int var2);

    @ObfuscatedName(value="gx")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-96900692")
    public void method12026(String string2) {
        this.method12003(string2, null);
    }
}

