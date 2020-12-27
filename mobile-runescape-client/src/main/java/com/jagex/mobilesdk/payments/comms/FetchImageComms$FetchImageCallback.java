/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.payments.comms;

import com.jagex.mobilesdk.common.comms.CommsResult;
import net.runelite.mapping.Implements;

@Implements(value="FetchImageComms$FetchImageCallback")
public interface FetchImageComms$FetchImageCallback {
    public void onFetchImageResult(CommsResult var1, Exception var2);
}

