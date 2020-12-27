/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedName
 */
package com.jagex.mobilesdk.auth.model;

import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@Implements(value="MobileAuthState")
public class MobileAuthState {
    private long accessTokenExpiration;
    private String refreshToken;
    private String accessToken;
    private final String version;

    public MobileAuthState() {
        this.version = "1.0";
    }

    public MobileAuthState(String string2, String string3, long l) {
        this.version = "1.0";
        this.accessToken = string2;
        this.refreshToken = string3;
        this.accessTokenExpiration = l;
    }

    public void setAccessToken(String string2) {
        this.accessToken = string2;
    }

    public String getVersion() {
        return "1.0";
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    @Export(value="reset")
    @ObfuscatedName(value="setAccessTokenExpiration")
    public void reset(long l) {
        this.accessTokenExpiration = l;
    }

    public long getAccessTokenExpiration() {
        return this.accessTokenExpiration;
    }

    public void setRefreshToken(String string2) {
        this.refreshToken = string2;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }
}

