/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import com.jagex.oldscape.osrenderer.ak;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="hz")
public class class310
extends PcmPlayer {
    class310() {
    }

    @Override
    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-80712262")
    void vmethod11139() {
    }

    @Override
    @ObfuscatedName(value="ar")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1243596947")
    void vmethod11140() {
    }

    @Override
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-832929818")
    void vmethod11141() {
        ak.method3379();
    }

    @Override
    @ObfuscatedName(value="ay")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1012574534")
    void vmethod11142(int n) {
        ak.method3390();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    @ObfuscatedName(value="ak")
    void vmethod11138(int var1_1) {
        block10: {
            // MONITORENTER : this
            var4_2 = this.field3258;
            if (var4_2 != null) break block10;
            // MONITOREXIT : this
            return;
        }
        ak.method3399();
        var3_6 = ak.method3400(-23404896);
        if (var1_1 < var3_6) {
            for (var1_1 = ak.method3389(290269594); var1_1 < var3_6; var1_1 += 256) {
                var4_2 = this.field3258;
                var2_7 = 256;
                this.method5070(var4_2);
                if (this.field3257) continue;
                var4_2 = this.field3258;
                if (PcmPlayer.PcmPlayer_stereo) {
                    var2_7 = 512;
                }
                ak.method3378(var4_2, var2_7);
            }
        }
        ** GOTO lbl27
        {
            catch (Throwable var4_3) {
                ak.method3401();
                throw var4_3;
            }
            catch (Exception var4_5) {}
lbl27:
            // 2 sources

            ** try [egrp 2[TRYBLOCK] [11 : 95->112)] { 
lbl28:
            // 1 sources

            ak.method3401();
            return;
        }
lbl30:
        // 2 sources

        catch (Throwable var4_4) {
            // MONITOREXIT : this
            throw var4_4;
        }
    }
}

