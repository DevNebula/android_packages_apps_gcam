package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: kes */
public abstract class kes implements Serializable, Map {
    /* renamed from: a */
    private transient keu f8622a;
    /* renamed from: b */
    private transient keu f8623b;
    /* renamed from: c */
    private transient keh f8624c;

    kes() {
    }

    /* renamed from: b */
    abstract keh mo9852b();

    /* renamed from: f */
    abstract keu mo9859f();

    /* renamed from: g */
    abstract keu mo9860g();

    public abstract Object get(Object obj);

    /* renamed from: i */
    abstract boolean mo9865i();

    /* renamed from: e */
    public static khb m4869e() {
        return new khb();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: a */
    public static kes m4866a(Map map) {
        if (!(map instanceof kes) || (map instanceof SortedMap)) {
            int size;
            Iterable entrySet = map.entrySet();
            if (entrySet instanceof Collection) {
                size = ((Collection) entrySet).size();
            } else {
                size = 4;
            }
            khb khb = new khb(size);
            khb.mo9982a(entrySet);
            return khb.mo9981a();
        }
        kes kes = (kes) map;
        kes.mo9865i();
        return kes;
    }

    /* renamed from: h */
    public final keu entrySet() {
        keu keu = this.f8622a;
        if (keu != null) {
            return keu;
        }
        keu = mo9859f();
        this.f8622a = keu;
        return keu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public int hashCode() {
        return khb.m4920a(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final keu keySet() {
        keu keu = this.f8623b;
        if (keu != null) {
            return keu;
        }
        keu = mo9860g();
        this.f8623b = keu;
        return keu;
    }

    /* renamed from: b */
    public static kes m4867b(Object obj, Object obj2, Object obj3, Object obj4) {
        khb.m4952b(obj, obj2);
        khb.m4952b(obj3, obj4);
        return kgi.m13758a(2, new Object[]{obj, obj2, obj3, obj4});
    }

    /* renamed from: b */
    public static kes m4868b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        khb.m4952b(obj, obj2);
        khb.m4952b(obj3, obj4);
        khb.m4952b(obj5, obj6);
        return kgi.m13758a(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6});
    }

    /* renamed from: a */
    public static kes m4865a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        khb.m4952b(obj, obj2);
        khb.m4952b(obj3, obj4);
        khb.m4952b(obj5, obj6);
        khb.m4952b(obj7, obj8);
        return kgi.m13758a(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        khb.m4919a(size, "size");
        StringBuilder stringBuilder = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
        stringBuilder.append('{');
        Iterator it = entrySet().iterator();
        Object obj = 1;
        while (true) {
            Object obj2 = obj;
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (obj2 == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(entry.getKey());
                stringBuilder.append('=');
                stringBuilder.append(entry.getValue());
                obj = null;
            } else {
                stringBuilder.append('}');
                return stringBuilder.toString();
            }
        }
    }

    /* renamed from: d */
    public keh values() {
        keh keh = this.f8624c;
        if (keh != null) {
            return keh;
        }
        keh = mo9852b();
        this.f8624c = keh;
        return keh;
    }

    Object writeReplace() {
        return new ket(this);
    }
}
