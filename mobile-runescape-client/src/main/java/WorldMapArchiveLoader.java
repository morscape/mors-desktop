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

@ObfuscatedName(value="pj")
@Implements(value="WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
    @ObfuscatedName(value="ah")
    @Export(value="cacheName")
    String cacheName;
    @ObfuscatedName(value="aj")
    @Export(value="percentLoaded")
    int percentLoaded = 0;
    @ObfuscatedName(value="al")
    @Export(value="loaded")
    boolean loaded = false;
    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="Lkc;")
    @Export(value="archive")
    AbstractArchive archive;

    @ObfuscatedSignature(descriptor="(Lkc;)V")
    WorldMapArchiveLoader(AbstractArchive abstractArchive) {
        this.archive = abstractArchive;
    }

    @ObfuscatedName(value="ae")
    int method7361(int n) {
        if (this.percentLoaded * 1097694981 < 33) {
            if (!this.archive.method6136(class51.field2373.field2380, this.cacheName, -4683537)) {
                return this.percentLoaded * 1097694981;
            }
            this.percentLoaded = -385667219;
        }
        if (this.percentLoaded * 1097694981 == 33) {
            if (this.archive.method6137(class51.field2375.field2380, this.cacheName, 1798762804) && !this.archive.method6136(class51.field2375.field2380, this.cacheName, -4683537)) {
                return this.percentLoaded * 1097694981;
            }
            this.percentLoaded = -771334438;
        }
        if (this.percentLoaded * 1097694981 == 66) {
            if (!this.archive.method6136(this.cacheName, class51.field2374.field2380, -4683537)) {
                return this.percentLoaded * 1097694981;
            }
            this.percentLoaded = 1434321940;
            this.loaded = true;
        }
        n = this.percentLoaded;
        return n * 1097694981;
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)Z", garbageValue="2130903179")
    @Export(value="isLoaded")
    boolean isLoaded() {
        boolean bl = this.loaded;
        return bl;
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;B)V", garbageValue="19")
    @Export(value="reset")
    void reset(String string2) {
        if (string2 == null) {
            return;
        }
        if (!string2.isEmpty()) {
            if (string2 != this.cacheName) {
                this.cacheName = string2;
                this.percentLoaded = 0;
                this.loaded = false;
                this.method7361(2140085035);
                return;
            }
            return;
        }
    }

    @ObfuscatedName(value="ax")
    int method7369(byte by) {
        by = (byte)this.percentLoaded;
        return by * 1097694981;
    }
}

