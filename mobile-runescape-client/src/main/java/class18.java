/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="az")
public abstract class class18 {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Law;")
    public class16 field318;
    @ObfuscatedName(value="ag")
    protected boolean field320 = false;
    @ObfuscatedName(value="au")
    public boolean field322 = false;
    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="Lay;")
    public class17 field325;
    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="Lay;")
    public class17 field327 = class17.field313;
    @ObfuscatedName(value="ad")
    protected final String field319;
    @ObfuscatedName(value="at")
    protected final String field321;
    @ObfuscatedName(value="av")
    protected final String field323;
    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="Lay;")
    public class17 field326 = class17.field313;
    @ObfuscatedName(value="bf")
    protected boolean field324 = false;

    protected class18(String charSequence, String string2, String string3) {
        this.field325 = class17.field313;
        this.field321 = charSequence;
        this.field323 = string2;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append("m=account-creation/g=oldscape/create_account?mod=os-mobile&ssl=1&dest=");
        ((StringBuilder)charSequence).append("/mobile/play");
        this.field319 = ((StringBuilder)charSequence).toString();
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-75")
    public abstract void vmethod10035();

    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-1824459571")
    public abstract void vmethod10037(String var1);

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1668167171")
    public abstract void vmethod10039();

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="1492638103")
    public boolean vmethod10040() {
        return false;
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/util/Map;I)V", garbageValue="2142111759")
    public abstract void vmethod10041(String var1, Map var2);

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="62")
    public abstract void vmethod10044();

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1510040560")
    public boolean vmethod10046() {
        return false;
    }

    @ObfuscatedName(value="ap")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1425890828")
    public abstract void vmethod10050();

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1888712509")
    public abstract void vmethod10051();

    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="540105205")
    public abstract void vmethod10052();

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="71")
    public abstract void vmethod10053();

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/util/Map;I)V", garbageValue="711808796")
    public abstract void vmethod10055(String var1, Map var2);

    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1070645796")
    public abstract void vmethod10057();

    @ObfuscatedName(value="bg")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-76")
    public abstract void vmethod10067();

    @ObfuscatedName(value="bj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1854283754")
    public abstract void vmethod10070();

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="0")
    public abstract void vmethod10076();

    @ObfuscatedName(value="im")
    @ObfuscatedSignature(descriptor="(ZI)V", garbageValue="-1206796764")
    public void method552(boolean bl) {
        this.field324 = bl;
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="1785955808")
    public abstract void vmethod10038(String var1);

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-2043129997")
    public abstract boolean vmethod10045();

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="-57253081")
    public abstract void vmethod10054(String var1);

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(B)Lan;", garbageValue="116")
    public abstract class9 vmethod10069();

    @ObfuscatedName(value="ii")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="750442420")
    public boolean method548() {
        return false;
    }

    @ObfuscatedName(value="ir")
    @ObfuscatedSignature(descriptor="(I)Law;", garbageValue="1441137729")
    public class16 method556() {
        class16 class163 = this.field318;
        return class163;
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(Lkc;Ljava/lang/String;Ljava/lang/String;I)[Lei;")
    public static IndexedSprite[] method348(AbstractArchive arrindexedSprite, String string2, String string3, int n) {
        n = arrindexedSprite.method6153(string2, 196471123);
        arrindexedSprite = Players.method5238((AbstractArchive)arrindexedSprite, n, arrindexedSprite.getFileId(n, string3));
        return arrindexedSprite;
    }

    @ObfuscatedName(value="al")
    public static int method347(boolean bl, boolean bl2, int n) {
        n = 0;
        n = NetCache.field3714 * -1 + NetCache.field3719 + 0;
        return n;
    }
}

