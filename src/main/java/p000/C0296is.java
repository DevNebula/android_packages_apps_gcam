package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: is */
final class C0296is implements Set {
    /* renamed from: a */
    private final /* synthetic */ C0293ip f7748a;

    C0296is(C0293ip c0293ip) {
        this.f7748a = c0293ip;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f7748a.mo8696a();
    }

    public final boolean contains(Object obj) {
        return this.f7748a.mo8693a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f7748a.mo8701b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0293ip.m4032a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int c = this.f7748a.mo8703c() - 1; c >= 0; c--) {
            int hashCode;
            Object a = this.f7748a.mo8694a(c, 0);
            if (a != null) {
                hashCode = a.hashCode();
            } else {
                hashCode = 0;
            }
            i += hashCode;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f7748a.mo8703c() == 0;
    }

    public final Iterator iterator() {
        return new C0294iq(this.f7748a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f7748a.mo8693a(obj);
        if (a < 0) {
            return false;
        }
        this.f7748a.mo8697a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.f7748a.mo8701b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        return C0293ip.m4031a(this.f7748a.mo8701b(), collection);
    }

    public final int size() {
        return this.f7748a.mo8703c();
    }

    public final Object[] toArray() {
        return this.f7748a.mo8702b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f7748a.mo8699a(objArr, 0);
    }
}
