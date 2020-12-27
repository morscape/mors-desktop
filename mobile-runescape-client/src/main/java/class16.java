/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="aw")
public class class16 {
    @ObfuscatedName(value="ga")
    @ObfuscatedSignature(descriptor="[Lek;")
    static class384[] field306;
    @ObfuscatedName(value="ak")
    final boolean field309;

    public class16(boolean bl) {
        this.field309 = bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="315805487")
    public boolean method339() {
        boolean bl = this.field309;
        return bl;
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="-439820086")
    public static boolean method333() {
        block5: {
            block6: {
                if (class167.musicPlayerStatus != 2) break block5;
                if (NetFileRequest.musicTrack != null || (NetFileRequest.musicTrack = MusicTrack.readTrack(class167.musicTrackArchive, class90.musicTrackGroupId, class87.musicTrackFileId)) != null) break block6;
                return false;
            }
            try {
                if (Varcs.soundCache == null) {
                    Varcs.soundCache = new SoundCache(class167.soundEffectsArchive, class167.musicSamplesArchive);
                }
                if (class347.midiPcmStream.loadMusicTrack(NetFileRequest.musicTrack, class167.musicPatchesArchive, Varcs.soundCache, 22050)) {
                    class347.midiPcmStream.clearAll();
                    class347.midiPcmStream.setPcmStreamVolume(FloorDecoration.musicTrackVolume);
                    class347.midiPcmStream.method13666(NetFileRequest.musicTrack, class167.musicTrackBoolean, (byte)-24);
                    class167.musicPlayerStatus = 0;
                    NetFileRequest.musicTrack = null;
                    Varcs.soundCache = null;
                    class167.musicTrackArchive = null;
                    return true;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
                class347.midiPcmStream.clear();
                class167.musicPlayerStatus = 0;
                NetFileRequest.musicTrack = null;
                Varcs.soundCache = null;
                class167.musicTrackArchive = null;
            }
        }
        return false;
    }

    @ObfuscatedName(value="az")
    static final int method335(int n, int n2, int n3) {
        if (n == -2) {
            return 12345678;
        }
        if (n == -1) {
            if (n2 < 2) {
                return 2;
            }
            n = n2;
            if (n2 > 126) {
                n = 126;
            }
            return n;
        }
        n3 = (n & 0x7F) * n2 / 128;
        if (n3 < 2) {
            n2 = 2;
        } else {
            n2 = n3;
            if (n3 > 126) {
                n2 = 126;
            }
        }
        return (n & 0xFF80) + n2;
    }
}

