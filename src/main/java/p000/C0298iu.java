package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: iu */
final class C0298iu implements Collection {
    /* renamed from: a */
    private final /* synthetic */ C0293ip f7832a;

    C0298iu(C0293ip c0293ip) {
        this.f7832a = c0293ip;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f7832a.mo8696a();
    }

    public final boolean contains(Object obj) {
        return this.f7832a.mo8700b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f7832a.mo8703c() == 0;
    }

    public final Iterator iterator() {
        return new C0294iq(this.f7832a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f7832a.mo8700b(obj);
        if (b < 0) {
            return false;
        }
        this.f7832a.mo8697a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i = 0;
        int c = this.f7832a.mo8703c();
        boolean z = false;
        while (i < c) {
            if (collection.contains(this.f7832a.mo8694a(i, 1))) {
                this.f7832a.mo8697a(i);
                i--;
                c--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int i = 0;
        int c = this.f7832a.mo8703c();
        boolean z = false;
        while (i < c) {
            if (!collection.contains(this.f7832a.mo8694a(i, 1))) {
                this.f7832a.mo8697a(i);
                i--;
                c--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f7832a.mo8703c();
    }

    public final Object[] toArray() {
        return this.f7832a.mo8702b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f7832a.mo8699a(objArr, 1);
    }
}
