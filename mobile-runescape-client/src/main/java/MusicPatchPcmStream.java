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

@ObfuscatedName(value="lc")
@Implements(value="MusicPatchPcmStream")
public class MusicPatchPcmStream
extends PcmStream {
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfe;")
    @Export(value="queue")
    NodeDeque queue = new NodeDeque();
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lhd;")
    @Export(value="mixer")
    PcmStreamMixer mixer = new PcmStreamMixer();
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Llx;")
    @Export(value="superStream")
    MidiPcmStream superStream;

    @ObfuscatedSignature(descriptor="(Llx;)V")
    MusicPatchPcmStream(MidiPcmStream midiPcmStream) {
        this.superStream = midiPcmStream;
    }
}

