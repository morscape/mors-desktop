/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.comms;

import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="ShieldOAuth2Comms$ShieldOAuth2Callback")
public interface ShieldOAuth2Comms$ShieldOAuth2Callback {
    public void onShieldOAuth2Result(CommsResult var1, Exception var2);
}

