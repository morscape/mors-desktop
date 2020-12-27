/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  net.runelite.mapping.Implements
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.jagex.mobilesdk.auth;

import android.content.Context;
import android.content.SharedPreferences;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Implements;
import org.json.JSONException;
import org.json.JSONObject;

@Implements(value="MobileAuthStateWriter")
public class MobileAuthStateWriter {
    private final ReentrantLock sharedPreferencesLock;
    private final SharedPreferences sharedPreferences;

    public MobileAuthStateWriter(Context context) {
        this.sharedPreferences = context.getSharedPreferences("AuthState", 0);
        this.sharedPreferencesLock = new ReentrantLock();
    }

    private void clearAuthState(MobileAuthState mobileAuthState) {
        mobileAuthState.setAccessToken("");
        mobileAuthState.reset(0L);
        mobileAuthState.setRefreshToken("");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private MobileAuthState jsonDeserialize(String string2) {
        MobileAuthState mobileAuthState = new MobileAuthState();
        try {
            string2 = new JSONObject(string2);
            mobileAuthState.setAccessToken(string2.getString("access_Token"));
            mobileAuthState.reset(string2.getLong("token_expires"));
            mobileAuthState.setRefreshToken(string2.getString("refresh_Token"));
            return mobileAuthState;
        }
        catch (JSONException jSONException) {}
        this.clearAuthState(mobileAuthState);
        return mobileAuthState;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void saveAuthState(MobileAuthState mobileAuthState) {
        this.sharedPreferencesLock.lock();
        try {
            SharedPreferences.Editor editor = this.sharedPreferences.edit();
            if (mobileAuthState == null) {
                editor.remove("state");
            } else {
                editor.putString("state", this.jsonSerialize(mobileAuthState));
            }
            boolean bl = editor.commit();
            if (!bl) throw new IllegalStateException("Failed to write state to shared prefs");
            this.sharedPreferencesLock.unlock();
            return;
        }
        catch (Throwable throwable) {
            this.sharedPreferencesLock.unlock();
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String jsonSerialize(MobileAuthState mobileAuthState) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", (Object)mobileAuthState.getVersion());
            jSONObject.put("access_Token", (Object)mobileAuthState.getAccessToken());
            jSONObject.put("token_expires", mobileAuthState.getAccessTokenExpiration());
            jSONObject.put("refresh_Token", (Object)mobileAuthState.getRefreshToken());
            return jSONObject.toString();
        }
        catch (JSONException jSONException) {}
        this.clearAuthState(mobileAuthState);
        return jSONObject.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MobileAuthState loadAuthState() {
        this.sharedPreferencesLock.lock();
        try {
            MobileAuthState mobileAuthState;
            block4: {
                try {
                    mobileAuthState = this.jsonDeserialize(this.sharedPreferences.getString("state", null));
                    break block4;
                }
                catch (Exception exception) {}
                mobileAuthState = new MobileAuthState();
            }
            this.sharedPreferencesLock.unlock();
            return mobileAuthState;
        }
        catch (Throwable throwable) {}
        this.sharedPreferencesLock.unlock();
        throw throwable;
    }
}

