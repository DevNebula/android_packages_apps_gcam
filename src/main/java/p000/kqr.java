package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kqr */
abstract class kqr extends AbstractList implements ksg {
    /* renamed from: a */
    public boolean f21952a = true;

    kqr() {
    }

    public void add(int i, Object obj) {
        mo14139a();
        super.add(i, obj);
    }

    public boolean add(Object obj) {
        mo14139a();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo14139a();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        mo14139a();
        return super.addAll(collection);
    }

    public void clear() {
        mo14139a();
        super.clear();
    }

    /* renamed from: a */
    protected final void mo14139a() {
        if (!this.f21952a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: b */
    public boolean mo10280b() {
        return this.f21952a;
    }

    /* renamed from: c */
    public final void mo10281c() {
        this.f21952a = false;
    }

    public Object remove(int i) {
        mo14139a();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo14139a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        mo14139a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        mo14139a();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo14139a();
        return super.set(i, obj);
    }
}
