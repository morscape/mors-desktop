/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hj")
@Implements(value="SoundSystem")
public class SoundSystem
implements Runnable {
    @ObfuscatedName(value="ax")
    static ScheduledExecutorService field3242;
    @ObfuscatedName(value="dl")
    @ObfuscatedSignature(descriptor="Lkv;")
    static Archive field3244;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="[Lhn;")
    @Export(value="players")
    volatile PcmPlayer[] players = new PcmPlayer[2];

    SoundSystem() {
    }

    @Export(value="clear")
    @ObfuscatedName(value="run")
    public void clear() {
        for (int i = 0; i < 2; ++i) {
            PcmPlayer pcmPlayer;
            try {
                pcmPlayer = this.players[i];
                if (pcmPlayer == null) continue;
            }
            catch (Exception exception) {
                class56.RunException_sendStackTrace(null, exception);
                return;
            }
            pcmPlayer.vmethod11138(2070061337);
        }
    }

    @ObfuscatedName(value="fh")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IIB)V", garbageValue="-31")
    static void method5056(String string2, int n, int n2) {
        class287.method10623(string2, n, n2, 0xFFFF00);
    }
}

