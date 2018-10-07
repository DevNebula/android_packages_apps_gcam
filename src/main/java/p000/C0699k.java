package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: k */
public final class C0699k implements Iterator, C0366m {
    /* renamed from: a */
    private C0302j f21828a;
    /* renamed from: b */
    private boolean f21829b = true;
    /* renamed from: c */
    private final /* synthetic */ C0239g f21830c;

    C0699k(C0239g c0239g) {
        this.f21830c = c0239g;
    }

    public final boolean hasNext() {
        if (!this.f21829b) {
            C0302j c0302j = this.f21828a;
            if (c0302j == null || c0302j.f7961c == null) {
                return false;
            }
            return true;
        } else if (this.f21830c.f5174b != null) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ Object next() {
        if (this.f21829b) {
            this.f21829b = false;
            this.f21828a = this.f21830c.f5174b;
        } else {
            C0302j c0302j = this.f21828a;
            if (c0302j != null) {
                c0302j = c0302j.f7961c;
            } else {
                c0302j = null;
            }
            this.f21828a = c0302j;
        }
        return this.f21828a;
    }

    /* renamed from: a_ */
    public final void mo10664a_(C0302j c0302j) {
        C0302j c0302j2 = this.f21828a;
        if (c0302j == c0302j2) {
            boolean z;
            this.f21828a = c0302j2.f7962d;
            if (this.f21828a == null) {
                z = true;
            } else {
                z = false;
            }
            this.f21829b = z;
        }
    }
}
