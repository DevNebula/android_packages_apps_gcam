package p000;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgd */
public abstract class kgd implements Comparator {
    protected kgd() {
    }

    public abstract int compare(Object obj, Object obj2);

    /* renamed from: a */
    public Object mo9962a(Iterable iterable) {
        return mo9964a(iterable.iterator());
    }

    /* renamed from: a */
    public Object mo9963a(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    /* renamed from: a */
    public Object mo9964a(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo9963a(next, it.next());
        }
        return next;
    }

    /* renamed from: b */
    public Object mo9966b(Iterable iterable) {
        return mo9968b(iterable.iterator());
    }

    /* renamed from: b */
    public Object mo9967b(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* renamed from: b */
    public Object mo9968b(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo9967b(next, it.next());
        }
        return next;
    }

    /* renamed from: a */
    public kgd mo9965a() {
        return new kgp(this);
    }
}
