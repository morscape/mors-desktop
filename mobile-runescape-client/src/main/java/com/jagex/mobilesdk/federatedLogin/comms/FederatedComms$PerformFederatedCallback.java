/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin.comms;

import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="FederatedComms$PerformFederatedCallback")
public interface FederatedComms$PerformFederatedCallback {
    public void onFederatedLoginResult(CommsResult var1, Exception var2);
}

