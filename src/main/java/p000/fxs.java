package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fxs */
final class fxs implements fyr {
    /* renamed from: a */
    private final AtomicBoolean f24325a = new AtomicBoolean(false);
    /* renamed from: b */
    private final /* synthetic */ fxr f24326b;

    public fxs(fxr fxr) {
        this.f24326b = fxr;
    }

    public final void close() {
        if (!this.f24325a.getAndSet(true)) {
            fxr fxr = this.f24326b;
            synchronized (fxr.f18881b) {
                fxr.f18884e++;
                fxr.f18883d.f24640b = Integer.valueOf(fxr.mo13302b());
            }
            fxr.f18883d.f24639a.m2973a();
            do {
            } while (fxr.mo13303e());
        }
    }
}
