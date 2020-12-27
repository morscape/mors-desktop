/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.common.comms;

import net.runelite.mapping.Implements;

@Implements(value="CommsResult")
public class CommsResult {
    private Object resultValue;
    public int responseCode;

    public CommsResult(Object object, int n) {
        this.resultValue = object;
        this.responseCode = n;
    }

    public Object getResultValue() {
        return this.resultValue;
    }
}

