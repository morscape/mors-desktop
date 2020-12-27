/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  net.runelite.mapping.Export
 *  net.runelite.mapping.Implements
 *  net.runelite.mapping.ObfuscatedGetter
 *  net.runelite.mapping.ObfuscatedName
 *  net.runelite.mapping.ObfuscatedSignature
 */
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName(value="ew")
@Implements(value="UserList")
public abstract class UserList {
    @ObfuscatedName(value="ae")
    int field2448 = 0;
    @ObfuscatedName(value="ah")
    @Export(value="previousUsernamesMap")
    HashMap previousUsernamesMap;
    @ObfuscatedName(value="as")
    Comparator field2452 = null;
    @ObfuscatedName(value="ai")
    @ObfuscatedSignature(descriptor="[Len;")
    @Export(value="array")
    class61[] array;
    @ObfuscatedName(value="ak")
    @ObfuscatedGetter(intValue=1778409807)
    @Export(value="capacity")
    final int capacity;
    @ObfuscatedName(value="ax")
    @Export(value="usernamesMap")
    HashMap usernamesMap;

    UserList(int n) {
        this.capacity = n;
        this.array = this.newTypedArray(n);
        this.usernamesMap = new HashMap(n / 8);
        this.previousUsernamesMap = new HashMap(n / 8);
    }

    @ObfuscatedName(value="ah")
    @ObfuscatedSignature(descriptor="(Lef;I)Len;", garbageValue="-2115051815")
    @Export(value="getByUsername")
    public class61 getByUsername(Username comparable) {
        class61 class612 = this.getByCurrentUsername((Username)comparable);
        if (class612 != null) {
            return class612;
        }
        comparable = this.getByPreviousUsername((Username)comparable);
        return comparable;
    }

    @ObfuscatedName(value="aj")
    @ObfuscatedSignature(descriptor="(Lef;I)Len;", garbageValue="1391248481")
    @Export(value="getByPreviousUsername")
    class61 getByPreviousUsername(Username comparable) {
        if (comparable.hasCleanName()) {
            comparable = (class61)this.previousUsernamesMap.get(comparable);
            return comparable;
        }
        return null;
    }

    @ObfuscatedName(value="as")
    @ObfuscatedSignature(descriptor="(Lef;I)Len;", garbageValue="1942110469")
    @Export(value="getByCurrentUsername")
    class61 getByCurrentUsername(Username comparable) {
        if (comparable.hasCleanName()) {
            comparable = (class61)this.usernamesMap.get(comparable);
            return comparable;
        }
        return null;
    }

    @ObfuscatedName(value="at")
    @ObfuscatedSignature(descriptor="(II)[Len;", garbageValue="-2029701546")
    @Export(value="newTypedArray")
    abstract class61[] newTypedArray(int var1);

    @ObfuscatedName(value="ax")
    @ObfuscatedSignature(descriptor="(Lef;I)Z", garbageValue="967605826")
    @Export(value="contains")
    public boolean contains(Username username) {
        if (username.hasCleanName()) {
            if (!this.usernamesMap.containsKey(username)) {
                boolean bl = this.previousUsernamesMap.containsKey(username);
                return bl;
            }
            return true;
        }
        return false;
    }

    @ObfuscatedName(value="fw")
    public static final void method3927(int n, int n2, int n3, int n4, int n5) {
        n5 = 0;
        while (true) {
            if (n5 < Client.field4918 * -763111739) {
                if (Client.field4915[n5] + Client.field4925[n5] > n && Client.field4925[n5] < n + n3 && Client.field4934[n5] + Client.field4928[n5] > n2 && Client.field4934[n5] < n4 + n2) {
                    Client.field4920[n5] = true;
                }
            } else {
                return;
            }
            ++n5;
        }
    }
}

