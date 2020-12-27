/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Implements
 */
package com.jagex.mobilesdk.auth.config;

import net.runelite.mapping.Implements;

@Implements(value="InvalidConfigurationException")
public final class InvalidConfigurationException
extends RuntimeException {
    public InvalidConfigurationException(String string2) {
        super(string2);
    }
}

