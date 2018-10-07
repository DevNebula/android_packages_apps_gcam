package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: kcg */
class kcg implements Iterator {
    /* renamed from: a */
    public final Iterator f8570a;
    /* renamed from: b */
    private final Collection f8571b = this.f8572c.f8566b;
    /* renamed from: c */
    private final /* synthetic */ kcf f8572c;

    kcg(kcf kcf) {
        Iterator listIterator;
        this.f8572c = kcf;
        Collection collection = kcf.f8566b;
        if (collection instanceof List) {
            listIterator = ((List) collection).listIterator();
        } else {
            listIterator = collection.iterator();
        }
        this.f8570a = listIterator;
    }

    kcg(kcf kcf, Iterator it) {
        this.f8572c = kcf;
        this.f8570a = it;
    }

    public boolean hasNext() {
        mo9743a();
        return this.f8570a.hasNext();
    }

    public Object next() {
        mo9743a();
        return this.f8570a.next();
    }

    public void remove() {
        this.f8570a.remove();
        this.f8572c.f8568d.f24900b = this.f8572c.f8568d.f24900b - 1;
        this.f8572c.mo9731c();
    }

    /* renamed from: a */
    final void mo9743a() {
        this.f8572c.mo9730b();
        if (this.f8572c.f8566b != this.f8571b) {
            throw new ConcurrentModificationException();
        }
    }
}
