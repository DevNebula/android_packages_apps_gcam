package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ksz */
public final class ksz extends LinkedHashMap {
    /* renamed from: b */
    public static final ksz f8904b;
    /* renamed from: a */
    public boolean f8905a = true;

    static {
        ksz ksz = new ksz();
        f8904b = ksz;
        ksz.f8905a = false;
    }

    private ksz() {
    }

    private ksz(Map map) {
        super(map);
    }

    /* renamed from: a */
    private static int m5219a(Object obj) {
        if (obj instanceof byte[]) {
            return ksd.m5191a((byte[]) obj);
        }
        if (!(obj instanceof kse)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        mo10298a();
        super.clear();
    }

    /* renamed from: a */
    final void mo10298a() {
        if (!this.f8905a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set entrySet() {
        return !isEmpty() ? super.entrySet() : Collections.emptySet();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Object obj2;
            obj = (Map) obj;
            int obj22;
            if (this == obj) {
                obj22 = 1;
            } else if (size() == obj.size()) {
                for (Entry entry : entrySet()) {
                    if (!obj.containsKey(entry.getKey())) {
                        obj22 = null;
                        break;
                    }
                    boolean equals;
                    obj22 = entry.getValue();
                    Object obj3 = obj.get(entry.getKey());
                    if ((obj22 instanceof byte[]) && (obj3 instanceof byte[])) {
                        equals = Arrays.equals((byte[]) obj22, (byte[]) obj3);
                        continue;
                    } else {
                        equals = obj22.equals(obj3);
                        continue;
                    }
                    if (!equals) {
                        obj22 = null;
                        break;
                    }
                }
                obj22 = 1;
            } else {
                obj22 = null;
            }
            if (obj22 != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            Entry entry = (Entry) it.next();
            i = (ksz.m5219a(entry.getValue()) ^ ksz.m5219a(entry.getKey())) + i2;
        }
    }

    /* renamed from: b */
    public final ksz mo10299b() {
        return !isEmpty() ? new ksz(this) : new ksz();
    }

    public final Object put(Object obj, Object obj2) {
        mo10298a();
        ksd.m5192a(obj);
        ksd.m5192a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo10298a();
        for (Object next : map.keySet()) {
            ksd.m5192a(next);
            ksd.m5192a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo10298a();
        return super.remove(obj);
    }
}
