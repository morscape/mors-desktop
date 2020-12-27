/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 */
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName(value="gr")
public class class303
extends PcmPlayer {
    class303() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @ObfuscatedName(value="ak")
    void vmethod11138(int n) {
        synchronized (this) {
            for (n = 0; n < this.field3260; n += 256) {
                this.method5070(this.field3258);
            }
            return;
        }
    }
}

