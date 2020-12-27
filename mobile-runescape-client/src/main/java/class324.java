/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ka")
public class class324
extends class64 {
    @ObfuscatedName(value="ae")
    final boolean field6270;

    @ObfuscatedName(value="aq")
    @ObfuscatedSignature(descriptor="(Lep;Lep;S)I")
    int method11451(class289 class2892, class289 class2893, short s) {
        if (class2893.field5973 != class2892.field5973) {
            if (this.field6270) {
                return class2892.field5973 - class2893.field5973;
            }
            return class2893.field5973 - class2892.field5973;
        }
        s = (short)this.method4020(class2892, class2893, -1473396260);
        return s;
    }

    public int compare(Object object, Object object2) {
        int n = this.method11451((class289)object, (class289)object2, (short)-6178);
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(IB)Ldr;", garbageValue="1")
    @Export(value="ItemDefinition_get")
    public static ItemDefinition ItemDefinition_get(int n) {
        ItemDefinition itemDefinition;
        long l;
        block6: {
            Object object = ItemDefinition.ItemDefinition_cached;
            l = n;
            if ((object = (ItemDefinition)((EvictingDualNodeHashTable)object).get(l)) != null) {
                return object;
            }
            object = class76.ItemDefinition_archive.takeFile(10, n);
            itemDefinition = new ItemDefinition();
            itemDefinition.id = n;
            if (object != null) {
                itemDefinition.decodeNext(new Buffer((byte[])object), 1988723593);
            }
            itemDefinition.post();
            if (itemDefinition.noteTemplate != -1) {
                itemDefinition.genCert(class324.ItemDefinition_get(itemDefinition.noteTemplate), class324.ItemDefinition_get(itemDefinition.note));
            }
            if (itemDefinition.notedId != -1) {
                itemDefinition.method13085(class324.ItemDefinition_get(itemDefinition.notedId), class324.ItemDefinition_get(itemDefinition.unnotedId), 668626993);
            }
            if (itemDefinition.placeholderTemplate != -1) {
                itemDefinition.genPlaceholder(class324.ItemDefinition_get(itemDefinition.placeholderTemplate), class324.ItemDefinition_get(itemDefinition.placeholder));
            }
            if (class69.ItemDefinition_inMembersWorld || !itemDefinition.isMembersOnly) break block6;
            itemDefinition.name = Strings.field2775;
            n = 0;
            itemDefinition.isTradable = false;
            itemDefinition.groundActions = null;
            itemDefinition.inventoryActions = null;
            itemDefinition.shiftClickIndex = -1;
            itemDefinition.team = 0;
            if (itemDefinition.params == null) break block6;
            object = itemDefinition.params.first();
            while (true) {
                block10: {
                    block8: {
                        block9: {
                            block7: {
                                if (object == null) break block7;
                                if (!class34.getParamDefinition((int)((int)object.key)).autoDisable) break block8;
                                break block9;
                            }
                            if (n != 0) break;
                            itemDefinition.params = null;
                            break;
                        }
                        ((Node)object).remove();
                        break block10;
                    }
                    n = 1;
                }
                object = itemDefinition.params.next();
            }
        }
        ItemDefinition.ItemDefinition_cached.put(itemDefinition, l);
        return itemDefinition;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(ILny;Lkv;I)V", garbageValue="987511597")
    static void method11442(int n, ArchiveDisk archiveDisk, Archive archive) {
        ArchiveDiskAction archiveDiskAction = new ArchiveDiskAction();
        archiveDiskAction.type = 1;
        archiveDiskAction.key = n;
        archiveDiskAction.archiveDisk = archiveDisk;
        archiveDiskAction.archive = archive;
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(archiveDiskAction);
        ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.method6351();
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="([BI)Ljava/lang/String;", garbageValue="-1291736311")
    public static String method11443(byte[] object) {
        object = class130.method5612(object, 0, ((byte[])object).length, 2140374924);
        return object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)Lha;")
    static ClientPreferences method11444(int n) {
        Object object;
        Object object2;
        block7: {
            Object object3;
            object2 = new ClientPreferences();
            object = class170.field3784.field6083;
            object = class297.getPreferencesFile("", (String)object, false);
            try {
                int n2;
                object3 = new byte[(int)((AccessFile)object).length()];
                for (n = 0; n < ((byte[])object3).length; n += n2) {
                    n2 = ((AccessFile)object).read((byte[])object3, n, ((byte[])object3).length - n);
                    if (n2 == -1) throw new IOException();
                }
                object3 = new ClientPreferences(new Buffer((byte[])object3));
            }
            catch (Exception exception) {}
            object2 = object3;
            break block7;
            catch (Exception exception) {}
            object = null;
        }
        if (object == null) return object2;
        try {
            ((AccessFile)object).close();
            return object2;
        }
        catch (Exception exception) {
            return object2;
        }
    }
}

