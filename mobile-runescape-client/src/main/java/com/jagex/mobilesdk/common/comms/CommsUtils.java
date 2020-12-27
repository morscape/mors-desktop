/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.common.comms;

import com.jagex.mobilesdk.auth.config.JagexConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Implements;

@Implements(value="CommsUtils")
public class CommsUtils {
    private static String base64String = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static char[] base64encode = base64String.toCharArray();

    public static int mapResponseCode(int n) {
        if (n != 200) {
            if (n != 401) {
                if (n != 404 && n != 502) {
                    return -1;
                }
                return 1403;
            }
            return 1404;
        }
        return 0;
    }

    public static String basicAuthParam(JagexConfig object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object.getClientId());
        stringBuilder.append(":");
        stringBuilder.append(object.getClientSecret());
        object = stringBuilder.toString().getBytes();
        object = CommsUtils.encodeBase64((byte[])object, 0, ((Object)object).length);
        stringBuilder = new StringBuilder();
        stringBuilder.append("Basic ");
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String formUrlEncode(Map map) {
        if (map == null) {
            throw new NullPointerException("Null map of parameters passed in for Encoding.");
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            try {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append((String)entry.getKey());
                stringBuilder2.append("=");
                stringBuilder2.append(URLEncoder.encode((String)entry.getValue(), "utf-8"));
                stringBuilder.append(stringBuilder2.toString());
                if (n < map.size() - 1) {
                    stringBuilder.append("&");
                }
                ++n;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
            }
        }
        return stringBuilder.toString();
    }

    public static String encodeBase64(byte[] arrby, int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < n2 + n; i += 3) {
            int n3 = arrby[i] & 0xFF;
            stringBuilder.append(base64encode[n3 >>> 2]);
            if (i < n2 - 1) {
                int n4 = arrby[i + 1] & 0xFF;
                stringBuilder.append(base64encode[(n3 & 3) << 4 | n4 >>> 4]);
                if (i < n2 - 2) {
                    n3 = arrby[i + 2] & 0xFF;
                    stringBuilder.append(base64encode[(n4 & 0xF) << 2 | n3 >>> 6]);
                    stringBuilder.append(base64encode[n3 & 0x3F]);
                    continue;
                }
                stringBuilder.append(base64encode[(n4 & 0xF) << 2]);
                stringBuilder.append("=");
                continue;
            }
            stringBuilder.append(base64encode[(n3 & 3) << 4]);
            stringBuilder.append("==");
        }
        return stringBuilder.toString();
    }
}

