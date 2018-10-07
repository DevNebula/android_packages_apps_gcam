package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kcf */
class kcf extends AbstractCollection {
    /* renamed from: a */
    public final Object f8565a;
    /* renamed from: b */
    public Collection f8566b;
    /* renamed from: c */
    public final kcf f8567c;
    /* renamed from: d */
    public final /* synthetic */ kbv f8568d;
    /* renamed from: e */
    private final Collection f8569e;

    kcf(kbv kbv, Object obj, Collection collection, kcf kcf) {
        Collection collection2;
        this.f8568d = kbv;
        this.f8565a = obj;
        this.f8566b = collection;
        this.f8567c = kcf;
        if (kcf != null) {
            collection2 = kcf.f8566b;
        } else {
            collection2 = null;
        }
        this.f8569e = collection2;
    }

    public boolean add(Object obj) {
        mo9730b();
        boolean isEmpty = this.f8566b.isEmpty();
        boolean add = this.f8566b.add(obj);
        if (add) {
            this.f8568d.f24900b = this.f8568d.f24900b + 1;
            if (isEmpty) {
                mo9727a();
            }
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f8566b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        kbv.m16780a(this.f8568d, this.f8566b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo9727a();
        return addAll;
    }

    /* renamed from: a */
    final void mo9727a() {
        while (true) {
            kcf kcf = this.f8567c;
            if (kcf != null) {
                this = kcf;
            } else {
                this.f8568d.f24899a.put(this.f8565a, this.f8566b);
                return;
            }
        }
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.f8566b.clear();
            kbv.m16782b(this.f8568d, size);
            mo9731c();
        }
    }

    public boolean contains(Object obj) {
        mo9730b();
        return this.f8566b.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        mo9730b();
        return this.f8566b.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        mo9730b();
        return this.f8566b.equals(obj);
    }

    public int hashCode() {
        mo9730b();
        return this.f8566b.hashCode();
    }

    public Iterator iterator() {
        mo9730b();
        return new kcg(this);
    }

    /* renamed from: b */
    final void mo9730b() {
        kcf kcf = this.f8567c;
        if (kcf != null) {
            kcf.mo9730b();
            if (this.f8567c.f8566b != this.f8569e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8566b.isEmpty()) {
            Collection collection = (Collection) this.f8568d.f24899a.get(this.f8565a);
            if (collection != null) {
                this.f8566b = collection;
            }
        }
    }

    public boolean remove(Object obj) {
        mo9730b();
        boolean remove = this.f8566b.remove(obj);
        if (remove) {
            this.f8568d.f24900b = this.f8568d.f24900b - 1;
            mo9731c();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f8566b.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        kbv.m16780a(this.f8568d, this.f8566b.size() - size);
        mo9731c();
        return removeAll;
    }

    /* renamed from: c */
    final void mo9731c() {
        while (true) {
            kcf kcf = this.f8567c;
            if (kcf == null) {
                break;
            }
            this = kcf;
        }
        if (this.f8566b.isEmpty()) {
            this.f8568d.f24899a.remove(this.f8565a);
        }
    }

    public boolean retainAll(Collection collection) {
        jri.m13404b((Object) collection);
        int size = size();
        boolean retainAll = this.f8566b.retainAll(collection);
        if (retainAll) {
            kbv.m16780a(this.f8568d, this.f8566b.size() - size);
            mo9731c();
        }
        return retainAll;
    }

    public int size() {
        mo9730b();
        return this.f8566b.size();
    }

    public String toString() {
        mo9730b();
        return this.f8566b.toString();
    }
}
