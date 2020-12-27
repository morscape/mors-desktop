/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.inject.Qualifier
 *  net.runelite.mapping.Implements
 */
package javax.inject;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import javax.inject.Qualifier;
import net.runelite.mapping.Implements;

@Documented
@Retention
@Qualifier
@Implements(value="Named")
public @interface Named {
    public String value();
}

