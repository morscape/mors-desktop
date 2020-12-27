/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.jagex3.client.input.softkeyboard;

import com.jagex.jagex3.client.input.softkeyboard.aa;
import com.jagex.jagex3.client.input.softkeyboard.ae;
import com.jagex.jagex3.client.input.softkeyboard.ah;
import com.jagex.jagex3.client.input.softkeyboard.ai;
import com.jagex.jagex3.client.input.softkeyboard.ak;
import com.jagex.jagex3.client.input.softkeyboard.al;
import com.jagex.jagex3.client.input.softkeyboard.as;
import java.util.ArrayList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

public class ax {
    @ObfuscatedName(value="aa")
    @ObfuscatedGetter(intValue=-1641162333)
    int field2223;
    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="Lms;")
    final class346 field2224;
    @ObfuscatedName(value="al")
    final List field2225;
    @ObfuscatedName(value="as")
    public final ak field2226 = new ak();

    @ObfuscatedSignature(descriptor="(Lms;)V")
    public ax(class346 class3462) {
        this.field2225 = new ArrayList();
        this.field2224 = class3462;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="ac")
    public int method3219(int n) {
        List list = this.field2225;
        synchronized (list) {
            n = 0;
            while (n < this.field2225.size()) {
                if (((ae)this.field2225.get(n)).vmethod10285()) {
                    return n;
                }
                ++n;
            }
            return -1;
        }
    }

    @ObfuscatedName(value="ae")
    @ObfuscatedSignature(descriptor="(B)V", garbageValue="70")
    public void vmethod10001() {
    }

    @ObfuscatedName(value="ag")
    @ObfuscatedSignature(descriptor="(IB)V", garbageValue="76")
    public void method3223(int n) {
        this.field2224.vmethod12649(new ai(this, n));
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-2013559610")
    public void vmethod10003() {
        this.field2224.vmethod12649(new aa(this));
    }

    @ObfuscatedName(value="ao")
    @ObfuscatedSignature(descriptor="(II)V", garbageValue="-1816164810")
    public void method3231(int n) {
        this.field2223 = n;
        if (!this.field2224.vmethod12633(-762482009)) {
            this.field2224.vmethod12649(new as(this, n));
            return;
        }
    }

    @ObfuscatedName(value="au")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;I)V", garbageValue="49788394")
    public void method3237(String string2) {
        this.method3258(string2, 0);
    }

    @ObfuscatedName(value="az")
    public int method3242(int n) {
        n = this.field2223 * -2141183477;
        return n * -1641162333;
    }

    @ObfuscatedName(value="bp")
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;II)V", garbageValue="-1711843383")
    public void method3258(String string2, int n) {
        this.field2224.vmethod12649(new ah(this, string2, n));
    }

    @ObfuscatedName(value="ad")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="1873871373")
    public void method3220() {
        this.method3223(0);
    }

    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="623376423")
    public void vmethod10004() {
    }

    @ObfuscatedName(value="ak")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="-1967102475")
    public void vmethod10006() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(Lcom/jagex/jagex3/client/input/softkeyboard/ae;B)V", garbageValue="105")
    public void method3236(ae ae2) {
        List list = this.field2225;
        synchronized (list) {
            ae2.method3203(this.field2225.size());
            this.field2225.add(ae2);
            return;
        }
    }

    @ObfuscatedName(value="av")
    @ObfuscatedSignature(descriptor="(Lfc;B)V", garbageValue="39")
    public void method3238(class66 class662) {
        this.field2226.method4729(class662);
    }

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="974931194")
    public void vmethod10015() {
    }

    @ObfuscatedName(value="bf")
    @ObfuscatedSignature(descriptor="(I)V", garbageValue="378702714")
    public void method3248() {
        this.field2224.vmethod12649(new al(this));
    }
}

