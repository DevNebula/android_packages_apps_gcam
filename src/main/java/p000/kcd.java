package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kcd */
final class kcd implements Iterator {
    /* renamed from: a */
    private Entry f8562a;
    /* renamed from: b */
    private final /* synthetic */ Iterator f8563b;
    /* renamed from: c */
    private final /* synthetic */ kcc f8564c;

    kcd(kcc kcc, Iterator it) {
        this.f8564c = kcc;
        this.f8563b = it;
    }

    public final boolean hasNext() {
        return this.f8563b.hasNext();
    }

    public final Object next() {
        this.f8562a = (Entry) this.f8563b.next();
        return this.f8562a.getKey();
    }

    public final void remove() {
        boolean z;
        if (this.f8562a != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f8562a.getValue();
        this.f8563b.remove();
        kbv.m16782b(this.f8564c.f24902a, collection.size());
        collection.clear();
        this.f8562a = null;
    }
}
