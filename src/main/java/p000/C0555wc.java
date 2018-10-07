package p000;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wc */
public final class C0555wc implements Iterator {
    /* renamed from: a */
    public C0780xg f9952a = new C0780xg();
    /* renamed from: b */
    public String f9953b = null;
    /* renamed from: c */
    private Iterator f9954c = null;

    public C0555wc(C0776wt c0776wt) {
        C0570ww c0570ww = c0776wt.f22365a;
        if (c0570ww == null) {
            this.f9954c = Collections.EMPTY_LIST.iterator();
        } else if (this.f9952a.mo11535b(256)) {
            this.f9954c = new C0775ws(this, c0570ww, null);
        } else {
            this.f9954c = new C0568wr(this, c0570ww, null, 1);
        }
    }

    public final boolean hasNext() {
        return this.f9954c.hasNext();
    }

    public final Object next() {
        return this.f9954c.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
