/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedSignature
 */
package com.jagex.mobilesdk.auth.comms;

import com.jagex.mobilesdk.auth.comms.GameTokenComms;
import com.jagex.mobilesdk.auth.comms.GameTokenComms$FetchGameTokenCallback;
import com.jagex.mobilesdk.auth.comms.LogoutComms;
import com.jagex.mobilesdk.auth.comms.LogoutComms$PerformLogoutCallback;
import com.jagex.mobilesdk.auth.comms.RefreshComms;
import com.jagex.mobilesdk.auth.comms.RefreshComms$RefreshTokenCallback;
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms;
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms$ShieldOAuth2Callback;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.util.HashMap;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedSignature;

@Implements(value="MobileAuthComms")
public class MobileAuthComms {
    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/auth/comms/ShieldOAuth2Comms$ShieldOAuth2Callback;Z)V", garbageValue="1")
    public static void shieldOAuth2Comms(String string2, String object, String string3, String string4, String string5, JagexConfig jagexConfig, ShieldOAuth2Comms$ShieldOAuth2Callback shieldOAuth2Comms$ShieldOAuth2Callback, boolean bl) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap.put("Authorization", CommsUtils.basicAuthParam(jagexConfig));
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept", "application/json");
        hashMap2.put("grant_type", (String)object);
        hashMap2.put("token", string3);
        hashMap2.put("redirTo", string4);
        hashMap2.put("sig", string5);
        object = new ShieldOAuth2Comms(string2, hashMap, hashMap2, shieldOAuth2Comms$ShieldOAuth2Callback);
        object.execute((Object[])new Void[0]);
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/comms/GameTokenComms$FetchGameTokenCallback;Z)V", garbageValue="1")
    public static void gameTokenComms(String string2, MobileAuthState object, GameTokenComms$FetchGameTokenCallback gameTokenComms$FetchGameTokenCallback, boolean bl) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bearer ");
        stringBuilder.append(object.getAccessToken());
        hashMap.put("Authorization", stringBuilder.toString());
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept", "application/json");
        object = new GameTokenComms(string2, hashMap, gameTokenComms$FetchGameTokenCallback);
        object.execute(new Void[0]);
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/auth/comms/LogoutComms$PerformLogoutCallback;Z)V", garbageValue="1")
    public static void logoutComms(String string2, MobileAuthState object, JagexConfig jagexConfig, LogoutComms$PerformLogoutCallback logoutComms$PerformLogoutCallback, boolean bl) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap.put("Authorization", CommsUtils.basicAuthParam(jagexConfig));
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept", "application/json");
        hashMap2.put("token", object.getRefreshToken());
        hashMap2.put("token_type_hint", "refresh_token");
        object = new LogoutComms(string2, hashMap, hashMap2, logoutComms$PerformLogoutCallback);
        object.execute(new Void[0]);
    }

    @ObfuscatedSignature(descriptor="(Ljava/lang/String;Lcom/jagex/mobilesdk/auth/model/MobileAuthState;Lcom/jagex/mobilesdk/auth/config/JagexConfig;Lcom/jagex/mobilesdk/auth/comms/RefreshComms$RefreshTokenCallback;Z)V", garbageValue="1")
    public static void refreshTokenComms(String string2, MobileAuthState object, JagexConfig jagexConfig, RefreshComms$RefreshTokenCallback refreshComms$RefreshTokenCallback, boolean bl) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept", "application/json");
        hashMap.put("Authorization", CommsUtils.basicAuthParam(jagexConfig));
        HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("refresh_token", object.getRefreshToken());
        hashMap2.put("scope", jagexConfig.getScope());
        hashMap2.put("redirect_uri", jagexConfig.getRedirectUri().toString());
        hashMap2.put("grant_type", "refresh_token");
        object = new RefreshComms(string2, hashMap, hashMap2, refreshComms$RefreshTokenCallback);
        object.execute(new Void[0]);
    }
}

