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

@ObfuscatedName(value="hd")
@Implements(value="PcmStreamMixer")
public class PcmStreamMixer
extends PcmStream {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfe;")
    NodeDeque field7200;
    @ObfuscatedName(value="ai")
    int field7201 = 0;
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lfe;")
    @Export(value="subStreams")
    NodeDeque subStreams = new NodeDeque();
    @ObfuscatedName(value="ax")
    int field7203 = -1;

    public PcmStreamMixer() {
        this.field7200 = new NodeDeque();
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(Lhg;)V")
    @Export(value="removeSubStream")
    public final void removeSubStream(PcmStream pcmStream) {
        synchronized (this) {
            pcmStream.remove();
            return;
        }
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lhg;)V")
    @Export(value="addSubStream")
    public final void addSubStream(PcmStream pcmStream) {
        synchronized (this) {
            this.subStreams.addLast(pcmStream);
            return;
        }
    }
}

