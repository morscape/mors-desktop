/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="cd")
public class class272
extends WorldMapArea {
    @ObfuscatedName(value="tj")
    @ObfuscatedGetter(intValue=-69711593)
    static int field4713;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Ljg;")
    static LoginScreenAnimation field4710;
    @ObfuscatedName(value="ae")
    HashSet field4714;
    @ObfuscatedName(value="ai")
    List field4715;
    @ObfuscatedName(value="ak")
    HashSet field4716;

    class272() {
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lmi;ZI)V")
    void method7782(Buffer buffer, boolean bl, int n) {
        this.field4715 = new LinkedList();
        int n2 = buffer.method11637(305608716);
        n = 0;
        while (n < n2) {
            int n3 = buffer.method11680((byte)36);
            Coord coord = new Coord(buffer.method11670(1604085085));
            int n4 = buffer.method11650(-2038517655);
            boolean bl2 = true;
            if (n4 != 1) {
                bl2 = false;
            }
            if (bl || !bl2) {
                this.field4715.add(new WorldMapIcon_0(null, coord, n3, null));
            }
            ++n;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;Lmi;IZI)V")
    void method7784(Buffer object, Buffer buffer, int n, boolean bl, int n2) {
        this.method3767((Buffer)object, n, -2049549226);
        int n3 = buffer.method11637(1715606998);
        this.field4716 = new HashSet(n3);
        n2 = 0;
        n = 0;
        while (true) {
            if (n >= n3) break;
            object = new class270();
            try {
                ((class270)object).method7743(buffer);
            }
            catch (IllegalStateException illegalStateException) {}
            this.field4716.add(object);
            ++n;
        }
        n3 = buffer.method11637(1370040326);
        this.field4714 = new HashSet(n3);
        n = n2;
        while (true) {
            if (n >= n3) {
                this.method7782(buffer, bl, 1309517380);
                return;
            }
            object = new WorldMapData_1();
            try {
                ((WorldMapData_1)object).method7754(buffer, 304496063);
            }
            catch (IllegalStateException illegalStateException) {}
            this.field4714.add(object);
            ++n;
        }
    }

    @ObfuscatedName(value="gv")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="1922156642")
    static final void method7781(int n) {
        if (WorldMapIcon_1.loadInterface(n, -1312257374)) {
            class105.method5030(class79.Widget_interfaceComponents[n], -1, (byte)-73);
            return;
        }
    }
}

