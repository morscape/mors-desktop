/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mr")
@Implements(value="TaskHandler")
public class TaskHandler
implements Runnable {
    @ObfuscatedName(value="ae")
    @Export(value="javaVersion")
    public static String javaVersion;
    @ObfuscatedName(value="ak")
    @Export(value="javaVendor")
    public static String javaVendor;
    @ObfuscatedName(value="ah")
    @Export(value="thread")
    Thread thread;
    @ObfuscatedName(value="as")
    @Export(value="isClosed")
    boolean isClosed = false;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lmt;")
    @Export(value="current")
    Task current = null;
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="Lmt;")
    @Export(value="task")
    Task task = null;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public TaskHandler() {
        javaVendor = "Unknown";
        javaVersion = "1.6";
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        }
        catch (Exception exception) {}
        this.isClosed = false;
        this.thread = new Thread(this);
        this.thread.setPriority(10);
        this.thread.setDaemon(true);
        this.thread.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="-10")
    @Export(value="close")
    public final void close() {
        synchronized (this) {
            this.isClosed = true;
            this.notifyAll();
        }
        try {
            this.thread.join();
            return;
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Ljava/lang/Runnable;II)Lmt;", garbageValue="-185702134")
    public final Task method6699(Runnable object, int n) {
        object = this.newTask(2, n, 0, object);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(IIILjava/lang/Object;B)Lmt;", garbageValue="75")
    @Export(value="newTask")
    final Task newTask(int n, int n2, int n3, Object object) {
        Task task = new Task();
        task.type = n;
        task.intArgument = n2;
        task.objectArgument = object;
        synchronized (this) {
            if (this.task != null) {
                this.task.next = task;
                this.task = task;
            } else {
                this.current = task;
                this.task = task;
            }
            this.notify();
            return task;
        }
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;IB)Lmt;", garbageValue="59")
    public final Task method6709(String object, int n) {
        object = this.newTask(1, n, 0, object);
        return object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        block8: while (true) {
            // MONITORENTER : this
            while (true) {
                if (this.isClosed) {
                    // MONITOREXIT : this
                    return;
                }
                if (this.current != null) {
                    Task task = this.current;
                    this.current = this.current.next;
                    if (this.current == null) {
                        this.task = null;
                    }
                    // MONITOREXIT : this
                    int n = task.type;
                    if (n == 1) {
                        task.result = new Socket(InetAddress.getByName((String)task.objectArgument), task.intArgument);
                    } else if (n == 2) {
                        Thread thread = new Thread((Runnable)task.objectArgument);
                        thread.setDaemon(true);
                        thread.start();
                        thread.setPriority(task.intArgument);
                        task.result = thread;
                    } else if (n == 4) {
                        task.result = new DataInputStream(((URL)task.objectArgument).openStream());
                    }
                    task.status = 1;
                    continue block8;
                }
                this.wait();
                catch (Throwable throwable) {}
                task.status = 2;
                continue block8;
                catch (InterruptedException interruptedException) {
                }
            }
            break;
        }
    }
}

