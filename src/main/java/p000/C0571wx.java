package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wx */
final class C0571wx implements Iterator {
    /* renamed from: a */
    private final /* synthetic */ Iterator f9998a;

    C0571wx(Iterator it) {
        this.f9998a = it;
    }

    public final boolean hasNext() {
        return this.f9998a.hasNext();
    }

    public final Object next() {
        return this.f9998a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
}
