package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: khm */
abstract class khm implements Iterator {
    /* renamed from: a */
    public final Iterator f8655a;

    khm(Iterator it) {
        this.f8655a = (Iterator) jri.m13404b((Object) it);
    }

    /* renamed from: a */
    abstract Object mo9987a(Object obj);

    public final boolean hasNext() {
        return this.f8655a.hasNext();
    }

    public final Object next() {
        return mo9987a(this.f8655a.next());
    }

    public final void remove() {
        this.f8655a.remove();
    }
}
