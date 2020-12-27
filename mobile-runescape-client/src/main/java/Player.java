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

@ObfuscatedName(value="hv")
@Implements(value="Player")
public final class Player
extends Actor {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1506851715)
    int field7842;
    @ObfuscatedName(value="ac")
    @ObfuscatedGetter(intValue=314337033)
    int field7844;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Laj;")
    @Export(value="appearance")
    class6 appearance;
    @ObfuscatedName(value="af")
    @ObfuscatedGetter(intValue=-9578507)
    int field7847;
    @ObfuscatedName(value="ag")
    int field7848;
    @ObfuscatedName(value="aj")
    @ObfuscatedGetter(intValue=141621459)
    public int field7850;
    @ObfuscatedName(value="am")
    @ObfuscatedGetter(intValue=266915917)
    int field7853;
    @ObfuscatedName(value="ao")
    @ObfuscatedGetter(intValue=-856577125)
    int field7854;
    @ObfuscatedName(value="ap")
    @ObfuscatedGetter(intValue=708759067)
    int field7855;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=2040900769)
    int field7856;
    @ObfuscatedName(value="ar")
    @ObfuscatedGetter(intValue=967832713)
    int field7857;
    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="Leg;")
    @Export(value="isFriendTriBool")
    TriBool isFriendTriBool;
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="Lcp;")
    Model field7862;
    @ObfuscatedName(value="ay")
    @ObfuscatedGetter(intValue=1367157467)
    int field7864;
    @ObfuscatedName(value="az")
    @ObfuscatedGetter(intValue=-686487803)
    int field7865;
    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="Leg;")
    @Export(value="isInClanChat")
    TriBool isInClanChat;
    @ObfuscatedName(value="ad")
    @Export(value="isHidden")
    boolean isHidden;
    @ObfuscatedName(value="ai")
    @ObfuscatedGetter(intValue=1621962635)
    int field7849;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lef;")
    @Export(value="username")
    public Username username;
    @ObfuscatedName(value="at")
    @Export(value="isUnanimated")
    boolean isUnanimated;
    @ObfuscatedName(value="av")
    @ObfuscatedGetter(intValue=-705382001)
    public int field7861;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1947642201)
    int field7863;
    @ObfuscatedName(value="ab")
    @ObfuscatedGetter(intValue=1865870047)
    int field7843;

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="2089494427")
    boolean method15491() {
        TriBool triBool;
        TriBool triBool2;
        if (this.isFriendTriBool == TriBool.field2427) {
            this.checkIsFriend();
        }
        return (triBool2 = TriBool.TriBool_true) == (triBool = this.isFriendTriBool);
    }

    @Override
    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="()Lcp;")
    @Export(value="getModel")
    protected final Model getModel() {
        if (this.appearance != null) {
            Model model;
            DualNode dualNode = this.sequence != -1 && this.sequenceDelay == 0 ? class122.SequenceDefinition_get(this.sequence) : null;
            DualNode dualNode2 = this.movementSequence == -1 || this.isUnanimated || this.movementSequence == this.idleSequence && dualNode != null ? null : class122.SequenceDefinition_get(this.movementSequence);
            dualNode2 = this.appearance.method90((SequenceDefinition)dualNode, this.field7557, (SequenceDefinition)dualNode2, this.field7539, -1968278924);
            if (dualNode2 == null) {
                return null;
            }
            ((Model)dualNode2).calculateBoundsCylinder();
            this.field7576 = ((Entity)dualNode2).height;
            dualNode = dualNode2;
            if (!this.isUnanimated) {
                dualNode = dualNode2;
                if (this.field7550 != -1) {
                    dualNode = dualNode2;
                    if (this.field7542 != -1) {
                        model = class90.SpotAnimationDefinition_get(this.field7550).method13323(this.field7542, (byte)66);
                        dualNode = dualNode2;
                        if (model != null) {
                            model.offsetBy(0, -this.field7562, 0);
                            dualNode = new Model(new Model[]{dualNode2, model}, 2);
                        }
                    }
                }
            }
            dualNode2 = dualNode;
            if (!this.isUnanimated) {
                dualNode2 = dualNode;
                if (this.field7862 != null) {
                    if (Client.cycle >= this.field7847) {
                        this.field7862 = null;
                    }
                    dualNode2 = dualNode;
                    if (Client.cycle >= this.field7843) {
                        dualNode2 = dualNode;
                        if (Client.cycle < this.field7847) {
                            model = this.field7862;
                            model.offsetBy(this.field7856 - this.x, this.field7853 - this.field7842, this.field7864 - this.field7523 * -144332757);
                            if (this.field7570 == 512) {
                                model.method14364();
                                model.method14364();
                                model.method14364();
                            } else if (this.field7570 == 1024) {
                                model.method14364();
                                model.method14364();
                            } else if (this.field7570 == 1536) {
                                model.method14364();
                            }
                            dualNode2 = new Model(new Model[]{dualNode, model}, 2);
                            if (this.field7570 == 512) {
                                model.method14364();
                            } else if (this.field7570 == 1024) {
                                model.method14364();
                                model.method14364();
                            } else if (this.field7570 == 1536) {
                                model.method14364();
                                model.method14364();
                                model.method14364();
                            }
                            model.offsetBy(this.x - this.field7856, this.field7842 - this.field7853, this.field7523 * -144332757 - this.field7864);
                        }
                    }
                }
            }
            ((Model)dualNode2).isSingleTile = true;
            return dualNode2;
        }
        return null;
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1828534790")
    boolean method15494() {
        TriBool triBool;
        TriBool triBool2;
        if (this.isInClanChat == TriBool.field2427) {
            this.updateIsInClanChat();
        }
        return (triBool2 = this.isInClanChat) == (triBool = TriBool.TriBool_true);
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-852199246")
    @Export(value="updateIsInClanChat")
    void updateIsInClanChat() {
        TriBool triBool = WorldMapData_1.clanChat != null && WorldMapData_1.clanChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
        this.isInClanChat = triBool;
    }

    @Override
    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1151560918")
    @Export(value="isVisible")
    final boolean isVisible() {
        class6 class62 = this.appearance;
        return class62 != null;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(S)V", garbageValue="342")
    @Export(value="checkIsFriend")
    void checkIsFriend() {
        TriBool triBool = class381.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
        this.isFriendTriBool = triBool;
    }
}

