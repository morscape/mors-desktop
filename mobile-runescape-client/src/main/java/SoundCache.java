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

@ObfuscatedName(value="hu")
@Implements(value="SoundCache")
public class SoundCache {
    @ObfuscatedName(value="ds")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field3312;
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="musicSampleIndex")
    AbstractArchive musicSampleIndex;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="musicSamples")
    NodeHashTable musicSamples = new NodeHashTable(256);
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="soundEffectIndex")
    AbstractArchive soundEffectIndex;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lpk;")
    @Export(value="rawSounds")
    NodeHashTable rawSounds = new NodeHashTable(256);

    @ObfuscatedSignature(descriptor="(Lkc;Lkc;)V")
    public SoundCache(AbstractArchive abstractArchive, AbstractArchive abstractArchive2) {
        this.soundEffectIndex = abstractArchive;
        this.musicSampleIndex = abstractArchive2;
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(II[IB)Lhb;", garbageValue="101")
    @Export(value="getMusicSample0")
    RawSound getMusicSample0(int n, int n2, int[] object) {
        long l = (long)((n << 4 & 0xFFFF | n >>> 12) ^ n2 | n << 16) ^ 0x100000000L;
        Node node = (RawSound)this.rawSounds.get(l);
        if (node != null) {
            return node;
        }
        if (object != null && object[0] <= 0) {
            return null;
        }
        VorbisSample vorbisSample = (VorbisSample)this.musicSamples.get(l);
        node = vorbisSample;
        if (vorbisSample == null) {
            node = VorbisSample.readMusicSample(this.musicSampleIndex, n, n2);
            if (node == null) {
                return null;
            }
            this.musicSamples.put(node, l);
        }
        if ((object = (Object)((VorbisSample)node).toRawSound((int[])object)) == null) {
            return null;
        }
        node.remove();
        this.rawSounds.put((Node)object, l);
        return object;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I[II)Lhb;", garbageValue="850074113")
    public RawSound method5261(int n, int[] arrn) {
        if (this.soundEffectIndex.method6156(-2067834888) == 1) {
            return this.getSoundEffect0(0, n, arrn);
        }
        if (this.soundEffectIndex.getGroupFileCount(n) == 1) {
            return this.getSoundEffect0(n, 0, arrn);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(II[II)Lhb;", garbageValue="-1708653133")
    @Export(value="getSoundEffect0")
    RawSound getSoundEffect0(int n, int n2, int[] arrn) {
        long l = (n << 4 & 0xFFFF | n >>> 12) ^ n2 | n << 16;
        Object object = (RawSound)this.rawSounds.get(l);
        if (object != null) {
            return object;
        }
        if (arrn != null && arrn[0] <= 0) {
            return null;
        }
        object = SoundEffect.readSoundEffect(this.soundEffectIndex, n, n2);
        if (object == null) {
            return null;
        }
        object = ((SoundEffect)object).toRawSound();
        this.rawSounds.put((Node)object, l);
        if (arrn != null) {
            arrn[0] = arrn[0] - ((RawSound)object).samples.length;
        }
        return object;
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I[II)Lhb;", garbageValue="746580179")
    public RawSound method5266(int n, int[] arrn) {
        if (this.musicSampleIndex.method6156(-1746914280) == 1) {
            return this.getMusicSample0(0, n, arrn);
        }
        if (this.musicSampleIndex.getGroupFileCount(n) == 1) {
            return this.getMusicSample0(n, 0, arrn);
        }
        throw new RuntimeException();
    }

    @ObfuscatedName(value="ab")
    static int method5255(long l) {
        return (int)(l >>> 14 & 3L);
    }
}

