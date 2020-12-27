/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Collection;
import java.util.zip.Inflater;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="mm")
@Implements(value="GZipDecompressor")
public class GZipDecompressor {
    @ObfuscatedName(value="ak")
    @Export(value="inflater")
    Inflater inflater;

    public GZipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    @ObfuscatedSignature(descriptor="(III)V", garbageValue="1000000")
    GZipDecompressor(int n, int n2, int n3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lmi;[BI)V", garbageValue="57161255")
    @Export(value="decompress")
    public void decompress(Buffer buffer, byte[] arrby) {
        if (buffer.array[buffer.offset] == 31 && buffer.array[buffer.offset + 1] == -117) {
            if (this.inflater == null) {
                this.inflater = new Inflater(true);
            }
            try {
                this.inflater.setInput(buffer.array, buffer.offset + 10, buffer.array.length - (buffer.offset + 8 + 10));
                this.inflater.inflate(arrby);
                this.inflater.reset();
                return;
            }
            catch (Exception exception) {}
        } else {
            throw new RuntimeException("");
        }
        this.inflater.reset();
        throw new RuntimeException("");
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(Ljava/util/Collection;I)V", garbageValue="-256278741")
    public static void method6655(Collection collection) {
        collection.add(class372.field6948);
    }
}

