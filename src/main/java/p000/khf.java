package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: khf */
class khf extends khi implements Map {
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private transient Set f21905b;
    /* renamed from: c */
    private transient Collection f21906c;
    /* renamed from: d */
    private transient Set f21907d;

    khf(Map map, Object obj) {
        super(map, obj);
    }

    public void clear() {
        synchronized (this.f8653a) {
            mo9985a().clear();
        }
    }

    public boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f8653a) {
            containsKey = mo9985a().containsKey(obj);
        }
        return containsKey;
    }

    public boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f8653a) {
            containsValue = mo9985a().containsValue(obj);
        }
        return containsValue;
    }

    /* renamed from: b */
    Map mo9985a() {
        return (Map) super.mo9985a();
    }

    public Set entrySet() {
        Set set;
        synchronized (this.f8653a) {
            if (this.f21907d == null) {
                this.f21907d = khb.m4948b(mo9985a().entrySet(), this.f8653a);
            }
            set = this.f21907d;
        }
        return set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.f8653a) {
            equals = mo9985a().equals(obj);
        }
        return equals;
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this.f8653a) {
            obj2 = mo9985a().get(obj);
        }
        return obj2;
    }

    public int hashCode() {
        int hashCode;
        synchronized (this.f8653a) {
            hashCode = mo9985a().hashCode();
        }
        return hashCode;
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f8653a) {
            isEmpty = mo9985a().isEmpty();
        }
        return isEmpty;
    }

    public Set keySet() {
        Set set;
        synchronized (this.f8653a) {
            if (this.f21905b == null) {
                this.f21905b = khb.m4948b(mo9985a().keySet(), this.f8653a);
            }
            set = this.f21905b;
        }
        return set;
    }

    public Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f8653a) {
            put = mo9985a().put(obj, obj2);
        }
        return put;
    }

    public void putAll(Map map) {
        synchronized (this.f8653a) {
            mo9985a().putAll(map);
        }
    }

    public Object remove(Object obj) {
        Object remove;
        synchronized (this.f8653a) {
            remove = mo9985a().remove(obj);
        }
        return remove;
    }

    public int size() {
        int size;
        synchronized (this.f8653a) {
            size = mo9985a().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        synchronized (this.f8653a) {
            if (this.f21906c == null) {
                this.f21906c = new khd(mo9985a().values(), this.f8653a);
            }
            collection = this.f21906c;
        }
        return collection;
    }
}
