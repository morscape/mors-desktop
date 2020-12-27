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

@ObfuscatedName(value="dl")
@Implements(value="HorizontalAlignment")
public class HorizontalAlignment
implements class176 {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Ldl;")
    @Export(value="HorizontalAlignment_centered")
    static final HorizontalAlignment HorizontalAlignment_centered;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Ldl;")
    static final HorizontalAlignment field5922;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Ldl;")
    static final HorizontalAlignment field5923;
    @ObfuscatedName(value="ah")
    @ObfuscatedGetter(intValue=-1843724027)
    final int field5928;
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1674725899)
    public final int field5929;

    static {
        field5923 = new HorizontalAlignment(0, 0);
        HorizontalAlignment_centered = new HorizontalAlignment(1, 1);
        field5922 = new HorizontalAlignment(2, 2);
    }

    HorizontalAlignment(int n, int n2) {
        this.field5929 = n;
        this.field5928 = n2;
    }

    @Override
    @ObfuscatedName(value="ak")
    public int vmethod12178(byte by) {
        by = (byte)(this.field5928 * -118316083);
        return by * -1843724027;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([BI)Lek;", garbageValue="419048801")
    public static final class384 method10448(byte[] object) {
        object = class274.method7824(object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ab")
    public static void method10444(int n) {
        try {
            if (class167.musicPlayerStatus != 1) return;
            n = class347.midiPcmStream.method13669((byte)0);
            if (n > 0 && class347.midiPcmStream.isReady()) {
                int n2;
                n = n2 = n - class227.pcmSampleLength;
                if (n2 < 0) {
                    n = 0;
                }
                class347.midiPcmStream.setPcmStreamVolume(n);
                return;
            }
            class347.midiPcmStream.clear();
            class347.midiPcmStream.method13672();
            class167.musicPlayerStatus = class167.musicTrackArchive != null ? 2 : 0;
            NetFileRequest.musicTrack = null;
            Varcs.soundCache = null;
            return;
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

    @ObfuscatedName(value="db")
    static final void method10449(int n) {
        Projectile projectile = (Projectile)Client.widgetFlags.last();
        while (projectile != null) {
            if (WorldMapIcon_1.field5913 * 63889799 == projectile.field7593 && Client.cycle <= projectile.field7600) {
                if (Client.cycle >= projectile.field7598) {
                    Actor actor;
                    if (projectile.field7594 > 0 && (actor = Client.field4782[projectile.field7594 - 1]) != null && actor.x >= 0 && actor.x < 13312 && actor.field7523 * -144332757 >= 0 && actor.field7523 * -144332757 < 13312) {
                        projectile.method14474(actor.x, actor.field7523 * -144332757, DevicePcmPlayerProvider.method11095(actor.x, actor.field7523 * -144332757, projectile.field7593, -1416385247) - projectile.field7607, Client.cycle);
                    }
                    if (projectile.field7594 < 0 && (actor = (n = -projectile.field7594 - 1) == Client.field4858 ? WorldMapScaleHandler.localPlayer : Client.field4859[n]) != null && actor.x >= 0 && actor.x < 13312 && actor.field7523 * -144332757 >= 0 && actor.field7523 * -144332757 < 13312) {
                        projectile.method14474(actor.x, actor.field7523 * -144332757, DevicePcmPlayerProvider.method11095(actor.x, actor.field7523 * -144332757, projectile.field7593, -1416385247) - projectile.field7607, Client.cycle);
                    }
                    projectile.advance(Client.field4804 * 375836608);
                    class64.field2460.drawEntity(WorldMapIcon_1.field5913 * 63889799, (int)projectile.x, (int)projectile.y, (int)projectile.z, 60, projectile, projectile.yaw, -1L, false);
                }
            } else {
                projectile.remove();
            }
            projectile = (Projectile)Client.widgetFlags.previous();
        }
        return;
    }
}

