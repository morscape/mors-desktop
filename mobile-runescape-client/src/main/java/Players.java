/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hs")
@Implements(value="Players")
public class Players {
    @ObfuscatedName(value="aa")
    @Export(value="Players_emptyIndices")
    static int[] Players_emptyIndices;
    @ObfuscatedName(value="af")
    @Export(value="Players_orientations")
    static int[] Players_orientations;
    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="[Lmi;")
    static Buffer[] field3300;
    @ObfuscatedName(value="aj")
    @Export(value="Players_indices")
    public static int[] Players_indices;
    @ObfuscatedName(value="al")
    @Export(value="Players_emptyIdxCount")
    static int Players_emptyIdxCount = 0;
    @ObfuscatedName(value="am")
    @Export(value="Players_pendingUpdateCount")
    static int Players_pendingUpdateCount = 0;
    @ObfuscatedName(value="an")
    @Export(value="Players_pendingUpdateIndices")
    static int[] Players_pendingUpdateIndices;
    @ObfuscatedName(value="aq")
    @Export(value="Players_targetIndices")
    static int[] Players_targetIndices;
    @ObfuscatedName(value="as")
    @Export(value="Players_count")
    public static int Players_count = 0;
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="Lmi;")
    static Buffer field3311;
    @ObfuscatedName(value="ai")
    static byte[] field3301;
    @ObfuscatedName(value="ax")
    static byte[] field3310;
    @ObfuscatedName(value="ab")
    @Export(value="Players_regions")
    static int[] Players_regions;

    static {
        field3301 = new byte[2048];
        field3310 = new byte[2048];
        field3300 = new Buffer[2048];
        Players_count = 0;
        Players_indices = new int[2048];
        Players_emptyIdxCount = 0;
        Players_emptyIndices = new int[2048];
        Players_regions = new int[2048];
        Players_orientations = new int[2048];
        Players_targetIndices = new int[2048];
        Players_pendingUpdateCount = 0;
        Players_pendingUpdateIndices = new int[2048];
        field3311 = new Buffer(new byte[5000]);
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lkc;III)[Lei;", garbageValue="657440886")
    public static IndexedSprite[] method5238(AbstractArchive arrindexedSprite, int n, int n2) {
        if (class287.method10622((AbstractArchive)arrindexedSprite, n, n2)) {
            arrindexedSprite = class88.method4767(208121488);
            return arrindexedSprite;
        }
        return null;
    }
}

