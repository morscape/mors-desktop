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

@ObfuscatedName(value="ir")
@Implements(value="DynamicObject")
public class DynamicObject
extends Entity {
    @ObfuscatedName(value="gp")
    @ObfuscatedSignature(descriptor="[Lei;")
    static IndexedSprite[] field7578;
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1030038921)
    @Export(value="cycleStart")
    int cycleStart;
    @ObfuscatedName(value="ae")
    @ObfuscatedGetter(intValue=19333225)
    @Export(value="type")
    int type;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=1348200215)
    @Export(value="x")
    int x;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Ldv;")
    @Export(value="sequenceDefinition")
    SequenceDefinition sequenceDefinition;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=390776059)
    @Export(value="frame")
    int frame;
    @ObfuscatedName(value="as")
    @ObfuscatedGetter(intValue=383429483)
    @Export(value="y")
    int y;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=867300873)
    @Export(value="orientation")
    int orientation;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1549722249)
    @Export(value="id")
    int id;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=732666163)
    @Export(value="plane")
    int plane;

    @ObfuscatedSignature(descriptor="(IIIIIIIZLbw;)V")
    DynamicObject(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, Entity entity) {
        block6: {
            block4: {
                block5: {
                    this.id = n;
                    this.type = n2;
                    this.orientation = n3;
                    this.plane = n4;
                    this.x = n5;
                    this.y = n6;
                    if (n7 == -1) break block4;
                    this.sequenceDefinition = class122.SequenceDefinition_get(n7);
                    this.frame = 0;
                    this.cycleStart = Client.cycle - 1;
                    if (this.sequenceDefinition.field7054 != 0 || entity == null || !(entity instanceof DynamicObject)) break block5;
                    entity = (DynamicObject)entity;
                    if (((DynamicObject)entity).sequenceDefinition == this.sequenceDefinition) break block6;
                }
                if (bl && this.sequenceDefinition.frameCount != -1) {
                    this.frame = (int)(Math.random() * (double)this.sequenceDefinition.field7058.length);
                    this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
                }
            }
            return;
        }
        this.frame = ((DynamicObject)entity).frame;
        this.cycleStart = ((DynamicObject)entity).cycleStart;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        block8: {
            block7: {
                if (this.sequenceDefinition == null) break block8;
                var1_2 = var2_1 = Client.cycle - this.cycleStart;
                if (var2_1 > 100) {
                    var1_2 = var2_1;
                    if (this.sequenceDefinition.frameCount > 0) {
                        var1_2 = 100;
                    }
                }
                do lbl-1000:
                // 3 sources

                {
                    var2_1 = var1_2;
                    if (var1_2 <= this.sequenceDefinition.frameLengths[this.frame]) break block7;
                    var2_1 = var1_2 - this.sequenceDefinition.frameLengths[this.frame];
                    this.frame -= -1;
                    var1_2 = var2_1;
                    if (this.frame < this.sequenceDefinition.field7058.length) ** GOTO lbl-1000
                    this.frame -= this.sequenceDefinition.frameCount;
                    if (this.frame < 0) break;
                    var1_2 = var2_1;
                } while (this.frame < this.sequenceDefinition.field7058.length);
                this.sequenceDefinition = null;
            }
            this.cycleStart = Client.cycle - var2_1;
        }
        var10_3 = AbstractWorldMapIcon.getObjectDefinition(this.id);
        var9_4 = var10_3;
        if (var10_3.transforms != null) {
            var9_5 = var10_3.method12888(-434996128);
        }
        if (var9_6 == null) {
            return null;
        }
        if (this.orientation != 1 && this.orientation != 3) {
            var1_2 = var9_6.field6886;
            var2_1 = var9_6.field6884;
        } else {
            var1_2 = var9_6.field6884;
            var2_1 = var9_6.field6886;
        }
        var6_8 = (var1_2 >> 1) + this.x;
        var5_10 = (var1_2 + 1 >> 1) + this.x;
        var8_12 = (var2_1 >> 1) + this.y;
        var7_13 = (var2_1 + 1 >> 1) + this.y;
        var10_3 = Tiles.Tiles_heights[this.plane];
        var3_14 = var10_3[var5_10][var7_13];
        var4_15 = var10_3[var6_8][var8_12];
        var5_11 = var10_3[var5_10][var8_12];
        var6_9 = var10_3[var6_8][var7_13];
        var7_13 = this.x * 66961575;
        var8_12 = this.y * -885839549;
        return var9_6.getModelDynamic(this.type, this.orientation, (int[][])var10_3, (var7_13 * 1348200215 << 7) + (var1_2 << 6), (int)(var3_14 + var4_15 + var5_11 + var6_9 >> 2), (var8_12 * 383429483 << 7) + (var2_1 << 6), this.sequenceDefinition, this.frame);
    }
}

