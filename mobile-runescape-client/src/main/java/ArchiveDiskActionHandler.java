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

@ObfuscatedName(value="kw")
@Implements(value="ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler
implements Runnable {
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="Lkw;")
    @Export(value="ArchiveDiskActionHandler_requestQueue")
    static final ArchiveDiskActionHandler ArchiveDiskActionHandler_requestQueue = new ArchiveDiskActionHandler();
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="Lfe;")
    final NodeDeque field3748 = new NodeDeque();
    @ObfuscatedName(value="ah")
    Thread field3749;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lfe;")
    final NodeDeque field3750 = new NodeDeque();
    @ObfuscatedName(value="ax")
    @ObfuscatedGetter(intValue=-1296916575)
    int field3751 = 0;

    ArchiveDiskActionHandler() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)Lkb;", garbageValue="-816339614")
    ArchiveDiskAction method6337() {
        synchronized (this) {
            Throwable throwable2;
            ArchiveDiskAction archiveDiskAction;
            block6: {
                try {
                    try {
                        archiveDiskAction = (ArchiveDiskAction)this.field3748.last();
                    }
                    catch (Exception exception) {
                        class56.RunException_sendStackTrace(null, exception);
                        return null;
                    }
                    if (archiveDiskAction != null) break block6;
                }
                catch (Throwable throwable2) {}
                return null;
            }
            archiveDiskAction.remove();
            return archiveDiskAction;
            throw throwable2;
        }
    }

    @ObfuscatedName(value="af")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1301191016")
    void method6340() {
        synchronized (this) {
            this.field3751 = 600;
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)Lkb;", garbageValue="1785740174")
    ArchiveDiskAction method6343() {
        // MONITORENTER : this
        ArchiveDiskAction archiveDiskAction = (ArchiveDiskAction)this.field3750.removeLast();
        // MONITOREXIT : this
        return archiveDiskAction;
        catch (Exception exception) {
            class56.RunException_sendStackTrace(null, exception);
            // MONITOREXIT : this
            return null;
        }
    }

    @ObfuscatedName(value="am")
    @ObfuscatedSignature(descriptor="(Lkb;I)V", garbageValue="-1306801744")
    @Export(value="addFirst")
    void addFirst(ArchiveDiskAction archiveDiskAction) {
        synchronized (this) {
            this.field3748.method4082(archiveDiskAction);
            return;
        }
    }

    @ObfuscatedName(value="an")
    @ObfuscatedSignature(descriptor="(Lkb;I)V", garbageValue="-198516")
    void method6345(ArchiveDiskAction archiveDiskAction) {
        synchronized (this) {
            this.field3750.method4082(archiveDiskAction);
            return;
        }
    }

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-38")
    void method6346() {
        synchronized (this) {
            this.field3751 += -1;
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(ILny;I)[B", garbageValue="2135510189")
    byte[] method6347(int n, ArchiveDisk object) {
        // MONITORENTER : this
        Node node = this.field3748.last();
        while (true) {
            if ((node = (ArchiveDiskAction)node) == null) {
                // MONITOREXIT : this
                return null;
            }
            if (node.key == (long)n && object == ((ArchiveDiskAction)node).archiveDisk && ((ArchiveDiskAction)node).type == 0) {
                object = ((ArchiveDiskAction)node).data;
                // MONITOREXIT : this
                return object;
            }
            node = this.field3748.previous();
        }
        catch (Exception exception) {
            class56.RunException_sendStackTrace(null, exception);
            // MONITOREXIT : this
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="aw")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1675572072")
    void method6350() {
        // MONITORENTER : this
        if (this.field3751 == 0) ** GOTO lbl7
        this.field3751 = 1;
        this.wait();
lbl7:
        // 2 sources

        // MONITOREXIT : this
        return;
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="70")
    void method6351() {
        synchronized (this) {
            if (this.field3751 == 0) {
                this.field3749 = new Thread(ArchiveDiskActionHandler_requestQueue);
                this.field3749.setDaemon(true);
                this.field3749.start();
                this.field3749.setPriority(5);
            }
            this.field3751 = 600;
            return;
        }
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="851275318")
    boolean method6338() {
        synchronized (this) {
            if (this.field3751 <= 1) {
                this.field3751 = 0;
                this.notifyAll();
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            while (true) {
                ArchiveDiskAction archiveDiskAction;
                if ((archiveDiskAction = this.method6337()) == null) {
                    class52.sleepExact(100L);
                    if (this.method6338()) {
                        return;
                    }
                    this.method6346();
                    continue;
                }
                if (archiveDiskAction.type == 0) {
                    archiveDiskAction.archiveDisk.write((int)archiveDiskAction.key, archiveDiskAction.data, archiveDiskAction.data.length);
                } else if (archiveDiskAction.type == 1) {
                    archiveDiskAction.data = archiveDiskAction.archiveDisk.method6971((int)archiveDiskAction.key, (byte)-8);
                    this.method6345(archiveDiskAction);
                }
                if (this.method6338()) {
                    return;
                }
                this.method6340();
            }
        }
        catch (Exception exception) {
            class56.RunException_sendStackTrace(null, exception);
            return;
        }
    }
}

