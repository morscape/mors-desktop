/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.comms;

import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="GameTokenComms$FetchGameTokenCallback")
public interface GameTokenComms$FetchGameTokenCallback {
    public void onGameTokenResult(CommsResult var1, Exception var2);
}

