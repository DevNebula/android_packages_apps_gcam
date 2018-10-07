package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fyh */
final class fyh implements fyr {
    /* renamed from: a */
    private final fyr f24333a;
    /* renamed from: b */
    private final AtomicBoolean f24334b = new AtomicBoolean(false);
    /* renamed from: c */
    private final /* synthetic */ fyd f24335c;

    fyh(fyd fyd, fyr fyr) {
        this.f24335c = fyd;
        this.f24333a = fyr;
    }

    public final void close() {
        boolean z = true;
        if (!this.f24334b.getAndSet(true)) {
            synchronized (this.f24335c.f18891a) {
                int size = this.f24335c.f18894d.size();
                fyd fyd = this.f24335c;
                if (size != fyd.f18896f) {
                    if (!fyd.f18897g) {
                        z = false;
                    }
                }
                if (!z) {
                    fyd.f18894d.add(this.f24333a);
                    fyd fyd2 = this.f24335c;
                    fyd2.f18895e.f24640b = Integer.valueOf(fyd2.mo13309f());
                    this.f24335c.mo13310g();
                }
            }
            if (z) {
                this.f24333a.close();
            }
        }
    }
}
