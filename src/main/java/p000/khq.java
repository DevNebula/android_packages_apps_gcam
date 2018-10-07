package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: khq */
final class khq implements Iterator {
    /* renamed from: a */
    private khv f8656a = this.f8658c.mo15637o();
    /* renamed from: b */
    private kfu f8657b;
    /* renamed from: c */
    private final /* synthetic */ kho f8658c;

    khq(kho kho) {
        this.f8658c = kho;
    }

    public final boolean hasNext() {
        khv khv = this.f8656a;
        if (khv == null) {
            return false;
        }
        if (!this.f8658c.f26592a.mo9827b(khv.f8665a)) {
            return true;
        }
        this.f8656a = null;
        return false;
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            kfu khp = new khp(this.f8658c, this.f8656a);
            this.f8657b = khp;
            khv khv = this.f8656a.f8672h;
            if (khv == this.f8658c.f26593b) {
                this.f8656a = null;
            } else {
                this.f8656a = khv;
            }
            return khp;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        if (this.f8657b != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8658c.mo9943c(this.f8657b.mo9954b(), 0);
        this.f8657b = null;
    }
}
