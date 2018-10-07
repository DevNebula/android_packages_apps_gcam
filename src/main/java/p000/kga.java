package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kga */
final class kga implements Iterator {
    /* renamed from: a */
    private final kft f8644a;
    /* renamed from: b */
    private final Iterator f8645b;
    /* renamed from: c */
    private kfu f8646c;
    /* renamed from: d */
    private int f8647d;
    /* renamed from: e */
    private int f8648e;
    /* renamed from: f */
    private boolean f8649f;

    kga(kft kft, Iterator it) {
        this.f8644a = kft;
        this.f8645b = it;
    }

    public final boolean hasNext() {
        return this.f8647d > 0 || this.f8645b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            if (this.f8647d == 0) {
                this.f8646c = (kfu) this.f8645b.next();
                int a = this.f8646c.mo9953a();
                this.f8647d = a;
                this.f8648e = a;
            }
            this.f8647d--;
            this.f8649f = true;
            return this.f8646c.mo9954b();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        jri.m13406b(this.f8649f, (Object) "no calls to next() since the last call to remove()");
        if (this.f8648e == 1) {
            this.f8645b.remove();
        } else {
            this.f8644a.remove(this.f8646c.mo9954b());
        }
        this.f8648e--;
        this.f8649f = false;
    }
}
