package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ir */
final class C0295ir implements Set {
    /* renamed from: a */
    private final /* synthetic */ C0293ip f7711a;

    C0295ir(C0293ip c0293ip) {
        this.f7711a = c0293ip;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int c = this.f7711a.mo8703c();
        for (Entry entry : collection) {
            this.f7711a.mo8698a(entry.getKey(), entry.getValue());
        }
        return c != this.f7711a.mo8703c();
    }

    public final void clear() {
        this.f7711a.mo8696a();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f7711a.mo8693a(entry.getKey());
        if (a >= 0) {
            return C0289il.m3869a(this.f7711a.mo8694a(a, 1), entry.getValue());
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return C0293ip.m4032a((Set) this, obj);
    }

    public final int hashCode() {
        int c = this.f7711a.mo8703c() - 1;
        int i = 0;
        while (c >= 0) {
            int hashCode;
            int hashCode2;
            Object a = this.f7711a.mo8694a(c, 0);
            Object a2 = this.f7711a.mo8694a(c, 1);
            if (a != null) {
                hashCode = a.hashCode();
            } else {
                hashCode = 0;
            }
            if (a2 != null) {
                hashCode2 = a2.hashCode();
            } else {
                hashCode2 = 0;
            }
            c--;
            i += hashCode2 ^ hashCode;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f7711a.mo8703c() == 0;
    }

    public final Iterator iterator() {
        return new C0297it(this.f7711a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f7711a.mo8703c();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
