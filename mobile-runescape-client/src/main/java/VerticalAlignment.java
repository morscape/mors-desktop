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
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="dm")
@Implements(value="VerticalAlignment")
public class VerticalAlignment
implements class176 {
    @ObfuscatedName(value="ac")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field5931;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ldm;")
    @Export(value="VerticalAlignment_centered")
    static final VerticalAlignment VerticalAlignment_centered;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lei;")
    static IndexedSprite field5936;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ldm;")
    static final VerticalAlignment field5933;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Ldm;")
    static final VerticalAlignment field5934;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-153200675)
    final int field5939;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=556663445)
    public final int field5940;

    static {
        field5934 = new VerticalAlignment(1, 0);
        VerticalAlignment_centered = new VerticalAlignment(2, 1);
        field5933 = new VerticalAlignment(0, 2);
    }

    VerticalAlignment(int n, int n2) {
        this.field5940 = n;
        this.field5939 = n2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field5939 * 66566261);
        return by * -153200675;
    }

    @ObfuscatedName(value="bb")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1218579350")
    static void method10455() {
        Object object = Client.field4740.method5708();
        Object object2 = ((class346)object).vmethod12647();
        if (object2 == null) {
            object = ((class346)object).method12018();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(WorldMapElement.method12941("secure", true));
            ((StringBuilder)object2).append("m=account-creation/g=oldscape/create_account_funnel.ws");
            object.vmethod10019(((StringBuilder)object2).toString(), true);
            return;
        }
        ((class18)object2).vmethod10037("acipK9");
        ((class18)object2).vmethod10038("acipK9");
        ((class18)object2).vmethod10051();
    }
}

