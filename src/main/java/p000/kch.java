package p000;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kch */
class kch extends kcf implements List {
    /* renamed from: d */
    public final /* synthetic */ kbv f21857d;

    kch(kbv kbv, Object obj, List list, kcf kcf) {
        this.f21857d = kbv;
        super(kbv, obj, list, kcf);
    }

    public void add(int i, Object obj) {
        mo9730b();
        boolean isEmpty = this.f8566b.isEmpty();
        ((List) this.f8566b).add(i, obj);
        this.f21857d.f24900b = this.f21857d.f24900b + 1;
        if (isEmpty) {
            mo9727a();
        }
    }

    public boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f8566b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        kbv.m16780a(this.f21857d, this.f8566b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo9727a();
        return addAll;
    }

    public Object get(int i) {
        mo9730b();
        return ((List) this.f8566b).get(i);
    }

    public int indexOf(Object obj) {
        mo9730b();
        return ((List) this.f8566b).indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        mo9730b();
        return ((List) this.f8566b).lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        mo9730b();
        return new kci(this);
    }

    public ListIterator listIterator(int i) {
        mo9730b();
        return new kci(this, i);
    }

    public Object remove(int i) {
        mo9730b();
        Object remove = ((List) this.f8566b).remove(i);
        this.f21857d.f24900b = this.f21857d.f24900b - 1;
        mo9731c();
        return remove;
    }

    public Object set(int i, Object obj) {
        mo9730b();
        return ((List) this.f8566b).set(i, obj);
    }

    public List subList(int i, int i2) {
        kcf thisR;
        mo9730b();
        kbv kbv = this.f21857d;
        Object obj = this.f8565a;
        List subList = ((List) this.f8566b).subList(i, i2);
        kcf kcf = this.f8567c;
        if (kcf != null) {
            thisR = kcf;
        }
        return kbv.mo15068a(obj, subList, thisR);
    }
}
