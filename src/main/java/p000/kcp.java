package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcp */
abstract class kcp extends AbstractCollection implements kft {
    /* renamed from: a */
    private transient Set f21864a;
    /* renamed from: b */
    private transient Set f21865b;

    kcp() {
    }

    /* renamed from: c */
    abstract int mo13955c();

    /* renamed from: d */
    abstract Iterator mo13956d();

    /* renamed from: f */
    abstract Iterator mo13957f();

    public final boolean add(Object obj) {
        mo9939a(obj, 1);
        return true;
    }

    /* renamed from: a */
    public int mo9939a(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        jri.m13404b((Object) this);
        jri.m13404b((Object) collection);
        if (collection instanceof kft) {
            kft kft = (kft) collection;
            if (kft instanceof kck) {
                if (((kck) kft).isEmpty()) {
                    return false;
                }
                throw new NoSuchMethodError();
            } else if (kft.isEmpty()) {
                return false;
            } else {
                for (kfu kfu : kft.mo9948g()) {
                    mo9939a(kfu.mo9954b(), kfu.mo9953a());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            return khb.m4938a((Collection) this, collection.iterator());
        }
    }

    public boolean contains(Object obj) {
        return mo9938a(obj) > 0;
    }

    /* renamed from: b */
    Set mo13954b() {
        return new kcq(this);
    }

    /* renamed from: e */
    public Set mo9946e() {
        Set set = this.f21864a;
        if (set != null) {
            return set;
        }
        set = mo13954b();
        this.f21864a = set;
        return set;
    }

    /* renamed from: g */
    public Set mo9948g() {
        Set set = this.f21865b;
        if (set != null) {
            return set;
        }
        set = new kcr(this);
        this.f21865b = set;
        return set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kft) {
            kft kft = (kft) obj;
            if (size() != kft.size() || mo9948g().size() != kft.mo9948g().size()) {
                return false;
            }
            for (kfu kfu : kft.mo9948g()) {
                if (mo9938a(kfu.mo9954b()) != kfu.mo9953a()) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return mo9948g().hashCode();
    }

    public boolean isEmpty() {
        return mo9948g().isEmpty();
    }

    public final boolean remove(Object obj) {
        return mo9942b(obj, 1) > 0;
    }

    /* renamed from: b */
    public int mo9942b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        if (collection instanceof kft) {
            collection = ((kft) collection).mo9946e();
        }
        return mo9946e().removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        jri.m13404b((Object) collection);
        if (collection instanceof kft) {
            collection = ((kft) collection).mo9946e();
        }
        return mo9946e().retainAll(collection);
    }

    /* renamed from: c */
    public int mo9943c(Object obj, int i) {
        khb.m4919a(i, "count");
        int a = mo9938a(obj);
        int i2 = i - a;
        if (i2 > 0) {
            mo9939a(obj, i2);
        } else if (i2 < 0) {
            mo9942b(obj, -i2);
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo9940a(Object obj, int i, int i2) {
        khb.m4919a(i, "oldCount");
        khb.m4919a(i2, "newCount");
        if (mo9938a(obj) != i) {
            return false;
        }
        mo9943c(obj, i2);
        return true;
    }

    public final String toString() {
        return mo9948g().toString();
    }
}
