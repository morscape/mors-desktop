/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.jagex3.client.input.softkeyboard;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class ak
extends class84 {
    ak() {
    }

    @ObfuscatedName(value="aa")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-338581571")
    public void method9967() {
        long l = this.method4726();
        this.field2638.vmethod11269(84, l);
        this.field2638.vmethod11260(84, l);
    }

    @ObfuscatedName(value="aj")
    public void method9970(String string2, String string3, byte by) {
        int n = Math.min(string2.length(), string3.length());
        int n2 = 0;
        by = 0;
        while (true) {
            if (n2 >= n || string2.charAt(by) != string3.charAt(by)) {
                long l = this.method4726();
                n2 = by;
                while (true) {
                    n = by;
                    if (n2 >= string2.length()) {
                        while (true) {
                            if (n >= string3.length()) {
                                return;
                            }
                            this.field2638.vmethod11262(string3.charAt(n), l);
                            ++n;
                        }
                    }
                    this.field2638.vmethod11269(85, l);
                    this.field2638.vmethod11260(85, l);
                    ++n2;
                }
            }
            by = (byte)(by + 1);
            ++n2;
        }
    }

    @ObfuscatedName(value="al")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="2131258573")
    public void method9971() {
        long l = this.method4726();
        this.field2638.vmethod11269(80, l);
        this.field2638.vmethod11260(80, l);
    }

    @ObfuscatedName(value="ab")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-685186599")
    public void method9968(int n) {
        this.field2638.vmethod11275(n, this.method4726());
    }
}

