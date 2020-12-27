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
import java.lang.reflect.Array;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="kf")
@Implements(value="BZip2State")
public final class BZip2State {
    @ObfuscatedName(value="up")
    @ObfuscatedSignature(descriptor="Lms;")
    protected static class346 field3660;
    @ObfuscatedName(value="aa")
    @Export(value="nextBit_unused")
    int nextBit_unused;
    @ObfuscatedName(value="ae")
    final int field3664;
    @ObfuscatedName(value="af")
    @Export(value="next_out")
    int next_out = 0;
    @ObfuscatedName(value="ag")
    @Export(value="cftab")
    int[] cftab;
    @ObfuscatedName(value="ah")
    final int field3667;
    @ObfuscatedName(value="aj")
    @Export(value="inputArray")
    byte[] inputArray;
    @ObfuscatedName(value="al")
    @ObfuscatedGetter(intValue=-507319783)
    @Export(value="nextByte")
    int nextByte = 0;
    @ObfuscatedName(value="am")
    int field3672;
    @ObfuscatedName(value="aq")
    @ObfuscatedGetter(intValue=2006289075)
    @Export(value="outputLength")
    int outputLength;
    @ObfuscatedName(value="ar")
    @Export(value="bsLive")
    int bsLive;
    @ObfuscatedName(value="as")
    final int field3678;
    @ObfuscatedName(value="aw")
    @Export(value="bsBuff")
    int bsBuff;
    @ObfuscatedName(value="bd")
    int[][] field3687;
    @ObfuscatedName(value="bg")
    @Export(value="seqToUnseq")
    byte[] seqToUnseq;
    @ObfuscatedName(value="bh")
    @Export(value="selector")
    byte[] selector;
    @ObfuscatedName(value="bj")
    @Export(value="getAndMoveToFrontDecode_yy")
    int[] getAndMoveToFrontDecode_yy;
    @ObfuscatedName(value="bp")
    @Export(value="inUse")
    boolean[] inUse;
    @ObfuscatedName(value="bq")
    @Export(value="selectorMtf")
    byte[] selectorMtf;
    @ObfuscatedName(value="br")
    byte[][] field3696;
    @ObfuscatedName(value="ai")
    final int field3668;
    @ObfuscatedName(value="ak")
    final int field3670;
    @ObfuscatedName(value="av")
    @Export(value="unzftab")
    int[] unzftab = new int[256];
    @ObfuscatedName(value="ax")
    final int field3683;
    @ObfuscatedName(value="bc")
    int[][] field3686;
    @ObfuscatedName(value="bi")
    @Export(value="inUse16")
    boolean[] inUse16;
    @ObfuscatedName(value="bz")
    int[] field3698;
    @ObfuscatedName(value="ab")
    @Export(value="outputArray")
    byte[] outputArray;
    @ObfuscatedName(value="bf")
    @Export(value="ll8")
    byte[] ll8;
    @ObfuscatedName(value="bk")
    int[][] field3693;

    BZip2State() {
        this.field3670 = 4096;
        this.field3664 = 16;
        this.field3668 = 258;
        this.field3683 = 6;
        this.field3667 = 50;
        this.field3678 = 18002;
        this.cftab = new int[257];
        this.inUse = new boolean[256];
        this.inUse16 = new boolean[16];
        this.seqToUnseq = new byte[256];
        this.ll8 = new byte[4096];
        this.getAndMoveToFrontDecode_yy = new int[16];
        this.selector = new byte[18002];
        this.selectorMtf = new byte[18002];
        this.field3696 = (byte[][])Array.newInstance(Byte.TYPE, 6, 258);
        this.field3693 = (int[][])Array.newInstance(Integer.TYPE, 6, 258);
        this.field3687 = (int[][])Array.newInstance(Integer.TYPE, 6, 258);
        this.field3686 = (int[][])Array.newInstance(Integer.TYPE, 6, 258);
        this.field3698 = new int[6];
    }

    @ObfuscatedName(value="aa")
    public static int method6232(CharSequence charSequence, byte by) {
        int n = charSequence.length();
        by = 0;
        int n2 = 0;
        while (by < n) {
            byte by2 = class327.charToByteCp1252(charSequence.charAt(by));
            n2 = by2 + ((n2 << 5) - n2);
            by = (byte)(by + 1);
        }
        return n2;
    }
}

