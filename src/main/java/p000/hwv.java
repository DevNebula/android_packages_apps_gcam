package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: hwv */
public final class hwv extends AbstractSet {
    /* renamed from: a */
    private final C0691ih f7155a = new C0691ih();

    public final boolean add(Object obj) {
        if (this.f7155a.containsKey(obj)) {
            return false;
        }
        this.f7155a.put(obj, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (!(collection instanceof hwv)) {
            return super.addAll(collection);
        }
        hwv hwv = (hwv) collection;
        int size = size();
        this.f7155a.mo9193a(hwv.f7155a);
        return size() > size;
    }

    public final void clear() {
        this.f7155a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f7155a.containsKey(obj);
    }

    public final Iterator iterator() {
        return this.f7155a.keySet().iterator();
    }

    public final boolean remove(Object obj) {
        if (!this.f7155a.containsKey(obj)) {
            return false;
        }
        this.f7155a.remove(obj);
        return true;
    }

    public final int size() {
        return this.f7155a.size();
    }
}
