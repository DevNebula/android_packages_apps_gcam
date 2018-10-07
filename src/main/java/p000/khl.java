package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: khl */
class khl extends khj implements SortedSet {
    public static final long serialVersionUID = 0;

    khl(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    public Comparator comparator() {
        Comparator comparator;
        synchronized (this.f8653a) {
            comparator = mo15131c().comparator();
        }
        return comparator;
    }

    /* renamed from: d */
    SortedSet mo15131c() {
        return (SortedSet) super.mo14063b();
    }

    public Object first() {
        Object first;
        synchronized (this.f8653a) {
            first = mo15131c().first();
        }
        return first;
    }

    public SortedSet headSet(Object obj) {
        SortedSet khl;
        synchronized (this.f8653a) {
            khl = new khl(mo15131c().headSet(obj), this.f8653a);
        }
        return khl;
    }

    public Object last() {
        Object last;
        synchronized (this.f8653a) {
            last = mo15131c().last();
        }
        return last;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        SortedSet khl;
        synchronized (this.f8653a) {
            khl = new khl(mo15131c().subSet(obj, obj2), this.f8653a);
        }
        return khl;
    }

    public SortedSet tailSet(Object obj) {
        SortedSet khl;
        synchronized (this.f8653a) {
            khl = new khl(mo15131c().tailSet(obj), this.f8653a);
        }
        return khl;
    }
}
