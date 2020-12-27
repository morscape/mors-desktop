/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.comms;

import net.runelite.mapping.Implements;

@Implements(value="RefreshComms$RefreshTokenCallback")
public interface RefreshComms$RefreshTokenCallback {
    public void onTokenResult(String var1, Long var2, String var3, Exception var4);
}

