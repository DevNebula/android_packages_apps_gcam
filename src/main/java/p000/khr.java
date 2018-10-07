package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: khr */
final class khr implements Iterator {
    /* renamed from: a */
    private khv f8659a = this.f8661c.mo15638p();
    /* renamed from: b */
    private kfu f8660b = null;
    /* renamed from: c */
    private final /* synthetic */ kho f8661c;

    khr(kho kho) {
        this.f8661c = kho;
    }

    public final boolean hasNext() {
        khv khv = this.f8659a;
        if (khv == null) {
            return false;
        }
        if (!this.f8661c.f26592a.mo9828c(khv.f8665a)) {
            return true;
        }
        this.f8659a = null;
        return false;
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            kfu khp = new khp(this.f8661c, this.f8659a);
            this.f8660b = khp;
            khv khv = this.f8659a.f8671g;
            if (khv == this.f8661c.f26593b) {
                this.f8659a = null;
            } else {
                this.f8659a = khv;
            }
            return khp;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        if (this.f8660b != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8661c.mo9943c(this.f8660b.mo9954b(), 0);
        this.f8660b = null;
    }
}
