/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin.model;

import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginResponse")
public class FederatedLoginResponse {
    private final String oneTimeLoginToken;
    private final String runescapeAccountId;

    public String getRunescapeAccountId() {
        return this.runescapeAccountId;
    }

    public String getOneTimeLoginToken() {
        return this.oneTimeLoginToken;
    }
}

