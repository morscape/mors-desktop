/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ng")
@Implements(value="UserComparator4")
final class UserComparator4
implements Comparator {
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="SequenceDefinition_skeletonsArchive")
    static AbstractArchive SequenceDefinition_skeletonsArchive;

    UserComparator4() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lnm;Lnm;I)I", garbageValue="-1963217105")
    @Export(value="compare_bridged")
    int compare_bridged(class210 class2102, class210 class2103) {
        if (class2102.field3977 * 7696774080670414665L >= class2103.field3977 * 7696774080670414665L) {
            long l = class2102.field3977;
            long l2 = class2103.field3977;
            if (l * 7696774080670414665L == l2 * 7696774080670414665L) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public int compare(Object object, Object object2) {
        int n = this.compare_bridged((class210)object, (class210)object2);
        return n;
    }

    @Override
    public boolean equals(Object object) {
        boolean bl = super.equals(object);
        return bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Lkc;Lkc;ZLoc;B)V", garbageValue="-11")
    public static void method6825(AbstractArchive abstractArchive, AbstractArchive abstractArchive2, boolean bl, class399 class3992) {
        class76.ItemDefinition_archive = abstractArchive;
        ItemDefinition.ItemDefinition_modelArchive = abstractArchive2;
        class69.ItemDefinition_inMembersWorld = bl;
        class203.ItemDefinition_fileCount = class76.ItemDefinition_archive.getGroupFileCount(10);
        class381.ItemDefinition_fontPlain11 = class3992;
    }
}

