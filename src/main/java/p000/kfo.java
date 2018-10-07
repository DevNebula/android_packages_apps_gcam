package p000;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kfo */
class kfo extends kgt {
    /* renamed from: b */
    public final Map f21892b;

    kfo(Map map) {
        this.f21892b = (Map) jri.m13404b((Object) map);
    }

    public void clear() {
        this.f21892b.clear();
    }

    public boolean contains(Object obj) {
        return this.f21892b.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f21892b.isEmpty();
    }

    public Iterator iterator() {
        return new kfl(this.f21892b.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f21892b.remove(obj);
        return true;
    }

    public int size() {
        return this.f21892b.size();
    }
}
