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

@ObfuscatedName(value="in")
@Implements(value="Actor")
public abstract class Actor
extends Entity {
    @ObfuscatedName(value="an")
    boolean field7517;
    @ObfuscatedName(value="ba")
    String field7518;
    @ObfuscatedName(value="bd")
    @ObfuscatedGetter(intValue=1355976873)
    @Export(value="idleSequence")
    int idleSequence;
    @ObfuscatedName(value="bh")
    public int field7523;
    @ObfuscatedName(value="bj")
    @ObfuscatedGetter(intValue=513787439)
    @Export(value="x")
    public int x;
    @ObfuscatedName(value="bn")
    @ObfuscatedGetter(intValue=775383853)
    int field7527;
    @ObfuscatedName(value="bq")
    @ObfuscatedGetter(intValue=-1861404765)
    int field7529;
    @ObfuscatedName(value="br")
    @ObfuscatedGetter(intValue=-452751424)
    int field7530;
    @ObfuscatedName(value="ce")
    @ObfuscatedGetter(intValue=-460708247)
    int field7542;
    @ObfuscatedName(value="ck")
    @ObfuscatedGetter(intValue=1649344219)
    @Export(value="movementSequence")
    int movementSequence;
    @ObfuscatedName(value="cm")
    @ObfuscatedGetter(intValue=-132045733)
    int field7550;
    @ObfuscatedName(value="co")
    int[] field7552;
    @ObfuscatedName(value="cw")
    int[] field7560;
    @ObfuscatedName(value="dn")
    @ObfuscatedGetter(intValue=-308041059)
    int field7570;
    @ObfuscatedName(value="dx")
    @ObfuscatedGetter(intValue=-36859543)
    int field7576;
    @ObfuscatedName(value="bl")
    boolean field7526;
    @ObfuscatedName(value="bs")
    @ObfuscatedGetter(intValue=204283925)
    int field7531;
    @ObfuscatedName(value="bu")
    @ObfuscatedGetter(intValue=-2090158395)
    int field7533;
    @ObfuscatedName(value="cb")
    @ObfuscatedGetter(intValue=-546254615)
    int field7539;
    @ObfuscatedName(value="cd")
    @ObfuscatedSignature(descriptor="Lfx;")
    IterableNodeDeque field7541;
    @ObfuscatedName(value="cg")
    int[] field7544;
    @ObfuscatedName(value="cn")
    @ObfuscatedGetter(intValue=1793361247)
    @Export(value="sequence")
    int sequence;
    @ObfuscatedName(value="cq")
    int[] field7554;
    @ObfuscatedName(value="cs")
    @ObfuscatedGetter(intValue=-1146696469)
    @Export(value="sequenceDelay")
    int sequenceDelay;
    @ObfuscatedName(value="ct")
    @ObfuscatedGetter(intValue=1785048439)
    int field7557;
    @ObfuscatedName(value="cy")
    @ObfuscatedGetter(intValue=-2052135425)
    int field7562;
    @ObfuscatedName(value="bw")
    boolean field7535;
    @ObfuscatedName(value="bk")
    @ObfuscatedGetter(intValue=-1844829283)
    int field7525;
    @ObfuscatedName(value="cp")
    int[] field7553;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-1151560918")
    @Export(value="isVisible")
    boolean isVisible() {
        return false;
    }
}

