/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="il")
@Implements(value="NPC")
public final class NPC
extends Actor {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lev;")
    @Export(value="definition")
    public NPCDefinition definition;

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        if (this.definition != null) {
            DualNode dualNode = this.sequence != -1 && this.sequenceDelay == 0 ? class122.SequenceDefinition_get(this.sequence) : null;
            DualNode dualNode2 = this.movementSequence == -1 || this.movementSequence == this.idleSequence && dualNode != null ? null : class122.SequenceDefinition_get(this.movementSequence);
            dualNode2 = this.definition.method13365((SequenceDefinition)dualNode, this.field7557, (SequenceDefinition)dualNode2, this.field7539, (byte)1);
            if (dualNode2 == null) {
                return null;
            }
            ((Model)dualNode2).calculateBoundsCylinder();
            this.field7576 = ((Entity)dualNode2).height;
            dualNode = dualNode2;
            if (this.field7550 != -1) {
                dualNode = dualNode2;
                if (this.field7542 != -1) {
                    Model model = class90.SpotAnimationDefinition_get(this.field7550).method13323(this.field7542, (byte)1);
                    dualNode = dualNode2;
                    if (model != null) {
                        model.offsetBy(0, -this.field7562, 0);
                        dualNode = new Model(new Model[]{dualNode2, model}, 2);
                    }
                }
            }
            if (this.definition.field7168 == 1) {
                ((Model)dualNode).isSingleTile = true;
            }
            return dualNode;
        }
        return null;
    }

    @Override
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1151560918")
    @Export(value="isVisible")
    final boolean isVisible() {
        NPCDefinition nPCDefinition = this.definition;
        return nPCDefinition != null;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(IIB)I", garbageValue="-103")
    static int method15534(int n, int n2) {
        long l = (n << 16) + n2;
        if (NetCache.NetCache_currentResponse != null && l == NetCache.NetCache_currentResponse.key) {
            n = class82.field2629.offset * 99 / (class82.field2629.array.length - NetCache.NetCache_currentResponse.padding);
            return n + 1;
        }
        return 0;
    }

    @ObfuscatedName(value="ai")
    static final void method15533(int n, int n2, int n3, int n4, short s) {
        s = (short)n2;
        int n5;
        block0: while (s <= (n5 = n4 + n2)) {
            int n6 = n;
            while (true) {
                block8: {
                    int n7;
                    block9: {
                        block7: {
                            if (n6 > (n7 = n + n3)) break block7;
                            if (n6 < 0 || n6 >= 104 || s < 0 || s >= 104) break block8;
                            break block9;
                        }
                        s = (short)(s + 1);
                        continue block0;
                    }
                    AccessFile.field4029[0][n6][s] = 127;
                    if (n == n6 && n6 > 0) {
                        Tiles.Tiles_heights[0][n6][s] = Tiles.Tiles_heights[0][n6 - 1][s];
                    }
                    if (n6 == n7 && n6 < 103) {
                        Tiles.Tiles_heights[0][n6][s] = Tiles.Tiles_heights[0][n6 + 1][s];
                    }
                    if (s == n2 && s > 0) {
                        Tiles.Tiles_heights[0][n6][s] = Tiles.Tiles_heights[0][n6][s - 1];
                    }
                    if (n5 == s && s < 103) {
                        Tiles.Tiles_heights[0][n6][s] = Tiles.Tiles_heights[0][n6][s + 1];
                    }
                }
                ++n6;
            }
            break;
        }
        return;
    }

    @ObfuscatedName(value="bi")
    @ObfuscatedSignature(descriptor="(Ljava/net/Socket;III)Lnb;", garbageValue="-1203152593")
    public static AbstractSocket method15536(Socket object, int n, int n2) throws IOException {
        object = new BufferedNetSocket((Socket)object, n, n2);
        return object;
    }
}

