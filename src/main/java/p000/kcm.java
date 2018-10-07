package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcm */
abstract class kcm implements kfr {
    /* renamed from: a */
    private transient Collection f21860a;
    /* renamed from: b */
    private transient Set f21861b;
    /* renamed from: c */
    private transient Collection f21862c;
    /* renamed from: d */
    private transient Map f21863d;

    kcm() {
    }

    /* renamed from: d */
    abstract Map mo13940d();

    /* renamed from: e */
    abstract Collection mo13941e();

    /* renamed from: f */
    abstract Set mo13943f();

    /* renamed from: g */
    abstract Collection mo13944g();

    /* renamed from: h */
    abstract Iterator mo13945h();

    /* renamed from: k */
    public Map mo9930k() {
        Map map = this.f21863d;
        if (map != null) {
            return map;
        }
        map = mo13940d();
        this.f21863d = map;
        return map;
    }

    /* renamed from: b */
    public boolean mo9926b(Object obj, Object obj2) {
        Collection collection = (Collection) mo9930k().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: c */
    public boolean mo13939c(Object obj) {
        for (Collection contains : mo9930k().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public Collection mo13948l() {
        Collection collection = this.f21860a;
        if (collection != null) {
            return collection;
        }
        collection = mo13941e();
        this.f21860a = collection;
        return collection;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kfr)) {
            return false;
        }
        return mo9930k().equals(((kfr) obj).mo9930k());
    }

    public int hashCode() {
        return mo9930k().hashCode();
    }

    /* renamed from: m */
    public boolean mo13949m() {
        return mo9929i() == 0;
    }

    /* renamed from: n */
    public Set mo9931n() {
        Set set = this.f21861b;
        if (set != null) {
            return set;
        }
        set = mo13943f();
        this.f21861b = set;
        return set;
    }

    /* renamed from: a */
    public boolean mo9925a(Object obj, Object obj2) {
        return mo9924a(obj).add(obj2);
    }

    /* renamed from: c */
    public boolean mo9928c(Object obj, Object obj2) {
        Collection collection = (Collection) mo9930k().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo9930k().toString();
    }

    /* renamed from: j */
    Iterator mo13947j() {
        return khb.m4964e(mo13948l().iterator());
    }

    /* renamed from: o */
    public Collection mo9932o() {
        Collection collection = this.f21862c;
        if (collection != null) {
            return collection;
        }
        collection = mo13944g();
        this.f21862c = collection;
        return collection;
    }
}
