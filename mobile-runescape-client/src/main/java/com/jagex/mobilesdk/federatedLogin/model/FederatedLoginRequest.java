/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.federatedLogin.model;

import net.runelite.mapping.Implements;

@Implements(value="FederatedLoginRequest")
public class FederatedLoginRequest {
    private final String packageId;
    private final String serverAuthCode;
    private final String thirdPartyAccountId;

    public FederatedLoginRequest(String string2, String string3, String string4) {
        this.serverAuthCode = string2;
        this.thirdPartyAccountId = string3;
        this.packageId = string4;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public String getServerAuthCode() {
        return this.serverAuthCode;
    }

    public String getThirdPartyAccountId() {
        return this.thirdPartyAccountId;
    }
}

